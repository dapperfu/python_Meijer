package fsimpl;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.Collection;

/* renamed from: fsimpl.bw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C14123bw extends AbstractC14120bt {

    /* renamed from: a, reason: collision with root package name */
    private final C14119bs f133140a;

    protected C14123bw(C14119bs c14119bs) {
        super();
        this.f133140a = c14119bs;
    }

    private FragmentManager c(Activity activity) {
        try {
            if (activity instanceof FragmentActivity) {
                return ((FragmentActivity) activity).getSupportFragmentManager();
            }
            return null;
        } catch (Throwable th2) {
            return null;
        }
    }

    @Override // fsimpl.AbstractC14120bt
    public Collection a() {
        return this.f133140a.getResumedFragmentViewIds();
    }

    @Override // fsimpl.AbstractC14120bt
    public void a(Activity activity) {
        try {
            FragmentManager fragmentManagerC = c(activity);
            if (fragmentManagerC != null) {
                fragmentManagerC.registerFragmentLifecycleCallbacks(this.f133140a, true);
            }
        } catch (Throwable th2) {
        }
    }

    @Override // fsimpl.AbstractC14120bt
    public Collection b() {
        return this.f133140a.getCreatedFragments();
    }

    @Override // fsimpl.AbstractC14120bt
    public void b(Activity activity) {
        try {
            FragmentManager fragmentManagerC = c(activity);
            if (fragmentManagerC != null) {
                fragmentManagerC.unregisterFragmentLifecycleCallbacks(this.f133140a);
            }
        } catch (Throwable th2) {
        }
    }
}
