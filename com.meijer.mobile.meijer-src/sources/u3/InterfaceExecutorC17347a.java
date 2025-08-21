package u3;

import d3.InterfaceC13610l;
import java.util.concurrent.Executor;

/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceExecutorC17347a extends Executor {

    /* renamed from: u3.a$a, reason: collision with other inner class name */
    class C2592a implements InterfaceExecutorC17347a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f163695a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC13610l f163696b;

        C2592a(Executor executor, InterfaceC13610l interfaceC13610l) {
            this.f163695a = executor;
            this.f163696b = interfaceC13610l;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f163695a.execute(runnable);
        }

        @Override // u3.InterfaceExecutorC17347a
        public void release() {
            this.f163696b.accept(this.f163695a);
        }
    }

    void release();

    static <T extends Executor> InterfaceExecutorC17347a I0(T t10, InterfaceC13610l<T> interfaceC13610l) {
        return new C2592a(t10, interfaceC13610l);
    }
}
