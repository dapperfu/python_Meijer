package qg;

import com.google.gson.JsonIOException;
import com.google.gson.internal.I;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: qg.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C16666a {

    /* renamed from: a, reason: collision with root package name */
    private static final b f158455a;

    /* renamed from: qg.a$b */
    private static abstract class b {
        private b() {
        }

        public abstract Method a(Class<?> cls, Field field);

        abstract <T> Constructor<T> b(Class<T> cls);

        abstract String[] c(Class<?> cls);

        abstract boolean d(Class<?> cls);
    }

    /* renamed from: qg.a$c */
    private static class c extends b {
        private c() {
            super();
        }

        @Override // qg.C16666a.b
        boolean d(Class<?> cls) {
            return false;
        }

        @Override // qg.C16666a.b
        public Method a(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // qg.C16666a.b
        <T> Constructor<T> b(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // qg.C16666a.b
        String[] c(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }
    }

    /* renamed from: qg.a$d */
    private static class d extends b {

        /* renamed from: a, reason: collision with root package name */
        private final Method f158456a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f158457b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f158458c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f158459d;

        private d() throws NoSuchMethodException, ClassNotFoundException {
            super();
            this.f158456a = Class.class.getMethod("isRecord", null);
            this.f158457b = Class.class.getMethod("getRecordComponents", null);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.f158458c = cls.getMethod("getName", null);
            this.f158459d = cls.getMethod("getType", null);
        }

        @Override // qg.C16666a.b
        public <T> Constructor<T> b(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.f158457b.invoke(cls, null);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    clsArr[i10] = (Class) this.f158459d.invoke(objArr[i10], null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e10) {
                throw C16666a.d(e10);
            }
        }

        @Override // qg.C16666a.b
        String[] c(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.f158457b.invoke(cls, null);
                String[] strArr = new String[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    strArr[i10] = (String) this.f158458c.invoke(objArr[i10], null);
                }
                return strArr;
            } catch (ReflectiveOperationException e10) {
                throw C16666a.d(e10);
            }
        }

        @Override // qg.C16666a.b
        boolean d(Class<?> cls) {
            try {
                return ((Boolean) this.f158456a.invoke(cls, null)).booleanValue();
            } catch (ReflectiveOperationException e10) {
                throw C16666a.d(e10);
            }
        }

        @Override // qg.C16666a.b
        public Method a(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), null);
            } catch (ReflectiveOperationException e10) {
                throw C16666a.d(e10);
            }
        }
    }

    static {
        b cVar;
        try {
            cVar = new d();
        } catch (ReflectiveOperationException unused) {
            cVar = new c();
        }
        f158455a = cVar;
    }

    public static void o(AccessibleObject accessibleObject) throws JsonIOException, SecurityException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e10) {
            throw new JsonIOException("Failed making " + g(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + j(e10), e10);
        }
    }

    public static String p(Constructor<?> constructor) throws SecurityException {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e10) {
            return "Failed making constructor '" + c(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage() + j(e10);
        }
    }

    private static void b(AccessibleObject accessibleObject, StringBuilder sb2) {
        sb2.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i10].getSimpleName());
        }
        sb2.append(')');
    }

    public static String c(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        b(constructor, sb2);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RuntimeException d(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException e(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String f(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String g(AccessibleObject accessibleObject, boolean z10) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + f((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            b(method, sb2);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb2.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + c((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z10 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static Method h(Class<?> cls, Field field) {
        return f158455a.a(cls, field);
    }

    public static <T> Constructor<T> i(Class<T> cls) {
        return f158455a.b(cls);
    }

    public static String[] k(Class<?> cls) {
        return f158455a.c(cls);
    }

    public static boolean m(Class<?> cls) {
        return f158455a.d(cls);
    }

    private static String j(Exception exc) {
        String str;
        if (exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            String message = exc.getMessage();
            if (message != null && message.contains("to module com.google.gson")) {
                str = "reflection-inaccessible-to-module-gson";
            } else {
                str = "reflection-inaccessible";
            }
            return "\nSee " + I.a(str);
        }
        return "";
    }

    public static boolean l(Class<?> cls) {
        if (!n(cls)) {
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean n(Class<?> cls) {
        return Modifier.isStatic(cls.getModifiers());
    }
}
