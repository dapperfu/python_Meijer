package a1;

import U0.k;
import V0.C5319g1;
import V0.C5347r0;
import V0.InterfaceC5316f1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0006*\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R/\u00106\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u00010\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00107R1\u0010>\u001a\u0002092\u0006\u0010/\u001a\u0002098@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000e\u00101\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010A\u001a\u0002098\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010BR\u0016\u0010D\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010BR%\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060E¢\u0006\u0002\bF8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010GR\u001a\u0010K\u001a\u00020I8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b?\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"La1/m;", "La1/l;", "La1/c;", "root", "<init>", "(La1/c;)V", "", "h", "()V", "LX0/f;", "", "alpha", "LV0/r0;", "colorFilter", "i", "(LX0/f;FLV0/r0;)V", "a", "(LX0/f;)V", "", "toString", "()Ljava/lang/String;", "b", "La1/c;", "l", "()La1/c;", "c", "Ljava/lang/String;", "getName", "p", "(Ljava/lang/String;)V", "name", "", "d", "Z", "isDirty", "La1/a;", "e", "La1/a;", "cacheDrawScope", "Lkotlin/Function0;", "f", "Lkotlin/jvm/functions/Function0;", "getInvalidateCallback$ui_release", "()Lkotlin/jvm/functions/Function0;", "o", "(Lkotlin/jvm/functions/Function0;)V", "invalidateCallback", "<set-?>", "g", "Landroidx/compose/runtime/l0;", "k", "()LV0/r0;", "n", "(LV0/r0;)V", "intrinsicColorFilter", "LV0/r0;", "tintFilter", "LU0/k;", "m", "()J", "q", "(J)V", "viewportSize", "j", "J", "previousDrawSize", "F", "rootScaleX", "rootScaleY", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "drawVectorBlock", "LV0/g1;", "()I", "cacheBitmapConfig", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class m extends l {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a1.c root;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C5558a cacheDrawScope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> invalidateCallback;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 intrinsicColorFilter;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private C5347r0 tintFilter;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 viewportSize;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long previousDrawSize;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float rootScaleX;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float rootScaleY;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Function1<X0.f, Unit> drawVectorBlock;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La1/l;", "it", "", "a", "(La1/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<l, Unit> {
        a() {
            super(1);
        }

        public final void a(l lVar) {
            m.this.h();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l lVar) {
            a(lVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function1<X0.f, Unit> {
        b() {
            super(1);
        }

        public final void a(X0.f fVar) {
            a1.c root = m.this.getRoot();
            m mVar = m.this;
            float f10 = mVar.rootScaleX;
            float f11 = mVar.rootScaleY;
            long jC = U0.f.INSTANCE.c();
            X0.d drawContext = fVar.getDrawContext();
            long jB = drawContext.b();
            drawContext.g().save();
            try {
                drawContext.getTransform().f(f10, f11, jC);
                root.a(fVar);
            } finally {
                drawContext.g().i();
                drawContext.h(jB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f43508f = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public m(a1.c cVar) {
        super(null);
        this.root = cVar;
        cVar.d(new a());
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new C5558a();
        this.invalidateCallback = c.f43508f;
        this.intrinsicColorFilter = t1.e(null, null, 2, null);
        k.Companion companion = U0.k.INSTANCE;
        this.viewportSize = t1.e(U0.k.c(companion.b()), null, 2, null);
        this.previousDrawSize = companion.a();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    @Override // a1.l
    public void a(X0.f fVar) {
        i(fVar, 1.0f, null);
    }

    public final void i(X0.f fVar, float f10, C5347r0 c5347r0) {
        X0.f fVar2;
        int iA = (this.root.getIsTintable() && this.root.getTintColor() != 16 && o.f(k()) && o.f(c5347r0)) ? C5319g1.INSTANCE.a() : C5319g1.INSTANCE.b();
        if (!this.isDirty && U0.k.f(this.previousDrawSize, fVar.b()) && C5319g1.i(iA, j())) {
            fVar2 = fVar;
        } else {
            this.tintFilter = C5319g1.i(iA, C5319g1.INSTANCE.a()) ? C5347r0.Companion.c(C5347r0.INSTANCE, this.root.getTintColor(), 0, 2, null) : null;
            this.rootScaleX = Float.intBitsToFloat((int) (fVar.b() >> 32)) / Float.intBitsToFloat((int) (m() >> 32));
            this.rootScaleY = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) / Float.intBitsToFloat((int) (m() & 4294967295L));
            fVar2 = fVar;
            this.cacheDrawScope.b(iA, H1.r.c((((int) Math.ceil(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)))) & 4294967295L) | (((int) Math.ceil(Float.intBitsToFloat((int) (fVar.b() >> 32)))) << 32)), fVar2, fVar.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = fVar2.b();
        }
        if (c5347r0 == null) {
            c5347r0 = k() != null ? k() : this.tintFilter;
        }
        this.cacheDrawScope.c(fVar2, f10, c5347r0);
    }

    public final int j() {
        InterfaceC5316f1 mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.b() : C5319g1.INSTANCE.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C5347r0 k() {
        return (C5347r0) this.intrinsicColorFilter.getValue();
    }

    /* renamed from: l, reason: from getter */
    public final a1.c getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long m() {
        return ((U0.k) this.viewportSize.getValue()).getPackedValue();
    }

    public final void n(C5347r0 c5347r0) {
        this.intrinsicColorFilter.setValue(c5347r0);
    }

    public final void o(Function0<Unit> function0) {
        this.invalidateCallback = function0;
    }

    public final void p(String str) {
        this.name = str;
    }

    public final void q(long j10) {
        this.viewportSize.setValue(U0.k.c(j10));
    }

    public String toString() {
        String str = "Params: \tname: " + this.name + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (m() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (m() & 4294967295L)) + "\n";
        Intrinsics.i(str, "toString(...)");
        return str;
    }
}
