package rf;

import java.util.List;
import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class y extends AbstractC16777F.e.d.f {

    /* renamed from: a, reason: collision with root package name */
    private final List<AbstractC16777F.e.d.AbstractC2462e> f158601a;

    static final class b extends AbstractC16777F.e.d.f.a {

        /* renamed from: a, reason: collision with root package name */
        private List<AbstractC16777F.e.d.AbstractC2462e> f158602a;

        @Override // rf.AbstractC16777F.e.d.f.a
        public AbstractC16777F.e.d.f a() {
            List<AbstractC16777F.e.d.AbstractC2462e> list = this.f158602a;
            if (list != null) {
                return new y(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // rf.AbstractC16777F.e.d.f.a
        public AbstractC16777F.e.d.f.a b(List<AbstractC16777F.e.d.AbstractC2462e> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f158602a = list;
            return this;
        }

        b() {
        }
    }

    private y(List<AbstractC16777F.e.d.AbstractC2462e> list) {
        this.f158601a = list;
    }

    @Override // rf.AbstractC16777F.e.d.f
    public List<AbstractC16777F.e.d.AbstractC2462e> b() {
        return this.f158601a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.d.f) {
            return this.f158601a.equals(((AbstractC16777F.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f158601a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f158601a + "}";
    }
}
