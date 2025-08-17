package Ad;

import Jd.InterfaceC3770d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Ad.c0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2808c0 extends AbstractC15136a implements InterfaceC3770d {
    public static final Parcelable.Creator<C2808c0> CREATOR = new C2810d0();

    /* renamed from: a, reason: collision with root package name */
    private final String f240a;

    /* renamed from: b, reason: collision with root package name */
    private final long f241b;

    /* renamed from: c, reason: collision with root package name */
    private final short f242c;

    /* renamed from: d, reason: collision with root package name */
    private final double f243d;

    /* renamed from: e, reason: collision with root package name */
    private final double f244e;

    /* renamed from: f, reason: collision with root package name */
    private final float f245f;

    /* renamed from: g, reason: collision with root package name */
    private final int f246g;

    /* renamed from: h, reason: collision with root package name */
    private final int f247h;

    /* renamed from: i, reason: collision with root package name */
    private final int f248i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2808c0) {
            C2808c0 c2808c0 = (C2808c0) obj;
            if (this.f245f == c2808c0.f245f && this.f243d == c2808c0.f243d && this.f244e == c2808c0.f244e && this.f242c == c2808c0.f242c && this.f246g == c2808c0.f246g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f243d);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f244e);
        return ((((((((((int) j10) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f245f)) * 31) + this.f242c) * 31) + this.f246g;
    }

    public final String toString() {
        short s10 = this.f242c;
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s10 != -1 ? s10 != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.f240a.replaceAll("\\p{C}", "?"), Integer.valueOf(this.f246g), Double.valueOf(this.f243d), Double.valueOf(this.f244e), Float.valueOf(this.f245f), Integer.valueOf(this.f247h / 1000), Integer.valueOf(this.f248i), Long.valueOf(this.f241b));
    }

    @Override // Jd.InterfaceC3770d
    public final String w() {
        return this.f240a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f240a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.s(parcel, 2, this.f241b);
        C15137b.v(parcel, 3, this.f242c);
        C15137b.i(parcel, 4, this.f243d);
        C15137b.i(parcel, 5, this.f244e);
        C15137b.k(parcel, 6, this.f245f);
        C15137b.n(parcel, 7, this.f246g);
        C15137b.n(parcel, 8, this.f247h);
        C15137b.n(parcel, 9, this.f248i);
        C15137b.b(parcel, iA);
    }

    public C2808c0(String str, int i10, short s10, double d10, double d11, float f10, long j10, int i11, int i12) {
        if (str != null && str.length() <= 100) {
            if (f10 > 0.0f) {
                if (d10 <= 90.0d && d10 >= -90.0d) {
                    if (d11 <= 180.0d && d11 >= -180.0d) {
                        int i13 = i10 & 7;
                        if (i13 != 0) {
                            this.f242c = s10;
                            this.f240a = str;
                            this.f243d = d10;
                            this.f244e = d11;
                            this.f245f = f10;
                            this.f241b = j10;
                            this.f246g = i13;
                            this.f247h = i11;
                            this.f248i = i12;
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 35);
                        sb2.append("No supported transition specified: ");
                        sb2.append(i10);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder(String.valueOf(d11).length() + 19);
                    sb3.append("invalid longitude: ");
                    sb3.append(d11);
                    throw new IllegalArgumentException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(d10).length() + 18);
                sb4.append("invalid latitude: ");
                sb4.append(d10);
                throw new IllegalArgumentException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(f10).length() + 16);
            sb5.append("invalid radius: ");
            sb5.append(f10);
            throw new IllegalArgumentException(sb5.toString());
        }
        throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
    }
}
