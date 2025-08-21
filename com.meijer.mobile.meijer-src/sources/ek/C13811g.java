package ek;

import Kk.AppVersion;
import a5.h;
import android.content.Context;
import com.fullstory.FS;
import e5.InterfaceC13772a;
import java.io.File;
import k5.InterfaceC15089c;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m5.EnumC15663b;
import mv.AbstractC15779K;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import qk.k;
import r5.C16848l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lek/g;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lokhttp3/Headers;", "globalHeaders", "Lmv/K;", "ioDispatcher", "Lqk/k;", "userAgentInterceptor", "LKk/a;", "appVersion", "La5/h;", "d", "(Landroid/content/Context;Lokhttp3/Headers;Lmv/K;Lqk/k;LKk/a;)La5/h;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ek.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C13811g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient e(Headers headers, k kVar) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FS.okhttp_addInterceptors(builder);
        return builder.addNetworkInterceptor(new Ak.a(headers)).addInterceptor(kVar).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC15089c f(Context context) {
        return new InterfaceC15089c.a(context).b(0.2d).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC13772a g(Context context) {
        InterfaceC13772a.C2041a c2041a = new InterfaceC13772a.C2041a();
        File cacheDir = context.getCacheDir();
        Intrinsics.i(cacheDir, "getCacheDir(...)");
        return c2041a.c(FilesKt.r(cacheDir, "image_cache_coil")).d(0.2d).a();
    }

    public final a5.h d(final Context context, final Headers globalHeaders, AbstractC15779K ioDispatcher, final k userAgentInterceptor, AppVersion appVersion) {
        Intrinsics.j(context, "context");
        Intrinsics.j(globalHeaders, "globalHeaders");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        Intrinsics.j(userAgentInterceptor, "userAgentInterceptor");
        Intrinsics.j(appVersion, "appVersion");
        h.a aVarI = new h.a(context).o(new Function0() { // from class: ek.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13811g.e(globalHeaders, userAgentInterceptor);
            }
        }).l(appVersion.getIsDevMode() ? new C16848l(0, 1, null) : null).p(false).m(new Function0() { // from class: ek.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13811g.f(context);
            }
        }).i(new Function0() { // from class: ek.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13811g.g(context);
            }
        });
        EnumC15663b enumC15663b = EnumC15663b.f150580c;
        return aVarI.n(enumC15663b).j(enumC15663b).k(ioDispatcher).d();
    }
}
