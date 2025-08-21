package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import og.InterfaceC16125a;
import og.InterfaceC16128d;
import og.InterfaceC16129e;
import qg.C16666a;

/* loaded from: classes8.dex */
public final class Excluder implements com.google.gson.v, Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final Excluder f90319g = new Excluder();

    /* renamed from: a, reason: collision with root package name */
    private double f90320a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private int f90321b = 136;

    /* renamed from: c, reason: collision with root package name */
    private boolean f90322c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f90323d;

    /* renamed from: e, reason: collision with root package name */
    private List<com.google.gson.a> f90324e;

    /* renamed from: f, reason: collision with root package name */
    private List<com.google.gson.a> f90325f;

    private boolean e(InterfaceC16128d interfaceC16128d) {
        if (interfaceC16128d != null) {
            return this.f90320a >= interfaceC16128d.value();
        }
        return true;
    }

    private boolean f(InterfaceC16129e interfaceC16129e) {
        if (interfaceC16129e != null) {
            return this.f90320a < interfaceC16129e.value();
        }
        return true;
    }

    public boolean b(Class<?> cls, boolean z10) {
        if (this.f90320a != -1.0d && !g((InterfaceC16128d) cls.getAnnotation(InterfaceC16128d.class), (InterfaceC16129e) cls.getAnnotation(InterfaceC16129e.class))) {
            return true;
        }
        if (!this.f90322c && d(cls)) {
            return true;
        }
        if (!z10 && !Enum.class.isAssignableFrom(cls) && C16666a.l(cls)) {
            return true;
        }
        Iterator<com.google.gson.a> it = (z10 ? this.f90324e : this.f90325f).iterator();
        while (it.hasNext()) {
            if (it.next().b(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean c(Field field, boolean z10) {
        InterfaceC16125a interfaceC16125a;
        if ((this.f90321b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f90320a != -1.0d && !g((InterfaceC16128d) field.getAnnotation(InterfaceC16128d.class), (InterfaceC16129e) field.getAnnotation(InterfaceC16129e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f90323d && ((interfaceC16125a = (InterfaceC16125a) field.getAnnotation(InterfaceC16125a.class)) == null || (!z10 ? interfaceC16125a.deserialize() : interfaceC16125a.serialize()))) || b(field.getType(), z10)) {
            return true;
        }
        List<com.google.gson.a> list = z10 ? this.f90324e : this.f90325f;
        if (list.isEmpty()) {
            return false;
        }
        com.google.gson.b bVar = new com.google.gson.b(field);
        Iterator<com.google.gson.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a(bVar)) {
                return true;
            }
        }
        return false;
    }

    public Excluder() {
        List<com.google.gson.a> list = Collections.EMPTY_LIST;
        this.f90324e = list;
        this.f90325f = list;
    }

    private static boolean d(Class<?> cls) {
        if (cls.isMemberClass() && !C16666a.n(cls)) {
            return true;
        }
        return false;
    }

    private boolean g(InterfaceC16128d interfaceC16128d, InterfaceC16129e interfaceC16129e) {
        if (e(interfaceC16128d) && f(interfaceC16129e)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.gson.v
    public <T> TypeAdapter<T> create(final Gson gson, final com.google.gson.reflect.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        final boolean zB = b(rawType, true);
        final boolean zB2 = b(rawType, false);
        if (!zB && !zB2) {
            return null;
        }
        return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1

            /* renamed from: a, reason: collision with root package name */
            private volatile TypeAdapter<T> f90326a;

            private TypeAdapter<T> a() {
                TypeAdapter<T> typeAdapter = this.f90326a;
                if (typeAdapter != null) {
                    return typeAdapter;
                }
                TypeAdapter<T> typeAdapterS = gson.s(Excluder.this, aVar);
                this.f90326a = typeAdapterS;
                return typeAdapterS;
            }

            @Override // com.google.gson.TypeAdapter
            public T read(JsonReader jsonReader) throws IOException {
                if (!zB2) {
                    return a().read(jsonReader);
                }
                jsonReader.skipValue();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, T t10) throws IOException {
                if (zB) {
                    jsonWriter.nullValue();
                } else {
                    a().write(jsonWriter, t10);
                }
            }
        };
    }
}
