package su;

import androidx.fragment.app.Fragment;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import java.util.Map;
import mu.C15768a;
import ru.InterfaceC16945f;

/* renamed from: su.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17167a {

    /* renamed from: su.a$a, reason: collision with other inner class name */
    public interface InterfaceC2545a {
        c a();
    }

    /* renamed from: su.a$b */
    public interface b {
        c a();
    }

    /* renamed from: su.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, Boolean> f162149a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC16945f f162150b;

        private f0.c c(f0.c cVar) {
            return new su.c(this.f162149a, (f0.c) wu.d.b(cVar), this.f162150b);
        }

        c(Map<Class<?>, Boolean> map, InterfaceC16945f interfaceC16945f) {
            this.f162149a = map;
            this.f162150b = interfaceC16945f;
        }

        f0.c a(ComponentActivity componentActivity, f0.c cVar) {
            return c(cVar);
        }

        f0.c b(Fragment fragment, f0.c cVar) {
            return c(cVar);
        }
    }

    public static f0.c a(ComponentActivity componentActivity, f0.c cVar) {
        return ((InterfaceC2545a) C15768a.a(componentActivity, InterfaceC2545a.class)).a().a(componentActivity, cVar);
    }

    public static f0.c b(Fragment fragment, f0.c cVar) {
        return ((b) C15768a.a(fragment, b.class)).a().b(fragment, cVar);
    }
}
