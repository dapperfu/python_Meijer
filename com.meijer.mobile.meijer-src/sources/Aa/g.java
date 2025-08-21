package Aa;

import D9.ResponseModel;
import H9.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0012¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"LAa/g;", "LD9/a;", "", "tokenKey", "LH9/l;", "tokenStorage", "LFa/b;", "requestModelHelper", "<init>", "(Ljava/lang/String;LH9/l;LFa/b;)V", "Lorg/json/JSONObject;", "body", "", "d", "(Lorg/json/JSONObject;)Z", "LD9/c;", "responseModel", "c", "(LD9/c;)Z", "", "a", "(LD9/c;)V", "Ljava/lang/String;", "b", "LH9/l;", "LFa/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class g extends D9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String tokenKey;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<String> tokenStorage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Fa.b requestModelHelper;

    public g(String tokenKey, l<String> tokenStorage, Fa.b requestModelHelper) {
        Intrinsics.j(tokenKey, "tokenKey");
        Intrinsics.j(tokenStorage, "tokenStorage");
        Intrinsics.j(requestModelHelper, "requestModelHelper");
        this.tokenKey = tokenKey;
        this.tokenStorage = tokenStorage;
        this.requestModelHelper = requestModelHelper;
    }

    private boolean d(JSONObject body) {
        return body != null && body.has(this.tokenKey);
    }

    @Override // D9.a
    public void a(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        JSONObject jSONObjectH = responseModel.h();
        try {
            l<String> lVar = this.tokenStorage;
            Intrinsics.g(jSONObjectH);
            lVar.set(jSONObjectH.getString(this.tokenKey));
        } catch (JSONException unused) {
        }
    }

    @Override // D9.a
    public boolean c(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        return this.requestModelHelper.c(responseModel.getRequestModel()) && d(responseModel.h());
    }
}
