package nc;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: nc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15930b implements Parcelable, Pb.a {
    public static final Parcelable.Creator<C15930b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private Long f152217a;

    /* renamed from: b, reason: collision with root package name */
    private String f152218b;

    /* renamed from: c, reason: collision with root package name */
    private String f152219c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f152220d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f152221e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f152222f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f152223g;

    /* renamed from: h, reason: collision with root package name */
    private String f152224h;

    /* renamed from: nc.b$a */
    static class a implements Parcelable.Creator<C15930b> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C15930b createFromParcel(Parcel parcel) {
            return new C15930b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C15930b[] newArray(int i10) {
            return new C15930b[i10];
        }

        a() {
        }
    }

    /* synthetic */ C15930b(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public C15930b() {
    }

    public Integer a() {
        return this.f152220d;
    }

    public Integer b() {
        return this.f152223g;
    }

    public Integer c() {
        return this.f152222f;
    }

    public Integer d() {
        return this.f152221e;
    }

    public Long e() {
        return this.f152217a;
    }

    public String f() {
        return this.f152218b;
    }

    public void g(Integer num) {
        this.f152220d = num;
    }

    public void h(Integer num) {
        this.f152223g = num;
    }

    public void i(Integer num) {
        this.f152222f = num;
    }

    public void j(Integer num) {
        this.f152221e = num;
    }

    public void k(Long l10) {
        this.f152217a = l10;
    }

    public void n(String str) {
        this.f152219c = str;
    }

    public void o(String str) {
        this.f152218b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f152217a.longValue());
        parcel.writeString(this.f152218b);
        parcel.writeString(this.f152219c);
        parcel.writeString(this.f152224h);
        parcel.writeInt(this.f152220d.intValue());
        parcel.writeInt(this.f152221e.intValue());
        parcel.writeInt(this.f152222f.intValue());
        parcel.writeInt(this.f152223g.intValue());
    }

    private C15930b(Parcel parcel) {
        this.f152217a = Long.valueOf(parcel.readLong());
        this.f152218b = parcel.readString();
        this.f152219c = parcel.readString();
        this.f152224h = parcel.readString();
        this.f152220d = Integer.valueOf(parcel.readInt());
        this.f152221e = Integer.valueOf(parcel.readInt());
        this.f152222f = Integer.valueOf(parcel.readInt());
        this.f152223g = Integer.valueOf(parcel.readInt());
    }
}
