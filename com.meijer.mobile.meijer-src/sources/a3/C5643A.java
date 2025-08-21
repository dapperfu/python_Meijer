package a3;

import d3.C13599a;
import d3.P;

/* renamed from: a3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5643A {

    /* renamed from: d, reason: collision with root package name */
    public static final C5643A f44367d = new C5643A(1.0f);

    /* renamed from: e, reason: collision with root package name */
    private static final String f44368e = P.y0(0);

    /* renamed from: f, reason: collision with root package name */
    private static final String f44369f = P.y0(1);

    /* renamed from: a, reason: collision with root package name */
    public final float f44370a;

    /* renamed from: b, reason: collision with root package name */
    public final float f44371b;

    /* renamed from: c, reason: collision with root package name */
    private final int f44372c;

    public C5643A(float f10) {
        this(f10, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5643A.class == obj.getClass()) {
            C5643A c5643a = (C5643A) obj;
            if (this.f44370a == c5643a.f44370a && this.f44371b == c5643a.f44371b) {
                return true;
            }
        }
        return false;
    }

    public C5643A(float f10, float f11) {
        C13599a.a(f10 > 0.0f);
        C13599a.a(f11 > 0.0f);
        this.f44370a = f10;
        this.f44371b = f11;
        this.f44372c = Math.round(f10 * 1000.0f);
    }

    public long a(long j10) {
        return j10 * this.f44372c;
    }

    public C5643A b(float f10) {
        return new C5643A(f10, this.f44371b);
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f44370a)) * 31) + Float.floatToRawIntBits(this.f44371b);
    }

    public String toString() {
        return P.F("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f44370a), Float.valueOf(this.f44371b));
    }
}
