package rc;

/* renamed from: rc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16883c {

    /* renamed from: a, reason: collision with root package name */
    private final String f159462a;

    public static C16883c b(String str) {
        return new C16883c(str);
    }

    public String a() {
        return this.f159462a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16883c) {
            return this.f159462a.equals(((C16883c) obj).f159462a);
        }
        return false;
    }

    public int hashCode() {
        return this.f159462a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f159462a + "\"}";
    }

    private C16883c(String str) {
        if (str != null) {
            this.f159462a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }
}
