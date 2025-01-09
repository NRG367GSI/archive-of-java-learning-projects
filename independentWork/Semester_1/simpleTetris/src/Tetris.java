import java.util.Scanner;

public class Tetris {
    // Размеры игрового поля
    private static final int WIDTH = 10;
    private static final int HEIGHT = 20;

    // Игровое поле
    private static char[][] field = new char[HEIGHT][WIDTH];

    // Текущая фигурка
    private static char[][] currentShape;
    private static int currentX;
    private static int currentY;

    // Фигурки
    private static final char[][][] SHAPES = {
            {
                    {'#', '#', '#', '#'} // I-фигура
            },
            {
                    {'#', '#'},
                    {'#', '#'} // O-фигура
            },
            {
                    {' ', '#', ' '},
                    {'#', '#', '#'} // T-фигура
            },
            {
                    {'#', ' ', ' '},
                    {'#', '#', '#'} // L-фигура
            },
            {
                    {' ', ' ', '#'},
                    {'#', '#', '#'} // J-фигура
            },
            {
                    {'#', '#', ' '},
                    {' ', '#', '#'} // S-фигура
            },
            {
                    {' ', '#', '#'},
                    {'#', '#', ' '} // Z-фигура
            }
    };

    public static void main(String[] args) {
        initializeField();
        generateNewShape();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            printField();
            System.out.println("Введите команду (a - влево, d - вправо, w - повернуть, s - ускорить):");
            String command = scanner.nextLine();

            if (command.equals("a")) {
                moveLeft();
            } else if (command.equals("d")) {
                moveRight();
            } else if (command.equals("w")) {
                rotateShape();
            } else if (command.equals("s")) {
                if (!moveDown()) {
                    fixShape();
                    clearLines();
                    generateNewShape();
                    if (isGameOver()) {
                        System.out.println("Игра окончена!");
                        break;
                    }
                }
            }
        }
    }

    // Инициализация игрового поля
    private static void initializeField() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                field[i][j] = '.';
            }
        }
    }

    // Генерация новой фигурки
    private static void generateNewShape() {
        int shapeIndex = (int) (Math.random() * SHAPES.length);
        currentShape = SHAPES[shapeIndex];
        currentX = WIDTH / 2 - currentShape[0].length / 2;
        currentY = 0;
    }

    // Печать игрового поля
    private static void printField() {
        char[][] tempField = new char[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                tempField[i][j] = field[i][j];
            }
        }

        for (int i = 0; i < currentShape.length; i++) {
            for (int j = 0; j < currentShape[i].length; j++) {
                if (currentShape[i][j] == '#') {
                    tempField[currentY + i][currentX + j] = '#';
                }
            }
        }

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(tempField[i][j]);
            }
            System.out.println();
        }
    }

    // Перемещение фигурки влево
    private static void moveLeft() {
        if (currentX > 0) {
            currentX--;
        }
    }

    // Перемещение фигурки вправо
    private static void moveRight() {
        if (currentX + currentShape[0].length < WIDTH) {
            currentX++;
        }
    }

    // Поворот фигурки
    private static void rotateShape() {
        char[][] rotatedShape = new char[currentShape[0].length][currentShape.length];
        for (int i = 0; i < currentShape.length; i++) {
            for (int j = 0; j < currentShape[i].length; j++) {
                rotatedShape[j][currentShape.length - 1 - i] = currentShape[i][j];
            }
        }
        currentShape = rotatedShape;
    }

    // Перемещение фигурки вниз
    private static boolean moveDown() {
        if (currentY + currentShape.length >= HEIGHT) {
            return false;
        }
        currentY++;
        return true;
    }

    // Фиксация фигурки на поле
    private static void fixShape() {
        for (int i = 0; i < currentShape.length; i++) {
            for (int j = 0; j < currentShape[i].length; j++) {
                if (currentShape[i][j] == '#') {
                    field[currentY + i][currentX + j] = '#';
                }
            }
        }
    }

    // Очистка заполненных линий
    private static void clearLines() {
        for (int i = 0; i < HEIGHT; i++) {
            boolean isFull = true;
            for (int j = 0; j < WIDTH; j++) {
                if (field[i][j] != '#') {
                    isFull = false;
                    break;
                }
            }
            if (isFull) {
                for (int k = i; k > 0; k--) {
                    field[k] = field[k - 1];
                }
                for (int j = 0; j < WIDTH; j++) {
                    field[0][j] = '.';
                }
            }
        }
    }

    // Проверка на окончание игры
    private static boolean isGameOver() {
        for (int j = 0; j < WIDTH; j++) {
            if (field[0][j] == '#') {
                return true;
            }
        }
        return false;
    }
}