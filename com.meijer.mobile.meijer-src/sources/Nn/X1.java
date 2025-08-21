package Nn;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes10.dex */
public abstract class X1 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final MaterialTextView f21730A;

    /* renamed from: B, reason: collision with root package name */
    public final MaterialTextView f21731B;

    /* renamed from: C, reason: collision with root package name */
    public final ConstraintLayout f21732C;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialCheckBox f21733z;

    protected X1(Object obj, View view, int i10, MaterialCheckBox materialCheckBox, MaterialTextView materialTextView, MaterialTextView materialTextView2, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.f21733z = materialCheckBox;
        this.f21730A = materialTextView;
        this.f21731B = materialTextView2;
        this.f21732C = constraintLayout;
    }
}
