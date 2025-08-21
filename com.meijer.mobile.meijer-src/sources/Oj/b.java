package Oj;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.slider.Slider;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes8.dex */
public final class b implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f24319a;

    /* renamed from: b, reason: collision with root package name */
    public final s f24320b;

    /* renamed from: c, reason: collision with root package name */
    public final LottieAnimationView f24321c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f24322d;

    /* renamed from: e, reason: collision with root package name */
    public final CheckBox f24323e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialButton f24324f;

    /* renamed from: g, reason: collision with root package name */
    public final Chip f24325g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatSeekBar f24326h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f24327i;

    /* renamed from: j, reason: collision with root package name */
    public final Chip f24328j;

    /* renamed from: k, reason: collision with root package name */
    public final Slider f24329k;

    /* renamed from: l, reason: collision with root package name */
    public final Chip f24330l;

    public static b a(View view) {
        int i10 = Cj.k.f4913d;
        View viewA = K4.b.a(view, i10);
        if (viewA != null) {
            s sVarM0 = s.M0(viewA);
            i10 = Cj.k.f4916e;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) K4.b.a(view, i10);
            if (lottieAnimationView != null) {
                i10 = Cj.k.f4856C;
                LinearLayout linearLayout = (LinearLayout) K4.b.a(view, i10);
                if (linearLayout != null) {
                    i10 = Cj.k.f4950p0;
                    CheckBox checkBox = (CheckBox) K4.b.a(view, i10);
                    if (checkBox != null) {
                        i10 = Cj.k.f4970y0;
                        MaterialButton materialButton = (MaterialButton) K4.b.a(view, i10);
                        if (materialButton != null) {
                            i10 = Cj.k.f4972z0;
                            Chip chip = (Chip) K4.b.a(view, i10);
                            if (chip != null) {
                                i10 = Cj.k.f4869I0;
                                AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) K4.b.a(view, i10);
                                if (appCompatSeekBar != null) {
                                    i10 = Cj.k.f4871J0;
                                    TextView textView = (TextView) K4.b.a(view, i10);
                                    if (textView != null) {
                                        i10 = Cj.k.f4875L0;
                                        Chip chip2 = (Chip) K4.b.a(view, i10);
                                        if (chip2 != null) {
                                            i10 = Cj.k.f4877M0;
                                            Slider slider = (Slider) K4.b.a(view, i10);
                                            if (slider != null) {
                                                i10 = Cj.k.f4933j1;
                                                Chip chip3 = (Chip) K4.b.a(view, i10);
                                                if (chip3 != null) {
                                                    return new b((ExpandableCardView) view, sVarM0, lottieAnimationView, linearLayout, checkBox, materialButton, chip, appCompatSeekBar, textView, chip2, slider, chip3);
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

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f24319a;
    }

    private b(ExpandableCardView expandableCardView, s sVar, LottieAnimationView lottieAnimationView, LinearLayout linearLayout, CheckBox checkBox, MaterialButton materialButton, Chip chip, AppCompatSeekBar appCompatSeekBar, TextView textView, Chip chip2, Slider slider, Chip chip3) {
        this.f24319a = expandableCardView;
        this.f24320b = sVar;
        this.f24321c = lottieAnimationView;
        this.f24322d = linearLayout;
        this.f24323e = checkBox;
        this.f24324f = materialButton;
        this.f24325g = chip;
        this.f24326h = appCompatSeekBar;
        this.f24327i = textView;
        this.f24328j = chip2;
        this.f24329k = slider;
        this.f24330l = chip3;
    }
}
