package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

/* loaded from: classes4.dex */
public abstract class zzln extends zzlh implements zzlo {
    @Override // com.google.ads.interactivemedia.v3.internal.zzlh
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzli.zzb(parcel);
                zzn(string, string2);
                parcel2.writeNoException();
                return true;
            case 3:
                com.google.android.gms.dynamic.b bVarA2 = b.a.a2(parcel.readStrongBinder());
                zzli.zzb(parcel);
                boolean zZzp = zzp(bVarA2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 4:
                com.google.android.gms.dynamic.b bVarA22 = b.a.a2(parcel.readStrongBinder());
                zzli.zzb(parcel);
                boolean zZzq = zzq(bVarA22);
                parcel2.writeNoException();
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 5:
                String string3 = parcel.readString();
                zzli.zzb(parcel);
                zzo(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.dynamic.b bVarA23 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA24 = b.a.a2(parcel.readStrongBinder());
                zzli.zzb(parcel);
                com.google.android.gms.dynamic.b bVarZzd = zzd(bVarA23, bVarA24);
                parcel2.writeNoException();
                zzli.zzd(parcel2, bVarZzd);
                return true;
            case 7:
                com.google.android.gms.dynamic.b bVarA25 = b.a.a2(parcel.readStrongBinder());
                zzli.zzb(parcel);
                String strZzf = zzf(bVarA25);
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 8:
                com.google.android.gms.dynamic.b bVarA26 = b.a.a2(parcel.readStrongBinder());
                String string4 = parcel.readString();
                zzli.zzb(parcel);
                String strZze = zze(bVarA26, string4);
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 9:
                com.google.android.gms.dynamic.b bVarA27 = b.a.a2(parcel.readStrongBinder());
                zzli.zzb(parcel);
                zzl(bVarA27);
                parcel2.writeNoException();
                return true;
            case 10:
                com.google.android.gms.dynamic.b bVarA28 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA29 = b.a.a2(parcel.readStrongBinder());
                zzli.zzb(parcel);
                com.google.android.gms.dynamic.b bVarZzc = zzc(bVarA28, bVarA29);
                parcel2.writeNoException();
                zzli.zzd(parcel2, bVarZzc);
                return true;
            case 11:
                parcel.readString();
                int i12 = zzli.zza;
                parcel.readInt();
                zzli.zzb(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 12:
                com.google.android.gms.dynamic.b bVarA210 = b.a.a2(parcel.readStrongBinder());
                byte[] bArrCreateByteArray = parcel.createByteArray();
                zzli.zzb(parcel);
                String strZzg = zzg(bVarA210, bArrCreateByteArray);
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 13:
                com.google.android.gms.dynamic.b bVarA211 = b.a.a2(parcel.readStrongBinder());
                zzli.zzb(parcel);
                String strZzi = zzi(bVarA211);
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 14:
                com.google.android.gms.dynamic.b bVarA212 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA213 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA214 = b.a.a2(parcel.readStrongBinder());
                zzli.zzb(parcel);
                String strZzk = zzk(bVarA212, bVarA213, bVarA214);
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 15:
                com.google.android.gms.dynamic.b bVarA215 = b.a.a2(parcel.readStrongBinder());
                zzli.zzb(parcel);
                zzm(bVarA215);
                parcel2.writeNoException();
                return true;
            case 16:
            default:
                return false;
            case 17:
                com.google.android.gms.dynamic.b bVarA216 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA217 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA218 = b.a.a2(parcel.readStrongBinder());
                com.google.android.gms.dynamic.b bVarA219 = b.a.a2(parcel.readStrongBinder());
                zzli.zzb(parcel);
                String strZzh = zzh(bVarA216, bVarA217, bVarA218, bVarA219);
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 18:
                boolean zZzr = zzr();
                parcel2.writeNoException();
                int i13 = zzli.zza;
                parcel2.writeInt(zZzr ? 1 : 0);
                return true;
            case 19:
                boolean zZzs = zzs();
                parcel2.writeNoException();
                int i14 = zzli.zza;
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 20:
                int iZzb = zzb();
                parcel2.writeNoException();
                parcel2.writeInt(iZzb);
                return true;
        }
    }

    public zzln() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }
}
