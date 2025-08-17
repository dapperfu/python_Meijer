package df;

import Ze.a;
import android.os.Bundle;
import java.util.Locale;
import mf.InterfaceC15610b;

/* renamed from: df.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C13511e implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC15610b f127374a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC15610b f127375b;

    private static void b(InterfaceC15610b interfaceC15610b, String str, Bundle bundle) {
        if (interfaceC15610b == null) {
            return;
        }
        interfaceC15610b.N0(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f127374a : this.f127375b, str, bundle);
    }

    public void d(InterfaceC15610b interfaceC15610b) {
        this.f127375b = interfaceC15610b;
    }

    public void e(InterfaceC15610b interfaceC15610b) {
        this.f127374a = interfaceC15610b;
    }

    C13511e() {
    }

    @Override // Ze.a.b
    public void a(int i10, Bundle bundle) {
        String string;
        lf.g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            c(string, bundle2);
        }
    }
}
