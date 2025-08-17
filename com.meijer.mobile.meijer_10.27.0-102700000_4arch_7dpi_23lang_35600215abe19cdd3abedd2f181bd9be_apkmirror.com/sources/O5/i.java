package O5;

import M5.LaunchRule;
import Q5.t;
import com.adobe.marketing.mobile.AbstractC6454m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LO5/i;", "", "", "version", "Lorg/json/JSONArray;", "jsonArray", "<init>", "(Ljava/lang/String;Lorg/json/JSONArray;)V", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "", "LM5/b;", "a", "(Lcom/adobe/marketing/mobile/m;)Ljava/util/List;", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "b", "Lorg/json/JSONArray;", "getJsonArray", "()Lorg/json/JSONArray;", "c", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String version;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final JSONArray jsonArray;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"LO5/i$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "LO5/i;", "a", "(Lorg/json/JSONObject;)LO5/i;", "", "KEY_RULES", "Ljava/lang/String;", "KEY_VERSION", "LOG_TAG", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: O5.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final i a(JSONObject jsonObject) {
            Intrinsics.j(jsonObject, "jsonObject");
            String version = jsonObject.optString("version", "0");
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("rules");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (jSONArrayOptJSONArray == null) {
                t.b("LaunchRulesEngine", "JSONRuleRoot", "Failed to extract [launch_json.rules]", new Object[0]);
                return null;
            }
            Intrinsics.i(version, "version");
            return new i(version, jSONArrayOptJSONArray, defaultConstructorMarker);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LM5/b;", "a", "(Ljava/lang/Object;)LM5/b;"}, k = 3, mv = {1, 5, 1})
    static final class b extends Lambda implements Function1<Object, LaunchRule> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC6454m f23288f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC6454m abstractC6454m) {
            super(1);
            this.f23288f = abstractC6454m;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LaunchRule invoke(Object it) throws Exception {
            LaunchRule launchRuleA;
            Intrinsics.j(it, "it");
            h hVarA = h.INSTANCE.a(it instanceof JSONObject ? (JSONObject) it : null);
            if (hVarA == null || (launchRuleA = hVarA.a(this.f23288f)) == null) {
                throw new Exception();
            }
            return launchRuleA;
        }
    }

    public /* synthetic */ i(String str, JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jSONArray);
    }

    private i(String str, JSONArray jSONArray) {
        this.version = str;
        this.jsonArray = jSONArray;
    }

    public final /* synthetic */ List a(AbstractC6454m extensionApi) {
        Intrinsics.j(extensionApi, "extensionApi");
        return L5.h.a(this.jsonArray, new b(extensionApi));
    }
}
