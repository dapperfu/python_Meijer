package androidx.media3.exoplayer.audio;

import a3.C5647d;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import d3.C13599a;
import d3.P;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f56114a;

    /* renamed from: b, reason: collision with root package name */
    private final f f56115b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f56116c;

    /* renamed from: d, reason: collision with root package name */
    private final c f56117d;

    /* renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f56118e;

    /* renamed from: f, reason: collision with root package name */
    private final d f56119f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.a f56120g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.c f56121h;

    /* renamed from: i, reason: collision with root package name */
    private C5647d f56122i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f56123j;

    private final class c extends AudioDeviceCallback {
        private c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.e(bVar.f56114a, b.this.f56122i, b.this.f56121h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (P.r(audioDeviceInfoArr, b.this.f56121h)) {
                b.this.f56121h = null;
            }
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.e(bVar.f56114a, b.this.f56122i, b.this.f56121h));
        }
    }

    private final class d extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f56125a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f56126b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f56125a = contentResolver;
            this.f56126b = uri;
        }

        public void a() {
            this.f56125a.registerContentObserver(this.f56126b, false, this);
        }

        public void b() {
            this.f56125a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            b bVar = b.this;
            bVar.f(androidx.media3.exoplayer.audio.a.e(bVar.f56114a, b.this.f56122i, b.this.f56121h));
        }
    }

    public interface f {
        void a(androidx.media3.exoplayer.audio.a aVar);
    }

    /* renamed from: androidx.media3.exoplayer.audio.b$b, reason: collision with other inner class name */
    private static final class C1137b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            b3.m.c(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            b3.m.c(context).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    private final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                b bVar = b.this;
                bVar.f(androidx.media3.exoplayer.audio.a.f(context, intent, bVar.f56122i, b.this.f56121h));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(androidx.media3.exoplayer.audio.a aVar) {
        if (!this.f56123j || aVar.equals(this.f56120g)) {
            return;
        }
        this.f56120g = aVar;
        this.f56115b.a(aVar);
    }

    public androidx.media3.exoplayer.audio.a g() {
        c cVar;
        if (this.f56123j) {
            return (androidx.media3.exoplayer.audio.a) C13599a.e(this.f56120g);
        }
        this.f56123j = true;
        d dVar = this.f56119f;
        if (dVar != null) {
            dVar.a();
        }
        if (P.f127888a >= 23 && (cVar = this.f56117d) != null) {
            C1137b.a(this.f56114a, cVar, this.f56116c);
        }
        androidx.media3.exoplayer.audio.a aVarF = androidx.media3.exoplayer.audio.a.f(this.f56114a, this.f56114a.registerReceiver(this.f56118e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f56116c), this.f56122i, this.f56121h);
        this.f56120g = aVarF;
        return aVarF;
    }

    public void h(C5647d c5647d) {
        this.f56122i = c5647d;
        f(androidx.media3.exoplayer.audio.a.e(this.f56114a, c5647d, this.f56121h));
    }

    public void i(AudioDeviceInfo audioDeviceInfo) {
        androidx.media3.exoplayer.audio.c cVar = this.f56121h;
        if (Objects.equals(audioDeviceInfo, cVar == null ? null : cVar.f56129a)) {
            return;
        }
        androidx.media3.exoplayer.audio.c cVar2 = audioDeviceInfo != null ? new androidx.media3.exoplayer.audio.c(audioDeviceInfo) : null;
        this.f56121h = cVar2;
        f(androidx.media3.exoplayer.audio.a.e(this.f56114a, this.f56122i, cVar2));
    }

    public void j() {
        c cVar;
        if (this.f56123j) {
            this.f56120g = null;
            if (P.f127888a >= 23 && (cVar = this.f56117d) != null) {
                C1137b.b(this.f56114a, cVar);
            }
            this.f56114a.unregisterReceiver(this.f56118e);
            d dVar = this.f56119f;
            if (dVar != null) {
                dVar.b();
            }
            this.f56123j = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    b(Context context, f fVar, C5647d c5647d, androidx.media3.exoplayer.audio.c cVar) {
        c cVar2;
        Context applicationContext = context.getApplicationContext();
        this.f56114a = applicationContext;
        this.f56115b = (f) C13599a.e(fVar);
        this.f56122i = c5647d;
        this.f56121h = cVar;
        Handler handlerB = P.B();
        this.f56116c = handlerB;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (P.f127888a >= 23) {
            cVar2 = new c();
        } else {
            cVar2 = null;
        }
        this.f56117d = cVar2;
        this.f56118e = new e();
        Uri uriI = androidx.media3.exoplayer.audio.a.i();
        this.f56119f = uriI != null ? new d(handlerB, applicationContext.getContentResolver(), uriI) : null;
    }
}
