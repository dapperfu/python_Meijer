package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import d3.InterfaceC13473h;
import d3.InterfaceC13479n;

/* renamed from: androidx.media3.exoplayer.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6044d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f56012a;

    /* renamed from: b, reason: collision with root package name */
    private final a f56013b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC13479n f56014c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f56015d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.exoplayer.d$a */
    final class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private final b f56016a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC13479n f56017b;

        public a(InterfaceC13479n interfaceC13479n, b bVar) {
            this.f56017b = interfaceC13479n;
            this.f56016a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (C6044d.this.f56015d) {
                this.f56016a.s();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f56017b.post(new Runnable() { // from class: androidx.media3.exoplayer.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f56010a.b();
                    }
                });
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.d$b */
    public interface b {
        void s();
    }

    @SuppressLint({"UnprotectedReceiver"})
    public void d(boolean z10) {
        if (z10 == this.f56015d) {
            return;
        }
        if (z10) {
            this.f56014c.post(new Runnable() { // from class: androidx.media3.exoplayer.a
                @Override // java.lang.Runnable
                public final void run() {
                    C6044d c6044d = this.f55754a;
                    c6044d.f56012a.registerReceiver(c6044d.f56013b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.f56015d = true;
        } else {
            this.f56014c.post(new Runnable() { // from class: androidx.media3.exoplayer.b
                @Override // java.lang.Runnable
                public final void run() {
                    C6044d c6044d = this.f56008a;
                    c6044d.f56012a.unregisterReceiver(c6044d.f56013b);
                }
            });
            this.f56015d = false;
        }
    }

    public C6044d(Context context, Looper looper, Looper looper2, b bVar, InterfaceC13473h interfaceC13473h) {
        this.f56012a = context.getApplicationContext();
        this.f56014c = interfaceC13473h.e(looper, null);
        this.f56013b = new a(interfaceC13473h.e(looper2, null), bVar);
    }
}
