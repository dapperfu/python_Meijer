package com.google.gson.internal.bind;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class b extends JsonWriter {

    /* renamed from: d, reason: collision with root package name */
    private static final Writer f90497d = new a();

    /* renamed from: e, reason: collision with root package name */
    private static final n f90498e = new n("closed");

    /* renamed from: a, reason: collision with root package name */
    private final List<k> f90499a;

    /* renamed from: b, reason: collision with root package name */
    private String f90500b;

    /* renamed from: c, reason: collision with root package name */
    private k f90501c;

    class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }

        a() {
        }
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        c(new n(str));
        return this;
    }

    public b() {
        super(f90497d);
        this.f90499a = new ArrayList();
        this.f90501c = l.f90536a;
    }

    private k b() {
        return this.f90499a.get(r0.size() - 1);
    }

    private void c(k kVar) {
        if (this.f90500b != null) {
            if (!kVar.l() || getSerializeNulls()) {
                ((m) b()).o(this.f90500b, kVar);
            }
            this.f90500b = null;
            return;
        }
        if (this.f90499a.isEmpty()) {
            this.f90501c = kVar;
            return;
        }
        k kVarB = b();
        if (!(kVarB instanceof h)) {
            throw new IllegalStateException();
        }
        ((h) kVarB).o(kVar);
    }

    public k a() {
        if (this.f90499a.isEmpty()) {
            return this.f90501c;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f90499a);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
        h hVar = new h();
        c(hVar);
        this.f90499a.add(hVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        m mVar = new m();
        c(mVar);
        this.f90499a.add(mVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f90499a.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f90499a.add(f90498e);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
        if (this.f90499a.isEmpty() || this.f90500b != null) {
            throw new IllegalStateException();
        }
        if (!(b() instanceof h)) {
            throw new IllegalStateException();
        }
        this.f90499a.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        if (this.f90499a.isEmpty() || this.f90500b != null) {
            throw new IllegalStateException();
        }
        if (!(b() instanceof m)) {
            throw new IllegalStateException();
        }
        this.f90499a.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String str) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f90499a.isEmpty() || this.f90500b != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(b() instanceof m)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f90500b = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
        c(l.f90536a);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z10) throws IOException {
        c(new n(Boolean.valueOf(z10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        c(new n(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(float f10) throws IOException {
        if (!isLenient() && (Float.isNaN(f10) || Float.isInfinite(f10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f10);
        }
        c(new n(Float.valueOf(f10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d10) throws IOException {
        if (!isLenient() && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
        c(new n(Double.valueOf(d10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j10) throws IOException {
        c(new n(Long.valueOf(j10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        c(new n(number));
        return this;
    }
}
