package Oj;

import android.view.View;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes8.dex */
public final class c implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f24331a;

    /* renamed from: b, reason: collision with root package name */
    public final ListCardView f24332b;

    public static c a(View view) {
        int i10 = Cj.k.f4919f;
        ListCardView listCardView = (ListCardView) K4.b.a(view, i10);
        if (listCardView != null) {
            return new c((ExpandableCardView) view, listCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f24331a;
    }

    private c(ExpandableCardView expandableCardView, ListCardView listCardView) {
        this.f24331a = expandableCardView;
        this.f24332b = listCardView;
    }
}
