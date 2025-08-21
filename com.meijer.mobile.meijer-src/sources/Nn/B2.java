package Nn;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;
import vs.ProductListDecorator;

/* loaded from: classes10.dex */
public abstract class B2 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f21244A;

    /* renamed from: B, reason: collision with root package name */
    public final FullWordEllipsisTextView f21245B;

    /* renamed from: C, reason: collision with root package name */
    protected ProductListDecorator f21246C;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f21247z;

    public abstract void M0(ProductListDecorator productListDecorator);

    protected B2(Object obj, View view, int i10, ConstraintLayout constraintLayout, ImageView imageView, FullWordEllipsisTextView fullWordEllipsisTextView) {
        super(obj, view, i10);
        this.f21247z = constraintLayout;
        this.f21244A = imageView;
        this.f21245B = fullWordEllipsisTextView;
    }
}
