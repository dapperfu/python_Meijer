package androidx.compose.foundation.layout;

import P0.e;
import androidx.compose.ui.node.Y;
import j0.EnumC14819k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/foundation/layout/N;", "Lj0/k;", "direction", "", "unbounded", "Lkotlin/Function2;", "LH1/r;", "LH1/t;", "LH1/n;", "alignmentCallback", "", "align", "", "inspectorName", "<init>", "(Lj0/k;ZLkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/String;)V", "n", "()Landroidx/compose/foundation/layout/N;", "node", "", "o", "(Landroidx/compose/foundation/layout/N;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lj0/k;", "c", "Z", "d", "Lkotlin/jvm/functions/Function2;", "e", "Ljava/lang/Object;", "f", "Ljava/lang/String;", "g", "a", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrapContentElement extends Y<N> {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC14819k direction;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean unbounded;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function2<H1.r, H1.t, H1.n> alignmentCallback;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object align;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String inspectorName;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement$a;", "", "<init>", "()V", "LP0/e$b;", "align", "", "unbounded", "Landroidx/compose/foundation/layout/WrapContentElement;", "c", "(LP0/e$b;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "LP0/e$c;", "a", "(LP0/e$c;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "LP0/e;", "b", "(LP0/e;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LH1/r;", "size", "LH1/t;", "<anonymous parameter 1>", "LH1/n;", "a", "(JLH1/t;)J"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$a, reason: collision with other inner class name */
        static final class C0995a extends Lambda implements Function2<H1.r, H1.t, H1.n> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ e.c f48538f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0995a(e.c cVar) {
                super(2);
                this.f48538f = cVar;
            }

            public final long a(long j10, H1.t tVar) {
                return H1.n.f((0 << 32) | (4294967295L & this.f48538f.a(0, (int) (j10 & 4294967295L))));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ H1.n invoke(H1.r rVar, H1.t tVar) {
                return H1.n.c(a(rVar.getPackedValue(), tVar));
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LH1/r;", "size", "LH1/t;", "layoutDirection", "LH1/n;", "a", "(JLH1/t;)J"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$b */
        static final class b extends Lambda implements Function2<H1.r, H1.t, H1.n> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ P0.e f48539f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(P0.e eVar) {
                super(2);
                this.f48539f = eVar;
            }

            public final long a(long j10, H1.t tVar) {
                return this.f48539f.a(H1.r.INSTANCE.a(), j10, tVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ H1.n invoke(H1.r rVar, H1.t tVar) {
                return H1.n.c(a(rVar.getPackedValue(), tVar));
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LH1/r;", "size", "LH1/t;", "layoutDirection", "LH1/n;", "a", "(JLH1/t;)J"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$c */
        static final class c extends Lambda implements Function2<H1.r, H1.t, H1.n> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ e.b f48540f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e.b bVar) {
                super(2);
                this.f48540f = bVar;
            }

            public final long a(long j10, H1.t tVar) {
                return H1.n.f((0 & 4294967295L) | (this.f48540f.a(0, (int) (j10 >> 32), tVar) << 32));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ H1.n invoke(H1.r rVar, H1.t tVar) {
                return H1.n.c(a(rVar.getPackedValue(), tVar));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WrapContentElement a(e.c align, boolean unbounded) {
            return new WrapContentElement(EnumC14819k.f139121a, unbounded, new C0995a(align), align, "wrapContentHeight");
        }

        public final WrapContentElement b(P0.e align, boolean unbounded) {
            return new WrapContentElement(EnumC14819k.f139123c, unbounded, new b(align), align, "wrapContentSize");
        }

        public final WrapContentElement c(e.b align, boolean unbounded) {
            return new WrapContentElement(EnumC14819k.f139122b, unbounded, new c(align), align, "wrapContentWidth");
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || WrapContentElement.class != other.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) other;
        return this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && Intrinsics.e(this.align, wrapContentElement.align);
    }

    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public N b() {
        return new N(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(N node) {
        node.M2(this.direction);
        node.N2(this.unbounded);
        node.L2(this.alignmentCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(EnumC14819k enumC14819k, boolean z10, Function2<? super H1.r, ? super H1.t, H1.n> function2, Object obj, String str) {
        this.direction = enumC14819k;
        this.unbounded = z10;
        this.alignmentCallback = function2;
        this.align = obj;
        this.inspectorName = str;
    }
}
