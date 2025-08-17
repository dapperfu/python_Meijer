package Nj;

import android.view.View;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes7.dex */
public final class o implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f22136a;

    /* renamed from: b, reason: collision with root package name */
    public final SwitchMaterial f22137b;

    /* renamed from: c, reason: collision with root package name */
    public final SwitchMaterial f22138c;

    /* renamed from: d, reason: collision with root package name */
    public final SwitchMaterial f22139d;

    /* renamed from: e, reason: collision with root package name */
    public final SwitchMaterial f22140e;

    /* renamed from: f, reason: collision with root package name */
    public final SwitchMaterial f22141f;

    /* renamed from: g, reason: collision with root package name */
    public final SwitchMaterial f22142g;

    /* renamed from: h, reason: collision with root package name */
    public final SwitchMaterial f22143h;

    /* renamed from: i, reason: collision with root package name */
    public final SwitchMaterial f22144i;

    public static o a(View view) {
        int i10 = Bj.k.f2846T0;
        SwitchMaterial switchMaterial = (SwitchMaterial) J4.b.a(view, i10);
        if (switchMaterial != null) {
            i10 = Bj.k.f2848U0;
            SwitchMaterial switchMaterial2 = (SwitchMaterial) J4.b.a(view, i10);
            if (switchMaterial2 != null) {
                i10 = Bj.k.f2850V0;
                SwitchMaterial switchMaterial3 = (SwitchMaterial) J4.b.a(view, i10);
                if (switchMaterial3 != null) {
                    i10 = Bj.k.f2852W0;
                    SwitchMaterial switchMaterial4 = (SwitchMaterial) J4.b.a(view, i10);
                    if (switchMaterial4 != null) {
                        i10 = Bj.k.f2854X0;
                        SwitchMaterial switchMaterial5 = (SwitchMaterial) J4.b.a(view, i10);
                        if (switchMaterial5 != null) {
                            i10 = Bj.k.f2856Y0;
                            SwitchMaterial switchMaterial6 = (SwitchMaterial) J4.b.a(view, i10);
                            if (switchMaterial6 != null) {
                                i10 = Bj.k.f2858Z0;
                                SwitchMaterial switchMaterial7 = (SwitchMaterial) J4.b.a(view, i10);
                                if (switchMaterial7 != null) {
                                    i10 = Bj.k.f2861a1;
                                    SwitchMaterial switchMaterial8 = (SwitchMaterial) J4.b.a(view, i10);
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

    @Override // J4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f22136a;
    }

    private o(ExpandableCardView expandableCardView, SwitchMaterial switchMaterial, SwitchMaterial switchMaterial2, SwitchMaterial switchMaterial3, SwitchMaterial switchMaterial4, SwitchMaterial switchMaterial5, SwitchMaterial switchMaterial6, SwitchMaterial switchMaterial7, SwitchMaterial switchMaterial8) {
        this.f22136a = expandableCardView;
        this.f22137b = switchMaterial;
        this.f22138c = switchMaterial2;
        this.f22139d = switchMaterial3;
        this.f22140e = switchMaterial4;
        this.f22141f = switchMaterial5;
        this.f22142g = switchMaterial6;
        this.f22143h = switchMaterial7;
        this.f22144i = switchMaterial8;
    }
}
