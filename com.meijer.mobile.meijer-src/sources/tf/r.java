package tf;

import java.util.List;
import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class r extends AbstractC17251F.e.d.a.b.AbstractC2562e {

    /* renamed from: a, reason: collision with root package name */
    private final String f162992a;

    /* renamed from: b, reason: collision with root package name */
    private final int f162993b;

    /* renamed from: c, reason: collision with root package name */
    private final List<AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b> f162994c;

    static final class b extends AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2563a {

        /* renamed from: a, reason: collision with root package name */
        private String f162995a;

        /* renamed from: b, reason: collision with root package name */
        private int f162996b;

        /* renamed from: c, reason: collision with root package name */
        private List<AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b> f162997c;

        /* renamed from: d, reason: collision with root package name */
        private byte f162998d;

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2563a
        public AbstractC17251F.e.d.a.b.AbstractC2562e a() {
            String str;
            List<AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b> list;
            if (this.f162998d == 1 && (str = this.f162995a) != null && (list = this.f162997c) != null) {
                return new r(str, this.f162996b, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f162995a == null) {
                sb2.append(" name");
            }
            if ((1 & this.f162998d) == 0) {
                sb2.append(" importance");
            }
            if (this.f162997c == null) {
                sb2.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2563a
        public AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2563a b(List<AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f162997c = list;
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2563a
        public AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2563a c(int i10) {
            this.f162996b = i10;
            this.f162998d = (byte) (this.f162998d | 1);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2563a
        public AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2563a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f162995a = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.d.a.b.AbstractC2562e) {
            AbstractC17251F.e.d.a.b.AbstractC2562e abstractC2562e = (AbstractC17251F.e.d.a.b.AbstractC2562e) obj;
            if (this.f162992a.equals(abstractC2562e.d()) && this.f162993b == abstractC2562e.c() && this.f162994c.equals(abstractC2562e.b())) {
                return true;
            }
        }
        return false;
    }

    private r(String str, int i10, List<AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b> list) {
        this.f162992a = str;
        this.f162993b = i10;
        this.f162994c = list;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e
    public List<AbstractC17251F.e.d.a.b.AbstractC2562e.AbstractC2564b> b() {
        return this.f162994c;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e
    public int c() {
        return this.f162993b;
    }

    @Override // tf.AbstractC17251F.e.d.a.b.AbstractC2562e
    public String d() {
        return this.f162992a;
    }

    public int hashCode() {
        return ((((this.f162992a.hashCode() ^ 1000003) * 1000003) ^ this.f162993b) * 1000003) ^ this.f162994c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f162992a + ", importance=" + this.f162993b + ", frames=" + this.f162994c + "}";
    }
}
