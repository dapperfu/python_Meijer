package Nj;

import android.view.View;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes7.dex */
public final class j implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final NestedScrollView f22123a;

    /* renamed from: b, reason: collision with root package name */
    public final p f22124b;

    public static j a(View view) {
        int i10 = Bj.k.f2882h1;
        View viewA = J4.b.a(view, i10);
        if (viewA == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        return new j((NestedScrollView) view, p.a(viewA));
    }

    @Override // J4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f22123a;
    }

    private j(NestedScrollView nestedScrollView, p pVar) {
        this.f22123a = nestedScrollView;
        this.f22124b = pVar;
    }
}
