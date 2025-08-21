package kotlin;

import kotlin.InterfaceC15878k;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lo0/i;", "Ln0/k;", "Lo0/C;", "state", "", "beyondViewportPageCount", "<init>", "(Lo0/C;I)V", "b", "()I", "a", "Lo0/C;", "I", "itemCount", "", "c", "()Z", "hasVisibleItems", "d", "firstPlacedIndex", "e", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16048i implements InterfaceC15878k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16037C state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int beyondViewportPageCount;

    @Override // kotlin.InterfaceC15878k
    public int a() {
        return this.state.H();
    }

    @Override // kotlin.InterfaceC15878k
    public int b() {
        if (this.state.C().h().size() == 0) {
            return 0;
        }
        int iA = C16054o.a(this.state.C());
        int pageSize = this.state.C().getPageSize() + this.state.C().getPageSpacing();
        if (pageSize == 0) {
            return 1;
        }
        return RangesKt.f(iA / pageSize, 1);
    }

    @Override // kotlin.InterfaceC15878k
    public boolean c() {
        return !this.state.C().h().isEmpty();
    }

    @Override // kotlin.InterfaceC15878k
    public int d() {
        return Math.max(0, this.state.getFirstVisiblePage() - this.beyondViewportPageCount);
    }

    public C16048i(AbstractC16037C abstractC16037C, int i10) {
        this.state = abstractC16037C;
        this.beyondViewportPageCount = i10;
    }

    @Override // kotlin.InterfaceC15878k
    public int e() {
        return Math.min(a() - 1, ((InterfaceC16045f) CollectionsKt.D0(this.state.C().h())).getIndex() + this.beyondViewportPageCount);
    }
}
