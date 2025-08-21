package Fd;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class sa extends AbstractC15707a {
    public static final Parcelable.Creator<sa> CREATOR = new ta();

    /* renamed from: a, reason: collision with root package name */
    private final int f10292a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10293b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10294c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f10295d;

    /* renamed from: e, reason: collision with root package name */
    private final Point[] f10296e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10297f;

    /* renamed from: g, reason: collision with root package name */
    private final C3422ka f10298g;

    /* renamed from: h, reason: collision with root package name */
    private final C3458na f10299h;

    /* renamed from: i, reason: collision with root package name */
    private final oa f10300i;

    /* renamed from: j, reason: collision with root package name */
    private final ra f10301j;

    /* renamed from: k, reason: collision with root package name */
    private final pa f10302k;

    /* renamed from: l, reason: collision with root package name */
    private final C3434la f10303l;

    /* renamed from: m, reason: collision with root package name */
    private final C3386ha f10304m;

    /* renamed from: n, reason: collision with root package name */
    private final C3398ia f10305n;

    /* renamed from: o, reason: collision with root package name */
    private final C3410ja f10306o;

    public final int B() {
        return this.f10292a;
    }

    public final Point[] I0() {
        return this.f10296e;
    }

    public final int T() {
        return this.f10297f;
    }

    public final String b0() {
        return this.f10293b;
    }

    public final String r0() {
        return this.f10294c;
    }

    public sa(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, C3422ka c3422ka, C3458na c3458na, oa oaVar, ra raVar, pa paVar, C3434la c3434la, C3386ha c3386ha, C3398ia c3398ia, C3410ja c3410ja) {
        this.f10292a = i10;
        this.f10293b = str;
        this.f10294c = str2;
        this.f10295d = bArr;
        this.f10296e = pointArr;
        this.f10297f = i11;
        this.f10298g = c3422ka;
        this.f10299h = c3458na;
        this.f10300i = oaVar;
        this.f10301j = raVar;
        this.f10302k = paVar;
        this.f10303l = c3434la;
        this.f10304m = c3386ha;
        this.f10305n = c3398ia;
        this.f10306o = c3410ja;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f10292a);
        C15708b.w(parcel, 2, this.f10293b, false);
        C15708b.w(parcel, 3, this.f10294c, false);
        C15708b.g(parcel, 4, this.f10295d, false);
        C15708b.z(parcel, 5, this.f10296e, i10, false);
        C15708b.n(parcel, 6, this.f10297f);
        C15708b.u(parcel, 7, this.f10298g, i10, false);
        C15708b.u(parcel, 8, this.f10299h, i10, false);
        C15708b.u(parcel, 9, this.f10300i, i10, false);
        C15708b.u(parcel, 10, this.f10301j, i10, false);
        C15708b.u(parcel, 11, this.f10302k, i10, false);
        C15708b.u(parcel, 12, this.f10303l, i10, false);
        C15708b.u(parcel, 13, this.f10304m, i10, false);
        C15708b.u(parcel, 14, this.f10305n, i10, false);
        C15708b.u(parcel, 15, this.f10306o, i10, false);
        C15708b.b(parcel, iA);
    }
}
