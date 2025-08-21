package com.meijer.mobile.meijer.activity.cart;

import Ki.C;
import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity;
import com.meijer.mobile.meijer.activity.cart.r1;
import e.C13737e;
import hn.ReadOnlyProductListDecorator;
import in.C14824q;
import j0.InterfaceC14882C;
import java.util.ArrayList;
import java.util.List;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C17987a1;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15432b;
import l0.InterfaceC15433c;
import p1.C16338g;
import vs.CartProductListDecorator;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/UnavailableForDeliveryActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/meijer/activity/cart/r1;", "s", "Lkotlin/Lazy;", "C1", "()Lcom/meijer/mobile/meijer/activity/cart/r1;", "viewModel", "t", "a", "Lcom/meijer/mobile/meijer/activity/cart/r1$a;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class UnavailableForDeliveryActivity extends Hilt_UnavailableForDeliveryActivity {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: u, reason: collision with root package name */
    public static final int f102536u = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new androidx.view.e0(Reflection.b(r1.class), new d(this), new c(this), new e(null, this));

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/UnavailableForDeliveryActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/ArrayList;", "Lvs/b;", "Lkotlin/collections/ArrayList;", "productsNotAvailableForDeliveryList", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/util/ArrayList;)Landroid/content/Intent;", "", "PRODUCTS_NOT_AVAILABLE_FOR_DELIVERY_EXTRA", "Ljava/lang/String;", "", "UNAVAILABLE_FOR_DELIVERY_RESULT", "I", "UNAVAILABLE_FOR_DELIVERY_PRODUCT_REMOVED", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent a(Context context, ArrayList<CartProductListDecorator> productsNotAvailableForDeliveryList) {
            Intrinsics.j(context, "context");
            Intrinsics.j(productsNotAvailableForDeliveryList, "productsNotAvailableForDeliveryList");
            Intent intentPutExtra = new Intent(context, (Class<?>) UnavailableForDeliveryActivity.class).putExtra("com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity.PRODUCTS_NOT_AVAILABLE_FOR_DELIVERY_EXTRA", productsNotAvailableForDeliveryList);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UnavailableForDeliveryActivity f102539a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity$b$a$a, reason: collision with other inner class name */
            static final class C1427a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f102540a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ UnavailableForDeliveryActivity f102541b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1428a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f102542a;

                    C1428a(LocalThemeScope localThemeScope) {
                        this.f102542a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1034239310, i10, -1, "com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UnavailableForDeliveryActivity.kt:65)");
                        }
                        Dr.g.g(this.f102542a, C16338g.c(com.meijer.mobile.meijer.Y.f100562Mh, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2032011406, i10, -1, "com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (UnavailableForDeliveryActivity.kt:63)");
                    }
                    AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f101031l1, new Object[0]);
                    C.f.o oVar = C.f.o.f17066e;
                    LocalThemeScope localThemeScope = this.f102540a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(1034239310, true, new C1428a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f102541b);
                    final UnavailableForDeliveryActivity unavailableForDeliveryActivity = this.f102541b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.j1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UnavailableForDeliveryActivity.b.a.C1427a.c(unavailableForDeliveryActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, oVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24576 | (C.f.o.f17067f << 18) | (AbstractC6392a.f60445b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1427a(LocalThemeScope localThemeScope, UnavailableForDeliveryActivity unavailableForDeliveryActivity) {
                    this.f102540a = localThemeScope;
                    this.f102541b = unavailableForDeliveryActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(UnavailableForDeliveryActivity unavailableForDeliveryActivity) {
                    unavailableForDeliveryActivity.finish();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity$b$a$b, reason: collision with other inner class name */
            static final class C1429b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f102543a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ UnavailableForDeliveryActivity f102544b;

                C1429b(LocalThemeScope localThemeScope, UnavailableForDeliveryActivity unavailableForDeliveryActivity) {
                    this.f102543a = localThemeScope;
                    this.f102544b = unavailableForDeliveryActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d() {
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(UnavailableForDeliveryActivity unavailableForDeliveryActivity) {
                    Intent intentPutExtra = new Intent().putExtra("com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity.UNAVAILABLE_FOR_DELIVERY_PRODUCT_REMOVED", true);
                    Intrinsics.i(intentPutExtra, "putExtra(...)");
                    unavailableForDeliveryActivity.setResult(3443, intentPutExtra);
                    unavailableForDeliveryActivity.finish();
                    return Unit.f143329a;
                }

                public final void c(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(800718863, i10, -1, "com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (UnavailableForDeliveryActivity.kt:71)");
                    }
                    LocalThemeScope localThemeScope = this.f102543a;
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(q1.h.c.f142330a.getModifier(), 0.0f, 1, null);
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objB == companion.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.k1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UnavailableForDeliveryActivity.b.a.C1429b.d();
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f102544b);
                    final UnavailableForDeliveryActivity unavailableForDeliveryActivity = this.f102544b;
                    Object objB2 = composer.B();
                    if (zD || objB2 == companion.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.l1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UnavailableForDeliveryActivity.b.a.C1429b.e(unavailableForDeliveryActivity);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    o1.b(localThemeScope, modifierH, function0, (Function0) objB2, composer, LocalThemeScope.f17314g | 384, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    c(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f102545a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<r1.ViewState> f102546b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity$b$a$c$a, reason: collision with other inner class name */
                static final class C1430a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f102547a;

                    C1430a(LocalThemeScope localThemeScope) {
                        this.f102547a = localThemeScope;
                    }

                    public final void a(InterfaceC15433c item, Composer composer, int i10) {
                        Intrinsics.j(item, "$this$item");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-810691550, i10, -1, "com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UnavailableForDeliveryActivity.kt:92)");
                        }
                        LocalThemeScope localThemeScope = this.f102547a;
                        Ki.I one = localThemeScope.getAdsTypography().getBody().getOne();
                        Modifier.Companion companion = Modifier.INSTANCE;
                        float f10 = 16;
                        si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.l(companion, H1.h.p(f10), H1.h.p(40), H1.h.p(f10), H1.h.p(8)), null, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, one, null, 374, null), C16338g.c(com.meijer.mobile.meijer.Y.f101317z7, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                        C17983Z.a(androidx.compose.foundation.layout.D.k(companion, H1.h.p(f10), 0.0f, 2, null), this.f102547a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
                        a(interfaceC15433c, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
                public static final class e extends Lambda implements Function1 {

                    /* renamed from: f, reason: collision with root package name */
                    public static final e f102551f = new e();

                    public e() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Void invoke(ReadOnlyProductListDecorator readOnlyProductListDecorator) {
                        return null;
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
                public static final class f extends Lambda implements Function1<Integer, Object> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ Function1 f102552f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ List f102553g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(Function1 function1, List list) {
                        super(1);
                        this.f102552f = function1;
                        this.f102553g = list;
                    }

                    public final Object a(int i10) {
                        return this.f102552f.invoke(this.f102553g.get(i10));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return a(num.intValue());
                    }
                }

                @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
                @SourceDebugExtension
                public static final class g extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ List f102554f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f102555g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public g(List list, LocalThemeScope localThemeScope) {
                        super(4);
                        this.f102554f = list;
                        this.f102555g = localThemeScope;
                    }

                    public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
                        int i12;
                        if ((i11 & 6) == 0) {
                            i12 = i11 | (composer.V(interfaceC15433c) ? 4 : 2);
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
                            ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        ReadOnlyProductListDecorator readOnlyProductListDecorator = (ReadOnlyProductListDecorator) this.f102554f.get(i10);
                        composer.startReplaceGroup(517649869);
                        composer.startReplaceGroup(-814585362);
                        LocalThemeScope localThemeScope = this.f102555g;
                        composer.startReplaceGroup(1849434622);
                        Object objB = composer.B();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objB == companion.a()) {
                            objB = C1431b.f102548a;
                            composer.t(objB);
                        }
                        Function0 function0 = (Function0) objB;
                        composer.P();
                        composer.startReplaceGroup(1849434622);
                        Object objB2 = composer.B();
                        if (objB2 == companion.a()) {
                            objB2 = C1432c.f102549a;
                            composer.t(objB2);
                        }
                        Function0 function02 = (Function0) objB2;
                        composer.P();
                        composer.startReplaceGroup(1849434622);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = d.f102550a;
                            composer.t(objB3);
                        }
                        composer.P();
                        C14824q.f(localThemeScope, null, readOnlyProductListDecorator, function0, function02, (Function0) objB3, false, false, composer, LocalThemeScope.f17314g | 14380032, 1);
                        C17983Z.a(androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, H1.h.p(16), 0.0f, 2, null), this.f102555g.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
                        composer.P();
                        composer.P();
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
                        a(interfaceC15433c, num.intValue(), composer, num2.intValue());
                        return Unit.f143329a;
                    }
                }

                public final void b(InterfaceC14882C contentPadding, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(contentPadding, "contentPadding");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.V(contentPadding) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1249007623, i11, -1, "com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (UnavailableForDeliveryActivity.kt:89)");
                    }
                    Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, contentPadding);
                    final LocalThemeScope localThemeScope = this.f102545a;
                    final z1<r1.ViewState> z1Var = this.f102546b;
                    MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                    InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.h()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyG, companion.e());
                    D1.c(composerA, interfaceC5884sR, companion.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion.f());
                    C5806j c5806j = C5806j.f48836a;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(localThemeScope) | composer.V(z1Var);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.m1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return UnavailableForDeliveryActivity.b.a.c.c(localThemeScope, z1Var, (l0.w) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    C15432b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composer, 0, 511);
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity$b$a$c$b, reason: collision with other inner class name */
                static final class C1431b implements Function0<Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C1431b f102548a = new C1431b();

                    C1431b() {
                    }

                    public final void a() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        a();
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity$b$a$c$c, reason: collision with other inner class name */
                static final class C1432c implements Function0<Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C1432c f102549a = new C1432c();

                    C1432c() {
                    }

                    public final void a() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        a();
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                static final class d implements Function0<Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    public static final d f102550a = new d();

                    d() {
                    }

                    public final void a() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        a();
                        return Unit.f143329a;
                    }
                }

                c(LocalThemeScope localThemeScope, z1<r1.ViewState> z1Var) {
                    this.f102545a = localThemeScope;
                    this.f102546b = z1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(LocalThemeScope localThemeScope, z1 z1Var, l0.w LazyColumn) {
                    Intrinsics.j(LazyColumn, "$this$LazyColumn");
                    l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-810691550, true, new C1430a(localThemeScope)), 3, null);
                    List<ReadOnlyProductListDecorator> listB = a.c(z1Var).b();
                    LazyColumn.i(listB.size(), null, new f(e.f102551f, listB), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new g(listB, localThemeScope)));
                    return Unit.f143329a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    b(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(UnavailableForDeliveryActivity unavailableForDeliveryActivity) {
                this.f102539a = unavailableForDeliveryActivity;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1721633207, i11, -1, "com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity.onCreate.<anonymous>.<anonymous> (UnavailableForDeliveryActivity.kt:60)");
                }
                C17987a1.a(null, null, ComposableLambdaKt.c(2032011406, true, new C1427a(AdsTheme, this.f102539a), composer, 54), ComposableLambdaKt.c(800718863, true, new C1429b(AdsTheme, this.f102539a), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(1249007623, true, new c(AdsTheme, androidx.compose.runtime.o1.b(this.f102539a.C1().n(), null, composer, 0, 1)), composer, 54), composer, 3456, 12582912, 131059);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final r1.ViewState c(z1<r1.ViewState> z1Var) {
                return z1Var.getValue();
            }
        }

        b() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-434741702, i10, -1, "com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity.onCreate.<anonymous> (UnavailableForDeliveryActivity.kt:59)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-1721633207, true, new a(UnavailableForDeliveryActivity.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102556f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f102556f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f102556f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102557f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f102557f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f102557f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f102558f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f102559g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f102558f = function0;
            this.f102559g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f102558f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f102559g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final r1 C1() {
        return (r1) this.viewModel.getValue();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList parcelableArrayListExtra;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity.PRODUCTS_NOT_AVAILABLE_FOR_DELIVERY_EXTRA", CartProductListDecorator.class);
        } else {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.meijer.mobile.meijer.activity.cart.UnavailableForDeliveryActivity.PRODUCTS_NOT_AVAILABLE_FOR_DELIVERY_EXTRA");
        }
        if (parcelableArrayListExtra != null) {
            C1().o(parcelableArrayListExtra);
        }
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-434741702, true, new b()), 1, null);
    }
}
