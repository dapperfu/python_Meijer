package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* renamed from: Mn.y2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4308y2 extends AbstractC4304x2 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f21138F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f21139G;

    /* renamed from: D, reason: collision with root package name */
    private final ConstraintLayout f21140D;

    /* renamed from: E, reason: collision with root package name */
    private long f21141E;

    public C4308y2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 5, f21138F, f21139G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f21141E;
            this.f21141E = 0L;
        }
        if ((j10 & 1) != 0) {
            zj.c.a(this.f21114C, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21141E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21141E = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21139G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98896N1, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98936R1, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98916P1, 4);
    }

    private C4308y2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (Button) objArr[4], (Button) objArr[3], (TextView) objArr[1]);
        this.f21141E = -1L;
        this.f21114C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21140D = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
