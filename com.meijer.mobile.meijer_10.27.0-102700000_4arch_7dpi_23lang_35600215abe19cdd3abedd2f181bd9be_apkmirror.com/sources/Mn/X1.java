package Mn;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes9.dex */
public abstract class X1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final MaterialTextView f20398A;

    /* renamed from: B, reason: collision with root package name */
    public final MaterialTextView f20399B;

    /* renamed from: C, reason: collision with root package name */
    public final ConstraintLayout f20400C;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialCheckBox f20401z;

    protected X1(Object obj, View view, int i10, MaterialCheckBox materialCheckBox, MaterialTextView materialTextView, MaterialTextView materialTextView2, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.f20401z = materialCheckBox;
        this.f20398A = materialTextView;
        this.f20399B = materialTextView2;
        this.f20400C = constraintLayout;
    }
}
