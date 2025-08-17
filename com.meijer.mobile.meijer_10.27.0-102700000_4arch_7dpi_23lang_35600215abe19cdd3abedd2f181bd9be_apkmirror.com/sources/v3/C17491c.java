package v3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.GlUtil;
import d3.C13466a;

/* renamed from: v3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17491c extends Surface {

    /* renamed from: d, reason: collision with root package name */
    private static int f164435d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f164436e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f164437a;

    /* renamed from: b, reason: collision with root package name */
    private final b f164438b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f164439c;

    /* renamed from: v3.c$b */
    private static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private androidx.media3.common.util.a f164440a;

        /* renamed from: b, reason: collision with root package name */
        private Handler f164441b;

        /* renamed from: c, reason: collision with root package name */
        private Error f164442c;

        /* renamed from: d, reason: collision with root package name */
        private RuntimeException f164443d;

        /* renamed from: e, reason: collision with root package name */
        private C17491c f164444e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) throws GlUtil.GlException {
            C13466a.e(this.f164440a);
            this.f164440a.i(i10);
            this.f164444e = new C17491c(this, this.f164440a.h(), i10 != 0);
        }

        private void f() {
            C13466a.e(this.f164440a);
            this.f164440a.j();
        }

        public void e() {
            C13466a.e(this.f164441b);
            this.f164441b.sendEmptyMessage(2);
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
                    this.f164443d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    d3.r.e("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f164442c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    d3.r.e("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f164443d = e12;
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

        public C17491c a(int i10) {
            boolean z10;
            start();
            this.f164441b = new Handler(getLooper(), this);
            this.f164440a = new androidx.media3.common.util.a(this.f164441b);
            synchronized (this) {
                z10 = false;
                this.f164441b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f164444e == null && this.f164443d == null && this.f164442c == null) {
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
            RuntimeException runtimeException = this.f164443d;
            if (runtimeException == null) {
                Error error = this.f164442c;
                if (error == null) {
                    return (C17491c) C13466a.e(this.f164444e);
                }
                throw error;
            }
            throw runtimeException;
        }
    }

    public static C17491c c(Context context, boolean z10) {
        C13466a.g(!z10 || b(context));
        return new b().a(z10 ? f164435d : 0);
    }

    private C17491c(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f164438b = bVar;
        this.f164437a = z10;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f164436e) {
                f164435d = a(context);
                f164436e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f164435d != 0;
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
        synchronized (this.f164438b) {
            try {
                if (!this.f164439c) {
                    this.f164438b.e();
                    this.f164439c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
