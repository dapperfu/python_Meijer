package com.meijer.mobile.meijer.activity.cart;

import Ao.W;
import bk.AbstractC6392a;
import ev.C13889a;
import fj.CartChanges;
import fj.EntryChange;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ;2\u00020\u0001:\u0004'#\u001e B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\u0014\u001a\u00060\nj\u0002`&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020*038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020/078F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/S0;", "Landroidx/lifecycle/c0;", "Lil/m;", "cartRepository", "Lhi/a;", "analyticsEngine", "<init>", "(Lil/m;Lhi/a;)V", "Lfj/e;", "cartChanges", "", "fulfillmentMode", "", "u", "(Lfj/e;Ljava/lang/String;)V", "", "Lfj/j;", "entryChanges", "t", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cartId", "A", "(Ljava/lang/String;Lfj/e;Ljava/lang/String;)V", "C", "()V", "onCleared", "Lcom/meijer/mobile/meijer/activity/cart/S0$a;", "action", "y", "(Lcom/meijer/mobile/meijer/activity/cart/S0$a;)V", "a", "Lil/m;", "b", "Lhi/a;", "LJu/a;", "c", "LJu/a;", "disposables", "Lcom/meijer/mobile/core/model/common/ResourceId;", "d", "Ljava/lang/String;", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/cart/S0$d;", "e", "Lpv/B;", "_viewState", "Lpv/A;", "Lcom/meijer/mobile/meijer/activity/cart/S0$c;", "f", "Lpv/A;", "_events", "Lpv/P;", "x", "()Lpv/P;", "viewState", "Lpv/F;", "getEvents", "()Lpv/F;", "events", "g", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class S0 extends androidx.view.c0 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f102497h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String cartId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<c> _events;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/S0$a;", "", "<init>", "()V", "a", "b", "c", "Lcom/meijer/mobile/meijer/activity/cart/S0$a$a;", "Lcom/meijer/mobile/meijer/activity/cart/S0$a$b;", "Lcom/meijer/mobile/meijer/activity/cart/S0$a$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/S0$a$a;", "Lcom/meijer/mobile/meijer/activity/cart/S0$a;", "Lfj/e;", "cartChanges", "", "fulfillmentMode", "<init>", "(Lfj/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfj/e;", "()Lfj/e;", "b", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.cart.S0$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class CartChangesFromOrderOptions extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CartChanges cartChanges;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String fulfillmentMode;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CartChangesFromOrderOptions)) {
                    return false;
                }
                CartChangesFromOrderOptions cartChangesFromOrderOptions = (CartChangesFromOrderOptions) other;
                return Intrinsics.e(this.cartChanges, cartChangesFromOrderOptions.cartChanges) && Intrinsics.e(this.fulfillmentMode, cartChangesFromOrderOptions.fulfillmentMode);
            }

            public int hashCode() {
                CartChanges cartChanges = this.cartChanges;
                return ((cartChanges == null ? 0 : cartChanges.hashCode()) * 31) + this.fulfillmentMode.hashCode();
            }

            public String toString() {
                return "CartChangesFromOrderOptions(cartChanges=" + this.cartChanges + ", fulfillmentMode=" + this.fulfillmentMode + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CartChangesFromOrderOptions(CartChanges cartChanges, String fulfillmentMode) {
                super(null);
                Intrinsics.j(fulfillmentMode, "fulfillmentMode");
                this.cartChanges = cartChanges;
                this.fulfillmentMode = fulfillmentMode;
            }

            /* renamed from: a, reason: from getter */
            public final CartChanges getCartChanges() {
                return this.cartChanges;
            }

            /* renamed from: b, reason: from getter */
            public final String getFulfillmentMode() {
                return this.fulfillmentMode;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/S0$a$b;", "Lcom/meijer/mobile/meijer/activity/cart/S0$a;", "Lfj/e;", "cartChanges", "", "fulfillmentMode", "<init>", "(Lfj/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfj/e;", "()Lfj/e;", "b", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.cart.S0$a$b, reason: from toString */
        public static final /* data */ class GetCartId extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CartChanges cartChanges;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String fulfillmentMode;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetCartId)) {
                    return false;
                }
                GetCartId getCartId = (GetCartId) other;
                return Intrinsics.e(this.cartChanges, getCartId.cartChanges) && Intrinsics.e(this.fulfillmentMode, getCartId.fulfillmentMode);
            }

            public int hashCode() {
                CartChanges cartChanges = this.cartChanges;
                return ((cartChanges == null ? 0 : cartChanges.hashCode()) * 31) + this.fulfillmentMode.hashCode();
            }

            public String toString() {
                return "GetCartId(cartChanges=" + this.cartChanges + ", fulfillmentMode=" + this.fulfillmentMode + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GetCartId(CartChanges cartChanges, String fulfillmentMode) {
                super(null);
                Intrinsics.j(fulfillmentMode, "fulfillmentMode");
                this.cartChanges = cartChanges;
                this.fulfillmentMode = fulfillmentMode;
            }

            /* renamed from: a, reason: from getter */
            public final CartChanges getCartChanges() {
                return this.cartChanges;
            }

            /* renamed from: b, reason: from getter */
            public final String getFulfillmentMode() {
                return this.fulfillmentMode;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/S0$a$c;", "Lcom/meijer/mobile/meijer/activity/cart/S0$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f102508a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1959802447;
            }

            public String toString() {
                return "TrackAcceptFulfillmentChange";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/S0$c;", "", "<init>", "()V", "a", "Lcom/meijer/mobile/meijer/activity/cart/S0$c$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/S0$c$a;", "Lcom/meijer/mobile/meijer/activity/cart/S0$c;", "", "initialLoadMsg", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.cart.S0$c$a, reason: from toString */
        public static final /* data */ class InitialLoad extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int initialLoadMsg;

            public InitialLoad(int i10) {
                super(null);
                this.initialLoadMsg = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InitialLoad) && this.initialLoadMsg == ((InitialLoad) other).initialLoadMsg;
            }

            public int hashCode() {
                return Integer.hashCode(this.initialLoadMsg);
            }

            public String toString() {
                return "InitialLoad(initialLoadMsg=" + this.initialLoadMsg + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getInitialLoadMsg() {
                return this.initialLoadMsg;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0004\b\f\u0010\rJR\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\b\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b \u0010\u001b¨\u0006%"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/S0$d;", "", "", "Lfj/j;", "entryChanges", "Lbk/a;", "itemRemovalMessage", "", "isLoading", "loadingMessage", "Lcom/meijer/mobile/meijer/activity/cart/N0;", "changeFulfillmentDecorators", "<init>", "(Ljava/util/List;Lbk/a;ZLbk/a;Ljava/util/List;)V", "a", "(Ljava/util/List;Lbk/a;ZLbk/a;Ljava/util/List;)Lcom/meijer/mobile/meijer/activity/cart/S0$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEntryChanges", "()Ljava/util/List;", "b", "Lbk/a;", "d", "()Lbk/a;", "c", "Z", "()Z", "getLoadingMessage", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.S0$d, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<EntryChange> entryChanges;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a itemRemovalMessage;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a loadingMessage;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ChangeFulfillmentPreviewDecorator> changeFulfillmentDecorators;

        public ViewState() {
            this(null, null, false, null, null, 31, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.entryChanges, viewState.entryChanges) && Intrinsics.e(this.itemRemovalMessage, viewState.itemRemovalMessage) && this.isLoading == viewState.isLoading && Intrinsics.e(this.loadingMessage, viewState.loadingMessage) && Intrinsics.e(this.changeFulfillmentDecorators, viewState.changeFulfillmentDecorators);
        }

        public int hashCode() {
            int iHashCode = this.entryChanges.hashCode() * 31;
            AbstractC6392a abstractC6392a = this.itemRemovalMessage;
            int iHashCode2 = (((iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31;
            AbstractC6392a abstractC6392a2 = this.loadingMessage;
            return ((iHashCode2 + (abstractC6392a2 != null ? abstractC6392a2.hashCode() : 0)) * 31) + this.changeFulfillmentDecorators.hashCode();
        }

        public String toString() {
            return "ViewState(entryChanges=" + this.entryChanges + ", itemRemovalMessage=" + this.itemRemovalMessage + ", isLoading=" + this.isLoading + ", loadingMessage=" + this.loadingMessage + ", changeFulfillmentDecorators=" + this.changeFulfillmentDecorators + ')';
        }

        public ViewState(List<EntryChange> entryChanges, AbstractC6392a abstractC6392a, boolean z10, AbstractC6392a abstractC6392a2, List<ChangeFulfillmentPreviewDecorator> changeFulfillmentDecorators) {
            Intrinsics.j(entryChanges, "entryChanges");
            Intrinsics.j(changeFulfillmentDecorators, "changeFulfillmentDecorators");
            this.entryChanges = entryChanges;
            this.itemRemovalMessage = abstractC6392a;
            this.isLoading = z10;
            this.loadingMessage = abstractC6392a2;
            this.changeFulfillmentDecorators = changeFulfillmentDecorators;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, List list, AbstractC6392a abstractC6392a, boolean z10, AbstractC6392a abstractC6392a2, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = viewState.entryChanges;
            }
            if ((i10 & 2) != 0) {
                abstractC6392a = viewState.itemRemovalMessage;
            }
            if ((i10 & 4) != 0) {
                z10 = viewState.isLoading;
            }
            if ((i10 & 8) != 0) {
                abstractC6392a2 = viewState.loadingMessage;
            }
            if ((i10 & 16) != 0) {
                list2 = viewState.changeFulfillmentDecorators;
            }
            List list3 = list2;
            boolean z11 = z10;
            return viewState.a(list, abstractC6392a, z11, abstractC6392a2, list3);
        }

        public final ViewState a(List<EntryChange> entryChanges, AbstractC6392a itemRemovalMessage, boolean isLoading, AbstractC6392a loadingMessage, List<ChangeFulfillmentPreviewDecorator> changeFulfillmentDecorators) {
            Intrinsics.j(entryChanges, "entryChanges");
            Intrinsics.j(changeFulfillmentDecorators, "changeFulfillmentDecorators");
            return new ViewState(entryChanges, itemRemovalMessage, isLoading, loadingMessage, changeFulfillmentDecorators);
        }

        public final List<ChangeFulfillmentPreviewDecorator> c() {
            return this.changeFulfillmentDecorators;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC6392a getItemRemovalMessage() {
            return this.itemRemovalMessage;
        }

        public /* synthetic */ ViewState(List list, AbstractC6392a abstractC6392a, boolean z10, AbstractC6392a abstractC6392a2, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? null : abstractC6392a, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : abstractC6392a2, (i10 & 16) != 0 ? CollectionsKt.m() : list2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.ChangeFulfillmentPreviewViewModel$fetchCartId$1$1", f = "ChangeFulfillmentPreviewViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f102515a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CartChanges f102517c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f102518d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return S0.this.new e(this.f102517c, this.f102518d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CartChanges cartChanges, String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f102517c = cartChanges;
            this.f102518d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f102515a == 0) {
                ResultKt.b(obj);
                S0 s02 = S0.this;
                s02.A(s02.cartId, this.f102517c, this.f102518d);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.ChangeFulfillmentPreviewViewModel$onAction$1", f = "ChangeFulfillmentPreviewViewModel.kt", l = {94}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f102519a;

        /* renamed from: b, reason: collision with root package name */
        int f102520b;

        /* renamed from: c, reason: collision with root package name */
        int f102521c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f102522d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S0 f102523e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a aVar, S0 s02, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f102522d = aVar;
            this.f102523e = s02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f102522d, this.f102523e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<EntryChange> listC;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f102521c;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                CartChanges cartChanges = ((a.CartChangesFromOrderOptions) this.f102522d).getCartChanges();
                if (cartChanges != null && (listC = cartChanges.c()) != null) {
                    S0 s02 = this.f102523e;
                    String fulfillmentMode = ((a.CartChangesFromOrderOptions) this.f102522d).getFulfillmentMode();
                    this.f102519a = listC;
                    this.f102520b = 0;
                    this.f102521c = 1;
                    if (s02.t(listC, fulfillmentMode, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.cart.ChangeFulfillmentPreviewViewModel$onAction$2", f = "ChangeFulfillmentPreviewViewModel.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f102524a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f102526c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(a aVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f102526c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return S0.this.new g(this.f102526c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f102524a == 0) {
                ResultKt.b(obj);
                S0.this.u(((a.GetCartId) this.f102526c).getCartChanges(), ((a.GetCartId) this.f102526c).getFulfillmentMode());
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public S0(il.m cartRepository, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.cartRepository = cartRepository;
        this.analyticsEngine = analyticsEngine;
        this.disposables = new Ju.a();
        this.cartId = "-1";
        this._viewState = pv.S.a(new ViewState(null, null, false, null, null, 31, null));
        this._events = C16555H.b(0, 0, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(final String cartId, final CartChanges cartChanges, final String fulfillmentMode) {
        this.analyticsEngine.b(C14756c.h("Items Not Available"), new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.R0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return S0.B(cartChanges, cartId, fulfillmentMode, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(CartChanges cartChanges, String str, String str2, TrackingData track) {
        List<EntryChange> listC;
        Intrinsics.j(track, "$this$track");
        track.v("fulfillment");
        W.Details.Companion companion = W.Details.INSTANCE;
        Integer numValueOf = null;
        List<EntryChange> listC2 = cartChanges != null ? cartChanges.c() : null;
        if (listC2 == null) {
            listC2 = CollectionsKt.m();
        }
        track.e(Ao.W.j(companion.c(listC2, "")));
        track.h("cartID", str);
        if (cartChanges != null && (listC = cartChanges.c()) != null) {
            numValueOf = Integer.valueOf(listC.size());
        }
        track.h("Cart Items Count", String.valueOf(numValueOf));
        track.h("fulfillmentType", str2);
        return Unit.f143329a;
    }

    private final void C() {
        this.analyticsEngine.h(C14756c.a("fulfillment method change: Items Not Available"), C14756c.b("itemsNotAvailableContinue", "yes"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(List<EntryChange> list, String str, Continuation<? super Unit> continuation) {
        AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Intrinsics.e(str, "pickup") ? com.meijer.mobile.meijer.Y.f100545M0 : Intrinsics.e(str, "delivery") ? com.meijer.mobile.meijer.Y.f100431G0 : com.meijer.mobile.meijer.Y.f100602P0, new Object[0]);
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            List<EntryChange> list2 = list;
            if (interfaceC16549B.e(value, ViewState.b(value, list2, AbstractC6392a.INSTANCE.b(com.meijer.mobile.meijer.X.f100301d, list.size(), abstractC6392aD), false, null, ChangeFulfillmentPreviewDecorator.INSTANCE.b(list), 12, null))) {
                break;
            }
            list = list2;
        }
        Object objEmit = this._events.emit(new c.InitialLoad(com.meijer.mobile.meijer.Y.f100469I0), continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(final CartChanges cartChanges, final String fulfillmentMode) {
        io.reactivex.l<String> lVarSubscribeOn = this.cartRepository.N().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.P0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return S0.v(this.f102487a, cartChanges, fulfillmentMode, (String) obj);
            }
        };
        Dk.a.a(lVarSubscribeOn.subscribe(new Lu.g() { // from class: com.meijer.mobile.meijer.activity.cart.Q0
            @Override // Lu.g
            public final void accept(Object obj) {
                S0.w(function1, obj);
            }
        }), this.disposables);
    }

    public final InterfaceC16553F<c> getEvents() {
        return C16563h.b(this._events);
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    public final pv.P<ViewState> x() {
        return C16563h.c(this._viewState);
    }

    public final void y(a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.CartChangesFromOrderOptions) {
            C15809k.d(androidx.view.d0.a(this), null, null, new f(action, this, null), 3, null);
            return;
        }
        if (action instanceof a.GetCartId) {
            C15809k.d(androidx.view.d0.a(this), null, null, new g(action, null), 3, null);
        } else {
            if (!(action instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            C();
            Unit unit = Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(S0 s02, CartChanges cartChanges, String str, String str2) {
        Intrinsics.g(str2);
        s02.cartId = str2;
        C15809k.d(androidx.view.d0.a(s02), null, null, s02.new e(cartChanges, str, null), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
