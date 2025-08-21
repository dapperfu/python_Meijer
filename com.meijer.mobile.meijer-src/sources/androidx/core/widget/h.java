package androidx.core.widget;

import android.widget.ListView;

/* loaded from: classes.dex */
public class h extends a {

    /* renamed from: s, reason: collision with root package name */
    private final ListView f54305s;

    @Override // androidx.core.widget.a
    public boolean a(int i10) {
        return false;
    }

    @Override // androidx.core.widget.a
    public boolean b(int i10) {
        ListView listView = this.f54305s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i10 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    public void j(int i10, int i11) {
        this.f54305s.scrollListBy(i11);
    }

    public h(ListView listView) {
        super(listView);
        this.f54305s = listView;
    }
}
