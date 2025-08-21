package rc;

/* renamed from: rc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16881a<T> extends AbstractC16884d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f159457a;

    /* renamed from: b, reason: collision with root package name */
    private final T f159458b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC16886f f159459c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC16887g f159460d;

    @Override // rc.AbstractC16884d
    public AbstractC16885e b() {
        return null;
    }

    public boolean equals(Object obj) {
        AbstractC16887g abstractC16887g;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16884d) {
            AbstractC16884d abstractC16884d = (AbstractC16884d) obj;
            Integer num = this.f159457a;
            if (num != null ? num.equals(abstractC16884d.a()) : abstractC16884d.a() == null) {
                if (this.f159458b.equals(abstractC16884d.c()) && this.f159459c.equals(abstractC16884d.d()) && ((abstractC16887g = this.f159460d) != null ? abstractC16887g.equals(abstractC16884d.e()) : abstractC16884d.e() == null)) {
                    abstractC16884d.b();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // rc.AbstractC16884d
    public Integer a() {
        return this.f159457a;
    }

    @Override // rc.AbstractC16884d
    public T c() {
        return this.f159458b;
    }

    @Override // rc.AbstractC16884d
    public EnumC16886f d() {
        return this.f159459c;
    }

    @Override // rc.AbstractC16884d
    public AbstractC16887g e() {
        return this.f159460d;
    }

    public int hashCode() {
        Integer num = this.f159457a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f159458b.hashCode()) * 1000003) ^ this.f159459c.hashCode()) * 1000003;
        AbstractC16887g abstractC16887g = this.f159460d;
        return (iHashCode ^ (abstractC16887g != null ? abstractC16887g.hashCode() : 0)) * 1000003;
    }

    public String toString() {
        return "Event{code=" + this.f159457a + ", payload=" + this.f159458b + ", priority=" + this.f159459c + ", productData=" + this.f159460d + ", eventContext=" + ((Object) null) + "}";
    }

    C16881a(Integer num, T t10, EnumC16886f enumC16886f, AbstractC16887g abstractC16887g, AbstractC16885e abstractC16885e) {
        this.f159457a = num;
        if (t10 != null) {
            this.f159458b = t10;
            if (enumC16886f != null) {
                this.f159459c = enumC16886f;
                this.f159460d = abstractC16887g;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }
}
