package Xd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Xd.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5423g extends AbstractC15136a {
    public static final Parcelable.Creator<C5423g> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    String f39228a;

    /* renamed from: b, reason: collision with root package name */
    String f39229b;

    /* renamed from: c, reason: collision with root package name */
    String f39230c;

    /* renamed from: d, reason: collision with root package name */
    String f39231d;

    /* renamed from: e, reason: collision with root package name */
    String f39232e;

    /* renamed from: f, reason: collision with root package name */
    String f39233f;

    /* renamed from: g, reason: collision with root package name */
    String f39234g;

    /* renamed from: h, reason: collision with root package name */
    String f39235h;

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    String f39236i;

    /* renamed from: j, reason: collision with root package name */
    String f39237j;

    /* renamed from: k, reason: collision with root package name */
    int f39238k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f39239l;

    /* renamed from: m, reason: collision with root package name */
    Zd.f f39240m;

    /* renamed from: n, reason: collision with root package name */
    final ArrayList f39241n;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    String f39242o;

    /* renamed from: p, reason: collision with root package name */
    @Deprecated
    String f39243p;

    /* renamed from: q, reason: collision with root package name */
    final ArrayList f39244q;

    /* renamed from: r, reason: collision with root package name */
    boolean f39245r;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f39246s;

    /* renamed from: t, reason: collision with root package name */
    final ArrayList f39247t;

    /* renamed from: u, reason: collision with root package name */
    final ArrayList f39248u;

    /* renamed from: v, reason: collision with root package name */
    Zd.c f39249v;

    /* renamed from: Xd.g$a */
    public final class a {
        /* synthetic */ a(E e10) {
        }

        public C5423g a() {
            return C5423g.this;
        }

        public a b(String str) {
            C5423g.this.f39229b = str;
            return this;
        }

        public a c(String str) {
            C5423g.this.f39232e = str;
            return this;
        }

        public a d(String str) {
            C5423g.this.f39234g = str;
            return this;
        }

        public a e(String str) {
            C5423g.this.f39235h = str;
            return this;
        }

        public a f(String str) {
            C5423g.this.f39237j = str;
            return this;
        }

        public a g(String str) {
            C5423g.this.f39228a = str;
            return this;
        }

        public a h(String str) {
            C5423g.this.f39230c = str;
            return this;
        }

        public a i(String str) {
            C5423g.this.f39231d = str;
            return this;
        }

        public a j(int i10) {
            C5423g.this.f39238k = i10;
            return this;
        }
    }

    C5423g() {
        this.f39239l = com.google.android.gms.common.util.b.c();
        this.f39241n = com.google.android.gms.common.util.b.c();
        this.f39244q = com.google.android.gms.common.util.b.c();
        this.f39246s = com.google.android.gms.common.util.b.c();
        this.f39247t = com.google.android.gms.common.util.b.c();
        this.f39248u = com.google.android.gms.common.util.b.c();
    }

    public static a B() {
        return new C5423g().new a(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 2, this.f39228a, false);
        C15137b.w(parcel, 3, this.f39229b, false);
        C15137b.w(parcel, 4, this.f39230c, false);
        C15137b.w(parcel, 5, this.f39231d, false);
        C15137b.w(parcel, 6, this.f39232e, false);
        C15137b.w(parcel, 7, this.f39233f, false);
        C15137b.w(parcel, 8, this.f39234g, false);
        C15137b.w(parcel, 9, this.f39235h, false);
        C15137b.w(parcel, 10, this.f39236i, false);
        C15137b.w(parcel, 11, this.f39237j, false);
        C15137b.n(parcel, 12, this.f39238k);
        C15137b.A(parcel, 13, this.f39239l, false);
        C15137b.u(parcel, 14, this.f39240m, i10, false);
        C15137b.A(parcel, 15, this.f39241n, false);
        C15137b.w(parcel, 16, this.f39242o, false);
        C15137b.w(parcel, 17, this.f39243p, false);
        C15137b.A(parcel, 18, this.f39244q, false);
        C15137b.c(parcel, 19, this.f39245r);
        C15137b.A(parcel, 20, this.f39246s, false);
        C15137b.A(parcel, 21, this.f39247t, false);
        C15137b.A(parcel, 22, this.f39248u, false);
        C15137b.u(parcel, 23, this.f39249v, i10, false);
        C15137b.b(parcel, iA);
    }

    C5423g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, ArrayList arrayList, Zd.f fVar, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z10, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, Zd.c cVar) {
        this.f39228a = str;
        this.f39229b = str2;
        this.f39230c = str3;
        this.f39231d = str4;
        this.f39232e = str5;
        this.f39233f = str6;
        this.f39234g = str7;
        this.f39235h = str8;
        this.f39236i = str9;
        this.f39237j = str10;
        this.f39238k = i10;
        this.f39239l = arrayList;
        this.f39240m = fVar;
        this.f39241n = arrayList2;
        this.f39242o = str11;
        this.f39243p = str12;
        this.f39244q = arrayList3;
        this.f39245r = z10;
        this.f39246s = arrayList4;
        this.f39247t = arrayList5;
        this.f39248u = arrayList6;
        this.f39249v = cVar;
    }
}
