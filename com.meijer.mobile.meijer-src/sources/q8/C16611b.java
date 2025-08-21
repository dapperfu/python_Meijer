package q8;

import i8.C14695b;
import i8.l;
import i8.x;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import z8.f;

/* renamed from: q8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16611b extends Thread {

    /* renamed from: c, reason: collision with root package name */
    private static volatile C16611b f158055c;

    /* renamed from: a, reason: collision with root package name */
    private BlockingQueue<a> f158057a = new LinkedBlockingQueue();

    /* renamed from: b, reason: collision with root package name */
    private static final String f158054b = x.f137411a + "DatabaseWriteQueue";

    /* renamed from: d, reason: collision with root package name */
    private static AtomicBoolean f158056d = new AtomicBoolean(false);

    public synchronized void b() {
        try {
            LinkedList<a> linkedList = new LinkedList<>();
            a aVarPoll = this.f158057a.poll();
            while (aVarPoll != null) {
                linkedList.add(aVarPoll);
                aVarPoll = this.f158057a.poll();
            }
            if (!linkedList.isEmpty()) {
                l.f137295i.h(linkedList, C14695b.e().f());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: q8.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f158058a;

        /* renamed from: b, reason: collision with root package name */
        public String f158059b;

        /* renamed from: c, reason: collision with root package name */
        public p8.b f158060c;

        /* renamed from: d, reason: collision with root package name */
        public int f158061d;

        /* renamed from: e, reason: collision with root package name */
        public long f158062e;

        /* renamed from: f, reason: collision with root package name */
        public int f158063f;

        /* renamed from: g, reason: collision with root package name */
        public String f158064g;

        public a(String str, String str2, p8.b bVar, int i10, long j10, int i11, String str3) {
            this.f158058a = str;
            this.f158059b = str2;
            this.f158060c = bVar;
            this.f158061d = i10;
            this.f158062e = j10;
            this.f158063f = i11;
            this.f158064g = str3;
        }
    }

    public static C16611b e() {
        if (f158055c == null) {
            synchronized (C16611b.class) {
                try {
                    if (f158055c == null) {
                        f158055c = new C16611b();
                    }
                } finally {
                }
            }
        }
        return f158055c;
    }

    public void a(a aVar) {
        this.f158057a.add(aVar);
    }

    public void f() throws InterruptedException {
        f158056d.set(false);
        synchronized (C16611b.class) {
            f158055c = null;
        }
        if (isAlive()) {
            try {
                join(1000L);
            } catch (InterruptedException e10) {
                if (x.f137412b) {
                    f.w(f158054b, e10.toString());
                }
            }
            if (isAlive() && x.f137412b) {
                f.u(f158054b, "could not stop thread " + getName());
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        if (x.f137412b) {
            f.u(f158054b, "Database write queue running ...");
        }
        while (f158056d.get()) {
            try {
                Thread.sleep(250L);
                b();
            } catch (Exception e10) {
                if (x.f137412b) {
                    f.x(f158054b, e10.toString(), e10);
                    return;
                }
                return;
            }
        }
    }

    @Override // java.lang.Thread
    public void start() {
        if (f158056d.get()) {
            return;
        }
        f158056d.set(true);
        super.start();
    }

    private C16611b() {
        setName(f158054b);
    }
}
