package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.p;
import com.meijer.mobile.widget.DebouncingAutoCompleteTextView;

/* renamed from: Mn.m0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4259m0 extends AbstractC4255l0 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f20789E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f20790F;

    /* renamed from: D, reason: collision with root package name */
    private long f20791D;

    public C4259m0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 4, f20789E, f20790F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20791D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20791D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20791D = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20790F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99076e7, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99120i7, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98994X, 3);
    }

    private C4259m0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Barrier) objArr[3], (CardView) objArr[0], (ImageButton) objArr[1], (DebouncingAutoCompleteTextView) objArr[2]);
        this.f20791D = -1L;
        this.f20774A.setTag(null);
        D0(view);
        o0();
    }
}
