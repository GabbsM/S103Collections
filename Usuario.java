package NivelTres;

import lombok.Data;

    @Data
    public class Usuario {
        private String nombre;
        private String apellido;
        private String dni;

        public Usuario(String nombre, String apellido,String dni) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni=dni;
        }

        public String[] toCSV(){
            String [] datos = {nombre,apellido,dni};
            return datos;
        }
}
