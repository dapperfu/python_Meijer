package ya;

import B9.ResponseModel;
import java.util.Arrays;
import k9.C15125a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import na.ButtonClicked;
import oa.C16008a;
import org.json.JSONArray;
import org.json.JSONObject;
import qa.C16486a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0013B7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"Lya/c;", "LB9/a;", "Le9/c;", "Loa/a;", "Le9/d;", "displayedIamRepository", "Lna/a;", "buttonClickedRepository", "LDa/b;", "requestModelHelper", "<init>", "(Le9/c;Le9/c;LDa/b;)V", "LB9/c;", "responseModel", "", "d", "(LB9/c;)Z", "c", "", "a", "(LB9/c;)V", "Le9/c;", "b", "LDa/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ya.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18194c extends B9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e9.c<C16008a, e9.d> displayedIamRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e9.c<ButtonClicked, e9.d> buttonClickedRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Da.b requestModelHelper;

    public C18194c(e9.c<C16008a, e9.d> displayedIamRepository, e9.c<ButtonClicked, e9.d> buttonClickedRepository, Da.b requestModelHelper) {
        Intrinsics.j(displayedIamRepository, "displayedIamRepository");
        Intrinsics.j(buttonClickedRepository, "buttonClickedRepository");
        Intrinsics.j(requestModelHelper, "requestModelHelper");
        this.displayedIamRepository = displayedIamRepository;
        this.buttonClickedRepository = buttonClickedRepository;
        this.requestModelHelper = requestModelHelper;
    }

    private final boolean d(ResponseModel responseModel) {
        return this.requestModelHelper.a(responseModel.getRequestModel());
    }

    @Override // B9.a
    public void a(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        JSONObject jSONObjectH = responseModel.h();
        Intrinsics.g(jSONObjectH);
        JSONArray jSONArrayOptJSONArray = jSONObjectH.optJSONArray("oldCampaigns");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            String[] strArr = new String[length];
            int length2 = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length2; i10++) {
                strArr[i10] = jSONArrayOptJSONArray.optString(i10);
            }
            this.displayedIamRepository.remove(new C16486a((String[]) Arrays.copyOf(strArr, length)));
            this.buttonClickedRepository.remove(new C16486a((String[]) Arrays.copyOf(strArr, length)));
        }
    }

    @Override // B9.a
    public boolean c(ResponseModel responseModel) {
        JSONObject jSONObjectH;
        JSONArray jSONArrayOptJSONArray;
        Intrinsics.j(responseModel, "responseModel");
        return !C15125a.c(N8.a.f21473d) && (jSONObjectH = responseModel.h()) != null && jSONObjectH.has("oldCampaigns") && d(responseModel) && (jSONArrayOptJSONArray = jSONObjectH.optJSONArray("oldCampaigns")) != null && jSONArrayOptJSONArray.length() > 0;
    }
}
