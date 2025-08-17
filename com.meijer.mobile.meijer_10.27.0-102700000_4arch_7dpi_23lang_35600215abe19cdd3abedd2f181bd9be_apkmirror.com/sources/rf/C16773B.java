package rf;

import rf.AbstractC16778G;

/* renamed from: rf.B, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16773B extends AbstractC16778G {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC16778G.a f158191a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC16778G.c f158192b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC16778G.b f158193c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16778G) {
            AbstractC16778G abstractC16778G = (AbstractC16778G) obj;
            if (this.f158191a.equals(abstractC16778G.a()) && this.f158192b.equals(abstractC16778G.d()) && this.f158193c.equals(abstractC16778G.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // rf.AbstractC16778G
    public AbstractC16778G.a a() {
        return this.f158191a;
    }

    @Override // rf.AbstractC16778G
    public AbstractC16778G.b c() {
        return this.f158193c;
    }

    @Override // rf.AbstractC16778G
    public AbstractC16778G.c d() {
        return this.f158192b;
    }

    public int hashCode() {
        return ((((this.f158191a.hashCode() ^ 1000003) * 1000003) ^ this.f158192b.hashCode()) * 1000003) ^ this.f158193c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f158191a + ", osData=" + this.f158192b + ", deviceData=" + this.f158193c + "}";
    }

    C16773B(AbstractC16778G.a aVar, AbstractC16778G.c cVar, AbstractC16778G.b bVar) {
        if (aVar != null) {
            this.f158191a = aVar;
            if (cVar != null) {
                this.f158192b = cVar;
                if (bVar != null) {
                    this.f158193c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }
}
