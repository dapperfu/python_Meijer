package tf;

import java.util.List;
import tf.AbstractC17251F;

/* renamed from: tf.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C17258f extends AbstractC17251F.d {

    /* renamed from: a, reason: collision with root package name */
    private final List<AbstractC17251F.d.b> f162860a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162861b;

    /* renamed from: tf.f$b */
    static final class b extends AbstractC17251F.d.a {

        /* renamed from: a, reason: collision with root package name */
        private List<AbstractC17251F.d.b> f162862a;

        /* renamed from: b, reason: collision with root package name */
        private String f162863b;

        @Override // tf.AbstractC17251F.d.a
        public AbstractC17251F.d a() {
            List<AbstractC17251F.d.b> list = this.f162862a;
            if (list != null) {
                return new C17258f(list, this.f162863b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // tf.AbstractC17251F.d.a
        public AbstractC17251F.d.a b(List<AbstractC17251F.d.b> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f162862a = list;
            return this;
        }

        @Override // tf.AbstractC17251F.d.a
        public AbstractC17251F.d.a c(String str) {
            this.f162863b = str;
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
        if (obj instanceof AbstractC17251F.d) {
            AbstractC17251F.d dVar = (AbstractC17251F.d) obj;
            if (this.f162860a.equals(dVar.b()) && ((str = this.f162861b) != null ? str.equals(dVar.c()) : dVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    private C17258f(List<AbstractC17251F.d.b> list, String str) {
        this.f162860a = list;
        this.f162861b = str;
    }

    @Override // tf.AbstractC17251F.d
    public List<AbstractC17251F.d.b> b() {
        return this.f162860a;
    }

    @Override // tf.AbstractC17251F.d
    public String c() {
        return this.f162861b;
    }

    public int hashCode() {
        int iHashCode = (this.f162860a.hashCode() ^ 1000003) * 1000003;
        String str = this.f162861b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f162860a + ", orgId=" + this.f162861b + "}";
    }
}
