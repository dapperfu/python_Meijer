package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.El, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC6824El extends BinderC8990nb implements InterfaceC6858Fl {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC6960Il c6892Gl;
        InterfaceC6960Il c6892Gl2;
        InterfaceC6960Il c6892Gl3;
        InterfaceC6960Il c6892Gl4;
        InterfaceC6960Il c6892Gl5;
        InterfaceC6960Il c6892Gl6;
        InterfaceC6960Il c6892Gl7;
        InterfaceC6960Il c6892Gl8;
        InterfaceC6960Il c6892Gl9 = null;
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                Oc.d2 d2Var = (Oc.d2) C9097ob.a(parcel, Oc.d2.CREATOR);
                Oc.Y1 y12 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c6892Gl = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6892Gl = iInterfaceQueryLocalInterface instanceof InterfaceC6960Il ? (InterfaceC6960Il) iInterfaceQueryLocalInterface : new C6892Gl(strongBinder);
                }
                C9097ob.c(parcel);
                X3(bVarA2, d2Var, y12, string, c6892Gl);
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.dynamic.b bVarZzn = zzn();
                parcel2.writeNoException();
                C9097ob.f(parcel2, bVarZzn);
                return true;
            case 3:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                Oc.Y1 y13 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    c6892Gl2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6892Gl2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC6960Il ? (InterfaceC6960Il) iInterfaceQueryLocalInterface2 : new C6892Gl(strongBinder2);
                }
                C9097ob.c(parcel);
                E2(bVarA22, y13, string2, c6892Gl2);
                parcel2.writeNoException();
                return true;
            case 4:
                h();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                Oc.d2 d2Var2 = (Oc.d2) C9097ob.a(parcel, Oc.d2.CREATOR);
                Oc.Y1 y14 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    c6892Gl3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6892Gl3 = iInterfaceQueryLocalInterface3 instanceof InterfaceC6960Il ? (InterfaceC6960Il) iInterfaceQueryLocalInterface3 : new C6892Gl(strongBinder3);
                }
                C9097ob.c(parcel);
                r5(bVarA23, d2Var2, y14, string3, string4, c6892Gl3);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                Oc.Y1 y15 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    c6892Gl4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6892Gl4 = iInterfaceQueryLocalInterface4 instanceof InterfaceC6960Il ? (InterfaceC6960Il) iInterfaceQueryLocalInterface4 : new C6892Gl(strongBinder4);
                }
                C9097ob.c(parcel);
                d3(bVarA24, y15, string5, string6, c6892Gl4);
                parcel2.writeNoException();
                return true;
            case 8:
                A();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                Oc.Y1 y16 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                String string7 = parcel.readString();
                InterfaceC7369Uo interfaceC7369UoB9 = AbstractBinderC7336To.B9(parcel.readStrongBinder());
                String string8 = parcel.readString();
                C9097ob.c(parcel);
                J3(bVarA25, y16, string7, interfaceC7369UoB9, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                Oc.Y1 y17 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                String string9 = parcel.readString();
                C9097ob.c(parcel);
                I3(y17, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                l();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzN = zzN();
                parcel2.writeNoException();
                int i12 = C9097ob.f78241b;
                parcel2.writeInt(zZzN ? 1 : 0);
                return true;
            case 14:
                com.google.android.gms.dynamic.b bVarA26 = b.a.a2(parcel.readStrongBinder());
                Oc.Y1 y18 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    c6892Gl5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6892Gl5 = iInterfaceQueryLocalInterface5 instanceof InterfaceC6960Il ? (InterfaceC6960Il) iInterfaceQueryLocalInterface5 : new C6892Gl(strongBinder5);
                }
                C7088Mg c7088Mg = (C7088Mg) C9097ob.a(parcel, C7088Mg.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                C9097ob.c(parcel);
                t4(bVarA26, y18, string10, string11, c6892Gl5, c7088Mg, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                C9097ob.f(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                C9097ob.f(parcel2, null);
                return true;
            case 17:
                Bundle bundleZze = zze();
                parcel2.writeNoException();
                C9097ob.e(parcel2, bundleZze);
                return true;
            case 18:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                C9097ob.e(parcel2, bundleZzf);
                return true;
            case 19:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                C9097ob.e(parcel2, bundleZzg);
                return true;
            case 20:
                Oc.Y1 y19 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                C9097ob.c(parcel);
                k1(y19, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                com.google.android.gms.dynamic.b bVarA27 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                s5(bVarA27);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                parcel2.writeNoException();
                int i13 = C9097ob.f78241b;
                parcel2.writeInt(0);
                return true;
            case 23:
                com.google.android.gms.dynamic.b bVarA28 = b.a.a2(parcel.readStrongBinder());
                InterfaceC7369Uo interfaceC7369UoB92 = AbstractBinderC7336To.B9(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                C9097ob.c(parcel);
                U3(bVarA28, interfaceC7369UoB92, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                InterfaceC9323qh interfaceC9323qhZzi = zzi();
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC9323qhZzi);
                return true;
            case 25:
                boolean zG = C9097ob.g(parcel);
                C9097ob.c(parcel);
                f0(zG);
                parcel2.writeNoException();
                return true;
            case 26:
                Oc.Y0 y0Zzh = zzh();
                parcel2.writeNoException();
                C9097ob.f(parcel2, y0Zzh);
                return true;
            case 27:
                InterfaceC7231Ql interfaceC7231QlZzk = zzk();
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC7231QlZzk);
                return true;
            case 28:
                com.google.android.gms.dynamic.b bVarA29 = b.a.a2(parcel.readStrongBinder());
                Oc.Y1 y110 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    c6892Gl6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6892Gl6 = iInterfaceQueryLocalInterface6 instanceof InterfaceC6960Il ? (InterfaceC6960Il) iInterfaceQueryLocalInterface6 : new C6892Gl(strongBinder6);
                }
                C9097ob.c(parcel);
                g1(bVarA29, y110, string14, c6892Gl6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                com.google.android.gms.dynamic.b bVarA210 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                F8(bVarA210);
                parcel2.writeNoException();
                return true;
            case 31:
                com.google.android.gms.dynamic.b bVarA211 = b.a.a2(parcel.readStrongBinder());
                InterfaceC7093Mj interfaceC7093MjB9 = AbstractBinderC7060Lj.B9(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C7297Sj.CREATOR);
                C9097ob.c(parcel);
                M6(bVarA211, interfaceC7093MjB9, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case com.medallia.digital.mobilesdk.l3.f93325e /* 32 */:
                com.google.android.gms.dynamic.b bVarA212 = b.a.a2(parcel.readStrongBinder());
                Oc.Y1 y111 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 == null) {
                    c6892Gl7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6892Gl7 = iInterfaceQueryLocalInterface7 instanceof InterfaceC6960Il ? (InterfaceC6960Il) iInterfaceQueryLocalInterface7 : new C6892Gl(strongBinder7);
                }
                C9097ob.c(parcel);
                s2(bVarA212, y111, string15, c6892Gl7);
                parcel2.writeNoException();
                return true;
            case 33:
                C7130Nm c7130NmZzl = zzl();
                parcel2.writeNoException();
                C9097ob.e(parcel2, c7130NmZzl);
                return true;
            case 34:
                C7130Nm c7130NmZzm = zzm();
                parcel2.writeNoException();
                C9097ob.e(parcel2, c7130NmZzm);
                return true;
            case 35:
                com.google.android.gms.dynamic.b bVarA213 = b.a.a2(parcel.readStrongBinder());
                Oc.d2 d2Var3 = (Oc.d2) C9097ob.a(parcel, Oc.d2.CREATOR);
                Oc.Y1 y112 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    c6892Gl8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6892Gl8 = iInterfaceQueryLocalInterface8 instanceof InterfaceC6960Il ? (InterfaceC6960Il) iInterfaceQueryLocalInterface8 : new C6892Gl(strongBinder8);
                }
                C9097ob.c(parcel);
                X5(bVarA213, d2Var3, y112, string16, string17, c6892Gl8);
                parcel2.writeNoException();
                return true;
            case 36:
                InterfaceC7062Ll interfaceC7062LlZzj = zzj();
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC7062LlZzj);
                return true;
            case 37:
                com.google.android.gms.dynamic.b bVarA214 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                u9(bVarA214);
                parcel2.writeNoException();
                return true;
            case 38:
                com.google.android.gms.dynamic.b bVarA215 = b.a.a2(parcel.readStrongBinder());
                Oc.Y1 y113 = (Oc.Y1) C9097ob.a(parcel, Oc.Y1.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6892Gl9 = iInterfaceQueryLocalInterface9 instanceof InterfaceC6960Il ? (InterfaceC6960Il) iInterfaceQueryLocalInterface9 : new C6892Gl(strongBinder9);
                }
                C9097ob.c(parcel);
                X4(bVarA215, y113, string18, c6892Gl9);
                parcel2.writeNoException();
                return true;
            case 39:
                com.google.android.gms.dynamic.b bVarA216 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                L7(bVarA216);
                parcel2.writeNoException();
                return true;
        }
    }

    public AbstractBinderC6824El() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }
}
