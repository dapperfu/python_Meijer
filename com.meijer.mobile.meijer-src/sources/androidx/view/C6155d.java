package androidx.view;

import androidx.view.AbstractC6165l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6155d {

    /* renamed from: c, reason: collision with root package name */
    static C6155d f55466c = new C6155d();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, a> f55467a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f55468b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.d$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map<AbstractC6165l.a, List<b>> f55469a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<b, AbstractC6165l.a> f55470b;

        private static void b(List<b> list, InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(interfaceC6172s, aVar, obj);
                }
            }
        }

        void a(InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            b(this.f55469a.get(aVar), interfaceC6172s, aVar, obj);
            b(this.f55469a.get(AbstractC6165l.a.ON_ANY), interfaceC6172s, aVar, obj);
        }

        a(Map<b, AbstractC6165l.a> map) {
            this.f55470b = map;
            for (Map.Entry<b, AbstractC6165l.a> entry : map.entrySet()) {
                AbstractC6165l.a value = entry.getValue();
                List<b> arrayList = this.f55469a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f55469a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.d$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f55471a;

        /* renamed from: b, reason: collision with root package name */
        final Method f55472b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f55471a == bVar.f55471a && this.f55472b.getName().equals(bVar.f55472b.getName());
        }

        void a(InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                int i10 = this.f55471a;
                if (i10 == 0) {
                    this.f55472b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f55472b.invoke(obj, interfaceC6172s);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f55472b.invoke(obj, interfaceC6172s, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public int hashCode() {
            return (this.f55471a * 31) + this.f55472b.getName().hashCode();
        }

        b(int i10, Method method) throws SecurityException {
            this.f55471a = i10;
            this.f55472b = method;
            method.setAccessible(true);
        }
    }

    a c(Class<?> cls) {
        a aVar = this.f55467a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f55468b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((InterfaceC6132F) method.getAnnotation(InterfaceC6132F.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f55468b.put(cls, Boolean.FALSE);
        return false;
    }

    C6155d() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a aVarC;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f55470b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC6165l.a> entry : c(cls2).f55470b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            InterfaceC6132F interfaceC6132F = (InterfaceC6132F) method.getAnnotation(InterfaceC6132F.class);
            if (interfaceC6132F != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (InterfaceC6172s.class.isAssignableFrom(parameterTypes[0])) {
                        i10 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i10 = 0;
                }
                AbstractC6165l.a aVarValue = interfaceC6132F.value();
                if (parameterTypes.length > 1) {
                    if (AbstractC6165l.a.class.isAssignableFrom(parameterTypes[1])) {
                        if (aVarValue == AbstractC6165l.a.ON_ANY) {
                            i10 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(map, new b(i10, method), aVarValue, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(map);
        this.f55467a.put(cls, aVar);
        this.f55468b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<b, AbstractC6165l.a> map, b bVar, AbstractC6165l.a aVar, Class<?> cls) {
        AbstractC6165l.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            throw new IllegalArgumentException("Method " + bVar.f55472b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        }
        if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }
}
