package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.internal.InterfaceC6529k;

/* renamed from: com.google.android.gms.common.internal.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class BinderC6519a extends InterfaceC6529k.a {
    public static Account b2(InterfaceC6529k interfaceC6529k) {
        if (interfaceC6529k == null) {
            return null;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return interfaceC6529k.zzb();
        } catch (RemoteException unused) {
            FS.log_w("AccountAccessor", "Remote account accessor probably died");
            return null;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }
}
