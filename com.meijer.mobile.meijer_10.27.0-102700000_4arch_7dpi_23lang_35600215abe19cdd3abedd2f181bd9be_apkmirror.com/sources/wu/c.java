package wu;

import V2.CreationExtras;
import android.app.Activity;
import androidx.view.C5999O;
import androidx.view.c0;
import androidx.view.f0;
import java.io.Closeable;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kv.InterfaceC15323a;
import qu.C16607a;
import su.InterfaceC17049f;
import vu.InterfaceC17626f;

/* loaded from: classes11.dex */
public final class c implements f0.c {

    /* renamed from: e, reason: collision with root package name */
    public static final CreationExtras.c<Function1<Object, c0>> f166573e = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f166574b;

    /* renamed from: c, reason: collision with root package name */
    private final f0.c f166575c;

    /* renamed from: d, reason: collision with root package name */
    private final f0.c f166576d;

    class b implements f0.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC17626f f166577b;

        b(InterfaceC17626f interfaceC17626f) {
            this.f166577b = interfaceC17626f;
        }

        private <T extends c0> T a(InterfaceC17049f interfaceC17049f, Class<T> cls, CreationExtras creationExtras) {
            InterfaceC15323a<c0> interfaceC15323a = ((d) C16607a.a(interfaceC17049f, d.class)).a().get(cls);
            Function1 function1 = (Function1) creationExtras.a(c.f166573e);
            Object obj = ((d) C16607a.a(interfaceC17049f, d.class)).b().get(cls);
            if (obj == null) {
                if (function1 != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (interfaceC15323a != null) {
                    return (T) interfaceC15323a.get();
                }
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            if (interfaceC15323a != null) {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if (function1 != null) {
                return (T) function1.invoke(obj);
            }
            throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
        }

        @Override // androidx.lifecycle.f0.c
        public <T extends c0> T create(Class<T> cls, CreationExtras creationExtras) {
            final f fVar = new f();
            T t10 = (T) a(this.f166577b.a(C5999O.a(creationExtras)).b(fVar).build(), cls, creationExtras);
            t10.addCloseable(new Closeable() { // from class: wu.d
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    fVar.a();
                }
            });
            return t10;
        }
    }

    /* renamed from: wu.c$c, reason: collision with other inner class name */
    interface InterfaceC2649c {
        InterfaceC17626f i1();

        Map<Class<?>, Boolean> y();
    }

    public interface d {
        Map<Class<?>, InterfaceC15323a<c0>> a();

        Map<Class<?>, Object> b();
    }

    @Override // androidx.lifecycle.f0.c
    public <T extends c0> T create(Class<T> cls, CreationExtras creationExtras) {
        return this.f166574b.containsKey(cls) ? (T) this.f166576d.create(cls, creationExtras) : (T) this.f166575c.create(cls, creationExtras);
    }

    class a implements CreationExtras.c<Function1<Object, c0>> {
        a() {
        }
    }

    public static f0.c a(Activity activity, f0.c cVar) {
        InterfaceC2649c interfaceC2649c = (InterfaceC2649c) C16607a.a(activity, InterfaceC2649c.class);
        return new c(interfaceC2649c.y(), cVar, interfaceC2649c.i1());
    }

    public c(Map<Class<?>, Boolean> map, f0.c cVar, InterfaceC17626f interfaceC17626f) {
        this.f166574b = map;
        this.f166575c = cVar;
        this.f166576d = new b(interfaceC17626f);
    }

    @Override // androidx.lifecycle.f0.c
    public <T extends c0> T create(Class<T> cls) {
        if (this.f166574b.containsKey(cls)) {
            return (T) this.f166576d.create(cls);
        }
        return (T) this.f166575c.create(cls);
    }
}
