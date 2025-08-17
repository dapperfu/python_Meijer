package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.widget.UnauthContentView;
import com.meijer.mobile.widget.UnauthFooterView;

/* loaded from: classes9.dex */
public class E1 extends D1 {

    /* renamed from: J, reason: collision with root package name */
    private static final p.i f19983J = null;

    /* renamed from: K, reason: collision with root package name */
    private static final SparseIntArray f19984K;

    /* renamed from: H, reason: collision with root package name */
    private final ConstraintLayout f19985H;

    /* renamed from: I, reason: collision with root package name */
    private long f19986I;

    public E1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 9, f19983J, f19984K));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f19986I = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f19986I != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f19986I = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19984K = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99001X6, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98852I7, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98882L7, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98761A1, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98951S6, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99208q7, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99078e9, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99006Y1, 8);
    }

    private E1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (UnauthContentView) objArr[4], (View) objArr[8], (UnauthContentView) objArr[5], (ScrollView) objArr[1], (UnauthContentView) objArr[6], (UnauthContentView) objArr[2], (ImageView) objArr[3], (UnauthFooterView) objArr[7]);
        this.f19986I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f19985H = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
