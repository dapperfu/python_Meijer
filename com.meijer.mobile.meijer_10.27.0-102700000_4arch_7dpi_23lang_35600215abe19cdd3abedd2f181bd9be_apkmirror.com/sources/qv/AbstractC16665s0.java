package qv;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.AbstractC16665s0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u000b2\u00020\u00012\u00020\u00022\u00060\u0003j\u0002`\u0004:\u0001\fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lqv/s0;", "Lqv/K;", "Ljava/io/Closeable;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "Ljava/util/concurrent/Executor;", "W0", "()Ljava/util/concurrent/Executor;", "executor", "c", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.s0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC16665s0 extends AbstractC16618K implements Closeable, AutoCloseable {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqv/s0$a;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lqv/K;", "Lqv/s0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ExperimentalStdlibApi
    /* renamed from: qv.s0$a, reason: from kotlin metadata */
    public static final class Companion extends AbstractCoroutineContextKey<AbstractC16618K, AbstractC16665s0> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(AbstractC16618K.INSTANCE, new Function1() { // from class: qv.r0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC16665s0.Companion.d((CoroutineContext.Element) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC16665s0 d(CoroutineContext.Element element) {
            if (element instanceof AbstractC16665s0) {
                return (AbstractC16665s0) element;
            }
            return null;
        }
    }

    /* renamed from: W0 */
    public abstract Executor getExecutor();
}
