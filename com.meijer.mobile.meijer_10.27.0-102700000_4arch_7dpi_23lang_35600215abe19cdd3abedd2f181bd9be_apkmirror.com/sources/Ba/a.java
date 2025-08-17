package Ba;

import F9.l;
import I9.e;
import J9.k;
import U9.MobileEngageRequestContext;
import fa.InterfaceC13862c;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import s9.C16914a;
import t9.C17074a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\r8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LBa/a;", "LC9/a;", "Ls9/a;", "timestampProvider", "Lt9/a;", "uuidProvider", "Lfa/c;", "eventServiceInternal", "LBa/b;", "sessionIdHolder", "LF9/l;", "", "contactTokenStorage", "LU9/k;", "mobileEngageRequestContext", "<init>", "(Ls9/a;Lt9/a;Lfa/c;LBa/b;LF9/l;LU9/k;)V", "LV8/a;", "completionListener", "", "a", "(LV8/a;)V", "b", "Ls9/a;", "Lt9/a;", "c", "Lfa/c;", "d", "LBa/b;", "e", "LF9/l;", "f", "LU9/k;", "", "g", "Ljava/lang/Long;", "sessionStart", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class a implements C9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C16914a timestampProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C17074a uuidProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13862c eventServiceInternal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SessionIdHolder sessionIdHolder;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<String> contactTokenStorage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final MobileEngageRequestContext mobileEngageRequestContext;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Long sessionStart;

    public a(C16914a timestampProvider, C17074a uuidProvider, InterfaceC13862c eventServiceInternal, SessionIdHolder sessionIdHolder, l<String> contactTokenStorage, MobileEngageRequestContext mobileEngageRequestContext) {
        Intrinsics.j(timestampProvider, "timestampProvider");
        Intrinsics.j(uuidProvider, "uuidProvider");
        Intrinsics.j(eventServiceInternal, "eventServiceInternal");
        Intrinsics.j(sessionIdHolder, "sessionIdHolder");
        Intrinsics.j(contactTokenStorage, "contactTokenStorage");
        Intrinsics.j(mobileEngageRequestContext, "mobileEngageRequestContext");
        this.timestampProvider = timestampProvider;
        this.uuidProvider = uuidProvider;
        this.eventServiceInternal = eventServiceInternal;
        this.sessionIdHolder = sessionIdHolder;
        this.contactTokenStorage = contactTokenStorage;
        this.mobileEngageRequestContext = mobileEngageRequestContext;
    }

    @Override // C9.a
    public void a(V8.a completionListener) {
        Intrinsics.j(completionListener, "completionListener");
        String str = this.contactTokenStorage.get();
        if (str == null || str.length() == 0 || this.mobileEngageRequestContext.getApplicationCode() == null) {
            return;
        }
        this.sessionIdHolder.b(this.uuidProvider.a());
        this.sessionStart = Long.valueOf(this.timestampProvider.a());
        this.eventServiceInternal.d("session:start", null, completionListener);
    }

    @Override // C9.a
    public void b(V8.a completionListener) {
        Intrinsics.j(completionListener, "completionListener");
        if (this.sessionIdHolder.getSessionId() == null || this.sessionStart == null || this.mobileEngageRequestContext.getApplicationCode() == null) {
            String str = this.contactTokenStorage.get();
            if (str == null || str.length() == 0) {
                return;
            }
            e.Companion.e(e.INSTANCE, new k(getClass(), "endSession", null, MapsKt.g(TuplesKt.a("cause", "StartSession has to be called first!"))), false, 2, null);
            return;
        }
        long jA = this.timestampProvider.a();
        Long l10 = this.sessionStart;
        Intrinsics.g(l10);
        this.eventServiceInternal.d("session:end", MapsKt.g(TuplesKt.a("duration", String.valueOf(jA - l10.longValue()))), completionListener);
        this.sessionIdHolder.b(null);
        this.sessionStart = null;
    }
}
