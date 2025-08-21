package kc;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: kc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15116a implements Parcelable, Pb.a, Cloneable {

    /* renamed from: b, reason: collision with root package name */
    static final SimpleDateFormat f141758b;

    /* renamed from: a, reason: collision with root package name */
    private j f141759a = new j();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15116a c15116a = (C15116a) obj;
        j jVar = this.f141759a;
        if (jVar == null) {
            if (c15116a.f141759a != null) {
                return false;
            }
        } else if (!jVar.equals(c15116a.f141759a)) {
            return false;
        }
        return true;
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        f141758b = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    public void A(String str) {
        this.f141759a.A(str);
    }

    public void C(int i10) {
        this.f141759a.C(i10);
    }

    public void E(Long l10) {
        this.f141759a.D(l10);
    }

    public void F(String str) {
        this.f141759a.E(str);
    }

    public void G(int i10) {
        this.f141759a.F(Integer.valueOf(i10));
    }

    public void I(String str) {
        this.f141759a.G(str);
    }

    public void J(Byte b10) {
        this.f141759a.H(b10);
    }

    public int a() {
        return this.f141759a.b().intValue();
    }

    public String b() {
        return this.f141759a.e();
    }

    public String c() {
        return this.f141759a.f();
    }

    protected Object clone() {
        C15116a c15116a = new C15116a();
        c15116a.A(this.f141759a.k());
        c15116a.C(this.f141759a.l());
        c15116a.r(this.f141759a.c());
        c15116a.F(this.f141759a.n());
        c15116a.I(this.f141759a.p());
        c15116a.w(this.f141759a.g());
        c15116a.x(this.f141759a.i());
        c15116a.o(this.f141759a.a());
        c15116a.s(this.f141759a.d());
        c15116a.J(this.f141759a.q());
        c15116a.E(this.f141759a.m());
        c15116a.G(this.f141759a.o().intValue());
        c15116a.q(this.f141759a.b().intValue());
        c15116a.t(this.f141759a.e());
        c15116a.v(this.f141759a.f());
        c15116a.y(this.f141759a.j());
        return c15116a;
    }

    public String d() {
        return this.f141759a.g();
    }

    public String e() {
        return this.f141759a.i();
    }

    public Byte f() {
        return this.f141759a.j();
    }

    public String g() {
        return this.f141759a.k();
    }

    public int hashCode() {
        j jVar = this.f141759a;
        return (jVar == null ? 0 : jVar.hashCode()) + 31;
    }

    public int i() {
        return this.f141759a.l();
    }

    public String j() {
        return this.f141759a.n();
    }

    public int k() {
        return this.f141759a.o().intValue();
    }

    public Date n() {
        return this.f141759a.c();
    }

    public void o(String str) {
        this.f141759a.r(str);
    }

    public void q(int i10) {
        this.f141759a.s(Integer.valueOf(i10));
    }

    public void r(Date date) {
        this.f141759a.t(date);
    }

    public void s(String str) {
        this.f141759a.u(str);
    }

    public void t(String str) {
        this.f141759a.v(str);
    }

    public String toString() {
        return String.format("Sighting [payload=%s, rssi=%s, service_id=%s, time=%s, timezone=%s, latitude=%s, longitude=%s, accuracy=%s, fix_time=%s, version=%d, sequenceNumber=%d, temperature=%d, batteryLevel=%s, gen4MaskedData=%s, get4PacketVersion=%s]", this.f141759a.k(), Integer.valueOf(this.f141759a.l()), this.f141759a.n(), this.f141759a.c(), this.f141759a.p(), this.f141759a.g(), this.f141759a.i(), this.f141759a.a(), this.f141759a.d(), this.f141759a.q(), this.f141759a.m(), this.f141759a.o(), this.f141759a.b(), this.f141759a.e(), this.f141759a.f());
    }

    public void v(String str) {
        this.f141759a.w(str);
    }

    public void w(String str) {
        this.f141759a.x(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f141759a.k());
        parcel.writeInt(this.f141759a.l());
        parcel.writeSerializable(this.f141759a.c());
        parcel.writeString(this.f141759a.n());
        parcel.writeString(this.f141759a.p());
        parcel.writeString(this.f141759a.g());
        parcel.writeString(this.f141759a.i());
        parcel.writeString(this.f141759a.a());
        parcel.writeString(this.f141759a.d());
        parcel.writeByte(this.f141759a.q().byteValue());
        parcel.writeLong(this.f141759a.m().longValue());
        parcel.writeInt(this.f141759a.o().intValue());
        parcel.writeInt(this.f141759a.b().intValue());
        parcel.writeString(this.f141759a.e());
        parcel.writeString(this.f141759a.f());
        parcel.writeByte(this.f141759a.j().byteValue());
    }

    public void x(String str) {
        this.f141759a.y(str);
    }

    public void y(Byte b10) {
        this.f141759a.z(b10);
    }
}
