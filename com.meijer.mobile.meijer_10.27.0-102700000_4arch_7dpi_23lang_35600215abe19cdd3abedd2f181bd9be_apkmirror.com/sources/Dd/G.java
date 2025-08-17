package Dd;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes6.dex */
final class G extends E implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ H f5217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    G(H h10) {
        super(h10);
        this.f5217d = h10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h10, int i10) {
        super(h10, ((List) h10.f5209b).listIterator(i10));
        this.f5217d = h10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f5217d.isEmpty();
        a();
        ((ListIterator) this.f5189a).add(obj);
        this.f5217d.f5228f.f5252d++;
        if (zIsEmpty) {
            this.f5217d.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f5189a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f5189a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f5189a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f5189a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f5189a).set(obj);
    }
}
