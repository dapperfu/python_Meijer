package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.p;

/* renamed from: Nn.e2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4229e2 extends AbstractC4224d2 {

    /* renamed from: H, reason: collision with root package name */
    private static final p.i f21909H = null;

    /* renamed from: I, reason: collision with root package name */
    private static final SparseIntArray f21910I;

    /* renamed from: G, reason: collision with root package name */
    private long f21911G;

    public C4229e2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 7, f21909H, f21910I));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21911G = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21911G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21911G = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21910I = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99874Z3, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99922d8, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99933e8, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99818T7, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99838V7, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99734L3, 6);
    }

    private C4229e2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (View) objArr[6], (RelativeLayout) objArr[0], (TextView) objArr[1], (TextView) objArr[4], (TextView) objArr[5], (ImageView) objArr[2], (TextView) objArr[3]);
        this.f21911G = -1L;
        this.f21855A.setTag(null);
        B0(view);
        l0();
    }
}
