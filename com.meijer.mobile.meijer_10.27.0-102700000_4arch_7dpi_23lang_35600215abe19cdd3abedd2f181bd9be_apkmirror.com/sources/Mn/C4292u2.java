package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* renamed from: Mn.u2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4292u2 extends AbstractC4288t2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f21028D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f21029E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f21030B;

    /* renamed from: C, reason: collision with root package name */
    private long f21031C;

    public C4292u2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f21028D, f21029E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f21031C;
            this.f21031C = 0L;
        }
        if ((j10 & 1) != 0) {
            zj.c.a(this.f20988A, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21031C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21031C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21029E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99240t6, 2);
    }

    private C4292u2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Button) objArr[2], (TextView) objArr[1]);
        this.f21031C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21030B = constraintLayout;
        constraintLayout.setTag(null);
        this.f20988A.setTag(null);
        D0(view);
        o0();
    }
}
