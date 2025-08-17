package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* renamed from: Mn.a1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4203a1 extends Z0 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f20464D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f20465E;

    /* renamed from: C, reason: collision with root package name */
    private long f20466C;

    public C4203a1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f20464D, f20465E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f20466C;
            this.f20466C = 0L;
        }
        if ((j10 & 1) != 0) {
            zj.c.a(this.f20433B, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20466C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20466C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20465E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98772B1, 2);
    }

    private C4203a1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[0], (ImageView) objArr[2], (TextView) objArr[1]);
        this.f20466C = -1L;
        this.f20434z.setTag(null);
        this.f20433B.setTag(null);
        D0(view);
        o0();
    }
}
