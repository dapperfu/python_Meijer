package nn;

import Ji.LocalThemeScope;
import Mn.AbstractC4310z0;
import V0.C5347r0;
import ak.AbstractC5607a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.google.android.material.button.MaterialButton;
import d0.C13457y;
import in.AbstractC14744a;
import in.AbstractC14745b;
import j0.InterfaceC14800I;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import l0.InterfaceC15343c;
import p1.C16190d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001aE\u0010\n\u001a\u00020\b*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a_\u0010\u0013\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u000426\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0018\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LJi/M;", "", "Lin/b;", "vehicleTypeList", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function2;", "", "", "onVehicleTypeClicked", "r", "(LJi/M;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lin/a;", "vehicleColorList", "Lkotlin/ParameterName;", "name", "currentPosition", "vehicleColor", "onVehicleColorClicked", "m", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "vehicleDescriptionItem", "Lkotlin/Function0;", "onVehicleDescriptionButtonClicked", "p", "(LJi/M;Lin/b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "vehicleColorItem", "onVehicleColorButtonClicked", "i", "(Lin/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class c0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, AbstractC4310z0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f152054b = new a();

        a() {
            super(3, AbstractC4310z0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/meijer/mobile/meijer/databinding/CheckInVehicleColorSelectionItemBinding;", 0);
        }

        public final AbstractC4310z0 a(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
            Intrinsics.j(p02, "p0");
            return AbstractC4310z0.K0(p02, viewGroup, z10);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ AbstractC4310z0 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return a(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<Integer, AbstractC14744a, Unit> f152055a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f152056b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC14744a f152057c;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super Integer, ? super AbstractC14744a, Unit> function2, int i10, AbstractC14744a abstractC14744a) {
            this.f152055a = function2;
            this.f152056b = i10;
            this.f152057c = abstractC14744a;
        }

        public final void a() {
            this.f152055a.invoke(Integer.valueOf(this.f152056b), this.f152057c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f152058f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(1);
            this.f152058f = list;
        }

        public final Object a(int i10) {
            this.f152058f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class d extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f152059f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2 f152060g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, Function2 function2) {
            super(4);
            this.f152059f = list;
            this.f152060g = function2;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            AbstractC14744a abstractC14744a = (AbstractC14744a) this.f152059f.get(i10);
            composer.startReplaceGroup(616666214);
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(this.f152060g) | ((((i12 & 112) ^ 48) > 32 && composer.d(i10)) || (i12 & 48) == 32) | composer.D(abstractC14744a);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new b(this.f152060g, i10, abstractC14744a);
                composer.t(objB);
            }
            composer.P();
            c0.i(abstractC14744a, (Function0) objB, composer, AbstractC5607a.f45514b);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC14745b f152061a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152062b;

        e(AbstractC14745b abstractC14745b, LocalThemeScope localThemeScope) {
            this.f152061a = abstractC14745b;
            this.f152062b = localThemeScope;
        }

        public final void a(InterfaceC14800I OutlinedButton, Composer composer, int i10) {
            Intrinsics.j(OutlinedButton, "$this$OutlinedButton");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(357920590, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.VehicleTypeItem.<anonymous>.<anonymous> (FlyBuyPicker.kt:117)");
            }
            Z0.c cVarC = C16190d.c(this.f152061a.getVehicleImage(), composer, 0);
            C5347r0.Companion companion = C5347r0.INSTANCE;
            C5347r0 c5347r0C = C5347r0.Companion.c(companion, this.f152062b.getAdsColors().getAdsColorText03().getColor(), 0, 2, null);
            if (!this.f152061a.getIsChecked()) {
                c5347r0C = null;
            }
            if (c5347r0C == null) {
                c5347r0C = C5347r0.Companion.c(companion, this.f152062b.getAdsColors().getAdsColorText01().getColor(), 0, 2, null);
            }
            C13457y.a(cVarC, null, null, null, null, 0.0f, c5347r0C, composer, 48, 60);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<Integer, AbstractC14745b, Unit> f152063a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f152064b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC14745b f152065c;

        /* JADX WARN: Multi-variable type inference failed */
        f(Function2<? super Integer, ? super AbstractC14745b, Unit> function2, int i10, AbstractC14745b abstractC14745b) {
            this.f152063a = function2;
            this.f152064b = i10;
            this.f152065c = abstractC14745b;
        }

        public final void a() {
            this.f152063a.invoke(Integer.valueOf(this.f152064b), this.f152065c);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class g extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f152066f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list) {
            super(1);
            this.f152066f = list;
        }

        public final Object a(int i10) {
            this.f152066f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class h extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f152067f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f152068g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2 f152069h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, LocalThemeScope localThemeScope, Function2 function2) {
            super(4);
            this.f152067f = list;
            this.f152068g = localThemeScope;
            this.f152069h = function2;
        }

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15343c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            AbstractC14745b abstractC14745b = (AbstractC14745b) this.f152067f.get(i10);
            composer.startReplaceGroup(1819635564);
            LocalThemeScope localThemeScope = this.f152068g;
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(this.f152069h) | ((((i12 & 112) ^ 48) > 32 && composer.d(i10)) || (i12 & 48) == 32) | composer.D(abstractC14745b);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new f(this.f152069h, i10, abstractC14745b);
                composer.t(objB);
            }
            composer.P();
            c0.p(localThemeScope, abstractC14745b, null, (Function0) objB, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3), 2);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(AbstractC14744a abstractC14744a, final Function0 function0, AbstractC4310z0 AndroidViewBinding) {
        Intrinsics.j(AndroidViewBinding, "$this$AndroidViewBinding");
        TextView vehicleColorName = AndroidViewBinding.f21152z;
        Intrinsics.i(vehicleColorName, "vehicleColorName");
        bk.d.g(vehicleColorName, abstractC14744a.getDescription());
        MaterialButton materialButton = AndroidViewBinding.f21151C;
        materialButton.getBackground().setTint(Z1.b.c(AndroidViewBinding.getRoot().getContext(), abstractC14744a.getVehicleColor()));
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: nn.U
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0.k(function0, view);
            }
        });
        ImageView imageView = AndroidViewBinding.f21149A;
        Integer num = abstractC14744a.getIsChecked() ? 0 : null;
        imageView.setVisibility(num != null ? num.intValue() : 8);
        AndroidViewBinding.f21152z.setTextColor(Z1.b.c(materialButton.getContext(), abstractC14744a.getIsChecked() ? Bj.g.f2616c : Bj.g.f2624k));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(AbstractC14744a abstractC14744a, Function0 function0, int i10, Composer composer, int i11) {
        i(abstractC14744a, function0, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final java.util.List<? extends in.AbstractC14744a> r18, androidx.compose.ui.Modifier r19, final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super in.AbstractC14744a, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.c0.m(java.util.List, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(List list, Function2 function2, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        LazyRow.i(list.size(), null, new c(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new d(list, function2)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(List list, Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        m(list, modifier, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ji.LocalThemeScope r22, final in.AbstractC14745b r23, androidx.compose.ui.Modifier r24, final kotlin.jvm.functions.Function0<kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.c0.p(Ji.M, in.b, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, AbstractC14745b abstractC14745b, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, abstractC14745b, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final Ji.LocalThemeScope r19, final java.util.List<? extends in.AbstractC14745b> r20, androidx.compose.ui.Modifier r21, final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super in.AbstractC14745b, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.c0.r(Ji.M, java.util.List, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(List list, LocalThemeScope localThemeScope, Function2 function2, l0.w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        LazyRow.i(list.size(), null, new g(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new h(list, localThemeScope, function2)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, List list, Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        r(localThemeScope, list, modifier, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final AbstractC14744a abstractC14744a, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        boolean z10;
        int i12;
        boolean zD;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(337831951);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(abstractC14744a);
            } else {
                zD = composerStartRestartGroup.D(abstractC14744a);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(337831951, i11, -1, "com.meijer.mobile.meijer.activity.orders.screens.flybuy.VehicleColorItem (FlyBuyPicker.kt:141)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = a.f152054b;
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Function3 function3 = (Function3) ((KFunction) objB);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z11 = true;
            if ((i11 & 14) != 4 && ((i11 & 8) == 0 || !composerStartRestartGroup.D(abstractC14744a))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if ((i11 & 112) != 32) {
                z11 = false;
            }
            boolean z12 = z10 | z11;
            Object objB2 = composerStartRestartGroup.B();
            if (z12 || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: nn.Z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return c0.j(abstractC14744a, function0, (AbstractC4310z0) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            androidx.compose.ui.viewinterop.a.a(function3, null, (Function1) objB2, composerStartRestartGroup, 6, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: nn.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return c0.l(abstractC14744a, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Function0 function0, View view) {
        function0.invoke();
    }
}
