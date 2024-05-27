package sxy.spring.projectclass;

public class Result {
    public int code;
    public String msg;
    public Object data;
    public Result(){

    }
    public Result(int code, String msg, Object data){
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
    public static Result success(){
        return new Result(1,"success", null);
    }
    public static Result success(Object data){
        return new Result(1,"success", data);
    }
    public String toString(int code,String msg,Object data){
        return "code= "+this.code+"msg= " + this.msg+ "data=" + this.data;
    }
}
