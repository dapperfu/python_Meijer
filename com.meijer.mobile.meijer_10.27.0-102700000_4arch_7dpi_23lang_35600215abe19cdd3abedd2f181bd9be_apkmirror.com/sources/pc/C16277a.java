package pc;

/* renamed from: pc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16277a<T> extends AbstractC16280d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f155700a;

    /* renamed from: b, reason: collision with root package name */
    private final T f155701b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC16282f f155702c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC16283g f155703d;

    @Override // pc.AbstractC16280d
    public AbstractC16281e b() {
        return null;
    }

    public boolean equals(Object obj) {
        AbstractC16283g abstractC16283g;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16280d) {
            AbstractC16280d abstractC16280d = (AbstractC16280d) obj;
            Integer num = this.f155700a;
            if (num != null ? num.equals(abstractC16280d.a()) : abstractC16280d.a() == null) {
                if (this.f155701b.equals(abstractC16280d.c()) && this.f155702c.equals(abstractC16280d.d()) && ((abstractC16283g = this.f155703d) != null ? abstractC16283g.equals(abstractC16280d.e()) : abstractC16280d.e() == null)) {
                    abstractC16280d.b();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // pc.AbstractC16280d
    public Integer a() {
        return this.f155700a;
    }

    @Override // pc.AbstractC16280d
    public T c() {
        return this.f155701b;
    }

    @Override // pc.AbstractC16280d
    public EnumC16282f d() {
        return this.f155702c;
    }

    @Override // pc.AbstractC16280d
    public AbstractC16283g e() {
        return this.f155703d;
    }

    public int hashCode() {
        Integer num = this.f155700a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f155701b.hashCode()) * 1000003) ^ this.f155702c.hashCode()) * 1000003;
        AbstractC16283g abstractC16283g = this.f155703d;
        return (iHashCode ^ (abstractC16283g != null ? abstractC16283g.hashCode() : 0)) * 1000003;
    }

    public String toString() {
        return "Event{code=" + this.f155700a + ", payload=" + this.f155701b + ", priority=" + this.f155702c + ", productData=" + this.f155703d + ", eventContext=" + ((Object) null) + "}";
    }

    C16277a(Integer num, T t10, EnumC16282f enumC16282f, AbstractC16283g abstractC16283g, AbstractC16281e abstractC16281e) {
        this.f155700a = num;
        if (t10 != null) {
            this.f155701b = t10;
            if (enumC16282f != null) {
                this.f155702c = enumC16282f;
                this.f155703d = abstractC16283g;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }
}
