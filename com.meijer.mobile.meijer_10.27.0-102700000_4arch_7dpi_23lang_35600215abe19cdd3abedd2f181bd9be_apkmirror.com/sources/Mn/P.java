package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.p;
import com.google.android.material.appbar.MaterialToolbar;

/* loaded from: classes9.dex */
public class P extends O {

    /* renamed from: M, reason: collision with root package name */
    private static final p.i f20258M = null;

    /* renamed from: N, reason: collision with root package name */
    private static final SparseIntArray f20259N;

    /* renamed from: J, reason: collision with root package name */
    private final LinearLayout f20260J;

    /* renamed from: K, reason: collision with root package name */
    private final LinearLayout f20261K;

    /* renamed from: L, reason: collision with root package name */
    private long f20262L;

    public P(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 12, f20258M, f20259N));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20262L = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20262L != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20262L = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20259N = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98946S1, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98874L, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98774B3, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98831G6, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98810E6, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98841H6, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98917P2, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98821F6, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98897N2, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98799D6, 11);
    }

    private P(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialToolbar) objArr[3], (View) objArr[2], (RelativeLayout) objArr[10], (TextView) objArr[8], (LinearLayout) objArr[4], (Button) objArr[11], (TextView) objArr[6], (Button) objArr[9], (TextView) objArr[5], (Button) objArr[7]);
        this.f20262L = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f20260J = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[1];
        this.f20261K = linearLayout2;
        linearLayout2.setTag(null);
        D0(view);
        o0();
    }
}
