package v6;

/* renamed from: v6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17515d {

    /* renamed from: a, reason: collision with root package name */
    private float f164586a;

    /* renamed from: b, reason: collision with root package name */
    private float f164587b;

    public C17515d(float f10, float f11) {
        this.f164586a = f10;
        this.f164587b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f164586a == f10 && this.f164587b == f11;
    }

    public float b() {
        return this.f164586a;
    }

    public float c() {
        return this.f164587b;
    }

    public void d(float f10, float f11) {
        this.f164586a = f10;
        this.f164587b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public C17515d() {
        this(1.0f, 1.0f);
    }
}
