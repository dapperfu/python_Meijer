package Mn;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;

/* loaded from: classes9.dex */
public abstract class V1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final CheckableImageButton f20373A;

    /* renamed from: B, reason: collision with root package name */
    public final MaterialCardView f20374B;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f20375z;

    protected V1(Object obj, View view, int i10, TextView textView, CheckableImageButton checkableImageButton, MaterialCardView materialCardView) {
        super(obj, view, i10);
        this.f20375z = textView;
        this.f20373A = checkableImageButton;
        this.f20374B = materialCardView;
    }
}
