package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import b.InterfaceC6161b;

/* loaded from: classes.dex */
public abstract class e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private Context f47193a;

    class a extends c {
        a(InterfaceC6161b interfaceC6161b, ComponentName componentName, Context context) {
            super(interfaceC6161b, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, c cVar);

    void b(Context context) {
        this.f47193a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f47193a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(InterfaceC6161b.a.A1(iBinder), componentName, this.f47193a));
    }
}
