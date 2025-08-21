package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.D;
import com.google.gson.internal.H;
import com.google.gson.internal.x;
import com.google.gson.internal.z;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import com.google.maps.android.BuildConfig;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes8.dex */
public final class MapTypeAdapterFactory implements v {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.v f90368a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f90369b;

    private final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter<K> f90370a;

        /* renamed from: b, reason: collision with root package name */
        private final TypeAdapter<V> f90371b;

        /* renamed from: c, reason: collision with root package name */
        private final D<? extends Map<K, V>> f90372c;

        public Adapter(TypeAdapter<K> typeAdapter, TypeAdapter<V> typeAdapter2, D<? extends Map<K, V>> d10) {
            this.f90370a = typeAdapter;
            this.f90371b = typeAdapter2;
            this.f90372c = d10;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.f90369b) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.f90371b.write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                k jsonTree = this.f90370a.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z10 |= jsonTree.k() || jsonTree.m();
            }
            if (!z10) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i10 < size) {
                    jsonWriter.name(a((k) arrayList.get(i10)));
                    this.f90371b.write(jsonWriter, arrayList2.get(i10));
                    i10++;
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter.beginArray();
            int size2 = arrayList.size();
            while (i10 < size2) {
                jsonWriter.beginArray();
                H.b((k) arrayList.get(i10), jsonWriter);
                this.f90371b.write(jsonWriter, arrayList2.get(i10));
                jsonWriter.endArray();
                i10++;
            }
            jsonWriter.endArray();
        }

        private String a(k kVar) {
            if (kVar.n()) {
                n nVarF = kVar.f();
                if (nVarF.x()) {
                    return String.valueOf(nVarF.u());
                }
                if (nVarF.v()) {
                    return Boolean.toString(nVarF.q());
                }
                if (nVarF.y()) {
                    return nVarF.h();
                }
                throw new AssertionError();
            }
            if (kVar.l()) {
                return BuildConfig.TRAVIS;
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<K, V> read(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> mapA = this.f90372c.a();
            if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K k10 = this.f90370a.read(jsonReader);
                    if (mapA.put(k10, this.f90371b.read(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + k10);
                    }
                }
                jsonReader.endArray();
                return mapA;
            }
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                z.INSTANCE.promoteNameToValue(jsonReader);
                K k11 = this.f90370a.read(jsonReader);
                if (mapA.put(k11, this.f90371b.read(jsonReader)) != null) {
                    throw new JsonSyntaxException("duplicate key: " + k11);
                }
            }
            jsonReader.endObject();
            return mapA;
        }
    }

    private TypeAdapter<?> a(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f90454f : gson.q(com.google.gson.reflect.a.get(type));
    }

    public MapTypeAdapterFactory(com.google.gson.internal.v vVar, boolean z10) {
        this.f90368a = vVar;
        this.f90369b = z10;
    }

    @Override // com.google.gson.v
    public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] typeArrJ = x.j(type, rawType);
        Type type2 = typeArrJ[0];
        Type type3 = typeArrJ[1];
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(gson, a(gson, type2), type2), new TypeAdapterRuntimeTypeWrapper(gson, gson.q(com.google.gson.reflect.a.get(type3)), type3), this.f90368a.w(aVar, false));
    }
}
