package androidx.compose.foundation.layout;

import P0.e;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005215\u001c B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001e\u0010\u001bJ/\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ/\u0010 \u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b \u0010\u001bJ/\u0010!\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b!\u0010\u001bR \u0010'\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u0003\u001a\u0004\b$\u0010%R \u0010*\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010#\u0012\u0004\b)\u0010\u0003\u001a\u0004\b(\u0010%R \u00100\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010\u0003\u001a\u0004\b-\u0010.R \u00104\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010,\u0012\u0004\b3\u0010\u0003\u001a\u0004\b2\u0010.R \u00109\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b8\u0010\u0003\u001a\u0004\b\"\u00107R \u0010;\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u00106\u0012\u0004\b:\u0010\u0003\u001a\u0004\b5\u00107R \u0010=\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u00106\u0012\u0004\b<\u0010\u0003\u001a\u0004\b1\u00107R \u0010?\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u00106\u0012\u0004\b>\u0010\u0003\u001a\u0004\b+\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"Landroidx/compose/foundation/layout/d;", "", "<init>", "()V", "LH1/h;", "space", "Landroidx/compose/foundation/layout/d$f;", "o", "(F)Landroidx/compose/foundation/layout/d$f;", "LP0/e$b;", "alignment", "Landroidx/compose/foundation/layout/d$e;", "p", "(FLP0/e$b;)Landroidx/compose/foundation/layout/d$e;", "LP0/e$c;", "Landroidx/compose/foundation/layout/d$m;", "q", "(FLP0/e$c;)Landroidx/compose/foundation/layout/d$m;", "", "totalSize", "", "size", "outPosition", "", "reverseInput", "", "k", "(I[I[IZ)V", "j", "([I[IZ)V", "i", "n", "m", "l", "b", "Landroidx/compose/foundation/layout/d$e;", "g", "()Landroidx/compose/foundation/layout/d$e;", "getStart$annotations", "Start", "c", "getEnd$annotations", "End", "d", "Landroidx/compose/foundation/layout/d$m;", "h", "()Landroidx/compose/foundation/layout/d$m;", "getTop$annotations", "Top", "e", "a", "getBottom$annotations", "Bottom", "f", "Landroidx/compose/foundation/layout/d$f;", "()Landroidx/compose/foundation/layout/d$f;", "getCenter$annotations", "Center", "getSpaceEvenly$annotations", "SpaceEvenly", "getSpaceBetween$annotations", "SpaceBetween", "getSpaceAround$annotations", "SpaceAround", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.layout.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5800d {

    /* renamed from: a, reason: collision with root package name */
    public static final C5800d f48779a = new C5800d();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final e Start = new k();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final e End = new C1012d();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final m Top = new l();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final m Bottom = new b();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final f Center = new c();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final f SpaceEvenly = new i();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final f SpaceBetween = new h();

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final f SpaceAround = new g();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\f\u0010\rR \u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\rR \u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\n\u0010\rR \u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\rR \u0010\u001d\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\rR \u0010!\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u000b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/d$a;", "", "<init>", "()V", "LH1/h;", "space", "Landroidx/compose/foundation/layout/d$f;", "c", "(F)Landroidx/compose/foundation/layout/d$f;", "Landroidx/compose/foundation/layout/d$e;", "b", "Landroidx/compose/foundation/layout/d$e;", "a", "()Landroidx/compose/foundation/layout/d$e;", "getLeft$annotations", "Left", "getCenter", "getCenter$annotations", "Center", "d", "getRight$annotations", "Right", "e", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceBetween", "f", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceEvenly", "g", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f48788a = new a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final e Left = new b();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final e Center = new C1010a();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final e Right = new c();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final e SpaceBetween = new e();

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final e SpaceEvenly = new f();

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final e SpaceAround = new C1011d();

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$a$a", "Landroidx/compose/foundation/layout/d$e;", "LH1/d;", "", "totalSize", "", "sizes", "LH1/t;", "layoutDirection", "outPositions", "", "c", "(LH1/d;I[ILH1/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.d$a$a, reason: collision with other inner class name */
        public static final class C1010a implements e {
            @Override // androidx.compose.foundation.layout.C5800d.e
            public void c(H1.d dVar, int i10, int[] iArr, H1.t tVar, int[] iArr2) {
                C5800d.f48779a.i(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }

            C1010a() {
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$a$b", "Landroidx/compose/foundation/layout/d$e;", "LH1/d;", "", "totalSize", "", "sizes", "LH1/t;", "layoutDirection", "outPositions", "", "c", "(LH1/d;I[ILH1/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.d$a$b */
        public static final class b implements e {
            @Override // androidx.compose.foundation.layout.C5800d.e
            public void c(H1.d dVar, int i10, int[] iArr, H1.t tVar, int[] iArr2) {
                C5800d.f48779a.j(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }

            b() {
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$a$c", "Landroidx/compose/foundation/layout/d$e;", "LH1/d;", "", "totalSize", "", "sizes", "LH1/t;", "layoutDirection", "outPositions", "", "c", "(LH1/d;I[ILH1/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.d$a$c */
        public static final class c implements e {
            @Override // androidx.compose.foundation.layout.C5800d.e
            public void c(H1.d dVar, int i10, int[] iArr, H1.t tVar, int[] iArr2) {
                C5800d.f48779a.k(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }

            c() {
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$a$d", "Landroidx/compose/foundation/layout/d$e;", "LH1/d;", "", "totalSize", "", "sizes", "LH1/t;", "layoutDirection", "outPositions", "", "c", "(LH1/d;I[ILH1/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.d$a$d, reason: collision with other inner class name */
        public static final class C1011d implements e {
            @Override // androidx.compose.foundation.layout.C5800d.e
            public void c(H1.d dVar, int i10, int[] iArr, H1.t tVar, int[] iArr2) {
                C5800d.f48779a.l(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }

            C1011d() {
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$a$e", "Landroidx/compose/foundation/layout/d$e;", "LH1/d;", "", "totalSize", "", "sizes", "LH1/t;", "layoutDirection", "outPositions", "", "c", "(LH1/d;I[ILH1/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.d$a$e */
        public static final class e implements e {
            @Override // androidx.compose.foundation.layout.C5800d.e
            public void c(H1.d dVar, int i10, int[] iArr, H1.t tVar, int[] iArr2) {
                C5800d.f48779a.m(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }

            e() {
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$a$f", "Landroidx/compose/foundation/layout/d$e;", "LH1/d;", "", "totalSize", "", "sizes", "LH1/t;", "layoutDirection", "outPositions", "", "c", "(LH1/d;I[ILH1/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.d$a$f */
        public static final class f implements e {
            @Override // androidx.compose.foundation.layout.C5800d.e
            public void c(H1.d dVar, int i10, int[] iArr, H1.t tVar, int[] iArr2) {
                C5800d.f48779a.n(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }

            f() {
            }
        }

        public final e a() {
            return Left;
        }

        public final e b() {
            return Right;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final f c(float space) {
            return new j(space, false, null, 0 == true ? 1 : 0);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/d$b", "Landroidx/compose/foundation/layout/d$m;", "LH1/d;", "", "totalSize", "", "sizes", "outPositions", "", "b", "(LH1/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$b */
    public static final class b implements m {
        @Override // androidx.compose.foundation.layout.C5800d.m
        public void b(H1.d dVar, int i10, int[] iArr, int[] iArr2) {
            C5800d.f48779a.k(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }

        b() {
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/d$c", "Landroidx/compose/foundation/layout/d$f;", "LH1/d;", "", "totalSize", "", "sizes", "LH1/t;", "layoutDirection", "outPositions", "", "c", "(LH1/d;I[ILH1/t;[I)V", "b", "(LH1/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "LH1/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.d$c */
    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = H1.h.p(0);

        @Override // androidx.compose.foundation.layout.C5800d.e, androidx.compose.foundation.layout.C5800d.m
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.C5800d.m
        public void b(H1.d dVar, int i10, int[] iArr, int[] iArr2) {
            C5800d.f48779a.i(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C5800d.e
        public void c(H1.d dVar, int i10, int[] iArr, H1.t tVar, int[] iArr2) {
            if (tVar == H1.t.f13338a) {
                C5800d.f48779a.i(i10, iArr, iArr2, false);
            } else {
                C5800d.f48779a.i(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Center";
        }

        c() {
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$d", "Landroidx/compose/foundation/layout/d$e;", "LH1/d;", "", "totalSize", "", "sizes", "LH1/t;", "layoutDirection", "outPositions", "", "c", "(LH1/d;I[ILH1/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$d, reason: collision with other inner class name */
    public static final class C1012d implements e {
        @Override // androidx.compose.foundation.layout.C5800d.e
        public void c(H1.d dVar, int i10, int[] iArr, H1.t tVar, int[] iArr2) {
            if (tVar == H1.t.f13338a) {
                C5800d.f48779a.k(i10, iArr, iArr2, false);
            } else {
                C5800d.f48779a.j(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }

        C1012d() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/d$e;", "", "LH1/d;", "", "totalSize", "", "sizes", "LH1/t;", "layoutDirection", "outPositions", "", "c", "(LH1/d;I[ILH1/t;[I)V", "LH1/h;", "a", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.d$e */
    public interface e {
        /* renamed from: a */
        default float getSpacing() {
            return H1.h.p(0);
        }

        void c(H1.d dVar, int i10, int[] iArr, H1.t tVar, int[] iArr2);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/d$f;", "Landroidx/compose/foundation/layout/d$e;", "Landroidx/compose/foundation/layout/d$m;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.d$f */
    public interface f extends e, m {
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/d$g", "Landroidx/compose/foundation/layout/d$f;", "LH1/d;", "", "totalSize", "", "sizes", "LH1/t;", "layoutDirection", "outPositions", "", "c", "(LH1/d;I[ILH1/t;[I)V", "b", "(LH1/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "LH1/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.d$g */
    public static final class g implements f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = H1.h.p(0);

        @Override // androidx.compose.foundation.layout.C5800d.e, androidx.compose.foundation.layout.C5800d.m
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.C5800d.m
        public void b(H1.d dVar, int i10, int[] iArr, int[] iArr2) {
            C5800d.f48779a.l(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C5800d.e
        public void c(H1.d dVar, int i10, int[] iArr, H1.t tVar, int[] iArr2) {
            if (tVar == H1.t.f13338a) {
                C5800d.f48779a.l(i10, iArr, iArr2, false);
            } else {
                C5800d.f48779a.l(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }

        g() {
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/d$h", "Landroidx/compose/foundation/layout/d$f;", "LH1/d;", "", "totalSize", "", "sizes", "LH1/t;", "layoutDirection", "outPositions", "", "c", "(LH1/d;I[ILH1/t;[I)V", "b", "(LH1/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "LH1/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.d$h */
    public static final class h implements f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = H1.h.p(0);

        @Override // androidx.compose.foundation.layout.C5800d.e, androidx.compose.foundation.layout.C5800d.m
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.C5800d.m
        public void b(H1.d dVar, int i10, int[] iArr, int[] iArr2) {
            C5800d.f48779a.m(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C5800d.e
        public void c(H1.d dVar, int i10, int[] iArr, H1.t tVar, int[] iArr2) {
            if (tVar == H1.t.f13338a) {
                C5800d.f48779a.m(i10, iArr, iArr2, false);
            } else {
                C5800d.f48779a.m(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }

        h() {
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/layout/d$i", "Landroidx/compose/foundation/layout/d$f;", "LH1/d;", "", "totalSize", "", "sizes", "LH1/t;", "layoutDirection", "outPositions", "", "c", "(LH1/d;I[ILH1/t;[I)V", "b", "(LH1/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "LH1/h;", "a", "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.d$i */
    public static final class i implements f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = H1.h.p(0);

        @Override // androidx.compose.foundation.layout.C5800d.e, androidx.compose.foundation.layout.C5800d.m
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.C5800d.m
        public void b(H1.d dVar, int i10, int[] iArr, int[] iArr2) {
            C5800d.f48779a.n(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C5800d.e
        public void c(H1.d dVar, int i10, int[] iArr, H1.t tVar, int[] iArr2) {
            if (tVar == H1.t.f13338a) {
                C5800d.f48779a.n(i10, iArr, iArr2, false);
            } else {
                C5800d.f48779a.n(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }

        i() {
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001a\u00020\u0012*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&R+\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)R \u0010+\u001a\u00020\u00028\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b \u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/d$j;", "Landroidx/compose/foundation/layout/d$f;", "LH1/h;", "space", "", "rtlMirror", "Lkotlin/Function2;", "", "LH1/t;", "alignment", "<init>", "(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LH1/d;", "totalSize", "", "sizes", "layoutDirection", "outPositions", "", "c", "(LH1/d;I[ILH1/t;[I)V", "b", "(LH1/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getSpace-D9Ej5fM", "()F", "Z", "getRtlMirror", "()Z", "Lkotlin/jvm/functions/Function2;", "getAlignment", "()Lkotlin/jvm/functions/Function2;", "d", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.d$j */
    public static final /* data */ class j implements f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float space;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean rtlMirror;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Function2<Integer, H1.t, Integer> alignment;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float spacing;

        public /* synthetic */ j(float f10, boolean z10, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, z10, function2);
        }

        @Override // androidx.compose.foundation.layout.C5800d.e
        public void c(H1.d dVar, int i10, int[] iArr, H1.t tVar, int[] iArr2) {
            int i11;
            int iMin;
            if (iArr.length == 0) {
                return;
            }
            int iE0 = dVar.E0(this.space);
            boolean z10 = this.rtlMirror && tVar == H1.t.f13339b;
            C5800d c5800d = C5800d.f48779a;
            if (z10) {
                i11 = 0;
                iMin = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i12 = iArr[length];
                    int iMin2 = Math.min(i11, i10 - i12);
                    iArr2[length] = iMin2;
                    iMin = Math.min(iE0, (i10 - iMin2) - i12);
                    i11 = iArr2[length] + i12 + iMin;
                }
            } else {
                int length2 = iArr.length;
                int i13 = 0;
                i11 = 0;
                iMin = 0;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = iArr[i13];
                    int iMin3 = Math.min(i11, i10 - i15);
                    iArr2[i14] = iMin3;
                    int iMin4 = Math.min(iE0, (i10 - iMin3) - i15);
                    int i16 = iArr2[i14] + i15 + iMin4;
                    i13++;
                    iMin = iMin4;
                    i11 = i16;
                    i14++;
                }
            }
            int i17 = i11 - iMin;
            Function2<Integer, H1.t, Integer> function2 = this.alignment;
            if (function2 == null || i17 >= i10) {
                return;
            }
            int iIntValue = function2.invoke(Integer.valueOf(i10 - i17), tVar).intValue();
            int length3 = iArr2.length;
            for (int i18 = 0; i18 < length3; i18++) {
                iArr2[i18] = iArr2[i18] + iIntValue;
            }
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return H1.h.u(this.space, jVar.space) && this.rtlMirror == jVar.rtlMirror && Intrinsics.e(this.alignment, jVar.alignment);
        }

        public int hashCode() {
            int iW = ((H1.h.w(this.space) * 31) + Boolean.hashCode(this.rtlMirror)) * 31;
            Function2<Integer, H1.t, Integer> function2 = this.alignment;
            return iW + (function2 == null ? 0 : function2.hashCode());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private j(float f10, boolean z10, Function2<? super Integer, ? super H1.t, Integer> function2) {
            this.space = f10;
            this.rtlMirror = z10;
            this.alignment = function2;
            this.spacing = f10;
        }

        @Override // androidx.compose.foundation.layout.C5800d.e, androidx.compose.foundation.layout.C5800d.m
        /* renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.C5800d.m
        public void b(H1.d dVar, int i10, int[] iArr, int[] iArr2) {
            c(dVar, i10, iArr, H1.t.f13338a, iArr2);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.rtlMirror ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append((Object) H1.h.z(this.space));
            sb2.append(", ");
            sb2.append(this.alignment);
            sb2.append(')');
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/compose/foundation/layout/d$k", "Landroidx/compose/foundation/layout/d$e;", "LH1/d;", "", "totalSize", "", "sizes", "LH1/t;", "layoutDirection", "outPositions", "", "c", "(LH1/d;I[ILH1/t;[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$k */
    public static final class k implements e {
        @Override // androidx.compose.foundation.layout.C5800d.e
        public void c(H1.d dVar, int i10, int[] iArr, H1.t tVar, int[] iArr2) {
            if (tVar == H1.t.f13338a) {
                C5800d.f48779a.j(iArr, iArr2, false);
            } else {
                C5800d.f48779a.k(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }

        k() {
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/d$l", "Landroidx/compose/foundation/layout/d$m;", "LH1/d;", "", "totalSize", "", "sizes", "outPositions", "", "b", "(LH1/d;I[I[I)V", "", "toString", "()Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.d$l */
    public static final class l implements m {
        @Override // androidx.compose.foundation.layout.C5800d.m
        public void b(H1.d dVar, int i10, int[] iArr, int[] iArr2) {
            C5800d.f48779a.j(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }

        l() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/d$m;", "", "LH1/d;", "", "totalSize", "", "sizes", "outPositions", "", "b", "(LH1/d;I[I[I)V", "LH1/h;", "a", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.d$m */
    public interface m {
        /* renamed from: a */
        default float getSpacing() {
            return H1.h.p(0);
        }

        void b(H1.d dVar, int i10, int[] iArr, int[] iArr2);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "LH1/t;", "layoutDirection", "a", "(ILH1/t;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.d$n */
    static final class n extends Lambda implements Function2<Integer, H1.t, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final n f48803f = new n();

        n() {
            super(2);
        }

        public final Integer a(int i10, H1.t tVar) {
            return Integer.valueOf(P0.e.INSTANCE.k().a(0, i10, tVar));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, H1.t tVar) {
            return a(num.intValue(), tVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "LH1/t;", "layoutDirection", "a", "(ILH1/t;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.d$o */
    static final class o extends Lambda implements Function2<Integer, H1.t, Integer> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.b f48804f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(e.b bVar) {
            super(2);
            this.f48804f = bVar;
        }

        public final Integer a(int i10, H1.t tVar) {
            return Integer.valueOf(this.f48804f.a(0, i10, tVar));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, H1.t tVar) {
            return a(num.intValue(), tVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "size", "LH1/t;", "<anonymous parameter 1>", "a", "(ILH1/t;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.d$p */
    static final class p extends Lambda implements Function2<Integer, H1.t, Integer> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.c f48805f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(e.c cVar) {
            super(2);
            this.f48805f = cVar;
        }

        public final Integer a(int i10, H1.t tVar) {
            return Integer.valueOf(this.f48805f.a(0, i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, H1.t tVar) {
            return a(num.intValue(), tVar);
        }
    }

    public final void i(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float f10 = (totalSize - i11) / 2;
        if (!reverseInput) {
            int length = size.length;
            int i13 = 0;
            while (i10 < length) {
                int i14 = size[i10];
                outPosition[i13] = Math.round(f10);
                f10 += i14;
                i10++;
                i13++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = size[length2];
            outPosition[length2] = Math.round(f10);
            f10 += i15;
        }
    }

    public final void j(int[] size, int[] outPosition, boolean reverseInput) {
        int i10 = 0;
        if (!reverseInput) {
            int length = size.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = size[i10];
                outPosition[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = size[length2];
            outPosition[length2] = i10;
            i10 += i14;
        }
    }

    public final void k(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        int i13 = totalSize - i11;
        if (!reverseInput) {
            int length = size.length;
            int i14 = 0;
            while (i10 < length) {
                int i15 = size[i10];
                outPosition[i14] = i13;
                i13 += i15;
                i10++;
                i14++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = size[length2];
            outPosition[length2] = i13;
            i13 += i16;
        }
    }

    public final void l(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float length = !(size.length == 0) ? (totalSize - i11) / size.length : 0.0f;
        float f10 = length / 2;
        if (reverseInput) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i13 = size[length2];
                outPosition[length2] = Math.round(f10);
                f10 += i13 + length;
            }
            return;
        }
        int length3 = size.length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = size[i10];
            outPosition[i14] = Math.round(f10);
            f10 += i15 + length;
            i10++;
            i14++;
        }
    }

    public final void m(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        if (size.length == 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float fMax = (totalSize - i11) / Math.max(ArraysKt.k0(size), 1);
        float f10 = (reverseInput && size.length == 1) ? fMax : 0.0f;
        if (reverseInput) {
            for (int length = size.length - 1; -1 < length; length--) {
                int i13 = size[length];
                outPosition[length] = Math.round(f10);
                f10 += i13 + fMax;
            }
            return;
        }
        int length2 = size.length;
        int i14 = 0;
        while (i10 < length2) {
            int i15 = size[i10];
            outPosition[i14] = Math.round(f10);
            f10 += i15 + fMax;
            i10++;
            i14++;
        }
    }

    public final void n(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float length = (totalSize - i11) / (size.length + 1);
        if (reverseInput) {
            float f10 = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i13 = size[length2];
                outPosition[length2] = Math.round(f10);
                f10 += i13 + length;
            }
            return;
        }
        int length3 = size.length;
        float f11 = length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = size[i10];
            outPosition[i14] = Math.round(f11);
            f11 += i15 + length;
            i10++;
            i14++;
        }
    }

    public final m a() {
        return Bottom;
    }

    public final f b() {
        return Center;
    }

    public final e c() {
        return End;
    }

    public final f d() {
        return SpaceAround;
    }

    public final f e() {
        return SpaceBetween;
    }

    public final f f() {
        return SpaceEvenly;
    }

    public final e g() {
        return Start;
    }

    public final m h() {
        return Top;
    }

    public final f o(float space) {
        return new j(space, true, n.f48803f, null);
    }

    public final e p(float space, e.b alignment) {
        return new j(space, true, new o(alignment), null);
    }

    public final m q(float space, e.c alignment) {
        return new j(space, false, new p(alignment), null);
    }

    private C5800d() {
    }
}
