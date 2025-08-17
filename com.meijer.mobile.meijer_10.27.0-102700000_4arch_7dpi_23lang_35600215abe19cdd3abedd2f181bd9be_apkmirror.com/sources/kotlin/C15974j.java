package kotlin;

import kotlin.InterfaceC13808g;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lo0/j;", "Lf0/g;", "Lo0/C;", "pagerState", "defaultBringIntoViewSpec", "<init>", "(Lo0/C;Lf0/g;)V", "", "proposedOffsetMove", "b", "(F)F", "offset", "size", "containerSize", "a", "(FFF)F", "Lo0/C;", "getPagerState", "()Lo0/C;", "c", "Lf0/g;", "getDefaultBringIntoViewSpec", "()Lf0/g;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15974j implements InterfaceC13808g {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15962C pagerState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13808g defaultBringIntoViewSpec;

    private final float b(float proposedOffsetMove) {
        float firstVisiblePageOffset = this.pagerState.getFirstVisiblePageOffset() * (-1);
        while (proposedOffsetMove > 0.0f && firstVisiblePageOffset < proposedOffsetMove) {
            firstVisiblePageOffset += this.pagerState.J();
        }
        while (proposedOffsetMove < 0.0f && firstVisiblePageOffset > proposedOffsetMove) {
            firstVisiblePageOffset -= this.pagerState.J();
        }
        return firstVisiblePageOffset;
    }

    @Override // kotlin.InterfaceC13808g
    public float a(float offset, float size, float containerSize) {
        float fA = this.defaultBringIntoViewSpec.a(offset, size, containerSize);
        boolean z10 = false;
        if (offset <= 0.0f ? offset + size <= 0.0f : offset + size > containerSize) {
            z10 = true;
        }
        if (Math.abs(fA) != 0.0f && z10) {
            return b(fA);
        }
        if (Math.abs(this.pagerState.getFirstVisiblePageOffset()) < 1.0E-6d) {
            return 0.0f;
        }
        float firstVisiblePageOffset = this.pagerState.getFirstVisiblePageOffset() * (-1.0f);
        if (this.pagerState.B()) {
            firstVisiblePageOffset += this.pagerState.J();
        }
        return RangesKt.n(firstVisiblePageOffset, -containerSize, containerSize);
    }

    public C15974j(AbstractC15962C abstractC15962C, InterfaceC13808g interfaceC13808g) {
        this.pagerState = abstractC15962C;
        this.defaultBringIntoViewSpec = interfaceC13808g;
    }
}
