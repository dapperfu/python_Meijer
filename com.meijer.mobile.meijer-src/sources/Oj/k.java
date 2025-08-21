package Oj;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class k implements K4.a {

    /* renamed from: a, reason: collision with root package name */
    private final RecyclerView f24370a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f24371b;

    public static k a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new k(recyclerView, recyclerView);
    }

    @Override // K4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f24370a;
    }

    private k(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f24370a = recyclerView;
        this.f24371b = recyclerView2;
    }
}
