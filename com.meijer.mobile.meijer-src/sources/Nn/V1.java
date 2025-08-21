package Nn;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton;

/* loaded from: classes10.dex */
public abstract class V1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final CheckableImageButton f21705A;

    /* renamed from: B, reason: collision with root package name */
    public final MaterialCardView f21706B;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f21707z;

    protected V1(Object obj, View view, int i10, TextView textView, CheckableImageButton checkableImageButton, MaterialCardView materialCardView) {
        super(obj, view, i10);
        this.f21707z = textView;
        this.f21705A = checkableImageButton;
        this.f21706B = materialCardView;
    }
}
