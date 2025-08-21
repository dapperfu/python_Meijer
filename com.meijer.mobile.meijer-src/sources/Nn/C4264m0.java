package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.p;
import com.meijer.mobile.widget.DebouncingAutoCompleteTextView;

/* renamed from: Nn.m0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4264m0 extends AbstractC4260l0 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f22121E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f22122F;

    /* renamed from: D, reason: collision with root package name */
    private long f22123D;

    public C4264m0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 4, f22121E, f22122F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22123D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22123D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22123D = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22122F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99921d7, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99965h7, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99850X, 3);
    }

    private C4264m0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Barrier) objArr[3], (CardView) objArr[0], (ImageButton) objArr[1], (DebouncingAutoCompleteTextView) objArr[2]);
        this.f22123D = -1L;
        this.f22106A.setTag(null);
        B0(view);
        l0();
    }
}
