package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes9.dex */
public class A1 extends AbstractC4311z1 {

    /* renamed from: J, reason: collision with root package name */
    private static final p.i f19883J;

    /* renamed from: K, reason: collision with root package name */
    private static final SparseIntArray f19884K;

    /* renamed from: I, reason: collision with root package name */
    private long f19885I;

    public A1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 9, f19883J, f19884K));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f19885I = 0L;
        }
        androidx.databinding.p.Y(this.f21160H);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f19885I != 0) {
                    return true;
                }
                return this.f21160H.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f19885I = 2L;
        }
        this.f21160H.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(9);
        f19883J = iVar;
        iVar.a(0, new String[]{"recent_searches_item"}, new int[]{1}, new int[]{com.meijer.mobile.meijer.V.f99342P0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f19884K = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98990W5, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99000X5, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99249u4, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99227s4, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99238t4, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99152l6, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98902N7, 8);
    }

    private A1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[4], (RecyclerView) objArr[2], (ComposeView) objArr[3], (ConstraintLayout) objArr[0], (ProgressView) objArr[7], (View) objArr[8], (AbstractC4296v2) objArr[1]);
        this.f19885I = -1L;
        this.f21157E.setTag(null);
        C0(this.f21160H);
        D0(view);
        o0();
    }

    private boolean O0(AbstractC4296v2 abstractC4296v2, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f19885I |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((AbstractC4296v2) obj, i11);
    }
}
