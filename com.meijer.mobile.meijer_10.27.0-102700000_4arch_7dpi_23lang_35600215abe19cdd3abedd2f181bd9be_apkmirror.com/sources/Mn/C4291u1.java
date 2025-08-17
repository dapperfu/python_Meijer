package Mn;

import ak.AbstractC5607a;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;
import com.meijer.mobile.widget.UnauthFooterView;

/* renamed from: Mn.u1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4291u1 extends AbstractC4287t1 {

    /* renamed from: P, reason: collision with root package name */
    private static final p.i f21023P = null;

    /* renamed from: Q, reason: collision with root package name */
    private static final SparseIntArray f21024Q;

    /* renamed from: M, reason: collision with root package name */
    private final FrameLayout f21025M;

    /* renamed from: N, reason: collision with root package name */
    private final LinearLayout f21026N;

    /* renamed from: O, reason: collision with root package name */
    private long f21027O;

    public C4291u1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 14, f21023P, f21024Q));
    }

    @Override // Mn.AbstractC4287t1
    public void O0(Km.h hVar) {
        H0(0, hVar);
        this.f20986L = hVar;
        synchronized (this) {
            this.f21027O |= 1;
        }
        notifyPropertyChanged(10);
        super.A0();
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21027O != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21027O = 256L;
        }
        A0();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21024Q = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99056c9, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99078e9, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99067d9, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99301z1, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99268w1, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 13);
    }

    private C4291u1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 8, (Button) objArr[3], (Button) objArr[12], (TextView) objArr[6], (LinearLayout) objArr[11], (RecyclerView) objArr[7], (TextView) objArr[1], (TextView) objArr[2], (ProgressView) objArr[13], (ConstraintLayout) objArr[4], (TextView) objArr[8], (View) objArr[10], (UnauthFooterView) objArr[9]);
        this.f21027O = -1L;
        this.f20987z.setTag(null);
        this.f20976B.setTag(null);
        this.f20978D.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f21025M = frameLayout;
        frameLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[5];
        this.f21026N = linearLayout;
        linearLayout.setTag(null);
        this.f20979E.setTag(null);
        this.f20980F.setTag(null);
        this.f20982H.setTag(null);
        D0(view);
        o0();
    }

    private boolean P0(Km.h hVar, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21027O |= 1;
        }
        return true;
    }

    private boolean Q0(androidx.databinding.i<AbstractC5607a> iVar, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21027O |= 8;
        }
        return true;
    }

    private boolean T0(androidx.databinding.j jVar, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21027O |= 128;
        }
        return true;
    }

    private boolean W0(androidx.databinding.j jVar, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21027O |= 16;
        }
        return true;
    }

    private boolean Y0(androidx.databinding.j jVar, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21027O |= 64;
        }
        return true;
    }

    private boolean d1(androidx.databinding.j jVar, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21027O |= 4;
        }
        return true;
    }

    private boolean g1(androidx.databinding.i<AbstractC5607a> iVar, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21027O |= 2;
        }
        return true;
    }

    private boolean h1(androidx.databinding.j jVar, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21027O |= 32;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    @Override // androidx.databinding.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void W() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mn.C4291u1.W():void");
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        switch (i10) {
            case 0:
                return P0((Km.h) obj, i11);
            case 1:
                return g1((androidx.databinding.i) obj, i11);
            case 2:
                return d1((androidx.databinding.j) obj, i11);
            case 3:
                return Q0((androidx.databinding.i) obj, i11);
            case 4:
                return W0((androidx.databinding.j) obj, i11);
            case 5:
                return h1((androidx.databinding.j) obj, i11);
            case 6:
                return Y0((androidx.databinding.j) obj, i11);
            case 7:
                return T0((androidx.databinding.j) obj, i11);
            default:
                return false;
        }
    }
}
