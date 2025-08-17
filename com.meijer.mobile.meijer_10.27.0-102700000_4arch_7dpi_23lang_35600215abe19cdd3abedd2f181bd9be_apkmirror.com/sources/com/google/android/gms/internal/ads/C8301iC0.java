package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.iC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8301iC0 extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8727mC0 f74913a;

    /* synthetic */ C8301iC0(C8727mC0 c8727mC0, C8620lC0 c8620lC0) {
        this.f74913a = c8727mC0;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C8727mC0 c8727mC0 = this.f74913a;
        this.f74913a.j(C8194hC0.c(c8727mC0.f76755a, c8727mC0.f76762h, c8727mC0.f76761g));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C8834nC0 c8834nC0 = this.f74913a.f76761g;
        int i10 = OV.f69091a;
        int length = audioDeviceInfoArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i11], c8834nC0)) {
                this.f74913a.f76761g = null;
                break;
            }
            i11++;
        }
        C8727mC0 c8727mC0 = this.f74913a;
        c8727mC0.j(C8194hC0.c(c8727mC0.f76755a, c8727mC0.f76762h, c8727mC0.f76761g));
    }
}
