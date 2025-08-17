package lc;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15396b implements Parcelable, Nb.a {
    public static final Parcelable.Creator<C15396b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private Long f148820a;

    /* renamed from: b, reason: collision with root package name */
    private String f148821b;

    /* renamed from: c, reason: collision with root package name */
    private String f148822c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f148823d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f148824e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f148825f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f148826g;

    /* renamed from: h, reason: collision with root package name */
    private String f148827h;

    /* renamed from: lc.b$a */
    static class a implements Parcelable.Creator<C15396b> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C15396b createFromParcel(Parcel parcel) {
            return new C15396b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C15396b[] newArray(int i10) {
            return new C15396b[i10];
        }

        a() {
        }
    }

    /* synthetic */ C15396b(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C15396b() {
    }

    public Integer a() {
        return this.f148823d;
    }

    public Integer b() {
        return this.f148826g;
    }

    public Integer c() {
        return this.f148825f;
    }

    public Integer d() {
        return this.f148824e;
    }

    public Long e() {
        return this.f148820a;
    }

    public String f() {
        return this.f148821b;
    }

    public void g(Integer num) {
        this.f148823d = num;
    }

    public void h(Integer num) {
        this.f148826g = num;
    }

    public void i(Integer num) {
        this.f148825f = num;
    }

    public void j(Integer num) {
        this.f148824e = num;
    }

    public void k(Long l10) {
        this.f148820a = l10;
    }

    public void n(String str) {
        this.f148822c = str;
    }

    public void o(String str) {
        this.f148821b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f148820a.longValue());
        parcel.writeString(this.f148821b);
        parcel.writeString(this.f148822c);
        parcel.writeString(this.f148827h);
        parcel.writeInt(this.f148823d.intValue());
        parcel.writeInt(this.f148824e.intValue());
        parcel.writeInt(this.f148825f.intValue());
        parcel.writeInt(this.f148826g.intValue());
    }

    private C15396b(Parcel parcel) {
        this.f148820a = Long.valueOf(parcel.readLong());
        this.f148821b = parcel.readString();
        this.f148822c = parcel.readString();
        this.f148827h = parcel.readString();
        this.f148823d = Integer.valueOf(parcel.readInt());
        this.f148824e = Integer.valueOf(parcel.readInt());
        this.f148825f = Integer.valueOf(parcel.readInt());
        this.f148826g = Integer.valueOf(parcel.readInt());
    }
}
