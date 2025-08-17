package Mn;

import ak.AbstractC5607a;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: Mn.g0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4232g0 extends AbstractC4227f0 {

    /* renamed from: H, reason: collision with root package name */
    private static final p.i f20628H = null;

    /* renamed from: I, reason: collision with root package name */
    private static final SparseIntArray f20629I;

    /* renamed from: F, reason: collision with root package name */
    private final CoordinatorLayout f20630F;

    /* renamed from: G, reason: collision with root package name */
    private long f20631G;

    public C4232g0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 6, f20628H, f20629I));
    }

    private boolean P0(Vr.e eVar, int i10) {
        if (i10 == 0) {
            synchronized (this) {
                this.f20631G |= 1;
            }
            return true;
        }
        if (i10 == 9) {
            synchronized (this) {
                this.f20631G |= 2;
            }
            return true;
        }
        if (i10 == 4) {
            synchronized (this) {
                this.f20631G |= 4;
            }
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        synchronized (this) {
            this.f20631G |= 8;
        }
        return true;
    }

    @Override // Mn.AbstractC4227f0
    public void O0(Vr.e eVar) {
        H0(0, eVar);
        this.f20592E = eVar;
        synchronized (this) {
            this.f20631G |= 1;
        }
        notifyPropertyChanged(10);
        super.A0();
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20631G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20631G = 16L;
        }
        A0();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20629I = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98894N, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98973U8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99257v1, 5);
    }

    private C4232g0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (AppBarLayout) objArr[3], (FrameLayout) objArr[5], (ImageView) objArr[1], (TextView) objArr[2], (MaterialToolbar) objArr[4]);
        this.f20631G = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f20630F = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.f20589B.setTag(null);
        this.f20590C.setTag(null);
        D0(view);
        o0();
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        AbstractC5607a abstractC5607a;
        synchronized (this) {
            j10 = this.f20631G;
            this.f20631G = 0L;
        }
        Vr.e eVar = this.f20592E;
        String str = null;
        abstractC5607aD0 = null;
        AbstractC5607a abstractC5607aD0 = null;
        int iF0 = 0;
        if ((31 & j10) != 0) {
            String imageUrl = ((j10 & 19) == 0 || eVar == null) ? null : eVar.getImageUrl();
            if ((j10 & 21) != 0 && eVar != null) {
                abstractC5607aD0 = eVar.d0();
            }
            if ((j10 & 25) != 0 && eVar != null) {
                iF0 = eVar.f0();
            }
            abstractC5607a = abstractC5607aD0;
            str = imageUrl;
        } else {
            abstractC5607a = null;
        }
        if ((19 & j10) != 0) {
            Bj.a.a(this.f20589B, str);
        }
        if ((21 & j10) != 0) {
            bk.d.g(this.f20590C, abstractC5607a);
        }
        if ((j10 & 25) != 0) {
            this.f20590C.setVisibility(iF0);
        }
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return P0((Vr.e) obj, i11);
    }
}
