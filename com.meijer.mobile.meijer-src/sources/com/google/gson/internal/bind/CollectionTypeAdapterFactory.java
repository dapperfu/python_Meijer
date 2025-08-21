package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.D;
import com.google.gson.internal.x;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class CollectionTypeAdapterFactory implements v {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.v f90350a;

    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter<E> f90351a;

        /* renamed from: b, reason: collision with root package name */
        private final D<? extends Collection<E>> f90352b;

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f90351a.write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }

        public Adapter(TypeAdapter<E> typeAdapter, D<? extends Collection<E>> d10) {
            this.f90351a = typeAdapter;
            this.f90352b = d10;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<E> read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collectionA = this.f90352b.a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collectionA.add(this.f90351a.read(jsonReader));
            }
            jsonReader.endArray();
            return collectionA;
        }
    }

    public CollectionTypeAdapterFactory(com.google.gson.internal.v vVar) {
        this.f90350a = vVar;
    }

    @Override // com.google.gson.v
    public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeH = x.h(type, rawType);
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(gson, gson.q(com.google.gson.reflect.a.get(typeH)), typeH), this.f90350a.w(aVar, false));
    }
}
