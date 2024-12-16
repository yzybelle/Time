public class Time {
    public int secs;
    public int mins;
    public int hours;


    Time(int hours, int mins, int secs){
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;
    }

    public void tick(){
        secs+=1;
    }

    public void add(Time time){
        hours += time.hours;
        mins += time.mins;
        secs += time.secs;
    }

public String toString(){
        String seconds;
        String minutes;
        String hour;
        if (secs>= 60){
            secs = 0;
            mins +=1;
        }
        if (mins>= 60){
            mins = 0;
            hours +=1;
        }
        if (hours>=24){
            mins=0;
            hours=0;
            secs =0;
        }
        else {}

        seconds = String.valueOf(secs);
        minutes = String.valueOf(mins);
        hour = String.valueOf(hours);

        if (seconds.length()==1){
            seconds = "0" + secs;
        }
    if (minutes.length()==1){
        minutes = "0" + mins;
    }
    if (hour.length()==1){
        hour  = "0" + hours;
    }
    return hour+":"+minutes+":"+seconds;
}

}
