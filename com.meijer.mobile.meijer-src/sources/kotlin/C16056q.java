package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.AbstractC15880m;
import kotlin.C15846E;
import kotlin.InterfaceC15872e;
import kotlin.InterfaceC15885r;
import kotlin.InterfaceC15888u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0014\u0010$\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b¨\u0006%"}, d2 = {"Lo0/q;", "Ln0/r;", "Lo0/C;", "state", "Ln0/m;", "Lo0/l;", "intervalContent", "Ln0/u;", "keyIndexMap", "<init>", "(Lo0/C;Ln0/m;Ln0/u;)V", "", "index", "", "key", "", "h", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "d", "(I)Ljava/lang/Object;", "c", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lo0/C;", "b", "Ln0/m;", "Ln0/u;", "Lo0/v;", "Lo0/v;", "pagerScopeImpl", "itemCount", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16056q implements InterfaceC15885r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16037C state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15880m<C16051l> intervalContent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15888u keyIndexMap;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C16061v pagerScopeImpl = C16061v.f153572a;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: o0.q$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f153512g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f153512g = i10;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1142237095, i10, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:212)");
            }
            AbstractC15880m abstractC15880m = C16056q.this.intervalContent;
            int i11 = this.f153512g;
            C16056q c16056q = C16056q.this;
            InterfaceC15872e.a aVar = abstractC15880m.k().get(i11);
            ((C16051l) aVar.c()).a().invoke(c16056q.pagerScopeImpl, Integer.valueOf(i11 - aVar.getStartIndex()), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Override // kotlin.InterfaceC15885r
    public int a() {
        return this.intervalContent.l();
    }

    @Override // kotlin.InterfaceC15885r
    public int c(Object key) {
        return this.keyIndexMap.c(key);
    }

    @Override // kotlin.InterfaceC15885r
    public Object d(int index) {
        Object objD = this.keyIndexMap.d(index);
        return objD == null ? this.intervalContent.m(index) : objD;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof C16056q) {
            return Intrinsics.e(this.intervalContent, ((C16056q) other).intervalContent);
        }
        return false;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }

    public C16056q(AbstractC16037C abstractC16037C, AbstractC15880m<C16051l> abstractC15880m, InterfaceC15888u interfaceC15888u) {
        this.state = abstractC16037C;
        this.intervalContent = abstractC15880m;
        this.keyIndexMap = interfaceC15888u;
    }

    @Override // kotlin.InterfaceC15885r
    public void h(int i10, Object obj, Composer composer, int i11) {
        composer.startReplaceGroup(-1201380429);
        if (ComposerKt.M()) {
            ComposerKt.U(-1201380429, i11, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:210)");
        }
        C15846E.a(obj, i10, this.state.getPinnedPages(), ComposableLambdaKt.c(1142237095, true, new a(i10), composer, 54), composer, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & 112));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }
}
