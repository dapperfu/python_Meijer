package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.x;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final v f89505c = new v() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            Type typeD = aVar.d();
            if (!(typeD instanceof GenericArrayType) && (!(typeD instanceof Class) || !((Class) typeD).isArray())) {
                return null;
            }
            Type typeG = x.g(typeD);
            return new ArrayTypeAdapter(gson, gson.q(com.google.gson.reflect.a.b(typeG)), x.k(typeG));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Class<E> f89506a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeAdapter<E> f89507b;

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f89507b.write(jsonWriter, Array.get(obj, i10));
        }
        jsonWriter.endArray();
    }

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f89507b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f89506a = cls;
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f89507b.read(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        if (this.f89506a.isPrimitive()) {
            Object objNewInstance = Array.newInstance((Class<?>) this.f89506a, size);
            for (int i10 = 0; i10 < size; i10++) {
                Array.set(objNewInstance, i10, arrayList.get(i10));
            }
            return objNewInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f89506a, size));
    }
}
