package Nj;

import android.view.View;
import android.widget.GridLayout;
import androidx.core.widget.NestedScrollView;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes7.dex */
public final class h implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final NestedScrollView f22116a;

    /* renamed from: b, reason: collision with root package name */
    public final ExpandableCardView f22117b;

    /* renamed from: c, reason: collision with root package name */
    public final GridLayout f22118c;

    public static h a(View view) {
        int i10 = Bj.k.f2843S;
        ExpandableCardView expandableCardView = (ExpandableCardView) J4.b.a(view, i10);
        if (expandableCardView != null) {
            i10 = Bj.k.f2845T;
            GridLayout gridLayout = (GridLayout) J4.b.a(view, i10);
            if (gridLayout != null) {
                return new h((NestedScrollView) view, expandableCardView, gridLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // J4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f22116a;
    }

    private h(NestedScrollView nestedScrollView, ExpandableCardView expandableCardView, GridLayout gridLayout) {
        this.f22116a = nestedScrollView;
        this.f22117b = expandableCardView;
        this.f22118c = gridLayout;
    }
}
