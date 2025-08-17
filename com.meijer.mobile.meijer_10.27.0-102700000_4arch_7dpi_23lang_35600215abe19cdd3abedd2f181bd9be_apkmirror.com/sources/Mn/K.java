package Mn;

import android.view.View;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;

/* loaded from: classes9.dex */
public abstract class K extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final Barrier f20155A;

    /* renamed from: B, reason: collision with root package name */
    public final MaterialButton f20156B;

    /* renamed from: C, reason: collision with root package name */
    public final TextInputEditText f20157C;

    /* renamed from: D, reason: collision with root package name */
    public final ConstraintLayout f20158D;

    /* renamed from: E, reason: collision with root package name */
    public final ProgressView f20159E;

    /* renamed from: F, reason: collision with root package name */
    public final ScrollView f20160F;

    /* renamed from: G, reason: collision with root package name */
    public final TextInputLayout f20161G;

    /* renamed from: H, reason: collision with root package name */
    public final MaterialToolbar f20162H;

    /* renamed from: I, reason: collision with root package name */
    public final MaterialButton f20163I;

    /* renamed from: J, reason: collision with root package name */
    public final ConstraintLayout f20164J;

    /* renamed from: z, reason: collision with root package name */
    public final MaterialButton f20165z;

    protected K(Object obj, View view, int i10, MaterialButton materialButton, Barrier barrier, MaterialButton materialButton2, TextInputEditText textInputEditText, ConstraintLayout constraintLayout, ProgressView progressView, ScrollView scrollView, TextInputLayout textInputLayout, MaterialToolbar materialToolbar, MaterialButton materialButton3, ConstraintLayout constraintLayout2) {
        super(obj, view, i10);
        this.f20165z = materialButton;
        this.f20155A = barrier;
        this.f20156B = materialButton2;
        this.f20157C = textInputEditText;
        this.f20158D = constraintLayout;
        this.f20159E = progressView;
        this.f20160F = scrollView;
        this.f20161G = textInputLayout;
        this.f20162H = materialToolbar;
        this.f20163I = materialButton3;
        this.f20164J = constraintLayout2;
    }
}
