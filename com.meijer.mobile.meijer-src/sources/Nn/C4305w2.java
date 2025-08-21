package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.p;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* renamed from: Nn.w2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4305w2 extends AbstractC4301v2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f22402D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f22403E;

    /* renamed from: C, reason: collision with root package name */
    private long f22404C;

    public C4305w2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 3, f22402D, f22403E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22404C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22404C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22404C = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22403E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100107u6, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100096t6, 2);
    }

    private C4305w2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (FrameLayout) objArr[0], (ImageView) objArr[2], (FullWordEllipsisTextView) objArr[1]);
        this.f22404C = -1L;
        this.f22378z.setTag(null);
        B0(view);
        l0();
    }
}
