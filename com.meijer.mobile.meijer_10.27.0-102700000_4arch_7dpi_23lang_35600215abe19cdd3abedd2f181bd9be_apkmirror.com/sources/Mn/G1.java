package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public class G1 extends F1 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f20046E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f20047F;

    /* renamed from: C, reason: collision with root package name */
    private final ConstraintLayout f20048C;

    /* renamed from: D, reason: collision with root package name */
    private long f20049D;

    public G1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 4, f20046E, f20047F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20049D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20049D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20049D = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20047F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99286x8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99282x4, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99271w4, 3);
    }

    private G1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[3], (FrameLayout) objArr[2], (RecyclerView) objArr[1]);
        this.f20049D = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20048C = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
