package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.W;
import com.google.android.gms.internal.vision.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class X<MessageType extends X<MessageType, BuilderType>, BuilderType extends W<MessageType, BuilderType>> implements InterfaceC11083w1 {
    protected int zza = 0;

    void c(int i10) {
        throw new UnsupportedOperationException();
    }

    int e() {
        throw new UnsupportedOperationException();
    }

    protected static <T> void b(Iterable<T> iterable, List<? super T> list) {
        S0.d(iterable);
        if (iterable instanceof InterfaceC11033g1) {
            List<?> listZzd = ((InterfaceC11033g1) iterable).zzd();
            InterfaceC11033g1 interfaceC11033g1 = (InterfaceC11033g1) list;
            int size = list.size();
            for (Object obj : listZzd) {
                if (obj == null) {
                    int size2 = interfaceC11033g1.size() - size;
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Element at index ");
                    sb2.append(size2);
                    sb2.append(" is null.");
                    String string = sb2.toString();
                    for (int size3 = interfaceC11033g1.size() - 1; size3 >= size; size3--) {
                        interfaceC11033g1.remove(size3);
                    }
                    throw new NullPointerException(string);
                }
                if (obj instanceof AbstractC11036h0) {
                    interfaceC11033g1.i3((AbstractC11036h0) obj);
                } else {
                    interfaceC11033g1.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof H1) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
        }
        int size4 = list.size();
        for (T t10 : iterable) {
            if (t10 == null) {
                int size5 = list.size() - size4;
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("Element at index ");
                sb3.append(size5);
                sb3.append(" is null.");
                String string2 = sb3.toString();
                for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                    list.remove(size6);
                }
                throw new NullPointerException(string2);
            }
            list.add(t10);
        }
    }

    public final byte[] d() {
        try {
            byte[] bArr = new byte[zzm()];
            zzii zziiVarF = zzii.f(bArr);
            a(zziiVarF);
            zziiVarF.N();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 62 + "byte array".length());
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ");
            sb2.append("byte array");
            sb2.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11083w1
    public final AbstractC11036h0 zzg() {
        try {
            C11065q0 c11065q0T = AbstractC11036h0.t(zzm());
            a(c11065q0T.b());
            return c11065q0T.a();
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
