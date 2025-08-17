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
public class o3 extends n3 {

    /* renamed from: L, reason: collision with root package name */
    private static final p.i f20841L = null;

    /* renamed from: M, reason: collision with root package name */
    private static final SparseIntArray f20842M;

    /* renamed from: K, reason: collision with root package name */
    private long f20843K;

    public o3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 11, f20841L, f20842M));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20843K = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20843K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20843K = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20842M = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98962T7, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98798D5, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98870K5, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98869K4, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98889M4, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98837H2, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99003X8, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99124j0, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98932Q7, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99159m2, 10);
    }

    private o3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Guideline) objArr[8], (MaterialCardView) objArr[0], (Guideline) objArr[10], (MaterialButton) objArr[6], (TextView) objArr[4], (TextView) objArr[5], (ImageView) objArr[2], (FullWordEllipsisTextView) objArr[3], (Guideline) objArr[9], (TextView) objArr[1], (Guideline) objArr[7]);
        this.f20843K = -1L;
        this.f20815A.setTag(null);
        D0(view);
        o0();
    }
}
