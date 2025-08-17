package qc;

import qc.AbstractC16508s;

/* renamed from: qc.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16498i extends AbstractC16508s {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC16507r f157088a;

    /* renamed from: qc.i$b */
    static final class b extends AbstractC16508s.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC16507r f157089a;

        @Override // qc.AbstractC16508s.a
        public AbstractC16508s a() {
            return new C16498i(this.f157089a);
        }

        @Override // qc.AbstractC16508s.a
        public AbstractC16508s.a b(AbstractC16507r abstractC16507r) {
            this.f157089a = abstractC16507r;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC16508s)) {
            return false;
        }
        AbstractC16507r abstractC16507r = this.f157088a;
        AbstractC16507r abstractC16507rB = ((AbstractC16508s) obj).b();
        return abstractC16507r == null ? abstractC16507rB == null : abstractC16507r.equals(abstractC16507rB);
    }

    private C16498i(AbstractC16507r abstractC16507r) {
        this.f157088a = abstractC16507r;
    }

    @Override // qc.AbstractC16508s
    public AbstractC16507r b() {
        return this.f157088a;
    }

    public int hashCode() {
        AbstractC16507r abstractC16507r = this.f157088a;
        return (abstractC16507r == null ? 0 : abstractC16507r.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f157088a + "}";
    }
}
