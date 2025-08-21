package P5;

import Q5.C4667a;
import Q5.l;
import R5.t;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.C6576j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LP5/d;", "LP5/e;", "LP5/g;", "definition", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "<init>", "(LP5/g;Lcom/adobe/marketing/mobile/m;)V", "LQ5/e;", "a", "()LQ5/e;", "b", "LP5/g;", "c", "Lcom/adobe/marketing/mobile/m;", "d", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final JSONDefinition definition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6579m extensionApi;

    public d(JSONDefinition definition, AbstractC6579m extensionApi) {
        Intrinsics.j(definition, "definition");
        Intrinsics.j(extensionApi, "extensionApi");
        this.definition = definition;
        this.extensionApi = extensionApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer d(d this$0, Object[] objArr) {
        Intrinsics.j(this$0, "this$0");
        int iC = 0;
        try {
            Object obj = objArr[0];
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<com.adobe.marketing.mobile.EventHistoryRequest>");
            iC = N5.a.c((List) obj, this$0.extensionApi);
        } catch (Exception unused) {
        }
        return Integer.valueOf(iC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer e(d this$0, Object[] objArr) {
        Intrinsics.j(this$0, "this$0");
        int iB = 0;
        try {
            Object obj = objArr[0];
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<com.adobe.marketing.mobile.EventHistoryRequest>");
            Object obj2 = objArr[1];
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.String");
            iB = N5.a.b((List) obj, (String) obj2, this$0.extensionApi);
        } catch (Exception unused) {
        }
        return Integer.valueOf(iB);
    }

    @Override // P5.e
    public Q5.e a() {
        Object objI = this.definition.getValue();
        String str = k.INSTANCE.a().get(this.definition.getMatcher());
        if (this.definition.b() == null || str == null || !(objI instanceof Integer)) {
            t.b("LaunchRulesEngine", "HistoricalCondition", "Failed to build Evaluable from definition JSON: \n " + this.definition, new Object[0]);
            return null;
        }
        Long lC = this.definition.getFrom();
        long jLongValue = lC != null ? lC.longValue() : 0L;
        Long lH = this.definition.getTo();
        long jLongValue2 = lH != null ? lH.longValue() : 0L;
        String strG = this.definition.getSearchType();
        if (strG == null) {
            strG = "any";
        }
        List<Map<String, Object>> listB = this.definition.b();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new C6576j((Map) it.next(), jLongValue, jLongValue2));
        }
        return Intrinsics.e(strG, "mostRecent") ? new C4667a(new Q5.k(new Q5.g() { // from class: P5.b
            @Override // Q5.g
            public final Object a(Object[] objArr) {
                return d.d(this.f25597a, objArr);
            }
        }, arrayList), str, new l(objI)) : new C4667a(new Q5.k(new Q5.g() { // from class: P5.c
            @Override // Q5.g
            public final Object a(Object[] objArr) {
                return d.e(this.f25598a, objArr);
            }
        }, arrayList, strG), str, new l(objI));
    }
}
