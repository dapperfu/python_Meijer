package rc;

/* renamed from: rc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16882b extends AbstractC16887g {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f159461a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC16887g)) {
            return false;
        }
        Integer num = this.f159461a;
        Integer numA = ((AbstractC16887g) obj).a();
        return num == null ? numA == null : num.equals(numA);
    }

    @Override // rc.AbstractC16887g
    public Integer a() {
        return this.f159461a;
    }

    public int hashCode() {
        Integer num = this.f159461a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f159461a + "}";
    }

    C16882b(Integer num) {
        this.f159461a = num;
    }
}
