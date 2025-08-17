package j6;

import android.graphics.Path;
import i6.s;
import java.util.List;
import v6.C17512a;
import v6.C17514c;

/* loaded from: classes4.dex */
public class m extends AbstractC14861a<p6.o, Path> {

    /* renamed from: i, reason: collision with root package name */
    private final p6.o f139460i;

    /* renamed from: j, reason: collision with root package name */
    private final Path f139461j;

    /* renamed from: k, reason: collision with root package name */
    private Path f139462k;

    /* renamed from: l, reason: collision with root package name */
    private Path f139463l;

    /* renamed from: m, reason: collision with root package name */
    private List<s> f139464m;

    @Override // j6.AbstractC14861a
    protected boolean p() {
        List<s> list = this.f139464m;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // j6.AbstractC14861a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Path i(C17512a<p6.o> c17512a, float f10) {
        p6.o oVar = c17512a.f164561b;
        p6.o oVar2 = c17512a.f164562c;
        this.f139460i.c(oVar, oVar2 == null ? oVar : oVar2, f10);
        p6.o oVarF = this.f139460i;
        List<s> list = this.f139464m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVarF = this.f139464m.get(size).f(oVarF);
            }
        }
        u6.l.h(oVarF, this.f139461j);
        if (this.f139427e == null) {
            return this.f139461j;
        }
        if (this.f139462k == null) {
            this.f139462k = new Path();
            this.f139463l = new Path();
        }
        u6.l.h(oVar, this.f139462k);
        if (oVar2 != null) {
            u6.l.h(oVar2, this.f139463l);
        }
        C17514c<A> c17514c = this.f139427e;
        float f11 = c17512a.f164566g;
        float fFloatValue = c17512a.f164567h.floatValue();
        Path path = this.f139462k;
        return (Path) c17514c.b(f11, fFloatValue, path, oVar2 == null ? path : this.f139463l, f10, e(), f());
    }

    public void s(List<s> list) {
        this.f139464m = list;
    }

    public m(List<C17512a<p6.o>> list) {
        super(list);
        this.f139460i = new p6.o();
        this.f139461j = new Path();
    }
}
