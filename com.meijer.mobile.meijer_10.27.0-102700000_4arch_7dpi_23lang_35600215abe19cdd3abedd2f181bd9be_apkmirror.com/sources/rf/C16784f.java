package rf;

import java.util.List;
import rf.AbstractC16777F;

/* renamed from: rf.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16784f extends AbstractC16777F.d {

    /* renamed from: a, reason: collision with root package name */
    private final List<AbstractC16777F.d.b> f158414a;

    /* renamed from: b, reason: collision with root package name */
    private final String f158415b;

    /* renamed from: rf.f$b */
    static final class b extends AbstractC16777F.d.a {

        /* renamed from: a, reason: collision with root package name */
        private List<AbstractC16777F.d.b> f158416a;

        /* renamed from: b, reason: collision with root package name */
        private String f158417b;

        @Override // rf.AbstractC16777F.d.a
        public AbstractC16777F.d a() {
            List<AbstractC16777F.d.b> list = this.f158416a;
            if (list != null) {
                return new C16784f(list, this.f158417b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // rf.AbstractC16777F.d.a
        public AbstractC16777F.d.a b(List<AbstractC16777F.d.b> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f158416a = list;
            return this;
        }

        @Override // rf.AbstractC16777F.d.a
        public AbstractC16777F.d.a c(String str) {
            this.f158417b = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.d) {
            AbstractC16777F.d dVar = (AbstractC16777F.d) obj;
            if (this.f158414a.equals(dVar.b()) && ((str = this.f158415b) != null ? str.equals(dVar.c()) : dVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    private C16784f(List<AbstractC16777F.d.b> list, String str) {
        this.f158414a = list;
        this.f158415b = str;
    }

    @Override // rf.AbstractC16777F.d
    public List<AbstractC16777F.d.b> b() {
        return this.f158414a;
    }

    @Override // rf.AbstractC16777F.d
    public String c() {
        return this.f158415b;
    }

    public int hashCode() {
        int iHashCode = (this.f158414a.hashCode() ^ 1000003) * 1000003;
        String str = this.f158415b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f158414a + ", orgId=" + this.f158415b + "}";
    }
}
