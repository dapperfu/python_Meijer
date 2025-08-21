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
    private final Messenger f65550a;

    /* renamed from: b, reason: collision with root package name */
    private final hd.l f65551b;

    final void a(Message message) throws RemoteException {
        Messenger messenger = this.f65550a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        hd.l lVar = this.f65551b;
        if (lVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        lVar.b(message);
    }

    h(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f65550a = new Messenger(iBinder);
            this.f65551b = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f65551b = new hd.l(iBinder);
            this.f65550a = null;
        } else {
            FS.log_w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }
}
