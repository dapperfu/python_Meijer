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

/* loaded from: classes7.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    private final p<T> f89566a;

    /* renamed from: b, reason: collision with root package name */
    private final j<T> f89567b;

    /* renamed from: c, reason: collision with root package name */
    final Gson f89568c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.gson.reflect.a<T> f89569d;

    /* renamed from: e, reason: collision with root package name */
    private final v f89570e;

    /* renamed from: f, reason: collision with root package name */
    private final TreeTypeAdapter<T>.b f89571f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f89572g;

    /* renamed from: h, reason: collision with root package name */
    private volatile TypeAdapter<T> f89573h;

    private static final class SingleTypeFactory implements v {

        /* renamed from: a, reason: collision with root package name */
        private final com.google.gson.reflect.a<?> f89574a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f89575b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<?> f89576c;

        /* renamed from: d, reason: collision with root package name */
        private final p<?> f89577d;

        /* renamed from: e, reason: collision with root package name */
        private final j<?> f89578e;

        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            com.google.gson.reflect.a<?> aVar2 = this.f89574a;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f89575b && this.f89574a.d() == aVar.c()) : this.f89576c.isAssignableFrom(aVar.c())) {
                return new TreeTypeAdapter(this.f89577d, this.f89578e, gson, aVar, this);
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
            this.f89577d = pVar;
            j<?> jVar = obj instanceof j ? (j) obj : null;
            this.f89578e = jVar;
            if (pVar == null && jVar == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            w.a(z11);
            this.f89574a = aVar;
            this.f89575b = z10;
            this.f89576c = cls;
        }
    }

    private final class b implements o, i {
        private b() {
        }

        @Override // com.google.gson.i
        public <R> R a(k kVar, Type type) throws JsonParseException {
            return (R) TreeTypeAdapter.this.f89568c.i(kVar, type);
        }

        @Override // com.google.gson.o
        public k b(Object obj) {
            return TreeTypeAdapter.this.f89568c.E(obj);
        }
    }

    public TreeTypeAdapter(p<T> pVar, j<T> jVar, Gson gson, com.google.gson.reflect.a<T> aVar, v vVar, boolean z10) {
        this.f89571f = new b();
        this.f89566a = pVar;
        this.f89567b = jVar;
        this.f89568c = gson;
        this.f89569d = aVar;
        this.f89570e = vVar;
        this.f89572g = z10;
    }

    private TypeAdapter<T> b() {
        TypeAdapter<T> typeAdapter = this.f89573h;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> typeAdapterS = this.f89568c.s(this.f89570e, this.f89569d);
        this.f89573h = typeAdapterS;
        return typeAdapterS;
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public TypeAdapter<T> a() {
        return this.f89566a != null ? this : b();
    }

    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) throws JsonParseException, IOException {
        if (this.f89567b == null) {
            return b().read(jsonReader);
        }
        k kVarA = H.a(jsonReader);
        if (this.f89572g && kVarA.l()) {
            return null;
        }
        return this.f89567b.deserialize(kVarA, this.f89569d.d(), this.f89571f);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t10) throws IOException {
        p<T> pVar = this.f89566a;
        if (pVar == null) {
            b().write(jsonWriter, t10);
        } else if (this.f89572g && t10 == null) {
            jsonWriter.nullValue();
        } else {
            H.b(pVar.a(t10, this.f89569d.d(), this.f89571f), jsonWriter);
        }
    }

    public static v c(com.google.gson.reflect.a<?> aVar, Object obj) {
        boolean z10;
        if (aVar.d() == aVar.c()) {
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
