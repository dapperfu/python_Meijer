package Xd;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public class a extends AbstractC15707a {

    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new Xd.d();

    /* renamed from: a, reason: collision with root package name */
    public int f42092a;

    /* renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    public String f42093b;

    /* renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    public String f42094c;

    /* renamed from: d, reason: collision with root package name */
    public int f42095d;

    /* renamed from: e, reason: collision with root package name */
    @RecentlyNonNull
    public Point[] f42096e;

    /* renamed from: f, reason: collision with root package name */
    @RecentlyNonNull
    public f f42097f;

    /* renamed from: g, reason: collision with root package name */
    @RecentlyNonNull
    public i f42098g;

    /* renamed from: h, reason: collision with root package name */
    @RecentlyNonNull
    public j f42099h;

    /* renamed from: i, reason: collision with root package name */
    @RecentlyNonNull
    public l f42100i;

    /* renamed from: j, reason: collision with root package name */
    @RecentlyNonNull
    public k f42101j;

    /* renamed from: k, reason: collision with root package name */
    @RecentlyNonNull
    public g f42102k;

    /* renamed from: l, reason: collision with root package name */
    @RecentlyNonNull
    public c f42103l;

    /* renamed from: m, reason: collision with root package name */
    @RecentlyNonNull
    public d f42104m;

    /* renamed from: n, reason: collision with root package name */
    @RecentlyNonNull
    public e f42105n;

    /* renamed from: o, reason: collision with root package name */
    @RecentlyNonNull
    public byte[] f42106o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f42107p;

    /* renamed from: Xd.a$a, reason: collision with other inner class name */
    public static class C0898a extends AbstractC15707a {

        @RecentlyNonNull
        public static final Parcelable.Creator<C0898a> CREATOR = new Xd.c();

        /* renamed from: a, reason: collision with root package name */
        public int f42108a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String[] f42109b;

        public C0898a() {
        }

        public C0898a(int i10, @RecentlyNonNull String[] strArr) {
            this.f42108a = i10;
            this.f42109b = strArr;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15708b.a(parcel);
            C15708b.n(parcel, 2, this.f42108a);
            C15708b.x(parcel, 3, this.f42109b, false);
            C15708b.b(parcel, iA);
        }
    }

    public static class b extends AbstractC15707a {

        @RecentlyNonNull
        public static final Parcelable.Creator<b> CREATOR = new Xd.f();

        /* renamed from: a, reason: collision with root package name */
        public int f42110a;

        /* renamed from: b, reason: collision with root package name */
        public int f42111b;

        /* renamed from: c, reason: collision with root package name */
        public int f42112c;

        /* renamed from: d, reason: collision with root package name */
        public int f42113d;

        /* renamed from: e, reason: collision with root package name */
        public int f42114e;

        /* renamed from: f, reason: collision with root package name */
        public int f42115f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f42116g;

        /* renamed from: h, reason: collision with root package name */
        @RecentlyNonNull
        public String f42117h;

        public b() {
        }

        public b(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, @RecentlyNonNull String str) {
            this.f42110a = i10;
            this.f42111b = i11;
            this.f42112c = i12;
            this.f42113d = i13;
            this.f42114e = i14;
            this.f42115f = i15;
            this.f42116g = z10;
            this.f42117h = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15708b.a(parcel);
            C15708b.n(parcel, 2, this.f42110a);
            C15708b.n(parcel, 3, this.f42111b);
            C15708b.n(parcel, 4, this.f42112c);
            C15708b.n(parcel, 5, this.f42113d);
            C15708b.n(parcel, 6, this.f42114e);
            C15708b.n(parcel, 7, this.f42115f);
            C15708b.c(parcel, 8, this.f42116g);
            C15708b.w(parcel, 9, this.f42117h, false);
            C15708b.b(parcel, iA);
        }
    }

    public static class c extends AbstractC15707a {

        @RecentlyNonNull
        public static final Parcelable.Creator<c> CREATOR = new Xd.h();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public String f42118a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f42119b;

        /* renamed from: c, reason: collision with root package name */
        @RecentlyNonNull
        public String f42120c;

        /* renamed from: d, reason: collision with root package name */
        @RecentlyNonNull
        public String f42121d;

        /* renamed from: e, reason: collision with root package name */
        @RecentlyNonNull
        public String f42122e;

        /* renamed from: f, reason: collision with root package name */
        @RecentlyNonNull
        public b f42123f;

        /* renamed from: g, reason: collision with root package name */
        @RecentlyNonNull
        public b f42124g;

        public c() {
        }

        public c(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, @RecentlyNonNull String str5, @RecentlyNonNull b bVar, @RecentlyNonNull b bVar2) {
            this.f42118a = str;
            this.f42119b = str2;
            this.f42120c = str3;
            this.f42121d = str4;
            this.f42122e = str5;
            this.f42123f = bVar;
            this.f42124g = bVar2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15708b.a(parcel);
            C15708b.w(parcel, 2, this.f42118a, false);
            C15708b.w(parcel, 3, this.f42119b, false);
            C15708b.w(parcel, 4, this.f42120c, false);
            C15708b.w(parcel, 5, this.f42121d, false);
            C15708b.w(parcel, 6, this.f42122e, false);
            C15708b.u(parcel, 7, this.f42123f, i10, false);
            C15708b.u(parcel, 8, this.f42124g, i10, false);
            C15708b.b(parcel, iA);
        }
    }

    public static class d extends AbstractC15707a {

        @RecentlyNonNull
        public static final Parcelable.Creator<d> CREATOR = new Xd.g();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public h f42125a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f42126b;

        /* renamed from: c, reason: collision with root package name */
        @RecentlyNonNull
        public String f42127c;

        /* renamed from: d, reason: collision with root package name */
        @RecentlyNonNull
        public i[] f42128d;

        /* renamed from: e, reason: collision with root package name */
        @RecentlyNonNull
        public f[] f42129e;

        /* renamed from: f, reason: collision with root package name */
        @RecentlyNonNull
        public String[] f42130f;

        /* renamed from: g, reason: collision with root package name */
        @RecentlyNonNull
        public C0898a[] f42131g;

        public d() {
        }

        public d(@RecentlyNonNull h hVar, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull i[] iVarArr, @RecentlyNonNull f[] fVarArr, @RecentlyNonNull String[] strArr, @RecentlyNonNull C0898a[] c0898aArr) {
            this.f42125a = hVar;
            this.f42126b = str;
            this.f42127c = str2;
            this.f42128d = iVarArr;
            this.f42129e = fVarArr;
            this.f42130f = strArr;
            this.f42131g = c0898aArr;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15708b.a(parcel);
            C15708b.u(parcel, 2, this.f42125a, i10, false);
            C15708b.w(parcel, 3, this.f42126b, false);
            C15708b.w(parcel, 4, this.f42127c, false);
            C15708b.z(parcel, 5, this.f42128d, i10, false);
            C15708b.z(parcel, 6, this.f42129e, i10, false);
            C15708b.x(parcel, 7, this.f42130f, false);
            C15708b.z(parcel, 8, this.f42131g, i10, false);
            C15708b.b(parcel, iA);
        }
    }

    public static class e extends AbstractC15707a {

        @RecentlyNonNull
        public static final Parcelable.Creator<e> CREATOR = new Xd.j();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public String f42132a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f42133b;

        /* renamed from: c, reason: collision with root package name */
        @RecentlyNonNull
        public String f42134c;

        /* renamed from: d, reason: collision with root package name */
        @RecentlyNonNull
        public String f42135d;

        /* renamed from: e, reason: collision with root package name */
        @RecentlyNonNull
        public String f42136e;

        /* renamed from: f, reason: collision with root package name */
        @RecentlyNonNull
        public String f42137f;

        /* renamed from: g, reason: collision with root package name */
        @RecentlyNonNull
        public String f42138g;

        /* renamed from: h, reason: collision with root package name */
        @RecentlyNonNull
        public String f42139h;

        /* renamed from: i, reason: collision with root package name */
        @RecentlyNonNull
        public String f42140i;

        /* renamed from: j, reason: collision with root package name */
        @RecentlyNonNull
        public String f42141j;

        /* renamed from: k, reason: collision with root package name */
        @RecentlyNonNull
        public String f42142k;

        /* renamed from: l, reason: collision with root package name */
        @RecentlyNonNull
        public String f42143l;

        /* renamed from: m, reason: collision with root package name */
        @RecentlyNonNull
        public String f42144m;

        /* renamed from: n, reason: collision with root package name */
        @RecentlyNonNull
        public String f42145n;

        public e() {
        }

        public e(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, @RecentlyNonNull String str5, @RecentlyNonNull String str6, @RecentlyNonNull String str7, @RecentlyNonNull String str8, @RecentlyNonNull String str9, @RecentlyNonNull String str10, @RecentlyNonNull String str11, @RecentlyNonNull String str12, @RecentlyNonNull String str13, @RecentlyNonNull String str14) {
            this.f42132a = str;
            this.f42133b = str2;
            this.f42134c = str3;
            this.f42135d = str4;
            this.f42136e = str5;
            this.f42137f = str6;
            this.f42138g = str7;
            this.f42139h = str8;
            this.f42140i = str9;
            this.f42141j = str10;
            this.f42142k = str11;
            this.f42143l = str12;
            this.f42144m = str13;
            this.f42145n = str14;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15708b.a(parcel);
            C15708b.w(parcel, 2, this.f42132a, false);
            C15708b.w(parcel, 3, this.f42133b, false);
            C15708b.w(parcel, 4, this.f42134c, false);
            C15708b.w(parcel, 5, this.f42135d, false);
            C15708b.w(parcel, 6, this.f42136e, false);
            C15708b.w(parcel, 7, this.f42137f, false);
            C15708b.w(parcel, 8, this.f42138g, false);
            C15708b.w(parcel, 9, this.f42139h, false);
            C15708b.w(parcel, 10, this.f42140i, false);
            C15708b.w(parcel, 11, this.f42141j, false);
            C15708b.w(parcel, 12, this.f42142k, false);
            C15708b.w(parcel, 13, this.f42143l, false);
            C15708b.w(parcel, 14, this.f42144m, false);
            C15708b.w(parcel, 15, this.f42145n, false);
            C15708b.b(parcel, iA);
        }
    }

    public static class f extends AbstractC15707a {

        @RecentlyNonNull
        public static final Parcelable.Creator<f> CREATOR = new Xd.i();

        /* renamed from: a, reason: collision with root package name */
        public int f42146a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f42147b;

        /* renamed from: c, reason: collision with root package name */
        @RecentlyNonNull
        public String f42148c;

        /* renamed from: d, reason: collision with root package name */
        @RecentlyNonNull
        public String f42149d;

        public f() {
        }

        public f(int i10, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3) {
            this.f42146a = i10;
            this.f42147b = str;
            this.f42148c = str2;
            this.f42149d = str3;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15708b.a(parcel);
            C15708b.n(parcel, 2, this.f42146a);
            C15708b.w(parcel, 3, this.f42147b, false);
            C15708b.w(parcel, 4, this.f42148c, false);
            C15708b.w(parcel, 5, this.f42149d, false);
            C15708b.b(parcel, iA);
        }
    }

    public static class g extends AbstractC15707a {

        @RecentlyNonNull
        public static final Parcelable.Creator<g> CREATOR = new Xd.l();

        /* renamed from: a, reason: collision with root package name */
        public double f42150a;

        /* renamed from: b, reason: collision with root package name */
        public double f42151b;

        public g() {
        }

        public g(double d10, double d11) {
            this.f42150a = d10;
            this.f42151b = d11;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15708b.a(parcel);
            C15708b.i(parcel, 2, this.f42150a);
            C15708b.i(parcel, 3, this.f42151b);
            C15708b.b(parcel, iA);
        }
    }

    public static class h extends AbstractC15707a {

        @RecentlyNonNull
        public static final Parcelable.Creator<h> CREATOR = new Xd.k();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public String f42152a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f42153b;

        /* renamed from: c, reason: collision with root package name */
        @RecentlyNonNull
        public String f42154c;

        /* renamed from: d, reason: collision with root package name */
        @RecentlyNonNull
        public String f42155d;

        /* renamed from: e, reason: collision with root package name */
        @RecentlyNonNull
        public String f42156e;

        /* renamed from: f, reason: collision with root package name */
        @RecentlyNonNull
        public String f42157f;

        /* renamed from: g, reason: collision with root package name */
        @RecentlyNonNull
        public String f42158g;

        public h() {
        }

        public h(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, @RecentlyNonNull String str5, @RecentlyNonNull String str6, @RecentlyNonNull String str7) {
            this.f42152a = str;
            this.f42153b = str2;
            this.f42154c = str3;
            this.f42155d = str4;
            this.f42156e = str5;
            this.f42157f = str6;
            this.f42158g = str7;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15708b.a(parcel);
            C15708b.w(parcel, 2, this.f42152a, false);
            C15708b.w(parcel, 3, this.f42153b, false);
            C15708b.w(parcel, 4, this.f42154c, false);
            C15708b.w(parcel, 5, this.f42155d, false);
            C15708b.w(parcel, 6, this.f42156e, false);
            C15708b.w(parcel, 7, this.f42157f, false);
            C15708b.w(parcel, 8, this.f42158g, false);
            C15708b.b(parcel, iA);
        }
    }

    public static class i extends AbstractC15707a {

        @RecentlyNonNull
        public static final Parcelable.Creator<i> CREATOR = new n();

        /* renamed from: a, reason: collision with root package name */
        public int f42159a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f42160b;

        public i() {
        }

        public i(int i10, @RecentlyNonNull String str) {
            this.f42159a = i10;
            this.f42160b = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15708b.a(parcel);
            C15708b.n(parcel, 2, this.f42159a);
            C15708b.w(parcel, 3, this.f42160b, false);
            C15708b.b(parcel, iA);
        }
    }

    public static class j extends AbstractC15707a {

        @RecentlyNonNull
        public static final Parcelable.Creator<j> CREATOR = new m();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public String f42161a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f42162b;

        public j() {
        }

        public j(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this.f42161a = str;
            this.f42162b = str2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15708b.a(parcel);
            C15708b.w(parcel, 2, this.f42161a, false);
            C15708b.w(parcel, 3, this.f42162b, false);
            C15708b.b(parcel, iA);
        }
    }

    public static class k extends AbstractC15707a {

        @RecentlyNonNull
        public static final Parcelable.Creator<k> CREATOR = new p();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public String f42163a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f42164b;

        public k() {
        }

        public k(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this.f42163a = str;
            this.f42164b = str2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15708b.a(parcel);
            C15708b.w(parcel, 2, this.f42163a, false);
            C15708b.w(parcel, 3, this.f42164b, false);
            C15708b.b(parcel, iA);
        }
    }

    public static class l extends AbstractC15707a {

        @RecentlyNonNull
        public static final Parcelable.Creator<l> CREATOR = new o();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public String f42165a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f42166b;

        /* renamed from: c, reason: collision with root package name */
        public int f42167c;

        public l() {
        }

        public l(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i10) {
            this.f42165a = str;
            this.f42166b = str2;
            this.f42167c = i10;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15708b.a(parcel);
            C15708b.w(parcel, 2, this.f42165a, false);
            C15708b.w(parcel, 3, this.f42166b, false);
            C15708b.n(parcel, 4, this.f42167c);
            C15708b.b(parcel, iA);
        }
    }

    public a() {
    }

    public a(int i10, @RecentlyNonNull String str, @RecentlyNonNull String str2, int i11, @RecentlyNonNull Point[] pointArr, @RecentlyNonNull f fVar, @RecentlyNonNull i iVar, @RecentlyNonNull j jVar, @RecentlyNonNull l lVar, @RecentlyNonNull k kVar, @RecentlyNonNull g gVar, @RecentlyNonNull c cVar, @RecentlyNonNull d dVar, @RecentlyNonNull e eVar, @RecentlyNonNull byte[] bArr, boolean z10) {
        this.f42092a = i10;
        this.f42093b = str;
        this.f42106o = bArr;
        this.f42094c = str2;
        this.f42095d = i11;
        this.f42096e = pointArr;
        this.f42107p = z10;
        this.f42097f = fVar;
        this.f42098g = iVar;
        this.f42099h = jVar;
        this.f42100i = lVar;
        this.f42101j = kVar;
        this.f42102k = gVar;
        this.f42103l = cVar;
        this.f42104m = dVar;
        this.f42105n = eVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, this.f42092a);
        C15708b.w(parcel, 3, this.f42093b, false);
        C15708b.w(parcel, 4, this.f42094c, false);
        C15708b.n(parcel, 5, this.f42095d);
        C15708b.z(parcel, 6, this.f42096e, i10, false);
        C15708b.u(parcel, 7, this.f42097f, i10, false);
        C15708b.u(parcel, 8, this.f42098g, i10, false);
        C15708b.u(parcel, 9, this.f42099h, i10, false);
        C15708b.u(parcel, 10, this.f42100i, i10, false);
        C15708b.u(parcel, 11, this.f42101j, i10, false);
        C15708b.u(parcel, 12, this.f42102k, i10, false);
        C15708b.u(parcel, 13, this.f42103l, i10, false);
        C15708b.u(parcel, 14, this.f42104m, i10, false);
        C15708b.u(parcel, 15, this.f42105n, i10, false);
        C15708b.g(parcel, 16, this.f42106o, false);
        C15708b.c(parcel, 17, this.f42107p);
        C15708b.b(parcel, iA);
    }
}
