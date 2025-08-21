package Na;

import D9.ResponseModel;
import H9.h;
import l9.C15476b;

/* loaded from: classes4.dex */
public class a extends D9.a {

    /* renamed from: a, reason: collision with root package name */
    private final h f20733a;

    /* renamed from: b, reason: collision with root package name */
    private final C15476b f20734b;

    public a(h hVar, C15476b c15476b) {
        I9.b.c(hVar, "KeyValueStore must not be null!");
        I9.b.c(c15476b, "PredictServiceEndpointProvider must not be null!");
        this.f20733a = hVar;
        this.f20734b = c15476b;
    }

    @Override // D9.a
    public void a(ResponseModel responseModel) {
        this.f20733a.putString("predict_visitor_id", responseModel.e().get("cdv").getValue());
    }

    @Override // D9.a
    public boolean c(ResponseModel responseModel) {
        boolean z10;
        boolean zStartsWith = responseModel.getRequestModel().getUrl().toString().startsWith(this.f20734b.a());
        if (responseModel.e().get("cdv") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!zStartsWith || !z10) {
            return false;
        }
        return true;
    }
}
