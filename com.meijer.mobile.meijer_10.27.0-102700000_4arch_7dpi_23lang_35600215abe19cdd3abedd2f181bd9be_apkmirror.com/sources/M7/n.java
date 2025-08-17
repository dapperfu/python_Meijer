package M7;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b%\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\" \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u001a\u0010\u001c\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001f\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u001a\u0010\"\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b\"\u001a\u0010%\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001b\"\u001a\u0010*\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u001a\u0010-\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)\"\u001a\u00100\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)\"\u001a\u00103\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)¨\u00064"}, d2 = {"", "LM7/a;", "keep", "LM7/b;", "v", "([LM7/a;)LM7/b;", "", "", "u", "(Ljava/lang/Object;)Z", "Lkotlin/text/Regex;", "a", "Lkotlin/text/Regex;", "keyRegex", "", "", "b", "Ljava/util/List;", "o", "()Ljava/util/List;", "generationApiFields", "c", "getModificationApiFields", "modificationApiFields", "d", "LM7/a;", "s", "()LM7/a;", "sessionPropertiesNamespace", "e", "m", "eventPropertiesNamespace", "f", "getFieldsAllowedInGenerationApi", "fieldsAllowedInGenerationApi", "g", "n", "fieldsAllowedInModificationApi", "h", "LM7/b;", "r", "()LM7/b;", "removeNestedJsonObjectAndArrays", "i", "p", "removeAttributeWithExceedingKeySize", "j", "q", "removeAttributesWithInvalidKeys", "k", "t", "trimTooLongStringValues", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final Regex f19056a = new Regex("^[a-z0-9]+(?:\\.[a-z][a-z0-9]*|_[a-z0-9]+)*$");

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f19057b = CollectionsKt.e("duration");

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f19058c = CollectionsKt.p("url.full", "exception.stack_trace");

    /* renamed from: d, reason: collision with root package name */
    private static final a f19059d = new a() { // from class: M7.e
        @Override // M7.a
        public final boolean a(JsonAttribute jsonAttribute) {
            return n.A(jsonAttribute);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final a f19060e = new a() { // from class: M7.f
        @Override // M7.a
        public final boolean a(JsonAttribute jsonAttribute) {
            return n.j(jsonAttribute);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final a f19061f = new a() { // from class: M7.g
        @Override // M7.a
        public final boolean a(JsonAttribute jsonAttribute) {
            return n.k(jsonAttribute);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final a f19062g = new a() { // from class: M7.h
        @Override // M7.a
        public final boolean a(JsonAttribute jsonAttribute) {
            return n.l(jsonAttribute);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f19063h = new b() { // from class: M7.i
        @Override // M7.b
        public final JsonAttribute a(JsonAttribute jsonAttribute) {
            return n.z(jsonAttribute);
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private static final b f19064i = new b() { // from class: M7.j
        @Override // M7.b
        public final JsonAttribute a(JsonAttribute jsonAttribute) {
            return n.x(jsonAttribute);
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private static final b f19065j = new b() { // from class: M7.k
        @Override // M7.b
        public final JsonAttribute a(JsonAttribute jsonAttribute) {
            return n.y(jsonAttribute);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final b f19066k = new b() { // from class: M7.l
        @Override // M7.b
        public final JsonAttribute a(JsonAttribute jsonAttribute) {
            return n.B(jsonAttribute);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(JsonAttribute jsonAttribute) {
        Intrinsics.j(jsonAttribute, "jsonAttribute");
        return StringsKt.W(jsonAttribute.getKey(), "session_properties.", false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute B(JsonAttribute jsonAttribute) {
        Intrinsics.j(jsonAttribute, "jsonAttribute");
        if (!u(jsonAttribute.getValue())) {
            String string = jsonAttribute.getValue().toString();
            if (string.length() >= 5000) {
                x8.f.a("dtxEnrichment", "sanitation: value of key '" + jsonAttribute.getKey() + "' is too long and thus is trimmed; original length: " + string.length() + "; ");
                return new JsonAttribute(jsonAttribute.getKey(), StringsKt.J1(string, 5000));
            }
        }
        return jsonAttribute;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(JsonAttribute jsonAttribute) {
        Intrinsics.j(jsonAttribute, "jsonAttribute");
        return StringsKt.W(jsonAttribute.getKey(), "event_properties.", false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(JsonAttribute jsonAttribute) {
        Intrinsics.j(jsonAttribute, "jsonAttribute");
        return f19057b.contains(jsonAttribute.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(JsonAttribute jsonAttribute) {
        Intrinsics.j(jsonAttribute, "jsonAttribute");
        return f19058c.contains(jsonAttribute.getKey());
    }

    public static final a m() {
        return f19060e;
    }

    public static final a n() {
        return f19062g;
    }

    public static final List<String> o() {
        return f19057b;
    }

    public static final b p() {
        return f19064i;
    }

    public static final b q() {
        return f19065j;
    }

    public static final b r() {
        return f19063h;
    }

    public static final a s() {
        return f19059d;
    }

    public static final b t() {
        return f19066k;
    }

    private static final boolean u(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Boolean);
    }

    public static final b v(final a[] keep) {
        Intrinsics.j(keep, "keep");
        return new b() { // from class: M7.m
            @Override // M7.b
            public final JsonAttribute a(JsonAttribute jsonAttribute) {
                return n.w(keep, jsonAttribute);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute w(a[] aVarArr, JsonAttribute jsonAttribute) {
        Intrinsics.j(jsonAttribute, "jsonAttribute");
        for (a aVar : aVarArr) {
            if (aVar.a(jsonAttribute)) {
                return jsonAttribute;
            }
        }
        x8.f.a("dtxEnrichment", "sanitation: key '" + jsonAttribute.getKey() + "' is outside of allowed namespace and thus dropped");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute x(JsonAttribute jsonAttribute) {
        Intrinsics.j(jsonAttribute, "jsonAttribute");
        if (jsonAttribute.getKey().length() <= 100) {
            return jsonAttribute;
        }
        x8.f.a("dtxEnrichment", "sanitation: dropped a key because it was too long; limit: 100; actual length: " + jsonAttribute.getKey().length() + "; key: '" + jsonAttribute.getKey() + '\'');
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute y(JsonAttribute jsonAttribute) {
        Intrinsics.j(jsonAttribute, "jsonAttribute");
        if (f19056a.i(jsonAttribute.getKey()) != null) {
            return jsonAttribute;
        }
        x8.f.a("dtxEnrichment", "sanitation: dropped a key because it does not conform to expected pattern; key: " + jsonAttribute.getKey());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAttribute z(JsonAttribute jsonAttribute) {
        Intrinsics.j(jsonAttribute, "jsonAttribute");
        if (!(jsonAttribute.getValue() instanceof JSONObject) && !(jsonAttribute.getValue() instanceof JSONArray)) {
            return jsonAttribute;
        }
        x8.f.a("dtxEnrichment", "sanitation: key '" + jsonAttribute.getKey() + "' is a nested object or array and thus dropped");
        return null;
    }
}
