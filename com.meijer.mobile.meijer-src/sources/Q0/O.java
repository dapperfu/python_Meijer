package Q0;

import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"", "contentHint", "LQ0/N;", "a", "(Ljava/lang/String;)LQ0/N;", "", "b", "(LQ0/N;)[Ljava/lang/String;", "contentHints", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class O {
    public static final N a(String str) {
        return new C4654k(SetsKt.d(str));
    }

    public static final String[] b(N n10) {
        Intrinsics.h(n10, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((C4654k) n10).a().toArray(new String[0]);
    }
}
