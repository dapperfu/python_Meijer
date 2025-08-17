package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.internal.atv_ads_framework.AbstractC10203b0;
import com.google.android.gms.internal.atv_ads_framework.AbstractC10210d0;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10210d0<MessageType extends AbstractC10210d0<MessageType, BuilderType>, BuilderType extends AbstractC10203b0<MessageType, BuilderType>> implements InterfaceC10247p1 {
    protected int zza = 0;

    int b(InterfaceC10276z1 interfaceC10276z1) {
        throw null;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10247p1
    public final AbstractC10249q0 zzk() {
        try {
            int iZzn = zzn();
            AbstractC10249q0 abstractC10249q0 = AbstractC10249q0.f81030b;
            byte[] bArr = new byte[iZzn];
            AbstractC10269x0 abstractC10269x0A = AbstractC10269x0.A(bArr, 0, iZzn);
            a(abstractC10269x0A);
            abstractC10269x0A.a();
            return new C10240n0(bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }
}
