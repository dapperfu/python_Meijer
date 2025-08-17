package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* renamed from: Mn.i1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4243i1 extends AbstractC4238h1 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f20684C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f20685D;

    /* renamed from: A, reason: collision with root package name */
    private final ConstraintLayout f20686A;

    /* renamed from: B, reason: collision with root package name */
    private long f20687B;

    public C4243i1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 2, f20684C, f20685D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20687B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20687B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20687B = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20685D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99207q6, 1);
    }

    private C4243i1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[1]);
        this.f20687B = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20686A = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
