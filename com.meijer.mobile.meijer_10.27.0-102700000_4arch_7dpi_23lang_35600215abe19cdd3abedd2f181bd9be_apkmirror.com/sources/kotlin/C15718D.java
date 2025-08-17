package kotlin;

import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.t1;
import androidx.compose.ui.layout.d0;
import i0.C14589e;
import kotlin.C15720F;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R/\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010$\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u0016\u0010'\"\u0004\b%\u0010(R(\u0010+\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010'\"\u0004\b!\u0010(¨\u0006,"}, d2 = {"Ln0/D;", "Landroidx/compose/ui/layout/d0;", "Landroidx/compose/ui/layout/d0$a;", "Ln0/F$a;", "", "key", "Ln0/F;", "pinnedItemList", "<init>", "(Ljava/lang/Object;Ln0/F;)V", "a", "()Landroidx/compose/ui/layout/d0$a;", "", "release", "()V", "d", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "Ln0/F;", "", "c", "I", "getIndex", "()I", "e", "(I)V", "index", "pinsCount", "Landroidx/compose/ui/layout/d0$a;", "parentHandle", "", "f", "Z", "isDisposed", "<set-?>", "g", "Landroidx/compose/runtime/l0;", "()Landroidx/compose/ui/layout/d0;", "(Landroidx/compose/ui/layout/d0;)V", "_parentPinnableContainer", "value", "parentPinnableContainer", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15718D implements d0, d0.a, C15720F.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15720F pinnedItemList;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int pinsCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private d0.a parentHandle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isDisposed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int index = -1;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 _parentPinnableContainer = t1.e(null, null, 2, null);

    public final void d() {
        this.isDisposed = true;
    }

    private final d0 c() {
        return (d0) this._parentPinnableContainer.getValue();
    }

    private final void g(d0 d0Var) {
        this._parentPinnableContainer.setValue(d0Var);
    }

    @Override // androidx.compose.ui.layout.d0
    public d0.a a() {
        if (this.isDisposed) {
            C14589e.c("Pin should not be called on an already disposed item ");
        }
        if (this.pinsCount == 0) {
            this.pinnedItemList.o(this);
            d0 d0VarB = b();
            this.parentHandle = d0VarB != null ? d0VarB.a() : null;
        }
        this.pinsCount++;
        return this;
    }

    public void e(int i10) {
        this.index = i10;
    }

    public final void f(d0 d0Var) {
        g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
        androidx.compose.runtime.snapshots.g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
        try {
            if (d0Var != c()) {
                g(d0Var);
                if (this.pinsCount > 0) {
                    d0.a aVar = this.parentHandle;
                    if (aVar != null) {
                        aVar.release();
                    }
                    this.parentHandle = d0Var != null ? d0Var.a() : null;
                }
            }
            Unit unit = Unit.f142422a;
            companion.l(gVarD, gVarE, function1G);
        } catch (Throwable th2) {
            companion.l(gVarD, gVarE, function1G);
            throw th2;
        }
    }

    @Override // kotlin.C15720F.a
    public int getIndex() {
        return this.index;
    }

    @Override // kotlin.C15720F.a
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.ui.layout.d0.a
    public void release() {
        if (this.isDisposed) {
            return;
        }
        if (!(this.pinsCount > 0)) {
            C14589e.c("Release should only be called once");
        }
        int i10 = this.pinsCount - 1;
        this.pinsCount = i10;
        if (i10 == 0) {
            this.pinnedItemList.p(this);
            d0.a aVar = this.parentHandle;
            if (aVar != null) {
                aVar.release();
            }
            this.parentHandle = null;
        }
    }

    public C15718D(Object obj, C15720F c15720f) {
        this.key = obj;
        this.pinnedItemList = c15720f;
    }

    public final d0 b() {
        return c();
    }
}
