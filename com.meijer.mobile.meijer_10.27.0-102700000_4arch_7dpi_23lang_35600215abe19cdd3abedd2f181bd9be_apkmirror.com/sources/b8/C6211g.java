package b8;

import b8.InterfaceC6207c;
import d8.C13494a;
import d8.C13495b;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR&\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lb8/g;", "Lb8/d;", "Lqv/O;", "coroutineScope", "Ld8/a;", "userInteractionLogger", "Ld8/b;", "userInteractionTracker", "Lc8/g;", "touchUserInteractionGenerator", "<init>", "(Lqv/O;Ld8/a;Ld8/b;Lc8/g;)V", "Lb8/c$a;", "handlerType", "Lb8/c;", "a", "(Lb8/c$a;)Lb8/c;", "Lqv/O;", "b", "Ld8/a;", "c", "Ld8/b;", "d", "Lc8/g;", "Lb8/b;", "e", "Lkotlin/Lazy;", "()Lb8/b;", "touchUserInteractionHandler", "", "Lkotlin/Function0;", "f", "Ljava/util/Map;", "handlerCreators", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: b8.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6211g implements InterfaceC6208d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C13494a userInteractionLogger;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C13495b userInteractionTracker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c8.g touchUserInteractionGenerator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy touchUserInteractionHandler;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<InterfaceC6207c.a, Function0<InterfaceC6207c>> handlerCreators;

    public C6211g(InterfaceC16622O coroutineScope, C13494a userInteractionLogger, C13495b userInteractionTracker, c8.g touchUserInteractionGenerator) {
        Intrinsics.j(coroutineScope, "coroutineScope");
        Intrinsics.j(userInteractionLogger, "userInteractionLogger");
        Intrinsics.j(userInteractionTracker, "userInteractionTracker");
        Intrinsics.j(touchUserInteractionGenerator, "touchUserInteractionGenerator");
        this.coroutineScope = coroutineScope;
        this.userInteractionLogger = userInteractionLogger;
        this.userInteractionTracker = userInteractionTracker;
        this.touchUserInteractionGenerator = touchUserInteractionGenerator;
        this.touchUserInteractionHandler = LazyKt.b(new Function0() { // from class: b8.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6211g.f(this.f60065a);
            }
        });
        this.handlerCreators = MapsKt.g(TuplesKt.a(InterfaceC6207c.a.f60062a, new Function0() { // from class: b8.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6211g.e(this.f60066a);
            }
        }));
    }

    private final C6206b d() {
        return (C6206b) this.touchUserInteractionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6206b f(C6211g c6211g) {
        return new C6206b(c6211g.coroutineScope, c6211g.userInteractionLogger, c6211g.userInteractionTracker, c6211g.touchUserInteractionGenerator);
    }

    @Override // b8.InterfaceC6208d
    public InterfaceC6207c a(InterfaceC6207c.a handlerType) {
        InterfaceC6207c interfaceC6207cInvoke;
        Intrinsics.j(handlerType, "handlerType");
        Function0<InterfaceC6207c> function0 = this.handlerCreators.get(handlerType);
        if (function0 != null && (interfaceC6207cInvoke = function0.invoke()) != null) {
            return interfaceC6207cInvoke;
        }
        throw new IllegalArgumentException("Unknown handler type: " + handlerType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6206b e(C6211g c6211g) {
        return c6211g.d();
    }
}
