package cj;

import android.app.Application;
import android.content.Context;
import com.medallia.digital.mobilesdk.q2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import w6.C17779a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcj/a;", "Lokhttp3/Interceptor;", "Landroid/content/Context;", "application", "Lokhttp3/HttpUrl;", "oktaIssuerUrl", "<init>", "(Landroid/content/Context;Lokhttp3/HttpUrl;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: cj.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6401a implements Interceptor {
    public C6401a(Context application, HttpUrl oktaIssuerUrl) {
        Intrinsics.j(application, "application");
        Intrinsics.j(oktaIssuerUrl, "oktaIssuerUrl");
        C17779a.d(15);
        C17779a.a();
        C17779a.c((Application) application, oktaIssuerUrl.k().j(q2.f92724c).g().getUrl());
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.j(chain, "chain");
        Request.a aVarG = chain.request().g();
        String strB = C17779a.b();
        Intrinsics.i(strB, "getSensorData(...)");
        return chain.proceed(aVarG.a("X-acf-sensor-data", strB).b());
    }
}
