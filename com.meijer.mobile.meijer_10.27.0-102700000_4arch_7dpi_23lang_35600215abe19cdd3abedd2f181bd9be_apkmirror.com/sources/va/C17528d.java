package va;

import F9.l;
import fa.C13860a;
import fa.InterfaceC13862c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010%\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b%\u0010!J\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010-R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lva/d;", "Lva/h;", "Lw9/b;", "requestManager", "Ll9/b;", "concurrentHandlerHolder", "Lwa/c;", "requestModelFactory", "Lfa/c;", "eventServiceInternal", "LF9/l;", "", "pushTokenStorage", "localPushTokenStorage", "Lfa/a;", "notificationCacheableEventHandler", "silentMessageCacheableEventHandler", "Lva/g;", "notificationInformationListenerProvider", "Lva/j;", "silentNotificationInformationListenerProvider", "", "isAutomaticPushSendingEnabled", "<init>", "(Lw9/b;Ll9/b;Lwa/c;Lfa/c;LF9/l;LF9/l;Lfa/a;Lfa/a;Lva/g;Lva/j;Z)V", "LV8/a;", "completionListener", "messageId", "", "h", "(LV8/a;Ljava/lang/String;)V", "pushToken", "b", "(Ljava/lang/String;LV8/a;)V", "d", "(LV8/a;)V", "sid", "c", "LW9/a;", "notificationEventHandler", "a", "(LW9/a;)V", "Lw9/b;", "Ll9/b;", "Lwa/c;", "Lfa/c;", "e", "LF9/l;", "f", "g", "Lfa/a;", "i", "Lva/g;", "j", "Lva/j;", "k", "Z", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: va.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17528d implements InterfaceC17532h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w9.b requestManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l9.b concurrentHandlerHolder;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wa.c requestModelFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13862c eventServiceInternal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<String> pushTokenStorage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l<String> localPushTokenStorage;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C13860a notificationCacheableEventHandler;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C13860a silentMessageCacheableEventHandler;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C17531g notificationInformationListenerProvider;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C17534j silentNotificationInformationListenerProvider;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean isAutomaticPushSendingEnabled;

    public C17528d(w9.b requestManager, l9.b concurrentHandlerHolder, wa.c requestModelFactory, InterfaceC13862c eventServiceInternal, l<String> pushTokenStorage, l<String> localPushTokenStorage, C13860a notificationCacheableEventHandler, C13860a silentMessageCacheableEventHandler, C17531g notificationInformationListenerProvider, C17534j silentNotificationInformationListenerProvider, boolean z10) {
        Intrinsics.j(requestManager, "requestManager");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(requestModelFactory, "requestModelFactory");
        Intrinsics.j(eventServiceInternal, "eventServiceInternal");
        Intrinsics.j(pushTokenStorage, "pushTokenStorage");
        Intrinsics.j(localPushTokenStorage, "localPushTokenStorage");
        Intrinsics.j(notificationCacheableEventHandler, "notificationCacheableEventHandler");
        Intrinsics.j(silentMessageCacheableEventHandler, "silentMessageCacheableEventHandler");
        Intrinsics.j(notificationInformationListenerProvider, "notificationInformationListenerProvider");
        Intrinsics.j(silentNotificationInformationListenerProvider, "silentNotificationInformationListenerProvider");
        this.requestManager = requestManager;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.requestModelFactory = requestModelFactory;
        this.eventServiceInternal = eventServiceInternal;
        this.pushTokenStorage = pushTokenStorage;
        this.localPushTokenStorage = localPushTokenStorage;
        this.notificationCacheableEventHandler = notificationCacheableEventHandler;
        this.silentMessageCacheableEventHandler = silentMessageCacheableEventHandler;
        this.notificationInformationListenerProvider = notificationInformationListenerProvider;
        this.silentNotificationInformationListenerProvider = silentNotificationInformationListenerProvider;
        this.isAutomaticPushSendingEnabled = z10;
    }

    private final void h(V8.a completionListener, String messageId) {
        HashMap map = new HashMap();
        map.put("sid", messageId);
        map.put("origin", "main");
        this.eventServiceInternal.d("push:click", map, completionListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C17528d c17528d, String str, V8.a aVar, Throwable th2) {
        if (th2 == null) {
            c17528d.pushTokenStorage.set(str);
        }
        if (aVar != null) {
            aVar.a(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(V8.a aVar) {
        if (aVar != null) {
            aVar.a(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(V8.a aVar) {
        if (aVar != null) {
            aVar.a(new IllegalArgumentException("No messageId found!"));
        }
    }

    @Override // va.InterfaceC17532h
    public void a(W9.a notificationEventHandler) {
        Intrinsics.j(notificationEventHandler, "notificationEventHandler");
        this.notificationCacheableEventHandler.b(notificationEventHandler);
    }

    @Override // va.InterfaceC17532h
    public void b(final String pushToken, final V8.a completionListener) {
        Intrinsics.j(pushToken, "pushToken");
        this.localPushTokenStorage.set(pushToken);
        if (Intrinsics.e(this.pushTokenStorage.get(), pushToken)) {
            this.concurrentHandlerHolder.h(new Runnable() { // from class: va.c
                @Override // java.lang.Runnable
                public final void run() {
                    C17528d.j(completionListener);
                }
            });
        } else {
            this.requestManager.b(this.requestModelFactory.h(pushToken), new V8.a() { // from class: va.b
                @Override // V8.a
                public final void a(Throwable th2) {
                    C17528d.i(this.f164610a, pushToken, completionListener, th2);
                }
            });
        }
    }

    @Override // va.InterfaceC17532h
    public void c(String sid, final V8.a completionListener) {
        if (sid != null) {
            h(completionListener, sid);
        } else {
            this.concurrentHandlerHolder.h(new Runnable() { // from class: va.a
                @Override // java.lang.Runnable
                public final void run() {
                    C17528d.k(completionListener);
                }
            });
        }
    }

    @Override // va.InterfaceC17532h
    public void d(V8.a completionListener) {
        y9.c cVarF = this.requestModelFactory.f();
        this.pushTokenStorage.remove();
        this.requestManager.b(cVarF, completionListener);
    }
}
