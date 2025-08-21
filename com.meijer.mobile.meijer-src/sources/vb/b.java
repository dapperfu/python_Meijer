package vb;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;

/* loaded from: classes4.dex */
public class b extends kc.j implements Pb.a, Cloneable {

    /* renamed from: x, reason: collision with root package name */
    static final SimpleDateFormat f165716x;

    /* renamed from: q, reason: collision with root package name */
    private String f165717q;

    /* renamed from: r, reason: collision with root package name */
    private String f165718r;

    /* renamed from: s, reason: collision with root package name */
    private int f165719s;

    /* renamed from: t, reason: collision with root package name */
    private int f165720t;

    /* renamed from: u, reason: collision with root package name */
    private int f165721u;

    /* renamed from: v, reason: collision with root package name */
    private long f165722v;

    /* renamed from: w, reason: collision with root package name */
    private String f165723w;

    @Override // kc.j
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f165717q;
        if (str == null) {
            if (bVar.f165717q != null) {
                return false;
            }
        } else if (!str.equals(bVar.f165717q)) {
            return false;
        }
        if (this.f165719s != bVar.f165719s || J() != bVar.J() || this.f165720t != bVar.f165720t) {
            return false;
        }
        String str2 = this.f165718r;
        if (str2 == null) {
            if (bVar.f165718r != null) {
                return false;
            }
        } else if (!str2.equals(bVar.f165718r)) {
            return false;
        }
        return true;
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        f165716x = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    public int I() {
        return this.f165719s;
    }

    public int J() {
        return this.f165721u;
    }

    public int K() {
        return this.f165720t;
    }

    public String L() {
        return this.f165718r;
    }

    public void M(String str) {
        this.f165717q = str;
    }

    public void N(int i10) {
        this.f165719s = i10;
    }

    public void O(int i10) {
        this.f165721u = i10;
    }

    public void P(int i10) {
        this.f165720t = i10;
    }

    public void Q(String str) {
        this.f165723w = str;
    }

    public void R(long j10) {
        this.f165722v = j10;
    }

    public void S(String str) {
        this.f165718r = str;
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
            bVar.Q(f165716x.format(c()));
        }
        return bVar;
    }

    public String toString() {
        return "SightingiBeacon [identifier=" + this.f165717q + ", uuid=" + this.f165718r + ", major=" + this.f165719s + ", minor=" + this.f165720t + ", measuredPower=" + this.f165721u + ", sightingTimeInMillis=" + this.f165722v + ", sightingTimeAsDate=" + this.f165723w + "]";
    }

    @Override // kc.j
    public int hashCode() {
        int iHashCode;
        int iHashCode2 = super.hashCode() * 31;
        String str = this.f165717q;
        int iHashCode3 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iJ = (((((((iHashCode2 + iHashCode) * 31) + this.f165719s) * 31) + J()) * 31) + this.f165720t) * 31;
        String str2 = this.f165718r;
        if (str2 != null) {
            iHashCode3 = str2.hashCode();
        }
        return iJ + iHashCode3;
    }
}
