package l0;

import Z.AbstractC5617o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.C15846E;
import kotlin.InterfaceC15872e;
import kotlin.InterfaceC15888u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b \u0010&R\u0014\u0010'\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Ll0/k;", "Ll0/j;", "Ll0/A;", "state", "Ll0/h;", "intervalContent", "Landroidx/compose/foundation/lazy/a;", "itemScope", "Ln0/u;", "keyIndexMap", "<init>", "(Ll0/A;Ll0/h;Landroidx/compose/foundation/lazy/a;Ln0/u;)V", "", "index", "", "key", "", "h", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "d", "(I)Ljava/lang/Object;", "f", "c", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ll0/A;", "b", "Ll0/h;", "Landroidx/compose/foundation/lazy/a;", "g", "()Landroidx/compose/foundation/lazy/a;", "Ln0/u;", "()Ln0/u;", "itemCount", "LZ/o;", "e", "()LZ/o;", "headerIndexes", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: l0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15441k implements InterfaceC15440j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15429A state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15438h intervalContent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.foundation.lazy.a itemScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15888u keyIndexMap;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: l0.k$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f149060g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f149060g = i10;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-824725566, i10, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:82)");
            }
            C15438h c15438h = C15441k.this.intervalContent;
            int i11 = this.f149060g;
            C15441k c15441k = C15441k.this;
            InterfaceC15872e.a<C15437g> aVar = c15438h.k().get(i11);
            aVar.c().a().invoke(c15441k.getItemScope(), Integer.valueOf(i11 - aVar.getStartIndex()), composer, 0);
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

    @Override // l0.InterfaceC15440j
    /* renamed from: b, reason: from getter */
    public InterfaceC15888u getKeyIndexMap() {
        return this.keyIndexMap;
    }

    @Override // l0.InterfaceC15440j
    public AbstractC5617o e() {
        return this.intervalContent.n();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof C15441k) {
            return Intrinsics.e(this.intervalContent, ((C15441k) other).intervalContent);
        }
        return false;
    }

    @Override // kotlin.InterfaceC15885r
    public Object f(int index) {
        return this.intervalContent.j(index);
    }

    @Override // l0.InterfaceC15440j
    /* renamed from: g, reason: from getter */
    public androidx.compose.foundation.lazy.a getItemScope() {
        return this.itemScope;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }

    public C15441k(C15429A c15429a, C15438h c15438h, androidx.compose.foundation.lazy.a aVar, InterfaceC15888u interfaceC15888u) {
        this.state = c15429a;
        this.intervalContent = c15438h;
        this.itemScope = aVar;
        this.keyIndexMap = interfaceC15888u;
    }

    @Override // kotlin.InterfaceC15885r
    public int c(Object key) {
        return getKeyIndexMap().c(key);
    }

    @Override // kotlin.InterfaceC15885r
    public Object d(int index) {
        Object objD = getKeyIndexMap().d(index);
        if (objD == null) {
            return this.intervalContent.m(index);
        }
        return objD;
    }

    @Override // kotlin.InterfaceC15885r
    public void h(int i10, Object obj, Composer composer, int i11) {
        composer.startReplaceGroup(-462424778);
        if (ComposerKt.M()) {
            ComposerKt.U(-462424778, i11, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:80)");
        }
        C15846E.a(obj, i10, this.state.getPinnedItems(), ComposableLambdaKt.c(-824725566, true, new a(i10), composer, 54), composer, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & 112));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }
}
