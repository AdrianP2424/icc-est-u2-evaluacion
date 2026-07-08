import java.util.ArrayList;
import java.util.List;

import models.LabSupply;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<LabSupply> supplies = new ArrayList<>();

        supplies.add(new LabSupply("INT-205-104" , "Ana Torres", 80));
        supplies.add(new LabSupply("INT-201-101" , "Luis Mora", 15));
        supplies.add(new LabSupply("INT-208-108" , "Carlos Vega", 45));
        supplies.add(new LabSupply("INT-205-104" , "Ana Torres", 80));
        supplies.add(new LabSupply("INT-203-103" , "Luis Andrade", 30));
        supplies.add(new LabSupply("INT-207-107" , "Mateo Rojas", 8));
        supplies.add(new LabSupply("INT-202-102" , "Sofia Cordero", 55));
        supplies.add(new LabSupply("INT-206-106" , "Carlos Mendez", 90));
        supplies.add(new LabSupply("INT-204-105", "Ana Molina", 20));



        supplies.add(new LabSupply("INT-207-104", "Juan Moral", 25));
        supplies.add(new LabSupply("INT-208-109", "Xaviar Ortega",70));
        supplies.add(new LabSupply("INT-202-101", "Andrea Solano", 55));
        supplies.add(new LabSupply("INT-208-107", "Kevin Figueroa", 60));
        supplies.add(new LabSupply("INT-203-102", "Jorge Espinoza", 15));
        supplies.add(new LabSupply("INT-204-103", "Fabricio Guaman", 90));
        supplies.add(new LabSupply("INT-209-100", "Jhonnatan Mendoza", 65));


    }
}
