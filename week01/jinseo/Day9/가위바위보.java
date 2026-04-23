package Day9;

public class 가위바위보 {
    public String solution(String rsp) {
        rsp = rsp.replace("2", "x");
        rsp = rsp.replace("5", "2");
        rsp = rsp.replace("0", "5");
        rsp = rsp.replace("x", "0");
        return rsp;
    }
}
