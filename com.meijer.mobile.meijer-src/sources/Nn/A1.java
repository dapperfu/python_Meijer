package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes10.dex */
public class A1 extends AbstractC4316z1 {

    /* renamed from: J, reason: collision with root package name */
    private static final p.i f21215J;

    /* renamed from: K, reason: collision with root package name */
    private static final SparseIntArray f21216K;

    /* renamed from: I, reason: collision with root package name */
    private long f21217I;

    public A1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 9, f21215J, f21216K));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21217I = 0L;
        }
        androidx.databinding.p.Z(this.f22492H);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f21217I != 0) {
                    return true;
                }
                return this.f22492H.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21217I = 2L;
        }
        this.f22492H.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(9);
        f21215J = iVar;
        iVar.a(0, new String[]{"recent_searches_item"}, new int[]{1}, new int[]{com.meijer.mobile.meijer.V.f100198P0});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21216K = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99836V5, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99846W5, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100105u4, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100083s4, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100094t4, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99997k6, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99748M7, 8);
    }

    private A1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (TextView) objArr[5], (TextView) objArr[6], (TextView) objArr[4], (RecyclerView) objArr[2], (ComposeView) objArr[3], (ConstraintLayout) objArr[0], (ProgressView) objArr[7], (View) objArr[8], (AbstractC4301v2) objArr[1]);
        this.f21217I = -1L;
        this.f22489E.setTag(null);
        A0(this.f22492H);
        B0(view);
        l0();
    }

    private boolean O0(AbstractC4301v2 abstractC4301v2, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21217I |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((AbstractC4301v2) obj, i11);
    }
}
