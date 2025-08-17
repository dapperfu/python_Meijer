package rw;

import java.util.Queue;
import sw.e;
import sw.m;

/* loaded from: classes13.dex */
public class a extends e {

    /* renamed from: a, reason: collision with root package name */
    String f159799a;

    /* renamed from: b, reason: collision with root package name */
    m f159800b;

    /* renamed from: c, reason: collision with root package name */
    Queue<d> f159801c;

    @Override // qw.c
    public boolean b() {
        return true;
    }

    @Override // qw.c
    public boolean d() {
        return true;
    }

    @Override // qw.c
    public boolean f() {
        return true;
    }

    @Override // qw.c
    public boolean h() {
        return true;
    }

    @Override // qw.c
    public boolean n() {
        return true;
    }

    @Override // sw.a
    protected void t(b bVar, qw.e eVar, String str, Object[] objArr, Throwable th2) {
        d dVar = new d();
        dVar.j(System.currentTimeMillis());
        dVar.d(bVar);
        dVar.e(this.f159800b);
        dVar.f(this.f159799a);
        if (eVar != null) {
            dVar.a(eVar);
        }
        dVar.g(str);
        dVar.h(Thread.currentThread().getName());
        dVar.c(objArr);
        dVar.i(th2);
        this.f159801c.add(dVar);
    }

    public a(m mVar, Queue<d> queue) {
        this.f159800b = mVar;
        this.f159799a = mVar.t();
        this.f159801c = queue;
    }
}
