package Nn;

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
import bk.AbstractC6392a;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes10.dex */
public class S extends Q {

    /* renamed from: L, reason: collision with root package name */
    private static final p.i f21638L = null;

    /* renamed from: M, reason: collision with root package name */
    private static final SparseIntArray f21639M;

    /* renamed from: J, reason: collision with root package name */
    private final CoordinatorLayout f21640J;

    /* renamed from: K, reason: collision with root package name */
    private long f21641K;

    public S(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 10, f21638L, f21639M));
    }

    private boolean R0(zn.c cVar, int i10) {
        if (i10 == 0) {
            synchronized (this) {
                this.f21641K |= 1;
            }
            return true;
        }
        if (i10 == 12) {
            synchronized (this) {
                this.f21641K |= 2;
            }
            return true;
        }
        if (i10 != 15) {
            return false;
        }
        synchronized (this) {
            this.f21641K |= 4;
        }
        return true;
    }

    @Override // Nn.Q
    public void O0(zn.c cVar) {
        I0(0, cVar);
        this.f21614I = cVar;
        synchronized (this) {
            this.f21641K |= 1;
        }
        notifyPropertyChanged(10);
        super.z0();
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f21641K;
            this.f21641K = 0L;
        }
        zn.c cVar = this.f21614I;
        AbstractC6392a abstractC6392aH0 = null;
        int iG0 = 0;
        if ((15 & j10) != 0) {
            if ((j10 & 13) != 0 && cVar != null) {
                abstractC6392aH0 = cVar.h0();
            }
            if ((j10 & 11) != 0 && cVar != null) {
                iG0 = cVar.g0();
            }
        }
        if ((j10 & 13) != 0) {
            ck.k.a(this.f21607B, abstractC6392aH0);
        }
        if ((j10 & 11) != 0) {
            this.f21611F.setVisibility(iG0);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21641K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21641K = 8L;
        }
        z0();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21639M = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100123w0, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99620A3, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99807S6, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99827U6, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100057q0, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99696H5, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99730L, 9);
    }

    private S(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (MaterialToolbar) objArr[9], (ConstraintLayout) objArr[7], (MaterialToolbar) objArr[2], (SurfaceView) objArr[3], (Guideline) objArr[4], (RecyclerView) objArr[8], (ProgressBar) objArr[1], (ImageView) objArr[5], (TextView) objArr[6]);
        this.f21641K = -1L;
        this.f21607B.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f21640J = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.f21611F.setTag(null);
        B0(view);
        l0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return R0((zn.c) obj, i11);
    }
}
