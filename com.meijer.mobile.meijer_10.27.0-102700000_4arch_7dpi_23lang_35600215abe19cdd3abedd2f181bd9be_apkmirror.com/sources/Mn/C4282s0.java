package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* renamed from: Mn.s0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4282s0 extends AbstractC4278r0 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f20945E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f20946F;

    /* renamed from: D, reason: collision with root package name */
    private long f20947D;

    public C4282s0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 4, f20945E, f20946F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20947D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20947D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20947D = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20946F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98792D, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98803E, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98781C, 3);
    }

    private C4282s0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[0], (TextView) objArr[3], (ImageView) objArr[1], (TextView) objArr[2]);
        this.f20947D = -1L;
        this.f20908z.setTag(null);
        D0(view);
        o0();
    }
}
