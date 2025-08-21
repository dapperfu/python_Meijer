package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC10619p4;
import com.google.android.gms.internal.measurement.AbstractC10628q4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.p4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10619p4<MessageType extends AbstractC10628q4<MessageType, BuilderType>, BuilderType extends AbstractC10619p4<MessageType, BuilderType>> implements J5 {
    @Override // com.google.android.gms.internal.measurement.J5
    public final /* synthetic */ J5 N2(byte[] bArr, P4 p42) throws zzmr {
        return j(bArr, 0, bArr.length, p42);
    }

    @Override // com.google.android.gms.internal.measurement.J5
    public final /* synthetic */ J5 h1(byte[] bArr) throws zzmr {
        return i(bArr, 0, bArr.length);
    }

    public abstract AbstractC10619p4 i(byte[] bArr, int i10, int i11) throws zzmr;

    public abstract AbstractC10619p4 j(byte[] bArr, int i10, int i11, P4 p42) throws zzmr;

    protected static void k(Iterable iterable, List list) {
        byte[] bArr = C10611o5.f83156b;
        iterable.getClass();
        if (iterable instanceof InterfaceC10664u5) {
            List listZza = ((InterfaceC10664u5) iterable).zza();
            InterfaceC10664u5 interfaceC10664u5 = (InterfaceC10664u5) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = interfaceC10664u5.size() - size;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb2.append("Element at index ");
                    sb2.append(size2);
                    sb2.append(" is null.");
                    String string = sb2.toString();
                    int size3 = interfaceC10664u5.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        interfaceC10664u5.remove(size3);
                    }
                } else if (obj instanceof G4) {
                    interfaceC10664u5.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    G4.m(bArr2, 0, bArr2.length);
                    interfaceC10664u5.zzb();
                } else {
                    interfaceC10664u5.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof R5) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof T5) {
                ((T5) list).f(list.size() + size4);
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    g(list, size5);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj3 = list2.get(i10);
            if (obj3 == null) {
                g(list, size5);
            }
            list.add(obj3);
        }
    }

    private static void g(List list, int i10) {
        int size = list.size() - i10;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append("Element at index ");
        sb2.append(size);
        sb2.append(" is null.");
        String string = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 >= i10) {
                list.remove(size2);
            } else {
                throw new NullPointerException(string);
            }
        }
    }
}
