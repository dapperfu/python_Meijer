package Ad;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public final class g {
    public static Object a(Class cls, String str, f... fVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return b(cls, "isIsolated", null, false, fVarArr);
    }

    private static Object b(Class cls, String str, Object obj, boolean z10, f... fVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int length = fVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        Object obj2 = null;
        if (fVarArr.length <= 0) {
            return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
        }
        f fVar = fVarArr[0];
        obj2.getClass();
        throw null;
    }
}
