package androidx.media3.exoplayer;

import a3.C5564d;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import b3.g;
import d3.C13466a;
import java.util.Objects;

/* renamed from: androidx.media3.exoplayer.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6050g {

    /* renamed from: a, reason: collision with root package name */
    private final Be.w<AudioManager> f56139a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f56140b;

    /* renamed from: c, reason: collision with root package name */
    private a f56141c;

    /* renamed from: d, reason: collision with root package name */
    private C5564d f56142d;

    /* renamed from: f, reason: collision with root package name */
    private int f56144f;

    /* renamed from: h, reason: collision with root package name */
    private b3.g f56146h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f56147i;

    /* renamed from: g, reason: collision with root package name */
    private float f56145g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private int f56143e = 0;

    /* renamed from: androidx.media3.exoplayer.g$a */
    public interface a {
        void d(float f10);

        void e(int i10);
    }

    private static int d(C5564d c5564d) {
        if (c5564d == null) {
            return 0;
        }
        switch (c5564d.f43819c) {
            case 0:
                d3.r.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (c5564d.f43817a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                d3.r.i("AudioFocusManager", "Unidentified audio usage: " + c5564d.f43819c);
                return 0;
            case 16:
                return 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !o()) {
                l(4);
                return;
            } else {
                e(0);
                l(3);
                return;
            }
        }
        if (i10 == -1) {
            e(-1);
            c();
            l(1);
        } else if (i10 == 1) {
            l(2);
            e(1);
        } else {
            d3.r.i("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private boolean m(int i10) {
        return i10 != 1 && this.f56144f == 1;
    }

    public void h() {
        this.f56141c = null;
        c();
        l(0);
    }

    private void c() {
        int i10 = this.f56143e;
        if (i10 == 1 || i10 == 0 || this.f56146h == null) {
            return;
        }
        b3.m.b(this.f56139a.get(), this.f56146h);
    }

    private void e(int i10) {
        a aVar = this.f56141c;
        if (aVar != null) {
            aVar.e(i10);
        }
    }

    private int i() {
        if (this.f56143e == 2) {
            return 1;
        }
        if (j() == 1) {
            l(2);
            return 1;
        }
        l(1);
        return -1;
    }

    private int j() {
        b3.g gVar = this.f56146h;
        if (gVar == null || this.f56147i) {
            this.f56146h = (gVar == null ? new g.b(this.f56144f) : gVar.a()).b((C5564d) C13466a.e(this.f56142d)).d(o()).c(new AudioManager.OnAudioFocusChangeListener() { // from class: androidx.media3.exoplayer.e
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i10) {
                    this.f56134a.g(i10);
                }
            }, this.f56140b).a();
            this.f56147i = false;
        }
        return b3.m.h(this.f56139a.get(), this.f56146h);
    }

    private void l(int i10) {
        if (this.f56143e == i10) {
            return;
        }
        this.f56143e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f56145g == f10) {
            return;
        }
        this.f56145g = f10;
        a aVar = this.f56141c;
        if (aVar != null) {
            aVar.d(f10);
        }
    }

    private boolean o() {
        C5564d c5564d = this.f56142d;
        return c5564d != null && c5564d.f43817a == 1;
    }

    public float f() {
        return this.f56145g;
    }

    public void k(C5564d c5564d) {
        if (Objects.equals(this.f56142d, c5564d)) {
            return;
        }
        this.f56142d = c5564d;
        int iD = d(c5564d);
        this.f56144f = iD;
        boolean z10 = true;
        if (iD != 1 && iD != 0) {
            z10 = false;
        }
        C13466a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public C6050g(final Context context, Looper looper, a aVar) {
        this.f56139a = Be.x.a(new Be.w() { // from class: androidx.media3.exoplayer.f
            @Override // Be.w
            public final Object get() {
                return b3.m.c(context);
            }
        });
        this.f56141c = aVar;
        this.f56140b = new Handler(looper);
    }

    public int n(boolean z10, int i10) {
        if (!m(i10)) {
            c();
            l(0);
            return 1;
        }
        if (z10) {
            return i();
        }
        int i11 = this.f56143e;
        if (i11 != 1) {
            if (i11 == 3) {
                return 0;
            }
            return 1;
        }
        return -1;
    }
}
