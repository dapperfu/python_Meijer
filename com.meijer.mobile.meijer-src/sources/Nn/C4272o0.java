package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.p;
import com.google.android.material.card.MaterialCardView;

/* renamed from: Nn.o0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4272o0 extends AbstractC4268n0 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f22163D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f22164E;

    /* renamed from: C, reason: collision with root package name */
    private long f22165C;

    public C4272o0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f22163D, f22164E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22165C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22165C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22165C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22164E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99844W3, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99647C8, 2);
    }

    private C4272o0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialCardView) objArr[0], (ImageView) objArr[1], (TextView) objArr[2]);
        this.f22165C = -1L;
        this.f22139z.setTag(null);
        B0(view);
        l0();
    }
}
