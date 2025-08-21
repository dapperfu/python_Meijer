package ms;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.f;
import androidx.databinding.p;

/* renamed from: ms.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C15765b extends AbstractC15764a {

    /* renamed from: G, reason: collision with root package name */
    private static final p.i f151621G = null;

    /* renamed from: H, reason: collision with root package name */
    private static final SparseIntArray f151622H = null;

    /* renamed from: F, reason: collision with root package name */
    private long f151623F;

    public C15765b(f fVar, View[] viewArr) {
        this(fVar, viewArr, p.t0(fVar, viewArr, 6, f151621G, f151622H));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f151623F = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f151623F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f151623F = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C15765b(f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (ContentLoadingProgressBar) objArr[0], (Button) objArr[5], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[1], (TextView) objArr[2]);
        this.f151623F = -1L;
        this.f151620z.setTag(null);
        this.f151615A.setTag(null);
        this.f151616B.setTag(null);
        this.f151617C.setTag(null);
        this.f151618D.setTag(null);
        this.f151619E.setTag(null);
        D0(viewArr);
        l0();
    }
}
