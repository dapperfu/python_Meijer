package ra;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import la.h;
import la.u;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lra/d;", "", "Lla/h;", "jsBridgeFactory", "Lla/u;", "jsCommandFactoryProvider", "Ll9/b;", "concurrentHandlerHolder", "<init>", "(Lla/h;Lla/u;Ll9/b;)V", "Landroid/content/Context;", "context", "Lra/a;", "a", "(Landroid/content/Context;)Lra/a;", "Lla/h;", "b", "Lla/u;", "c", "Ll9/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ra.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16739d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h jsBridgeFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u jsCommandFactoryProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l9.b concurrentHandlerHolder;

    public C16739d(h jsBridgeFactory, u jsCommandFactoryProvider, l9.b concurrentHandlerHolder) {
        Intrinsics.j(jsBridgeFactory, "jsBridgeFactory");
        Intrinsics.j(jsCommandFactoryProvider, "jsCommandFactoryProvider");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        this.jsBridgeFactory = jsBridgeFactory;
        this.jsCommandFactoryProvider = jsCommandFactoryProvider;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
    }

    public C16736a a(Context context) {
        Intrinsics.j(context, "context");
        return new C16736a(this.concurrentHandlerHolder, this.jsBridgeFactory, this.jsCommandFactoryProvider.c(), context);
    }
}
