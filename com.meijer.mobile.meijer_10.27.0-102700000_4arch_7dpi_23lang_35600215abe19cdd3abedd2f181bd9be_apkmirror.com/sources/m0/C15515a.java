package m0;

import androidx.compose.foundation.lazy.layout.d;
import g0.C14158e;
import kotlin.EnumC13827z;
import kotlin.InterfaceC15732S;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001c¨\u0006\u001e"}, d2 = {"Lm0/a;", "Lm0/A;", "", "nestedPrefetchItemCount", "<init>", "(I)V", "Lm0/z;", "", "delta", "Lm0/r;", "layoutInfo", "", "c", "(Lm0/z;FLm0/r;)V", "d", "(Lm0/z;Lm0/r;)V", "Ln0/S;", "firstVisibleItemIndex", "a", "(Ln0/S;I)V", "I", "b", "lineToPrefetch", "LD0/c;", "Landroidx/compose/foundation/lazy/layout/d$b;", "LD0/c;", "currentLinePrefetchHandles", "", "Z", "wasScrollingForward", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15515a implements InterfaceC15504A {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int nestedPrefetchItemCount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int lineToPrefetch = -1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final D0.c<d.b> currentLinePrefetchHandles = new D0.c<>(new d.b[16], 0);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean wasScrollingForward;

    @Override // m0.InterfaceC15504A
    public void a(InterfaceC15732S interfaceC15732S, int i10) {
        int i11 = this.nestedPrefetchItemCount;
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC15732S.a(i10 + i12);
        }
    }

    @Override // m0.InterfaceC15504A
    public void d(InterfaceC15540z interfaceC15540z, InterfaceC15532r interfaceC15532r) {
        int iF;
        if (this.lineToPrefetch == -1 || interfaceC15532r.h().isEmpty()) {
            return;
        }
        if (this.wasScrollingForward) {
            InterfaceC15524j interfaceC15524j = (InterfaceC15524j) CollectionsKt.D0(interfaceC15532r.h());
            iF = (interfaceC15532r.getOrientation() == EnumC13827z.f130585a ? interfaceC15524j.f() : interfaceC15524j.g()) + 1;
        } else {
            InterfaceC15524j interfaceC15524j2 = (InterfaceC15524j) CollectionsKt.s0(interfaceC15532r.h());
            iF = (interfaceC15532r.getOrientation() == EnumC13827z.f130585a ? interfaceC15524j2.f() : interfaceC15524j2.g()) - 1;
        }
        if (this.lineToPrefetch != iF) {
            this.lineToPrefetch = -1;
            D0.c<d.b> cVar = this.currentLinePrefetchHandles;
            d.b[] bVarArr = cVar.content;
            int size = cVar.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                bVarArr[i10].cancel();
            }
            this.currentLinePrefetchHandles.k();
        }
    }

    public C15515a(int i10) {
        this.nestedPrefetchItemCount = i10;
    }

    @Override // m0.InterfaceC15504A
    public void c(InterfaceC15540z interfaceC15540z, float f10, InterfaceC15532r interfaceC15532r) {
        boolean z10;
        int iG;
        int i10;
        int index;
        int iG2;
        if (!interfaceC15532r.h().isEmpty()) {
            int i11 = 0;
            if (f10 < 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                InterfaceC15524j interfaceC15524j = (InterfaceC15524j) CollectionsKt.D0(interfaceC15532r.h());
                if (interfaceC15532r.getOrientation() == EnumC13827z.f130585a) {
                    iG2 = interfaceC15524j.f();
                } else {
                    iG2 = interfaceC15524j.g();
                }
                i10 = iG2 + 1;
                index = ((InterfaceC15524j) CollectionsKt.D0(interfaceC15532r.h())).getIndex() + 1;
            } else {
                InterfaceC15524j interfaceC15524j2 = (InterfaceC15524j) CollectionsKt.s0(interfaceC15532r.h());
                if (interfaceC15532r.getOrientation() == EnumC13827z.f130585a) {
                    iG = interfaceC15524j2.f();
                } else {
                    iG = interfaceC15524j2.g();
                }
                i10 = iG - 1;
                index = ((InterfaceC15524j) CollectionsKt.s0(interfaceC15532r.h())).getIndex() - 1;
            }
            if (index >= 0 && index < interfaceC15532r.f()) {
                if (i10 != this.lineToPrefetch && i10 >= 0) {
                    if (this.wasScrollingForward != z10) {
                        D0.c<d.b> cVar = this.currentLinePrefetchHandles;
                        d.b[] bVarArr = cVar.content;
                        int size = cVar.getSize();
                        for (int i12 = 0; i12 < size; i12++) {
                            bVarArr[i12].cancel();
                        }
                    }
                    this.wasScrollingForward = z10;
                    this.lineToPrefetch = i10;
                    this.currentLinePrefetchHandles.k();
                    D0.c<d.b> cVar2 = this.currentLinePrefetchHandles;
                    cVar2.g(cVar2.getSize(), interfaceC15540z.a(i10));
                }
                if (z10) {
                    int iC = C14158e.c((InterfaceC15524j) CollectionsKt.D0(interfaceC15532r.h()), interfaceC15532r.getOrientation());
                    if (((C14158e.b(r8, interfaceC15532r.getOrientation()) + iC) + interfaceC15532r.g()) - interfaceC15532r.c() < (-f10)) {
                        D0.c<d.b> cVar3 = this.currentLinePrefetchHandles;
                        d.b[] bVarArr2 = cVar3.content;
                        int size2 = cVar3.getSize();
                        while (i11 < size2) {
                            bVarArr2[i11].a();
                            i11++;
                        }
                        return;
                    }
                    return;
                }
                if (interfaceC15532r.e() - C14158e.b((InterfaceC15524j) CollectionsKt.s0(interfaceC15532r.h()), interfaceC15532r.getOrientation()) < f10) {
                    D0.c<d.b> cVar4 = this.currentLinePrefetchHandles;
                    d.b[] bVarArr3 = cVar4.content;
                    int size3 = cVar4.getSize();
                    while (i11 < size3) {
                        bVarArr3[i11].a();
                        i11++;
                    }
                }
            }
        }
    }
}
