package iq;

import Vp.UpdateItemRequest;
import Xp.ShopAndScanItem;
import Xp.ShopAndScanTrip;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.Intent;
import androidx.view.c0;
import androidx.view.d0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import hq.ShopAndScanCartTotalsDecorator;
import hq.ShopAndScanCouponDecorator;
import hq.ShopAndScanItemDecorator;
import io.constructor.data.local.PreferencesHelper;
import iq.AbstractC14754b;
import iq.ShopAndScanCartViewState;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C0;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.P;
import tv.S;
import xq.C18085d;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001ZB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010\u001dJ\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010\u001dJ\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0011H\u0082@¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010\u001dJ\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b/\u0010.J\u001f\u00103\u001a\u00020!2\u0006\u00100\u001a\u00020\u00172\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020!2\u0006\u00105\u001a\u00020\u0017H\u0002¢\u0006\u0004\b6\u00107J#\u0010<\u001a\u00020\u000e2\n\u0010:\u001a\u000608j\u0002`92\u0006\u0010;\u001a\u00020\u0017H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020+H\u0002¢\u0006\u0004\b?\u0010.J\u0017\u0010A\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u0017H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bC\u0010\u001dJ\u001f\u0010F\u001a\u00020\u000e2\u0006\u0010D\u001a\u0002012\u0006\u0010E\u001a\u000201H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u000e2\u0006\u0010H\u001a\u000201H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u0017H\u0002¢\u0006\u0004\bK\u0010BJ\u0017\u0010M\u001a\u00020!2\u0006\u0010L\u001a\u00020+H\u0002¢\u0006\u0004\bM\u0010NJ\u0015\u0010Q\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\u0015\u0010V\u001a\u00020U2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001d\u0010o\u001a\b\u0012\u0004\u0012\u00020f0j8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010s\u001a\b\u0012\u0004\u0012\u00020a0p8F¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006t"}, d2 = {"Liq/A;", "Landroidx/lifecycle/c0;", "Lxq/d;", "navManager", "LCl/e;", "meijerIntent", "Lyl/k;", "featureManager", "LWp/a;", "repository", "<init>", "(Lxq/d;LCl/e;Lyl/k;LWp/a;)V", "LXp/f;", "trip", "", "d0", "(LXp/f;)V", "", "LXp/c;", "items", "Lhq/f;", "D", "(Ljava/util/List;)Ljava/util/List;", "", "storeName", "Lak/a;", "F", "(Ljava/lang/String;)Lak/a;", "P", "()V", "N", "O", "Q", "Lqv/C0;", "X", "()Lqv/C0;", "T", "U", "M", "LVp/h;", "H", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "K", "", "showDialog", "W", "(Z)V", "V", "localId", "", "quantity", "c0", "(Ljava/lang/String;I)Lqv/C0;", "itemId", "Y", "(Ljava/lang/String;)Lqv/C0;", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerID", "itemID", "C", "(JLjava/lang/String;)V", "displayed", "Z", PreferencesHelper.PREF_ID, "E", "(Ljava/lang/String;)V", "a0", "index", "offset", "S", "(II)V", "count", "R", "(I)V", "B", "isCheckoutInProgress", "b0", "(Z)Lqv/C0;", "Liq/b;", "event", "L", "(Liq/b;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "I", "(Landroid/content/Context;)Landroid/content/Intent;", "a", "Lxq/d;", "b", "LCl/e;", "c", "Lyl/k;", "d", "LWp/a;", "Ltv/B;", "Liq/E;", "e", "Ltv/B;", "_uiState", "Lsv/g;", "Liq/A$b;", "f", "Lsv/g;", "_effect", "Ltv/f;", "g", "Ltv/f;", "G", "()Ltv/f;", "effect", "Ltv/P;", "J", "()Ltv/P;", "uiState", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: iq.A, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14751A extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18085d navManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Cl.e meijerIntent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Wp.a repository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ShopAndScanCartViewState> _uiState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final sv.g<b> _effect;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17152f<b> effect;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$1", f = "ShopAndScanCartViewModel.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: iq.A$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138290a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: iq.A$a$a, reason: collision with other inner class name */
        static final class C2182a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C14751A f138292a;

            C2182a(C14751A c14751a) {
                this.f138292a = c14751a;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(ShopAndScanTrip shopAndScanTrip, Continuation<? super Unit> continuation) {
                if (shopAndScanTrip != null) {
                    this.f138292a.d0(shopAndScanTrip);
                }
                return Unit.f142422a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138290a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC17144F<ShopAndScanTrip> interfaceC17144FA = C14751A.this.repository.a();
                C2182a c2182a = new C2182a(C14751A.this);
                this.f138290a = 1;
                if (interfaceC17144FA.collect(c2182a, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Liq/A$b;", "", "<init>", "()V", "a", "Liq/A$b$a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iq.A$b */
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Liq/A$b$a;", "Liq/A$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: iq.A$b$a */
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f138293a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "NavigateToShoppingList";
            }

            public int hashCode() {
                return 575567711;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$closeItemAlertTag$1", f = "ShopAndScanCartViewModel.kt", l = {381}, m = "invokeSuspend")
    /* renamed from: iq.A$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138294a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f138296c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f138296c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new c(this.f138296c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138294a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Wp.a aVar = C14751A.this.repository;
                String str = this.f138296c;
                this.f138294a = 1;
                if (aVar.l(str, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$couponAction$1", f = "ShopAndScanCartViewModel.kt", l = {322}, m = "invokeSuspend")
    /* renamed from: iq.A$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138297a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f138299c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f138300d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f138299c = j10;
            this.f138300d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new d(this.f138299c, this.f138300d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138297a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Wp.a aVar = C14751A.this.repository;
                long j10 = this.f138299c;
                String str = this.f138300d;
                this.f138297a = 1;
                if (aVar.g(j10, str, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: iq.A$e */
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(((ShopAndScanItem) t10).getTimestamp().getTimeAdded(), ((ShopAndScanItem) t11).getTimestamp().getTimeAdded());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$focusedQuantityStepper$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138301a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f138303c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f138303c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new f(this.f138303c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f138301a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = C14751A.this._uiState;
            String str = this.f138303c;
            while (true) {
                Object value = interfaceC17140B.getValue();
                String str2 = str;
                if (interfaceC17140B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, false, false, false, false, false, false, false, null, str2, 0, 0, 0, 122879, null))) {
                    return Unit.f142422a;
                }
                str = str2;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel", f = "ShopAndScanCartViewModel.kt", l = {210}, m = "getErrorItems")
    /* renamed from: iq.A$g */
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f138304a;

        /* renamed from: c, reason: collision with root package name */
        int f138306c;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f138304a = obj;
            this.f138306c |= Integer.MIN_VALUE;
            return C14751A.this.H(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$handleCheckout$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138307a;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            IntrinsicsKt.f();
            if (this.f138307a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Iterator<T> it = ((ShopAndScanCartViewState) C14751A.this._uiState.getValue()).j().iterator();
            boolean z11 = false;
            while (true) {
                z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                ShopAndScanCouponDecorator coupon = ((ShopAndScanItemDecorator) it.next()).getCoupon();
                if (coupon != null && !coupon.getIsClipped()) {
                    z11 = true;
                }
            }
            InterfaceC17140B interfaceC17140B = C14751A.this._uiState;
            while (true) {
                Object value = interfaceC17140B.getValue();
                if (interfaceC17140B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, false, false, z11, false, false, false, false, null, null, 0, 0, 0, 130943, null))) {
                    break;
                }
                z10 = true;
            }
            if (((ShopAndScanCartViewState) C14751A.this._uiState.getValue()).getIsGreenville() && ((ShopAndScanCartViewState) C14751A.this._uiState.getValue()).getCheckOutConfirmDialog() && !((ShopAndScanCartViewState) C14751A.this._uiState.getValue()).getCheckOutConfirmDialogAcknowledged()) {
                C14751A.this.V(true);
            } else {
                C14751A.this.N();
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$hideCartSyncingBanner$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$i */
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138309a;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f138309a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = C14751A.this._uiState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, false, false, false, false, false, false, false, ShopAndScanCartViewState.a.C2183a.f138362a, null, 0, 0, 0, 124927, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$navigateToShoppingList$1", f = "ShopAndScanCartViewModel.kt", l = {147}, m = "invokeSuspend")
    /* renamed from: iq.A$j */
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138311a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138311a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                sv.g gVar = C14751A.this._effect;
                b.a aVar = b.a.f138293a;
                this.f138311a = 1;
                if (gVar.r(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$showCartSyncingBanner$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$k */
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138313a;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f138313a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = C14751A.this._uiState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, false, false, false, false, false, false, true, null, null, 0, 0, 0, 129023, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$showCartSyncingSuccessBanner$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$l */
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138315a;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f138315a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = C14751A.this._uiState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, false, false, false, false, false, false, false, ShopAndScanCartViewState.a.b.f138363a, null, 0, 0, 0, 124927, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$showCheckOutConfirmDialog$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$m */
    static final class m extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138317a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f138319c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z10, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f138319c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new m(this.f138319c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f138317a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C14751A.this.b0(false);
            InterfaceC17140B interfaceC17140B = C14751A.this._uiState;
            boolean z10 = this.f138319c;
            C14751A c14751a = C14751A.this;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, false, false, false, z10 && ((ShopAndScanCartViewState) c14751a._uiState.getValue()).getCheckOutConfirmDialog(), false, false, false, null, null, 0, 0, 0, 130815, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$showUnclippedDialog$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$n */
    static final class n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138320a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f138322c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z10, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f138322c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new n(this.f138322c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f138320a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = C14751A.this._uiState;
            boolean z10 = this.f138322c;
            C14751A c14751a = C14751A.this;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, z10 && ((ShopAndScanCartViewState) c14751a._uiState.getValue()).getUnclippedCoupons(), false, false, false, false, false, false, null, null, 0, 0, 0, 131039, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$syncCart$1", f = "ShopAndScanCartViewModel.kt", l = {165, 175}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$o */
    static final class o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f138323a;

        /* renamed from: b, reason: collision with root package name */
        int f138324b;

        o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        
            if (qv.Z.b(1000, r5) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f138324b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r5.f138323a
                java.util.List r0 = (java.util.List) r0
                kotlin.ResultKt.b(r6)
                goto L6f
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                kotlin.ResultKt.b(r6)
                goto L35
            L22:
                kotlin.ResultKt.b(r6)
                iq.A r6 = iq.C14751A.this
                iq.C14751A.u(r6)
                iq.A r6 = iq.C14751A.this
                r5.f138324b = r3
                java.lang.Object r6 = iq.C14751A.o(r6, r5)
                if (r6 != r0) goto L35
                goto L6e
            L35:
                java.util.List r6 = (java.util.List) r6
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L62
                r1 = r6
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                iq.A r3 = iq.C14751A.this
                java.util.Iterator r1 = r1.iterator()
            L49:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L5d
                java.lang.Object r4 = r1.next()
                Vp.h r4 = (Vp.SyncItemRequest) r4
                java.lang.String r4 = r4.getItemId()
                iq.C14751A.x(r3, r4)
                goto L49
            L5d:
                iq.A r1 = iq.C14751A.this
                iq.C14751A.v(r1)
            L62:
                r5.f138323a = r6
                r5.f138324b = r2
                r1 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = qv.Z.b(r1, r5)
                if (r6 != r0) goto L6f
            L6e:
                return r0
            L6f:
                iq.A r6 = iq.C14751A.this
                iq.C14751A.s(r6)
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: iq.C14751A.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$syncItem$1", f = "ShopAndScanCartViewModel.kt", l = {281, 296, HttpResponseStatus.REDIRECTION_USE_PROXY}, m = "invokeSuspend")
    /* renamed from: iq.A$p */
    static final class p extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f138326a;

        /* renamed from: b, reason: collision with root package name */
        int f138327b;

        /* renamed from: c, reason: collision with root package name */
        int f138328c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f138330e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: iq.A$p$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ShopAndScanItem.a.values().length];
                try {
                    iArr[ShopAndScanItem.a.f39558a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ShopAndScanItem.a.f39560c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ShopAndScanItem.a.f39559b.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ShopAndScanItem.a.f39561d.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f138330e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new p(this.f138330e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
        
            if (r8.e(r1, r7) == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
        
            if (r8.e(r1, r7) == r0) goto L41;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f138328c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L22
                if (r1 == r3) goto L11
                if (r1 != r2) goto L1a
            L11:
                java.lang.Object r0 = r7.f138326a
                Xp.c r0 = (Xp.ShopAndScanItem) r0
                kotlin.ResultKt.b(r8)
                goto Ld7
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                kotlin.ResultKt.b(r8)
                goto L3d
            L26:
                kotlin.ResultKt.b(r8)
                iq.A r8 = iq.C14751A.this
                Wp.a r8 = iq.C14751A.p(r8)
                tv.F r8 = r8.a()
                r7.f138328c = r4
                java.lang.Object r8 = tv.C17154h.A(r8, r7)
                if (r8 != r0) goto L3d
                goto Lc2
            L3d:
                Xp.f r8 = (Xp.ShopAndScanTrip) r8
                if (r8 == 0) goto Ld7
                java.util.List r8 = r8.c()
                if (r8 == 0) goto Ld7
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.lang.String r1 = r7.f138330e
                java.util.Iterator r8 = r8.iterator()
            L4f:
                boolean r5 = r8.hasNext()
                if (r5 == 0) goto L67
                java.lang.Object r5 = r8.next()
                r6 = r5
                Xp.c r6 = (Xp.ShopAndScanItem) r6
                java.lang.String r6 = r6.getLocalId()
                boolean r6 = kotlin.jvm.internal.Intrinsics.e(r6, r1)
                if (r6 == 0) goto L4f
                goto L68
            L67:
                r5 = 0
            L68:
                Xp.c r5 = (Xp.ShopAndScanItem) r5
                if (r5 == 0) goto Ld7
                iq.A r8 = iq.C14751A.this
                Xp.c$a r1 = r5.getAction()
                int[] r6 = iq.C14751A.p.a.$EnumSwitchMapping$0
                int r1 = r1.ordinal()
                r1 = r6[r1]
                r6 = 0
                if (r1 == r4) goto Lc3
                if (r1 == r3) goto La5
                if (r1 == r2) goto L8b
                r8 = 4
                if (r1 != r8) goto L85
                goto Ld7
            L85:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            L8b:
                Wp.a r8 = iq.C14751A.p(r8)
                Vp.i r1 = new Vp.i
                java.lang.String r3 = r5.getLocalId()
                r1.<init>(r3, r6)
                r7.f138326a = r5
                r7.f138327b = r6
                r7.f138328c = r2
                java.lang.Object r8 = r8.e(r1, r7)
                if (r8 != r0) goto Ld7
                goto Lc2
            La5:
                Wp.a r8 = iq.C14751A.p(r8)
                Vp.i r1 = new Vp.i
                java.lang.String r2 = r5.getLocalId()
                int r4 = r5.getQuantity()
                r1.<init>(r2, r4)
                r7.f138326a = r5
                r7.f138327b = r6
                r7.f138328c = r3
                java.lang.Object r8 = r8.e(r1, r7)
                if (r8 != r0) goto Ld7
            Lc2:
                return r0
            Lc3:
                Wp.a r8 = iq.C14751A.p(r8)
                Vp.b r0 = new Vp.b
                Xp.a r1 = r5.getBarcode()
                int r2 = r5.getQuantity()
                r0.<init>(r1, r2, r6)
                r8.c(r0)
            Ld7:
                kotlin.Unit r8 = kotlin.Unit.f142422a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: iq.C14751A.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$unfocusedQuantityStepper$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$q */
    static final class q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138331a;

        q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f138331a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = C14751A.this._uiState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, false, false, false, false, false, false, false, null, "", 0, 0, 0, 122879, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$updateIsCheckoutInProgress$1", f = "ShopAndScanCartViewModel.kt", l = {386}, m = "invokeSuspend")
    /* renamed from: iq.A$r */
    static final class r extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138333a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f138335c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(boolean z10, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f138335c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new r(this.f138335c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138333a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Wp.a aVar = C14751A.this.repository;
                boolean z10 = this.f138335c;
                this.f138333a = 1;
                if (aVar.b(z10, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$updateItem$1", f = "ShopAndScanCartViewModel.kt", l = {277}, m = "invokeSuspend")
    /* renamed from: iq.A$s */
    static final class s extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138336a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f138338c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f138339d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, int i10, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f138338c = str;
            this.f138339d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new s(this.f138338c, this.f138339d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138336a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Wp.a aVar = C14751A.this.repository;
                UpdateItemRequest updateItemRequest = new UpdateItemRequest(this.f138338c, this.f138339d);
                this.f138336a = 1;
                if (aVar.e(updateItemRequest, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$updateUIState$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$t */
    static final class t extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138340a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShopAndScanTrip f138342c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(ShopAndScanTrip shopAndScanTrip, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f138342c = shopAndScanTrip;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14751A.this.new t(this.f138342c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((t) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            List listD;
            boolean isGreenville;
            IntrinsicsKt.f();
            if (this.f138340a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = C14751A.this._uiState;
            C14751A c14751a = C14751A.this;
            ShopAndScanTrip shopAndScanTrip = this.f138342c;
            do {
                value = interfaceC17140B.getValue();
                listD = c14751a.D(shopAndScanTrip.c());
                isGreenville = shopAndScanTrip.getStoreDetails().getIsGreenville();
            } while (!interfaceC17140B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, c14751a.F(shopAndScanTrip.getStoreDetails().getStoreName()), listD, ShopAndScanCartTotalsDecorator.INSTANCE.a(shopAndScanTrip.getStoreDetails().getIsGreenville(), shopAndScanTrip.c(), shopAndScanTrip.getCartDetails()), isGreenville, false, false, false, false, false, false, false, false, null, null, 0, 0, 0, 131056, null)));
            return Unit.f142422a;
        }
    }

    public C14751A(C18085d navManager, Cl.e meijerIntent, yl.k featureManager, Wp.a repository) {
        Intrinsics.j(navManager, "navManager");
        Intrinsics.j(meijerIntent, "meijerIntent");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(repository, "repository");
        this.navManager = navManager;
        this.meijerIntent = meijerIntent;
        this.featureManager = featureManager;
        this.repository = repository;
        this._uiState = S.a(new ShopAndScanCartViewState(null, null, null, false, false, false, false, false, false, false, false, false, null, null, 0, 0, 0, 131071, null));
        sv.g<b> gVarB = sv.j.b(0, null, null, 7, null);
        this._effect = gVarB;
        this.effect = C17154h.R(gVarB);
        C16648k.d(d0.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ShopAndScanItemDecorator> D(List<ShopAndScanItem> items) {
        List listZ0 = CollectionsKt.Z0(items, new e());
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listZ0, 10));
        Iterator it = listZ0.iterator();
        while (it.hasNext()) {
            arrayList.add(ShopAndScanItemDecorator.INSTANCE.a((ShopAndScanItem) it.next()));
        }
        return CollectionsKt.T(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5607a F(String storeName) {
        return AbstractC5607a.INSTANCE.c(storeName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(kotlin.coroutines.Continuation<? super java.util.List<Vp.SyncItemRequest>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof iq.C14751A.g
            if (r0 == 0) goto L13
            r0 = r5
            iq.A$g r0 = (iq.C14751A.g) r0
            int r1 = r0.f138306c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138306c = r1
            goto L18
        L13:
            iq.A$g r0 = new iq.A$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f138304a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f138306c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            Wp.a r5 = r4.repository
            tv.F r5 = r5.a()
            r0.f138306c = r3
            java.lang.Object r5 = tv.C17154h.A(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            Xp.f r5 = (Xp.ShopAndScanTrip) r5
            if (r5 == 0) goto L9e
            java.util.List r5 = r5.c()
            if (r5 == 0) goto L9e
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L58:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r5.next()
            r2 = r1
            Xp.c r2 = (Xp.ShopAndScanItem) r2
            Xp.c$f r2 = r2.getState()
            Xp.c$f r3 = Xp.ShopAndScanItem.f.f39578c
            if (r2 != r3) goto L58
            r0.add(r1)
            goto L58
        L71:
            java.util.ArrayList r5 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.x(r0, r1)
            r5.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L80:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9d
            java.lang.Object r1 = r0.next()
            Xp.c r1 = (Xp.ShopAndScanItem) r1
            Vp.h r2 = new Vp.h
            java.lang.String r3 = r1.getLocalId()
            Xp.a r1 = r1.getBarcode()
            r2.<init>(r3, r1)
            r5.add(r2)
            goto L80
        L9d:
            return r5
        L9e:
            java.util.List r5 = kotlin.collections.CollectionsKt.m()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: iq.C14751A.H(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void R(int count) {
        ShopAndScanCartViewState value;
        InterfaceC17140B<ShopAndScanCartViewState> interfaceC17140B = this._uiState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ShopAndScanCartViewState.b(value, null, null, null, false, false, false, false, false, false, false, false, false, null, null, 0, 0, count, 65535, null)));
    }

    private final void S(int index, int offset) {
        ShopAndScanCartViewState value;
        InterfaceC17140B<ShopAndScanCartViewState> interfaceC17140B = this._uiState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ShopAndScanCartViewState.b(value, null, null, null, false, false, false, false, false, false, false, false, false, null, null, index, offset, 0, 81919, null)));
    }

    private final void Z(boolean displayed) {
        ShopAndScanCartViewState value;
        InterfaceC17140B<ShopAndScanCartViewState> interfaceC17140B = this._uiState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ShopAndScanCartViewState.b(value, null, null, null, false, false, displayed, true, false, false, false, false, false, null, null, 0, 0, 0, 130975, null)));
    }

    public final InterfaceC17152f<b> G() {
        return this.effect;
    }

    public final Intent I(Context context) {
        Intrinsics.j(context, "context");
        return this.meijerIntent.C(context, true, this.featureManager.e(AbstractC18227f.O.f170554h));
    }

    public final P<ShopAndScanCartViewState> J() {
        return C17154h.c(this._uiState);
    }

    public final void L(AbstractC14754b event) {
        Intrinsics.j(event, "event");
        if (event instanceof AbstractC14754b.i) {
            P();
            return;
        }
        if (event instanceof AbstractC14754b.g) {
            N();
            return;
        }
        if (event instanceof AbstractC14754b.h) {
            O();
            return;
        }
        if (event instanceof AbstractC14754b.j) {
            Q();
            return;
        }
        if (event instanceof AbstractC14754b.n) {
            X();
            return;
        }
        if (event instanceof AbstractC14754b.a) {
            K();
            return;
        }
        if (event instanceof AbstractC14754b.UpdateItem) {
            AbstractC14754b.UpdateItem updateItem = (AbstractC14754b.UpdateItem) event;
            c0(updateItem.getId(), updateItem.getQuantity());
            return;
        }
        if (event instanceof AbstractC14754b.RemoveItem) {
            c0(((AbstractC14754b.RemoveItem) event).getItemId(), 0);
            return;
        }
        if (event instanceof AbstractC14754b.SyncItem) {
            Y(((AbstractC14754b.SyncItem) event).getId());
            return;
        }
        if (event instanceof AbstractC14754b.CouponAction) {
            AbstractC14754b.CouponAction couponAction = (AbstractC14754b.CouponAction) event;
            C(couponAction.getOfferID(), couponAction.getItemID());
            return;
        }
        if (event instanceof AbstractC14754b.FocusedQuantityStepper) {
            E(((AbstractC14754b.FocusedQuantityStepper) event).getId());
            return;
        }
        if (event instanceof AbstractC14754b.c) {
            W(false);
            return;
        }
        if (event instanceof AbstractC14754b.C2185b) {
            V(false);
            return;
        }
        if (event instanceof AbstractC14754b.SaveScrollPosition) {
            AbstractC14754b.SaveScrollPosition saveScrollPosition = (AbstractC14754b.SaveScrollPosition) event;
            S(saveScrollPosition.getIndex(), saveScrollPosition.getOffset());
        } else if (event instanceof AbstractC14754b.SavePreviousItemCount) {
            R(((AbstractC14754b.SavePreviousItemCount) event).getCount());
        } else if (event instanceof AbstractC14754b.DismissItemRestriction) {
            B(((AbstractC14754b.DismissItemRestriction) event).getId());
        } else {
            if (!Intrinsics.e(event, AbstractC14754b.p.f138384a)) {
                throw new NoWhenBranchMatchedException();
            }
            a0();
        }
    }

    private final void B(String id2) {
        C16648k.d(d0.a(this), null, null, new c(id2, null), 3, null);
    }

    private final void C(long offerID, String itemID) {
        C16648k.d(d0.a(this), null, null, new d(offerID, itemID, null), 3, null);
    }

    private final void E(String id2) {
        C16648k.d(d0.a(this), null, null, new f(id2, null), 3, null);
    }

    private final void K() {
        C16648k.d(d0.a(this), null, null, new h(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        C16648k.d(d0.a(this), null, null, new i(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        a0();
        Z(false);
        if (this._uiState.getValue().getIsGreenville()) {
            b0(true);
            this.navManager.b(C18085d.a.b.f169851b);
        } else {
            this.navManager.b(C18085d.a.c.f169852b);
        }
    }

    private final void O() {
        a0();
        this.navManager.b(C18085d.a.h.f169857b);
    }

    private final void P() {
        a0();
        this.navManager.b(C18085d.a.j.f169859b);
    }

    private final void Q() {
        a0();
        C16648k.d(d0.a(this), null, null, new j(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        C16648k.d(d0.a(this), null, null, new k(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U() {
        C16648k.d(d0.a(this), null, null, new l(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(boolean showDialog) {
        C16648k.d(d0.a(this), null, null, new m(showDialog, null), 3, null);
    }

    private final void W(boolean showDialog) {
        C16648k.d(d0.a(this), null, null, new n(showDialog, null), 3, null);
    }

    private final C0 X() {
        return C16648k.d(d0.a(this), null, null, new o(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0 Y(String itemId) {
        return C16648k.d(d0.a(this), null, null, new p(itemId, null), 3, null);
    }

    private final void a0() {
        C16648k.d(d0.a(this), null, null, new q(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0 b0(boolean isCheckoutInProgress) {
        return C16648k.d(d0.a(this), null, null, new r(isCheckoutInProgress, null), 3, null);
    }

    private final C0 c0(String localId, int quantity) {
        return C16648k.d(d0.a(this), null, null, new s(localId, quantity, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(ShopAndScanTrip trip) {
        C16648k.d(d0.a(this), null, null, new t(trip, null), 3, null);
    }
}
