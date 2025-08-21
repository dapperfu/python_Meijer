package Bd;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes6.dex */
public class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f2710a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2711b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f2710a;
    }

    protected a(IBinder iBinder, String str) {
        this.f2710a = iBinder;
        this.f2711b = str;
    }
}
