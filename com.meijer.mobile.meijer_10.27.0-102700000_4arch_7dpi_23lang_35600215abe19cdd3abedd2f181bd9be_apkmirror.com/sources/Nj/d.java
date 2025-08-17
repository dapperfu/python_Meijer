package Nj;

import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes7.dex */
public final class d implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f22088a;

    /* renamed from: b, reason: collision with root package name */
    public final Flow f22089b;

    /* renamed from: c, reason: collision with root package name */
    public final SwitchMaterial f22090c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialButton f22091d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialButton f22092e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialButton f22093f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialButton f22094g;

    public static d a(View view) {
        int i10 = Bj.k.f2886j;
        Flow flow = (Flow) J4.b.a(view, i10);
        if (flow != null) {
            i10 = Bj.k.f2821H;
            SwitchMaterial switchMaterial = (SwitchMaterial) J4.b.a(view, i10);
            if (switchMaterial != null) {
                i10 = Bj.k.f2923x0;
                MaterialButton materialButton = (MaterialButton) J4.b.a(view, i10);
                if (materialButton != null) {
                    i10 = Bj.k.f2808A0;
                    MaterialButton materialButton2 = (MaterialButton) J4.b.a(view, i10);
                    if (materialButton2 != null) {
                        i10 = Bj.k.f2828K0;
                        MaterialButton materialButton3 = (MaterialButton) J4.b.a(view, i10);
                        if (materialButton3 != null) {
                            i10 = Bj.k.f2867c1;
                            MaterialButton materialButton4 = (MaterialButton) J4.b.a(view, i10);
                            if (materialButton4 != null) {
                                return new d((ExpandableCardView) view, flow, switchMaterial, materialButton, materialButton2, materialButton3, materialButton4);
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
        return this.f22088a;
    }

    private d(ExpandableCardView expandableCardView, Flow flow, SwitchMaterial switchMaterial, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4) {
        this.f22088a = expandableCardView;
        this.f22089b = flow;
        this.f22090c = switchMaterial;
        this.f22091d = materialButton;
        this.f22092e = materialButton2;
        this.f22093f = materialButton3;
        this.f22094g = materialButton4;
    }
}
