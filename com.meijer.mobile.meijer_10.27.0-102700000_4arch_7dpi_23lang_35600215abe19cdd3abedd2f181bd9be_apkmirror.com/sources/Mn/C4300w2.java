package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.p;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* renamed from: Mn.w2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4300w2 extends AbstractC4296v2 {

    /* renamed from: D, reason: collision with root package name */
    private static final p.i f21070D = null;

    /* renamed from: E, reason: collision with root package name */
    private static final SparseIntArray f21071E;

    /* renamed from: C, reason: collision with root package name */
    private long f21072C;

    public C4300w2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 3, f21070D, f21071E));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21072C = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21072C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f21072C = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21071E = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99262v6, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99251u6, 2);
    }

    private C4300w2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (FrameLayout) objArr[0], (ImageView) objArr[2], (FullWordEllipsisTextView) objArr[1]);
        this.f21072C = -1L;
        this.f21046z.setTag(null);
        D0(view);
        o0();
    }
}
