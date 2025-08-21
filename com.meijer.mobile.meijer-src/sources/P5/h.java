package P5;

import N5.LaunchRule;
import N5.RuleConsequence;
import R5.t;
import com.adobe.marketing.mobile.AbstractC6579m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LP5/h;", "", "Lorg/json/JSONObject;", "condition", "Lorg/json/JSONArray;", "consequences", "<init>", "(Lorg/json/JSONObject;Lorg/json/JSONArray;)V", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "LN5/b;", "a", "(Lcom/adobe/marketing/mobile/m;)LN5/b;", "Lorg/json/JSONObject;", "getCondition", "()Lorg/json/JSONObject;", "b", "Lorg/json/JSONArray;", "getConsequences", "()Lorg/json/JSONArray;", "c", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final JSONObject condition;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final JSONArray consequences;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"LP5/h$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "LP5/h;", "a", "(Lorg/json/JSONObject;)LP5/h;", "", "KEY_CONDITION", "Ljava/lang/String;", "KEY_CONSEQUENCES", "LOG_TAG", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: P5.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(JSONObject jsonObject) throws JSONException {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (jsonObject == null) {
                return null;
            }
            JSONObject jSONObject = jsonObject.getJSONObject("condition");
            JSONArray jSONArray = jsonObject.getJSONArray("consequences");
            if (jSONObject != null && jSONArray != null) {
                return new h(jSONObject, jSONArray, defaultConstructorMarker);
            }
            t.b("LaunchRulesEngine", "JSONRule", "Failed to extract [rule.condition] or [rule.consequences].", new Object[0]);
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LN5/m;", "a", "(Ljava/lang/Object;)LN5/m;"}, k = 3, mv = {1, 5, 1})
    static final class b extends Lambda implements Function1<Object, RuleConsequence> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f25624f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RuleConsequence invoke(Object it) throws Exception {
            RuleConsequence ruleConsequenceA;
            Intrinsics.j(it, "it");
            f fVarA = f.INSTANCE.a(it instanceof JSONObject ? (JSONObject) it : null);
            if (fVarA == null || (ruleConsequenceA = fVarA.a()) == null) {
                throw new Exception();
            }
            return ruleConsequenceA;
        }
    }

    public /* synthetic */ h(JSONObject jSONObject, JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, jSONArray);
    }

    private h(JSONObject jSONObject, JSONArray jSONArray) {
        this.condition = jSONObject;
        this.consequences = jSONArray;
    }

    public final /* synthetic */ LaunchRule a(AbstractC6579m extensionApi) {
        Intrinsics.j(extensionApi, "extensionApi");
        e eVarA = e.INSTANCE.a(this.condition, extensionApi);
        Q5.e eVarA2 = eVarA != null ? eVarA.a() : null;
        if (eVarA2 != null) {
            return new LaunchRule(eVarA2, M5.h.a(this.consequences, b.f25624f));
        }
        t.b("LaunchRulesEngine", "JSONRule", "Failed to build LaunchRule from JSON, the [rule.condition] can't be parsed to Evaluable.", new Object[0]);
        return null;
    }
}
