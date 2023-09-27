package Day4;

public class Board {
    private String name;
    private String content;
    public String getName(){
        return name;
    }
    public  String getContent(){
        return content;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    public void setContent(String content){
        if(content.length() >= 10){
            this.content = content;
        }
        else System.out.println("content는 10글자 이상이어야 합니다.");
        this.content = "Content가 짧습니다.";
    }
}
