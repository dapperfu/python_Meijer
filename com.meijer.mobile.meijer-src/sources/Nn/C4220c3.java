package Nn;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: Nn.c3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4220c3 extends AbstractC4215b3 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f21838D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f21839E = null;

    /* renamed from: B, reason: collision with root package name */
    private final ConstraintLayout f21840B;

    /* renamed from: C, reason: collision with root package name */
    private long f21841C;

    public C4220c3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f21838D, f21839E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f21841C;
            this.f21841C = 0L;
        }
        if ((j10 & 1) != 0) {
            Aj.c.c(this.f21840B, true);
            Aj.c.c(this.f21819z, false);
            Aj.c.c(this.f21818A, false);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21841C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21841C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C4220c3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialTextView) objArr[2], (MaterialTextView) objArr[1]);
        this.f21841C = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f21840B = constraintLayout;
        constraintLayout.setTag(null);
        this.f21819z.setTag(null);
        this.f21818A.setTag(null);
        B0(view);
        l0();
    }
}
