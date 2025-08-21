package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes10.dex */
public class A0 extends AbstractC4315z0 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f21211F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f21212G;

    /* renamed from: D, reason: collision with root package name */
    private final ConstraintLayout f21213D;

    /* renamed from: E, reason: collision with root package name */
    private long f21214E;

    public A0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 5, f21211F, f21212G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21214E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21214E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21214E = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21212G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100033n9, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100000k9, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100011l9, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100022m9, 4);
    }

    private A0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (ImageView) objArr[3], (ImageView) objArr[4], (MaterialButton) objArr[1]);
        this.f21214E = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21213D = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
