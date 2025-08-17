package Rr;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.p;

/* loaded from: classes11.dex */
public abstract class i extends p {

    /* renamed from: A, reason: collision with root package name */
    public final ConstraintLayout f32985A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f32986B;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f32987C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f32988D;

    /* renamed from: E, reason: collision with root package name */
    public final ImageView f32989E;

    /* renamed from: F, reason: collision with root package name */
    public final TextView f32990F;

    /* renamed from: G, reason: collision with root package name */
    public final View f32991G;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f32992z;

    @Deprecated
    public static i M0(View view, Object obj) {
        return (i) p.U(obj, view, Nr.e.f22680e);
    }

    protected i(Object obj, View view, int i10, TextView textView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, TextView textView5, View view2) {
        super(obj, view, i10);
        this.f32992z = textView;
        this.f32985A = constraintLayout;
        this.f32986B = textView2;
        this.f32987C = textView3;
        this.f32988D = textView4;
        this.f32989E = imageView;
        this.f32990F = textView5;
        this.f32991G = view2;
    }

    public static i K0(View view) {
        return M0(view, androidx.databinding.g.d());
    }
}
