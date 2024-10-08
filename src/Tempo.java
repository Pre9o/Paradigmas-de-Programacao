public class Tempo{
    int horas;
    int minutos;
    int segundos;
    int tempoEmSegundos;

    public Tempo(){
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
        this.tempoEmSegundos = 0;
    }

    public void setHoras(int horas){
        if(horas >= 0 && horas <= 23)
            this.horas = horas;
        else{
            System.out.println("Horas inválidas! (0 a 23)");
        }
    }

    public void setMinutos(int minutos){
        if(minutos >= 0 && minutos <= 59)
            this.minutos = minutos;
        else{
            System.out.println("Minutos inválidos! (0 a 59)");
        }
    }

    public void setSegundos(int segundos){
        if(segundos >= 0 && segundos <= 59)
            this.segundos = segundos;
        else{
            System.out.println("Segundos inválidos! (0 a 59)");
        }
    }

    public void setTempo(int tempoEmSegundos){
        if (tempoEmSegundos >= 0) {
            this.tempoEmSegundos = tempoEmSegundos;
            this.horas = this.tempoEmSegundos / 3600;
            this.minutos = (this.tempoEmSegundos % 3600) / 60;
            this.segundos = this.tempoEmSegundos % 60;
        } else {
            System.out.println("Tempo inválido! (valor negativo)");
        }
    }

    public void getHoras(){
        System.out.println("Horas: " + this.horas);
    }

    public void getMinutos(){
        System.out.println("Minutos: " + this.minutos);
    }

    public void getSegundos(){
        System.out.println("Segundos: " + this.segundos);
    }

    public void exibirHoraUniversal(){
        System.out.println("Hora Universal: " + this.horas + ":" + this.minutos + ":" + this.segundos);
    }

    public void incrementarSegundos(){
        this.segundos++;
        if(this.segundos == 60){
            this.segundos = 0;
            this.minutos++;
            if(this.minutos == 60){
                this.minutos = 0;
                this.horas++;
                if(this.horas == 24){
                    this.horas = 0;
                }
            }
        }
    }

    public void incrementarMinutos(){
        this.minutos++;
        if(this.minutos == 60){
            this.minutos = 0;
            this.horas++;
            if(this.horas == 24){
                this.horas = 0;
            }
        }
    }

    public void incrementarHoras(){
        this.horas++;
        if(this.horas == 24){
            this.horas = 0;
        }
    }

    public void horasToString(){
        String horas = Integer.toString(this.horas);
        String minutos = Integer.toString(this.minutos);
        String segundos = Integer.toString(this.segundos);
        if(this.horas < 10){
            horas = "0" + horas;
        }
        if(this.minutos < 10){
            minutos = "0" + minutos;
        }
        if(this.segundos < 10){
            segundos = "0" + segundos;
        }
        System.out.println("Hora: " + horas + ":" + minutos + ":" + segundos);
    }
}
