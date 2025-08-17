package p6;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import n6.C15781a;

/* loaded from: classes4.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final List<C15781a> f155597a;

    /* renamed from: b, reason: collision with root package name */
    private PointF f155598b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f155599c;

    public o(PointF pointF, boolean z10, List<C15781a> list) {
        this.f155598b = pointF;
        this.f155599c = z10;
        this.f155597a = new ArrayList(list);
    }

    public List<C15781a> a() {
        return this.f155597a;
    }

    public PointF b() {
        return this.f155598b;
    }

    public void c(o oVar, o oVar2, float f10) {
        if (this.f155598b == null) {
            this.f155598b = new PointF();
        }
        this.f155599c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            u6.g.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int iMin = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f155597a.size() < iMin) {
            for (int size = this.f155597a.size(); size < iMin; size++) {
                this.f155597a.add(new C15781a());
            }
        } else if (this.f155597a.size() > iMin) {
            for (int size2 = this.f155597a.size() - 1; size2 >= iMin; size2--) {
                List<C15781a> list = this.f155597a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = oVar.b();
        PointF pointFB2 = oVar2.b();
        f(u6.l.i(pointFB.x, pointFB2.x, f10), u6.l.i(pointFB.y, pointFB2.y, f10));
        for (int size3 = this.f155597a.size() - 1; size3 >= 0; size3--) {
            C15781a c15781a = oVar.a().get(size3);
            C15781a c15781a2 = oVar2.a().get(size3);
            PointF pointFA = c15781a.a();
            PointF pointFB3 = c15781a.b();
            PointF pointFC = c15781a.c();
            PointF pointFA2 = c15781a2.a();
            PointF pointFB4 = c15781a2.b();
            PointF pointFC2 = c15781a2.c();
            this.f155597a.get(size3).d(u6.l.i(pointFA.x, pointFA2.x, f10), u6.l.i(pointFA.y, pointFA2.y, f10));
            this.f155597a.get(size3).e(u6.l.i(pointFB3.x, pointFB4.x, f10), u6.l.i(pointFB3.y, pointFB4.y, f10));
            this.f155597a.get(size3).f(u6.l.i(pointFC.x, pointFC2.x, f10), u6.l.i(pointFC.y, pointFC2.y, f10));
        }
    }

    public boolean d() {
        return this.f155599c;
    }

    public void e(boolean z10) {
        this.f155599c = z10;
    }

    public void f(float f10, float f11) {
        if (this.f155598b == null) {
            this.f155598b = new PointF();
        }
        this.f155598b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f155597a.size() + "closed=" + this.f155599c + '}';
    }

    public o() {
        this.f155597a = new ArrayList();
    }
}
