package C;

import F.x0;
import G.h;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public abstract class N implements I {
    @Override // C.I
    public abstract x0 a();

    @Override // C.I
    public abstract int c();

    public abstract Matrix e();

    @Override // C.I
    public abstract long getTimestamp();

    public static I d(x0 x0Var, long j10, int i10, Matrix matrix) {
        return new C3019d(x0Var, j10, i10, matrix);
    }

    @Override // C.I
    public void b(h.b bVar) {
        bVar.m(c());
    }
}
