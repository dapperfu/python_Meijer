package P5;

import N5.LaunchRule;
import R5.t;
import com.adobe.marketing.mobile.AbstractC6579m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LP5/j;", "", "<init>", "()V", "", "jsonString", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "", "LN5/b;", "a", "(Ljava/lang/String;Lcom/adobe/marketing/mobile/m;)Ljava/util/List;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f25629a = new j();

    @JvmStatic
    public static final List<LaunchRule> a(String jsonString, AbstractC6579m extensionApi) throws JSONException {
        i iVarA;
        Intrinsics.j(jsonString, "jsonString");
        Intrinsics.j(extensionApi, "extensionApi");
        try {
            Object objNextValue = new JSONTokener(jsonString).nextValue();
            if (!(objNextValue instanceof JSONObject) || (iVarA = i.INSTANCE.a((JSONObject) objNextValue)) == null) {
                return null;
            }
            return iVarA.a(extensionApi);
        } catch (Exception unused) {
            t.b("LaunchRulesEngine", "JSONRulesParser", "Failed to parse launch rules JSON: \n " + jsonString, new Object[0]);
        }
        return null;
    }

    private j() {
    }
}
