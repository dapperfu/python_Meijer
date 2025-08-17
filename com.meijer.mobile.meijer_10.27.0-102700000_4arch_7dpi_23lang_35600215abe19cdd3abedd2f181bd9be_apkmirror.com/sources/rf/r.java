package rf;

import java.util.List;
import rf.AbstractC16777F;

/* loaded from: classes7.dex */
final class r extends AbstractC16777F.e.d.a.b.AbstractC2456e {

    /* renamed from: a, reason: collision with root package name */
    private final String f158546a;

    /* renamed from: b, reason: collision with root package name */
    private final int f158547b;

    /* renamed from: c, reason: collision with root package name */
    private final List<AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b> f158548c;

    static final class b extends AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2457a {

        /* renamed from: a, reason: collision with root package name */
        private String f158549a;

        /* renamed from: b, reason: collision with root package name */
        private int f158550b;

        /* renamed from: c, reason: collision with root package name */
        private List<AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b> f158551c;

        /* renamed from: d, reason: collision with root package name */
        private byte f158552d;

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2457a
        public AbstractC16777F.e.d.a.b.AbstractC2456e a() {
            String str;
            List<AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b> list;
            if (this.f158552d == 1 && (str = this.f158549a) != null && (list = this.f158551c) != null) {
                return new r(str, this.f158550b, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f158549a == null) {
                sb2.append(" name");
            }
            if ((1 & this.f158552d) == 0) {
                sb2.append(" importance");
            }
            if (this.f158551c == null) {
                sb2.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2457a
        public AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2457a b(List<AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f158551c = list;
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2457a
        public AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2457a c(int i10) {
            this.f158550b = i10;
            this.f158552d = (byte) (this.f158552d | 1);
            return this;
        }

        @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2457a
        public AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2457a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f158549a = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.e.d.a.b.AbstractC2456e) {
            AbstractC16777F.e.d.a.b.AbstractC2456e abstractC2456e = (AbstractC16777F.e.d.a.b.AbstractC2456e) obj;
            if (this.f158546a.equals(abstractC2456e.d()) && this.f158547b == abstractC2456e.c() && this.f158548c.equals(abstractC2456e.b())) {
                return true;
            }
        }
        return false;
    }

    private r(String str, int i10, List<AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b> list) {
        this.f158546a = str;
        this.f158547b = i10;
        this.f158548c = list;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e
    public List<AbstractC16777F.e.d.a.b.AbstractC2456e.AbstractC2458b> b() {
        return this.f158548c;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e
    public int c() {
        return this.f158547b;
    }

    @Override // rf.AbstractC16777F.e.d.a.b.AbstractC2456e
    public String d() {
        return this.f158546a;
    }

    public int hashCode() {
        return ((((this.f158546a.hashCode() ^ 1000003) * 1000003) ^ this.f158547b) * 1000003) ^ this.f158548c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f158546a + ", importance=" + this.f158547b + ", frames=" + this.f158548c + "}";
    }
}
