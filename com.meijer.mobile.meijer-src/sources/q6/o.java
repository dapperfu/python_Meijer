package q6;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import o6.C16075a;

/* loaded from: classes4.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final List<C16075a> f158001a;

    /* renamed from: b, reason: collision with root package name */
    private PointF f158002b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f158003c;

    public o(PointF pointF, boolean z10, List<C16075a> list) {
        this.f158002b = pointF;
        this.f158003c = z10;
        this.f158001a = new ArrayList(list);
    }

    public List<C16075a> a() {
        return this.f158001a;
    }

    public PointF b() {
        return this.f158002b;
    }

    public void c(o oVar, o oVar2, float f10) {
        if (this.f158002b == null) {
            this.f158002b = new PointF();
        }
        this.f158003c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            v6.g.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int iMin = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f158001a.size() < iMin) {
            for (int size = this.f158001a.size(); size < iMin; size++) {
                this.f158001a.add(new C16075a());
            }
        } else if (this.f158001a.size() > iMin) {
            for (int size2 = this.f158001a.size() - 1; size2 >= iMin; size2--) {
                List<C16075a> list = this.f158001a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = oVar.b();
        PointF pointFB2 = oVar2.b();
        f(v6.l.i(pointFB.x, pointFB2.x, f10), v6.l.i(pointFB.y, pointFB2.y, f10));
        for (int size3 = this.f158001a.size() - 1; size3 >= 0; size3--) {
            C16075a c16075a = oVar.a().get(size3);
            C16075a c16075a2 = oVar2.a().get(size3);
            PointF pointFA = c16075a.a();
            PointF pointFB3 = c16075a.b();
            PointF pointFC = c16075a.c();
            PointF pointFA2 = c16075a2.a();
            PointF pointFB4 = c16075a2.b();
            PointF pointFC2 = c16075a2.c();
            this.f158001a.get(size3).d(v6.l.i(pointFA.x, pointFA2.x, f10), v6.l.i(pointFA.y, pointFA2.y, f10));
            this.f158001a.get(size3).e(v6.l.i(pointFB3.x, pointFB4.x, f10), v6.l.i(pointFB3.y, pointFB4.y, f10));
            this.f158001a.get(size3).f(v6.l.i(pointFC.x, pointFC2.x, f10), v6.l.i(pointFC.y, pointFC2.y, f10));
        }
    }

    public boolean d() {
        return this.f158003c;
    }

    public void e(boolean z10) {
        this.f158003c = z10;
    }

    public void f(float f10, float f11) {
        if (this.f158002b == null) {
            this.f158002b = new PointF();
        }
        this.f158002b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f158001a.size() + "closed=" + this.f158003c + '}';
    }

    public o() {
        this.f158001a = new ArrayList();
    }
}
