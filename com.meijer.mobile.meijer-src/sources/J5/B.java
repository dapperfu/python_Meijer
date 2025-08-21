package J5;

import com.adobe.marketing.mobile.AbstractC6578l;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.C6569c;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.C6576j;
import com.adobe.marketing.mobile.EventHistoryResult;
import com.adobe.marketing.mobile.InterfaceC6568b;
import com.adobe.marketing.mobile.InterfaceC6581o;
import com.adobe.marketing.mobile.util.CloneFailedException;
import g6.C14333f;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 f2\u00020\u0001:\u0001'B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u000fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u000fJ/\u0010$\u001a\u00020\u00072\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\"0!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b'\u0010(J3\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010)\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b/\u00100J3\u00101\u001a\u0004\u0018\u00010.2\u0006\u0010)\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b1\u00100J;\u00108\u001a\u00020\u00072\u000e\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u000203022\u0006\u00105\u001a\u00020*2\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070206H\u0016¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020*06H\u0016¢\u0006\u0004\b:\u0010;R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010<R(\u0010@\u001a\u0004\u0018\u00010\u000b2\b\u0010=\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010>\u001a\u0004\b?\u0010\rR(\u0010B\u001a\u0004\u0018\u00010\u000b2\b\u0010=\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010>\u001a\u0004\bA\u0010\rR(\u0010D\u001a\u0004\u0018\u00010\u000b2\b\u0010=\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u0010>\u001a\u0004\bC\u0010\rR@\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010E2\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010E8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010F\u001a\u0004\bG\u0010HR(\u0010M\u001a\u0004\u0018\u00010\u001b2\b\u0010=\u001a\u0004\u0018\u00010\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010J\u001a\u0004\bK\u0010LR(\u0010Q\u001a\u0004\u0018\u00010\u00032\b\u0010=\u001a\u0004\u0018\u00010\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b:\u0010N\u001a\u0004\bO\u0010PR$\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010FR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010UR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001b0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\\R\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020\u001b0`8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d¨\u0006g"}, d2 = {"LJ5/B;", "Lcom/adobe/marketing/mobile/m;", "Ljava/lang/Class;", "Lcom/adobe/marketing/mobile/l;", "extensionClass", "Lkotlin/Function1;", "LJ5/v;", "", "callback", "<init>", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "", "v", "()Ljava/lang/String;", "y", "()V", "LJ5/H;", "type", "LJ5/G;", "t", "(LJ5/H;)LJ5/G;", "eventType", "eventSource", "Lcom/adobe/marketing/mobile/o;", "eventListener", "h", "(Ljava/lang/String;Ljava/lang/String;Lcom/adobe/marketing/mobile/o;)V", "Lcom/adobe/marketing/mobile/h;", "event", "c", "(Lcom/adobe/marketing/mobile/h;)V", "i", "j", "", "", "state", "b", "(Ljava/util/Map;Lcom/adobe/marketing/mobile/h;)V", "Lcom/adobe/marketing/mobile/G;", "a", "(Lcom/adobe/marketing/mobile/h;)Lcom/adobe/marketing/mobile/G;", "extensionName", "", "barrier", "Lcom/adobe/marketing/mobile/F;", "resolution", "Lcom/adobe/marketing/mobile/H;", "e", "(Ljava/lang/String;Lcom/adobe/marketing/mobile/h;ZLcom/adobe/marketing/mobile/F;)Lcom/adobe/marketing/mobile/H;", "f", "", "Lcom/adobe/marketing/mobile/j;", "eventHistoryRequests", "enforceOrder", "Lcom/adobe/marketing/mobile/b;", "Lcom/adobe/marketing/mobile/k;", "d", "([Lcom/adobe/marketing/mobile/j;ZLcom/adobe/marketing/mobile/b;)V", "g", "(Lcom/adobe/marketing/mobile/h;Lcom/adobe/marketing/mobile/b;)V", "Ljava/lang/Class;", "<set-?>", "Ljava/lang/String;", "u", "sharedStateName", "q", "friendlyName", "w", "version", "", "Ljava/util/Map;", "s", "()Ljava/util/Map;", "metadata", "Lcom/adobe/marketing/mobile/h;", "r", "()Lcom/adobe/marketing/mobile/h;", "lastProcessedEvent", "Lcom/adobe/marketing/mobile/l;", "p", "()Lcom/adobe/marketing/mobile/l;", "extension", "sharedStateManagers", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "LJ5/D;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "eventListeners", "Lg6/f$c;", "Lg6/f$c;", "dispatchJob", "Ljava/lang/Runnable;", "k", "Ljava/lang/Runnable;", "initJob", "l", "teardownJob", "Lg6/f;", "m", "Lg6/f;", "o", "()Lg6/f;", "eventProcessor", "n", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class B extends AbstractC6579m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<? extends AbstractC6578l> extensionClass;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String sharedStateName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String friendlyName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String version;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Map<String, String> metadata;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C6574h lastProcessedEvent;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private AbstractC6578l extension;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Map<H, G> sharedStateManagers;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentLinkedQueue<D> eventListeners;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C14333f.c<C6574h> dispatchJob;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Runnable initJob;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Runnable teardownJob;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C14333f<C6574h> eventProcessor;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/adobe/marketing/mobile/h;", "event", "", "<anonymous>", "(Lcom/adobe/marketing/mobile/h;)Z"}, k = 3, mv = {1, 5, 1})
    @SourceDebugExtension
    static final class b implements C14333f.c<C6574h> {
        b() {
        }

        @Override // g6.C14333f.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final boolean a(C6574h event) {
            Intrinsics.j(event, "event");
            AbstractC6578l extension = B.this.getExtension();
            if (extension == null || !extension.i(event)) {
                return false;
            }
            for (D d10 : B.this.eventListeners) {
                if (d10.b(event)) {
                    d10.a(event);
                }
            }
            B.this.lastProcessedEvent = event;
            return true;
        }
    }

    public B(Class<? extends AbstractC6578l> extensionClass, final Function1<? super v, Unit> callback) {
        Intrinsics.j(extensionClass, "extensionClass");
        Intrinsics.j(callback, "callback");
        this.extensionClass = extensionClass;
        this.eventListeners = new ConcurrentLinkedQueue<>();
        b bVar = new b();
        this.dispatchJob = bVar;
        Runnable runnable = new Runnable() { // from class: J5.z
            @Override // java.lang.Runnable
            public final void run() throws NoSuchMethodException, SecurityException {
                B.x(this.f15541a, callback);
            }
        };
        this.initJob = runnable;
        Runnable runnable2 = new Runnable() { // from class: J5.A
            @Override // java.lang.Runnable
            public final void run() {
                B.z(this.f15417a);
            }
        };
        this.teardownJob = runnable2;
        String strD = C.d(extensionClass);
        Intrinsics.i(strD, "extensionClass.extensionTypeName");
        C14333f<C6574h> c14333f = new C14333f<>(strD, bVar);
        this.eventProcessor = c14333f;
        c14333f.v(runnable);
        c14333f.u(runnable2);
        c14333f.x();
    }

    private final String v() {
        if (this.extension == null) {
            return "ExtensionContainer";
        }
        return "ExtensionContainer[" + this.sharedStateName + '(' + this.version + ")]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(B this$0, Function1 callback) throws NoSuchMethodException, SecurityException {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(callback, "$callback");
        AbstractC6578l abstractC6578lF = C.f(this$0.extensionClass, this$0);
        if (abstractC6578lF == null) {
            callback.invoke(v.ExtensionInitializationFailure);
            return;
        }
        String strC = C.c(abstractC6578lF);
        if (strC == null || StringsKt.s0(strC)) {
            callback.invoke(v.InvalidExtensionName);
            return;
        }
        this$0.extension = abstractC6578lF;
        this$0.sharedStateName = strC;
        this$0.friendlyName = C.a(abstractC6578lF);
        this$0.version = C.e(abstractC6578lF);
        this$0.metadata = C.b(abstractC6578lF);
        this$0.sharedStateManagers = MapsKt.o(TuplesKt.a(H.XDM, new G(strC)), TuplesKt.a(H.STANDARD, new G(strC)));
        R5.t.a("MobileCore", this$0.v(), "Extension registered", new Object[0]);
        callback.invoke(v.None);
        C.g(abstractC6578lF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(B this$0) {
        Intrinsics.j(this$0, "this$0");
        AbstractC6578l abstractC6578l = this$0.extension;
        if (abstractC6578l != null) {
            C.h(abstractC6578l);
        }
        R5.t.a("MobileCore", this$0.v(), "Extension unregistered", new Object[0]);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6579m
    public com.adobe.marketing.mobile.G a(C6574h event) {
        String str = this.sharedStateName;
        if (str != null) {
            return q.INSTANCE.a().y(H.STANDARD, str, event);
        }
        R5.t.f("MobileCore", v(), "ExtensionContainer is not fully initialized. createPendingSharedState should not be called from 'Extension' constructor", new Object[0]);
        return null;
    }

    @Override // com.adobe.marketing.mobile.AbstractC6579m
    public void b(Map<String, Object> state, C6574h event) throws ExecutionException, CloneFailedException, InterruptedException {
        Intrinsics.j(state, "state");
        String str = this.sharedStateName;
        if (str == null) {
            R5.t.f("MobileCore", v(), "ExtensionContainer is not fully initialized. createSharedState should not be called from Extension constructor", new Object[0]);
        } else {
            q.INSTANCE.a().B(H.STANDARD, str, state, event);
        }
    }

    @Override // com.adobe.marketing.mobile.AbstractC6579m
    public void c(C6574h event) {
        Intrinsics.j(event, "event");
        q.INSTANCE.a().E(event);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6579m
    public void d(C6576j[] eventHistoryRequests, boolean enforceOrder, InterfaceC6568b<EventHistoryResult[]> callback) {
        Unit unit;
        Intrinsics.j(eventHistoryRequests, "eventHistoryRequests");
        Intrinsics.j(callback, "callback");
        K5.f eventHistory = q.INSTANCE.a().getEventHistory();
        if (eventHistory != null) {
            eventHistory.a(eventHistoryRequests, enforceOrder, callback);
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            callback.b(C6569c.f63211c);
        }
    }

    @Override // com.adobe.marketing.mobile.AbstractC6579m
    public com.adobe.marketing.mobile.H e(String extensionName, C6574h event, boolean barrier, com.adobe.marketing.mobile.F resolution) {
        Intrinsics.j(extensionName, "extensionName");
        Intrinsics.j(resolution, "resolution");
        return q.INSTANCE.a().S(H.STANDARD, extensionName, event, barrier, resolution);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6579m
    public com.adobe.marketing.mobile.H f(String extensionName, C6574h event, boolean barrier, com.adobe.marketing.mobile.F resolution) {
        Intrinsics.j(extensionName, "extensionName");
        Intrinsics.j(resolution, "resolution");
        return q.INSTANCE.a().S(H.XDM, extensionName, event, barrier, resolution);
    }

    @Override // com.adobe.marketing.mobile.AbstractC6579m
    public void g(C6574h event, InterfaceC6568b<Boolean> callback) {
        Unit unit;
        Intrinsics.j(event, "event");
        Intrinsics.j(callback, "callback");
        K5.f eventHistory = q.INSTANCE.a().getEventHistory();
        if (eventHistory != null) {
            eventHistory.b(event, callback);
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            callback.b(C6569c.f63211c);
        }
    }

    @Override // com.adobe.marketing.mobile.AbstractC6579m
    public void h(String eventType, String eventSource, InterfaceC6581o eventListener) {
        Intrinsics.j(eventType, "eventType");
        Intrinsics.j(eventSource, "eventSource");
        Intrinsics.j(eventListener, "eventListener");
        this.eventListeners.add(new D(eventType, eventSource, eventListener));
    }

    @Override // com.adobe.marketing.mobile.AbstractC6579m
    public void i() {
        this.eventProcessor.t();
    }

    @Override // com.adobe.marketing.mobile.AbstractC6579m
    public void j() {
        this.eventProcessor.p();
    }

    public final C14333f<C6574h> o() {
        return this.eventProcessor;
    }

    /* renamed from: p, reason: from getter */
    public final AbstractC6578l getExtension() {
        return this.extension;
    }

    /* renamed from: q, reason: from getter */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /* renamed from: r, reason: from getter */
    public final C6574h getLastProcessedEvent() {
        return this.lastProcessedEvent;
    }

    public final Map<String, String> s() {
        return this.metadata;
    }

    public final G t(H type) {
        Intrinsics.j(type, "type");
        Map<H, G> map = this.sharedStateManagers;
        if (map != null) {
            return map.get(type);
        }
        return null;
    }

    /* renamed from: u, reason: from getter */
    public final String getSharedStateName() {
        return this.sharedStateName;
    }

    /* renamed from: w, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final void y() {
        this.eventProcessor.w();
    }
}
