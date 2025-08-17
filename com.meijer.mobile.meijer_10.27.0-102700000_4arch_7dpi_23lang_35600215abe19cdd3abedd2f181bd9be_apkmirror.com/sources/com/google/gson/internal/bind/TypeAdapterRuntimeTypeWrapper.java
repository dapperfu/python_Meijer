package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes7.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Gson f89580a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter<T> f89581b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f89582c;

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
        return this.f89581b.read(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t10) throws IOException {
        TypeAdapter<T> typeAdapterQ = this.f89581b;
        Type typeA = a(this.f89582c, t10);
        if (typeA != this.f89582c) {
            typeAdapterQ = this.f89580a.q(com.google.gson.reflect.a.b(typeA));
            if ((typeAdapterQ instanceof ReflectiveTypeAdapterFactory.Adapter) && !b(this.f89581b)) {
                typeAdapterQ = this.f89581b;
            }
        }
        typeAdapterQ.write(jsonWriter, t10);
    }

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f89580a = gson;
        this.f89581b = typeAdapter;
        this.f89582c = type;
    }
}
