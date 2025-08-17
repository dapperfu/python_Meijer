package pc;

/* renamed from: pc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16278b extends AbstractC16283g {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f155704a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC16283g)) {
            return false;
        }
        Integer num = this.f155704a;
        Integer numA = ((AbstractC16283g) obj).a();
        return num == null ? numA == null : num.equals(numA);
    }

    @Override // pc.AbstractC16283g
    public Integer a() {
        return this.f155704a;
    }

    public int hashCode() {
        Integer num = this.f155704a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f155704a + "}";
    }

    C16278b(Integer num) {
        this.f155704a = num;
    }
}
