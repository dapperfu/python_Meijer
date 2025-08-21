package Oj;

import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.design.widget.checkoutprogressstepperview.ProgressIndicatorView;

/* loaded from: classes8.dex */
public final class l implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final MaterialCardView f24372a;

    /* renamed from: b, reason: collision with root package name */
    public final ProgressIndicatorView f24373b;

    /* renamed from: c, reason: collision with root package name */
    public final ProgressIndicatorView f24374c;

    public static l a(View view) {
        int i10 = Cj.k.f4855B0;
        ProgressIndicatorView progressIndicatorView = (ProgressIndicatorView) K4.b.a(view, i10);
        if (progressIndicatorView != null) {
            i10 = Cj.k.f4857C0;
            ProgressIndicatorView progressIndicatorView2 = (ProgressIndicatorView) K4.b.a(view, i10);
            if (progressIndicatorView2 != null) {
                return new l((MaterialCardView) view, progressIndicatorView, progressIndicatorView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f24372a;
    }

    private l(MaterialCardView materialCardView, ProgressIndicatorView progressIndicatorView, ProgressIndicatorView progressIndicatorView2) {
        this.f24372a = materialCardView;
        this.f24373b = progressIndicatorView;
        this.f24374c = progressIndicatorView2;
    }
}
