package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f89496a = c();

    class a extends J {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f89497b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f89498c;

        a(Method method, Object obj) {
            this.f89497b = method;
            this.f89498c = obj;
        }

        @Override // com.google.gson.internal.J
        public <T> T d(Class<T> cls) throws Exception {
            J.b(cls);
            return (T) this.f89497b.invoke(this.f89498c, cls);
        }
    }

    class b extends J {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f89499b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f89500c;

        b(Method method, int i10) {
            this.f89499b = method;
            this.f89500c = i10;
        }

        @Override // com.google.gson.internal.J
        public <T> T d(Class<T> cls) throws Exception {
            J.b(cls);
            return (T) this.f89499b.invoke(null, cls, Integer.valueOf(this.f89500c));
        }
    }

    class c extends J {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Method f89501b;

        c(Method method) {
            this.f89501b = method;
        }

        @Override // com.google.gson.internal.J
        public <T> T d(Class<T> cls) throws Exception {
            J.b(cls);
            return (T) this.f89501b.invoke(null, cls, Object.class);
        }
    }

    class d extends J {
        @Override // com.google.gson.internal.J
        public <T> T d(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }

        d() {
        }
    }

    public abstract <T> T d(Class<T> cls) throws Exception;

    private static J c() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                return new c(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            return new b(declaredMethod3, iIntValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class<?> cls) {
        String strV = v.v(cls);
        if (strV == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + strV);
    }
}
