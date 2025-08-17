package O5;

import M5.RuleConsequence;
import Q5.t;
import io.constructor.data.local.PreferencesHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\nB1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LO5/f;", "", "", PreferencesHelper.PREF_ID, "type", "", "detail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "LM5/m;", "a", "()LM5/m;", "Ljava/lang/String;", "b", "c", "Ljava/util/Map;", "d", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> detail;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"LO5/f$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "LO5/f;", "a", "(Lorg/json/JSONObject;)LO5/f;", "", "KEY_DETAIL", "Ljava/lang/String;", "KEY_ID", "KEY_TYPE", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: O5.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(JSONObject jsonObject) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (jsonObject == null) {
                return null;
            }
            String strOptString = jsonObject.optString(PreferencesHelper.PREF_ID);
            Intrinsics.i(strOptString, "jsonObject.optString(KEY_ID)");
            String strOptString2 = jsonObject.optString("type");
            Intrinsics.i(strOptString2, "jsonObject.optString(KEY_TYPE)");
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("detail");
            return new f(strOptString, strOptString2, jSONObjectOptJSONObject != null ? L5.h.c(jSONObjectOptJSONObject) : null, defaultConstructorMarker);
        }

        private Companion() {
        }
    }

    public /* synthetic */ f(String str, String str2, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map);
    }

    private f(String str, String str2, Map<String, ? extends Object> map) {
        this.id = str;
        this.type = str2;
        this.detail = map;
    }

    public final /* synthetic */ RuleConsequence a() {
        if (this.id.length() == 0) {
            t.f("MobileCore", "JSONConsequence", "Unable to find required field \"id\" in rules consequence.", new Object[0]);
            return null;
        }
        if (this.type.length() == 0) {
            t.f("MobileCore", "JSONConsequence", "Unable to find required field \"type\" in rules consequence.", new Object[0]);
            return null;
        }
        Map<String, Object> map = this.detail;
        if (map != null && !map.isEmpty()) {
            return new RuleConsequence(this.id, this.type, this.detail);
        }
        t.f("MobileCore", "JSONConsequence", "Unable to find required field \"detail\" in rules consequence.", new Object[0]);
        return null;
    }
}
