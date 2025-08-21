package androidx.viewpager2.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class b extends RecyclerView.F {
    static b b(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new b(frameLayout);
    }

    FrameLayout c() {
        return (FrameLayout) this.itemView;
    }

    private b(FrameLayout frameLayout) {
        super(frameLayout);
    }
}
