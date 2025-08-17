package ti;

import B0.RippleAlpha;
import Ji.C;
import Ji.LocalThemeScope;
import Ji.Q;
import Ji.T;
import P0.e;
import android.annotation.SuppressLint;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5795w;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.semantics.Role;
import com.google.android.gms.common.api.a;
import d0.C13442i;
import d0.InterfaceC13428B;
import j0.C14802K;
import j0.C14815g;
import java.util.Iterator;
import java.util.List;
import ji.InterfaceC14930d0;
import ji.ProductCardTags;
import ji.q1;
import ji.s1;
import kotlin.C17916Y0;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.t1;
import kotlin.text.StringsKt;
import ni.A0;
import ni.P0;
import ni.w1;
import p1.C16190d;
import r0.C16692i;
import r1.C16705m;
import ti.E;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÊ\u0001\u0010\u001a\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a¼\u0001\u0010\u001d\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\r*\u00020\u0000H\u0001¢\u0006\u0004\b$\u0010%\u001aÔ\u0001\u0010&\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072%\b\u0002\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00072\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0016H\u0003¢\u0006\u0004\b&\u0010'\u001aY\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020(2\b\b\u0002\u0010,\u001a\u00020(2\b\b\u0002\u0010-\u001a\u00020\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\u0016H\u0003¢\u0006\u0004\b/\u00100\u001a9\u0010:\u001a\u0004\u0018\u0001092\u0006\u00101\u001a\u00020\u00032\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00106\u001a\u0002052\b\b\u0002\u00108\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;¨\u0006=²\u0006\f\u0010<\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "headingText", "descriptionText", "description2Text", "", "isEnabled", "isChecked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "onClick", "tagText", "LJi/C;", "tagIcon", "LJi/T;", "tagColor", "headingIcon", "actionButtonText", "Lkotlin/Function0;", "onActionButtonClick", "isRadioButtonVisible", "iconTintColor", "G", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;LJi/C;LJi/T;LJi/C;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLJi/T;Landroidx/compose/runtime/Composer;III)V", "heading2Text", "F", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;LJi/C;LJi/T;LJi/C;ZLJi/T;Landroidx/compose/runtime/Composer;III)V", "Lni/w1;", "conditions", "LB0/b;", "q0", "(Lni/w1;)LB0/b;", "J", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "i0", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;LJi/C;LJi/T;LJi/C;LJi/T;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "LH1/h;", "spaceBetweenRadioAndIcon", "spaceBetweenIconAndHeading", "spaceBetweenTagAndHeading", "spaceBetweenDescription1AndDescription2", "drawRadioButton", "content", "D", "(Landroidx/compose/ui/Modifier;FFFFZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "layoutId", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "", "maxWidth", "Landroidx/compose/ui/layout/f0;", "o0", "(Ljava/lang/String;Ljava/util/List;JI)Landroidx/compose/ui/layout/f0;", "isPressed", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class E {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f161753a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f161754b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f161755c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f161756d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f161757e;

        a(boolean z10, float f10, float f11, float f12, float f13) {
            this.f161753a = z10;
            this.f161754b = f10;
            this.f161755c = f11;
            this.f161756d = f12;
            this.f161757e = f13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(boolean z10, f0 f0Var, int i10, f0 f0Var2, int i11, K k10, f0 f0Var3, int i12, f0 f0Var4, int i13, f0 f0Var5, int i14, f0 f0Var6, int i15, f0 f0Var7, int i16, f0 f0Var8, int i17, f0.a layout) {
            Intrinsics.j(layout, "$this$layout");
            if (z10 && f0Var != null) {
                f0.a.l(layout, f0Var, 0, i10, 0.0f, 4, null);
            }
            if (f0Var2 != null) {
                f0.a.l(layout, f0Var2, i11, i10 - k10.E0(H1.h.p(4)), 0.0f, 4, null);
            }
            if (f0Var3 != null) {
                f0.a.l(layout, f0Var3, i12, i10, 0.0f, 4, null);
            }
            if (f0Var4 != null) {
                f0.a.l(layout, f0Var4, i13, i10, 0.0f, 4, null);
            }
            if (f0Var5 != null) {
                f0.a.l(layout, f0Var5, i14, i10, 0.0f, 4, null);
            }
            if (f0Var6 != null) {
                f0.a.l(layout, f0Var6, i15, 0, 0.0f, 4, null);
            }
            if (f0Var7 != null) {
                f0.a.l(layout, f0Var7, i12, i16, 0.0f, 4, null);
            }
            if (f0Var8 != null) {
                f0.a.l(layout, f0Var8, i12, i17, 0.0f, 4, null);
            }
            return Unit.f142422a;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0136  */
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.compose.ui.layout.J d(final androidx.compose.ui.layout.K r23, java.util.List<? extends androidx.compose.ui.layout.I> r24, long r25) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ti.E.a.d(androidx.compose.ui.layout.K, java.util.List, long):androidx.compose.ui.layout.J");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f161758a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f161759b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f161760c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f161761d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h0.l f161762e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f161763f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f161764g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f161765h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f161766i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Ji.C f161767j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f161768k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f161769l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f161770m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f161771n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f161772o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Ji.C f161773p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ T f161774q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ T f161775r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f161776s;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f161777a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f161778b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f161779c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ji.C f161780d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f161781e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f161782f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f161783g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f161784h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ String f161785i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f161786j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Ji.C f161787k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ T f161788l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ boolean f161789m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ T f161790n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ String f161791o;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: ti.E$b$a$a, reason: collision with other inner class name */
            static final class C2534a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ String f161792a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Ji.C f161793b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f161794c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f161795d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ boolean f161796e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ String f161797f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ String f161798g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ String f161799h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f161800i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ Ji.C f161801j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ T f161802k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ boolean f161803l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ T f161804m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ String f161805n;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: ti.E$b$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C2535a extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

                    /* renamed from: h, reason: collision with root package name */
                    public static final C2535a f161806h = new C2535a();

                    C2535a() {
                        super(1, ProductCardTags.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final ProductCardTags invoke(LocalThemeScope p02) {
                        Intrinsics.j(p02, "p0");
                        return new ProductCardTags(p02, null, 2, null);
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: ti.E$b$a$a$b, reason: collision with other inner class name */
                static final class C2536b implements Function3<ProductCardTags, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Ji.C f161807a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f161808b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ boolean f161809c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ T f161810d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ String f161811e;

                    C2536b(Ji.C c10, LocalThemeScope localThemeScope, boolean z10, T t10, String str) {
                        this.f161807a = c10;
                        this.f161808b = localThemeScope;
                        this.f161809c = z10;
                        this.f161810d = t10;
                        this.f161811e = str;
                    }

                    public final void a(ProductCardTags Assemble, Composer composer, int i10) {
                        int i11;
                        Unit unit;
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if ((i10 & 6) == 0) {
                            i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
                        } else {
                            i11 = i10;
                        }
                        if ((i11 & 19) == 18 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1300948665, i11, -1, "com.meijer.mobile.android_acres_library.atomic_providers.selectable_card.SelectableCardImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelectableCard.kt:545)");
                        }
                        Ji.C c10 = this.f161807a;
                        composer.startReplaceGroup(376186800);
                        if (c10 == null) {
                            unit = null;
                        } else {
                            LocalThemeScope localThemeScope = this.f161808b;
                            boolean z10 = this.f161809c;
                            T t10 = this.f161810d;
                            Ji.C c11 = this.f161807a;
                            String str = this.f161811e;
                            q1.Tag pickupOnly = Assemble.getTags().getPickupOnly();
                            T adsColorsDisabled = z10 ? t10 : localThemeScope.getAdsColors().getAdsColorsDisabled();
                            q1.Label label = Assemble.getTags().getPickupOnly().getLabel();
                            T adsColorInverse = localThemeScope.getAdsColors().getAdsColorInverse();
                            Modifier modifier = Assemble.getTags().getPickupOnly().getLabel().getModifier();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            float f10 = 2;
                            q1.Label labelY = q1.Label.y(label, modifier.then(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, H1.h.p(f10), 0.0f, 11, null)), adsColorInverse, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getNine(), null, 380, null);
                            float f11 = 4;
                            Modifier modifierL = androidx.compose.foundation.layout.D.l(companion, H1.h.p(f11), H1.h.p(f11), H1.h.p(f10), H1.h.p(f11));
                            float f12 = 14;
                            Hi.h.h(localThemeScope, q1.Tag.y(pickupOnly, adsColorsDisabled, labelY, new q1.h.DrawableIcon(c11, null, null, null, 0.0f, localThemeScope.getAdsColors().getAdsColorInverse(), J.w(modifierL, H1.h.p(f12), H1.h.p(f12)), 30, null), null, 8, null), str, null, composer, 0, 4);
                            unit = Unit.f142422a;
                        }
                        composer.P();
                        if (unit == null) {
                            Hi.h.h(this.f161808b, q1.Tag.y(Assemble.getTags().getPickupOnly(), this.f161809c ? this.f161810d : this.f161808b.getAdsColors().getAdsColorsDisabled(), q1.Label.y(Assemble.getTags().getPickupOnly().getLabel(), Assemble.getTags().getPickupOnly().getLabel().getModifier().then(androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, H1.h.p(4), 0.0f, 2, null)), this.f161808b.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, this.f161808b.getAdsTypography().getHeadings().getNine(), null, 380, null), null, null, 12, null), this.f161811e, null, composer, 0, 4);
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                        a(productCardTags, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: ti.E$b$a$a$c */
                static final class c implements Function3<InterfaceC14930d0, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f161812a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ boolean f161813b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ boolean f161814c;

                    c(LocalThemeScope localThemeScope, boolean z10, boolean z11) {
                        this.f161812a = localThemeScope;
                        this.f161813b = z10;
                        this.f161814c = z11;
                    }

                    public final void a(InterfaceC14930d0 Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if ((i10 & 6) == 0) {
                            i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                        }
                        if ((i10 & 19) == 18 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(728486260, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.selectable_card.SelectableCardImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelectableCard.kt:591)");
                        }
                        vi.s.b(this.f161812a, Assemble.getToggleButtons().getDefaultToggleButton(), this.f161813b, this.f161814c, false, null, composer, 0, 24);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14930d0 interfaceC14930d0, Composer composer, Integer num) {
                        a(interfaceC14930d0, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                C2534a(String str, Ji.C c10, String str2, LocalThemeScope localThemeScope, boolean z10, String str3, String str4, String str5, Function0<Unit> function0, Ji.C c11, T t10, boolean z11, T t11, String str6) {
                    this.f161792a = str;
                    this.f161793b = c10;
                    this.f161794c = str2;
                    this.f161795d = localThemeScope;
                    this.f161796e = z10;
                    this.f161797f = str3;
                    this.f161798g = str4;
                    this.f161799h = str5;
                    this.f161800i = function0;
                    this.f161801j = c11;
                    this.f161802k = t10;
                    this.f161803l = z11;
                    this.f161804m = t11;
                    this.f161805n = str6;
                }

                public final void a(Composer composer, int i10) {
                    Composer composer2 = composer;
                    if ((i10 & 3) == 2 && composer2.j()) {
                        composer2.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-524836434, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.selectable_card.SelectableCardImpl.<anonymous>.<anonymous>.<anonymous> (SelectableCard.kt:542)");
                    }
                    composer2.startReplaceGroup(-1856635552);
                    if (!StringsKt.r0(this.f161792a)) {
                        Modifier modifierB = C5795w.b(Modifier.INSTANCE, "tag");
                        LocalThemeScope localThemeScope = this.f161795d;
                        Ji.C c10 = this.f161801j;
                        boolean z10 = this.f161796e;
                        T t10 = this.f161802k;
                        String str = this.f161792a;
                        MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                        int iA = C5717f.a(composer2, 0);
                        InterfaceC5742s interfaceC5742sR = composer2.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierB);
                        InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                        Function0<InterfaceC5811g> function0A = companion.a();
                        if (composer2.k() == null) {
                            C5717f.c();
                        }
                        composer2.F();
                        if (composer2.getInserting()) {
                            composer2.I(function0A);
                        } else {
                            composer2.s();
                        }
                        Composer composerA = D1.a(composer2);
                        D1.c(composerA, measurePolicyG, companion.e());
                        D1.c(composerA, interfaceC5742sR, companion.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion.f());
                        C5664j c5664j = C5664j.f48612a;
                        composer2.startReplaceGroup(1849434622);
                        Object objB = composer2.B();
                        if (objB == Composer.INSTANCE.a()) {
                            objB = C2535a.f161806h;
                            composer2.t(objB);
                        }
                        composer2.P();
                        Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(1300948665, true, new C2536b(c10, localThemeScope, z10, t10, str), composer2, 54), composer2, 432);
                        composer2.v();
                    }
                    composer2.P();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierB2 = C5795w.b(companion2, "radioButton");
                    LocalThemeScope localThemeScope2 = this.f161795d;
                    boolean z11 = this.f161803l;
                    boolean z12 = this.f161796e;
                    e.Companion companion3 = P0.e.INSTANCE;
                    MeasurePolicy measurePolicyG2 = C5662h.g(companion3.o(), false);
                    int iA2 = C5717f.a(composer2, 0);
                    InterfaceC5742s interfaceC5742sR2 = composer2.r();
                    Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierB2);
                    InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A2 = companion4.a();
                    if (composer2.k() == null) {
                        C5717f.c();
                    }
                    composer2.F();
                    if (composer2.getInserting()) {
                        composer2.I(function0A2);
                    } else {
                        composer2.s();
                    }
                    Composer composerA2 = D1.a(composer2);
                    D1.c(composerA2, measurePolicyG2, companion4.e());
                    D1.c(composerA2, interfaceC5742sR2, companion4.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion4.b();
                    if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                        composerA2.t(Integer.valueOf(iA2));
                        composerA2.n(Integer.valueOf(iA2), function2B2);
                    }
                    D1.c(composerA2, modifierE2, companion4.f());
                    C5664j c5664j2 = C5664j.f48612a;
                    Q.e(localThemeScope2, s1.h.f140225a, ComposableLambdaKt.c(728486260, true, new c(localThemeScope2, z11, z12), composer2, 54), composer2, 432);
                    composer2.v();
                    Ji.C c11 = this.f161793b;
                    composer2.startReplaceGroup(-1856533932);
                    if (c11 != null) {
                        LocalThemeScope localThemeScope3 = this.f161795d;
                        C17988z0.a(C16190d.c(c11.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer2, 0), null, C5795w.b(J.w(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.D.i(companion2, H1.h.p(2)), localThemeScope3.getAdsColors().getAdsColorTransparent().getColor(), null, 2, null), localThemeScope3.getAdsSpacing().getSeven().getDp(), H1.h.p(28)), "headingIcon"), this.f161796e ? this.f161804m.getColor() : localThemeScope3.getAdsColors().getAdsColorsDisabled().getColor(), composer, 48, 0);
                        composer2 = composer;
                        Unit unit = Unit.f142422a;
                    }
                    composer2.P();
                    Modifier modifierB3 = C5795w.b(companion2, "headingText");
                    LocalThemeScope localThemeScope4 = this.f161795d;
                    boolean z13 = this.f161796e;
                    String str2 = this.f161805n;
                    MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), companion3.k(), composer2, 0);
                    int iA3 = C5717f.a(composer2, 0);
                    InterfaceC5742s interfaceC5742sR3 = composer2.r();
                    Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierB3);
                    Function0<InterfaceC5811g> function0A3 = companion4.a();
                    if (composer2.k() == null) {
                        C5717f.c();
                    }
                    composer2.F();
                    if (composer2.getInserting()) {
                        composer2.I(function0A3);
                    } else {
                        composer2.s();
                    }
                    Composer composerA3 = D1.a(composer2);
                    D1.c(composerA3, measurePolicyA, companion4.e());
                    D1.c(composerA3, interfaceC5742sR3, companion4.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion4.b();
                    if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                        composerA3.t(Integer.valueOf(iA3));
                        composerA3.n(Integer.valueOf(iA3), function2B3);
                    }
                    D1.c(composerA3, modifierE3, companion4.f());
                    C14815g c14815g = C14815g.f139108a;
                    ri.j.h(localThemeScope4, new q1.Label(null, null, null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, z13 ? localThemeScope4.getAdsTypography().getHeadings().getSeven() : localThemeScope4.getAdsTypography().getHeadings().getSeven().d(localThemeScope4.getAdsColors().getAdsColorsDisabled()), null, 375, null), str2, null, composer2, 0, 4);
                    composer2.v();
                    composer2.startReplaceGroup(-1856491370);
                    if (!StringsKt.r0(this.f161794c)) {
                        ri.j.h(this.f161795d, q1.Label.y(new q1.Label(null, null, null, null, 0, false, 0, this.f161796e ? this.f161795d.getAdsTypography().getBody().getTwo().d(this.f161795d.getAdsColors().getAdsColorText02()) : this.f161795d.getAdsTypography().getBody().getTwo().d(this.f161795d.getAdsColors().getAdsColorsDisabled()), null, 383, null), C5795w.b(companion2, "description"), null, null, null, 0, false, 0, null, null, 510, null), this.f161794c, null, composer2, 0, 4);
                    }
                    composer2.P();
                    composer2.startReplaceGroup(-1856470055);
                    if (!StringsKt.r0(this.f161797f)) {
                        ri.j.h(this.f161795d, q1.Label.y(new q1.Label(null, null, null, null, 0, false, 0, this.f161796e ? this.f161795d.getAdsTypography().getBody().getTwo().d(this.f161795d.getAdsColors().getAdsColorText02()) : this.f161795d.getAdsTypography().getBody().getTwo().d(this.f161795d.getAdsColors().getAdsColorsDisabled()), null, 383, null), C5795w.b(companion2, "description2"), null, null, null, 0, false, 0, null, null, 510, null), this.f161797f, null, composer2, 0, 4);
                    }
                    composer2.P();
                    composer2.startReplaceGroup(-1856447590);
                    if (!StringsKt.r0(this.f161798g)) {
                        ri.j.h(this.f161795d, q1.Label.y(new q1.Label(null, null, null, null, 0, false, 0, this.f161796e ? this.f161795d.getAdsTypography().getHeadings().getSeven() : this.f161795d.getAdsTypography().getHeadings().getSeven().d(this.f161795d.getAdsColors().getAdsColorsDisabled()), null, 383, null), C5795w.b(companion2, "heading2"), null, null, null, 0, false, 0, null, null, 510, null), this.f161798g, null, composer2, 0, 4);
                    }
                    composer.P();
                    if (!StringsKt.r0(this.f161799h)) {
                        P0.k(this.f161795d, A0.f151413a, this.f161799h, this.f161800i, C5795w.b(companion2, "actionButton"), null, false, 0L, this.f161796e, composer, 24624, 112);
                    }
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

            a(LocalThemeScope localThemeScope, boolean z10, String str, Ji.C c10, String str2, boolean z11, String str3, String str4, String str5, Function0<Unit> function0, Ji.C c11, T t10, boolean z12, T t11, String str6) {
                this.f161777a = localThemeScope;
                this.f161778b = z10;
                this.f161779c = str;
                this.f161780d = c10;
                this.f161781e = str2;
                this.f161782f = z11;
                this.f161783g = str3;
                this.f161784h = str4;
                this.f161785i = str5;
                this.f161786j = function0;
                this.f161787k = c11;
                this.f161788l = t10;
                this.f161789m = z12;
                this.f161790n = t11;
                this.f161791o = str6;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1861285664, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.selectable_card.SelectableCardImpl.<anonymous>.<anonymous> (SelectableCard.kt:534)");
                }
                E.D(androidx.compose.foundation.layout.D.j(Modifier.INSTANCE, this.f161777a.getAdsSpacing().getFive().getDp(), this.f161777a.getAdsSpacing().getFour().getDp()), 0.0f, 0.0f, 0.0f, 0.0f, this.f161778b, ComposableLambdaKt.c(-524836434, true, new C2534a(this.f161779c, this.f161780d, this.f161781e, this.f161777a, this.f161782f, this.f161783g, this.f161784h, this.f161785i, this.f161786j, this.f161787k, this.f161788l, this.f161789m, this.f161790n, this.f161791o), composer, 54), composer, 1572864, 30);
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

        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, boolean z10, Function1<? super Boolean, Unit> function1, boolean z11, h0.l lVar, boolean z12, LocalThemeScope localThemeScope, long j10, String str, Ji.C c10, String str2, String str3, String str4, String str5, Function0<Unit> function0, Ji.C c11, T t10, T t11, String str6) {
            this.f161758a = modifier;
            this.f161759b = z10;
            this.f161760c = function1;
            this.f161761d = z11;
            this.f161762e = lVar;
            this.f161763f = z12;
            this.f161764g = localThemeScope;
            this.f161765h = j10;
            this.f161766i = str;
            this.f161767j = c10;
            this.f161768k = str2;
            this.f161769l = str3;
            this.f161770m = str4;
            this.f161771n = str5;
            this.f161772o = function0;
            this.f161773p = c11;
            this.f161774q = t10;
            this.f161775r = t11;
            this.f161776s = str6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, boolean z10) {
            function1.invoke(Boolean.valueOf(!z10));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1, boolean z10) {
            function1.invoke(Boolean.valueOf(!z10));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            return Unit.f142422a;
        }

        public final void d(Composer composer, int i10) {
            Modifier modifierC;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2007746268, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.selectable_card.SelectableCardImpl.<anonymous> (SelectableCard.kt:490)");
            }
            Modifier modifierH = J.h(J.D(this.f161758a, null, false, 3, null), 0.0f, 1, null);
            boolean z10 = this.f161759b;
            if (z10 && this.f161760c != null) {
                composer.startReplaceGroup(1054819552);
                InterfaceC13428B interfaceC13428BF = C17916Y0.f(false, 0.0f, 0L, 7, null);
                int iF = Role.INSTANCE.f();
                Modifier modifier = this.f161758a;
                boolean z11 = this.f161761d;
                h0.l lVar = this.f161762e;
                boolean z12 = this.f161763f;
                Role roleJ = Role.j(iF);
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f161760c) | composer.a(this.f161761d);
                final Function1<Boolean, Unit> function1 = this.f161760c;
                final boolean z13 = this.f161761d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: ti.F
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return E.b.e(function1, z13);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                modifierC = SelectableKt.m4selectableO2vRcR0(modifier, z11, lVar, interfaceC13428BF, z12, roleJ, (Function0) objB);
                composer.P();
            } else if (z10 || this.f161760c == null) {
                composer.startReplaceGroup(1055776646);
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: ti.H
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return E.b.g((r1.u) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                modifierC = C16705m.c(companion, true, (Function1) objB2);
                composer.P();
            } else {
                composer.startReplaceGroup(1055351605);
                InterfaceC13428B interfaceC13428BF2 = C17916Y0.f(false, 0.0f, 0L, 7, null);
                int iA = Role.INSTANCE.a();
                Modifier modifier2 = this.f161758a;
                h0.l lVar2 = this.f161762e;
                boolean z14 = this.f161763f;
                Role roleJ2 = Role.j(iA);
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(this.f161760c) | composer.a(this.f161761d);
                final Function1<Boolean, Unit> function12 = this.f161760c;
                final boolean z15 = this.f161761d;
                Object objB3 = composer.B();
                if (zV2 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: ti.G
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return E.b.f(function12, z15);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                modifierC = ClickableKt.c(modifier2, lVar2, interfaceC13428BF2, z14, null, roleJ2, (Function0) objB3, 8, null);
                composer.P();
            }
            t1.a(androidx.compose.foundation.g.b(modifierH.then(modifierC), true, null, 2, null), C16692i.c(this.f161764g.getAdsCornerRadii().getRadius03().getDp()), this.f161765h, 0L, C13442i.a(H1.h.p(1), this.f161761d ? this.f161764g.getAdsColors().getAdsInteractiveSelected().getColor() : this.f161764g.getAdsColors().getAdsColorUIBorder02().getColor()), H1.h.p(0), ComposableLambdaKt.c(1861285664, true, new a(this.f161764g, this.f161759b, this.f161766i, this.f161767j, this.f161768k, this.f161763f, this.f161769l, this.f161770m, this.f161771n, this.f161772o, this.f161773p, this.f161774q, this.f161761d, this.f161775r, this.f161776s), composer, 54), composer, 1769472, 8);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            d(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(final Ji.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, boolean r39, final boolean r40, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r41, java.lang.String r42, Ji.C r43, Ji.T r44, Ji.C r45, boolean r46, Ji.T r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.E.F(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function1, java.lang.String, Ji.C, Ji.T, Ji.C, boolean, Ji.T, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(final Ji.LocalThemeScope r35, androidx.compose.ui.Modifier r36, final java.lang.String r37, java.lang.String r38, java.lang.String r39, boolean r40, final boolean r41, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r42, java.lang.String r43, Ji.C r44, Ji.T r45, Ji.C r46, java.lang.String r47, final kotlin.jvm.functions.Function0<kotlin.Unit> r48, boolean r49, Ji.T r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.E.G(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function1, java.lang.String, Ji.C, Ji.T, Ji.C, java.lang.String, kotlin.jvm.functions.Function0, boolean, Ji.T, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, String str3, boolean z10, boolean z11, Function1 function1, String str4, Ji.C c10, T t10, Ji.C c11, String str5, Function0 function0, boolean z12, T t11, int i10, int i11, int i12, Composer composer, int i13) {
        G(localThemeScope, modifier, str, str2, str3, z10, z11, function1, str4, c10, t10, c11, str5, function0, z12, t11, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    @SuppressLint({"AlwaysProvideAModifier"})
    public static final void J(LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Intrinsics.j(localThemeScope2, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-608292309);
        if ((i10 & 6) == 0) {
            i11 = i10 | ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-608292309, i11, -1, "com.meijer.mobile.android_acres_library.atomic_providers.selectable_card.SelectableCardExamples (SelectableCard.kt:170)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 10;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, H1.h.p(f10));
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            C.b.h.e eVar = C.b.h.e.f15467e;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objB == companion3.a()) {
                objB = new Function1() { // from class: ti.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.U(((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            int i12 = i11 & 14;
            F(localThemeScope2, null, "This is the heading", null, null, "+$7.95", false, false, (Function1) objB, null, null, null, eVar, false, null, composerStartRestartGroup, i12 | 115016064, 384, 14093);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            T adsColorSupportWarning = localThemeScope.getAdsColors().getAdsColorSupportWarning();
            C.b.h.c cVar = C.b.h.c.f15464e;
            C.i.h hVar = C.i.h.f15557d;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion3.a()) {
                objB2 = new Function1() { // from class: ti.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.e0(((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            F(localThemeScope, null, "This is the heading", "This is the description", "1.1 miles away", "+$7.95", true, true, (Function1) objB2, "This is a tag", cVar, adsColorSupportWarning, hVar, false, null, composerStartRestartGroup, i12 | 920350080, 390, 12289);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion3.a()) {
                objB3 = new Function1() { // from class: ti.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.f0(((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            F(localThemeScope, null, "This is the heading", "This is the description", null, null, true, true, (Function1) objB3, null, cVar, null, hVar, false, null, composerStartRestartGroup, i12 | 114822528, 390, 13593);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == companion3.a()) {
                objB4 = new Function1() { // from class: ti.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.g0(((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB4);
            }
            Function1 function1 = (Function1) objB4;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB5 = composerStartRestartGroup.B();
            if (objB5 == companion3.a()) {
                objB5 = new Function0() { // from class: ti.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return E.K();
                    }
                };
                composerStartRestartGroup.t(objB5);
            }
            composerStartRestartGroup.P();
            int i13 = i12 | 14355840;
            G(localThemeScope, null, "Action Button", "This is the description", null, true, false, function1, null, null, null, eVar, "Click Me!", (Function0) objB5, false, null, composerStartRestartGroup, i13, 3504, 25481);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB6 = composerStartRestartGroup.B();
            if (objB6 == companion3.a()) {
                objB6 = new Function1() { // from class: ti.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.L(((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB6);
            }
            composerStartRestartGroup.P();
            int i14 = i12 | 115019136;
            F(localThemeScope, null, "This is the heading", "This is the description", null, "+$7.95", true, false, (Function1) objB6, null, null, null, null, false, null, composerStartRestartGroup, i14, 0, 16137);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            F(localThemeScope, null, "This is the heading", null, null, "+$7.95", false, false, null, null, null, null, eVar, true, null, composerStartRestartGroup, i12 | 14352768, 3456, 10125);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            F(localThemeScope, null, "This is the heading", "This is the description", "1.1 miles away", "+$7.95", true, true, null, "This is a tag", cVar, localThemeScope.getAdsColors().getAdsColorSupportWarning(), hVar, true, null, composerStartRestartGroup, i12 | 819686784, 3462, 8321);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            F(localThemeScope, null, "This is the heading", "This is the description", null, null, true, false, null, null, cVar, null, hVar, false, null, composerStartRestartGroup, i12 | 14159232, 390, 13721);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB7 = composerStartRestartGroup.B();
            if (objB7 == companion3.a()) {
                objB7 = new Function0() { // from class: ti.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return E.M();
                    }
                };
                composerStartRestartGroup.t(objB7);
            }
            composerStartRestartGroup.P();
            int i15 = i12 | 1772928;
            G(localThemeScope, null, "Action Button", "This is the description", null, true, false, null, null, null, null, eVar, "Click Me!", (Function0) objB7, false, null, composerStartRestartGroup, i15, 3504, 25545);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB8 = composerStartRestartGroup.B();
            if (objB8 == companion3.a()) {
                objB8 = new Function1() { // from class: ti.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.N(((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB8);
            }
            composerStartRestartGroup.P();
            F(localThemeScope, null, "onClick present, radio show", "This is the description", null, "+$7.95", true, true, (Function1) objB8, null, null, null, null, true, null, composerStartRestartGroup, i14, 3072, 12041);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB9 = composerStartRestartGroup.B();
            if (objB9 == companion3.a()) {
                objB9 = new Function1() { // from class: ti.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.O(((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB9);
            }
            composerStartRestartGroup.P();
            F(localThemeScope, null, "onClick present, radio hide", "This is the description", null, "+$7.95", true, true, (Function1) objB9, null, null, null, null, false, null, composerStartRestartGroup, i14, 3072, 12041);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            F(localThemeScope, null, "onClick null, radio show", "This is the description", null, "+$7.95", true, true, null, null, null, null, null, true, null, composerStartRestartGroup, i14, 3072, 12041);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            F(localThemeScope, null, "onClick null, radio hide", "This is the description", null, "+$7.95", true, true, null, null, null, null, null, false, null, composerStartRestartGroup, i14, 3072, 12041);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB10 = composerStartRestartGroup.B();
            if (objB10 == companion3.a()) {
                objB10 = new Function1() { // from class: ti.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.P(((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB10);
            }
            Function1 function12 = (Function1) objB10;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB11 = composerStartRestartGroup.B();
            if (objB11 == companion3.a()) {
                objB11 = new Function0() { // from class: ti.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return E.Q();
                    }
                };
                composerStartRestartGroup.t(objB11);
            }
            composerStartRestartGroup.P();
            G(localThemeScope, null, "Cascade", "1350, LakeLansing Road,\nEast lancing MI 48823\n4.9 miles away", null, true, false, function12, null, null, null, null, "Details", (Function0) objB11, false, null, composerStartRestartGroup, i13, 3456, 26505);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB12 = composerStartRestartGroup.B();
            if (objB12 == companion3.a()) {
                objB12 = new Function1() { // from class: ti.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.R(((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB12);
            }
            Function1 function13 = (Function1) objB12;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB13 = composerStartRestartGroup.B();
            if (objB13 == companion3.a()) {
                objB13 = new Function0() { // from class: ti.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return E.S();
                    }
                };
                composerStartRestartGroup.t(objB13);
            }
            composerStartRestartGroup.P();
            G(localThemeScope, null, "East Lancing", "1350, LakeLansing Road,\nEast lancing MI 48823\n4.9 miles away", null, true, false, function13, null, null, null, null, "Details", (Function0) objB13, false, null, composerStartRestartGroup, i13, 3456, 26505);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            T adsColorText02 = localThemeScope.getAdsColors().getAdsColorText02();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB14 = composerStartRestartGroup.B();
            if (objB14 == companion3.a()) {
                objB14 = new Function0() { // from class: ti.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return E.T();
                    }
                };
                composerStartRestartGroup.t(objB14);
            }
            composerStartRestartGroup.P();
            G(localThemeScope, null, "Capital City Market", "1350, LakeLansing Road,\nEast lancing MI 48823\n4.9 miles away", null, true, false, null, "Market Format", null, adsColorText02, null, "Details", (Function0) objB14, false, null, composerStartRestartGroup, i12 | 102436224, 3456, 25929);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB15 = composerStartRestartGroup.B();
            if (objB15 == companion3.a()) {
                objB15 = new Function1() { // from class: ti.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.V(((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB15);
            }
            Function1 function14 = (Function1) objB15;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB16 = composerStartRestartGroup.B();
            if (objB16 == companion3.a()) {
                objB16 = new Function0() { // from class: ti.z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return E.W();
                    }
                };
                composerStartRestartGroup.t(objB16);
            }
            composerStartRestartGroup.P();
            G(localThemeScope, null, "Cascade", "1350, LakeLansing Road,\nEast lancing MI 48823\n4.9 miles away", null, true, true, function14, null, null, null, null, "Details", (Function0) objB16, false, null, composerStartRestartGroup, i13, 3456, 26505);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB17 = composerStartRestartGroup.B();
            if (objB17 == companion3.a()) {
                objB17 = new Function0() { // from class: ti.A
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return E.X();
                    }
                };
                composerStartRestartGroup.t(objB17);
            }
            composerStartRestartGroup.P();
            G(localThemeScope, null, "has heading icon, no radio button", "1350, LakeLansing Road,\nEast lancing MI 48823\n4.9 miles away", null, true, true, null, null, null, null, eVar, "Details", (Function0) objB17, false, null, composerStartRestartGroup, i15, 3504, 25545);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB18 = composerStartRestartGroup.B();
            if (objB18 == companion3.a()) {
                objB18 = new Function1() { // from class: ti.B
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.Y(((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB18);
            }
            Function1 function15 = (Function1) objB18;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB19 = composerStartRestartGroup.B();
            if (objB19 == companion3.a()) {
                objB19 = new Function0() { // from class: ti.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return E.Z();
                    }
                };
                composerStartRestartGroup.t(objB19);
            }
            composerStartRestartGroup.P();
            G(localThemeScope, null, "has heading icon and radio button", "1350, LakeLansing Road,\nEast lancing MI 48823\n4.9 miles away", null, true, true, function15, null, null, null, eVar, "Details", (Function0) objB19, false, null, composerStartRestartGroup, i13, 3504, 25481);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB20 = composerStartRestartGroup.B();
            if (objB20 == companion3.a()) {
                objB20 = new Function1() { // from class: ti.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.a0(((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB20);
            }
            Function1 function16 = (Function1) objB20;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB21 = composerStartRestartGroup.B();
            if (objB21 == companion3.a()) {
                objB21 = new Function0() { // from class: ti.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return E.b0();
                    }
                };
                composerStartRestartGroup.t(objB21);
            }
            composerStartRestartGroup.P();
            G(localThemeScope, null, "no heading icon, has radio button", "1350, LakeLansing Road,\nEast lancing MI 48823\n4.9 miles away", null, true, true, function16, null, null, null, null, "Details", (Function0) objB21, false, null, composerStartRestartGroup, i13, 3456, 26505);
            C14802K.a(J.i(companion, H1.h.p(f10)), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB22 = composerStartRestartGroup.B();
            if (objB22 == companion3.a()) {
                objB22 = new Function1() { // from class: ti.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.c0(((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB22);
            }
            Function1 function17 = (Function1) objB22;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB23 = composerStartRestartGroup.B();
            if (objB23 == companion3.a()) {
                objB23 = new Function0() { // from class: ti.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return E.d0();
                    }
                };
                composerStartRestartGroup.t(objB23);
            }
            Function0 function0 = (Function0) objB23;
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            G(localThemeScope2, null, "no heading icon,has radio button,largeeeeee headingggg", "1350, LakeLansing Road,\nEast lancing MI 48823\n4.9 miles away", null, true, true, function17, null, null, null, null, "Details", function0, false, null, composerStartRestartGroup, i13, 3456, 26505);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ti.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return E.h0(localThemeScope2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void i0(final Ji.LocalThemeScope r37, androidx.compose.ui.Modifier r38, final java.lang.String r39, java.lang.String r40, final java.lang.String r41, java.lang.String r42, boolean r43, final boolean r44, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r45, java.lang.String r46, Ji.C r47, Ji.T r48, Ji.C r49, Ji.T r50, java.lang.String r51, boolean r52, kotlin.jvm.functions.Function0<kotlin.Unit> r53, androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.E.i0(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function1, java.lang.String, Ji.C, Ji.T, Ji.C, Ji.T, java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, String str3, String str4, boolean z10, boolean z11, Function1 function1, String str5, Ji.C c10, T t10, Ji.C c11, T t11, String str6, boolean z12, Function0 function0, int i10, int i11, int i12, Composer composer, int i13) {
        i0(localThemeScope, modifier, str, str2, str3, str4, z10, z11, function1, str5, c10, t10, c11, t11, str6, z12, function0, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(androidx.compose.ui.Modifier r21, float r22, float r23, float r24, float r25, boolean r26, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.E.D(androidx.compose.ui.Modifier, float, float, float, float, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(Modifier modifier, float f10, float f11, float f12, float f13, boolean z10, Function2 function2, int i10, int i11, Composer composer, int i12) {
        D(modifier, f10, f11, f12, f13, z10, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, String str3, String str4, boolean z10, boolean z11, Function1 function1, String str5, Ji.C c10, T t10, Ji.C c11, boolean z12, T t11, int i10, int i11, int i12, Composer composer, int i13) {
        F(localThemeScope, modifier, str, str2, str3, str4, z10, z11, function1, str5, c10, t10, c11, z12, t11, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(boolean z10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        J(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 o0(String str, List<? extends I> list, long j10, int i10) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(C5795w.a((I) next), str)) {
                break;
            }
        }
        I i11 = (I) next;
        if (i11 != null) {
            return i11.k0(H1.b.d(j10, 0, Math.min(H1.b.l(j10), i10), 0, 0, 12, null));
        }
        return null;
    }

    static /* synthetic */ f0 p0(String str, List list, long j10, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = a.e.API_PRIORITY_OTHER;
        }
        return o0(str, list, j10, i10);
    }

    public static final RippleAlpha q0(w1 conditions) {
        float f10;
        Intrinsics.j(conditions, "conditions");
        if (Intrinsics.e(conditions, w1.c.f151818c)) {
            f10 = 1.0f;
        } else {
            if (!Intrinsics.e(conditions, w1.b.f151817c) && !Intrinsics.e(conditions, w1.a.f151816c)) {
                throw new NoWhenBranchMatchedException();
            }
            f10 = 0.0f;
        }
        return new RippleAlpha(1.0f, 1.0f, 0.0f, f10);
    }

    private static final boolean k0(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }
}
