package ff;

import android.os.Bundle;
import bf.InterfaceC6375a;
import java.util.Locale;
import of.InterfaceC16120b;

/* renamed from: ff.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C13984e implements InterfaceC6375a.b {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC16120b f131703a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC16120b f131704b;

    private static void b(InterfaceC16120b interfaceC16120b, String str, Bundle bundle) {
        if (interfaceC16120b == null) {
            return;
        }
        interfaceC16120b.N0(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f131703a : this.f131704b, str, bundle);
    }

    public void d(InterfaceC16120b interfaceC16120b) {
        this.f131704b = interfaceC16120b;
    }

    public void e(InterfaceC16120b interfaceC16120b) {
        this.f131703a = interfaceC16120b;
    }

    C13984e() {
    }

    @Override // bf.InterfaceC6375a.b
    public void a(int i10, Bundle bundle) {
        String string;
        nf.g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            c(string, bundle2);
        }
    }
}
