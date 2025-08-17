package a3;

import d3.C13466a;
import d3.P;

/* renamed from: a3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5560A {

    /* renamed from: d, reason: collision with root package name */
    public static final C5560A f43549d = new C5560A(1.0f);

    /* renamed from: e, reason: collision with root package name */
    private static final String f43550e = P.y0(0);

    /* renamed from: f, reason: collision with root package name */
    private static final String f43551f = P.y0(1);

    /* renamed from: a, reason: collision with root package name */
    public final float f43552a;

    /* renamed from: b, reason: collision with root package name */
    public final float f43553b;

    /* renamed from: c, reason: collision with root package name */
    private final int f43554c;

    public C5560A(float f10) {
        this(f10, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5560A.class == obj.getClass()) {
            C5560A c5560a = (C5560A) obj;
            if (this.f43552a == c5560a.f43552a && this.f43553b == c5560a.f43553b) {
                return true;
            }
        }
        return false;
    }

    public C5560A(float f10, float f11) {
        C13466a.a(f10 > 0.0f);
        C13466a.a(f11 > 0.0f);
        this.f43552a = f10;
        this.f43553b = f11;
        this.f43554c = Math.round(f10 * 1000.0f);
    }

    public long a(long j10) {
        return j10 * this.f43554c;
    }

    public C5560A b(float f10) {
        return new C5560A(f10, this.f43553b);
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f43552a)) * 31) + Float.floatToRawIntBits(this.f43553b);
    }

    public String toString() {
        return P.F("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f43552a), Float.valueOf(this.f43553b));
    }
}
