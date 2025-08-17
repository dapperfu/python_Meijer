package H4;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes4.dex */
class M extends L {
    M() {
    }

    @Override // H4.F
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // H4.J, H4.F
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // H4.F
    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // H4.L, H4.F
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // H4.H, H4.F
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // H4.H, H4.F
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
