package com.google.android.gms.internal.ads;

import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.ag, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7488ag {

    /* renamed from: d, reason: collision with root package name */
    public static final C7488ag f72460d = new C7488ag(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f72461a;

    /* renamed from: b, reason: collision with root package name */
    public final float f72462b;

    /* renamed from: c, reason: collision with root package name */
    private final int f72463c;

    public final long a(long j10) {
        return j10 * this.f72463c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7488ag.class == obj.getClass()) {
            C7488ag c7488ag = (C7488ag) obj;
            if (this.f72461a == c7488ag.f72461a && this.f72462b == c7488ag.f72462b) {
                return true;
            }
        }
        return false;
    }

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f72461a) + 527) * 31) + Float.floatToRawIntBits(this.f72462b);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f72461a), Float.valueOf(this.f72462b));
    }

    public C7488ag(float f10, float f11) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8086gC.d(z10);
        C8086gC.d(f11 > 0.0f);
        this.f72461a = f10;
        this.f72462b = f11;
        this.f72463c = Math.round(f10 * 1000.0f);
    }
}
