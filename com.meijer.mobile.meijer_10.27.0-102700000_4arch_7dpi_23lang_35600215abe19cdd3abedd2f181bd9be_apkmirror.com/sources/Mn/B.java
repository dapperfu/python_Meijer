package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes9.dex */
public class B extends A {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f19894C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f19895D;

    /* renamed from: A, reason: collision with root package name */
    private final ConstraintLayout f19896A;

    /* renamed from: B, reason: collision with root package name */
    private long f19897B;

    public B(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 2, f19894C, f19895D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f19897B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f19897B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f19897B = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19895D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99136k1, 1);
    }

    private B(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[1]);
        this.f19897B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f19896A = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
