package fsimpl;

import java.lang.reflect.Method;

/* loaded from: classes15.dex */
class eW {
    static Method a(Class cls, String str, Class cls2, Class... clsArr) {
        return a(!fT.b() ? fT.b(cls, str, clsArr) : fT.a(-1, cls, str, clsArr), cls2);
    }

    static Method a(Class cls, String str, Class... clsArr) {
        return fT.b(cls, str, clsArr);
    }

    private static Method a(Method method, Class cls) {
        if (method == null || cls == null) {
            return method;
        }
        Class<?> returnType = method.getReturnType();
        if (returnType == null || returnType != cls) {
            return null;
        }
        return method;
    }
}
