package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.internal.InterfaceC6654k;

/* renamed from: com.google.android.gms.common.internal.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class BinderC6644a extends InterfaceC6654k.a {
    public static Account c2(InterfaceC6654k interfaceC6654k) {
        if (interfaceC6654k == null) {
            return null;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return interfaceC6654k.zzb();
        } catch (RemoteException unused) {
            FS.log_w("AccountAccessor", "Remote account accessor probably died");
            return null;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }
}
