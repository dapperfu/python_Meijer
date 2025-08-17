package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes9.dex */
public class A2 extends AbstractC4312z2 {

    /* renamed from: L, reason: collision with root package name */
    private static final p.i f19886L = null;

    /* renamed from: M, reason: collision with root package name */
    private static final SparseIntArray f19887M;

    /* renamed from: J, reason: collision with root package name */
    private final ConstraintLayout f19888J;

    /* renamed from: K, reason: collision with root package name */
    private long f19889K;

    public A2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 11, f19886L, f19887M));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f19889K = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f19889K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f19889K = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19887M = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99065d7, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99076e7, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99109h7, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98994X, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99087f7, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99098g7, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99252u7, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99219r7, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99223s0, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99210q9, 10);
    }

    private A2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Barrier) objArr[4], (MaterialButton) objArr[9], (CardView) objArr[1], (ImageButton) objArr[2], (ImageButton) objArr[5], (ImageButton) objArr[6], (EditText) objArr[3], (LinearLayout) objArr[8], (ImageButton) objArr[7], (MaterialButton) objArr[10]);
        this.f19889K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f19888J = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
