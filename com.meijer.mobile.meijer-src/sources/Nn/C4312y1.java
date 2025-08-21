package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.p;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: Nn.y1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4312y1 extends AbstractC4308x1 {

    /* renamed from: d0, reason: collision with root package name */
    private static final p.i f22466d0 = null;

    /* renamed from: e0, reason: collision with root package name */
    private static final SparseIntArray f22467e0;

    /* renamed from: b0, reason: collision with root package name */
    private final ConstraintLayout f22468b0;

    /* renamed from: c0, reason: collision with root package name */
    private long f22469c0;

    public C4312y1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 29, f22466d0, f22467e0));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22469c0 = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22469c0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22469c0 = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22467e0 = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100068r0, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100126w3, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99857X6, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100137x3, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100093t3, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100104u3, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100082s3, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99775P4, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100035o0, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99757N6, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99723K2, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99658D8, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99928e3, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99678F7, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99703I2, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100130w7, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100002l0, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100141x7, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99939f3, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100119v7, 20);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99648C9, 21);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99709I8, 22);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100024n0, 23);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99768O7, 24);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100013m0, 25);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99991k0, 26);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99719J8, 27);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100092t2, 28);
    }

    private C4312y1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[26], (ComposeView) objArr[17], (ComposeView) objArr[25], (ComposeView) objArr[23], (ComposeView) objArr[9], (ComposeView) objArr[1], (ComposeView) objArr[28], (ComposeView) objArr[15], (ComposeView) objArr[11], (ComposeView) objArr[13], (ComposeView) objArr[19], (ComposeView) objArr[7], (LinearLayout) objArr[5], (ComposeView) objArr[6], (SwipeRefreshLayout) objArr[2], (ConstraintLayout) objArr[4], (ComposeView) objArr[8], (ComposeView) objArr[10], (NestedScrollView) objArr[3], (ComposeView) objArr[20], (ComposeView) objArr[16], (ComposeView) objArr[18], (ComposeView) objArr[14], (ComposeView) objArr[24], (ComposeView) objArr[12], (ComposeView) objArr[22], (ComposeView) objArr[27], (ComposeView) objArr[21]);
        this.f22469c0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f22468b0 = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
