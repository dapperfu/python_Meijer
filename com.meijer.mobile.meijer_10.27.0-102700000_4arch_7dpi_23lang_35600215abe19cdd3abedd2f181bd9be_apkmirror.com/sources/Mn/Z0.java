package Mn;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes9.dex */
public abstract class Z0 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f20432A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f20433B;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f20434z;

    protected Z0(Object obj, View view, int i10, ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.f20434z = constraintLayout;
        this.f20432A = imageView;
        this.f20433B = textView;
    }
}
