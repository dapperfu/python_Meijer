package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.p;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes10.dex */
public class u3 extends t3 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f22364C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f22365D;

    /* renamed from: B, reason: collision with root package name */
    private long f22366B;

    public u3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 2, f22364C, f22365D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22366B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22366B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22366B = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22365D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99686G5, 1);
    }

    private u3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialCardView) objArr[0], (ComposeView) objArr[1]);
        this.f22366B = -1L;
        this.f22323z.setTag(null);
        B0(view);
        l0();
    }
}
