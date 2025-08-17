package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.M;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements f.b, k, AdapterView.OnItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f46147c = {R.attr.background, R.attr.divider};

    /* renamed from: a, reason: collision with root package name */
    private f f46148a;

    /* renamed from: b, reason: collision with root package name */
    private int f46149b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        M mV = M.v(context, attributeSet, f46147c, i10, 0);
        if (mV.s(0)) {
            setBackgroundDrawable(mV.g(0));
        }
        if (mV.s(1)) {
            setDivider(mV.g(1));
        }
        mV.x();
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(f fVar) {
        this.f46148a = fVar;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public boolean c(h hVar) {
        return this.f46148a.O(hVar, 0);
    }

    public int getWindowAnimations() {
        return this.f46149b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        c((h) getAdapter().getItem(i10));
    }
}
