package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes10.dex */
public class B extends A {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f21226C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f21227D;

    /* renamed from: A, reason: collision with root package name */
    private final ConstraintLayout f21228A;

    /* renamed from: B, reason: collision with root package name */
    private long f21229B;

    public B(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 2, f21226C, f21227D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21229B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21229B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21229B = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21227D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99992k1, 1);
    }

    private B(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[1]);
        this.f21229B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21228A = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
