package u6;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private float f162717a;

    /* renamed from: b, reason: collision with root package name */
    private int f162718b;

    public void a(float f10) {
        float f11 = this.f162717a + f10;
        this.f162717a = f11;
        int i10 = this.f162718b + 1;
        this.f162718b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f162717a = f11 / 2.0f;
            this.f162718b = i10 / 2;
        }
    }
}
