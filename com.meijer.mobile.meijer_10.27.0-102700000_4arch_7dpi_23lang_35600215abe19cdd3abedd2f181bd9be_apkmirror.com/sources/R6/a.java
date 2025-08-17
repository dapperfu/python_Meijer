package R6;

import Q6.ImmutableConfig;
import Q6.g;
import com.bugsnag.android.C6496u;
import com.bugsnag.android.InterfaceC6498v;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LR6/a;", "LR6/c;", "LR6/b;", "contextModule", "Lcom/bugsnag/android/u;", "configuration", "Lcom/bugsnag/android/v;", "connectivity", "<init>", "(LR6/b;Lcom/bugsnag/android/u;Lcom/bugsnag/android/v;)V", "LQ6/f;", "b", "LQ6/f;", "d", "()LQ6/f;", "config", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig config;

    /* renamed from: d, reason: from getter */
    public final ImmutableConfig getConfig() {
        return this.config;
    }

    public a(b bVar, C6496u c6496u, InterfaceC6498v interfaceC6498v) {
        this.config = g.c(bVar.getCtx(), c6496u, interfaceC6498v);
    }
}
