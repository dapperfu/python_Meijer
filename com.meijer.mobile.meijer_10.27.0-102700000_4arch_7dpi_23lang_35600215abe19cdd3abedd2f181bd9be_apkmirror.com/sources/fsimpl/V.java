package fsimpl;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes14.dex */
class V {

    /* renamed from: a, reason: collision with root package name */
    private boolean f131438a = false;

    /* renamed from: b, reason: collision with root package name */
    private final InputMethodManager f131439b;

    /* renamed from: c, reason: collision with root package name */
    private final RustInterface f131440c;

    /* renamed from: d, reason: collision with root package name */
    private Method f131441d;

    V(Context context, RustInterface rustInterface) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        this.f131439b = inputMethodManager;
        this.f131440c = rustInterface;
        Method methodA = fT.a(inputMethodManager.getClass(), "getInputMethodWindowVisibleHeight", new Class[0]);
        this.f131441d = methodA;
        if (methodA == null) {
            Log.e("Unable to locate method for soft keyboard detection");
        }
    }

    int a() {
        Method method = this.f131441d;
        if (method == null) {
            return 0;
        }
        try {
            Integer num = (Integer) method.invoke(this.f131439b, new Object[0]);
            if (num != null) {
                return num.intValue();
            }
        } catch (Throwable th2) {
            this.f131441d = null;
            Log.e("Unable to invoke method for soft keyboard detection", th2);
        }
        return 0;
    }

    int b() {
        int iA = a();
        boolean z10 = iA > 0;
        if (this.f131438a != z10) {
            this.f131438a = z10;
            Log.i("enqueueing keyboard visible=" + this.f131438a);
            this.f131440c.b(this.f131438a);
        }
        return iA;
    }
}
