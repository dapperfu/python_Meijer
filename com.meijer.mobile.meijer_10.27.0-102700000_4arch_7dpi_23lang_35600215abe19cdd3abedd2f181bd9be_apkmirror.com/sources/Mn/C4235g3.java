package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.p;

/* renamed from: Mn.g3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4235g3 extends AbstractC4230f3 {

    /* renamed from: K, reason: collision with root package name */
    private static final p.i f20639K = null;

    /* renamed from: L, reason: collision with root package name */
    private static final SparseIntArray f20640L = null;

    /* renamed from: J, reason: collision with root package name */
    private long f20641J;

    public C4235g3(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 10, f20639K, f20640L));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20641J = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20641J != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20641J = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C4235g3(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (TextView) objArr[6], (Group) objArr[9], (ImageView) objArr[4], (ImageView) objArr[0], (TextView) objArr[3], (TextView) objArr[1], (Group) objArr[2], (View) objArr[7], (ProgressBar) objArr[5], (ImageView) objArr[8]);
        this.f20641J = -1L;
        this.f20626z.setTag(null);
        this.f20617A.setTag(null);
        this.f20618B.setTag(null);
        this.f20619C.setTag(null);
        this.f20620D.setTag(null);
        this.f20621E.setTag(null);
        this.f20622F.setTag(null);
        this.f20623G.setTag(null);
        this.f20624H.setTag(null);
        this.f20625I.setTag(null);
        E0(viewArr);
        o0();
    }
}
