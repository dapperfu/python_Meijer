package ms;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.f;
import androidx.databinding.p;

/* renamed from: ms.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C15706b extends AbstractC15705a {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f150730G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f150731H = null;

    /* renamed from: F, reason: collision with root package name */
    private long f150732F;

    public C15706b(f fVar, View[] viewArr) {
        this(fVar, viewArr, p.t0(fVar, viewArr, 6, f150730G, f150731H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f150732F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f150732F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f150732F = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C15706b(f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (ContentLoadingProgressBar) objArr[0], (Button) objArr[5], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[1], (TextView) objArr[2]);
        this.f150732F = -1L;
        this.f150729z.setTag(null);
        this.f150724A.setTag(null);
        this.f150725B.setTag(null);
        this.f150726C.setTag(null);
        this.f150727D.setTag(null);
        this.f150728E.setTag(null);
        E0(viewArr);
        o0();
    }
}
