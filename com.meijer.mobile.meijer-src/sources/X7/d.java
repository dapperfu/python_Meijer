package X7;

import M7.k;
import android.content.Context;
import android.os.Build;
import g8.C14339c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x7.InterfaceC18129b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B<\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R/\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LX7/d;", "LK7/g;", "Lx7/b;", "networkConnectivityChecker", "Landroid/content/Context;", "applicationContext", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "context", "", "isDeviceRooted", "<init>", "(Lx7/b;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "LX7/b;", "cache", "", "b", "(LX7/b;)V", "a", "Lx7/b;", "Landroid/content/Context;", "c", "Lkotlin/jvm/functions/Function1;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements K7.g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18129b networkConnectivityChecker;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function1<Context, Boolean> isDeviceRooted;

    /* JADX WARN: Multi-variable type inference failed */
    public d(InterfaceC18129b networkConnectivityChecker, Context applicationContext, Function1<? super Context, Boolean> isDeviceRooted) {
        Intrinsics.j(networkConnectivityChecker, "networkConnectivityChecker");
        Intrinsics.j(applicationContext, "applicationContext");
        Intrinsics.j(isDeviceRooted, "isDeviceRooted");
        this.networkConnectivityChecker = networkConnectivityChecker;
        this.applicationContext = applicationContext;
        this.isDeviceRooted = isDeviceRooted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Context it) {
        Intrinsics.j(it, "it");
        return C14339c.f134109a.g(it);
    }

    @Override // K7.g
    public void a(b cache) {
        Intrinsics.j(cache, "cache");
        cache.x(k.a(this.networkConnectivityChecker.a()));
        cache.v(this.applicationContext.getResources().getConfiguration().orientation);
    }

    @Override // K7.g
    public void b(b cache) {
        Intrinsics.j(cache, "cache");
        cache.s(this.isDeviceRooted.invoke(this.applicationContext).booleanValue());
        cache.q(this.applicationContext.getPackageName());
        cache.t(Build.MANUFACTURER);
        cache.u(Build.MODEL);
        cache.y("Android");
        cache.z(Build.VERSION.RELEASE);
    }

    public /* synthetic */ d(InterfaceC18129b interfaceC18129b, Context context, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC18129b, context, (i10 & 4) != 0 ? new Function1() { // from class: X7.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(d.d((Context) obj));
            }
        } : function1);
    }
}
