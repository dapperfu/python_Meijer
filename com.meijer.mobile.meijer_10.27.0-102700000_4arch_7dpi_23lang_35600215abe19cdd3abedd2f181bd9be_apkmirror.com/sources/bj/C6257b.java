package bj;

import Qs.C5171a;
import Qs.p;
import Vs.b;
import android.content.Context;
import com.fullstory.FS;
import com.okta.authfoundation.client.j;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\b2\u0013\b\u0001\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lbj/b;", "", "<init>", "()V", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "interceptors", "Lokhttp3/OkHttpClient;", "d", "(Ljava/util/Set;)Lokhttp3/OkHttpClient;", "Landroid/content/Context;", "context", "okHttpClient", "Lokhttp3/HttpUrl;", "oktaIssuerUrl", "", "oktaClientId", "LVs/b$b;", "b", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Lokhttp3/HttpUrl;Ljava/lang/String;)LVs/b$b;", "okta_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: bj.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6257b {

    /* renamed from: a, reason: collision with root package name */
    public static final C6257b f60317a = new C6257b();

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient c(OkHttpClient okHttpClient) {
        return okHttpClient;
    }

    public final b.Companion b(Context context, final OkHttpClient okHttpClient, HttpUrl oktaIssuerUrl, String oktaClientId) {
        Object objB;
        Object objB2;
        Intrinsics.j(context, "context");
        Intrinsics.j(okHttpClient, "okHttpClient");
        Intrinsics.j(oktaIssuerUrl, "oktaIssuerUrl");
        Intrinsics.j(oktaClientId, "oktaClientId");
        C5171a.f31383a.a(context);
        try {
            Result.Companion companion = Result.INSTANCE;
            p.f31384a.L(new Function0() { // from class: bj.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C6257b.c(okHttpClient);
                }
            });
            objB = Result.b(Unit.f142422a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            uw.a.INSTANCE.u(thE, "AuthFoundationDefaults.okHttpClientFactory already initialized with " + p.f31384a.E(), new Object[0]);
        }
        try {
            j.INSTANCE.e(new j(oktaClientId, "openid profile offline_access", oktaIssuerUrl.getUrl()));
            objB2 = Result.b(Unit.f142422a);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objB2 = Result.b(ResultKt.a(th3));
        }
        Throwable thE2 = Result.e(objB2);
        if (thE2 != null) {
            uw.a.INSTANCE.u(thE2, "OidcConfiguration.default already initialized with " + j.INSTANCE.d(), new Object[0]);
        }
        return Vs.b.INSTANCE;
    }

    public final OkHttpClient d(Set<Interceptor> interceptors) {
        Intrinsics.j(interceptors, "interceptors");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FS.okhttp_addInterceptors(builder);
        Iterator<T> it = interceptors.iterator();
        while (it.hasNext()) {
            builder.addInterceptor((Interceptor) it.next());
        }
        return builder.a();
    }

    private C6257b() {
    }
}
