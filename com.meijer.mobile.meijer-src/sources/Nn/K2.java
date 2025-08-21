package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public class K2 extends J2 {

    /* renamed from: L, reason: collision with root package name */
    private static final p.i f21504L = null;

    /* renamed from: M, reason: collision with root package name */
    private static final SparseIntArray f21505M;

    /* renamed from: K, reason: collision with root package name */
    private long f21506K;

    public K2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 11, f21504L, f21505M));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21506K = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21506K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21506K = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21505M = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99680G, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100063q6, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99700I, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99670F, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99710J, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99690H, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100062q5, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100040o5, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100073r5, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100051p5, 10);
    }

    private K2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[4], (View) objArr[1], (TextView) objArr[6], (TextView) objArr[3], (RecyclerView) objArr[5], (TextView) objArr[8], (TextView) objArr[10], (TextView) objArr[7], (RecyclerView) objArr[9], (View) objArr[2], (ConstraintLayout) objArr[0]);
        this.f21506K = -1L;
        this.f21485J.setTag(null);
        B0(view);
        l0();
    }
}
