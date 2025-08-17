package Mn;

import ak.AbstractC5607a;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.p;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;
import com.meijer.mobile.core.design.widget.stepperview.CollapsibleStepperView;
import vs.ProductListDecorator;
import y2.C18157a;

/* loaded from: classes9.dex */
public class s3 extends r3 {

    /* renamed from: S, reason: collision with root package name */
    private static final p.i f20955S = null;

    /* renamed from: T, reason: collision with root package name */
    private static final SparseIntArray f20956T;

    /* renamed from: R, reason: collision with root package name */
    private long f20957R;

    public s3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 17, f20955S, f20956T));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        AbstractC5607a abstractC5607a;
        String str;
        String title;
        AbstractC5607a amountSaved;
        AbstractC5607a currentPrice;
        AbstractC5607a abstractC5607a2;
        String str2;
        boolean z10;
        int errorImageResource;
        String thumbnailUrl;
        synchronized (this) {
            j10 = this.f20957R;
            this.f20957R = 0L;
        }
        ProductListDecorator productListDecorator = this.f20936Q;
        long j11 = j10 & 5;
        AbstractC5607a abstractC5607a3 = null;
        if (j11 != 0) {
            if (productListDecorator != null) {
                AbstractC5607a weightUnitSizeAndPrice = productListDecorator.getWeightUnitSizeAndPrice();
                String thumbnailDescription = productListDecorator.getThumbnailDescription();
                title = productListDecorator.getTitle();
                amountSaved = productListDecorator.getAmountSaved();
                currentPrice = productListDecorator.getCurrentPrice();
                AbstractC5607a location = productListDecorator.getLocation();
                errorImageResource = productListDecorator.getErrorImageResource();
                abstractC5607a = weightUnitSizeAndPrice;
                abstractC5607a3 = location;
                thumbnailUrl = productListDecorator.getThumbnailUrl();
                str = thumbnailDescription;
            } else {
                errorImageResource = 0;
                abstractC5607a = null;
                str = null;
                title = null;
                amountSaved = null;
                currentPrice = null;
                thumbnailUrl = null;
            }
            AbstractC5607a abstractC5607a4 = abstractC5607a3;
            z10 = abstractC5607a3 != null ? 1 : 0;
            i = errorImageResource;
            str2 = thumbnailUrl;
            abstractC5607a2 = abstractC5607a4;
        } else {
            abstractC5607a = null;
            str = null;
            title = null;
            amountSaved = null;
            currentPrice = null;
            abstractC5607a2 = null;
            str2 = null;
            z10 = 0;
        }
        if (j11 != 0) {
            if (androidx.databinding.p.f0() >= 4) {
                this.f20927H.setContentDescription(str);
            }
            Bj.a.b(this.f20927H, str2, i);
            bk.d.g(this.f20928I, abstractC5607a2);
            zj.f.b(this.f20928I, z10);
            C18157a.b(this.f20929J, title);
            bk.d.g(this.f20930K, currentPrice);
            bk.d.g(this.f20932M, amountSaved);
            bk.d.g(this.f20935P, abstractC5607a);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f20957R != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f20957R = 4L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20956T = sparseIntArray;
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98785C3, 7);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98962T7, 8);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98827G2, 9);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98838H3, 10);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98900N5, 11);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99092g1, 12);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99114i1, 13);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f99048c1, 14);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98985W0, 15);
        sparseIntArray.put(com.meijer.mobile.meijer.T.f98952S7, 16);
    }

    private s3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (FrameLayout) objArr[15], (ComposeView) objArr[14], (ImageView) objArr[12], (TextView) objArr[13], (MaterialButton) objArr[9], (FrameLayout) objArr[7], (CheckableImageButton) objArr[10], (MaterialCardView) objArr[0], (ImageView) objArr[1], (TextView) objArr[6], (FullWordEllipsisTextView) objArr[2], (TextView) objArr[3], (ComposeView) objArr[11], (TextView) objArr[5], (CollapsibleStepperView) objArr[16], (ComposeView) objArr[8], (TextView) objArr[4]);
        this.f20957R = -1L;
        this.f20926G.setTag(null);
        this.f20927H.setTag(null);
        this.f20928I.setTag(null);
        this.f20929J.setTag(null);
        this.f20930K.setTag(null);
        this.f20932M.setTag(null);
        this.f20935P.setTag(null);
        D0(view);
        o0();
    }

    @Override // Mn.r3
    public void P0(ProductListDecorator productListDecorator) {
        this.f20936Q = productListDecorator;
        synchronized (this) {
            this.f20957R |= 1;
        }
        notifyPropertyChanged(10);
        super.A0();
    }
}
