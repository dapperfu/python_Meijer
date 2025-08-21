package gh;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.fullstory.FS;

/* loaded from: classes8.dex */
public class j {

    /* renamed from: k, reason: collision with root package name */
    private static final String f134206k = "j";

    /* renamed from: a, reason: collision with root package name */
    private hh.g f134207a;

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f134208b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f134209c;

    /* renamed from: d, reason: collision with root package name */
    private C14371g f134210d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f134211e;

    /* renamed from: f, reason: collision with root package name */
    private Rect f134212f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f134213g = false;

    /* renamed from: h, reason: collision with root package name */
    private final Object f134214h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Handler.Callback f134215i = new a();

    /* renamed from: j, reason: collision with root package name */
    private final hh.p f134216j = new b();

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == Gg.k.f12568e) {
                j.this.g((r) message.obj);
                return true;
            }
            if (i10 != Gg.k.f12572i) {
                return true;
            }
            j.this.h();
            return true;
        }
    }

    class b implements hh.p {
        b() {
        }

        @Override // hh.p
        public void a(r rVar) {
            synchronized (j.this.f134214h) {
                try {
                    if (j.this.f134213g) {
                        j.this.f134209c.obtainMessage(Gg.k.f12568e, rVar).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // hh.p
        public void b(Exception exc) {
            synchronized (j.this.f134214h) {
                try {
                    if (j.this.f134213g) {
                        j.this.f134209c.obtainMessage(Gg.k.f12572i).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f134207a.s(this.f134216j);
    }

    protected com.google.zxing.h f(r rVar) {
        if (this.f134212f == null) {
            return null;
        }
        return rVar.a();
    }

    public void i(Rect rect) {
        this.f134212f = rect;
    }

    public void j(C14371g c14371g) {
        this.f134210d = c14371g;
    }

    public j(hh.g gVar, C14371g c14371g, Handler handler) {
        s.a();
        this.f134207a = gVar;
        this.f134210d = c14371g;
        this.f134211e = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(r rVar) {
        com.google.zxing.m mVarC;
        long jCurrentTimeMillis = System.currentTimeMillis();
        rVar.d(this.f134212f);
        com.google.zxing.h hVarF = f(rVar);
        if (hVarF != null) {
            mVarC = this.f134210d.c(hVarF);
        } else {
            mVarC = null;
        }
        if (mVarC != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            FS.log_d(f134206k, "Found barcode in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " ms");
            if (this.f134211e != null) {
                Message messageObtain = Message.obtain(this.f134211e, Gg.k.f12570g, new C14367c(mVarC, rVar));
                messageObtain.setData(new Bundle());
                messageObtain.sendToTarget();
            }
        } else {
            Handler handler = this.f134211e;
            if (handler != null) {
                Message.obtain(handler, Gg.k.f12569f).sendToTarget();
            }
        }
        if (this.f134211e != null) {
            Message.obtain(this.f134211e, Gg.k.f12571h, C14367c.e(this.f134210d.d(), rVar)).sendToTarget();
        }
        h();
    }

    public void k() {
        s.a();
        HandlerThread handlerThread = new HandlerThread(f134206k);
        this.f134208b = handlerThread;
        handlerThread.start();
        this.f134209c = new Handler(this.f134208b.getLooper(), this.f134215i);
        this.f134213g = true;
        h();
    }

    public void l() {
        s.a();
        synchronized (this.f134214h) {
            this.f134213g = false;
            this.f134209c.removeCallbacksAndMessages(null);
            this.f134208b.quit();
        }
    }
}
