package I7;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import w7.InterfaceC17801a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LI7/e;", "", "Lw7/a;", "timeProvider", "Landroid/app/Application;", "application", "Ls7/h;", "rumEventDispatcher", "Ls7/f;", "rumStartupEventDispatcher", "LI7/j;", "sessionInformationProvider", "<init>", "(Lw7/a;Landroid/app/Application;Ls7/h;Ls7/f;LI7/j;)V", "LR7/c;", "b", "()LR7/c;", "a", "Lw7/a;", "Landroid/app/Application;", "c", "Ls7/h;", "d", "Ls7/f;", "e", "LI7/j;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17801a timeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s7.h rumEventDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final s7.f rumStartupEventDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j sessionInformationProvider;

    public e(InterfaceC17801a timeProvider, Application application, s7.h rumEventDispatcher, s7.f rumStartupEventDispatcher, j sessionInformationProvider) {
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(application, "application");
        Intrinsics.j(rumEventDispatcher, "rumEventDispatcher");
        Intrinsics.j(rumStartupEventDispatcher, "rumStartupEventDispatcher");
        Intrinsics.j(sessionInformationProvider, "sessionInformationProvider");
        this.timeProvider = timeProvider;
        this.application = application;
        this.rumEventDispatcher = rumEventDispatcher;
        this.rumStartupEventDispatcher = rumStartupEventDispatcher;
        this.sessionInformationProvider = sessionInformationProvider;
    }

    public final R7.c b() {
        final R7.e eVar = new R7.e(this.timeProvider, this.rumEventDispatcher, this.sessionInformationProvider);
        return new R7.c(new R7.b(this.timeProvider, new U7.a(), this.rumStartupEventDispatcher, this.sessionInformationProvider, new Function0() { // from class: I7.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.c(eVar);
            }
        }), eVar, this.application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T7.d c(R7.e eVar) {
        return eVar.getVisibilityStatus();
    }
}
