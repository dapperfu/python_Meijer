package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;

/* renamed from: Mn.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4236h extends AbstractC4231g {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f20642C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f20643D;

    /* renamed from: A, reason: collision with root package name */
    private final CoordinatorLayout f20644A;

    /* renamed from: B, reason: collision with root package name */
    private long f20645B;

    public C4236h(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 2, f20642C, f20643D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20645B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20645B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20645B = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20643D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99158m1, 1);
    }

    private C4236h(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[1]);
        this.f20645B = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f20644A = coordinatorLayout;
        coordinatorLayout.setTag(null);
        D0(view);
        o0();
    }
}
