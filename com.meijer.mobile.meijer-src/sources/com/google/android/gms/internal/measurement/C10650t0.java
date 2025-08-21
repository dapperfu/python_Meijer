package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.t0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10650t0 extends O implements InterfaceC10668v0 {
    C10650t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void beginAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        parcelA2.writeLong(j10);
        c2(23, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        Q.c(parcelA2, bundle);
        c2(9, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void endAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        parcelA2.writeLong(j10);
        c2(24, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void generateEventId(InterfaceC10695y0 interfaceC10695y0) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.d(parcelA2, interfaceC10695y0);
        c2(22, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void getCachedAppInstanceId(InterfaceC10695y0 interfaceC10695y0) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.d(parcelA2, interfaceC10695y0);
        c2(19, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void getConditionalUserProperties(String str, String str2, InterfaceC10695y0 interfaceC10695y0) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        Q.d(parcelA2, interfaceC10695y0);
        c2(10, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void getCurrentScreenClass(InterfaceC10695y0 interfaceC10695y0) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.d(parcelA2, interfaceC10695y0);
        c2(17, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void getCurrentScreenName(InterfaceC10695y0 interfaceC10695y0) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.d(parcelA2, interfaceC10695y0);
        c2(16, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void getGmpAppId(InterfaceC10695y0 interfaceC10695y0) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.d(parcelA2, interfaceC10695y0);
        c2(21, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void getMaxUserProperties(String str, InterfaceC10695y0 interfaceC10695y0) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        Q.d(parcelA2, interfaceC10695y0);
        c2(6, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void getUserProperties(String str, String str2, boolean z10, InterfaceC10695y0 interfaceC10695y0) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        int i10 = Q.f82802b;
        parcelA2.writeInt(z10 ? 1 : 0);
        Q.d(parcelA2, interfaceC10695y0);
        c2(5, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void initialize(com.google.android.gms.dynamic.b bVar, H0 h02, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.d(parcelA2, bVar);
        Q.c(parcelA2, h02);
        parcelA2.writeLong(j10);
        c2(1, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        Q.c(parcelA2, bundle);
        parcelA2.writeInt(z10 ? 1 : 0);
        parcelA2.writeInt(z11 ? 1 : 0);
        parcelA2.writeLong(j10);
        c2(2, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void logHealthData(int i10, String str, com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(5);
        parcelA2.writeString(str);
        Q.d(parcelA2, bVar);
        Q.d(parcelA2, bVar2);
        Q.d(parcelA2, bVar3);
        c2(33, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void onActivityCreatedByScionActivityInfo(J0 j02, Bundle bundle, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.c(parcelA2, j02);
        Q.c(parcelA2, bundle);
        parcelA2.writeLong(j10);
        c2(53, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void onActivityDestroyedByScionActivityInfo(J0 j02, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.c(parcelA2, j02);
        parcelA2.writeLong(j10);
        c2(54, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void onActivityPausedByScionActivityInfo(J0 j02, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.c(parcelA2, j02);
        parcelA2.writeLong(j10);
        c2(55, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void onActivityResumedByScionActivityInfo(J0 j02, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.c(parcelA2, j02);
        parcelA2.writeLong(j10);
        c2(56, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void onActivitySaveInstanceStateByScionActivityInfo(J0 j02, InterfaceC10695y0 interfaceC10695y0, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.c(parcelA2, j02);
        Q.d(parcelA2, interfaceC10695y0);
        parcelA2.writeLong(j10);
        c2(57, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void onActivityStartedByScionActivityInfo(J0 j02, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.c(parcelA2, j02);
        parcelA2.writeLong(j10);
        c2(51, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void onActivityStoppedByScionActivityInfo(J0 j02, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.c(parcelA2, j02);
        parcelA2.writeLong(j10);
        c2(52, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void performAction(Bundle bundle, InterfaceC10695y0 interfaceC10695y0, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.c(parcelA2, bundle);
        Q.d(parcelA2, interfaceC10695y0);
        parcelA2.writeLong(j10);
        c2(32, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void registerOnMeasurementEventListener(E0 e02) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.d(parcelA2, e02);
        c2(35, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void retrieveAndUploadBatches(B0 b02) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.d(parcelA2, b02);
        c2(58, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.c(parcelA2, bundle);
        parcelA2.writeLong(j10);
        c2(8, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void setCurrentScreenByScionActivityInfo(J0 j02, String str, String str2, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        Q.c(parcelA2, j02);
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        parcelA2.writeLong(j10);
        c2(50, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void setDataCollectionEnabled(boolean z10) throws RemoteException {
        Parcel parcelA2 = a2();
        int i10 = Q.f82802b;
        parcelA2.writeInt(z10 ? 1 : 0);
        c2(39, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void setUserId(String str, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        parcelA2.writeLong(j10);
        c2(7, parcelA2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10668v0
    public final void setUserProperty(String str, String str2, com.google.android.gms.dynamic.b bVar, boolean z10, long j10) throws RemoteException {
        Parcel parcelA2 = a2();
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        Q.d(parcelA2, bVar);
        parcelA2.writeInt(z10 ? 1 : 0);
        parcelA2.writeLong(j10);
        c2(4, parcelA2);
    }
}
