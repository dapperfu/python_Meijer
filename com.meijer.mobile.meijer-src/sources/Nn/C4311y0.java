package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: Nn.y0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4311y0 extends AbstractC4307x0 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f22462E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f22463F;

    /* renamed from: C, reason: collision with root package name */
    private final ConstraintLayout f22464C;

    /* renamed from: D, reason: collision with root package name */
    private long f22465D;

    public C4311y0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 4, f22462E, f22463F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22465D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22465D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22465D = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22463F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99785Q4, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100019m6, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99779P8, 3);
    }

    private C4311y0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[1], (ComposeView) objArr[2], (MaterialTextView) objArr[3]);
        this.f22465D = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f22464C = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
