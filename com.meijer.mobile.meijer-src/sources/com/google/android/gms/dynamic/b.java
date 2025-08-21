package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes4.dex */
public interface b extends IInterface {

    public static abstract class a extends Ad.c implements b {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static b a2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new n(iBinder);
        }
    }
}
