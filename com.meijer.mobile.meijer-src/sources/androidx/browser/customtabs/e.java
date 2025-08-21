package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import b.InterfaceC6300b;

/* loaded from: classes.dex */
public abstract class e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private Context f47417a;

    class a extends c {
        a(InterfaceC6300b interfaceC6300b, ComponentName componentName, Context context) {
            super(interfaceC6300b, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, c cVar);

    void b(Context context) {
        this.f47417a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f47417a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(InterfaceC6300b.a.K1(iBinder), componentName, this.f47417a));
    }
}
