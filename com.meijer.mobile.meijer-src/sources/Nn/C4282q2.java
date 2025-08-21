package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* renamed from: Nn.q2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4282q2 extends AbstractC4278p2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f22225D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f22226E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f22227B;

    /* renamed from: C, reason: collision with root package name */
    private long f22228C;

    public C4282q2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f22225D, f22226E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22228C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22228C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22228C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22226E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99647C8, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99636B8, 2);
    }

    private C4282q2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageButton) objArr[2], (FullWordEllipsisTextView) objArr[1]);
        this.f22228C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f22227B = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }
}
