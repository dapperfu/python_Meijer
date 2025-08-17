package Mn;

import ak.AbstractC5607a;
import android.util.SparseIntArray;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes9.dex */
public class S extends Q {

    /* renamed from: L, reason: collision with root package name */
    private static final p.i f20306L = null;

    /* renamed from: M, reason: collision with root package name */
    private static final SparseIntArray f20307M;

    /* renamed from: J, reason: collision with root package name */
    private final CoordinatorLayout f20308J;

    /* renamed from: K, reason: collision with root package name */
    private long f20309K;

    public S(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 10, f20306L, f20307M));
    }

    private boolean P0(yn.c cVar, int i10) {
        if (i10 == 0) {
            synchronized (this) {
                this.f20309K |= 1;
            }
            return true;
        }
        if (i10 == 12) {
            synchronized (this) {
                this.f20309K |= 2;
            }
            return true;
        }
        if (i10 != 15) {
            return false;
        }
        synchronized (this) {
            this.f20309K |= 4;
        }
        return true;
    }

    @Override // Mn.Q
    public void O0(yn.c cVar) {
        H0(0, cVar);
        this.f20282I = cVar;
        synchronized (this) {
            this.f20309K |= 1;
        }
        notifyPropertyChanged(10);
        super.A0();
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f20309K;
            this.f20309K = 0L;
        }
        yn.c cVar = this.f20282I;
        AbstractC5607a abstractC5607aH0 = null;
        int iG0 = 0;
        if ((15 & j10) != 0) {
            if ((j10 & 13) != 0 && cVar != null) {
                abstractC5607aH0 = cVar.h0();
            }
            if ((j10 & 11) != 0 && cVar != null) {
                iG0 = cVar.g0();
            }
        }
        if ((j10 & 13) != 0) {
            bk.k.a(this.f20275B, abstractC5607aH0);
        }
        if ((j10 & 11) != 0) {
            this.f20279F.setVisibility(iG0);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20309K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20309K = 8L;
        }
        A0();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20307M = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99267w0, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98763A3, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98961T6, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98981V6, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99201q0, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98850I5, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98874L, 9);
    }

    private S(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (MaterialToolbar) objArr[9], (ConstraintLayout) objArr[7], (MaterialToolbar) objArr[2], (SurfaceView) objArr[3], (Guideline) objArr[4], (RecyclerView) objArr[8], (ProgressBar) objArr[1], (ImageView) objArr[5], (TextView) objArr[6]);
        this.f20309K = -1L;
        this.f20275B.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f20308J = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.f20279F.setTag(null);
        D0(view);
        o0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return P0((yn.c) obj, i11);
    }
}
