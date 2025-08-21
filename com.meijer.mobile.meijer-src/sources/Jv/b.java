package Jv;

import Kk.AppVersion;
import Tq.j;
import com.adobe.marketing.mobile.target.o;
import com.squareup.moshi.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mobile.meijer.com.target.models.TargetBannerResponse;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B3\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LJv/b;", "", "LTq/j;", "storeProvider", "LCs/b;", "userProvider", "LJv/a;", "targetService", "Lcom/squareup/moshi/t;", "targetMoshi", "LKk/a;", "appVersion", "<init>", "(LTq/j;LCs/b;LJv/a;Lcom/squareup/moshi/t;LKk/a;)V", "", "", "bannerPositions", "", "Lmobile/meijer/com/target/models/TargetBannerResponse;", "b", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "position", "c", "(Ljava/lang/String;)Ljava/lang/String;", "a", "LTq/j;", "LCs/b;", "LJv/a;", "d", "Lcom/squareup/moshi/t;", "e", "LKk/a;", "target_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j storeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Jv.a targetService;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t targetMoshi;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AppVersion appVersion;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<String, String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map<String, TargetBannerResponse> f16241a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f16242b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f16243c;

        a(Map<String, TargetBannerResponse> map, CountDownLatch countDownLatch, b bVar) {
            this.f16241a = map;
            this.f16242b = countDownLatch;
            this.f16243c = bVar;
        }

        public final void a(String mboxName, String str) throws IOException {
            TargetBannerResponse targetBannerResponse;
            Intrinsics.j(mboxName, "mboxName");
            Map<String, TargetBannerResponse> map = this.f16241a;
            if (str != null) {
                Object objFromJson = this.f16243c.targetMoshi.c(TargetBannerResponse.class).fromJson(str);
                Intrinsics.g(objFromJson);
                targetBannerResponse = (TargetBannerResponse) objFromJson;
            } else {
                targetBannerResponse = null;
            }
            map.put(mboxName, targetBannerResponse);
            this.f16242b.countDown();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) throws IOException {
            a(str, str2);
            return Unit.f143329a;
        }
    }

    public b(j storeProvider, Cs.b userProvider, Jv.a targetService, t targetMoshi, AppVersion appVersion) {
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(userProvider, "userProvider");
        Intrinsics.j(targetService, "targetService");
        Intrinsics.j(targetMoshi, "targetMoshi");
        Intrinsics.j(appVersion, "appVersion");
        this.storeProvider = storeProvider;
        this.userProvider = userProvider;
        this.targetService = targetService;
        this.targetMoshi = targetMoshi;
        this.appVersion = appVersion;
    }

    public final Object b(List<String> list, Continuation<? super Map<String, TargetBannerResponse>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        List<String> list2 = list;
        ArrayList<String> arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(c((String) it.next()));
        }
        HashMap map = new HashMap();
        map.put("meijer-store", String.valueOf(this.storeProvider.g()));
        map.put("digitalID", String.valueOf(this.userProvider.c()));
        o oVarE = new o.b().g(map).e();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Jv.a aVar = this.targetService;
        Intrinsics.g(oVarE);
        aVar.a(arrayList, oVarE, new a(linkedHashMap, countDownLatch, this));
        countDownLatch.await();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (String str : arrayList) {
            linkedHashMap2.put(str, linkedHashMap.get(str));
        }
        safeContinuation.resumeWith(Result.b(linkedHashMap2));
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objB;
    }

    public final String c(String position) {
        Intrinsics.j(position, "position");
        return CollectionsKt.B0(CollectionsKt.p("meijer-mobile-app", (this.appVersion.getIsProdBuild() || this.appVersion.getIsPlayStore() || this.appVersion.getIsInternalProdBuild()) ? "prod" : "cert", "home", "genericAdBanner", position), "-", null, null, 0, null, null, 62, null);
    }
}
