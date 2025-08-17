package Va;

/* loaded from: classes4.dex */
public class n implements Nb.a {

    /* renamed from: a, reason: collision with root package name */
    private k f37054a;

    /* renamed from: b, reason: collision with root package name */
    private long f37055b;

    /* renamed from: c, reason: collision with root package name */
    private long f37056c;

    /* renamed from: d, reason: collision with root package name */
    private String f37057d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f37055b != nVar.f37055b || this.f37056c != nVar.f37056c) {
            return false;
        }
        k kVar = this.f37054a;
        if (kVar == null) {
            if (nVar.f37054a != null) {
                return false;
            }
        } else if (!kVar.equals(nVar.f37054a)) {
            return false;
        }
        return this.f37057d == nVar.f37057d;
    }

    public long a() {
        return this.f37056c;
    }

    public long b() {
        long j10;
        long jCurrentTimeMillis = this.f37056c;
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            j10 = this.f37055b;
        } else {
            j10 = this.f37055b;
        }
        return jCurrentTimeMillis - j10;
    }

    public k c() {
        return this.f37054a;
    }

    public String toString() {
        return "Visit [visitID=" + this.f37057d + ", place=" + this.f37054a + ", arrivalTimeInMillis=" + this.f37055b + ", departureTimeInMillis=" + this.f37056c + "]";
    }
}
