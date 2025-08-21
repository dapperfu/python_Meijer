package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
enum EnumC11319n {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');


    /* renamed from: a, reason: collision with root package name */
    private final char f86549a;

    final /* synthetic */ char b() {
        return this.f86549a;
    }

    EnumC11319n(char c10) {
        this.f86549a = c10;
    }

    public static EnumC11319n a(char c10) {
        for (EnumC11319n enumC11319n : values()) {
            if (enumC11319n.f86549a == c10) {
                return enumC11319n;
            }
        }
        return UNSET;
    }
}
