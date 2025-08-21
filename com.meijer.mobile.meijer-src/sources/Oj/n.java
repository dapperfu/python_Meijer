package Oj;

import android.view.View;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;
import com.meijer.mobile.core.design.widget.stepperview.CollapsibleStepperView;
import com.meijer.mobile.core.design.widget.stepperview.StepperView;

/* loaded from: classes8.dex */
public final class n implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f24378a;

    /* renamed from: b, reason: collision with root package name */
    public final StepperView f24379b;

    /* renamed from: c, reason: collision with root package name */
    public final CollapsibleStepperView f24380c;

    public static n a(View view) {
        int i10 = Cj.k.f4883P0;
        StepperView stepperView = (StepperView) K4.b.a(view, i10);
        if (stepperView != null) {
            i10 = Cj.k.f4885Q0;
            CollapsibleStepperView collapsibleStepperView = (CollapsibleStepperView) K4.b.a(view, i10);
            if (collapsibleStepperView != null) {
                return new n((ExpandableCardView) view, stepperView, collapsibleStepperView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f24378a;
    }

    private n(ExpandableCardView expandableCardView, StepperView stepperView, CollapsibleStepperView collapsibleStepperView) {
        this.f24378a = expandableCardView;
        this.f24379b = stepperView;
        this.f24380c = collapsibleStepperView;
    }
}
