package N;

import C.I;
import F.C3283s;
import F.EnumC3277l;
import F.EnumC3279n;
import F.EnumC3281p;
import F.r;
import androidx.camera.core.n;

/* loaded from: classes.dex */
public final class d extends a<n> {
    public d(int i10, b<n> bVar) {
        super(i10, bVar);
    }

    private boolean e(I i10) {
        r rVarA = C3283s.a(i10);
        if ((rVarA.g() != EnumC3279n.LOCKED_FOCUSED && rVarA.g() != EnumC3279n.PASSIVE_FOCUSED) || rVarA.j() != EnumC3277l.CONVERGED || rVarA.h() != EnumC3281p.CONVERGED) {
            return false;
        }
        return true;
    }

    public void d(n nVar) {
        if (e(nVar.S2())) {
            super.b(nVar);
        } else {
            this.f20519d.a(nVar);
        }
    }
}
