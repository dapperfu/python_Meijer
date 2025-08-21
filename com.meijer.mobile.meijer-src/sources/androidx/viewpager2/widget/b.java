package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
final class b extends ViewPager2.i {

    /* renamed from: a, reason: collision with root package name */
    private final List<ViewPager2.i> f59250a;

    private void c(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    void a(ViewPager2.i iVar) {
        this.f59250a.add(iVar);
    }

    void b(ViewPager2.i iVar) {
        this.f59250a.remove(iVar);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageScrollStateChanged(int i10) {
        try {
            Iterator<ViewPager2.i> it = this.f59250a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i10);
            }
        } catch (ConcurrentModificationException e10) {
            c(e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageScrolled(int i10, float f10, int i11) {
        try {
            Iterator<ViewPager2.i> it = this.f59250a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            c(e10);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageSelected(int i10) {
        try {
            Iterator<ViewPager2.i> it = this.f59250a.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i10);
            }
        } catch (ConcurrentModificationException e10) {
            c(e10);
        }
    }

    b(int i10) {
        this.f59250a = new ArrayList(i10);
    }
}
