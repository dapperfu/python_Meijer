package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;

/* renamed from: Mn.k2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4253k2 extends AbstractC4249j2 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f20763E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f20764F;

    /* renamed from: D, reason: collision with root package name */
    private long f20765D;

    public C4253k2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 4, f20763E, f20764F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20765D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20765D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20765D = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20764F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98918P3, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99178o, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99167n, 3);
    }

    private C4253k2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialButton) objArr[3], (TextView) objArr[2], (TextView) objArr[1], (ConstraintLayout) objArr[0]);
        this.f20765D = -1L;
        this.f20730C.setTag(null);
        D0(view);
        o0();
    }
}
