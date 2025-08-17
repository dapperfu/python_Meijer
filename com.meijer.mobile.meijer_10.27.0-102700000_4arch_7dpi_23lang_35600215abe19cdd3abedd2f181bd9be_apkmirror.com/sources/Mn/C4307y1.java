package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.p;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: Mn.y1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4307y1 extends AbstractC4303x1 {

    /* renamed from: d0, reason: collision with root package name */
    private static final p.i f21134d0 = null;

    /* renamed from: e0, reason: collision with root package name */
    private static final SparseIntArray f21135e0;

    /* renamed from: b0, reason: collision with root package name */
    private final ConstraintLayout f21136b0;

    /* renamed from: c0, reason: collision with root package name */
    private long f21137c0;

    public C4307y1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 29, f21134d0, f21135e0));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21137c0 = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21137c0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21137c0 = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21135e0 = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99212r0, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99270w3, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99011Y6, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99281x3, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99237t3, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99248u3, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99226s3, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98919P4, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99179o0, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98911O6, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98867K2, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98812E8, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99072e3, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98832G7, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98847I2, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99285x7, 16);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99146l0, 17);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99296y7, 18);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99083f3, 19);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99274w7, 20);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98802D9, 21);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98863J8, 22);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99168n0, 23);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98922P7, 24);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99157m0, 25);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99135k0, 26);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98873K8, 27);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99236t2, 28);
    }

    private C4307y1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[26], (ComposeView) objArr[17], (ComposeView) objArr[25], (ComposeView) objArr[23], (ComposeView) objArr[9], (ComposeView) objArr[1], (ComposeView) objArr[28], (ComposeView) objArr[15], (ComposeView) objArr[11], (ComposeView) objArr[13], (ComposeView) objArr[19], (ComposeView) objArr[7], (LinearLayout) objArr[5], (ComposeView) objArr[6], (SwipeRefreshLayout) objArr[2], (ConstraintLayout) objArr[4], (ComposeView) objArr[8], (ComposeView) objArr[10], (NestedScrollView) objArr[3], (ComposeView) objArr[20], (ComposeView) objArr[16], (ComposeView) objArr[18], (ComposeView) objArr[14], (ComposeView) objArr[24], (ComposeView) objArr[12], (ComposeView) objArr[22], (ComposeView) objArr[27], (ComposeView) objArr[21]);
        this.f21137c0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21136b0 = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
