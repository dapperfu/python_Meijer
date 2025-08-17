package t7;

import I7.j;
import f8.C13858b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lt7/b;", "Lt7/f;", "LI7/j;", "sessionInformationProvider", "Lf8/b;", "viewContextManager", "<init>", "(LI7/j;Lf8/b;)V", "", "c", "()Z", "", "name", "", "b", "(Ljava/lang/String;)V", "a", "()V", "LI7/j;", "Lf8/b;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: t7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17070b implements f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j sessionInformationProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C13858b viewContextManager;

    public C17070b(j sessionInformationProvider, C13858b viewContextManager) {
        Intrinsics.j(sessionInformationProvider, "sessionInformationProvider");
        Intrinsics.j(viewContextManager, "viewContextManager");
        this.sessionInformationProvider = sessionInformationProvider;
        this.viewContextManager = viewContextManager;
    }

    private final boolean c() {
        return this.sessionInformationProvider.a().getIsGrailEventsCanBeCaptured() && this.sessionInformationProvider.a().getSessionActive();
    }

    @Override // t7.f
    public void a() {
        if (c()) {
            this.viewContextManager.d();
            return;
        }
        x8.f.a("dtxViewContext", "stop view can't be executed, captureGrailEvents: " + c());
    }

    @Override // t7.f
    public void b(String name) {
        if (c() && name != null && name.length() != 0) {
            this.viewContextManager.g(name);
            return;
        }
        x8.f.a("dtxViewContext", "start view can't be executed, captureGrailEvents: " + c() + " name: " + name);
    }
}
