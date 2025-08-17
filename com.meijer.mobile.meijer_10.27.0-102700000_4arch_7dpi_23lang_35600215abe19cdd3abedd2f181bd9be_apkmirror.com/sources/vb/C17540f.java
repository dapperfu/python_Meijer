package vb;

import cb.C6380a;
import cb.C6381b;
import com.gimbal.internal.json.JsonReadException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vb.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17540f extends AbstractC17539e {

    /* renamed from: e, reason: collision with root package name */
    private static final C6380a f164638e = C6381b.a(C17540f.class.getName());

    /* renamed from: f, reason: collision with root package name */
    private static final Type[] f164639f = {Object.class, Object.class};

    /* renamed from: d, reason: collision with root package name */
    private final Map<Method, Type[]> f164640d;

    C17540f() {
        this(false);
    }

    private synchronized Type[] n(Method method) throws JsonReadException {
        Type[] actualTypeArguments;
        try {
            actualTypeArguments = this.f164640d.get(method);
            if (actualTypeArguments == null) {
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                if (genericParameterTypes.length != 1) {
                    throw new JsonReadException("Internal error - setter with argument count != 1");
                }
                Type type = genericParameterTypes[0];
                actualTypeArguments = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments() : new Type[0];
                this.f164640d.put(method, actualTypeArguments);
            }
            if (actualTypeArguments == null || actualTypeArguments.length == 0) {
                method.getName();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return actualTypeArguments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X, java.lang.String] */
    private static <X> X o(Class<X> cls, Object obj) throws JsonReadException {
        ?? r02 = (X) ((String) obj);
        try {
            if (cls.isAssignableFrom(String.class)) {
                return r02;
            }
            if (cls.isEnum()) {
                for (Object obj2 : cls.getEnumConstants()) {
                    X x10 = (X) obj2;
                    if (r02.equals(((Enum) x10).name())) {
                        return x10;
                    }
                }
                throw new JsonReadException("Can't find enum constant: " + ((String) r02) + " in enum type: " + cls.getSimpleName());
            }
            if (cls != Integer.class) {
                try {
                    if (cls != Integer.TYPE) {
                        if (cls != Long.class && cls != Long.TYPE) {
                            if (cls == Double.class || cls == Double.TYPE) {
                                return (X) r(cls, Double.valueOf((String) r02));
                            }
                            if (cls == Object.class) {
                                return obj;
                            }
                            throw v(cls, obj);
                        }
                        return (X) s(cls, Long.valueOf((String) r02));
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                    throw v(cls, obj);
                }
            }
            return (X) t(cls, Integer.valueOf((String) r02));
        } catch (Exception e11) {
            throw new JsonReadException(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X, java.lang.Double] */
    private static <X> X r(Class<X> cls, Object obj) throws JsonReadException {
        ?? r02 = (X) ((Double) obj);
        if (cls != Double.class) {
            try {
                if (cls != Double.TYPE) {
                    if (cls == Float.class || cls == Float.TYPE) {
                        return (X) Float.valueOf(r02.floatValue());
                    }
                    if (cls == Object.class) {
                        return obj;
                    }
                    if (cls.isAssignableFrom(String.class)) {
                        return (X) r02.toString();
                    }
                    throw v(cls, obj);
                }
            } catch (Exception e10) {
                throw new JsonReadException(e10);
            }
        }
        return r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X, java.lang.Long] */
    private static <X> X s(Class<X> cls, Object obj) throws JsonReadException {
        ?? r02 = (X) ((Long) obj);
        if (cls != Long.class) {
            try {
                if (cls != Long.TYPE) {
                    if (cls != Double.class && cls != Double.TYPE) {
                        if (cls == Float.class || cls == Float.TYPE) {
                            return (X) Float.valueOf(r02.floatValue());
                        }
                        if (cls == Object.class) {
                            return obj;
                        }
                        if (cls.isAssignableFrom(String.class)) {
                            return (X) r02.toString();
                        }
                        throw v(cls, obj);
                    }
                    return (X) Double.valueOf(r02.longValue());
                }
            } catch (Exception e10) {
                throw new JsonReadException(e10);
            }
        }
        return r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X, java.lang.Integer] */
    private static <X> X t(Class<X> cls, Object obj) throws JsonReadException {
        ?? r02 = (X) ((Integer) obj);
        if (cls != Integer.class) {
            try {
                if (cls != Integer.TYPE) {
                    if (cls != Long.class && cls != Long.TYPE) {
                        if (cls != Double.class && cls != Double.TYPE) {
                            if (cls == Float.class || cls == Float.TYPE) {
                                return (X) Float.valueOf(r02.floatValue());
                            }
                            if (cls == Object.class) {
                                return obj;
                            }
                            if (cls.isAssignableFrom(String.class)) {
                                return (X) r02.toString();
                            }
                            throw v(cls, obj);
                        }
                        return (X) Double.valueOf(r02.intValue());
                    }
                    return (X) Long.valueOf(r02.intValue());
                }
            } catch (Exception e10) {
                throw new JsonReadException(e10);
            }
        }
        return r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <X> X u(Class<X> cls, Object obj) throws JsonReadException {
        X x10 = (X) ((Boolean) obj);
        if (cls != Boolean.class) {
            try {
                if (cls != Boolean.TYPE) {
                    if (cls == Object.class) {
                        return obj;
                    }
                    throw v(cls, obj);
                }
            } catch (Exception e10) {
                throw new JsonReadException(e10);
            }
        }
        return x10;
    }

    public <X> X w(Class<X> cls, String str) throws JsonReadException {
        if (str == null) {
            return null;
        }
        try {
            String strTrim = str.trim();
            if (strTrim.length() == 0) {
                return null;
            }
            if (strTrim.charAt(0) == '{') {
                X x10 = (X) new JSONObject(strTrim);
                return cls == JSONObject.class ? x10 : (X) g(cls, x10);
            }
            if (strTrim.charAt(0) == '[') {
                X x11 = (X) new JSONArray(strTrim);
                return cls == JSONArray.class ? x11 : (X) g(cls, x11);
            }
            if (strTrim.charAt(0) == '\"') {
                return (X) k(strTrim);
            }
            if (cls != Double.TYPE && cls != Double.class) {
                if (cls != Long.TYPE && cls != Long.class) {
                    if (cls != Integer.TYPE && cls != Integer.class) {
                        throw new JsonReadException("Unrecognized JSON format starting with : " + strTrim.charAt(0));
                    }
                    return (X) Integer.valueOf(str);
                }
                return (X) Long.valueOf(str);
            }
            return (X) Double.valueOf(str);
        } catch (JSONException e10) {
            throw new JsonReadException("JSON parse failed", e10);
        }
    }

    public C17540f(boolean z10) {
        super(z10);
        this.f164640d = new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <X> X g(Class<X> cls, Object obj) throws JSONException, JsonReadException, NoSuchMethodException, SecurityException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (X) o(cls, obj);
        }
        if (obj instanceof Double) {
            return (X) r(cls, obj);
        }
        if (obj instanceof Long) {
            return (X) s(cls, obj);
        }
        if (obj instanceof Integer) {
            return (X) t(cls, obj);
        }
        if (obj instanceof Boolean) {
            return (X) u(cls, obj);
        }
        if (obj instanceof JSONObject) {
            if (Map.class.isAssignableFrom(cls)) {
                return (X) i(cls, f164639f, (JSONObject) obj);
            }
            if (cls == Object.class) {
                return (X) i(HashMap.class, f164639f, (JSONObject) obj);
            }
            return (X) j(q(cls), (JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            if (Set.class.isAssignableFrom(cls)) {
                return (X) h(cls, f164639f, (JSONArray) obj);
            }
            if (List.class.isAssignableFrom(cls)) {
                return (X) p(cls, f164639f, (JSONArray) obj);
            }
            if (cls == Object.class) {
                return (X) p(ArrayList.class, f164639f, (JSONArray) obj);
            }
            if (cls.isArray()) {
                return (X) m(cls.getComponentType(), (JSONArray) obj);
            }
        }
        throw new JsonReadException("Can't handle result type: " + cls.getName() + " from " + obj.getClass().getName());
    }

    private <X> X h(Class<X> cls, Type[] typeArr, JSONArray jSONArray) throws JSONException, JsonReadException {
        X x10;
        if (cls == Set.class) {
            x10 = (X) new HashSet();
        } else {
            try {
                x10 = (X) ((Set) cls.newInstance());
            } catch (Exception e10) {
                throw new JsonReadException("Couldn't instantiate Set sub-class '" + cls + "' specified as argument in setter", e10);
            }
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            ((Set) x10).add(jSONArray.isNull(i10) ? null : g((Class) typeArr[0], jSONArray.get(i10)));
        }
        return x10;
    }

    private <X> X i(Class<X> cls, Type[] typeArr, JSONObject jSONObject) throws JSONException, JsonReadException {
        X x10;
        if (cls == Map.class) {
            x10 = (X) new HashMap();
        } else {
            try {
                x10 = (X) ((Map) cls.newInstance());
            } catch (Exception e10) {
                throw new JsonReadException("Couldn't instantiate Map sub-class '" + cls + "' specified as argument in setter", e10);
            }
        }
        Class<X> cls2 = (Class) typeArr[0];
        Class<X> cls3 = (Class) typeArr[1];
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            ((Map) x10).put(g(cls2, next), jSONObject.isNull(next.toString()) ? null : g(cls3, jSONObject.get(next.toString())));
        }
        return x10;
    }

    private static JSONArray l(String str, Object obj) throws JsonReadException {
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw new JsonReadException("JSON needs array for " + str);
    }

    private <X> X p(Class<X> cls, Type[] typeArr, JSONArray jSONArray) throws JSONException, JsonReadException {
        X x10;
        if (cls == List.class) {
            x10 = (X) new ArrayList();
        } else {
            try {
                x10 = (X) ((List) cls.newInstance());
            } catch (Exception e10) {
                throw new JsonReadException("Couldn't instantiate List sub-class '" + cls + "' specified as argument in setter", e10);
            }
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            ((List) x10).add(jSONArray.isNull(i10) ? null : g((Class) typeArr[0], jSONArray.get(i10)));
        }
        return x10;
    }

    private <X> X q(Class<X> cls) throws JsonReadException, NoSuchMethodException, SecurityException {
        this.f164635a.get(cls);
        try {
            Constructor<X> declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(null);
        } catch (Exception e10) {
            throw new JsonReadException(e10);
        }
    }

    private static JsonReadException v(Class<?> cls, Object obj) {
        return new JsonReadException("Value of type: " + obj.getClass().getSimpleName() + " cannot be set to: " + cls.getSimpleName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x000b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <X> X j(X r11, org.json.JSONObject r12) throws org.json.JSONException, java.lang.IllegalAccessException, com.gimbal.internal.json.JsonReadException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.C17540f.j(java.lang.Object, org.json.JSONObject):java.lang.Object");
    }

    private static String k(String str) throws JsonReadException {
        int i10;
        int i11;
        if (str.length() > 0) {
            if (str.charAt(0) == '\"') {
                StringBuilder sb2 = null;
                int i12 = 1;
                while (i12 < str.length()) {
                    char cCharAt = str.charAt(i12);
                    if (cCharAt == '\"') {
                        if (i12 == str.length() - 1) {
                            if (sb2 != null) {
                                return sb2.toString();
                            }
                            return str.substring(1, str.length() - 1);
                        }
                        throw new JsonReadException("Trailing quote not at end of string");
                    }
                    if (cCharAt == '\\') {
                        if (sb2 == null) {
                            sb2 = new StringBuilder();
                            sb2.append(str.substring(1, i12));
                        }
                        i12++;
                        if (i12 >= str.length()) {
                            continue;
                        } else {
                            char cCharAt2 = str.charAt(i12);
                            if (cCharAt2 == '\"') {
                                sb2.append(cCharAt2);
                            } else if (cCharAt2 == '\\') {
                                sb2.append('\\');
                            } else if (cCharAt2 == '/') {
                                sb2.append('/');
                            } else if (cCharAt2 == 'b') {
                                sb2.append('\b');
                            } else if (cCharAt2 == 'n') {
                                sb2.append('\n');
                            } else if (cCharAt2 == 'r') {
                                sb2.append('\r');
                            } else if (cCharAt2 == 't') {
                                sb2.append('\t');
                            } else if (cCharAt2 == 'f') {
                                sb2.append('\f');
                            } else if (cCharAt2 == 'u') {
                                int i13 = 0;
                                for (int i14 = 0; i14 < 4; i14++) {
                                    i12++;
                                    if (i12 < str.length()) {
                                        char lowerCase = Character.toLowerCase(str.charAt(i12));
                                        if (lowerCase >= '0' && lowerCase <= '9') {
                                            i10 = i13 << 4;
                                            i11 = (lowerCase - '0') & 15;
                                        } else if (lowerCase >= 'a' && lowerCase <= 'f') {
                                            i10 = i13 << 4;
                                            i11 = ((lowerCase - 'a') & 15) + 10;
                                        } else {
                                            throw new JsonReadException("Invalid hex value in character representation: " + str.charAt(i12));
                                        }
                                        i13 = i10 | i11;
                                    } else {
                                        throw new JsonReadException("Invalid character representation at end of string");
                                    }
                                }
                                sb2.append(Character.valueOf((char) i13));
                            } else {
                                throw new JsonReadException("Invalid escaped character: \\" + cCharAt2);
                            }
                        }
                    } else if (sb2 != null) {
                        sb2.append(cCharAt);
                    }
                    i12++;
                }
                throw new JsonReadException("No trailing quote");
            }
            throw new JsonReadException("Missing \" at beginning of string");
        }
        throw new JsonReadException("Invalid string");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <X> X[] m(Class<X> cls, JSONArray jSONArray) throws JsonReadException, NoSuchMethodException, SecurityException {
        Object objG;
        try {
            if (!cls.isPrimitive()) {
                X[] xArr = (X[]) ((Object[]) Array.newInstance((Class<?>) cls, jSONArray.length()));
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (jSONArray.isNull(i10)) {
                        objG = null;
                    } else {
                        objG = g(cls, jSONArray.get(i10));
                    }
                    xArr[i10] = objG;
                }
                return xArr;
            }
            throw new JsonReadException("Can't handle arrays of primitives yet :-(");
        } catch (JSONException e10) {
            throw new JsonReadException("Failed to read array of type: " + cls.getSimpleName() + " from " + jSONArray.getClass().getSimpleName(), e10);
        }
    }
}
