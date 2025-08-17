package Vd;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public class a extends AbstractC15136a {

    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new Vd.d();

    /* renamed from: a, reason: collision with root package name */
    public int f37380a;

    /* renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    public String f37381b;

    /* renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    public String f37382c;

    /* renamed from: d, reason: collision with root package name */
    public int f37383d;

    /* renamed from: e, reason: collision with root package name */
    @RecentlyNonNull
    public Point[] f37384e;

    /* renamed from: f, reason: collision with root package name */
    @RecentlyNonNull
    public f f37385f;

    /* renamed from: g, reason: collision with root package name */
    @RecentlyNonNull
    public i f37386g;

    /* renamed from: h, reason: collision with root package name */
    @RecentlyNonNull
    public j f37387h;

    /* renamed from: i, reason: collision with root package name */
    @RecentlyNonNull
    public l f37388i;

    /* renamed from: j, reason: collision with root package name */
    @RecentlyNonNull
    public k f37389j;

    /* renamed from: k, reason: collision with root package name */
    @RecentlyNonNull
    public g f37390k;

    /* renamed from: l, reason: collision with root package name */
    @RecentlyNonNull
    public c f37391l;

    /* renamed from: m, reason: collision with root package name */
    @RecentlyNonNull
    public d f37392m;

    /* renamed from: n, reason: collision with root package name */
    @RecentlyNonNull
    public e f37393n;

    /* renamed from: o, reason: collision with root package name */
    @RecentlyNonNull
    public byte[] f37394o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f37395p;

    /* renamed from: Vd.a$a, reason: collision with other inner class name */
    public static class C0808a extends AbstractC15136a {

        @RecentlyNonNull
        public static final Parcelable.Creator<C0808a> CREATOR = new Vd.c();

        /* renamed from: a, reason: collision with root package name */
        public int f37396a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String[] f37397b;

        public C0808a() {
        }

        public C0808a(int i10, @RecentlyNonNull String[] strArr) {
            this.f37396a = i10;
            this.f37397b = strArr;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15137b.a(parcel);
            C15137b.n(parcel, 2, this.f37396a);
            C15137b.x(parcel, 3, this.f37397b, false);
            C15137b.b(parcel, iA);
        }
    }

    public static class b extends AbstractC15136a {

        @RecentlyNonNull
        public static final Parcelable.Creator<b> CREATOR = new Vd.f();

        /* renamed from: a, reason: collision with root package name */
        public int f37398a;

        /* renamed from: b, reason: collision with root package name */
        public int f37399b;

        /* renamed from: c, reason: collision with root package name */
        public int f37400c;

        /* renamed from: d, reason: collision with root package name */
        public int f37401d;

        /* renamed from: e, reason: collision with root package name */
        public int f37402e;

        /* renamed from: f, reason: collision with root package name */
        public int f37403f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f37404g;

        /* renamed from: h, reason: collision with root package name */
        @RecentlyNonNull
        public String f37405h;

        public b() {
        }

        public b(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, @RecentlyNonNull String str) {
            this.f37398a = i10;
            this.f37399b = i11;
            this.f37400c = i12;
            this.f37401d = i13;
            this.f37402e = i14;
            this.f37403f = i15;
            this.f37404g = z10;
            this.f37405h = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15137b.a(parcel);
            C15137b.n(parcel, 2, this.f37398a);
            C15137b.n(parcel, 3, this.f37399b);
            C15137b.n(parcel, 4, this.f37400c);
            C15137b.n(parcel, 5, this.f37401d);
            C15137b.n(parcel, 6, this.f37402e);
            C15137b.n(parcel, 7, this.f37403f);
            C15137b.c(parcel, 8, this.f37404g);
            C15137b.w(parcel, 9, this.f37405h, false);
            C15137b.b(parcel, iA);
        }
    }

    public static class c extends AbstractC15136a {

        @RecentlyNonNull
        public static final Parcelable.Creator<c> CREATOR = new Vd.h();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public String f37406a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f37407b;

        /* renamed from: c, reason: collision with root package name */
        @RecentlyNonNull
        public String f37408c;

        /* renamed from: d, reason: collision with root package name */
        @RecentlyNonNull
        public String f37409d;

        /* renamed from: e, reason: collision with root package name */
        @RecentlyNonNull
        public String f37410e;

        /* renamed from: f, reason: collision with root package name */
        @RecentlyNonNull
        public b f37411f;

        /* renamed from: g, reason: collision with root package name */
        @RecentlyNonNull
        public b f37412g;

        public c() {
        }

        public c(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, @RecentlyNonNull String str5, @RecentlyNonNull b bVar, @RecentlyNonNull b bVar2) {
            this.f37406a = str;
            this.f37407b = str2;
            this.f37408c = str3;
            this.f37409d = str4;
            this.f37410e = str5;
            this.f37411f = bVar;
            this.f37412g = bVar2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15137b.a(parcel);
            C15137b.w(parcel, 2, this.f37406a, false);
            C15137b.w(parcel, 3, this.f37407b, false);
            C15137b.w(parcel, 4, this.f37408c, false);
            C15137b.w(parcel, 5, this.f37409d, false);
            C15137b.w(parcel, 6, this.f37410e, false);
            C15137b.u(parcel, 7, this.f37411f, i10, false);
            C15137b.u(parcel, 8, this.f37412g, i10, false);
            C15137b.b(parcel, iA);
        }
    }

    public static class d extends AbstractC15136a {

        @RecentlyNonNull
        public static final Parcelable.Creator<d> CREATOR = new Vd.g();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public h f37413a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f37414b;

        /* renamed from: c, reason: collision with root package name */
        @RecentlyNonNull
        public String f37415c;

        /* renamed from: d, reason: collision with root package name */
        @RecentlyNonNull
        public i[] f37416d;

        /* renamed from: e, reason: collision with root package name */
        @RecentlyNonNull
        public f[] f37417e;

        /* renamed from: f, reason: collision with root package name */
        @RecentlyNonNull
        public String[] f37418f;

        /* renamed from: g, reason: collision with root package name */
        @RecentlyNonNull
        public C0808a[] f37419g;

        public d() {
        }

        public d(@RecentlyNonNull h hVar, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull i[] iVarArr, @RecentlyNonNull f[] fVarArr, @RecentlyNonNull String[] strArr, @RecentlyNonNull C0808a[] c0808aArr) {
            this.f37413a = hVar;
            this.f37414b = str;
            this.f37415c = str2;
            this.f37416d = iVarArr;
            this.f37417e = fVarArr;
            this.f37418f = strArr;
            this.f37419g = c0808aArr;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15137b.a(parcel);
            C15137b.u(parcel, 2, this.f37413a, i10, false);
            C15137b.w(parcel, 3, this.f37414b, false);
            C15137b.w(parcel, 4, this.f37415c, false);
            C15137b.z(parcel, 5, this.f37416d, i10, false);
            C15137b.z(parcel, 6, this.f37417e, i10, false);
            C15137b.x(parcel, 7, this.f37418f, false);
            C15137b.z(parcel, 8, this.f37419g, i10, false);
            C15137b.b(parcel, iA);
        }
    }

    public static class e extends AbstractC15136a {

        @RecentlyNonNull
        public static final Parcelable.Creator<e> CREATOR = new Vd.j();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public String f37420a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f37421b;

        /* renamed from: c, reason: collision with root package name */
        @RecentlyNonNull
        public String f37422c;

        /* renamed from: d, reason: collision with root package name */
        @RecentlyNonNull
        public String f37423d;

        /* renamed from: e, reason: collision with root package name */
        @RecentlyNonNull
        public String f37424e;

        /* renamed from: f, reason: collision with root package name */
        @RecentlyNonNull
        public String f37425f;

        /* renamed from: g, reason: collision with root package name */
        @RecentlyNonNull
        public String f37426g;

        /* renamed from: h, reason: collision with root package name */
        @RecentlyNonNull
        public String f37427h;

        /* renamed from: i, reason: collision with root package name */
        @RecentlyNonNull
        public String f37428i;

        /* renamed from: j, reason: collision with root package name */
        @RecentlyNonNull
        public String f37429j;

        /* renamed from: k, reason: collision with root package name */
        @RecentlyNonNull
        public String f37430k;

        /* renamed from: l, reason: collision with root package name */
        @RecentlyNonNull
        public String f37431l;

        /* renamed from: m, reason: collision with root package name */
        @RecentlyNonNull
        public String f37432m;

        /* renamed from: n, reason: collision with root package name */
        @RecentlyNonNull
        public String f37433n;

        public e() {
        }

        public e(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, @RecentlyNonNull String str5, @RecentlyNonNull String str6, @RecentlyNonNull String str7, @RecentlyNonNull String str8, @RecentlyNonNull String str9, @RecentlyNonNull String str10, @RecentlyNonNull String str11, @RecentlyNonNull String str12, @RecentlyNonNull String str13, @RecentlyNonNull String str14) {
            this.f37420a = str;
            this.f37421b = str2;
            this.f37422c = str3;
            this.f37423d = str4;
            this.f37424e = str5;
            this.f37425f = str6;
            this.f37426g = str7;
            this.f37427h = str8;
            this.f37428i = str9;
            this.f37429j = str10;
            this.f37430k = str11;
            this.f37431l = str12;
            this.f37432m = str13;
            this.f37433n = str14;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15137b.a(parcel);
            C15137b.w(parcel, 2, this.f37420a, false);
            C15137b.w(parcel, 3, this.f37421b, false);
            C15137b.w(parcel, 4, this.f37422c, false);
            C15137b.w(parcel, 5, this.f37423d, false);
            C15137b.w(parcel, 6, this.f37424e, false);
            C15137b.w(parcel, 7, this.f37425f, false);
            C15137b.w(parcel, 8, this.f37426g, false);
            C15137b.w(parcel, 9, this.f37427h, false);
            C15137b.w(parcel, 10, this.f37428i, false);
            C15137b.w(parcel, 11, this.f37429j, false);
            C15137b.w(parcel, 12, this.f37430k, false);
            C15137b.w(parcel, 13, this.f37431l, false);
            C15137b.w(parcel, 14, this.f37432m, false);
            C15137b.w(parcel, 15, this.f37433n, false);
            C15137b.b(parcel, iA);
        }
    }

    public static class f extends AbstractC15136a {

        @RecentlyNonNull
        public static final Parcelable.Creator<f> CREATOR = new Vd.i();

        /* renamed from: a, reason: collision with root package name */
        public int f37434a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f37435b;

        /* renamed from: c, reason: collision with root package name */
        @RecentlyNonNull
        public String f37436c;

        /* renamed from: d, reason: collision with root package name */
        @RecentlyNonNull
        public String f37437d;

        public f() {
        }

        public f(int i10, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3) {
            this.f37434a = i10;
            this.f37435b = str;
            this.f37436c = str2;
            this.f37437d = str3;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15137b.a(parcel);
            C15137b.n(parcel, 2, this.f37434a);
            C15137b.w(parcel, 3, this.f37435b, false);
            C15137b.w(parcel, 4, this.f37436c, false);
            C15137b.w(parcel, 5, this.f37437d, false);
            C15137b.b(parcel, iA);
        }
    }

    public static class g extends AbstractC15136a {

        @RecentlyNonNull
        public static final Parcelable.Creator<g> CREATOR = new Vd.l();

        /* renamed from: a, reason: collision with root package name */
        public double f37438a;

        /* renamed from: b, reason: collision with root package name */
        public double f37439b;

        public g() {
        }

        public g(double d10, double d11) {
            this.f37438a = d10;
            this.f37439b = d11;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15137b.a(parcel);
            C15137b.i(parcel, 2, this.f37438a);
            C15137b.i(parcel, 3, this.f37439b);
            C15137b.b(parcel, iA);
        }
    }

    public static class h extends AbstractC15136a {

        @RecentlyNonNull
        public static final Parcelable.Creator<h> CREATOR = new Vd.k();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public String f37440a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f37441b;

        /* renamed from: c, reason: collision with root package name */
        @RecentlyNonNull
        public String f37442c;

        /* renamed from: d, reason: collision with root package name */
        @RecentlyNonNull
        public String f37443d;

        /* renamed from: e, reason: collision with root package name */
        @RecentlyNonNull
        public String f37444e;

        /* renamed from: f, reason: collision with root package name */
        @RecentlyNonNull
        public String f37445f;

        /* renamed from: g, reason: collision with root package name */
        @RecentlyNonNull
        public String f37446g;

        public h() {
        }

        public h(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, @RecentlyNonNull String str5, @RecentlyNonNull String str6, @RecentlyNonNull String str7) {
            this.f37440a = str;
            this.f37441b = str2;
            this.f37442c = str3;
            this.f37443d = str4;
            this.f37444e = str5;
            this.f37445f = str6;
            this.f37446g = str7;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15137b.a(parcel);
            C15137b.w(parcel, 2, this.f37440a, false);
            C15137b.w(parcel, 3, this.f37441b, false);
            C15137b.w(parcel, 4, this.f37442c, false);
            C15137b.w(parcel, 5, this.f37443d, false);
            C15137b.w(parcel, 6, this.f37444e, false);
            C15137b.w(parcel, 7, this.f37445f, false);
            C15137b.w(parcel, 8, this.f37446g, false);
            C15137b.b(parcel, iA);
        }
    }

    public static class i extends AbstractC15136a {

        @RecentlyNonNull
        public static final Parcelable.Creator<i> CREATOR = new n();

        /* renamed from: a, reason: collision with root package name */
        public int f37447a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f37448b;

        public i() {
        }

        public i(int i10, @RecentlyNonNull String str) {
            this.f37447a = i10;
            this.f37448b = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15137b.a(parcel);
            C15137b.n(parcel, 2, this.f37447a);
            C15137b.w(parcel, 3, this.f37448b, false);
            C15137b.b(parcel, iA);
        }
    }

    public static class j extends AbstractC15136a {

        @RecentlyNonNull
        public static final Parcelable.Creator<j> CREATOR = new m();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public String f37449a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f37450b;

        public j() {
        }

        public j(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this.f37449a = str;
            this.f37450b = str2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15137b.a(parcel);
            C15137b.w(parcel, 2, this.f37449a, false);
            C15137b.w(parcel, 3, this.f37450b, false);
            C15137b.b(parcel, iA);
        }
    }

    public static class k extends AbstractC15136a {

        @RecentlyNonNull
        public static final Parcelable.Creator<k> CREATOR = new p();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public String f37451a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f37452b;

        public k() {
        }

        public k(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this.f37451a = str;
            this.f37452b = str2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15137b.a(parcel);
            C15137b.w(parcel, 2, this.f37451a, false);
            C15137b.w(parcel, 3, this.f37452b, false);
            C15137b.b(parcel, iA);
        }
    }

    public static class l extends AbstractC15136a {

        @RecentlyNonNull
        public static final Parcelable.Creator<l> CREATOR = new o();

        /* renamed from: a, reason: collision with root package name */
        @RecentlyNonNull
        public String f37453a;

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        public String f37454b;

        /* renamed from: c, reason: collision with root package name */
        public int f37455c;

        public l() {
        }

        public l(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i10) {
            this.f37453a = str;
            this.f37454b = str2;
            this.f37455c = i10;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int iA = C15137b.a(parcel);
            C15137b.w(parcel, 2, this.f37453a, false);
            C15137b.w(parcel, 3, this.f37454b, false);
            C15137b.n(parcel, 4, this.f37455c);
            C15137b.b(parcel, iA);
        }
    }

    public a() {
    }

    public a(int i10, @RecentlyNonNull String str, @RecentlyNonNull String str2, int i11, @RecentlyNonNull Point[] pointArr, @RecentlyNonNull f fVar, @RecentlyNonNull i iVar, @RecentlyNonNull j jVar, @RecentlyNonNull l lVar, @RecentlyNonNull k kVar, @RecentlyNonNull g gVar, @RecentlyNonNull c cVar, @RecentlyNonNull d dVar, @RecentlyNonNull e eVar, @RecentlyNonNull byte[] bArr, boolean z10) {
        this.f37380a = i10;
        this.f37381b = str;
        this.f37394o = bArr;
        this.f37382c = str2;
        this.f37383d = i11;
        this.f37384e = pointArr;
        this.f37395p = z10;
        this.f37385f = fVar;
        this.f37386g = iVar;
        this.f37387h = jVar;
        this.f37388i = lVar;
        this.f37389j = kVar;
        this.f37390k = gVar;
        this.f37391l = cVar;
        this.f37392m = dVar;
        this.f37393n = eVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, this.f37380a);
        C15137b.w(parcel, 3, this.f37381b, false);
        C15137b.w(parcel, 4, this.f37382c, false);
        C15137b.n(parcel, 5, this.f37383d);
        C15137b.z(parcel, 6, this.f37384e, i10, false);
        C15137b.u(parcel, 7, this.f37385f, i10, false);
        C15137b.u(parcel, 8, this.f37386g, i10, false);
        C15137b.u(parcel, 9, this.f37387h, i10, false);
        C15137b.u(parcel, 10, this.f37388i, i10, false);
        C15137b.u(parcel, 11, this.f37389j, i10, false);
        C15137b.u(parcel, 12, this.f37390k, i10, false);
        C15137b.u(parcel, 13, this.f37391l, i10, false);
        C15137b.u(parcel, 14, this.f37392m, i10, false);
        C15137b.u(parcel, 15, this.f37393n, i10, false);
        C15137b.g(parcel, 16, this.f37394o, false);
        C15137b.c(parcel, 17, this.f37395p);
        C15137b.b(parcel, iA);
    }
}
