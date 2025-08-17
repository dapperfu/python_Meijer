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
import mg.InterfaceC15615a;
import mg.InterfaceC15618d;
import mg.InterfaceC15619e;
import og.C16058a;

/* loaded from: classes7.dex */
public final class Excluder implements com.google.gson.v, Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final Excluder f89477g = new Excluder();

    /* renamed from: a, reason: collision with root package name */
    private double f89478a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    private int f89479b = 136;

    /* renamed from: c, reason: collision with root package name */
    private boolean f89480c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f89481d;

    /* renamed from: e, reason: collision with root package name */
    private List<com.google.gson.a> f89482e;

    /* renamed from: f, reason: collision with root package name */
    private List<com.google.gson.a> f89483f;

    private boolean e(InterfaceC15618d interfaceC15618d) {
        if (interfaceC15618d != null) {
            return this.f89478a >= interfaceC15618d.value();
        }
        return true;
    }

    private boolean f(InterfaceC15619e interfaceC15619e) {
        if (interfaceC15619e != null) {
            return this.f89478a < interfaceC15619e.value();
        }
        return true;
    }

    public boolean b(Class<?> cls, boolean z10) {
        if (this.f89478a != -1.0d && !g((InterfaceC15618d) cls.getAnnotation(InterfaceC15618d.class), (InterfaceC15619e) cls.getAnnotation(InterfaceC15619e.class))) {
            return true;
        }
        if (!this.f89480c && d(cls)) {
            return true;
        }
        if (!z10 && !Enum.class.isAssignableFrom(cls) && C16058a.l(cls)) {
            return true;
        }
        Iterator<com.google.gson.a> it = (z10 ? this.f89482e : this.f89483f).iterator();
        while (it.hasNext()) {
            if (it.next().b(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean c(Field field, boolean z10) {
        InterfaceC15615a interfaceC15615a;
        if ((this.f89479b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f89478a != -1.0d && !g((InterfaceC15618d) field.getAnnotation(InterfaceC15618d.class), (InterfaceC15619e) field.getAnnotation(InterfaceC15619e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f89481d && ((interfaceC15615a = (InterfaceC15615a) field.getAnnotation(InterfaceC15615a.class)) == null || (!z10 ? interfaceC15615a.deserialize() : interfaceC15615a.serialize()))) || b(field.getType(), z10)) {
            return true;
        }
        List<com.google.gson.a> list = z10 ? this.f89482e : this.f89483f;
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
        this.f89482e = list;
        this.f89483f = list;
    }

    private static boolean d(Class<?> cls) {
        if (cls.isMemberClass() && !C16058a.n(cls)) {
            return true;
        }
        return false;
    }

    private boolean g(InterfaceC15618d interfaceC15618d, InterfaceC15619e interfaceC15619e) {
        if (e(interfaceC15618d) && f(interfaceC15619e)) {
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
        Class<? super T> clsC = aVar.c();
        final boolean zB = b(clsC, true);
        final boolean zB2 = b(clsC, false);
        if (!zB && !zB2) {
            return null;
        }
        return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1

            /* renamed from: a, reason: collision with root package name */
            private volatile TypeAdapter<T> f89484a;

            private TypeAdapter<T> a() {
                TypeAdapter<T> typeAdapter = this.f89484a;
                if (typeAdapter != null) {
                    return typeAdapter;
                }
                TypeAdapter<T> typeAdapterS = gson.s(Excluder.this, aVar);
                this.f89484a = typeAdapterS;
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
