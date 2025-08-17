package Mn;

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

/* renamed from: Mn.i0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4242i0 extends AbstractC4237h0 {

    /* renamed from: O, reason: collision with root package name */
    private static final p.i f20681O;

    /* renamed from: P, reason: collision with root package name */
    private static final SparseIntArray f20682P;

    /* renamed from: N, reason: collision with root package name */
    private long f20683N;

    public C4242i0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 14, f20681O, f20682P));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20683N = 0L;
        }
        androidx.databinding.p.Y(this.f20647B);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f20683N != 0) {
                    return true;
                }
                return this.f20647B.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20683N = 2L;
        }
        this.f20647B.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(14);
        f20681O = iVar;
        iVar.a(0, new String[]{"view_progress_indicator"}, new int[]{1}, new int[]{com.meijer.mobile.meijer.V.f99416r1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20682P = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99012Y7, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98973U8, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99130j6, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98931Q6, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99055c8, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99033a8, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99066d8, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99044b8, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98956T1, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98822F7, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99230s7, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 13);
    }

    private C4242i0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (View) objArr[10], (View) objArr[4], (v3) objArr[1], (ProgressView) objArr[13], (ScrollView) objArr[5], (TextView) objArr[12], (MaterialButton) objArr[11], (AppBarLayout) objArr[2], (ImageView) objArr[7], (TextView) objArr[9], (ConstraintLayout) objArr[6], (TextView) objArr[8], (MaterialToolbar) objArr[3], (CoordinatorLayout) objArr[0]);
        this.f20683N = -1L;
        C0(this.f20647B);
        this.f20658M.setTag(null);
        D0(view);
        o0();
    }

    private boolean O0(v3 v3Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20683N |= 1;
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
