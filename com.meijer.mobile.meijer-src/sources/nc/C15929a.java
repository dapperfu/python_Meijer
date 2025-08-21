package nc;

import Xb.a;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: nc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15929a implements Parcelable, Pb.a {
    public static final Parcelable.Creator<C15929a> CREATOR = new C2353a();

    /* renamed from: a, reason: collision with root package name */
    private Long f152201a;

    /* renamed from: b, reason: collision with root package name */
    private String f152202b;

    /* renamed from: c, reason: collision with root package name */
    private String f152203c;

    /* renamed from: d, reason: collision with root package name */
    private Long f152204d;

    /* renamed from: e, reason: collision with root package name */
    private Long f152205e;

    /* renamed from: f, reason: collision with root package name */
    private Long f152206f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f152207g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f152208h;

    /* renamed from: i, reason: collision with root package name */
    private Long f152209i;

    /* renamed from: j, reason: collision with root package name */
    private Long f152210j;

    /* renamed from: k, reason: collision with root package name */
    private double f152211k;

    /* renamed from: l, reason: collision with root package name */
    private double f152212l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f152213m;

    /* renamed from: n, reason: collision with root package name */
    private Integer f152214n;

    /* renamed from: o, reason: collision with root package name */
    private a.EnumC0897a f152215o;

    /* renamed from: p, reason: collision with root package name */
    private String f152216p;

    /* renamed from: nc.a$a, reason: collision with other inner class name */
    static class C2353a implements Parcelable.Creator<C15929a> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C15929a createFromParcel(Parcel parcel) {
            return new C15929a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C15929a[] newArray(int i10) {
            return new C15929a[i10];
        }

        C2353a() {
        }
    }

    /* synthetic */ C15929a(Parcel parcel, C2353a c2353a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C15929a() {
    }

    public void A(Integer num) {
        this.f152208h = num;
    }

    public void B(double d10) {
        this.f152211k = d10;
    }

    public void C(double d10) {
        this.f152212l = d10;
    }

    public void E(Long l10) {
        this.f152201a = l10;
    }

    public void F(String str) {
        this.f152203c = str;
    }

    public void G(String str) {
        this.f152216p = str;
    }

    public Long a() {
        return this.f152204d;
    }

    public Integer b() {
        return this.f152207g;
    }

    public String c() {
        return this.f152202b;
    }

    public a.EnumC0897a d() {
        return this.f152215o;
    }

    public Long e() {
        return this.f152206f;
    }

    public Long f() {
        return this.f152205e;
    }

    public Long g() {
        return this.f152210j;
    }

    public Long h() {
        return this.f152209i;
    }

    public double i() {
        return this.f152211k;
    }

    public double j() {
        return this.f152212l;
    }

    public Long k() {
        return this.f152201a;
    }

    public String n() {
        return this.f152203c;
    }

    public String o() {
        return this.f152216p;
    }

    public void q(Long l10) {
        this.f152204d = l10;
    }

    public void r(Integer num) {
        this.f152207g = num;
    }

    public void s(String str) {
        this.f152202b = str;
    }

    public void t(a.EnumC0897a enumC0897a) {
        this.f152215o = enumC0897a;
    }

    public void v(Long l10) {
        this.f152206f = l10;
    }

    public void w(Long l10) {
        this.f152205e = l10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f152201a.longValue());
        parcel.writeString(this.f152202b);
        parcel.writeString(this.f152203c);
        parcel.writeSerializable(this.f152204d);
        parcel.writeSerializable(this.f152205e);
        parcel.writeSerializable(this.f152206f);
        parcel.writeInt(this.f152207g.intValue());
        parcel.writeInt(this.f152208h.intValue());
        parcel.writeInt(this.f152213m.intValue());
        parcel.writeInt(this.f152214n.intValue());
        parcel.writeLong(this.f152209i.longValue());
        parcel.writeLong(this.f152210j.longValue());
        parcel.writeDouble(this.f152211k);
        parcel.writeDouble(this.f152212l);
        parcel.writeString(this.f152216p);
    }

    public void x(Long l10) {
        this.f152210j = l10;
    }

    public void y(Long l10) {
        this.f152209i = l10;
    }

    private C15929a(Parcel parcel) {
        this.f152201a = Long.valueOf(parcel.readLong());
        this.f152202b = parcel.readString();
        this.f152203c = parcel.readString();
        this.f152204d = Long.valueOf(parcel.readLong());
        this.f152205e = Long.valueOf(parcel.readLong());
        this.f152206f = Long.valueOf(parcel.readLong());
        this.f152207g = Integer.valueOf(parcel.readInt());
        this.f152208h = Integer.valueOf(parcel.readInt());
        this.f152209i = Long.valueOf(parcel.readLong());
        this.f152210j = Long.valueOf(parcel.readLong());
        this.f152211k = parcel.readDouble();
        this.f152212l = parcel.readDouble();
        this.f152213m = Integer.valueOf(parcel.readInt());
        this.f152214n = Integer.valueOf(parcel.readInt());
        this.f152216p = parcel.readString();
    }
}
