package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes10.dex */
public class r extends AbstractC4279q {

    /* renamed from: V, reason: collision with root package name */
    private static final p.i f22232V;

    /* renamed from: W, reason: collision with root package name */
    private static final SparseIntArray f22233W;

    /* renamed from: S, reason: collision with root package name */
    private final CoordinatorLayout f22234S;

    /* renamed from: T, reason: collision with root package name */
    private final ConstraintLayout f22235T;

    /* renamed from: U, reason: collision with root package name */
    private long f22236U;

    public r(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 21, f22232V, f22233W));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22236U = 0L;
        }
        androidx.databinding.p.Z(this.f22205G);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f22236U != 0) {
                    return true;
                }
                return this.f22205G.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22236U = 2L;
        }
        this.f22205G.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(21);
        f22232V = iVar;
        iVar.a(1, new String[]{"cart_error_empty_screen"}, new int[]{2}, new int[]{com.meijer.mobile.meijer.V.f100189L});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22233W = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99750N, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99819T8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99811T0, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99831V0, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99955g8, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99781Q0, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99906c3, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99839V8, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99905c2, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100027n3, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99836V5, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100160z4, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100038o3, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99621A4, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100101u0, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99802S1, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99934e9, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 20);
    }

    private r(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (AppBarLayout) objArr[3], (FrameLayout) objArr[17], (MaterialTextView) objArr[8], (ConstraintLayout) objArr[5], (NestedScrollView) objArr[6], (View) objArr[18], (MaterialTextView) objArr[11], (AbstractC4299v0) objArr[2], (MaterialButton) objArr[9], (View) objArr[12], (View) objArr[15], (MaterialTextView) objArr[14], (RecyclerView) objArr[16], (RecyclerView) objArr[13], (ProgressView) objArr[20], (View) objArr[7], (MaterialToolbar) objArr[4], (View) objArr[10], (MaterialButton) objArr[19]);
        this.f22236U = -1L;
        A0(this.f22205G);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f22234S = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f22235T = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }

    private boolean M0(AbstractC4299v0 abstractC4299v0, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f22236U |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return M0((AbstractC4299v0) obj, i11);
    }
}
