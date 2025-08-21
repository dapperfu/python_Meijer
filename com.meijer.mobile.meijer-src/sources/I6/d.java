package I6;

import A6.HttpHeader;
import com.fullstory.FS;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import y6.C18292b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u001b\u0010\u000f\u001a\u00020\n8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ly6/b$a;", "Lokhttp3/OkHttpClient;", "okHttpClient", "d", "(Ly6/b$a;Lokhttp3/OkHttpClient;)Ly6/b$a;", "", "LA6/f;", "Lokhttp3/Headers;", "e", "(Ljava/util/List;)Lokhttp3/Headers;", "Lokhttp3/OkHttpClient$Builder;", "a", "Lkotlin/Lazy;", "c", "()Lokhttp3/OkHttpClient$Builder;", "defaultOkHttpClientBuilder", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Lazy f14365a = LazyKt.b(new Function0() { // from class: I6.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient.Builder b() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FS.okhttp_addInterceptors(builder);
        return builder;
    }

    public static final OkHttpClient.Builder c() {
        return (OkHttpClient.Builder) f14365a.getValue();
    }

    public static final C18292b.a d(C18292b.a aVar, OkHttpClient okHttpClient) {
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(okHttpClient, "okHttpClient");
        aVar.O(J6.a.b(okHttpClient));
        aVar.e0(new K6.d(okHttpClient));
        return aVar;
    }

    public static final Headers e(List<HttpHeader> list) {
        Intrinsics.j(list, "<this>");
        Headers.a aVar = new Headers.a();
        for (HttpHeader httpHeader : list) {
            aVar.a(httpHeader.getName(), httpHeader.getValue());
        }
        return aVar.f();
    }
}
