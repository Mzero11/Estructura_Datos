package Estructura;

class RojoYNegro extends Arbol {
    public void presentarRojo() {
    }

    public void presentarNegro() {
    }

    @Override
    public boolean agregar(int valor) {
        if (raiz == null) {
            raiz = new NodoConcreto(valor);
            return true;
        } else {
            boolean agregado = raiz.agregar(valor);
            if (agregado) {
            }
            return agregado;
        }
    }
}

