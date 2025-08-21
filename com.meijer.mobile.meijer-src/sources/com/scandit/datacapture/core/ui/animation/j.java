package com.scandit.datacapture.core.ui.animation;

/* loaded from: classes12.dex */
public final class j extends FloatPropertyCompat {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FloatValueHolder f126967a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(FloatValueHolder floatValueHolder) {
        super("FloatValueHolder");
        this.f126967a = floatValueHolder;
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final float getValue(Object obj) {
        return this.f126967a.getValue();
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final void setValue(Object obj, float f10) {
        this.f126967a.setValue(f10);
    }
}
