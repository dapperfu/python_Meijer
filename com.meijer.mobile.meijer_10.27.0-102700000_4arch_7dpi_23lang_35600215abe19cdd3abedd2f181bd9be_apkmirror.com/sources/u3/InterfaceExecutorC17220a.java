package u3;

import d3.InterfaceC13477l;
import java.util.concurrent.Executor;

/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceExecutorC17220a extends Executor {

    /* renamed from: u3.a$a, reason: collision with other inner class name */
    class C2568a implements InterfaceExecutorC17220a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f162657a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC13477l f162658b;

        C2568a(Executor executor, InterfaceC13477l interfaceC13477l) {
            this.f162657a = executor;
            this.f162658b = interfaceC13477l;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f162657a.execute(runnable);
        }

        @Override // u3.InterfaceExecutorC17220a
        public void release() {
            this.f162658b.accept(this.f162657a);
        }
    }

    void release();

    static <T extends Executor> InterfaceExecutorC17220a K0(T t10, InterfaceC13477l<T> interfaceC13477l) {
        return new C2568a(t10, interfaceC13477l);
    }
}
