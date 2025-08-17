package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* renamed from: Mn.q2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4277q2 extends AbstractC4273p2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20893D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20894E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f20895B;

    /* renamed from: C, reason: collision with root package name */
    private long f20896C;

    public C4277q2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f20893D, f20894E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20896C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20896C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20896C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20894E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98801D8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98790C8, 2);
    }

    private C4277q2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageButton) objArr[2], (FullWordEllipsisTextView) objArr[1]);
        this.f20896C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20895B = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
