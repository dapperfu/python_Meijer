package Sa;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private RectF f33490a = new RectF(Float.MAX_VALUE, Float.MAX_VALUE, -3.4028235E38f, -3.4028235E38f);

    /* renamed from: b, reason: collision with root package name */
    private List<a> f33491b = new ArrayList();

    public void a(a aVar) {
        RectF rectF = this.f33490a;
        rectF.set(Math.min(rectF.left, aVar.b()), Math.min(this.f33490a.top, aVar.f()), Math.max(this.f33490a.right, aVar.c()), Math.max(this.f33490a.bottom, aVar.r()));
        this.f33491b.add(aVar);
    }

    @Override // Sa.a
    public float b() {
        return this.f33490a.left;
    }

    @Override // Sa.a
    public float c() {
        return this.f33490a.right;
    }

    public List<a> d() {
        return this.f33491b;
    }

    public boolean e() {
        return this.f33491b.isEmpty();
    }

    @Override // Sa.a
    public float f() {
        return this.f33490a.top;
    }

    @Override // Sa.a
    public float r() {
        return this.f33490a.bottom;
    }
}
