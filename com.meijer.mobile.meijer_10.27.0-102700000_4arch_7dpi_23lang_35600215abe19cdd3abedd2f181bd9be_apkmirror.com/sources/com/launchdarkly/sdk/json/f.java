package com.launchdarkly.sdk.json;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes7.dex */
class f extends b {

    /* renamed from: a, reason: collision with root package name */
    private final JsonWriter f91346a;

    @Override // com.launchdarkly.sdk.json.b
    protected void a() throws IOException {
        this.f91346a.beginArray();
    }

    @Override // com.launchdarkly.sdk.json.b
    protected void b() throws IOException {
        this.f91346a.beginObject();
    }

    @Override // com.launchdarkly.sdk.json.b
    protected void c() throws IOException {
        this.f91346a.endArray();
    }

    @Override // com.launchdarkly.sdk.json.b
    protected void d() throws IOException {
        this.f91346a.endObject();
    }

    @Override // com.launchdarkly.sdk.json.b
    protected void g(String str) throws IOException {
        this.f91346a.jsonValue(str);
    }

    @Override // com.launchdarkly.sdk.json.b
    protected void i(String str) throws IOException {
        this.f91346a.name(str);
    }

    @Override // com.launchdarkly.sdk.json.b
    protected void j(boolean z10) throws IOException {
        this.f91346a.value(z10);
    }

    @Override // com.launchdarkly.sdk.json.b
    protected void l(double d10) throws IOException {
        this.f91346a.value(d10);
    }

    @Override // com.launchdarkly.sdk.json.b
    protected void m(long j10) throws IOException {
        this.f91346a.value(j10);
    }

    @Override // com.launchdarkly.sdk.json.b
    protected void p() throws IOException {
        this.f91346a.nullValue();
    }

    @Override // com.launchdarkly.sdk.json.b
    protected void u(String str) throws IOException {
        this.f91346a.value(str);
    }

    f(JsonWriter jsonWriter) {
        this.f91346a = jsonWriter;
    }
}
