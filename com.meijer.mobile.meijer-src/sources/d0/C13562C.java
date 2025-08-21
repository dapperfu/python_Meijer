package d0;

import android.view.View;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.C5958l;
import androidx.compose.ui.node.InterfaceC5965t;
import androidx.compose.ui.node.InterfaceC5967v;
import androidx.compose.ui.node.i0;
import androidx.compose.ui.node.j0;
import androidx.compose.ui.node.u0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u009b\u0001\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t\u0012\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0092\u0001\u0010 \u001a\u00020\r2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t2\u0019\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u001dJ\u000f\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010\u001dJ\u000f\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010\u001dJ\u0013\u0010&\u001a\u00020\r*\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0013\u0010-\u001a\u00020\r*\u00020,H\u0016¢\u0006\u0004\b-\u0010.R3\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R5\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00100\u001a\u0004\b9\u00102\"\u0004\b:\u00104R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR(\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR(\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bM\u0010<\u001a\u0004\bN\u0010>\"\u0004\bO\u0010@R(\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bP\u0010<\u001a\u0004\bQ\u0010>\"\u0004\bR\u0010@R\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010B\u001a\u0004\bT\u0010D\"\u0004\bU\u0010FR\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR/\u0010l\u001a\u0004\u0018\u00010(2\b\u0010g\u001a\u0004\u0018\u00010(8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bh\u0010j\"\u0004\bk\u0010+R\u001e\u0010p\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u001c\u0010r\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bq\u0010HR\u001e\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bt\u0010uR\u001e\u0010y\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010xR\u001a\u0010{\u001a\u00020\b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bz\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006|"}, d2 = {"Ld0/C;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/v;", "Landroidx/compose/ui/node/t;", "Landroidx/compose/ui/node/u0;", "Landroidx/compose/ui/node/i0;", "Lkotlin/Function1;", "LH1/d;", "LU0/f;", "Lkotlin/ExtensionFunctionType;", "sourceCenter", "magnifierCenter", "LH1/k;", "", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "LH1/h;", "cornerRadius", "elevation", "clippingEnabled", "Ld0/N;", "platformMagnifierFactory", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLd0/N;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Q2", "()V", "T2", "U2", "S2", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLkotlin/jvm/functions/Function1;Ld0/N;)V", "t2", "u2", "B0", "LX0/c;", "I", "(LX0/c;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "O", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Lr1/u;", "T1", "(Lr1/u;)V", "o", "Lkotlin/jvm/functions/Function1;", "getSourceCenter", "()Lkotlin/jvm/functions/Function1;", "setSourceCenter", "(Lkotlin/jvm/functions/Function1;)V", "p", "getMagnifierCenter", "setMagnifierCenter", "q", "getOnSizeChanged", "setOnSizeChanged", "r", "F", "getZoom", "()F", "setZoom", "(F)V", "s", "Z", "getUseTextDefault", "()Z", "setUseTextDefault", "(Z)V", "t", "J", "getSize-MYxV2XQ", "()J", "setSize-EaSLcWc", "(J)V", "u", "getCornerRadius-D9Ej5fM", "setCornerRadius-0680j_4", "v", "getElevation-D9Ej5fM", "setElevation-0680j_4", "w", "getClippingEnabled", "setClippingEnabled", "x", "Ld0/N;", "getPlatformMagnifierFactory", "()Ld0/N;", "setPlatformMagnifierFactory", "(Ld0/N;)V", "Landroid/view/View;", "y", "Landroid/view/View;", "view", "z", "LH1/d;", "density", "Ld0/M;", "A", "Ld0/M;", "magnifier", "<set-?>", "B", "Landroidx/compose/runtime/l0;", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "R2", "layoutCoordinates", "Landroidx/compose/runtime/z1;", "C", "Landroidx/compose/runtime/z1;", "anchorPositionInRootState", "D", "sourceCenterInRoot", "LH1/r;", "E", "LH1/r;", "previousSize", "Lov/g;", "Lov/g;", "drawSignalChannel", "P2", "anchorPositionInRoot", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: d0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13562C extends Modifier.c implements InterfaceC5967v, InterfaceC5965t, u0, i0 {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private M magnifier;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 layoutCoordinates;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private z1<U0.f> anchorPositionInRootState;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private long sourceCenterInRoot;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private H1.r previousSize;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private ov.g<Unit> drawSignalChannel;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function1<? super H1.d, U0.f> sourceCenter;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Function1<? super H1.d, U0.f> magnifierCenter;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Function1<? super H1.k, Unit> onSizeChanged;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float zoom;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean useTextDefault;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float cornerRadius;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float elevation;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean clippingEnabled;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private N platformMagnifierFactory;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private View view;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private H1.d density;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/f;", "c", "()J"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d0.C$a */
    static final class a extends Lambda implements Function0<U0.f> {
        a() {
            super(0);
        }

        public final long c() {
            LayoutCoordinates layoutCoordinatesB = C13562C.this.B();
            return layoutCoordinatesB != null ? LayoutCoordinatesKt.e(layoutCoordinatesB) : U0.f.INSTANCE.b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ U0.f invoke() {
            return U0.f.d(c());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/f;", "c", "()J"}, k = 3, mv = {1, 9, 0})
    /* renamed from: d0.C$b */
    static final class b extends Lambda implements Function0<U0.f> {
        b() {
            super(0);
        }

        public final long c() {
            return C13562C.this.sourceCenterInRoot;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ U0.f invoke() {
            return U0.f.d(c());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {382, 386}, m = "invokeSuspend")
    /* renamed from: d0.C$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f127642a;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: d0.C$c$a */
        static final class a extends Lambda implements Function1<Long, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f127644f = new a();

            a() {
                super(1);
            }

            public final void a(long j10) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                a(l10.longValue());
                return Unit.f143329a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C13562C.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        
            if (androidx.compose.runtime.C5854d0.b(r5, r4) == r0) goto L20;
         */
        /* JADX WARN: Path cross not found for [B:13:0x0029, B:16:0x0032], limit reached: 23 */
        /* JADX WARN: Path cross not found for [B:16:0x0032, B:13:0x0029], limit reached: 23 */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0038 -> B:11:0x0021). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0042 -> B:21:0x0045). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f127642a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L45
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.ResultKt.b(r5)
                goto L32
            L1e:
                kotlin.ResultKt.b(r5)
            L21:
                d0.C r5 = d0.C13562C.this
                ov.g r5 = d0.C13562C.K2(r5)
                if (r5 == 0) goto L32
                r4.f127642a = r3
                java.lang.Object r5 = r5.e(r4)
                if (r5 != r0) goto L32
                goto L44
            L32:
                d0.C r5 = d0.C13562C.this
                d0.M r5 = d0.C13562C.M2(r5)
                if (r5 == 0) goto L21
                d0.C$c$a r5 = d0.C13562C.c.a.f127644f
                r4.f127642a = r2
                java.lang.Object r5 = androidx.compose.runtime.C5854d0.b(r5, r4)
                if (r5 != r0) goto L45
            L44:
                return r0
            L45:
                d0.C r5 = d0.C13562C.this
                d0.M r5 = d0.C13562C.M2(r5)
                if (r5 == 0) goto L21
                r5.b()
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: d0.C13562C.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d0.C$d */
    static final class d extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        d() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C13562C.this.T2();
        }
    }

    public /* synthetic */ C13562C(Function1 function1, Function1 function12, Function1 function13, float f10, boolean z10, long j10, float f11, float f12, boolean z11, N n10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, function13, f10, z10, j10, f11, f12, z11, n10);
    }

    private C13562C(Function1<? super H1.d, U0.f> function1, Function1<? super H1.d, U0.f> function12, Function1<? super H1.k, Unit> function13, float f10, boolean z10, long j10, float f11, float f12, boolean z11, N n10) {
        this.sourceCenter = function1;
        this.magnifierCenter = function12;
        this.onSizeChanged = function13;
        this.zoom = f10;
        this.useTextDefault = z10;
        this.size = j10;
        this.cornerRadius = f11;
        this.elevation = f12;
        this.clippingEnabled = z11;
        this.platformMagnifierFactory = n10;
        this.layoutCoordinates = o1.i(null, o1.k());
        this.sourceCenterInRoot = U0.f.INSTANCE.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates B() {
        return (LayoutCoordinates) this.layoutCoordinates.getValue();
    }

    private final long P2() {
        if (this.anchorPositionInRootState == null) {
            this.anchorPositionInRootState = o1.e(new a());
        }
        z1<U0.f> z1Var = this.anchorPositionInRootState;
        return z1Var != null ? z1Var.getValue().getPackedValue() : U0.f.INSTANCE.b();
    }

    private final void Q2() {
        M m10 = this.magnifier;
        if (m10 != null) {
            m10.dismiss();
        }
        View viewA = this.view;
        if (viewA == null) {
            viewA = C5958l.a(this);
        }
        View view = viewA;
        this.view = view;
        H1.d dVarK = this.density;
        if (dVarK == null) {
            dVarK = C5957k.k(this);
        }
        H1.d dVar = dVarK;
        this.density = dVar;
        this.magnifier = this.platformMagnifierFactory.a(view, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, dVar, this.zoom);
        U2();
    }

    private final void R2(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates.setValue(layoutCoordinates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T2() {
        /*
            r9 = this;
            H1.d r0 = r9.density
            if (r0 != 0) goto La
            H1.d r0 = androidx.compose.ui.node.C5957k.k(r9)
            r9.density = r0
        La:
            kotlin.jvm.functions.Function1<? super H1.d, U0.f> r1 = r9.sourceCenter
            java.lang.Object r1 = r1.invoke(r0)
            U0.f r1 = (U0.f) r1
            long r1 = r1.getPackedValue()
            r3 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r5 = r1 & r3
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L83
            long r5 = r9.P2()
            long r5 = r5 & r3
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L83
            long r5 = r9.P2()
            long r1 = U0.f.q(r5, r1)
            r9.sourceCenterInRoot = r1
            kotlin.jvm.functions.Function1<? super H1.d, U0.f> r1 = r9.magnifierCenter
            if (r1 == 0) goto L66
            java.lang.Object r0 = r1.invoke(r0)
            U0.f r0 = (U0.f) r0
            long r0 = r0.getPackedValue()
            U0.f r0 = U0.f.d(r0)
            long r1 = r0.getPackedValue()
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L55
            goto L56
        L55:
            r0 = 0
        L56:
            if (r0 == 0) goto L66
            long r0 = r0.getPackedValue()
            long r2 = r9.P2()
            long r0 = U0.f.q(r2, r0)
        L64:
            r5 = r0
            goto L6d
        L66:
            U0.f$a r0 = U0.f.INSTANCE
            long r0 = r0.b()
            goto L64
        L6d:
            d0.M r0 = r9.magnifier
            if (r0 != 0) goto L74
            r9.Q2()
        L74:
            d0.M r2 = r9.magnifier
            if (r2 == 0) goto L7f
            long r3 = r9.sourceCenterInRoot
            float r7 = r9.zoom
            r2.a(r3, r5, r7)
        L7f:
            r9.U2()
            return
        L83:
            U0.f$a r0 = U0.f.INSTANCE
            long r0 = r0.b()
            r9.sourceCenterInRoot = r0
            d0.M r0 = r9.magnifier
            if (r0 == 0) goto L92
            r0.dismiss()
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C13562C.T2():void");
    }

    private final void U2() {
        H1.d dVar;
        M m10 = this.magnifier;
        if (m10 == null || (dVar = this.density) == null || H1.r.d(m10.c(), this.previousSize)) {
            return;
        }
        Function1<? super H1.k, Unit> function1 = this.onSizeChanged;
        if (function1 != null) {
            function1.invoke(H1.k.c(dVar.p(H1.s.d(m10.c()))));
        }
        this.previousSize = H1.r.b(m10.c());
    }

    @Override // androidx.compose.ui.node.i0
    public void B0() {
        j0.a(this, new d());
    }

    public final void S2(Function1<? super H1.d, U0.f> sourceCenter, Function1<? super H1.d, U0.f> magnifierCenter, float zoom, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, Function1<? super H1.k, Unit> onSizeChanged, N platformMagnifierFactory) {
        float f10 = this.zoom;
        long j10 = this.size;
        float f11 = this.cornerRadius;
        boolean z10 = this.useTextDefault;
        float f12 = this.elevation;
        boolean z11 = this.clippingEnabled;
        N n10 = this.platformMagnifierFactory;
        View view = this.view;
        H1.d dVar = this.density;
        this.sourceCenter = sourceCenter;
        this.magnifierCenter = magnifierCenter;
        this.zoom = zoom;
        this.useTextDefault = useTextDefault;
        this.size = size;
        this.cornerRadius = cornerRadius;
        this.elevation = elevation;
        this.clippingEnabled = clippingEnabled;
        this.onSizeChanged = onSizeChanged;
        this.platformMagnifierFactory = platformMagnifierFactory;
        View viewA = C5958l.a(this);
        H1.d dVarK = C5957k.k(this);
        if (this.magnifier != null && ((!C13563D.a(zoom, f10) && !platformMagnifierFactory.b()) || !H1.k.f(size, j10) || !H1.h.u(cornerRadius, f11) || !H1.h.u(elevation, f12) || useTextDefault != z10 || clippingEnabled != z11 || !Intrinsics.e(platformMagnifierFactory, n10) || !Intrinsics.e(viewA, view) || !Intrinsics.e(dVarK, dVar))) {
            Q2();
        }
        T2();
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        M m10 = this.magnifier;
        if (m10 != null) {
            m10.dismiss();
        }
        this.magnifier = null;
    }

    @Override // androidx.compose.ui.node.InterfaceC5965t
    public void I(X0.c cVar) {
        cVar.a2();
        ov.g<Unit> gVar = this.drawSignalChannel;
        if (gVar != null) {
            ov.k.b(gVar.k(Unit.f143329a));
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC5967v
    public void O(LayoutCoordinates coordinates) {
        R2(coordinates);
    }

    @Override // androidx.compose.ui.node.u0
    public void T1(r1.u uVar) {
        uVar.a(C13563D.b(), new b());
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        B0();
        this.drawSignalChannel = ov.j.b(0, null, null, 7, null);
        C15809k.d(j2(), null, EnumC15785Q.f151688d, new c(null), 1, null);
    }
}
