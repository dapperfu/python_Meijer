package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes6.dex */
final class zzbyu implements InvocationHandler {
    private final List zza;
    private boolean zzb;
    private String zzc;

    public zzbyu(List list) {
        this.zza = list;
    }

    final /* synthetic */ boolean zza() {
        return this.zzb;
    }

    final /* synthetic */ String zzb() {
        return this.zzc;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = zzbyy.zza;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.zzb = true;
            return null;
        }
        if (name.equals("protocols") && objArr.length == 0) {
            return this.zza;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && returnType == String.class && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.zza.contains(list.get(i10))) {
                        String str = (String) list.get(i10);
                        this.zzc = str;
                        return str;
                    }
                }
                String str2 = (String) this.zza.get(0);
                this.zzc = str2;
                return str2;
            }
        }
        if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
            this.zzc = (String) objArr[0];
            return null;
        }
        return method.invoke(this, objArr);
    }
}
