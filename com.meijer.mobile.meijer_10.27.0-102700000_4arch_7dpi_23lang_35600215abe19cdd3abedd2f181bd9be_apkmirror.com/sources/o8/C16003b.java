package o8;

import g8.C14219b;
import g8.l;
import g8.x;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import x8.f;

/* renamed from: o8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16003b extends Thread {

    /* renamed from: c, reason: collision with root package name */
    private static volatile C16003b f153203c;

    /* renamed from: a, reason: collision with root package name */
    private BlockingQueue<a> f153205a = new LinkedBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    private static final String f153202b = x.f133195a + "DatabaseWriteQueue";

    /* renamed from: d, reason: collision with root package name */
    private static AtomicBoolean f153204d = new AtomicBoolean(false);

    public synchronized void b() {
        try {
            LinkedList<a> linkedList = new LinkedList<>();
            a aVarPoll = this.f153205a.poll();
            while (aVarPoll != null) {
                linkedList.add(aVarPoll);
                aVarPoll = this.f153205a.poll();
            }
            if (!linkedList.isEmpty()) {
                l.f133079i.h(linkedList, C14219b.e().f());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: o8.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f153206a;

        /* renamed from: b, reason: collision with root package name */
        public String f153207b;

        /* renamed from: c, reason: collision with root package name */
        public n8.b f153208c;

        /* renamed from: d, reason: collision with root package name */
        public int f153209d;

        /* renamed from: e, reason: collision with root package name */
        public long f153210e;

        /* renamed from: f, reason: collision with root package name */
        public int f153211f;

        /* renamed from: g, reason: collision with root package name */
        public String f153212g;

        public a(String str, String str2, n8.b bVar, int i10, long j10, int i11, String str3) {
            this.f153206a = str;
            this.f153207b = str2;
            this.f153208c = bVar;
            this.f153209d = i10;
            this.f153210e = j10;
            this.f153211f = i11;
            this.f153212g = str3;
        }
    }

    public static C16003b e() {
        if (f153203c == null) {
            synchronized (C16003b.class) {
                try {
                    if (f153203c == null) {
                        f153203c = new C16003b();
                    }
                } finally {
                }
            }
        }
        return f153203c;
    }

    public void a(a aVar) {
        this.f153205a.add(aVar);
    }

    public void f() throws InterruptedException {
        f153204d.set(false);
        synchronized (C16003b.class) {
            f153203c = null;
        }
        if (isAlive()) {
            try {
                join(1000L);
            } catch (InterruptedException e10) {
                if (x.f133196b) {
                    f.w(f153202b, e10.toString());
                }
            }
            if (isAlive() && x.f133196b) {
                f.u(f153202b, "could not stop thread " + getName());
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        if (x.f133196b) {
            f.u(f153202b, "Database write queue running ...");
        }
        while (f153204d.get()) {
            try {
                Thread.sleep(250L);
                b();
            } catch (Exception e10) {
                if (x.f133196b) {
                    f.x(f153202b, e10.toString(), e10);
                    return;
                }
                return;
            }
        }
    }

    @Override // java.lang.Thread
    public void start() {
        if (f153204d.get()) {
            return;
        }
        f153204d.set(true);
        super.start();
    }

    private C16003b() {
        setName(f153202b);
    }
}
