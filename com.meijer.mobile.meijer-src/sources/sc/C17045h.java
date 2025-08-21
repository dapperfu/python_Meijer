package sc;

import sc.AbstractC17055r;

/* renamed from: sc.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17045h extends AbstractC17055r {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f160201a;

    /* renamed from: sc.h$b */
    static final class b extends AbstractC17055r.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f160202a;

        @Override // sc.AbstractC17055r.a
        public AbstractC17055r a() {
            return new C17045h(this.f160202a);
        }

        @Override // sc.AbstractC17055r.a
        public AbstractC17055r.a b(Integer num) {
            this.f160202a = num;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC17055r)) {
            return false;
        }
        Integer num = this.f160201a;
        Integer numB = ((AbstractC17055r) obj).b();
        return num == null ? numB == null : num.equals(numB);
    }

    private C17045h(Integer num) {
        this.f160201a = num;
    }

    @Override // sc.AbstractC17055r
    public Integer b() {
        return this.f160201a;
    }

    public int hashCode() {
        Integer num = this.f160201a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f160201a + "}";
    }
}
