package Sa;

import android.graphics.RectF;

/* loaded from: classes4.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private RectF f33493a;

    /* renamed from: b, reason: collision with root package name */
    private Ra.b f33494b;

    public float a() {
        return this.f33493a.height();
    }

    @Override // Sa.a
    public float b() {
        return this.f33493a.left;
    }

    @Override // Sa.a
    public float c() {
        return this.f33493a.right;
    }

    public Ra.b d() {
        return this.f33494b;
    }

    public float e() {
        return this.f33493a.width();
    }

    @Override // Sa.a
    public float f() {
        return this.f33493a.top;
    }

    @Override // Sa.a
    public float r() {
        return this.f33493a.bottom;
    }

    public d(RectF rectF, Ra.b bVar) {
        this.f33493a = rectF;
        this.f33494b = bVar;
    }
}
