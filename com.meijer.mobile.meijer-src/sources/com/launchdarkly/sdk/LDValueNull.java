package com.launchdarkly.sdk;

import com.google.gson.stream.JsonWriter;
import com.google.maps.android.BuildConfig;
import java.io.IOException;
import og.InterfaceC16126b;

@InterfaceC16126b(LDValueTypeAdapter.class)
/* loaded from: classes8.dex */
final class LDValueNull extends LDValue {
    static final LDValueNull INSTANCE = new LDValueNull();

    @Override // com.launchdarkly.sdk.LDValue
    public boolean k() {
        return true;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public i h() {
        return i.NULL;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public String y() {
        return BuildConfig.TRAVIS;
    }

    LDValueNull() {
    }

    @Override // com.launchdarkly.sdk.LDValue
    void B(JsonWriter jsonWriter) throws IOException {
        jsonWriter.nullValue();
    }
}
