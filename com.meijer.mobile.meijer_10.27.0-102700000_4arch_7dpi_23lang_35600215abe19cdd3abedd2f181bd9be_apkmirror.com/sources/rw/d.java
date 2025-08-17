package rw;

import java.util.ArrayList;
import java.util.List;
import qw.e;
import sw.m;

/* loaded from: classes13.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    b f159810a;

    /* renamed from: b, reason: collision with root package name */
    List<e> f159811b;

    /* renamed from: c, reason: collision with root package name */
    String f159812c;

    /* renamed from: d, reason: collision with root package name */
    m f159813d;

    /* renamed from: e, reason: collision with root package name */
    String f159814e;

    /* renamed from: f, reason: collision with root package name */
    String f159815f;

    /* renamed from: g, reason: collision with root package name */
    Object[] f159816g;

    /* renamed from: h, reason: collision with root package name */
    long f159817h;

    /* renamed from: i, reason: collision with root package name */
    Throwable f159818i;

    public void a(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f159811b == null) {
            this.f159811b = new ArrayList(2);
        }
        this.f159811b.add(eVar);
    }

    public m b() {
        return this.f159813d;
    }

    public void c(Object[] objArr) {
        this.f159816g = objArr;
    }

    public void d(b bVar) {
        this.f159810a = bVar;
    }

    public void e(m mVar) {
        this.f159813d = mVar;
    }

    public void f(String str) {
        this.f159812c = str;
    }

    public void g(String str) {
        this.f159815f = str;
    }

    public void h(String str) {
        this.f159814e = str;
    }

    public void i(Throwable th2) {
        this.f159818i = th2;
    }

    public void j(long j10) {
        this.f159817h = j10;
    }
}
