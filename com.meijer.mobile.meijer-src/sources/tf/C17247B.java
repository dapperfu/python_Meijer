package tf;

import tf.AbstractC17252G;

/* renamed from: tf.B, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C17247B extends AbstractC17252G {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC17252G.a f162637a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC17252G.c f162638b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC17252G.b f162639c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17252G) {
            AbstractC17252G abstractC17252G = (AbstractC17252G) obj;
            if (this.f162637a.equals(abstractC17252G.a()) && this.f162638b.equals(abstractC17252G.d()) && this.f162639c.equals(abstractC17252G.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // tf.AbstractC17252G
    public AbstractC17252G.a a() {
        return this.f162637a;
    }

    @Override // tf.AbstractC17252G
    public AbstractC17252G.b c() {
        return this.f162639c;
    }

    @Override // tf.AbstractC17252G
    public AbstractC17252G.c d() {
        return this.f162638b;
    }

    public int hashCode() {
        return ((((this.f162637a.hashCode() ^ 1000003) * 1000003) ^ this.f162638b.hashCode()) * 1000003) ^ this.f162639c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f162637a + ", osData=" + this.f162638b + ", deviceData=" + this.f162639c + "}";
    }

    C17247B(AbstractC17252G.a aVar, AbstractC17252G.c cVar, AbstractC17252G.b bVar) {
        if (aVar != null) {
            this.f162637a = aVar;
            if (cVar != null) {
                this.f162638b = cVar;
                if (bVar != null) {
                    this.f162639c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }
}
