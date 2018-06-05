package Entity;

import java.io.Serializable;

public class Request implements Serializable {
    private static final long serialVersionUID = 0L;

    private String className;
    private String methodName;
    private Class<?>[] paramTypes;
    private Object[] params;

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getMethodName() {
        return methodName;
    }
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
    public Class<?>[] getParamTypes() {
        return paramTypes;
    }
    public void setParamTypes(Class<?>[] paramTypes) {
        this.paramTypes = paramTypes;
    }
    public Object[] getParams() {
        return params;
    }
    public void setParams(Object[] params) {
        this.params = params;
    }
}
