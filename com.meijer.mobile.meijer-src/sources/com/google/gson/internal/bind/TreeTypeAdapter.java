package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.internal.H;
import com.google.gson.internal.w;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes8.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    private final p<T> f90408a;

    /* renamed from: b, reason: collision with root package name */
    private final j<T> f90409b;

    /* renamed from: c, reason: collision with root package name */
    final Gson f90410c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.gson.reflect.a<T> f90411d;

    /* renamed from: e, reason: collision with root package name */
    private final v f90412e;

    /* renamed from: f, reason: collision with root package name */
    private final TreeTypeAdapter<T>.b f90413f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f90414g;

    /* renamed from: h, reason: collision with root package name */
    private volatile TypeAdapter<T> f90415h;

    private static final class SingleTypeFactory implements v {

        /* renamed from: a, reason: collision with root package name */
        private final com.google.gson.reflect.a<?> f90416a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f90417b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<?> f90418c;

        /* renamed from: d, reason: collision with root package name */
        private final p<?> f90419d;

        /* renamed from: e, reason: collision with root package name */
        private final j<?> f90420e;

        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            com.google.gson.reflect.a<?> aVar2 = this.f90416a;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f90417b && this.f90416a.getType() == aVar.getRawType()) : this.f90418c.isAssignableFrom(aVar.getRawType())) {
                return new TreeTypeAdapter(this.f90419d, this.f90420e, gson, aVar, this);
            }
            return null;
        }

        SingleTypeFactory(Object obj, com.google.gson.reflect.a<?> aVar, boolean z10, Class<?> cls) {
            p<?> pVar;
            boolean z11;
            if (obj instanceof p) {
                pVar = (p) obj;
            } else {
                pVar = null;
            }
            this.f90419d = pVar;
            j<?> jVar = obj instanceof j ? (j) obj : null;
            this.f90420e = jVar;
            if (pVar == null && jVar == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            w.a(z11);
            this.f90416a = aVar;
            this.f90417b = z10;
            this.f90418c = cls;
        }
    }

    private final class b implements o, i {
        private b() {
        }

        @Override // com.google.gson.i
        public <R> R a(k kVar, Type type) throws JsonParseException {
            return (R) TreeTypeAdapter.this.f90410c.i(kVar, type);
        }

        @Override // com.google.gson.o
        public k b(Object obj) {
            return TreeTypeAdapter.this.f90410c.E(obj);
        }
    }

    public TreeTypeAdapter(p<T> pVar, j<T> jVar, Gson gson, com.google.gson.reflect.a<T> aVar, v vVar, boolean z10) {
        this.f90413f = new b();
        this.f90408a = pVar;
        this.f90409b = jVar;
        this.f90410c = gson;
        this.f90411d = aVar;
        this.f90412e = vVar;
        this.f90414g = z10;
    }

    private TypeAdapter<T> b() {
        TypeAdapter<T> typeAdapter = this.f90415h;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> typeAdapterS = this.f90410c.s(this.f90412e, this.f90411d);
        this.f90415h = typeAdapterS;
        return typeAdapterS;
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public TypeAdapter<T> a() {
        return this.f90408a != null ? this : b();
    }

    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) throws JsonParseException, IOException {
        if (this.f90409b == null) {
            return b().read(jsonReader);
        }
        k kVarA = H.a(jsonReader);
        if (this.f90414g && kVarA.l()) {
            return null;
        }
        return this.f90409b.deserialize(kVarA, this.f90411d.getType(), this.f90413f);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t10) throws IOException {
        p<T> pVar = this.f90408a;
        if (pVar == null) {
            b().write(jsonWriter, t10);
        } else if (this.f90414g && t10 == null) {
            jsonWriter.nullValue();
        } else {
            H.b(pVar.a(t10, this.f90411d.getType(), this.f90413f), jsonWriter);
        }
    }

    public static v c(com.google.gson.reflect.a<?> aVar, Object obj) {
        boolean z10;
        if (aVar.getType() == aVar.getRawType()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new SingleTypeFactory(obj, aVar, z10, null);
    }

    public TreeTypeAdapter(p<T> pVar, j<T> jVar, Gson gson, com.google.gson.reflect.a<T> aVar, v vVar) {
        this(pVar, jVar, gson, aVar, vVar, true);
    }
}
