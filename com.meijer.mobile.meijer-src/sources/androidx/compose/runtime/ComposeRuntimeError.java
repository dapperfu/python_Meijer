package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "message", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeRuntimeError extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String message;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public ComposeRuntimeError(String str) {
        this.message = str;
    }
}
