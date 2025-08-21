package q6;

import c2.EnumC6474a;

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

    public EnumC6474a b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal != 16) {
                                return null;
                            }
                            return EnumC6474a.PLUS;
                        }
                        return EnumC6474a.LIGHTEN;
                    }
                    return EnumC6474a.DARKEN;
                }
                return EnumC6474a.OVERLAY;
            }
            return EnumC6474a.SCREEN;
        }
        return EnumC6474a.MODULATE;
    }
}
