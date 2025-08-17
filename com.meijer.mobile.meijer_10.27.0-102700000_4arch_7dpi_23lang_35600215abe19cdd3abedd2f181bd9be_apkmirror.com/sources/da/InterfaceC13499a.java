package da;

import F9.l;
import U9.MobileEngageRequestContext;
import U9.j;
import W8.e;
import aa.InterfaceC5588a;
import fa.InterfaceC13862c;
import ga.n;
import i9.InterfaceC14709a;
import kotlin.Metadata;
import p9.C16270a;
import ra.C16739d;
import ta.C17075a;
import va.C17531g;
import va.C17534j;
import va.InterfaceC17532h;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 Q2\u00020\u0001:\u0001RR\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010'R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u0002078&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010@\u001a\u00020=8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006S"}, d2 = {"Lda/a;", "Li9/a;", "Ljava/lang/Class;", "j", "()Ljava/lang/Class;", "notificationOpenedActivityClass", "LU9/j;", "F", "()LU9/j;", "mobileEngageInternal", "z", "loggingMobileEngageInternal", "Laa/a;", "S", "()Laa/a;", "clientServiceInternal", "w", "loggingClientServiceInternal", "Lva/h;", "P", "()Lva/h;", "pushInternal", "f", "loggingPushInternal", "Lfa/c;", "i", "()Lfa/c;", "eventServiceInternal", "LU9/k;", "v", "()LU9/k;", "requestContext", "Lia/l;", "J", "()Lia/l;", "overlayInAppPresenter", "LF9/l;", "", "u", "()LF9/l;", "deviceInfoPayloadStorage", "C", "contactTokenStorage", "A", "clientStateStorage", "B", "localPushTokenStorage", "Lva/g;", "s", "()Lva/g;", "notificationInformationListenerProvider", "Lva/j;", "r", "()Lva/j;", "silentNotificationInformationListenerProvider", "Lta/a;", "K", "()Lta/a;", "notificationActionCommandFactory", "q", "silentMessageActionCommandFactory", "Lp9/a;", "W", "()Lp9/a;", "currentActivityProvider", "Lga/n;", "R", "()Lga/n;", "geofenceInternal", "Lra/d;", "n", "()Lra/d;", "webViewFactory", "LAa/b;", "k", "()LAa/b;", "remoteMessageMapperFactory", "LW8/e;", "l", "()LW8/e;", "appLifecycleObserver", "c", "a", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: da.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC13499a extends InterfaceC14709a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f127300a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lda/a$a;", "", "<init>", "()V", "Lda/a;", "b", "Lda/a;", "a", "()Lda/a;", "(Lda/a;)V", "instance", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: da.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f127300a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static InterfaceC13499a instance;

        public final InterfaceC13499a a() {
            return instance;
        }

        public final void b(InterfaceC13499a interfaceC13499a) {
            instance = interfaceC13499a;
        }

        private Companion() {
        }
    }

    l<String> A();

    l<String> B();

    l<String> C();

    j F();

    ia.l J();

    C17075a K();

    InterfaceC17532h P();

    n R();

    InterfaceC5588a S();

    C16270a W();

    InterfaceC17532h f();

    InterfaceC13862c i();

    Class<?> j();

    Aa.b k();

    e l();

    C16739d n();

    C17075a q();

    C17534j r();

    C17531g s();

    l<String> u();

    MobileEngageRequestContext v();

    InterfaceC5588a w();

    j z();
}
