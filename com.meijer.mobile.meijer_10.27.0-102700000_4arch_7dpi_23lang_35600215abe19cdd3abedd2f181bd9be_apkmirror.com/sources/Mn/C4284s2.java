package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.p;

/* renamed from: Mn.s2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4284s2 extends AbstractC4280r2 {

    /* renamed from: C, reason: collision with root package name */
    private static final p.i f20951C = null;

    /* renamed from: D, reason: collision with root package name */
    private static final SparseIntArray f20952D;

    /* renamed from: A, reason: collision with root package name */
    private final LinearLayout f20953A;

    /* renamed from: B, reason: collision with root package name */
    private long f20954B;

    public C4284s2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 2, f20951C, f20952D));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20954B = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20954B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20954B = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20952D = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99260v4, 1);
    }

    private C4284s2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[1]);
        this.f20954B = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f20953A = linearLayout;
        linearLayout.setTag(null);
        D0(view);
        o0();
    }
}
