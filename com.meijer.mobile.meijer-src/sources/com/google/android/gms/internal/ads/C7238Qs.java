package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Qs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7238Qs {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8042eh0 f70507a;

    /* renamed from: b, reason: collision with root package name */
    private final List f70508b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f70509c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    private boolean f70510d;

    private final void j(ByteBuffer byteBuffer) {
        boolean z10;
        do {
            int i10 = 0;
            z10 = false;
            while (i10 <= i()) {
                if (!this.f70509c[i10].hasRemaining()) {
                    InterfaceC9455ru interfaceC9455ru = (InterfaceC9455ru) this.f70508b.get(i10);
                    if (!interfaceC9455ru.zzh()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f70509c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC9455ru.f78924a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC9455ru.a(byteBuffer2);
                        this.f70509c[i10] = interfaceC9455ru.zzb();
                        long jRemaining2 = jRemaining - byteBuffer2.remaining();
                        boolean z11 = true;
                        if (jRemaining2 <= 0 && !this.f70509c[i10].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    } else if (!this.f70509c[i10].hasRemaining() && i10 < i()) {
                        ((InterfaceC9455ru) this.f70508b.get(i10 + 1)).zzd();
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
        if (!(obj instanceof C7238Qs)) {
            return false;
        }
        C7238Qs c7238Qs = (C7238Qs) obj;
        if (this.f70507a.size() != c7238Qs.f70507a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f70507a.size(); i10++) {
            if (this.f70507a.get(i10) != c7238Qs.f70507a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        for (int i10 = 0; i10 < this.f70507a.size(); i10++) {
            InterfaceC9455ru interfaceC9455ru = (InterfaceC9455ru) this.f70507a.get(i10);
            interfaceC9455ru.zzc();
            interfaceC9455ru.zzf();
        }
        this.f70509c = new ByteBuffer[0];
        C9453rt c9453rt = C9453rt.f78919e;
        this.f70510d = false;
    }

    private final int i() {
        return this.f70509c.length - 1;
    }

    public final C9453rt a(C9453rt c9453rt) throws zzcg {
        if (c9453rt.equals(C9453rt.f78919e)) {
            throw new zzcg("Unhandled input format:", c9453rt);
        }
        for (int i10 = 0; i10 < this.f70507a.size(); i10++) {
            InterfaceC9455ru interfaceC9455ru = (InterfaceC9455ru) this.f70507a.get(i10);
            C9453rt c9453rtB = interfaceC9455ru.b(c9453rt);
            if (interfaceC9455ru.zzg()) {
                C8211gC.f(!c9453rtB.equals(C9453rt.f78919e));
                c9453rt = c9453rtB;
            }
        }
        return c9453rt;
    }

    public final void c() {
        this.f70508b.clear();
        this.f70510d = false;
        for (int i10 = 0; i10 < this.f70507a.size(); i10++) {
            InterfaceC9455ru interfaceC9455ru = (InterfaceC9455ru) this.f70507a.get(i10);
            interfaceC9455ru.zzc();
            if (interfaceC9455ru.zzg()) {
                this.f70508b.add(interfaceC9455ru);
            }
        }
        this.f70509c = new ByteBuffer[this.f70508b.size()];
        for (int i11 = 0; i11 <= i(); i11++) {
            this.f70509c[i11] = ((InterfaceC9455ru) this.f70508b.get(i11)).zzb();
        }
    }

    public final boolean g() {
        return this.f70510d && ((InterfaceC9455ru) this.f70508b.get(i())).zzh() && !this.f70509c[i()].hasRemaining();
    }

    public final boolean h() {
        return !this.f70508b.isEmpty();
    }

    public final int hashCode() {
        return this.f70507a.hashCode();
    }

    public C7238Qs(AbstractC8042eh0 abstractC8042eh0) {
        this.f70507a = abstractC8042eh0;
        C9453rt c9453rt = C9453rt.f78919e;
        this.f70510d = false;
    }

    public final ByteBuffer b() {
        if (!h()) {
            return InterfaceC9455ru.f78924a;
        }
        ByteBuffer byteBuffer = this.f70509c[i()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        j(InterfaceC9455ru.f78924a);
        return this.f70509c[i()];
    }

    public final void d() {
        if (h() && !this.f70510d) {
            this.f70510d = true;
            ((InterfaceC9455ru) this.f70508b.get(0)).zzd();
        }
    }

    public final void e(ByteBuffer byteBuffer) {
        if (h() && !this.f70510d) {
            j(byteBuffer);
        }
    }
}
