package Oj;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.p;
import com.google.android.material.textfield.TextInputEditText;
import com.meijer.mobile.core.design.widget.enhancedtextinputlayoutview.EnhancedTextInputLayoutView;

/* loaded from: classes8.dex */
public class t extends s {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f24417F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f24418G;

    /* renamed from: D, reason: collision with root package name */
    private final LinearLayout f24419D;

    /* renamed from: E, reason: collision with root package name */
    private long f24420E;

    public t(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 5, f24417F, f24418G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f24420E = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f24420E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f24420E = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f24418G = sparseIntArray;
        sparseIntArray.put(Cj.k.f4964v0, 1);
        sparseIntArray.put(Cj.k.f4962u0, 2);
        sparseIntArray.put(Cj.k.f4956r0, 3);
        sparseIntArray.put(Cj.k.f4953q0, 4);
    }

    private t(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextInputEditText) objArr[4], (EnhancedTextInputLayoutView) objArr[3], (TextInputEditText) objArr[2], (EnhancedTextInputLayoutView) objArr[1]);
        this.f24420E = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f24419D = linearLayout;
        linearLayout.setTag(null);
        B0(view);
        l0();
    }
}
