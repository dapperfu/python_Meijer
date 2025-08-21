package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    f f46475a;

    /* renamed from: b, reason: collision with root package name */
    private int f46476b = -1;

    /* renamed from: c, reason: collision with root package name */
    private boolean f46477c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f46478d;

    /* renamed from: e, reason: collision with root package name */
    private final LayoutInflater f46479e;

    /* renamed from: f, reason: collision with root package name */
    private final int f46480f;

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f46479e.inflate(this.f46480f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f46475a.I() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f46477c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.b(getItem(i10), 0);
        return view;
    }

    void a() {
        h hVarX = this.f46475a.x();
        if (hVarX != null) {
            ArrayList<h> arrayListB = this.f46475a.B();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayListB.get(i10) == hVarX) {
                    this.f46476b = i10;
                    return;
                }
            }
        }
        this.f46476b = -1;
    }

    public f b() {
        return this.f46475a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h getItem(int i10) {
        ArrayList<h> arrayListB = this.f46478d ? this.f46475a.B() : this.f46475a.G();
        int i11 = this.f46476b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayListB.get(i10);
    }

    public void d(boolean z10) {
        this.f46477c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f46476b < 0 ? (this.f46478d ? this.f46475a.B() : this.f46475a.G()).size() : r0.size() - 1;
    }

    public e(f fVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f46478d = z10;
        this.f46479e = layoutInflater;
        this.f46475a = fVar;
        this.f46480f = i10;
        a();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
