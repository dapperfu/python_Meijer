package et;

import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mv.C15784P;
import mv.C15800f0;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nH\u0096A¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\fH\u0096A¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096A¢\u0006\u0004\b\u0013\u0010\u0011J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Let/j;", "Let/i;", "<init>", "()V", "", "T", "Let/k;", "webAuthenticationProvider", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/okta/webauthenticationui/c;", "initializer", "d", "(Let/k;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/okta/webauthenticationui/d;", "b", "Lokhttp3/HttpUrl;", "url", "", "c", "(Landroid/content/Context;Lokhttp3/HttpUrl;)Z", "Landroid/net/Uri;", "uri", "", "a", "(Landroid/net/Uri;)V", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: et.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13886j implements InterfaceC13885i {

    /* renamed from: b, reason: collision with root package name */
    public static final C13886j f130897b = new C13886j();

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.okta.webauthenticationui.a f130898a = new com.okta.webauthenticationui.a(C15784P.a(C15800f0.c()));

    @Override // et.InterfaceC13885i
    public void a(Uri uri) {
        this.f130898a.a(uri);
    }

    @Override // et.InterfaceC13885i
    public Object b(Continuation<? super com.okta.webauthenticationui.d> continuation) {
        return this.f130898a.b(continuation);
    }

    @Override // et.InterfaceC13885i
    public boolean c(Context context, HttpUrl url) {
        Intrinsics.j(context, "context");
        Intrinsics.j(url, "url");
        return this.f130898a.c(context, url);
    }

    @Override // et.InterfaceC13885i
    public <T> Object d(InterfaceC13887k interfaceC13887k, Context context, Function1<? super Continuation<? super com.okta.webauthenticationui.c<T>>, ? extends Object> function1, Continuation<? super com.okta.webauthenticationui.c<T>> continuation) {
        return this.f130898a.d(interfaceC13887k, context, function1, continuation);
    }

    @Override // et.InterfaceC13885i
    public Object e(Continuation<? super com.okta.webauthenticationui.c<?>> continuation) {
        return this.f130898a.e(continuation);
    }

    private C13886j() {
    }
}
