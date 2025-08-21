package tu;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import mu.C15768a;
import ru.InterfaceC16942c;
import tu.j;
import wu.InterfaceC17927b;

/* renamed from: tu.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17293g implements InterfaceC17927b<Object> {

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f163418a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f163419b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Fragment f163420c;

    /* renamed from: tu.g$a */
    public interface a {
        InterfaceC16942c j1();
    }

    protected void e(Fragment fragment) {
    }

    private Object a() {
        wu.d.c(this.f163420c.getHost(), "Hilt Fragments must be attached before creating the component.");
        wu.d.d(this.f163420c.getHost() instanceof InterfaceC17927b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f163420c.getHost().getClass());
        e(this.f163420c);
        return ((a) C15768a.a(this.f163420c.getHost(), a.class)).j1().a(this.f163420c).build();
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

    @Override // wu.InterfaceC17927b
    public Object generatedComponent() {
        if (this.f163418a == null) {
            synchronized (this.f163419b) {
                try {
                    if (this.f163418a == null) {
                        this.f163418a = a();
                    }
                } finally {
                }
            }
        }
        return this.f163418a;
    }

    public C17293g(Fragment fragment) {
        this.f163420c = fragment;
    }
}
