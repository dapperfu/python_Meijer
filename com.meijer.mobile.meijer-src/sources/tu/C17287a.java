package tu;

import android.app.Activity;
import android.app.Application;
import androidx.view.ComponentActivity;
import mu.C15768a;
import ou.InterfaceC16320b;
import ru.InterfaceC16940a;
import wu.InterfaceC17927b;

/* renamed from: tu.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17287a implements InterfaceC17927b<Object> {

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f163403a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f163404b = new Object();

    /* renamed from: c, reason: collision with root package name */
    protected final Activity f163405c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC17927b<InterfaceC16320b> f163406d;

    /* renamed from: tu.a$a, reason: collision with other inner class name */
    public interface InterfaceC2577a {
        InterfaceC16940a a();
    }

    protected Object a() {
        String str;
        if (this.f163405c.getApplication() instanceof InterfaceC17927b) {
            return ((InterfaceC2577a) C15768a.a(this.f163406d, InterfaceC2577a.class)).a().a(this.f163405c).build();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.f163405c.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.f163405c.getApplication().getClass();
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    public final h b() {
        return ((C17288b) this.f163406d).c();
    }

    @Override // wu.InterfaceC17927b
    public Object generatedComponent() {
        if (this.f163403a == null) {
            synchronized (this.f163404b) {
                try {
                    if (this.f163403a == null) {
                        this.f163403a = a();
                    }
                } finally {
                }
            }
        }
        return this.f163403a;
    }

    public C17287a(Activity activity) {
        this.f163405c = activity;
        this.f163406d = new C17288b((ComponentActivity) activity);
    }
}
