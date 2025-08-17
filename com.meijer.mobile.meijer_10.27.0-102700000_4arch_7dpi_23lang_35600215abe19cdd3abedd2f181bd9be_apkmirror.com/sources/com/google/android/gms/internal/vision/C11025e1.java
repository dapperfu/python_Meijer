package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.e1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C11025e1 {

    /* renamed from: d, reason: collision with root package name */
    private static final A0 f84527d = A0.b();

    /* renamed from: a, reason: collision with root package name */
    private AbstractC11036h0 f84528a;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC11083w1 f84529b;

    /* renamed from: c, reason: collision with root package name */
    private volatile AbstractC11036h0 f84530c;

    public int hashCode() {
        return 1;
    }

    private final InterfaceC11083w1 c(InterfaceC11083w1 interfaceC11083w1) {
        if (this.f84529b == null) {
            synchronized (this) {
                if (this.f84529b == null) {
                    try {
                        this.f84529b = interfaceC11083w1;
                        this.f84530c = AbstractC11036h0.f84545b;
                    } catch (zzjk unused) {
                        this.f84529b = interfaceC11083w1;
                        this.f84530c = AbstractC11036h0.f84545b;
                    }
                }
            }
        }
        return this.f84529b;
    }

    public final InterfaceC11083w1 a(InterfaceC11083w1 interfaceC11083w1) {
        InterfaceC11083w1 interfaceC11083w12 = this.f84529b;
        this.f84528a = null;
        this.f84530c = null;
        this.f84529b = interfaceC11083w1;
        return interfaceC11083w12;
    }

    public final int b() {
        if (this.f84530c != null) {
            return this.f84530c.e();
        }
        if (this.f84529b != null) {
            return this.f84529b.zzm();
        }
        return 0;
    }

    public final AbstractC11036h0 d() {
        if (this.f84530c != null) {
            return this.f84530c;
        }
        synchronized (this) {
            try {
                if (this.f84530c != null) {
                    return this.f84530c;
                }
                if (this.f84529b == null) {
                    this.f84530c = AbstractC11036h0.f84545b;
                } else {
                    this.f84530c = this.f84529b.zzg();
                }
                return this.f84530c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11025e1)) {
            return false;
        }
        C11025e1 c11025e1 = (C11025e1) obj;
        InterfaceC11083w1 interfaceC11083w1 = this.f84529b;
        InterfaceC11083w1 interfaceC11083w12 = c11025e1.f84529b;
        return (interfaceC11083w1 == null && interfaceC11083w12 == null) ? d().equals(c11025e1.d()) : (interfaceC11083w1 == null || interfaceC11083w12 == null) ? interfaceC11083w1 != null ? interfaceC11083w1.equals(c11025e1.c(interfaceC11083w1.zzr())) : c(interfaceC11083w12.zzr()).equals(interfaceC11083w12) : interfaceC11083w1.equals(interfaceC11083w12);
    }
}
