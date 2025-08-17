package oc;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Deprecated;
import kotlin.InterfaceC13820s;
import kotlin.InterfaceC6326i;
import kotlin.InterfaceC6342y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.y;

@Deprecated
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0082\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2<\u0010\u0014\u001a8\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000f0\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001dRV\u0010%\u001a8\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000f0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010\u0003\u001a\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Loc/c;", "", "<init>", "()V", "Loc/g;", "state", "Lc0/y;", "", "decayAnimationSpec", "Lc0/i;", "snapAnimationSpec", "LH1/h;", "endContentPadding", "Lkotlin/Function3;", "LCu/h;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "snapIndex", "Lf0/s;", "b", "(Loc/g;Lc0/y;Lc0/i;FLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lf0/s;", "a", "(Loc/g;Lc0/y;Lc0/i;FLandroidx/compose/runtime/Composer;II)Lf0/s;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getSinglePageFlingDistance", "()Lkotlin/jvm/functions/Function1;", "getSinglePageFlingDistance$annotations", "singlePageFlingDistance", "c", "Lkotlin/jvm/functions/Function3;", "getSinglePageSnapIndex", "()Lkotlin/jvm/functions/Function3;", "getSinglePageSnapIndex$annotations", "singlePageSnapIndex", "pager_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: oc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16014c {

    /* renamed from: a, reason: collision with root package name */
    public static final C16014c f153306a = new C16014c();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Function1<Cu.h, Float> singlePageFlingDistance = a.f153310f;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Function3<Cu.h, Integer, Integer, Integer> singlePageSnapIndex = b.f153311f;

    /* renamed from: d, reason: collision with root package name */
    public static final int f153309d = 0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LCu/h;", "layoutInfo", "", "a", "(LCu/h;)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oc.c$a */
    static final class a extends Lambda implements Function1<Cu.h, Float> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f153310f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke(Cu.h layoutInfo) {
            Intrinsics.j(layoutInfo, "layoutInfo");
            return Float.valueOf(layoutInfo.f() - layoutInfo.getStartScrollOffset());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LCu/h;", "layoutInfo", "", "startIndex", "targetIndex", "a", "(LCu/h;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oc.c$b */
    static final class b extends Lambda implements Function3<Cu.h, Integer, Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f153311f = new b();

        b() {
            super(3);
        }

        public final Integer a(Cu.h layoutInfo, int i10, int i11) {
            Intrinsics.j(layoutInfo, "layoutInfo");
            return Integer.valueOf(RangesKt.o(RangesKt.o(i11, i10 - 1, i10 + 1), 0, layoutInfo.h() - 1));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(Cu.h hVar, Integer num, Integer num2) {
            return a(hVar, num.intValue(), num2.intValue());
        }
    }

    @Deprecated
    public final InterfaceC13820s a(PagerState state, InterfaceC6342y<Float> interfaceC6342y, InterfaceC6326i<Float> interfaceC6326i, float f10, Composer composer, int i10, int i11) {
        Intrinsics.j(state, "state");
        composer.startReplaceableGroup(132228799);
        InterfaceC6342y<Float> interfaceC6342yB = (i11 & 2) != 0 ? y.b(composer, 0) : interfaceC6342y;
        InterfaceC6326i<Float> interfaceC6326iC = (i11 & 4) != 0 ? Cu.f.f4962a.c() : interfaceC6326i;
        float fP = (i11 & 8) != 0 ? H1.h.p(0) : f10;
        if (ComposerKt.M()) {
            ComposerKt.U(132228799, i10, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:220)");
        }
        InterfaceC13820s interfaceC13820sB = b(state, interfaceC6342yB, interfaceC6326iC, fP, singlePageSnapIndex, composer, (i10 & 14) | 576 | (i10 & 7168) | ((i10 << 3) & 458752), 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.U();
        return interfaceC13820sB;
    }

    @Deprecated
    public final InterfaceC13820s b(PagerState state, InterfaceC6342y<Float> interfaceC6342y, InterfaceC6326i<Float> interfaceC6326i, float f10, Function3<? super Cu.h, ? super Integer, ? super Integer, Integer> snapIndex, Composer composer, int i10, int i11) {
        Intrinsics.j(state, "state");
        Intrinsics.j(snapIndex, "snapIndex");
        composer.startReplaceableGroup(-776119664);
        if ((i11 & 2) != 0) {
            interfaceC6342y = y.b(composer, 0);
        }
        if ((i11 & 4) != 0) {
            interfaceC6326i = Cu.f.f4962a.c();
        }
        InterfaceC6326i<Float> interfaceC6326i2 = interfaceC6326i;
        if ((i11 & 8) != 0) {
            f10 = H1.h.p(0);
        }
        float f11 = f10;
        if (ComposerKt.M()) {
            ComposerKt.U(-776119664, i10, -1, "com.google.accompanist.pager.PagerDefaults.flingBehavior (Pager.kt:181)");
        }
        Cu.e eVarC = Cu.a.c(state.getLazyListState(), Cu.d.f4921a.b(), f11, interfaceC6342y, interfaceC6326i2, snapIndex, composer, ((i10 >> 3) & 896) | 36864 | (458752 & (i10 << 3)), 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.U();
        return eVarC;
    }

    private C16014c() {
    }
}
