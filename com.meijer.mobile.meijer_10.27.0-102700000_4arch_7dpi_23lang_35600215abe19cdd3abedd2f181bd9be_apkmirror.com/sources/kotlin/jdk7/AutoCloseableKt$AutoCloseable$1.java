package kotlin.jdk7;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class AutoCloseableKt$AutoCloseable$1 implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f142800a;

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f142800a.invoke();
    }
}
