package sc;

import sc.AbstractC17056s;

/* renamed from: sc.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17046i extends AbstractC17056s {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC17055r f160203a;

    /* renamed from: sc.i$b */
    static final class b extends AbstractC17056s.a {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC17055r f160204a;

        @Override // sc.AbstractC17056s.a
        public AbstractC17056s a() {
            return new C17046i(this.f160204a);
        }

        @Override // sc.AbstractC17056s.a
        public AbstractC17056s.a b(AbstractC17055r abstractC17055r) {
            this.f160204a = abstractC17055r;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC17056s)) {
            return false;
        }
        AbstractC17055r abstractC17055r = this.f160203a;
        AbstractC17055r abstractC17055rB = ((AbstractC17056s) obj).b();
        return abstractC17055r == null ? abstractC17055rB == null : abstractC17055r.equals(abstractC17055rB);
    }

    private C17046i(AbstractC17055r abstractC17055r) {
        this.f160203a = abstractC17055r;
    }

    @Override // sc.AbstractC17056s
    public AbstractC17055r b() {
        return this.f160203a;
    }

    public int hashCode() {
        AbstractC17055r abstractC17055r = this.f160203a;
        return (abstractC17055r == null ? 0 : abstractC17055r.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f160203a + "}";
    }
}
