package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* renamed from: Nn.y2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4313y2 extends AbstractC4309x2 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f22470F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f22471G;

    /* renamed from: D, reason: collision with root package name */
    private final ConstraintLayout f22472D;

    /* renamed from: E, reason: collision with root package name */
    private long f22473E;

    public C4313y2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 5, f22470F, f22471G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f22473E;
            this.f22473E = 0L;
        }
        if ((j10 & 1) != 0) {
            Aj.c.a(this.f22446C, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22473E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22473E = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22471G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99752N1, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99792R1, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99772P1, 4);
    }

    private C4313y2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (Button) objArr[4], (Button) objArr[3], (TextView) objArr[1]);
        this.f22473E = -1L;
        this.f22446C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f22472D = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
