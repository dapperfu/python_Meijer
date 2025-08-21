package nw;

import java.util.Queue;
import mw.f;
import ow.e;
import ow.m;

/* loaded from: classes14.dex */
public class a extends e {

    /* renamed from: a, reason: collision with root package name */
    String f153275a;

    /* renamed from: b, reason: collision with root package name */
    m f153276b;

    /* renamed from: c, reason: collision with root package name */
    Queue<d> f153277c;

    @Override // mw.c
    public boolean b() {
        return true;
    }

    @Override // mw.c
    public boolean d() {
        return true;
    }

    @Override // mw.c
    public boolean f() {
        return true;
    }

    @Override // mw.c
    public boolean h() {
        return true;
    }

    @Override // mw.c
    public boolean o() {
        return true;
    }

    @Override // ow.a
    protected void u(b bVar, f fVar, String str, Object[] objArr, Throwable th2) {
        d dVar = new d();
        dVar.k(System.currentTimeMillis());
        dVar.e(bVar);
        dVar.f(this.f153276b);
        dVar.g(this.f153275a);
        if (fVar != null) {
            dVar.a(fVar);
        }
        dVar.h(str);
        dVar.i(Thread.currentThread().getName());
        dVar.d(objArr);
        dVar.j(th2);
        this.f153277c.add(dVar);
    }

    public a(m mVar, Queue<d> queue) {
        this.f153276b = mVar;
        this.f153275a = mVar.u();
        this.f153277c = queue;
    }
}
