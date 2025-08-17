package com.launchdarkly.sdk;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import mg.InterfaceC15616b;

@InterfaceC15616b(LDValueTypeAdapter.class)
/* loaded from: classes7.dex */
final class LDValueNumber extends LDValue {
    private static final LDValueNumber ZERO = new LDValueNumber(0.0d);
    private final double value;

    static LDValueNumber C(double d10) {
        return d10 == 0.0d ? ZERO : new LDValueNumber(d10);
    }

    public boolean D() {
        return LDValue.j(this.value);
    }

    @Override // com.launchdarkly.sdk.LDValue
    public double d() {
        return this.value;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public float e() {
        return (float) this.value;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public i h() {
        return i.NUMBER;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public int i() {
        return (int) this.value;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public long n() {
        return (long) this.value;
    }

    private LDValueNumber(double d10) {
        this.value = d10;
    }

    @Override // com.launchdarkly.sdk.LDValue
    void B(JsonWriter jsonWriter) throws IOException {
        if (D()) {
            jsonWriter.value(i());
        } else {
            jsonWriter.value(this.value);
        }
    }

    @Override // com.launchdarkly.sdk.LDValue
    public String y() {
        if (D()) {
            return String.valueOf(i());
        }
        return String.valueOf(this.value);
    }
}
