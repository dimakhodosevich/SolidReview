public class ReportFormatter {
    String formatter;

    ReportFormatter(Employee employee, FormatType formatType) {
        switch (formatType) {
            case CSV -> {
                formatter = "Employee " + " " + convertToCsv();
                break;
            }
            case XML -> {
                formatter = "Employee" + employee + " " + convertTOXml();
                break;
            }
        }
    }


    private String convertToCsv() {
        return "convert to CSV";
    }

    private String convertTOXml() {
        return "convert to XML";
    }
}
