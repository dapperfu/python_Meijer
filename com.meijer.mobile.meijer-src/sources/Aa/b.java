package Aa;

import D9.ResponseModel;
import H9.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m9.C15696a;
import org.json.JSONObject;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LAa/b;", "LD9/a;", "LH9/l;", "", "deviceEventStateStorage", "LFa/b;", "requestModelHelper", "<init>", "(LH9/l;LFa/b;)V", "LD9/c;", "responseModel", "", "c", "(LD9/c;)Z", "", "a", "(LD9/c;)V", "LH9/l;", "b", "LFa/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends D9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<String> deviceEventStateStorage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Fa.b requestModelHelper;

    public b(l<String> deviceEventStateStorage, Fa.b requestModelHelper) {
        Intrinsics.j(deviceEventStateStorage, "deviceEventStateStorage");
        Intrinsics.j(requestModelHelper, "requestModelHelper");
        this.deviceEventStateStorage = deviceEventStateStorage;
        this.requestModelHelper = requestModelHelper;
    }

    @Override // D9.a
    public void a(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        try {
            JSONObject jSONObjectH = responseModel.h();
            Intrinsics.g(jSONObjectH);
            String string = jSONObjectH.getJSONObject("deviceEventState").toString();
            Intrinsics.i(string, "toString(...)");
            this.deviceEventStateStorage.set(string);
        } catch (Exception unused) {
        }
    }

    @Override // D9.a
    public boolean c(ResponseModel responseModel) {
        int statusCode;
        Intrinsics.j(responseModel, "responseModel");
        if (C15696a.c(P8.a.f25708d) && 200 <= (statusCode = responseModel.getStatusCode()) && statusCode < 300 && (this.requestModelHelper.a(responseModel.getRequestModel()) || this.requestModelHelper.b(responseModel.getRequestModel()))) {
            JSONObject jSONObjectH = responseModel.h();
            if (jSONObjectH != null ? jSONObjectH.has("deviceEventState") : false) {
                return true;
            }
        }
        return false;
    }
}
