package Oj;

import android.view.View;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes8.dex */
public final class o implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f24381a;

    /* renamed from: b, reason: collision with root package name */
    public final SwitchMaterial f24382b;

    /* renamed from: c, reason: collision with root package name */
    public final SwitchMaterial f24383c;

    /* renamed from: d, reason: collision with root package name */
    public final SwitchMaterial f24384d;

    /* renamed from: e, reason: collision with root package name */
    public final SwitchMaterial f24385e;

    /* renamed from: f, reason: collision with root package name */
    public final SwitchMaterial f24386f;

    /* renamed from: g, reason: collision with root package name */
    public final SwitchMaterial f24387g;

    /* renamed from: h, reason: collision with root package name */
    public final SwitchMaterial f24388h;

    /* renamed from: i, reason: collision with root package name */
    public final SwitchMaterial f24389i;

    public static o a(View view) {
        int i10 = Cj.k.f4891T0;
        SwitchMaterial switchMaterial = (SwitchMaterial) K4.b.a(view, i10);
        if (switchMaterial != null) {
            i10 = Cj.k.f4893U0;
            SwitchMaterial switchMaterial2 = (SwitchMaterial) K4.b.a(view, i10);
            if (switchMaterial2 != null) {
                i10 = Cj.k.f4895V0;
                SwitchMaterial switchMaterial3 = (SwitchMaterial) K4.b.a(view, i10);
                if (switchMaterial3 != null) {
                    i10 = Cj.k.f4897W0;
                    SwitchMaterial switchMaterial4 = (SwitchMaterial) K4.b.a(view, i10);
                    if (switchMaterial4 != null) {
                        i10 = Cj.k.f4899X0;
                        SwitchMaterial switchMaterial5 = (SwitchMaterial) K4.b.a(view, i10);
                        if (switchMaterial5 != null) {
                            i10 = Cj.k.f4901Y0;
                            SwitchMaterial switchMaterial6 = (SwitchMaterial) K4.b.a(view, i10);
                            if (switchMaterial6 != null) {
                                i10 = Cj.k.f4903Z0;
                                SwitchMaterial switchMaterial7 = (SwitchMaterial) K4.b.a(view, i10);
                                if (switchMaterial7 != null) {
                                    i10 = Cj.k.f4906a1;
                                    SwitchMaterial switchMaterial8 = (SwitchMaterial) K4.b.a(view, i10);
                                    if (switchMaterial8 != null) {
                                        return new o((ExpandableCardView) view, switchMaterial, switchMaterial2, switchMaterial3, switchMaterial4, switchMaterial5, switchMaterial6, switchMaterial7, switchMaterial8);
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
        return this.f24381a;
    }

    private o(ExpandableCardView expandableCardView, SwitchMaterial switchMaterial, SwitchMaterial switchMaterial2, SwitchMaterial switchMaterial3, SwitchMaterial switchMaterial4, SwitchMaterial switchMaterial5, SwitchMaterial switchMaterial6, SwitchMaterial switchMaterial7, SwitchMaterial switchMaterial8) {
        this.f24381a = expandableCardView;
        this.f24382b = switchMaterial;
        this.f24383c = switchMaterial2;
        this.f24384d = switchMaterial3;
        this.f24385e = switchMaterial4;
        this.f24386f = switchMaterial5;
        this.f24387g = switchMaterial6;
        this.f24388h = switchMaterial7;
        this.f24389i = switchMaterial8;
    }
}
