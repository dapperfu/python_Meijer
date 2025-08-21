package Oc;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import java.util.ArrayList;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class Y1 extends AbstractC15707a {
    public static final Parcelable.Creator<Y1> CREATOR = new a2();

    /* renamed from: a, reason: collision with root package name */
    public final int f23354a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public final long f23355b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f23356c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public final int f23357d;

    /* renamed from: e, reason: collision with root package name */
    public final List f23358e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23359f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23360g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f23361h;

    /* renamed from: i, reason: collision with root package name */
    public final String f23362i;

    /* renamed from: j, reason: collision with root package name */
    public final N1 f23363j;

    /* renamed from: k, reason: collision with root package name */
    public final Location f23364k;

    /* renamed from: l, reason: collision with root package name */
    public final String f23365l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f23366m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f23367n;

    /* renamed from: o, reason: collision with root package name */
    public final List f23368o;

    /* renamed from: p, reason: collision with root package name */
    public final String f23369p;

    /* renamed from: q, reason: collision with root package name */
    public final String f23370q;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public final boolean f23371r;

    /* renamed from: s, reason: collision with root package name */
    public final X f23372s;

    /* renamed from: t, reason: collision with root package name */
    public final int f23373t;

    /* renamed from: u, reason: collision with root package name */
    public final String f23374u;

    /* renamed from: v, reason: collision with root package name */
    public final List f23375v;

    /* renamed from: w, reason: collision with root package name */
    public final int f23376w;

    /* renamed from: x, reason: collision with root package name */
    public final String f23377x;

    /* renamed from: y, reason: collision with root package name */
    public final int f23378y;

    /* renamed from: z, reason: collision with root package name */
    public final long f23379z;

    public Y1(int i10, long j10, Bundle bundle, int i11, List list, boolean z10, int i12, boolean z11, String str, N1 n12, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z12, X x10, int i13, String str5, List list3, int i14, String str6, int i15, long j11) {
        this.f23354a = i10;
        this.f23355b = j10;
        this.f23356c = bundle == null ? new Bundle() : bundle;
        this.f23357d = i11;
        this.f23358e = list;
        this.f23359f = z10;
        this.f23360g = i12;
        this.f23361h = z11;
        this.f23362i = str;
        this.f23363j = n12;
        this.f23364k = location;
        this.f23365l = str2;
        this.f23366m = bundle2 == null ? new Bundle() : bundle2;
        this.f23367n = bundle3;
        this.f23368o = list2;
        this.f23369p = str3;
        this.f23370q = str4;
        this.f23371r = z12;
        this.f23372s = x10;
        this.f23373t = i13;
        this.f23374u = str5;
        this.f23375v = list3 == null ? new ArrayList() : list3;
        this.f23376w = i14;
        this.f23377x = str6;
        this.f23378y = i15;
        this.f23379z = j11;
    }

    public final boolean B(Object obj) {
        if (!(obj instanceof Y1)) {
            return false;
        }
        Y1 y12 = (Y1) obj;
        return this.f23354a == y12.f23354a && this.f23355b == y12.f23355b && Sc.q.a(this.f23356c, y12.f23356c) && this.f23357d == y12.f23357d && C6660q.a(this.f23358e, y12.f23358e) && this.f23359f == y12.f23359f && this.f23360g == y12.f23360g && this.f23361h == y12.f23361h && C6660q.a(this.f23362i, y12.f23362i) && C6660q.a(this.f23363j, y12.f23363j) && C6660q.a(this.f23364k, y12.f23364k) && C6660q.a(this.f23365l, y12.f23365l) && Sc.q.a(this.f23366m, y12.f23366m) && Sc.q.a(this.f23367n, y12.f23367n) && C6660q.a(this.f23368o, y12.f23368o) && C6660q.a(this.f23369p, y12.f23369p) && C6660q.a(this.f23370q, y12.f23370q) && this.f23371r == y12.f23371r && this.f23373t == y12.f23373t && C6660q.a(this.f23374u, y12.f23374u) && C6660q.a(this.f23375v, y12.f23375v) && this.f23376w == y12.f23376w && C6660q.a(this.f23377x, y12.f23377x) && this.f23378y == y12.f23378y;
    }

    public final boolean T() {
        return this.f23356c.getBoolean("is_sdk_preload", false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Y1) {
            return B(obj) && this.f23379z == ((Y1) obj).f23379z;
        }
        return false;
    }

    public final int hashCode() {
        return C6660q.b(Integer.valueOf(this.f23354a), Long.valueOf(this.f23355b), this.f23356c, Integer.valueOf(this.f23357d), this.f23358e, Boolean.valueOf(this.f23359f), Integer.valueOf(this.f23360g), Boolean.valueOf(this.f23361h), this.f23362i, this.f23363j, this.f23364k, this.f23365l, this.f23366m, this.f23367n, this.f23368o, this.f23369p, this.f23370q, Boolean.valueOf(this.f23371r), Integer.valueOf(this.f23373t), this.f23374u, this.f23375v, Integer.valueOf(this.f23376w), this.f23377x, Integer.valueOf(this.f23378y), Long.valueOf(this.f23379z));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23354a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.s(parcel, 2, this.f23355b);
        C15708b.e(parcel, 3, this.f23356c, false);
        C15708b.n(parcel, 4, this.f23357d);
        C15708b.y(parcel, 5, this.f23358e, false);
        C15708b.c(parcel, 6, this.f23359f);
        C15708b.n(parcel, 7, this.f23360g);
        C15708b.c(parcel, 8, this.f23361h);
        C15708b.w(parcel, 9, this.f23362i, false);
        C15708b.u(parcel, 10, this.f23363j, i10, false);
        C15708b.u(parcel, 11, this.f23364k, i10, false);
        C15708b.w(parcel, 12, this.f23365l, false);
        C15708b.e(parcel, 13, this.f23366m, false);
        C15708b.e(parcel, 14, this.f23367n, false);
        C15708b.y(parcel, 15, this.f23368o, false);
        C15708b.w(parcel, 16, this.f23369p, false);
        C15708b.w(parcel, 17, this.f23370q, false);
        C15708b.c(parcel, 18, this.f23371r);
        C15708b.u(parcel, 19, this.f23372s, i10, false);
        C15708b.n(parcel, 20, this.f23373t);
        C15708b.w(parcel, 21, this.f23374u, false);
        C15708b.y(parcel, 22, this.f23375v, false);
        C15708b.n(parcel, 23, this.f23376w);
        C15708b.w(parcel, 24, this.f23377x, false);
        C15708b.n(parcel, 25, this.f23378y);
        C15708b.s(parcel, 26, this.f23379z);
        C15708b.b(parcel, iA);
    }
}
