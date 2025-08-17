package lc;

import Vb.a;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15395a implements Parcelable, Nb.a {
    public static final Parcelable.Creator<C15395a> CREATOR = new C2286a();

    /* renamed from: a, reason: collision with root package name */
    private Long f148804a;

    /* renamed from: b, reason: collision with root package name */
    private String f148805b;

    /* renamed from: c, reason: collision with root package name */
    private String f148806c;

    /* renamed from: d, reason: collision with root package name */
    private Long f148807d;

    /* renamed from: e, reason: collision with root package name */
    private Long f148808e;

    /* renamed from: f, reason: collision with root package name */
    private Long f148809f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f148810g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f148811h;

    /* renamed from: i, reason: collision with root package name */
    private Long f148812i;

    /* renamed from: j, reason: collision with root package name */
    private Long f148813j;

    /* renamed from: k, reason: collision with root package name */
    private double f148814k;

    /* renamed from: l, reason: collision with root package name */
    private double f148815l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f148816m;

    /* renamed from: n, reason: collision with root package name */
    private Integer f148817n;

    /* renamed from: o, reason: collision with root package name */
    private a.EnumC0807a f148818o;

    /* renamed from: p, reason: collision with root package name */
    private String f148819p;

    /* renamed from: lc.a$a, reason: collision with other inner class name */
    static class C2286a implements Parcelable.Creator<C15395a> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C15395a createFromParcel(Parcel parcel) {
            return new C15395a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C15395a[] newArray(int i10) {
            return new C15395a[i10];
        }

        C2286a() {
        }
    }

    /* synthetic */ C15395a(Parcel parcel, C2286a c2286a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C15395a() {
    }

    public void A(Integer num) {
        this.f148811h = num;
    }

    public void B(double d10) {
        this.f148814k = d10;
    }

    public void C(double d10) {
        this.f148815l = d10;
    }

    public void E(Long l10) {
        this.f148804a = l10;
    }

    public void F(String str) {
        this.f148806c = str;
    }

    public void G(String str) {
        this.f148819p = str;
    }

    public Long a() {
        return this.f148807d;
    }

    public Integer b() {
        return this.f148810g;
    }

    public String c() {
        return this.f148805b;
    }

    public a.EnumC0807a d() {
        return this.f148818o;
    }

    public Long e() {
        return this.f148809f;
    }

    public Long f() {
        return this.f148808e;
    }

    public Long g() {
        return this.f148813j;
    }

    public Long h() {
        return this.f148812i;
    }

    public double i() {
        return this.f148814k;
    }

    public double j() {
        return this.f148815l;
    }

    public Long k() {
        return this.f148804a;
    }

    public String n() {
        return this.f148806c;
    }

    public String o() {
        return this.f148819p;
    }

    public void q(Long l10) {
        this.f148807d = l10;
    }

    public void r(Integer num) {
        this.f148810g = num;
    }

    public void s(String str) {
        this.f148805b = str;
    }

    public void t(a.EnumC0807a enumC0807a) {
        this.f148818o = enumC0807a;
    }

    public void v(Long l10) {
        this.f148809f = l10;
    }

    public void w(Long l10) {
        this.f148808e = l10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f148804a.longValue());
        parcel.writeString(this.f148805b);
        parcel.writeString(this.f148806c);
        parcel.writeSerializable(this.f148807d);
        parcel.writeSerializable(this.f148808e);
        parcel.writeSerializable(this.f148809f);
        parcel.writeInt(this.f148810g.intValue());
        parcel.writeInt(this.f148811h.intValue());
        parcel.writeInt(this.f148816m.intValue());
        parcel.writeInt(this.f148817n.intValue());
        parcel.writeLong(this.f148812i.longValue());
        parcel.writeLong(this.f148813j.longValue());
        parcel.writeDouble(this.f148814k);
        parcel.writeDouble(this.f148815l);
        parcel.writeString(this.f148819p);
    }

    public void x(Long l10) {
        this.f148813j = l10;
    }

    public void y(Long l10) {
        this.f148812i = l10;
    }

    private C15395a(Parcel parcel) {
        this.f148804a = Long.valueOf(parcel.readLong());
        this.f148805b = parcel.readString();
        this.f148806c = parcel.readString();
        this.f148807d = Long.valueOf(parcel.readLong());
        this.f148808e = Long.valueOf(parcel.readLong());
        this.f148809f = Long.valueOf(parcel.readLong());
        this.f148810g = Integer.valueOf(parcel.readInt());
        this.f148811h = Integer.valueOf(parcel.readInt());
        this.f148812i = Long.valueOf(parcel.readLong());
        this.f148813j = Long.valueOf(parcel.readLong());
        this.f148814k = parcel.readDouble();
        this.f148815l = parcel.readDouble();
        this.f148816m = Integer.valueOf(parcel.readInt());
        this.f148817n = Integer.valueOf(parcel.readInt());
        this.f148819p = parcel.readString();
    }
}
