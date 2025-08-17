package l0;

import androidx.compose.foundation.lazy.layout.d;
import kotlin.InterfaceC15732S;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001b¨\u0006\u001d"}, d2 = {"Ll0/a;", "Ll0/u;", "", "nestedPrefetchItemCount", "<init>", "(I)V", "Ll0/t;", "", "delta", "Ll0/n;", "layoutInfo", "", "d", "(Ll0/t;FLl0/n;)V", "c", "(Ll0/t;Ll0/n;)V", "Ln0/S;", "firstVisibleItemIndex", "a", "(Ln0/S;I)V", "I", "b", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/d$b;", "Landroidx/compose/foundation/lazy/layout/d$b;", "currentPrefetchHandle", "", "Z", "wasScrollingForward", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15341a implements u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int nestedPrefetchItemCount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int indexToPrefetch = -1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private d.b currentPrefetchHandle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean wasScrollingForward;

    @Override // l0.u
    public void a(InterfaceC15732S interfaceC15732S, int i10) {
        int i11 = this.nestedPrefetchItemCount;
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC15732S.a(i10 + i12);
        }
    }

    @Override // l0.u
    public void c(t tVar, n nVar) {
        if (this.indexToPrefetch == -1 || nVar.h().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != (this.wasScrollingForward ? ((InterfaceC15349i) CollectionsKt.D0(nVar.h())).getIndex() + 1 : ((InterfaceC15349i) CollectionsKt.s0(nVar.h())).getIndex() - 1)) {
            this.indexToPrefetch = -1;
            d.b bVar = this.currentPrefetchHandle;
            if (bVar != null) {
                bVar.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    public C15341a(int i10) {
        this.nestedPrefetchItemCount = i10;
    }

    @Override // l0.u
    public void d(t tVar, float f10, n nVar) {
        boolean z10;
        int index;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        if (!nVar.h().isEmpty()) {
            if (f10 < 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                index = ((InterfaceC15349i) CollectionsKt.D0(nVar.h())).getIndex() + 1;
            } else {
                index = ((InterfaceC15349i) CollectionsKt.s0(nVar.h())).getIndex() - 1;
            }
            if (index >= 0 && index < nVar.f()) {
                if (index != this.indexToPrefetch) {
                    if (this.wasScrollingForward != z10 && (bVar3 = this.currentPrefetchHandle) != null) {
                        bVar3.cancel();
                    }
                    this.wasScrollingForward = z10;
                    this.indexToPrefetch = index;
                    this.currentPrefetchHandle = tVar.a(index);
                }
                if (z10) {
                    InterfaceC15349i interfaceC15349i = (InterfaceC15349i) CollectionsKt.D0(nVar.h());
                    if (((interfaceC15349i.getOffset() + interfaceC15349i.getSize()) + nVar.g()) - nVar.c() < (-f10) && (bVar2 = this.currentPrefetchHandle) != null) {
                        bVar2.a();
                        return;
                    }
                    return;
                }
                if (nVar.e() - ((InterfaceC15349i) CollectionsKt.s0(nVar.h())).getOffset() < f10 && (bVar = this.currentPrefetchHandle) != null) {
                    bVar.a();
                }
            }
        }
    }
}
