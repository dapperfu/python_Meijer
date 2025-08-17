package Ad;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;

/* loaded from: classes6.dex */
public interface G0 extends IInterface {
    void L1(Status status, LocationAvailability locationAvailability) throws RemoteException;
}
