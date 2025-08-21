package y6;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mv.AbstractC15779K;
import mv.InterfaceC15783O;
import z6.w;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Ly6/c;", "Lz6/w$b;", "Lmv/K;", "dispatcher", "Lmv/O;", "coroutineScope", "<init>", "(Lmv/K;Lmv/O;)V", "c", "Lmv/K;", "h", "()Lmv/K;", "d", "Lmv/O;", "g", "()Lmv/O;", "Lz6/w$c;", "getKey", "()Lz6/w$c;", "key", "e", "a", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: y6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18293c implements w.b {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K dispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O coroutineScope;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ly6/c$a;", "Lz6/w$c;", "Ly6/c;", "<init>", "()V", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.c$a, reason: from kotlin metadata */
    public static final class Companion implements w.c<C18293c> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public C18293c(AbstractC15779K dispatcher, InterfaceC15783O coroutineScope) {
        Intrinsics.j(dispatcher, "dispatcher");
        Intrinsics.j(coroutineScope, "coroutineScope");
        this.dispatcher = dispatcher;
        this.coroutineScope = coroutineScope;
    }

    /* renamed from: g, reason: from getter */
    public final InterfaceC15783O getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // z6.w.b
    public w.c<?> getKey() {
        return INSTANCE;
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC15779K getDispatcher() {
        return this.dispatcher;
    }
}
