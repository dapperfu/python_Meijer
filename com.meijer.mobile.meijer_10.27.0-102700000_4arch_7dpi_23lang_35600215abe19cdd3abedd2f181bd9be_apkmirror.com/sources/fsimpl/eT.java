package fsimpl;

import com.fullstory.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes14.dex */
public class eT {

    /* renamed from: a, reason: collision with root package name */
    public final Method[] f132109a;

    /* renamed from: b, reason: collision with root package name */
    public final Method[] f132110b;

    /* renamed from: c, reason: collision with root package name */
    public final Class[] f132111c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f132112d = false;

    eT(int i10) {
        this.f132109a = new Method[i10];
        this.f132110b = new Method[i10];
        this.f132111c = new Class[i10];
    }

    void a(int i10, Method method, Method method2, Class cls) {
        this.f132109a[i10] = method;
        this.f132110b[i10] = method2;
        this.f132111c[i10] = cls;
        if (method == null || method2 != null) {
            return;
        }
        this.f132112d = true;
        Log.e("Unable to hook all of the expected FS methods: platform method=" + method);
    }

    public boolean a() {
        return this.f132112d;
    }
}
