package androidx.compose.foundation.layout;

import P0.e;
import androidx.compose.ui.layout.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u000b2\u00020\u0001:\u0007\u000b\r\u0010\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H ¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/m;", "", "<init>", "()V", "", "size", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/layout/f0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILH1/t;Landroidx/compose/ui/layout/f0;I)I", "b", "(Landroidx/compose/ui/layout/f0;)Ljava/lang/Integer;", "", "c", "()Z", "isRelative", "d", "e", "f", "g", "Landroidx/compose/foundation/layout/m$a;", "Landroidx/compose/foundation/layout/m$b;", "Landroidx/compose/foundation/layout/m$d;", "Landroidx/compose/foundation/layout/m$e;", "Landroidx/compose/foundation/layout/m$f;", "Landroidx/compose/foundation/layout/m$g;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5809m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC5809m f48848b = b.f48852e;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC5809m f48849c = f.f48855e;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC5809m f48850d = d.f48853e;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/m$a;", "Landroidx/compose/foundation/layout/m;", "Landroidx/compose/foundation/layout/c;", "alignmentLineProvider", "<init>", "(Landroidx/compose/foundation/layout/c;)V", "Landroidx/compose/ui/layout/f0;", "placeable", "", "b", "(Landroidx/compose/ui/layout/f0;)Ljava/lang/Integer;", "size", "LH1/t;", "layoutDirection", "beforeCrossAxisAlignmentLine", "a", "(ILH1/t;Landroidx/compose/ui/layout/f0;I)I", "e", "Landroidx/compose/foundation/layout/c;", "getAlignmentLineProvider", "()Landroidx/compose/foundation/layout/c;", "", "c", "()Z", "isRelative", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.m$a */
    private static final class a extends AbstractC5809m {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final AbstractC5799c alignmentLineProvider;

        public a(AbstractC5799c abstractC5799c) {
            super(null);
            this.alignmentLineProvider = abstractC5799c;
        }

        @Override // androidx.compose.foundation.layout.AbstractC5809m
        public boolean c() {
            return true;
        }

        @Override // androidx.compose.foundation.layout.AbstractC5809m
        public int a(int size, H1.t layoutDirection, f0 placeable, int beforeCrossAxisAlignmentLine) {
            int iA = this.alignmentLineProvider.a(placeable);
            if (iA == Integer.MIN_VALUE) {
                return 0;
            }
            int i10 = beforeCrossAxisAlignmentLine - iA;
            return layoutDirection == H1.t.f13339b ? size - i10 : i10;
        }

        @Override // androidx.compose.foundation.layout.AbstractC5809m
        public Integer b(f0 placeable) {
            return Integer.valueOf(this.alignmentLineProvider.a(placeable));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/m$b;", "Landroidx/compose/foundation/layout/m;", "<init>", "()V", "", "size", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/layout/f0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILH1/t;Landroidx/compose/ui/layout/f0;I)I", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.m$b */
    private static final class b extends AbstractC5809m {

        /* renamed from: e, reason: collision with root package name */
        public static final b f48852e = new b();

        private b() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.AbstractC5809m
        public int a(int size, H1.t layoutDirection, f0 placeable, int beforeCrossAxisAlignmentLine) {
            return size / 2;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/m$c;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/c;", "alignmentLineProvider", "Landroidx/compose/foundation/layout/m;", "a", "(Landroidx/compose/foundation/layout/c;)Landroidx/compose/foundation/layout/m;", "LP0/e$c;", "vertical", "c", "(LP0/e$c;)Landroidx/compose/foundation/layout/m;", "LP0/e$b;", "horizontal", "b", "(LP0/e$b;)Landroidx/compose/foundation/layout/m;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.m$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AbstractC5809m a(AbstractC5799c alignmentLineProvider) {
            return new a(alignmentLineProvider);
        }

        public final AbstractC5809m b(e.b horizontal) {
            return new HorizontalCrossAxisAlignment(horizontal);
        }

        public final AbstractC5809m c(e.c vertical) {
            return new VerticalCrossAxisAlignment(vertical);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/m$d;", "Landroidx/compose/foundation/layout/m;", "<init>", "()V", "", "size", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/layout/f0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILH1/t;Landroidx/compose/ui/layout/f0;I)I", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.m$d */
    private static final class d extends AbstractC5809m {

        /* renamed from: e, reason: collision with root package name */
        public static final d f48853e = new d();

        private d() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.AbstractC5809m
        public int a(int size, H1.t layoutDirection, f0 placeable, int beforeCrossAxisAlignmentLine) {
            if (layoutDirection == H1.t.f13338a) {
                return size;
            }
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/m$e;", "Landroidx/compose/foundation/layout/m;", "LP0/e$b;", "horizontal", "<init>", "(LP0/e$b;)V", "", "size", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/layout/f0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILH1/t;Landroidx/compose/ui/layout/f0;I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "LP0/e$b;", "getHorizontal", "()LP0/e$b;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.m$e, reason: from toString */
    private static final /* data */ class HorizontalCrossAxisAlignment extends AbstractC5809m {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final e.b horizontal;

        public HorizontalCrossAxisAlignment(e.b bVar) {
            super(null);
            this.horizontal = bVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HorizontalCrossAxisAlignment) && Intrinsics.e(this.horizontal, ((HorizontalCrossAxisAlignment) other).horizontal);
        }

        public int hashCode() {
            return this.horizontal.hashCode();
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.horizontal + ')';
        }

        @Override // androidx.compose.foundation.layout.AbstractC5809m
        public int a(int size, H1.t layoutDirection, f0 placeable, int beforeCrossAxisAlignmentLine) {
            return this.horizontal.a(0, size, layoutDirection);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/m$f;", "Landroidx/compose/foundation/layout/m;", "<init>", "()V", "", "size", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/layout/f0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILH1/t;Landroidx/compose/ui/layout/f0;I)I", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.m$f */
    private static final class f extends AbstractC5809m {

        /* renamed from: e, reason: collision with root package name */
        public static final f f48855e = new f();

        private f() {
            super(null);
        }

        @Override // androidx.compose.foundation.layout.AbstractC5809m
        public int a(int size, H1.t layoutDirection, f0 placeable, int beforeCrossAxisAlignmentLine) {
            if (layoutDirection == H1.t.f13338a) {
                return 0;
            }
            return size;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/m$g;", "Landroidx/compose/foundation/layout/m;", "LP0/e$c;", "vertical", "<init>", "(LP0/e$c;)V", "", "size", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/layout/f0;", "placeable", "beforeCrossAxisAlignmentLine", "a", "(ILH1/t;Landroidx/compose/ui/layout/f0;I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "LP0/e$c;", "getVertical", "()LP0/e$c;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.m$g, reason: from toString */
    private static final /* data */ class VerticalCrossAxisAlignment extends AbstractC5809m {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final e.c vertical;

        public VerticalCrossAxisAlignment(e.c cVar) {
            super(null);
            this.vertical = cVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerticalCrossAxisAlignment) && Intrinsics.e(this.vertical, ((VerticalCrossAxisAlignment) other).vertical);
        }

        public int hashCode() {
            return this.vertical.hashCode();
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.vertical + ')';
        }

        @Override // androidx.compose.foundation.layout.AbstractC5809m
        public int a(int size, H1.t layoutDirection, f0 placeable, int beforeCrossAxisAlignmentLine) {
            return this.vertical.a(0, size);
        }
    }

    public /* synthetic */ AbstractC5809m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int a(int size, H1.t layoutDirection, f0 placeable, int beforeCrossAxisAlignmentLine);

    public Integer b(f0 placeable) {
        return null;
    }

    public boolean c() {
        return false;
    }

    private AbstractC5809m() {
    }
}
