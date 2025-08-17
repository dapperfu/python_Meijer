package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.internal.atv_ads_framework.I0;
import com.google.android.gms.internal.atv_ads_framework.K0;

/* loaded from: classes6.dex */
public class I0<MessageType extends K0<MessageType, BuilderType>, BuilderType extends I0<MessageType, BuilderType>> extends AbstractC10203b0<MessageType, BuilderType> {

    /* renamed from: a, reason: collision with root package name */
    private final K0 f80831a;

    /* renamed from: b, reason: collision with root package name */
    protected K0 f80832b;

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final I0 clone() {
        I0 i02 = (I0) this.f80831a.e(5, null, null);
        i02.f80832b = zzk();
        return i02;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10244o1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public MessageType zzk() {
        if (!this.f80832b.c()) {
            return (MessageType) this.f80832b;
        }
        this.f80832b.m();
        return (MessageType) this.f80832b;
    }

    protected final void e() {
        if (this.f80832b.c()) {
            return;
        }
        f();
    }

    protected void f() {
        K0 k0I = this.f80831a.i();
        C10270x1.a().b(k0I.getClass()).c(k0I, this.f80832b);
        this.f80832b = k0I;
    }

    protected I0(MessageType messagetype) {
        this.f80831a = messagetype;
        if (!messagetype.c()) {
            this.f80832b = messagetype.i();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MessageType c() {
        /*
            r5 = this;
            com.google.android.gms.internal.atv_ads_framework.K0 r0 = r5.zzk()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.e(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.google.android.gms.internal.atv_ads_framework.x1 r3 = com.google.android.gms.internal.atv_ads_framework.C10270x1.a()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.atv_ads_framework.z1 r3 = r3.b(r4)
            boolean r3 = r3.zzh(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.e(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.gms.internal.atv_ads_framework.zzfo r1 = new com.google.android.gms.internal.atv_ads_framework.zzfo
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.atv_ads_framework.I0.c():com.google.android.gms.internal.atv_ads_framework.K0");
    }
}
