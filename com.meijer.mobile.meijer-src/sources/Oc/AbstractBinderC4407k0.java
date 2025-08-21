package Oc;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.AbstractBinderC6722Bl;
import com.google.android.gms.internal.ads.AbstractBinderC9220pj;
import com.google.android.gms.internal.ads.BinderC8990nb;
import com.google.android.gms.internal.ads.C9097ob;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;
import com.google.android.gms.internal.ads.InterfaceC7065Lo;
import com.google.android.gms.internal.ads.InterfaceC7828ch;
import com.google.android.gms.internal.ads.InterfaceC7844cp;
import com.google.android.gms.internal.ads.InterfaceC8362hh;
import com.google.android.gms.internal.ads.InterfaceC8486iq;
import com.google.android.gms.internal.ads.InterfaceC8800ln;
import com.google.android.gms.internal.ads.InterfaceC9327qj;
import com.google.android.gms.internal.ads.InterfaceC9540sj;
import com.google.android.gms.internal.ads.InterfaceC9655tn;

/* renamed from: Oc.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4407k0 extends BinderC8990nb implements InterfaceC4410l0 {
    @Override // com.google.android.gms.internal.ads.BinderC8990nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                d2 d2Var = (d2) C9097ob.a(parcel, d2.CREATOR);
                String string = parcel.readString();
                InterfaceC6756Cl interfaceC6756ClB9 = AbstractBinderC6722Bl.B9(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                C9097ob.c(parcel);
                V vT2 = T2(bVarA2, d2Var, string, interfaceC6756ClB9, i12);
                parcel2.writeNoException();
                C9097ob.f(parcel2, vT2);
                return true;
            case 2:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                d2 d2Var2 = (d2) C9097ob.a(parcel, d2.CREATOR);
                String string2 = parcel.readString();
                InterfaceC6756Cl interfaceC6756ClB92 = AbstractBinderC6722Bl.B9(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                C9097ob.c(parcel);
                V vO7 = O7(bVarA22, d2Var2, string2, interfaceC6756ClB92, i13);
                parcel2.writeNoException();
                C9097ob.f(parcel2, vO7);
                return true;
            case 3:
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                String string3 = parcel.readString();
                InterfaceC6756Cl interfaceC6756ClB93 = AbstractBinderC6722Bl.B9(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                C9097ob.c(parcel);
                Q qJ7 = J7(bVarA23, string3, interfaceC6756ClB93, i14);
                parcel2.writeNoException();
                C9097ob.f(parcel2, qJ7);
                return true;
            case 4:
                b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                parcel2.writeNoException();
                C9097ob.f(parcel2, null);
                return true;
            case 5:
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                InterfaceC7828ch interfaceC7828chP2 = P2(bVarA24, bVarA25);
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC7828chP2);
                return true;
            case 6:
                com.google.android.gms.dynamic.b bVarA26 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6756Cl interfaceC6756ClB94 = AbstractBinderC6722Bl.B9(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                C9097ob.c(parcel);
                InterfaceC7065Lo interfaceC7065LoF7 = f7(bVarA26, interfaceC6756ClB94, i15);
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC7065LoF7);
                return true;
            case 7:
                b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                parcel2.writeNoException();
                C9097ob.f(parcel2, null);
                return true;
            case 8:
                com.google.android.gms.dynamic.b bVarA27 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                InterfaceC9655tn interfaceC9655tnY = y(bVarA27);
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC9655tnY);
                return true;
            case 9:
                com.google.android.gms.dynamic.b bVarA28 = b.a.a2(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                C9097ob.c(parcel);
                InterfaceC4439v0 interfaceC4439v0X4 = x4(bVarA28, i16);
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC4439v0X4);
                return true;
            case 10:
                com.google.android.gms.dynamic.b bVarA29 = b.a.a2(parcel.readStrongBinder());
                d2 d2Var3 = (d2) C9097ob.a(parcel, d2.CREATOR);
                String string4 = parcel.readString();
                int i17 = parcel.readInt();
                C9097ob.c(parcel);
                V vB4 = B4(bVarA29, d2Var3, string4, i17);
                parcel2.writeNoException();
                C9097ob.f(parcel2, vB4);
                return true;
            case 11:
                com.google.android.gms.dynamic.b bVarA210 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA211 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA212 = b.a.a2(parcel.readStrongBinder());
                C9097ob.c(parcel);
                InterfaceC8362hh interfaceC8362hhZzk = zzk(bVarA210, bVarA211, bVarA212);
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC8362hhZzk);
                return true;
            case 12:
                com.google.android.gms.dynamic.b bVarA213 = b.a.a2(parcel.readStrongBinder());
                String string5 = parcel.readString();
                InterfaceC6756Cl interfaceC6756ClB95 = AbstractBinderC6722Bl.B9(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                C9097ob.c(parcel);
                InterfaceC7844cp interfaceC7844cpG2 = G2(bVarA213, string5, interfaceC6756ClB95, i18);
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC7844cpG2);
                return true;
            case 13:
                com.google.android.gms.dynamic.b bVarA214 = b.a.a2(parcel.readStrongBinder());
                d2 d2Var4 = (d2) C9097ob.a(parcel, d2.CREATOR);
                String string6 = parcel.readString();
                InterfaceC6756Cl interfaceC6756ClB96 = AbstractBinderC6722Bl.B9(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                C9097ob.c(parcel);
                V vR2 = r2(bVarA214, d2Var4, string6, interfaceC6756ClB96, i19);
                parcel2.writeNoException();
                C9097ob.f(parcel2, vR2);
                return true;
            case 14:
                com.google.android.gms.dynamic.b bVarA215 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6756Cl interfaceC6756ClB97 = AbstractBinderC6722Bl.B9(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                C9097ob.c(parcel);
                InterfaceC8486iq interfaceC8486iqU5 = U5(bVarA215, interfaceC6756ClB97, i20);
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC8486iqU5);
                return true;
            case 15:
                com.google.android.gms.dynamic.b bVarA216 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6756Cl interfaceC6756ClB98 = AbstractBinderC6722Bl.B9(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                C9097ob.c(parcel);
                InterfaceC8800ln interfaceC8800lnH8 = h8(bVarA216, interfaceC6756ClB98, i21);
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC8800lnH8);
                return true;
            case 16:
                com.google.android.gms.dynamic.b bVarA217 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6756Cl interfaceC6756ClB99 = AbstractBinderC6722Bl.B9(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                InterfaceC9327qj interfaceC9327qjB9 = AbstractBinderC9220pj.B9(parcel.readStrongBinder());
                C9097ob.c(parcel);
                InterfaceC9540sj interfaceC9540sjC4 = c4(bVarA217, interfaceC6756ClB99, i22, interfaceC9327qjB9);
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC9540sjC4);
                return true;
            case 17:
                com.google.android.gms.dynamic.b bVarA218 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6756Cl interfaceC6756ClB910 = AbstractBinderC6722Bl.B9(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                C9097ob.c(parcel);
                Q0 q0Q1 = Q1(bVarA218, interfaceC6756ClB910, i23);
                parcel2.writeNoException();
                C9097ob.f(parcel2, q0Q1);
                return true;
            case 18:
                com.google.android.gms.dynamic.b bVarA219 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6756Cl interfaceC6756ClB911 = AbstractBinderC6722Bl.B9(parcel.readStrongBinder());
                int i24 = parcel.readInt();
                C9097ob.c(parcel);
                InterfaceC4389e0 interfaceC4389e0W2 = W2(bVarA219, interfaceC6756ClB911, i24);
                parcel2.writeNoException();
                C9097ob.f(parcel2, interfaceC4389e0W2);
                return true;
            default:
                return false;
        }
    }

    public AbstractBinderC4407k0() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }
}
