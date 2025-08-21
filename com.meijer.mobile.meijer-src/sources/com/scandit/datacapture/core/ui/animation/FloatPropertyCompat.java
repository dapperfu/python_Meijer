package com.scandit.datacapture.core.ui.animation;

import android.annotation.TargetApi;
import android.util.FloatProperty;

/* loaded from: classes12.dex */
public abstract class FloatPropertyCompat<T> {
    public abstract float getValue(T t10);

    public abstract void setValue(T t10, float f10);

    @TargetApi(24)
    public static <T> FloatPropertyCompat<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new u(floatProperty.getName(), floatProperty);
    }

    public FloatPropertyCompat(String str) {
    }
}
