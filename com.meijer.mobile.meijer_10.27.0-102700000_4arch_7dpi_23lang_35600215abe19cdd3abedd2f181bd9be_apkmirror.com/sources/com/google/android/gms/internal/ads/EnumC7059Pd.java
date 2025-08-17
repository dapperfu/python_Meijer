package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC7059Pd implements Ku0 {
    VIDEO_ERROR_CODE_UNSPECIFIED(0),
    OPENGL_RENDERING_FAILED(1),
    CACHE_LOAD_FAILED(2),
    ANDROID_TARGET_API_TOO_LOW(3);


    /* renamed from: f, reason: collision with root package name */
    private static final Lu0<EnumC7059Pd> f69389f = new Lu0<EnumC7059Pd>() { // from class: com.google.android.gms.internal.ads.Pd.a
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f69391a;

    public static EnumC7059Pd a(int i10) {
        if (i10 == 0) {
            return VIDEO_ERROR_CODE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return OPENGL_RENDERING_FAILED;
        }
        if (i10 == 2) {
            return CACHE_LOAD_FAILED;
        }
        if (i10 != 3) {
            return null;
        }
        return ANDROID_TARGET_API_TOO_LOW;
    }

    public static Mu0 b() {
        return C7093Qd.f69601a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        return this.f69391a;
    }

    EnumC7059Pd(int i10) {
        this.f69391a = i10;
    }
}
