public enum Department {
    SALE("Отдел продаж"),
    MARKETING("Отдел маркетинга"),
    FINANCE("Финансовый отдел"),
    CUSTOMER_SERVICE("Отдел обслуживания клиентов"),
    HR("Отдел кадров"),
    IT("Отдел информационных технологий");

    private final String description;

    Department(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return this.description;
    }



}
