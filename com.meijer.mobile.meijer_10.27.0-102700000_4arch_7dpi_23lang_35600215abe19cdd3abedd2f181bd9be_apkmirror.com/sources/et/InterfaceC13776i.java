package et;

import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JP\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\"\u0010\n\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u0006\u0012\u0002\b\u00030\tH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Let/i;", "", "T", "Let/k;", "webAuthenticationProvider", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/okta/webauthenticationui/c;", "initializer", "d", "(Let/k;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/okta/webauthenticationui/d;", "b", "Lokhttp3/HttpUrl;", "url", "", "c", "(Landroid/content/Context;Lokhttp3/HttpUrl;)Z", "Landroid/net/Uri;", "uri", "", "a", "(Landroid/net/Uri;)V", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: et.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13776i {
    void a(Uri uri);

    Object b(Continuation<? super com.okta.webauthenticationui.d> continuation);

    boolean c(Context context, HttpUrl url);

    <T> Object d(InterfaceC13778k interfaceC13778k, Context context, Function1<? super Continuation<? super com.okta.webauthenticationui.c<T>>, ? extends Object> function1, Continuation<? super com.okta.webauthenticationui.c<T>> continuation);

    Object e(Continuation<? super com.okta.webauthenticationui.c<?>> continuation);
}
