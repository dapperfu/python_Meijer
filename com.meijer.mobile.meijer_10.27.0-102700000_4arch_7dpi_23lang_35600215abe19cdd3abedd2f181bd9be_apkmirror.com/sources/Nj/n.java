package Nj;

import android.view.View;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;
import com.meijer.mobile.core.design.widget.stepperview.CollapsibleStepperView;
import com.meijer.mobile.core.design.widget.stepperview.StepperView;

/* loaded from: classes7.dex */
public final class n implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f22133a;

    /* renamed from: b, reason: collision with root package name */
    public final StepperView f22134b;

    /* renamed from: c, reason: collision with root package name */
    public final CollapsibleStepperView f22135c;

    public static n a(View view) {
        int i10 = Bj.k.f2838P0;
        StepperView stepperView = (StepperView) J4.b.a(view, i10);
        if (stepperView != null) {
            i10 = Bj.k.f2840Q0;
            CollapsibleStepperView collapsibleStepperView = (CollapsibleStepperView) J4.b.a(view, i10);
            if (collapsibleStepperView != null) {
                return new n((ExpandableCardView) view, stepperView, collapsibleStepperView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // J4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f22133a;
    }

    private n(ExpandableCardView expandableCardView, StepperView stepperView, CollapsibleStepperView collapsibleStepperView) {
        this.f22133a = expandableCardView;
        this.f22134b = stepperView;
        this.f22135c = collapsibleStepperView;
    }
}
