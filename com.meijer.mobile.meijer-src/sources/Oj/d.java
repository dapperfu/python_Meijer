package Oj;

import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes8.dex */
public final class d implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f24333a;

    /* renamed from: b, reason: collision with root package name */
    public final Flow f24334b;

    /* renamed from: c, reason: collision with root package name */
    public final SwitchMaterial f24335c;

    /* renamed from: d, reason: collision with root package name */
    public final MaterialButton f24336d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialButton f24337e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialButton f24338f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialButton f24339g;

    public static d a(View view) {
        int i10 = Cj.k.f4931j;
        Flow flow = (Flow) K4.b.a(view, i10);
        if (flow != null) {
            i10 = Cj.k.f4866H;
            SwitchMaterial switchMaterial = (SwitchMaterial) K4.b.a(view, i10);
            if (switchMaterial != null) {
                i10 = Cj.k.f4968x0;
                MaterialButton materialButton = (MaterialButton) K4.b.a(view, i10);
                if (materialButton != null) {
                    i10 = Cj.k.f4853A0;
                    MaterialButton materialButton2 = (MaterialButton) K4.b.a(view, i10);
                    if (materialButton2 != null) {
                        i10 = Cj.k.f4873K0;
                        MaterialButton materialButton3 = (MaterialButton) K4.b.a(view, i10);
                        if (materialButton3 != null) {
                            i10 = Cj.k.f4912c1;
                            MaterialButton materialButton4 = (MaterialButton) K4.b.a(view, i10);
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

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f24333a;
    }

    private d(ExpandableCardView expandableCardView, Flow flow, SwitchMaterial switchMaterial, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4) {
        this.f24333a = expandableCardView;
        this.f24334b = flow;
        this.f24335c = switchMaterial;
        this.f24336d = materialButton;
        this.f24337e = materialButton2;
        this.f24338f = materialButton3;
        this.f24339g = materialButton4;
    }
}
