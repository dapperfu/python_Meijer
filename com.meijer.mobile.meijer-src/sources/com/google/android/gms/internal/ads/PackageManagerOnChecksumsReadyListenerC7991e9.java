package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.e9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class PackageManagerOnChecksumsReadyListenerC7991e9 implements PackageManager$OnChecksumsReadyListener {

    /* renamed from: a, reason: collision with root package name */
    final C8369hk0 f74615a = C8369hk0.D();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.f74615a.g("");
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ApkChecksum apkChecksumA = com.google.ads.interactivemedia.v3.internal.a.a(list.get(i10));
                if (apkChecksumA.getType() == 8) {
                    C8369hk0 c8369hk0 = this.f74615a;
                    AbstractC9539si0 abstractC9539si0E = AbstractC9539si0.g().e();
                    byte[] value = apkChecksumA.getValue();
                    c8369hk0.g(abstractC9539si0E.h(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.f74615a.g("");
    }
}
