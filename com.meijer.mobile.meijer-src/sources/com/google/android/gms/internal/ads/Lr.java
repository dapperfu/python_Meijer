package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes6.dex */
public final class Lr implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f69273a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7034Kr f69274b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f69275c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f69276d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f69277e;

    /* renamed from: f, reason: collision with root package name */
    private float f69278f = 1.0f;

    public final float a() {
        float f10 = this.f69277e ? 0.0f : this.f69278f;
        if (this.f69275c) {
            return f10;
        }
        return 0.0f;
    }

    public final void b() {
        this.f69276d = true;
        f();
    }

    public final void c() {
        this.f69276d = false;
        f();
    }

    private final void f() {
        if (!this.f69276d || this.f69277e || this.f69278f <= 0.0f) {
            if (this.f69275c) {
                AudioManager audioManager = this.f69273a;
                if (audioManager != null) {
                    this.f69275c = audioManager.abandonAudioFocus(this) == 0;
                }
                this.f69274b.zzn();
                return;
            }
            return;
        }
        if (this.f69275c) {
            return;
        }
        AudioManager audioManager2 = this.f69273a;
        if (audioManager2 != null) {
            this.f69275c = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.f69274b.zzn();
    }

    public final void d(boolean z10) {
        this.f69277e = z10;
        f();
    }

    public final void e(float f10) {
        this.f69278f = f10;
        f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f69275c = i10 > 0;
        this.f69274b.zzn();
    }

    public Lr(Context context, InterfaceC7034Kr interfaceC7034Kr) {
        this.f69273a = (AudioManager) context.getSystemService("audio");
        this.f69274b = interfaceC7034Kr;
    }
}
