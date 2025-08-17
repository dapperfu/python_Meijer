package U9;

import Ba.SessionIdHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0017\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0012¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001b\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0010¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"LU9/f;", "LU9/j;", "Lw9/b;", "requestManager", "Lwa/c;", "requestModelFactory", "LU9/k;", "requestContext", "LBa/a;", "session", "LBa/b;", "sessionIdHolder", "<init>", "(Lw9/b;Lwa/c;LU9/k;LBa/a;LBa/b;)V", "", "n", "()Z", "", "contactFieldId", "", "contactFieldValue", "LV8/a;", "completionListener", "", "b", "(Ljava/lang/Integer;Ljava/lang/String;LV8/a;)V", "idToken", "l", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;LV8/a;)V", "a", "(LV8/a;)V", "k", "o", "()V", "Lw9/b;", "Lwa/c;", "c", "LU9/k;", "d", "LBa/a;", "e", "LBa/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class f implements j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w9.b requestManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wa.c requestModelFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MobileEngageRequestContext requestContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ba.a session;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final SessionIdHolder sessionIdHolder;

    public f(w9.b requestManager, wa.c requestModelFactory, MobileEngageRequestContext requestContext, Ba.a session, SessionIdHolder sessionIdHolder) {
        Intrinsics.j(requestManager, "requestManager");
        Intrinsics.j(requestModelFactory, "requestModelFactory");
        Intrinsics.j(requestContext, "requestContext");
        Intrinsics.j(session, "session");
        Intrinsics.j(sessionIdHolder, "sessionIdHolder");
        this.requestManager = requestManager;
        this.requestModelFactory = requestModelFactory;
        this.requestContext = requestContext;
        this.session = session;
        this.sessionIdHolder = sessionIdHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(f fVar, V8.a aVar, Throwable th2) {
        if (th2 != null) {
            I9.e.INSTANCE.c(new J9.b(th2, null, 2, null));
        }
        fVar.k(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(V8.a aVar, f fVar, Throwable th2) {
        if (aVar != null) {
            aVar.a(th2);
        }
        fVar.session.a(new V8.a() { // from class: U9.e
            @Override // V8.a
            public final void a(Throwable th3) {
                f.j(th3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Throwable th2) {
        if (th2 != null) {
            I9.e.INSTANCE.c(new J9.b(th2, null, 2, null));
        }
    }

    public static /* synthetic */ void m(f fVar, Integer num, String str, String str2, V8.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doSetContact");
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        fVar.l(num, str, str2, aVar);
    }

    private boolean n() {
        String str = this.requestContext.f().get();
        return !(str == null || str.length() == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Throwable th2) {
        if (th2 != null) {
            I9.e.INSTANCE.c(new J9.b(th2, null, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Throwable th2) {
        if (th2 != null) {
            I9.e.INSTANCE.c(new J9.b(th2, null, 2, null));
        }
    }

    @Override // U9.j
    public void b(Integer contactFieldId, String contactFieldValue, V8.a completionListener) {
        if (Intrinsics.e(this.requestContext.d(), contactFieldValue)) {
            if (completionListener != null) {
                completionListener.a(null);
            }
        } else {
            m(this, contactFieldId, contactFieldValue, null, completionListener, 4, null);
            String sessionId = this.sessionIdHolder.getSessionId();
            if (sessionId != null && sessionId.length() != 0) {
                this.session.b(new V8.a() { // from class: U9.b
                    @Override // V8.a
                    public final void a(Throwable th2) {
                        f.p(th2);
                    }
                });
            }
            this.session.a(new V8.a() { // from class: U9.c
                @Override // V8.a
                public final void a(Throwable th2) {
                    f.q(th2);
                }
            });
        }
    }

    public void l(Integer contactFieldId, String contactFieldValue, String idToken, V8.a completionListener) {
        this.requestContext.o(contactFieldId);
        this.requestContext.p(contactFieldValue);
        this.requestContext.q(idToken);
        try {
            this.requestManager.b(this.requestModelFactory.g(contactFieldId, contactFieldValue), completionListener);
        } catch (IllegalArgumentException e10) {
            if (completionListener != null) {
                completionListener.a(e10);
            }
        }
    }

    public void o() {
        this.requestContext.j().remove();
        this.requestContext.f().remove();
        this.requestContext.i().remove();
        this.requestContext.q(null);
        this.requestContext.p(null);
        this.requestContext.o(null);
    }

    @Override // U9.j
    public void a(final V8.a completionListener) {
        if (n() && !this.requestContext.n()) {
            if (completionListener != null) {
                completionListener.a(null);
            }
        } else {
            String sessionId = this.sessionIdHolder.getSessionId();
            if (sessionId != null && sessionId.length() != 0) {
                this.session.b(new V8.a() { // from class: U9.a
                    @Override // V8.a
                    public final void a(Throwable th2) {
                        f.h(this.f35831a, completionListener, th2);
                    }
                });
            } else {
                k(completionListener);
            }
        }
    }

    public void k(final V8.a completionListener) {
        o();
        l(null, null, null, new V8.a() { // from class: U9.d
            @Override // V8.a
            public final void a(Throwable th2) {
                f.i(completionListener, this, th2);
            }
        });
    }
}
