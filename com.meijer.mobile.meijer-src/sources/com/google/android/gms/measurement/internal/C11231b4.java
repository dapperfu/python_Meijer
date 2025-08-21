package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11231b4 implements y6 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86204a;

    C11231b4(C11393x4 c11393x4) {
        Objects.requireNonNull(c11393x4);
        this.f86204a = c11393x4;
    }

    @Override // com.google.android.gms.measurement.internal.y6
    public final void X(String str, String str2, Bundle bundle) throws IllegalStateException {
        if (!TextUtils.isEmpty(str)) {
            this.f86204a.u(CameraSettings.FOCUS_STRATEGY_AUTO, "_err", bundle, str);
        } else {
            this.f86204a.n(CameraSettings.FOCUS_STRATEGY_AUTO, "_err", bundle);
        }
    }
}
