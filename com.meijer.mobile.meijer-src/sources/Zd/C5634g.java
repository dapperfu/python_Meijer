package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import be.C6360c;
import be.C6363f;
import java.util.ArrayList;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Zd.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5634g extends AbstractC15707a {
    public static final Parcelable.Creator<C5634g> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    String f43706a;

    /* renamed from: b, reason: collision with root package name */
    String f43707b;

    /* renamed from: c, reason: collision with root package name */
    String f43708c;

    /* renamed from: d, reason: collision with root package name */
    String f43709d;

    /* renamed from: e, reason: collision with root package name */
    String f43710e;

    /* renamed from: f, reason: collision with root package name */
    String f43711f;

    /* renamed from: g, reason: collision with root package name */
    String f43712g;

    /* renamed from: h, reason: collision with root package name */
    String f43713h;

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    String f43714i;

    /* renamed from: j, reason: collision with root package name */
    String f43715j;

    /* renamed from: k, reason: collision with root package name */
    int f43716k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f43717l;

    /* renamed from: m, reason: collision with root package name */
    C6363f f43718m;

    /* renamed from: n, reason: collision with root package name */
    final ArrayList f43719n;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    String f43720o;

    /* renamed from: p, reason: collision with root package name */
    @Deprecated
    String f43721p;

    /* renamed from: q, reason: collision with root package name */
    final ArrayList f43722q;

    /* renamed from: r, reason: collision with root package name */
    boolean f43723r;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f43724s;

    /* renamed from: t, reason: collision with root package name */
    final ArrayList f43725t;

    /* renamed from: u, reason: collision with root package name */
    final ArrayList f43726u;

    /* renamed from: v, reason: collision with root package name */
    C6360c f43727v;

    /* renamed from: Zd.g$a */
    public final class a {
        /* synthetic */ a(E e10) {
        }

        public C5634g a() {
            return C5634g.this;
        }

        public a b(String str) {
            C5634g.this.f43707b = str;
            return this;
        }

        public a c(String str) {
            C5634g.this.f43710e = str;
            return this;
        }

        public a d(String str) {
            C5634g.this.f43712g = str;
            return this;
        }

        public a e(String str) {
            C5634g.this.f43713h = str;
            return this;
        }

        public a f(String str) {
            C5634g.this.f43715j = str;
            return this;
        }

        public a g(String str) {
            C5634g.this.f43706a = str;
            return this;
        }

        public a h(String str) {
            C5634g.this.f43708c = str;
            return this;
        }

        public a i(String str) {
            C5634g.this.f43709d = str;
            return this;
        }

        public a j(int i10) {
            C5634g.this.f43716k = i10;
            return this;
        }
    }

    C5634g() {
        this.f43717l = com.google.android.gms.common.util.b.c();
        this.f43719n = com.google.android.gms.common.util.b.c();
        this.f43722q = com.google.android.gms.common.util.b.c();
        this.f43724s = com.google.android.gms.common.util.b.c();
        this.f43725t = com.google.android.gms.common.util.b.c();
        this.f43726u = com.google.android.gms.common.util.b.c();
    }

    public static a B() {
        return new C5634g().new a(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 2, this.f43706a, false);
        C15708b.w(parcel, 3, this.f43707b, false);
        C15708b.w(parcel, 4, this.f43708c, false);
        C15708b.w(parcel, 5, this.f43709d, false);
        C15708b.w(parcel, 6, this.f43710e, false);
        C15708b.w(parcel, 7, this.f43711f, false);
        C15708b.w(parcel, 8, this.f43712g, false);
        C15708b.w(parcel, 9, this.f43713h, false);
        C15708b.w(parcel, 10, this.f43714i, false);
        C15708b.w(parcel, 11, this.f43715j, false);
        C15708b.n(parcel, 12, this.f43716k);
        C15708b.A(parcel, 13, this.f43717l, false);
        C15708b.u(parcel, 14, this.f43718m, i10, false);
        C15708b.A(parcel, 15, this.f43719n, false);
        C15708b.w(parcel, 16, this.f43720o, false);
        C15708b.w(parcel, 17, this.f43721p, false);
        C15708b.A(parcel, 18, this.f43722q, false);
        C15708b.c(parcel, 19, this.f43723r);
        C15708b.A(parcel, 20, this.f43724s, false);
        C15708b.A(parcel, 21, this.f43725t, false);
        C15708b.A(parcel, 22, this.f43726u, false);
        C15708b.u(parcel, 23, this.f43727v, i10, false);
        C15708b.b(parcel, iA);
    }

    C5634g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, ArrayList arrayList, C6363f c6363f, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z10, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, C6360c c6360c) {
        this.f43706a = str;
        this.f43707b = str2;
        this.f43708c = str3;
        this.f43709d = str4;
        this.f43710e = str5;
        this.f43711f = str6;
        this.f43712g = str7;
        this.f43713h = str8;
        this.f43714i = str9;
        this.f43715j = str10;
        this.f43716k = i10;
        this.f43717l = arrayList;
        this.f43718m = c6363f;
        this.f43719n = arrayList2;
        this.f43720o = str11;
        this.f43721p = str12;
        this.f43722q = arrayList3;
        this.f43723r = z10;
        this.f43724s = arrayList4;
        this.f43725t = arrayList5;
        this.f43726u = arrayList6;
        this.f43727v = c6360c;
    }
}
