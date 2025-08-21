package com.bugsnag.android;

import java.util.Map;

/* renamed from: com.bugsnag.android.m0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6607m0 implements Map.Entry<String, String> {

    /* renamed from: a, reason: collision with root package name */
    private final String f64308a;

    /* renamed from: b, reason: collision with root package name */
    private final String f64309b;

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return getKey().equals(entry.getKey()) && (getValue() != null ? getValue().equals(entry.getValue()) : entry.getValue() == null);
    }

    @Override // java.util.Map.Entry
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String getKey() {
        return this.f64308a;
    }

    public String b() {
        return this.f64308a;
    }

    @Override // java.util.Map.Entry
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String getValue() {
        return this.f64309b;
    }

    public String d() {
        return this.f64309b;
    }

    @Override // java.util.Map.Entry
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String setValue(String str) {
        throw new UnsupportedOperationException("FeatureFlag is immutable");
    }

    public String toString() {
        return "FeatureFlag{name='" + this.f64308a + "', variant='" + this.f64309b + "'}";
    }

    public C6607m0(String str, String str2) {
        if (str != null) {
            this.f64308a = str;
            this.f64309b = str2;
            return;
        }
        throw new NullPointerException("FeatureFlags cannot have null name");
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int iHashCode;
        int iHashCode2 = getKey().hashCode();
        if (getValue() == null) {
            iHashCode = 0;
        } else {
            iHashCode = getValue().hashCode();
        }
        return iHashCode2 ^ iHashCode;
    }
}
