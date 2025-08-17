package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.p;
import com.google.android.material.card.MaterialCardView;

/* renamed from: Mn.o2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4269o2 extends AbstractC4265n2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20837D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20838E;

    /* renamed from: B, reason: collision with root package name */
    private final MaterialCardView f20839B;

    /* renamed from: C, reason: collision with root package name */
    private long f20840C;

    public C4269o2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f20837D, f20838E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f20840C;
            this.f20840C = 0L;
        }
        if ((j10 & 1) != 0) {
            zj.c.a(this.f20813A, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20840C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20840C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20838E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99102h0, 2);
    }

    private C4269o2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (TextView) objArr[1]);
        this.f20840C = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.f20839B = materialCardView;
        materialCardView.setTag(null);
        this.f20813A.setTag(null);
        D0(view);
        o0();
    }
}
