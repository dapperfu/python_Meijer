package fsimpl;

import com.fullstory.instrumentation.CurrentPlatform;
import com.fullstory.jni.FSNative;
import com.fullstory.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes14.dex */
public class fT {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f132238a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f132239b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f132240c;

    static {
        Method declaredMethod;
        Method method;
        boolean z10 = CurrentPlatform.SDK_INT_FIXED >= 28;
        f132238a = z10;
        Method declaredMethod2 = null;
        if (z10) {
            try {
                declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
                declaredMethod = null;
            }
            try {
                declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            }
            Method method2 = declaredMethod2;
            declaredMethod2 = declaredMethod;
            method = method2;
        } else {
            method = null;
        }
        f132239b = declaredMethod2;
        f132240c = method;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th2) {
            if (Log.DISABLE_LOGGING) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    public static Object a(Field field, Object obj) {
        if (field == null) {
            return null;
        }
        try {
            return field.get(obj);
        } catch (Throwable th2) {
            Log.printStackTrace(th2);
            return null;
        }
    }

    public static Object a(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable th2) {
            Log.printStackTrace(th2);
            return null;
        }
    }

    public static Field a(int i10, int i11, Class cls, String str) {
        return !a(i10, i11) ? b(cls, str) : a(i11, cls, str);
    }

    public static Field a(int i10, Class cls, String str) {
        if (cls == null) {
            return null;
        }
        if (b(i10)) {
            return c(cls, str);
        }
        try {
            Field field = (Field) f132240c.invoke(cls, str);
            field.setAccessible(true);
            return field;
        } catch (Throwable th2) {
            if (!Log.DISABLE_LOGGING) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public static Field a(Class cls, String str) {
        return b(cls, str);
    }

    public static Method a(int i10, int i11, Class cls, String str, Class... clsArr) {
        return !a(i10, i11) ? b(cls, str, clsArr) : a(i11, cls, str, clsArr);
    }

    public static Method a(int i10, Class cls, String str, Class... clsArr) {
        if (cls == null) {
            return null;
        }
        if (b(i10)) {
            return c(cls, str, clsArr);
        }
        try {
            Method method = (Method) f132239b.invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Throwable th2) {
            if (!Log.DISABLE_LOGGING) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public static Method a(Class cls, String str, Class... clsArr) {
        return b(cls, str, clsArr);
    }

    public static boolean a() {
        if (f132238a) {
            return (f132239b == null || f132240c == null) ? false : true;
        }
        return true;
    }

    private static boolean a(int i10) {
        return i10 != -1 && CurrentPlatform.SDK_INT_FIXED >= i10;
    }

    private static boolean a(int i10, int i11) {
        return a(i10) || b(i11);
    }

    public static Field b(Class cls, String str) {
        if (cls == null) {
            return null;
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th2) {
            if (!Log.DISABLE_LOGGING) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public static Method b(Class cls, String str, Class... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable th2) {
            if (!Log.DISABLE_LOGGING) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public static boolean b() {
        return f132238a;
    }

    private static boolean b(int i10) {
        return i10 != -1 && CurrentPlatform.SDK_INT_FIXED >= i10 && CurrentPlatform.TARGET_SDK >= i10;
    }

    public static Field c(Class cls, String str) {
        if (cls == null) {
            return null;
        }
        try {
            Field fieldA = FSNative.a(cls, str);
            if (fieldA != null) {
                fieldA.setAccessible(true);
                return fieldA;
            }
        } catch (Throwable th2) {
            if (!Log.DISABLE_LOGGING) {
                th2.printStackTrace();
            }
        }
        return null;
    }

    public static Method c(Class cls, String str, Class... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            Method methodA = FSNative.a(cls, str, clsArr);
            if (methodA != null) {
                methodA.setAccessible(true);
                return methodA;
            }
        } catch (Throwable th2) {
            if (!Log.DISABLE_LOGGING) {
                th2.printStackTrace();
            }
        }
        return null;
    }
}
