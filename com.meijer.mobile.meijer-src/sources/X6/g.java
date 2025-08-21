package X6;

import Z.C5603a;
import java.security.MessageDigest;
import r7.C16869b;

/* loaded from: classes4.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    private final C5603a<f<?>, Object> f41652b = new C16869b();

    @Override // X6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f41652b.getSize(); i10++) {
            e(this.f41652b.g(i10), this.f41652b.k(i10), messageDigest);
        }
    }

    public <T> T a(f<T> fVar) {
        return this.f41652b.containsKey(fVar) ? (T) this.f41652b.get(fVar) : fVar.c();
    }

    public void b(g gVar) {
        this.f41652b.h(gVar.f41652b);
    }

    public g c(f<?> fVar) {
        this.f41652b.remove(fVar);
        return this;
    }

    public <T> g d(f<T> fVar, T t10) {
        this.f41652b.put(fVar, t10);
        return this;
    }

    @Override // X6.e
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f41652b.equals(((g) obj).f41652b);
        }
        return false;
    }

    @Override // X6.e
    public int hashCode() {
        return this.f41652b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f41652b + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void e(f<T> fVar, Object obj, MessageDigest messageDigest) {
        fVar.g(obj, messageDigest);
    }
}
