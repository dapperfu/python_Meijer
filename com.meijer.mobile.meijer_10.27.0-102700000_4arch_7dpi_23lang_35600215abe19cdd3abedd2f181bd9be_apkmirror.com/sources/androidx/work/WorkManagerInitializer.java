package androidx.work;

import N4.AbstractC4333v;
import N4.O;
import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class WorkManagerInitializer implements D4.a<O> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f59094a = AbstractC4333v.i("WrkMgrInitializer");

    @Override // D4.a
    public List<Class<? extends D4.a<?>>> b() {
        return Collections.EMPTY_LIST;
    }

    @Override // D4.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public O a(Context context) {
        AbstractC4333v.e().a(f59094a, "Initializing WorkManager with default configuration.");
        O.j(context, new a.C1159a().a());
        return O.h(context);
    }
}
