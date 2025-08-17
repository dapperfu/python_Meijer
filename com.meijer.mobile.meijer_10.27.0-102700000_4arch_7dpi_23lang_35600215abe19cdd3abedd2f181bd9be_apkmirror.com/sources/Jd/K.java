package Jd;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes6.dex */
public interface K extends IInterface {
    void F5(LocationResult locationResult) throws RemoteException;

    void h2(LocationAvailability locationAvailability) throws RemoteException;

    void zzf() throws RemoteException;
}
