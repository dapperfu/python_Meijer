package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.e1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C11150e1 {

    /* renamed from: d, reason: collision with root package name */
    private static final A0 f85367d = A0.b();

    /* renamed from: a, reason: collision with root package name */
    private AbstractC11161h0 f85368a;

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC11208w1 f85369b;

    /* renamed from: c, reason: collision with root package name */
    private volatile AbstractC11161h0 f85370c;

    public int hashCode() {
        return 1;
    }

    private final InterfaceC11208w1 c(InterfaceC11208w1 interfaceC11208w1) {
        if (this.f85369b == null) {
            synchronized (this) {
                if (this.f85369b == null) {
                    try {
                        this.f85369b = interfaceC11208w1;
                        this.f85370c = AbstractC11161h0.f85385b;
                    } catch (zzjk unused) {
                        this.f85369b = interfaceC11208w1;
                        this.f85370c = AbstractC11161h0.f85385b;
                    }
                }
            }
        }
        return this.f85369b;
    }

    public final InterfaceC11208w1 a(InterfaceC11208w1 interfaceC11208w1) {
        InterfaceC11208w1 interfaceC11208w12 = this.f85369b;
        this.f85368a = null;
        this.f85370c = null;
        this.f85369b = interfaceC11208w1;
        return interfaceC11208w12;
    }

    public final int b() {
        if (this.f85370c != null) {
            return this.f85370c.e();
        }
        if (this.f85369b != null) {
            return this.f85369b.zzm();
        }
        return 0;
    }

    public final AbstractC11161h0 d() {
        if (this.f85370c != null) {
            return this.f85370c;
        }
        synchronized (this) {
            try {
                if (this.f85370c != null) {
                    return this.f85370c;
                }
                if (this.f85369b == null) {
                    this.f85370c = AbstractC11161h0.f85385b;
                } else {
                    this.f85370c = this.f85369b.zzg();
                }
                return this.f85370c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11150e1)) {
            return false;
        }
        C11150e1 c11150e1 = (C11150e1) obj;
        InterfaceC11208w1 interfaceC11208w1 = this.f85369b;
        InterfaceC11208w1 interfaceC11208w12 = c11150e1.f85369b;
        return (interfaceC11208w1 == null && interfaceC11208w12 == null) ? d().equals(c11150e1.d()) : (interfaceC11208w1 == null || interfaceC11208w12 == null) ? interfaceC11208w1 != null ? interfaceC11208w1.equals(c11150e1.c(interfaceC11208w1.zzr())) : c(interfaceC11208w12.zzr()).equals(interfaceC11208w12) : interfaceC11208w1.equals(interfaceC11208w12);
    }
}
