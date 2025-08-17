package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import ku.InterfaceC15321a;

/* loaded from: classes11.dex */
public class o {

    /* renamed from: o, reason: collision with root package name */
    static final Handler f126547o = new a(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    static volatile o f126548p = null;

    /* renamed from: a, reason: collision with root package name */
    private final d f126549a;

    /* renamed from: b, reason: collision with root package name */
    private final g f126550b;

    /* renamed from: c, reason: collision with root package name */
    private final c f126551c;

    /* renamed from: d, reason: collision with root package name */
    private final List<r> f126552d;

    /* renamed from: e, reason: collision with root package name */
    final Context f126553e;

    /* renamed from: f, reason: collision with root package name */
    final com.squareup.picasso.g f126554f;

    /* renamed from: g, reason: collision with root package name */
    final InterfaceC15321a f126555g;

    /* renamed from: h, reason: collision with root package name */
    final t f126556h;

    /* renamed from: i, reason: collision with root package name */
    final Map<Object, com.squareup.picasso.a> f126557i;

    /* renamed from: j, reason: collision with root package name */
    final Map<ImageView, com.squareup.picasso.f> f126558j;

    /* renamed from: k, reason: collision with root package name */
    final ReferenceQueue<Object> f126559k;

    /* renamed from: l, reason: collision with root package name */
    final Bitmap.Config f126560l;

    /* renamed from: m, reason: collision with root package name */
    boolean f126561m;

    /* renamed from: n, reason: collision with root package name */
    volatile boolean f126562n;

    static class a extends Handler {
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 3) {
                com.squareup.picasso.a aVar = (com.squareup.picasso.a) message.obj;
                if (aVar.g().f126562n) {
                    throw null;
                }
                aVar.f126472a.b(aVar.k());
                return;
            }
            int i11 = 0;
            if (i10 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i11 < size) {
                    com.squareup.picasso.c cVar = (com.squareup.picasso.c) list.get(i11);
                    cVar.f126487b.c(cVar);
                    i11++;
                }
                return;
            }
            if (i10 != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i11 < size2) {
                com.squareup.picasso.a aVar2 = (com.squareup.picasso.a) list2.get(i11);
                aVar2.f126472a.i(aVar2);
                i11++;
            }
        }

        a(Looper looper) {
            super(looper);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f126563a;

        /* renamed from: b, reason: collision with root package name */
        private Downloader f126564b;

        /* renamed from: c, reason: collision with root package name */
        private ExecutorService f126565c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC15321a f126566d;

        /* renamed from: e, reason: collision with root package name */
        private d f126567e;

        /* renamed from: f, reason: collision with root package name */
        private g f126568f;

        /* renamed from: g, reason: collision with root package name */
        private List<r> f126569g;

        /* renamed from: h, reason: collision with root package name */
        private Bitmap.Config f126570h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f126571i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f126572j;

        public o a() {
            Context context = this.f126563a;
            if (this.f126564b == null) {
                this.f126564b = v.e(context);
            }
            if (this.f126566d == null) {
                this.f126566d = new i(context);
            }
            if (this.f126565c == null) {
                this.f126565c = new p();
            }
            if (this.f126568f == null) {
                this.f126568f = g.f126586a;
            }
            t tVar = new t(this.f126566d);
            return new o(context, new com.squareup.picasso.g(context, this.f126565c, o.f126547o, this.f126564b, this.f126566d, tVar), this.f126566d, this.f126567e, this.f126568f, this.f126569g, tVar, this.f126570h, this.f126571i, this.f126572j);
        }

        public b b(Downloader downloader) {
            if (downloader == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (this.f126564b != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            this.f126564b = downloader;
            return this;
        }

        public b c(boolean z10) {
            this.f126571i = z10;
            return this;
        }

        public b d(d dVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("Listener must not be null.");
            }
            if (this.f126567e != null) {
                throw new IllegalStateException("Listener already set.");
            }
            this.f126567e = dVar;
            return this;
        }

        public b(Context context) {
            if (context != null) {
                this.f126563a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
    }

    private static class c extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final ReferenceQueue<Object> f126573a;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f126574b;

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Exception f126575a;

            a(Exception exc) {
                this.f126575a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f126575a);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C1983a c1983a = (a.C1983a) this.f126573a.remove(1000L);
                    Message messageObtainMessage = this.f126574b.obtainMessage();
                    if (c1983a != null) {
                        messageObtainMessage.what = 3;
                        messageObtainMessage.obj = c1983a.f126480a;
                        this.f126574b.sendMessage(messageObtainMessage);
                    } else {
                        messageObtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e10) {
                    this.f126574b.post(new a(e10));
                    return;
                }
            }
        }

        c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f126573a = referenceQueue;
            this.f126574b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }
    }

    public interface d {
    }

    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    public interface g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f126586a = new a();

        static class a implements g {
            a() {
            }
        }
    }

    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);


        /* renamed from: a, reason: collision with root package name */
        final int f126581a;

        e(int i10) {
            this.f126581a = i10;
        }
    }

    public static void k(o oVar) {
        synchronized (o.class) {
            try {
                if (f126548p != null) {
                    throw new IllegalStateException("Singleton instance already exists.");
                }
                f126548p = oVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    List<r> f() {
        return this.f126552d;
    }

    public boolean g() {
        return this.f126562n;
    }

    Bitmap h(String str) {
        Bitmap bitmapA = this.f126555g.a(str);
        if (bitmapA != null) {
            this.f126556h.b();
            return bitmapA;
        }
        this.f126556h.c();
        return bitmapA;
    }

    void i(com.squareup.picasso.a aVar) {
        Bitmap bitmapH = k.a(aVar.f126474c) ? h(aVar.d()) : null;
        if (bitmapH != null) {
            d(bitmapH, e.MEMORY, aVar);
            if (this.f126562n) {
                throw null;
            }
        } else {
            e(aVar);
            if (this.f126562n) {
                throw null;
            }
        }
    }

    public void j(boolean z10) {
        this.f126562n = z10;
    }

    void l(com.squareup.picasso.a aVar) {
        this.f126554f.h(aVar);
    }

    o(Context context, com.squareup.picasso.g gVar, InterfaceC15321a interfaceC15321a, d dVar, g gVar2, List<r> list, t tVar, Bitmap.Config config, boolean z10, boolean z11) {
        int size;
        this.f126553e = context;
        this.f126554f = gVar;
        this.f126555g = interfaceC15321a;
        this.f126549a = dVar;
        this.f126550b = gVar2;
        this.f126560l = config;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        ArrayList arrayList = new ArrayList(size + 7);
        arrayList.add(new s(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new com.squareup.picasso.d(context));
        arrayList.add(new j(context));
        arrayList.add(new com.squareup.picasso.e(context));
        arrayList.add(new com.squareup.picasso.b(context));
        arrayList.add(new h(context));
        arrayList.add(new m(gVar.f126510d, tVar));
        this.f126552d = Collections.unmodifiableList(arrayList);
        this.f126556h = tVar;
        this.f126557i = new WeakHashMap();
        this.f126558j = new WeakHashMap();
        this.f126561m = z10;
        this.f126562n = z11;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f126559k = referenceQueue;
        c cVar = new c(referenceQueue, f126547o);
        this.f126551c = cVar;
        cVar.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj) {
        v.c();
        com.squareup.picasso.a aVarRemove = this.f126557i.remove(obj);
        if (aVarRemove != null) {
            aVarRemove.a();
            this.f126554f.c(aVarRemove);
        }
        if (obj instanceof ImageView) {
            com.squareup.picasso.f fVarRemove = this.f126558j.remove((ImageView) obj);
            if (fVarRemove != null) {
                fVarRemove.a();
            }
        }
    }

    private void d(Bitmap bitmap, e eVar, com.squareup.picasso.a aVar) {
        if (!aVar.l()) {
            if (!aVar.m()) {
                this.f126557i.remove(aVar.k());
            }
            if (bitmap != null) {
                if (eVar != null) {
                    aVar.b(bitmap, eVar);
                    if (this.f126562n) {
                        throw null;
                    }
                    return;
                }
                throw new AssertionError("LoadedFrom cannot be null.");
            }
            aVar.c();
            if (!this.f126562n) {
            } else {
                throw null;
            }
        }
    }

    void c(com.squareup.picasso.c cVar) {
        boolean z10;
        com.squareup.picasso.a aVarH = cVar.h();
        List<com.squareup.picasso.a> listI = cVar.i();
        if (listI != null && !listI.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aVarH == null && !z10) {
            return;
        }
        cVar.j();
        throw null;
    }

    void e(com.squareup.picasso.a aVar) {
        Object objK = aVar.k();
        if (objK != null && this.f126557i.get(objK) != aVar) {
            b(objK);
            this.f126557i.put(objK, aVar);
        }
        l(aVar);
    }
}
