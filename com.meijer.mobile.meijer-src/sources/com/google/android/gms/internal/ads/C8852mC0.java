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
public final class C8852mC0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f77595a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f77596b;

    /* renamed from: c, reason: collision with root package name */
    private final C8426iC0 f77597c;

    /* renamed from: d, reason: collision with root package name */
    private final BroadcastReceiver f77598d;

    /* renamed from: e, reason: collision with root package name */
    private final C8531jC0 f77599e;

    /* renamed from: f, reason: collision with root package name */
    private C8319hC0 f77600f;

    /* renamed from: g, reason: collision with root package name */
    private C8959nC0 f77601g;

    /* renamed from: h, reason: collision with root package name */
    private HR f77602h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f77603i;

    /* renamed from: j, reason: collision with root package name */
    private final SC0 f77604j;

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(C8319hC0 c8319hC0) {
        if (!this.f77603i || c8319hC0.equals(this.f77600f)) {
            return;
        }
        this.f77600f = c8319hC0;
        this.f77604j.f70897a.x(c8319hC0);
    }

    public final C8319hC0 c() {
        C8426iC0 c8426iC0;
        if (this.f77603i) {
            C8319hC0 c8319hC0 = this.f77600f;
            c8319hC0.getClass();
            return c8319hC0;
        }
        this.f77603i = true;
        C8531jC0 c8531jC0 = this.f77599e;
        if (c8531jC0 != null) {
            c8531jC0.a();
        }
        if (OV.f69931a >= 23 && (c8426iC0 = this.f77597c) != null) {
            Context context = this.f77595a;
            Handler handler = this.f77596b;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            audioManager.registerAudioDeviceCallback(c8426iC0, handler);
        }
        C8319hC0 c8319hC0D = C8319hC0.d(this.f77595a, this.f77595a.registerReceiver(this.f77598d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f77596b), this.f77602h, this.f77601g);
        this.f77600f = c8319hC0D;
        return c8319hC0D;
    }

    public final void g(HR hr2) {
        this.f77602h = hr2;
        j(C8319hC0.c(this.f77595a, hr2, this.f77601g));
    }

    public final void h(AudioDeviceInfo audioDeviceInfo) {
        C8959nC0 c8959nC0 = this.f77601g;
        if (Objects.equals(audioDeviceInfo, c8959nC0 == null ? null : c8959nC0.f77854a)) {
            return;
        }
        C8959nC0 c8959nC02 = audioDeviceInfo != null ? new C8959nC0(audioDeviceInfo) : null;
        this.f77601g = c8959nC02;
        j(C8319hC0.c(this.f77595a, this.f77602h, c8959nC02));
    }

    public final void i() {
        C8426iC0 c8426iC0;
        if (this.f77603i) {
            this.f77600f = null;
            if (OV.f69931a >= 23 && (c8426iC0 = this.f77597c) != null) {
                AudioManager audioManager = (AudioManager) this.f77595a.getSystemService("audio");
                audioManager.getClass();
                audioManager.unregisterAudioDeviceCallback(c8426iC0);
            }
            this.f77595a.unregisterReceiver(this.f77598d);
            C8531jC0 c8531jC0 = this.f77599e;
            if (c8531jC0 != null) {
                c8531jC0.b();
            }
            this.f77603i = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    C8852mC0(Context context, SC0 sc0, HR hr2, C8959nC0 c8959nC0) {
        C8426iC0 c8426iC0;
        Context applicationContext = context.getApplicationContext();
        this.f77595a = applicationContext;
        this.f77604j = sc0;
        this.f77602h = hr2;
        this.f77601g = c8959nC0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Handler handler = new Handler(OV.R(), null);
        this.f77596b = handler;
        if (OV.f69931a >= 23) {
            c8426iC0 = new C8426iC0(this, objArr2 == true ? 1 : 0);
        } else {
            c8426iC0 = null;
        }
        this.f77597c = c8426iC0;
        this.f77598d = new C8638kC0(this, objArr == true ? 1 : 0);
        Uri uriA = C8319hC0.a();
        this.f77599e = uriA != null ? new C8531jC0(this, handler, applicationContext.getContentResolver(), uriA) : null;
    }
}
