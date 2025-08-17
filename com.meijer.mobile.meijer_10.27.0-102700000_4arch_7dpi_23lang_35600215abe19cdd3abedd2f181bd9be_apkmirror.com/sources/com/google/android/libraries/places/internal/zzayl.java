package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzayl;
import com.google.android.libraries.places.internal.zzaym;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public abstract class zzayl<MessageType extends zzaym<MessageType, BuilderType>, BuilderType extends zzayl<MessageType, BuilderType>> implements zzbbk {
    @Override // 
    public abstract zzayl zzt();

    protected abstract zzayl zzu(zzaym zzaymVar);

    @Override // com.google.android.libraries.places.internal.zzbbk
    public /* bridge */ /* synthetic */ zzbbk zzx(zzazc zzazcVar, zzazp zzazpVar) throws IOException {
        throw null;
    }

    protected static void zzv(Iterable iterable, List list) {
        byte[] bArr = zzbap.zzb;
        if (!(iterable instanceof zzbax)) {
            if (iterable instanceof zzbbu) {
                list.addAll((Collection) iterable);
                return;
            }
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzbbw) {
                ((zzbbw) list).zze(list.size() + size);
            }
            int size2 = list.size();
            if (!(iterable instanceof RandomAccess)) {
                for (Object obj : iterable) {
                    if (obj == null) {
                        zza(list, size2);
                    }
                    list.add(obj);
                }
                return;
            }
            List list2 = (List) iterable;
            int size3 = list2.size();
            for (int i10 = 0; i10 < size3; i10++) {
                Object obj2 = list2.get(i10);
                if (obj2 == null) {
                    zza(list, size2);
                }
                list.add(obj2);
            }
            return;
        }
        List listZza = ((zzbax) iterable).zza();
        zzbax zzbaxVar = (zzbax) list;
        int size4 = list.size();
        for (Object obj3 : listZza) {
            if (obj3 == null) {
                int size5 = zzbaxVar.size() - size4;
                StringBuilder sb2 = new StringBuilder(String.valueOf(size5).length() + 26);
                sb2.append("Element at index ");
                sb2.append(size5);
                sb2.append(" is null.");
                String string = sb2.toString();
                int size6 = zzbaxVar.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new NullPointerException(string);
                    }
                    zzbaxVar.remove(size6);
                }
            } else if (obj3 instanceof zzayz) {
                zzbaxVar.zzb();
            } else if (obj3 instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj3;
                zzayz.zzh(bArr2, 0, bArr2.length);
                zzbaxVar.zzb();
            } else {
                zzbaxVar.add((String) obj3);
            }
        }
    }

    private static void zza(List list, int i10) {
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

    @Override // com.google.android.libraries.places.internal.zzbbk
    public final /* bridge */ /* synthetic */ zzbbk zzw(zzbbl zzbblVar) {
        if (zzbB().getClass().isInstance(zzbblVar)) {
            return zzu((zzaym) zzbblVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
