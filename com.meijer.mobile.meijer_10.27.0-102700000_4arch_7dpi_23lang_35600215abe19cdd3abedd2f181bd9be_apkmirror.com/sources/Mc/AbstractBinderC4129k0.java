package Mc;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.AbstractBinderC6597Bl;
import com.google.android.gms.internal.ads.AbstractBinderC9095pj;
import com.google.android.gms.internal.ads.BinderC8865nb;
import com.google.android.gms.internal.ads.C8972ob;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;
import com.google.android.gms.internal.ads.InterfaceC6940Lo;
import com.google.android.gms.internal.ads.InterfaceC7703ch;
import com.google.android.gms.internal.ads.InterfaceC7719cp;
import com.google.android.gms.internal.ads.InterfaceC8237hh;
import com.google.android.gms.internal.ads.InterfaceC8361iq;
import com.google.android.gms.internal.ads.InterfaceC8675ln;
import com.google.android.gms.internal.ads.InterfaceC9202qj;
import com.google.android.gms.internal.ads.InterfaceC9415sj;
import com.google.android.gms.internal.ads.InterfaceC9530tn;

/* renamed from: Mc.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC4129k0 extends BinderC8865nb implements InterfaceC4132l0 {
    @Override // com.google.android.gms.internal.ads.BinderC8865nb
    protected final boolean A9(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                d2 d2Var = (d2) C8972ob.a(parcel, d2.CREATOR);
                String string = parcel.readString();
                InterfaceC6631Cl interfaceC6631ClB9 = AbstractBinderC6597Bl.B9(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                C8972ob.c(parcel);
                V vS4 = S4(bVarA2, d2Var, string, interfaceC6631ClB9, i12);
                parcel2.writeNoException();
                C8972ob.f(parcel2, vS4);
                return true;
            case 2:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                d2 d2Var2 = (d2) C8972ob.a(parcel, d2.CREATOR);
                String string2 = parcel.readString();
                InterfaceC6631Cl interfaceC6631ClB92 = AbstractBinderC6597Bl.B9(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                C8972ob.c(parcel);
                V vW3 = w3(bVarA22, d2Var2, string2, interfaceC6631ClB92, i13);
                parcel2.writeNoException();
                C8972ob.f(parcel2, vW3);
                return true;
            case 3:
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                String string3 = parcel.readString();
                InterfaceC6631Cl interfaceC6631ClB93 = AbstractBinderC6597Bl.B9(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                C8972ob.c(parcel);
                Q qF7 = F7(bVarA23, string3, interfaceC6631ClB93, i14);
                parcel2.writeNoException();
                C8972ob.f(parcel2, qF7);
                return true;
            case 4:
                b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                parcel2.writeNoException();
                C8972ob.f(parcel2, null);
                return true;
            case 5:
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                InterfaceC7703ch interfaceC7703chK2 = K2(bVarA24, bVarA25);
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC7703chK2);
                return true;
            case 6:
                com.google.android.gms.dynamic.b bVarA26 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6631Cl interfaceC6631ClB94 = AbstractBinderC6597Bl.B9(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                C8972ob.c(parcel);
                InterfaceC6940Lo interfaceC6940LoU6 = U6(bVarA26, interfaceC6631ClB94, i15);
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC6940LoU6);
                return true;
            case 7:
                b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                parcel2.writeNoException();
                C8972ob.f(parcel2, null);
                return true;
            case 8:
                com.google.android.gms.dynamic.b bVarA27 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                InterfaceC9530tn interfaceC9530tnY = y(bVarA27);
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC9530tnY);
                return true;
            case 9:
                com.google.android.gms.dynamic.b bVarA28 = b.a.a2(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                C8972ob.c(parcel);
                InterfaceC4161v0 interfaceC4161v0J4 = j4(bVarA28, i16);
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC4161v0J4);
                return true;
            case 10:
                com.google.android.gms.dynamic.b bVarA29 = b.a.a2(parcel.readStrongBinder());
                d2 d2Var3 = (d2) C8972ob.a(parcel, d2.CREATOR);
                String string4 = parcel.readString();
                int i17 = parcel.readInt();
                C8972ob.c(parcel);
                V vX3 = x3(bVarA29, d2Var3, string4, i17);
                parcel2.writeNoException();
                C8972ob.f(parcel2, vX3);
                return true;
            case 11:
                com.google.android.gms.dynamic.b bVarA210 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA211 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA212 = b.a.a2(parcel.readStrongBinder());
                C8972ob.c(parcel);
                InterfaceC8237hh interfaceC8237hhZzk = zzk(bVarA210, bVarA211, bVarA212);
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC8237hhZzk);
                return true;
            case 12:
                com.google.android.gms.dynamic.b bVarA213 = b.a.a2(parcel.readStrongBinder());
                String string5 = parcel.readString();
                InterfaceC6631Cl interfaceC6631ClB95 = AbstractBinderC6597Bl.B9(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                C8972ob.c(parcel);
                InterfaceC7719cp interfaceC7719cpD2 = D2(bVarA213, string5, interfaceC6631ClB95, i18);
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC7719cpD2);
                return true;
            case 13:
                com.google.android.gms.dynamic.b bVarA214 = b.a.a2(parcel.readStrongBinder());
                d2 d2Var4 = (d2) C8972ob.a(parcel, d2.CREATOR);
                String string6 = parcel.readString();
                InterfaceC6631Cl interfaceC6631ClB96 = AbstractBinderC6597Bl.B9(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                C8972ob.c(parcel);
                V vD4 = D4(bVarA214, d2Var4, string6, interfaceC6631ClB96, i19);
                parcel2.writeNoException();
                C8972ob.f(parcel2, vD4);
                return true;
            case 14:
                com.google.android.gms.dynamic.b bVarA215 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6631Cl interfaceC6631ClB97 = AbstractBinderC6597Bl.B9(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                C8972ob.c(parcel);
                InterfaceC8361iq interfaceC8361iqL5 = L5(bVarA215, interfaceC6631ClB97, i20);
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC8361iqL5);
                return true;
            case 15:
                com.google.android.gms.dynamic.b bVarA216 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6631Cl interfaceC6631ClB98 = AbstractBinderC6597Bl.B9(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                C8972ob.c(parcel);
                InterfaceC8675ln interfaceC8675lnK8 = k8(bVarA216, interfaceC6631ClB98, i21);
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC8675lnK8);
                return true;
            case 16:
                com.google.android.gms.dynamic.b bVarA217 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6631Cl interfaceC6631ClB99 = AbstractBinderC6597Bl.B9(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                InterfaceC9202qj interfaceC9202qjB9 = AbstractBinderC9095pj.B9(parcel.readStrongBinder());
                C8972ob.c(parcel);
                InterfaceC9415sj interfaceC9415sjQ3 = Q3(bVarA217, interfaceC6631ClB99, i22, interfaceC9202qjB9);
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC9415sjQ3);
                return true;
            case 17:
                com.google.android.gms.dynamic.b bVarA218 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6631Cl interfaceC6631ClB910 = AbstractBinderC6597Bl.B9(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                C8972ob.c(parcel);
                Q0 q0J1 = J1(bVarA218, interfaceC6631ClB910, i23);
                parcel2.writeNoException();
                C8972ob.f(parcel2, q0J1);
                return true;
            case 18:
                com.google.android.gms.dynamic.b bVarA219 = b.a.a2(parcel.readStrongBinder());
                InterfaceC6631Cl interfaceC6631ClB911 = AbstractBinderC6597Bl.B9(parcel.readStrongBinder());
                int i24 = parcel.readInt();
                C8972ob.c(parcel);
                InterfaceC4111e0 interfaceC4111e0P2 = P2(bVarA219, interfaceC6631ClB911, i24);
                parcel2.writeNoException();
                C8972ob.f(parcel2, interfaceC4111e0P2);
                return true;
            default:
                return false;
        }
    }

    public AbstractBinderC4129k0() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }
}
