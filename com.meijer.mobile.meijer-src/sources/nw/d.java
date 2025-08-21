package nw;

import java.util.ArrayList;
import java.util.List;
import mw.f;
import ow.m;

/* loaded from: classes14.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    b f153286a;

    /* renamed from: b, reason: collision with root package name */
    List<f> f153287b;

    /* renamed from: c, reason: collision with root package name */
    String f153288c;

    /* renamed from: d, reason: collision with root package name */
    m f153289d;

    /* renamed from: e, reason: collision with root package name */
    String f153290e;

    /* renamed from: f, reason: collision with root package name */
    String f153291f;

    /* renamed from: g, reason: collision with root package name */
    Object[] f153292g;

    /* renamed from: h, reason: collision with root package name */
    long f153293h;

    /* renamed from: i, reason: collision with root package name */
    Throwable f153294i;

    public void a(f fVar) {
        if (fVar == null) {
            return;
        }
        if (this.f153287b == null) {
            this.f153287b = new ArrayList(2);
        }
        this.f153287b.add(fVar);
    }

    public b b() {
        return this.f153286a;
    }

    public m c() {
        return this.f153289d;
    }

    public void d(Object[] objArr) {
        this.f153292g = objArr;
    }

    public void e(b bVar) {
        this.f153286a = bVar;
    }

    public void f(m mVar) {
        this.f153289d = mVar;
    }

    public void g(String str) {
        this.f153288c = str;
    }

    public void h(String str) {
        this.f153291f = str;
    }

    public void i(String str) {
        this.f153290e = str;
    }

    public void j(Throwable th2) {
        this.f153294i = th2;
    }

    public void k(long j10) {
        this.f153293h = j10;
    }
}
