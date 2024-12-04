public enum Department {
    SALE("Отдел продаж"),
    MARKETING("Отдел маркетинга"),
    FINANCE("Финансовый отдел"),
    CUSTOMER_SERVICE("Отдел обслуживания клиентов"),
    LOGISTICS("Отдел логистики");

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

//    public int getSequenceNumber() {
//        return Department.
//    }

}
