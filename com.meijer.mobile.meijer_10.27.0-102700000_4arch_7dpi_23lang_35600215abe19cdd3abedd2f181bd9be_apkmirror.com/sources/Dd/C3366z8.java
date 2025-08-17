package Dd;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Dd.z8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3366z8 extends AbstractC15136a {
    public static final Parcelable.Creator<C3366z8> CREATOR = new W8();

    /* renamed from: a, reason: collision with root package name */
    public int f6368a;

    /* renamed from: b, reason: collision with root package name */
    public String f6369b;

    /* renamed from: c, reason: collision with root package name */
    public String f6370c;

    /* renamed from: d, reason: collision with root package name */
    public int f6371d;

    /* renamed from: e, reason: collision with root package name */
    public Point[] f6372e;

    /* renamed from: f, reason: collision with root package name */
    public S4 f6373f;

    /* renamed from: g, reason: collision with root package name */
    public C3320v6 f6374g;

    /* renamed from: h, reason: collision with root package name */
    public W6 f6375h;

    /* renamed from: i, reason: collision with root package name */
    public Y7 f6376i;

    /* renamed from: j, reason: collision with root package name */
    public C3343x7 f6377j;

    /* renamed from: k, reason: collision with root package name */
    public C3297t5 f6378k;

    /* renamed from: l, reason: collision with root package name */
    public C3252p3 f6379l;

    /* renamed from: m, reason: collision with root package name */
    public Q3 f6380m;

    /* renamed from: n, reason: collision with root package name */
    public C3274r4 f6381n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f6382o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6383p;

    /* renamed from: q, reason: collision with root package name */
    public double f6384q;

    public C3366z8() {
    }

    public C3366z8(int i10, String str, String str2, int i11, Point[] pointArr, S4 s42, C3320v6 c3320v6, W6 w62, Y7 y72, C3343x7 c3343x7, C3297t5 c3297t5, C3252p3 c3252p3, Q3 q32, C3274r4 c3274r4, byte[] bArr, boolean z10, double d10) {
        this.f6368a = i10;
        this.f6369b = str;
        this.f6382o = bArr;
        this.f6370c = str2;
        this.f6371d = i11;
        this.f6372e = pointArr;
        this.f6383p = z10;
        this.f6384q = d10;
        this.f6373f = s42;
        this.f6374g = c3320v6;
        this.f6375h = w62;
        this.f6376i = y72;
        this.f6377j = c3343x7;
        this.f6378k = c3297t5;
        this.f6379l = c3252p3;
        this.f6380m = q32;
        this.f6381n = c3274r4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, this.f6368a);
        C15137b.w(parcel, 3, this.f6369b, false);
        C15137b.w(parcel, 4, this.f6370c, false);
        C15137b.n(parcel, 5, this.f6371d);
        C15137b.z(parcel, 6, this.f6372e, i10, false);
        C15137b.u(parcel, 7, this.f6373f, i10, false);
        C15137b.u(parcel, 8, this.f6374g, i10, false);
        C15137b.u(parcel, 9, this.f6375h, i10, false);
        C15137b.u(parcel, 10, this.f6376i, i10, false);
        C15137b.u(parcel, 11, this.f6377j, i10, false);
        C15137b.u(parcel, 12, this.f6378k, i10, false);
        C15137b.u(parcel, 13, this.f6379l, i10, false);
        C15137b.u(parcel, 14, this.f6380m, i10, false);
        C15137b.u(parcel, 15, this.f6381n, i10, false);
        C15137b.g(parcel, 16, this.f6382o, false);
        C15137b.c(parcel, 17, this.f6383p);
        C15137b.i(parcel, 18, this.f6384q);
        C15137b.b(parcel, iA);
    }
}
