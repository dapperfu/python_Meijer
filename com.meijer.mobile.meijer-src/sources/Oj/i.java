package Oj;

import android.view.View;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes8.dex */
public final class i implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final NestedScrollView f24364a;

    /* renamed from: b, reason: collision with root package name */
    public final c f24365b;

    /* renamed from: c, reason: collision with root package name */
    public final b f24366c;

    /* renamed from: d, reason: collision with root package name */
    public final l f24367d;

    public static i a(View view) {
        int i10 = Cj.k.f4922g;
        View viewA = K4.b.a(view, i10);
        if (viewA != null) {
            c cVarA = c.a(viewA);
            int i11 = Cj.k.f4946o;
            View viewA2 = K4.b.a(view, i11);
            if (viewA2 != null) {
                b bVarA = b.a(viewA2);
                int i12 = Cj.k.f4881O0;
                View viewA3 = K4.b.a(view, i12);
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

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f24364a;
    }

    private i(NestedScrollView nestedScrollView, c cVar, b bVar, l lVar) {
        this.f24364a = nestedScrollView;
        this.f24365b = cVar;
        this.f24366c = bVar;
        this.f24367d = lVar;
    }
}
