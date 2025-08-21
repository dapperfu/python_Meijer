package ud;

import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: ud.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC17386f extends IInterface {
    boolean getBooleanFlagValue(String str, boolean z10, int i10) throws RemoteException;

    int getIntFlagValue(String str, int i10, int i11) throws RemoteException;

    long getLongFlagValue(String str, long j10, int i10) throws RemoteException;

    String getStringFlagValue(String str, String str2, int i10) throws RemoteException;

    void init(com.google.android.gms.dynamic.b bVar) throws RemoteException;
}
