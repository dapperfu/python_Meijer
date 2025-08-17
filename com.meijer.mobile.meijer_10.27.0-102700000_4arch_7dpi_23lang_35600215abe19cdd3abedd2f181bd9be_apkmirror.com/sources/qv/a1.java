package qv;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import vv.C17631E;
import vv.C17641O;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0011"}, d2 = {"Lqv/a1;", "", "<init>", "()V", "Lqv/l0;", "a", "()Lqv/l0;", "", "c", "eventLoop", "d", "(Lqv/l0;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f157628a = new a1();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final ThreadLocal<AbstractC16651l0> ref = C17641O.a(new C17631E("ThreadLocalEventLoop"));

    public final AbstractC16651l0 a() {
        return ref.get();
    }

    public final AbstractC16651l0 b() {
        ThreadLocal<AbstractC16651l0> threadLocal = ref;
        AbstractC16651l0 abstractC16651l0 = threadLocal.get();
        if (abstractC16651l0 != null) {
            return abstractC16651l0;
        }
        AbstractC16651l0 abstractC16651l0A = C16657o0.a();
        threadLocal.set(abstractC16651l0A);
        return abstractC16651l0A;
    }

    public final void c() {
        ref.set(null);
    }

    public final void d(AbstractC16651l0 eventLoop) {
        ref.set(eventLoop);
    }

    private a1() {
    }
}
