package com.medallia.digital.mobilesdk;

/* loaded from: classes7.dex */
enum c8 {
    Fade("fade"),
    SlideDown("slideDown"),
    SlideUp("slideUp"),
    SlideLeft("slideLeft"),
    SlideRight("slideRight"),
    None("none");


    /* renamed from: a, reason: collision with root package name */
    private final String f91744a;

    c8(String str) {
        this.f91744a = str;
    }

    protected static c8 a(String str) {
        if (str == null) {
            return Fade;
        }
        for (c8 c8Var : values()) {
            if (c8Var.a().equals(str)) {
                return c8Var;
            }
        }
        a4.f("Unsupported transition type");
        return Fade;
    }

    protected String a() {
        return this.f91744a;
    }
}
