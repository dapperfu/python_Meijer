package Mc;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class d2 extends AbstractC15136a {
    public static final Parcelable.Creator<d2> CREATOR = new e2();

    /* renamed from: a, reason: collision with root package name */
    public final String f19213a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19214b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19215c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19216d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19217e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19218f;

    /* renamed from: g, reason: collision with root package name */
    public final d2[] f19219g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19220h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19221i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19222j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19223k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19224l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19225m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19226n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f19227o;

    public d2() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public d2(Context context, Ec.e eVar) {
        this(context, new Ec.e[]{eVar});
    }

    private static int K0(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i10 <= 400) {
            return 32;
        }
        return i10 <= 720 ? 50 : 90;
    }

    public static d2 T() {
        return new d2("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static d2 c0() {
        return new d2("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static d2 q0() {
        return new d2("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f19213a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, str, false);
        C15137b.n(parcel, 3, this.f19214b);
        C15137b.n(parcel, 4, this.f19215c);
        C15137b.c(parcel, 5, this.f19216d);
        C15137b.n(parcel, 6, this.f19217e);
        C15137b.n(parcel, 7, this.f19218f);
        C15137b.z(parcel, 8, this.f19219g, i10, false);
        C15137b.c(parcel, 9, this.f19220h);
        C15137b.c(parcel, 10, this.f19221i);
        C15137b.c(parcel, 11, this.f19222j);
        C15137b.c(parcel, 12, this.f19223k);
        C15137b.c(parcel, 13, this.f19224l);
        C15137b.c(parcel, 14, this.f19225m);
        C15137b.c(parcel, 15, this.f19226n);
        C15137b.c(parcel, 16, this.f19227o);
        C15137b.b(parcel, iA);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d2(android.content.Context r13, Ec.e[] r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mc.d2.<init>(android.content.Context, Ec.e[]):void");
    }

    public static int B(DisplayMetrics displayMetrics) {
        return (int) (K0(displayMetrics) * displayMetrics.density);
    }

    d2(String str, int i10, int i11, boolean z10, int i12, int i13, d2[] d2VarArr, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f19213a = str;
        this.f19214b = i10;
        this.f19215c = i11;
        this.f19216d = z10;
        this.f19217e = i12;
        this.f19218f = i13;
        this.f19219g = d2VarArr;
        this.f19220h = z11;
        this.f19221i = z12;
        this.f19222j = z13;
        this.f19223k = z14;
        this.f19224l = z15;
        this.f19225m = z16;
        this.f19226n = z17;
        this.f19227o = z18;
    }
}
