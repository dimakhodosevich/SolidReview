public class ReportFormatterEmployee extends ReportFormatter{
    public ReportFormatterEmployee(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormatter(){
        return formatter;
    }
}
