package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lo0/B;", "Lo0/A;", "", "pagesLimit", "<init>", "(I)V", "startPage", "suggestedTargetPage", "", "velocity", "pageSize", "pageSpacing", "a", "(IIFII)I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15961B implements InterfaceC15960A {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int pagesLimit;

    @Override // kotlin.InterfaceC15960A
    public int a(int startPage, int suggestedTargetPage, float velocity, int pageSize, int pageSpacing) {
        long j10 = startPage;
        return RangesKt.o(suggestedTargetPage, (int) RangesKt.g(j10 - this.pagesLimit, 0L), (int) RangesKt.l(j10 + this.pagesLimit, 2147483647L));
    }

    public boolean equals(Object other) {
        return (other instanceof C15961B) && this.pagesLimit == ((C15961B) other).pagesLimit;
    }

    public int hashCode() {
        return Integer.hashCode(this.pagesLimit);
    }

    public C15961B(int i10) {
        this.pagesLimit = i10;
    }
}
