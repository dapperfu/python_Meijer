package tf;

import java.util.List;
import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class y extends AbstractC17251F.e.d.f {

    /* renamed from: a, reason: collision with root package name */
    private final List<AbstractC17251F.e.d.AbstractC2568e> f163047a;

    static final class b extends AbstractC17251F.e.d.f.a {

        /* renamed from: a, reason: collision with root package name */
        private List<AbstractC17251F.e.d.AbstractC2568e> f163048a;

        @Override // tf.AbstractC17251F.e.d.f.a
        public AbstractC17251F.e.d.f a() {
            List<AbstractC17251F.e.d.AbstractC2568e> list = this.f163048a;
            if (list != null) {
                return new y(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // tf.AbstractC17251F.e.d.f.a
        public AbstractC17251F.e.d.f.a b(List<AbstractC17251F.e.d.AbstractC2568e> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f163048a = list;
            return this;
        }

        b() {
        }
    }

    private y(List<AbstractC17251F.e.d.AbstractC2568e> list) {
        this.f163047a = list;
    }

    @Override // tf.AbstractC17251F.e.d.f
    public List<AbstractC17251F.e.d.AbstractC2568e> b() {
        return this.f163047a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.d.f) {
            return this.f163047a.equals(((AbstractC17251F.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f163047a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f163047a + "}";
    }
}
