package com.squareup.moshi;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
abstract class c<T> {

    class a extends c<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f126319a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f126320b;

        @Override // com.squareup.moshi.c
        public T b() throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return (T) this.f126319a.newInstance(null);
        }

        a(Constructor constructor, Class cls) {
            this.f126319a = constructor;
            this.f126320b = cls;
        }

        public String toString() {
            return this.f126320b.getName();
        }
    }

    class b extends c<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f126321a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f126322b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f126323c;

        b(Method method, Object obj, Class cls) {
            this.f126321a = method;
            this.f126322b = obj;
            this.f126323c = cls;
        }

        @Override // com.squareup.moshi.c
        public T b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f126321a.invoke(this.f126322b, this.f126323c);
        }

        public String toString() {
            return this.f126323c.getName();
        }
    }

    /* renamed from: com.squareup.moshi.c$c, reason: collision with other inner class name */
    class C1982c extends c<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f126324a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f126325b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f126326c;

        C1982c(Method method, Class cls, int i10) {
            this.f126324a = method;
            this.f126325b = cls;
            this.f126326c = i10;
        }

        @Override // com.squareup.moshi.c
        public T b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f126324a.invoke(null, this.f126325b, Integer.valueOf(this.f126326c));
        }

        public String toString() {
            return this.f126325b.getName();
        }
    }

    class d extends c<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f126327a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f126328b;

        d(Method method, Class cls) {
            this.f126327a = method;
            this.f126328b = cls;
        }

        @Override // com.squareup.moshi.c
        public T b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f126327a.invoke(null, this.f126328b, Object.class);
        }

        public String toString() {
            return this.f126328b.getName();
        }
    }

    abstract T b() throws IllegalAccessException, InstantiationException, InvocationTargetException;

    public static <T> c<T> a(Class<?> cls) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalArgumentException {
        try {
            try {
                try {
                    try {
                        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        return new a(declaredConstructor, cls);
                    } catch (Exception unused) {
                        throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                    }
                } catch (NoSuchMethodException unused2) {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new C1982c(declaredMethod2, cls, iIntValue);
            } catch (IllegalAccessException unused4) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused5) {
            throw new AssertionError();
        } catch (NoSuchMethodException unused6) {
            Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new d(declaredMethod3, cls);
        } catch (InvocationTargetException e10) {
            throw gu.c.t(e10);
        }
    }

    c() {
    }
}
