package iq;

import Vp.UpdateItemRequest;
import Xp.ShopAndScanItem;
import Xp.ShopAndScanTrip;
import android.content.Context;
import android.content.Intent;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import hq.ShopAndScanCartTotalsDecorator;
import hq.ShopAndScanCouponDecorator;
import hq.ShopAndScanItemDecorator;
import io.constructor.data.local.PreferencesHelper;
import iq.AbstractC14842b;
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
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.P;
import pv.S;
import xq.C18213d;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001ZB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u001dJ\u000f\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010\u001dJ\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010\u001dJ\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0011H\u0082@¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010\u001dJ\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b/\u0010.J\u001f\u00103\u001a\u00020!2\u0006\u00100\u001a\u00020\u00172\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020!2\u0006\u00105\u001a\u00020\u0017H\u0002¢\u0006\u0004\b6\u00107J#\u0010<\u001a\u00020\u000e2\n\u0010:\u001a\u000608j\u0002`92\u0006\u0010;\u001a\u00020\u0017H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020+H\u0002¢\u0006\u0004\b?\u0010.J\u0017\u0010A\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u0017H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bC\u0010\u001dJ\u001f\u0010F\u001a\u00020\u000e2\u0006\u0010D\u001a\u0002012\u0006\u0010E\u001a\u000201H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u000e2\u0006\u0010H\u001a\u000201H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u0017H\u0002¢\u0006\u0004\bK\u0010BJ\u0017\u0010M\u001a\u00020!2\u0006\u0010L\u001a\u00020+H\u0002¢\u0006\u0004\bM\u0010NJ\u0015\u0010Q\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\u0015\u0010V\u001a\u00020U2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020a0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001d\u0010o\u001a\b\u0012\u0004\u0012\u00020f0j8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010s\u001a\b\u0012\u0004\u0012\u00020a0p8F¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006t"}, d2 = {"Liq/A;", "Landroidx/lifecycle/c0;", "Lxq/d;", "navManager", "LDl/e;", "meijerIntent", "Lzl/k;", "featureManager", "LWp/a;", "repository", "<init>", "(Lxq/d;LDl/e;Lzl/k;LWp/a;)V", "LXp/f;", "trip", "", "d0", "(LXp/f;)V", "", "LXp/c;", "items", "Lhq/f;", "D", "(Ljava/util/List;)Ljava/util/List;", "", "storeName", "Lbk/a;", "F", "(Ljava/lang/String;)Lbk/a;", "P", "()V", "N", "O", "Q", "Lmv/C0;", "X", "()Lmv/C0;", "T", "U", "M", "LVp/h;", "H", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "K", "", "showDialog", "W", "(Z)V", "V", "localId", "", "quantity", "c0", "(Ljava/lang/String;I)Lmv/C0;", "itemId", "Y", "(Ljava/lang/String;)Lmv/C0;", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerID", "itemID", "C", "(JLjava/lang/String;)V", "displayed", "Z", PreferencesHelper.PREF_ID, "E", "(Ljava/lang/String;)V", "a0", "index", "offset", "S", "(II)V", "count", "R", "(I)V", "B", "isCheckoutInProgress", "b0", "(Z)Lmv/C0;", "Liq/b;", "event", "L", "(Liq/b;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "I", "(Landroid/content/Context;)Landroid/content/Intent;", "a", "Lxq/d;", "b", "LDl/e;", "c", "Lzl/k;", "d", "LWp/a;", "Lpv/B;", "Liq/E;", "e", "Lpv/B;", "_uiState", "Lov/g;", "Liq/A$b;", "f", "Lov/g;", "_effect", "Lpv/f;", "g", "Lpv/f;", "G", "()Lpv/f;", "effect", "Lpv/P;", "J", "()Lpv/P;", "uiState", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: iq.A, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14839A extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18213d navManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Dl.e meijerIntent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Wp.a repository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ShopAndScanCartViewState> _uiState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ov.g<b> _effect;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16561f<b> effect;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$1", f = "ShopAndScanCartViewModel.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: iq.A$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138932a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: iq.A$a$a, reason: collision with other inner class name */
        static final class C2202a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C14839A f138934a;

            C2202a(C14839A c14839a) {
                this.f138934a = c14839a;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(ShopAndScanTrip shopAndScanTrip, Continuation<? super Unit> continuation) {
                if (shopAndScanTrip != null) {
                    this.f138934a.d0(shopAndScanTrip);
                }
                return Unit.f143329a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138932a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC16553F<ShopAndScanTrip> interfaceC16553FA = C14839A.this.repository.a();
                C2202a c2202a = new C2202a(C14839A.this);
                this.f138932a = 1;
                if (interfaceC16553FA.collect(c2202a, this) == objF) {
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
            public static final a f138935a = new a();

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$closeItemAlertTag$1", f = "ShopAndScanCartViewModel.kt", l = {381}, m = "invokeSuspend")
    /* renamed from: iq.A$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138936a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f138938c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f138938c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new c(this.f138938c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138936a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Wp.a aVar = C14839A.this.repository;
                String str = this.f138938c;
                this.f138936a = 1;
                if (aVar.l(str, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$couponAction$1", f = "ShopAndScanCartViewModel.kt", l = {322}, m = "invokeSuspend")
    /* renamed from: iq.A$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138939a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f138941c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f138942d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f138941c = j10;
            this.f138942d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new d(this.f138941c, this.f138942d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138939a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Wp.a aVar = C14839A.this.repository;
                long j10 = this.f138941c;
                String str = this.f138942d;
                this.f138939a = 1;
                if (aVar.g(j10, str, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$focusedQuantityStepper$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138943a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f138945c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f138945c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new f(this.f138945c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f138943a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = C14839A.this._uiState;
            String str = this.f138945c;
            while (true) {
                Object value = interfaceC16549B.getValue();
                String str2 = str;
                if (interfaceC16549B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, false, false, false, false, false, false, false, null, str2, 0, 0, 0, 122879, null))) {
                    return Unit.f143329a;
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
        /* synthetic */ Object f138946a;

        /* renamed from: c, reason: collision with root package name */
        int f138948c;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f138946a = obj;
            this.f138948c |= Integer.MIN_VALUE;
            return C14839A.this.H(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$handleCheckout$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138949a;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            IntrinsicsKt.f();
            if (this.f138949a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Iterator<T> it = ((ShopAndScanCartViewState) C14839A.this._uiState.getValue()).j().iterator();
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
            InterfaceC16549B interfaceC16549B = C14839A.this._uiState;
            while (true) {
                Object value = interfaceC16549B.getValue();
                if (interfaceC16549B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, false, false, z11, false, false, false, false, null, null, 0, 0, 0, 130943, null))) {
                    break;
                }
                z10 = true;
            }
            if (((ShopAndScanCartViewState) C14839A.this._uiState.getValue()).getIsGreenville() && ((ShopAndScanCartViewState) C14839A.this._uiState.getValue()).getCheckOutConfirmDialog() && !((ShopAndScanCartViewState) C14839A.this._uiState.getValue()).getCheckOutConfirmDialogAcknowledged()) {
                C14839A.this.V(true);
            } else {
                C14839A.this.N();
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$hideCartSyncingBanner$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$i */
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138951a;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f138951a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = C14839A.this._uiState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, false, false, false, false, false, false, false, ShopAndScanCartViewState.a.C2203a.f139004a, null, 0, 0, 0, 124927, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$navigateToShoppingList$1", f = "ShopAndScanCartViewModel.kt", l = {147}, m = "invokeSuspend")
    /* renamed from: iq.A$j */
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138953a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138953a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                ov.g gVar = C14839A.this._effect;
                b.a aVar = b.a.f138935a;
                this.f138953a = 1;
                if (gVar.r(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$showCartSyncingBanner$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$k */
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138955a;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f138955a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = C14839A.this._uiState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, false, false, false, false, false, false, true, null, null, 0, 0, 0, 129023, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$showCartSyncingSuccessBanner$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$l */
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138957a;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f138957a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = C14839A.this._uiState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, false, false, false, false, false, false, false, ShopAndScanCartViewState.a.b.f139005a, null, 0, 0, 0, 124927, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$showCheckOutConfirmDialog$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$m */
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138959a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f138961c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z10, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f138961c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new m(this.f138961c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f138959a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C14839A.this.b0(false);
            InterfaceC16549B interfaceC16549B = C14839A.this._uiState;
            boolean z10 = this.f138961c;
            C14839A c14839a = C14839A.this;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, false, false, false, z10 && ((ShopAndScanCartViewState) c14839a._uiState.getValue()).getCheckOutConfirmDialog(), false, false, false, null, null, 0, 0, 0, 130815, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$showUnclippedDialog$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$n */
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138962a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f138964c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z10, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f138964c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new n(this.f138964c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f138962a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = C14839A.this._uiState;
            boolean z10 = this.f138964c;
            C14839A c14839a = C14839A.this;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, z10 && ((ShopAndScanCartViewState) c14839a._uiState.getValue()).getUnclippedCoupons(), false, false, false, false, false, false, null, null, 0, 0, 0, 131039, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$syncCart$1", f = "ShopAndScanCartViewModel.kt", l = {165, 175}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$o */
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f138965a;

        /* renamed from: b, reason: collision with root package name */
        int f138966b;

        o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        
            if (mv.Z.b(1000, r5) == r0) goto L22;
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
                int r1 = r5.f138966b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r5.f138965a
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
                iq.A r6 = iq.C14839A.this
                iq.C14839A.u(r6)
                iq.A r6 = iq.C14839A.this
                r5.f138966b = r3
                java.lang.Object r6 = iq.C14839A.o(r6, r5)
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
                iq.A r3 = iq.C14839A.this
                java.util.Iterator r1 = r1.iterator()
            L49:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L5d
                java.lang.Object r4 = r1.next()
                Vp.h r4 = (Vp.SyncItemRequest) r4
                java.lang.String r4 = r4.getItemId()
                iq.C14839A.x(r3, r4)
                goto L49
            L5d:
                iq.A r1 = iq.C14839A.this
                iq.C14839A.v(r1)
            L62:
                r5.f138965a = r6
                r5.f138966b = r2
                r1 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = mv.Z.b(r1, r5)
                if (r6 != r0) goto L6f
            L6e:
                return r0
            L6f:
                iq.A r6 = iq.C14839A.this
                iq.C14839A.s(r6)
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: iq.C14839A.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$syncItem$1", f = "ShopAndScanCartViewModel.kt", l = {281, 296, HttpResponseStatus.REDIRECTION_USE_PROXY}, m = "invokeSuspend")
    /* renamed from: iq.A$p */
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f138968a;

        /* renamed from: b, reason: collision with root package name */
        int f138969b;

        /* renamed from: c, reason: collision with root package name */
        int f138970c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f138972e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: iq.A$p$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ShopAndScanItem.a.values().length];
                try {
                    iArr[ShopAndScanItem.a.f42407a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ShopAndScanItem.a.f42409c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ShopAndScanItem.a.f42408b.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ShopAndScanItem.a.f42410d.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f138972e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new p(this.f138972e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r7.f138970c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L22
                if (r1 == r3) goto L11
                if (r1 != r2) goto L1a
            L11:
                java.lang.Object r0 = r7.f138968a
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
                iq.A r8 = iq.C14839A.this
                Wp.a r8 = iq.C14839A.p(r8)
                pv.F r8 = r8.a()
                r7.f138970c = r4
                java.lang.Object r8 = pv.C16563h.A(r8, r7)
                if (r8 != r0) goto L3d
                goto Lc2
            L3d:
                Xp.f r8 = (Xp.ShopAndScanTrip) r8
                if (r8 == 0) goto Ld7
                java.util.List r8 = r8.c()
                if (r8 == 0) goto Ld7
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.lang.String r1 = r7.f138972e
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
                iq.A r8 = iq.C14839A.this
                Xp.c$a r1 = r5.getAction()
                int[] r6 = iq.C14839A.p.a.$EnumSwitchMapping$0
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
                Wp.a r8 = iq.C14839A.p(r8)
                Vp.i r1 = new Vp.i
                java.lang.String r3 = r5.getLocalId()
                r1.<init>(r3, r6)
                r7.f138968a = r5
                r7.f138969b = r6
                r7.f138970c = r2
                java.lang.Object r8 = r8.e(r1, r7)
                if (r8 != r0) goto Ld7
                goto Lc2
            La5:
                Wp.a r8 = iq.C14839A.p(r8)
                Vp.i r1 = new Vp.i
                java.lang.String r2 = r5.getLocalId()
                int r4 = r5.getQuantity()
                r1.<init>(r2, r4)
                r7.f138968a = r5
                r7.f138969b = r6
                r7.f138970c = r3
                java.lang.Object r8 = r8.e(r1, r7)
                if (r8 != r0) goto Ld7
            Lc2:
                return r0
            Lc3:
                Wp.a r8 = iq.C14839A.p(r8)
                Vp.b r0 = new Vp.b
                Xp.a r1 = r5.getBarcode()
                int r2 = r5.getQuantity()
                r0.<init>(r1, r2, r6)
                r8.c(r0)
            Ld7:
                kotlin.Unit r8 = kotlin.Unit.f143329a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: iq.C14839A.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$unfocusedQuantityStepper$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$q */
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138973a;

        q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f138973a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = C14839A.this._uiState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, null, null, null, false, false, false, false, false, false, false, false, false, null, "", 0, 0, 0, 122879, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$updateIsCheckoutInProgress$1", f = "ShopAndScanCartViewModel.kt", l = {386}, m = "invokeSuspend")
    /* renamed from: iq.A$r */
    static final class r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138975a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f138977c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(boolean z10, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f138977c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new r(this.f138977c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138975a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Wp.a aVar = C14839A.this.repository;
                boolean z10 = this.f138977c;
                this.f138975a = 1;
                if (aVar.b(z10, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$updateItem$1", f = "ShopAndScanCartViewModel.kt", l = {277}, m = "invokeSuspend")
    /* renamed from: iq.A$s */
    static final class s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138978a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f138980c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f138981d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, int i10, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f138980c = str;
            this.f138981d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new s(this.f138980c, this.f138981d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f138978a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Wp.a aVar = C14839A.this.repository;
                UpdateItemRequest updateItemRequest = new UpdateItemRequest(this.f138980c, this.f138981d);
                this.f138978a = 1;
                if (aVar.e(updateItemRequest, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartViewModel$updateUIState$1", f = "ShopAndScanCartViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: iq.A$t */
    static final class t extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138982a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShopAndScanTrip f138984c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(ShopAndScanTrip shopAndScanTrip, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f138984c = shopAndScanTrip;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C14839A.this.new t(this.f138984c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((t) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            List listD;
            boolean isGreenville;
            IntrinsicsKt.f();
            if (this.f138982a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = C14839A.this._uiState;
            C14839A c14839a = C14839A.this;
            ShopAndScanTrip shopAndScanTrip = this.f138984c;
            do {
                value = interfaceC16549B.getValue();
                listD = c14839a.D(shopAndScanTrip.c());
                isGreenville = shopAndScanTrip.getStoreDetails().getIsGreenville();
            } while (!interfaceC16549B.e(value, ShopAndScanCartViewState.b((ShopAndScanCartViewState) value, c14839a.F(shopAndScanTrip.getStoreDetails().getStoreName()), listD, ShopAndScanCartTotalsDecorator.INSTANCE.a(shopAndScanTrip.getStoreDetails().getIsGreenville(), shopAndScanTrip.c(), shopAndScanTrip.getCartDetails()), isGreenville, false, false, false, false, false, false, false, false, null, null, 0, 0, 0, 131056, null)));
            return Unit.f143329a;
        }
    }

    public C14839A(C18213d navManager, Dl.e meijerIntent, zl.k featureManager, Wp.a repository) {
        Intrinsics.j(navManager, "navManager");
        Intrinsics.j(meijerIntent, "meijerIntent");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(repository, "repository");
        this.navManager = navManager;
        this.meijerIntent = meijerIntent;
        this.featureManager = featureManager;
        this.repository = repository;
        this._uiState = S.a(new ShopAndScanCartViewState(null, null, null, false, false, false, false, false, false, false, false, false, null, null, 0, 0, 0, 131071, null));
        ov.g<b> gVarB = ov.j.b(0, null, null, 7, null);
        this._effect = gVarB;
        this.effect = C16563h.R(gVarB);
        C15809k.d(d0.a(this), null, null, new a(null), 3, null);
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
    public final AbstractC6392a F(String storeName) {
        return AbstractC6392a.INSTANCE.c(storeName);
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
            boolean r0 = r5 instanceof iq.C14839A.g
            if (r0 == 0) goto L13
            r0 = r5
            iq.A$g r0 = (iq.C14839A.g) r0
            int r1 = r0.f138948c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138948c = r1
            goto L18
        L13:
            iq.A$g r0 = new iq.A$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f138946a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f138948c
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
            pv.F r5 = r5.a()
            r0.f138948c = r3
            java.lang.Object r5 = pv.C16563h.A(r5, r0)
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
            Xp.c$f r3 = Xp.ShopAndScanItem.f.f42427c
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
        throw new UnsupportedOperationException("Method not decompiled: iq.C14839A.H(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void R(int count) {
        ShopAndScanCartViewState value;
        InterfaceC16549B<ShopAndScanCartViewState> interfaceC16549B = this._uiState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ShopAndScanCartViewState.b(value, null, null, null, false, false, false, false, false, false, false, false, false, null, null, 0, 0, count, 65535, null)));
    }

    private final void S(int index, int offset) {
        ShopAndScanCartViewState value;
        InterfaceC16549B<ShopAndScanCartViewState> interfaceC16549B = this._uiState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ShopAndScanCartViewState.b(value, null, null, null, false, false, false, false, false, false, false, false, false, null, null, index, offset, 0, 81919, null)));
    }

    private final void Z(boolean displayed) {
        ShopAndScanCartViewState value;
        InterfaceC16549B<ShopAndScanCartViewState> interfaceC16549B = this._uiState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ShopAndScanCartViewState.b(value, null, null, null, false, false, displayed, true, false, false, false, false, false, null, null, 0, 0, 0, 130975, null)));
    }

    public final InterfaceC16561f<b> G() {
        return this.effect;
    }

    public final Intent I(Context context) {
        Intrinsics.j(context, "context");
        return this.meijerIntent.C(context, true, this.featureManager.e(AbstractC18503f.O.f172854h));
    }

    public final P<ShopAndScanCartViewState> J() {
        return C16563h.c(this._uiState);
    }

    public final void L(AbstractC14842b event) {
        Intrinsics.j(event, "event");
        if (event instanceof AbstractC14842b.i) {
            P();
            return;
        }
        if (event instanceof AbstractC14842b.g) {
            N();
            return;
        }
        if (event instanceof AbstractC14842b.h) {
            O();
            return;
        }
        if (event instanceof AbstractC14842b.j) {
            Q();
            return;
        }
        if (event instanceof AbstractC14842b.n) {
            X();
            return;
        }
        if (event instanceof AbstractC14842b.a) {
            K();
            return;
        }
        if (event instanceof AbstractC14842b.UpdateItem) {
            AbstractC14842b.UpdateItem updateItem = (AbstractC14842b.UpdateItem) event;
            c0(updateItem.getId(), updateItem.getQuantity());
            return;
        }
        if (event instanceof AbstractC14842b.RemoveItem) {
            c0(((AbstractC14842b.RemoveItem) event).getItemId(), 0);
            return;
        }
        if (event instanceof AbstractC14842b.SyncItem) {
            Y(((AbstractC14842b.SyncItem) event).getId());
            return;
        }
        if (event instanceof AbstractC14842b.CouponAction) {
            AbstractC14842b.CouponAction couponAction = (AbstractC14842b.CouponAction) event;
            C(couponAction.getOfferID(), couponAction.getItemID());
            return;
        }
        if (event instanceof AbstractC14842b.FocusedQuantityStepper) {
            E(((AbstractC14842b.FocusedQuantityStepper) event).getId());
            return;
        }
        if (event instanceof AbstractC14842b.c) {
            W(false);
            return;
        }
        if (event instanceof AbstractC14842b.C2205b) {
            V(false);
            return;
        }
        if (event instanceof AbstractC14842b.SaveScrollPosition) {
            AbstractC14842b.SaveScrollPosition saveScrollPosition = (AbstractC14842b.SaveScrollPosition) event;
            S(saveScrollPosition.getIndex(), saveScrollPosition.getOffset());
        } else if (event instanceof AbstractC14842b.SavePreviousItemCount) {
            R(((AbstractC14842b.SavePreviousItemCount) event).getCount());
        } else if (event instanceof AbstractC14842b.DismissItemRestriction) {
            B(((AbstractC14842b.DismissItemRestriction) event).getId());
        } else {
            if (!Intrinsics.e(event, AbstractC14842b.p.f139026a)) {
                throw new NoWhenBranchMatchedException();
            }
            a0();
        }
    }

    private final void B(String id2) {
        C15809k.d(d0.a(this), null, null, new c(id2, null), 3, null);
    }

    private final void C(long offerID, String itemID) {
        C15809k.d(d0.a(this), null, null, new d(offerID, itemID, null), 3, null);
    }

    private final void E(String id2) {
        C15809k.d(d0.a(this), null, null, new f(id2, null), 3, null);
    }

    private final void K() {
        C15809k.d(d0.a(this), null, null, new h(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        C15809k.d(d0.a(this), null, null, new i(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        a0();
        Z(false);
        if (this._uiState.getValue().getIsGreenville()) {
            b0(true);
            this.navManager.b(C18213d.a.b.f170943b);
        } else {
            this.navManager.b(C18213d.a.c.f170944b);
        }
    }

    private final void O() {
        a0();
        this.navManager.b(C18213d.a.h.f170949b);
    }

    private final void P() {
        a0();
        this.navManager.b(C18213d.a.j.f170951b);
    }

    private final void Q() {
        a0();
        C15809k.d(d0.a(this), null, null, new j(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        C15809k.d(d0.a(this), null, null, new k(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U() {
        C15809k.d(d0.a(this), null, null, new l(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(boolean showDialog) {
        C15809k.d(d0.a(this), null, null, new m(showDialog, null), 3, null);
    }

    private final void W(boolean showDialog) {
        C15809k.d(d0.a(this), null, null, new n(showDialog, null), 3, null);
    }

    private final C0 X() {
        return C15809k.d(d0.a(this), null, null, new o(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0 Y(String itemId) {
        return C15809k.d(d0.a(this), null, null, new p(itemId, null), 3, null);
    }

    private final void a0() {
        C15809k.d(d0.a(this), null, null, new q(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0 b0(boolean isCheckoutInProgress) {
        return C15809k.d(d0.a(this), null, null, new r(isCheckoutInProgress, null), 3, null);
    }

    private final C0 c0(String localId, int quantity) {
        return C15809k.d(d0.a(this), null, null, new s(localId, quantity, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(ShopAndScanTrip trip) {
        C15809k.d(d0.a(this), null, null, new t(trip, null), 3, null);
    }
}
