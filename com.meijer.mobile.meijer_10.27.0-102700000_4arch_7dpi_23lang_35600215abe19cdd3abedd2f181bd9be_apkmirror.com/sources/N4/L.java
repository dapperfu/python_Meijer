package N4;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"T", "LN4/K;", "", "label", "Lkotlin/Function0;", "block", "a", "(LN4/K;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class L {
    public static final <T> T a(K k10, String label, Function0<? extends T> block) {
        Intrinsics.j(k10, "<this>");
        Intrinsics.j(label, "label");
        Intrinsics.j(block, "block");
        boolean zIsEnabled = k10.isEnabled();
        if (zIsEnabled) {
            try {
                k10.a(label);
            } catch (Throwable th2) {
                InlineMarker.b(1);
                if (zIsEnabled) {
                    k10.d();
                }
                InlineMarker.a(1);
                throw th2;
            }
        }
        T tInvoke = block.invoke();
        InlineMarker.b(1);
        if (zIsEnabled) {
            k10.d();
        }
        InlineMarker.a(1);
        return tInvoke;
    }
}
