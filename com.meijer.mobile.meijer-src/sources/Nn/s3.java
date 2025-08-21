package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.p;
import bk.AbstractC6392a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;
import com.meijer.mobile.core.design.widget.stepperview.CollapsibleStepperView;
import vs.ProductListDecorator;
import y2.C18284a;

/* loaded from: classes10.dex */
public class s3 extends r3 {

    /* renamed from: S, reason: collision with root package name */
    private static final p.i f22287S = null;

    /* renamed from: T, reason: collision with root package name */
    private static final SparseIntArray f22288T;

    /* renamed from: R, reason: collision with root package name */
    private long f22289R;

    public s3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 17, f22287S, f22288T));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        AbstractC6392a abstractC6392a;
        String str;
        String title;
        AbstractC6392a amountSaved;
        AbstractC6392a currentPrice;
        AbstractC6392a abstractC6392a2;
        String str2;
        boolean z10;
        int errorImageResource;
        String thumbnailUrl;
        synchronized (this) {
            j10 = this.f22289R;
            this.f22289R = 0L;
        }
        ProductListDecorator productListDecorator = this.f22268Q;
        long j11 = j10 & 5;
        AbstractC6392a abstractC6392a3 = null;
        if (j11 != 0) {
            if (productListDecorator != null) {
                AbstractC6392a weightUnitSizeAndPrice = productListDecorator.getWeightUnitSizeAndPrice();
                String thumbnailDescription = productListDecorator.getThumbnailDescription();
                title = productListDecorator.getTitle();
                amountSaved = productListDecorator.getAmountSaved();
                currentPrice = productListDecorator.getCurrentPrice();
                AbstractC6392a location = productListDecorator.getLocation();
                errorImageResource = productListDecorator.getErrorImageResource();
                abstractC6392a = weightUnitSizeAndPrice;
                abstractC6392a3 = location;
                thumbnailUrl = productListDecorator.getThumbnailUrl();
                str = thumbnailDescription;
            } else {
                errorImageResource = 0;
                abstractC6392a = null;
                str = null;
                title = null;
                amountSaved = null;
                currentPrice = null;
                thumbnailUrl = null;
            }
            AbstractC6392a abstractC6392a4 = abstractC6392a3;
            z10 = abstractC6392a3 != null ? 1 : 0;
            i = errorImageResource;
            str2 = thumbnailUrl;
            abstractC6392a2 = abstractC6392a4;
        } else {
            abstractC6392a = null;
            str = null;
            title = null;
            amountSaved = null;
            currentPrice = null;
            abstractC6392a2 = null;
            str2 = null;
            z10 = 0;
        }
        if (j11 != 0) {
            if (androidx.databinding.p.f0() >= 4) {
                this.f22259H.setContentDescription(str);
            }
            Cj.a.b(this.f22259H, str2, i);
            ck.d.g(this.f22260I, abstractC6392a2);
            Aj.f.b(this.f22260I, z10);
            C18284a.b(this.f22261J, title);
            ck.d.g(this.f22262K, currentPrice);
            ck.d.g(this.f22264M, amountSaved);
            ck.d.g(this.f22267P, abstractC6392a);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f22289R != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f22289R = 4L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22288T = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99642C3, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99808S7, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99683G2, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99694H3, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99746M5, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99948g1, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99970i1, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99904c1, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99841W0, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99798R7, 16);
    }

    private s3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (FrameLayout) objArr[15], (ComposeView) objArr[14], (ImageView) objArr[12], (TextView) objArr[13], (MaterialButton) objArr[9], (FrameLayout) objArr[7], (CheckableImageButton) objArr[10], (MaterialCardView) objArr[0], (ImageView) objArr[1], (TextView) objArr[6], (FullWordEllipsisTextView) objArr[2], (TextView) objArr[3], (ComposeView) objArr[11], (TextView) objArr[5], (CollapsibleStepperView) objArr[16], (ComposeView) objArr[8], (TextView) objArr[4]);
        this.f22289R = -1L;
        this.f22258G.setTag(null);
        this.f22259H.setTag(null);
        this.f22260I.setTag(null);
        this.f22261J.setTag(null);
        this.f22262K.setTag(null);
        this.f22264M.setTag(null);
        this.f22267P.setTag(null);
        B0(view);
        l0();
    }

    @Override // Nn.r3
    public void R0(ProductListDecorator productListDecorator) {
        this.f22268Q = productListDecorator;
        synchronized (this) {
            this.f22289R |= 1;
        }
        notifyPropertyChanged(10);
        super.z0();
    }
}
