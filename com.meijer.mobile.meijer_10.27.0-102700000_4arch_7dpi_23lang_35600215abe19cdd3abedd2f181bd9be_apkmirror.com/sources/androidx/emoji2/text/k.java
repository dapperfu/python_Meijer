package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.f;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import k2.g;

/* loaded from: classes.dex */
public class k extends f.c {

    /* renamed from: k, reason: collision with root package name */
    private static final a f54634k = new a();

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements f.h {

        /* renamed from: a, reason: collision with root package name */
        private final Context f54635a;

        /* renamed from: b, reason: collision with root package name */
        private final k2.e f54636b;

        /* renamed from: c, reason: collision with root package name */
        private final a f54637c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f54638d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private Handler f54639e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f54640f;

        /* renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f54641g;

        /* renamed from: h, reason: collision with root package name */
        f.i f54642h;

        /* renamed from: i, reason: collision with root package name */
        private ContentObserver f54643i;

        /* renamed from: j, reason: collision with root package name */
        private Runnable f54644j;

        private void b() {
            synchronized (this.f54638d) {
                try {
                    this.f54642h = null;
                    ContentObserver contentObserver = this.f54643i;
                    if (contentObserver != null) {
                        this.f54637c.c(this.f54635a, contentObserver);
                        this.f54643i = null;
                    }
                    Handler handler = this.f54639e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f54644j);
                    }
                    this.f54639e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f54641g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f54640f = null;
                    this.f54641g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private g.b e() {
            try {
                g.a aVarB = this.f54637c.b(this.f54635a, this.f54636b);
                if (aVarB.e() == 0) {
                    g.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.f.h
        public void a(f.i iVar) {
            o2.i.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f54638d) {
                this.f54642h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f54638d) {
                try {
                    if (this.f54642h == null) {
                        return;
                    }
                    try {
                        g.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f54638d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            j2.n.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f54637c.a(this.f54635a, bVarE);
                            ByteBuffer byteBufferF = c2.h.f(this.f54635a, null, bVarE.d());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            n nVarB = n.b(typefaceA, byteBufferF);
                            j2.n.b();
                            synchronized (this.f54638d) {
                                try {
                                    f.i iVar = this.f54642h;
                                    if (iVar != null) {
                                        iVar.b(nVarB);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th2) {
                            j2.n.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (this.f54638d) {
                            try {
                                f.i iVar2 = this.f54642h;
                                if (iVar2 != null) {
                                    iVar2.a(th3);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.f54638d) {
                try {
                    if (this.f54642h == null) {
                        return;
                    }
                    if (this.f54640f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = c.b("emojiCompat");
                        this.f54641g = threadPoolExecutorB;
                        this.f54640f = threadPoolExecutorB;
                    }
                    this.f54640f.execute(new Runnable() { // from class: androidx.emoji2.text.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f54645a.c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f54638d) {
                this.f54640f = executor;
            }
        }

        b(Context context, k2.e eVar, a aVar) {
            o2.i.h(context, "Context cannot be null");
            o2.i.h(eVar, "FontRequest cannot be null");
            this.f54635a = context.getApplicationContext();
            this.f54636b = eVar;
            this.f54637c = aVar;
        }
    }

    public static class a {
        public Typeface a(Context context, g.b bVar) throws PackageManager.NameNotFoundException {
            return k2.g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, k2.e eVar) throws PackageManager.NameNotFoundException {
            return k2.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public k(Context context, k2.e eVar) {
        super(new b(context, eVar, f54634k));
    }

    public k c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
