package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.j;
import com.google.gson.p;
import com.google.gson.v;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import mg.InterfaceC15616b;

/* loaded from: classes7.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements v {

    /* renamed from: c, reason: collision with root package name */
    private static final v f89520c;

    /* renamed from: d, reason: collision with root package name */
    private static final v f89521d;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.v f89522a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, v> f89523b = new ConcurrentHashMap();

    private static class DummyTypeAdapterFactory implements v {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            throw new AssertionError("Factory should not be used");
        }
    }

    private static Object a(com.google.gson.internal.v vVar, Class<?> cls) {
        return vVar.w(com.google.gson.reflect.a.a(cls), true).a();
    }

    static {
        f89520c = new DummyTypeAdapterFactory();
        f89521d = new DummyTypeAdapterFactory();
    }

    private static InterfaceC15616b b(Class<?> cls) {
        return (InterfaceC15616b) cls.getAnnotation(InterfaceC15616b.class);
    }

    private v e(Class<?> cls, v vVar) {
        v vVarPutIfAbsent = this.f89523b.putIfAbsent(cls, vVar);
        return vVarPutIfAbsent != null ? vVarPutIfAbsent : vVar;
    }

    public JsonAdapterAnnotationTypeAdapterFactory(com.google.gson.internal.v vVar) {
        this.f89522a = vVar;
    }

    TypeAdapter<?> c(com.google.gson.internal.v vVar, Gson gson, com.google.gson.reflect.a<?> aVar, InterfaceC15616b interfaceC15616b, boolean z10) {
        p pVar;
        v vVar2;
        TypeAdapter<?> typeAdapterCreate;
        Object objA = a(vVar, interfaceC15616b.value());
        boolean zNullSafe = interfaceC15616b.nullSafe();
        if (objA instanceof TypeAdapter) {
            typeAdapterCreate = (TypeAdapter) objA;
        } else if (objA instanceof v) {
            v vVarE = (v) objA;
            if (z10) {
                vVarE = e(aVar.c(), vVarE);
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
                vVar2 = f89520c;
            } else {
                vVar2 = f89521d;
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
        InterfaceC15616b interfaceC15616bB = b(aVar.c());
        if (interfaceC15616bB == null) {
            return null;
        }
        return (TypeAdapter<T>) c(this.f89522a, gson, aVar, interfaceC15616bB, true);
    }

    public boolean d(com.google.gson.reflect.a<?> aVar, v vVar) {
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(vVar);
        if (vVar == f89520c) {
            return true;
        }
        Class<? super Object> clsC = aVar.c();
        v vVar2 = this.f89523b.get(clsC);
        if (vVar2 != null) {
            if (vVar2 == vVar) {
                return true;
            }
            return false;
        }
        InterfaceC15616b interfaceC15616bB = b(clsC);
        if (interfaceC15616bB == null) {
            return false;
        }
        Class<?> clsValue = interfaceC15616bB.value();
        if (v.class.isAssignableFrom(clsValue) && e(clsC, (v) a(this.f89522a, clsValue)) == vVar) {
            return true;
        }
        return false;
    }
}
