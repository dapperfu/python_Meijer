package Nn;

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

/* loaded from: classes10.dex */
public class A2 extends AbstractC4317z2 {

    /* renamed from: L, reason: collision with root package name */
    private static final p.i f21218L = null;

    /* renamed from: M, reason: collision with root package name */
    private static final SparseIntArray f21219M;

    /* renamed from: J, reason: collision with root package name */
    private final ConstraintLayout f21220J;

    /* renamed from: K, reason: collision with root package name */
    private long f21221K;

    public A2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 11, f21218L, f21219M));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21221K = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21221K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21221K = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21219M = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99910c7, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99921d7, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99954g7, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99850X, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99932e7, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99943f7, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100097t7, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100064q7, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100079s0, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100055p9, 10);
    }

    private A2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Barrier) objArr[4], (MaterialButton) objArr[9], (CardView) objArr[1], (ImageButton) objArr[2], (ImageButton) objArr[5], (ImageButton) objArr[6], (EditText) objArr[3], (LinearLayout) objArr[8], (ImageButton) objArr[7], (MaterialButton) objArr[10]);
        this.f21221K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21220J = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
