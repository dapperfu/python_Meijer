package d3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d3.InterfaceC13612n;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class H implements InterfaceC13612n {

    /* renamed from: b, reason: collision with root package name */
    private static final List<b> f127874b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f127875a;

    private static final class b implements InterfaceC13612n.a {

        /* renamed from: a, reason: collision with root package name */
        private Message f127876a;

        /* renamed from: b, reason: collision with root package name */
        private H f127877b;

        private b() {
        }

        private void b() {
            this.f127876a = null;
            this.f127877b = null;
            H.n(this);
        }

        @Override // d3.InterfaceC13612n.a
        public void a() {
            ((Message) C13599a.e(this.f127876a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C13599a.e(this.f127876a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, H h10) {
            this.f127876a = message;
            this.f127877b = h10;
            return this;
        }
    }

    private static b m() {
        b bVar;
        List<b> list = f127874b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(b bVar) {
        List<b> list = f127874b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // d3.InterfaceC13612n
    public boolean b(int i10) {
        C13599a.a(i10 != 0);
        return this.f127875a.hasMessages(i10);
    }

    @Override // d3.InterfaceC13612n
    public void e(Object obj) {
        this.f127875a.removeCallbacksAndMessages(obj);
    }

    @Override // d3.InterfaceC13612n
    public Looper f() {
        return this.f127875a.getLooper();
    }

    @Override // d3.InterfaceC13612n
    public boolean h(int i10) {
        return this.f127875a.sendEmptyMessage(i10);
    }

    @Override // d3.InterfaceC13612n
    public boolean i(InterfaceC13612n.a aVar) {
        return ((b) aVar).c(this.f127875a);
    }

    @Override // d3.InterfaceC13612n
    public boolean j(int i10, long j10) {
        return this.f127875a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // d3.InterfaceC13612n
    public void k(int i10) {
        C13599a.a(i10 != 0);
        this.f127875a.removeMessages(i10);
    }

    @Override // d3.InterfaceC13612n
    public boolean post(Runnable runnable) {
        return this.f127875a.post(runnable);
    }

    public H(Handler handler) {
        this.f127875a = handler;
    }

    @Override // d3.InterfaceC13612n
    public InterfaceC13612n.a a(int i10) {
        return m().d(this.f127875a.obtainMessage(i10), this);
    }

    @Override // d3.InterfaceC13612n
    public InterfaceC13612n.a c(int i10, int i11, int i12, Object obj) {
        return m().d(this.f127875a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // d3.InterfaceC13612n
    public InterfaceC13612n.a d(int i10, Object obj) {
        return m().d(this.f127875a.obtainMessage(i10, obj), this);
    }

    @Override // d3.InterfaceC13612n
    public InterfaceC13612n.a g(int i10, int i11, int i12) {
        return m().d(this.f127875a.obtainMessage(i10, i11, i12), this);
    }
}
