package ic;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: ic.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14713a implements Parcelable, Nb.a, Cloneable {

    /* renamed from: b, reason: collision with root package name */
    static final SimpleDateFormat f137669b;

    /* renamed from: a, reason: collision with root package name */
    private j f137670a = new j();

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
        C14713a c14713a = (C14713a) obj;
        j jVar = this.f137670a;
        if (jVar == null) {
            if (c14713a.f137670a != null) {
                return false;
            }
        } else if (!jVar.equals(c14713a.f137670a)) {
            return false;
        }
        return true;
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        f137669b = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    public void A(String str) {
        this.f137670a.A(str);
    }

    public void C(int i10) {
        this.f137670a.C(i10);
    }

    public void E(Long l10) {
        this.f137670a.D(l10);
    }

    public void F(String str) {
        this.f137670a.E(str);
    }

    public void G(int i10) {
        this.f137670a.F(Integer.valueOf(i10));
    }

    public void I(String str) {
        this.f137670a.G(str);
    }

    public void J(Byte b10) {
        this.f137670a.H(b10);
    }

    public int a() {
        return this.f137670a.b().intValue();
    }

    public String b() {
        return this.f137670a.e();
    }

    public String c() {
        return this.f137670a.f();
    }

    protected Object clone() {
        C14713a c14713a = new C14713a();
        c14713a.A(this.f137670a.k());
        c14713a.C(this.f137670a.l());
        c14713a.r(this.f137670a.c());
        c14713a.F(this.f137670a.n());
        c14713a.I(this.f137670a.p());
        c14713a.w(this.f137670a.g());
        c14713a.x(this.f137670a.i());
        c14713a.o(this.f137670a.a());
        c14713a.s(this.f137670a.d());
        c14713a.J(this.f137670a.q());
        c14713a.E(this.f137670a.m());
        c14713a.G(this.f137670a.o().intValue());
        c14713a.q(this.f137670a.b().intValue());
        c14713a.t(this.f137670a.e());
        c14713a.v(this.f137670a.f());
        c14713a.y(this.f137670a.j());
        return c14713a;
    }

    public String d() {
        return this.f137670a.g();
    }

    public String e() {
        return this.f137670a.i();
    }

    public Byte f() {
        return this.f137670a.j();
    }

    public String g() {
        return this.f137670a.k();
    }

    public int hashCode() {
        j jVar = this.f137670a;
        return (jVar == null ? 0 : jVar.hashCode()) + 31;
    }

    public int i() {
        return this.f137670a.l();
    }

    public String j() {
        return this.f137670a.n();
    }

    public int k() {
        return this.f137670a.o().intValue();
    }

    public Date n() {
        return this.f137670a.c();
    }

    public void o(String str) {
        this.f137670a.r(str);
    }

    public void q(int i10) {
        this.f137670a.s(Integer.valueOf(i10));
    }

    public void r(Date date) {
        this.f137670a.t(date);
    }

    public void s(String str) {
        this.f137670a.u(str);
    }

    public void t(String str) {
        this.f137670a.v(str);
    }

    public String toString() {
        return String.format("Sighting [payload=%s, rssi=%s, service_id=%s, time=%s, timezone=%s, latitude=%s, longitude=%s, accuracy=%s, fix_time=%s, version=%d, sequenceNumber=%d, temperature=%d, batteryLevel=%s, gen4MaskedData=%s, get4PacketVersion=%s]", this.f137670a.k(), Integer.valueOf(this.f137670a.l()), this.f137670a.n(), this.f137670a.c(), this.f137670a.p(), this.f137670a.g(), this.f137670a.i(), this.f137670a.a(), this.f137670a.d(), this.f137670a.q(), this.f137670a.m(), this.f137670a.o(), this.f137670a.b(), this.f137670a.e(), this.f137670a.f());
    }

    public void v(String str) {
        this.f137670a.w(str);
    }

    public void w(String str) {
        this.f137670a.x(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f137670a.k());
        parcel.writeInt(this.f137670a.l());
        parcel.writeSerializable(this.f137670a.c());
        parcel.writeString(this.f137670a.n());
        parcel.writeString(this.f137670a.p());
        parcel.writeString(this.f137670a.g());
        parcel.writeString(this.f137670a.i());
        parcel.writeString(this.f137670a.a());
        parcel.writeString(this.f137670a.d());
        parcel.writeByte(this.f137670a.q().byteValue());
        parcel.writeLong(this.f137670a.m().longValue());
        parcel.writeInt(this.f137670a.o().intValue());
        parcel.writeInt(this.f137670a.b().intValue());
        parcel.writeString(this.f137670a.e());
        parcel.writeString(this.f137670a.f());
        parcel.writeByte(this.f137670a.j().byteValue());
    }

    public void x(String str) {
        this.f137670a.y(str);
    }

    public void y(Byte b10) {
        this.f137670a.z(b10);
    }
}
