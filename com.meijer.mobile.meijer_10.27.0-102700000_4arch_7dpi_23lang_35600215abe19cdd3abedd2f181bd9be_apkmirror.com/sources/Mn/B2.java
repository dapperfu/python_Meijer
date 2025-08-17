package Mn;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import vs.ProductListDecorator;

/* loaded from: classes9.dex */
public abstract class B2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f19912A;

    /* renamed from: B, reason: collision with root package name */
    public final FullWordEllipsisTextView f19913B;

    /* renamed from: C, reason: collision with root package name */
    protected ProductListDecorator f19914C;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f19915z;

    public abstract void K0(ProductListDecorator productListDecorator);

    protected B2(Object obj, View view, int i10, ConstraintLayout constraintLayout, ImageView imageView, FullWordEllipsisTextView fullWordEllipsisTextView) {
        super(obj, view, i10);
        this.f19915z = constraintLayout;
        this.f19912A = imageView;
        this.f19913B = fullWordEllipsisTextView;
    }
}
