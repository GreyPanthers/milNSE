package es.alcazardesanjuan.firebase1;

/**
 * Created by kike on 25/02/18.
 */

public class valoraciones  {


        private float ratingStar;
        private String valoracion;
        private String observacion;
        private int imagen;
        private String tituloicono;

        public valoraciones(int ratingStar, String valoracion, String observacion, int imagen, String tituloicono) {
            this.ratingStar = ratingStar;
            this.valoracion = valoracion;
            this.observacion = observacion;
            this.imagen=imagen;
            this.tituloicono= tituloicono;
        }

        public int getImagen(){return imagen;}
        public void setImagen(int imagen){this.imagen=imagen;}

        public float getRatingStar() {
            return ratingStar;
        }

        public void setRatingStar(float ratingStar) {
            this.ratingStar = ratingStar;
        }

        public String getValoracion() {
            return valoracion;
        }

        public void setValoracion(String valoracion) {
            this.valoracion = valoracion;
        }

        public String getObservacion() {
            return observacion;
        }

        public void setObservacion(String country) {
            this.observacion = observacion;
        }

        public String gettituloicono() {
        return tituloicono;
    }

        public void setTituloicono(String country) {
        this.tituloicono = tituloicono;
    }

    }
