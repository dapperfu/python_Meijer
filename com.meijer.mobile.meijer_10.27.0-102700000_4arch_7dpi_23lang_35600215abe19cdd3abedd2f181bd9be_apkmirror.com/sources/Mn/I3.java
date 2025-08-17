package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.p;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;
import com.meijer.mobile.core.design.widget.stepperview.CollapsibleStepperView;

/* loaded from: classes9.dex */
public class I3 extends H3 {

    /* renamed from: M, reason: collision with root package name */
    private static final p.i f20128M = null;

    /* renamed from: N, reason: collision with root package name */
    private static final SparseIntArray f20129N;

    /* renamed from: L, reason: collision with root package name */
    private long f20130L;

    public I3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 12, f20128M, f20129N));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20130L = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20130L != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20130L = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20129N = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98768A8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98779B8, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98838H3, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99308z8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98900N5, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98985W0, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98952S7, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99003X8, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99124j0, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98932Q7, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99159m2, 11);
    }

    private I3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Guideline) objArr[9], (FrameLayout) objArr[6], (Guideline) objArr[11], (CheckableImageButton) objArr[3], (ComposeView) objArr[5], (Guideline) objArr[10], (CollapsibleStepperView) objArr[7], (MaterialCardView) objArr[0], (TextView) objArr[4], (ImageView) objArr[1], (FullWordEllipsisTextView) objArr[2], (Guideline) objArr[8]);
        this.f20130L = -1L;
        this.f20076G.setTag(null);
        D0(view);
        o0();
    }
}
