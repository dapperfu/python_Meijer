package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
enum EnumC11194n {
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
    private final char f85709a;

    final /* synthetic */ char b() {
        return this.f85709a;
    }

    EnumC11194n(char c10) {
        this.f85709a = c10;
    }

    public static EnumC11194n a(char c10) {
        for (EnumC11194n enumC11194n : values()) {
            if (enumC11194n.f85709a == c10) {
                return enumC11194n;
            }
        }
        return UNSET;
    }
}
