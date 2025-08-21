package tf;

import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class j extends AbstractC17251F.e.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f162907a;

    @Override // tf.AbstractC17251F.e.a.b
    public String a() {
        return this.f162907a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.a.b) {
            return this.f162907a.equals(((AbstractC17251F.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f162907a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f162907a + "}";
    }
}
