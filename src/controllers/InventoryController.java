package controllers;

import java.util.List;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Comparator;
import models.LabSupply;

public class InventoryController {
    
    public TreeSet<LabSupply> filterAndSortSupplies(List<LabSupply> supplies, int minimumStock) {
        
        Comparator<LabSupply> comp = new Comparator<LabSupply>() {
            @Override
            public int compare(LabSupply s1, LabSupply s2) {
                if (s1.getCodigo().equalsIgnoreCase(s2.getCodigo()) && s1.getStock() == s2.getStock()) {
                    return 0;
                }
                if (s1.getStock() != s2.getStock()) {
                    return Integer.compare(s2.getStock(), s1.getStock());
                }
                return s1.getNombre().compareToIgnoreCase(s2.getNombre());
            }
        };

        TreeSet<LabSupply> resultado = new TreeSet<>(comp);

        for (LabSupply supply : supplies) {
            if (supply.getStock() >= minimumStock) {
                resultado.add(supply);
            }
        }

        return resultado;
    }
    
    public Map<String, Set<Integer>> groupCodesByStock(List<LabSupply> supplies) {
        Map<String, Set<Integer>> agruparCodigos = new TreeMap<>();
        
        agruparCodigos.put("ALTA", new TreeSet<>());
        agruparCodigos.put("MEDIA", new TreeSet<>());
        agruparCodigos.put("BAJA", new TreeSet<>());

        for (LabSupply supply : supplies) {
            String numeroStr = supply.getCodigo().substring(3);
            int numero = Integer.parseInt(numeroStr);

            if (supply.getStock() >= 4) {
                agruparCodigos.get("ALTA").add(numero);
            } else if (supply.getStock() <= 3 && supply.getStock() >= 2) {
                agruparCodigos.get("MEDIA").add(numero);
            } else if (supply.getStock() == 1) {
                agruparCodigos.get("BAJA").add(numero);
            }
        }
        
        return agruparCodigos;
    }
}



