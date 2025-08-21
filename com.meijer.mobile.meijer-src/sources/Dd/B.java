package Dd;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes6.dex */
public interface B extends IInterface {
    void C3(LatLng latLng) throws RemoteException;

    void D(com.google.android.gms.dynamic.b bVar) throws RemoteException;

    boolean F5(B b10) throws RemoteException;

    void I(boolean z10) throws RemoteException;

    void M(float f10) throws RemoteException;

    void V7(float f10, float f11) throws RemoteException;

    void Y(float f10) throws RemoteException;

    void e1(LatLngBounds latLngBounds) throws RemoteException;

    void f5(float f10) throws RemoteException;

    void u0(com.google.android.gms.dynamic.b bVar) throws RemoteException;

    void u8(float f10) throws RemoteException;

    void w(boolean z10) throws RemoteException;

    int zzi() throws RemoteException;

    void zzn() throws RemoteException;
}
