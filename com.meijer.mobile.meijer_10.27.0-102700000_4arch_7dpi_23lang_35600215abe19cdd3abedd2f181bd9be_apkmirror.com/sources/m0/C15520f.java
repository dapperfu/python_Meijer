package m0;

import g0.C14158e;
import kotlin.InterfaceC15751k;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Lm0/f;", "Ln0/k;", "Lm0/I;", "state", "<init>", "(Lm0/I;)V", "", "b", "()I", "a", "Lm0/I;", "getState", "()Lm0/I;", "itemCount", "", "c", "()Z", "hasVisibleItems", "d", "firstPlacedIndex", "e", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15520f implements InterfaceC15751k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15512I state;

    @Override // kotlin.InterfaceC15751k
    public int a() {
        return this.state.u().getTotalItemsCount();
    }

    @Override // kotlin.InterfaceC15751k
    public int b() {
        if (this.state.u().h().isEmpty()) {
            return 0;
        }
        int iA = C14158e.a(this.state.u());
        int iA2 = C15533s.a(this.state.u());
        if (iA2 == 0) {
            return 1;
        }
        return RangesKt.f(iA / iA2, 1);
    }

    @Override // kotlin.InterfaceC15751k
    public boolean c() {
        return !this.state.u().h().isEmpty();
    }

    @Override // kotlin.InterfaceC15751k
    public int d() {
        return this.state.p();
    }

    @Override // kotlin.InterfaceC15751k
    public int e() {
        return ((InterfaceC15524j) CollectionsKt.D0(this.state.u().h())).getIndex();
    }

    public C15520f(C15512I c15512i) {
        this.state = c15512i;
    }
}
