package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.p;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes9.dex */
public class u3 extends t3 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f21032C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f21033D;

    /* renamed from: B, reason: collision with root package name */
    private long f21034B;

    public u3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 2, f21032C, f21033D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21034B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21034B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21034B = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21033D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98840H5, 1);
    }

    private u3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialCardView) objArr[0], (ComposeView) objArr[1]);
        this.f21034B = -1L;
        this.f20991z.setTag(null);
        D0(view);
        o0();
    }
}
