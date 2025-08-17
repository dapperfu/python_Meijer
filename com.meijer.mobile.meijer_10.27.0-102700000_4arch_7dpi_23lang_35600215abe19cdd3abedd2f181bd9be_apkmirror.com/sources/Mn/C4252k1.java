package Mn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;

/* renamed from: Mn.k1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C4252k1 extends AbstractC4248j1 {

    /* renamed from: O, reason: collision with root package name */
    private static final p.i f20759O = null;

    /* renamed from: P, reason: collision with root package name */
    private static final SparseIntArray f20760P;

    /* renamed from: M, reason: collision with root package name */
    private final FrameLayout f20761M;

    /* renamed from: N, reason: collision with root package name */
    private long f20762N;

    public C4252k1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 14, f20759O, f20760P));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f20762N = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20762N != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20762N = 1L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20760P = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98782C0, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99235t1, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98953S8, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98943R8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98948S3, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98828G3, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98775B4, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99190p0, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99196p6, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99185o6, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98762A2, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98783C1, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98996X1, 13);
    }

    private C4252k1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Barrier) objArr[8], (View) objArr[1], (ConstraintLayout) objArr[2], (ImageButton) objArr[12], (Button) objArr[13], (CheckableImageButton) objArr[11], (View) objArr[6], (ImageButton) objArr[5], (EditText) objArr[7], (EditText) objArr[10], (TextView) objArr[9], (EditText) objArr[4], (TextView) objArr[3]);
        this.f20762N = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f20761M = frameLayout;
        frameLayout.setTag(null);
        D0(view);
        o0();
    }
}
