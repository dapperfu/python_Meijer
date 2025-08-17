package lc;

import Vb.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: lc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15397c implements Parcelable, Nb.a {
    public static final Parcelable.Creator<C15397c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f148828a;

    /* renamed from: b, reason: collision with root package name */
    private String f148829b;

    /* renamed from: c, reason: collision with root package name */
    private String f148830c;

    /* renamed from: d, reason: collision with root package name */
    private String f148831d;

    /* renamed from: e, reason: collision with root package name */
    private String f148832e;

    /* renamed from: f, reason: collision with root package name */
    private int f148833f;

    /* renamed from: g, reason: collision with root package name */
    private int f148834g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f148835h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f148836i;

    /* renamed from: j, reason: collision with root package name */
    private List<C15396b> f148837j;

    /* renamed from: k, reason: collision with root package name */
    private a.EnumC0807a f148838k;

    /* renamed from: lc.c$a */
    static class a implements Parcelable.Creator<C15397c> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ C15397c createFromParcel(Parcel parcel) {
            return new C15397c(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ C15397c[] newArray(int i10) {
            return new C15397c[i10];
        }

        a() {
        }
    }

    /* synthetic */ C15397c(Parcel parcel, a aVar) {
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
        C15397c c15397c = (C15397c) obj;
        if (this.f148833f != c15397c.f148833f) {
            return false;
        }
        String str = this.f148832e;
        if (str == null) {
            if (c15397c.f148832e != null) {
                return false;
            }
        } else if (!str.equals(c15397c.f148832e)) {
            return false;
        }
        String str2 = this.f148828a;
        if (str2 == null) {
            if (c15397c.f148828a != null) {
                return false;
            }
        } else if (!str2.equals(c15397c.f148828a)) {
            return false;
        }
        String str3 = this.f148829b;
        if (str3 == null) {
            if (c15397c.f148829b != null) {
                return false;
            }
        } else if (!str3.equals(c15397c.f148829b)) {
            return false;
        }
        String str4 = this.f148830c;
        if (str4 == null) {
            if (c15397c.f148830c != null) {
                return false;
            }
        } else if (!str4.equals(c15397c.f148830c)) {
            return false;
        }
        String str5 = this.f148831d;
        if (str5 == null) {
            if (c15397c.f148831d != null) {
                return false;
            }
        } else if (!str5.equals(c15397c.f148831d)) {
            return false;
        }
        List<C15396b> list = this.f148837j;
        if (list == null) {
            if (c15397c.f148837j != null) {
                return false;
            }
        } else if (!list.equals(c15397c.f148837j)) {
            return false;
        }
        return this.f148834g == c15397c.f148834g;
    }

    public C15397c() {
    }

    public int a() {
        return this.f148833f;
    }

    public String b() {
        return this.f148832e;
    }

    public String c() {
        return this.f148828a;
    }

    public Integer d() {
        return this.f148835h;
    }

    public Integer e() {
        return this.f148836i;
    }

    public List<C15396b> f() {
        return this.f148837j;
    }

    public int g() {
        return this.f148834g;
    }

    public String getName() {
        return this.f148830c;
    }

    public String h() {
        return this.f148829b;
    }

    public int hashCode() {
        int i10 = (this.f148833f + 31) * 31;
        String str = this.f148832e;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f148828a;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f148829b;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f148830c;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f148831d;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<C15396b> list = this.f148837j;
        return ((iHashCode5 + (list != null ? list.hashCode() : 0)) * 31) + this.f148834g;
    }

    public void j(a.EnumC0807a enumC0807a) {
        this.f148838k = enumC0807a;
    }

    public void k(String str) {
        this.f148828a = str;
    }

    public void n(Integer num) {
        this.f148835h = num;
    }

    public void o(Integer num) {
        this.f148836i = num;
    }

    public void q(String str) {
        this.f148830c = str;
    }

    public void r(String str) {
        this.f148831d = str;
    }

    public void s(List<C15396b> list) {
        this.f148837j = list;
    }

    public String toString() {
        return "TransmitterInternal [identifier=" + this.f148828a + ", uuid=" + this.f148829b + ", name=" + this.f148830c + ", ownerId=" + this.f148831d + ", iconUrl=" + this.f148832e + ", battery=" + this.f148833f + ", temperature=" + this.f148834g + ", places=" + this.f148837j + "]";
    }

    public void v(String str) {
        this.f148829b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f148828a);
        parcel.writeString(this.f148830c);
        parcel.writeString(this.f148831d);
        parcel.writeString(this.f148832e);
        parcel.writeInt(this.f148833f);
        parcel.writeInt(this.f148834g);
        parcel.writeTypedList(f());
        parcel.writeString(this.f148829b);
        parcel.writeInt(d().intValue());
        parcel.writeInt(e().intValue());
    }

    private C15397c(Parcel parcel) {
        this.f148828a = parcel.readString();
        this.f148830c = parcel.readString();
        this.f148831d = parcel.readString();
        this.f148832e = parcel.readString();
        this.f148833f = parcel.readInt();
        this.f148834g = parcel.readInt();
        parcel.readTypedList(f(), C15396b.CREATOR);
        this.f148829b = parcel.readString();
        n(Integer.valueOf(parcel.readInt()));
        o(Integer.valueOf(parcel.readInt()));
    }

    public void i(Integer num) {
        this.f148833f = num.intValue();
    }

    public void t(Integer num) {
        this.f148834g = num.intValue();
    }
}
