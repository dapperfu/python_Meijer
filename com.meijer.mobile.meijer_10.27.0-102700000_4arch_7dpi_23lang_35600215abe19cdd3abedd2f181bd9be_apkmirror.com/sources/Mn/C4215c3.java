package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: Mn.c3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4215c3 extends AbstractC4210b3 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20506D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20507E = null;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f20508B;

    /* renamed from: C, reason: collision with root package name */
    private long f20509C;

    public C4215c3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f20506D, f20507E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f20509C;
            this.f20509C = 0L;
        }
        if ((j10 & 1) != 0) {
            zj.c.c(this.f20508B, true);
            zj.c.c(this.f20487z, false);
            zj.c.c(this.f20486A, false);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20509C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20509C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C4215c3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialTextView) objArr[2], (MaterialTextView) objArr[1]);
        this.f20509C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20508B = constraintLayout;
        constraintLayout.setTag(null);
        this.f20487z.setTag(null);
        this.f20486A.setTag(null);
        D0(view);
        o0();
    }
}
