package W8;

import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LW8/e;", "Landroidx/lifecycle/f;", "LC9/a;", "session", "Ll9/b;", "concurrentHandlerHolder", "<init>", "(LC9/a;Ll9/b;)V", "Landroidx/lifecycle/s;", "owner", "", "onStart", "(Landroidx/lifecycle/s;)V", "onStop", "a", "LC9/a;", "b", "Ll9/b;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class e implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C9.a session;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l9.b concurrentHandlerHolder;

    public e(C9.a session, l9.b concurrentHandlerHolder) {
        Intrinsics.j(session, "session");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        this.session = session;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(e eVar) {
        eVar.session.a(new V8.a() { // from class: W8.d
            @Override // V8.a
            public final void a(Throwable th2) {
                e.f(th2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(Throwable th2) {
        if (th2 != null) {
            I9.e.INSTANCE.c(new J9.b(th2, null, 2, 0 == true ? 1 : 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(e eVar) {
        eVar.session.b(new V8.a() { // from class: W8.c
            @Override // V8.a
            public final void a(Throwable th2) {
                e.h(th2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(Throwable th2) {
        if (th2 != null) {
            I9.e.INSTANCE.c(new J9.b(th2, null, 2, 0 == true ? 1 : 0));
        }
    }

    @Override // androidx.view.InterfaceC6015f
    public void onStart(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        super.onStart(owner);
        this.concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: W8.a
            @Override // java.lang.Runnable
            public final void run() {
                e.e(this.f38632a);
            }
        });
    }

    @Override // androidx.view.InterfaceC6015f
    public void onStop(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        super.onStop(owner);
        this.concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: W8.b
            @Override // java.lang.Runnable
            public final void run() {
                e.g(this.f38633a);
            }
        });
    }
}
