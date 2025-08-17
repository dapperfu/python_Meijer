package Mn;

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

/* loaded from: classes9.dex */
public class r extends AbstractC4274q {

    /* renamed from: V, reason: collision with root package name */
    private static final p.i f20900V;

    /* renamed from: W, reason: collision with root package name */
    private static final SparseIntArray f20901W;

    /* renamed from: S, reason: collision with root package name */
    private final CoordinatorLayout f20902S;

    /* renamed from: T, reason: collision with root package name */
    private final ConstraintLayout f20903T;

    /* renamed from: U, reason: collision with root package name */
    private long f20904U;

    public r(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 21, f20900V, f20901W));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20904U = 0L;
        }
        androidx.databinding.p.Y(this.f20873G);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f20904U != 0) {
                    return true;
                }
                return this.f20873G.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20904U = 2L;
        }
        this.f20873G.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(21);
        f20900V = iVar;
        iVar.a(1, new String[]{"cart_error_empty_screen"}, new int[]{2}, new int[]{com.meijer.mobile.meijer.V.f99333L});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20901W = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98894N, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98973U8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98955T0, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98975V0, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99110h8, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98925Q0, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99050c3, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98993W8, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99049c2, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99171n3, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98990W5, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99304z4, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99182o3, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98764A4, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99245u0, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98946S1, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99089f9, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 20);
    }

    private r(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (AppBarLayout) objArr[3], (FrameLayout) objArr[17], (MaterialTextView) objArr[8], (ConstraintLayout) objArr[5], (NestedScrollView) objArr[6], (View) objArr[18], (MaterialTextView) objArr[11], (AbstractC4294v0) objArr[2], (MaterialButton) objArr[9], (View) objArr[12], (View) objArr[15], (MaterialTextView) objArr[14], (RecyclerView) objArr[16], (RecyclerView) objArr[13], (ProgressView) objArr[20], (View) objArr[7], (MaterialToolbar) objArr[4], (View) objArr[10], (MaterialButton) objArr[19]);
        this.f20904U = -1L;
        C0(this.f20873G);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f20902S = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f20903T = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }

    private boolean K0(AbstractC4294v0 abstractC4294v0, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20904U |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return K0((AbstractC4294v0) obj, i11);
    }
}
