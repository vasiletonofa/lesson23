import area.*;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


//        StringBuilder evidentPersoaneDeServiciu = new StringBuilder(); // 654
//
//        evidentPersoaneDeServiciu.append("Ion");
//        evidentPersoaneDeServiciu.append(", Vasile");
//        evidentPersoaneDeServiciu.append(", Gheorghe");
//
//        String persoAnaDeServiciu = new String(); // 123
//
//        for (int i = 0; i < 1000; i++) {
//            evidentPersoaneDeServiciu.append(", Persoana"); // 654
//
//            persoAnaDeServiciu = persoAnaDeServiciu + ", Persoana"; // 345 // 678 // 789   GarbageCollector
//        }
//
//
//        System.out.println(evidentPersoaneDeServiciu);

//                                                            //StringPool
//        String name = "Vasile";   // 123                 // Vasile = 123
//        String name2 = "Vasile";  // 123
//        String name3 = "Vasile";  // 123
//
//        String name4 = new String("Vasile"); // 456
//
//        System.out.println(name == name2);
//        System.out.println(name == name3);
//        System.out.println(name == name4);  // false
//
//        System.out.println(name.equals(name4)); // true

//
//        Set<String> names = new HashSet<>();
//        names.add("Vasile");
//        names.add("Ion");
//        names.add("Gheorghe");
//        names.add("Andrei");

//        // 100000000
//
//        for(String s : names) {
//            System.out.println(s); // Vasile
//        }
//
//       names = names.stream()      // stream                                  // 100000
//                .map( (String s) -> s.toUpperCase())  // operatiune intermediara
//                .collect(Collectors.toSet());         // rezultat
//
//        for(String s : names) {
//            System.out.println(s); // VASILE
//        }
//
////        for(String nameCap : nameCapitalSet) {
////            System.out.println(nameCap);  // VASILE
////        }


        Set<String> names = new HashSet<>();
        names.add("Vasile");
        names.add("Ion");
        names.add("Gheorghe");
        names.add("Andrei");

        long num = names.stream().count();


//        Tabla tabla = new Tabla();
//

//        tabla.diseneazaArea(new Circle());
//        tabla.diseneazaArea(new Square());
//        tabla.diseneazaArea(new Triangle());
//        tabla.diseneazaArea(new Paralelogram());
//
//        tabla.diseneazaArea(() -> System.out.println("Calculez area Romb..."));


    }
}