package com.launchdarkly.sdk.json;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes8.dex */
abstract class a extends JsonReader {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonToken[] f92181a = JsonToken.values();

    protected abstract int b() throws IOException;

    private static final Reader a() {
        return new CharArrayReader(new char[0]);
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        return f92181a[b()];
    }

    a() {
        super(a());
    }
}
