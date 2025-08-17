package d3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d3.InterfaceC13479n;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class H implements InterfaceC13479n {

    /* renamed from: b, reason: collision with root package name */
    private static final List<b> f127072b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f127073a;

    private static final class b implements InterfaceC13479n.a {

        /* renamed from: a, reason: collision with root package name */
        private Message f127074a;

        /* renamed from: b, reason: collision with root package name */
        private H f127075b;

        private b() {
        }

        private void b() {
            this.f127074a = null;
            this.f127075b = null;
            H.n(this);
        }

        @Override // d3.InterfaceC13479n.a
        public void a() {
            ((Message) C13466a.e(this.f127074a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C13466a.e(this.f127074a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, H h10) {
            this.f127074a = message;
            this.f127075b = h10;
            return this;
        }
    }

    private static b m() {
        b bVar;
        List<b> list = f127072b;
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
        List<b> list = f127072b;
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

    @Override // d3.InterfaceC13479n
    public boolean b(int i10) {
        C13466a.a(i10 != 0);
        return this.f127073a.hasMessages(i10);
    }

    @Override // d3.InterfaceC13479n
    public void e(Object obj) {
        this.f127073a.removeCallbacksAndMessages(obj);
    }

    @Override // d3.InterfaceC13479n
    public Looper f() {
        return this.f127073a.getLooper();
    }

    @Override // d3.InterfaceC13479n
    public boolean h(int i10) {
        return this.f127073a.sendEmptyMessage(i10);
    }

    @Override // d3.InterfaceC13479n
    public boolean i(InterfaceC13479n.a aVar) {
        return ((b) aVar).c(this.f127073a);
    }

    @Override // d3.InterfaceC13479n
    public boolean j(int i10, long j10) {
        return this.f127073a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // d3.InterfaceC13479n
    public void k(int i10) {
        C13466a.a(i10 != 0);
        this.f127073a.removeMessages(i10);
    }

    @Override // d3.InterfaceC13479n
    public boolean post(Runnable runnable) {
        return this.f127073a.post(runnable);
    }

    public H(Handler handler) {
        this.f127073a = handler;
    }

    @Override // d3.InterfaceC13479n
    public InterfaceC13479n.a a(int i10) {
        return m().d(this.f127073a.obtainMessage(i10), this);
    }

    @Override // d3.InterfaceC13479n
    public InterfaceC13479n.a c(int i10, int i11, int i12, Object obj) {
        return m().d(this.f127073a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // d3.InterfaceC13479n
    public InterfaceC13479n.a d(int i10, Object obj) {
        return m().d(this.f127073a.obtainMessage(i10, obj), this);
    }

    @Override // d3.InterfaceC13479n
    public InterfaceC13479n.a g(int i10, int i11, int i12) {
        return m().d(this.f127073a.obtainMessage(i10, i11, i12), this);
    }
}
