package Day8;

public class MusicPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("음악을 재생합니다");
    }

    @Override
    public void stop() {
        System.out.println("음악을 정지합니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("음악을 끕니다");
    }

    @Override
    public void turnOn() {
        System.out.println("음악을 재시작합니다.");
    }
}
