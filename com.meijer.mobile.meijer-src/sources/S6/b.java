package S6;

import R6.ImmutableConfig;
import R6.l;
import com.bugsnag.android.C6627x;
import com.bugsnag.android.InterfaceC6629y;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LS6/b;", "LS6/a;", "LS6/c;", "contextModule", "Lcom/bugsnag/android/x;", "configuration", "Lcom/bugsnag/android/y;", "connectivity", "LR6/b;", "bgTaskExecutor", "<init>", "(LS6/c;Lcom/bugsnag/android/x;Lcom/bugsnag/android/y;LR6/b;)V", "LR6/k;", "c", "LR6/k;", "a", "()LR6/k;", "config", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig config;

    public b(c cVar, C6627x c6627x, InterfaceC6629y interfaceC6629y, R6.b bVar) {
        super(bVar, null, 2, null);
        this.config = l.d(cVar.getCtx(), c6627x, interfaceC6629y, bVar);
    }

    /* renamed from: a, reason: from getter */
    public final ImmutableConfig getConfig() {
        return this.config;
    }
}
