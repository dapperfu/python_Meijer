package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes6.dex */
public final class Lr implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f68433a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6909Kr f68434b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f68435c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f68436d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f68437e;

    /* renamed from: f, reason: collision with root package name */
    private float f68438f = 1.0f;

    public final float a() {
        float f10 = this.f68437e ? 0.0f : this.f68438f;
        if (this.f68435c) {
            return f10;
        }
        return 0.0f;
    }

    public final void b() {
        this.f68436d = true;
        f();
    }

    public final void c() {
        this.f68436d = false;
        f();
    }

    private final void f() {
        if (!this.f68436d || this.f68437e || this.f68438f <= 0.0f) {
            if (this.f68435c) {
                AudioManager audioManager = this.f68433a;
                if (audioManager != null) {
                    this.f68435c = audioManager.abandonAudioFocus(this) == 0;
                }
                this.f68434b.zzn();
                return;
            }
            return;
        }
        if (this.f68435c) {
            return;
        }
        AudioManager audioManager2 = this.f68433a;
        if (audioManager2 != null) {
            this.f68435c = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.f68434b.zzn();
    }

    public final void d(boolean z10) {
        this.f68437e = z10;
        f();
    }

    public final void e(float f10) {
        this.f68438f = f10;
        f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f68435c = i10 > 0;
        this.f68434b.zzn();
    }

    public Lr(Context context, InterfaceC6909Kr interfaceC6909Kr) {
        this.f68433a = (AudioManager) context.getSystemService("audio");
        this.f68434b = interfaceC6909Kr;
    }
}
