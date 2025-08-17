package Gf;

import java.util.List;

/* loaded from: classes7.dex */
final class a extends q {

    /* renamed from: a, reason: collision with root package name */
    private final String f11347a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f11348b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f11347a.equals(qVar.c()) && this.f11348b.equals(qVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // Gf.q
    public List<String> b() {
        return this.f11348b;
    }

    @Override // Gf.q
    public String c() {
        return this.f11347a;
    }

    public int hashCode() {
        return ((this.f11347a.hashCode() ^ 1000003) * 1000003) ^ this.f11348b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f11347a + ", usedDates=" + this.f11348b + "}";
    }

    a(String str, List<String> list) {
        if (str != null) {
            this.f11347a = str;
            if (list != null) {
                this.f11348b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }
}
