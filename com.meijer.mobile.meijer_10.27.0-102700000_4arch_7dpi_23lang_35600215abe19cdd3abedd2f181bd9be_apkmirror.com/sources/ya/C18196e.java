package ya;

import B9.ResponseModel;
import ia.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lya/e;", "LB9/a;", "Lia/l;", "overlayInAppPresenter", "<init>", "(Lia/l;)V", "LB9/c;", "responseModel", "", "c", "(LB9/c;)Z", "", "a", "(LB9/c;)V", "Lia/l;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ya.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18196e extends B9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l overlayInAppPresenter;

    public C18196e(l overlayInAppPresenter) {
        Intrinsics.j(overlayInAppPresenter, "overlayInAppPresenter");
        this.overlayInAppPresenter = overlayInAppPresenter;
    }

    @Override // B9.a
    public void a(ResponseModel responseModel) throws JSONException {
        Intrinsics.j(responseModel, "responseModel");
        JSONObject jSONObjectH = responseModel.h();
        try {
            Intrinsics.g(jSONObjectH);
            JSONObject jSONObject = jSONObjectH.getJSONObject("message");
            String string = jSONObject.getString("html");
            String string2 = jSONObject.getString("campaignId");
            String str = responseModel.getRequestModel().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
            l lVar = this.overlayInAppPresenter;
            Intrinsics.g(string2);
            long timestamp = responseModel.getTimestamp();
            Intrinsics.g(string);
            lVar.e(string2, null, null, str, timestamp, string, null);
        } catch (JSONException unused) {
        }
    }

    @Override // B9.a
    public boolean c(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        JSONObject jSONObjectH = responseModel.h();
        if (jSONObjectH != null) {
            try {
                Intrinsics.g(jSONObjectH);
                return jSONObjectH.getJSONObject("message").has("html");
            } catch (JSONException unused) {
            }
        }
        return false;
    }
}
