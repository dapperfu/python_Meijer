package xu;

import V2.CreationExtras;
import android.content.Context;
import androidx.view.ComponentActivity;
import androidx.view.c0;
import androidx.view.f0;
import androidx.view.h0;
import qu.C16607a;
import ru.InterfaceC16834a;
import su.InterfaceC17045b;
import vu.InterfaceC17622b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xu.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18096b implements Au.b<InterfaceC17045b> {

    /* renamed from: a, reason: collision with root package name */
    private final h0 f169939a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f169940b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InterfaceC17045b f169941c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f169942d = new Object();

    /* renamed from: xu.b$a */
    class a implements f0.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f169943b;

        a(Context context) {
            this.f169943b = context;
        }

        @Override // androidx.lifecycle.f0.c
        public <T extends c0> T create(Class<T> cls, CreationExtras creationExtras) {
            h hVar = new h(creationExtras);
            return new c(((InterfaceC2734b) ru.d.a(this.f169943b, InterfaceC2734b.class)).w().a(hVar).build(), hVar);
        }
    }

    /* renamed from: xu.b$b, reason: collision with other inner class name */
    public interface InterfaceC2734b {
        InterfaceC17622b w();
    }

    /* renamed from: xu.b$c */
    static final class c extends c0 {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC17045b f169945a;

        /* renamed from: b, reason: collision with root package name */
        private final h f169946b;

        InterfaceC17045b m() {
            return this.f169945a;
        }

        h n() {
            return this.f169946b;
        }

        c(InterfaceC17045b interfaceC17045b, h hVar) {
            this.f169945a = interfaceC17045b;
            this.f169946b = hVar;
        }

        @Override // androidx.view.c0
        protected void onCleared() {
            super.onCleared();
            ((wu.f) ((d) C16607a.a(this.f169945a, d.class)).b()).a();
        }
    }

    /* renamed from: xu.b$d */
    public interface d {
        InterfaceC16834a b();
    }

    /* renamed from: xu.b$e */
    static abstract class e {
        static InterfaceC16834a a() {
            return new wu.f();
        }
    }

    private InterfaceC17045b a() {
        return ((c) d(this.f169939a, this.f169940b).a(c.class)).m();
    }

    private f0 d(h0 h0Var, Context context) {
        return new f0(h0Var, new a(context));
    }

    @Override // Au.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC17045b generatedComponent() {
        if (this.f169941c == null) {
            synchronized (this.f169942d) {
                try {
                    if (this.f169941c == null) {
                        this.f169941c = a();
                    }
                } finally {
                }
            }
        }
        return this.f169941c;
    }

    public h c() {
        return ((c) d(this.f169939a, this.f169940b).a(c.class)).n();
    }

    C18096b(ComponentActivity componentActivity) {
        this.f169939a = componentActivity;
        this.f169940b = componentActivity;
    }
}
