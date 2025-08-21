package Rr;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes12.dex */
public abstract class i extends p {

    /* renamed from: A, reason: collision with root package name */
    public final ConstraintLayout f34022A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f34023B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f34024C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f34025D;

    /* renamed from: E, reason: collision with root package name */
    public final ImageView f34026E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f34027F;

    /* renamed from: G, reason: collision with root package name */
    public final View f34028G;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f34029z;

    @Deprecated
    public static i N0(View view, Object obj) {
        return (i) p.U(obj, view, Nr.e.f22636e);
    }

    protected i(Object obj, View view, int i10, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, TextView textView5, View view2) {
        super(obj, view, i10);
        this.f34029z = textView;
        this.f34022A = constraintLayout;
        this.f34023B = textView2;
        this.f34024C = textView3;
        this.f34025D = textView4;
        this.f34026E = imageView;
        this.f34027F = textView5;
        this.f34028G = view2;
    }

    public static i M0(View view) {
        return N0(view, androidx.databinding.g.d());
    }
}
