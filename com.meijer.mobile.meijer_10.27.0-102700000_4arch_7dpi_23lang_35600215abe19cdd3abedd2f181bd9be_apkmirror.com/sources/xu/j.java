package xu;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC6027p;
import androidx.view.InterfaceC6030s;
import qu.C16607a;
import uu.C17330a;
import vu.InterfaceC17625e;

/* loaded from: classes11.dex */
public final class j implements Au.b<Object> {

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f169958a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f169959b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final boolean f169960c;

    /* renamed from: d, reason: collision with root package name */
    private final View f169961d;

    public static final class a extends ContextWrapper {

        /* renamed from: a, reason: collision with root package name */
        private Fragment f169962a;

        /* renamed from: b, reason: collision with root package name */
        private LayoutInflater f169963b;

        /* renamed from: c, reason: collision with root package name */
        private LayoutInflater f169964c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC6027p f169965d;

        /* renamed from: xu.j$a$a, reason: collision with other inner class name */
        class C2735a implements InterfaceC6027p {
            C2735a() {
            }

            @Override // androidx.view.InterfaceC6027p
            public void onStateChanged(InterfaceC6030s interfaceC6030s, AbstractC6023l.a aVar) {
                if (aVar == AbstractC6023l.a.ON_DESTROY) {
                    a.this.f169962a = null;
                    a.this.f169963b = null;
                    a.this.f169964c = null;
                }
            }
        }

        a(Context context, Fragment fragment) {
            super((Context) Au.d.b(context));
            C2735a c2735a = new C2735a();
            this.f169965d = c2735a;
            this.f169963b = null;
            Fragment fragment2 = (Fragment) Au.d.b(fragment);
            this.f169962a = fragment2;
            fragment2.getLifecycle().a(c2735a);
        }

        Fragment d() {
            Au.d.c(this.f169962a, "The fragment has already been destroyed.");
            return this.f169962a;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.f169964c == null) {
                if (this.f169963b == null) {
                    this.f169963b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.f169964c = this.f169963b.cloneInContext(this);
            }
            return this.f169964c;
        }

        a(LayoutInflater layoutInflater, Fragment fragment) {
            super((Context) Au.d.b(((LayoutInflater) Au.d.b(layoutInflater)).getContext()));
            C2735a c2735a = new C2735a();
            this.f169965d = c2735a;
            this.f169963b = layoutInflater;
            Fragment fragment2 = (Fragment) Au.d.b(fragment);
            this.f169962a = fragment2;
            fragment2.getLifecycle().a(c2735a);
        }
    }

    public interface b {
        InterfaceC17625e Y();
    }

    public interface c {
        vu.g f();
    }

    private Object a() {
        Au.b<?> bVarB = b(false);
        return this.f169960c ? ((c) C16607a.a(bVarB, c.class)).f().view(this.f169961d).build() : ((b) C16607a.a(bVarB, b.class)).Y().view(this.f169961d).build();
    }

    private Au.b<?> b(boolean z10) {
        if (this.f169960c) {
            Context contextC = c(a.class, z10);
            if (contextC instanceof a) {
                return (Au.b) ((a) contextC).d();
            }
            if (z10) {
                return null;
            }
            Au.d.d(!(r5 instanceof Au.b), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.f169961d.getClass(), c(Au.b.class, z10).getClass().getName());
        } else {
            Object objC = c(Au.b.class, z10);
            if (objC instanceof Au.b) {
                return (Au.b) objC;
            }
            if (z10) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.f169961d.getClass()));
    }

    private Context c(Class<?> cls, boolean z10) {
        Context contextD = d(this.f169961d.getContext(), cls);
        if (contextD != C17330a.a(contextD.getApplicationContext())) {
            return contextD;
        }
        Au.d.d(z10, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.f169961d.getClass());
        return null;
    }

    private static Context d(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // Au.b
    public Object generatedComponent() {
        if (this.f169958a == null) {
            synchronized (this.f169959b) {
                try {
                    if (this.f169958a == null) {
                        this.f169958a = a();
                    }
                } finally {
                }
            }
        }
        return this.f169958a;
    }

    public j(View view, boolean z10) {
        this.f169961d = view;
        this.f169960c = z10;
    }
}
