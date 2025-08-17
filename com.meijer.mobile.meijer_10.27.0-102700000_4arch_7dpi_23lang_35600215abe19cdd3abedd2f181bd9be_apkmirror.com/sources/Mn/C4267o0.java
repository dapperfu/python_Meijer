package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.p;
import com.google.android.material.card.MaterialCardView;

/* renamed from: Mn.o0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4267o0 extends AbstractC4263n0 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20831D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20832E;

    /* renamed from: C, reason: collision with root package name */
    private long f20833C;

    public C4267o0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f20831D, f20832E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20833C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20833C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20833C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20832E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98988W3, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98801D8, 2);
    }

    private C4267o0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialCardView) objArr[0], (ImageView) objArr[1], (TextView) objArr[2]);
        this.f20833C = -1L;
        this.f20807z.setTag(null);
        D0(view);
        o0();
    }
}
