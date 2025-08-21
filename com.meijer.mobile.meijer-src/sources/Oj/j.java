package Oj;

import android.view.View;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes8.dex */
public final class j implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final NestedScrollView f24368a;

    /* renamed from: b, reason: collision with root package name */
    public final p f24369b;

    public static j a(View view) {
        int i10 = Cj.k.f4927h1;
        View viewA = K4.b.a(view, i10);
        if (viewA == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        return new j((NestedScrollView) view, p.a(viewA));
    }

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f24368a;
    }

    private j(NestedScrollView nestedScrollView, p pVar) {
        this.f24368a = nestedScrollView;
        this.f24369b = pVar;
    }
}
