package com.bugsnag.android;

import java.util.Map;

/* renamed from: com.bugsnag.android.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6462c0 implements Map.Entry<String, String> {

    /* renamed from: a, reason: collision with root package name */
    private final String f63407a;

    /* renamed from: b, reason: collision with root package name */
    private final String f63408b;

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
        return this.f63407a;
    }

    @Override // java.util.Map.Entry
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String getValue() {
        return this.f63408b;
    }

    @Override // java.util.Map.Entry
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String setValue(String str) {
        throw new UnsupportedOperationException("FeatureFlag is immutable");
    }

    public String toString() {
        return "FeatureFlag{name='" + this.f63407a + "', variant='" + this.f63408b + "'}";
    }

    public C6462c0(String str, String str2) {
        if (str != null) {
            this.f63407a = str;
            this.f63408b = str2;
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
