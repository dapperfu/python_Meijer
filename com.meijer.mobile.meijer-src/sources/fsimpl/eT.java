package fsimpl;

import com.fullstory.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public class eT {

    /* renamed from: a, reason: collision with root package name */
    public final Method[] f133359a;

    /* renamed from: b, reason: collision with root package name */
    public final Method[] f133360b;

    /* renamed from: c, reason: collision with root package name */
    public final Class[] f133361c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f133362d = false;

    eT(int i10) {
        this.f133359a = new Method[i10];
        this.f133360b = new Method[i10];
        this.f133361c = new Class[i10];
    }

    void a(int i10, Method method, Method method2, Class cls) {
        this.f133359a[i10] = method;
        this.f133360b[i10] = method2;
        this.f133361c[i10] = cls;
        if (method == null || method2 != null) {
            return;
        }
        this.f133362d = true;
        Log.e("Unable to hook all of the expected FS methods: platform method=" + method);
    }

    public boolean a() {
        return this.f133362d;
    }
}
