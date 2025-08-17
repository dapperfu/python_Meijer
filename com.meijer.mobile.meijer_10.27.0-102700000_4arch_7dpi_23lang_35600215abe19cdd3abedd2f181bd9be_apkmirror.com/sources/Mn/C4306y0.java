package Mn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: Mn.y0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4306y0 extends AbstractC4302x0 {

    /* renamed from: E, reason: collision with root package name */
    private static final p.i f21130E = null;

    /* renamed from: F, reason: collision with root package name */
    private static final SparseIntArray f21131F;

    /* renamed from: C, reason: collision with root package name */
    private final ConstraintLayout f21132C;

    /* renamed from: D, reason: collision with root package name */
    private long f21133D;

    public C4306y0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 4, f21130E, f21131F));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21133D = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21133D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21133D = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21131F = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98929Q4, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99174n6, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98933Q8, 3);
    }

    private C4306y0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ComposeView) objArr[1], (ComposeView) objArr[2], (MaterialTextView) objArr[3]);
        this.f21133D = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21132C = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }
}
