package F;

import F.t0;

/* renamed from: F.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3270e extends t0.a {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f8710a;

    @Override // F.t0.a
    public Throwable a() {
        return this.f8710a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t0.a) {
            return this.f8710a.equals(((t0.a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f8710a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f8710a + "}";
    }

    C3270e(Throwable th2) {
        if (th2 != null) {
            this.f8710a = th2;
            return;
        }
        throw new NullPointerException("Null error");
    }
}
