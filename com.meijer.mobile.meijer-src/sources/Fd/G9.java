package Fd;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class G9 implements D9 {

    /* renamed from: a, reason: collision with root package name */
    final List f9260a;

    @Override // Fd.D9
    public final void a(C9 c92) {
        Iterator it = this.f9260a.iterator();
        while (it.hasNext()) {
            ((D9) it.next()).a(c92);
        }
    }

    public G9(Context context, F9 f92) {
        ArrayList arrayList = new ArrayList();
        this.f9260a = arrayList;
        if (f92.c()) {
            arrayList.add(new V9(context, f92));
        }
    }
}
