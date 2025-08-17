package Nj;

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

/* loaded from: classes7.dex */
public final class u implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f22176a;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialButton f22177b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageButton f22178c;

    /* renamed from: d, reason: collision with root package name */
    public final Barrier f22179d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageButton f22180e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialCardView f22181f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialButton f22182g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageButton f22183h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f22184i;

    /* renamed from: j, reason: collision with root package name */
    public final ProgressBar f22185j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f22186k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f22187l;

    /* renamed from: m, reason: collision with root package name */
    public final ConstraintLayout f22188m;

    public static u a(View view) {
        int i10 = Bj.k.f2862b;
        MaterialButton materialButton = (MaterialButton) J4.b.a(view, i10);
        if (materialButton != null) {
            i10 = Bj.k.f2813D;
            ImageButton imageButton = (ImageButton) J4.b.a(view, i10);
            if (imageButton != null) {
                i10 = Bj.k.f2815E;
                Barrier barrier = (Barrier) J4.b.a(view, i10);
                if (barrier != null) {
                    i10 = Bj.k.f2817F;
                    ImageButton imageButton2 = (ImageButton) J4.b.a(view, i10);
                    if (imageButton2 != null) {
                        i10 = Bj.k.f2823I;
                        MaterialCardView materialCardView = (MaterialCardView) J4.b.a(view, i10);
                        if (materialCardView != null) {
                            i10 = Bj.k.f2825J;
                            MaterialButton materialButton2 = (MaterialButton) J4.b.a(view, i10);
                            if (materialButton2 != null) {
                                i10 = Bj.k.f2857Z;
                                ImageButton imageButton3 = (ImageButton) J4.b.a(view, i10);
                                if (imageButton3 != null) {
                                    i10 = Bj.k.f2899n0;
                                    TextView textView = (TextView) J4.b.a(view, i10);
                                    if (textView != null) {
                                        i10 = Bj.k.f2902o0;
                                        ProgressBar progressBar = (ProgressBar) J4.b.a(view, i10);
                                        if (progressBar != null) {
                                            i10 = Bj.k.f2820G0;
                                            TextView textView2 = (TextView) J4.b.a(view, i10);
                                            if (textView2 != null) {
                                                i10 = Bj.k.f2822H0;
                                                TextView textView3 = (TextView) J4.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(Bj.m.f2952v, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // J4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f22176a;
    }

    private u(ConstraintLayout constraintLayout, MaterialButton materialButton, ImageButton imageButton, Barrier barrier, ImageButton imageButton2, MaterialCardView materialCardView, MaterialButton materialButton2, ImageButton imageButton3, TextView textView, ProgressBar progressBar, TextView textView2, TextView textView3, ConstraintLayout constraintLayout2) {
        this.f22176a = constraintLayout;
        this.f22177b = materialButton;
        this.f22178c = imageButton;
        this.f22179d = barrier;
        this.f22180e = imageButton2;
        this.f22181f = materialCardView;
        this.f22182g = materialButton2;
        this.f22183h = imageButton3;
        this.f22184i = textView;
        this.f22185j = progressBar;
        this.f22186k = textView2;
        this.f22187l = textView3;
        this.f22188m = constraintLayout2;
    }
}
