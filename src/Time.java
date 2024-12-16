/**
 * This Time class represents an analog clock. The clock displays hours, minutes, and seconds.
 */
public class Time {
    public int secs;
    public int mins;
    public int hours;

    /**
     *  Constructor for the Time class. This creates a new instance of a clock given the below parameters.
     * @param hours represents the hour.
     * @param mins represents the minutes.
     * @param secs represents the seconds.
     */
    Time(int hours, int mins, int secs){
        this.hours = hours;
        this.mins = mins;
        this.secs = secs;
    }

    /**
     * tick method for the Time class. Adds one second to an instance of this class.
     */
    public void tick(){
        secs+=1;
    }

    /**
     * add method for the Time class. Adds the time from one instance of the class to another.
     * @param time represents an instance of the class, containing hours, minutes, and seconds.
     */
    public void add(Time time){
        hours += time.hours;
        mins += time.mins;
        secs += time.secs;
    }

    /**
     * toString method for the Time class. It checks whether the seconds, minutes, or hours exceed
     * a logical display on a time. If so, it adjusts it accordingly. It also checks  if any time
     * value is one digit, which then adds a 0 prior to it.
     * @return returns the time
     */
    public String toString(){
        String seconds;
        String minutes;
        String hour;
        if (secs>= 60){
            secs = secs-60;
            mins +=1;
        }
        if (mins>= 60){
            mins = mins-60;
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
