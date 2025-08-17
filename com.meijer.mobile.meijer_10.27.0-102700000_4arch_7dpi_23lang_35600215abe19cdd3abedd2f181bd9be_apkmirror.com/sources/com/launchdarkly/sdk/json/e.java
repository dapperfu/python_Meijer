package com.launchdarkly.sdk.json;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* loaded from: classes7.dex */
class e extends a {

    /* renamed from: b, reason: collision with root package name */
    private final JsonReader f91345b;

    @Override // com.launchdarkly.sdk.json.a
    protected int b() throws IOException {
        return this.f91345b.peek().ordinal();
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        this.f91345b.beginArray();
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        this.f91345b.beginObject();
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        this.f91345b.endArray();
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        this.f91345b.endObject();
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        return this.f91345b.hasNext();
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        return this.f91345b.nextBoolean();
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        return this.f91345b.nextDouble();
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        return this.f91345b.nextInt();
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        return this.f91345b.nextLong();
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        return this.f91345b.nextName();
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        this.f91345b.nextNull();
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        return this.f91345b.nextString();
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        this.f91345b.skipValue();
    }

    e(JsonReader jsonReader) {
        this.f91345b = jsonReader;
    }
}
