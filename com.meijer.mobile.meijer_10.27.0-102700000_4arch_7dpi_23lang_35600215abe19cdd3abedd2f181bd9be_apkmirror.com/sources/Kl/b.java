package Kl;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Response;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0010"}, d2 = {"LKl/b;", "Lokhttp3/Interceptor;", "LKl/c;", "hybrisResponseMonitor", "<init>", "(LKl/c;)V", "Lokhttp3/Response;", "response", "a", "(Lokhttp3/Response;)Lokhttp3/Response;", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "LKl/c;", "b", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class b implements Interceptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c hybrisResponseMonitor;

    public b(c hybrisResponseMonitor) {
        Intrinsics.j(hybrisResponseMonitor, "hybrisResponseMonitor");
        this.hybrisResponseMonitor = hybrisResponseMonitor;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Response responseA;
        Intrinsics.j(chain, "chain");
        String hybrisAppNodeLock = this.hybrisResponseMonitor.getHybrisAppNodeLock();
        return (hybrisAppNodeLock == null || (responseA = a(chain.proceed(chain.request().g().a("Cookie", hybrisAppNodeLock).b()))) == null) ? a(chain.proceed(chain.request())) : responseA;
    }

    private final Response a(Response response) {
        List list;
        Object next;
        String str;
        List listA1;
        String str2;
        List<String> list2 = response.getHeaders().o().get("Set-Cookie");
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (true) {
                list = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (StringsKt.c0((String) next, "ROUTE=", false, 2, null)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            String str3 = (String) next;
            if (str3 != null) {
                List listA12 = StringsKt.a1(str3, new String[]{";"}, false, 0, 6, null);
                if (listA12.isEmpty()) {
                    listA12 = null;
                }
                if (listA12 != null && (str = (String) listA12.get(0)) != null && (listA1 = StringsKt.a1(str, new String[]{"="}, false, 0, 6, null)) != null) {
                    if (listA1.size() >= 2) {
                        list = listA1;
                    }
                    if (list != null && (str2 = (String) list.get(1)) != null) {
                        this.hybrisResponseMonitor.b("ROUTE=" + str2);
                    }
                }
            }
        }
        return response;
    }
}
