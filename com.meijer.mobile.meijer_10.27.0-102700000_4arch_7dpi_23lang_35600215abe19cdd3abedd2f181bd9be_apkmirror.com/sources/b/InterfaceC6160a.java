package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6160a extends IInterface {

    /* renamed from: e3, reason: collision with root package name */
    public static final String f59510e3 = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* renamed from: b.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1167a extends Binder implements InterfaceC6160a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = InterfaceC6160a.f59510e3;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    t8(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    P3(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    h9((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    W8(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    l9(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleG2 = g2(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, bundleG2, 1);
                    return true;
                case 8:
                    J7(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    Y3((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    z1(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    f7((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    s7((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        public AbstractBinderC1167a() {
            attachInterface(this, InterfaceC6160a.f59510e3);
        }
    }

    /* renamed from: b.a$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void J7(int i10, int i11, Bundle bundle) throws RemoteException;

    void P3(String str, Bundle bundle) throws RemoteException;

    void W8(String str, Bundle bundle) throws RemoteException;

    void Y3(Bundle bundle) throws RemoteException;

    void f7(Bundle bundle) throws RemoteException;

    Bundle g2(String str, Bundle bundle) throws RemoteException;

    void h9(Bundle bundle) throws RemoteException;

    void l9(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException;

    void s7(Bundle bundle) throws RemoteException;

    void t8(int i10, Bundle bundle) throws RemoteException;

    void z1(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws RemoteException;
}
