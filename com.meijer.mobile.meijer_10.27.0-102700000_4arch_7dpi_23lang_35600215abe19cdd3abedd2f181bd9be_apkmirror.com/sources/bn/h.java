package bn;

import Ji.LocalThemeScope;
import Zm.C5546t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.ui.Modifier;
import bn.h;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.util.List;
import kotlin.C13786D;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15339A;
import l0.InterfaceC15343c;
import l0.InterfaceC15349i;
import l0.n;
import l0.w;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u001a\u007f\u0010\u0013\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u000526\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aI\u0010\u001c\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u00192\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006#²\u0006\u000e\u0010\u001e\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "groupName", "", "selectedIndex", "", "Lbn/i;", "variants", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "variant", "", "onSelectVariant", "Landroidx/compose/ui/Modifier;", "modifier", "Ll0/A;", "listState", "g", "(LJi/M;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Ll0/A;Landroidx/compose/runtime/Composer;II)V", "", "isLeft", "enabled", "contentDescription", "Lkotlin/Function1;", "", "scroll", "r", "(LJi/M;ZZLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "shouldShowScrollButtons", "canScrollLeft", "canScrollRight", "selectedSize", "selectedFlavor", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productvariant.ProductVariantCarouselKt$ProductVariantCarousel$2$1", f = "ProductVariantCarousel.kt", l = {BinsView.LABEL_WIDTH_DP}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60429a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15339A f60430b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ProductVariantDecorator> f60431c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f60432d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f60433e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f60434f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f60435g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: bn.h$a$a, reason: collision with other inner class name */
        static final class C1190a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<ProductVariantDecorator> f60436a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C15339A f60437b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f60438c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f60439d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f60440e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f60441f;

            C1190a(List<ProductVariantDecorator> list, C15339A c15339a, int i10, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03) {
                this.f60436a = list;
                this.f60437b = c15339a;
                this.f60438c = i10;
                this.f60439d = interfaceC5730l0;
                this.f60440e = interfaceC5730l02;
                this.f60441f = interfaceC5730l03;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(n nVar, Continuation<? super Unit> continuation) {
                boolean z10;
                boolean z11;
                InterfaceC15349i interfaceC15349i = (InterfaceC15349i) CollectionsKt.F0(nVar.h());
                InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f60439d;
                boolean z12 = false;
                if (interfaceC15349i != null && (interfaceC15349i.getIndex() < CollectionsKt.o(this.f60436a) || C5546t.U(this.f60437b, interfaceC15349i) < this.f60438c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h.q(interfaceC5730l0, z10);
                InterfaceC15349i interfaceC15349i2 = (InterfaceC15349i) CollectionsKt.u0(nVar.h());
                InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f60440e;
                if (interfaceC15349i2 != null && (interfaceC15349i2.getIndex() > 0 || C5546t.U(this.f60437b, interfaceC15349i2) < this.f60438c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h.o(interfaceC5730l02, z11);
                InterfaceC5730l0<Boolean> interfaceC5730l03 = this.f60441f;
                if (C5546t.V(this.f60437b, this.f60438c).size() < this.f60436a.size()) {
                    z12 = true;
                }
                h.i(interfaceC5730l03, z12);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C15339A c15339a, List<ProductVariantDecorator> list, int i10, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f60430b = c15339a;
            this.f60431c = list;
            this.f60432d = i10;
            this.f60433e = interfaceC5730l0;
            this.f60434f = interfaceC5730l02;
            this.f60435g = interfaceC5730l03;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f60430b, this.f60431c, this.f60432d, this.f60433e, this.f60434f, this.f60435g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n g(C15339A c15339a) {
            return c15339a.x();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f60429a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final C15339A c15339a = this.f60430b;
                InterfaceC17152f interfaceC17152fQ = o1.q(new Function0() { // from class: bn.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.a.g(c15339a);
                    }
                });
                C1190a c1190a = new C1190a(this.f60431c, this.f60430b, this.f60432d, this.f60433e, this.f60434f, this.f60435g);
                this.f60429a = 1;
                if (interfaceC17152fQ.collect(c1190a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productvariant.ProductVariantCarouselKt$ProductVariantCarousel$3$1$1$1$1", f = "ProductVariantCarousel.kt", l = {128}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60442a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15339A f60443b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f60444c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C15339A c15339a, float f10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f60443b = c15339a;
            this.f60444c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f60443b, this.f60444c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f60442a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C15339A c15339a = this.f60443b;
                float f10 = this.f60444c;
                this.f60442a = 1;
                if (C13786D.b(c15339a, f10, null, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.productvariant.ProductVariantCarouselKt$ProductVariantCarousel$3$1$2$1$1", f = "ProductVariantCarousel.kt", l = {141}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f60445a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15339A f60446b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f60447c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C15339A c15339a, float f10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f60446b = c15339a;
            this.f60447c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f60446b, this.f60447c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f60445a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C15339A c15339a = this.f60446b;
                float f10 = this.f60447c;
                this.f60445a = 1;
                if (C13786D.b(c15339a, f10, null, this, 2, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function1<ProductVariantDecorator, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<Integer, ProductVariantDecorator, Unit> f60448a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f60449b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductVariantDecorator f60450c;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super Integer, ? super ProductVariantDecorator, Unit> function2, int i10, ProductVariantDecorator productVariantDecorator) {
            this.f60448a = function2;
            this.f60449b = i10;
            this.f60450c = productVariantDecorator;
        }

        public final void a(ProductVariantDecorator it) {
            Intrinsics.j(it, "it");
            this.f60448a.invoke(Integer.valueOf(this.f60449b), this.f60450c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ProductVariantDecorator productVariantDecorator) {
            a(productVariantDecorator);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class e extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f60451f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(1);
            this.f60451f = list;
        }

        public final Object a(int i10) {
            this.f60451f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class f extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f60452f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Integer f60453g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f60454h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2 f60455i;

        public final void a(InterfaceC15343c interfaceC15343c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (composer.V(interfaceC15343c) ? 4 : 2);
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
            ProductVariantDecorator productVariantDecorator = (ProductVariantDecorator) this.f60452f.get(i10);
            composer.startReplaceGroup(-15631545);
            Modifier modifierFsAttribute = FullStoryAnnotationsKt.fsAttribute(Modifier.INSTANCE, "Button", "variantcarousel_Cell");
            Integer num = this.f60453g;
            boolean z10 = num != null && i10 == num.intValue();
            LocalThemeScope localThemeScope = this.f60454h;
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(this.f60455i) | ((((i12 & 112) ^ 48) > 32 && composer.d(i10)) || (i12 & 48) == 32) | composer.D(productVariantDecorator);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new d(this.f60455i, i10, productVariantDecorator);
                composer.t(objB);
            }
            composer.P();
            m.c(localThemeScope, productVariantDecorator, z10, (Function1) objB, modifierFsAttribute, composer, LocalThemeScope.f15770g, 0);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, Integer num, LocalThemeScope localThemeScope, Function2 function2) {
            super(4);
            this.f60452f = list;
            this.f60453g = num;
            this.f60454h = localThemeScope;
            this.f60455i = function2;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15343c, num.intValue(), composer, num2.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011b A[PHI: r10
      0x011b: PHI (r10v28 androidx.compose.ui.Modifier) = (r10v26 androidx.compose.ui.Modifier), (r10v40 androidx.compose.ui.Modifier) binds: [B:98:0x0126, B:92:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r55, final java.lang.String r56, final java.lang.Integer r57, final java.util.List<bn.ProductVariantDecorator> r58, final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super bn.ProductVariantDecorator, kotlin.Unit> r59, androidx.compose.ui.Modifier r60, l0.C15339A r61, androidx.compose.runtime.Composer r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bn.h.g(Ji.M, java.lang.String, java.lang.Integer, java.util.List, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, l0.A, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(InterfaceC16622O interfaceC16622O, C15339A c15339a, float f10) {
        C16648k.d(interfaceC16622O, null, null, new b(c15339a, f10, null), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(InterfaceC16622O interfaceC16622O, C15339A c15339a, float f10) {
        C16648k.d(interfaceC16622O, null, null, new c(c15339a, f10, null), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(List list, Integer num, LocalThemeScope localThemeScope, Function2 function2, w LazyRow) {
        Intrinsics.j(LazyRow, "$this$LazyRow");
        LazyRow.i(list.size(), null, new e(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new f(list, num, localThemeScope, function2)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, String str, Integer num, List list, Function2 function2, Modifier modifier, C15339A c15339a, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, str, num, list, function2, modifier, c15339a, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void r(final Ji.LocalThemeScope r19, final boolean r20, final boolean r21, final java.lang.String r22, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r23, androidx.compose.ui.Modifier r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bn.h.r(Ji.M, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function1 function1, boolean z10, float f10) {
        if (z10) {
            f10 = -f10;
        }
        function1.invoke(Float.valueOf(f10));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, boolean z10, boolean z11, String str, Function1 function1, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        r(localThemeScope, z10, z11, str, function1, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final boolean h(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    private static final boolean n(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    private static final boolean p(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
