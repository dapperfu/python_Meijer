package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6161b extends IInterface {

    /* renamed from: f3, reason: collision with root package name */
    public static final String f59511f3 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* renamed from: b.b$a */
    public static abstract class a extends Binder implements InterfaceC6161b {

        /* renamed from: b.b$a$a, reason: collision with other inner class name */
        private static class C1169a implements InterfaceC6161b {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f59512a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f59512a;
            }

            C1169a(IBinder iBinder) {
                this.f59512a = iBinder;
            }

            @Override // b.InterfaceC6161b
            public boolean C7(InterfaceC6160a interfaceC6160a, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6161b.f59511f3);
                    parcelObtain.writeStrongInterface(interfaceC6160a);
                    boolean z10 = false;
                    C1170b.b(parcelObtain, uri, 0);
                    this.f59512a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC6161b
            public boolean V3(InterfaceC6160a interfaceC6160a, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6161b.f59511f3);
                    parcelObtain.writeStrongInterface(interfaceC6160a);
                    boolean z10 = false;
                    C1170b.b(parcelObtain, bundle, 0);
                    this.f59512a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC6161b
            public boolean X6(long j10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6161b.f59511f3);
                    parcelObtain.writeLong(j10);
                    boolean z10 = false;
                    this.f59512a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC6161b
            public boolean e1(InterfaceC6160a interfaceC6160a, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6161b.f59511f3);
                    parcelObtain.writeStrongInterface(interfaceC6160a);
                    boolean z10 = false;
                    C1170b.b(parcelObtain, uri, 0);
                    C1170b.b(parcelObtain, bundle, 0);
                    this.f59512a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC6161b
            public int o1(InterfaceC6160a interfaceC6160a, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6161b.f59511f3);
                    parcelObtain.writeStrongInterface(interfaceC6160a);
                    parcelObtain.writeString(str);
                    C1170b.b(parcelObtain, bundle, 0);
                    this.f59512a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC6161b
            public boolean p7(InterfaceC6160a interfaceC6160a) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6161b.f59511f3);
                    parcelObtain.writeStrongInterface(interfaceC6160a);
                    boolean z10 = false;
                    this.f59512a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    if (parcelObtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static InterfaceC6161b A1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC6161b.f59511f3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6161b)) ? new C1169a(iBinder) : (InterfaceC6161b) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: b.b$b, reason: collision with other inner class name */
    public static class C1170b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    boolean C7(InterfaceC6160a interfaceC6160a, Uri uri) throws RemoteException;

    boolean V3(InterfaceC6160a interfaceC6160a, Bundle bundle) throws RemoteException;

    boolean X6(long j10) throws RemoteException;

    boolean e1(InterfaceC6160a interfaceC6160a, Uri uri, Bundle bundle) throws RemoteException;

    int o1(InterfaceC6160a interfaceC6160a, String str, Bundle bundle) throws RemoteException;

    boolean p7(InterfaceC6160a interfaceC6160a) throws RemoteException;
}
