package Ed;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class J implements F {

    /* renamed from: a, reason: collision with root package name */
    final List f7087a;

    public J(Context context, I i10) {
        ArrayList arrayList = new ArrayList();
        this.f7087a = arrayList;
        if (i10.c()) {
            arrayList.add(new S(context, i10));
        }
    }
}
