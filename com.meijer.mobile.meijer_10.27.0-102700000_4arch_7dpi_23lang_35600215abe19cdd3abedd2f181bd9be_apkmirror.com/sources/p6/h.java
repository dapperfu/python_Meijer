package p6;

import c2.EnumC6348a;

/* loaded from: classes4.dex */
public enum h {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    public EnumC6348a b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal != 16) {
                                return null;
                            }
                            return EnumC6348a.PLUS;
                        }
                        return EnumC6348a.LIGHTEN;
                    }
                    return EnumC6348a.DARKEN;
                }
                return EnumC6348a.OVERLAY;
            }
            return EnumC6348a.SCREEN;
        }
        return EnumC6348a.MODULATE;
    }
}
