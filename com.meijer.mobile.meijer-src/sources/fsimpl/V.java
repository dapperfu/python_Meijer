package fsimpl;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes15.dex */
class V {

    /* renamed from: a, reason: collision with root package name */
    private boolean f132688a = false;

    /* renamed from: b, reason: collision with root package name */
    private final InputMethodManager f132689b;

    /* renamed from: c, reason: collision with root package name */
    private final RustInterface f132690c;

    /* renamed from: d, reason: collision with root package name */
    private Method f132691d;

    V(Context context, RustInterface rustInterface) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        this.f132689b = inputMethodManager;
        this.f132690c = rustInterface;
        Method methodA = fT.a(inputMethodManager.getClass(), "getInputMethodWindowVisibleHeight", new Class[0]);
        this.f132691d = methodA;
        if (methodA == null) {
            Log.e("Unable to locate method for soft keyboard detection");
        }
    }

    int a() {
        Method method = this.f132691d;
        if (method == null) {
            return 0;
        }
        try {
            Integer num = (Integer) method.invoke(this.f132689b, new Object[0]);
            if (num != null) {
                return num.intValue();
            }
        } catch (Throwable th2) {
            this.f132691d = null;
            Log.e("Unable to invoke method for soft keyboard detection", th2);
        }
        return 0;
    }

    int b() {
        int iA = a();
        boolean z10 = iA > 0;
        if (this.f132688a != z10) {
            this.f132688a = z10;
            Log.i("enqueueing keyboard visible=" + this.f132688a);
            this.f132690c.b(this.f132688a);
        }
        return iA;
    }
}
