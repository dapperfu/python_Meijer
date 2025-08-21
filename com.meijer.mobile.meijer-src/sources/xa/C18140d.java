package xa;

import H9.l;
import ha.C14490a;
import ha.InterfaceC14492c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010%\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b%\u0010!J\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010-R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lxa/d;", "Lxa/h;", "Ly9/b;", "requestManager", "Ln9/b;", "concurrentHandlerHolder", "Lya/c;", "requestModelFactory", "Lha/c;", "eventServiceInternal", "LH9/l;", "", "pushTokenStorage", "localPushTokenStorage", "Lha/a;", "notificationCacheableEventHandler", "silentMessageCacheableEventHandler", "Lxa/g;", "notificationInformationListenerProvider", "Lxa/j;", "silentNotificationInformationListenerProvider", "", "isAutomaticPushSendingEnabled", "<init>", "(Ly9/b;Ln9/b;Lya/c;Lha/c;LH9/l;LH9/l;Lha/a;Lha/a;Lxa/g;Lxa/j;Z)V", "LX8/a;", "completionListener", "messageId", "", "h", "(LX8/a;Ljava/lang/String;)V", "pushToken", "b", "(Ljava/lang/String;LX8/a;)V", "c", "(LX8/a;)V", "sid", "d", "LY9/a;", "notificationEventHandler", "a", "(LY9/a;)V", "Ly9/b;", "Ln9/b;", "Lya/c;", "Lha/c;", "e", "LH9/l;", "f", "g", "Lha/a;", "i", "Lxa/g;", "j", "Lxa/j;", "k", "Z", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xa.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18140d implements InterfaceC18144h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y9.b requestManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ya.c requestModelFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14492c eventServiceInternal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<String> pushTokenStorage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l<String> localPushTokenStorage;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C14490a notificationCacheableEventHandler;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C14490a silentMessageCacheableEventHandler;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C18143g notificationInformationListenerProvider;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C18146j silentNotificationInformationListenerProvider;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean isAutomaticPushSendingEnabled;

    public C18140d(y9.b requestManager, n9.b concurrentHandlerHolder, ya.c requestModelFactory, InterfaceC14492c eventServiceInternal, l<String> pushTokenStorage, l<String> localPushTokenStorage, C14490a notificationCacheableEventHandler, C14490a silentMessageCacheableEventHandler, C18143g notificationInformationListenerProvider, C18146j silentNotificationInformationListenerProvider, boolean z10) {
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

    private final void h(X8.a completionListener, String messageId) {
        HashMap map = new HashMap();
        map.put("sid", messageId);
        map.put("origin", "main");
        this.eventServiceInternal.e("push:click", map, completionListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C18140d c18140d, String str, X8.a aVar, Throwable th2) {
        if (th2 == null) {
            c18140d.pushTokenStorage.set(str);
        }
        if (aVar != null) {
            aVar.a(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(X8.a aVar) {
        if (aVar != null) {
            aVar.a(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(X8.a aVar) {
        if (aVar != null) {
            aVar.a(new IllegalArgumentException("No messageId found!"));
        }
    }

    @Override // xa.InterfaceC18144h
    public void a(Y9.a notificationEventHandler) {
        Intrinsics.j(notificationEventHandler, "notificationEventHandler");
        this.notificationCacheableEventHandler.b(notificationEventHandler);
    }

    @Override // xa.InterfaceC18144h
    public void b(final String pushToken, final X8.a completionListener) {
        Intrinsics.j(pushToken, "pushToken");
        this.localPushTokenStorage.set(pushToken);
        if (Intrinsics.e(this.pushTokenStorage.get(), pushToken)) {
            this.concurrentHandlerHolder.h(new Runnable() { // from class: xa.c
                @Override // java.lang.Runnable
                public final void run() {
                    C18140d.j(completionListener);
                }
            });
        } else {
            this.requestManager.b(this.requestModelFactory.h(pushToken), new X8.a() { // from class: xa.b
                @Override // X8.a
                public final void a(Throwable th2) {
                    C18140d.i(this.f170646a, pushToken, completionListener, th2);
                }
            });
        }
    }

    @Override // xa.InterfaceC18144h
    public void c(X8.a completionListener) {
        A9.c cVarF = this.requestModelFactory.f();
        this.pushTokenStorage.remove();
        this.requestManager.b(cVarF, completionListener);
    }

    @Override // xa.InterfaceC18144h
    public void d(String sid, final X8.a completionListener) {
        if (sid != null) {
            h(completionListener, sid);
        } else {
            this.concurrentHandlerHolder.h(new Runnable() { // from class: xa.a
                @Override // java.lang.Runnable
                public final void run() {
                    C18140d.k(completionListener);
                }
            });
        }
    }
}
