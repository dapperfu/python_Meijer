package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* loaded from: classes10.dex */
public class o3 extends n3 {

    /* renamed from: L, reason: collision with root package name */
    private static final p.i f22173L = null;

    /* renamed from: M, reason: collision with root package name */
    private static final SparseIntArray f22174M;

    /* renamed from: K, reason: collision with root package name */
    private long f22175K;

    public o3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 11, f22173L, f22174M));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22175K = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22175K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22175K = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22174M = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99808S7, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99644C5, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99716J5, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99725K4, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99745M4, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99693H2, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99849W8, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99980j0, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99778P7, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100015m2, 10);
    }

    private o3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Guideline) objArr[8], (MaterialCardView) objArr[0], (Guideline) objArr[10], (MaterialButton) objArr[6], (TextView) objArr[4], (TextView) objArr[5], (ImageView) objArr[2], (FullWordEllipsisTextView) objArr[3], (Guideline) objArr[9], (TextView) objArr[1], (Guideline) objArr[7]);
        this.f22175K = -1L;
        this.f22147A.setTag(null);
        B0(view);
        l0();
    }
}
