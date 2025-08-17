package Kn;

import android.content.Context;
import ch.C6392a;
import com.fullstory.FS;
import com.squareup.picasso.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import zk.C18531a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LKn/t;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lokhttp3/OkHttpClient;", "client", "Lcom/squareup/picasso/o;", "a", "(Landroid/content/Context;Lokhttp3/OkHttpClient;)Lcom/squareup/picasso/o;", "Lokhttp3/Headers;", "globalHeaders", "Lpk/k;", "userAgentInterceptor", "b", "(Lokhttp3/Headers;Lpk/k;)Lokhttp3/OkHttpClient;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class t {
    public final com.squareup.picasso.o a(Context context, OkHttpClient client) {
        Intrinsics.j(context, "context");
        Intrinsics.j(client, "client");
        com.squareup.picasso.o oVarA = new o.b(context).d(new o.d() { // from class: Kn.s
        }).c(false).b(new C6392a(client)).a();
        Intrinsics.i(oVarA, "build(...)");
        return oVarA;
    }

    public final OkHttpClient b(Headers globalHeaders, pk.k userAgentInterceptor) {
        Intrinsics.j(globalHeaders, "globalHeaders");
        Intrinsics.j(userAgentInterceptor, "userAgentInterceptor");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        FS.okhttp_addInterceptors(builder);
        return builder.addInterceptor(userAgentInterceptor).addInterceptor(new C18531a(globalHeaders)).a();
    }
}
