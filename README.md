# Evaluación Set y Map

## ## Metodo A : filterAndSortSupplies

implementacion utilizada:
TreeSet combinada con un Comparator personalizado anónimo.

Explicacion:
Se seleccionó TreeSet porque la estructura elimina de forma automática los duplicados lógicos y mantiene los elementos ordenados en tiempo real conforme se van insertando. La unicidad y el orden se garantizan mediante el método 'compare' del Comparator, el cual evalúa los criterios de prioridad y técnicos requeridos, impidiendo la inserción de elementos repetidos al retornar 0.

## ## Metodo B : groupCodesByStock

Implementacion utilizada para el map:
TreeMap

Implementacion para los Set internos:
TreeSet

Explicacion:
Se utilizó TreeMap para asegurar que las llaves principales se organicen y mantengan automáticamente bajo un estricto orden alfabético. Por otro lado, los Set internos se implementaron con TreeSet para garantizar de forma nativa que los números extraídos de los códigos se almacenen de manera única (sin duplicados) y ordenados ascendentemente (de menor a mayor) sin necesidad de recurrir a ordenamientos manuales.
