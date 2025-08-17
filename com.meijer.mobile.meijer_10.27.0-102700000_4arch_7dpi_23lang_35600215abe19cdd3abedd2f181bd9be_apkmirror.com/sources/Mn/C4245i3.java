package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.p;

/* renamed from: Mn.i3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4245i3 extends AbstractC4240h3 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f20691F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f20692G;

    /* renamed from: D, reason: collision with root package name */
    private final LinearLayout f20693D;

    /* renamed from: E, reason: collision with root package name */
    private long f20694E;

    public C4245i3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 5, f20691F, f20692G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20694E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20694E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20694E = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20692G = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98944S, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98924Q, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98934R, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98968U3, 4);
    }

    private C4245i3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (ImageView) objArr[3], (TextView) objArr[1], (ProgressBar) objArr[4]);
        this.f20694E = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f20693D = linearLayout;
        linearLayout.setTag(null);
        D0(view);
        o0();
    }
}
