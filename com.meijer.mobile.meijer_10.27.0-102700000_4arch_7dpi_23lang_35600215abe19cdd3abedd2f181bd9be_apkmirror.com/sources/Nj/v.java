package Nj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes7.dex */
public final class v implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final View f22189a;

    /* renamed from: b, reason: collision with root package name */
    public final Barrier f22190b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f22191c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f22192d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialCheckBox f22193e;

    /* renamed from: f, reason: collision with root package name */
    public final Barrier f22194f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f22195g;

    /* renamed from: h, reason: collision with root package name */
    public final MaterialTextView f22196h;

    /* renamed from: i, reason: collision with root package name */
    public final Guideline f22197i;

    /* renamed from: j, reason: collision with root package name */
    public final Guideline f22198j;

    public static v a(View view) {
        int i10 = Bj.k.f2883i;
        Barrier barrier = (Barrier) J4.b.a(view, i10);
        if (barrier != null) {
            i10 = Bj.k.f2898n;
            ConstraintLayout constraintLayout = (ConstraintLayout) J4.b.a(view, i10);
            if (constraintLayout != null) {
                i10 = Bj.k.f2829L;
                FrameLayout frameLayout = (FrameLayout) J4.b.a(view, i10);
                if (frameLayout != null) {
                    i10 = Bj.k.f2831M;
                    MaterialCheckBox materialCheckBox = (MaterialCheckBox) J4.b.a(view, i10);
                    if (materialCheckBox != null) {
                        i10 = Bj.k.f2839Q;
                        Barrier barrier2 = (Barrier) J4.b.a(view, i10);
                        if (barrier2 != null) {
                            i10 = Bj.k.f2881h0;
                            ImageView imageView = (ImageView) J4.b.a(view, i10);
                            if (imageView != null) {
                                i10 = Bj.k.f2887j0;
                                MaterialTextView materialTextView = (MaterialTextView) J4.b.a(view, i10);
                                if (materialTextView != null) {
                                    i10 = Bj.k.f2890k0;
                                    Guideline guideline = (Guideline) J4.b.a(view, i10);
                                    if (guideline != null) {
                                        i10 = Bj.k.f2893l0;
                                        Guideline guideline2 = (Guideline) J4.b.a(view, i10);
                                        if (guideline2 != null) {
                                            return new v(view, barrier, constraintLayout, frameLayout, materialCheckBox, barrier2, imageView, materialTextView, guideline, guideline2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static v b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(Bj.m.f2955y, viewGroup);
        return a(viewGroup);
    }

    @Override // J4.a
    public View getRoot() {
        return this.f22189a;
    }

    private v(View view, Barrier barrier, ConstraintLayout constraintLayout, FrameLayout frameLayout, MaterialCheckBox materialCheckBox, Barrier barrier2, ImageView imageView, MaterialTextView materialTextView, Guideline guideline, Guideline guideline2) {
        this.f22189a = view;
        this.f22190b = barrier;
        this.f22191c = constraintLayout;
        this.f22192d = frameLayout;
        this.f22193e = materialCheckBox;
        this.f22194f = barrier2;
        this.f22195g = imageView;
        this.f22196h = materialTextView;
        this.f22197i = guideline;
        this.f22198j = guideline2;
    }
}
