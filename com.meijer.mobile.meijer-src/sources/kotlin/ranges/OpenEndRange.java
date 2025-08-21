package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;

@SinceKotlin
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/ranges/OpenEndRange;", "", "T", "", "value", "", "contains", "(Ljava/lang/Comparable;)Z", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@WasExperimental
/* loaded from: classes14.dex */
public interface OpenEndRange<T extends Comparable<? super T>> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    boolean contains(T value);
}
