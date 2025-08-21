package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes8.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f90422a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f90423b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f90424c;

    private static Type a(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    private static boolean b(TypeAdapter<?> typeAdapter) {
        TypeAdapter<?> typeAdapterA;
        while ((typeAdapter instanceof SerializationDelegatingTypeAdapter) && (typeAdapterA = ((SerializationDelegatingTypeAdapter) typeAdapter).a()) != typeAdapter) {
            typeAdapter = typeAdapterA;
        }
        return typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) throws IOException {
        return this.f90423b.read(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t10) throws IOException {
        TypeAdapter<T> typeAdapterQ = this.f90423b;
        Type typeA = a(this.f90424c, t10);
        if (typeA != this.f90424c) {
            typeAdapterQ = this.f90422a.q(com.google.gson.reflect.a.get(typeA));
            if ((typeAdapterQ instanceof ReflectiveTypeAdapterFactory.Adapter) && !b(this.f90423b)) {
                typeAdapterQ = this.f90423b;
            }
        }
        typeAdapterQ.write(jsonWriter, t10);
    }

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f90422a = gson;
        this.f90423b = typeAdapter;
        this.f90424c = type;
    }
}
