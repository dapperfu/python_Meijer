package Ua;

import android.graphics.RectF;

/* loaded from: classes4.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private RectF f37369a;

    /* renamed from: b, reason: collision with root package name */
    private Ta.b f37370b;

    public float a() {
        return this.f37369a.height();
    }

    @Override // Ua.a
    public float b() {
        return this.f37369a.left;
    }

    @Override // Ua.a
    public float c() {
        return this.f37369a.right;
    }

    public Ta.b d() {
        return this.f37370b;
    }

    public float e() {
        return this.f37369a.width();
    }

    @Override // Ua.a
    public float f() {
        return this.f37369a.top;
    }

    @Override // Ua.a
    public float r() {
        return this.f37369a.bottom;
    }

    public d(RectF rectF, Ta.b bVar) {
        this.f37369a = rectF;
        this.f37370b = bVar;
    }
}
