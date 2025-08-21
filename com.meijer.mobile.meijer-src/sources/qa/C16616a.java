package qa;

/* renamed from: qa.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16616a {

    /* renamed from: a, reason: collision with root package name */
    private final String f158077a;

    /* renamed from: b, reason: collision with root package name */
    private final long f158078b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C16616a c16616a = (C16616a) obj;
            if (this.f158078b != c16616a.f158078b) {
                return false;
            }
            String str = this.f158077a;
            String str2 = c16616a.f158077a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public String a() {
        return this.f158077a;
    }

    public long b() {
        return this.f158078b;
    }

    public int hashCode() {
        String str = this.f158077a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j10 = this.f158078b;
        return (iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "DisplayedIam{campaignId='" + this.f158077a + "', timestamp=" + this.f158078b + '}';
    }

    public C16616a(String str, long j10) {
        this.f158077a = str;
        this.f158078b = j10;
    }
}
