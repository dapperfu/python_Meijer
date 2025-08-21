package Nn;

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

/* renamed from: Nn.k1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C4257k1 extends AbstractC4253j1 {

    /* renamed from: O, reason: collision with root package name */
    private static final p.i f22091O = null;

    /* renamed from: P, reason: collision with root package name */
    private static final SparseIntArray f22092P;

    /* renamed from: M, reason: collision with root package name */
    private final FrameLayout f22093M;

    /* renamed from: N, reason: collision with root package name */
    private long f22094N;

    public C4257k1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 14, f22091O, f22092P));
    }

    @Override // androidx.databinding.p
    protected void W() {
        synchronized (this) {
            this.f22094N = 0L;
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22094N != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22094N = 1L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22092P = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99639C0, 1);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100091t1, 2);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99799R8, 3);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99789Q8, 4);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99804S3, 5);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99684G3, 6);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99632B4, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100046p0, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100041o6, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f100030n6, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99619A2, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99640C1, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99852X1, 13);
    }

    private C4257k1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Barrier) objArr[8], (View) objArr[1], (ConstraintLayout) objArr[2], (ImageButton) objArr[12], (Button) objArr[13], (CheckableImageButton) objArr[11], (View) objArr[6], (ImageButton) objArr[5], (EditText) objArr[7], (EditText) objArr[10], (TextView) objArr[9], (EditText) objArr[4], (TextView) objArr[3]);
        this.f22094N = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f22093M = frameLayout;
        frameLayout.setTag(null);
        B0(view);
        l0();
    }
}
