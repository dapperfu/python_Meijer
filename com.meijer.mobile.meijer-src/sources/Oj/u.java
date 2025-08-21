package Oj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes8.dex */
public final class u implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f24421a;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialButton f24422b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageButton f24423c;

    /* renamed from: d, reason: collision with root package name */
    public final Barrier f24424d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageButton f24425e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialCardView f24426f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialButton f24427g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageButton f24428h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f24429i;

    /* renamed from: j, reason: collision with root package name */
    public final ProgressBar f24430j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f24431k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f24432l;

    /* renamed from: m, reason: collision with root package name */
    public final ConstraintLayout f24433m;

    public static u a(View view) {
        int i10 = Cj.k.f4907b;
        MaterialButton materialButton = (MaterialButton) K4.b.a(view, i10);
        if (materialButton != null) {
            i10 = Cj.k.f4858D;
            ImageButton imageButton = (ImageButton) K4.b.a(view, i10);
            if (imageButton != null) {
                i10 = Cj.k.f4860E;
                Barrier barrier = (Barrier) K4.b.a(view, i10);
                if (barrier != null) {
                    i10 = Cj.k.f4862F;
                    ImageButton imageButton2 = (ImageButton) K4.b.a(view, i10);
                    if (imageButton2 != null) {
                        i10 = Cj.k.f4868I;
                        MaterialCardView materialCardView = (MaterialCardView) K4.b.a(view, i10);
                        if (materialCardView != null) {
                            i10 = Cj.k.f4870J;
                            MaterialButton materialButton2 = (MaterialButton) K4.b.a(view, i10);
                            if (materialButton2 != null) {
                                i10 = Cj.k.f4902Z;
                                ImageButton imageButton3 = (ImageButton) K4.b.a(view, i10);
                                if (imageButton3 != null) {
                                    i10 = Cj.k.f4944n0;
                                    TextView textView = (TextView) K4.b.a(view, i10);
                                    if (textView != null) {
                                        i10 = Cj.k.f4947o0;
                                        ProgressBar progressBar = (ProgressBar) K4.b.a(view, i10);
                                        if (progressBar != null) {
                                            i10 = Cj.k.f4865G0;
                                            TextView textView2 = (TextView) K4.b.a(view, i10);
                                            if (textView2 != null) {
                                                i10 = Cj.k.f4867H0;
                                                TextView textView3 = (TextView) K4.b.a(view, i10);
                                                if (textView3 != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                    return new u(constraintLayout, materialButton, imageButton, barrier, imageButton2, materialCardView, materialButton2, imageButton3, textView, progressBar, textView2, textView3, constraintLayout);
                                                }
                                            }
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

    public static u c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(Cj.m.f4997v, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f24421a;
    }

    private u(ConstraintLayout constraintLayout, MaterialButton materialButton, ImageButton imageButton, Barrier barrier, ImageButton imageButton2, MaterialCardView materialCardView, MaterialButton materialButton2, ImageButton imageButton3, TextView textView, ProgressBar progressBar, TextView textView2, TextView textView3, ConstraintLayout constraintLayout2) {
        this.f24421a = constraintLayout;
        this.f24422b = materialButton;
        this.f24423c = imageButton;
        this.f24424d = barrier;
        this.f24425e = imageButton2;
        this.f24426f = materialCardView;
        this.f24427g = materialButton2;
        this.f24428h = imageButton3;
        this.f24429i = textView;
        this.f24430j = progressBar;
        this.f24431k = textView2;
        this.f24432l = textView3;
        this.f24433m = constraintLayout2;
    }
}
