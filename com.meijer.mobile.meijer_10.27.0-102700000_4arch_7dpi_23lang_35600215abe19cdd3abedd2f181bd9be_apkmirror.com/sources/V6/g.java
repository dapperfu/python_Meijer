package V6;

import Z.C5503a;
import java.security.MessageDigest;
import p7.C16265b;

/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    private final C5503a<f<?>, Object> f36940b = new C16265b();

    @Override // V6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f36940b.getSize(); i10++) {
            e(this.f36940b.g(i10), this.f36940b.k(i10), messageDigest);
        }
    }

    public <T> T a(f<T> fVar) {
        return this.f36940b.containsKey(fVar) ? (T) this.f36940b.get(fVar) : fVar.c();
    }

    public void b(g gVar) {
        this.f36940b.h(gVar.f36940b);
    }

    public g c(f<?> fVar) {
        this.f36940b.remove(fVar);
        return this;
    }

    public <T> g d(f<T> fVar, T t10) {
        this.f36940b.put(fVar, t10);
        return this;
    }

    @Override // V6.e
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f36940b.equals(((g) obj).f36940b);
        }
        return false;
    }

    @Override // V6.e
    public int hashCode() {
        return this.f36940b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f36940b + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void e(f<T> fVar, Object obj, MessageDigest messageDigest) {
        fVar.g(obj, messageDigest);
    }
}
