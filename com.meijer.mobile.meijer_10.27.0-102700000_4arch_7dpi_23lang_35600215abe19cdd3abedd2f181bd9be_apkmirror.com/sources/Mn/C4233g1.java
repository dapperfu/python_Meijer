package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: Mn.g1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4233g1 extends AbstractC4228f1 {

    /* renamed from: Q, reason: collision with root package name */
    private static final p.i f20632Q = null;

    /* renamed from: R, reason: collision with root package name */
    private static final SparseIntArray f20633R;

    /* renamed from: O, reason: collision with root package name */
    private final ConstraintLayout f20634O;

    /* renamed from: P, reason: collision with root package name */
    private long f20635P;

    public C4233g1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 16, f20632Q, f20633R));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f20635P;
            this.f20635P = 0L;
        }
        if ((j10 & 1) != 0) {
            zj.c.c(this.f20604K, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20635P != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20635P = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20633R = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98910O5, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98860J5, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98904O, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98945S0, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98798D5, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98870K5, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98980V5, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98829G4, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99191p1, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98940R5, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99180o1, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98930Q5, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98950S5, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98984W, 15);
    }

    private C4233g1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Barrier) objArr[4], (Barrier) objArr[15], (ImageButton) objArr[5], (View) objArr[12], (View) objArr[10], (MaterialTextView) objArr[9], (ImageView) objArr[6], (MaterialTextView) objArr[3], (MaterialTextView) objArr[7], (MaterialTextView) objArr[2], (MaterialTextView) objArr[13], (ConstraintLayout) objArr[1], (RecyclerView) objArr[11], (MaterialTextView) objArr[14], (MaterialTextView) objArr[8]);
        this.f20635P = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20634O = constraintLayout;
        constraintLayout.setTag(null);
        this.f20604K.setTag(null);
        D0(view);
        o0();
    }
}
