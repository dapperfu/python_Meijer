package O5;

import com.adobe.marketing.mobile.AbstractC6454m;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u0000 -2\u00020\u0001:\u0001\u001cB\u008d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0014R!\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b%\u0010!R-\u0010\u000b\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\"\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b*\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u0014¨\u0006."}, d2 = {"LO5/g;", "", "", "logic", "", "LO5/e;", "conditions", "key", "matcher", "values", "", "events", "value", "", "from", "to", "searchType", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "d", "f", "j", "g", "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "h", "Ljava/lang/Long;", "()Ljava/lang/Long;", "k", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: O5.g, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class JSONDefinition {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String logic;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<e> conditions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String key;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String matcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Object> values;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Map<String, Object>> events;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object value;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long from;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long to;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String searchType;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0014\u0010 \u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0017¨\u0006!"}, d2 = {"LO5/g$a;", "", "<init>", "()V", "Lorg/json/JSONArray;", "jsonArray", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "", "LO5/e;", "a", "(Lorg/json/JSONArray;Lcom/adobe/marketing/mobile/m;)Ljava/util/List;", "c", "(Lorg/json/JSONArray;)Ljava/util/List;", "", "", "d", "Lorg/json/JSONObject;", "jsonObject", "LO5/g;", "b", "(Lorg/json/JSONObject;Lcom/adobe/marketing/mobile/m;)LO5/g;", "DEFINITION_KEY_CONDITIONS", "Ljava/lang/String;", "DEFINITION_KEY_EVENTS", "DEFINITION_KEY_FROM", "DEFINITION_KEY_KEY", "DEFINITION_KEY_LOGIC", "DEFINITION_KEY_MATCHER", "DEFINITION_KEY_SEARCH_TYPE", "DEFINITION_KEY_TO", "DEFINITION_KEY_VALUE", "DEFINITION_KEY_VALUES", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: O5.g$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LO5/e;", "a", "(Ljava/lang/Object;)LO5/e;"}, k = 3, mv = {1, 5, 1})
        /* renamed from: O5.g$a$a, reason: collision with other inner class name */
        static final class C0376a extends Lambda implements Function1<Object, e> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC6454m f23278f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0376a(AbstractC6454m abstractC6454m) {
                super(1);
                this.f23278f = abstractC6454m;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e invoke(Object it) throws JSONException {
                Intrinsics.j(it, "it");
                e eVarA = e.INSTANCE.a(it instanceof JSONObject ? (JSONObject) it : null, this.f23278f);
                if (eVarA != null) {
                    return eVarA;
                }
                throw new JSONException("Unsupported [rule.condition] JSON format: " + it + ' ');
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: O5.g$a$b */
        static final class b extends Lambda implements Function1<Object, Object> {

            /* renamed from: f, reason: collision with root package name */
            public static final b f23279f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object it) {
                Intrinsics.j(it, "it");
                return it;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "", "a", "(Ljava/lang/Object;)Ljava/util/Map;"}, k = 3, mv = {1, 5, 1})
        /* renamed from: O5.g$a$c */
        static final class c extends Lambda implements Function1<Object, Map<String, ? extends Object>> {

            /* renamed from: f, reason: collision with root package name */
            public static final c f23280f = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<String, Object> invoke(Object it) throws JSONException {
                Map<String, Object> mapC;
                Intrinsics.j(it, "it");
                JSONObject jSONObject = it instanceof JSONObject ? (JSONObject) it : null;
                if (jSONObject != null && (mapC = L5.h.c(jSONObject)) != null) {
                    return mapC;
                }
                throw new JSONException("Unsupported [rule.condition.historical.events] JSON format: " + it + ' ');
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final List<e> a(JSONArray jsonArray, AbstractC6454m extensionApi) {
            if (jsonArray != null) {
                return L5.h.a(jsonArray, new C0376a(extensionApi));
            }
            return null;
        }

        private final List<Object> c(JSONArray jsonArray) {
            if (jsonArray != null) {
                return L5.h.a(jsonArray, b.f23279f);
            }
            return null;
        }

        private final List<Map<String, Object>> d(JSONArray jsonArray) {
            if (jsonArray != null) {
                return L5.h.a(jsonArray, c.f23280f);
            }
            return null;
        }

        public final /* synthetic */ JSONDefinition b(JSONObject jsonObject, AbstractC6454m extensionApi) {
            Intrinsics.j(jsonObject, "jsonObject");
            Intrinsics.j(extensionApi, "extensionApi");
            Object objOpt = jsonObject.opt("logic");
            String str = objOpt instanceof String ? (String) objOpt : null;
            List<e> listA = a(jsonObject.optJSONArray("conditions"), extensionApi);
            Object objOpt2 = jsonObject.opt("key");
            String str2 = objOpt2 instanceof String ? (String) objOpt2 : null;
            Object objOpt3 = jsonObject.opt("matcher");
            String str3 = objOpt3 instanceof String ? (String) objOpt3 : null;
            List<Object> listC = c(jsonObject.optJSONArray("values"));
            List<Map<String, Object>> listD = d(jsonObject.optJSONArray("events"));
            Object objOpt4 = jsonObject.opt("value");
            Object objOpt5 = jsonObject.opt("from");
            Long l10 = objOpt5 instanceof Long ? (Long) objOpt5 : null;
            Object objOpt6 = jsonObject.opt("to");
            Long l11 = objOpt6 instanceof Long ? (Long) objOpt6 : null;
            Object objOpt7 = jsonObject.opt("searchType");
            return new JSONDefinition(str, listA, str2, str3, listC, listD, objOpt4, l10, l11, objOpt7 instanceof String ? (String) objOpt7 : null);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JSONDefinition)) {
            return false;
        }
        JSONDefinition jSONDefinition = (JSONDefinition) other;
        return Intrinsics.e(this.logic, jSONDefinition.logic) && Intrinsics.e(this.conditions, jSONDefinition.conditions) && Intrinsics.e(this.key, jSONDefinition.key) && Intrinsics.e(this.matcher, jSONDefinition.matcher) && Intrinsics.e(this.values, jSONDefinition.values) && Intrinsics.e(this.events, jSONDefinition.events) && Intrinsics.e(this.value, jSONDefinition.value) && Intrinsics.e(this.from, jSONDefinition.from) && Intrinsics.e(this.to, jSONDefinition.to) && Intrinsics.e(this.searchType, jSONDefinition.searchType);
    }

    public final List<e> a() {
        return this.conditions;
    }

    public final List<Map<String, Object>> b() {
        return this.events;
    }

    /* renamed from: c, reason: from getter */
    public final Long getFrom() {
        return this.from;
    }

    /* renamed from: d, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: e, reason: from getter */
    public final String getLogic() {
        return this.logic;
    }

    /* renamed from: f, reason: from getter */
    public final String getMatcher() {
        return this.matcher;
    }

    /* renamed from: g, reason: from getter */
    public final String getSearchType() {
        return this.searchType;
    }

    /* renamed from: h, reason: from getter */
    public final Long getTo() {
        return this.to;
    }

    public int hashCode() {
        String str = this.logic;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<e> list = this.conditions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.key;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.matcher;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Object> list2 = this.values;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Map<String, Object>> list3 = this.events;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Object obj = this.value;
        int iHashCode7 = (iHashCode6 + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l10 = this.from;
        int iHashCode8 = (iHashCode7 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.to;
        int iHashCode9 = (iHashCode8 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.searchType;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final List<Object> j() {
        return this.values;
    }

    public String toString() {
        return "JSONDefinition(logic=" + this.logic + ", conditions=" + this.conditions + ", key=" + this.key + ", matcher=" + this.matcher + ", values=" + this.values + ", events=" + this.events + ", value=" + this.value + ", from=" + this.from + ", to=" + this.to + ", searchType=" + this.searchType + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONDefinition(String str, List<? extends e> list, String str2, String str3, List<? extends Object> list2, List<? extends Map<String, ? extends Object>> list3, Object obj, Long l10, Long l11, String str4) {
        this.logic = str;
        this.conditions = list;
        this.key = str2;
        this.matcher = str3;
        this.values = list2;
        this.events = list3;
        this.value = obj;
        this.from = l10;
        this.to = l11;
        this.searchType = str4;
    }
}
