package rf;

import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class j extends AbstractC16777F.e.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f158461a;

    @Override // rf.AbstractC16777F.e.a.b
    public String a() {
        return this.f158461a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.a.b) {
            return this.f158461a.equals(((AbstractC16777F.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f158461a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f158461a + "}";
    }
}
