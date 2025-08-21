package com.launchdarkly.sdk.json;

import com.google.gson.stream.JsonWriter;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes8.dex */
abstract class b extends JsonWriter {
    protected abstract void a() throws IOException;

    protected abstract void b() throws IOException;

    protected abstract void c() throws IOException;

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    protected abstract void d() throws IOException;

    protected abstract void g(String str) throws IOException;

    protected abstract void i(String str) throws IOException;

    protected abstract void j(boolean z10) throws IOException;

    protected abstract void l(double d10) throws IOException;

    protected abstract void m(long j10) throws IOException;

    protected abstract void p() throws IOException;

    protected abstract void u(String str) throws IOException;

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z10) throws IOException {
        j(z10);
        return this;
    }

    private static final Writer h() {
        return new CharArrayWriter(0);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            p();
            return this;
        }
        j(bool.booleanValue());
        return this;
    }

    b() {
        super(h());
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
        a();
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        b();
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
        c();
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        d();
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String str) throws IOException {
        g(str);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) throws IOException {
        i(str);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
        p();
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d10) throws IOException {
        long j10 = (long) d10;
        if (d10 == j10) {
            m(j10);
            return this;
        }
        l(d10);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j10) throws IOException {
        m(j10);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            p();
            return this;
        }
        value(number.doubleValue());
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) throws IOException {
        u(str);
        return this;
    }
}
