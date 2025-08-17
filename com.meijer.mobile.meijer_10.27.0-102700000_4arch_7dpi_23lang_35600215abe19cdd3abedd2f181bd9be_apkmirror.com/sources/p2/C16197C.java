package p2;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;

/* renamed from: p2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C16197C {

    /* renamed from: a, reason: collision with root package name */
    private ViewParent f155332a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f155333b;

    /* renamed from: c, reason: collision with root package name */
    private final View f155334c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f155335d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f155336e;

    public boolean c(int i10, int i11, int[] iArr, int[] iArr2) {
        return d(i10, i11, iArr, iArr2, 0);
    }

    public boolean f(int i10, int i11, int i12, int i13, int[] iArr) {
        return h(i10, i11, i12, i13, iArr, 0, null);
    }

    public boolean g(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return h(i10, i11, i12, i13, iArr, i14, null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean p(int i10) {
        return q(i10, 0);
    }

    public void r() {
        s(0);
    }

    private boolean h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentI;
        int i15;
        int i16;
        int[] iArr3;
        if (!m() || (viewParentI = i(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f155334c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] iArrJ = j();
            iArrJ[0] = 0;
            iArrJ[1] = 0;
            iArr3 = iArrJ;
        } else {
            iArr3 = iArr2;
        }
        C16208e0.d(viewParentI, this.f155334c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f155334c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    private ViewParent i(int i10) {
        if (i10 == 0) {
            return this.f155332a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f155333b;
    }

    private int[] j() {
        if (this.f155336e == null) {
            this.f155336e = new int[2];
        }
        return this.f155336e;
    }

    private void o(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f155332a = viewParent;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f155333b = viewParent;
        }
    }

    public boolean m() {
        return this.f155335d;
    }

    public void n(boolean z10) {
        if (this.f155335d) {
            ViewCompat.L0(this.f155334c);
        }
        this.f155335d = z10;
    }

    public C16197C(View view) {
        this.f155334c = view;
    }

    public boolean a(float f10, float f11, boolean z10) {
        ViewParent viewParentI;
        if (!m() || (viewParentI = i(0)) == null) {
            return false;
        }
        return C16208e0.a(viewParentI, this.f155334c, f10, f11, z10);
    }

    public boolean b(float f10, float f11) {
        ViewParent viewParentI;
        if (!m() || (viewParentI = i(0)) == null) {
            return false;
        }
        return C16208e0.b(viewParentI, this.f155334c, f10, f11);
    }

    public boolean d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent viewParentI;
        int i13;
        int i14;
        if (!m() || (viewParentI = i(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f155334c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        C16208e0.c(viewParentI, this.f155334c, i10, i11, iArr3, i12);
        if (iArr2 != null) {
            this.f155334c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        h(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean l(int i10) {
        if (i(i10) != null) {
            return true;
        }
        return false;
    }

    public boolean q(int i10, int i11) {
        if (l(i11)) {
            return true;
        }
        if (m()) {
            View view = this.f155334c;
            for (ViewParent parent = this.f155334c.getParent(); parent != null; parent = parent.getParent()) {
                if (C16208e0.f(parent, view, this.f155334c, i10, i11)) {
                    o(i11, parent);
                    C16208e0.e(parent, view, this.f155334c, i10, i11);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public void s(int i10) {
        ViewParent viewParentI = i(i10);
        if (viewParentI != null) {
            C16208e0.g(viewParentI, this.f155334c, i10);
            o(i10, null);
        }
    }
}
