package M5;

import P5.v;
import P5.x;
import Q5.t;
import com.adobe.marketing.mobile.A;
import com.adobe.marketing.mobile.AbstractC6454m;
import com.adobe.marketing.mobile.C6444c;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.C6451j;
import com.adobe.marketing.mobile.EventHistoryResult;
import com.adobe.marketing.mobile.InterfaceC6443b;
import f6.C13845a;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00142\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00142\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b%\u0010$J#\u0010)\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001d2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0014¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u000201008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"LM5/i;", "", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "<init>", "(Lcom/adobe/marketing/mobile/m;)V", "LM5/m;", "consequence", "LP5/x;", "tokenFinder", "k", "(LM5/m;LP5/x;)LM5/m;", "value", "l", "(Ljava/lang/Object;LP5/x;)Ljava/lang/Object;", "", "", "detail", "o", "(Ljava/util/Map;LP5/x;)Ljava/util/Map;", "", "n", "(Ljava/util/List;LP5/x;)Ljava/util/List;", "m", "(Ljava/lang/String;LP5/x;)Ljava/lang/String;", "eventData", "f", "(LM5/m;Ljava/util/Map;)Ljava/util/Map;", "i", "Lcom/adobe/marketing/mobile/h;", "parentEvent", "g", "(LM5/m;Lcom/adobe/marketing/mobile/h;)Lcom/adobe/marketing/mobile/h;", "d", "", "j", "(LM5/m;Lcom/adobe/marketing/mobile/h;)V", "h", "event", "LM5/b;", "matchedRules", "e", "(Lcom/adobe/marketing/mobile/h;Ljava/util/List;)Lcom/adobe/marketing/mobile/h;", "a", "Lcom/adobe/marketing/mobile/m;", "b", "Ljava/lang/String;", "logTag", "", "", "c", "Ljava/util/Map;", "dispatchChainedEventsCount", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6454m extensionApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String logTag;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Map<String, Integer> dispatchChainedEventsCount;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"M5/i$b", "Lcom/adobe/marketing/mobile/b;", "", "Lcom/adobe/marketing/mobile/k;", "results", "", "c", "([Lcom/adobe/marketing/mobile/k;)V", "Lcom/adobe/marketing/mobile/c;", "error", "b", "(Lcom/adobe/marketing/mobile/c;)V", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements InterfaceC6443b<EventHistoryResult[]> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f19019a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f19020b;

        b(Ref.IntRef intRef, CountDownLatch countDownLatch) {
            this.f19019a = intRef;
            this.f19020b = countDownLatch;
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6443b
        public void b(C6444c error) {
            Intrinsics.j(error, "error");
            this.f19019a.f142833a = -1;
            this.f19020b.countDown();
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6418a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(EventHistoryResult[] results) {
            Intrinsics.j(results, "results");
            this.f19019a.f142833a = !(results.length == 0) ? results[0].count : -1;
            this.f19020b.countDown();
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"M5/i$c", "Lcom/adobe/marketing/mobile/b;", "", "result", "", "c", "(Z)V", "Lcom/adobe/marketing/mobile/c;", "error", "b", "(Lcom/adobe/marketing/mobile/c;)V", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements InterfaceC6443b<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RuleConsequence f19022b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C6449h f19023c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f19024d;

        c(RuleConsequence ruleConsequence, C6449h c6449h, String str) {
            this.f19022b = ruleConsequence;
            this.f19023c = c6449h;
            this.f19024d = str;
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6418a
        public /* bridge */ /* synthetic */ void a(Object obj) {
            c(((Boolean) obj).booleanValue());
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6443b
        public void b(C6444c error) {
            Intrinsics.j(error, "error");
            t.f("LaunchRulesEngine", i.this.logTag, "Event History operation for id " + this.f19022b.getId() + " - Failed to record event in history for '" + this.f19024d + "', caused by the error: " + error.b(), new Object[0]);
        }

        public void c(boolean result) {
            if (result) {
                i.this.extensionApi.c(i.this.d(this.f19022b, this.f19023c));
                return;
            }
            t.f("LaunchRulesEngine", i.this.logTag, "Event History operation for id " + this.f19022b.getId() + " - Failed to record event in history for '" + this.f19024d + '\'', new Object[0]);
        }
    }

    public i(AbstractC6454m extensionApi) {
        Intrinsics.j(extensionApi, "extensionApi");
        this.extensionApi = extensionApi;
        this.logTag = "LaunchRulesConsequence";
        this.dispatchChainedEventsCount = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6449h d(RuleConsequence consequence, C6449h parentEvent) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("detail", consequence.a());
        linkedHashMap.put(PreferencesHelper.PREF_ID, consequence.getId());
        linkedHashMap.put("type", consequence.getType());
        C6449h c6449hA = new C6449h.b("Rules Consequence Event", "com.adobe.eventType.rulesEngine", "com.adobe.eventSource.responseContent").d(MapsKt.g(TuplesKt.a("triggeredconsequence", linkedHashMap))).b(parentEvent).a();
        Intrinsics.i(c6449hA, "Builder(\n            CON…ent)\n            .build()");
        return c6449hA;
    }

    private final void h(RuleConsequence consequence, C6449h parentEvent) throws InterruptedException {
        Map mapH = j.h(consequence);
        if (mapH == null || mapH.isEmpty()) {
            t.f("LaunchRulesEngine", this.logTag, "Unable to process eventHistoryOperation operation for consequence " + consequence.getId() + ", 'data' is missing from 'details'", new Object[0]);
            return;
        }
        String strO = C13845a.o(mapH, "operation", "");
        if (strO == null || StringsKt.r0(strO)) {
            t.f("LaunchRulesEngine", this.logTag, "Unable to process eventHistoryOperation operation for consequence " + consequence.getId() + ", 'operation' is missing from 'details.data'", new Object[0]);
            return;
        }
        Map<String, Object> mapT = C13845a.t(Object.class, mapH, "content", null);
        if (mapT == null || mapT.isEmpty()) {
            t.f("LaunchRulesEngine", this.logTag, "Unable to process eventHistoryOperation operation for consequence " + consequence.getId() + ", 'content' is either missing or improperly formatted in 'details.data'", new Object[0]);
            return;
        }
        C6449h eventToRecord = new C6449h.b("Dispatch Consequence Result", "com.adobe.eventType.rulesEngine", "com.adobe.eventSource.responseContent").d(mapT).b(parentEvent).a();
        if (!Intrinsics.e(strO, "insert") && !Intrinsics.e(strO, "insertIfNotExists")) {
            t.f("LaunchRulesEngine", this.logTag, "Event History operation for id " + consequence.getId() + " - Unsupported history operation '" + strO + '\'', new Object[0]);
            return;
        }
        Map<String, Object> mapO = eventToRecord.o();
        Intrinsics.i(mapO, "eventToRecord.eventData");
        if (L5.j.d(mapO, null, 1, null) == 0) {
            t.f("LaunchRulesEngine", this.logTag, "Event History operation for id " + consequence.getId() + " - event hash is 0", new Object[0]);
            return;
        }
        if (Intrinsics.e(strO, "insertIfNotExists")) {
            Ref.IntRef intRef = new Ref.IntRef();
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AbstractC6454m abstractC6454m = this.extensionApi;
                Intrinsics.i(eventToRecord, "eventToRecord");
                abstractC6454m.d(new C6451j[]{L5.f.b(eventToRecord, 0L, 0L, 3, null)}, false, new b(intRef, countDownLatch));
                countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                int i10 = intRef.f142833a;
                if (i10 == -1) {
                    t.e("LaunchRulesEngine", this.logTag, "Event History operation for id " + consequence.getId() + " - Unable to retrieve historical events due to database error, skipping 'insertIfNotExists' operation", new Object[0]);
                    return;
                }
                if (i10 >= 1) {
                    t.e("LaunchRulesEngine", this.logTag, "Event History operation for id " + consequence.getId() + " - Event already exists in history, skipping 'insertIfNotExists' operation", new Object[0]);
                    return;
                }
            } catch (Exception e10) {
                t.f("LaunchRulesEngine", this.logTag, "Event History operation for id " + consequence.getId() + " - Unable to retrieve historical events, caused by the exception: " + e10.getLocalizedMessage(), new Object[0]);
                return;
            }
        }
        t.e("LaunchRulesEngine", this.logTag, "Event History operation for id " + consequence.getId() + " - Recording event in history with operation '" + strO + '\'', new Object[0]);
        this.extensionApi.g(eventToRecord, new c(consequence, parentEvent, strO));
    }

    private final Object l(Object value, x tokenFinder) {
        if (value instanceof String) {
            return m((String) value, tokenFinder);
        }
        if (!(value instanceof Map)) {
            return value instanceof List ? n((List) value, tokenFinder) : value;
        }
        Map<String, ? extends Object> mapA = com.adobe.marketing.mobile.util.a.a((Map) value);
        Intrinsics.i(mapA, "castFromGenericType(value)");
        return o(mapA, tokenFinder);
    }

    private final String m(String value, x tokenFinder) {
        String strA = new v(value, new P5.d("{%", "%}")).a(tokenFinder, h.f19014a.m());
        Intrinsics.i(strA, "template.render(tokenFin…mer.createTransforming())");
        return strA;
    }

    private final List<Object> n(List<? extends Object> value, x tokenFinder) {
        List<? extends Object> list = value;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l(it.next(), tokenFinder));
        }
        return arrayList;
    }

    public final C6449h e(C6449h event, List<LaunchRule> matchedRules) {
        Intrinsics.j(event, "event");
        Intrinsics.j(matchedRules, "matchedRules");
        Integer numRemove = this.dispatchChainedEventsCount.remove(event.x());
        int iIntValue = numRemove != null ? numRemove.intValue() : 0;
        l lVar = new l(event, this.extensionApi);
        Iterator<LaunchRule> it = matchedRules.iterator();
        C6449h c6449hN = event;
        while (it.hasNext()) {
            Iterator<RuleConsequence> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                RuleConsequence ruleConsequenceK = k(it2.next(), lVar);
                String type = ruleConsequenceK.getType();
                switch (type.hashCode()) {
                    case -907987551:
                        if (!type.equals("schema")) {
                            C6449h c6449hD = d(ruleConsequenceK, c6449hN);
                            t.e("LaunchRulesEngine", this.logTag, "evaluateRulesConsequence - Dispatching consequence event " + c6449hD.x(), new Object[0]);
                            this.extensionApi.c(c6449hD);
                            break;
                        } else {
                            j(ruleConsequenceK, c6449hN);
                            break;
                        }
                    case 96417:
                        if (!type.equals("add")) {
                            C6449h c6449hD2 = d(ruleConsequenceK, c6449hN);
                            t.e("LaunchRulesEngine", this.logTag, "evaluateRulesConsequence - Dispatching consequence event " + c6449hD2.x(), new Object[0]);
                            this.extensionApi.c(c6449hD2);
                            break;
                        } else {
                            Map<String, Object> mapF = f(ruleConsequenceK, c6449hN.o());
                            if (mapF != null) {
                                c6449hN = c6449hN.n(mapF);
                                Intrinsics.i(c6449hN, "processedEvent.cloneWith…ntData(attachedEventData)");
                                break;
                            } else {
                                break;
                            }
                        }
                    case 108290:
                        if (!type.equals("mod")) {
                            C6449h c6449hD22 = d(ruleConsequenceK, c6449hN);
                            t.e("LaunchRulesEngine", this.logTag, "evaluateRulesConsequence - Dispatching consequence event " + c6449hD22.x(), new Object[0]);
                            this.extensionApi.c(c6449hD22);
                            break;
                        } else {
                            Map<String, Object> mapI = i(ruleConsequenceK, c6449hN.o());
                            if (mapI != null) {
                                c6449hN = c6449hN.n(mapI);
                                Intrinsics.i(c6449hN, "processedEvent.cloneWith…ntData(modifiedEventData)");
                                break;
                            } else {
                                break;
                            }
                        }
                    case 284771450:
                        if (!type.equals("dispatch")) {
                            C6449h c6449hD222 = d(ruleConsequenceK, c6449hN);
                            t.e("LaunchRulesEngine", this.logTag, "evaluateRulesConsequence - Dispatching consequence event " + c6449hD222.x(), new Object[0]);
                            this.extensionApi.c(c6449hD222);
                            break;
                        } else if (iIntValue < 1) {
                            C6449h c6449hG = g(ruleConsequenceK, c6449hN);
                            if (c6449hG != null) {
                                t.e("LaunchRulesEngine", this.logTag, "processDispatchConsequence - Dispatching event - " + c6449hG.x(), new Object[0]);
                                this.extensionApi.c(c6449hG);
                                Map<String, Integer> map = this.dispatchChainedEventsCount;
                                String strX = c6449hG.x();
                                Intrinsics.i(strX, "dispatchEvent.uniqueIdentifier");
                                map.put(strX, Integer.valueOf(iIntValue + 1));
                                break;
                            } else {
                                break;
                            }
                        } else {
                            t.f("LaunchRulesEngine", this.logTag, "Unable to process dispatch consequence, max chained dispatch consequences limit of 1met for this event uuid " + event.x(), new Object[0]);
                            break;
                        }
                    default:
                        C6449h c6449hD2222 = d(ruleConsequenceK, c6449hN);
                        t.e("LaunchRulesEngine", this.logTag, "evaluateRulesConsequence - Dispatching consequence event " + c6449hD2222.x(), new Object[0]);
                        this.extensionApi.c(c6449hD2222);
                        break;
                }
            }
        }
        return c6449hN;
    }

    private final Map<String, Object> f(RuleConsequence consequence, Map<String, ? extends Object> eventData) {
        Map<String, Object> mapA = com.adobe.marketing.mobile.util.a.a(j.j(consequence));
        if (mapA == null) {
            t.b("LaunchRulesEngine", this.logTag, "Unable to process an AttachDataConsequence Event, 'eventData' is missing from 'details'", new Object[0]);
            return null;
        }
        if (eventData == null) {
            t.b("LaunchRulesEngine", this.logTag, "Unable to process an AttachDataConsequence Event, 'eventData' is missing from original event", new Object[0]);
            return null;
        }
        if (t.c() == A.VERBOSE) {
            t.e("LaunchRulesEngine", this.logTag, "Attaching event data with " + L5.j.g(mapA), new Object[0]);
        }
        return L5.e.e(mapA, eventData, false);
    }

    private final C6449h g(RuleConsequence consequence, C6449h parentEvent) {
        Map<String, Object> mapO;
        String strM = j.m(consequence);
        LinkedHashMap linkedHashMap = null;
        if (strM != null) {
            String strL = j.l(consequence);
            if (strL != null) {
                String strK = j.k(consequence);
                if (strK == null) {
                    t.b("LaunchRulesEngine", this.logTag, "Unable to process a DispatchConsequence Event, 'eventdataaction' is missing from 'details'", new Object[0]);
                    return null;
                }
                if (Intrinsics.e(strK, "copy")) {
                    mapO = parentEvent.o();
                } else if (Intrinsics.e(strK, "new")) {
                    Map<String, Object> mapA = com.adobe.marketing.mobile.util.a.a(j.j(consequence));
                    if (mapA != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, Object> entry : mapA.entrySet()) {
                            if (entry.getValue() != null) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    mapO = linkedHashMap;
                } else {
                    t.b("LaunchRulesEngine", this.logTag, "Unable to process a DispatchConsequence Event, unsupported 'eventdataaction', expected values copy/new", new Object[0]);
                    return null;
                }
                return new C6449h.b("Dispatch Consequence Result", strM, strL).d(mapO).b(parentEvent).a();
            }
            t.b("LaunchRulesEngine", this.logTag, "Unable to process a DispatchConsequence Event, 'source' is missing from 'details'", new Object[0]);
            return null;
        }
        t.b("LaunchRulesEngine", this.logTag, "Unable to process a DispatchConsequence Event, 'type' is missing from 'details'", new Object[0]);
        return null;
    }

    private final Map<String, Object> i(RuleConsequence consequence, Map<String, ? extends Object> eventData) {
        Map<String, Object> mapA = com.adobe.marketing.mobile.util.a.a(j.j(consequence));
        if (mapA == null) {
            t.b("LaunchRulesEngine", this.logTag, "Unable to process a ModifyDataConsequence Event, 'eventData' is missing from 'details'", new Object[0]);
            return null;
        }
        if (eventData == null) {
            t.b("LaunchRulesEngine", this.logTag, "Unable to process a ModifyDataConsequence Event, 'eventData' is missing from original event", new Object[0]);
            return null;
        }
        if (t.c() == A.VERBOSE) {
            t.e("LaunchRulesEngine", this.logTag, "Modifying event data with " + L5.j.g(mapA), new Object[0]);
        }
        return L5.e.e(mapA, eventData, true);
    }

    private final void j(RuleConsequence consequence, C6449h parentEvent) throws InterruptedException {
        if (j.i(consequence) != null && j.n(consequence) != null && j.h(consequence) != null) {
            if (Intrinsics.e(j.n(consequence), "https://ns.adobe.com/personalization/eventHistoryOperation")) {
                h(consequence, parentEvent);
                return;
            }
            C6449h c6449hD = d(consequence, parentEvent);
            t.e("LaunchRulesEngine", this.logTag, "evaluateRulesConsequence - Dispatching consequence event " + c6449hD.x(), new Object[0]);
            this.extensionApi.c(c6449hD);
            return;
        }
        t.f("LaunchRulesEngine", this.logTag, "Unable to process Schema Consequence for consequence " + consequence.getId() + ", 'id', 'schema' or 'data' is missing from 'details'", new Object[0]);
    }

    private final RuleConsequence k(RuleConsequence consequence, x tokenFinder) {
        return new RuleConsequence(consequence.getId(), consequence.getType(), o(consequence.a(), tokenFinder));
    }

    private final Map<String, Object> o(Map<String, ? extends Object> detail, x tokenFinder) {
        Map<String, Object> mapD = MapsKt.D(detail);
        for (Map.Entry<String, ? extends Object> entry : detail.entrySet()) {
            mapD.put(entry.getKey(), l(entry.getValue(), tokenFinder));
        }
        return mapD;
    }
}
