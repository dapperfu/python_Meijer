package wu;

import androidx.fragment.app.Fragment;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import java.util.Map;
import qu.C16607a;
import vu.InterfaceC17626f;

/* renamed from: wu.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17864a {

    /* renamed from: wu.a$a, reason: collision with other inner class name */
    public interface InterfaceC2648a {
        c a();
    }

    /* renamed from: wu.a$b */
    public interface b {
        c a();
    }

    /* renamed from: wu.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, Boolean> f166571a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC17626f f166572b;

        private f0.c c(f0.c cVar) {
            return new wu.c(this.f166571a, (f0.c) Au.d.b(cVar), this.f166572b);
        }

        c(Map<Class<?>, Boolean> map, InterfaceC17626f interfaceC17626f) {
            this.f166571a = map;
            this.f166572b = interfaceC17626f;
        }

        f0.c a(ComponentActivity componentActivity, f0.c cVar) {
            return c(cVar);
        }

        f0.c b(Fragment fragment, f0.c cVar) {
            return c(cVar);
        }
    }

    public static f0.c a(ComponentActivity componentActivity, f0.c cVar) {
        return ((InterfaceC2648a) C16607a.a(componentActivity, InterfaceC2648a.class)).a().a(componentActivity, cVar);
    }

    public static f0.c b(Fragment fragment, f0.c cVar) {
        return ((b) C16607a.a(fragment, b.class)).a().b(fragment, cVar);
    }
}
