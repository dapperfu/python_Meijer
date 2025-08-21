package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.u0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC10659u0 extends P implements InterfaceC10668v0 {
    public AbstractBinderC10659u0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC10668v0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC10668v0 ? (InterfaceC10668v0) iInterfaceQueryLocalInterface : new C10650t0(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean K1(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC10695y0 c10677w0 = null;
        B0 c10704z0 = null;
        InterfaceC10695y0 c10677w02 = null;
        InterfaceC10695y0 c10677w03 = null;
        InterfaceC10695y0 c10677w04 = null;
        InterfaceC10695y0 c10677w05 = null;
        E0 c02 = null;
        E0 c03 = null;
        E0 c04 = null;
        InterfaceC10695y0 c10677w06 = null;
        InterfaceC10695y0 c10677w07 = null;
        InterfaceC10695y0 c10677w08 = null;
        InterfaceC10695y0 c10677w09 = null;
        InterfaceC10695y0 c10677w010 = null;
        InterfaceC10695y0 c10677w011 = null;
        G0 f02 = null;
        InterfaceC10695y0 c10677w012 = null;
        InterfaceC10695y0 c10677w013 = null;
        InterfaceC10695y0 c10677w014 = null;
        InterfaceC10695y0 c10677w015 = null;
        InterfaceC10695y0 c10677w016 = null;
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                H0 h02 = (H0) Q.b(parcel, H0.CREATOR);
                long j10 = parcel.readLong();
                Q.f(parcel);
                initialize(bVarA2, h02, j10);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) Q.b(parcel, Bundle.CREATOR);
                boolean zA = Q.a(parcel);
                boolean zA2 = Q.a(parcel);
                long j11 = parcel.readLong();
                Q.f(parcel);
                logEvent(string, string2, bundle, zA, zA2, j11);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w0 = iInterfaceQueryLocalInterface instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface : new C10677w0(strongBinder);
                }
                long j12 = parcel.readLong();
                Q.f(parcel);
                logEventAndBundle(string3, string4, bundle2, c10677w0, j12);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                boolean zA3 = Q.a(parcel);
                long j13 = parcel.readLong();
                Q.f(parcel);
                setUserProperty(string5, string6, bVarA22, zA3, j13);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zA4 = Q.a(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w016 = iInterfaceQueryLocalInterface2 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface2 : new C10677w0(strongBinder2);
                }
                Q.f(parcel);
                getUserProperties(string7, string8, zA4, c10677w016);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w015 = iInterfaceQueryLocalInterface3 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface3 : new C10677w0(strongBinder3);
                }
                Q.f(parcel);
                getMaxUserProperties(string9, c10677w015);
                break;
            case 7:
                String string10 = parcel.readString();
                long j14 = parcel.readLong();
                Q.f(parcel);
                setUserId(string10, j14);
                break;
            case 8:
                Bundle bundle3 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                long j15 = parcel.readLong();
                Q.f(parcel);
                setConditionalUserProperty(bundle3, j15);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                Q.f(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w014 = iInterfaceQueryLocalInterface4 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface4 : new C10677w0(strongBinder4);
                }
                Q.f(parcel);
                getConditionalUserProperties(string13, string14, c10677w014);
                break;
            case 11:
                boolean zA5 = Q.a(parcel);
                long j16 = parcel.readLong();
                Q.f(parcel);
                setMeasurementEnabled(zA5, j16);
                break;
            case 12:
                long j17 = parcel.readLong();
                Q.f(parcel);
                resetAnalyticsData(j17);
                break;
            case 13:
                long j18 = parcel.readLong();
                Q.f(parcel);
                setMinimumSessionDuration(j18);
                break;
            case 14:
                long j19 = parcel.readLong();
                Q.f(parcel);
                setSessionTimeoutDuration(j19);
                break;
            case 15:
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j20 = parcel.readLong();
                Q.f(parcel);
                setCurrentScreen(bVarA23, string15, string16, j20);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w013 = iInterfaceQueryLocalInterface5 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface5 : new C10677w0(strongBinder5);
                }
                Q.f(parcel);
                getCurrentScreenName(c10677w013);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w012 = iInterfaceQueryLocalInterface6 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface6 : new C10677w0(strongBinder6);
                }
                Q.f(parcel);
                getCurrentScreenClass(c10677w012);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    f02 = iInterfaceQueryLocalInterface7 instanceof G0 ? (G0) iInterfaceQueryLocalInterface7 : new F0(strongBinder7);
                }
                Q.f(parcel);
                setInstanceIdProvider(f02);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w011 = iInterfaceQueryLocalInterface8 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface8 : new C10677w0(strongBinder8);
                }
                Q.f(parcel);
                getCachedAppInstanceId(c10677w011);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w010 = iInterfaceQueryLocalInterface9 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface9 : new C10677w0(strongBinder9);
                }
                Q.f(parcel);
                getAppInstanceId(c10677w010);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w09 = iInterfaceQueryLocalInterface10 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface10 : new C10677w0(strongBinder10);
                }
                Q.f(parcel);
                getGmpAppId(c10677w09);
                break;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w08 = iInterfaceQueryLocalInterface11 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface11 : new C10677w0(strongBinder11);
                }
                Q.f(parcel);
                generateEventId(c10677w08);
                break;
            case 23:
                String string17 = parcel.readString();
                long j21 = parcel.readLong();
                Q.f(parcel);
                beginAdUnitExposure(string17, j21);
                break;
            case 24:
                String string18 = parcel.readString();
                long j22 = parcel.readLong();
                Q.f(parcel);
                endAdUnitExposure(string18, j22);
                break;
            case 25:
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                Q.f(parcel);
                onActivityStarted(bVarA24, j23);
                break;
            case 26:
                com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                Q.f(parcel);
                onActivityStopped(bVarA25, j24);
                break;
            case 27:
                com.google.android.gms.dynamic.b bVarA26 = b.a.a2(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                long j25 = parcel.readLong();
                Q.f(parcel);
                onActivityCreated(bVarA26, bundle5, j25);
                break;
            case 28:
                com.google.android.gms.dynamic.b bVarA27 = b.a.a2(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                Q.f(parcel);
                onActivityDestroyed(bVarA27, j26);
                break;
            case 29:
                com.google.android.gms.dynamic.b bVarA28 = b.a.a2(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                Q.f(parcel);
                onActivityPaused(bVarA28, j27);
                break;
            case 30:
                com.google.android.gms.dynamic.b bVarA29 = b.a.a2(parcel.readStrongBinder());
                long j28 = parcel.readLong();
                Q.f(parcel);
                onActivityResumed(bVarA29, j28);
                break;
            case 31:
                com.google.android.gms.dynamic.b bVarA210 = b.a.a2(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w07 = iInterfaceQueryLocalInterface12 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface12 : new C10677w0(strongBinder12);
                }
                long j29 = parcel.readLong();
                Q.f(parcel);
                onActivitySaveInstanceState(bVarA210, c10677w07, j29);
                break;
            case com.medallia.digital.mobilesdk.l3.f93325e /* 32 */:
                Bundle bundle6 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w06 = iInterfaceQueryLocalInterface13 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface13 : new C10677w0(strongBinder13);
                }
                long j30 = parcel.readLong();
                Q.f(parcel);
                performAction(bundle6, c10677w06, j30);
                break;
            case 33:
                int i12 = parcel.readInt();
                String string19 = parcel.readString();
                com.google.android.gms.dynamic.b bVarA211 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA212 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA213 = b.a.a2(parcel.readStrongBinder());
                Q.f(parcel);
                logHealthData(i12, string19, bVarA211, bVarA212, bVarA213);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c04 = iInterfaceQueryLocalInterface14 instanceof E0 ? (E0) iInterfaceQueryLocalInterface14 : new C0(strongBinder14);
                }
                Q.f(parcel);
                setEventInterceptor(c04);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c03 = iInterfaceQueryLocalInterface15 instanceof E0 ? (E0) iInterfaceQueryLocalInterface15 : new C0(strongBinder15);
                }
                Q.f(parcel);
                registerOnMeasurementEventListener(c03);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    c02 = iInterfaceQueryLocalInterface16 instanceof E0 ? (E0) iInterfaceQueryLocalInterface16 : new C0(strongBinder16);
                }
                Q.f(parcel);
                unregisterOnMeasurementEventListener(c02);
                break;
            case 37:
                HashMap mapE = Q.e(parcel);
                Q.f(parcel);
                initForTests(mapE);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w05 = iInterfaceQueryLocalInterface17 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface17 : new C10677w0(strongBinder17);
                }
                int i13 = parcel.readInt();
                Q.f(parcel);
                getTestFlag(c10677w05, i13);
                break;
            case 39:
                boolean zA6 = Q.a(parcel);
                Q.f(parcel);
                setDataCollectionEnabled(zA6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w04 = iInterfaceQueryLocalInterface18 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface18 : new C10677w0(strongBinder18);
                }
                Q.f(parcel);
                isDataCollectionEnabled(c10677w04);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                Q.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j31 = parcel.readLong();
                Q.f(parcel);
                clearMeasurementEnabled(j31);
                break;
            case 44:
                Bundle bundle8 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                long j32 = parcel.readLong();
                Q.f(parcel);
                setConsent(bundle8, j32);
                break;
            case 45:
                Bundle bundle9 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                long j33 = parcel.readLong();
                Q.f(parcel);
                setConsentThirdParty(bundle9, j33);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w03 = iInterfaceQueryLocalInterface19 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface19 : new C10677w0(strongBinder19);
                }
                Q.f(parcel);
                getSessionId(c10677w03);
                break;
            case 48:
                Intent intent = (Intent) Q.b(parcel, Intent.CREATOR);
                Q.f(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                J0 j02 = (J0) Q.b(parcel, J0.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j34 = parcel.readLong();
                Q.f(parcel);
                setCurrentScreenByScionActivityInfo(j02, string20, string21, j34);
                break;
            case 51:
                J0 j03 = (J0) Q.b(parcel, J0.CREATOR);
                long j35 = parcel.readLong();
                Q.f(parcel);
                onActivityStartedByScionActivityInfo(j03, j35);
                break;
            case 52:
                J0 j04 = (J0) Q.b(parcel, J0.CREATOR);
                long j36 = parcel.readLong();
                Q.f(parcel);
                onActivityStoppedByScionActivityInfo(j04, j36);
                break;
            case 53:
                J0 j05 = (J0) Q.b(parcel, J0.CREATOR);
                Bundle bundle10 = (Bundle) Q.b(parcel, Bundle.CREATOR);
                long j37 = parcel.readLong();
                Q.f(parcel);
                onActivityCreatedByScionActivityInfo(j05, bundle10, j37);
                break;
            case 54:
                J0 j06 = (J0) Q.b(parcel, J0.CREATOR);
                long j38 = parcel.readLong();
                Q.f(parcel);
                onActivityDestroyedByScionActivityInfo(j06, j38);
                break;
            case 55:
                J0 j07 = (J0) Q.b(parcel, J0.CREATOR);
                long j39 = parcel.readLong();
                Q.f(parcel);
                onActivityPausedByScionActivityInfo(j07, j39);
                break;
            case 56:
                J0 j08 = (J0) Q.b(parcel, J0.CREATOR);
                long j40 = parcel.readLong();
                Q.f(parcel);
                onActivityResumedByScionActivityInfo(j08, j40);
                break;
            case 57:
                J0 j09 = (J0) Q.b(parcel, J0.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    c10677w02 = iInterfaceQueryLocalInterface20 instanceof InterfaceC10695y0 ? (InterfaceC10695y0) iInterfaceQueryLocalInterface20 : new C10677w0(strongBinder20);
                }
                long j41 = parcel.readLong();
                Q.f(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(j09, c10677w02, j41);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    c10704z0 = iInterfaceQueryLocalInterface21 instanceof B0 ? (B0) iInterfaceQueryLocalInterface21 : new C10704z0(strongBinder21);
                }
                Q.f(parcel);
                retrieveAndUploadBatches(c10704z0);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
