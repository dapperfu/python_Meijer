package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC10619p4;
import com.google.android.gms.internal.measurement.AbstractC10628q4;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.q4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10628q4<MessageType extends AbstractC10628q4<MessageType, BuilderType>, BuilderType extends AbstractC10619p4<MessageType, BuilderType>> implements K5 {
    protected int zza = 0;

    int h(V5 v52) {
        throw null;
    }

    protected static void i(Iterable iterable, List list) {
        AbstractC10619p4.k(iterable, list);
    }

    @Override // com.google.android.gms.internal.measurement.K5
    public final G4 b() {
        try {
            int iA = a();
            G4 g42 = G4.f82610b;
            byte[] bArr = new byte[iA];
            int i10 = K4.f82656d;
            J4 j42 = new J4(bArr, 0, iA);
            c(j42);
            return D4.a(j42, bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    public final byte[] g() {
        try {
            int iA = a();
            byte[] bArr = new byte[iA];
            int i10 = K4.f82656d;
            J4 j42 = new J4(bArr, 0, iA);
            c(j42);
            j42.e();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }
}
