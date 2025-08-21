package Oj;

import android.view.View;
import android.widget.RadioGroup;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes8.dex */
public final class m implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f24375a;

    /* renamed from: b, reason: collision with root package name */
    public final RadioGroup f24376b;

    /* renamed from: c, reason: collision with root package name */
    public final RadioGroup f24377c;

    public static m a(View view) {
        int i10 = Cj.k.f4880O;
        RadioGroup radioGroup = (RadioGroup) K4.b.a(view, i10);
        if (radioGroup != null) {
            i10 = Cj.k.f4882P;
            RadioGroup radioGroup2 = (RadioGroup) K4.b.a(view, i10);
            if (radioGroup2 != null) {
                return new m((ExpandableCardView) view, radioGroup, radioGroup2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f24375a;
    }

    private m(ExpandableCardView expandableCardView, RadioGroup radioGroup, RadioGroup radioGroup2) {
        this.f24375a = expandableCardView;
        this.f24376b = radioGroup;
        this.f24377c = radioGroup2;
    }
}
