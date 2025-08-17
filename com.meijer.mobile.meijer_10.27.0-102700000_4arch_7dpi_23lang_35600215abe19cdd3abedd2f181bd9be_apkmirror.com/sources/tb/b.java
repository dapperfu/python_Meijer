package tb;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;

/* loaded from: classes4.dex */
public class b extends ic.j implements Nb.a, Cloneable {

    /* renamed from: x, reason: collision with root package name */
    static final SimpleDateFormat f161538x;

    /* renamed from: q, reason: collision with root package name */
    private String f161539q;

    /* renamed from: r, reason: collision with root package name */
    private String f161540r;

    /* renamed from: s, reason: collision with root package name */
    private int f161541s;

    /* renamed from: t, reason: collision with root package name */
    private int f161542t;

    /* renamed from: u, reason: collision with root package name */
    private int f161543u;

    /* renamed from: v, reason: collision with root package name */
    private long f161544v;

    /* renamed from: w, reason: collision with root package name */
    private String f161545w;

    @Override // ic.j
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f161539q;
        if (str == null) {
            if (bVar.f161539q != null) {
                return false;
            }
        } else if (!str.equals(bVar.f161539q)) {
            return false;
        }
        if (this.f161541s != bVar.f161541s || J() != bVar.J() || this.f161542t != bVar.f161542t) {
            return false;
        }
        String str2 = this.f161540r;
        if (str2 == null) {
            if (bVar.f161540r != null) {
                return false;
            }
        } else if (!str2.equals(bVar.f161540r)) {
            return false;
        }
        return true;
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        f161538x = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    public int I() {
        return this.f161541s;
    }

    public int J() {
        return this.f161543u;
    }

    public int K() {
        return this.f161542t;
    }

    public String L() {
        return this.f161540r;
    }

    public void M(String str) {
        this.f161539q = str;
    }

    public void N(int i10) {
        this.f161541s = i10;
    }

    public void O(int i10) {
        this.f161543u = i10;
    }

    public void P(int i10) {
        this.f161542t = i10;
    }

    public void Q(String str) {
        this.f161545w = str;
    }

    public void R(long j10) {
        this.f161544v = j10;
    }

    public void S(String str) {
        this.f161540r = str;
    }

    protected Object clone() {
        b bVar = new b();
        bVar.x(g());
        bVar.y(i());
        bVar.r(a());
        bVar.u(d());
        bVar.C(l());
        bVar.S(L());
        bVar.N(I());
        bVar.P(K());
        bVar.O(J());
        bVar.G(p());
        if (c() != null) {
            bVar.R(c().getTime());
            bVar.Q(f161538x.format(c()));
        }
        return bVar;
    }

    public String toString() {
        return "SightingiBeacon [identifier=" + this.f161539q + ", uuid=" + this.f161540r + ", major=" + this.f161541s + ", minor=" + this.f161542t + ", measuredPower=" + this.f161543u + ", sightingTimeInMillis=" + this.f161544v + ", sightingTimeAsDate=" + this.f161545w + "]";
    }

    @Override // ic.j
    public int hashCode() {
        int iHashCode;
        int iHashCode2 = super.hashCode() * 31;
        String str = this.f161539q;
        int iHashCode3 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iJ = (((((((iHashCode2 + iHashCode) * 31) + this.f161541s) * 31) + J()) * 31) + this.f161542t) * 31;
        String str2 = this.f161540r;
        if (str2 != null) {
            iHashCode3 = str2.hashCode();
        }
        return iJ + iHashCode3;
    }
}
