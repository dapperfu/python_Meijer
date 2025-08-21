package Oc;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.AbstractBinderC6849Ff;
import com.google.android.gms.internal.ads.AbstractBinderC7166Oo;
import com.google.android.gms.internal.ads.AbstractBinderC9740uc;
import com.google.android.gms.internal.ads.BinderC6724Bn;
import com.google.android.gms.internal.ads.BinderC6826En;
import com.google.android.gms.internal.ads.BinderC8990nb;
import com.google.android.gms.internal.ads.C9097ob;
import com.google.android.gms.internal.ads.InterfaceC6758Cn;
import com.google.android.gms.internal.ads.InterfaceC6860Fn;
import com.google.android.gms.internal.ads.InterfaceC6883Gf;
import com.google.android.gms.internal.ads.InterfaceC7200Po;
import com.google.android.gms.internal.ads.InterfaceC9847vc;
import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes4.dex */
public abstract class U extends BinderC8990nb implements V {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        H f10 = null;
        InterfaceC4422p0 c4416n0 = null;
        K i12 = null;
        N0 l02 = null;
        InterfaceC4377a0 y10 = null;
        C4413m0 c4413m0 = null;
        E c10 = null;
        InterfaceC4401i0 c4395g0 = null;
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.b bVarZzn = zzn();
                parcel2.writeNoException();
                C9097ob.f(parcel2, bVarZzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zR = R();
                parcel2.writeNoException();
                int i13 = C9097ob.f78241b;
                parcel2.writeInt(zR ? 1 : 0);
                return true;
            case 4:
                Y1 y12 = (Y1) C9097ob.a(parcel, Y1.CREATOR);
                C9097ob.c(parcel);
                boolean zW7 = W7(y12);
                parcel2.writeNoException();
                parcel2.writeInt(zW7 ? 1 : 0);
                return true;
            case 5:
                j();
                parcel2.writeNoException();
                return true;
            case 6:
                r();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    f10 = iInterfaceQueryLocalInterface instanceof H ? (H) iInterfaceQueryLocalInterface : new F(strongBinder);
                }
                C9097ob.c(parcel);
                n9(f10);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    c4395g0 = iInterfaceQueryLocalInterface2 instanceof InterfaceC4401i0 ? (InterfaceC4401i0) iInterfaceQueryLocalInterface2 : new C4395g0(strongBinder2);
                }
                C9097ob.c(parcel);
                o9(c4395g0);
                parcel2.writeNoException();
                return true;
            case 9:
                o();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                v();
                parcel2.writeNoException();
                return true;
            case 12:
                d2 d2VarZzg = zzg();
                parcel2.writeNoException();
                C9097ob.e(parcel2, d2VarZzg);
                return true;
            case 13:
                d2 d2Var = (d2) C9097ob.a(parcel, d2.CREATOR);
                C9097ob.c(parcel);
                u1(d2Var);
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC6758Cn interfaceC6758CnB9 = BinderC6724Bn.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                O2(interfaceC6758CnB9);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC6860Fn interfaceC6860FnB9 = BinderC6826En.B9(parcel.readStrongBinder());
                String string = parcel.readString();
                C9097ob.c(parcel);
                X1(interfaceC6860FnB9, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 19:
                InterfaceC6883Gf interfaceC6883GfB9 = AbstractBinderC6849Ff.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                T6(interfaceC6883GfB9);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    c10 = iInterfaceQueryLocalInterface3 instanceof E ? (E) iInterfaceQueryLocalInterface3 : new C(strongBinder3);
                }
                C9097ob.c(parcel);
                J2(c10);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c4413m0 = iInterfaceQueryLocalInterface4 instanceof C4413m0 ? (C4413m0) iInterfaceQueryLocalInterface4 : new C4413m0(strongBinder4);
                }
                C9097ob.c(parcel);
                a9(c4413m0);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                boolean zG = C9097ob.g(parcel);
                C9097ob.c(parcel);
                v9(zG);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zR0 = r0();
                parcel2.writeNoException();
                int i14 = C9097ob.f78241b;
                parcel2.writeInt(zR0 ? 1 : 0);
                return true;
            case 24:
                InterfaceC7200Po interfaceC7200PoB9 = AbstractBinderC7166Oo.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                Y1(interfaceC7200PoB9);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                C9097ob.c(parcel);
                K6(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                Y0 y0Zzl = zzl();
                parcel2.writeNoException();
                C9097ob.f(parcel2, y0Zzl);
                return true;
            case 29:
                R1 r12 = (R1) C9097ob.a(parcel, R1.CREATOR);
                C9097ob.c(parcel);
                B5(r12);
                parcel2.writeNoException();
                return true;
            case 30:
                C4384c1 c4384c1 = (C4384c1) C9097ob.a(parcel, C4384c1.CREATOR);
                C9097ob.c(parcel);
                W4(c4384c1);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case l3.f93325e /* 32 */:
                InterfaceC4401i0 interfaceC4401i0Zzj = zzj();
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC4401i0Zzj);
                return true;
            case 33:
                H hZzi = zzi();
                parcel2.writeNoException();
                C9097ob.f(parcel2, hZzi);
                return true;
            case 34:
                boolean zG2 = C9097ob.g(parcel);
                C9097ob.c(parcel);
                y8(zG2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    y10 = iInterfaceQueryLocalInterface5 instanceof InterfaceC4377a0 ? (InterfaceC4377a0) iInterfaceQueryLocalInterface5 : new Y(strongBinder5);
                }
                C9097ob.c(parcel);
                S6(y10);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzd = zzd();
                parcel2.writeNoException();
                C9097ob.e(parcel2, bundleZzd);
                return true;
            case 38:
                String string3 = parcel.readString();
                C9097ob.c(parcel);
                A5(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                j2 j2Var = (j2) C9097ob.a(parcel, j2.CREATOR);
                C9097ob.c(parcel);
                G5(j2Var);
                parcel2.writeNoException();
                return true;
            case 40:
                InterfaceC9847vc interfaceC9847vcB9 = AbstractBinderC9740uc.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                V4(interfaceC9847vcB9);
                parcel2.writeNoException();
                return true;
            case 41:
                U0 u0Zzk = zzk();
                parcel2.writeNoException();
                C9097ob.f(parcel2, u0Zzk);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    l02 = iInterfaceQueryLocalInterface6 instanceof N0 ? (N0) iInterfaceQueryLocalInterface6 : new L0(strongBinder6);
                }
                C9097ob.c(parcel);
                D3(l02);
                parcel2.writeNoException();
                return true;
            case 43:
                Y1 y13 = (Y1) C9097ob.a(parcel, Y1.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    i12 = iInterfaceQueryLocalInterface7 instanceof K ? (K) iInterfaceQueryLocalInterface7 : new I(strongBinder7);
                }
                C9097ob.c(parcel);
                A6(y13, i12);
                parcel2.writeNoException();
                return true;
            case 44:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                J6(bVarA2);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    c4416n0 = iInterfaceQueryLocalInterface8 instanceof InterfaceC4422p0 ? (InterfaceC4422p0) iInterfaceQueryLocalInterface8 : new C4416n0(strongBinder8);
                }
                C9097ob.c(parcel);
                d4(c4416n0);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zG3 = G();
                parcel2.writeNoException();
                int i15 = C9097ob.f78241b;
                parcel2.writeInt(zG3 ? 1 : 0);
                return true;
        }
    }

    public U() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }
}
