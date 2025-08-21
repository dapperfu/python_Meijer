package Xa;

/* loaded from: classes4.dex */
public class c implements Pb.a {

    /* renamed from: a, reason: collision with root package name */
    private int f41727a;

    /* renamed from: b, reason: collision with root package name */
    private long f41728b;

    /* renamed from: c, reason: collision with root package name */
    private b f41729c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f41727a != cVar.f41727a) {
            return false;
        }
        b bVar = this.f41729c;
        if (bVar == null) {
            if (cVar.f41729c != null) {
                return false;
            }
        } else if (!bVar.equals(cVar.f41729c)) {
            return false;
        }
        return this.f41728b == cVar.f41728b;
    }

    public b a() {
        return this.f41729c;
    }

    public String toString() {
        return "BeaconSighting [RSSI=" + this.f41727a + ", date=" + this.f41728b + ", beacon=" + this.f41729c + "]";
    }
}
