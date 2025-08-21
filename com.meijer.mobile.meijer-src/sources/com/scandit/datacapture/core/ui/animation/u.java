package com.scandit.datacapture.core.ui.animation;

import android.util.FloatProperty;

/* loaded from: classes12.dex */
public final class u extends FloatPropertyCompat {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FloatProperty f126970a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, FloatProperty floatProperty) {
        super(str);
        this.f126970a = floatProperty;
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final float getValue(Object obj) {
        return ((Float) this.f126970a.get(obj)).floatValue();
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final void setValue(Object obj, float f10) {
        this.f126970a.setValue(obj, f10);
    }
}
