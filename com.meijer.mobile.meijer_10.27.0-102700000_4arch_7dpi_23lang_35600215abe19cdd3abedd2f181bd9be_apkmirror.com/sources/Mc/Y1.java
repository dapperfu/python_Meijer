package Mc;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import java.util.ArrayList;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class Y1 extends AbstractC15136a {
    public static final Parcelable.Creator<Y1> CREATOR = new a2();

    /* renamed from: a, reason: collision with root package name */
    public final int f19167a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public final long f19168b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f19169c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public final int f19170d;

    /* renamed from: e, reason: collision with root package name */
    public final List f19171e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19172f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19173g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19174h;

    /* renamed from: i, reason: collision with root package name */
    public final String f19175i;

    /* renamed from: j, reason: collision with root package name */
    public final N1 f19176j;

    /* renamed from: k, reason: collision with root package name */
    public final Location f19177k;

    /* renamed from: l, reason: collision with root package name */
    public final String f19178l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f19179m;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f19180n;

    /* renamed from: o, reason: collision with root package name */
    public final List f19181o;

    /* renamed from: p, reason: collision with root package name */
    public final String f19182p;

    /* renamed from: q, reason: collision with root package name */
    public final String f19183q;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public final boolean f19184r;

    /* renamed from: s, reason: collision with root package name */
    public final X f19185s;

    /* renamed from: t, reason: collision with root package name */
    public final int f19186t;

    /* renamed from: u, reason: collision with root package name */
    public final String f19187u;

    /* renamed from: v, reason: collision with root package name */
    public final List f19188v;

    /* renamed from: w, reason: collision with root package name */
    public final int f19189w;

    /* renamed from: x, reason: collision with root package name */
    public final String f19190x;

    /* renamed from: y, reason: collision with root package name */
    public final int f19191y;

    /* renamed from: z, reason: collision with root package name */
    public final long f19192z;

    public Y1(int i10, long j10, Bundle bundle, int i11, List list, boolean z10, int i12, boolean z11, String str, N1 n12, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z12, X x10, int i13, String str5, List list3, int i14, String str6, int i15, long j11) {
        this.f19167a = i10;
        this.f19168b = j10;
        this.f19169c = bundle == null ? new Bundle() : bundle;
        this.f19170d = i11;
        this.f19171e = list;
        this.f19172f = z10;
        this.f19173g = i12;
        this.f19174h = z11;
        this.f19175i = str;
        this.f19176j = n12;
        this.f19177k = location;
        this.f19178l = str2;
        this.f19179m = bundle2 == null ? new Bundle() : bundle2;
        this.f19180n = bundle3;
        this.f19181o = list2;
        this.f19182p = str3;
        this.f19183q = str4;
        this.f19184r = z12;
        this.f19185s = x10;
        this.f19186t = i13;
        this.f19187u = str5;
        this.f19188v = list3 == null ? new ArrayList() : list3;
        this.f19189w = i14;
        this.f19190x = str6;
        this.f19191y = i15;
        this.f19192z = j11;
    }

    public final boolean B(Object obj) {
        if (!(obj instanceof Y1)) {
            return false;
        }
        Y1 y12 = (Y1) obj;
        return this.f19167a == y12.f19167a && this.f19168b == y12.f19168b && Qc.q.a(this.f19169c, y12.f19169c) && this.f19170d == y12.f19170d && C6535q.a(this.f19171e, y12.f19171e) && this.f19172f == y12.f19172f && this.f19173g == y12.f19173g && this.f19174h == y12.f19174h && C6535q.a(this.f19175i, y12.f19175i) && C6535q.a(this.f19176j, y12.f19176j) && C6535q.a(this.f19177k, y12.f19177k) && C6535q.a(this.f19178l, y12.f19178l) && Qc.q.a(this.f19179m, y12.f19179m) && Qc.q.a(this.f19180n, y12.f19180n) && C6535q.a(this.f19181o, y12.f19181o) && C6535q.a(this.f19182p, y12.f19182p) && C6535q.a(this.f19183q, y12.f19183q) && this.f19184r == y12.f19184r && this.f19186t == y12.f19186t && C6535q.a(this.f19187u, y12.f19187u) && C6535q.a(this.f19188v, y12.f19188v) && this.f19189w == y12.f19189w && C6535q.a(this.f19190x, y12.f19190x) && this.f19191y == y12.f19191y;
    }

    public final boolean T() {
        return this.f19169c.getBoolean("is_sdk_preload", false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Y1) {
            return B(obj) && this.f19192z == ((Y1) obj).f19192z;
        }
        return false;
    }

    public final int hashCode() {
        return C6535q.b(Integer.valueOf(this.f19167a), Long.valueOf(this.f19168b), this.f19169c, Integer.valueOf(this.f19170d), this.f19171e, Boolean.valueOf(this.f19172f), Integer.valueOf(this.f19173g), Boolean.valueOf(this.f19174h), this.f19175i, this.f19176j, this.f19177k, this.f19178l, this.f19179m, this.f19180n, this.f19181o, this.f19182p, this.f19183q, Boolean.valueOf(this.f19184r), Integer.valueOf(this.f19186t), this.f19187u, this.f19188v, Integer.valueOf(this.f19189w), this.f19190x, Integer.valueOf(this.f19191y), Long.valueOf(this.f19192z));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f19167a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.s(parcel, 2, this.f19168b);
        C15137b.e(parcel, 3, this.f19169c, false);
        C15137b.n(parcel, 4, this.f19170d);
        C15137b.y(parcel, 5, this.f19171e, false);
        C15137b.c(parcel, 6, this.f19172f);
        C15137b.n(parcel, 7, this.f19173g);
        C15137b.c(parcel, 8, this.f19174h);
        C15137b.w(parcel, 9, this.f19175i, false);
        C15137b.u(parcel, 10, this.f19176j, i10, false);
        C15137b.u(parcel, 11, this.f19177k, i10, false);
        C15137b.w(parcel, 12, this.f19178l, false);
        C15137b.e(parcel, 13, this.f19179m, false);
        C15137b.e(parcel, 14, this.f19180n, false);
        C15137b.y(parcel, 15, this.f19181o, false);
        C15137b.w(parcel, 16, this.f19182p, false);
        C15137b.w(parcel, 17, this.f19183q, false);
        C15137b.c(parcel, 18, this.f19184r);
        C15137b.u(parcel, 19, this.f19185s, i10, false);
        C15137b.n(parcel, 20, this.f19186t);
        C15137b.w(parcel, 21, this.f19187u, false);
        C15137b.y(parcel, 22, this.f19188v, false);
        C15137b.n(parcel, 23, this.f19189w);
        C15137b.w(parcel, 24, this.f19190x, false);
        C15137b.n(parcel, 25, this.f19191y);
        C15137b.s(parcel, 26, this.f19192z);
        C15137b.b(parcel, iA);
    }
}
