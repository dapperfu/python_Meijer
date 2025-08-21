package com.adobe.marketing.mobile;

/* loaded from: classes4.dex */
public enum D {
    OPT_IN("optedin"),
    OPT_OUT("optedout"),
    UNKNOWN("optunknown");


    /* renamed from: a, reason: collision with root package name */
    private final String f62849a;

    public String e() {
        return this.f62849a;
    }

    D(String str) {
        this.f62849a = str;
    }

    public static D b(String str) {
        for (D d10 : values()) {
            if (d10.f62849a.equalsIgnoreCase(str)) {
                return d10;
            }
        }
        return UNKNOWN;
    }
}
