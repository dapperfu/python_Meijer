package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.e9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class PackageManagerOnChecksumsReadyListenerC7866e9 implements PackageManager$OnChecksumsReadyListener {

    /* renamed from: a, reason: collision with root package name */
    final C8244hk0 f73775a = C8244hk0.D();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.f73775a.g("");
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ApkChecksum apkChecksumA = com.google.ads.interactivemedia.v3.internal.a.a(list.get(i10));
                if (apkChecksumA.getType() == 8) {
                    C8244hk0 c8244hk0 = this.f73775a;
                    AbstractC9414si0 abstractC9414si0E = AbstractC9414si0.g().e();
                    byte[] value = apkChecksumA.getValue();
                    c8244hk0.g(abstractC9414si0E.h(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.f73775a.g("");
    }
}
