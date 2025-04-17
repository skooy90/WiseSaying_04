package KoreaIT;

public class Rq {
    private int id = -1;
    private String functionCode;
    private String actionCode;

    Rq(String cmd){
        // parsing start
        String[] cmdBits = cmd.split(" ");
        functionCode = cmdBits[0];
        actionCode = cmdBits[1];

        if (cmdBits.length > 3) {
            System.out.println("명령어를 제대로 입력해주세요.");
        }
        try {
            id = Integer.parseInt(cmdBits[2]);
        } catch (NumberFormatException e) {
            System.out.println("정수를 제대로 입력해주세요.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("정수를 추가해서 입력해주세요.");
        }
        // parsing end

    }
    public int getId(){
        return id;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public String getActionCode() {
        return actionCode;
    }
}
