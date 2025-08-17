package kotlin.ranges;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "that", "Lkotlin/ranges/OpenEndRange;", "c", "(DD)Lkotlin/ranges/OpenEndRange;", "", "Lkotlin/ranges/ClosedFloatingPointRange;", "b", "(FF)Lkotlin/ranges/ClosedFloatingPointRange;", "", "isPositive", "", "step", "", "a", "(ZLjava/lang/Number;)V", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
/* loaded from: classes6.dex */
public class c {
    public static final void a(boolean z10, Number step) {
        Intrinsics.j(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    @SinceKotlin
    public static ClosedFloatingPointRange<Float> b(float f10, float f11) {
        return new a(f10, f11);
    }

    @SinceKotlin
    @WasExperimental
    public static OpenEndRange<Double> c(double d10, double d11) {
        return new b(d10, d11);
    }
}
