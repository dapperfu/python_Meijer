package Ua;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private RectF f37366a = new RectF(Float.MAX_VALUE, Float.MAX_VALUE, -3.4028235E38f, -3.4028235E38f);

    /* renamed from: b, reason: collision with root package name */
    private List<a> f37367b = new ArrayList();

    public void a(a aVar) {
        RectF rectF = this.f37366a;
        rectF.set(Math.min(rectF.left, aVar.b()), Math.min(this.f37366a.top, aVar.f()), Math.max(this.f37366a.right, aVar.c()), Math.max(this.f37366a.bottom, aVar.r()));
        this.f37367b.add(aVar);
    }

    @Override // Ua.a
    public float b() {
        return this.f37366a.left;
    }

    @Override // Ua.a
    public float c() {
        return this.f37366a.right;
    }

    public List<a> d() {
        return this.f37367b;
    }

    public boolean e() {
        return this.f37367b.isEmpty();
    }

    @Override // Ua.a
    public float f() {
        return this.f37366a.top;
    }

    @Override // Ua.a
    public float r() {
        return this.f37366a.bottom;
    }
}
