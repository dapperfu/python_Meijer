package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11106b4 implements y6 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85364a;

    C11106b4(C11268x4 c11268x4) {
        Objects.requireNonNull(c11268x4);
        this.f85364a = c11268x4;
    }

    @Override // com.google.android.gms.measurement.internal.y6
    public final void W(String str, String str2, Bundle bundle) throws IllegalStateException {
        if (!TextUtils.isEmpty(str)) {
            this.f85364a.u(CameraSettings.FOCUS_STRATEGY_AUTO, "_err", bundle, str);
        } else {
            this.f85364a.n(CameraSettings.FOCUS_STRATEGY_AUTO, "_err", bundle);
        }
    }
}
