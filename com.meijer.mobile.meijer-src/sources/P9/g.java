package P9;

import D9.ResponseModel;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0012¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0012¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0012¢\u0006\u0004\b\u0018\u0010\u0011J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ#\u0010!\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b!\u0010#R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"LP9/g;", "LS8/a;", "LP9/p;", "worker", "Lg9/c;", "LA9/c;", "Lg9/d;", "requestRepository", "Ln9/b;", "concurrentHandlerHolder", "coreCompletionHandler", "<init>", "(LP9/p;Lg9/c;Ln9/b;LS8/a;)V", "LD9/c;", "responseModel", "", "u", "(LD9/c;)V", "", "statusCode", "", "p", "(I)Z", "n", "l", "", PreferencesHelper.PREF_ID, "b", "(Ljava/lang/String;LD9/c;)V", "d", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "a", "(Ljava/lang/String;Ljava/lang/Exception;)V", "LP9/p;", "Lg9/c;", "c", "Ln9/b;", "j", "()Ln9/b;", "setConcurrentHandlerHolder", "(Ln9/b;)V", "LS8/a;", "k", "()LS8/a;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class g implements S8.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private p worker;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g9.c<A9.c, g9.d> requestRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private n9.b concurrentHandlerHolder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final S8.a coreCompletionHandler;

    public g(p pVar, g9.c<A9.c, g9.d> requestRepository, n9.b concurrentHandlerHolder, S8.a aVar) {
        Intrinsics.j(requestRepository, "requestRepository");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        this.worker = pVar;
        this.requestRepository = requestRepository;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.coreCompletionHandler = aVar;
    }

    private boolean p(int statusCode) {
        return statusCode != 408 && statusCode != 429 && 400 <= statusCode && statusCode < 500;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(final g gVar, final String str, final Exception exc) {
        p pVar = gVar.worker;
        if (pVar != null) {
            pVar.unlock();
        }
        gVar.getConcurrentHandlerHolder().h(new Runnable() { // from class: P9.b
            @Override // java.lang.Runnable
            public final void run() {
                g.s(this.f25715a, str, exc);
            }
        });
    }

    @Override // S8.a
    public void a(final String id2, final Exception cause) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(cause, "cause");
        getConcurrentHandlerHolder().f(new Runnable() { // from class: P9.a
            @Override // java.lang.Runnable
            public final void run() {
                g.r(this.f25712a, id2, cause);
            }
        });
    }

    @Override // S8.a
    public void b(String id2, final ResponseModel responseModel) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(responseModel, "responseModel");
        getConcurrentHandlerHolder().f(new Runnable() { // from class: P9.c
            @Override // java.lang.Runnable
            public final void run() {
                g.t(this.f25718a, responseModel);
            }
        });
    }

    @Override // S8.a
    public void d(String id2, final ResponseModel responseModel) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(responseModel, "responseModel");
        getConcurrentHandlerHolder().f(new Runnable() { // from class: P9.d
            @Override // java.lang.Runnable
            public final void run() {
                g.q(this.f25720a, responseModel);
            }
        });
    }

    /* renamed from: j, reason: from getter */
    public n9.b getConcurrentHandlerHolder() {
        return this.concurrentHandlerHolder;
    }

    /* renamed from: k, reason: from getter */
    public S8.a getCoreCompletionHandler() {
        return this.coreCompletionHandler;
    }

    private void l(final ResponseModel responseModel) {
        for (final String str : I9.k.a(responseModel.getRequestModel())) {
            getConcurrentHandlerHolder().h(new Runnable() { // from class: P9.e
                @Override // java.lang.Runnable
                public final void run() {
                    g.m(this.f25722a, str, responseModel);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(g gVar, String str, ResponseModel responseModel) {
        S8.a coreCompletionHandler = gVar.getCoreCompletionHandler();
        if (coreCompletionHandler != null) {
            Intrinsics.g(str);
            coreCompletionHandler.d(str, responseModel);
        }
    }

    private void n(final ResponseModel responseModel) {
        for (final String str : I9.k.a(responseModel.getRequestModel())) {
            getConcurrentHandlerHolder().h(new Runnable() { // from class: P9.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.o(this.f25725a, str, responseModel);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(g gVar, String str, ResponseModel responseModel) {
        S8.a coreCompletionHandler = gVar.getCoreCompletionHandler();
        if (coreCompletionHandler != null) {
            Intrinsics.g(str);
            coreCompletionHandler.b(str, responseModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(g gVar, ResponseModel responseModel) {
        if (gVar.p(responseModel.getStatusCode())) {
            gVar.u(responseModel);
            gVar.l(responseModel);
            p pVar = gVar.worker;
            if (pVar != null) {
                pVar.unlock();
            }
            p pVar2 = gVar.worker;
            if (pVar2 != null) {
                pVar2.run();
                return;
            }
            return;
        }
        p pVar3 = gVar.worker;
        if (pVar3 != null) {
            pVar3.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(g gVar, String str, Exception exc) {
        S8.a coreCompletionHandler = gVar.getCoreCompletionHandler();
        if (coreCompletionHandler != null) {
            coreCompletionHandler.a(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(g gVar, ResponseModel responseModel) {
        gVar.u(responseModel);
        p pVar = gVar.worker;
        if (pVar != null) {
            pVar.unlock();
        }
        p pVar2 = gVar.worker;
        if (pVar2 != null) {
            pVar2.run();
        }
        gVar.n(responseModel);
    }

    private void u(ResponseModel responseModel) {
        int length;
        String[] strArrA = A9.d.a(responseModel.getRequestModel());
        if (strArrA.length % 50 == 0) {
            length = strArrA.length / 50;
        } else {
            length = (strArrA.length / 50) + 1;
        }
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            this.requestRepository.remove(new B9.a((String[]) ArraysKt.w(strArrA, i10 * 50, Math.min(strArrA.length, i11 * 50))));
            i10 = i11;
        }
    }
}
