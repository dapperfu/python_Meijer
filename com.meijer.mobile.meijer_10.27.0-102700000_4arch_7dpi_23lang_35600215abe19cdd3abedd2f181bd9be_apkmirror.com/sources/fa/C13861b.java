package fa;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ7\u0010\u0014\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lfa/b;", "Lfa/c;", "Lwa/c;", "requestModelFactory", "Lw9/b;", "requestManager", "<init>", "(Lwa/c;Lw9/b;)V", "", "eventName", "", "eventAttributes", "LV8/a;", "completionListener", "e", "(Ljava/lang/String;Ljava/util/Map;LV8/a;)Ljava/lang/String;", "", "a", "(Ljava/lang/String;Ljava/util/Map;LV8/a;)V", "c", "d", "Lwa/c;", "b", "Lw9/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fa.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13861b implements InterfaceC13862c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wa.c requestModelFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w9.b requestManager;

    public C13861b(wa.c requestModelFactory, w9.b requestManager) {
        Intrinsics.j(requestModelFactory, "requestModelFactory");
        Intrinsics.j(requestManager, "requestManager");
        this.requestModelFactory = requestModelFactory;
        this.requestManager = requestManager;
    }

    @Override // fa.InterfaceC13862c
    public void a(String eventName, Map<String, String> eventAttributes, V8.a completionListener) {
        Intrinsics.j(eventName, "eventName");
        e(eventName, eventAttributes, completionListener);
    }

    @Override // fa.InterfaceC13862c
    public String c(String eventName, Map<String, String> eventAttributes, V8.a completionListener) {
        Intrinsics.j(eventName, "eventName");
        G9.b.c(eventName, "EventName must not be null!");
        try {
            y9.c cVarD = this.requestModelFactory.d(eventName, eventAttributes);
            this.requestManager.b(cVarD, completionListener);
            return cVarD.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        } catch (IllegalArgumentException e10) {
            if (completionListener == null) {
                return null;
            }
            completionListener.a(e10);
            return null;
        }
    }

    @Override // fa.InterfaceC13862c
    public void d(String eventName, Map<String, String> eventAttributes, V8.a completionListener) {
        Intrinsics.j(eventName, "eventName");
        c(eventName, eventAttributes, completionListener);
    }

    @Override // fa.InterfaceC13862c
    public String e(String eventName, Map<String, String> eventAttributes, V8.a completionListener) {
        Intrinsics.j(eventName, "eventName");
        G9.b.c(eventName, "EventName must not be null!");
        try {
            y9.c cVarA = this.requestModelFactory.a(eventName, eventAttributes);
            this.requestManager.b(cVarA, completionListener);
            return cVarA.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        } catch (IllegalArgumentException e10) {
            if (completionListener == null) {
                return null;
            }
            completionListener.a(e10);
            return null;
        }
    }
}
