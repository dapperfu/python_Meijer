package Cd;

import Ld.InterfaceC4014d;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Cd.c0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3046c0 extends AbstractC15707a implements InterfaceC4014d {
    public static final Parcelable.Creator<C3046c0> CREATOR = new C3048d0();

    /* renamed from: a, reason: collision with root package name */
    private final String f4236a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4237b;

    /* renamed from: c, reason: collision with root package name */
    private final short f4238c;

    /* renamed from: d, reason: collision with root package name */
    private final double f4239d;

    /* renamed from: e, reason: collision with root package name */
    private final double f4240e;

    /* renamed from: f, reason: collision with root package name */
    private final float f4241f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4242g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4243h;

    /* renamed from: i, reason: collision with root package name */
    private final int f4244i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3046c0) {
            C3046c0 c3046c0 = (C3046c0) obj;
            if (this.f4241f == c3046c0.f4241f && this.f4239d == c3046c0.f4239d && this.f4240e == c3046c0.f4240e && this.f4238c == c3046c0.f4238c && this.f4242g == c3046c0.f4242g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f4239d);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f4240e);
        return ((((((((((int) j10) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f4241f)) * 31) + this.f4238c) * 31) + this.f4242g;
    }

    public final String toString() {
        short s10 = this.f4238c;
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s10 != -1 ? s10 != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.f4236a.replaceAll("\\p{C}", "?"), Integer.valueOf(this.f4242g), Double.valueOf(this.f4239d), Double.valueOf(this.f4240e), Float.valueOf(this.f4241f), Integer.valueOf(this.f4243h / 1000), Integer.valueOf(this.f4244i), Long.valueOf(this.f4237b));
    }

    @Override // Ld.InterfaceC4014d
    public final String w() {
        return this.f4236a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f4236a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.s(parcel, 2, this.f4237b);
        C15708b.v(parcel, 3, this.f4238c);
        C15708b.i(parcel, 4, this.f4239d);
        C15708b.i(parcel, 5, this.f4240e);
        C15708b.k(parcel, 6, this.f4241f);
        C15708b.n(parcel, 7, this.f4242g);
        C15708b.n(parcel, 8, this.f4243h);
        C15708b.n(parcel, 9, this.f4244i);
        C15708b.b(parcel, iA);
    }

    public C3046c0(String str, int i10, short s10, double d10, double d11, float f10, long j10, int i11, int i12) {
        if (str != null && str.length() <= 100) {
            if (f10 > 0.0f) {
                if (d10 <= 90.0d && d10 >= -90.0d) {
                    if (d11 <= 180.0d && d11 >= -180.0d) {
                        int i13 = i10 & 7;
                        if (i13 != 0) {
                            this.f4238c = s10;
                            this.f4236a = str;
                            this.f4239d = d10;
                            this.f4240e = d11;
                            this.f4241f = f10;
                            this.f4237b = j10;
                            this.f4242g = i13;
                            this.f4243h = i11;
                            this.f4244i = i12;
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
