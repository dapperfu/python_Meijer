package k6;

import android.graphics.Path;
import j6.s;
import java.util.List;
import w6.C17845a;
import w6.C17847c;

/* loaded from: classes4.dex */
public class m extends AbstractC15093a<q6.o, Path> {

    /* renamed from: i, reason: collision with root package name */
    private final q6.o f141658i;

    /* renamed from: j, reason: collision with root package name */
    private final Path f141659j;

    /* renamed from: k, reason: collision with root package name */
    private Path f141660k;

    /* renamed from: l, reason: collision with root package name */
    private Path f141661l;

    /* renamed from: m, reason: collision with root package name */
    private List<s> f141662m;

    @Override // k6.AbstractC15093a
    protected boolean p() {
        List<s> list = this.f141662m;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // k6.AbstractC15093a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Path i(C17845a<q6.o> c17845a, float f10) {
        q6.o oVar = c17845a.f166945b;
        q6.o oVar2 = c17845a.f166946c;
        this.f141658i.c(oVar, oVar2 == null ? oVar : oVar2, f10);
        q6.o oVarD = this.f141658i;
        List<s> list = this.f141662m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVarD = this.f141662m.get(size).d(oVarD);
            }
        }
        v6.l.h(oVarD, this.f141659j);
        if (this.f141625e == null) {
            return this.f141659j;
        }
        if (this.f141660k == null) {
            this.f141660k = new Path();
            this.f141661l = new Path();
        }
        v6.l.h(oVar, this.f141660k);
        if (oVar2 != null) {
            v6.l.h(oVar2, this.f141661l);
        }
        C17847c<A> c17847c = this.f141625e;
        float f11 = c17845a.f166950g;
        float fFloatValue = c17845a.f166951h.floatValue();
        Path path = this.f141660k;
        return (Path) c17847c.b(f11, fFloatValue, path, oVar2 == null ? path : this.f141661l, f10, e(), f());
    }

    public void s(List<s> list) {
        this.f141662m = list;
    }

    public m(List<C17845a<q6.o>> list) {
        super(list);
        this.f141658i = new q6.o();
        this.f141659j = new Path();
    }
}
