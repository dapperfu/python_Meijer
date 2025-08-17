package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes9.dex */
public class A0 extends AbstractC4310z0 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f19879F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f19880G;

    /* renamed from: D, reason: collision with root package name */
    private final ConstraintLayout f19881D;

    /* renamed from: E, reason: collision with root package name */
    private long f19882E;

    public A0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 5, f19879F, f19880G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f19882E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f19882E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f19882E = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19880G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99188o9, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99155l9, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99166m9, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99177n9, 4);
    }

    private A0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (ImageView) objArr[3], (ImageView) objArr[4], (MaterialButton) objArr[1]);
        this.f19882E = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f19881D = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
