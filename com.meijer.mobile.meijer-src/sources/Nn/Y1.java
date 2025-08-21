package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes10.dex */
public class Y1 extends X1 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f21743E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f21744F;

    /* renamed from: D, reason: collision with root package name */
    private long f21745D;

    public Y1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 4, f21743E, f21744F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21745D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21745D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21745D = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21744F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100049p3, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100071r3, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100060q3, 3);
    }

    private Y1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialCheckBox) objArr[1], (MaterialTextView) objArr[3], (MaterialTextView) objArr[2], (ConstraintLayout) objArr[0]);
        this.f21745D = -1L;
        this.f21732C.setTag(null);
        B0(view);
        l0();
    }
}
