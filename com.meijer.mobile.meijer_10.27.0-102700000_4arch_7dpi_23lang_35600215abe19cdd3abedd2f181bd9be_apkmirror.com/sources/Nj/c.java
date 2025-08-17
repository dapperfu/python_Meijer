package Nj;

import android.view.View;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;

/* loaded from: classes7.dex */
public final class c implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final ExpandableCardView f22086a;

    /* renamed from: b, reason: collision with root package name */
    public final ListCardView f22087b;

    public static c a(View view) {
        int i10 = Bj.k.f2874f;
        ListCardView listCardView = (ListCardView) J4.b.a(view, i10);
        if (listCardView != null) {
            return new c((ExpandableCardView) view, listCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // J4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableCardView getRoot() {
        return this.f22086a;
    }

    private c(ExpandableCardView expandableCardView, ListCardView listCardView) {
        this.f22086a = expandableCardView;
        this.f22087b = listCardView;
    }
}
