package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.j;
import com.google.gson.p;
import com.google.gson.v;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import og.InterfaceC16126b;

/* loaded from: classes8.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements v {

    /* renamed from: c, reason: collision with root package name */
    private static final v f90362c;

    /* renamed from: d, reason: collision with root package name */
    private static final v f90363d;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.v f90364a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, v> f90365b = new ConcurrentHashMap();

    private static class DummyTypeAdapterFactory implements v {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            throw new AssertionError("Factory should not be used");
        }
    }

    private static Object a(com.google.gson.internal.v vVar, Class<?> cls) {
        return vVar.w(com.google.gson.reflect.a.get((Class) cls), true).a();
    }

    static {
        f90362c = new DummyTypeAdapterFactory();
        f90363d = new DummyTypeAdapterFactory();
    }

    private static InterfaceC16126b b(Class<?> cls) {
        return (InterfaceC16126b) cls.getAnnotation(InterfaceC16126b.class);
    }

    private v e(Class<?> cls, v vVar) {
        v vVarPutIfAbsent = this.f90365b.putIfAbsent(cls, vVar);
        return vVarPutIfAbsent != null ? vVarPutIfAbsent : vVar;
    }

    public JsonAdapterAnnotationTypeAdapterFactory(com.google.gson.internal.v vVar) {
        this.f90364a = vVar;
    }

    TypeAdapter<?> c(com.google.gson.internal.v vVar, Gson gson, com.google.gson.reflect.a<?> aVar, InterfaceC16126b interfaceC16126b, boolean z10) {
        p pVar;
        v vVar2;
        TypeAdapter<?> typeAdapterCreate;
        Object objA = a(vVar, interfaceC16126b.value());
        boolean zNullSafe = interfaceC16126b.nullSafe();
        if (objA instanceof TypeAdapter) {
            typeAdapterCreate = (TypeAdapter) objA;
        } else if (objA instanceof v) {
            v vVarE = (v) objA;
            if (z10) {
                vVarE = e(aVar.getRawType(), vVarE);
            }
            typeAdapterCreate = vVarE.create(gson, aVar);
        } else {
            boolean z11 = objA instanceof p;
            if (!z11 && !(objA instanceof j)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            j jVar = null;
            if (z11) {
                pVar = (p) objA;
            } else {
                pVar = null;
            }
            if (objA instanceof j) {
                jVar = (j) objA;
            }
            j jVar2 = jVar;
            if (z10) {
                vVar2 = f90362c;
            } else {
                vVar2 = f90363d;
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(pVar, jVar2, gson, aVar, vVar2, zNullSafe);
            zNullSafe = false;
            typeAdapterCreate = treeTypeAdapter;
        }
        if (typeAdapterCreate != null && zNullSafe) {
            return typeAdapterCreate.nullSafe();
        }
        return typeAdapterCreate;
    }

    @Override // com.google.gson.v
    public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        InterfaceC16126b interfaceC16126bB = b(aVar.getRawType());
        if (interfaceC16126bB == null) {
            return null;
        }
        return (TypeAdapter<T>) c(this.f90364a, gson, aVar, interfaceC16126bB, true);
    }

    public boolean d(com.google.gson.reflect.a<?> aVar, v vVar) {
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(vVar);
        if (vVar == f90362c) {
            return true;
        }
        Class<? super Object> rawType = aVar.getRawType();
        v vVar2 = this.f90365b.get(rawType);
        if (vVar2 != null) {
            if (vVar2 == vVar) {
                return true;
            }
            return false;
        }
        InterfaceC16126b interfaceC16126bB = b(rawType);
        if (interfaceC16126bB == null) {
            return false;
        }
        Class<?> clsValue = interfaceC16126bB.value();
        if (v.class.isAssignableFrom(clsValue) && e(rawType, (v) a(this.f90364a, clsValue)) == vVar) {
            return true;
        }
        return false;
    }
}
