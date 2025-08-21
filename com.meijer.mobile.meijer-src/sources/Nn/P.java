package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.p;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes10.dex */
public class P extends O {

    /* renamed from: M, reason: collision with root package name */
    private static final p.i f21590M = null;

    /* renamed from: N, reason: collision with root package name */
    private static final SparseIntArray f21591N;

    /* renamed from: J, reason: collision with root package name */
    private final LinearLayout f21592J;

    /* renamed from: K, reason: collision with root package name */
    private final LinearLayout f21593K;

    /* renamed from: L, reason: collision with root package name */
    private long f21594L;

    public P(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 12, f21590M, f21591N));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f21594L = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21594L != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21594L = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f21591N = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99802S1, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99730L, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99631B3, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99677F6, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99656D6, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99687G6, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99773P2, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99667E6, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99753N2, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99645C6, 11);
    }

    private P(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialToolbar) objArr[3], (View) objArr[2], (RelativeLayout) objArr[10], (TextView) objArr[8], (LinearLayout) objArr[4], (Button) objArr[11], (TextView) objArr[6], (Button) objArr[9], (TextView) objArr[5], (Button) objArr[7]);
        this.f21594L = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f21592J = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.f21593K = linearLayout2;
        linearLayout2.setTag(null);
        B0(view);
        l0();
    }
}
