package fsimpl;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.fullstory.util.Log;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fsimpl.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14240m {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f133609a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC14241n f133610b;

    public C14240m(Context context, C14138ck c14138ck) {
        AtomicReference atomicReference = new AtomicReference();
        this.f133609a = atomicReference;
        this.f133610b = AbstractC14241n.create(atomicReference, null);
        if (Build.VERSION.SDK_INT == 28 && "samsung".equalsIgnoreCase(Build.MANUFACTURER)) {
            if (c14138ck.X()) {
                Log.w("Forced accessibility is disabled. Click events may not be detected on this device!");
                return;
            }
            try {
                Field declaredField = AccessibilityManager.class.getDeclaredField("mIsEnabled");
                declaredField.setAccessible(true);
                Field declaredField2 = AccessibilityManager.class.getDeclaredField("mUIAutomatorRunning");
                declaredField2.setAccessible(true);
                AccessibilityManager accessibilityManager = AccessibilityManager.getInstance(context);
                declaredField.set(accessibilityManager, true);
                declaredField2.set(accessibilityManager, true);
            } catch (Throwable th2) {
                Log.e("Unable to detect click events on this device ", th2);
            }
        }
    }

    private View.AccessibilityDelegate b(View view, View.AccessibilityDelegate accessibilityDelegate) throws IllegalAccessException, IllegalArgumentException {
        AbstractC14241n abstractC14241nCreate;
        boolean z10 = true;
        if (accessibilityDelegate == null) {
            abstractC14241nCreate = this.f133610b;
        } else if (accessibilityDelegate instanceof AbstractC14241n) {
            abstractC14241nCreate = (AbstractC14241n) accessibilityDelegate;
            z10 = false;
        } else {
            abstractC14241nCreate = AbstractC14241n.create(this.f133609a, accessibilityDelegate);
        }
        if (z10) {
            AbstractC14236i.a(view, abstractC14241nCreate);
        }
        return abstractC14241nCreate.a();
    }

    public G a() {
        return (G) this.f133609a.get();
    }

    void a(View view) throws IllegalAccessException, IllegalArgumentException {
        if (view == null) {
            return;
        }
        b(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(viewGroup.getChildAt(i10));
            }
        }
    }

    public void a(View view, View.AccessibilityDelegate accessibilityDelegate) throws IllegalAccessException, IllegalArgumentException {
        view.setAccessibilityDelegate(accessibilityDelegate);
        b(view);
    }

    public void a(G g10) {
        this.f133609a.set(g10);
    }

    void b(View view) throws IllegalAccessException, IllegalArgumentException {
        b(view, AbstractC14236i.a(view));
    }

    public View.AccessibilityDelegate c(View view) {
        return b(view, AbstractC14236i.a(view));
    }
}
