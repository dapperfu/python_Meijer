package xu;

import android.app.Activity;
import android.app.Application;
import androidx.view.ComponentActivity;
import qu.C16607a;
import su.InterfaceC17045b;
import vu.InterfaceC17621a;

/* renamed from: xu.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C18095a implements Au.b<Object> {

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f169935a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f169936b = new Object();

    /* renamed from: c, reason: collision with root package name */
    protected final Activity f169937c;

    /* renamed from: d, reason: collision with root package name */
    private final Au.b<InterfaceC17045b> f169938d;

    /* renamed from: xu.a$a, reason: collision with other inner class name */
    public interface InterfaceC2733a {
        InterfaceC17621a a();
    }

    protected Object a() {
        String str;
        if (this.f169937c.getApplication() instanceof Au.b) {
            return ((InterfaceC2733a) C16607a.a(this.f169938d, InterfaceC2733a.class)).a().a(this.f169937c).build();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.f169937c.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.f169937c.getApplication().getClass();
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    public final h b() {
        return ((C18096b) this.f169938d).c();
    }

    @Override // Au.b
    public Object generatedComponent() {
        if (this.f169935a == null) {
            synchronized (this.f169936b) {
                try {
                    if (this.f169935a == null) {
                        this.f169935a = a();
                    }
                } finally {
                }
            }
        }
        return this.f169935a;
    }

    public C18095a(Activity activity) {
        this.f169937c = activity;
        this.f169938d = new C18096b((ComponentActivity) activity);
    }
}
