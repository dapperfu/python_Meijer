package qs;

import ak.AbstractC5607a;
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
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.ui.navigation.NavigationViewHeader;
import ps.C16389a;
import ps.InterfaceC16387Q;
import ps.g0;
import rs.ViewOnClickListenerC16832a;

/* renamed from: qs.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C16604d extends AbstractC16603c implements ViewOnClickListenerC16832a.InterfaceC2492a {

    /* renamed from: R, reason: collision with root package name */
    private static final p.i f157541R = null;

    /* renamed from: S, reason: collision with root package name */
    private static final SparseIntArray f157542S;

    /* renamed from: L, reason: collision with root package name */
    private final NavigationViewHeader f157543L;

    /* renamed from: M, reason: collision with root package name */
    private final View.OnClickListener f157544M;

    /* renamed from: N, reason: collision with root package name */
    private final View.OnClickListener f157545N;

    /* renamed from: O, reason: collision with root package name */
    private final View.OnClickListener f157546O;

    /* renamed from: P, reason: collision with root package name */
    private final View.OnClickListener f157547P;

    /* renamed from: Q, reason: collision with root package name */
    private long f157548Q;

    public C16604d(f fVar, View view) {
        this(fVar, view, p.s0(fVar, view, 11, f157541R, f157542S));
    }

    @Override // qs.AbstractC16603c
    public void O0(com.meijer.mobile.ui.navigation.a aVar) {
        H0(0, aVar);
        this.f157538J = aVar;
        synchronized (this) {
            this.f157548Q |= 1;
        }
        notifyPropertyChanged(C16389a.f156436b);
        super.A0();
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        int iS;
        AbstractC5607a abstractC5607aP;
        AbstractC5607a abstractC5607aO;
        AbstractC5607a abstractC5607aN;
        int iM;
        synchronized (this) {
            j10 = this.f157548Q;
            this.f157548Q = 0L;
        }
        com.meijer.mobile.ui.navigation.a aVar = this.f157538J;
        long j11 = 5 & j10;
        if (j11 == 0 || aVar == null) {
            iS = 0;
            abstractC5607aP = null;
            abstractC5607aO = null;
            abstractC5607aN = null;
            iM = 0;
        } else {
            abstractC5607aP = aVar.P();
            abstractC5607aO = aVar.O();
            abstractC5607aN = aVar.N();
            iS = aVar.S();
            iM = aVar.M();
        }
        if ((j10 & 4) != 0) {
            this.f157529A.setOnClickListener(this.f157547P);
            this.f157532D.setOnClickListener(this.f157545N);
            this.f157533E.setOnClickListener(this.f157546O);
            this.f157535G.setOnClickListener(this.f157544M);
        }
        if (j11 != 0) {
            bk.d.g(this.f157531C, abstractC5607aP);
            this.f157531C.setVisibility(iM);
            bk.d.g(this.f157534F, abstractC5607aO);
            this.f157536H.setVisibility(iS);
            bk.d.e(this.f157537I, abstractC5607aN);
        }
    }

    @Override // rs.ViewOnClickListenerC16832a.InterfaceC2492a
    public final void b(int i10, View view) {
        InterfaceC16387Q interfaceC16387Q;
        if (i10 == 1) {
            InterfaceC16387Q interfaceC16387Q2 = this.f157539K;
            if (interfaceC16387Q2 != null) {
                interfaceC16387Q2.a();
                return;
            }
            return;
        }
        if (i10 == 2) {
            InterfaceC16387Q interfaceC16387Q3 = this.f157539K;
            if (interfaceC16387Q3 != null) {
                interfaceC16387Q3.c();
                return;
            }
            return;
        }
        if (i10 != 3) {
            if (i10 == 4 && (interfaceC16387Q = this.f157539K) != null) {
                interfaceC16387Q.g();
                return;
            }
            return;
        }
        InterfaceC16387Q interfaceC16387Q4 = this.f157539K;
        if (interfaceC16387Q4 != null) {
            interfaceC16387Q4.E();
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f157548Q != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f157548Q = 4L;
        }
        A0();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f157542S = sparseIntArray;
        sparseIntArray.put(g0.f156525n, 8);
        sparseIntArray.put(g0.f156514c, 9);
        sparseIntArray.put(g0.f156517f, 10);
    }

    private C16604d(f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (ImageButton) objArr[9], (Button) objArr[3], (ImageView) objArr[10], (TextView) objArr[5], (View) objArr[8], (Button) objArr[2], (FullWordEllipsisTextView) objArr[6], (ConstraintLayout) objArr[4], (Group) objArr[1], (ImageView) objArr[7]);
        this.f157548Q = -1L;
        this.f157529A.setTag(null);
        NavigationViewHeader navigationViewHeader = (NavigationViewHeader) objArr[0];
        this.f157543L = navigationViewHeader;
        navigationViewHeader.setTag(null);
        this.f157531C.setTag(null);
        this.f157533E.setTag(null);
        this.f157534F.setTag(null);
        this.f157535G.setTag(null);
        this.f157536H.setTag(null);
        this.f157537I.setTag(null);
        D0(view);
        this.f157544M = new ViewOnClickListenerC16832a(this, 3);
        this.f157545N = new ViewOnClickListenerC16832a(this, 4);
        this.f157546O = new ViewOnClickListenerC16832a(this, 1);
        this.f157547P = new ViewOnClickListenerC16832a(this, 2);
        o0();
    }

    private boolean Q0(com.meijer.mobile.ui.navigation.a aVar, int i10) {
        if (i10 != C16389a.f156435a) {
            return false;
        }
        synchronized (this) {
            this.f157548Q |= 1;
        }
        return true;
    }

    @Override // qs.AbstractC16603c
    public void P0(InterfaceC16387Q interfaceC16387Q) {
        this.f157539K = interfaceC16387Q;
        synchronized (this) {
            this.f157548Q |= 2;
        }
        notifyPropertyChanged(C16389a.f156437c);
        super.A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return Q0((com.meijer.mobile.ui.navigation.a) obj, i11);
    }
}
