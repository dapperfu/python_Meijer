package F;

import F.t0;

/* renamed from: F.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3608e extends t0.a {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f9943a;

    @Override // F.t0.a
    public Throwable a() {
        return this.f9943a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t0.a) {
            return this.f9943a.equals(((t0.a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f9943a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f9943a + "}";
    }

    C3608e(Throwable th2) {
        if (th2 != null) {
            this.f9943a = th2;
            return;
        }
        throw new NullPointerException("Null error");
    }
}
