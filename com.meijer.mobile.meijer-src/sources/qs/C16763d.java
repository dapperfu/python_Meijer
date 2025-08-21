package qs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.f;
import androidx.databinding.p;
import bk.AbstractC6392a;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.ui.navigation.NavigationViewHeader;
import ps.C16515a;
import ps.InterfaceC16513Q;
import ps.g0;
import rs.ViewOnClickListenerC16938a;

/* renamed from: qs.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C16763d extends AbstractC16762c implements ViewOnClickListenerC16938a.InterfaceC2488a {

    /* renamed from: R, reason: collision with root package name */
    private static final p.i f158978R = null;

    /* renamed from: S, reason: collision with root package name */
    private static final SparseIntArray f158979S;

    /* renamed from: L, reason: collision with root package name */
    private final NavigationViewHeader f158980L;

    /* renamed from: M, reason: collision with root package name */
    private final View.OnClickListener f158981M;

    /* renamed from: N, reason: collision with root package name */
    private final View.OnClickListener f158982N;

    /* renamed from: O, reason: collision with root package name */
    private final View.OnClickListener f158983O;

    /* renamed from: P, reason: collision with root package name */
    private final View.OnClickListener f158984P;

    /* renamed from: Q, reason: collision with root package name */
    private long f158985Q;

    public C16763d(f fVar, View view) {
        this(fVar, view, p.r0(fVar, view, 11, f158978R, f158979S));
    }

    @Override // qs.AbstractC16762c
    public void O0(com.meijer.mobile.ui.navigation.a aVar) {
        I0(0, aVar);
        this.f158975J = aVar;
        synchronized (this) {
            this.f158985Q |= 1;
        }
        notifyPropertyChanged(C16515a.f157209b);
        super.z0();
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        int iS;
        AbstractC6392a abstractC6392aP;
        AbstractC6392a abstractC6392aO;
        AbstractC6392a abstractC6392aN;
        int iM;
        synchronized (this) {
            j10 = this.f158985Q;
            this.f158985Q = 0L;
        }
        com.meijer.mobile.ui.navigation.a aVar = this.f158975J;
        long j11 = 5 & j10;
        if (j11 == 0 || aVar == null) {
            iS = 0;
            abstractC6392aP = null;
            abstractC6392aO = null;
            abstractC6392aN = null;
            iM = 0;
        } else {
            abstractC6392aP = aVar.P();
            abstractC6392aO = aVar.O();
            abstractC6392aN = aVar.N();
            iS = aVar.S();
            iM = aVar.M();
        }
        if ((j10 & 4) != 0) {
            this.f158966A.setOnClickListener(this.f158984P);
            this.f158969D.setOnClickListener(this.f158982N);
            this.f158970E.setOnClickListener(this.f158983O);
            this.f158972G.setOnClickListener(this.f158981M);
        }
        if (j11 != 0) {
            ck.d.g(this.f158968C, abstractC6392aP);
            this.f158968C.setVisibility(iM);
            ck.d.g(this.f158971F, abstractC6392aO);
            this.f158973H.setVisibility(iS);
            ck.d.e(this.f158974I, abstractC6392aN);
        }
    }

    @Override // rs.ViewOnClickListenerC16938a.InterfaceC2488a
    public final void b(int i10, View view) {
        InterfaceC16513Q interfaceC16513Q;
        if (i10 == 1) {
            InterfaceC16513Q interfaceC16513Q2 = this.f158976K;
            if (interfaceC16513Q2 != null) {
                interfaceC16513Q2.a();
                return;
            }
            return;
        }
        if (i10 == 2) {
            InterfaceC16513Q interfaceC16513Q3 = this.f158976K;
            if (interfaceC16513Q3 != null) {
                interfaceC16513Q3.c();
                return;
            }
            return;
        }
        if (i10 != 3) {
            if (i10 == 4 && (interfaceC16513Q = this.f158976K) != null) {
                interfaceC16513Q.g();
                return;
            }
            return;
        }
        InterfaceC16513Q interfaceC16513Q4 = this.f158976K;
        if (interfaceC16513Q4 != null) {
            interfaceC16513Q4.B();
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f158985Q != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f158985Q = 4L;
        }
        z0();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f158979S = sparseIntArray;
        sparseIntArray.put(g0.f157298n, 8);
        sparseIntArray.put(g0.f157287c, 9);
        sparseIntArray.put(g0.f157290f, 10);
    }

    private C16763d(f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (ImageButton) objArr[9], (Button) objArr[3], (ImageView) objArr[10], (TextView) objArr[5], (View) objArr[8], (Button) objArr[2], (FullWordEllipsisTextView) objArr[6], (ConstraintLayout) objArr[4], (Group) objArr[1], (ImageView) objArr[7]);
        this.f158985Q = -1L;
        this.f158966A.setTag(null);
        NavigationViewHeader navigationViewHeader = (NavigationViewHeader) objArr[0];
        this.f158980L = navigationViewHeader;
        navigationViewHeader.setTag(null);
        this.f158968C.setTag(null);
        this.f158970E.setTag(null);
        this.f158971F.setTag(null);
        this.f158972G.setTag(null);
        this.f158973H.setTag(null);
        this.f158974I.setTag(null);
        B0(view);
        this.f158981M = new ViewOnClickListenerC16938a(this, 3);
        this.f158982N = new ViewOnClickListenerC16938a(this, 4);
        this.f158983O = new ViewOnClickListenerC16938a(this, 1);
        this.f158984P = new ViewOnClickListenerC16938a(this, 2);
        l0();
    }

    private boolean U0(com.meijer.mobile.ui.navigation.a aVar, int i10) {
        if (i10 != C16515a.f157208a) {
            return false;
        }
        synchronized (this) {
            this.f158985Q |= 1;
        }
        return true;
    }

    @Override // qs.AbstractC16762c
    public void R0(InterfaceC16513Q interfaceC16513Q) {
        this.f158976K = interfaceC16513Q;
        synchronized (this) {
            this.f158985Q |= 2;
        }
        notifyPropertyChanged(C16515a.f157210c);
        super.z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return U0((com.meijer.mobile.ui.navigation.a) obj, i11);
    }
}
