package com.google.android.gms.internal.vision;

import java.io.IOException;

/* loaded from: classes6.dex */
public class zzjk extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC11083w1 f84703a;

    static zzjk a() {
        return new zzjk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzjk b() {
        return new zzjk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzjk c() {
        return new zzjk("Protocol message contained an invalid tag (zero).");
    }

    static zzjn d() {
        return new zzjn("Protocol message tag had invalid wire type.");
    }

    static zzjk e() {
        return new zzjk("Failed to parse the message.");
    }

    static zzjk f() {
        return new zzjk("Protocol message had invalid UTF-8.");
    }

    public zzjk(String str) {
        super(str);
        this.f84703a = null;
    }
}
