package mv;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import rv.ThreadLocal;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Ljava/lang/ThreadLocal;", "value", "Lmv/Y0;", "a", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lmv/Y0;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class Z0 {
    public static final <T> Y0<T> a(ThreadLocal<T> threadLocal, T t10) {
        return new ThreadLocal(t10, threadLocal);
    }
}
