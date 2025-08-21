package fsimpl;

import android.view.View;
import android.view.Window;
import com.fullstory.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
class aC implements aE {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aB f132712a;

    aC(aB aBVar) {
        this.f132712a = aBVar;
    }

    @Override // fsimpl.aE
    public void a(View view) throws IllegalArgumentException {
        if (view == null || view.getHandler() == null || this.f132712a.f132709c.a(view, 1) == 1 || aB.d(view)) {
            return;
        }
        try {
            Window windowE = aB.e(view);
            if (windowE != null) {
                this.f132712a.f132710d.put(view, new WeakReference(windowE));
                this.f132712a.f132708b.a(windowE, view);
            } else if (!"FSPreviewMode".equals(view.getTag())) {
                Log.e("Couldn't get a window from a view: " + view.getClass());
            }
        } catch (IllegalAccessException e10) {
            Log.e("Exception getting a window from a view: " + view.getClass());
        }
    }
}
