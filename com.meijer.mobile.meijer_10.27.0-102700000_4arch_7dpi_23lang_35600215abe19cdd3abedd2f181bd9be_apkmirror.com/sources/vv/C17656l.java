package vv;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "a", "(I)V", "Lqv/K;", "", "name", "b", "(Lqv/K;Ljava/lang/String;)Lqv/K;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vv.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17656l {
    public static final void a(int i10) {
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }

    public static final AbstractC16618K b(AbstractC16618K abstractC16618K, String str) {
        return str != null ? new C17667w(abstractC16618K, str) : abstractC16618K;
    }
}
