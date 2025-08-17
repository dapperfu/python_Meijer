package Mn;

import Nn.a;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.p;
import y2.C18157a;

/* renamed from: Mn.e1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4223e1 extends AbstractC4218d1 implements a.InterfaceC0367a {

    /* renamed from: L, reason: collision with root package name */
    private static final p.i f20571L = null;

    /* renamed from: M, reason: collision with root package name */
    private static final SparseIntArray f20572M = null;

    /* renamed from: H, reason: collision with root package name */
    private final NestedScrollView f20573H;

    /* renamed from: I, reason: collision with root package name */
    private final View.OnClickListener f20574I;

    /* renamed from: J, reason: collision with root package name */
    private final View.OnClickListener f20575J;

    /* renamed from: K, reason: collision with root package name */
    private long f20576K;

    public C4223e1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 8, f20571L, f20572M));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        String strA;
        String strB;
        synchronized (this) {
            j10 = this.f20576K;
            this.f20576K = 0L;
        }
        Dn.r rVar = this.f20521G;
        long j11 = 3 & j10;
        if (j11 == 0 || rVar == null) {
            strA = null;
            strB = null;
        } else {
            strA = rVar.a();
            strB = rVar.b();
        }
        if ((j10 & 2) != 0) {
            zj.c.a(this.f20522z, true);
            zj.c.a(this.f20515A, true);
            zj.c.a(this.f20517C, true);
            this.f20518D.setOnClickListener(this.f20574I);
            this.f20519E.setOnClickListener(this.f20575J);
        }
        if (j11 != 0) {
            C18157a.b(this.f20516B, strA);
            C18157a.b(this.f20520F, strB);
        }
    }

    @Override // Nn.a.InterfaceC0367a
    public final void b(int i10, View view) {
        Dn.r rVar;
        if (i10 != 1) {
            if (i10 == 2 && (rVar = this.f20521G) != null) {
                rVar.d();
                return;
            }
            return;
        }
        Dn.r rVar2 = this.f20521G;
        if (rVar2 != null) {
            rVar2.c();
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20576K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20576K = 2L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C4223e1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[1], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[2], (Button) objArr[7], (Button) objArr[6], (TextView) objArr[5]);
        this.f20576K = -1L;
        this.f20522z.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.f20573H = nestedScrollView;
        nestedScrollView.setTag(null);
        this.f20515A.setTag(null);
        this.f20516B.setTag(null);
        this.f20517C.setTag(null);
        this.f20518D.setTag(null);
        this.f20519E.setTag(null);
        this.f20520F.setTag(null);
        D0(view);
        this.f20574I = new Nn.a(this, 2);
        this.f20575J = new Nn.a(this, 1);
        o0();
    }

    @Override // Mn.AbstractC4218d1
    public void O0(Dn.r rVar) {
        this.f20521G = rVar;
        synchronized (this) {
            this.f20576K |= 1;
        }
        notifyPropertyChanged(10);
        super.A0();
    }
}
