package com.squareup.moshi;

import gu.C14410c;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
abstract class c<T> {

    class a extends c<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f127271a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f127272b;

        @Override // com.squareup.moshi.c
        public T b() throws IllegalAccessException, InstantiationException, InvocationTargetException {
            return (T) this.f127271a.newInstance(null);
        }

        a(Constructor constructor, Class cls) {
            this.f127271a = constructor;
            this.f127272b = cls;
        }

        public String toString() {
            return this.f127272b.getName();
        }
    }

    class b extends c<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f127273a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f127274b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Class f127275c;

        b(Method method, Object obj, Class cls) {
            this.f127273a = method;
            this.f127274b = obj;
            this.f127275c = cls;
        }

        @Override // com.squareup.moshi.c
        public T b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f127273a.invoke(this.f127274b, this.f127275c);
        }

        public String toString() {
            return this.f127275c.getName();
        }
    }

    /* renamed from: com.squareup.moshi.c$c, reason: collision with other inner class name */
    class C1991c extends c<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f127276a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f127277b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f127278c;

        C1991c(Method method, Class cls, int i10) {
            this.f127276a = method;
            this.f127277b = cls;
            this.f127278c = i10;
        }

        @Override // com.squareup.moshi.c
        public T b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f127276a.invoke(null, this.f127277b, Integer.valueOf(this.f127278c));
        }

        public String toString() {
            return this.f127277b.getName();
        }
    }

    class d extends c<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f127279a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f127280b;

        d(Method method, Class cls) {
            this.f127279a = method;
            this.f127280b = cls;
        }

        @Override // com.squareup.moshi.c
        public T b() throws IllegalAccessException, InvocationTargetException {
            return (T) this.f127279a.invoke(null, this.f127280b, Object.class);
        }

        public String toString() {
            return this.f127280b.getName();
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
                return new C1991c(declaredMethod2, cls, iIntValue);
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
            throw C14410c.t(e10);
        }
    }

    c() {
    }
}
