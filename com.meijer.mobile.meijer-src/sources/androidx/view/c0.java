package androidx.view;

import X2.i;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\fB\u001d\b\u0017\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0007\"\u00020\r¢\u0006\u0004\b\u0002\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0015\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0016\u0010\u0019J%\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u001a*\u00060\bj\u0002`\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/lifecycle/c0;", "", "<init>", "()V", "Lmv/O;", "viewModelScope", "(Lmv/O;)V", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Lmv/O;[Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "([Ljava/io/Closeable;)V", "", "onCleared", "clear$lifecycle_viewmodel_release", "clear", "", "key", "closeable", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "(Ljava/lang/AutoCloseable;)V", "(Ljava/io/Closeable;)V", "T", "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "LX2/i;", "impl", "LX2/i;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class c0 {
    private final i impl;

    public c0() {
        this.impl = new i();
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        Intrinsics.j(key, "key");
        Intrinsics.j(closeable, "closeable");
        i iVar = this.impl;
        if (iVar != null) {
            iVar.e(key, closeable);
        }
    }

    protected void onCleared() {
    }

    public void addCloseable(AutoCloseable closeable) {
        Intrinsics.j(closeable, "closeable");
        i iVar = this.impl;
        if (iVar != null) {
            iVar.d(closeable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        i iVar = this.impl;
        if (iVar != null) {
            iVar.f();
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        Intrinsics.j(key, "key");
        i iVar = this.impl;
        if (iVar != null) {
            return (T) iVar.h(key);
        }
        return null;
    }

    public c0(InterfaceC15783O viewModelScope) {
        Intrinsics.j(viewModelScope, "viewModelScope");
        this.impl = new i(viewModelScope);
    }

    @Deprecated
    public /* synthetic */ void addCloseable(Closeable closeable) {
        Intrinsics.j(closeable, "closeable");
        i iVar = this.impl;
        if (iVar != null) {
            iVar.d(closeable);
        }
    }

    public c0(AutoCloseable... closeables) {
        Intrinsics.j(closeables, "closeables");
        this.impl = new i((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public c0(InterfaceC15783O viewModelScope, AutoCloseable... closeables) {
        Intrinsics.j(viewModelScope, "viewModelScope");
        Intrinsics.j(closeables, "closeables");
        this.impl = new i(viewModelScope, (AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    @Deprecated
    public /* synthetic */ c0(Closeable... closeables) {
        Intrinsics.j(closeables, "closeables");
        this.impl = new i((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }
}
