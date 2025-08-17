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
public abstract class AbstractBinderC6699El extends BinderC8865nb implements InterfaceC6733Fl {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        InterfaceC6835Il c6767Gl;
        InterfaceC6835Il c6767Gl2;
        InterfaceC6835Il c6767Gl3;
        InterfaceC6835Il c6767Gl4;
        InterfaceC6835Il c6767Gl5;
        InterfaceC6835Il c6767Gl6;
        InterfaceC6835Il c6767Gl7;
        InterfaceC6835Il c6767Gl8;
        InterfaceC6835Il c6767Gl9 = null;
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                Mc.d2 d2Var = (Mc.d2) C8972ob.a(parcel, Mc.d2.CREATOR);
                Mc.Y1 y12 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c6767Gl = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6767Gl = iInterfaceQueryLocalInterface instanceof InterfaceC6835Il ? (InterfaceC6835Il) iInterfaceQueryLocalInterface : new C6767Gl(strongBinder);
                }
                C8972ob.c(parcel);
                i1(bVarA2, d2Var, y12, string, c6767Gl);
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.dynamic.b bVarZzn = zzn();
                parcel2.writeNoException();
                C8972ob.f(parcel2, bVarZzn);
                return true;
            case 3:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                Mc.Y1 y13 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    c6767Gl2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6767Gl2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC6835Il ? (InterfaceC6835Il) iInterfaceQueryLocalInterface2 : new C6767Gl(strongBinder2);
                }
                C8972ob.c(parcel);
                d4(bVarA22, y13, string2, c6767Gl2);
                parcel2.writeNoException();
                return true;
            case 4:
                g();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                Mc.d2 d2Var2 = (Mc.d2) C8972ob.a(parcel, Mc.d2.CREATOR);
                Mc.Y1 y14 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    c6767Gl3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6767Gl3 = iInterfaceQueryLocalInterface3 instanceof InterfaceC6835Il ? (InterfaceC6835Il) iInterfaceQueryLocalInterface3 : new C6767Gl(strongBinder3);
                }
                C8972ob.c(parcel);
                G8(bVarA23, d2Var2, y14, string3, string4, c6767Gl3);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                Mc.Y1 y15 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    c6767Gl4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6767Gl4 = iInterfaceQueryLocalInterface4 instanceof InterfaceC6835Il ? (InterfaceC6835Il) iInterfaceQueryLocalInterface4 : new C6767Gl(strongBinder4);
                }
                C8972ob.c(parcel);
                g9(bVarA24, y15, string5, string6, c6767Gl4);
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
                Mc.Y1 y16 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                String string7 = parcel.readString();
                InterfaceC7244Uo interfaceC7244UoB9 = AbstractBinderC7211To.B9(parcel.readStrongBinder());
                String string8 = parcel.readString();
                C8972ob.c(parcel);
                v6(bVarA25, y16, string7, interfaceC7244UoB9, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                Mc.Y1 y17 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                String string9 = parcel.readString();
                C8972ob.c(parcel);
                o4(y17, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                l();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzN = zzN();
                parcel2.writeNoException();
                int i12 = C8972ob.f77401b;
                parcel2.writeInt(zZzN ? 1 : 0);
                return true;
            case 14:
                com.google.android.gms.dynamic.b bVarA26 = b.a.a2(parcel.readStrongBinder());
                Mc.Y1 y18 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    c6767Gl5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6767Gl5 = iInterfaceQueryLocalInterface5 instanceof InterfaceC6835Il ? (InterfaceC6835Il) iInterfaceQueryLocalInterface5 : new C6767Gl(strongBinder5);
                }
                C6963Mg c6963Mg = (C6963Mg) C8972ob.a(parcel, C6963Mg.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                C8972ob.c(parcel);
                A6(bVarA26, y18, string10, string11, c6767Gl5, c6963Mg, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                C8972ob.f(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                C8972ob.f(parcel2, null);
                return true;
            case 17:
                Bundle bundleZze = zze();
                parcel2.writeNoException();
                C8972ob.e(parcel2, bundleZze);
                return true;
            case 18:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                C8972ob.e(parcel2, bundleZzf);
                return true;
            case 19:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                C8972ob.e(parcel2, bundleZzg);
                return true;
            case 20:
                Mc.Y1 y19 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                C8972ob.c(parcel);
                e4(y19, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                com.google.android.gms.dynamic.b bVarA27 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                m5(bVarA27);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                parcel2.writeNoException();
                int i13 = C8972ob.f77401b;
                parcel2.writeInt(0);
                return true;
            case 23:
                com.google.android.gms.dynamic.b bVarA28 = b.a.a2(parcel.readStrongBinder());
                InterfaceC7244Uo interfaceC7244UoB92 = AbstractBinderC7211To.B9(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                C8972ob.c(parcel);
                I3(bVarA28, interfaceC7244UoB92, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                InterfaceC9198qh interfaceC9198qhZzi = zzi();
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC9198qhZzi);
                return true;
            case 25:
                boolean zG = C8972ob.g(parcel);
                C8972ob.c(parcel);
                d0(zG);
                parcel2.writeNoException();
                return true;
            case 26:
                Mc.Y0 y0Zzh = zzh();
                parcel2.writeNoException();
                C8972ob.f(parcel2, y0Zzh);
                return true;
            case 27:
                InterfaceC7106Ql interfaceC7106QlZzk = zzk();
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC7106QlZzk);
                return true;
            case 28:
                com.google.android.gms.dynamic.b bVarA29 = b.a.a2(parcel.readStrongBinder());
                Mc.Y1 y110 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    c6767Gl6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6767Gl6 = iInterfaceQueryLocalInterface6 instanceof InterfaceC6835Il ? (InterfaceC6835Il) iInterfaceQueryLocalInterface6 : new C6767Gl(strongBinder6);
                }
                C8972ob.c(parcel);
                t1(bVarA29, y110, string14, c6767Gl6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                com.google.android.gms.dynamic.b bVarA210 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                L8(bVarA210);
                parcel2.writeNoException();
                return true;
            case 31:
                com.google.android.gms.dynamic.b bVarA211 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6968Mj interfaceC6968MjB9 = AbstractBinderC6935Lj.B9(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C7172Sj.CREATOR);
                C8972ob.c(parcel);
                y6(bVarA211, interfaceC6968MjB9, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case com.medallia.digital.mobilesdk.l3.f92486e /* 32 */:
                com.google.android.gms.dynamic.b bVarA212 = b.a.a2(parcel.readStrongBinder());
                Mc.Y1 y111 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 == null) {
                    c6767Gl7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6767Gl7 = iInterfaceQueryLocalInterface7 instanceof InterfaceC6835Il ? (InterfaceC6835Il) iInterfaceQueryLocalInterface7 : new C6767Gl(strongBinder7);
                }
                C8972ob.c(parcel);
                c5(bVarA212, y111, string15, c6767Gl7);
                parcel2.writeNoException();
                return true;
            case 33:
                C7005Nm c7005NmZzl = zzl();
                parcel2.writeNoException();
                C8972ob.e(parcel2, c7005NmZzl);
                return true;
            case 34:
                C7005Nm c7005NmZzm = zzm();
                parcel2.writeNoException();
                C8972ob.e(parcel2, c7005NmZzm);
                return true;
            case 35:
                com.google.android.gms.dynamic.b bVarA213 = b.a.a2(parcel.readStrongBinder());
                Mc.d2 d2Var3 = (Mc.d2) C8972ob.a(parcel, Mc.d2.CREATOR);
                Mc.Y1 y112 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    c6767Gl8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6767Gl8 = iInterfaceQueryLocalInterface8 instanceof InterfaceC6835Il ? (InterfaceC6835Il) iInterfaceQueryLocalInterface8 : new C6767Gl(strongBinder8);
                }
                C8972ob.c(parcel);
                d9(bVarA213, d2Var3, y112, string16, string17, c6767Gl8);
                parcel2.writeNoException();
                return true;
            case 36:
                InterfaceC6937Ll interfaceC6937LlZzj = zzj();
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC6937LlZzj);
                return true;
            case 37:
                com.google.android.gms.dynamic.b bVarA214 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                u9(bVarA214);
                parcel2.writeNoException();
                return true;
            case 38:
                com.google.android.gms.dynamic.b bVarA215 = b.a.a2(parcel.readStrongBinder());
                Mc.Y1 y113 = (Mc.Y1) C8972ob.a(parcel, Mc.Y1.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c6767Gl9 = iInterfaceQueryLocalInterface9 instanceof InterfaceC6835Il ? (InterfaceC6835Il) iInterfaceQueryLocalInterface9 : new C6767Gl(strongBinder9);
                }
                C8972ob.c(parcel);
                Z1(bVarA215, y113, string18, c6767Gl9);
                parcel2.writeNoException();
                return true;
            case 39:
                com.google.android.gms.dynamic.b bVarA216 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                K7(bVarA216);
                parcel2.writeNoException();
                return true;
        }
    }

    public AbstractBinderC6699El() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }
}
