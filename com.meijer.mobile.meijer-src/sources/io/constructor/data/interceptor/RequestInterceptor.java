package io.constructor.data.interceptor;

import com.medallia.digital.mobilesdk.q2;
import io.constructor.BuildConfig;
import io.constructor.data.local.PreferencesHelper;
import io.constructor.data.memory.ConfigMemoryHolder;
import io.constructor.data.remote.ApiPaths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lio/constructor/data/interceptor/RequestInterceptor;", "Lokhttp3/Interceptor;", "preferencesHelper", "Lio/constructor/data/local/PreferencesHelper;", "configMemoryHolder", "Lio/constructor/data/memory/ConfigMemoryHolder;", "(Lio/constructor/data/local/PreferencesHelper;Lio/constructor/data/memory/ConfigMemoryHolder;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "redactPathSegments", "", "pathSegments", "", "redactPii", "query", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class RequestInterceptor implements Interceptor {
    private final ConfigMemoryHolder configMemoryHolder;
    private final PreferencesHelper preferencesHelper;

    public RequestInterceptor(PreferencesHelper preferencesHelper, ConfigMemoryHolder configMemoryHolder) {
        Intrinsics.j(preferencesHelper, "preferencesHelper");
        Intrinsics.j(configMemoryHolder, "configMemoryHolder");
        this.preferencesHelper = preferencesHelper;
        this.configMemoryHolder = configMemoryHolder;
    }

    private final String redactPathSegments(List<String> pathSegments) {
        List<String> list = pathSegments;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(redactPii((String) it.next()));
        }
        return CollectionsKt.B0(arrayList, q2.f93563c, null, null, 0, null, null, 62, null);
    }

    private final String redactPii(String query) {
        Regex regex = new Regex("[\\w\\-+\\\\.]+@([\\w-]+\\.)+[\\w-]{2,4}");
        Regex regex2 = new Regex("^(?:\\+\\d{11,12}|\\+\\d{1,3}\\s\\d{3}\\s\\d{3}\\s\\d{3,4}|\\(\\d{3}\\)\\d{7}|\\(\\d{3}\\)\\s\\d{3}\\s\\d{4}|\\(\\d{3}\\)\\d{3}-\\d{4}|\\(\\d{3}\\)\\s\\d{3}-\\d{4})$");
        Regex regex3 = new Regex("^(?:4[0-9]{15}|(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|6(?:011|5[0-9]{2})[0-9]{12}|(?:2131|1800|35\\d{3})\\d{11})$");
        return regex.b(query) ? regex.k(query, "<email_omitted>") : regex2.b(query) ? regex2.k(query, "<phone_omitted>") : regex3.b(query) ? regex3.k(query, "<credit_omitted>") : query;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.j(chain, "chain");
        List listP = CollectionsKt.p(ApiPaths.URL_BROWSE_GROUPS, ApiPaths.URL_BROWSE_FACETS, ApiPaths.URL_BROWSE_FACET_OPTIONS);
        List listP2 = CollectionsKt.p(new Regex(ApiPaths.URL_BEHAVIORAL_V1_PREFIX), new Regex(ApiPaths.URL_BEHAVIORAL_V2_PREFIX), new Regex(ApiPaths.URL_BEHAVIORAL_SEARCH_REGEX));
        Request request = chain.request();
        HttpUrl.a aVarK = request.getUrl().k();
        Request.a aVarG = request.g();
        List list = listP2;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Regex) it.next()).j(request.getUrl().c())) {
                    aVarK = new HttpUrl.a().D(request.getUrl().getScheme()).u(request.getUrl().getPort()).n(request.getUrl().getHost()).d(redactPathSegments(request.getUrl().n()));
                    for (String str : request.getUrl().r()) {
                        for (String str2 : request.getUrl().t(str)) {
                            if (str2 != null) {
                                aVarK.f(str, redactPii(str2));
                            }
                        }
                    }
                }
            }
        }
        aVarK.u(this.preferencesHelper.getPort()).f("key", this.preferencesHelper.getApiKey()).f("i", this.preferencesHelper.getId());
        String userId = this.configMemoryHolder.getUserId();
        if (userId != null) {
            aVarK.f("ui", userId);
        }
        aVarK.f("s", String.valueOf(PreferencesHelper.getSessionId$default(this.preferencesHelper, null, false, 3, null)));
        Iterator<T> it2 = this.configMemoryHolder.getTestCellParams().iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            if (pair != null) {
                aVarK.f("ef-" + pair.c(), (String) pair.d());
            }
        }
        for (String str3 : this.configMemoryHolder.getSegments()) {
            if (str3 != null) {
                aVarK.f("us", str3);
            }
        }
        aVarK.f("c", BuildConfig.CLIENT_VERSION);
        List list2 = listP;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            aVarK.f("_dt", String.valueOf(System.currentTimeMillis()));
        } else {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                if (StringsKt.G(request.getUrl().c(), (String) it3.next(), false, 2, null)) {
                    break;
                }
            }
            aVarK.f("_dt", String.valueOf(System.currentTimeMillis()));
        }
        return chain.proceed(aVarG.v(aVarK.g()).b());
    }
}
