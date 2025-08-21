package nc;

import Xb.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: nc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15931c implements Parcelable, Pb.a {
    public static final Parcelable.Creator<C15931c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f152225a;

    /* renamed from: b, reason: collision with root package name */
    private String f152226b;

    /* renamed from: c, reason: collision with root package name */
    private String f152227c;

    /* renamed from: d, reason: collision with root package name */
    private String f152228d;

    /* renamed from: e, reason: collision with root package name */
    private String f152229e;

    /* renamed from: f, reason: collision with root package name */
    private int f152230f;

    /* renamed from: g, reason: collision with root package name */
    private int f152231g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f152232h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f152233i;

    /* renamed from: j, reason: collision with root package name */
    private List<C15930b> f152234j;

    /* renamed from: k, reason: collision with root package name */
    private a.EnumC0897a f152235k;

    /* renamed from: nc.c$a */
    static class a implements Parcelable.Creator<C15931c> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C15931c createFromParcel(Parcel parcel) {
            return new C15931c(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C15931c[] newArray(int i10) {
            return new C15931c[i10];
        }

        a() {
        }
    }

    /* synthetic */ C15931c(Parcel parcel, a aVar) {
        this(parcel);
    }

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
        C15931c c15931c = (C15931c) obj;
        if (this.f152230f != c15931c.f152230f) {
            return false;
        }
        String str = this.f152229e;
        if (str == null) {
            if (c15931c.f152229e != null) {
                return false;
            }
        } else if (!str.equals(c15931c.f152229e)) {
            return false;
        }
        String str2 = this.f152225a;
        if (str2 == null) {
            if (c15931c.f152225a != null) {
                return false;
            }
        } else if (!str2.equals(c15931c.f152225a)) {
            return false;
        }
        String str3 = this.f152226b;
        if (str3 == null) {
            if (c15931c.f152226b != null) {
                return false;
            }
        } else if (!str3.equals(c15931c.f152226b)) {
            return false;
        }
        String str4 = this.f152227c;
        if (str4 == null) {
            if (c15931c.f152227c != null) {
                return false;
            }
        } else if (!str4.equals(c15931c.f152227c)) {
            return false;
        }
        String str5 = this.f152228d;
        if (str5 == null) {
            if (c15931c.f152228d != null) {
                return false;
            }
        } else if (!str5.equals(c15931c.f152228d)) {
            return false;
        }
        List<C15930b> list = this.f152234j;
        if (list == null) {
            if (c15931c.f152234j != null) {
                return false;
            }
        } else if (!list.equals(c15931c.f152234j)) {
            return false;
        }
        return this.f152231g == c15931c.f152231g;
    }

    public C15931c() {
    }

    public int a() {
        return this.f152230f;
    }

    public String b() {
        return this.f152229e;
    }

    public String c() {
        return this.f152225a;
    }

    public Integer d() {
        return this.f152232h;
    }

    public Integer e() {
        return this.f152233i;
    }

    public List<C15930b> f() {
        return this.f152234j;
    }

    public int g() {
        return this.f152231g;
    }

    public String getName() {
        return this.f152227c;
    }

    public String h() {
        return this.f152226b;
    }

    public int hashCode() {
        int i10 = (this.f152230f + 31) * 31;
        String str = this.f152229e;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f152225a;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f152226b;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f152227c;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f152228d;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<C15930b> list = this.f152234j;
        return ((iHashCode5 + (list != null ? list.hashCode() : 0)) * 31) + this.f152231g;
    }

    public void j(a.EnumC0897a enumC0897a) {
        this.f152235k = enumC0897a;
    }

    public void k(String str) {
        this.f152225a = str;
    }

    public void n(Integer num) {
        this.f152232h = num;
    }

    public void o(Integer num) {
        this.f152233i = num;
    }

    public void q(String str) {
        this.f152227c = str;
    }

    public void r(String str) {
        this.f152228d = str;
    }

    public void s(List<C15930b> list) {
        this.f152234j = list;
    }

    public String toString() {
        return "TransmitterInternal [identifier=" + this.f152225a + ", uuid=" + this.f152226b + ", name=" + this.f152227c + ", ownerId=" + this.f152228d + ", iconUrl=" + this.f152229e + ", battery=" + this.f152230f + ", temperature=" + this.f152231g + ", places=" + this.f152234j + "]";
    }

    public void v(String str) {
        this.f152226b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f152225a);
        parcel.writeString(this.f152227c);
        parcel.writeString(this.f152228d);
        parcel.writeString(this.f152229e);
        parcel.writeInt(this.f152230f);
        parcel.writeInt(this.f152231g);
        parcel.writeTypedList(f());
        parcel.writeString(this.f152226b);
        parcel.writeInt(d().intValue());
        parcel.writeInt(e().intValue());
    }

    private C15931c(Parcel parcel) {
        this.f152225a = parcel.readString();
        this.f152227c = parcel.readString();
        this.f152228d = parcel.readString();
        this.f152229e = parcel.readString();
        this.f152230f = parcel.readInt();
        this.f152231g = parcel.readInt();
        parcel.readTypedList(f(), C15930b.CREATOR);
        this.f152226b = parcel.readString();
        n(Integer.valueOf(parcel.readInt()));
        o(Integer.valueOf(parcel.readInt()));
    }

    public void i(Integer num) {
        this.f152230f = num.intValue();
    }

    public void t(Integer num) {
        this.f152231g = num.intValue();
    }
}
