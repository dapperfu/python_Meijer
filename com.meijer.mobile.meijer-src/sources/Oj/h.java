package Oj;

import android.view.View;
import android.widget.GridLayout;
import androidx.core.widget.NestedScrollView;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes8.dex */
public final class h implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final NestedScrollView f24361a;

    /* renamed from: b, reason: collision with root package name */
    public final ExpandableCardView f24362b;

    /* renamed from: c, reason: collision with root package name */
    public final GridLayout f24363c;

    public static h a(View view) {
        int i10 = Cj.k.f4888S;
        ExpandableCardView expandableCardView = (ExpandableCardView) K4.b.a(view, i10);
        if (expandableCardView != null) {
            i10 = Cj.k.f4890T;
            GridLayout gridLayout = (GridLayout) K4.b.a(view, i10);
            if (gridLayout != null) {
                return new h((NestedScrollView) view, expandableCardView, gridLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f24361a;
    }

    private h(NestedScrollView nestedScrollView, ExpandableCardView expandableCardView, GridLayout gridLayout) {
        this.f24361a = nestedScrollView;
        this.f24362b = expandableCardView;
        this.f24363c = gridLayout;
    }
}
