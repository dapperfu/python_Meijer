package K8;

import android.view.Window;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final List<j> f16334a;

    public e(List<j> list) {
        this.f16334a = list;
    }

    public void a(Window window) {
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new b();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (j jVar : this.f16334a) {
            d dVarA = jVar.a(window);
            if (dVarA != null) {
                arrayList.add(dVarA);
            }
            c cVarB = jVar.b();
            if (cVarB != null) {
                arrayList2.add(cVarB);
            }
        }
        window.setCallback(new h(callback, new i(arrayList, arrayList2)));
        FS.trackWindow(window);
    }
}
