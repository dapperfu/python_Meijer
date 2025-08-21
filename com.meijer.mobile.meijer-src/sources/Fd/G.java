package Fd;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes6.dex */
final class G extends E implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ H f9250d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(H h10) {
        super(h10);
        this.f9250d = h10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h10, int i10) {
        super(h10, ((List) h10.f9242b).listIterator(i10));
        this.f9250d = h10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f9250d.isEmpty();
        a();
        ((ListIterator) this.f9222a).add(obj);
        this.f9250d.f9261f.f9285d++;
        if (zIsEmpty) {
            this.f9250d.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f9222a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f9222a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f9222a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f9222a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f9222a).set(obj);
    }
}
