package Fu;

import Fu.a;

/* loaded from: classes8.dex */
final class c extends a.c {

    /* renamed from: a, reason: collision with root package name */
    private final i f10936a;

    @Override // Fu.a.c
    public i b() {
        return this.f10936a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a.c) {
            return this.f10936a.equals(((a.c) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f10936a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Distribution{bucketBoundaries=" + this.f10936a + "}";
    }

    c(i iVar) {
        if (iVar != null) {
            this.f10936a = iVar;
            return;
        }
        throw new NullPointerException("Null bucketBoundaries");
    }
}
