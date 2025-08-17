package Nj;

import android.view.View;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes7.dex */
public final class i implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final NestedScrollView f22119a;

    /* renamed from: b, reason: collision with root package name */
    public final c f22120b;

    /* renamed from: c, reason: collision with root package name */
    public final b f22121c;

    /* renamed from: d, reason: collision with root package name */
    public final l f22122d;

    public static i a(View view) {
        int i10 = Bj.k.f2877g;
        View viewA = J4.b.a(view, i10);
        if (viewA != null) {
            c cVarA = c.a(viewA);
            int i11 = Bj.k.f2901o;
            View viewA2 = J4.b.a(view, i11);
            if (viewA2 != null) {
                b bVarA = b.a(viewA2);
                int i12 = Bj.k.f2836O0;
                View viewA3 = J4.b.a(view, i12);
                if (viewA3 != null) {
                    return new i((NestedScrollView) view, cVarA, bVarA, l.a(viewA3));
                }
                i10 = i12;
            } else {
                i10 = i11;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @Override // J4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f22119a;
    }

    private i(NestedScrollView nestedScrollView, c cVar, b bVar, l lVar) {
        this.f22119a = nestedScrollView;
        this.f22120b = cVar;
        this.f22121c = bVar;
        this.f22122d = lVar;
    }
}
