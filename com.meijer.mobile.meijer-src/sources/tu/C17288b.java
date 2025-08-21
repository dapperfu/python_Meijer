package tu;

import V2.CreationExtras;
import android.content.Context;
import androidx.view.ComponentActivity;
import androidx.view.c0;
import androidx.view.f0;
import androidx.view.h0;
import mu.C15768a;
import nu.InterfaceC16022a;
import ou.InterfaceC16320b;
import ru.InterfaceC16941b;
import wu.InterfaceC17927b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: tu.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17288b implements InterfaceC17927b<InterfaceC16320b> {

    /* renamed from: a, reason: collision with root package name */
    private final h0 f163407a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f163408b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InterfaceC16320b f163409c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f163410d = new Object();

    /* renamed from: tu.b$a */
    class a implements f0.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f163411b;

        a(Context context) {
            this.f163411b = context;
        }

        @Override // androidx.lifecycle.f0.c
        public <T extends c0> T create(Class<T> cls, CreationExtras creationExtras) {
            h hVar = new h(creationExtras);
            return new c(((InterfaceC2578b) nu.d.a(this.f163411b, InterfaceC2578b.class)).w().a(hVar).build(), hVar);
        }
    }

    /* renamed from: tu.b$b, reason: collision with other inner class name */
    public interface InterfaceC2578b {
        InterfaceC16941b w();
    }

    /* renamed from: tu.b$c */
    static final class c extends c0 {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC16320b f163413a;

        /* renamed from: b, reason: collision with root package name */
        private final h f163414b;

        InterfaceC16320b m() {
            return this.f163413a;
        }

        h n() {
            return this.f163414b;
        }

        c(InterfaceC16320b interfaceC16320b, h hVar) {
            this.f163413a = interfaceC16320b;
            this.f163414b = hVar;
        }

        @Override // androidx.view.c0
        protected void onCleared() {
            super.onCleared();
            ((su.f) ((d) C15768a.a(this.f163413a, d.class)).b()).a();
        }
    }

    /* renamed from: tu.b$d */
    public interface d {
        InterfaceC16022a b();
    }

    /* renamed from: tu.b$e */
    static abstract class e {
        static InterfaceC16022a a() {
            return new su.f();
        }
    }

    private InterfaceC16320b a() {
        return ((c) d(this.f163407a, this.f163408b).a(c.class)).m();
    }

    private f0 d(h0 h0Var, Context context) {
        return new f0(h0Var, new a(context));
    }

    @Override // wu.InterfaceC17927b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC16320b generatedComponent() {
        if (this.f163409c == null) {
            synchronized (this.f163410d) {
                try {
                    if (this.f163409c == null) {
                        this.f163409c = a();
                    }
                } finally {
                }
            }
        }
        return this.f163409c;
    }

    public h c() {
        return ((c) d(this.f163407a, this.f163408b).a(c.class)).n();
    }

    C17288b(ComponentActivity componentActivity) {
        this.f163407a = componentActivity;
        this.f163408b = componentActivity;
    }
}
