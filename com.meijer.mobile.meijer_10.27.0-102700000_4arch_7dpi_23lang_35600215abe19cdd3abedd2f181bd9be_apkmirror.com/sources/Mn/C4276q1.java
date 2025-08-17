package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: Mn.q1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4276q1 extends AbstractC4272p1 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20889D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20890E;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f20891B;

    /* renamed from: C, reason: collision with root package name */
    private long f20892C;

    public C4276q1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f20889D, f20890E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20892C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20892C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20892C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20890E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99261v5, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98912O7, 2);
    }

    private C4276q1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialTextView) objArr[1], (Button) objArr[2]);
        this.f20892C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20891B = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
