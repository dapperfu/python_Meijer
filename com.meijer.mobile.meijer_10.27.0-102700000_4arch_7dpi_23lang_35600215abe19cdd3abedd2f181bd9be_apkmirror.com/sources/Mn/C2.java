package Mn;

import ak.AbstractC5607a;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import vs.ProductListDecorator;
import y2.C18157a;

/* loaded from: classes9.dex */
public class C2 extends B2 {

    /* renamed from: F, reason: collision with root package name */
    private static final p.i f19942F = null;

    /* renamed from: G, reason: collision with root package name */
    private static final SparseIntArray f19943G = null;

    /* renamed from: D, reason: collision with root package name */
    private final TextView f19944D;

    /* renamed from: E, reason: collision with root package name */
    private long f19945E;

    public C2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.s0(fVar, view, 4, f19942F, f19943G));
    }

    @Override // androidx.databinding.p
    protected void W() {
        long j10;
        String title;
        int errorImageResource;
        String thumbnailUrl;
        AbstractC5607a quantityText;
        synchronized (this) {
            j10 = this.f19945E;
            this.f19945E = 0L;
        }
        ProductListDecorator productListDecorator = this.f19914C;
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
            bk.d.g(this.f19944D, quantityText);
            Bj.a.b(this.f19912A, thumbnailUrl, errorImageResource);
            C18157a.b(this.f19913B, title);
        }
    }

    @Override // androidx.databinding.p
    public boolean h0() {
        synchronized (this) {
            try {
                return this.f19945E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void o0() {
        synchronized (this) {
            this.f19945E = 2L;
        }
        A0();
    }

    @Override // androidx.databinding.p
    protected boolean u0(int i10, Object obj, int i11) {
        return false;
    }

    private C2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[0], (ImageView) objArr[1], (FullWordEllipsisTextView) objArr[2]);
        this.f19945E = -1L;
        this.f19915z.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.f19944D = textView;
        textView.setTag(null);
        this.f19912A.setTag(null);
        this.f19913B.setTag(null);
        D0(view);
        o0();
    }

    @Override // Mn.B2
    public void K0(ProductListDecorator productListDecorator) {
        this.f19914C = productListDecorator;
        synchronized (this) {
            this.f19945E |= 1;
        }
        notifyPropertyChanged(10);
        super.A0();
    }
}
