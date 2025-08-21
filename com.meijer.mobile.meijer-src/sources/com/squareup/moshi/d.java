package com.squareup.moshi;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import gu.C14410c;
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

/* loaded from: classes12.dex */
final class d<T> extends h<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final h.e f127281d = new a();

    /* renamed from: a, reason: collision with root package name */
    private final c<T> f127282a;

    /* renamed from: b, reason: collision with root package name */
    private final b<?>[] f127283b;

    /* renamed from: c, reason: collision with root package name */
    private final k.b f127284c;

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
            if (C14410c.j(clsG)) {
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
            if (C14410c.i(clsG)) {
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
            boolean zJ = C14410c.j(clsG);
            for (Field field : clsG.getDeclaredFields()) {
                if (c(zJ, field.getModifiers()) && ((gVar = (g) field.getAnnotation(g.class)) == null || !gVar.ignore())) {
                    Type typeQ = C14410c.q(type, clsG, field.getGenericType());
                    Set<? extends Annotation> setK = C14410c.k(field);
                    String name = field.getName();
                    h<T> hVarF = tVar.f(typeQ, setK, name);
                    field.setAccessible(true);
                    String strM = C14410c.m(name, gVar);
                    b<?> bVar = new b<>(strM, field, hVarF);
                    b<?> bVarPut = map.put(strM, bVar);
                    if (bVarPut != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + bVarPut.f127286b + "\n    " + bVar.f127286b);
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
        final String f127285a;

        /* renamed from: b, reason: collision with root package name */
        final Field f127286b;

        /* renamed from: c, reason: collision with root package name */
        final h<T> f127287c;

        void a(k kVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
            this.f127286b.set(obj, this.f127287c.fromJson(kVar));
        }

        /* JADX WARN: Multi-variable type inference failed */
        void b(q qVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
            this.f127287c.toJson(qVar, (q) this.f127286b.get(obj));
        }

        b(String str, Field field, h<T> hVar) {
            this.f127285a = str;
            this.f127286b = field;
            this.f127287c = hVar;
        }
    }

    @Override // com.squareup.moshi.h
    public T fromJson(k kVar) throws IOException, IllegalArgumentException {
        try {
            T tB = this.f127282a.b();
            try {
                kVar.b();
                while (kVar.hasNext()) {
                    int iZ = kVar.z(this.f127284c);
                    if (iZ == -1) {
                        kVar.H();
                        kVar.skipValue();
                    } else {
                        this.f127283b[iZ].a(kVar, tB);
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
            throw C14410c.t(e11);
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f127282a + ")";
    }

    d(c<T> cVar, Map<String, b<?>> map) {
        this.f127282a = cVar;
        this.f127283b = (b[]) map.values().toArray(new b[map.size()]);
        this.f127284c = k.b.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.h
    public void toJson(q qVar, T t10) throws IOException, IllegalArgumentException {
        try {
            qVar.b();
            for (b<?> bVar : this.f127283b) {
                qVar.l(bVar.f127285a);
                bVar.b(qVar, t10);
            }
            qVar.g();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }
}
