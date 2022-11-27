import static valid.ValidateUtils.*;

public class Person {
    private static final String defaultMessage = "Информация не указана";
    private String name;
    private int yearOfBirth;
    private String town;
    private String jobTitle;

    public Person(String name, int yearOfBirth, String town, String jobTitle) {
        this.name = validateString(name, defaultMessage);
        this.yearOfBirth = validateYearAndNumber(yearOfBirth).intValue();   // проверка из метода, из сеттера
        this.town = validateString(town, defaultMessage);
        this.jobTitle = validateString(jobTitle, defaultMessage);
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public String getJobTitle() {
        return jobTitle;
    }

//    public void setYearOfBirth(int yearOfBirth) {
//        if (yearOfBirth <= 0) {
//            this.yearOfBirth = 0;
//        } else
//        this.yearOfBirth = yearOfBirth;
//    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = validateYearAndNumber(yearOfBirth).intValue();
//        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name) {
        this.name = validateString(name, defaultMessage);
//        if (name == null||name.isEmpty()||name.isBlank()) {
//            this.name = defaultMessage;
//        } else
//            this.name = name;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Год моего рождения: " +
                yearOfBirth + ". Я работаю на должности: " + jobTitle + ". Будем знакомы!";
    }

//    public static int validateYear(int value) {
//        return value < 0 ? Math.abs(value) : value;
//    }
}