package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.InterfaceC6125k;

/* renamed from: androidx.room.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6126l extends IInterface {

    /* renamed from: d3, reason: collision with root package name */
    public static final String f58581d3 = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    /* renamed from: androidx.room.l$a */
    public static abstract class a extends Binder implements InterfaceC6126l {

        /* renamed from: androidx.room.l$a$a, reason: collision with other inner class name */
        private static class C1146a implements InterfaceC6126l {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f58582a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f58582a;
            }

            C1146a(IBinder iBinder) {
                this.f58582a = iBinder;
            }

            @Override // androidx.room.InterfaceC6126l
            public void J4(int i10, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6126l.f58581d3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStringArray(strArr);
                    this.f58582a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC6126l
            public int g6(InterfaceC6125k interfaceC6125k, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6126l.f58581d3);
                    parcelObtain.writeStrongInterface(interfaceC6125k);
                    parcelObtain.writeString(str);
                    this.f58582a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC6126l
            public void p9(InterfaceC6125k interfaceC6125k, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6126l.f58581d3);
                    parcelObtain.writeStrongInterface(interfaceC6125k);
                    parcelObtain.writeInt(i10);
                    this.f58582a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static InterfaceC6126l A1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC6126l.f58581d3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6126l)) ? new C1146a(iBinder) : (InterfaceC6126l) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = InterfaceC6126l.f58581d3;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                int iG6 = g6(InterfaceC6125k.a.A1(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iG6);
            } else if (i10 == 2) {
                p9(InterfaceC6125k.a.A1(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                J4(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }

        public a() {
            attachInterface(this, InterfaceC6126l.f58581d3);
        }
    }

    void J4(int i10, String[] strArr) throws RemoteException;

    int g6(InterfaceC6125k interfaceC6125k, String str) throws RemoteException;

    void p9(InterfaceC6125k interfaceC6125k, int i10) throws RemoteException;
}
