package Dd;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class sa extends AbstractC15136a {
    public static final Parcelable.Creator<sa> CREATOR = new ta();

    /* renamed from: a, reason: collision with root package name */
    private final int f6259a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6260b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6261c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f6262d;

    /* renamed from: e, reason: collision with root package name */
    private final Point[] f6263e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6264f;

    /* renamed from: g, reason: collision with root package name */
    private final C3200ka f6265g;

    /* renamed from: h, reason: collision with root package name */
    private final C3236na f6266h;

    /* renamed from: i, reason: collision with root package name */
    private final oa f6267i;

    /* renamed from: j, reason: collision with root package name */
    private final ra f6268j;

    /* renamed from: k, reason: collision with root package name */
    private final pa f6269k;

    /* renamed from: l, reason: collision with root package name */
    private final C3212la f6270l;

    /* renamed from: m, reason: collision with root package name */
    private final C3164ha f6271m;

    /* renamed from: n, reason: collision with root package name */
    private final C3176ia f6272n;

    /* renamed from: o, reason: collision with root package name */
    private final C3188ja f6273o;

    public final int B() {
        return this.f6259a;
    }

    public final Point[] K0() {
        return this.f6263e;
    }

    public final int T() {
        return this.f6264f;
    }

    public final String c0() {
        return this.f6260b;
    }

    public final String q0() {
        return this.f6261c;
    }

    public sa(int i10, String str, String str2, byte[] bArr, Point[] pointArr, int i11, C3200ka c3200ka, C3236na c3236na, oa oaVar, ra raVar, pa paVar, C3212la c3212la, C3164ha c3164ha, C3176ia c3176ia, C3188ja c3188ja) {
        this.f6259a = i10;
        this.f6260b = str;
        this.f6261c = str2;
        this.f6262d = bArr;
        this.f6263e = pointArr;
        this.f6264f = i11;
        this.f6265g = c3200ka;
        this.f6266h = c3236na;
        this.f6267i = oaVar;
        this.f6268j = raVar;
        this.f6269k = paVar;
        this.f6270l = c3212la;
        this.f6271m = c3164ha;
        this.f6272n = c3176ia;
        this.f6273o = c3188ja;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, this.f6259a);
        C15137b.w(parcel, 2, this.f6260b, false);
        C15137b.w(parcel, 3, this.f6261c, false);
        C15137b.g(parcel, 4, this.f6262d, false);
        C15137b.z(parcel, 5, this.f6263e, i10, false);
        C15137b.n(parcel, 6, this.f6264f);
        C15137b.u(parcel, 7, this.f6265g, i10, false);
        C15137b.u(parcel, 8, this.f6266h, i10, false);
        C15137b.u(parcel, 9, this.f6267i, i10, false);
        C15137b.u(parcel, 10, this.f6268j, i10, false);
        C15137b.u(parcel, 11, this.f6269k, i10, false);
        C15137b.u(parcel, 12, this.f6270l, i10, false);
        C15137b.u(parcel, 13, this.f6271m, i10, false);
        C15137b.u(parcel, 14, this.f6272n, i10, false);
        C15137b.u(parcel, 15, this.f6273o, i10, false);
        C15137b.b(parcel, iA);
    }
}
