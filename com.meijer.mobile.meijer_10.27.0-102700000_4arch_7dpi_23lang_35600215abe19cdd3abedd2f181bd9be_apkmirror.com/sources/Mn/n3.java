package Mn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView;

/* loaded from: classes9.dex */
public abstract class n3 extends androidx.databinding.p {

    /* renamed from: A, reason: collision with root package name */
    public final MaterialCardView f20815A;

    /* renamed from: B, reason: collision with root package name */
    public final Guideline f20816B;

    /* renamed from: C, reason: collision with root package name */
    public final MaterialButton f20817C;

    /* renamed from: D, reason: collision with root package name */
    public final TextView f20818D;

    /* renamed from: E, reason: collision with root package name */
    public final TextView f20819E;

    /* renamed from: F, reason: collision with root package name */
    public final ImageView f20820F;

    /* renamed from: G, reason: collision with root package name */
    public final FullWordEllipsisTextView f20821G;

    /* renamed from: H, reason: collision with root package name */
    public final Guideline f20822H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f20823I;

    /* renamed from: J, reason: collision with root package name */
    public final Guideline f20824J;

    /* renamed from: z, reason: collision with root package name */
    public final Guideline f20825z;

    @Deprecated
    public static n3 M0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (n3) androidx.databinding.p.k0(layoutInflater, com.meijer.mobile.meijer.V.f99404n1, viewGroup, z10, obj);
    }

    protected n3(Object obj, View view, int i10, Guideline guideline, MaterialCardView materialCardView, Guideline guideline2, MaterialButton materialButton, TextView textView, TextView textView2, ImageView imageView, FullWordEllipsisTextView fullWordEllipsisTextView, Guideline guideline3, TextView textView3, Guideline guideline4) {
        super(obj, view, i10);
        this.f20825z = guideline;
        this.f20815A = materialCardView;
        this.f20816B = guideline2;
        this.f20817C = materialButton;
        this.f20818D = textView;
        this.f20819E = textView2;
        this.f20820F = imageView;
        this.f20821G = fullWordEllipsisTextView;
        this.f20822H = guideline3;
        this.f20823I = textView3;
        this.f20824J = guideline4;
    }

    public static n3 K0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return M0(layoutInflater, viewGroup, z10, androidx.databinding.g.d());
    }
}
