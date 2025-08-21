package com.google.android.gms.internal.ads;

import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.ag, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7613ag {

    /* renamed from: d, reason: collision with root package name */
    public static final C7613ag f73300d = new C7613ag(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f73301a;

    /* renamed from: b, reason: collision with root package name */
    public final float f73302b;

    /* renamed from: c, reason: collision with root package name */
    private final int f73303c;

    public final long a(long j10) {
        return j10 * this.f73303c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7613ag.class == obj.getClass()) {
            C7613ag c7613ag = (C7613ag) obj;
            if (this.f73301a == c7613ag.f73301a && this.f73302b == c7613ag.f73302b) {
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
        return ((Float.floatToRawIntBits(this.f73301a) + 527) * 31) + Float.floatToRawIntBits(this.f73302b);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f73301a), Float.valueOf(this.f73302b));
    }

    public C7613ag(float f10, float f11) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8211gC.d(z10);
        C8211gC.d(f11 > 0.0f);
        this.f73301a = f10;
        this.f73302b = f11;
        this.f73303c = Math.round(f10 * 1000.0f);
    }
}
