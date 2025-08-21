package b3;

import a3.C5647d;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import d3.C13599a;
import d3.P;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f59955a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f59956b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f59957c;

    /* renamed from: d, reason: collision with root package name */
    private final C5647d f59958d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f59959e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f59960f;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f59961a;

        /* renamed from: b, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f59962b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f59963c;

        /* renamed from: d, reason: collision with root package name */
        private C5647d f59964d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f59965e;

        public b(int i10) {
            this.f59964d = C5647d.f44629g;
            this.f59961a = i10;
        }

        public g a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f59962b;
            if (onAudioFocusChangeListener != null) {
                return new g(this.f59961a, onAudioFocusChangeListener, (Handler) C13599a.e(this.f59963c), this.f59964d, this.f59965e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b d(boolean z10) {
            this.f59965e = z10;
            return this;
        }

        public b b(C5647d c5647d) {
            C13599a.e(c5647d);
            this.f59964d = c5647d;
            return this;
        }

        public b c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            C13599a.e(onAudioFocusChangeListener);
            C13599a.e(handler);
            this.f59962b = onAudioFocusChangeListener;
            this.f59963c = handler;
            return this;
        }

        private b(g gVar) {
            this.f59961a = gVar.e();
            this.f59962b = gVar.f();
            this.f59963c = gVar.d();
            this.f59964d = gVar.b();
            this.f59965e = gVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f59966a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioManager.OnAudioFocusChangeListener f59967b;

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            P.T0(this.f59966a, new Runnable() { // from class: b3.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59968a.f59967b.onAudioFocusChange(i10);
                }
            });
        }

        c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f59967b = onAudioFocusChangeListener;
            this.f59966a = P.y(handler.getLooper(), null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f59955a == gVar.f59955a && this.f59959e == gVar.f59959e && Objects.equals(this.f59956b, gVar.f59956b) && Objects.equals(this.f59957c, gVar.f59957c) && Objects.equals(this.f59958d, gVar.f59958d);
    }

    public b a() {
        return new b();
    }

    public C5647d b() {
        return this.f59958d;
    }

    AudioFocusRequest c() {
        return e.a(C13599a.e(this.f59960f));
    }

    public Handler d() {
        return this.f59957c;
    }

    public int e() {
        return this.f59955a;
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f59956b;
    }

    public boolean g() {
        return this.f59959e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f59955a), this.f59956b, this.f59957c, this.f59958d, Boolean.valueOf(this.f59959e));
    }

    g(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C5647d c5647d, boolean z10) {
        this.f59955a = i10;
        this.f59957c = handler;
        this.f59958d = c5647d;
        this.f59959e = z10;
        int i11 = P.f127888a;
        if (i11 < 26) {
            this.f59956b = new c(onAudioFocusChangeListener, handler);
        } else {
            this.f59956b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f59960f = f.a(i10).setAudioAttributes(c5647d.a().f44641a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f59960f = null;
        }
    }
}
