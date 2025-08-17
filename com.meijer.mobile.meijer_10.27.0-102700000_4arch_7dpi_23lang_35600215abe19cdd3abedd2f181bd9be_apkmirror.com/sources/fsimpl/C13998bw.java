package fsimpl;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.Collection;

/* renamed from: fsimpl.bw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C13998bw extends AbstractC13995bt {

    /* renamed from: a, reason: collision with root package name */
    private final C13994bs f131890a;

    protected C13998bw(C13994bs c13994bs) {
        super();
        this.f131890a = c13994bs;
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

    @Override // fsimpl.AbstractC13995bt
    public Collection a() {
        return this.f131890a.getResumedFragmentViewIds();
    }

    @Override // fsimpl.AbstractC13995bt
    public void a(Activity activity) {
        try {
            FragmentManager fragmentManagerC = c(activity);
            if (fragmentManagerC != null) {
                fragmentManagerC.registerFragmentLifecycleCallbacks(this.f131890a, true);
            }
        } catch (Throwable th2) {
        }
    }

    @Override // fsimpl.AbstractC13995bt
    public Collection b() {
        return this.f131890a.getCreatedFragments();
    }

    @Override // fsimpl.AbstractC13995bt
    public void b(Activity activity) {
        try {
            FragmentManager fragmentManagerC = c(activity);
            if (fragmentManagerC != null) {
                fragmentManagerC.unregisterFragmentLifecycleCallbacks(this.f131890a);
            }
        } catch (Throwable th2) {
        }
    }
}
