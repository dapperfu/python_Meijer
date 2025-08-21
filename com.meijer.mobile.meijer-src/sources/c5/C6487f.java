package c5;

import V0.C5490r0;
import V0.M;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.compose.runtime.A0;
import androidx.compose.runtime.InterfaceC5866i0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.ui.layout.InterfaceC5926k;
import c5.C6487f;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.AbstractC15670i;
import m5.C15667f;
import m5.C15669h;
import m5.C15677p;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.X0;
import n5.EnumC15908e;
import n5.InterfaceC15913j;
import n5.Size;
import o5.InterfaceC16073c;
import oc.C16103a;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.S;
import q5.C16604a;
import q5.InterfaceC16606c;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0002)#B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u000e*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0001*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\t*\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010\u000bJ\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010\u000bJ\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010\u000bR\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R/\u0010<\u001a\u0004\u0018\u00010\u00012\b\u00105\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R+\u0010!\u001a\u00020 2\u0006\u00105\u001a\u00020 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR/\u0010&\u001a\u0004\u0018\u00010%2\b\u00105\u001a\u0004\u0018\u00010%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u00107\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010L\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u000e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bI\u0010J\"\u0004\bK\u0010\u0011R(\u0010O\u001a\u0004\u0018\u00010\u00012\b\u0010H\u001a\u0004\u0018\u00010\u00018\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001e\u0010M\"\u0004\bN\u0010;R.\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR0\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010R\u001a\u0004\bY\u0010T\"\u0004\bZ\u0010VR\"\u0010c\u001a\u00020\\8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010j\u001a\u00020d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010Z\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010q\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR+\u0010v\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\br\u00107\u001a\u0004\bs\u0010t\"\u0004\bu\u0010\u0011R+\u0010\u0004\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u00038F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bw\u00107\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R,\u0010\u0006\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00058F@@X\u0086\u008e\u0002¢\u0006\u0013\n\u0004\b|\u00107\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0082\u0001\u001a\u0002018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bC\u0010\u0081\u0001¨\u0006\u0083\u0001"}, d2 = {"Lc5/f;", "LZ0/c;", "Landroidx/compose/runtime/N0;", "Lm5/h;", "request", "La5/h;", "imageLoader", "<init>", "(Lm5/h;La5/h;)V", "", "v", "()V", "S", "(Lm5/h;)Lm5/h;", "Lc5/f$b;", "input", "T", "(Lc5/f$b;)V", "previous", "current", "Lc5/o;", "C", "(Lc5/f$b;Lc5/f$b;)Lc5/o;", "Lm5/i;", "R", "(Lm5/i;)Lc5/f$b;", "Landroid/graphics/drawable/Drawable;", "Q", "(Landroid/graphics/drawable/Drawable;)LZ0/c;", "LX0/f;", "m", "(LX0/f;)V", "", "alpha", "", "a", "(F)Z", "LV0/r0;", "colorFilter", "c", "(LV0/r0;)Z", "b", "f", "e", "Lmv/O;", "g", "Lmv/O;", "rememberScope", "Lpv/B;", "LU0/k;", "h", "Lpv/B;", "drawSize", "<set-?>", "i", "Landroidx/compose/runtime/l0;", "z", "()LZ0/c;", "J", "(LZ0/c;)V", PlaceTypes.PAINTER, "j", "Landroidx/compose/runtime/i0;", "w", "()F", "D", "(F)V", "k", "x", "()LV0/r0;", "E", "(LV0/r0;)V", "value", "l", "Lc5/f$b;", "P", "_state", "LZ0/c;", "O", "_painter", "Lkotlin/Function1;", "n", "Lkotlin/jvm/functions/Function1;", "getTransform$coil_compose_base_release", "()Lkotlin/jvm/functions/Function1;", "N", "(Lkotlin/jvm/functions/Function1;)V", "transform", "o", "getOnState$coil_compose_base_release", "I", "onState", "Landroidx/compose/ui/layout/k;", "p", "Landroidx/compose/ui/layout/k;", "getContentScale$coil_compose_base_release", "()Landroidx/compose/ui/layout/k;", "F", "(Landroidx/compose/ui/layout/k;)V", "contentScale", "LV0/b1;", "q", "getFilterQuality-f-v9h1I$coil_compose_base_release", "()I", "G", "(I)V", "filterQuality", "r", "Z", "isPreview$coil_compose_base_release", "()Z", "K", "(Z)V", "isPreview", "s", "B", "()Lc5/f$b;", "M", "state", "t", "A", "()Lm5/h;", "L", "(Lm5/h;)V", "u", "y", "()La5/h;", "H", "(La5/h;)V", "()J", "intrinsicSize", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c5.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6487f extends Z0.c implements N0 {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: w, reason: collision with root package name */
    private static final Function1<b, b> f61295w = new Function1() { // from class: c5.e
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return C6487f.o((C6487f.b) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15783O rememberScope;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<U0.k> drawSize = S.a(U0.k.c(U0.k.INSTANCE.b()));

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 painter = t1.e(null, null, 2, null);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5866i0 alpha = A0.a(1.0f);

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 colorFilter = t1.e(null, null, 2, null);

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private b _state;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Z0.c _painter;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Function1<? super b, ? extends b> transform;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function1<? super b, Unit> onState;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5926k contentScale;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int filterQuality;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isPreview;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 state;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 request;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 imageLoader;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc5/f$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Lc5/f$b;", "DefaultTransform", "Lkotlin/jvm/functions/Function1;", "a", "()Lkotlin/jvm/functions/Function1;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: c5.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function1<b, b> a() {
            return C6487f.f61295w;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0005\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lc5/f$b;", "", "<init>", "()V", "LZ0/c;", "a", "()LZ0/c;", PlaceTypes.PAINTER, "c", "d", "b", "Lc5/f$b$a;", "Lc5/f$b$b;", "Lc5/f$b$c;", "Lc5/f$b$d;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: c5.f$b */
    public static abstract class b {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH×\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lc5/f$b$a;", "Lc5/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LZ0/c;", "a", "()LZ0/c;", PlaceTypes.PAINTER, "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: c5.f$b$a */
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f61311a = new a();

            private a() {
                super(null);
            }

            @Override // c5.C6487f.b
            /* renamed from: a */
            public Z0.c getPainter() {
                return null;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "Empty";
            }

            public int hashCode() {
                return -1515560141;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H×\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lc5/f$b$b;", "Lc5/f$b;", "LZ0/c;", PlaceTypes.PAINTER, "Lm5/f;", "result", "<init>", "(LZ0/c;Lm5/f;)V", "b", "(LZ0/c;Lm5/f;)Lc5/f$b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LZ0/c;", "()LZ0/c;", "Lm5/f;", "d", "()Lm5/f;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: c5.f$b$b, reason: collision with other inner class name and from toString */
        public static final /* data */ class Error extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Z0.c painter;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final C15667f result;

            public Error(Z0.c cVar, C15667f c15667f) {
                super(null);
                this.painter = cVar;
                this.result = c15667f;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return Intrinsics.e(this.painter, error.painter) && Intrinsics.e(this.result, error.result);
            }

            public static /* synthetic */ Error c(Error error, Z0.c cVar, C15667f c15667f, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    cVar = error.painter;
                }
                if ((i10 & 2) != 0) {
                    c15667f = error.result;
                }
                return error.b(cVar, c15667f);
            }

            @Override // c5.C6487f.b
            /* renamed from: a, reason: from getter */
            public Z0.c getPainter() {
                return this.painter;
            }

            public final Error b(Z0.c painter, C15667f result) {
                return new Error(painter, result);
            }

            /* renamed from: d, reason: from getter */
            public final C15667f getResult() {
                return this.result;
            }

            public int hashCode() {
                Z0.c cVar = this.painter;
                return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.result.hashCode();
            }

            public String toString() {
                return "Error(painter=" + this.painter + ", result=" + this.result + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH×\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH×\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lc5/f$b$c;", "Lc5/f$b;", "LZ0/c;", PlaceTypes.PAINTER, "<init>", "(LZ0/c;)V", "b", "(LZ0/c;)Lc5/f$b$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LZ0/c;", "()LZ0/c;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: c5.f$b$c, reason: from toString */
        public static final /* data */ class Loading extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Z0.c painter;

            public Loading(Z0.c cVar) {
                super(null);
                this.painter = cVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && Intrinsics.e(this.painter, ((Loading) other).painter);
            }

            @Override // c5.C6487f.b
            /* renamed from: a, reason: from getter */
            public Z0.c getPainter() {
                return this.painter;
            }

            public final Loading b(Z0.c painter) {
                return new Loading(painter);
            }

            public int hashCode() {
                Z0.c cVar = this.painter;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.painter + ')';
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH×\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH×\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lc5/f$b$d;", "Lc5/f$b;", "LZ0/c;", PlaceTypes.PAINTER, "Lm5/p;", "result", "<init>", "(LZ0/c;Lm5/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LZ0/c;", "()LZ0/c;", "b", "Lm5/p;", "()Lm5/p;", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: c5.f$b$d, reason: from toString */
        public static final /* data */ class Success extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Z0.c painter;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final C15677p result;

            public Success(Z0.c cVar, C15677p c15677p) {
                super(null);
                this.painter = cVar;
                this.result = c15677p;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.e(this.painter, success.painter) && Intrinsics.e(this.result, success.result);
            }

            @Override // c5.C6487f.b
            /* renamed from: a, reason: from getter */
            public Z0.c getPainter() {
                return this.painter;
            }

            /* renamed from: b, reason: from getter */
            public final C15677p getResult() {
                return this.result;
            }

            public int hashCode() {
                return (this.painter.hashCode() * 31) + this.result.hashCode();
            }

            public String toString() {
                return "Success(painter=" + this.painter + ", result=" + this.result + ')';
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public abstract Z0.c getPainter();

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1$1", f = "AsyncImagePainter.kt", l = {308}, m = "invokeSuspend")
    /* renamed from: c5.f$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f61317a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\u0010\u0004\u001a\u00110\u0000¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lm5/h;", "Lkotlin/ParameterName;", "name", "value", "it", "Lc5/f$b;", "<anonymous>", "(Lm5/h;)Lc5/f$b;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1$1$2", f = "AsyncImagePainter.kt", l = {HttpResponseStatus.REDIRECTION_TEMPORARY_REDIRECT}, m = "invokeSuspend")
        /* renamed from: c5.f$c$a */
        static final class a extends SuspendLambda implements Function2<C15669h, Continuation<? super b>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f61319a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f61320b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C6487f f61321c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C6487f c6487f, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f61321c = c6487f;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f61321c, continuation);
                aVar.f61320b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C15669h c15669h, Continuation<? super b> continuation) {
                return ((a) create(c15669h, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                C6487f c6487f;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f61319a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        c6487f = (C6487f) this.f61320b;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C15669h c15669h = (C15669h) this.f61320b;
                    C6487f c6487f2 = this.f61321c;
                    a5.h hVarY = c6487f2.y();
                    C15669h c15669hS = this.f61321c.S(c15669h);
                    this.f61320b = c6487f2;
                    this.f61319a = 1;
                    obj = hVarY.c(c15669hS, this);
                    if (obj == objF) {
                        return objF;
                    }
                    c6487f = c6487f2;
                }
                return c6487f.R((AbstractC15670i) obj);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: c5.f$c$b */
        /* synthetic */ class b implements InterfaceC16562g, FunctionAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6487f f61322a;

            b(C6487f c6487f) {
                this.f61322a = c6487f;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(b bVar, Continuation<? super Unit> continuation) {
                Object objL = c.l(this.f61322a, bVar, continuation);
                return objL == IntrinsicsKt.f() ? objL : Unit.f143329a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC16562g) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.f61322a, C6487f.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6487f.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C15669h k(C6487f c6487f) {
            return c6487f.A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object l(C6487f c6487f, b bVar, Continuation continuation) {
            c6487f.T(bVar);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f61317a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final C6487f c6487f = C6487f.this;
                InterfaceC16561f interfaceC16561fK = C16563h.K(o1.q(new Function0() { // from class: c5.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C6487f.c.k(c6487f);
                    }
                }), new a(C6487f.this, null));
                b bVar = new b(C6487f.this);
                this.f61317a = 1;
                if (interfaceC16561fK.collect(bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"c5/f$d", "Lo5/c;", "Landroid/graphics/drawable/Drawable;", "placeholder", "", "b", "(Landroid/graphics/drawable/Drawable;)V", "error", "c", "result", "a", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: c5.f$d */
    public static final class d implements InterfaceC16073c {
        @Override // o5.InterfaceC16073c
        public void a(Drawable result) {
        }

        @Override // o5.InterfaceC16073c
        public void c(Drawable error) {
        }

        public d() {
        }

        @Override // o5.InterfaceC16073c
        public void b(Drawable placeholder) {
            C6487f.this.T(new b.Loading(placeholder != null ? C6487f.this.Q(placeholder) : null));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: c5.f$e */
    static final class e implements InterfaceC15913j {

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: c5.f$e$a */
        public static final class a implements InterfaceC16561f<Size> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16561f f61325a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            @SourceDebugExtension
            /* renamed from: c5.f$e$a$a, reason: collision with other inner class name */
            public static final class C1220a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC16562g f61326a;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", l = {221}, m = "emit")
                /* renamed from: c5.f$e$a$a$a, reason: collision with other inner class name */
                public static final class C1221a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f61327a;

                    /* renamed from: b, reason: collision with root package name */
                    int f61328b;

                    public C1221a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f61327a = obj;
                        this.f61328b |= Integer.MIN_VALUE;
                        return C1220a.this.emit(null, this);
                    }
                }

                public C1220a(InterfaceC16562g interfaceC16562g) {
                    this.f61326a = interfaceC16562g;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // pv.InterfaceC16562g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof c5.C6487f.e.a.C1220a.C1221a
                        if (r0 == 0) goto L13
                        r0 = r8
                        c5.f$e$a$a$a r0 = (c5.C6487f.e.a.C1220a.C1221a) r0
                        int r1 = r0.f61328b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f61328b = r1
                        goto L18
                    L13:
                        c5.f$e$a$a$a r0 = new c5.f$e$a$a$a
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f61327a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.f61328b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.b(r8)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        kotlin.ResultKt.b(r8)
                        pv.g r8 = r6.f61326a
                        U0.k r7 = (U0.k) r7
                        long r4 = r7.getPackedValue()
                        n5.i r7 = c5.h.b(r4)
                        if (r7 == 0) goto L4b
                        r0.f61328b = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L4b
                        return r1
                    L4b:
                        kotlin.Unit r7 = kotlin.Unit.f143329a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: c5.C6487f.e.a.C1220a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public a(InterfaceC16561f interfaceC16561f) {
                this.f61325a = interfaceC16561f;
            }

            @Override // pv.InterfaceC16561f
            public Object collect(InterfaceC16562g<? super Size> interfaceC16562g, Continuation continuation) {
                Object objCollect = this.f61325a.collect(new C1220a(interfaceC16562g), continuation);
                return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
            }
        }

        e() {
        }

        @Override // n5.InterfaceC15913j
        public final Object b(Continuation<? super Size> continuation) {
            return C16563h.A(new a(C6487f.this.drawSize), continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C15669h S(C15669h request) {
        C15669h.a aVarC = C15669h.R(request, null, 1, null).C(new d());
        if (request.getDefined().getSizeResolver() == null) {
            aVarC.A(new e());
        }
        if (request.getDefined().getScale() == null) {
            aVarC.y(F.o(this.contentScale));
        }
        if (request.getDefined().getPrecision() != EnumC15908e.f152051a) {
            aVarC.s(EnumC15908e.f152052b);
        }
        return aVarC.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b o(b bVar) {
        return bVar;
    }

    private final o C(b previous, b current) {
        AbstractC15670i result;
        if (!(current instanceof b.Success)) {
            if (current instanceof b.Error) {
                result = ((b.Error) current).getResult();
            }
            return null;
        }
        result = ((b.Success) current).getResult();
        InterfaceC16606c interfaceC16606cA = result.getRequest().getTransitionFactory().a(h.f61331a, result);
        if (interfaceC16606cA instanceof C16604a) {
            C16604a c16604a = (C16604a) interfaceC16606cA;
            return new o(previous instanceof b.Loading ? previous.getPainter() : null, current.getPainter(), this.contentScale, c16604a.getDurationMillis(), ((result instanceof C15677p) && ((C15677p) result).getIsPlaceholderCached()) ? false : true, c16604a.getPreferExactIntrinsicSize());
        }
        return null;
    }

    private final void D(float f10) {
        this.alpha.A(f10);
    }

    private final void E(C5490r0 c5490r0) {
        this.colorFilter.setValue(c5490r0);
    }

    private final void J(Z0.c cVar) {
        this.painter.setValue(cVar);
    }

    private final void M(b bVar) {
        this.state.setValue(bVar);
    }

    private final void O(Z0.c cVar) {
        this._painter = cVar;
        J(cVar);
    }

    private final void P(b bVar) {
        this._state = bVar;
        M(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Z0.c Q(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? Z0.b.b(M.c(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.filterQuality, 6, null) : new C16103a(drawable.mutate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b R(AbstractC15670i abstractC15670i) {
        if (abstractC15670i instanceof C15677p) {
            C15677p c15677p = (C15677p) abstractC15670i;
            return new b.Success(Q(c15677p.getDrawable()), c15677p);
        }
        if (!(abstractC15670i instanceof C15667f)) {
            throw new NoWhenBranchMatchedException();
        }
        C15667f c15667f = (C15667f) abstractC15670i;
        Drawable drawable = c15667f.getDrawable();
        return new b.Error(drawable != null ? Q(drawable) : null, c15667f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(b input) {
        b bVar = this._state;
        b bVarInvoke = this.transform.invoke(input);
        P(bVarInvoke);
        Z0.c cVarC = C(bVar, bVarInvoke);
        if (cVarC == null) {
            cVarC = bVarInvoke.getPainter();
        }
        O(cVarC);
        if (this.rememberScope != null && bVar.getPainter() != bVarInvoke.getPainter()) {
            Object painter = bVar.getPainter();
            N0 n02 = painter instanceof N0 ? (N0) painter : null;
            if (n02 != null) {
                n02.f();
            }
            Object painter2 = bVarInvoke.getPainter();
            N0 n03 = painter2 instanceof N0 ? (N0) painter2 : null;
            if (n03 != null) {
                n03.b();
            }
        }
        Function1<? super b, Unit> function1 = this.onState;
        if (function1 != null) {
            function1.invoke(bVarInvoke);
        }
    }

    private final void v() {
        InterfaceC15783O interfaceC15783O = this.rememberScope;
        if (interfaceC15783O != null) {
            C15784P.f(interfaceC15783O, null, 1, null);
        }
        this.rememberScope = null;
    }

    private final float w() {
        return this.alpha.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C5490r0 x() {
        return (C5490r0) this.colorFilter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Z0.c z() {
        return (Z0.c) this.painter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C15669h A() {
        return (C15669h) this.request.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b B() {
        return (b) this.state.getValue();
    }

    public final void F(InterfaceC5926k interfaceC5926k) {
        this.contentScale = interfaceC5926k;
    }

    public final void G(int i10) {
        this.filterQuality = i10;
    }

    public final void H(a5.h hVar) {
        this.imageLoader.setValue(hVar);
    }

    public final void I(Function1<? super b, Unit> function1) {
        this.onState = function1;
    }

    public final void K(boolean z10) {
        this.isPreview = z10;
    }

    public final void L(C15669h c15669h) {
        this.request.setValue(c15669h);
    }

    public final void N(Function1<? super b, ? extends b> function1) {
        this.transform = function1;
    }

    @Override // androidx.compose.runtime.N0
    public void b() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.rememberScope == null) {
                InterfaceC15783O interfaceC15783OA = C15784P.a(X0.b(null, 1, null).n0(C15800f0.c().X0()));
                this.rememberScope = interfaceC15783OA;
                Object obj = this._painter;
                N0 n02 = obj instanceof N0 ? (N0) obj : null;
                if (n02 != null) {
                    n02.b();
                }
                if (this.isPreview) {
                    Drawable drawableF = C15669h.R(A(), null, 1, null).g(y().getDefaults()).c().F();
                    T(new b.Loading(drawableF != null ? Q(drawableF) : null));
                } else {
                    C15809k.d(interfaceC15783OA, null, null, new c(null), 3, null);
                }
            }
            Unit unit = Unit.f143329a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // Z0.c
    protected void m(X0.f fVar) {
        this.drawSize.setValue(U0.k.c(fVar.b()));
        Z0.c cVarZ = z();
        if (cVarZ != null) {
            cVarZ.j(fVar, fVar.b(), w(), x());
        }
    }

    public final a5.h y() {
        return (a5.h) this.imageLoader.getValue();
    }

    public C6487f(C15669h c15669h, a5.h hVar) {
        b.a aVar = b.a.f61311a;
        this._state = aVar;
        this.transform = f61295w;
        this.contentScale = InterfaceC5926k.INSTANCE.e();
        this.filterQuality = X0.f.INSTANCE.b();
        this.state = t1.e(aVar, null, 2, null);
        this.request = t1.e(c15669h, null, 2, null);
        this.imageLoader = t1.e(hVar, null, 2, null);
    }

    @Override // Z0.c
    protected boolean a(float alpha) {
        D(alpha);
        return true;
    }

    @Override // Z0.c
    protected boolean c(C5490r0 colorFilter) {
        E(colorFilter);
        return true;
    }

    @Override // androidx.compose.runtime.N0
    public void e() {
        N0 n02;
        v();
        Object obj = this._painter;
        if (obj instanceof N0) {
            n02 = (N0) obj;
        } else {
            n02 = null;
        }
        if (n02 != null) {
            n02.e();
        }
    }

    @Override // androidx.compose.runtime.N0
    public void f() {
        N0 n02;
        v();
        Object obj = this._painter;
        if (obj instanceof N0) {
            n02 = (N0) obj;
        } else {
            n02 = null;
        }
        if (n02 != null) {
            n02.f();
        }
    }

    @Override // Z0.c
    public long k() {
        Z0.c cVarZ = z();
        if (cVarZ != null) {
            return cVarZ.k();
        }
        return U0.k.INSTANCE.a();
    }
}
