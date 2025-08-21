package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.internal.atv_ads_framework.AbstractC10328b0;
import com.google.android.gms.internal.atv_ads_framework.AbstractC10335d0;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10335d0<MessageType extends AbstractC10335d0<MessageType, BuilderType>, BuilderType extends AbstractC10328b0<MessageType, BuilderType>> implements InterfaceC10372p1 {
    protected int zza = 0;

    int b(InterfaceC10401z1 interfaceC10401z1) {
        throw null;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10372p1
    public final AbstractC10374q0 zzk() {
        try {
            int iZzn = zzn();
            AbstractC10374q0 abstractC10374q0 = AbstractC10374q0.f81870b;
            byte[] bArr = new byte[iZzn];
            AbstractC10394x0 abstractC10394x0A = AbstractC10394x0.A(bArr, 0, iZzn);
            a(abstractC10394x0A);
            abstractC10394x0A.a();
            return new C10365n0(bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }
}
