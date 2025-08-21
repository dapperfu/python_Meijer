package K7;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import y7.InterfaceC18294a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LK7/e;", "", "Ly7/a;", "timeProvider", "Landroid/app/Application;", "application", "Lu7/h;", "rumEventDispatcher", "Lu7/f;", "rumStartupEventDispatcher", "LK7/j;", "sessionInformationProvider", "<init>", "(Ly7/a;Landroid/app/Application;Lu7/h;Lu7/f;LK7/j;)V", "LT7/c;", "b", "()LT7/c;", "a", "Ly7/a;", "Landroid/app/Application;", "c", "Lu7/h;", "d", "Lu7/f;", "e", "LK7/j;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18294a timeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u7.h rumEventDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u7.f rumStartupEventDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j sessionInformationProvider;

    public e(InterfaceC18294a timeProvider, Application application, u7.h rumEventDispatcher, u7.f rumStartupEventDispatcher, j sessionInformationProvider) {
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

    public final T7.c b() {
        final T7.e eVar = new T7.e(this.timeProvider, this.rumEventDispatcher, this.sessionInformationProvider);
        return new T7.c(new T7.b(this.timeProvider, new W7.a(), this.rumStartupEventDispatcher, this.sessionInformationProvider, new Function0() { // from class: K7.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.c(eVar);
            }
        }), eVar, this.application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V7.d c(T7.e eVar) {
        return eVar.getVisibilityStatus();
    }
}
