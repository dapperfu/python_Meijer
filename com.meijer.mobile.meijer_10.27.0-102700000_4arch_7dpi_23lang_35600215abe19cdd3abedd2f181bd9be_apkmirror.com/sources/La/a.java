package La;

import B9.ResponseModel;
import F9.h;
import j9.C14877b;

/* loaded from: classes4.dex */
public class a extends B9.a {

    /* renamed from: a, reason: collision with root package name */
    private final h f17913a;

    /* renamed from: b, reason: collision with root package name */
    private final C14877b f17914b;

    public a(h hVar, C14877b c14877b) {
        G9.b.c(hVar, "KeyValueStore must not be null!");
        G9.b.c(c14877b, "PredictServiceEndpointProvider must not be null!");
        this.f17913a = hVar;
        this.f17914b = c14877b;
    }

    @Override // B9.a
    public void a(ResponseModel responseModel) {
        this.f17913a.putString("predict_visitor_id", responseModel.e().get("cdv").getValue());
    }

    @Override // B9.a
    public boolean c(ResponseModel responseModel) {
        boolean z10;
        boolean zStartsWith = responseModel.getRequestModel().getUrl().toString().startsWith(this.f17914b.a());
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
