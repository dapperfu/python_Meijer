package Nj;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.p;
import com.google.android.material.textfield.TextInputEditText;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;

/* loaded from: classes7.dex */
public class t extends s {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f22172F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f22173G;

    /* renamed from: D, reason: collision with root package name */
    private final LinearLayout f22174D;

    /* renamed from: E, reason: collision with root package name */
    private long f22175E;

    public t(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 5, f22172F, f22173G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22175E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22175E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f22175E = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22173G = sparseIntArray;
        sparseIntArray.put(Bj.k.f2919v0, 1);
        sparseIntArray.put(Bj.k.f2917u0, 2);
        sparseIntArray.put(Bj.k.f2911r0, 3);
        sparseIntArray.put(Bj.k.f2908q0, 4);
    }

    private t(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextInputEditText) objArr[4], (EnhancedTextInputLayoutView) objArr[3], (TextInputEditText) objArr[2], (EnhancedTextInputLayoutView) objArr[1]);
        this.f22175E = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f22174D = linearLayout;
        linearLayout.setTag(null);
        D0(view);
        o0();
    }
}
