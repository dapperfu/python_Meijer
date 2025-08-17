package fsimpl;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes14.dex */
public class aB {

    /* renamed from: a, reason: collision with root package name */
    static final Field f131457a = fT.a(C14108fz.f132293c, "mWindow");

    /* renamed from: b, reason: collision with root package name */
    private aD f131458b;

    /* renamed from: c, reason: collision with root package name */
    private final gf f131459c = new gf();

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap f131460d = new WeakHashMap();

    /* renamed from: e, reason: collision with root package name */
    private aE f131461e = new aC(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(View view) {
        if (C14108fz.f132295e != null) {
            return C14108fz.f132295e.isInstance(view);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Window e(View view) throws IllegalAccessException, IllegalArgumentException {
        Object obj;
        Field field = f131457a;
        if (field == null || !C14108fz.f132293c.isInstance(view)) {
            for (Field field2 : view.getClass().getDeclaredFields()) {
                if (Window.class.isAssignableFrom(field2.getType())) {
                    field2.setAccessible(true);
                    obj = field2.get(view);
                }
            }
            return null;
        }
        obj = field.get(view);
        return (Window) obj;
    }

    public Window a(View view) {
        WeakReference weakReference = (WeakReference) this.f131460d.get(view);
        if (weakReference == null) {
            return null;
        }
        return (Window) weakReference.get();
    }

    public List a() {
        List listB = eS.b();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            this.f131461e.a((View) it.next());
        }
        return listB;
    }

    public void a(aD aDVar) {
        this.f131458b = aDVar;
    }
}
