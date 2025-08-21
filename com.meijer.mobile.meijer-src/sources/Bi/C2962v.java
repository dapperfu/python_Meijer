package Bi;

import Ai.InterfaceC2817g1;
import Ai.s1;
import Bi.C2962v;
import Ki.C;
import Ki.LocalThemeScope;
import L1.C4009f;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import Qi.L5;
import V0.SolidColor;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.text.C5815e;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13572f;
import j$.time.Month;
import j$.time.Year;
import j$.time.format.TextStyle;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ki.H0;
import ki.InterfaceC15149S;
import ki.q1;
import kotlin.AbstractC18019l0;
import kotlin.C17982Y0;
import kotlin.C18003g;
import kotlin.C18025n0;
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
import mv.InterfaceC15783O;
import qi.C16671b;
import qi.C16673d;
import r0.C16806i;
import r1.C16819m;
import ri.C16913e;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0090\u0001\u0010\u0015\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u000726\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t2\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a)\u0010\u0018\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001am\u0010%\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 2\u000e\b\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0#H\u0001¢\u0006\u0004\b%\u0010&\u001aÄ\u0001\u0010.\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u00112\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u00112\u001a\b\u0002\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010,\u001a\u00020+2'\u0010-\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000f0#¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000f0\u0011H\u0001¢\u0006\u0004\b.\u0010/\u001a5\u00102\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u00101\u001a\u000200H\u0003¢\u0006\u0004\b2\u00103\u001a\u001d\u00104\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b4\u00105\u001a\u001d\u00106\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b6\u00105\u001a\u001d\u00107\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b7\u00105\u001a\u001d\u00108\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b8\u00105\u001a\u001d\u00109\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b9\u00105\u001a\u001d\u0010:\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b:\u00105\u001a\u001d\u0010;\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b;\u00105\u001a\u001d\u0010<\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b<\u00105\u001a\u001d\u0010=\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b=\u00105\u001a\u001d\u0010>\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b>\u00105\u001a'\u0010@\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010?\u001a\u00020\u0001H\u0001¢\u0006\u0004\b@\u0010A\"\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006T²\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010E\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\u0012\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u00078\nX\u008a\u0084\u0002²\u0006\u0010\u0010H\u001a\u0004\u0018\u00010F8\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010I\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010J\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010M\u001a\u00020K8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010P\u001a\u00020O8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010Q\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010S\u001a\u00020R8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00018\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "value", "Lki/q1$f$b;", "template", "", "items", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "item", "", "index", "", "onValueChange", "Lkotlin/Function1;", "LBi/n0;", "Lkotlin/ExtensionFunctionType;", "content", "v", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lki/q1$f$b;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LAi/g1;", "A", "(LAi/g1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lki/q1$f;", "", "expanded", "enabled", "Lsi/p;", "placeHolder", "Lqi/d;", "arrowUpIcon", "arrowDownIcon", "Lkotlin/Function0;", "innerTextField", "y", "(LKi/M;Landroidx/compose/ui/Modifier;Lki/q1$f;Ljava/lang/String;ZZLsi/p;Lqi/d;Lqi/d;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "dropdownItems", "onExpandedChange", "shadowedOnValueChanged", "dropdownOnValueChanged", "Lh0/l;", "interactionSource", "decorationBox", "G", "(LKi/M;Landroidx/compose/ui/Modifier;Lki/q1$f;Ljava/lang/String;ZZLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lh0/l;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Ld0/V;", "dropdownScrollState", "K", "(ZLjava/util/List;Ljava/lang/String;Ld0/V;Landroidx/compose/runtime/Composer;I)V", "Q", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "e0", "c0", "k0", "i0", "g0", "o0", "M", "m0", "O", "dropdownModifier", "q0", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "a", "Ljava/util/List;", "EXAMPLE_OPTION_ITEMS", "isFocused", "j$/time/Month", "months", "selectedMonth", "days", "selectedDay", "j$/time/Year", "years", "selectedYear", "selectedItem", "LQi/L5;", "state", "selectedValue", "", "widthScale", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Bi.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2962v {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f2933a = CollectionsKt.p("Default text item", "Error text item example", "Info text item example", "Success text item example", "Warning text item example", "Selected item", "A really long option that will probably span multiple lines if available.");

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$A */
    static final class A implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f2934a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f2935b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f2936c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q1.f f2937d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f2938e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<String> f2939f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f2940g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f2941h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h0.l f2942i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f2943j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f2944k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ d0.V f2945l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<String, Integer, Unit> f2946m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Bi.v$A$a */
        static final class a implements Function3<AbstractC18019l0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q1.f f2947a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f2948b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<String> f2949c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f2950d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f2951e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h0.l f2952f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f2953g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f2954h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f2955i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function1<Boolean, Unit> f2956j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ d0.V f2957k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function2<String, Integer, Unit> f2958l;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Bi.v$A$a$a, reason: collision with other inner class name */
            static final class C0061a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ List<String> f2959a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f2960b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f2961c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ d0.V f2962d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ Function1<Boolean, Unit> f2963e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function2<String, Integer, Unit> f2964f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f2965g;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Bi.v$A$a$a$a, reason: collision with other inner class name */
                static final class C0062a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ int f2966a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ List<String> f2967b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ String f2968c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ String f2969d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f2970e;

                    C0062a(int i10, List<String> list, String str, String str2, LocalThemeScope localThemeScope) {
                        this.f2966a = i10;
                        this.f2967b = list;
                        this.f2968c = str;
                        this.f2969d = str2;
                        this.f2970e = localThemeScope;
                    }

                    public final void a(InterfaceC14888I DropdownMenuItem, Composer composer, int i10) {
                        Intrinsics.j(DropdownMenuItem, "$this$DropdownMenuItem");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(903826489, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.AdsDropdownMenuBox.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:412)");
                        }
                        l0.b(this.f2970e, this.f2966a, this.f2968c, androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f2966a == CollectionsKt.o(this.f2967b), Intrinsics.e(this.f2968c, this.f2969d), composer, 3072, 0);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                        a(interfaceC14888I, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C0061a(List<String> list, boolean z10, String str, d0.V v10, Function1<? super Boolean, Unit> function1, Function2<? super String, ? super Integer, Unit> function2, LocalThemeScope localThemeScope) {
                    this.f2959a = list;
                    this.f2960b = z10;
                    this.f2961c = str;
                    this.f2962d = v10;
                    this.f2963e = function1;
                    this.f2964f = function2;
                    this.f2965g = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(Function1 function1, Function2 function2, String str, int i10) {
                    function1.invoke(Boolean.FALSE);
                    function2.invoke(str, Integer.valueOf(i10));
                    return Unit.f143329a;
                }

                public final void b(InterfaceC14902f DropdownMenu, Composer composer, int i10) {
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
                    List<String> list = this.f2959a;
                    final Function1<Boolean, Unit> function1 = this.f2963e;
                    final Function2<String, Integer, Unit> function2 = this.f2964f;
                    String str = this.f2961c;
                    LocalThemeScope localThemeScope = this.f2965g;
                    final int i11 = 0;
                    for (Object obj : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.w();
                        }
                        final String str2 = (String) obj;
                        InterfaceC14882C interfaceC14882CA = androidx.compose.foundation.layout.D.a(H1.h.p(0));
                        composer2.startReplaceGroup(-1224400529);
                        boolean zV = composer2.V(function1) | composer2.V(function2) | composer2.V(str2) | composer2.d(i11);
                        Object objB = composer2.B();
                        if (zV || objB == Composer.INSTANCE.a()) {
                            objB = new Function0() { // from class: Bi.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return C2962v.A.a.C0061a.c(function1, function2, str2, i11);
                                }
                            };
                            composer2.t(objB);
                        }
                        composer2.P();
                        C18003g.b((Function0) objB, null, false, interfaceC14882CA, null, ComposableLambdaKt.c(903826489, true, new C0062a(i11, list, str2, str, localThemeScope), composer2, 54), composer, 199680, 22);
                        composer2 = composer;
                        list = list;
                        str = str;
                        i11 = i12;
                        localThemeScope = localThemeScope;
                    }
                    composer.P();
                    C2962v.K(this.f2960b, this.f2959a, this.f2961c, this.f2962d, composer, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                    b(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(q1.f fVar, boolean z10, List<String> list, String str, Function1<? super String, Unit> function1, h0.l lVar, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, LocalThemeScope localThemeScope, boolean z11, Function1<? super Boolean, Unit> function12, d0.V v10, Function2<? super String, ? super Integer, Unit> function2) {
                this.f2947a = fVar;
                this.f2948b = z10;
                this.f2949c = list;
                this.f2950d = str;
                this.f2951e = function1;
                this.f2952f = lVar;
                this.f2953g = function3;
                this.f2954h = localThemeScope;
                this.f2955i = z11;
                this.f2956j = function12;
                this.f2957k = v10;
                this.f2958l = function2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1) {
                function1.invoke(Boolean.FALSE);
                return Unit.f143329a;
            }

            public final void b(AbstractC18019l0 ExposedDropdownMenuBox, Composer composer, int i10) {
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
                boolean readOnly = this.f2947a.getReadOnly();
                boolean z10 = this.f2948b && !this.f2949c.isEmpty();
                Ki.I textStyle = this.f2947a.getTextStyle();
                q1.f fVar = this.f2947a;
                LocalThemeScope localThemeScope = this.f2954h;
                if (Intrinsics.e(fVar.getState(), q1.f.a.C2254a.f142244a)) {
                    textStyle = fVar.getTextStyle().d(localThemeScope.getAdsColors().getAdsColorsDisabled());
                }
                C5815e.a(this.f2950d, this.f2951e, modifierH, z10, readOnly, textStyle.getStyle(), this.f2947a.getKeyboardOptions(), this.f2947a.getKeyboardActions(), this.f2947a.getSingleLine(), this.f2947a.getMaxLines(), 0, this.f2947a.getVisualTransformation(), null, this.f2952f, new SolidColor(this.f2947a.getColors().c(Intrinsics.e(this.f2947a.getState(), q1.f.a.c.f142246a), composer, 0).getValue().getValue(), null), this.f2953g, composer, 384, 0, 5120);
                Modifier modifierA = ExposedDropdownMenuBox.a(androidx.compose.foundation.b.d(C13572f.g(companion, H1.h.p(1), this.f2954h.getAdsColors().getAdsColorUIBorder02().getColor(), C16806i.c(this.f2954h.getAdsCornerRadii().getRadius04().getDp())), this.f2954h.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), true);
                androidx.compose.ui.window.q qVar = new androidx.compose.ui.window.q(true, false, false, false, 14, (DefaultConstructorMarker) null);
                long jB = H1.j.b((Float.floatToRawIntBits(H1.h.p(0)) << 32) | (Float.floatToRawIntBits(this.f2954h.getAdsSpacing().getThree().getDp()) & 4294967295L));
                boolean z11 = this.f2955i;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f2956j);
                final Function1<Boolean, Unit> function1 = this.f2956j;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Bi.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C2962v.A.a.c(function1);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                d0.V v10 = this.f2957k;
                C18003g.a(z11, (Function0) objB, modifierA, jB, v10, qVar, ComposableLambdaKt.c(1183741782, true, new C0061a(this.f2949c, this.f2955i, this.f2950d, v10, this.f2956j, this.f2958l, this.f2954h), composer, 54), composer, 1769472, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC18019l0 abstractC18019l0, Composer composer, Integer num) {
                b(abstractC18019l0, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        A(Modifier modifier, boolean z10, Function1<? super Boolean, Unit> function1, q1.f fVar, boolean z11, List<String> list, String str, Function1<? super String, Unit> function12, h0.l lVar, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, LocalThemeScope localThemeScope, d0.V v10, Function2<? super String, ? super Integer, Unit> function2) {
            this.f2934a = modifier;
            this.f2935b = z10;
            this.f2936c = function1;
            this.f2937d = fVar;
            this.f2938e = z11;
            this.f2939f = list;
            this.f2940g = str;
            this.f2941h = function12;
            this.f2942i = lVar;
            this.f2943j = function3;
            this.f2944k = localThemeScope;
            this.f2945l = v10;
            this.f2946m = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1390078899, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.AdsDropdownMenuBox.<anonymous> (AdsDropdown.kt:364)");
            }
            Modifier modifier = this.f2934a;
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Bi.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2962v.A.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierC = C16819m.c(modifier, true, (Function1) objB);
            boolean z10 = this.f2935b;
            Function1<Boolean, Unit> function1 = this.f2936c;
            C18025n0.a(z10, function1, modifierC, ComposableLambdaKt.c(1211955811, true, new a(this.f2937d, this.f2938e, this.f2939f, this.f2940g, this.f2941h, this.f2942i, this.f2943j, this.f2944k, z10, function1, this.f2945l, this.f2946m), composer, 54), composer, 3072, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.AdsDropdownKt$AutoscrollToSelectedEffect$1$1", f = "AdsDropdown.kt", l = {475}, m = "invokeSuspend")
    /* renamed from: Bi.v$B */
    static final class B extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f2971a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f2972b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f2973c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f2974d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d0.V f2975e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(boolean z10, List<String> list, String str, d0.V v10, Continuation<? super B> continuation) {
            super(2, continuation);
            this.f2972b = z10;
            this.f2973c = list;
            this.f2974d = str;
            this.f2975e = v10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new B(this.f2972b, this.f2973c, this.f2974d, this.f2975e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i10;
            int iN;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f2971a;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (this.f2972b && !this.f2973c.isEmpty()) {
                    int iIndexOf = this.f2973c.indexOf(this.f2974d);
                    if (iIndexOf == CollectionsKt.o(this.f2973c)) {
                        iN = this.f2975e.n();
                    } else {
                        int iN2 = (this.f2975e.n() + 16) / this.f2973c.size();
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
                    d0.V v10 = this.f2975e;
                    int iO = RangesKt.o(iN, 0, v10.n());
                    this.f2971a = 1;
                    if (d0.V.l(v10, iO, null, this, 2, null) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bi.v$C */
    public /* synthetic */ class C {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries<Month> f2976a = EnumEntriesKt.a(Month.values());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$D */
    static final class D implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f2977a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f2978b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f2979c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bi.v$D$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f2980a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15149S f2981b;

            a(LocalThemeScope localThemeScope, InterfaceC15149S interfaceC15149S) {
                this.f2980a = localThemeScope;
                this.f2981b = interfaceC15149S;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-688139038, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownAffirmativeState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:856)");
                }
                si.j.h(this.f2980a, this.f2981b.getLabels().getInfoBlockMessage(), "Success dropdown has a green highlight and info block.", null, composer, 384, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        D(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f2977a = localThemeScope;
            this.f2978b = modifier;
            this.f2979c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5872l0 interfaceC5872l0, String item, int i10) {
            Intrinsics.j(item, "item");
            f(interfaceC5872l0, item);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC15149S interfaceC15149S, final Context context, LocalThemeScope localThemeScope, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC15149S.getLabels().getPlaceholder(), "Choose something happy");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), "Good Thing");
            AdsDropdown.g(interfaceC15149S.getIcons().getLabelIcon(), C.i.h.f17101d, "More info", new Function0() { // from class: Bi.B
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2962v.D.l(context);
                }
            });
            AdsDropdown.e(interfaceC15149S.getInfoBlocks().getSuccessBlock(), ComposableLambdaKt.composableLambdaInstance(-688139038, true, new a(localThemeScope, interfaceC15149S)));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Context context) {
            Toast.makeText(context, "Dropdown field with success state", 0).show();
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15149S Assemble, Composer composer, int i10) {
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
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            String strE = e(interfaceC5872l0);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, true, false, false, null, 59, null);
            LocalThemeScope localThemeScope = this.f2977a;
            int i12 = i11;
            Modifier modifier = this.f2978b;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Bi.z
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2962v.D.g(interfaceC5872l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f2979c) | composer.D(this.f2977a);
            final Context context = this.f2979c;
            final LocalThemeScope localThemeScope2 = this.f2977a;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Bi.A
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2962v.D.k(Assemble, context, localThemeScope2, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2962v.v(localThemeScope, modifier, strE, dropdownB, listP, function2, (Function1) objB3, composer, 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            d(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }

        private static final String e(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final void f(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$E */
    static final class E implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f2982a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f2983b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f2984c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Bi.v$E$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f2985a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15149S f2986b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<Ki.V> f2987c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<String> f2988d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f2989e;

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, InterfaceC15149S interfaceC15149S, List<? extends Ki.V> list, List<String> list2, InterfaceC5872l0<String> interfaceC5872l0) {
                this.f2985a = localThemeScope;
                this.f2986b = interfaceC15149S;
                this.f2987c = list;
                this.f2988d = list2;
                this.f2989e = interfaceC5872l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2131269996, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownComplexModifier.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:936)");
                }
                LocalThemeScope localThemeScope = this.f2985a;
                q1.Label infoBlockMessage = this.f2986b.getLabels().getInfoBlockMessage();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Using Padding ");
                List<Ki.V> list = this.f2987c;
                int iIndexOf = this.f2988d.indexOf(E.f(this.f2989e));
                sb2.append((iIndexOf < 0 || iIndexOf >= list.size()) ? "zero" : list.get(iIndexOf));
                si.j.h(localThemeScope, infoBlockMessage, sb2.toString(), null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        E(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f2982a = localThemeScope;
            this.f2983b = modifier;
            this.f2984c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5872l0 interfaceC5872l0, String item, int i10) {
            Intrinsics.j(item, "item");
            g(interfaceC5872l0, item);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC15149S interfaceC15149S, final Context context, LocalThemeScope localThemeScope, List list, List list2, InterfaceC5872l0 interfaceC5872l0, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC15149S.getLabels().getPlaceholder(), "Select a padding size");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), "Padding Size");
            AdsDropdown.g(interfaceC15149S.getIcons().getLabelIcon(), C.i.h.f17101d, "More info", new Function0() { // from class: Bi.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2962v.E.o(context);
                }
            });
            AdsDropdown.e(interfaceC15149S.getInfoBlocks().getSuccessBlock(), ComposableLambdaKt.composableLambdaInstance(2131269996, true, new a(localThemeScope, interfaceC15149S, list, list2, interfaceC5872l0)));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(Context context) {
            Toast.makeText(context, "Dropdown field with padding added to the modifier", 0).show();
            return Unit.f143329a;
        }

        public final void e(final InterfaceC15149S Assemble, Composer composer, int i10) {
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
            final List listP = CollectionsKt.p(this.f2982a.getAdsSpacing().getFour(), this.f2982a.getAdsSpacing().getFive(), this.f2982a.getAdsSpacing().getSix());
            final List listP2 = CollectionsKt.p("Four", "Five", "Six", "None");
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(CollectionsKt.s0(listP2), null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            String strF = f(interfaceC5872l0);
            boolean z10 = true;
            Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.h(this.f2983b, 0.0f, 1, null), this.f2982a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
            Ki.V v10 = (Ki.V) CollectionsKt.v0(listP, listP2.indexOf(f(interfaceC5872l0)));
            Modifier modifierI = androidx.compose.foundation.layout.D.i(modifierD, v10 != null ? v10.getDp() : H1.h.p(0));
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, true, false, false, null, 59, null);
            LocalThemeScope localThemeScope = this.f2982a;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Bi.C
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2962v.E.k(interfaceC5872l0, (String) obj, ((Integer) obj2).intValue());
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
            boolean zD = composer.D(this.f2984c) | z10 | composer.D(this.f2982a) | composer.V(listP);
            final Context context = this.f2984c;
            final LocalThemeScope localThemeScope2 = this.f2982a;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                Object obj = new Function1() { // from class: Bi.D
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C2962v.E.l(Assemble, context, localThemeScope2, listP, listP2, interfaceC5872l0, (n0) obj2);
                    }
                };
                list = listP2;
                composer.t(obj);
                objB3 = obj;
            } else {
                list = listP2;
            }
            composer.P();
            C2962v.v(localThemeScope, modifierI, strF, dropdownB, list, function2, (Function1) objB3, composer, 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            e(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String f(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final void g(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$F */
    static final class F implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14888I f2990a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f2991b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f2992c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Month> f2993d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<List<Month>> f2994e;

        F(InterfaceC14888I interfaceC14888I, LocalThemeScope localThemeScope, Context context, InterfaceC5872l0<Month> interfaceC5872l0, InterfaceC5872l0<List<Month>> interfaceC5872l02) {
            this.f2990a = interfaceC14888I;
            this.f2991b = localThemeScope;
            this.f2992c = context;
            this.f2993d = interfaceC5872l0;
            this.f2994e = interfaceC5872l02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, String str, int i10) {
            Intrinsics.j(str, "<unused var>");
            C2962v.T(interfaceC5872l02, (Month) C2962v.R(interfaceC5872l0).get(i10));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC15149S interfaceC15149S, final Context context, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC15149S.getLabels().getPlaceholder(), "Month");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), "Month");
            AdsDropdown.g(interfaceC15149S.getIcons().getLabelIcon(), C.i.h.f17101d, "More Info", new Function0() { // from class: Bi.H
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2962v.F.g(context);
                }
            });
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Context context) {
            Toast.makeText(context, "Select a month", 0).show();
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15149S Assemble, Composer composer, int i10) {
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
            Month monthS = C2962v.S(this.f2993d);
            String displayName = monthS != null ? monthS.getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()) : null;
            if (displayName == null) {
                displayName = "";
            }
            Modifier modifierM = androidx.compose.foundation.layout.D.m(InterfaceC14888I.b(this.f2990a, Modifier.INSTANCE, 5.0f, false, 2, null), 0.0f, 0.0f, this.f2991b.getAdsSpacing().getThree().getDp(), 0.0f, 11, null);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            List listR = C2962v.R(this.f2994e);
            int i12 = i11;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listR, 10));
            Iterator it = listR.iterator();
            while (it.hasNext()) {
                arrayList.add(((Month) it.next()).getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()));
            }
            LocalThemeScope localThemeScope = this.f2991b;
            composer.startReplaceGroup(-1633490746);
            final InterfaceC5872l0<List<Month>> interfaceC5872l0 = this.f2994e;
            final InterfaceC5872l0<Month> interfaceC5872l02 = this.f2993d;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function2() { // from class: Bi.F
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2962v.F.e(interfaceC5872l0, interfaceC5872l02, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB);
            }
            Function2 function2 = (Function2) objB;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f2992c);
            final Context context = this.f2992c;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Bi.G
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2962v.F.f(Assemble, context, (n0) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C2962v.v(localThemeScope, modifierM, displayName, dropdownB, arrayList, function2, (Function1) objB2, composer, 196608, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            d(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$G */
    static final class G implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14888I f2995a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f2996b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f2997c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f2998d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ z1<List<Integer>> f2999e;

        /* JADX WARN: Multi-variable type inference failed */
        G(InterfaceC14888I interfaceC14888I, LocalThemeScope localThemeScope, Context context, InterfaceC5868j0 interfaceC5868j0, z1<? extends List<Integer>> z1Var) {
            this.f2995a = interfaceC14888I;
            this.f2996b = localThemeScope;
            this.f2997c = context;
            this.f2998d = interfaceC5868j0;
            this.f2999e = z1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(z1 z1Var, InterfaceC5868j0 interfaceC5868j0, String str, int i10) {
            Intrinsics.j(str, "<unused var>");
            C2962v.X(interfaceC5868j0, ((Number) C2962v.V(z1Var).get(i10)).intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC15149S interfaceC15149S, final Context context, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC15149S.getLabels().getPlaceholder(), "Day");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), "Day");
            AdsDropdown.g(interfaceC15149S.getIcons().getLabelIcon(), C.i.h.f17101d, "More Info", new Function0() { // from class: Bi.K
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2962v.G.g(context);
                }
            });
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Context context) {
            Toast.makeText(context, "Select a day", 0).show();
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15149S Assemble, Composer composer, int i10) {
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
            Integer numValueOf = Integer.valueOf(C2962v.W(this.f2998d));
            if (numValueOf.intValue() == -1) {
                numValueOf = null;
            }
            String string = numValueOf != null ? numValueOf.toString() : null;
            if (string == null) {
                string = "";
            }
            Modifier modifierM = androidx.compose.foundation.layout.D.m(InterfaceC14888I.b(this.f2995a, Modifier.INSTANCE, 3.0f, false, 2, null), 0.0f, 0.0f, this.f2996b.getAdsSpacing().getThree().getDp(), 0.0f, 11, null);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            List listV = C2962v.V(this.f2999e);
            int i12 = i11;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listV, 10));
            Iterator it = listV.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            LocalThemeScope localThemeScope = this.f2996b;
            composer.startReplaceGroup(-1633490746);
            final z1<List<Integer>> z1Var = this.f2999e;
            final InterfaceC5868j0 interfaceC5868j0 = this.f2998d;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function2() { // from class: Bi.I
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2962v.G.e(z1Var, interfaceC5868j0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB);
            }
            Function2 function2 = (Function2) objB;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f2997c) | ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble)));
            final Context context = this.f2997c;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Bi.J
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2962v.G.f(Assemble, context, (n0) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C2962v.v(localThemeScope, modifierM, string, dropdownB, arrayList, function2, (Function1) objB2, composer, 196608, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            d(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$H */
    static final class H implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14888I f3000a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3001b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f3002c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Year> f3003d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<List<Year>> f3004e;

        H(InterfaceC14888I interfaceC14888I, LocalThemeScope localThemeScope, Context context, InterfaceC5872l0<Year> interfaceC5872l0, InterfaceC5872l0<List<Year>> interfaceC5872l02) {
            this.f3000a = interfaceC14888I;
            this.f3001b = localThemeScope;
            this.f3002c = context;
            this.f3003d = interfaceC5872l0;
            this.f3004e = interfaceC5872l02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, String str, int i10) {
            Intrinsics.j(str, "<unused var>");
            C2962v.a0(interfaceC5872l02, (Year) C2962v.Y(interfaceC5872l0).get(i10));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC15149S interfaceC15149S, final Context context, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC15149S.getLabels().getPlaceholder(), "Year");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), "Year");
            AdsDropdown.g(interfaceC15149S.getIcons().getLabelIcon(), C.i.h.f17101d, "More Info", new Function0() { // from class: Bi.N
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2962v.H.g(context);
                }
            });
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Context context) {
            Toast.makeText(context, "Select a year", 0).show();
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15149S Assemble, Composer composer, int i10) {
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
            String string = C2962v.Z(this.f3003d).toString();
            Intrinsics.i(string, "toString(...)");
            Modifier modifierB = InterfaceC14888I.b(this.f3000a, Modifier.INSTANCE, 4.0f, false, 2, null);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            List listY = C2962v.Y(this.f3004e);
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listY, 10));
            Iterator it = listY.iterator();
            while (it.hasNext()) {
                String string2 = ((Year) it.next()).toString();
                Intrinsics.i(string2, "toString(...)");
                arrayList.add(string2);
            }
            LocalThemeScope localThemeScope = this.f3001b;
            composer.startReplaceGroup(-1633490746);
            final InterfaceC5872l0<List<Year>> interfaceC5872l0 = this.f3004e;
            final InterfaceC5872l0<Year> interfaceC5872l02 = this.f3003d;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function2() { // from class: Bi.L
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2962v.H.e(interfaceC5872l0, interfaceC5872l02, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB);
            }
            Function2 function2 = (Function2) objB;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f3002c);
            final Context context = this.f3002c;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Bi.M
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2962v.H.f(Assemble, context, (n0) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C2962v.v(localThemeScope, modifierB, string, dropdownB, arrayList, function2, (Function1) objB2, composer, 196608, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            d(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$I */
    static final class I implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3005a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f3006b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f3007c;

        I(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f3005a = localThemeScope;
            this.f3006b = modifier;
            this.f3007c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5872l0 interfaceC5872l0, String item, int i10) {
            Intrinsics.j(item, "item");
            f(interfaceC5872l0, item);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC15149S interfaceC15149S, final Context context, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC15149S.getLabels().getPlaceholder(), "Placeholder");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), "Choose Nothing (disabled)");
            AdsDropdown.g(interfaceC15149S.getIcons().getLabelIcon(), C.i.h.f17101d, "More Info", new Function0() { // from class: Bi.Q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2962v.I.l(context);
                }
            });
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Context context) {
            Toast.makeText(context, "Dropdown example disabled", 0).show();
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15149S Assemble, Composer composer, int i10) {
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
                objB = t1.e(CollectionsKt.s0(C2962v.f2933a), null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            String strE = e(interfaceC5872l0);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, true, false, null, 55, null);
            List list = C2962v.f2933a;
            LocalThemeScope localThemeScope = this.f3005a;
            int i12 = i11;
            Modifier modifier = this.f3006b;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Bi.O
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2962v.I.g(interfaceC5872l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f3007c);
            final Context context = this.f3007c;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Bi.P
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2962v.I.k(Assemble, context, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2962v.v(localThemeScope, modifier, strE, dropdownB, list, function2, (Function1) objB3, composer, 196608, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            d(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }

        private static final String e(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final void f(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$J */
    static final class J implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3008a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f3009b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f3010c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bi.v$J$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f3011a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15149S f3012b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<L5> f3013c;

            a(LocalThemeScope localThemeScope, InterfaceC15149S interfaceC15149S, InterfaceC5872l0<L5> interfaceC5872l0) {
                this.f3011a = localThemeScope;
                this.f3012b = interfaceC15149S;
                this.f3013c = interfaceC5872l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1981259530, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownEnabledDefaultOption.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:630)");
                }
                si.j.h(this.f3011a, this.f3012b.getLabels().getInfoBlockMessage(), J.o(this.f3013c).getMessage(), null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        J(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f3008a = localThemeScope;
            this.f3009b = modifier;
            this.f3010c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC15149S interfaceC15149S, final Context context, InterfaceC5872l0 interfaceC5872l0, LocalThemeScope localThemeScope, n0 AdsDropdown) {
            q1.InfoBlock errorBlock;
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC15149S.getLabels().getPlaceholder(), "Placeholder");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), "Favorite Food");
            AdsDropdown.g(interfaceC15149S.getIcons().getLabelIcon(), C.i.h.f17101d, "More Info", new Function0() { // from class: Bi.U
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2962v.J.k(context);
                }
            });
            L5 l5O = o(interfaceC5872l0);
            if (Intrinsics.e(l5O, L5.a.f29079b) || Intrinsics.e(l5O, L5.b.f29080b)) {
                errorBlock = interfaceC15149S.getInfoBlocks().getErrorBlock();
            } else if (Intrinsics.e(l5O, L5.c.f29081b)) {
                errorBlock = interfaceC15149S.getInfoBlocks().getInformationBlock();
            } else if (Intrinsics.e(l5O, L5.e.f29083b)) {
                errorBlock = interfaceC15149S.getInfoBlocks().getSuccessBlock();
            } else if (Intrinsics.e(l5O, L5.f.f29084b)) {
                errorBlock = interfaceC15149S.getInfoBlocks().getWarningBlock();
            } else {
                if (!Intrinsics.e(l5O, L5.d.f29082b)) {
                    throw new NoWhenBranchMatchedException();
                }
                errorBlock = null;
            }
            if (errorBlock != null) {
                AdsDropdown.e(errorBlock, ComposableLambdaKt.composableLambdaInstance(-1981259530, true, new a(localThemeScope, interfaceC15149S, interfaceC5872l0)));
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(Context context) {
            Toast.makeText(context, "Select a year", 0).show();
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, String item, int i10) {
            Intrinsics.j(item, "item");
            l(interfaceC5872l0, item);
            p(interfaceC5872l02, i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? L5.d.f29082b : L5.f.f29084b : L5.e.f29083b : L5.c.f29081b : L5.a.f29079b);
            return Unit.f143329a;
        }

        public final void e(final InterfaceC15149S Assemble, Composer composer, int i10) {
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
                objB = t1.e(CollectionsKt.s0(C2962v.f2933a), null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(L5.d.f29082b, null, 2, null);
                composer.t(objB2);
            }
            final InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB2;
            composer.P();
            String strF = f(interfaceC5872l0);
            boolean z10 = false;
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), CollectionsKt.p(L5.a.f29079b, L5.b.f29080b).contains(o(interfaceC5872l02)), Intrinsics.e(o(interfaceC5872l02), L5.f.f29084b), Intrinsics.e(o(interfaceC5872l02), L5.e.f29083b), false, false, null, 56, null);
            List list = C2962v.f2933a;
            LocalThemeScope localThemeScope = this.f3008a;
            int i12 = i11;
            Modifier modifier = this.f3009b;
            composer.startReplaceGroup(-1633490746);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = new Function2() { // from class: Bi.S
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2962v.J.q(interfaceC5872l0, interfaceC5872l02, (String) obj, ((Integer) obj2).intValue());
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
            boolean zD = z10 | composer.D(this.f3010c) | composer.D(this.f3008a);
            final Context context = this.f3010c;
            final LocalThemeScope localThemeScope2 = this.f3008a;
            Object objB4 = composer.B();
            if (zD || objB4 == companion.a()) {
                objB4 = new Function1() { // from class: Bi.T
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2962v.J.g(Assemble, context, interfaceC5872l02, localThemeScope2, (n0) obj);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C2962v.v(localThemeScope, modifier, strF, dropdownB, list, function2, (Function1) objB4, composer, 196608, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            e(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }

        private static final String f(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final void l(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final L5 o(InterfaceC5872l0<L5> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final void p(InterfaceC5872l0<L5> interfaceC5872l0, L5 l52) {
            interfaceC5872l0.setValue(l52);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$K */
    static final class K implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3014a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f3015b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f3016c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Bi.v$K$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f3017a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15149S f3018b;

            a(LocalThemeScope localThemeScope, InterfaceC15149S interfaceC15149S) {
                this.f3017a = localThemeScope;
                this.f3018b = interfaceC15149S;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(828585320, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownErrorState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:765)");
                }
                LocalThemeScope localThemeScope = this.f3017a;
                InterfaceC15149S interfaceC15149S = this.f3018b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                C16671b.b(localThemeScope, interfaceC15149S.getIcons().getInfoBlockIcon(), C.i.e.f17096d, "Validation Error", composer, 3456, 0);
                si.j.h(localThemeScope, interfaceC15149S.getLabels().getInfoBlockMessage(), "Error dropdown uses red border with a red info block.", null, composer, 384, 4);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        K(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f3014a = localThemeScope;
            this.f3015b = modifier;
            this.f3016c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5872l0 interfaceC5872l0, String item, int i10) {
            Intrinsics.j(item, "item");
            f(interfaceC5872l0, item);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC15149S interfaceC15149S, final Context context, LocalThemeScope localThemeScope, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC15149S.getLabels().getPlaceholder(), "Choose a problem");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), "Problem Message");
            AdsDropdown.g(interfaceC15149S.getIcons().getLabelIcon(), C.i.h.f17101d, "More info", new Function0() { // from class: Bi.X
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2962v.K.l(context);
                }
            });
            AdsDropdown.f(interfaceC15149S.getLabels().getDescription(), "This is a description and describes more context around what this dropdown is used for.");
            AdsDropdown.e(interfaceC15149S.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(828585320, true, new a(localThemeScope, interfaceC15149S)));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Context context) {
            Toast.makeText(context, "Dropdown field with error state", 0).show();
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15149S Assemble, Composer composer, int i10) {
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
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            String strE = e(interfaceC5872l0);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), true, false, false, false, false, null, 62, null);
            LocalThemeScope localThemeScope = this.f3014a;
            int i12 = i11;
            Modifier modifier = this.f3015b;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Bi.V
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2962v.K.g(interfaceC5872l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f3016c) | composer.D(this.f3014a);
            final Context context = this.f3016c;
            final LocalThemeScope localThemeScope2 = this.f3014a;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Bi.W
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2962v.K.k(Assemble, context, localThemeScope2, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2962v.v(localThemeScope, modifier, strE, dropdownB, listP, function2, (Function1) objB3, composer, 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            d(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }

        private static final String e(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final void f(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$L */
    static final class L implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3019a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f3020b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f3021c;

        L(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f3019a = localThemeScope;
            this.f3020b = modifier;
            this.f3021c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5872l0 interfaceC5872l0, String item, int i10) {
            Intrinsics.j(item, "item");
            f(interfaceC5872l0, item);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC15149S interfaceC15149S, final Context context, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), "Favorite Food (no placeholder)");
            AdsDropdown.g(interfaceC15149S.getIcons().getLabelIcon(), C.i.h.f17101d, "More Info", new Function0() { // from class: Bi.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2962v.L.l(context);
                }
            });
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Context context) {
            Toast.makeText(context, "Dropdown example with no placeholder", 0).show();
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15149S Assemble, Composer composer, int i10) {
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
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            String strE = e(interfaceC5872l0);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            LocalThemeScope localThemeScope = this.f3019a;
            int i12 = i11;
            Modifier modifier = this.f3020b;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Bi.Y
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2962v.L.g(interfaceC5872l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f3021c);
            final Context context = this.f3021c;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Bi.Z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2962v.L.k(Assemble, context, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2962v.v(localThemeScope, modifier, strE, dropdownB, listP, function2, (Function1) objB3, composer, 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            d(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }

        private static final String e(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final void f(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$M */
    static final class M implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3022a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f3023b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f3024c;

        M(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f3022a = localThemeScope;
            this.f3023b = modifier;
            this.f3024c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5872l0 interfaceC5872l0, String item, int i10) {
            Intrinsics.j(item, "item");
            f(interfaceC5872l0, item);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC15149S interfaceC15149S, final Context context, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC15149S.getLabels().getPlaceholder(), "Placeholder");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), "Choose a placeholder");
            AdsDropdown.g(interfaceC15149S.getIcons().getLabelIcon(), C.i.h.f17101d, "More Info", new Function0() { // from class: Bi.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2962v.M.l(context);
                }
            });
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Context context) {
            Toast.makeText(context, "Dropdown example with placeholder", 0).show();
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15149S Assemble, Composer composer, int i10) {
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
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            String strE = e(interfaceC5872l0);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            LocalThemeScope localThemeScope = this.f3022a;
            int i12 = i11;
            Modifier modifier = this.f3023b;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Bi.b0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2962v.M.g(interfaceC5872l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f3024c);
            final Context context = this.f3024c;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Bi.c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2962v.M.k(Assemble, context, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2962v.v(localThemeScope, modifier, strE, dropdownB, listP, function2, (Function1) objB3, composer, 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            d(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }

        private static final String e(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final void f(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$N */
    static final class N implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3025a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f3026b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f3027c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bi.v$N$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f3028a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15149S f3029b;

            a(LocalThemeScope localThemeScope, InterfaceC15149S interfaceC15149S) {
                this.f3028a = localThemeScope;
                this.f3029b = interfaceC15149S;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1339715760, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownStaticState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:896)");
                }
                si.j.h(this.f3028a, this.f3029b.getLabels().getInfoBlockMessage(), "Static dropdown is static.", null, composer, 384, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        N(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f3025a = localThemeScope;
            this.f3026b = modifier;
            this.f3027c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5872l0 interfaceC5872l0, String item, int i10) {
            Intrinsics.j(item, "item");
            f(interfaceC5872l0, item);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC15149S interfaceC15149S, final Context context, LocalThemeScope localThemeScope, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC15149S.getLabels().getPlaceholder(), "Choose something static");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), "Static Dropdown");
            AdsDropdown.g(interfaceC15149S.getIcons().getLabelIcon(), C.i.h.f17101d, "More info", new Function0() { // from class: Bi.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2962v.N.l(context);
                }
            });
            AdsDropdown.e(interfaceC15149S.getInfoBlocks().getSuccessBlock(), ComposableLambdaKt.composableLambdaInstance(-1339715760, true, new a(localThemeScope, interfaceC15149S)));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Context context) {
            Toast.makeText(context, "Dropdown field with static state", 0).show();
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15149S Assemble, Composer composer, int i10) {
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
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            String strE = e(interfaceC5872l0);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, true, null, 47, null);
            LocalThemeScope localThemeScope = this.f3025a;
            int i12 = i11;
            Modifier modifier = this.f3026b;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Bi.e0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2962v.N.g(interfaceC5872l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f3027c) | composer.D(this.f3025a);
            final Context context = this.f3027c;
            final LocalThemeScope localThemeScope2 = this.f3025a;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Bi.f0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2962v.N.k(Assemble, context, localThemeScope2, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2962v.v(localThemeScope, modifier, strE, dropdownB, listP, function2, (Function1) objB3, composer, 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            d(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }

        private static final String e(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final void f(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$O */
    static final class O implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3030a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f3031b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f3032c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bi.v$O$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f3033a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15149S f3034b;

            a(LocalThemeScope localThemeScope, InterfaceC15149S interfaceC15149S) {
                this.f3033a = localThemeScope;
                this.f3034b = interfaceC15149S;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-327016132, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.dropdown.ExampleDropdownWarningState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsDropdown.kt:813)");
                }
                si.j.h(this.f3033a, this.f3034b.getLabels().getInfoBlockMessage(), "Warning uses standard input border with a yellow info block.", null, composer, 384, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        O(LocalThemeScope localThemeScope, Modifier modifier, Context context) {
            this.f3030a = localThemeScope;
            this.f3031b = modifier;
            this.f3032c = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5872l0 interfaceC5872l0, String item, int i10) {
            Intrinsics.j(item, "item");
            f(interfaceC5872l0, item);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC15149S interfaceC15149S, final Context context, LocalThemeScope localThemeScope, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.i(interfaceC15149S.getLabels().getPlaceholder(), "Choose a warning");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), "Warning Message");
            AdsDropdown.g(interfaceC15149S.getIcons().getLabelIcon(), C.i.h.f17101d, "More info", new Function0() { // from class: Bi.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2962v.O.l(context);
                }
            });
            AdsDropdown.e(interfaceC15149S.getInfoBlocks().getWarningBlock(), ComposableLambdaKt.composableLambdaInstance(-327016132, true, new a(localThemeScope, interfaceC15149S)));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Context context) {
            Toast.makeText(context, "Dropdown field with warning", 0).show();
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15149S Assemble, Composer composer, int i10) {
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
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            String strE = e(interfaceC5872l0);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            LocalThemeScope localThemeScope = this.f3030a;
            int i12 = i11;
            Modifier modifier = this.f3031b;
            composer.startReplaceGroup(5004770);
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Bi.h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C2962v.O.g(interfaceC5872l0, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD = ((i12 & 14) == 4 || ((i12 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f3032c) | composer.D(this.f3030a);
            final Context context = this.f3032c;
            final LocalThemeScope localThemeScope2 = this.f3030a;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Bi.i0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2962v.O.k(Assemble, context, localThemeScope2, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2962v.v(localThemeScope, modifier, strE, dropdownB, listP, function2, (Function1) objB3, composer, 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            d(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }

        private static final String e(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final void f(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$a, reason: case insensitive filesystem */
    public static final class C2963a extends Ji.c<Integer, p0, p0> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<p0, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<p0> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final p0 initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bi.v$a$a, reason: collision with other inner class name */
        public static final class C0063a implements Function0<p0> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f3038a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2963a f3039b;

            public C0063a(Ji.h hVar, C2963a c2963a) {
                this.f3038a = hVar;
                this.f3039b = c2963a;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Bi.p0, Ji.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p0 invoke() {
                ?? r02 = this.f3038a;
                this.f3039b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<p0> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public p0 getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<p0, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C2963a(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new C0063a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bi.v$b, reason: case insensitive filesystem */
    public static final class C2964b extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f3040f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2964b(L1.A a10) {
            super(1);
            this.f3040f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f3040f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$c, reason: case insensitive filesystem */
    public static final class C2965c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f3041f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f3042g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f3043h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f3044i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ si.p f3045j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ q1.f f3046k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3047l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f3048m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2 f3049n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f3050o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ C16673d f3051p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ C16673d f3052q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2965c(L1.n nVar, int i10, Function0 function0, String str, si.p pVar, q1.f fVar, LocalThemeScope localThemeScope, boolean z10, Function2 function2, boolean z11, C16673d c16673d, C16673d c16673d2) {
            super(2);
            this.f3042g = nVar;
            this.f3043h = function0;
            this.f3044i = str;
            this.f3045j = pVar;
            this.f3046k = fVar;
            this.f3047l = localThemeScope;
            this.f3048m = z10;
            this.f3049n = function2;
            this.f3050o = z11;
            this.f3051p = c16673d;
            this.f3052q = c16673d2;
            this.f3041f = i10;
        }

        public final void a(Composer composer, int i10) {
            Composer composer2 = composer;
            if (((i10 & 11) ^ 2) == 0 && composer2.j()) {
                composer2.K();
                return;
            }
            int helpersHashCode = this.f3042g.getHelpersHashCode();
            this.f3042g.i();
            L1.n nVar = this.f3042g;
            composer2.startReplaceGroup(-1110319593);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            nVar.e(new L1.h[]{hVarA, hVarC}, C4009f.INSTANCE.c());
            Modifier.Companion companion = Modifier.INSTANCE;
            composer2.startReplaceGroup(1849434622);
            Object objB = composer2.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = C2966d.f3053a;
                composer2.t(objB);
            }
            composer2.P();
            Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion3.o(), false);
            int iA = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierK);
            InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion4.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A);
            } else {
                composer2.s();
            }
            Composer composerA = D1.a(composer2);
            D1.c(composerA, measurePolicyG, companion4.e());
            D1.c(composerA, interfaceC5884sR, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C5806j c5806j = C5806j.f48836a;
            if (this.f3044i.length() == 0) {
                composer2.startReplaceGroup(1706845276);
                si.p pVar = this.f3045j;
                if (pVar != null) {
                    composer2.startReplaceGroup(327606171);
                    Object[] objArr = {pVar};
                    composer2.startReplaceGroup(-2104237158);
                    composer2.startReplaceGroup(1849434622);
                    Object objB2 = composer2.B();
                    if (objB2 == companion2.a()) {
                        objB2 = C2968f.f3055a;
                        composer2.t(objB2);
                    }
                    composer2.P();
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
                    composer2.startReplaceGroup(1252494947);
                    C2969g c2969g = new C2969g((Function1) objB2, composer2, 0, objArrCopyOf, pVar);
                    composer2.P();
                    c2969g.k(0, companion).invoke(composer2, 0);
                    composer2.P();
                    composer2.P();
                    Unit unit = Unit.f143329a;
                }
                composer2.P();
            } else {
                composer2.startReplaceGroup(1163440186);
                if (this.f3046k.getReadOnly()) {
                    composer2.startReplaceGroup(1706927581);
                    LocalThemeScope localThemeScope = this.f3047l;
                    Ki.I one = localThemeScope.getAdsTypography().getBodyCompact().getOne();
                    Ki.T adsColorsDisabled = this.f3048m ? null : this.f3047l.getAdsColors().getAdsColorsDisabled();
                    si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.J.H(companion, null, false, 3, null), adsColorsDisabled, null, null, F1.t.INSTANCE.b(), false, this.f3046k.getMaxLines(), one, null, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, null), this.f3044i, null, composer, 0, 4);
                    composer2 = composer;
                    composer2.P();
                } else {
                    composer2.startReplaceGroup(1707443638);
                    this.f3049n.invoke(composer2, 0);
                    composer2.P();
                }
                composer2.P();
                Unit unit2 = Unit.f143329a;
            }
            composer2.v();
            composer2.startReplaceGroup(1849434622);
            Object objB3 = composer2.B();
            if (objB3 == companion2.a()) {
                objB3 = C2967e.f3054a;
                composer2.t(objB3);
            }
            composer2.P();
            Modifier modifierK2 = nVar.k(companion, hVarC, (Function1) objB3);
            MeasurePolicy measurePolicyG2 = C5804h.g(companion3.o(), false);
            int iA2 = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR2 = composer2.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierK2);
            Function0<InterfaceC5953g> function0A2 = companion4.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A2);
            } else {
                composer2.s();
            }
            Composer composerA2 = D1.a(composer2);
            D1.c(composerA2, measurePolicyG2, companion4.e());
            D1.c(composerA2, interfaceC5884sR2, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion4.f());
            C16673d c16673d = this.f3050o ? this.f3051p : this.f3052q;
            composer2.startReplaceGroup(-150765969);
            if (c16673d != null) {
                composer2.startReplaceGroup(327606171);
                Object[] objArr2 = {c16673d};
                composer2.startReplaceGroup(-2104237158);
                composer2.startReplaceGroup(1849434622);
                Object objB4 = composer2.B();
                if (objB4 == companion2.a()) {
                    objB4 = C2970h.f3061a;
                    composer2.t(objB4);
                }
                composer2.P();
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, 1);
                composer2.startReplaceGroup(1252494947);
                C2971i c2971i = new C2971i((Function1) objB4, composer2, 0, objArrCopyOf2, c16673d);
                composer2.P();
                c2971i.k(0, companion).invoke(composer2, 0);
                composer2.P();
                composer2.P();
                Unit unit3 = Unit.f143329a;
            }
            composer2.P();
            composer2.v();
            composer2.P();
            if (this.f3042g.getHelpersHashCode() != helpersHashCode) {
                this.f3043h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bi.v$d, reason: case insensitive filesystem */
    static final class C2966d implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2966d f3053a = new C2966d();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.l.f(L1.v.INSTANCE.a()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        C2966d() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bi.v$e, reason: case insensitive filesystem */
    static final class C2967e implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2967e f3054a = new C2967e();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.l.g(L1.v.INSTANCE.c()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        C2967e() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bi.v$f, reason: case insensitive filesystem */
    public static final class C2968f implements Function1<si.p, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2968f f3055a = new C2968f();

        public final void a(si.p pVar) {
            Intrinsics.j(pVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(si.p pVar) {
            a(pVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$g, reason: case insensitive filesystem */
    public static final class C2969g extends Ji.c<Integer, si.p, si.p> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<si.p, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<si.p> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final si.p initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bi.v$g$a */
        public static final class a implements Function0<si.p> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f3059a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2969g f3060b;

            public a(Ji.h hVar, C2969g c2969g) {
                this.f3059a = hVar;
                this.f3060b = c2969g;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, si.p] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final si.p invoke() {
                ?? r02 = this.f3059a;
                this.f3060b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<si.p> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public si.p getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<si.p, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C2969g(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
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
    /* renamed from: Bi.v$h, reason: case insensitive filesystem */
    public static final class C2970h implements Function1<C16673d, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2970h f3061a = new C2970h();

        public final void a(C16673d c16673d) {
            Intrinsics.j(c16673d, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C16673d c16673d) {
            a(c16673d);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$i, reason: case insensitive filesystem */
    public static final class C2971i extends Ji.c<Integer, C16673d, C16673d> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<C16673d, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<C16673d> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final C16673d initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bi.v$i$a */
        public static final class a implements Function0<C16673d> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f3065a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2971i f3066b;

            public a(Ji.h hVar, C2971i c2971i) {
                this.f3065a = hVar;
                this.f3066b = c2971i;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, qi.d] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C16673d invoke() {
                ?? r02 = this.f3065a;
                this.f3066b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<C16673d> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C16673d getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<C16673d, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C2971i(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
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
    /* renamed from: Bi.v$j, reason: case insensitive filesystem */
    static final class C2972j implements Function1<L1.F, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2972j f3067a = new C2972j();

        public final void a(L1.F constrain) {
            Intrinsics.j(constrain, "$this$constrain");
            x.a.a(constrain.getTop(), constrain.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrain.getBottom(), constrain.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(L1.F f10) {
            a(f10);
            return Unit.f143329a;
        }

        C2972j() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bi.v$k, reason: case insensitive filesystem */
    static final class C2973k implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2973k f3068a = new C2973k();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            C4010g.o(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        C2973k() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bi.v$l, reason: case insensitive filesystem */
    static final class C2974l implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f3069a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f3070b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3071c;

        C2974l(L1.h hVar, L1.h hVar2, LocalThemeScope localThemeScope) {
            this.f3069a = hVar;
            this.f3070b = hVar2;
            this.f3071c = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            C4010g.o(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, null);
            C4010g.n(constrainAs, this.f3069a.getBottom(), this.f3070b.getTop(), this.f3071c.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 0.0f, 0.0f, BinsView.TOTE_HEIGHT_DP, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bi.v$m, reason: case insensitive filesystem */
    static final class C2975m implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2975m f3072a = new C2975m();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            C4010g.o(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        C2975m() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bi.v$n, reason: case insensitive filesystem */
    static final class C2976n implements Function1<Boolean, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f3073a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f3074b;

        C2976n(boolean z10, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f3073a = z10;
            this.f3074b = interfaceC5872l0;
        }

        public final void a(boolean z10) {
            if (this.f3073a) {
                return;
            }
            C2962v.C(this.f3074b, z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bi.v$o, reason: case insensitive filesystem */
    static final class C2977o implements Function1<String, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2977o f3075a = new C2977o();

        public final void a(String it) {
            Intrinsics.j(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            a(str);
            return Unit.f143329a;
        }

        C2977o() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bi.v$p */
    static final class p implements Function2<String, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2817g1<String, Integer> f3076a;

        p(InterfaceC2817g1<String, Integer> interfaceC2817g1) {
            this.f3076a = interfaceC2817g1;
        }

        public final void a(String value, int i10) {
            Intrinsics.j(value, "value");
            this.f3076a.C().invoke(value, Integer.valueOf(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
            a(str, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$q */
    static final class q implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3077a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2817g1<String, Integer> f3078b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0.l f3079c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f3080d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ z1<Boolean> f3081e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f3082f;

        q(LocalThemeScope localThemeScope, InterfaceC2817g1<String, Integer> interfaceC2817g1, h0.l lVar, boolean z10, z1<Boolean> z1Var, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f3077a = localThemeScope;
            this.f3078b = interfaceC2817g1;
            this.f3079c = lVar;
            this.f3080d = z10;
            this.f3081e = z1Var;
            this.f3082f = interfaceC5872l0;
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
            LocalThemeScope localThemeScope = this.f3077a;
            Modifier.Companion companion = Modifier.INSTANCE;
            V0.D1 shape = this.f3078b.getTemplate().getShape();
            if (shape == null) {
                shape = C16806i.c(this.f3077a.getAdsCornerRadii().getRadius04().getDp());
            }
            Modifier modifierG = C13572f.g(companion, H1.h.p(C2962v.D(this.f3081e) ? 2 : 1), this.f3078b.getTemplate().getColors().e(this.f3078b.getTemplate().getState(), this.f3079c, composer, 0).getValue().getValue(), shape);
            V0.D1 shape2 = this.f3078b.getTemplate().getShape();
            if (shape2 == null) {
                shape2 = C16806i.c(this.f3077a.getAdsCornerRadii().getRadius04().getDp());
            }
            C2962v.y(localThemeScope, androidx.compose.foundation.layout.D.l(androidx.compose.foundation.j.b(T0.e.a(modifierG, shape2), this.f3079c, C17982Y0.f(false, 0.0f, 0L, 7, null)), this.f3077a.getAdsSpacing().getFive().getDp(), this.f3077a.getAdsSpacing().getFour().getDp(), this.f3077a.getAdsSpacing().getFour().getDp(), this.f3077a.getAdsSpacing().getFour().getDp()), this.f3078b.getTemplate(), this.f3078b.getValue(), C2962v.B(this.f3082f), true ^ this.f3080d, this.f3078b.getPlaceHolder(), this.f3078b.getArrowUpIcon(), this.f3078b.getArrowDownIcon(), innerTextField, composer, (i12 << 27) & 1879048192, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            a(function2, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bi.v$r */
    static final class r implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final r f3083a = new r();

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.r(L1.v.INSTANCE.b());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }

        r() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bi.v$s */
    public static final class s extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f3084f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(L1.A a10) {
            super(1);
            this.f3084f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f3084f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$t */
    public static final class t extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f3085f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f3086g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f3087h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC2817g1 f3088i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3089j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f3090k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ h0.l f3091l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f3092m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ z1 f3093n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(L1.n nVar, int i10, Function0 function0, InterfaceC2817g1 interfaceC2817g1, LocalThemeScope localThemeScope, boolean z10, h0.l lVar, InterfaceC5872l0 interfaceC5872l0, z1 z1Var) {
            super(2);
            this.f3086g = nVar;
            this.f3087h = function0;
            this.f3088i = interfaceC2817g1;
            this.f3089j = localThemeScope;
            this.f3090k = z10;
            this.f3091l = lVar;
            this.f3092m = interfaceC5872l0;
            this.f3093n = z1Var;
            this.f3085f = i10;
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
            int helpersHashCode = this.f3086g.getHelpersHashCode();
            this.f3086g.i();
            L1.n nVar = this.f3086g;
            composer2.startReplaceGroup(1776662291);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            L1.h hVarF = bVarM.f();
            L1.E eF = nVar.f(new L1.h[]{hVarA, hVarC, hVarD, hVarE, hVarF}, C4009f.INSTANCE.b());
            composer2.startReplaceGroup(1849434622);
            Object objB = composer2.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = C2972j.f3067a;
                composer2.t(objB);
            }
            composer2.P();
            nVar.b(eF, (Function1) objB);
            si.p pVarJ = this.f3088i.getLabel();
            composer2.startReplaceGroup(1442795318);
            if (pVarJ == null) {
                hVar = hVarF;
                i11 = 327606171;
            } else {
                e.c cVarI = P0.e.INSTANCE.i();
                C5800d.e eVarG = C5800d.f48779a.g();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composer2.startReplaceGroup(1849434622);
                Object objB2 = composer2.B();
                if (objB2 == companion.a()) {
                    objB2 = C2973k.f3068a;
                    composer2.t(objB2);
                }
                composer2.P();
                Modifier modifierK = nVar.k(companion2, hVarA, (Function1) objB2);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, cVarI, composer2, 54);
                int iA = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR = composer2.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierK);
                InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion3.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A);
                } else {
                    composer2.s();
                }
                Composer composerA = D1.a(composer2);
                D1.c(composerA, measurePolicyB, companion3.e());
                D1.c(composerA, interfaceC5884sR, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion3.f());
                C14889J c14889j = C14889J.f139620a;
                composer2.startReplaceGroup(327606171);
                Object[] objArr = {pVarJ};
                composer2.startReplaceGroup(-2104237158);
                composer2.startReplaceGroup(1849434622);
                Object objB3 = composer2.B();
                if (objB3 == companion.a()) {
                    objB3 = u.f3094a;
                    composer2.t(objB3);
                }
                composer2.P();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
                composer2.startReplaceGroup(1252494947);
                C0064v c0064v = new C0064v((Function1) objB3, composer2, 0, objArrCopyOf, pVarJ);
                composer2.P();
                c0064v.k(0, companion2).invoke(composer2, 0);
                composer2.P();
                composer2.P();
                composer2.startReplaceGroup(-2057902760);
                if (this.f3088i.getLabelIcon() != null) {
                    C14890K.a(androidx.compose.foundation.layout.J.z(companion2, this.f3089j.getAdsSpacing().getThree().getDp()), composer2, 0);
                    LocalThemeScope localThemeScope = this.f3089j;
                    Function0<Unit> function0T0 = this.f3088i.t0();
                    C16673d c16673dR = this.f3088i.getLabelIcon();
                    Intrinsics.g(c16673dR);
                    hVar = hVarF;
                    i11 = 327606171;
                    s1.b(localThemeScope, function0T0, c16673dR, H1.h.p(20), composer2, 3072, 0);
                    composer2 = composer2;
                } else {
                    hVar = hVarF;
                    i11 = 327606171;
                }
                composer2.P();
                composer2.v();
                Unit unit = Unit.f143329a;
            }
            composer2.P();
            si.p description = this.f3088i.getDescription();
            composer2.startReplaceGroup(1442820383);
            if (description == null) {
                i12 = 1849434622;
                z10 = true;
                c10 = 36451;
            } else {
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composer2.startReplaceGroup(-1746271574);
                boolean zV = composer2.V(hVarA) | composer2.V(hVarD) | composer2.D(this.f3089j);
                Object objB4 = composer2.B();
                if (zV || objB4 == companion.a()) {
                    objB4 = new C2974l(hVarA, hVarD, this.f3089j);
                    composer2.t(objB4);
                }
                composer2.P();
                Modifier modifierM = androidx.compose.foundation.layout.D.m(nVar.k(companion4, hVarC, (Function1) objB4), 0.0f, this.f3089j.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                int iA2 = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierM);
                InterfaceC5953g.Companion companion5 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A2 = companion5.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A2);
                } else {
                    composer2.s();
                }
                Composer composerA2 = D1.a(composer2);
                D1.c(composerA2, measurePolicyG, companion5.e());
                D1.c(composerA2, interfaceC5884sR2, companion5.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion5.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion5.f());
                C5806j c5806j = C5806j.f48836a;
                composer2.startReplaceGroup(i11);
                Object[] objArr2 = {description};
                composer2.startReplaceGroup(-2104237158);
                i12 = 1849434622;
                composer2.startReplaceGroup(1849434622);
                Object objB5 = composer2.B();
                if (objB5 == companion.a()) {
                    objB5 = w.f3100a;
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
            q1.f fVarB = this.f3088i.getTemplate();
            Modifier.Companion companion6 = Modifier.INSTANCE;
            composer2.startReplaceGroup(i12);
            Object objB6 = composer2.B();
            if (objB6 == companion.a()) {
                objB6 = C2975m.f3072a;
                composer2.t(objB6);
            }
            composer2.P();
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(nVar.k(companion6, hVarE, (Function1) objB6), 0.0f, this.f3088i.getLabel() != null ? this.f3089j.getAdsSpacing().getThree().getDp() : H1.h.p(0), 0.0f, 0.0f, 13, null);
            String str = (String) this.f3088i.getValue();
            boolean zB = C2962v.B(this.f3092m);
            boolean z11 = this.f3090k ^ z10;
            List<String> listE0 = this.f3088i.e0();
            if (listE0 == null) {
                listE0 = CollectionsKt.m();
            }
            LocalThemeScope localThemeScope2 = this.f3089j;
            composer2.startReplaceGroup(-1633490746);
            boolean zA = composer2.a(this.f3090k);
            Object objB7 = composer2.B();
            if (zA || objB7 == companion.a()) {
                objB7 = new C2976n(this.f3090k, this.f3092m);
                composer2.t(objB7);
            }
            Function1 function1 = (Function1) objB7;
            composer2.P();
            composer2.startReplaceGroup(i12);
            Object objB8 = composer2.B();
            if (objB8 == companion.a()) {
                objB8 = C2977o.f3075a;
                composer2.t(objB8);
            }
            Function1 function12 = (Function1) objB8;
            composer2.P();
            composer2.startReplaceGroup(5004770);
            boolean zD = composer2.D(this.f3088i);
            Object objB9 = composer2.B();
            if (zD || objB9 == companion.a()) {
                objB9 = new p(this.f3088i);
                composer2.t(objB9);
            }
            composer2.P();
            h0.l lVar = this.f3091l;
            Composer composer3 = composer2;
            C2962v.G(localThemeScope2, modifierM2, fVarB, str, zB, z11, listE0, function1, function12, (Function2) objB9, lVar, ComposableLambdaKt.c(-1049320427, true, new q(this.f3089j, this.f3088i, lVar, this.f3090k, this.f3093n, this.f3092m), composer2, 54), composer3, 100663296, 48, 0);
            C16913e c16913eP = this.f3088i.getInfoBlockScope();
            composer3.startReplaceGroup(1442912108);
            if (c16913eP != null) {
                composer3.startReplaceGroup(1849434622);
                Object objB10 = composer3.B();
                if (objB10 == companion.a()) {
                    objB10 = r.f3083a;
                    composer3.t(objB10);
                }
                composer3.P();
                Modifier modifierM3 = androidx.compose.foundation.layout.D.m(nVar.k(companion6, hVar, (Function1) objB10), 0.0f, this.f3089j.getAdsSpacing().getTwo().getDp(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyG2 = C5804h.g(P0.e.INSTANCE.o(), false);
                int iA3 = C5859f.a(composer3, 0);
                InterfaceC5884s interfaceC5884sR3 = composer3.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer3, modifierM3);
                InterfaceC5953g.Companion companion7 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A3 = companion7.a();
                if (composer3.k() == null) {
                    C5859f.c();
                }
                composer3.F();
                if (composer3.getInserting()) {
                    composer3.I(function0A3);
                } else {
                    composer3.s();
                }
                Composer composerA3 = D1.a(composer3);
                D1.c(composerA3, measurePolicyG2, companion7.e());
                D1.c(composerA3, interfaceC5884sR3, companion7.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion7.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion7.f());
                C5806j c5806j2 = C5806j.f48836a;
                composer3.startReplaceGroup(327606171);
                Object[] objArr3 = {c16913eP};
                composer3.startReplaceGroup(-2104237158);
                composer3.startReplaceGroup(1849434622);
                Object objB11 = composer3.B();
                if (objB11 == companion.a()) {
                    objB11 = y.f3106a;
                    composer3.t(objB11);
                }
                composer3.P();
                Object[] objArrCopyOf3 = Arrays.copyOf(objArr3, 1);
                composer3.startReplaceGroup(1252494947);
                z zVar = new z((Function1) objB11, composer3, 0, objArrCopyOf3, c16913eP);
                composer3.P();
                zVar.k(0, companion6).invoke(composer3, 0);
                composer3.P();
                composer3.P();
                composer3.v();
            }
            composer3.P();
            composer3.P();
            if (this.f3086g.getHelpersHashCode() != helpersHashCode) {
                this.f3087h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bi.v$u */
    public static final class u implements Function1<si.p, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final u f3094a = new u();

        public final void a(si.p pVar) {
            Intrinsics.j(pVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(si.p pVar) {
            a(pVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$v, reason: collision with other inner class name */
    public static final class C0064v extends Ji.c<Integer, si.p, si.p> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<si.p, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<si.p> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final si.p initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bi.v$v$a */
        public static final class a implements Function0<si.p> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f3098a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0064v f3099b;

            public a(Ji.h hVar, C0064v c0064v) {
                this.f3098a = hVar;
                this.f3099b = c0064v;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, si.p] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final si.p invoke() {
                ?? r02 = this.f3098a;
                this.f3099b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<si.p> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public si.p getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<si.p, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0064v(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
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
    /* renamed from: Bi.v$w */
    public static final class w implements Function1<si.p, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final w f3100a = new w();

        public final void a(si.p pVar) {
            Intrinsics.j(pVar, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(si.p pVar) {
            a(pVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$x */
    public static final class x extends Ji.c<Integer, si.p, si.p> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<si.p, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<si.p> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final si.p initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bi.v$x$a */
        public static final class a implements Function0<si.p> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f3104a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f3105b;

            public a(Ji.h hVar, x xVar) {
                this.f3104a = hVar;
                this.f3105b = xVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, si.p] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final si.p invoke() {
                ?? r02 = this.f3104a;
                this.f3105b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<si.p> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public si.p getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<si.p, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public x(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
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
    /* renamed from: Bi.v$y */
    public static final class y implements Function1<C16913e, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final y f3106a = new y();

        public final void a(C16913e c16913e) {
            Intrinsics.j(c16913e, "<this>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C16913e c16913e) {
            a(c16913e);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Bi.v$z */
    public static final class z extends Ji.c<Integer, C16913e, C16913e> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<C16913e, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<C16913e> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final C16913e initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Bi.v$z$a */
        public static final class a implements Function0<C16913e> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f3110a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f3111b;

            public a(Ji.h hVar, z zVar) {
                this.f3110a = hVar;
                this.f3111b = zVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, ri.e] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C16913e invoke() {
                ?? r02 = this.f3110a;
                this.f3111b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<C16913e> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C16913e getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<C16913e, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public z(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
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
    public static final void G(final Ki.LocalThemeScope r25, androidx.compose.ui.Modifier r26, final ki.q1.f r27, final java.lang.String r28, final boolean r29, boolean r30, final java.util.List<java.lang.String> r31, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r32, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r33, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> r34, final h0.l r35, final kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bi.C2962v.G(Ki.M, androidx.compose.ui.Modifier, ki.q1$f, java.lang.String, boolean, boolean, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, h0.l, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
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
    public static final void A(Ai.InterfaceC2817g1<java.lang.String, java.lang.Integer> r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bi.C2962v.A(Ai.g1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.H0(semantics, true);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(InterfaceC2817g1 interfaceC2817g1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        A(interfaceC2817g1, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(String it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(String str, int i10) {
        Intrinsics.j(str, "<unused var>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(LocalThemeScope localThemeScope, Modifier modifier, q1.f fVar, String str, boolean z10, boolean z11, List list, Function1 function1, Function1 function12, Function2 function2, h0.l lVar, Function3 function3, int i10, int i11, int i12, Composer composer, int i13) {
        G(localThemeScope, modifier, fVar, str, z10, z11, list, function1, function12, function2, lVar, function3, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
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
            t0L.a(new Function2() { // from class: Bi.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2962v.L(z10, list, str, v10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(boolean z10, List list, String str, d0.V v10, int i10, Composer composer, int i11) {
        K(z10, list, str, v10, composer, J0.a(i10 | 1));
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, H0.f141923a, ComposableLambdaKt.c(-484535411, true, new D(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Bi.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2962v.N(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        M(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, H0.f141923a, ComposableLambdaKt.c(59627873, true, new E(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Bi.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2962v.P(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        O(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void Q(Ki.LocalThemeScope r19, androidx.compose.ui.Modifier r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bi.C2962v.Q(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List U(InterfaceC5872l0 interfaceC5872l0) {
        Month monthS = S(interfaceC5872l0);
        return CollectionsKt.j1(new IntRange(1, monthS != null ? monthS.maxLength() : 31));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        Q(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, H0.f141923a, ComposableLambdaKt.c(-770918560, true, new I(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Bi.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2962v.d0(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        c0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, H0.f141923a, ComposableLambdaKt.c(299920743, true, new J(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Bi.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2962v.f0(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        e0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, H0.f141923a, ComposableLambdaKt.c(1132007507, true, new K(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Bi.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2962v.h0(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        g0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, H0.f141923a, ComposableLambdaKt.c(1545297462, true, new L(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Bi.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2962v.j0(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        i0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, H0.f141923a, ComposableLambdaKt.c(208531733, true, new M(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Bi.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2962v.l0(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        k0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, H0.f141923a, ComposableLambdaKt.c(-523562555, true, new N(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Bi.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2962v.n0(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
            Ki.Q.e(localThemeScope, H0.f141923a, ComposableLambdaKt.c(-796070553, true, new O(localThemeScope, modifier, (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Bi.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2962v.p0(localThemeScope, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        o0(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
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
            t0L.a(new Function2() { // from class: Bi.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C2962v.r0(localThemeScope, modifier3, modifier4, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(LocalThemeScope localThemeScope, Modifier modifier, Modifier modifier2, int i10, int i11, Composer composer, int i12) {
        q0(localThemeScope, modifier, modifier2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void v(final Ki.LocalThemeScope r16, androidx.compose.ui.Modifier r17, java.lang.String r18, final ki.q1.f.Dropdown r19, final java.util.List<java.lang.String> r20, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> r21, kotlin.jvm.functions.Function1<? super Bi.n0, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bi.C2962v.v(Ki.M, androidx.compose.ui.Modifier, java.lang.String, ki.q1$f$b, java.util.List, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(n0 n0Var) {
        Intrinsics.j(n0Var, "<this>");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, Modifier modifier, String str, q1.f.Dropdown dropdown, List list, Function2 function2, Function1 function1, int i10, int i11, Composer composer, int i12) {
        v(localThemeScope, modifier, str, dropdown, list, function2, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void y(final Ki.LocalThemeScope r21, androidx.compose.ui.Modifier r22, final ki.q1.f r23, final java.lang.String r24, final boolean r25, boolean r26, final si.p r27, final qi.C16673d r28, final qi.C16673d r29, @android.annotation.SuppressLint({"ComposableLambdaParameterNaming"}) final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bi.C2962v.y(Ki.M, androidx.compose.ui.Modifier, ki.q1$f, java.lang.String, boolean, boolean, si.p, qi.d, qi.d, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(LocalThemeScope localThemeScope, Modifier modifier, q1.f fVar, String str, boolean z10, boolean z11, si.p pVar, C16673d c16673d, C16673d c16673d2, Function2 function2, int i10, int i11, Composer composer, int i12) {
        y(localThemeScope, modifier, fVar, str, z10, z11, pVar, c16673d, c16673d2, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Month> R(InterfaceC5872l0<List<Month>> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Month S(InterfaceC5872l0<Month> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(InterfaceC5872l0<Month> interfaceC5872l0, Month month) {
        interfaceC5872l0.setValue(month);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> V(z1<? extends List<Integer>> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int W(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Year> Y(InterfaceC5872l0<List<Year>> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Year Z(InterfaceC5872l0<Year> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(InterfaceC5872l0<Year> interfaceC5872l0, Year year) {
        interfaceC5872l0.setValue(year);
    }
}
