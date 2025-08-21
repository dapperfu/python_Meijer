package w6;

/* renamed from: w6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17848d {

    /* renamed from: a, reason: collision with root package name */
    private float f166970a;

    /* renamed from: b, reason: collision with root package name */
    private float f166971b;

    public C17848d(float f10, float f11) {
        this.f166970a = f10;
        this.f166971b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f166970a == f10 && this.f166971b == f11;
    }

    public float b() {
        return this.f166970a;
    }

    public float c() {
        return this.f166971b;
    }

    public void d(float f10, float f11) {
        this.f166970a = f10;
        this.f166971b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public C17848d() {
        this(1.0f, 1.0f);
    }
}
