package Ai;

import Ai.C2857v;
import Ji.C;
import Ji.LocalThemeScope;
import L1.C4038f;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import Pi.L5;
import V0.SolidColor;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.text.C5673e;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13439f;
import j$.time.Month;
import j$.time.Year;
import j$.time.format.TextStyle;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ji.H0;
import ji.InterfaceC14915S;
import ji.q1;
import kotlin.AbstractC17953l0;
import kotlin.C17916Y0;
import kotlin.C17937g;
import kotlin.C17959n0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import pi.C16307b;
import pi.C16309d;
import qi.C16532e;
import qv.InterfaceC16622O;
import r0.C16692i;
import r1.C16705m;
import zi.InterfaceC18489g1;
import zi.s1;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0090\u0001\u0010\u0015\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u000726\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t2\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a)\u0010\u0018\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001am\u0010%\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 2\u000e\b\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0#H\u0001¢\u0006\u0004\b%\u0010&\u001aÄ\u0001\u0010.\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u00112\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u00112\u001a\b\u0002\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010,\u001a\u00020+2'\u0010-\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000f0#¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000f0\u0011H\u0001¢\u0006\u0004\b.\u0010/\u001a5\u00102\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u00101\u001a\u000200H\u0003¢\u0006\u0004\b2\u00103\u001a\u001d\u00104\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b4\u00105\u001a\u001d\u00106\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b6\u00105\u001a\u001d\u00107\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b7\u00105\u001a\u001d\u00108\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b8\u00105\u001a\u001d\u00109\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b9\u00105\u001a\u001d\u0010:\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b:\u00105\u001a\u001d\u0010;\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b;\u00105\u001a\u001d\u0010<\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b<\u00105\u001a\u001d\u0010=\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b=\u00105\u001a\u001d\u0010>\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b>\u00105\u001a'\u0010@\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010?\u001a\u00020\u0001H\u0001¢\u0006\u0004\b@\u0010A\"\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006T²\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010E\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\u0012\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u00078\nX\u008a\u0084\u0002²\u0006\u0010\u0010H\u001a\u0004\u0018\u00010F8\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010I\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010J\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010M\u001a\u00020K8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010P\u001a\u00020O8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010Q\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010S\u001a\u00020R8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00018\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "value", "Lji/q1$f$b;", "template", "", "items", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "item", "", "index", "", "onValueChange", "Lkotlin/Function1;", "LAi/n0;", "Lkotlin/ExtensionFunctionType;", "content", "v", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lji/q1$f$b;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lzi/g1;", "A", "(Lzi/g1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lji/q1$f;", "", "expanded", "enabled", "Lri/p;", "placeHolder", "Lpi/d;", "arrowUpIcon", "arrowDownIcon", "Lkotlin/Function0;", "innerTextField", "y", "(LJi/M;Landroidx/compose/ui/Modifier;Lji/q1$f;Ljava/lang/String;ZZLri/p;Lpi/d;Lpi/d;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "dropdownItems", "onExpandedChange", "shadowedOnValueChanged", "dropdownOnValueChanged", "Lh0/l;", "interactionSource", "decorationBox", "G", "(LJi/M;Landroidx/compose/ui/Modifier;Lji/q1$f;Ljava/lang/String;ZZLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lh0/l;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Ld0/V;", "dropdownScrollState", "K", "(ZLjava/util/List;Ljava/lang/String;Ld0/V;Landroidx/compose/runtime/Composer;I)V", "Q", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "e0", "c0", "k0", "i0", "g0", "o0", "M", "m0", "O", "dropdownModifier", "q0", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "a", "Ljava/util/List;", "EXAMPLE_OPTION_ITEMS", "isFocused", "j$/time/Month", "months", "selectedMonth", "days", "selectedDay", "j$/time/Year", "years", "selectedYear", "selectedItem", "LPi/L5;", "state", "selectedValue", "", "widthScale", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Ai.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2857v {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f475a = CollectionsKt.p("Default text item", "Error text item example", "Info text item example", "Success text item example", "Warning text item example", "Selected item", "A really long option that will probably span multiple lines if available.");

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$A */
    static final class A implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f476a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f477b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f478c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q1.f f479d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f480e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<String> f481f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f482g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f483h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h0.l f484i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f485j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f486k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ d0.V f487l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<String, Integer, Unit> f488m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ai.v$A$a */
        static final class a implements Function3<AbstractC17953l0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q1.f f489a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f490b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f491c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f492d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f493e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h0.l f494f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f495g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f496h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f497i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f498j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ d0.V f499k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function2<String, Integer, Unit> f500l;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Ai.v$A$a$a, reason: collision with other inner class name */
            static final class C0010a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List<String> f501a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f502b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f503c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ d0.V f504d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ Function1<Boolean, Unit> f505e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function2<String, Integer, Unit> f506f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f507g;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Ai.v$A$a$a$a, reason: collision with other inner class name */
                static final class C0011a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ int f508a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ List<String> f509b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ String f510c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ String f511d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f512e;

                    C0011a(int i10, List<String> list, String str, String str2, LocalThemeScope localThemeScope) {
                        this.f508a = i10;
                        this.f509b = list;
                        this.f510c = str;
                        this.f511d = str2;
                        this.f512e = localThemeScope;
                    }

                    public final void a(InterfaceC14800I DropdownMenuItem, Composer composer, int i10) {
                        Intrinsics.j(DropdownMenuItem, "$this$DropdownMenuItem");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(903826489, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.AdsDropdownMenuBox.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:412)");
                        }
                        l0.b(this.f512e, this.f508a, this.f510c, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f508a == CollectionsKt.o(this.f509b), Intrinsics.e(this.f510c, this.f511d), composer, 3072, 0);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                        a(interfaceC14800I, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C0010a(List<String> list, boolean z10, String str, d0.V v10, Function1<? super Boolean, Unit> function1, Function2<? super String, ? super Integer, Unit> function2, LocalThemeScope localThemeScope) {
                    this.f501a = list;
                    this.f502b = z10;
                    this.f503c = str;
                    this.f504d = v10;
                    this.f505e = function1;
                    this.f506f = function2;
                    this.f507g = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(Function1 function1, Function2 function2, String str, int i10) {
                    function1.invoke(Boolean.FALSE);
                    function2.invoke(str, Integer.valueOf(i10));
                    return Unit.f142422a;
                }

                public final void b(InterfaceC14814f DropdownMenu, Composer composer, int i10) {
                    Composer composer2 = composer;
                    Intrinsics.j(DropdownMenu, "$this$DropdownMenu");
                    if ((i10 & 17) == 16 && composer2.j()) {
                        composer2.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1183741782, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.AdsDropdownMenuBox.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:404)");
                    }
                    composer2.startReplaceGroup(-590479193);
                    List<String> list = this.f501a;
                    final Function1<Boolean, Unit> function1 = this.f505e;
                    final Function2<String, Integer, Unit> function2 = this.f506f;
                    String str = this.f503c;
                    LocalThemeScope localThemeScope = this.f507g;
                    final int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.w();
                        }
                        final String str2 = (String) obj;
                        InterfaceC14794C interfaceC14794CA = androidx.compose.foundation.layout.D.a(H1.h.p(0));
                        composer2.startReplaceGroup(-1224400529);
                        boolean zV = composer2.V(function1) | composer2.V(function2) | composer2.V(str2) | composer2.d(i11);
                        Object objB = composer2.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: Ai.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C2857v.A.a.C0010a.c(function1, function2, str2, i11);
                                }
                            };
                            composer2.t(objB);
                        }
                        composer2.P();
                        C17937g.b((Function0) objB, null, false, interfaceC14794CA, null, ComposableLambdaKt.c(903826489, true, new C0011a(i11, list, str2, str, localThemeScope), composer2, 54), composer, 199680, 22);
                        composer2 = composer;
                        list = list;
                        str = str;
                        i11 = i12;
                        localThemeScope = localThemeScope;
                    }
                    composer.P();
                    C2857v.K(this.f502b, this.f501a, this.f503c, this.f504d, composer, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                    b(interfaceC14814f, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(q1.f fVar, boolean z10, List<String> list, String str, Function1<? super String, Unit> function1, h0.l lVar, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, LocalThemeScope localThemeScope, boolean z11, Function1<? super Boolean, Unit> function12, d0.V v10, Function2<? super String, ? super Integer, Unit> function2) {
                this.f489a = fVar;
                this.f490b = z10;
                this.f491c = list;
                this.f492d = str;
                this.f493e = function1;
                this.f494f = lVar;
                this.f495g = function3;
                this.f496h = localThemeScope;
                this.f497i = z11;
                this.f498j = function12;
                this.f499k = v10;
                this.f500l = function2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke(Boolean.FALSE);
                return Unit.f142422a;
            }

            public final void b(AbstractC17953l0 ExposedDropdownMenuBox, Composer composer, int i10) {
                int i11;
                Intrinsics.j(ExposedDropdownMenuBox, "$this$ExposedDropdownMenuBox");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(ExposedDropdownMenuBox) : composer.D(ExposedDropdownMenuBox) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1211955811, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.AdsDropdownMenuBox.<anonymous>.<anonymous> (AdsDropdown.kt:369)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                boolean readOnly = this.f489a.getReadOnly();
                boolean z10 = this.f490b && !this.f491c.isEmpty();
                Ji.I textStyle = this.f489a.getTextStyle();
                q1.f fVar = this.f489a;
                LocalThemeScope localThemeScope = this.f496h;
                if (Intrinsics.e(fVar.getState(), q1.f.a.C2215a.f139989a)) {
                    textStyle = fVar.getTextStyle().d(localThemeScope.getAdsColors().getAdsColorsDisabled());
                }
                C5673e.a(this.f492d, this.f493e, modifierH, z10, readOnly, textStyle.getStyle(), this.f489a.getKeyboardOptions(), this.f489a.getKeyboardActions(), this.f489a.getSingleLine(), this.f489a.getMaxLines(), 0, this.f489a.getVisualTransformation(), null, this.f494f, new SolidColor(this.f489a.getColors().c(Intrinsics.e(this.f489a.getState(), q1.f.a.c.f139991a), composer, 0).getValue().getValue(), null), this.f495g, composer, 384, 0, 5120);
                Modifier modifierA = ExposedDropdownMenuBox.a(androidx.compose.foundation.b.d(C13439f.g(companion, H1.h.p(1), this.f496h.getAdsColors().getAdsColorUIBorder02().getColor(), C16692i.c(this.f496h.getAdsCornerRadii().getRadius04().getDp())), this.f496h.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), true);
                androidx.compose.ui.window.q qVar = new androidx.compose.ui.window.q(true, false, false, false, 14, (DefaultConstructorMarker) null);
                long jB = H1.j.b((Float.floatToRawIntBits(H1.h.p(0)) << 32) | (Float.floatToRawIntBits(this.f496h.getAdsSpacing().getThree().getDp()) & 4294967295L));
                boolean z11 = this.f497i;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f498j);
                final Function1<Boolean, Unit> function1 = this.f498j;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Ai.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C2857v.A.a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                d0.V v10 = this.f499k;
                C17937g.a(z11, (Function0) objB, modifierA, jB, v10, qVar, ComposableLambdaKt.c(1183741782, true, new C0010a(this.f491c, this.f497i, this.f492d, v10, this.f498j, this.f500l, this.f496h), composer, 54), composer, 1769472, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC17953l0 abstractC17953l0, Composer composer, Integer num) {
                b(abstractC17953l0, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        A(Modifier modifier, boolean z10, Function1<? super Boolean, Unit> function1, q1.f fVar, boolean z11, List<String> list, String str, Function1<? super String, Unit> function12, h0.l lVar, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, LocalThemeScope localThemeScope, d0.V v10, Function2<? super String, ? super Integer, Unit> function2) {
            this.f476a = modifier;
            this.f477b = z10;
            this.f478c = function1;
            this.f479d = fVar;
            this.f480e = z11;
            this.f481f = list;
            this.f482g = str;
            this.f483h = function12;
            this.f484i = lVar;
            this.f485j = function3;
            this.f486k = localThemeScope;
            this.f487l = v10;
            this.f488m = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1390078899, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.AdsDropdownMenuBox.<anonymous> (AdsDropdown.kt:364)");
            }
            Modifier modifier = this.f476a;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ai.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2857v.A.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierC = C16705m.c(modifier, true, (Function1) objB);
            boolean z10 = this.f477b;
            Function1<Boolean, Unit> function1 = this.f478c;
            C17959n0.a(z10, function1, modifierC, ComposableLambdaKt.c(1211955811, true, new a(this.f479d, this.f480e, this.f481f, this.f482g, this.f483h, this.f484i, this.f485j, this.f486k, z10, function1, this.f487l, this.f488m), composer, 54), composer, 3072, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.AdsDropdownKt$AutoscrollToSelectedEffect$1$1", f = "AdsDropdown.kt", l = {475}, m = "invokeSuspend")
    /* renamed from: Ai.v$B */
    static final class B extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f513a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f514b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f515c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f516d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d0.V f517e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(boolean z10, List<String> list, String str, d0.V v10, Continuation<? super B> continuation) {
            super(2, continuation);
            this.f514b = z10;
            this.f515c = list;
            this.f516d = str;
            this.f517e = v10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new B(this.f514b, this.f515c, this.f516d, this.f517e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i10;
            int iN;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f513a;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (this.f514b && !this.f515c.isEmpty()) {
                    int iIndexOf = this.f515c.indexOf(this.f516d);
                    if (iIndexOf == CollectionsKt.o(this.f515c)) {
                        iN = this.f517e.n();
                    } else {
                        int iN2 = (this.f517e.n() + 16) / this.f515c.size();
                        int i12 = iIndexOf / 4;
                        int i13 = iN2 * 4;
                        int i14 = (iN2 / 4) * i12;
                        if (i12 > 0) {
                            i10 = -8;
                        } else {
                            i10 = 0;
                        }
                        iN = (i12 * i13) + i14 + i10;
                    }
                    d0.V v10 = this.f517e;
                    int iO = RangesKt.o(iN, 0, v10.n());
                    this.f513a = 1;
                    if (d0.V.l(v10, iO, null, this, 2, null) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$C */
    public /* synthetic */ class C {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries<Month> f518a = EnumEntriesKt.a(Month.values());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$D */
    static final class D implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f519a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f520b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f521c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.v$D$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f522a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14915S f523b;

            a(LocalThemeScope localThemeScope, InterfaceC14915S interfaceC14915S) {
                this.f522a = localThemeScope;
                this.f523b = interfaceC14915S;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-688139038, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownAffirmativeState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:856)");
                }
                ri.j.h(this.f522a, this.f523b.getLabels().getInfoBlockMessage(), "Success dropdown has a green highlight and info block.", null, composer, 384, 4);
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

        D(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f519a = localThemeScope;
            this.f520b = modifier;
            this.f521c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5730l0 interfaceC5730l0, String item, int i10) {
            Intrinsics.j(item, "item");
            f(interfaceC5730l0, item);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC14915S interfaceC14915S, final Context context, LocalThemeScope localThemeScope, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC14915S.getLabels().getPlaceholder(), "Choose something happy");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), "Good Thing");
            AdsDropdown.g(interfaceC14915S.getIcons().getLabelIcon(), C.i.h.f15557d, "More info", new Function0() { // from class: Ai.B
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2857v.D.l(context);
                }
            });
            AdsDropdown.f(interfaceC14915S.getInfoBlocks().getSuccessBlock(), ComposableLambdaKt.composableLambdaInstance(-688139038, true, new a(localThemeScope, interfaceC14915S)));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Context context) {
            Toast.makeText(context, "Dropdown field with success state", 0).show();
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14915S Assemble, Composer composer, int i10) {
            int i11;
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
                ComposerKt.U(-484535411, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownAffirmativeState.<anonymous> (AdsDropdown.kt:826)");
            }
            List listP = CollectionsKt.p("Sunshine on a cloudy day", "Rainbows and butterflies", "Puppies and kittens", "Unicorns and rainbows", "Laughing babies", "Warm cookies");
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(CollectionsKt.s0(listP), null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            String strE = e(interfaceC5730l0);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, true, false, false, null, 59, null);
            LocalThemeScope localThemeScope = this.f519a;
            int i12 = i11;
            Modifier modifier = this.f520b;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Ai.z
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2857v.D.g(interfaceC5730l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f521c) | composer.D(this.f519a);
            final Context context = this.f521c;
            final LocalThemeScope localThemeScope2 = this.f519a;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Ai.A
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2857v.D.k(Assemble, context, localThemeScope2, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2857v.v(localThemeScope, modifier, strE, dropdownB, listP, function2, (Function1) objB3, composer, 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            d(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final String e(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        private static final void f(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$E */
    static final class E implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f524a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f525b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f526c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ai.v$E$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f527a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14915S f528b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<Ji.V> f529c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<String> f530d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f531e;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, InterfaceC14915S interfaceC14915S, List<? extends Ji.V> list, List<String> list2, InterfaceC5730l0<String> interfaceC5730l0) {
                this.f527a = localThemeScope;
                this.f528b = interfaceC14915S;
                this.f529c = list;
                this.f530d = list2;
                this.f531e = interfaceC5730l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2131269996, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownComplexModifier.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:936)");
                }
                LocalThemeScope localThemeScope = this.f527a;
                q1.Label infoBlockMessage = this.f528b.getLabels().getInfoBlockMessage();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Using Padding ");
                List<Ji.V> list = this.f529c;
                int iIndexOf = this.f530d.indexOf(E.f(this.f531e));
                sb2.append((iIndexOf < 0 || iIndexOf >= list.size()) ? "zero" : list.get(iIndexOf));
                ri.j.h(localThemeScope, infoBlockMessage, sb2.toString(), null, composer, 0, 4);
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

        E(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f524a = localThemeScope;
            this.f525b = modifier;
            this.f526c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5730l0 interfaceC5730l0, String item, int i10) {
            Intrinsics.j(item, "item");
            g(interfaceC5730l0, item);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC14915S interfaceC14915S, final Context context, LocalThemeScope localThemeScope, List list, List list2, InterfaceC5730l0 interfaceC5730l0, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC14915S.getLabels().getPlaceholder(), "Select a padding size");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), "Padding Size");
            AdsDropdown.g(interfaceC14915S.getIcons().getLabelIcon(), C.i.h.f15557d, "More info", new Function0() { // from class: Ai.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2857v.E.o(context);
                }
            });
            AdsDropdown.f(interfaceC14915S.getInfoBlocks().getSuccessBlock(), ComposableLambdaKt.composableLambdaInstance(2131269996, true, new a(localThemeScope, interfaceC14915S, list, list2, interfaceC5730l0)));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(Context context) {
            Toast.makeText(context, "Dropdown field with padding added to the modifier", 0).show();
            return Unit.f142422a;
        }

        public final void e(final InterfaceC14915S Assemble, Composer composer, int i10) {
            int i11;
            List list;
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
                ComposerKt.U(59627873, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownComplexModifier.<anonymous> (AdsDropdown.kt:906)");
            }
            final List listP = CollectionsKt.p(this.f524a.getAdsSpacing().getFour(), this.f524a.getAdsSpacing().getFive(), this.f524a.getAdsSpacing().getSix());
            final List listP2 = CollectionsKt.p("Four", "Five", "Six", "None");
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(CollectionsKt.s0(listP2), null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            String strF = f(interfaceC5730l0);
            boolean z10 = true;
            Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.h(this.f525b, 0.0f, 1, null), this.f524a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
            Ji.V v10 = (Ji.V) CollectionsKt.v0(listP, listP2.indexOf(f(interfaceC5730l0)));
            Modifier modifierI = androidx.compose.foundation.layout.D.i(modifierD, v10 != null ? v10.getDp() : H1.h.p(0));
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, true, false, false, null, 59, null);
            LocalThemeScope localThemeScope = this.f524a;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Ai.C
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2857v.E.k(interfaceC5730l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            if ((i11 & 14) != 4 && ((i11 & 8) == 0 || !composer.D(Assemble))) {
                z10 = false;
            }
            boolean zD = composer.D(this.f526c) | z10 | composer.D(this.f524a) | composer.V(listP);
            final Context context = this.f526c;
            final LocalThemeScope localThemeScope2 = this.f524a;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                Object obj = new Function1() { // from class: Ai.D
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C2857v.E.l(Assemble, context, localThemeScope2, listP, listP2, interfaceC5730l0, (n0) obj2);
                    }
                };
                list = listP2;
                composer.t(obj);
                objB3 = obj;
            } else {
                list = listP2;
            }
            composer.P();
            C2857v.v(localThemeScope, modifierI, strF, dropdownB, list, function2, (Function1) objB3, composer, 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            e(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String f(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        private static final void g(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$F */
    static final class F implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14800I f532a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f533b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f534c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Month> f535d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<List<Month>> f536e;

        F(InterfaceC14800I interfaceC14800I, LocalThemeScope localThemeScope, Context context, InterfaceC5730l0<Month> interfaceC5730l0, InterfaceC5730l0<List<Month>> interfaceC5730l02) {
            this.f532a = interfaceC14800I;
            this.f533b = localThemeScope;
            this.f534c = context;
            this.f535d = interfaceC5730l0;
            this.f536e = interfaceC5730l02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, String str, int i10) {
            Intrinsics.j(str, "<unused var>");
            C2857v.T(interfaceC5730l02, (Month) C2857v.R(interfaceC5730l0).get(i10));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC14915S interfaceC14915S, final Context context, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC14915S.getLabels().getPlaceholder(), "Month");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), "Month");
            AdsDropdown.g(interfaceC14915S.getIcons().getLabelIcon(), C.i.h.f15557d, "More Info", new Function0() { // from class: Ai.H
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2857v.F.g(context);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Context context) {
            Toast.makeText(context, "Select a month", 0).show();
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14915S Assemble, Composer composer, int i10) {
            int i11;
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
                ComposerKt.U(-2108929956, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownDatePicker.<anonymous>.<anonymous> (AdsDropdown.kt:510)");
            }
            Month monthS = C2857v.S(this.f535d);
            String displayName = monthS != null ? monthS.getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()) : null;
            if (displayName == null) {
                displayName = "";
            }
            Modifier modifierM = androidx.compose.foundation.layout.D.m(InterfaceC14800I.b(this.f532a, Modifier.INSTANCE, 5.0f, false, 2, null), 0.0f, 0.0f, this.f533b.getAdsSpacing().getThree().getDp(), 0.0f, 11, null);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            List listR = C2857v.R(this.f536e);
            int i12 = i11;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listR, 10));
            Iterator it = listR.iterator();
            while (it.hasNext()) {
                arrayList.add(((Month) it.next()).getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()));
            }
            LocalThemeScope localThemeScope = this.f533b;
            composer.startReplaceGroup(-1633490746);
            final InterfaceC5730l0<List<Month>> interfaceC5730l0 = this.f536e;
            final InterfaceC5730l0<Month> interfaceC5730l02 = this.f535d;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function2() { // from class: Ai.F
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2857v.F.e(interfaceC5730l0, interfaceC5730l02, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB);
            }
            Function2 function2 = (Function2) objB;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f534c);
            final Context context = this.f534c;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Ai.G
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2857v.F.f(Assemble, context, (n0) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C2857v.v(localThemeScope, modifierM, displayName, dropdownB, arrayList, function2, (Function1) objB2, composer, 196608, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            d(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$G */
    static final class G implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14800I f537a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f538b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f539c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f540d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ z1<List<Integer>> f541e;

        /* JADX WARN: Multi-variable type inference failed */
        G(InterfaceC14800I interfaceC14800I, LocalThemeScope localThemeScope, Context context, InterfaceC5726j0 interfaceC5726j0, z1<? extends List<Integer>> z1Var) {
            this.f537a = interfaceC14800I;
            this.f538b = localThemeScope;
            this.f539c = context;
            this.f540d = interfaceC5726j0;
            this.f541e = z1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(z1 z1Var, InterfaceC5726j0 interfaceC5726j0, String str, int i10) {
            Intrinsics.j(str, "<unused var>");
            C2857v.X(interfaceC5726j0, ((Number) C2857v.V(z1Var).get(i10)).intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC14915S interfaceC14915S, final Context context, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC14915S.getLabels().getPlaceholder(), "Day");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), "Day");
            AdsDropdown.g(interfaceC14915S.getIcons().getLabelIcon(), C.i.h.f15557d, "More Info", new Function0() { // from class: Ai.K
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2857v.G.g(context);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Context context) {
            Toast.makeText(context, "Select a day", 0).show();
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14915S Assemble, Composer composer, int i10) {
            int i11;
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
                ComposerKt.U(-566118203, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownDatePicker.<anonymous>.<anonymous> (AdsDropdown.kt:536)");
            }
            Integer numValueOf = Integer.valueOf(C2857v.W(this.f540d));
            if (numValueOf.intValue() == -1) {
                numValueOf = null;
            }
            String string = numValueOf != null ? numValueOf.toString() : null;
            if (string == null) {
                string = "";
            }
            Modifier modifierM = androidx.compose.foundation.layout.D.m(InterfaceC14800I.b(this.f537a, Modifier.INSTANCE, 3.0f, false, 2, null), 0.0f, 0.0f, this.f538b.getAdsSpacing().getThree().getDp(), 0.0f, 11, null);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            List listV = C2857v.V(this.f541e);
            int i12 = i11;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listV, 10));
            Iterator it = listV.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            LocalThemeScope localThemeScope = this.f538b;
            composer.startReplaceGroup(-1633490746);
            final z1<List<Integer>> z1Var = this.f541e;
            final InterfaceC5726j0 interfaceC5726j0 = this.f540d;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function2() { // from class: Ai.I
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2857v.G.e(z1Var, interfaceC5726j0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB);
            }
            Function2 function2 = (Function2) objB;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f539c) | ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble)));
            final Context context = this.f539c;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Ai.J
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2857v.G.f(Assemble, context, (n0) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C2857v.v(localThemeScope, modifierM, string, dropdownB, arrayList, function2, (Function1) objB2, composer, 196608, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            d(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$H */
    static final class H implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14800I f542a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f543b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f544c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Year> f545d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<List<Year>> f546e;

        H(InterfaceC14800I interfaceC14800I, LocalThemeScope localThemeScope, Context context, InterfaceC5730l0<Year> interfaceC5730l0, InterfaceC5730l0<List<Year>> interfaceC5730l02) {
            this.f542a = interfaceC14800I;
            this.f543b = localThemeScope;
            this.f544c = context;
            this.f545d = interfaceC5730l0;
            this.f546e = interfaceC5730l02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, String str, int i10) {
            Intrinsics.j(str, "<unused var>");
            C2857v.a0(interfaceC5730l02, (Year) C2857v.Y(interfaceC5730l0).get(i10));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC14915S interfaceC14915S, final Context context, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC14915S.getLabels().getPlaceholder(), "Year");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), "Year");
            AdsDropdown.g(interfaceC14915S.getIcons().getLabelIcon(), C.i.h.f15557d, "More Info", new Function0() { // from class: Ai.N
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2857v.H.g(context);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Context context) {
            Toast.makeText(context, "Select a year", 0).show();
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14915S Assemble, Composer composer, int i10) {
            int i11;
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
                ComposerKt.U(-1000081884, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownDatePicker.<anonymous>.<anonymous> (AdsDropdown.kt:558)");
            }
            String string = C2857v.Z(this.f545d).toString();
            Intrinsics.i(string, "toString(...)");
            Modifier modifierB = InterfaceC14800I.b(this.f542a, Modifier.INSTANCE, 4.0f, false, 2, null);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            List listY = C2857v.Y(this.f546e);
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listY, 10));
            Iterator it = listY.iterator();
            while (it.hasNext()) {
                String string2 = ((Year) it.next()).toString();
                Intrinsics.i(string2, "toString(...)");
                arrayList.add(string2);
            }
            LocalThemeScope localThemeScope = this.f543b;
            composer.startReplaceGroup(-1633490746);
            final InterfaceC5730l0<List<Year>> interfaceC5730l0 = this.f546e;
            final InterfaceC5730l0<Year> interfaceC5730l02 = this.f545d;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function2() { // from class: Ai.L
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2857v.H.e(interfaceC5730l0, interfaceC5730l02, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB);
            }
            Function2 function2 = (Function2) objB;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f544c);
            final Context context = this.f544c;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Ai.M
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2857v.H.f(Assemble, context, (n0) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C2857v.v(localThemeScope, modifierB, string, dropdownB, arrayList, function2, (Function1) objB2, composer, 196608, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            d(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$I */
    static final class I implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f547a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f548b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f549c;

        I(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f547a = localThemeScope;
            this.f548b = modifier;
            this.f549c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5730l0 interfaceC5730l0, String item, int i10) {
            Intrinsics.j(item, "item");
            f(interfaceC5730l0, item);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC14915S interfaceC14915S, final Context context, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC14915S.getLabels().getPlaceholder(), "Placeholder");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), "Choose Nothing (disabled)");
            AdsDropdown.g(interfaceC14915S.getIcons().getLabelIcon(), C.i.h.f15557d, "More Info", new Function0() { // from class: Ai.Q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2857v.I.l(context);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Context context) {
            Toast.makeText(context, "Dropdown example disabled", 0).show();
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14915S Assemble, Composer composer, int i10) {
            int i11;
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
                ComposerKt.U(-770918560, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownDisabled.<anonymous> (AdsDropdown.kt:641)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(CollectionsKt.s0(C2857v.f475a), null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            String strE = e(interfaceC5730l0);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, true, false, null, 55, null);
            List list = C2857v.f475a;
            LocalThemeScope localThemeScope = this.f547a;
            int i12 = i11;
            Modifier modifier = this.f548b;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Ai.O
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2857v.I.g(interfaceC5730l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f549c);
            final Context context = this.f549c;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Ai.P
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2857v.I.k(Assemble, context, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2857v.v(localThemeScope, modifier, strE, dropdownB, list, function2, (Function1) objB3, composer, 196608, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            d(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final String e(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        private static final void f(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$J */
    static final class J implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f550a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f551b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f552c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.v$J$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f553a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14915S f554b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<L5> f555c;

            a(LocalThemeScope localThemeScope, InterfaceC14915S interfaceC14915S, InterfaceC5730l0<L5> interfaceC5730l0) {
                this.f553a = localThemeScope;
                this.f554b = interfaceC14915S;
                this.f555c = interfaceC5730l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1981259530, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownEnabledDefaultOption.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:630)");
                }
                ri.j.h(this.f553a, this.f554b.getLabels().getInfoBlockMessage(), J.o(this.f555c).getMessage(), null, composer, 0, 4);
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

        J(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f550a = localThemeScope;
            this.f551b = modifier;
            this.f552c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC14915S interfaceC14915S, final Context context, InterfaceC5730l0 interfaceC5730l0, LocalThemeScope localThemeScope, n0 AdsDropdown) {
            q1.InfoBlock errorBlock;
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC14915S.getLabels().getPlaceholder(), "Placeholder");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), "Favorite Food");
            AdsDropdown.g(interfaceC14915S.getIcons().getLabelIcon(), C.i.h.f15557d, "More Info", new Function0() { // from class: Ai.U
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2857v.J.k(context);
                }
            });
            L5 l5O = o(interfaceC5730l0);
            if (Intrinsics.e(l5O, L5.a.f26367b) || Intrinsics.e(l5O, L5.b.f26368b)) {
                errorBlock = interfaceC14915S.getInfoBlocks().getErrorBlock();
            } else if (Intrinsics.e(l5O, L5.c.f26369b)) {
                errorBlock = interfaceC14915S.getInfoBlocks().getInformationBlock();
            } else if (Intrinsics.e(l5O, L5.e.f26371b)) {
                errorBlock = interfaceC14915S.getInfoBlocks().getSuccessBlock();
            } else if (Intrinsics.e(l5O, L5.f.f26372b)) {
                errorBlock = interfaceC14915S.getInfoBlocks().getWarningBlock();
            } else {
                if (!Intrinsics.e(l5O, L5.d.f26370b)) {
                    throw new NoWhenBranchMatchedException();
                }
                errorBlock = null;
            }
            if (errorBlock != null) {
                AdsDropdown.f(errorBlock, ComposableLambdaKt.composableLambdaInstance(-1981259530, true, new a(localThemeScope, interfaceC14915S, interfaceC5730l0)));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(Context context) {
            Toast.makeText(context, "Select a year", 0).show();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, String item, int i10) {
            Intrinsics.j(item, "item");
            l(interfaceC5730l0, item);
            p(interfaceC5730l02, i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? L5.d.f26370b : L5.f.f26372b : L5.e.f26371b : L5.c.f26369b : L5.a.f26367b);
            return Unit.f142422a;
        }

        public final void e(final InterfaceC14915S Assemble, Composer composer, int i10) {
            int i11;
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
                ComposerKt.U(299920743, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownEnabledDefaultOption.<anonymous> (AdsDropdown.kt:583)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(CollectionsKt.s0(C2857v.f475a), null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(L5.d.f26370b, null, 2, null);
                composer.t(objB2);
            }
            final InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB2;
            composer.P();
            String strF = f(interfaceC5730l0);
            boolean z10 = false;
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), CollectionsKt.p(L5.a.f26367b, L5.b.f26368b).contains(o(interfaceC5730l02)), Intrinsics.e(o(interfaceC5730l02), L5.f.f26372b), Intrinsics.e(o(interfaceC5730l02), L5.e.f26371b), false, false, null, 56, null);
            List list = C2857v.f475a;
            LocalThemeScope localThemeScope = this.f550a;
            int i12 = i11;
            Modifier modifier = this.f551b;
            composer.startReplaceGroup(-1633490746);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = new Function2() { // from class: Ai.S
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2857v.J.q(interfaceC5730l0, interfaceC5730l02, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB3);
            }
            Function2 function2 = (Function2) objB3;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            if ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) {
                z10 = true;
            }
            boolean zD = z10 | composer.D(this.f552c) | composer.D(this.f550a);
            final Context context = this.f552c;
            final LocalThemeScope localThemeScope2 = this.f550a;
            Object objB4 = composer.B();
            if (zD || objB4 == companion.a()) {
                objB4 = new Function1() { // from class: Ai.T
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2857v.J.g(Assemble, context, interfaceC5730l02, localThemeScope2, (n0) obj);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C2857v.v(localThemeScope, modifier, strF, dropdownB, list, function2, (Function1) objB4, composer, 196608, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            e(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final String f(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        private static final void l(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L5 o(InterfaceC5730l0<L5> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        private static final void p(InterfaceC5730l0<L5> interfaceC5730l0, L5 l52) {
            interfaceC5730l0.setValue(l52);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$K */
    static final class K implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f556a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f557b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f558c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ai.v$K$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f559a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14915S f560b;

            a(LocalThemeScope localThemeScope, InterfaceC14915S interfaceC14915S) {
                this.f559a = localThemeScope;
                this.f560b = interfaceC14915S;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(828585320, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownErrorState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:765)");
                }
                LocalThemeScope localThemeScope = this.f559a;
                InterfaceC14915S interfaceC14915S = this.f560b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                C16307b.b(localThemeScope, interfaceC14915S.getIcons().getInfoBlockIcon(), C.i.e.f15552d, "Validation Error", composer, 3456, 0);
                ri.j.h(localThemeScope, interfaceC14915S.getLabels().getInfoBlockMessage(), "Error dropdown uses red border with a red info block.", null, composer, 384, 4);
                composer.v();
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

        K(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f556a = localThemeScope;
            this.f557b = modifier;
            this.f558c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5730l0 interfaceC5730l0, String item, int i10) {
            Intrinsics.j(item, "item");
            f(interfaceC5730l0, item);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC14915S interfaceC14915S, final Context context, LocalThemeScope localThemeScope, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC14915S.getLabels().getPlaceholder(), "Choose a problem");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), "Problem Message");
            AdsDropdown.g(interfaceC14915S.getIcons().getLabelIcon(), C.i.h.f15557d, "More info", new Function0() { // from class: Ai.X
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2857v.K.l(context);
                }
            });
            AdsDropdown.e(interfaceC14915S.getLabels().getDescription(), "This is a description and describes more context around what this dropdown is used for.");
            AdsDropdown.f(interfaceC14915S.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(828585320, true, new a(localThemeScope, interfaceC14915S)));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Context context) {
            Toast.makeText(context, "Dropdown field with error state", 0).show();
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14915S Assemble, Composer composer, int i10) {
            int i11;
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
                ComposerKt.U(1132007507, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownErrorState.<anonymous> (AdsDropdown.kt:735)");
            }
            List listP = CollectionsKt.p("Can't be empty", "Princess is in another castle", "This is a long error message that describes further context around the error");
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(CollectionsKt.s0(listP), null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            String strE = e(interfaceC5730l0);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), true, false, false, false, false, null, 62, null);
            LocalThemeScope localThemeScope = this.f556a;
            int i12 = i11;
            Modifier modifier = this.f557b;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Ai.V
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2857v.K.g(interfaceC5730l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f558c) | composer.D(this.f556a);
            final Context context = this.f558c;
            final LocalThemeScope localThemeScope2 = this.f556a;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Ai.W
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2857v.K.k(Assemble, context, localThemeScope2, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2857v.v(localThemeScope, modifier, strE, dropdownB, listP, function2, (Function1) objB3, composer, 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            d(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final String e(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        private static final void f(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$L */
    static final class L implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f561a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f562b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f563c;

        L(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f561a = localThemeScope;
            this.f562b = modifier;
            this.f563c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5730l0 interfaceC5730l0, String item, int i10) {
            Intrinsics.j(item, "item");
            f(interfaceC5730l0, item);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC14915S interfaceC14915S, final Context context, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), "Favorite Food (no placeholder)");
            AdsDropdown.g(interfaceC14915S.getIcons().getLabelIcon(), C.i.h.f15557d, "More Info", new Function0() { // from class: Ai.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2857v.L.l(context);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Context context) {
            Toast.makeText(context, "Dropdown example with no placeholder", 0).show();
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14915S Assemble, Composer composer, int i10) {
            int i11;
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
                ComposerKt.U(1545297462, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownNoPlaceholder.<anonymous> (AdsDropdown.kt:702)");
            }
            List listP = CollectionsKt.p("", "Pho", "Sushi", "Large #2 combo sub sesame bun for white bread, no mayo, extra pickles, and a side of ranch");
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e("", null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            String strE = e(interfaceC5730l0);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            LocalThemeScope localThemeScope = this.f561a;
            int i12 = i11;
            Modifier modifier = this.f562b;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Ai.Y
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2857v.L.g(interfaceC5730l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f563c);
            final Context context = this.f563c;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Ai.Z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2857v.L.k(Assemble, context, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2857v.v(localThemeScope, modifier, strE, dropdownB, listP, function2, (Function1) objB3, composer, 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            d(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final String e(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        private static final void f(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$M */
    static final class M implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f564a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f565b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f566c;

        M(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f564a = localThemeScope;
            this.f565b = modifier;
            this.f566c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5730l0 interfaceC5730l0, String item, int i10) {
            Intrinsics.j(item, "item");
            f(interfaceC5730l0, item);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC14915S interfaceC14915S, final Context context, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC14915S.getLabels().getPlaceholder(), "Placeholder");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), "Choose a placeholder");
            AdsDropdown.g(interfaceC14915S.getIcons().getLabelIcon(), C.i.h.f15557d, "More Info", new Function0() { // from class: Ai.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2857v.M.l(context);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Context context) {
            Toast.makeText(context, "Dropdown example with placeholder", 0).show();
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14915S Assemble, Composer composer, int i10) {
            int i11;
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
                ComposerKt.U(208531733, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownPlaceholder.<anonymous> (AdsDropdown.kt:668)");
            }
            List listP = CollectionsKt.p("", "Lorem Ipsum", "The Office Quotes", "Random Math");
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e("", null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            String strE = e(interfaceC5730l0);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            LocalThemeScope localThemeScope = this.f564a;
            int i12 = i11;
            Modifier modifier = this.f565b;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Ai.b0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2857v.M.g(interfaceC5730l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f566c);
            final Context context = this.f566c;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Ai.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2857v.M.k(Assemble, context, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2857v.v(localThemeScope, modifier, strE, dropdownB, listP, function2, (Function1) objB3, composer, 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            d(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final String e(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        private static final void f(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$N */
    static final class N implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f567a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f568b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f569c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.v$N$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f570a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14915S f571b;

            a(LocalThemeScope localThemeScope, InterfaceC14915S interfaceC14915S) {
                this.f570a = localThemeScope;
                this.f571b = interfaceC14915S;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1339715760, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownStaticState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:896)");
                }
                ri.j.h(this.f570a, this.f571b.getLabels().getInfoBlockMessage(), "Static dropdown is static.", null, composer, 384, 4);
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

        N(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f567a = localThemeScope;
            this.f568b = modifier;
            this.f569c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5730l0 interfaceC5730l0, String item, int i10) {
            Intrinsics.j(item, "item");
            f(interfaceC5730l0, item);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC14915S interfaceC14915S, final Context context, LocalThemeScope localThemeScope, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC14915S.getLabels().getPlaceholder(), "Choose something static");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), "Static Dropdown");
            AdsDropdown.g(interfaceC14915S.getIcons().getLabelIcon(), C.i.h.f15557d, "More info", new Function0() { // from class: Ai.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2857v.N.l(context);
                }
            });
            AdsDropdown.f(interfaceC14915S.getInfoBlocks().getSuccessBlock(), ComposableLambdaKt.composableLambdaInstance(-1339715760, true, new a(localThemeScope, interfaceC14915S)));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Context context) {
            Toast.makeText(context, "Dropdown field with static state", 0).show();
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14915S Assemble, Composer composer, int i10) {
            int i11;
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
                ComposerKt.U(-523562555, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownStaticState.<anonymous> (AdsDropdown.kt:869)");
            }
            List listP = CollectionsKt.p("Electricity", "Stickers", "Sweaters");
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(CollectionsKt.s0(listP), null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            String strE = e(interfaceC5730l0);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, true, null, 47, null);
            LocalThemeScope localThemeScope = this.f567a;
            int i12 = i11;
            Modifier modifier = this.f568b;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Ai.e0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2857v.N.g(interfaceC5730l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f569c) | composer.D(this.f567a);
            final Context context = this.f569c;
            final LocalThemeScope localThemeScope2 = this.f567a;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Ai.f0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2857v.N.k(Assemble, context, localThemeScope2, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2857v.v(localThemeScope, modifier, strE, dropdownB, listP, function2, (Function1) objB3, composer, 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            d(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final String e(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        private static final void f(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$O */
    static final class O implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f572a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f573b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f574c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.v$O$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f575a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14915S f576b;

            a(LocalThemeScope localThemeScope, InterfaceC14915S interfaceC14915S) {
                this.f575a = localThemeScope;
                this.f576b = interfaceC14915S;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-327016132, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownWarningState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:813)");
                }
                ri.j.h(this.f575a, this.f576b.getLabels().getInfoBlockMessage(), "Warning uses standard input border with a yellow info block.", null, composer, 384, 4);
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

        O(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f572a = localThemeScope;
            this.f573b = modifier;
            this.f574c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5730l0 interfaceC5730l0, String item, int i10) {
            Intrinsics.j(item, "item");
            f(interfaceC5730l0, item);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC14915S interfaceC14915S, final Context context, LocalThemeScope localThemeScope, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC14915S.getLabels().getPlaceholder(), "Choose a warning");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), "Warning Message");
            AdsDropdown.g(interfaceC14915S.getIcons().getLabelIcon(), C.i.h.f15557d, "More info", new Function0() { // from class: Ai.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2857v.O.l(context);
                }
            });
            AdsDropdown.f(interfaceC14915S.getInfoBlocks().getWarningBlock(), ComposableLambdaKt.composableLambdaInstance(-327016132, true, new a(localThemeScope, interfaceC14915S)));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Context context) {
            Toast.makeText(context, "Dropdown field with warning", 0).show();
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14915S Assemble, Composer composer, int i10) {
            int i11;
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
                ComposerKt.U(-796070553, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownWarningState.<anonymous> (AdsDropdown.kt:785)");
            }
            List listP = CollectionsKt.p("Thin Ice", "Falling Rocks", "High Voltage", "Bridge ices before road", "Slippery when wet", "Watch for falling objects", "Do not enter");
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(CollectionsKt.s0(listP), null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            String strE = e(interfaceC5730l0);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            LocalThemeScope localThemeScope = this.f572a;
            int i12 = i11;
            Modifier modifier = this.f573b;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Ai.h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2857v.O.g(interfaceC5730l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f574c) | composer.D(this.f572a);
            final Context context = this.f574c;
            final LocalThemeScope localThemeScope2 = this.f572a;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Ai.i0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2857v.O.k(Assemble, context, localThemeScope2, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2857v.v(localThemeScope, modifier, strE, dropdownB, listP, function2, (Function1) objB3, composer, 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            d(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final String e(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        private static final void f(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LIi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LIi/h;", "s", "()LIi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$a, reason: case insensitive filesystem */
    public static final class C2858a extends Ii.c<Integer, p0, p0> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<p0, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<p0> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final p0 initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.v$a$a, reason: collision with other inner class name */
        public static final class C0012a implements Function0<p0> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ii.h f580a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2858a f581b;

            public C0012a(Ii.h hVar, C2858a c2858a) {
                this.f580a = hVar;
                this.f581b = c2858a;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ai.p0, Ii.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p0 invoke() {
                ?? r02 = this.f580a;
                this.f581b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ii.c
        public z1<p0> r() {
            return this.state;
        }

        @Override // Ii.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public p0 getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<p0, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C2858a(Function1 function1, Composer composer, int i10, Object[] objArr, Ii.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new C0012a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$b, reason: case insensitive filesystem */
    public static final class C2859b extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f582f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2859b(L1.A a10) {
            super(1);
            this.f582f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f582f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$c, reason: case insensitive filesystem */
    public static final class C2860c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f583f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f584g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f585h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f586i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ri.p f587j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ q1.f f588k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f589l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f590m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2 f591n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f592o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ C16309d f593p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ C16309d f594q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2860c(L1.n nVar, int i10, Function0 function0, String str, ri.p pVar, q1.f fVar, LocalThemeScope localThemeScope, boolean z10, Function2 function2, boolean z11, C16309d c16309d, C16309d c16309d2) {
            super(2);
            this.f584g = nVar;
            this.f585h = function0;
            this.f586i = str;
            this.f587j = pVar;
            this.f588k = fVar;
            this.f589l = localThemeScope;
            this.f590m = z10;
            this.f591n = function2;
            this.f592o = z11;
            this.f593p = c16309d;
            this.f594q = c16309d2;
            this.f583f = i10;
        }

        public final void a(Composer composer, int i10) {
            Composer composer2 = composer;
            if (((i10 & 11) ^ 2) == 0 && composer2.j()) {
                composer2.K();
                return;
            }
            int helpersHashCode = this.f584g.getHelpersHashCode();
            this.f584g.i();
            L1.n nVar = this.f584g;
            composer2.startReplaceGroup(-1110319593);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            nVar.e(new L1.h[]{hVarA, hVarC}, C4038f.INSTANCE.c());
            Modifier.Companion companion = Modifier.INSTANCE;
            composer2.startReplaceGroup(1849434622);
            Object objB = composer2.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = C2861d.f595a;
                composer2.t(objB);
            }
            composer2.P();
            Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion3.o(), false);
            int iA = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierK);
            InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion4.a();
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
            D1.c(composerA, measurePolicyG, companion4.e());
            D1.c(composerA, interfaceC5742sR, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C5664j c5664j = C5664j.f48612a;
            if (this.f586i.length() == 0) {
                composer2.startReplaceGroup(1706845276);
                ri.p pVar = this.f587j;
                if (pVar != null) {
                    composer2.startReplaceGroup(327606171);
                    Object[] objArr = {pVar};
                    composer2.startReplaceGroup(-2104237158);
                    composer2.startReplaceGroup(1849434622);
                    Object objB2 = composer2.B();
                    if (objB2 == companion2.a()) {
                        objB2 = C2863f.f597a;
                        composer2.t(objB2);
                    }
                    composer2.P();
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
                    composer2.startReplaceGroup(1252494947);
                    C2864g c2864g = new C2864g((Function1) objB2, composer2, 0, objArrCopyOf, pVar);
                    composer2.P();
                    c2864g.k(0, companion).invoke(composer2, 0);
                    composer2.P();
                    composer2.P();
                    Unit unit = Unit.f142422a;
                }
                composer2.P();
            } else {
                composer2.startReplaceGroup(1163440186);
                if (this.f588k.getReadOnly()) {
                    composer2.startReplaceGroup(1706927581);
                    LocalThemeScope localThemeScope = this.f589l;
                    Ji.I one = localThemeScope.getAdsTypography().getBodyCompact().getOne();
                    Ji.T adsColorsDisabled = this.f590m ? null : this.f589l.getAdsColors().getAdsColorsDisabled();
                    ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.J.H(companion, null, false, 3, null), adsColorsDisabled, null, null, F1.t.INSTANCE.b(), false, this.f588k.getMaxLines(), one, null, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, null), this.f586i, null, composer, 0, 4);
                    composer2 = composer;
                    composer2.P();
                } else {
                    composer2.startReplaceGroup(1707443638);
                    this.f591n.invoke(composer2, 0);
                    composer2.P();
                }
                composer2.P();
                Unit unit2 = Unit.f142422a;
            }
            composer2.v();
            composer2.startReplaceGroup(1849434622);
            Object objB3 = composer2.B();
            if (objB3 == companion2.a()) {
                objB3 = C2862e.f596a;
                composer2.t(objB3);
            }
            composer2.P();
            Modifier modifierK2 = nVar.k(companion, hVarC, (Function1) objB3);
            MeasurePolicy measurePolicyG2 = C5662h.g(companion3.o(), false);
            int iA2 = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR2 = composer2.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierK2);
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
            C16309d c16309d = this.f592o ? this.f593p : this.f594q;
            composer2.startReplaceGroup(-150765969);
            if (c16309d != null) {
                composer2.startReplaceGroup(327606171);
                Object[] objArr2 = {c16309d};
                composer2.startReplaceGroup(-2104237158);
                composer2.startReplaceGroup(1849434622);
                Object objB4 = composer2.B();
                if (objB4 == companion2.a()) {
                    objB4 = C2865h.f603a;
                    composer2.t(objB4);
                }
                composer2.P();
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, 1);
                composer2.startReplaceGroup(1252494947);
                C2866i c2866i = new C2866i((Function1) objB4, composer2, 0, objArrCopyOf2, c16309d);
                composer2.P();
                c2866i.k(0, companion).invoke(composer2, 0);
                composer2.P();
                composer2.P();
                Unit unit3 = Unit.f142422a;
            }
            composer2.P();
            composer2.v();
            composer2.P();
            if (this.f584g.getHelpersHashCode() != helpersHashCode) {
                this.f585h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$d, reason: case insensitive filesystem */
    static final class C2861d implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2861d f595a = new C2861d();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.l.f(L1.v.INSTANCE.a()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        C2861d() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$e, reason: case insensitive filesystem */
    static final class C2862e implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2862e f596a = new C2862e();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.l.g(L1.v.INSTANCE.c()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        C2862e() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$f, reason: case insensitive filesystem */
    public static final class C2863f implements Function1<ri.p, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2863f f597a = new C2863f();

        public final void a(ri.p pVar) {
            Intrinsics.j(pVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ri.p pVar) {
            a(pVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LIi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LIi/h;", "s", "()LIi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$g, reason: case insensitive filesystem */
    public static final class C2864g extends Ii.c<Integer, ri.p, ri.p> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<ri.p, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<ri.p> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final ri.p initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.v$g$a */
        public static final class a implements Function0<ri.p> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ii.h f601a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2864g f602b;

            public a(Ii.h hVar, C2864g c2864g) {
                this.f601a = hVar;
                this.f602b = c2864g;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ii.h, java.lang.Object, ri.p] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ri.p invoke() {
                ?? r02 = this.f601a;
                this.f602b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ii.c
        public z1<ri.p> r() {
            return this.state;
        }

        @Override // Ii.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public ri.p getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<ri.p, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C2864g(Function1 function1, Composer composer, int i10, Object[] objArr, Ii.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$h, reason: case insensitive filesystem */
    public static final class C2865h implements Function1<C16309d, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2865h f603a = new C2865h();

        public final void a(C16309d c16309d) {
            Intrinsics.j(c16309d, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C16309d c16309d) {
            a(c16309d);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LIi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LIi/h;", "s", "()LIi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$i, reason: case insensitive filesystem */
    public static final class C2866i extends Ii.c<Integer, C16309d, C16309d> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<C16309d, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<C16309d> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final C16309d initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.v$i$a */
        public static final class a implements Function0<C16309d> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ii.h f607a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2866i f608b;

            public a(Ii.h hVar, C2866i c2866i) {
                this.f607a = hVar;
                this.f608b = c2866i;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ii.h, java.lang.Object, pi.d] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C16309d invoke() {
                ?? r02 = this.f607a;
                this.f608b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ii.c
        public z1<C16309d> r() {
            return this.state;
        }

        @Override // Ii.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C16309d getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<C16309d, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C2866i(Function1 function1, Composer composer, int i10, Object[] objArr, Ii.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$j, reason: case insensitive filesystem */
    static final class C2867j implements Function1<L1.F, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2867j f609a = new C2867j();

        public final void a(L1.F constrain) {
            Intrinsics.j(constrain, "$this$constrain");
            x.a.a(constrain.getTop(), constrain.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrain.getBottom(), constrain.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(L1.F f10) {
            a(f10);
            return Unit.f142422a;
        }

        C2867j() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$k, reason: case insensitive filesystem */
    static final class C2868k implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2868k f610a = new C2868k();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            C4039g.o(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        C2868k() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$l, reason: case insensitive filesystem */
    static final class C2869l implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f611a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f612b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f613c;

        C2869l(L1.h hVar, L1.h hVar2, LocalThemeScope localThemeScope) {
            this.f611a = hVar;
            this.f612b = hVar2;
            this.f613c = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            C4039g.o(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, null);
            C4039g.n(constrainAs, this.f611a.getBottom(), this.f612b.getTop(), this.f613c.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 0.0f, 0.0f, BinsView.TOTE_HEIGHT_DP, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$m, reason: case insensitive filesystem */
    static final class C2870m implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2870m f614a = new C2870m();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            C4039g.o(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        C2870m() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$n, reason: case insensitive filesystem */
    static final class C2871n implements Function1<Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f615a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f616b;

        C2871n(boolean z10, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f615a = z10;
            this.f616b = interfaceC5730l0;
        }

        public final void a(boolean z10) {
            if (this.f615a) {
                return;
            }
            C2857v.C(this.f616b, z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$o, reason: case insensitive filesystem */
    static final class C2872o implements Function1<String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2872o f617a = new C2872o();

        public final void a(String it) {
            Intrinsics.j(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f142422a;
        }

        C2872o() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$p */
    static final class p implements Function2<String, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC18489g1<String, Integer> f618a;

        p(InterfaceC18489g1<String, Integer> interfaceC18489g1) {
            this.f618a = interfaceC18489g1;
        }

        public final void a(String value, int i10) {
            Intrinsics.j(value, "value");
            this.f618a.A().invoke(value, Integer.valueOf(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$q */
    static final class q implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f619a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC18489g1<String, Integer> f620b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0.l f621c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f622d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ z1<Boolean> f623e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f624f;

        q(LocalThemeScope localThemeScope, InterfaceC18489g1<String, Integer> interfaceC18489g1, h0.l lVar, boolean z10, z1<Boolean> z1Var, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f619a = localThemeScope;
            this.f620b = interfaceC18489g1;
            this.f621c = lVar;
            this.f622d = z10;
            this.f623e = z1Var;
            this.f624f = interfaceC5730l0;
        }

        public final void a(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer, int i10) {
            int i11;
            Intrinsics.j(innerTextField, "innerTextField");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.D(innerTextField) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1049320427, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.AdsDropdownField.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:240)");
            }
            int i12 = i11;
            LocalThemeScope localThemeScope = this.f619a;
            Modifier.Companion companion = Modifier.INSTANCE;
            V0.D1 shape = this.f620b.getTemplate().getShape();
            if (shape == null) {
                shape = C16692i.c(this.f619a.getAdsCornerRadii().getRadius04().getDp());
            }
            Modifier modifierG = C13439f.g(companion, H1.h.p(C2857v.D(this.f623e) ? 2 : 1), this.f620b.getTemplate().getColors().e(this.f620b.getTemplate().getState(), this.f621c, composer, 0).getValue().getValue(), shape);
            V0.D1 shape2 = this.f620b.getTemplate().getShape();
            if (shape2 == null) {
                shape2 = C16692i.c(this.f619a.getAdsCornerRadii().getRadius04().getDp());
            }
            C2857v.y(localThemeScope, androidx.compose.foundation.layout.D.l(androidx.compose.foundation.j.b(T0.e.a(modifierG, shape2), this.f621c, C17916Y0.f(false, 0.0f, 0L, 7, null)), this.f619a.getAdsSpacing().getFive().getDp(), this.f619a.getAdsSpacing().getFour().getDp(), this.f619a.getAdsSpacing().getFour().getDp(), this.f619a.getAdsSpacing().getFour().getDp()), this.f620b.getTemplate(), this.f620b.getValue(), C2857v.B(this.f624f), true ^ this.f622d, this.f620b.getPlaceHolder(), this.f620b.getArrowUpIcon(), this.f620b.getArrowDownIcon(), innerTextField, composer, (i12 << 27) & 1879048192, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            a(function2, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$r */
    static final class r implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final r f625a = new r();

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }

        r() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$s */
    public static final class s extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f626f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(L1.A a10) {
            super(1);
            this.f626f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f626f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$t */
    public static final class t extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f627f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f628g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f629h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC18489g1 f630i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f631j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f632k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ h0.l f633l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0 f634m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ z1 f635n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(L1.n nVar, int i10, Function0 function0, InterfaceC18489g1 interfaceC18489g1, LocalThemeScope localThemeScope, boolean z10, h0.l lVar, InterfaceC5730l0 interfaceC5730l0, z1 z1Var) {
            super(2);
            this.f628g = nVar;
            this.f629h = function0;
            this.f630i = interfaceC18489g1;
            this.f631j = localThemeScope;
            this.f632k = z10;
            this.f633l = lVar;
            this.f634m = interfaceC5730l0;
            this.f635n = z1Var;
            this.f627f = i10;
        }

        public final void a(Composer composer, int i10) {
            L1.h hVar;
            int i11;
            int i12;
            boolean z10;
            char c10;
            Composer composer2 = composer;
            if (((i10 & 11) ^ 2) == 0 && composer2.j()) {
                composer2.K();
                return;
            }
            int helpersHashCode = this.f628g.getHelpersHashCode();
            this.f628g.i();
            L1.n nVar = this.f628g;
            composer2.startReplaceGroup(1776662291);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            L1.h hVarF = bVarM.f();
            L1.E eF = nVar.f(new L1.h[]{hVarA, hVarC, hVarD, hVarE, hVarF}, C4038f.INSTANCE.b());
            composer2.startReplaceGroup(1849434622);
            Object objB = composer2.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = C2867j.f609a;
                composer2.t(objB);
            }
            composer2.P();
            nVar.b(eF, (Function1) objB);
            ri.p pVarJ = this.f630i.getLabel();
            composer2.startReplaceGroup(1442795318);
            if (pVarJ == null) {
                hVar = hVarF;
                i11 = 327606171;
            } else {
                e.c cVarI = P0.e.INSTANCE.i();
                C5658d.e eVarG = C5658d.f48555a.g();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composer2.startReplaceGroup(1849434622);
                Object objB2 = composer2.B();
                if (objB2 == companion.a()) {
                    objB2 = C2868k.f610a;
                    composer2.t(objB2);
                }
                composer2.P();
                Modifier modifierK = nVar.k(companion2, hVarA, (Function1) objB2);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, cVarI, composer2, 54);
                int iA = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR = composer2.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierK);
                InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion3.a();
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
                D1.c(composerA, measurePolicyB, companion3.e());
                D1.c(composerA, interfaceC5742sR, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion3.f());
                C14801J c14801j = C14801J.f139030a;
                composer2.startReplaceGroup(327606171);
                Object[] objArr = {pVarJ};
                composer2.startReplaceGroup(-2104237158);
                composer2.startReplaceGroup(1849434622);
                Object objB3 = composer2.B();
                if (objB3 == companion.a()) {
                    objB3 = u.f636a;
                    composer2.t(objB3);
                }
                composer2.P();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
                composer2.startReplaceGroup(1252494947);
                C0013v c0013v = new C0013v((Function1) objB3, composer2, 0, objArrCopyOf, pVarJ);
                composer2.P();
                c0013v.k(0, companion2).invoke(composer2, 0);
                composer2.P();
                composer2.P();
                composer2.startReplaceGroup(-2057902760);
                if (this.f630i.getLabelIcon() != null) {
                    C14802K.a(androidx.compose.foundation.layout.J.z(companion2, this.f631j.getAdsSpacing().getThree().getDp()), composer2, 0);
                    LocalThemeScope localThemeScope = this.f631j;
                    Function0<Unit> function0S0 = this.f630i.s0();
                    C16309d c16309dQ = this.f630i.getLabelIcon();
                    Intrinsics.g(c16309dQ);
                    hVar = hVarF;
                    i11 = 327606171;
                    s1.b(localThemeScope, function0S0, c16309dQ, H1.h.p(20), composer2, 3072, 0);
                    composer2 = composer2;
                } else {
                    hVar = hVarF;
                    i11 = 327606171;
                }
                composer2.P();
                composer2.v();
                Unit unit = Unit.f142422a;
            }
            composer2.P();
            ri.p description = this.f630i.getDescription();
            composer2.startReplaceGroup(1442820383);
            if (description == null) {
                i12 = 1849434622;
                z10 = true;
                c10 = 36451;
            } else {
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composer2.startReplaceGroup(-1746271574);
                boolean zV = composer2.V(hVarA) | composer2.V(hVarD) | composer2.D(this.f631j);
                Object objB4 = composer2.B();
                if (zV || objB4 == companion.a()) {
                    objB4 = new C2869l(hVarA, hVarD, this.f631j);
                    composer2.t(objB4);
                }
                composer2.P();
                Modifier modifierM = androidx.compose.foundation.layout.D.m(nVar.k(companion4, hVarC, (Function1) objB4), 0.0f, this.f631j.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
                int iA2 = C5717f.a(composer2, 0);
                InterfaceC5742s interfaceC5742sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierM);
                InterfaceC5811g.Companion companion5 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A2 = companion5.a();
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
                D1.c(composerA2, measurePolicyG, companion5.e());
                D1.c(composerA2, interfaceC5742sR2, companion5.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion5.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion5.f());
                C5664j c5664j = C5664j.f48612a;
                composer2.startReplaceGroup(i11);
                Object[] objArr2 = {description};
                composer2.startReplaceGroup(-2104237158);
                i12 = 1849434622;
                composer2.startReplaceGroup(1849434622);
                Object objB5 = composer2.B();
                if (objB5 == companion.a()) {
                    objB5 = w.f642a;
                    composer2.t(objB5);
                }
                composer2.P();
                z10 = true;
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, 1);
                composer2.startReplaceGroup(1252494947);
                c10 = 36451;
                x xVar = new x((Function1) objB5, composer2, 0, objArrCopyOf2, description);
                composer2.P();
                xVar.k(0, companion4).invoke(composer2, 0);
                composer2.P();
                composer2.P();
                composer2.v();
            }
            composer2.P();
            q1.f fVarB = this.f630i.getTemplate();
            Modifier.Companion companion6 = Modifier.INSTANCE;
            composer2.startReplaceGroup(i12);
            Object objB6 = composer2.B();
            if (objB6 == companion.a()) {
                objB6 = C2870m.f614a;
                composer2.t(objB6);
            }
            composer2.P();
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(nVar.k(companion6, hVarE, (Function1) objB6), 0.0f, this.f630i.getLabel() != null ? this.f631j.getAdsSpacing().getThree().getDp() : H1.h.p(0), 0.0f, 0.0f, 13, null);
            String str = (String) this.f630i.getValue();
            boolean zB = C2857v.B(this.f634m);
            boolean z11 = this.f632k ^ z10;
            List<String> listZ = this.f630i.Z();
            if (listZ == null) {
                listZ = CollectionsKt.m();
            }
            LocalThemeScope localThemeScope2 = this.f631j;
            composer2.startReplaceGroup(-1633490746);
            boolean zA = composer2.a(this.f632k);
            Object objB7 = composer2.B();
            if (zA || objB7 == companion.a()) {
                objB7 = new C2871n(this.f632k, this.f634m);
                composer2.t(objB7);
            }
            Function1 function1 = (Function1) objB7;
            composer2.P();
            composer2.startReplaceGroup(i12);
            Object objB8 = composer2.B();
            if (objB8 == companion.a()) {
                objB8 = C2872o.f617a;
                composer2.t(objB8);
            }
            Function1 function12 = (Function1) objB8;
            composer2.P();
            composer2.startReplaceGroup(5004770);
            boolean zD = composer2.D(this.f630i);
            Object objB9 = composer2.B();
            if (zD || objB9 == companion.a()) {
                objB9 = new p(this.f630i);
                composer2.t(objB9);
            }
            composer2.P();
            h0.l lVar = this.f633l;
            Composer composer3 = composer2;
            C2857v.G(localThemeScope2, modifierM2, fVarB, str, zB, z11, listZ, function1, function12, (Function2) objB9, lVar, ComposableLambdaKt.c(-1049320427, true, new q(this.f631j, this.f630i, lVar, this.f632k, this.f635n, this.f634m), composer2, 54), composer3, 100663296, 48, 0);
            C16532e c16532eL = this.f630i.getInfoBlockScope();
            composer3.startReplaceGroup(1442912108);
            if (c16532eL != null) {
                composer3.startReplaceGroup(1849434622);
                Object objB10 = composer3.B();
                if (objB10 == companion.a()) {
                    objB10 = r.f625a;
                    composer3.t(objB10);
                }
                composer3.P();
                Modifier modifierM3 = androidx.compose.foundation.layout.D.m(nVar.k(companion6, hVar, (Function1) objB10), 0.0f, this.f631j.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyG2 = C5662h.g(P0.e.INSTANCE.o(), false);
                int iA3 = C5717f.a(composer3, 0);
                InterfaceC5742s interfaceC5742sR3 = composer3.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer3, modifierM3);
                InterfaceC5811g.Companion companion7 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A3 = companion7.a();
                if (composer3.k() == null) {
                    C5717f.c();
                }
                composer3.F();
                if (composer3.getInserting()) {
                    composer3.I(function0A3);
                } else {
                    composer3.s();
                }
                Composer composerA3 = D1.a(composer3);
                D1.c(composerA3, measurePolicyG2, companion7.e());
                D1.c(composerA3, interfaceC5742sR3, companion7.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion7.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion7.f());
                C5664j c5664j2 = C5664j.f48612a;
                composer3.startReplaceGroup(327606171);
                Object[] objArr3 = {c16532eL};
                composer3.startReplaceGroup(-2104237158);
                composer3.startReplaceGroup(1849434622);
                Object objB11 = composer3.B();
                if (objB11 == companion.a()) {
                    objB11 = y.f648a;
                    composer3.t(objB11);
                }
                composer3.P();
                Object[] objArrCopyOf3 = Arrays.copyOf(objArr3, 1);
                composer3.startReplaceGroup(1252494947);
                z zVar = new z((Function1) objB11, composer3, 0, objArrCopyOf3, c16532eL);
                composer3.P();
                zVar.k(0, companion6).invoke(composer3, 0);
                composer3.P();
                composer3.P();
                composer3.v();
            }
            composer3.P();
            composer3.P();
            if (this.f628g.getHelpersHashCode() != helpersHashCode) {
                this.f629h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$u */
    public static final class u implements Function1<ri.p, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final u f636a = new u();

        public final void a(ri.p pVar) {
            Intrinsics.j(pVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ri.p pVar) {
            a(pVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LIi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LIi/h;", "s", "()LIi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$v, reason: collision with other inner class name */
    public static final class C0013v extends Ii.c<Integer, ri.p, ri.p> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<ri.p, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<ri.p> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final ri.p initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.v$v$a */
        public static final class a implements Function0<ri.p> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ii.h f640a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0013v f641b;

            public a(Ii.h hVar, C0013v c0013v) {
                this.f640a = hVar;
                this.f641b = c0013v;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ii.h, java.lang.Object, ri.p] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ri.p invoke() {
                ?? r02 = this.f640a;
                this.f641b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ii.c
        public z1<ri.p> r() {
            return this.state;
        }

        @Override // Ii.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public ri.p getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<ri.p, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0013v(Function1 function1, Composer composer, int i10, Object[] objArr, Ii.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$w */
    public static final class w implements Function1<ri.p, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final w f642a = new w();

        public final void a(ri.p pVar) {
            Intrinsics.j(pVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ri.p pVar) {
            a(pVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LIi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LIi/h;", "s", "()LIi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$x */
    public static final class x extends Ii.c<Integer, ri.p, ri.p> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<ri.p, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<ri.p> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final ri.p initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.v$x$a */
        public static final class a implements Function0<ri.p> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ii.h f646a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f647b;

            public a(Ii.h hVar, x xVar) {
                this.f646a = hVar;
                this.f647b = xVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ii.h, java.lang.Object, ri.p] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ri.p invoke() {
                ?? r02 = this.f646a;
                this.f647b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ii.c
        public z1<ri.p> r() {
            return this.state;
        }

        @Override // Ii.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public ri.p getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<ri.p, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public x(Function1 function1, Composer composer, int i10, Object[] objArr, Ii.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.v$y */
    public static final class y implements Function1<C16532e, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final y f648a = new y();

        public final void a(C16532e c16532e) {
            Intrinsics.j(c16532e, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C16532e c16532e) {
            a(c16532e);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LIi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LIi/h;", "s", "()LIi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ai.v$z */
    public static final class z extends Ii.c<Integer, C16532e, C16532e> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<C16532e, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<C16532e> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final C16532e initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ai.v$z$a */
        public static final class a implements Function0<C16532e> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ii.h f652a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f653b;

            public a(Ii.h hVar, z zVar) {
                this.f652a = hVar;
                this.f653b = zVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ii.h, java.lang.Object, qi.e] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C16532e invoke() {
                ?? r02 = this.f652a;
                this.f653b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ii.c
        public z1<C16532e> r() {
            return this.state;
        }

        @Override // Ii.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C16532e getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<C16532e, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public z(Function1 function1, Composer composer, int i10, Object[] objArr, Ii.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(final Ji.LocalThemeScope r25, androidx.compose.ui.Modifier r26, final ji.q1.f r27, final java.lang.String r28, final boolean r29, boolean r30, final java.util.List<java.lang.String> r31, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r32, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r33, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> r34, final h0.l r35, final kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.C2857v.G(Ji.M, androidx.compose.ui.Modifier, ji.q1$f, java.lang.String, boolean, boolean, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, h0.l, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(zi.InterfaceC18489g1<java.lang.String, java.lang.Integer> r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.C2857v.A(zi.g1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.H0(semantics, true);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(InterfaceC18489g1 interfaceC18489g1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        A(interfaceC18489g1, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(String it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(String str, int i10) {
        Intrinsics.j(str, "<unused var>");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, Modifier modifier, q1.f fVar, String str, boolean z10, boolean z11, List list, Function1 function1, Function1 function12, Function2 function2, h0.l lVar, Function3 function3, int i10, int i11, int i12, Composer composer, int i13) {
        G(localThemeScope, modifier, fVar, str, z10, z11, list, function1, function12, function2, lVar, function3, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(final boolean z10, final List<String> list, final String str, final d0.V v10, Composer composer, final int i10) {
        int i11;
        String str2;
        d0.V v11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1520741855);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(list) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            str2 = str;
            i11 |= composerStartRestartGroup.V(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i10 & 3072) == 0) {
            v11 = v10;
            i11 |= composerStartRestartGroup.V(v11) ? 2048 : 1024;
        } else {
            v11 = v10;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1520741855, i11, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.AutoscrollToSelectedEffect (AdsDropdown.kt:449)");
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i12 = i11 & 14;
            boolean zD = ((i11 & 7168) == 2048) | (i12 == 4) | composerStartRestartGroup.D(list) | ((i11 & 896) == 256);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                B b10 = new B(z10, list, str2, v11, null);
                composerStartRestartGroup.t(b10);
                objB = b10;
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(boolValueOf, (Function2) objB, composerStartRestartGroup, i12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2857v.L(z10, list, str, v10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(boolean z10, List list, String str, d0.V v10, int i10, Composer composer, int i11) {
        K(z10, list, str, v10, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void M(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1734480962);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1734480962, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownAffirmativeState (AdsDropdown.kt:823)");
            }
            Ji.Q.e(localThemeScope, H0.f139668a, ComposableLambdaKt.c(-484535411, true, new D(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2857v.N(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        M(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void O(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-811976944);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-811976944, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownComplexModifier (AdsDropdown.kt:903)");
            }
            Ji.Q.e(localThemeScope, H0.f139668a, ComposableLambdaKt.c(59627873, true, new E(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2857v.P(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        O(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Q(Ji.LocalThemeScope r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.C2857v.Q(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List U(InterfaceC5730l0 interfaceC5730l0) {
        Month monthS = S(interfaceC5730l0);
        return CollectionsKt.j1(new IntRange(1, monthS != null ? monthS.maxLength() : 31));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        Q(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void c0(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1989922961);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1989922961, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownDisabled (AdsDropdown.kt:638)");
            }
            Ji.Q.e(localThemeScope, H0.f139668a, ComposableLambdaKt.c(-770918560, true, new I(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2857v.d0(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        c0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void e0(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-895073000);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-895073000, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownEnabledDefaultOption (AdsDropdown.kt:580)");
            }
            Ji.Q.e(localThemeScope, H0.f139668a, ComposableLambdaKt.c(299920743, true, new J(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2857v.f0(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        e0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void g0(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(10920260);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(10920260, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownErrorState (AdsDropdown.kt:732)");
            }
            Ji.Q.e(localThemeScope, H0.f139668a, ComposableLambdaKt.c(1132007507, true, new K(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2857v.h0(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        g0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void i0(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(900815781);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(900815781, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownNoPlaceholder (AdsDropdown.kt:699)");
            }
            Ji.Q.e(localThemeScope, H0.f139668a, ComposableLambdaKt.c(1545297462, true, new L(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2857v.j0(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        i0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void k0(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-185434556);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-185434556, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownPlaceholder (AdsDropdown.kt:665)");
            }
            Ji.Q.e(localThemeScope, H0.f139668a, ComposableLambdaKt.c(208531733, true, new M(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2857v.l0(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        k0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void m0(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-917528844);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-917528844, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownStaticState (AdsDropdown.kt:866)");
            }
            Ji.Q.e(localThemeScope, H0.f139668a, ComposableLambdaKt.c(-523562555, true, new N(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2857v.n0(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void o0(final LocalThemeScope localThemeScope, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-124123624);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-124123624, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownWarningState (AdsDropdown.kt:782)");
            }
            Ji.Q.e(localThemeScope, H0.f139668a, ComposableLambdaKt.c(-796070553, true, new O(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2857v.p0(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        o0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void q0(final LocalThemeScope localThemeScope, Modifier modifier, Modifier modifier2, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1472832667);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier2) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i14 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1472832667, i12, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdowns (AdsDropdown.kt:949)");
            }
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            int i15 = i12 & 14;
            O(localThemeScope, androidx.compose.foundation.layout.D.k(modifier2, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 1, null), composerStartRestartGroup, i15, 0);
            e0(localThemeScope, androidx.compose.foundation.layout.D.k(modifier2, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 1, null), composerStartRestartGroup, i15, 0);
            composerStartRestartGroup.startReplaceGroup(-1402875570);
            if (Build.VERSION.SDK_INT >= 26) {
                Q(localThemeScope, androidx.compose.foundation.layout.D.k(modifier2, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 1, null), composerStartRestartGroup, i15, 0);
            }
            composerStartRestartGroup.P();
            c0(localThemeScope, androidx.compose.foundation.layout.D.k(modifier2, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 1, null), composerStartRestartGroup, i15, 0);
            k0(localThemeScope, androidx.compose.foundation.layout.D.k(modifier2, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 1, null), composerStartRestartGroup, i15, 0);
            i0(localThemeScope, androidx.compose.foundation.layout.D.k(modifier2, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 1, null), composerStartRestartGroup, i15, 0);
            g0(localThemeScope, androidx.compose.foundation.layout.D.k(modifier2, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 1, null), composerStartRestartGroup, i15, 0);
            o0(localThemeScope, androidx.compose.foundation.layout.D.k(modifier2, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 1, null), composerStartRestartGroup, i15, 0);
            M(localThemeScope, androidx.compose.foundation.layout.D.k(modifier2, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 1, null), composerStartRestartGroup, i15, 0);
            m0(localThemeScope, androidx.compose.foundation.layout.D.k(modifier2, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 1, null), composerStartRestartGroup, i15, 0);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier3 = modifier;
        final Modifier modifier4 = modifier2;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ai.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2857v.r0(localThemeScope, modifier3, modifier4, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(LocalThemeScope localThemeScope, Modifier modifier, Modifier modifier2, int i10, int i11, Composer composer, int i12) {
        q0(localThemeScope, modifier, modifier2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(final Ji.LocalThemeScope r16, androidx.compose.ui.Modifier r17, java.lang.String r18, final ji.q1.f.Dropdown r19, final java.util.List<java.lang.String> r20, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> r21, kotlin.jvm.functions.Function1<? super Ai.n0, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.C2857v.v(Ji.M, androidx.compose.ui.Modifier, java.lang.String, ji.q1$f$b, java.util.List, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(n0 n0Var) {
        Intrinsics.j(n0Var, "<this>");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, Modifier modifier, String str, q1.f.Dropdown dropdown, List list, Function2 function2, Function1 function1, int i10, int i11, Composer composer, int i12) {
        v(localThemeScope, modifier, str, dropdown, list, function2, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y(final Ji.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final ji.q1.f r23, final java.lang.String r24, final boolean r25, boolean r26, final ri.p r27, final pi.C16309d r28, final pi.C16309d r29, @android.annotation.SuppressLint({"ComposableLambdaParameterNaming"}) final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.C2857v.y(Ji.M, androidx.compose.ui.Modifier, ji.q1$f, java.lang.String, boolean, boolean, ri.p, pi.d, pi.d, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, Modifier modifier, q1.f fVar, String str, boolean z10, boolean z11, ri.p pVar, C16309d c16309d, C16309d c16309d2, Function2 function2, int i10, int i11, Composer composer, int i12) {
        y(localThemeScope, modifier, fVar, str, z10, z11, pVar, c16309d, c16309d2, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Month> R(InterfaceC5730l0<List<Month>> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Month S(InterfaceC5730l0<Month> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(InterfaceC5730l0<Month> interfaceC5730l0, Month month) {
        interfaceC5730l0.setValue(month);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> V(z1<? extends List<Integer>> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int W(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Year> Y(InterfaceC5730l0<List<Year>> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Year Z(InterfaceC5730l0<Year> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(InterfaceC5730l0<Year> interfaceC5730l0, Year year) {
        interfaceC5730l0.setValue(year);
    }
}
