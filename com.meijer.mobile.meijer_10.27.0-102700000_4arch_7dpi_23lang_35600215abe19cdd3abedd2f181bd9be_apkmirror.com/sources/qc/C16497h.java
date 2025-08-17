package qc;

import qc.AbstractC16507r;

/* renamed from: qc.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16497h extends AbstractC16507r {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f157086a;

    /* renamed from: qc.h$b */
    static final class b extends AbstractC16507r.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f157087a;

        @Override // qc.AbstractC16507r.a
        public AbstractC16507r a() {
            return new C16497h(this.f157087a);
        }

        @Override // qc.AbstractC16507r.a
        public AbstractC16507r.a b(Integer num) {
            this.f157087a = num;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC16507r)) {
            return false;
        }
        Integer num = this.f157086a;
        Integer numB = ((AbstractC16507r) obj).b();
        return num == null ? numB == null : num.equals(numB);
    }

    private C16497h(Integer num) {
        this.f157086a = num;
    }

    @Override // qc.AbstractC16507r
    public Integer b() {
        return this.f157086a;
    }

    public int hashCode() {
        Integer num = this.f157086a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f157086a + "}";
    }
}
