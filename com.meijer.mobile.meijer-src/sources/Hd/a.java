package Hd;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes6.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f13517a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13518b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f13517a;
    }

    protected a(IBinder iBinder, String str) {
        this.f13517a = iBinder;
        this.f13518b = str;
    }
}
