package fh;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.fullstory.FS;

/* loaded from: classes7.dex */
public class j {

    /* renamed from: k, reason: collision with root package name */
    private static final String f131107k = "j";

    /* renamed from: a, reason: collision with root package name */
    private gh.g f131108a;

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f131109b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f131110c;

    /* renamed from: d, reason: collision with root package name */
    private C13898g f131111d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f131112e;

    /* renamed from: f, reason: collision with root package name */
    private Rect f131113f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f131114g = false;

    /* renamed from: h, reason: collision with root package name */
    private final Object f131115h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Handler.Callback f131116i = new a();

    /* renamed from: j, reason: collision with root package name */
    private final gh.p f131117j = new b();

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == Eg.k.f9016e) {
                j.this.g((r) message.obj);
                return true;
            }
            if (i10 != Eg.k.f9020i) {
                return true;
            }
            j.this.h();
            return true;
        }
    }

    class b implements gh.p {
        b() {
        }

        @Override // gh.p
        public void a(Exception exc) {
            synchronized (j.this.f131115h) {
                try {
                    if (j.this.f131114g) {
                        j.this.f131110c.obtainMessage(Eg.k.f9020i).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // gh.p
        public void b(r rVar) {
            synchronized (j.this.f131115h) {
                try {
                    if (j.this.f131114g) {
                        j.this.f131110c.obtainMessage(Eg.k.f9016e, rVar).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f131108a.s(this.f131117j);
    }

    protected com.google.zxing.h f(r rVar) {
        if (this.f131113f == null) {
            return null;
        }
        return rVar.a();
    }

    public void i(Rect rect) {
        this.f131113f = rect;
    }

    public void j(C13898g c13898g) {
        this.f131111d = c13898g;
    }

    public j(gh.g gVar, C13898g c13898g, Handler handler) {
        s.a();
        this.f131108a = gVar;
        this.f131111d = c13898g;
        this.f131112e = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(r rVar) {
        com.google.zxing.m mVarC;
        long jCurrentTimeMillis = System.currentTimeMillis();
        rVar.d(this.f131113f);
        com.google.zxing.h hVarF = f(rVar);
        if (hVarF != null) {
            mVarC = this.f131111d.c(hVarF);
        } else {
            mVarC = null;
        }
        if (mVarC != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            FS.log_d(f131107k, "Found barcode in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " ms");
            if (this.f131112e != null) {
                Message messageObtain = Message.obtain(this.f131112e, Eg.k.f9018g, new C13894c(mVarC, rVar));
                messageObtain.setData(new Bundle());
                messageObtain.sendToTarget();
            }
        } else {
            Handler handler = this.f131112e;
            if (handler != null) {
                Message.obtain(handler, Eg.k.f9017f).sendToTarget();
            }
        }
        if (this.f131112e != null) {
            Message.obtain(this.f131112e, Eg.k.f9019h, C13894c.e(this.f131111d.d(), rVar)).sendToTarget();
        }
        h();
    }

    public void k() {
        s.a();
        HandlerThread handlerThread = new HandlerThread(f131107k);
        this.f131109b = handlerThread;
        handlerThread.start();
        this.f131110c = new Handler(this.f131109b.getLooper(), this.f131116i);
        this.f131114g = true;
        h();
    }

    public void l() {
        s.a();
        synchronized (this.f131115h) {
            this.f131114g = false;
            this.f131110c.removeCallbacksAndMessages(null);
            this.f131109b.quit();
        }
    }
}
