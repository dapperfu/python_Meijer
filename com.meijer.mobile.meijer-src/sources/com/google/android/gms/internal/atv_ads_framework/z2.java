package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
public enum z2 implements M0 {
    SIGNAL_COLLECTION_ERROR_UNKNOWN(0),
    SIGNAL_COLLECTION_ERROR_RUNTIME_EXCEPTION(1),
    SIGNAL_COLLECTION_ERROR_NAME_NOT_FOUND(2),
    SIGNAL_COLLECTION_ERROR_BUILD_FINGERPRINT_PREFIX(3),
    SIGNAL_COLLECTION_ERROR_NULL_CONTENT_PROVIDER_DATA(4);


    /* renamed from: g, reason: collision with root package name */
    private static final N0 f81934g = new N0() { // from class: com.google.android.gms.internal.atv_ads_framework.x2
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f81936a;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f81936a);
    }

    public final int zza() {
        return this.f81936a;
    }

    z2(int i10) {
        this.f81936a = i10;
    }
}
