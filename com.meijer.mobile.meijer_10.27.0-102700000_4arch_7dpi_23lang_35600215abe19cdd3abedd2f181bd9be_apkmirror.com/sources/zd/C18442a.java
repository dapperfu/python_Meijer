package zd;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: zd.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C18442a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f171796a;

    /* renamed from: b, reason: collision with root package name */
    private final String f171797b;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f171796a;
    }

    protected C18442a(IBinder iBinder, String str) {
        this.f171796a = iBinder;
        this.f171797b = str;
    }
}
