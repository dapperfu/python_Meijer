package yv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import mv.InterfaceC15780L;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u00060\u0010j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR,\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lyv/a;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lmv/L;", "<init>", "()V", "", "exception", "", "K0", "(Ljava/lang/Throwable;)Z", "J0", "Lkotlin/coroutines/CoroutineContext;", "context", "", "m0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/SynchronizedObject;", "c", "Ljava/lang/Object;", "lock", "d", "Z", "enabled", "", "e", "Ljava/util/List;", "unprocessedExceptions", "", "Lkotlin/Function1;", "f", "Ljava/util/Map;", "callbacks", "kotlinx-coroutines-test"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yv.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C18375a extends AbstractCoroutineContextElement implements InterfaceC15780L {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static boolean enabled;

    /* renamed from: b, reason: collision with root package name */
    public static final C18375a f172147b = new C18375a();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Object lock = new Object();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final List<Throwable> unprocessedExceptions = new ArrayList();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final Map<Object, Function1<Throwable, Unit>> callbacks = new LinkedHashMap();

    private C18375a() {
        super(InterfaceC15780L.INSTANCE);
    }

    private final boolean K0(Throwable exception) {
        Iterator<Function1<Throwable, Unit>> it = callbacks.values().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            it.next().invoke(exception);
            z10 = true;
        }
        return z10;
    }

    public final boolean J0(Throwable exception) {
        synchronized (lock) {
            if (!enabled) {
                return false;
            }
            if (f172147b.K0(exception)) {
                return true;
            }
            unprocessedExceptions.add(exception);
            return false;
        }
    }

    public boolean equals(Object other) {
        return (other instanceof C18375a) || (other instanceof C18376b);
    }

    @Override // mv.InterfaceC15780L
    public void m0(CoroutineContext context, Throwable exception) {
        if (!J0(exception)) {
        } else {
            throw ExceptionSuccessfullyProcessed.f148459a;
        }
    }
}
