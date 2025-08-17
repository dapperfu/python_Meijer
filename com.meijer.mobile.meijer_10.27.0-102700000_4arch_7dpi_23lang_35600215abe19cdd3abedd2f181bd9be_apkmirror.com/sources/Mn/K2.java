package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public class K2 extends J2 {

    /* renamed from: L, reason: collision with root package name */
    private static final p.i f20172L = null;

    /* renamed from: M, reason: collision with root package name */
    private static final SparseIntArray f20173M;

    /* renamed from: K, reason: collision with root package name */
    private long f20174K;

    public K2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 11, f20172L, f20173M));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20174K = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20174K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20174K = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20173M = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98824G, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99218r6, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98844I, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98814F, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98854J, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98834H, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99206q5, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99184o5, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99217r5, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99195p5, 10);
    }

    private K2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[4], (View) objArr[1], (TextView) objArr[6], (TextView) objArr[3], (RecyclerView) objArr[5], (TextView) objArr[8], (TextView) objArr[10], (TextView) objArr[7], (RecyclerView) objArr[9], (View) objArr[2], (ConstraintLayout) objArr[0]);
        this.f20174K = -1L;
        this.f20153J.setTag(null);
        D0(view);
        o0();
    }
}
