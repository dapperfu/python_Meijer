package X5;

import U5.m;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import kotlin.C6307U;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"LX5/d;", "", "<init>", "()V", "", "e", "d", "c", "Landroidx/compose/runtime/l0;", "LU5/m$a;", "a", "Landroidx/compose/runtime/l0;", "_presentableState", "Landroidx/compose/runtime/z1;", "b", "Landroidx/compose/runtime/z1;", "()Landroidx/compose/runtime/z1;", "presentableState", "Lc0/U;", "", "Lc0/U;", "()Lc0/U;", "visibilityState", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0<m.a> _presentableState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z1<m.a> presentableState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C6307U<Boolean> visibilityState;

    public final z1<m.a> a() {
        return this.presentableState;
    }

    public final C6307U<Boolean> b() {
        return this.visibilityState;
    }

    public final void c() {
        this._presentableState.setValue(m.a.DETACHED);
        this.visibilityState.h(Boolean.FALSE);
    }

    public final void d() {
        this._presentableState.setValue(m.a.HIDDEN);
        this.visibilityState.h(Boolean.FALSE);
    }

    public final void e() {
        this._presentableState.setValue(m.a.VISIBLE);
        this.visibilityState.h(Boolean.TRUE);
    }

    public d() {
        InterfaceC5730l0<m.a> interfaceC5730l0E = t1.e(m.a.DETACHED, null, 2, null);
        this._presentableState = interfaceC5730l0E;
        this.presentableState = interfaceC5730l0E;
        this.visibilityState = new C6307U<>(Boolean.FALSE);
    }
}
