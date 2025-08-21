package Xa;

/* loaded from: classes4.dex */
public class n implements Pb.a {

    /* renamed from: a, reason: collision with root package name */
    private k f41766a;

    /* renamed from: b, reason: collision with root package name */
    private long f41767b;

    /* renamed from: c, reason: collision with root package name */
    private long f41768c;

    /* renamed from: d, reason: collision with root package name */
    private String f41769d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f41767b != nVar.f41767b || this.f41768c != nVar.f41768c) {
            return false;
        }
        k kVar = this.f41766a;
        if (kVar == null) {
            if (nVar.f41766a != null) {
                return false;
            }
        } else if (!kVar.equals(nVar.f41766a)) {
            return false;
        }
        return this.f41769d == nVar.f41769d;
    }

    public long a() {
        return this.f41768c;
    }

    public long b() {
        long j10;
        long jCurrentTimeMillis = this.f41768c;
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            j10 = this.f41767b;
        } else {
            j10 = this.f41767b;
        }
        return jCurrentTimeMillis - j10;
    }

    public k c() {
        return this.f41766a;
    }

    public String toString() {
        return "Visit [visitID=" + this.f41769d + ", place=" + this.f41766a + ", arrivalTimeInMillis=" + this.f41767b + ", departureTimeInMillis=" + this.f41768c + "]";
    }
}
