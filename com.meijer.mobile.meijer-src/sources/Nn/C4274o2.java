package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.google.android.material.card.MaterialCardView;

/* renamed from: Nn.o2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4274o2 extends AbstractC4270n2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f22169D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f22170E;

    /* renamed from: B, reason: collision with root package name */
    private final MaterialCardView f22171B;

    /* renamed from: C, reason: collision with root package name */
    private long f22172C;

    public C4274o2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f22169D, f22170E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f22172C;
            this.f22172C = 0L;
        }
        if ((j10 & 1) != 0) {
            Aj.c.a(this.f22145A, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22172C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22172C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22170E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99958h0, 2);
    }

    private C4274o2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (TextView) objArr[1]);
        this.f22172C = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.f22171B = materialCardView;
        materialCardView.setTag(null);
        this.f22145A.setTag(null);
        B0(view);
        l0();
    }
}
