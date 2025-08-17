package T0;

import H1.t;
import V0.InterfaceC5310d1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\r\u001a\u00020\t2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\r\u0010\u000bR\"\u0010\u0015\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010+\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0017\u0010.\u001a\u00020,8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010-R\u0011\u00102\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"LT0/d;", "LH1/d;", "<init>", "()V", "Lkotlin/Function1;", "LX0/f;", "", "Lkotlin/ExtensionFunctionType;", "block", "LT0/i;", "f", "(Lkotlin/jvm/functions/Function1;)LT0/i;", "LX0/c;", "q", "LT0/b;", "a", "LT0/b;", "getCacheParams$ui_release", "()LT0/b;", "r", "(LT0/b;)V", "cacheParams", "b", "LT0/i;", "()LT0/i;", "A", "(LT0/i;)V", "drawResult", "c", "LX0/c;", "getContentDrawScope$ui_release", "()LX0/c;", "s", "(LX0/c;)V", "contentDrawScope", "Lkotlin/Function0;", "LV0/d1;", "d", "Lkotlin/jvm/functions/Function0;", "getGraphicsContextProvider$ui_release", "()Lkotlin/jvm/functions/Function0;", "B", "(Lkotlin/jvm/functions/Function0;)V", "graphicsContextProvider", "LU0/k;", "()J", "size", "LH1/t;", "getLayoutDirection", "()LH1/t;", "layoutDirection", "", "getDensity", "()F", "density", "F1", "fontScale", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class d implements H1.d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private b cacheParams = j.f34782a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private i drawResult;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private X0.c contentDrawScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function0<? extends InterfaceC5310d1> graphicsContextProvider;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/c;", "", "a", "(LX0/c;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<X0.c, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<X0.f, Unit> f34779f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super X0.f, Unit> function1) {
            super(1);
            this.f34779f = function1;
        }

        public final void a(X0.c cVar) {
            this.f34779f.invoke(cVar);
            cVar.a2();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.c cVar) {
            a(cVar);
            return Unit.f142422a;
        }
    }

    public final void A(i iVar) {
        this.drawResult = iVar;
    }

    public final void B(Function0<? extends InterfaceC5310d1> function0) {
        this.graphicsContextProvider = function0;
    }

    @Override // H1.l
    /* renamed from: F1 */
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    /* renamed from: a, reason: from getter */
    public final i getDrawResult() {
        return this.drawResult;
    }

    public final long b() {
        return this.cacheParams.b();
    }

    public final i f(Function1<? super X0.f, Unit> block) {
        return q(new a(block));
    }

    @Override // H1.d
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    public final t getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    public final i q(Function1<? super X0.c, Unit> block) {
        i iVar = new i(block);
        this.drawResult = iVar;
        return iVar;
    }

    public final void r(b bVar) {
        this.cacheParams = bVar;
    }

    public final void s(X0.c cVar) {
        this.contentDrawScope = cVar;
    }
}
