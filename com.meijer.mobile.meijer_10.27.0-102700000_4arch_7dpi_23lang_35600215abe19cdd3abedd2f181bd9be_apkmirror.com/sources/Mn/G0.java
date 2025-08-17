package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.p;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes9.dex */
public class G0 extends F0 {

    /* renamed from: J, reason: collision with root package name */
    private static final p.i f20043J = null;

    /* renamed from: K, reason: collision with root package name */
    private static final SparseIntArray f20044K;

    /* renamed from: I, reason: collision with root package name */
    private long f20045I;

    public G0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 9, f20043J, f20044K));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20045I = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20045I != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20045I = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20044K = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98895N0, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99094g3, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98905O0, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99105h3, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98915P0, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99302z2, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98825G0, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98964U, 8);
    }

    private G0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Barrier) objArr[8], (MaterialTextView) objArr[7], (ImageView) objArr[1], (ImageView) objArr[3], (ImageView) objArr[5], (ListCardView) objArr[0], (TextView) objArr[6], (Guideline) objArr[2], (Guideline) objArr[4]);
        this.f20045I = -1L;
        this.f20005E.setTag(null);
        D0(view);
        o0();
    }
}
