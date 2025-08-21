package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.InterfaceC6267k;

/* renamed from: androidx.room.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6268l extends IInterface {

    /* renamed from: d3, reason: collision with root package name */
    public static final String f58805d3 = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    /* renamed from: androidx.room.l$a */
    public static abstract class a extends Binder implements InterfaceC6268l {

        /* renamed from: androidx.room.l$a$a, reason: collision with other inner class name */
        private static class C1159a implements InterfaceC6268l {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f58806a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f58806a;
            }

            C1159a(IBinder iBinder) {
                this.f58806a = iBinder;
            }

            @Override // androidx.room.InterfaceC6268l
            public void U4(int i10, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6268l.f58805d3);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStringArray(strArr);
                    this.f58806a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC6268l
            public void p9(InterfaceC6267k interfaceC6267k, int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6268l.f58805d3);
                    parcelObtain.writeStrongInterface(interfaceC6267k);
                    parcelObtain.writeInt(i10);
                    this.f58806a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC6268l
            public int u6(InterfaceC6267k interfaceC6267k, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6268l.f58805d3);
                    parcelObtain.writeStrongInterface(interfaceC6267k);
                    parcelObtain.writeString(str);
                    this.f58806a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
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

        public static InterfaceC6268l K1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC6268l.f58805d3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6268l)) ? new C1159a(iBinder) : (InterfaceC6268l) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = InterfaceC6268l.f58805d3;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                int iU6 = u6(InterfaceC6267k.a.K1(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iU6);
            } else if (i10 == 2) {
                p9(InterfaceC6267k.a.K1(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                U4(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }

        public a() {
            attachInterface(this, InterfaceC6268l.f58805d3);
        }
    }

    void U4(int i10, String[] strArr) throws RemoteException;

    void p9(InterfaceC6267k interfaceC6267k, int i10) throws RemoteException;

    int u6(InterfaceC6267k interfaceC6267k, String str) throws RemoteException;
}
