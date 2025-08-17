package vb;

import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import com.gimbal.internal.json.JsonWriteException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vb.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17541g extends AbstractC17539e {

    /* renamed from: d, reason: collision with root package name */
    C6382c f164641d;

    /* renamed from: e, reason: collision with root package name */
    C6380a f164642e;

    C17541g() {
        this(false);
    }

    public C17541g(boolean z10) {
        super(z10);
        this.f164641d = C6383d.a(C17541g.class.getName());
        this.f164642e = C6381b.a(C17541g.class.getName());
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
        AbstractC17543i abstractC17543i;
        String strB;
        b(obj);
        try {
            JSONObject jSONObject = new JSONObject();
            this.f164635a.get(obj.getClass());
            Class<?> cls = obj.getClass();
            for (Method method : AbstractC17539e.f(cls)) {
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
                        AbstractC17543i abstractC17543i2 = this.f164636b.get(cls);
                        if ((abstractC17543i2 != null && (strB = abstractC17543i2.b(cls, str)) != null) || ((abstractC17543i = this.f164636b.get(Void.class)) != null && (strB = abstractC17543i.b(cls, str)) != null)) {
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
