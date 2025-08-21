package v3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.GlUtil;
import d3.C13599a;

/* renamed from: v3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17630c extends Surface {

    /* renamed from: d, reason: collision with root package name */
    private static int f165469d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f165470e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f165471a;

    /* renamed from: b, reason: collision with root package name */
    private final b f165472b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f165473c;

    /* renamed from: v3.c$b */
    private static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private androidx.media3.common.util.a f165474a;

        /* renamed from: b, reason: collision with root package name */
        private Handler f165475b;

        /* renamed from: c, reason: collision with root package name */
        private Error f165476c;

        /* renamed from: d, reason: collision with root package name */
        private RuntimeException f165477d;

        /* renamed from: e, reason: collision with root package name */
        private C17630c f165478e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) throws GlUtil.GlException {
            C13599a.e(this.f165474a);
            this.f165474a.i(i10);
            this.f165478e = new C17630c(this, this.f165474a.h(), i10 != 0);
        }

        private void f() {
            C13599a.e(this.f165474a);
            this.f165474a.j();
        }

        public void e() {
            C13599a.e(this.f165475b);
            this.f165475b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        f();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e10) {
                    d3.r.e("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f165477d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    d3.r.e("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f165476c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    d3.r.e("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f165477d = e12;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }

        public C17630c a(int i10) {
            boolean z10;
            start();
            this.f165475b = new Handler(getLooper(), this);
            this.f165474a = new androidx.media3.common.util.a(this.f165475b);
            synchronized (this) {
                z10 = false;
                this.f165475b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f165478e == null && this.f165477d == null && this.f165476c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f165477d;
            if (runtimeException == null) {
                Error error = this.f165476c;
                if (error == null) {
                    return (C17630c) C13599a.e(this.f165478e);
                }
                throw error;
            }
            throw runtimeException;
        }
    }

    public static C17630c c(Context context, boolean z10) {
        C13599a.g(!z10 || b(context));
        return new b().a(z10 ? f165469d : 0);
    }

    private C17630c(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f165472b = bVar;
        this.f165471a = z10;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f165470e) {
                f165469d = a(context);
                f165470e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f165469d != 0;
    }

    private static int a(Context context) {
        if (GlUtil.i(context)) {
            if (GlUtil.j()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f165472b) {
            try {
                if (!this.f165473c) {
                    this.f165472b.e();
                    this.f165473c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
