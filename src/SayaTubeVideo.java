import java.util.Random;

public class SayaTubeVideo {
    private int id;
    private String title;
    private int playCount;

    public static void main(String[] args)
    {
        SayaTubeVideo a = new SayaTubeVideo("Tutorial Design By Contract – Akbar Sirajuddin Hanif");
        a.PrintVideoDetails();
        for (int i = 0; i < 1; i++)
        {
            a.IncreasePlayCount(0);
        }
        a.PrintVideoDetails();
    }

    public SayaTubeVideo(String x) {
        Random y = new Random();
        this.id = y.nextInt(99999);
        this.title = x;
        playCount = 0;
    }

    public void IncreasePlayCount(int x) {
        playCount ++;
    }

    public void PrintVideoDetails() {
        System.out.println("Id \t\t\t: " + id);
        System.out.println("Title \t\t: " + title);
        System.out.println("PlayCount \t: " + playCount);
    }
}