package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.v0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC10543v0 extends IInterface {
    void beginAdUnitExposure(String str, long j10) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j10) throws RemoteException;

    void endAdUnitExposure(String str, long j10) throws RemoteException;

    void generateEventId(InterfaceC10570y0 interfaceC10570y0) throws RemoteException;

    void getAppInstanceId(InterfaceC10570y0 interfaceC10570y0) throws RemoteException;

    void getCachedAppInstanceId(InterfaceC10570y0 interfaceC10570y0) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, InterfaceC10570y0 interfaceC10570y0) throws RemoteException;

    void getCurrentScreenClass(InterfaceC10570y0 interfaceC10570y0) throws RemoteException;

    void getCurrentScreenName(InterfaceC10570y0 interfaceC10570y0) throws RemoteException;

    void getGmpAppId(InterfaceC10570y0 interfaceC10570y0) throws RemoteException;

    void getMaxUserProperties(String str, InterfaceC10570y0 interfaceC10570y0) throws RemoteException;

    void getSessionId(InterfaceC10570y0 interfaceC10570y0) throws RemoteException;

    void getTestFlag(InterfaceC10570y0 interfaceC10570y0, int i10) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z10, InterfaceC10570y0 interfaceC10570y0) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(com.google.android.gms.dynamic.b bVar, H0 h02, long j10) throws RemoteException;

    void isDataCollectionEnabled(InterfaceC10570y0 interfaceC10570y0) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC10570y0 interfaceC10570y0, long j10) throws RemoteException;

    void logHealthData(int i10, String str, com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) throws RemoteException;

    void onActivityCreated(com.google.android.gms.dynamic.b bVar, Bundle bundle, long j10) throws RemoteException;

    void onActivityCreatedByScionActivityInfo(J0 j02, Bundle bundle, long j10) throws RemoteException;

    void onActivityDestroyed(com.google.android.gms.dynamic.b bVar, long j10) throws RemoteException;

    void onActivityDestroyedByScionActivityInfo(J0 j02, long j10) throws RemoteException;

    void onActivityPaused(com.google.android.gms.dynamic.b bVar, long j10) throws RemoteException;

    void onActivityPausedByScionActivityInfo(J0 j02, long j10) throws RemoteException;

    void onActivityResumed(com.google.android.gms.dynamic.b bVar, long j10) throws RemoteException;

    void onActivityResumedByScionActivityInfo(J0 j02, long j10) throws RemoteException;

    void onActivitySaveInstanceState(com.google.android.gms.dynamic.b bVar, InterfaceC10570y0 interfaceC10570y0, long j10) throws RemoteException;

    void onActivitySaveInstanceStateByScionActivityInfo(J0 j02, InterfaceC10570y0 interfaceC10570y0, long j10) throws RemoteException;

    void onActivityStarted(com.google.android.gms.dynamic.b bVar, long j10) throws RemoteException;

    void onActivityStartedByScionActivityInfo(J0 j02, long j10) throws RemoteException;

    void onActivityStopped(com.google.android.gms.dynamic.b bVar, long j10) throws RemoteException;

    void onActivityStoppedByScionActivityInfo(J0 j02, long j10) throws RemoteException;

    void performAction(Bundle bundle, InterfaceC10570y0 interfaceC10570y0, long j10) throws RemoteException;

    void registerOnMeasurementEventListener(E0 e02) throws RemoteException;

    void resetAnalyticsData(long j10) throws RemoteException;

    void retrieveAndUploadBatches(B0 b02) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException;

    void setConsent(Bundle bundle, long j10) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException;

    void setCurrentScreen(com.google.android.gms.dynamic.b bVar, String str, String str2, long j10) throws RemoteException;

    void setCurrentScreenByScionActivityInfo(J0 j02, String str, String str2, long j10) throws RemoteException;

    void setDataCollectionEnabled(boolean z10) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(E0 e02) throws RemoteException;

    void setInstanceIdProvider(G0 g02) throws RemoteException;

    void setMeasurementEnabled(boolean z10, long j10) throws RemoteException;

    void setMinimumSessionDuration(long j10) throws RemoteException;

    void setSessionTimeoutDuration(long j10) throws RemoteException;

    void setSgtmDebugInfo(Intent intent) throws RemoteException;

    void setUserId(String str, long j10) throws RemoteException;

    void setUserProperty(String str, String str2, com.google.android.gms.dynamic.b bVar, boolean z10, long j10) throws RemoteException;

    void unregisterOnMeasurementEventListener(E0 e02) throws RemoteException;
}
