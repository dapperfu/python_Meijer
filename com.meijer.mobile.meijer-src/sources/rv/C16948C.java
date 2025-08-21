package rv;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import rv.AbstractC16947B;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0003¨\u0006\u0010"}, d2 = {"Lrv/C;", "Lrv/B;", "S", "", "value", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "c", "(Ljava/lang/Object;)Z", "isClosed", "b", "(Ljava/lang/Object;)Lrv/B;", "getSegment$annotations", "()V", "segment", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* renamed from: rv.C, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16948C<S extends AbstractC16947B<S>> {
    public static <S extends AbstractC16947B<S>> Object a(Object obj) {
        return obj;
    }

    public static final S b(Object obj) {
        if (obj != C16965b.f159638a) {
            Intrinsics.h(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final boolean c(Object obj) {
        if (obj == C16965b.f159638a) {
            return true;
        }
        return false;
    }
}
