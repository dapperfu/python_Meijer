package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public class G1 extends F1 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f21378E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f21379F;

    /* renamed from: C, reason: collision with root package name */
    private final ConstraintLayout f21380C;

    /* renamed from: D, reason: collision with root package name */
    private long f21381D;

    public G1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 4, f21378E, f21379F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21381D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21381D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21381D = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21379F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100131w8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100138x4, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100127w4, 3);
    }

    private G1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[3], (FrameLayout) objArr[2], (RecyclerView) objArr[1]);
        this.f21381D = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21380C = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
