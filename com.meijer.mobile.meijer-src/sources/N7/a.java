package N7;

import M7.EnrichedJsonContainer;
import M7.EnrichmentAttribute;
import M7.j;
import O7.JsonAttribute;
import O7.b;
import O7.d;
import O7.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import z8.f;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\u0004*\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0014\u0010*\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020!0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00103R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00108R\u0014\u0010<\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010;¨\u0006="}, d2 = {"LN7/a;", "", "LM7/f;", "baseJsonContainer", "", "isSessionPropertiesEvent", "<init>", "(LM7/f;Z)V", "LO7/c;", "jsonAttribute", "", "j", "(LO7/c;)V", "i", "l", "()V", "", "key", "b", "(Ljava/lang/String;)V", "sanitizedAttribute", "a", "k", "(Ljava/lang/String;LO7/c;)V", "Lorg/json/JSONObject;", "jsonObject", "f", "(Ljava/lang/String;Lorg/json/JSONObject;)Z", "fromJson", "d", "(LO7/c;Lorg/json/JSONObject;)Z", "modifiedJson", "", "LM7/g;", "c", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)Ljava/util/List;", "e", "(Ljava/lang/String;)Z", "h", "(Lorg/json/JSONObject;)LM7/f;", "Z", "Lorg/json/JSONObject;", "baseJson", "", "Ljava/util/List;", "overriddenAttributes", "droppedAttributes", "", "I", "addedAttributes", "LO7/a;", "LO7/a;", "allowedNamespace", "", "LO7/b;", "g", "[LO7/b;", "changedAttributeSanitizers", "newAttributeSanitizers", "()Z", "isTooManyAttributesAdded", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isSessionPropertiesEvent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final JSONObject baseJson;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<EnrichmentAttribute> overriddenAttributes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> droppedAttributes;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int addedAttributes;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final O7.a allowedNamespace;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b[] changedAttributeSanitizers;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final b[] newAttributeSanitizers;

    public a(EnrichedJsonContainer baseJsonContainer, boolean z10) {
        Intrinsics.j(baseJsonContainer, "baseJsonContainer");
        this.isSessionPropertiesEvent = z10;
        this.baseJson = baseJsonContainer.getEnrichedJson();
        this.overriddenAttributes = CollectionsKt.m1(baseJsonContainer.d());
        this.droppedAttributes = new ArrayList();
        O7.a aVarS = z10 ? n.s() : n.m();
        this.allowedNamespace = aVarS;
        this.changedAttributeSanitizers = new b[]{n.v(new O7.a[]{aVarS, n.n()}), n.r(), n.t()};
        this.newAttributeSanitizers = new b[]{n.v(new O7.a[]{aVarS}), n.p(), n.q(), n.r(), n.t()};
    }

    private final void a(JsonAttribute sanitizedAttribute) throws JSONException {
        j.f(this.baseJson, sanitizedAttribute);
        this.addedAttributes++;
    }

    private final void b(String key) {
        this.droppedAttributes.add(key);
    }

    private final List<EnrichmentAttribute> c(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.i(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                Intrinsics.g(next);
                if (e(next)) {
                    Object obj = jSONObject.get(next);
                    Intrinsics.i(obj, "get(...)");
                    arrayList.add(new EnrichmentAttribute(next, obj));
                    arrayList2.add(next);
                    f.a("dtxEnrichment", "merge modifications: attribute '" + next + "' has been removed by event modifier");
                } else {
                    f.a("dtxEnrichment", "merge modifications: removing of protected attribute '" + next + "' is not allowed and thus ignored");
                }
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            jSONObject.remove((String) it.next());
        }
        return arrayList;
    }

    private final boolean e(String str) {
        return this.isSessionPropertiesEvent ? StringsKt.W(str, "session_properties.", false, 2, null) : StringsKt.W(str, "event_properties.", false, 2, null);
    }

    private final boolean g() {
        return this.addedAttributes >= 50;
    }

    private final void i(JsonAttribute jsonAttribute) throws JSONException {
        if (d(jsonAttribute, this.baseJson)) {
            JsonAttribute jsonAttributeA = d.a(jsonAttribute, this.changedAttributeSanitizers);
            if (jsonAttributeA == null) {
                b(jsonAttribute.getKey());
                return;
            }
            k(jsonAttribute.getKey(), jsonAttributeA);
            f.a("dtxEnrichment", "merge modifications: attribute '" + jsonAttribute.getKey() + "' is overwritten by " + jsonAttributeA);
        }
    }

    private final void k(String key, JsonAttribute sanitizedAttribute) throws JSONException {
        Object obj = this.baseJson.get(key);
        Intrinsics.i(obj, "get(...)");
        EnrichmentAttribute enrichmentAttribute = new EnrichmentAttribute(key, obj);
        j.f(this.baseJson, sanitizedAttribute);
        this.overriddenAttributes.add(enrichmentAttribute);
    }

    private final void l() throws JSONException {
        boolean zOptBoolean = this.baseJson.optBoolean("dt.internal.api.has_dropped_custom_properties");
        if (!this.droppedAttributes.isEmpty() || zOptBoolean) {
            this.baseJson.put("dt.internal.api.has_dropped_custom_properties", true);
        }
    }

    public final EnrichedJsonContainer h(JSONObject modifiedJson) throws JSONException {
        Intrinsics.j(modifiedJson, "modifiedJson");
        this.overriddenAttributes.addAll(c(this.baseJson, modifiedJson));
        Iterator<String> itKeys = modifiedJson.keys();
        Intrinsics.i(itKeys, "keys(...)");
        for (String str : SequencesKt.S(SequencesKt.h(itKeys))) {
            Object obj = modifiedJson.get(str);
            Intrinsics.i(obj, "get(...)");
            Object objA = j.a(obj);
            Intrinsics.g(str);
            JsonAttribute jsonAttribute = new JsonAttribute(str, objA);
            if (f(str, this.baseJson)) {
                j(jsonAttribute);
            } else {
                i(jsonAttribute);
            }
        }
        l();
        return new EnrichedJsonContainer(this.baseJson, this.overriddenAttributes);
    }

    private final boolean d(JsonAttribute jsonAttribute, JSONObject jSONObject) {
        return !Intrinsics.e(jSONObject.get(jsonAttribute.getKey()), jsonAttribute.getValue());
    }

    private final boolean f(String str, JSONObject jSONObject) {
        return !jSONObject.has(str);
    }

    private final void j(JsonAttribute jsonAttribute) throws JSONException {
        if (g()) {
            f.a("dtxEnrichment", "merge modifications: adding more than 50 attributes using event modifiers is not allowed; dropping: '" + jsonAttribute.getKey() + '\'');
            b(jsonAttribute.getKey());
            return;
        }
        JsonAttribute jsonAttributeA = d.a(jsonAttribute, this.newAttributeSanitizers);
        if (jsonAttributeA != null) {
            a(jsonAttributeA);
        } else {
            b(jsonAttribute.getKey());
        }
    }
}
