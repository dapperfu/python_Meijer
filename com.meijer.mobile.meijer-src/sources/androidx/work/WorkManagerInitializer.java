package androidx.work;

import O4.AbstractC4373v;
import O4.O;
import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class WorkManagerInitializer implements E4.a<O> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f59280a = AbstractC4373v.i("WrkMgrInitializer");

    @Override // E4.a
    public List<Class<? extends E4.a<?>>> b() {
        return Collections.EMPTY_LIST;
    }

    @Override // E4.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public O a(Context context) {
        AbstractC4373v.e().a(f59280a, "Initializing WorkManager with default configuration.");
        O.j(context, new a.C1169a().a());
        return O.h(context);
    }
}
