package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC13559a extends IInterface {

    /* renamed from: q3, reason: collision with root package name */
    public static final String f127613q3 = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: d.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1996a extends Binder implements InterfaceC13559a {

        /* renamed from: d.a$a$a, reason: collision with other inner class name */
        private static class C1997a implements InterfaceC13559a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f127614a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f127614a;
            }

            C1997a(IBinder iBinder) {
                this.f127614a = iBinder;
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static InterfaceC13559a K1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC13559a.f127613q3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC13559a)) ? new C1997a(iBinder) : (InterfaceC13559a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            String str = InterfaceC13559a.f127613q3;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            n5(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }

        public AbstractBinderC1996a() {
            attachInterface(this, InterfaceC13559a.f127613q3);
        }
    }

    void n5(int i10, Bundle bundle) throws RemoteException;

    /* renamed from: d.a$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }
}
