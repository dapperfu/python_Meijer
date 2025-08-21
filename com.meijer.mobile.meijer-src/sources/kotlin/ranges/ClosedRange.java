package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lkotlin/ranges/ClosedRange;", "", "T", "", "", "isEmpty", "()Z", "getStart", "()Ljava/lang/Comparable;", "start", "getEndInclusive", "endInclusive", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ClosedRange<T extends Comparable<? super T>> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends Comparable<? super T>> boolean a(ClosedRange<T> closedRange, T value) {
            Intrinsics.j(value, "value");
            return value.compareTo(closedRange.getStart()) >= 0 && value.compareTo(closedRange.getEndInclusive()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(ClosedRange<T> closedRange) {
            if (closedRange.getStart().compareTo(closedRange.getEndInclusive()) > 0) {
                return true;
            }
            return false;
        }
    }

    T getEndInclusive();

    T getStart();

    boolean isEmpty();
}
