package fsimpl;

import android.graphics.Matrix;
import android.view.View;
import java.util.List;

/* renamed from: fsimpl.ay, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14098ay {
    public static int a(List list, gh ghVar) {
        if (list.size() <= 0) {
            return 0;
        }
        int[] iArr = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr[i10] = ((Integer) list.get(i10)).intValue();
        }
        return dE.a(ghVar, iArr);
    }

    static void a(gh ghVar, int i10, int i11) {
        dE.g(ghVar, (i10 & 16777215) | (i11 << 24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(gh ghVar, boolean z10, boolean z11) {
        int i10 = z10;
        if (z11) {
            i10 = (z10 ? 1 : 0) | 2;
        }
        dE.r(ghVar, i10);
    }

    static void a(C14248u c14248u, View view, int i10, int i11, int i12, int i13) {
        Matrix matrix = new Matrix();
        view.transformMatrixToGlobal(matrix);
        c14248u.a(matrix, i10, i11, i12, i13);
    }
}
