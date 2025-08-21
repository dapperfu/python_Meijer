package l0;

import g0.C14288f;
import kotlin.InterfaceC15878k;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0018\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\t¨\u0006\u0019"}, d2 = {"Ll0/f;", "Ln0/k;", "Ll0/A;", "state", "", "beyondBoundsItemCount", "<init>", "(Ll0/A;I)V", "b", "()I", "a", "Ll0/A;", "getState", "()Ll0/A;", "I", "getBeyondBoundsItemCount", "itemCount", "", "c", "()Z", "hasVisibleItems", "d", "firstPlacedIndex", "e", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: l0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15436f implements InterfaceC15878k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15429A state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int beyondBoundsItemCount;

    @Override // kotlin.InterfaceC15878k
    public int a() {
        return this.state.x().getTotalItemsCount();
    }

    @Override // kotlin.InterfaceC15878k
    public int b() {
        if (this.state.x().h().isEmpty()) {
            return 0;
        }
        int iB = C14288f.b(this.state.x());
        int iA = o.a(this.state.x());
        if (iA == 0) {
            return 1;
        }
        return RangesKt.f(iB / iA, 1);
    }

    @Override // kotlin.InterfaceC15878k
    public boolean c() {
        return !this.state.x().h().isEmpty();
    }

    @Override // kotlin.InterfaceC15878k
    public int d() {
        return Math.max(0, this.state.s() - this.beyondBoundsItemCount);
    }

    public C15436f(C15429A c15429a, int i10) {
        this.state = c15429a;
        this.beyondBoundsItemCount = i10;
    }

    @Override // kotlin.InterfaceC15878k
    public int e() {
        return Math.min(a() - 1, ((InterfaceC15439i) CollectionsKt.D0(this.state.x().h())).getIndex() + this.beyondBoundsItemCount);
    }
}
