package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* renamed from: Mn.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4206b extends AbstractC4201a {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f20475G;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f20476H;

    /* renamed from: E, reason: collision with root package name */
    private final ConstraintLayout f20477E;

    /* renamed from: F, reason: collision with root package name */
    private long f20478F;

    public C4206b(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 6, f20475G, f20476H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20478F = 0L;
        }
        androidx.databinding.p.Y(this.f20457B);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f20478F != 0) {
                    return true;
                }
                return this.f20457B.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20478F = 2L;
        }
        this.f20457B.o0();
        A0();
    }

    static {
        p.i iVar = new p.i(6);
        f20475G = iVar;
        iVar.a(0, new String[]{"address_search_activity_search_bar"}, new int[]{1}, new int[]{com.meijer.mobile.meijer.V.f99321F});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20476H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99241t7, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99266w, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99142k7, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99255v, 5);
    }

    private C4206b(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (MaterialButton) objArr[5], (LinearLayout) objArr[3], (AbstractC4255l0) objArr[1], (TextView) objArr[4], (RecyclerView) objArr[2]);
        this.f20478F = -1L;
        C0(this.f20457B);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20477E = constraintLayout;
        constraintLayout.setTag(null);
        D0(view);
        o0();
    }

    private boolean O0(AbstractC4255l0 abstractC4255l0, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f20478F |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((AbstractC4255l0) obj, i11);
    }
}
