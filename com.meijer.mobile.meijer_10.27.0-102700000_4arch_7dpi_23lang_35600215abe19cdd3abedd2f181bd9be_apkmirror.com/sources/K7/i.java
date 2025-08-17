package K7;

import Z7.MetricsDataModel;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aI\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00122\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a9\u0010!\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b'\u0010(\u001a\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,\u001a!\u0010/\u001a\u00020.*\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010-\u001a\u00020\u0010H\u0002¢\u0006\u0004\b/\u00100\u001a\u0013\u00101\u001a\u00020.*\u00020\u0000H\u0000¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"Lorg/json/JSONObject;", "rumEvent", "LK7/a;", "overridableAttributeAggregator", "protectedAttributeAggregator", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "LJ7/b;", "eventModifiers", "", "", "eventContext", "h", "(Lorg/json/JSONObject;LK7/a;LK7/a;Ljava/util/concurrent/ConcurrentLinkedQueue;[Ljava/lang/Object;)Lorg/json/JSONObject;", "inputJson", "", "", "LK7/g;", "enrichmentAttributes", "LK7/f;", "g", "(Lorg/json/JSONObject;Ljava/util/Map;)LK7/f;", "json", "", "j", "(Lorg/json/JSONObject;)Ljava/util/List;", "jsonContainer", "k", "(LK7/f;)Lorg/json/JSONObject;", "protectedAttributes", "l", "(LK7/f;Ljava/util/Map;)Lorg/json/JSONObject;", "enrichedJsonContainer", "modifiers", "c", "(LK7/f;[Ljava/lang/Object;Ljava/util/concurrent/ConcurrentLinkedQueue;)LK7/f;", "LZ7/d;", "metricsDataModel", "", "LK7/b;", "f", "(LZ7/d;)Ljava/util/List;", "LV7/b;", "metricsCache", "e", "(LV7/b;)Ljava/util/List;", "attribute", "", "b", "(Ljava/util/List;LK7/g;)V", "i", "(Lorg/json/JSONObject;)V", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class i {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7 A[EDGE_INSN: B:30:0x00b7->B:21:0x00b7 BREAK  A[LOOP:0: B:13:0x0062->B:33:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final K7.EnrichedJsonContainer c(K7.EnrichedJsonContainer r11, java.lang.Object[] r12, java.util.concurrent.ConcurrentLinkedQueue<J7.b> r13) throws org.json.JSONException {
        /*
            java.lang.String r0 = "enrichedJsonContainer"
            kotlin.jvm.internal.Intrinsics.j(r11, r0)
            java.lang.String r0 = "modifiers"
            kotlin.jvm.internal.Intrinsics.j(r13, r0)
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L11
            return r11
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "apply modifications: with "
            r0.append(r1)
            int r1 = r13.size()
            r0.append(r1)
            java.lang.String r1 = " modifier(s); context: "
            r0.append(r1)
            if (r12 == 0) goto L41
            K7.h r8 = new K7.h
            r8.<init>()
            r9 = 24
            r10 = 0
            java.lang.String r3 = ", "
            java.lang.String r4 = "["
            java.lang.String r5 = "]"
            r6 = 0
            r7 = 0
            r2 = r12
            java.lang.String r12 = kotlin.collections.ArraysKt.C0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L44
            goto L42
        L41:
            r2 = r12
        L42:
            java.lang.String r12 = "null"
        L44:
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.String r0 = "dtxEnrichment"
            x8.f.a(r0, r12)
            org.json.JSONObject r12 = r11.getEnrichedJson()
            org.json.JSONObject r12 = K7.j.c(r12)
            java.util.Iterator r13 = r13.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.i(r13, r1)
            r1 = 0
        L62:
            boolean r3 = r13.hasNext()
            r4 = 1
            if (r3 == 0) goto Lb7
            java.lang.Object r3 = r13.next()
            J7.b r3 = (J7.b) r3
            org.json.JSONObject r12 = r3.a(r12, r2)     // Catch: java.lang.Exception -> L74
            goto L95
        L74:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "apply modifications: event modifier caused exception. EventModifier: "
            r1.append(r5)
            java.lang.Class r5 = r3.getClass()
            kotlin.reflect.KClass r5 = kotlin.jvm.internal.Reflection.b(r5)
            java.lang.String r5 = r5.u()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            x8.f.a(r0, r1)
            r1 = r4
        L95:
            if (r12 != 0) goto L62
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "apply modifications: event dropped by event modifier. EventModifier: "
            r13.append(r2)
            java.lang.Class r2 = r3.getClass()
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.b(r2)
            java.lang.String r2 = r2.u()
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            x8.f.a(r0, r13)
        Lb7:
            if (r12 != 0) goto Lbb
            r11 = 0
            goto Ld9
        Lbb:
            org.json.JSONObject r13 = r11.getEnrichedJson()
            java.lang.String r0 = "characteristics.has_session_properties"
            boolean r13 = K7.j.d(r13, r0)
            L7.a r0 = new L7.a
            r0.<init>(r11, r13)
            K7.f r11 = r0.h(r12)
            if (r1 == 0) goto Ld9
            org.json.JSONObject r12 = r11.getEnrichedJson()
            java.lang.String r13 = "dt.internal.api.has_enrich_exception"
            r12.put(r13, r4)
        Ld9:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: K7.i.c(K7.f, java.lang.Object[], java.util.concurrent.ConcurrentLinkedQueue):K7.f");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence d(Object obj) {
        return String.valueOf(obj != null ? obj.getClass().getName() : null);
    }

    public static final List<b> e(V7.b metricsCache) {
        Intrinsics.j(metricsCache, "metricsCache");
        return CollectionsKt.e(new e(metricsCache));
    }

    public static final List<b> f(MetricsDataModel metricsDataModel) {
        Intrinsics.j(metricsDataModel, "metricsDataModel");
        return CollectionsKt.e(new n(metricsDataModel));
    }

    public static final EnrichedJsonContainer g(JSONObject inputJson, Map<String, EnrichmentAttribute> enrichmentAttributes) throws JSONException {
        Intrinsics.j(inputJson, "inputJson");
        Intrinsics.j(enrichmentAttributes, "enrichmentAttributes");
        JSONObject jSONObjectC = j.c(inputJson);
        List<EnrichmentAttribute> listJ = j(jSONObjectC);
        jSONObjectC.remove("dt.internal.api.overridden_fields");
        for (Map.Entry<String, EnrichmentAttribute> entry : enrichmentAttributes.entrySet()) {
            String key = entry.getKey();
            EnrichmentAttribute value = entry.getValue();
            Object objOpt = jSONObjectC.opt(key);
            if (objOpt == null || objOpt.equals(value.getValue())) {
                jSONObjectC.put(key, value.getValue());
            } else {
                x8.f.a("dtxEnrichment", "auto-enrichment value overwritten: " + value + " is overwritten with custom value: " + objOpt);
                if (M7.n.o().contains(key)) {
                    b(listJ, value);
                }
            }
        }
        return new EnrichedJsonContainer(jSONObjectC, listJ);
    }

    public static final JSONObject h(JSONObject rumEvent, a overridableAttributeAggregator, a protectedAttributeAggregator, ConcurrentLinkedQueue<J7.b> eventModifiers, Object[] objArr) {
        Intrinsics.j(rumEvent, "rumEvent");
        Intrinsics.j(overridableAttributeAggregator, "overridableAttributeAggregator");
        Intrinsics.j(protectedAttributeAggregator, "protectedAttributeAggregator");
        Intrinsics.j(eventModifiers, "eventModifiers");
        x8.f.a("dtxEnrichment", "rum event: " + rumEvent);
        EnrichedJsonContainer enrichedJsonContainerG = g(rumEvent, overridableAttributeAggregator.a());
        EnrichedJsonContainer enrichedJsonContainerB = EnrichedJsonContainer.b(enrichedJsonContainerG, l(enrichedJsonContainerG, protectedAttributeAggregator.a()), null, 2, null);
        x8.f.a("dtxEnrichment", "rum event after basic enrichment: overridden attributes: " + enrichedJsonContainerG.d() + "; event: " + enrichedJsonContainerG.getEnrichedJson());
        EnrichedJsonContainer enrichedJsonContainerC = c(enrichedJsonContainerB, objArr, eventModifiers);
        if (enrichedJsonContainerC == null) {
            return null;
        }
        x8.f.a("dtxEnrichment", "rum event after modifications: overridden attributes: " + enrichedJsonContainerC.d() + "; event: " + enrichedJsonContainerC.getEnrichedJson());
        JSONObject jSONObjectK = k(enrichedJsonContainerC);
        i(jSONObjectK);
        x8.f.a("dtxEnrichment", "rum event after full enrichment: " + jSONObjectK);
        return jSONObjectK;
    }

    public static final void i(JSONObject jSONObject) throws JSONException {
        Intrinsics.j(jSONObject, "<this>");
        if (j.e(jSONObject, "event_properties.") && !j.d(jSONObject, "characteristics.has_event_properties")) {
            jSONObject.put("characteristics.has_event_properties", true);
        } else {
            if (!j.d(jSONObject, "characteristics.has_event_properties") || j.e(jSONObject, "event_properties.")) {
                return;
            }
            jSONObject.remove("characteristics.has_event_properties");
        }
    }

    public static final List<EnrichmentAttribute> j(JSONObject json) throws JSONException {
        Intrinsics.j(json, "json");
        JSONArray jSONArrayOptJSONArray = json.optJSONArray("dt.internal.api.overridden_fields");
        if (jSONArrayOptJSONArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (jSONArrayOptJSONArray.get(i10) instanceof String) {
                String string = jSONArrayOptJSONArray.getString(i10);
                Intrinsics.i(string, "getString(...)");
                arrayList.add(new EnrichmentAttribute(string, zzbz.UNKNOWN_CONTENT_TYPE));
            } else {
                x8.f.a("dtxEnrichment", "dropped existing overridden_key because it was no String: " + jSONArrayOptJSONArray.get(i10));
            }
        }
        return arrayList;
    }

    public static final JSONObject k(EnrichedJsonContainer jsonContainer) throws JSONException {
        Intrinsics.j(jsonContainer, "jsonContainer");
        JSONObject enrichedJson = jsonContainer.getEnrichedJson();
        if (enrichedJson.remove("dt.internal.api.overridden_fields") != null) {
            x8.f.a("dtxEnrichment", "protected attribute integration: encountered key 'dt.internal.api.overridden_fields' which is protected and will be removed");
        }
        List<EnrichmentAttribute> listD = jsonContainer.d();
        if (listD.isEmpty()) {
            return enrichedJson;
        }
        List<EnrichmentAttribute> list = listD;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnrichmentAttribute) it.next()).getKey());
        }
        JSONObject jSONObjectPut = enrichedJson.put("dt.internal.api.overridden_fields", new JSONArray((Collection) arrayList));
        Intrinsics.g(jSONObjectPut);
        return jSONObjectPut;
    }

    public static final JSONObject l(EnrichedJsonContainer jsonContainer, Map<String, EnrichmentAttribute> protectedAttributes) throws JSONException {
        Intrinsics.j(jsonContainer, "jsonContainer");
        Intrinsics.j(protectedAttributes, "protectedAttributes");
        JSONObject enrichedJson = jsonContainer.getEnrichedJson();
        for (Map.Entry<String, EnrichmentAttribute> entry : protectedAttributes.entrySet()) {
            String key = entry.getKey();
            EnrichmentAttribute value = entry.getValue();
            if (enrichedJson.has(key)) {
                x8.f.a("dtxEnrichment", "protected attribute integration: encountered key '" + key + "' which is protected and will be overwritten with " + value);
            }
            enrichedJson.put(key, value.getValue());
        }
        return enrichedJson;
    }

    private static final void b(List<EnrichmentAttribute> list, EnrichmentAttribute enrichmentAttribute) {
        Iterator<EnrichmentAttribute> it = list.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.e(it.next().getKey(), enrichmentAttribute.getKey())) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            x8.f.a("dtxEnrichment", "key '" + enrichmentAttribute.getKey() + "' already in overridden keys list. Replacing it.");
            list.set(i10, enrichmentAttribute);
            return;
        }
        list.add(enrichmentAttribute);
    }
}
