package If;

import java.util.List;

/* loaded from: classes8.dex */
final class a extends q {

    /* renamed from: a, reason: collision with root package name */
    private final String f14446a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f14447b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f14446a.equals(qVar.c()) && this.f14447b.equals(qVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // If.q
    public List<String> b() {
        return this.f14447b;
    }

    @Override // If.q
    public String c() {
        return this.f14446a;
    }

    public int hashCode() {
        return ((this.f14446a.hashCode() ^ 1000003) * 1000003) ^ this.f14447b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f14446a + ", usedDates=" + this.f14447b + "}";
    }

    a(String str, List<String> list) {
        if (str != null) {
            this.f14446a = str;
            if (list != null) {
                this.f14447b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }
}
