public Class Tv {
    private int channel;
    private int volumeLevel;
    private boolean on;

    public int getChannel (){
        return channel;
    }

    public int getVolumeLevel(){
        return volumeLevel;
    }
    public 

    public void turnUn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setChannel(int newChannel){ //1 -128
    if (on && newChannel >= 1 && neChannel <= 128 ) {
        channel = newChannel;
        }  
    }
    public void setVolume(int newVolumeLevel){ // 1 - 7
    if (on && newVolumeLevel >=1 && newVolumeLevel <= 7) {
        volumeLevel = newVolumeLevel;
        }
    }
    public void volumeUp(){
        if (on && volumeLevel < 7)
        volumenLevel ++;
    }
    public void volumenDown(){
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }
    public void channel(){
        if (on && channel < 120) {
            channel++;
        }
    }
    public void channel--;(){
        if (on && channel > 1) {
            channel--;
        }
    }
    Run 
    public static void main(String[] args) {
        Tv sony = new Tv();
        sony.turnOn()
        sony.setChannel(212);
        sony.setVolume(7);

        system.out.println("The tv is "+ sony.getOn() +
                            " The channel is  "+ sony.getChannel()
                            " The volumen is  "+ sony.getVolumeLevel())
        sony.volumenDown()
        system.out.println(sony.getVolumeLevel());
        sony.volumenDown()
        system.out.println(sony.getVolumeLevel());
        sony.volumenDown()
        system.out.println(sony.getVolumeLevel());
        sony.volumenDown()
        system.out.println(sony.getVolumeLevel());
        sony.volumenDown()
        system.out.println(sony.getVolumeLevel());
        sony.volumenDown()
        system.out.println(sony.getVolumeLevel());
        sony.volumenDown()
        system.out.println(sony.getVolumeLevel());

        sony.turnOff();
    }
   }
}