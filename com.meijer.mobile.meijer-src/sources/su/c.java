package su;

import V2.CreationExtras;
import android.app.Activity;
import androidx.view.C6141O;
import androidx.view.c0;
import androidx.view.f0;
import gv.InterfaceC14411a;
import java.io.Closeable;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import mu.C15768a;
import ou.InterfaceC16324f;
import ru.InterfaceC16945f;

/* loaded from: classes4.dex */
public final class c implements f0.c {

    /* renamed from: e, reason: collision with root package name */
    public static final CreationExtras.c<Function1<Object, c0>> f162151e = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f162152b;

    /* renamed from: c, reason: collision with root package name */
    private final f0.c f162153c;

    /* renamed from: d, reason: collision with root package name */
    private final f0.c f162154d;

    class b implements f0.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC16945f f162155b;

        b(InterfaceC16945f interfaceC16945f) {
            this.f162155b = interfaceC16945f;
        }

        private <T extends c0> T a(InterfaceC16324f interfaceC16324f, Class<T> cls, CreationExtras creationExtras) {
            InterfaceC14411a<c0> interfaceC14411a = ((d) C15768a.a(interfaceC16324f, d.class)).a().get(cls);
            Function1 function1 = (Function1) creationExtras.a(c.f162151e);
            Object obj = ((d) C15768a.a(interfaceC16324f, d.class)).b().get(cls);
            if (obj == null) {
                if (function1 != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (interfaceC14411a != null) {
                    return (T) interfaceC14411a.get();
                }
                throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            if (interfaceC14411a != null) {
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
            T t10 = (T) a(this.f162155b.a(C6141O.a(creationExtras)).b(fVar).build(), cls, creationExtras);
            t10.addCloseable(new Closeable() { // from class: su.d
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    fVar.a();
                }
            });
            return t10;
        }
    }

    /* renamed from: su.c$c, reason: collision with other inner class name */
    interface InterfaceC2546c {
        InterfaceC16945f i1();

        Map<Class<?>, Boolean> y();
    }

    public interface d {
        Map<Class<?>, InterfaceC14411a<c0>> a();

        Map<Class<?>, Object> b();
    }

    @Override // androidx.lifecycle.f0.c
    public <T extends c0> T create(Class<T> cls, CreationExtras creationExtras) {
        return this.f162152b.containsKey(cls) ? (T) this.f162154d.create(cls, creationExtras) : (T) this.f162153c.create(cls, creationExtras);
    }

    class a implements CreationExtras.c<Function1<Object, c0>> {
        a() {
        }
    }

    public static f0.c a(Activity activity, f0.c cVar) {
        InterfaceC2546c interfaceC2546c = (InterfaceC2546c) C15768a.a(activity, InterfaceC2546c.class);
        return new c(interfaceC2546c.y(), cVar, interfaceC2546c.i1());
    }

    public c(Map<Class<?>, Boolean> map, f0.c cVar, InterfaceC16945f interfaceC16945f) {
        this.f162152b = map;
        this.f162153c = cVar;
        this.f162154d = new b(interfaceC16945f);
    }

    @Override // androidx.lifecycle.f0.c
    public <T extends c0> T create(Class<T> cls) {
        if (this.f162152b.containsKey(cls)) {
            return (T) this.f162154d.create(cls);
        }
        return (T) this.f162153c.create(cls);
    }
}
