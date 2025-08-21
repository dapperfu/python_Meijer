package yk;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "Lkotlin/Function0;", "defaultValue", "b", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)I", "", "c", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)J", "", "a", "(Ljava/lang/Double;Lkotlin/jvm/functions/Function0;)D", "util_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yk.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C18328d {
    public static final double a(Double d10, Function0<Double> defaultValue) {
        Intrinsics.j(defaultValue, "defaultValue");
        return d10 != null ? d10.doubleValue() : defaultValue.invoke().doubleValue();
    }

    public static final int b(Integer num, Function0<Integer> defaultValue) {
        Intrinsics.j(defaultValue, "defaultValue");
        return num != null ? num.intValue() : defaultValue.invoke().intValue();
    }

    public static final long c(Long l10, Function0<Long> defaultValue) {
        Intrinsics.j(defaultValue, "defaultValue");
        return l10 != null ? l10.longValue() : defaultValue.invoke().longValue();
    }
}
