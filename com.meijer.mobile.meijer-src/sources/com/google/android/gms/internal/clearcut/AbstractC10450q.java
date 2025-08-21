package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10450q;
import com.google.android.gms.internal.clearcut.r;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10450q<MessageType extends AbstractC10450q<MessageType, BuilderType>, BuilderType extends r<MessageType, BuilderType>> implements J0 {
    private static boolean zzey;
    protected int zzex = 0;

    void c(int i10) {
        throw new UnsupportedOperationException();
    }

    int d() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.clearcut.J0
    public final A zzr() {
        try {
            F fQ = A.q(i());
            k(fQ.b());
            return fQ.a();
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ");
            sb2.append("ByteString");
            sb2.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }
}
