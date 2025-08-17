package pc;

/* renamed from: pc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16279c {

    /* renamed from: a, reason: collision with root package name */
    private final String f155705a;

    public static C16279c b(String str) {
        return new C16279c(str);
    }

    public String a() {
        return this.f155705a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16279c) {
            return this.f155705a.equals(((C16279c) obj).f155705a);
        }
        return false;
    }

    public int hashCode() {
        return this.f155705a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f155705a + "\"}";
    }

    private C16279c(String str) {
        if (str != null) {
            this.f155705a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }
}
