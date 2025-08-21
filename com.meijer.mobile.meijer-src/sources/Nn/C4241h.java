package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.p;

/* renamed from: Nn.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4241h extends AbstractC4236g {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f21974C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f21975D;

    /* renamed from: A, reason: collision with root package name */
    private final CoordinatorLayout f21976A;

    /* renamed from: B, reason: collision with root package name */
    private long f21977B;

    public C4241h(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 2, f21974C, f21975D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21977B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21977B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21977B = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21975D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100014m1, 1);
    }

    private C4241h(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[1]);
        this.f21977B = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f21976A = coordinatorLayout;
        coordinatorLayout.setTag(null);
        B0(view);
        l0();
    }
}
