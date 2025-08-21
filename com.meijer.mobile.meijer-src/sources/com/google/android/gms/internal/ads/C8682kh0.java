package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.kh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8682kh0 {
    private static boolean d(List list, InterfaceC6816Ef0 interfaceC6816Ef0) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!interfaceC6816Ef0.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        c(list, interfaceC6816Ef0, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        c(list, interfaceC6816Ef0, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    public static Object a(Iterable iterable, Object obj) {
        AbstractC8684ki0 it = ((C7618ai0) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static boolean b(Iterable iterable, InterfaceC6816Ef0 interfaceC6816Ef0) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            interfaceC6816Ef0.getClass();
            return d((List) iterable, interfaceC6816Ef0);
        }
        Iterator it = iterable.iterator();
        interfaceC6816Ef0.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            if (interfaceC6816Ef0.zza(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    private static void c(List list, InterfaceC6816Ef0 interfaceC6816Ef0, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (interfaceC6816Ef0.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 >= i10) {
                list.remove(i11);
            } else {
                return;
            }
        }
    }
}
