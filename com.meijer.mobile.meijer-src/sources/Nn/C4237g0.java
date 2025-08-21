package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;
import bk.AbstractC6392a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: Nn.g0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4237g0 extends AbstractC4232f0 {

    /* renamed from: H, reason: collision with root package name */
    private static final p.i f21960H = null;

    /* renamed from: I, reason: collision with root package name */
    private static final SparseIntArray f21961I;

    /* renamed from: F, reason: collision with root package name */
    private final CoordinatorLayout f21962F;

    /* renamed from: G, reason: collision with root package name */
    private long f21963G;

    public C4237g0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 6, f21960H, f21961I));
    }

    private boolean R0(Vr.e eVar, int i10) {
        if (i10 == 0) {
            synchronized (this) {
                this.f21963G |= 1;
            }
            return true;
        }
        if (i10 == 9) {
            synchronized (this) {
                this.f21963G |= 2;
            }
            return true;
        }
        if (i10 == 4) {
            synchronized (this) {
                this.f21963G |= 4;
            }
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        synchronized (this) {
            this.f21963G |= 8;
        }
        return true;
    }

    @Override // Nn.AbstractC4232f0
    public void O0(Vr.e eVar) {
        I0(0, eVar);
        this.f21924E = eVar;
        synchronized (this) {
            this.f21963G |= 1;
        }
        notifyPropertyChanged(10);
        super.z0();
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21963G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21963G = 16L;
        }
        z0();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21961I = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99750N, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99819T8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100113v1, 5);
    }

    private C4237g0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (AppBarLayout) objArr[3], (FrameLayout) objArr[5], (ImageView) objArr[1], (TextView) objArr[2], (MaterialToolbar) objArr[4]);
        this.f21963G = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f21962F = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.f21921B.setTag(null);
        this.f21922C.setTag(null);
        B0(view);
        l0();
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        AbstractC6392a abstractC6392a;
        synchronized (this) {
            j10 = this.f21963G;
            this.f21963G = 0L;
        }
        Vr.e eVar = this.f21924E;
        String str = null;
        abstractC6392aD0 = null;
        AbstractC6392a abstractC6392aD0 = null;
        int iF0 = 0;
        if ((31 & j10) != 0) {
            String imageUrl = ((j10 & 19) == 0 || eVar == null) ? null : eVar.getImageUrl();
            if ((j10 & 21) != 0 && eVar != null) {
                abstractC6392aD0 = eVar.d0();
            }
            if ((j10 & 25) != 0 && eVar != null) {
                iF0 = eVar.f0();
            }
            abstractC6392a = abstractC6392aD0;
            str = imageUrl;
        } else {
            abstractC6392a = null;
        }
        if ((19 & j10) != 0) {
            Cj.a.a(this.f21921B, str);
        }
        if ((21 & j10) != 0) {
            ck.d.g(this.f21922C, abstractC6392a);
        }
        if ((j10 & 25) != 0) {
            this.f21922C.setVisibility(iF0);
        }
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return R0((Vr.e) obj, i11);
    }
}
