package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.iC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8426iC0 extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8852mC0 f75753a;

    /* synthetic */ C8426iC0(C8852mC0 c8852mC0, C8745lC0 c8745lC0) {
        this.f75753a = c8852mC0;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C8852mC0 c8852mC0 = this.f75753a;
        this.f75753a.j(C8319hC0.c(c8852mC0.f77595a, c8852mC0.f77602h, c8852mC0.f77601g));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C8959nC0 c8959nC0 = this.f75753a.f77601g;
        int i10 = OV.f69931a;
        int length = audioDeviceInfoArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i11], c8959nC0)) {
                this.f75753a.f77601g = null;
                break;
            }
            i11++;
        }
        C8852mC0 c8852mC0 = this.f75753a;
        c8852mC0.j(C8319hC0.c(c8852mC0.f77595a, c8852mC0.f77602h, c8852mC0.f77601g));
    }
}
