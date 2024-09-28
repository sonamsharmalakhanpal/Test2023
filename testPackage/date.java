package testPackage;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class date {

    public static void main(String[] args) {
        //difference between two dates
        LocalDate d1 = LocalDate.of(2023,2,20);
        LocalDate d2 = LocalDate.now();

        System.out.println(d1+"------"+d2);

        Period exp = Period.between(d1,d2);
        System.out.println(exp.getYears());
        System.out.println(exp.getMonths());
        System.out.println(exp.getDays());

    }
}
