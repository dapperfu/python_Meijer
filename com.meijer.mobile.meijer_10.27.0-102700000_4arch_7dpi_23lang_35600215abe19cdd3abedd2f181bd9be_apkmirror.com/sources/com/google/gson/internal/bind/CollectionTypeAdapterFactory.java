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

/* loaded from: classes7.dex */
public final class CollectionTypeAdapterFactory implements v {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.v f89508a;

    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter<E> f89509a;

        /* renamed from: b, reason: collision with root package name */
        private final D<? extends Collection<E>> f89510b;

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
                this.f89509a.write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }

        public Adapter(TypeAdapter<E> typeAdapter, D<? extends Collection<E>> d10) {
            this.f89509a = typeAdapter;
            this.f89510b = d10;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<E> read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collectionA = this.f89510b.a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collectionA.add(this.f89509a.read(jsonReader));
            }
            jsonReader.endArray();
            return collectionA;
        }
    }

    public CollectionTypeAdapterFactory(com.google.gson.internal.v vVar) {
        this.f89508a = vVar;
    }

    @Override // com.google.gson.v
    public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        Type typeD = aVar.d();
        Class<? super T> clsC = aVar.c();
        if (!Collection.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type typeH = x.h(typeD, clsC);
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(gson, gson.q(com.google.gson.reflect.a.b(typeH)), typeH), this.f89508a.w(aVar, false));
    }
}
