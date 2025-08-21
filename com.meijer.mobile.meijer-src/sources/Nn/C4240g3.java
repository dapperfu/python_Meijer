package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.p;

/* renamed from: Nn.g3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4240g3 extends AbstractC4235f3 {

    /* renamed from: K, reason: collision with root package name */
    private static final p.i f21971K = null;

    /* renamed from: L, reason: collision with root package name */
    private static final SparseIntArray f21972L = null;

    /* renamed from: J, reason: collision with root package name */
    private long f21973J;

    public C4240g3(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 10, f21971K, f21972L));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21973J = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21973J != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21973J = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C4240g3(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (TextView) objArr[6], (Group) objArr[9], (ImageView) objArr[4], (ImageView) objArr[0], (TextView) objArr[3], (TextView) objArr[1], (Group) objArr[2], (View) objArr[7], (ProgressBar) objArr[5], (ImageView) objArr[8]);
        this.f21973J = -1L;
        this.f21958z.setTag(null);
        this.f21949A.setTag(null);
        this.f21950B.setTag(null);
        this.f21951C.setTag(null);
        this.f21952D.setTag(null);
        this.f21953E.setTag(null);
        this.f21954F.setTag(null);
        this.f21955G.setTag(null);
        this.f21956H.setTag(null);
        this.f21957I.setTag(null);
        D0(viewArr);
        l0();
    }
}
