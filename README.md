# PCs15_PDS
**Descripcion del Problema**

La cafetería tiene un menú compuesto por varias categorías de productos (cafés, tés, postres, extras). Distintas partes del sistema (la pantalla de pedidos, un reporte, una futura app) necesitan recorrer todo el menú sin conocer cómo está organizado por dentro, y sin que un cambio en esa organización rompa el código cliente.

**Patrón aplicado**

Implementé el patrón Iterator para resolver el problema. El menú se representa internamente como una lista enlazada de nodos (Nodo), y se expone un iterador (LinkedIterator) que permite recorrer los productos uno por uno mediante hasNext() y next(), sin que el cliente (Main) conozca la estructura interna de la colección.

# Diagrama UML
<img width="536" height="782" alt="PCsem15UML_PDS" src="https://github.com/user-attachments/assets/f2966020-d6c2-48f8-9b2e-21b89a33dfe4" />