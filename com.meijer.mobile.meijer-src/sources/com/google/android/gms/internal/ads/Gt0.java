package com.google.android.gms.internal.ads;

import A0.c;
import com.google.android.gms.internal.ads.Gt0;
import com.google.android.gms.internal.ads.Ht0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public abstract class Gt0<MessageType extends Ht0<MessageType, BuilderType>, BuilderType extends Gt0<MessageType, BuilderType>> implements InterfaceC9138ov0 {
    public BuilderType d(byte[] bArr, C9350qu0 c9350qu0) throws zzgyg {
        return (BuilderType) e(bArr, 0, bArr.length, c9350qu0);
    }

    public abstract BuilderType e(byte[] bArr, int i10, int i11, C9350qu0 c9350qu0) throws zzgyg;

    private static <T> void f(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof C10314zv0) {
                ((C10314zv0) list).f(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    j(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            c.e eVar = (Object) list2.get(i10);
            if (eVar == null) {
                j(list, size2);
            }
            list.add(eVar);
        }
    }

    protected static zzhag g(InterfaceC9245pv0 interfaceC9245pv0) {
        return new zzhag(interfaceC9245pv0);
    }

    protected static <T> void i(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = Tu0.f71313b;
        iterable.getClass();
        if (!(iterable instanceof InterfaceC7751bv0)) {
            if (iterable instanceof InterfaceC10100xv0) {
                list.addAll((Collection) iterable);
                return;
            } else {
                f(iterable, list);
                return;
            }
        }
        List listZza = ((InterfaceC7751bv0) iterable).zza();
        InterfaceC7751bv0 interfaceC7751bv0 = (InterfaceC7751bv0) list;
        int size = list.size();
        for (Object obj : listZza) {
            if (obj == null) {
                String str = "Element at index " + (interfaceC7751bv0.size() - size) + " is null.";
                int size2 = interfaceC7751bv0.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    interfaceC7751bv0.remove(size2);
                }
            } else if (obj instanceof Zt0) {
                interfaceC7751bv0.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                Zt0.z(bArr2, 0, bArr2.length);
                interfaceC7751bv0.zzb();
            } else {
                interfaceC7751bv0.add((String) obj);
            }
        }
    }

    private static void j(List<?> list, int i10) {
        String str = "Element at index " + (list.size() - i10) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size >= i10) {
                list.remove(size);
            } else {
                throw new NullPointerException(str);
            }
        }
    }
}
