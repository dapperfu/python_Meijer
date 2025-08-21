package Fd;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Fd.z8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3588z8 extends AbstractC15707a {
    public static final Parcelable.Creator<C3588z8> CREATOR = new W8();

    /* renamed from: a, reason: collision with root package name */
    public int f10401a;

    /* renamed from: b, reason: collision with root package name */
    public String f10402b;

    /* renamed from: c, reason: collision with root package name */
    public String f10403c;

    /* renamed from: d, reason: collision with root package name */
    public int f10404d;

    /* renamed from: e, reason: collision with root package name */
    public Point[] f10405e;

    /* renamed from: f, reason: collision with root package name */
    public S4 f10406f;

    /* renamed from: g, reason: collision with root package name */
    public C3542v6 f10407g;

    /* renamed from: h, reason: collision with root package name */
    public W6 f10408h;

    /* renamed from: i, reason: collision with root package name */
    public Y7 f10409i;

    /* renamed from: j, reason: collision with root package name */
    public C3565x7 f10410j;

    /* renamed from: k, reason: collision with root package name */
    public C3519t5 f10411k;

    /* renamed from: l, reason: collision with root package name */
    public C3474p3 f10412l;

    /* renamed from: m, reason: collision with root package name */
    public Q3 f10413m;

    /* renamed from: n, reason: collision with root package name */
    public C3496r4 f10414n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f10415o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10416p;

    /* renamed from: q, reason: collision with root package name */
    public double f10417q;

    public C3588z8() {
    }

    public C3588z8(int i10, String str, String str2, int i11, Point[] pointArr, S4 s42, C3542v6 c3542v6, W6 w62, Y7 y72, C3565x7 c3565x7, C3519t5 c3519t5, C3474p3 c3474p3, Q3 q32, C3496r4 c3496r4, byte[] bArr, boolean z10, double d10) {
        this.f10401a = i10;
        this.f10402b = str;
        this.f10415o = bArr;
        this.f10403c = str2;
        this.f10404d = i11;
        this.f10405e = pointArr;
        this.f10416p = z10;
        this.f10417q = d10;
        this.f10406f = s42;
        this.f10407g = c3542v6;
        this.f10408h = w62;
        this.f10409i = y72;
        this.f10410j = c3565x7;
        this.f10411k = c3519t5;
        this.f10412l = c3474p3;
        this.f10413m = q32;
        this.f10414n = c3496r4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, this.f10401a);
        C15708b.w(parcel, 3, this.f10402b, false);
        C15708b.w(parcel, 4, this.f10403c, false);
        C15708b.n(parcel, 5, this.f10404d);
        C15708b.z(parcel, 6, this.f10405e, i10, false);
        C15708b.u(parcel, 7, this.f10406f, i10, false);
        C15708b.u(parcel, 8, this.f10407g, i10, false);
        C15708b.u(parcel, 9, this.f10408h, i10, false);
        C15708b.u(parcel, 10, this.f10409i, i10, false);
        C15708b.u(parcel, 11, this.f10410j, i10, false);
        C15708b.u(parcel, 12, this.f10411k, i10, false);
        C15708b.u(parcel, 13, this.f10412l, i10, false);
        C15708b.u(parcel, 14, this.f10413m, i10, false);
        C15708b.u(parcel, 15, this.f10414n, i10, false);
        C15708b.g(parcel, 16, this.f10415o, false);
        C15708b.c(parcel, 17, this.f10416p);
        C15708b.i(parcel, 18, this.f10417q);
        C15708b.b(parcel, iA);
    }
}
