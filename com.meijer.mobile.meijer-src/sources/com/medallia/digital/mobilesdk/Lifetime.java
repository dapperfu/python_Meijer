package com.medallia.digital.mobilesdk;

/* loaded from: classes8.dex */
enum Lifetime {
    Session,
    Application,
    Forever;

    protected static Lifetime fromString(String str) {
        Lifetime lifetime = Session;
        if (lifetime.name().equals(str)) {
            return lifetime;
        }
        Lifetime lifetime2 = Application;
        if (lifetime2.name().equals(str)) {
            return lifetime2;
        }
        Lifetime lifetime3 = Forever;
        if (lifetime3.name().equals(str)) {
            return lifetime3;
        }
        return null;
    }
}
