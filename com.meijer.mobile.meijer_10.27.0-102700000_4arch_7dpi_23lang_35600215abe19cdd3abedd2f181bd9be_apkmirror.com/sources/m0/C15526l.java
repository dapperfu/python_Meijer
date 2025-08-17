package m0;

import Z.AbstractC5517o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.C15719E;
import kotlin.InterfaceC15745e;
import kotlin.InterfaceC15761u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b\u001e\u0010!R\u0014\u0010\"\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lm0/l;", "Lm0/k;", "Lm0/I;", "state", "Lm0/i;", "intervalContent", "Ln0/u;", "keyIndexMap", "<init>", "(Lm0/I;Lm0/i;Ln0/u;)V", "", "index", "", "d", "(I)Ljava/lang/Object;", "f", "key", "", "h", "(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "c", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lm0/I;", "b", "Lm0/i;", "Ln0/u;", "()Ln0/u;", "itemCount", "LZ/o;", "e", "()LZ/o;", "headerIndexes", "Lm0/H;", "i", "()Lm0/H;", "spanLayoutProvider", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15526l implements InterfaceC15525k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15512I state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15523i intervalContent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15761u keyIndexMap;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: m0.l$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f149625g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f149625g = i10;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(726189336, i10, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:83)");
            }
            C15523i c15523i = C15526l.this.intervalContent;
            int i11 = this.f149625g;
            InterfaceC15745e.a<C15522h> aVar = c15523i.k().get(i11);
            aVar.c().a().invoke(C15529o.f149629a, Integer.valueOf(i11 - aVar.getStartIndex()), composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Override // kotlin.InterfaceC15758r
    public int a() {
        return this.intervalContent.l();
    }

    @Override // m0.InterfaceC15525k
    /* renamed from: b, reason: from getter */
    public InterfaceC15761u getKeyIndexMap() {
        return this.keyIndexMap;
    }

    @Override // m0.InterfaceC15525k
    public AbstractC5517o e() {
        return this.intervalContent.o();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof C15526l) {
            return Intrinsics.e(this.intervalContent, ((C15526l) other).intervalContent);
        }
        return false;
    }

    @Override // kotlin.InterfaceC15758r
    public Object f(int index) {
        return this.intervalContent.j(index);
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }

    @Override // m0.InterfaceC15525k
    public C15511H i() {
        return this.intervalContent.getSpanLayoutProvider();
    }

    public C15526l(C15512I c15512i, C15523i c15523i, InterfaceC15761u interfaceC15761u) {
        this.state = c15512i;
        this.intervalContent = c15523i;
        this.keyIndexMap = interfaceC15761u;
    }

    @Override // kotlin.InterfaceC15758r
    public int c(Object key) {
        return getKeyIndexMap().c(key);
    }

    @Override // kotlin.InterfaceC15758r
    public Object d(int index) {
        Object objD = getKeyIndexMap().d(index);
        if (objD == null) {
            return this.intervalContent.m(index);
        }
        return objD;
    }

    @Override // kotlin.InterfaceC15758r
    public void h(int i10, Object obj, Composer composer, int i11) {
        composer.startReplaceGroup(1493551140);
        if (ComposerKt.M()) {
            ComposerKt.U(1493551140, i11, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:81)");
        }
        C15719E.a(obj, i10, this.state.getPinnedItems(), ComposableLambdaKt.c(726189336, true, new a(i10), composer, 54), composer, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & 112));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }
}
