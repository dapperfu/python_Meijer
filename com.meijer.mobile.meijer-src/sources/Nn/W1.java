package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;

/* loaded from: classes10.dex */
public class W1 extends V1 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f21716D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f21717E;

    /* renamed from: C, reason: collision with root package name */
    private long f21718C;

    public W1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f21716D, f21717E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21718C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21718C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21718C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21717E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99832V1, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99822U1, 2);
    }

    private W1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (CheckableImageButton) objArr[1], (MaterialCardView) objArr[0]);
        this.f21718C = -1L;
        this.f21706B.setTag(null);
        B0(view);
        l0();
    }
}
