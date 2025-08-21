package Na;

import D9.ResponseModel;
import H9.h;
import java.net.HttpCookie;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l9.C15476b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LNa/b;", "LD9/a;", "LH9/h;", "keyValueStore", "Ll9/b;", "predictServiceEndpointProvider", "<init>", "(LH9/h;Ll9/b;)V", "LD9/c;", "responseModel", "", "c", "(LD9/c;)Z", "", "a", "(LD9/c;)V", "LH9/h;", "b", "Ll9/b;", "predict_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends D9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h keyValueStore;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15476b predictServiceEndpointProvider;

    public b(h keyValueStore, C15476b predictServiceEndpointProvider) {
        Intrinsics.j(keyValueStore, "keyValueStore");
        Intrinsics.j(predictServiceEndpointProvider, "predictServiceEndpointProvider");
        this.keyValueStore = keyValueStore;
        this.predictServiceEndpointProvider = predictServiceEndpointProvider;
    }

    @Override // D9.a
    public void a(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        HttpCookie httpCookie = responseModel.e().get("xp");
        Intrinsics.g(httpCookie);
        this.keyValueStore.putString("xp", httpCookie.getValue());
    }

    @Override // D9.a
    public boolean c(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        String string = responseModel.getRequestModel().getUrl().toString();
        Intrinsics.i(string, "toString(...)");
        return StringsKt.W(string, this.predictServiceEndpointProvider.a(), false, 2, null) && (responseModel.e().get("xp") != null);
    }
}
