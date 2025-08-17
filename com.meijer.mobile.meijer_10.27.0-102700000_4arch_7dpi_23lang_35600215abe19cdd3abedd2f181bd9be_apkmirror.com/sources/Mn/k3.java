package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.p;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.meijer.mobile.widget.MeijerEditText;
import com.meijer.mobile.widget.MeijerTextInputLayout;
import com.meijer.mobile.widget.PINEditText;

/* loaded from: classes9.dex */
public class k3 extends j3 {

    /* renamed from: P, reason: collision with root package name */
    private static final p.i f20766P = null;

    /* renamed from: Q, reason: collision with root package name */
    private static final SparseIntArray f20767Q;

    /* renamed from: M, reason: collision with root package name */
    private final ImageView f20768M;

    /* renamed from: N, reason: collision with root package name */
    private final TextView f20769N;

    /* renamed from: O, reason: collision with root package name */
    private long f20770O;

    public k3(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 15, f20766P, f20767Q));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f20770O;
            this.f20770O = 0L;
        }
        if ((j10 & 1) != 0) {
            zj.c.a(this.f20735D, true);
            zj.c.a(this.f20737F, true);
            zj.c.a(this.f20738G, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20770O != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20770O = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20767Q = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99041b5, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99117i4, 14);
    }

    private k3(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (PINEditText) objArr[14], (MeijerTextInputLayout) objArr[8], (MeijerEditText) objArr[13], (MeijerTextInputLayout) objArr[5], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[1], (TextView) objArr[6], (TextView) objArr[7], (MaterialCheckBox) objArr[11], (TextView) objArr[12], (MaterialCheckBox) objArr[9], (TextView) objArr[10]);
        this.f20770O = -1L;
        ImageView imageView = (ImageView) objArr[0];
        this.f20768M = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f20769N = textView;
        textView.setTag(null);
        this.f20732A.setTag(null);
        this.f20734C.setTag(null);
        this.f20735D.setTag(null);
        this.f20736E.setTag(null);
        this.f20737F.setTag(null);
        this.f20738G.setTag(null);
        this.f20739H.setTag(null);
        this.f20740I.setTag(null);
        this.f20741J.setTag(null);
        this.f20742K.setTag(null);
        this.f20743L.setTag(null);
        E0(viewArr);
        o0();
    }
}
