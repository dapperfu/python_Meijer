package wa;

import B9.ResponseModel;
import F9.l;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import w9.f;
import ya.C18198g;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ#\u0010\"\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00062\n\u0010!\u001a\u00060\u001fj\u0002` H\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010+R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lwa/a;", "LQ8/a;", "coreCompletionHandler", "Lw9/f;", "restClient", "LF9/l;", "", "contactTokenStorage", "pushTokenStorage", "Lya/g;", "tokenResponseHandler", "LDa/b;", "requestModelHelper", "Lwa/c;", "requestModelFactory", "<init>", "(LQ8/a;Lw9/f;LF9/l;LF9/l;Lya/g;LDa/b;Lwa/c;)V", "Ly9/c;", "requestModel", "", "c", "(Ly9/c;)Z", "", "e", "()V", PreferencesHelper.PREF_ID, "LB9/c;", "responseModel", "d", "(Ljava/lang/String;LB9/c;)V", "b", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "a", "(Ljava/lang/String;Ljava/lang/Exception;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "LQ8/a;", "Lw9/f;", "LF9/l;", "Lya/g;", "f", "LDa/b;", "g", "Lwa/c;", "h", "LB9/c;", "originalResponseModel", "i", "I", "retryCount", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wa.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17804a implements Q8.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Q8.a coreCompletionHandler;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f restClient;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l<String> contactTokenStorage;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l<String> pushTokenStorage;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private C18198g tokenResponseHandler;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Da.b requestModelHelper;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c requestModelFactory;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ResponseModel originalResponseModel;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int retryCount;

    private final void e() {
        this.retryCount = 0;
        this.originalResponseModel = null;
    }

    public C17804a(Q8.a coreCompletionHandler, f restClient, l<String> contactTokenStorage, l<String> pushTokenStorage, C18198g tokenResponseHandler, Da.b requestModelHelper, c requestModelFactory) {
        Intrinsics.j(coreCompletionHandler, "coreCompletionHandler");
        Intrinsics.j(restClient, "restClient");
        Intrinsics.j(contactTokenStorage, "contactTokenStorage");
        Intrinsics.j(pushTokenStorage, "pushTokenStorage");
        Intrinsics.j(tokenResponseHandler, "tokenResponseHandler");
        Intrinsics.j(requestModelHelper, "requestModelHelper");
        Intrinsics.j(requestModelFactory, "requestModelFactory");
        this.coreCompletionHandler = coreCompletionHandler;
        this.restClient = restClient;
        this.contactTokenStorage = contactTokenStorage;
        this.pushTokenStorage = pushTokenStorage;
        this.tokenResponseHandler = tokenResponseHandler;
        this.requestModelHelper = requestModelHelper;
        this.requestModelFactory = requestModelFactory;
    }

    @Override // Q8.a
    public void a(String id2, Exception cause) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(cause, "cause");
        e();
        this.coreCompletionHandler.a(id2, cause);
    }

    @Override // Q8.a
    public void b(String id2, ResponseModel responseModel) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(responseModel, "responseModel");
        if (this.retryCount >= 3 || c(responseModel.getRequestModel())) {
            ResponseModel responseModel2 = this.originalResponseModel;
            e();
            Q8.a aVar = this.coreCompletionHandler;
            Intrinsics.g(responseModel2);
            aVar.b(id2, ResponseModel.c(responseModel2, 418, null, null, null, null, 0L, null, 126, null));
            return;
        }
        if (responseModel.getStatusCode() != 401 || !this.requestModelHelper.c(responseModel.getRequestModel())) {
            e();
            this.coreCompletionHandler.b(id2, responseModel);
        } else {
            this.pushTokenStorage.remove();
            this.originalResponseModel = responseModel;
            this.restClient.c(this.requestModelFactory.e(), this);
        }
    }

    @Override // Q8.a
    public void d(String id2, ResponseModel responseModel) throws InterruptedException {
        Intrinsics.j(id2, "id");
        Intrinsics.j(responseModel, "responseModel");
        if (this.retryCount >= 3) {
            ResponseModel responseModel2 = this.originalResponseModel;
            e();
            Q8.a aVar = this.coreCompletionHandler;
            Intrinsics.g(responseModel2);
            aVar.b(id2, ResponseModel.c(responseModel2, 418, null, null, null, null, 0L, null, 126, null));
            return;
        }
        if (!c(responseModel.getRequestModel())) {
            e();
            this.coreCompletionHandler.d(id2, responseModel);
            return;
        }
        this.tokenResponseHandler.b(responseModel);
        Thread.sleep(500L);
        this.retryCount++;
        f fVar = this.restClient;
        ResponseModel responseModel3 = this.originalResponseModel;
        Intrinsics.g(responseModel3);
        fVar.c(responseModel3.getRequestModel(), this);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(C17804a.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type com.emarsys.mobileengage.request.CoreCompletionHandlerRefreshTokenProxy");
        C17804a c17804a = (C17804a) other;
        if (Intrinsics.e(this.coreCompletionHandler, c17804a.coreCompletionHandler) && Intrinsics.e(this.restClient, c17804a.restClient) && Intrinsics.e(this.contactTokenStorage, c17804a.contactTokenStorage)) {
            return Intrinsics.e(this.pushTokenStorage, c17804a.pushTokenStorage);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.coreCompletionHandler.hashCode() * 31) + this.restClient.hashCode()) * 31) + this.contactTokenStorage.hashCode()) * 31) + this.pushTokenStorage.hashCode();
    }

    private final boolean c(y9.c requestModel) {
        String path = requestModel.getUrl().getPath();
        Intrinsics.i(path, "getPath(...)");
        return StringsKt.G(path, "contact-token", false, 2, null);
    }
}
