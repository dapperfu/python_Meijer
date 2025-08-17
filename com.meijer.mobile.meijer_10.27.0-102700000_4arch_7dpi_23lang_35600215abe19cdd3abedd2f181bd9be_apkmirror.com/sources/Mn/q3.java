package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* loaded from: classes9.dex */
public class q3 extends p3 {

    /* renamed from: L, reason: collision with root package name */
    private static final p.i f20897L = null;

    /* renamed from: M, reason: collision with root package name */
    private static final SparseIntArray f20898M;

    /* renamed from: K, reason: collision with root package name */
    private long f20899K;

    public q3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 11, f20897L, f20898M));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20899K = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20899K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20899K = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20898M = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98798D5, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98870K5, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98899N4, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98889M4, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98875L0, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98935R0, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99003X8, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99124j0, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98932Q7, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99159m2, 10);
    }

    private q3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Guideline) objArr[8], (MaterialButton) objArr[5], (MaterialCardView) objArr[0], (MaterialButton) objArr[6], (Guideline) objArr[10], (TextView) objArr[4], (TextView) objArr[3], (ImageView) objArr[1], (FullWordEllipsisTextView) objArr[2], (Guideline) objArr[9], (Guideline) objArr[7]);
        this.f20899K = -1L;
        this.f20857B.setTag(null);
        D0(view);
        o0();
    }
}
