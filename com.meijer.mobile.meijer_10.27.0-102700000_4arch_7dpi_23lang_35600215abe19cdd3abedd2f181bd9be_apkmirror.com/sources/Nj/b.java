package Nj;

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

/* loaded from: classes7.dex */
public final class b implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f22074a;

    /* renamed from: b, reason: collision with root package name */
    public final s f22075b;

    /* renamed from: c, reason: collision with root package name */
    public final LottieAnimationView f22076c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f22077d;

    /* renamed from: e, reason: collision with root package name */
    public final CheckBox f22078e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialButton f22079f;

    /* renamed from: g, reason: collision with root package name */
    public final Chip f22080g;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatSeekBar f22081h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f22082i;

    /* renamed from: j, reason: collision with root package name */
    public final Chip f22083j;

    /* renamed from: k, reason: collision with root package name */
    public final Slider f22084k;

    /* renamed from: l, reason: collision with root package name */
    public final Chip f22085l;

    public static b a(View view) {
        int i10 = Bj.k.f2868d;
        View viewA = J4.b.a(view, i10);
        if (viewA != null) {
            s sVarK0 = s.K0(viewA);
            i10 = Bj.k.f2871e;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) J4.b.a(view, i10);
            if (lottieAnimationView != null) {
                i10 = Bj.k.f2811C;
                LinearLayout linearLayout = (LinearLayout) J4.b.a(view, i10);
                if (linearLayout != null) {
                    i10 = Bj.k.f2905p0;
                    CheckBox checkBox = (CheckBox) J4.b.a(view, i10);
                    if (checkBox != null) {
                        i10 = Bj.k.f2925y0;
                        MaterialButton materialButton = (MaterialButton) J4.b.a(view, i10);
                        if (materialButton != null) {
                            i10 = Bj.k.f2927z0;
                            Chip chip = (Chip) J4.b.a(view, i10);
                            if (chip != null) {
                                i10 = Bj.k.f2824I0;
                                AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) J4.b.a(view, i10);
                                if (appCompatSeekBar != null) {
                                    i10 = Bj.k.f2826J0;
                                    TextView textView = (TextView) J4.b.a(view, i10);
                                    if (textView != null) {
                                        i10 = Bj.k.f2830L0;
                                        Chip chip2 = (Chip) J4.b.a(view, i10);
                                        if (chip2 != null) {
                                            i10 = Bj.k.f2832M0;
                                            Slider slider = (Slider) J4.b.a(view, i10);
                                            if (slider != null) {
                                                i10 = Bj.k.f2888j1;
                                                Chip chip3 = (Chip) J4.b.a(view, i10);
                                                if (chip3 != null) {
                                                    return new b((ExpandableCardView) view, sVarK0, lottieAnimationView, linearLayout, checkBox, materialButton, chip, appCompatSeekBar, textView, chip2, slider, chip3);
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

    @Override // J4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f22074a;
    }

    private b(ExpandableCardView expandableCardView, s sVar, LottieAnimationView lottieAnimationView, LinearLayout linearLayout, CheckBox checkBox, MaterialButton materialButton, Chip chip, AppCompatSeekBar appCompatSeekBar, TextView textView, Chip chip2, Slider slider, Chip chip3) {
        this.f22074a = expandableCardView;
        this.f22075b = sVar;
        this.f22076c = lottieAnimationView;
        this.f22077d = linearLayout;
        this.f22078e = checkBox;
        this.f22079f = materialButton;
        this.f22080g = chip;
        this.f22081h = appCompatSeekBar;
        this.f22082i = textView;
        this.f22083j = chip2;
        this.f22084k = slider;
        this.f22085l = chip3;
    }
}
