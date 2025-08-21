package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.p;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.meijer.mobile.widget.MeijerEditText;
import com.meijer.mobile.widget.MeijerTextInputLayout;
import com.meijer.mobile.widget.PINEditText;

/* loaded from: classes10.dex */
public class k3 extends j3 {

    /* renamed from: P, reason: collision with root package name */
    private static final p.i f22098P = null;

    /* renamed from: Q, reason: collision with root package name */
    private static final SparseIntArray f22099Q;

    /* renamed from: M, reason: collision with root package name */
    private final ImageView f22100M;

    /* renamed from: N, reason: collision with root package name */
    private final TextView f22101N;

    /* renamed from: O, reason: collision with root package name */
    private long f22102O;

    public k3(androidx.databinding.f fVar, View[] viewArr) {
        this(fVar, viewArr, androidx.databinding.p.t0(fVar, viewArr, 15, f22098P, f22099Q));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        synchronized (this) {
            j10 = this.f22102O;
            this.f22102O = 0L;
        }
        if ((j10 & 1) != 0) {
            Aj.c.a(this.f22067D, true);
            Aj.c.a(this.f22069F, true);
            Aj.c.a(this.f22070G, true);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22102O != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22102O = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22099Q = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99897b5, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99973i4, 14);
    }

    private k3(androidx.databinding.f fVar, View[] viewArr, Object[] objArr) {
        super(fVar, viewArr[0], 0, (PINEditText) objArr[14], (MeijerTextInputLayout) objArr[8], (MeijerEditText) objArr[13], (MeijerTextInputLayout) objArr[5], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[1], (TextView) objArr[6], (TextView) objArr[7], (MaterialCheckBox) objArr[11], (TextView) objArr[12], (MaterialCheckBox) objArr[9], (TextView) objArr[10]);
        this.f22102O = -1L;
        ImageView imageView = (ImageView) objArr[0];
        this.f22100M = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.f22101N = textView;
        textView.setTag(null);
        this.f22064A.setTag(null);
        this.f22066C.setTag(null);
        this.f22067D.setTag(null);
        this.f22068E.setTag(null);
        this.f22069F.setTag(null);
        this.f22070G.setTag(null);
        this.f22071H.setTag(null);
        this.f22072I.setTag(null);
        this.f22073J.setTag(null);
        this.f22074K.setTag(null);
        this.f22075L.setTag(null);
        D0(viewArr);
        l0();
    }
}
