package c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6287a extends IInterface {

    /* renamed from: g3, reason: collision with root package name */
    public static final String f60862g3 = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: c.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC1196a extends Binder implements InterfaceC6287a {

        /* renamed from: c.a$a$a, reason: collision with other inner class name */
        private static class C1197a implements InterfaceC6287a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f60863a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f60863a;
            }

            C1197a(IBinder iBinder) {
                this.f60863a = iBinder;
            }

            @Override // c.InterfaceC6287a
            public void k9(String str, int i10, String str2, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC6287a.f60862g3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str2);
                    b.b(parcelObtain, notification, 0);
                    this.f60863a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static InterfaceC6287a A1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC6287a.f60862g3);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6287a)) ? new C1197a(iBinder) : (InterfaceC6287a) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: c.a$b */
    public static class b {
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

    void k9(String str, int i10, String str2, Notification notification) throws RemoteException;
}
