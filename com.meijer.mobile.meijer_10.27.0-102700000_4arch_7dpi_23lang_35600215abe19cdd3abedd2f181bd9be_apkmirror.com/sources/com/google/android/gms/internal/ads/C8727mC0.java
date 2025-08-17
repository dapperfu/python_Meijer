package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8727mC0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f76755a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f76756b;

    /* renamed from: c, reason: collision with root package name */
    private final C8301iC0 f76757c;

    /* renamed from: d, reason: collision with root package name */
    private final BroadcastReceiver f76758d;

    /* renamed from: e, reason: collision with root package name */
    private final C8406jC0 f76759e;

    /* renamed from: f, reason: collision with root package name */
    private C8194hC0 f76760f;

    /* renamed from: g, reason: collision with root package name */
    private C8834nC0 f76761g;

    /* renamed from: h, reason: collision with root package name */
    private HR f76762h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f76763i;

    /* renamed from: j, reason: collision with root package name */
    private final SC0 f76764j;

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(C8194hC0 c8194hC0) {
        if (!this.f76763i || c8194hC0.equals(this.f76760f)) {
            return;
        }
        this.f76760f = c8194hC0;
        this.f76764j.f70057a.x(c8194hC0);
    }

    public final C8194hC0 c() {
        C8301iC0 c8301iC0;
        if (this.f76763i) {
            C8194hC0 c8194hC0 = this.f76760f;
            c8194hC0.getClass();
            return c8194hC0;
        }
        this.f76763i = true;
        C8406jC0 c8406jC0 = this.f76759e;
        if (c8406jC0 != null) {
            c8406jC0.a();
        }
        if (OV.f69091a >= 23 && (c8301iC0 = this.f76757c) != null) {
            Context context = this.f76755a;
            Handler handler = this.f76756b;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            audioManager.registerAudioDeviceCallback(c8301iC0, handler);
        }
        C8194hC0 c8194hC0D = C8194hC0.d(this.f76755a, this.f76755a.registerReceiver(this.f76758d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f76756b), this.f76762h, this.f76761g);
        this.f76760f = c8194hC0D;
        return c8194hC0D;
    }

    public final void g(HR hr2) {
        this.f76762h = hr2;
        j(C8194hC0.c(this.f76755a, hr2, this.f76761g));
    }

    public final void h(AudioDeviceInfo audioDeviceInfo) {
        C8834nC0 c8834nC0 = this.f76761g;
        if (Objects.equals(audioDeviceInfo, c8834nC0 == null ? null : c8834nC0.f77014a)) {
            return;
        }
        C8834nC0 c8834nC02 = audioDeviceInfo != null ? new C8834nC0(audioDeviceInfo) : null;
        this.f76761g = c8834nC02;
        j(C8194hC0.c(this.f76755a, this.f76762h, c8834nC02));
    }

    public final void i() {
        C8301iC0 c8301iC0;
        if (this.f76763i) {
            this.f76760f = null;
            if (OV.f69091a >= 23 && (c8301iC0 = this.f76757c) != null) {
                AudioManager audioManager = (AudioManager) this.f76755a.getSystemService("audio");
                audioManager.getClass();
                audioManager.unregisterAudioDeviceCallback(c8301iC0);
            }
            this.f76755a.unregisterReceiver(this.f76758d);
            C8406jC0 c8406jC0 = this.f76759e;
            if (c8406jC0 != null) {
                c8406jC0.b();
            }
            this.f76763i = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    C8727mC0(Context context, SC0 sc0, HR hr2, C8834nC0 c8834nC0) {
        C8301iC0 c8301iC0;
        Context applicationContext = context.getApplicationContext();
        this.f76755a = applicationContext;
        this.f76764j = sc0;
        this.f76762h = hr2;
        this.f76761g = c8834nC0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Handler handler = new Handler(OV.R(), null);
        this.f76756b = handler;
        if (OV.f69091a >= 23) {
            c8301iC0 = new C8301iC0(this, objArr2 == true ? 1 : 0);
        } else {
            c8301iC0 = null;
        }
        this.f76757c = c8301iC0;
        this.f76758d = new C8513kC0(this, objArr == true ? 1 : 0);
        Uri uriA = C8194hC0.a();
        this.f76759e = uriA != null ? new C8406jC0(this, handler, applicationContext.getContentResolver(), uriA) : null;
    }
}
