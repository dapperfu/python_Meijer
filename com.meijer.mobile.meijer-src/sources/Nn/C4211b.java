package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* renamed from: Nn.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4211b extends AbstractC4206a {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f21807G;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f21808H;

    /* renamed from: E, reason: collision with root package name */
    private final ConstraintLayout f21809E;

    /* renamed from: F, reason: collision with root package name */
    private long f21810F;

    public C4211b(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 6, f21807G, f21808H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21810F = 0L;
        }
        androidx.databinding.p.Z(this.f21789B);
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                if (this.f21810F != 0) {
                    return true;
                }
                return this.f21789B.h0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21810F = 2L;
        }
        this.f21789B.l0();
        z0();
    }

    static {
        p.i iVar = new p.i(6);
        f21807G = iVar;
        iVar.a(0, new String[]{"address_search_activity_search_bar"}, new int[]{1}, new int[]{com.meijer.mobile.meijer.V.f100177F});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21808H = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100086s7, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100122w, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99987j7, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100111v, 5);
    }

    private C4211b(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (MaterialButton) objArr[5], (LinearLayout) objArr[3], (AbstractC4260l0) objArr[1], (TextView) objArr[4], (RecyclerView) objArr[2]);
        this.f21810F = -1L;
        A0(this.f21789B);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21809E = constraintLayout;
        constraintLayout.setTag(null);
        B0(view);
        l0();
    }

    private boolean O0(AbstractC4260l0 abstractC4260l0, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.f21810F |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return O0((AbstractC4260l0) obj, i11);
    }
}
