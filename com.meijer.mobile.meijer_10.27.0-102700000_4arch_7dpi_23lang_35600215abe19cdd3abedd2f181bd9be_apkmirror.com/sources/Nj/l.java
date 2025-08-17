package Nj;

import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.design.widget.checkoutprogressstepperview.ProgressIndicatorView;

/* loaded from: classes7.dex */
public final class l implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final MaterialCardView f22127a;

    /* renamed from: b, reason: collision with root package name */
    public final ProgressIndicatorView f22128b;

    /* renamed from: c, reason: collision with root package name */
    public final ProgressIndicatorView f22129c;

    public static l a(View view) {
        int i10 = Bj.k.f2810B0;
        ProgressIndicatorView progressIndicatorView = (ProgressIndicatorView) J4.b.a(view, i10);
        if (progressIndicatorView != null) {
            i10 = Bj.k.f2812C0;
            ProgressIndicatorView progressIndicatorView2 = (ProgressIndicatorView) J4.b.a(view, i10);
            if (progressIndicatorView2 != null) {
                return new l((MaterialCardView) view, progressIndicatorView, progressIndicatorView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // J4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f22127a;
    }

    private l(MaterialCardView materialCardView, ProgressIndicatorView progressIndicatorView, ProgressIndicatorView progressIndicatorView2) {
        this.f22127a = materialCardView;
        this.f22128b = progressIndicatorView;
        this.f22129c = progressIndicatorView2;
    }
}
