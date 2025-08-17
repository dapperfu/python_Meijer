package Va;

/* loaded from: classes4.dex */
public class c implements Nb.a {

    /* renamed from: a, reason: collision with root package name */
    private int f37015a;

    /* renamed from: b, reason: collision with root package name */
    private long f37016b;

    /* renamed from: c, reason: collision with root package name */
    private b f37017c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f37015a != cVar.f37015a) {
            return false;
        }
        b bVar = this.f37017c;
        if (bVar == null) {
            if (cVar.f37017c != null) {
                return false;
            }
        } else if (!bVar.equals(cVar.f37017c)) {
            return false;
        }
        return this.f37016b == cVar.f37016b;
    }

    public b a() {
        return this.f37017c;
    }

    public String toString() {
        return "BeaconSighting [RSSI=" + this.f37015a + ", date=" + this.f37016b + ", beacon=" + this.f37017c + "]";
    }
}
