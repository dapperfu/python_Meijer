package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Qs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7113Qs {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7917eh0 f69667a;

    /* renamed from: b, reason: collision with root package name */
    private final List f69668b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f69669c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    private boolean f69670d;

    private final void j(ByteBuffer byteBuffer) {
        boolean z10;
        do {
            int i10 = 0;
            z10 = false;
            while (i10 <= i()) {
                if (!this.f69669c[i10].hasRemaining()) {
                    InterfaceC9330ru interfaceC9330ru = (InterfaceC9330ru) this.f69668b.get(i10);
                    if (!interfaceC9330ru.zzh()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f69669c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC9330ru.f78084a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC9330ru.a(byteBuffer2);
                        this.f69669c[i10] = interfaceC9330ru.zzb();
                        long jRemaining2 = jRemaining - byteBuffer2.remaining();
                        boolean z11 = true;
                        if (jRemaining2 <= 0 && !this.f69669c[i10].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    } else if (!this.f69669c[i10].hasRemaining() && i10 < i()) {
                        ((InterfaceC9330ru) this.f69668b.get(i10 + 1)).zzd();
                    }
                }
                i10++;
            }
        } while (z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7113Qs)) {
            return false;
        }
        C7113Qs c7113Qs = (C7113Qs) obj;
        if (this.f69667a.size() != c7113Qs.f69667a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f69667a.size(); i10++) {
            if (this.f69667a.get(i10) != c7113Qs.f69667a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        for (int i10 = 0; i10 < this.f69667a.size(); i10++) {
            InterfaceC9330ru interfaceC9330ru = (InterfaceC9330ru) this.f69667a.get(i10);
            interfaceC9330ru.zzc();
            interfaceC9330ru.zzf();
        }
        this.f69669c = new ByteBuffer[0];
        C9328rt c9328rt = C9328rt.f78079e;
        this.f69670d = false;
    }

    private final int i() {
        return this.f69669c.length - 1;
    }

    public final C9328rt a(C9328rt c9328rt) throws zzcg {
        if (c9328rt.equals(C9328rt.f78079e)) {
            throw new zzcg("Unhandled input format:", c9328rt);
        }
        for (int i10 = 0; i10 < this.f69667a.size(); i10++) {
            InterfaceC9330ru interfaceC9330ru = (InterfaceC9330ru) this.f69667a.get(i10);
            C9328rt c9328rtB = interfaceC9330ru.b(c9328rt);
            if (interfaceC9330ru.zzg()) {
                C8086gC.f(!c9328rtB.equals(C9328rt.f78079e));
                c9328rt = c9328rtB;
            }
        }
        return c9328rt;
    }

    public final void c() {
        this.f69668b.clear();
        this.f69670d = false;
        for (int i10 = 0; i10 < this.f69667a.size(); i10++) {
            InterfaceC9330ru interfaceC9330ru = (InterfaceC9330ru) this.f69667a.get(i10);
            interfaceC9330ru.zzc();
            if (interfaceC9330ru.zzg()) {
                this.f69668b.add(interfaceC9330ru);
            }
        }
        this.f69669c = new ByteBuffer[this.f69668b.size()];
        for (int i11 = 0; i11 <= i(); i11++) {
            this.f69669c[i11] = ((InterfaceC9330ru) this.f69668b.get(i11)).zzb();
        }
    }

    public final boolean g() {
        return this.f69670d && ((InterfaceC9330ru) this.f69668b.get(i())).zzh() && !this.f69669c[i()].hasRemaining();
    }

    public final boolean h() {
        return !this.f69668b.isEmpty();
    }

    public final int hashCode() {
        return this.f69667a.hashCode();
    }

    public C7113Qs(AbstractC7917eh0 abstractC7917eh0) {
        this.f69667a = abstractC7917eh0;
        C9328rt c9328rt = C9328rt.f78079e;
        this.f69670d = false;
    }

    public final ByteBuffer b() {
        if (!h()) {
            return InterfaceC9330ru.f78084a;
        }
        ByteBuffer byteBuffer = this.f69669c[i()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        j(InterfaceC9330ru.f78084a);
        return this.f69669c[i()];
    }

    public final void d() {
        if (h() && !this.f69670d) {
            this.f69670d = true;
            ((InterfaceC9330ru) this.f69668b.get(0)).zzd();
        }
    }

    public final void e(ByteBuffer byteBuffer) {
        if (h() && !this.f69670d) {
            j(byteBuffer);
        }
    }
}
