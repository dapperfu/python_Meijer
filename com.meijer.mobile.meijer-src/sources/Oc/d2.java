package Oc;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class d2 extends AbstractC15707a {
    public static final Parcelable.Creator<d2> CREATOR = new e2();

    /* renamed from: a, reason: collision with root package name */
    public final String f23400a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23401b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23402c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23403d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23404e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23405f;

    /* renamed from: g, reason: collision with root package name */
    public final d2[] f23406g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f23407h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f23408i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23409j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23410k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f23411l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23412m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23413n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23414o;

    public d2() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public d2(Context context, Gc.e eVar) {
        this(context, new Gc.e[]{eVar});
    }

    private static int I0(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i10 <= 400) {
            return 32;
        }
        return i10 <= 720 ? 50 : 90;
    }

    public static d2 T() {
        return new d2("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static d2 b0() {
        return new d2("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static d2 r0() {
        return new d2("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f23400a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, str, false);
        C15708b.n(parcel, 3, this.f23401b);
        C15708b.n(parcel, 4, this.f23402c);
        C15708b.c(parcel, 5, this.f23403d);
        C15708b.n(parcel, 6, this.f23404e);
        C15708b.n(parcel, 7, this.f23405f);
        C15708b.z(parcel, 8, this.f23406g, i10, false);
        C15708b.c(parcel, 9, this.f23407h);
        C15708b.c(parcel, 10, this.f23408i);
        C15708b.c(parcel, 11, this.f23409j);
        C15708b.c(parcel, 12, this.f23410k);
        C15708b.c(parcel, 13, this.f23411l);
        C15708b.c(parcel, 14, this.f23412m);
        C15708b.c(parcel, 15, this.f23413n);
        C15708b.c(parcel, 16, this.f23414o);
        C15708b.b(parcel, iA);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d2(android.content.Context r13, Gc.e[] r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Oc.d2.<init>(android.content.Context, Gc.e[]):void");
    }

    public static int B(DisplayMetrics displayMetrics) {
        return (int) (I0(displayMetrics) * displayMetrics.density);
    }

    d2(String str, int i10, int i11, boolean z10, int i12, int i13, d2[] d2VarArr, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f23400a = str;
        this.f23401b = i10;
        this.f23402c = i11;
        this.f23403d = z10;
        this.f23404e = i12;
        this.f23405f = i13;
        this.f23406g = d2VarArr;
        this.f23407h = z11;
        this.f23408i = z12;
        this.f23409j = z13;
        this.f23410k = z14;
        this.f23411l = z15;
        this.f23412m = z16;
        this.f23413n = z17;
        this.f23414o = z18;
    }
}
