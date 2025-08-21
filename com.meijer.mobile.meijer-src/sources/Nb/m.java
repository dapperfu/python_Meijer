package Nb;

import eb.C13784a;
import eb.C13785b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class m<T> {

    /* renamed from: c, reason: collision with root package name */
    static final C13784a f20781c = C13785b.a(m.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Class<T> f20782a;

    /* renamed from: b, reason: collision with root package name */
    private List<Method> f20783b;

    private synchronized List<Method> b(Class<?> cls) {
        try {
            List<Method> list = this.f20783b;
            if (list != null) {
                return list;
            }
            this.f20783b = new ArrayList();
            while (cls != Object.class) {
                for (Method method : cls.getDeclaredMethods()) {
                    if (method.getName().startsWith("set")) {
                        this.f20783b.add(method);
                    }
                }
                cls = cls.getSuperclass();
            }
            return this.f20783b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private Method a(String str, Class<?> cls) throws SecurityException {
        StringBuilder sb2 = new StringBuilder("set");
        if (str == null) {
            str = null;
        } else if (str.length() != 0) {
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        sb2.append(str);
        String string = sb2.toString();
        for (Method method : b(this.f20782a)) {
            String name = method.getName();
            if (method.getParameterTypes().length == 1 && string.equals(name) && method.getParameterTypes()[0].isAssignableFrom(cls)) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    public final void d(T t10, String str, Object obj) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            return;
        }
        c(t10, str, obj);
    }

    public m(Class<T> cls) {
        this.f20782a = cls;
        Pb.b.a(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[PHI: r3
      0x0017: PHI (r3v5 java.lang.Class<?>) = 
      (r3v0 java.lang.Class<?>)
      (r3v1 java.lang.Class<?>)
      (r3v2 java.lang.Class<?>)
      (r3v3 java.lang.Class<?>)
      (r3v4 java.lang.Class<?>)
     binds: [B:7:0x0015, B:12:0x0020, B:17:0x002a, B:22:0x0034, B:27:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(T r5, java.lang.String r6, java.lang.Object r7) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r4 = this;
            java.lang.Class r0 = r7.getClass()
            java.lang.reflect.Method r0 = r4.a(r6, r0)
            if (r0 != 0) goto L48
            java.lang.Class r1 = r7.getClass()
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r1 != r3) goto L15
            goto L42
        L15:
            if (r1 != r2) goto L19
        L17:
            r2 = r3
            goto L42
        L19:
            java.lang.Class r2 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            if (r1 != r3) goto L20
            goto L42
        L20:
            if (r1 != r2) goto L23
            goto L17
        L23:
            java.lang.Class r2 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r1 != r3) goto L2a
            goto L42
        L2a:
            if (r1 != r2) goto L2d
            goto L17
        L2d:
            java.lang.Class r2 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            if (r1 != r3) goto L34
            goto L42
        L34:
            if (r1 != r2) goto L37
            goto L17
        L37:
            java.lang.Class r2 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            if (r1 != r3) goto L3e
            goto L42
        L3e:
            if (r1 != r2) goto L41
            goto L17
        L41:
            r2 = 0
        L42:
            if (r2 == 0) goto L48
            java.lang.reflect.Method r0 = r4.a(r6, r2)
        L48:
            if (r0 == 0) goto L52
            java.lang.Object[] r6 = new java.lang.Object[]{r7}     // Catch: java.lang.Exception -> L51
            r0.invoke(r5, r6)     // Catch: java.lang.Exception -> L51
        L51:
            return
        L52:
            java.lang.Class<T> r5 = r4.f20782a
            r5.getName()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Nb.m.c(java.lang.Object, java.lang.String, java.lang.Object):void");
    }
}
