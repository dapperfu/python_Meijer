package fa;

import H9.l;
import W9.MobileEngageRequestContext;
import W9.j;
import Y8.e;
import ca.InterfaceC6494a;
import ha.InterfaceC14492c;
import ia.n;
import k9.InterfaceC15112a;
import kotlin.Metadata;
import r9.C16874a;
import ta.C17213d;
import va.C17650a;
import xa.C18143g;
import xa.C18146j;
import xa.InterfaceC18144h;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 Q2\u00020\u0001:\u0001RR\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010'R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u0002078&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010@\u001a\u00020=8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006S"}, d2 = {"Lfa/a;", "Lk9/a;", "Ljava/lang/Class;", "i", "()Ljava/lang/Class;", "notificationOpenedActivityClass", "LW9/j;", "F", "()LW9/j;", "mobileEngageInternal", "z", "loggingMobileEngageInternal", "Lca/a;", "S", "()Lca/a;", "clientServiceInternal", "w", "loggingClientServiceInternal", "Lxa/h;", "P", "()Lxa/h;", "pushInternal", "f", "loggingPushInternal", "Lha/c;", "h", "()Lha/c;", "eventServiceInternal", "LW9/k;", "v", "()LW9/k;", "requestContext", "Lka/l;", "J", "()Lka/l;", "overlayInAppPresenter", "LH9/l;", "", "u", "()LH9/l;", "deviceInfoPayloadStorage", "C", "contactTokenStorage", "A", "clientStateStorage", "B", "localPushTokenStorage", "Lxa/g;", "s", "()Lxa/g;", "notificationInformationListenerProvider", "Lxa/j;", "r", "()Lxa/j;", "silentNotificationInformationListenerProvider", "Lva/a;", "K", "()Lva/a;", "notificationActionCommandFactory", "q", "silentMessageActionCommandFactory", "Lr9/a;", "W", "()Lr9/a;", "currentActivityProvider", "Lia/n;", "R", "()Lia/n;", "geofenceInternal", "Lta/d;", "n", "()Lta/d;", "webViewFactory", "LCa/b;", "k", "()LCa/b;", "remoteMessageMapperFactory", "LY8/e;", "l", "()LY8/e;", "appLifecycleObserver", "c", "a", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fa.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC13972a extends InterfaceC15112a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f131629a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lfa/a$a;", "", "<init>", "()V", "Lfa/a;", "b", "Lfa/a;", "a", "()Lfa/a;", "(Lfa/a;)V", "instance", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fa.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f131629a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static InterfaceC13972a instance;

        public final InterfaceC13972a a() {
            return instance;
        }

        public final void b(InterfaceC13972a interfaceC13972a) {
            instance = interfaceC13972a;
        }

        private Companion() {
        }
    }

    l<String> A();

    l<String> B();

    l<String> C();

    j F();

    ka.l J();

    C17650a K();

    InterfaceC18144h P();

    n R();

    InterfaceC6494a S();

    C16874a W();

    InterfaceC18144h f();

    InterfaceC14492c h();

    Class<?> i();

    Ca.b k();

    e l();

    C17213d n();

    C17650a q();

    C18146j r();

    C18143g s();

    l<String> u();

    MobileEngageRequestContext v();

    InterfaceC6494a w();

    j z();
}
