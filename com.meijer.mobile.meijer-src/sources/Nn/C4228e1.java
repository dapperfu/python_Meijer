package Nn;

import On.a;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.p;
import y2.C18284a;

/* renamed from: Nn.e1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4228e1 extends AbstractC4223d1 implements a.InterfaceC0406a {

    /* renamed from: L, reason: collision with root package name */
    private static final p.i f21903L = null;

    /* renamed from: M, reason: collision with root package name */
    private static final SparseIntArray f21904M = null;

    /* renamed from: H, reason: collision with root package name */
    private final NestedScrollView f21905H;

    /* renamed from: I, reason: collision with root package name */
    private final View.OnClickListener f21906I;

    /* renamed from: J, reason: collision with root package name */
    private final View.OnClickListener f21907J;

    /* renamed from: K, reason: collision with root package name */
    private long f21908K;

    public C4228e1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 8, f21903L, f21904M));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        String strA;
        String strB;
        synchronized (this) {
            j10 = this.f21908K;
            this.f21908K = 0L;
        }
        En.r rVar = this.f21853G;
        long j11 = 3 & j10;
        if (j11 == 0 || rVar == null) {
            strA = null;
            strB = null;
        } else {
            strA = rVar.a();
            strB = rVar.b();
        }
        if ((j10 & 2) != 0) {
            Aj.c.a(this.f21854z, true);
            Aj.c.a(this.f21847A, true);
            Aj.c.a(this.f21849C, true);
            this.f21850D.setOnClickListener(this.f21906I);
            this.f21851E.setOnClickListener(this.f21907J);
        }
        if (j11 != 0) {
            C18284a.b(this.f21848B, strA);
            C18284a.b(this.f21852F, strB);
        }
    }

    @Override // On.a.InterfaceC0406a
    public final void b(int i10, View view) {
        En.r rVar;
        if (i10 != 1) {
            if (i10 == 2 && (rVar = this.f21853G) != null) {
                rVar.d();
                return;
            }
            return;
        }
        En.r rVar2 = this.f21853G;
        if (rVar2 != null) {
            rVar2.c();
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21908K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21908K = 2L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C4228e1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[1], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[2], (Button) objArr[7], (Button) objArr[6], (TextView) objArr[5]);
        this.f21908K = -1L;
        this.f21854z.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.f21905H = nestedScrollView;
        nestedScrollView.setTag(null);
        this.f21847A.setTag(null);
        this.f21848B.setTag(null);
        this.f21849C.setTag(null);
        this.f21850D.setTag(null);
        this.f21851E.setTag(null);
        this.f21852F.setTag(null);
        B0(view);
        this.f21906I = new On.a(this, 2);
        this.f21907J = new On.a(this, 1);
        l0();
    }

    @Override // Nn.AbstractC4223d1
    public void O0(En.r rVar) {
        this.f21853G = rVar;
        synchronized (this) {
            this.f21908K |= 1;
        }
        notifyPropertyChanged(10);
        super.z0();
    }
}
