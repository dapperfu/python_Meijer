package dk;

import Jk.AppVersion;
import Z4.h;
import android.content.Context;
import com.fullstory.FS;
import d5.InterfaceC13485a;
import j5.InterfaceC14857c;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l5.EnumC15366b;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import pk.k;
import q5.C16460l;
import qv.AbstractC16618K;
import zk.C18531a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ldk/g;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lokhttp3/Headers;", "globalHeaders", "Lqv/K;", "ioDispatcher", "Lpk/k;", "userAgentInterceptor", "LJk/a;", "appVersion", "LZ4/h;", "d", "(Landroid/content/Context;Lokhttp3/Headers;Lqv/K;Lpk/k;LJk/a;)LZ4/h;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dk.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C13535g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient e(Headers headers, k kVar) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FS.okhttp_addInterceptors(builder);
        return builder.addNetworkInterceptor(new C18531a(headers)).addInterceptor(kVar).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC14857c f(Context context) {
        return new InterfaceC14857c.a(context).b(0.2d).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC13485a g(Context context) {
        InterfaceC13485a.C2001a c2001a = new InterfaceC13485a.C2001a();
        File cacheDir = context.getCacheDir();
        Intrinsics.i(cacheDir, "getCacheDir(...)");
        return c2001a.b(FilesKt.r(cacheDir, "image_cache_coil")).d(0.2d).a();
    }

    public final Z4.h d(final Context context, final Headers globalHeaders, AbstractC16618K ioDispatcher, final k userAgentInterceptor, AppVersion appVersion) {
        Intrinsics.j(context, "context");
        Intrinsics.j(globalHeaders, "globalHeaders");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        Intrinsics.j(userAgentInterceptor, "userAgentInterceptor");
        Intrinsics.j(appVersion, "appVersion");
        h.a aVarI = new h.a(context).o(new Function0() { // from class: dk.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13535g.e(globalHeaders, userAgentInterceptor);
            }
        }).l(appVersion.getIsDevMode() ? new C16460l(0, 1, null) : null).p(false).m(new Function0() { // from class: dk.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13535g.f(context);
            }
        }).i(new Function0() { // from class: dk.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13535g.g(context);
            }
        });
        EnumC15366b enumC15366b = EnumC15366b.f148510c;
        return aVarI.n(enumC15366b).j(enumC15366b).k(ioDispatcher).d();
    }
}
