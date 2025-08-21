package I5;

import M5.r;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.F;
import com.adobe.marketing.mobile.H;
import com.adobe.marketing.mobile.I;
import com.adobe.marketing.mobile.N;
import g6.C14328a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001b¨\u0006\u001d"}, d2 = {"LI5/j;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/h;", "event", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "", "LI5/j$a;", "g", "(Lcom/adobe/marketing/mobile/h;Lcom/adobe/marketing/mobile/m;)Ljava/util/List;", "b", "c", "f", "", "d", "(Lcom/adobe/marketing/mobile/h;Lcom/adobe/marketing/mobile/m;)Ljava/lang/String;", "name", "Lcom/adobe/marketing/mobile/H;", "e", "(Ljava/lang/String;Lcom/adobe/marketing/mobile/h;Lcom/adobe/marketing/mobile/m;)Lcom/adobe/marketing/mobile/H;", "sharedState", "", "h", "(Lcom/adobe/marketing/mobile/H;)Z", "a", "Ljava/util/List;", "REQUIRED_READY_EXTENSIONS", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f14360a = new j();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final List<String> REQUIRED_READY_EXTENSIONS = CollectionsKt.p("com.adobe.module.analytics", "com.adobe.module.audience", "com.adobe.module.configuration", "com.adobe.module.target", "com.adobe.module.identity");

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"LI5/j$a;", "", "", "namespace", "value", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: I5.j$a, reason: from toString */
    private static final /* data */ class ID {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String namespace;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ID)) {
                return false;
            }
            ID id2 = (ID) other;
            return Intrinsics.e(this.namespace, id2.namespace) && Intrinsics.e(this.value, id2.value) && Intrinsics.e(this.type, id2.type);
        }

        public ID(String namespace, String value, String type) {
            Intrinsics.j(namespace, "namespace");
            Intrinsics.j(value, "value");
            Intrinsics.j(type, "type");
            this.namespace = namespace;
            this.value = value;
            this.type = type;
        }

        /* renamed from: a, reason: from getter */
        public final String getNamespace() {
            return this.namespace;
        }

        /* renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return (((this.namespace.hashCode() * 31) + this.value.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "ID(namespace=" + this.namespace + ", value=" + this.value + ", type=" + this.type + ')';
        }
    }

    private final H e(String name, C6574h event, AbstractC6579m extensionApi) {
        return extensionApi.e(name, event, false, F.ANY);
    }

    private final List<ID> b(C6574h event, AbstractC6579m extensionApi) {
        H hE = e("com.adobe.module.analytics", event, extensionApi);
        ArrayList arrayList = new ArrayList();
        if (h(hE)) {
            String strO = C14328a.o(hE != null ? hE.b() : null, "aid", null);
            if (strO != null && strO.length() > 0) {
                arrayList.add(new ID("AVID", strO, "integrationCode"));
            }
            String strO2 = C14328a.o(hE != null ? hE.b() : null, "vid", null);
            if (strO2 != null && strO2.length() > 0) {
                arrayList.add(new ID("vid", strO2, "analytics"));
            }
        }
        return arrayList;
    }

    private final List<ID> c(C6574h event, AbstractC6579m extensionApi) {
        H hE = e("com.adobe.module.audience", event, extensionApi);
        ArrayList arrayList = new ArrayList();
        if (h(hE)) {
            String strO = C14328a.o(hE != null ? hE.b() : null, "dpuuid", null);
            if (strO != null && strO.length() > 0) {
                String dpid = C14328a.o(hE != null ? hE.b() : null, "dpid", "");
                Intrinsics.i(dpid, "dpid");
                arrayList.add(new ID(dpid, strO, "namespaceId"));
            }
            String strO2 = C14328a.o(hE != null ? hE.b() : null, "uuid", null);
            if (strO2 != null && strO2.length() > 0) {
                arrayList.add(new ID("0", strO2, "namespaceId"));
            }
        }
        return arrayList;
    }

    private final String d(C6574h event, AbstractC6579m extensionApi) {
        H hE = e("com.adobe.module.configuration", event, extensionApi);
        if (h(hE)) {
            String strO = C14328a.o(hE != null ? hE.b() : null, "experienceCloud.org", null);
            if (strO != null && strO.length() > 0) {
                return strO;
            }
        }
        return null;
    }

    private final List<ID> f(C6574h event, AbstractC6579m extensionApi) {
        ArrayList arrayList = new ArrayList();
        H hE = e("com.adobe.module.target", event, extensionApi);
        if (h(hE)) {
            String strO = C14328a.o(hE != null ? hE.b() : null, "tntid", null);
            if (strO != null && strO.length() > 0) {
                arrayList.add(new ID("tntid", strO, "target"));
            }
            String strO2 = C14328a.o(hE != null ? hE.b() : null, "thirdpartyid", null);
            if (strO2 != null && strO2.length() > 0) {
                arrayList.add(new ID("3rdpartyid", strO2, "target"));
            }
        }
        return arrayList;
    }

    private final List<ID> g(C6574h event, AbstractC6579m extensionApi) {
        ArrayList arrayList = new ArrayList();
        H hE = e("com.adobe.module.identity", event, extensionApi);
        String strO = C14328a.o(hE != null ? hE.b() : null, "mid", null);
        if (strO != null) {
            arrayList.add(new ID("4", strO, "namespaceId"));
        }
        List listR = C14328a.r(Map.class, hE != null ? hE.b() : null, "visitoridslist", CollectionsKt.m());
        if (listR != null) {
            List<N> listA = r.a(listR);
            Intrinsics.i(listA, "convertToVisitorIds(customVisitorIDs)");
            for (N n10 : listA) {
                String strB = n10.b();
                if (strB != null && strB.length() != 0) {
                    String strD = n10.d();
                    Intrinsics.i(strD, "visitorID.idType");
                    String strB2 = n10.b();
                    Intrinsics.i(strB2, "visitorID.id");
                    arrayList.add(new ID(strD, strB2, "integrationCode"));
                }
            }
        }
        String strO2 = C14328a.o(hE != null ? hE.b() : null, "pushidentifier", null);
        if (strO2 != null && strO2.length() > 0) {
            arrayList.add(new ID("20919", strO2, "integrationCode"));
        }
        return arrayList;
    }

    private final boolean h(H sharedState) {
        return (sharedState != null ? sharedState.a() : null) == I.SET;
    }

    public final String a(C6574h event, AbstractC6579m extensionApi) {
        String string;
        Intrinsics.j(event, "event");
        Intrinsics.j(extensionApi, "extensionApi");
        ArrayList<ID> arrayList = new ArrayList();
        arrayList.addAll(b(event, extensionApi));
        arrayList.addAll(c(event, extensionApi));
        arrayList.addAll(g(event, extensionApi));
        arrayList.addAll(f(event, extensionApi));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        for (ID id2 : arrayList) {
            arrayList2.add(MapsKt.o(TuplesKt.a("namespace", id2.getNamespace()), TuplesKt.a("value", id2.getValue()), TuplesKt.a("type", id2.getType())));
        }
        ArrayList arrayList3 = new ArrayList();
        String strD = d(event, extensionApi);
        if (strD != null) {
            arrayList3.add(MapsKt.o(TuplesKt.a("namespace", "imsOrgID"), TuplesKt.a("value", strD)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!arrayList3.isEmpty()) {
            linkedHashMap.put("companyContexts", arrayList3);
        }
        if (!arrayList2.isEmpty()) {
            linkedHashMap.put("users", CollectionsKt.e(MapsKt.g(TuplesKt.a("userIDs", arrayList2))));
        }
        try {
            string = new JSONObject(linkedHashMap).toString();
        } catch (JSONException unused) {
            string = new JSONObject().toString();
        }
        Intrinsics.i(string, "try {\n            JSONOb…ct().toString()\n        }");
        return string;
    }

    private j() {
    }
}
