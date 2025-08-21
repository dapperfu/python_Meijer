package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        private static class C0965a implements b {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f45813a;

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f45813a;
            }

            C0965a(IBinder iBinder) {
                this.f45813a = iBinder;
            }

            @Override // android.support.v4.media.session.b
            public void z5(android.support.v4.media.session.a aVar) throws RemoteException {
                IBinder iBinderAsBinder;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (aVar != null) {
                        iBinderAsBinder = aVar.asBinder();
                    } else {
                        iBinderAsBinder = null;
                    }
                    parcelObtain.writeStrongBinder(iBinderAsBinder);
                    this.f45813a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }
        }

        public static b K1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0965a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    void z5(android.support.v4.media.session.a aVar) throws RemoteException;
}
