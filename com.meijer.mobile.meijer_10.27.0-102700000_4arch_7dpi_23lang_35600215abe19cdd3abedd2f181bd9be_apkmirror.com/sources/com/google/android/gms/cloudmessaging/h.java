package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.fullstory.FS;
import java.util.Objects;

/* loaded from: classes4.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Messenger f64710a;

    /* renamed from: b, reason: collision with root package name */
    private final fd.l f64711b;

    final void a(Message message) throws RemoteException {
        Messenger messenger = this.f64710a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        fd.l lVar = this.f64711b;
        if (lVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        lVar.b(message);
    }

    h(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f64710a = new Messenger(iBinder);
            this.f64711b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f64711b = new fd.l(iBinder);
            this.f64710a = null;
        } else {
            FS.log_w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }
}
