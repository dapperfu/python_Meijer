package Nn;

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

/* loaded from: classes10.dex */
public class I3 extends H3 {

    /* renamed from: M, reason: collision with root package name */
    private static final p.i f21460M = null;

    /* renamed from: N, reason: collision with root package name */
    private static final SparseIntArray f21461N;

    /* renamed from: L, reason: collision with root package name */
    private long f21462L;

    public I3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 12, f21460M, f21461N));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21462L = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21462L != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21462L = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21461N = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100164z8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99625A8, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99694H3, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100153y8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99746M5, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99841W0, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99798R7, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99849W8, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99980j0, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99778P7, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100015m2, 11);
    }

    private I3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Guideline) objArr[9], (FrameLayout) objArr[6], (Guideline) objArr[11], (CheckableImageButton) objArr[3], (ComposeView) objArr[5], (Guideline) objArr[10], (CollapsibleStepperView) objArr[7], (MaterialCardView) objArr[0], (TextView) objArr[4], (ImageView) objArr[1], (FullWordEllipsisTextView) objArr[2], (Guideline) objArr[8]);
        this.f21462L = -1L;
        this.f21408G.setTag(null);
        B0(view);
        l0();
    }
}
