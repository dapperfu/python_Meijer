package com.medallia.digital.mobilesdk;

/* loaded from: classes7.dex */
public enum MDAppearanceMode {
    light,
    dark,
    unknown;

    public static MDAppearanceMode fromString(String str) {
        if (str == null) {
            return unknown;
        }
        MDAppearanceMode mDAppearanceMode = dark;
        if (mDAppearanceMode.name().equals(str.toLowerCase())) {
            return mDAppearanceMode;
        }
        MDAppearanceMode mDAppearanceMode2 = light;
        return mDAppearanceMode2.name().equals(str.toLowerCase()) ? mDAppearanceMode2 : unknown;
    }
}
