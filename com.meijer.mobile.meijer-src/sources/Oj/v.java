package Oj;

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

/* loaded from: classes8.dex */
public final class v implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final View f24434a;

    /* renamed from: b, reason: collision with root package name */
    public final Barrier f24435b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f24436c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f24437d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialCheckBox f24438e;

    /* renamed from: f, reason: collision with root package name */
    public final Barrier f24439f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f24440g;

    /* renamed from: h, reason: collision with root package name */
    public final MaterialTextView f24441h;

    /* renamed from: i, reason: collision with root package name */
    public final Guideline f24442i;

    /* renamed from: j, reason: collision with root package name */
    public final Guideline f24443j;

    public static v a(View view) {
        int i10 = Cj.k.f4928i;
        Barrier barrier = (Barrier) K4.b.a(view, i10);
        if (barrier != null) {
            i10 = Cj.k.f4943n;
            ConstraintLayout constraintLayout = (ConstraintLayout) K4.b.a(view, i10);
            if (constraintLayout != null) {
                i10 = Cj.k.f4874L;
                FrameLayout frameLayout = (FrameLayout) K4.b.a(view, i10);
                if (frameLayout != null) {
                    i10 = Cj.k.f4876M;
                    MaterialCheckBox materialCheckBox = (MaterialCheckBox) K4.b.a(view, i10);
                    if (materialCheckBox != null) {
                        i10 = Cj.k.f4884Q;
                        Barrier barrier2 = (Barrier) K4.b.a(view, i10);
                        if (barrier2 != null) {
                            i10 = Cj.k.f4926h0;
                            ImageView imageView = (ImageView) K4.b.a(view, i10);
                            if (imageView != null) {
                                i10 = Cj.k.f4932j0;
                                MaterialTextView materialTextView = (MaterialTextView) K4.b.a(view, i10);
                                if (materialTextView != null) {
                                    i10 = Cj.k.f4935k0;
                                    Guideline guideline = (Guideline) K4.b.a(view, i10);
                                    if (guideline != null) {
                                        i10 = Cj.k.f4938l0;
                                        Guideline guideline2 = (Guideline) K4.b.a(view, i10);
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
        layoutInflater.inflate(Cj.m.f5000y, viewGroup);
        return a(viewGroup);
    }

    @Override // K4.a
    public View getRoot() {
        return this.f24434a;
    }

    private v(View view, Barrier barrier, ConstraintLayout constraintLayout, FrameLayout frameLayout, MaterialCheckBox materialCheckBox, Barrier barrier2, ImageView imageView, MaterialTextView materialTextView, Guideline guideline, Guideline guideline2) {
        this.f24434a = view;
        this.f24435b = barrier;
        this.f24436c = constraintLayout;
        this.f24437d = frameLayout;
        this.f24438e = materialCheckBox;
        this.f24439f = barrier2;
        this.f24440g = imageView;
        this.f24441h = materialTextView;
        this.f24442i = guideline;
        this.f24443j = guideline2;
    }
}
