package Fd;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes6.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f10390a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10391b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f10390a;
    }

    protected a(IBinder iBinder, String str) {
        this.f10390a = iBinder;
        this.f10391b = str;
    }
}
