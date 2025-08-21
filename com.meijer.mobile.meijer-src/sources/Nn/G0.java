package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.p;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;

/* loaded from: classes10.dex */
public class G0 extends F0 {

    /* renamed from: J, reason: collision with root package name */
    private static final p.i f21375J = null;

    /* renamed from: K, reason: collision with root package name */
    private static final SparseIntArray f21376K;

    /* renamed from: I, reason: collision with root package name */
    private long f21377I;

    public G0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 9, f21375J, f21376K));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21377I = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21377I != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21377I = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21376K = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99751N0, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99950g3, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99761O0, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99961h3, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99771P0, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100158z2, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99681G0, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99820U, 8);
    }

    private G0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Barrier) objArr[8], (MaterialTextView) objArr[7], (ImageView) objArr[1], (ImageView) objArr[3], (ImageView) objArr[5], (ListCardView) objArr[0], (TextView) objArr[6], (Guideline) objArr[2], (Guideline) objArr[4]);
        this.f21377I = -1L;
        this.f21337E.setTag(null);
        B0(view);
        l0();
    }
}
