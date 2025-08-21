package v6;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private float f165646a;

    /* renamed from: b, reason: collision with root package name */
    private int f165647b;

    public void a(float f10) {
        float f11 = this.f165646a + f10;
        this.f165646a = f11;
        int i10 = this.f165647b + 1;
        this.f165647b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f165646a = f11 / 2.0f;
            this.f165647b = i10 / 2;
        }
    }
}
