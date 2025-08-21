package M8;

import android.view.Window;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final List<j> f19693a;

    public e(List<j> list) {
        this.f19693a = list;
    }

    public void a(Window window) {
        Window.Callback windowCallback = FS.getWindowCallback(window);
        if (windowCallback == null) {
            windowCallback = new b();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (j jVar : this.f19693a) {
            d dVarA = jVar.a(window);
            if (dVarA != null) {
                arrayList.add(dVarA);
            }
            c cVarB = jVar.b();
            if (cVarB != null) {
                arrayList2.add(cVarB);
            }
        }
        FS.setWindowCallback(window, new h(windowCallback, new i(arrayList, arrayList2)));
    }
}
