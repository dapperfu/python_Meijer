package oa;

/* renamed from: oa.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16008a {

    /* renamed from: a, reason: collision with root package name */
    private final String f153225a;

    /* renamed from: b, reason: collision with root package name */
    private final long f153226b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C16008a c16008a = (C16008a) obj;
            if (this.f153226b != c16008a.f153226b) {
                return false;
            }
            String str = this.f153225a;
            String str2 = c16008a.f153225a;
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
        return this.f153225a;
    }

    public long b() {
        return this.f153226b;
    }

    public int hashCode() {
        String str = this.f153225a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j10 = this.f153226b;
        return (iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "DisplayedIam{campaignId='" + this.f153225a + "', timestamp=" + this.f153226b + '}';
    }

    public C16008a(String str, long j10) {
        this.f153225a = str;
        this.f153226b = j10;
    }
}
