package Servlet;

public class Information {
    private boolean result;
    private String msg;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "information{" +
                "result=" + result +
                ", msg='" + msg + '\'' +
                '}';
    }
}
