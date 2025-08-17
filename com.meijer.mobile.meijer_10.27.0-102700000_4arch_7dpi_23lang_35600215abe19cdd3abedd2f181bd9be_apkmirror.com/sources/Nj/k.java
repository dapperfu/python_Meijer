package Nj;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public final class k implements J4.a {

    /* renamed from: a, reason: collision with root package name */
    private final RecyclerView f22125a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f22126b;

    public static k a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new k(recyclerView, recyclerView);
    }

    @Override // J4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f22125a;
    }

    private k(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f22125a = recyclerView;
        this.f22126b = recyclerView2;
    }
}
