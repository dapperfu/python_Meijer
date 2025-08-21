package Ma;

import A9.c;
import I9.h;
import Ia.d;
import Ia.e;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l9.C15476b;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 32\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0012¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0012¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0012¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0011H\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0012¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00118\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\f8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"LMa/c;", "", "LMa/b;", "requestContext", "LMa/a;", "headerFactory", "Ll9/b;", "predictServiceEndpointProvider", "<init>", "(LMa/b;LMa/a;Ll9/b;)V", "LIa/b;", "logic", "", "c", "(LIa/b;)Ljava/lang/String;", "e", "f", "", "shardData", "d", "(Ljava/util/Map;)Ljava/lang/String;", "b", "()Ljava/lang/String;", "g", "(Ljava/util/Map;)LMa/c;", "LA9/c;", "a", "()LA9/c;", "LMa/b;", "LMa/a;", "Ll9/b;", "Ljava/util/Map;", "LIa/b;", "LKa/a;", "LKa/a;", "lastTrackedItemContainer", "", "Ljava/lang/Integer;", "limit", "h", "Ljava/lang/String;", "availabilityZone", "", "LIa/d;", "i", "Ljava/util/List;", "filters", "Landroid/net/Uri$Builder;", "j", "Landroid/net/Uri$Builder;", "uriBuilder", "k", "predict_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PredictRequestContext requestContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a headerFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C15476b predictServiceEndpointProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Map<String, ? extends Object> shardData;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Ia.b logic;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Ka.a lastTrackedItemContainer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Integer limit;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String availabilityZone;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private List<? extends d> filters;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Uri.Builder uriBuilder;

    public c(PredictRequestContext requestContext, a headerFactory, C15476b predictServiceEndpointProvider) {
        Intrinsics.j(requestContext, "requestContext");
        Intrinsics.j(headerFactory, "headerFactory");
        Intrinsics.j(predictServiceEndpointProvider, "predictServiceEndpointProvider");
        this.requestContext = requestContext;
        this.headerFactory = headerFactory;
        this.predictServiceEndpointProvider = predictServiceEndpointProvider;
        Uri.Builder builderAppendPath = Uri.parse(predictServiceEndpointProvider.a()).buildUpon().appendPath(requestContext.getMerchantId());
        Intrinsics.i(builderAppendPath, "appendPath(...)");
        this.uriBuilder = builderAppendPath;
    }

    private String b() {
        ArrayList arrayList = new ArrayList();
        List<? extends d> list = this.filters;
        if (list != null) {
            for (d dVar : list) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("f", dVar.getField());
                linkedHashMap.put("r", dVar.getComparison());
                linkedHashMap.put("v", TextUtils.join("|", dVar.b()));
                linkedHashMap.put("n", Boolean.valueOf(!Intrinsics.e(dVar.getType(), "EXCLUDE")));
                arrayList.add(linkedHashMap);
            }
        }
        String string = h.a(arrayList).toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    private String c(Ia.b logic) {
        if (this.limit == null) {
            this.limit = 5;
        }
        H9.h keyValueStore = this.requestContext.getKeyValueStore();
        String strA = keyValueStore.a("predict_visitor_id");
        if (strA != null) {
            this.uriBuilder.appendQueryParameter("vi", strA);
        }
        String strA2 = keyValueStore.a("predict_contact_id");
        if (strA2 != null) {
            this.uriBuilder.appendQueryParameter("ci", strA2);
        }
        String str = this.availabilityZone;
        if (str != null) {
            this.uriBuilder.appendQueryParameter("az", str);
        }
        if (this.filters != null) {
            this.uriBuilder.appendQueryParameter("ex", b());
        }
        String strF = (Intrinsics.e("PERSONAL", logic.getLogicName()) || Intrinsics.e("HOME", logic.getLogicName())) ? f(logic) : e(logic);
        this.uriBuilder.clearQuery();
        return strF;
    }

    private String d(Map<String, ? extends Object> shardData) {
        Uri.Builder builderAppendPath = Uri.parse(this.predictServiceEndpointProvider.a()).buildUpon().appendPath(this.requestContext.getMerchantId());
        for (String str : shardData.keySet()) {
            builderAppendPath.appendQueryParameter(str, String.valueOf(shardData.get(str)));
        }
        String string = builderAppendPath.build().toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private String e(Ia.b logic) {
        this.uriBuilder.appendQueryParameter("f", "f:" + logic.getLogicName() + ",l:" + this.limit + ",o:0");
        Map mapD = MapsKt.D(logic.getData());
        if (mapD.isEmpty()) {
            String logicName = logic.getLogicName();
            switch (logicName.hashCode()) {
                case -1961059229:
                    if (logicName.equals("ALSO_BOUGHT")) {
                        Ka.a aVar = this.lastTrackedItemContainer;
                        Intrinsics.g(aVar);
                        if (aVar.c() != null) {
                            e.Companion companion = e.INSTANCE;
                            Ka.a aVar2 = this.lastTrackedItemContainer;
                            Intrinsics.g(aVar2);
                            String strC = aVar2.c();
                            Intrinsics.i(strC, "getLastItemView(...)");
                            mapD.putAll(companion.a(strC).getData());
                            break;
                        }
                    }
                    break;
                case -1853007448:
                    if (logicName.equals("SEARCH")) {
                        Ka.a aVar3 = this.lastTrackedItemContainer;
                        Intrinsics.g(aVar3);
                        if (aVar3.d() != null) {
                            e.Companion companion2 = e.INSTANCE;
                            Ka.a aVar4 = this.lastTrackedItemContainer;
                            Intrinsics.g(aVar4);
                            String strD = aVar4.d();
                            Intrinsics.i(strD, "getLastSearchTerm(...)");
                            mapD.putAll(companion2.h(strD).getData());
                            break;
                        }
                    }
                    break;
                case 2061088:
                    if (logicName.equals("CART")) {
                        Ka.a aVar5 = this.lastTrackedItemContainer;
                        Intrinsics.g(aVar5);
                        if (aVar5.a() != null) {
                            e.Companion companion3 = e.INSTANCE;
                            Ka.a aVar6 = this.lastTrackedItemContainer;
                            Intrinsics.g(aVar6);
                            List<Ia.a> listA = aVar6.a();
                            Intrinsics.i(listA, "getLastCartItems(...)");
                            mapD.putAll(companion3.b(listA).getData());
                            break;
                        }
                    }
                    break;
                case 324042425:
                    if (logicName.equals("POPULAR")) {
                        Ka.a aVar7 = this.lastTrackedItemContainer;
                        Intrinsics.g(aVar7);
                        if (aVar7.b() != null) {
                            e.Companion companion4 = e.INSTANCE;
                            Ka.a aVar8 = this.lastTrackedItemContainer;
                            Intrinsics.g(aVar8);
                            String strB = aVar8.b();
                            Intrinsics.i(strB, "getLastCategoryPath(...)");
                            mapD.putAll(companion4.f(strB).getData());
                            break;
                        }
                    }
                    break;
                case 833137918:
                    if (logicName.equals("CATEGORY")) {
                        Ka.a aVar9 = this.lastTrackedItemContainer;
                        Intrinsics.g(aVar9);
                        if (aVar9.b() != null) {
                            e.Companion companion5 = e.INSTANCE;
                            Ka.a aVar10 = this.lastTrackedItemContainer;
                            Intrinsics.g(aVar10);
                            String strB2 = aVar10.b();
                            Intrinsics.i(strB2, "getLastCategoryPath(...)");
                            mapD.putAll(companion5.e(strB2).getData());
                            break;
                        }
                    }
                    break;
                case 1808476171:
                    if (logicName.equals("RELATED")) {
                        Ka.a aVar11 = this.lastTrackedItemContainer;
                        Intrinsics.g(aVar11);
                        if (aVar11.c() != null) {
                            e.Companion companion6 = e.INSTANCE;
                            Ka.a aVar12 = this.lastTrackedItemContainer;
                            Intrinsics.g(aVar12);
                            String strC2 = aVar12.c();
                            Intrinsics.i(strC2, "getLastItemView(...)");
                            mapD.putAll(companion6.g(strC2).getData());
                            break;
                        }
                    }
                    break;
            }
        }
        for (String str : mapD.keySet()) {
            this.uriBuilder.appendQueryParameter(str, (String) mapD.get(str));
        }
        String string = this.uriBuilder.build().toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public A9.c a() {
        c.a aVarK = new c.a(this.requestContext.getTimestampProvider(), this.requestContext.getUuidProvider()).k(A9.b.GET);
        Map<String, String> mapA = this.headerFactory.a();
        Intrinsics.i(mapA, "createBaseHeader(...)");
        c.a aVarJ = aVarK.j(mapA);
        Ia.b bVar = this.logic;
        if (bVar != null) {
            Intrinsics.g(bVar);
            aVarJ.p(c(bVar));
        } else {
            Map<String, ? extends Object> map = this.shardData;
            Intrinsics.g(map);
            aVarJ.p(d(map));
        }
        return aVarJ.a();
    }

    public c g(Map<String, ? extends Object> shardData) {
        Intrinsics.j(shardData, "shardData");
        this.shardData = shardData;
        return this;
    }

    private String f(Ia.b logic) {
        List<String> listA = logic.a();
        if (listA.isEmpty()) {
            this.uriBuilder.appendQueryParameter("f", "f:" + logic.getLogicName() + ",l:" + this.limit + ",o:0");
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str : listA) {
                arrayList.add("f:" + logic.getLogicName() + "_" + str + ",l:" + this.limit + ",o:0");
            }
            this.uriBuilder.appendQueryParameter("f", TextUtils.join("|", arrayList));
        }
        String string = this.uriBuilder.build().toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }
}
