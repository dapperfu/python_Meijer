package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.widget.UnauthContentView;
import com.meijer.mobile.widget.UnauthFooterView;

/* loaded from: classes10.dex */
public class E1 extends D1 {

    /* renamed from: J, reason: collision with root package name */
    private static final p.i f21315J = null;

    /* renamed from: K, reason: collision with root package name */
    private static final SparseIntArray f21316K;

    /* renamed from: H, reason: collision with root package name */
    private final ConstraintLayout f21317H;

    /* renamed from: I, reason: collision with root package name */
    private long f21318I;

    public E1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 9, f21315J, f21316K));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21318I = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21318I != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21318I = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21316K = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99847W6, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99698H7, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99728K7, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99618A1, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99797R6, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100053p7, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99923d9, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99862Y1, 8);
    }

    private E1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (UnauthContentView) objArr[4], (View) objArr[8], (UnauthContentView) objArr[5], (ScrollView) objArr[1], (UnauthContentView) objArr[6], (UnauthContentView) objArr[2], (ImageView) objArr[3], (UnauthFooterView) objArr[7]);
        this.f21318I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21317H = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
