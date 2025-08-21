package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* renamed from: Nn.i0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4247i0 extends AbstractC4242h0 {

    /* renamed from: O, reason: collision with root package name */
    private static final p.i f22013O;

    /* renamed from: P, reason: collision with root package name */
    private static final SparseIntArray f22014P;

    /* renamed from: N, reason: collision with root package name */
    private long f22015N;

    public C4247i0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 14, f22013O, f22014P));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22015N = 0L;
        }
        androidx.databinding.p.Z(this.f21979B);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f22015N != 0) {
                    return true;
                }
                return this.f21979B.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22015N = 2L;
        }
        this.f21979B.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(14);
        f22013O = iVar;
        iVar.a(0, new String[]{"view_progress_indicator"}, new int[]{1}, new int[]{com.meijer.mobile.meijer.V.f100272r1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22014P = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99858X7, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99819T8, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99975i6, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99777P6, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99900b8, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99878Z7, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99911c8, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99889a8, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99812T1, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99668E7, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100075r7, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 13);
    }

    private C4247i0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (View) objArr[10], (View) objArr[4], (v3) objArr[1], (ProgressView) objArr[13], (ScrollView) objArr[5], (TextView) objArr[12], (MaterialButton) objArr[11], (AppBarLayout) objArr[2], (ImageView) objArr[7], (TextView) objArr[9], (ConstraintLayout) objArr[6], (TextView) objArr[8], (MaterialToolbar) objArr[3], (CoordinatorLayout) objArr[0]);
        this.f22015N = -1L;
        A0(this.f21979B);
        this.f21990M.setTag(null);
        B0(view);
        l0();
    }

    private boolean O0(v3 v3Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f22015N |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((v3) obj, i11);
    }
}
