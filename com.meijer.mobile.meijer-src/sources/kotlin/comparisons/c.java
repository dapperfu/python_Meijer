package kotlin.comparisons;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u00020\u0002\"\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\t\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u00020\u0002\"\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\u0005¨\u0006\f"}, d2 = {"", "a", "", "other", "g", "(F[F)F", "", "T", "b", "i", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "h", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes8.dex */
public class c extends b {
    @SinceKotlin
    public static float g(float f10, float... other) {
        Intrinsics.j(other, "other");
        for (float f11 : other) {
            f10 = Math.max(f10, f11);
        }
        return f10;
    }

    @SinceKotlin
    public static float h(float f10, float... other) {
        Intrinsics.j(other, "other");
        for (float f11 : other) {
            f10 = Math.min(f10, f11);
        }
        return f10;
    }

    @SinceKotlin
    public static <T extends Comparable<? super T>> T i(T a10, T b10) {
        Intrinsics.j(a10, "a");
        Intrinsics.j(b10, "b");
        return a10.compareTo(b10) <= 0 ? a10 : b10;
    }
}
