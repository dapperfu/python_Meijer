package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* renamed from: Mn.q0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4275q0 extends AbstractC4271p0 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f20886E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f20887F;

    /* renamed from: D, reason: collision with root package name */
    private long f20888D;

    public C4275q0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 4, f20886E, f20887F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20888D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20888D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20888D = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20887F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98792D, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98803E, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98781C, 3);
    }

    private C4275q0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[0], (TextView) objArr[3], (ImageView) objArr[1], (TextView) objArr[2]);
        this.f20888D = -1L;
        this.f20851z.setTag(null);
        D0(view);
        o0();
    }
}
