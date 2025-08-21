package xb;

import com.gimbal.internal.json.JsonWriteException;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xb.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18153g extends AbstractC18151e {

    /* renamed from: d, reason: collision with root package name */
    C13786c f170677d;

    /* renamed from: e, reason: collision with root package name */
    C13784a f170678e;

    C18153g() {
        this(false);
    }

    public C18153g(boolean z10) {
        super(z10);
        this.f170677d = C13787d.a(C18153g.class.getName());
        this.f170678e = C13785b.a(C18153g.class.getName());
    }

    private JSONArray g(Collection<?> collection) throws JSONException, JsonWriteException {
        try {
            JSONArray jSONArray = new JSONArray();
            for (Object obj : collection) {
                if (obj instanceof String) {
                    jSONArray.put(obj.toString());
                } else if (obj instanceof Double) {
                    jSONArray.put(((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    jSONArray.put(((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    jSONArray.put(((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    jSONArray.put(((Boolean) obj).booleanValue());
                } else {
                    jSONArray.put(j(obj));
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            throw new JsonWriteException(e10);
        }
    }

    private JSONArray h(Object[] objArr) throws JSONException, JsonWriteException {
        try {
            JSONArray jSONArray = new JSONArray();
            for (Object obj : objArr) {
                if (obj instanceof String) {
                    jSONArray.put(obj.toString());
                } else if (obj instanceof Double) {
                    jSONArray.put(((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    jSONArray.put(((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    jSONArray.put(((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    jSONArray.put(((Boolean) obj).booleanValue());
                } else {
                    jSONArray.put(j(obj));
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            throw new JsonWriteException(e10);
        }
    }

    private JSONObject i(Map<?, ?> map) throws JSONException, JsonWriteException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                String string = entry.getKey().toString();
                if (entry.getValue() instanceof String) {
                    jSONObject.put(string, entry.getValue().toString());
                } else if (entry.getValue() instanceof Double) {
                    jSONObject.put(string, ((Double) entry.getValue()).doubleValue());
                } else if (entry.getValue() instanceof Long) {
                    jSONObject.put(string, ((Long) entry.getValue()).longValue());
                } else if (entry.getValue() instanceof Integer) {
                    jSONObject.put(string, ((Integer) entry.getValue()).intValue());
                } else if (entry.getValue() instanceof Boolean) {
                    jSONObject.put(string, ((Boolean) entry.getValue()).booleanValue());
                } else {
                    jSONObject.put(string, j(entry.getValue()));
                }
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new JsonWriteException(e10);
        }
    }

    public Object j(Object obj) throws JsonWriteException {
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof String) {
                return obj.toString();
            }
            if ((obj instanceof Number) || (obj instanceof Boolean)) {
                return obj;
            }
            if (obj instanceof Enum) {
                return ((Enum) obj).name();
            }
            if (!obj.getClass().isArray()) {
                return obj instanceof Collection ? g((Collection) obj) : obj instanceof Map ? i((Map) obj) : k(obj);
            }
            if (obj.getClass().getComponentType().isPrimitive()) {
                throw new JsonWriteException("Can't handle arrays of primitives yet");
            }
            return h((Object[]) obj);
        } catch (Exception e10) {
            throw new JsonWriteException(e10);
        }
    }

    public JSONArray l(Object obj) throws JsonWriteException {
        if (obj == null) {
            return null;
        }
        return (JSONArray) j(obj);
    }

    public JSONObject m(Object obj) throws JsonWriteException {
        if (obj == null) {
            return null;
        }
        return (JSONObject) j(obj);
    }

    public String n(Object obj) throws JsonWriteException {
        if (obj == null) {
            return null;
        }
        return j(obj).toString();
    }

    public Object k(Object obj) throws JSONException, JsonWriteException, SecurityException {
        String strSubstring;
        String str;
        AbstractC18155i abstractC18155i;
        String strB;
        b(obj);
        try {
            JSONObject jSONObject = new JSONObject();
            this.f170671a.get(obj.getClass());
            Class<?> cls = obj.getClass();
            for (Method method : AbstractC18151e.f(cls)) {
                if (method.getParameterTypes().length == 0 && !method.getName().equals("getClass")) {
                    String name = method.getName();
                    if (name.length() > 3 && name.startsWith("get") && Character.isUpperCase(name.charAt(3))) {
                        strSubstring = method.getName().substring(3);
                    } else if (name.length() > 2 && name.startsWith("is") && Character.isUpperCase(name.charAt(2))) {
                        strSubstring = method.getName().substring(2);
                    } else {
                        strSubstring = null;
                    }
                    if (strSubstring != null) {
                        str = Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1);
                        AbstractC18155i abstractC18155i2 = this.f170672b.get(cls);
                        if ((abstractC18155i2 != null && (strB = abstractC18155i2.b(cls, str)) != null) || ((abstractC18155i = this.f170672b.get(Void.class)) != null && (strB = abstractC18155i.b(cls, str)) != null)) {
                            str = strB;
                        }
                    } else {
                        str = null;
                    }
                    if (str != null && !c(cls, str)) {
                        method.setAccessible(true);
                        jSONObject.put(str, j(method.invoke(obj, null)));
                    }
                }
            }
            return jSONObject;
        } catch (IllegalAccessException e10) {
            throw new JsonWriteException(e10);
        } catch (InvocationTargetException e11) {
            throw new JsonWriteException(e11);
        } catch (JSONException e12) {
            throw new JsonWriteException(e12);
        }
    }
}
