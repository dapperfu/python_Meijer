package Aa;

import D9.ResponseModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m9.C15696a;
import pa.ButtonClicked;
import qa.C16616a;
import sa.C17034a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\u001a\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r0\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#¨\u0006$"}, d2 = {"LAa/d;", "LD9/a;", "Lg9/c;", "Lqa/a;", "Lg9/d;", "displayedIamRepository", "Lpa/a;", "buttonClickedRepository", "LFa/b;", "requestModelHelper", "<init>", "(Lg9/c;Lg9/c;LFa/b;)V", "", "", "", "", "items", "", "d", "(Ljava/util/List;)[Ljava/lang/String;", "LA9/c;", "requestModel", "key", "", "e", "(LA9/c;Ljava/lang/String;)Z", "LD9/c;", "responseModel", "c", "(LD9/c;)Z", "", "a", "(LD9/c;)V", "Lg9/c;", "b", "LFa/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class d extends D9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g9.c<C16616a, g9.d> displayedIamRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g9.c<ButtonClicked, g9.d> buttonClickedRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Fa.b requestModelHelper;

    public d(g9.c<C16616a, g9.d> displayedIamRepository, g9.c<ButtonClicked, g9.d> buttonClickedRepository, Fa.b requestModelHelper) {
        Intrinsics.j(displayedIamRepository, "displayedIamRepository");
        Intrinsics.j(buttonClickedRepository, "buttonClickedRepository");
        Intrinsics.j(requestModelHelper, "requestModelHelper");
        this.displayedIamRepository = displayedIamRepository;
        this.buttonClickedRepository = buttonClickedRepository;
        this.requestModelHelper = requestModelHelper;
    }

    private final String[] d(List<? extends Map<String, ? extends Object>> items) {
        List<? extends Map<String, ? extends Object>> list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object obj = ((Map) it.next()).get("campaignId");
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) obj);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // D9.a
    public void a(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        Map<String, Object> mapD = responseModel.getRequestModel().d();
        if (mapD != null && mapD.containsKey("clicks")) {
            Object obj = mapD.get("clicks");
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any?>>");
            String[] strArrD = d((List) obj);
            if (!(strArrD.length == 0)) {
                this.buttonClickedRepository.remove(new C17034a((String[]) Arrays.copyOf(strArrD, strArrD.length)));
            }
        }
        if (mapD == null || !mapD.containsKey("viewedMessages")) {
            return;
        }
        Object obj2 = mapD.get("viewedMessages");
        Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any?>>");
        String[] strArrD2 = d((List) obj2);
        if (strArrD2.length == 0) {
            return;
        }
        this.displayedIamRepository.remove(new C17034a((String[]) Arrays.copyOf(strArrD2, strArrD2.length)));
    }

    @Override // D9.a
    public boolean c(ResponseModel responseModel) {
        int statusCode;
        Intrinsics.j(responseModel, "responseModel");
        A9.c requestModel = responseModel.getRequestModel();
        if (!C15696a.c(P8.a.f25708d) || !this.requestModelHelper.a(responseModel.getRequestModel()) || 200 > (statusCode = responseModel.getStatusCode()) || statusCode >= 300) {
            return false;
        }
        return e(requestModel, "viewedMessages") || e(requestModel, "clicks");
    }

    private final boolean e(A9.c requestModel, String key) {
        Map<String, Object> mapD = requestModel.d();
        if (mapD != null && !mapD.isEmpty() && mapD.containsKey(key)) {
            return true;
        }
        return false;
    }
}
