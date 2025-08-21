package tu;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6169p;
import androidx.view.InterfaceC6172s;
import mu.C15768a;
import qu.C16766a;
import ru.InterfaceC16944e;
import wu.InterfaceC17927b;

/* loaded from: classes4.dex */
public final class j implements InterfaceC17927b<Object> {

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f163426a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f163427b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final boolean f163428c;

    /* renamed from: d, reason: collision with root package name */
    private final View f163429d;

    public static final class a extends ContextWrapper {

        /* renamed from: a, reason: collision with root package name */
        private Fragment f163430a;

        /* renamed from: b, reason: collision with root package name */
        private LayoutInflater f163431b;

        /* renamed from: c, reason: collision with root package name */
        private LayoutInflater f163432c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC6169p f163433d;

        /* renamed from: tu.j$a$a, reason: collision with other inner class name */
        class C2579a implements InterfaceC6169p {
            C2579a() {
            }

            @Override // androidx.view.InterfaceC6169p
            public void onStateChanged(InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar) {
                if (aVar == AbstractC6165l.a.ON_DESTROY) {
                    a.this.f163430a = null;
                    a.this.f163431b = null;
                    a.this.f163432c = null;
                }
            }
        }

        a(Context context, Fragment fragment) {
            super((Context) wu.d.b(context));
            C2579a c2579a = new C2579a();
            this.f163433d = c2579a;
            this.f163431b = null;
            Fragment fragment2 = (Fragment) wu.d.b(fragment);
            this.f163430a = fragment2;
            fragment2.getLifecycle().a(c2579a);
        }

        Fragment d() {
            wu.d.c(this.f163430a, "The fragment has already been destroyed.");
            return this.f163430a;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.f163432c == null) {
                if (this.f163431b == null) {
                    this.f163431b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.f163432c = this.f163431b.cloneInContext(this);
            }
            return this.f163432c;
        }

        a(LayoutInflater layoutInflater, Fragment fragment) {
            super((Context) wu.d.b(((LayoutInflater) wu.d.b(layoutInflater)).getContext()));
            C2579a c2579a = new C2579a();
            this.f163433d = c2579a;
            this.f163431b = layoutInflater;
            Fragment fragment2 = (Fragment) wu.d.b(fragment);
            this.f163430a = fragment2;
            fragment2.getLifecycle().a(c2579a);
        }
    }

    public interface b {
        InterfaceC16944e Y();
    }

    public interface c {
        ru.g f();
    }

    private Object a() {
        InterfaceC17927b<?> interfaceC17927bB = b(false);
        return this.f163428c ? ((c) C15768a.a(interfaceC17927bB, c.class)).f().view(this.f163429d).build() : ((b) C15768a.a(interfaceC17927bB, b.class)).Y().view(this.f163429d).build();
    }

    private InterfaceC17927b<?> b(boolean z10) {
        if (this.f163428c) {
            Context contextC = c(a.class, z10);
            if (contextC instanceof a) {
                return (InterfaceC17927b) ((a) contextC).d();
            }
            if (z10) {
                return null;
            }
            wu.d.d(!(r5 instanceof InterfaceC17927b), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.f163429d.getClass(), c(InterfaceC17927b.class, z10).getClass().getName());
        } else {
            Object objC = c(InterfaceC17927b.class, z10);
            if (objC instanceof InterfaceC17927b) {
                return (InterfaceC17927b) objC;
            }
            if (z10) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.f163429d.getClass()));
    }

    private Context c(Class<?> cls, boolean z10) {
        Context contextD = d(this.f163429d.getContext(), cls);
        if (contextD != C16766a.a(contextD.getApplicationContext())) {
            return contextD;
        }
        wu.d.d(z10, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.f163429d.getClass());
        return null;
    }

    private static Context d(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // wu.InterfaceC17927b
    public Object generatedComponent() {
        if (this.f163426a == null) {
            synchronized (this.f163427b) {
                try {
                    if (this.f163426a == null) {
                        this.f163426a = a();
                    }
                } finally {
                }
            }
        }
        return this.f163426a;
    }

    public j(View view, boolean z10) {
        this.f163429d = view;
        this.f163428c = z10;
    }
}
