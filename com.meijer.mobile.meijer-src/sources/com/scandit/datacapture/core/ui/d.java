package com.scandit.datacapture.core.ui;

import com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListener;
import com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListenerReversedAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NeedsRedrawListener f127036a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NeedsRedrawListener needsRedrawListener) {
        super(0);
        this.f127036a = needsRedrawListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new NeedsRedrawListenerReversedAdapter(this.f127036a, null, 2, null);
    }
}
