package d8;

import d8.InterfaceC13638c;
import f8.C13967a;
import f8.C13968b;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR&\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Ld8/g;", "Ld8/d;", "Lmv/O;", "coroutineScope", "Lf8/a;", "userInteractionLogger", "Lf8/b;", "userInteractionTracker", "Le8/g;", "touchUserInteractionGenerator", "<init>", "(Lmv/O;Lf8/a;Lf8/b;Le8/g;)V", "Ld8/c$a;", "handlerType", "Ld8/c;", "a", "(Ld8/c$a;)Ld8/c;", "Lmv/O;", "b", "Lf8/a;", "c", "Lf8/b;", "d", "Le8/g;", "Ld8/b;", "e", "Lkotlin/Lazy;", "()Ld8/b;", "touchUserInteractionHandler", "", "Lkotlin/Function0;", "f", "Ljava/util/Map;", "handlerCreators", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: d8.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13642g implements InterfaceC13639d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O coroutineScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C13967a userInteractionLogger;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C13968b userInteractionTracker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e8.g touchUserInteractionGenerator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy touchUserInteractionHandler;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<InterfaceC13638c.a, Function0<InterfaceC13638c>> handlerCreators;

    public C13642g(InterfaceC15783O coroutineScope, C13967a userInteractionLogger, C13968b userInteractionTracker, e8.g touchUserInteractionGenerator) {
        Intrinsics.j(coroutineScope, "coroutineScope");
        Intrinsics.j(userInteractionLogger, "userInteractionLogger");
        Intrinsics.j(userInteractionTracker, "userInteractionTracker");
        Intrinsics.j(touchUserInteractionGenerator, "touchUserInteractionGenerator");
        this.coroutineScope = coroutineScope;
        this.userInteractionLogger = userInteractionLogger;
        this.userInteractionTracker = userInteractionTracker;
        this.touchUserInteractionGenerator = touchUserInteractionGenerator;
        this.touchUserInteractionHandler = LazyKt.b(new Function0() { // from class: d8.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13642g.f(this.f128300a);
            }
        });
        this.handlerCreators = MapsKt.g(TuplesKt.a(InterfaceC13638c.a.f128297a, new Function0() { // from class: d8.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13642g.e(this.f128301a);
            }
        }));
    }

    private final C13637b d() {
        return (C13637b) this.touchUserInteractionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13637b f(C13642g c13642g) {
        return new C13637b(c13642g.coroutineScope, c13642g.userInteractionLogger, c13642g.userInteractionTracker, c13642g.touchUserInteractionGenerator);
    }

    @Override // d8.InterfaceC13639d
    public InterfaceC13638c a(InterfaceC13638c.a handlerType) {
        InterfaceC13638c interfaceC13638cInvoke;
        Intrinsics.j(handlerType, "handlerType");
        Function0<InterfaceC13638c> function0 = this.handlerCreators.get(handlerType);
        if (function0 != null && (interfaceC13638cInvoke = function0.invoke()) != null) {
            return interfaceC13638cInvoke;
        }
        throw new IllegalArgumentException("Unknown handler type: " + handlerType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C13637b e(C13642g c13642g) {
        return c13642g.d();
    }
}
