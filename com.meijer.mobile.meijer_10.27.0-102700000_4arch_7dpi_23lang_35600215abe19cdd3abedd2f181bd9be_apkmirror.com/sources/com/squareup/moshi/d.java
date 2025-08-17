package com.squareup.moshi;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes11.dex */
final class d<T> extends h<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final h.e f126329d = new a();

    /* renamed from: a, reason: collision with root package name */
    private final c<T> f126330a;

    /* renamed from: b, reason: collision with root package name */
    private final b<?>[] f126331b;

    /* renamed from: c, reason: collision with root package name */
    private final k.b f126332c;

    class a implements h.e {
        @Override // com.squareup.moshi.h.e
        public h<?> a(Type type, Set<? extends Annotation> set, t tVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalArgumentException {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> clsG = x.g(type);
            if (clsG.isInterface() || clsG.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (gu.c.j(clsG)) {
                d(type, List.class);
                d(type, Set.class);
                d(type, Map.class);
                d(type, Collection.class);
                String str = "Platform " + clsG;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            }
            if (clsG.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + clsG.getName());
            }
            if (clsG.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + clsG.getName());
            }
            if (clsG.getEnclosingClass() != null && !Modifier.isStatic(clsG.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + clsG.getName());
            }
            if (Modifier.isAbstract(clsG.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + clsG.getName());
            }
            if (gu.c.i(clsG)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsG.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            c cVarA = c.a(clsG);
            TreeMap treeMap = new TreeMap();
            while (type != Object.class) {
                b(tVar, type, treeMap);
                type = x.f(type);
            }
            return new d(cVarA, treeMap).nullSafe();
        }

        a() {
        }

        private void b(t tVar, Type type, Map<String, b<?>> map) throws SecurityException {
            g gVar;
            Class<?> clsG = x.g(type);
            boolean zJ = gu.c.j(clsG);
            for (Field field : clsG.getDeclaredFields()) {
                if (c(zJ, field.getModifiers()) && ((gVar = (g) field.getAnnotation(g.class)) == null || !gVar.ignore())) {
                    Type typeQ = gu.c.q(type, clsG, field.getGenericType());
                    Set<? extends Annotation> setK = gu.c.k(field);
                    String name = field.getName();
                    h<T> hVarF = tVar.f(typeQ, setK, name);
                    field.setAccessible(true);
                    String strM = gu.c.m(name, gVar);
                    b<?> bVar = new b<>(strM, field, hVarF);
                    b<?> bVarPut = map.put(strM, bVar);
                    if (bVarPut != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + bVarPut.f126334b + "\n    " + bVar.f126334b);
                    }
                }
            }
        }

        private boolean c(boolean z10, int i10) {
            if (Modifier.isStatic(i10) || Modifier.isTransient(i10)) {
                return false;
            }
            if (!Modifier.isPublic(i10) && !Modifier.isProtected(i10) && z10) {
                return false;
            }
            return true;
        }

        private void d(Type type, Class<?> cls) {
            Class<?> clsG = x.g(type);
            if (!cls.isAssignableFrom(clsG)) {
                return;
            }
            throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsG.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    static class b<T> {

        /* renamed from: a, reason: collision with root package name */
        final String f126333a;

        /* renamed from: b, reason: collision with root package name */
        final Field f126334b;

        /* renamed from: c, reason: collision with root package name */
        final h<T> f126335c;

        void a(k kVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
            this.f126334b.set(obj, this.f126335c.fromJson(kVar));
        }

        /* JADX WARN: Multi-variable type inference failed */
        void b(q qVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
            this.f126335c.toJson(qVar, (q) this.f126334b.get(obj));
        }

        b(String str, Field field, h<T> hVar) {
            this.f126333a = str;
            this.f126334b = field;
            this.f126335c = hVar;
        }
    }

    @Override // com.squareup.moshi.h
    public T fromJson(k kVar) throws IOException, IllegalArgumentException {
        try {
            T tB = this.f126330a.b();
            try {
                kVar.b();
                while (kVar.hasNext()) {
                    int iZ = kVar.z(this.f126332c);
                    if (iZ == -1) {
                        kVar.H();
                        kVar.skipValue();
                    } else {
                        this.f126331b[iZ].a(kVar, tB);
                    }
                }
                kVar.d();
                return tB;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw gu.c.t(e11);
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f126330a + ")";
    }

    d(c<T> cVar, Map<String, b<?>> map) {
        this.f126330a = cVar;
        this.f126331b = (b[]) map.values().toArray(new b[map.size()]);
        this.f126332c = k.b.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.h
    public void toJson(q qVar, T t10) throws IOException, IllegalArgumentException {
        try {
            qVar.b();
            for (b<?> bVar : this.f126331b) {
                qVar.l(bVar.f126333a);
                bVar.b(qVar, t10);
            }
            qVar.g();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }
}
