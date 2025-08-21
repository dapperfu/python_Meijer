package Nn;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import bk.AbstractC6392a;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import vs.ProductListDecorator;
import y2.C18284a;

/* loaded from: classes10.dex */
public class C2 extends B2 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f21274F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f21275G = null;

    /* renamed from: D, reason: collision with root package name */
    private final TextView f21276D;

    /* renamed from: E, reason: collision with root package name */
    private long f21277E;

    public C2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.r0(fVar, view, 4, f21274F, f21275G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        String title;
        int errorImageResource;
        String thumbnailUrl;
        AbstractC6392a quantityText;
        synchronized (this) {
            j10 = this.f21277E;
            this.f21277E = 0L;
        }
        ProductListDecorator productListDecorator = this.f21246C;
        long j11 = j10 & 3;
        if (j11 == 0 || productListDecorator == null) {
            title = null;
            errorImageResource = 0;
            thumbnailUrl = null;
            quantityText = null;
        } else {
            title = productListDecorator.getTitle();
            thumbnailUrl = productListDecorator.getThumbnailUrl();
            quantityText = productListDecorator.getQuantityText();
            errorImageResource = productListDecorator.getErrorImageResource();
        }
        if (j11 != 0) {
            ck.d.g(this.f21276D, quantityText);
            Cj.a.b(this.f21244A, thumbnailUrl, errorImageResource);
            C18284a.b(this.f21245B, title);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f21277E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void l0() {
        synchronized (this) {
            this.f21277E = 2L;
        }
        z0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[0], (ImageView) objArr[1], (FullWordEllipsisTextView) objArr[2]);
        this.f21277E = -1L;
        this.f21247z.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f21276D = textView;
        textView.setTag(null);
        this.f21244A.setTag(null);
        this.f21245B.setTag(null);
        B0(view);
        l0();
    }

    @Override // Nn.B2
    public void M0(ProductListDecorator productListDecorator) {
        this.f21246C = productListDecorator;
        synchronized (this) {
            this.f21277E |= 1;
        }
        notifyPropertyChanged(10);
        super.z0();
    }
}
