package N9;

import B9.ResponseModel;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import z9.C18403a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0012¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0012¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0012¢\u0006\u0004\b\u0018\u0010\u0011J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ#\u0010!\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b!\u0010#R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"LN9/g;", "LQ8/a;", "LN9/p;", "worker", "Le9/c;", "Ly9/c;", "Le9/d;", "requestRepository", "Ll9/b;", "concurrentHandlerHolder", "coreCompletionHandler", "<init>", "(LN9/p;Le9/c;Ll9/b;LQ8/a;)V", "LB9/c;", "responseModel", "", "u", "(LB9/c;)V", "", "statusCode", "", "p", "(I)Z", "n", "l", "", PreferencesHelper.PREF_ID, "d", "(Ljava/lang/String;LB9/c;)V", "b", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "a", "(Ljava/lang/String;Ljava/lang/Exception;)V", "LN9/p;", "Le9/c;", "c", "Ll9/b;", "j", "()Ll9/b;", "setConcurrentHandlerHolder", "(Ll9/b;)V", "LQ8/a;", "k", "()LQ8/a;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class g implements Q8.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private p worker;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e9.c<y9.c, e9.d> requestRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private l9.b concurrentHandlerHolder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Q8.a coreCompletionHandler;

    public g(p pVar, e9.c<y9.c, e9.d> requestRepository, l9.b concurrentHandlerHolder, Q8.a aVar) {
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
        gVar.getConcurrentHandlerHolder().h(new Runnable() { // from class: N9.b
            @Override // java.lang.Runnable
            public final void run() {
                g.s(this.f21480a, str, exc);
            }
        });
    }

    @Override // Q8.a
    public void a(final String id2, final Exception cause) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(cause, "cause");
        getConcurrentHandlerHolder().f(new Runnable() { // from class: N9.a
            @Override // java.lang.Runnable
            public final void run() {
                g.r(this.f21477a, id2, cause);
            }
        });
    }

    @Override // Q8.a
    public void b(String id2, final ResponseModel responseModel) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(responseModel, "responseModel");
        getConcurrentHandlerHolder().f(new Runnable() { // from class: N9.d
            @Override // java.lang.Runnable
            public final void run() {
                g.q(this.f21485a, responseModel);
            }
        });
    }

    @Override // Q8.a
    public void d(String id2, final ResponseModel responseModel) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(responseModel, "responseModel");
        getConcurrentHandlerHolder().f(new Runnable() { // from class: N9.c
            @Override // java.lang.Runnable
            public final void run() {
                g.t(this.f21483a, responseModel);
            }
        });
    }

    /* renamed from: j, reason: from getter */
    public l9.b getConcurrentHandlerHolder() {
        return this.concurrentHandlerHolder;
    }

    /* renamed from: k, reason: from getter */
    public Q8.a getCoreCompletionHandler() {
        return this.coreCompletionHandler;
    }

    private void l(final ResponseModel responseModel) {
        for (final String str : G9.k.a(responseModel.getRequestModel())) {
            getConcurrentHandlerHolder().h(new Runnable() { // from class: N9.e
                @Override // java.lang.Runnable
                public final void run() {
                    g.m(this.f21487a, str, responseModel);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(g gVar, String str, ResponseModel responseModel) {
        Q8.a coreCompletionHandler = gVar.getCoreCompletionHandler();
        if (coreCompletionHandler != null) {
            Intrinsics.g(str);
            coreCompletionHandler.b(str, responseModel);
        }
    }

    private void n(final ResponseModel responseModel) {
        for (final String str : G9.k.a(responseModel.getRequestModel())) {
            getConcurrentHandlerHolder().h(new Runnable() { // from class: N9.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.o(this.f21490a, str, responseModel);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(g gVar, String str, ResponseModel responseModel) {
        Q8.a coreCompletionHandler = gVar.getCoreCompletionHandler();
        if (coreCompletionHandler != null) {
            Intrinsics.g(str);
            coreCompletionHandler.d(str, responseModel);
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
        Q8.a coreCompletionHandler = gVar.getCoreCompletionHandler();
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
        String[] strArrA = y9.d.a(responseModel.getRequestModel());
        if (strArrA.length % 50 == 0) {
            length = strArrA.length / 50;
        } else {
            length = (strArrA.length / 50) + 1;
        }
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            this.requestRepository.remove(new C18403a((String[]) ArraysKt.w(strArrA, i10 * 50, Math.min(strArrA.length, i11 * 50))));
            i10 = i11;
        }
    }
}
