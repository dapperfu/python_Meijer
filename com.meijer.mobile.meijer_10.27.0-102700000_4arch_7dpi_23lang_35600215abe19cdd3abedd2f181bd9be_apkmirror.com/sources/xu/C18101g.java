package xu;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import qu.C16607a;
import vu.InterfaceC17623c;
import xu.j;

/* renamed from: xu.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C18101g implements Au.b<Object> {

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f169950a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f169951b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Fragment f169952c;

    /* renamed from: xu.g$a */
    public interface a {
        InterfaceC17623c j1();
    }

    protected void e(Fragment fragment) {
    }

    private Object a() {
        Au.d.c(this.f169952c.getHost(), "Hilt Fragments must be attached before creating the component.");
        Au.d.d(this.f169952c.getHost() instanceof Au.b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f169952c.getHost().getClass());
        e(this.f169952c);
        return ((a) C16607a.a(this.f169952c.getHost(), a.class)).j1().a(this.f169952c).build();
    }

    public static ContextWrapper b(Context context, Fragment fragment) {
        return new j.a(context, fragment);
    }

    public static ContextWrapper c(LayoutInflater layoutInflater, Fragment fragment) {
        return new j.a(layoutInflater, fragment);
    }

    public static final Context d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // Au.b
    public Object generatedComponent() {
        if (this.f169950a == null) {
            synchronized (this.f169951b) {
                try {
                    if (this.f169950a == null) {
                        this.f169950a = a();
                    }
                } finally {
                }
            }
        }
        return this.f169950a;
    }

    public C18101g(Fragment fragment) {
        this.f169952c = fragment;
    }
}
