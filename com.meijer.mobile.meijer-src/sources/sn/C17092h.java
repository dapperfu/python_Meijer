package sn;

import Hk.UIEvent;
import Hl.FlyBuyOrderDetail;
import Rn.FlyBuyState;
import bk.AbstractC6392a;
import bk.C6393b;
import com.meijer.mobile.fulfillment.flybuy.api.models.PickUpOrderUpdate;
import ev.C13889a;
import gj.PickupPerson;
import hi.InterfaceC14523a;
import hj.OrderDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jn.AbstractC15054a;
import jn.AbstractC15055b;
import kn.C15297b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pv.InterfaceC16549B;
import qw.a;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u00033-/B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0017J\u000f\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0017J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0014¢\u0006\u0004\b(\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u0002020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lsn/h;", "Landroidx/lifecycle/c0;", "Lkn/b;", "navigationCommandManager", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "LRn/I;", "flyBuyManager", "Lhi/a;", "analyticsEngine", "<init>", "(Lkn/b;Lcom/meijer/mobile/digitalshopping/api/orders/a;LRn/I;Lhi/a;)V", "LRn/K;", "flyBuyState", "", "y", "(LRn/K;)V", "", "parkingSpot", "pickupName", "G", "(Ljava/lang/String;Ljava/lang/String;)V", "F", "()V", "", "Ljn/b;", "newVehicleDescriptionList", "I", "(Ljava/util/List;)V", "Ljn/a;", "newVehicleColorList", "H", "C", "D", "B", "A", "Lsn/h$c;", "action", "x", "(Lsn/h$c;)V", "onCleared", "a", "Lkn/b;", "b", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "c", "LRn/I;", "d", "Lhi/a;", "Lpv/B;", "Lsn/h$e;", "e", "Lpv/B;", "_viewState", "LJu/a;", "f", "LJu/a;", "compositeDisposable", "Lpv/P;", "w", "()Lpv/P;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: sn.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C17092h extends androidx.view.c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15297b navigationCommandManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Rn.I flyBuyManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Ju.a compositeDisposable;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sn.h$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<FlyBuyState, Unit> {
        a(Object obj) {
            super(1, obj, C17092h.class, "onNewFlyBuyState", "onNewFlyBuyState(Lcom/meijer/mobile/meijer/managers/FlyBuyState;)V", 0);
        }

        public final void a(FlyBuyState p02) {
            Intrinsics.j(p02, "p0");
            ((C17092h) this.receiver).y(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FlyBuyState flyBuyState) {
            a(flyBuyState);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sn.h$b */
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        b(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lsn/h$c;", "", "<init>", "()V", "h", "g", "f", "e", "c", "d", "a", "b", "Lsn/h$c$a;", "Lsn/h$c$b;", "Lsn/h$c$c;", "Lsn/h$c$d;", "Lsn/h$c$e;", "Lsn/h$c$f;", "Lsn/h$c$g;", "Lsn/h$c$h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sn.h$c */
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/h$c$a;", "Lsn/h$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.h$c$a */
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f161274a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "ProcessCustomerPickup";
            }

            public int hashCode() {
                return 379247844;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/h$c$b;", "Lsn/h$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.h$c$b */
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f161275a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "RouteToConfirmation";
            }

            public int hashCode() {
                return -1640723372;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"Lsn/h$c$c;", "Lsn/h$c;", "", "isUpdatedName", "", "placeHolder", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.h$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class SetIsUpdatedName extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isUpdatedName;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String placeHolder;

            public SetIsUpdatedName(boolean z10, String str) {
                super(null);
                this.isUpdatedName = z10;
                this.placeHolder = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetIsUpdatedName)) {
                    return false;
                }
                SetIsUpdatedName setIsUpdatedName = (SetIsUpdatedName) other;
                return this.isUpdatedName == setIsUpdatedName.isUpdatedName && Intrinsics.e(this.placeHolder, setIsUpdatedName.placeHolder);
            }

            /* renamed from: a, reason: from getter */
            public final String getPlaceHolder() {
                return this.placeHolder;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsUpdatedName() {
                return this.isUpdatedName;
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.isUpdatedName) * 31;
                String str = this.placeHolder;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "SetIsUpdatedName(isUpdatedName=" + this.isUpdatedName + ", placeHolder=" + this.placeHolder + ')';
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006 "}, d2 = {"Lsn/h$c$d;", "Lsn/h$c;", "", "isUpdatedParkingSpot", "", "placeHolder", "Ljn/a;", "initialVehicleColor", "Ljn/b;", "initialVehicleType", "<init>", "(ZLjava/lang/String;Ljn/a;Ljn/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Ljava/lang/String;", "c", "Ljn/a;", "()Ljn/a;", "Ljn/b;", "()Ljn/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.h$c$d, reason: from toString */
        public static final /* data */ class SetIsUpdatedParkingSpot extends c {

            /* renamed from: e, reason: collision with root package name */
            public static final int f161278e = AbstractC6392a.f60445b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isUpdatedParkingSpot;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String placeHolder;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC15054a initialVehicleColor;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC15055b initialVehicleType;

            public SetIsUpdatedParkingSpot(boolean z10, String str, AbstractC15054a abstractC15054a, AbstractC15055b abstractC15055b) {
                super(null);
                this.isUpdatedParkingSpot = z10;
                this.placeHolder = str;
                this.initialVehicleColor = abstractC15054a;
                this.initialVehicleType = abstractC15055b;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetIsUpdatedParkingSpot)) {
                    return false;
                }
                SetIsUpdatedParkingSpot setIsUpdatedParkingSpot = (SetIsUpdatedParkingSpot) other;
                return this.isUpdatedParkingSpot == setIsUpdatedParkingSpot.isUpdatedParkingSpot && Intrinsics.e(this.placeHolder, setIsUpdatedParkingSpot.placeHolder) && Intrinsics.e(this.initialVehicleColor, setIsUpdatedParkingSpot.initialVehicleColor) && Intrinsics.e(this.initialVehicleType, setIsUpdatedParkingSpot.initialVehicleType);
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC15054a getInitialVehicleColor() {
                return this.initialVehicleColor;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC15055b getInitialVehicleType() {
                return this.initialVehicleType;
            }

            /* renamed from: c, reason: from getter */
            public final String getPlaceHolder() {
                return this.placeHolder;
            }

            /* renamed from: d, reason: from getter */
            public final boolean getIsUpdatedParkingSpot() {
                return this.isUpdatedParkingSpot;
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.isUpdatedParkingSpot) * 31;
                String str = this.placeHolder;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                AbstractC15054a abstractC15054a = this.initialVehicleColor;
                int iHashCode3 = (iHashCode2 + (abstractC15054a == null ? 0 : abstractC15054a.hashCode())) * 31;
                AbstractC15055b abstractC15055b = this.initialVehicleType;
                return iHashCode3 + (abstractC15055b != null ? abstractC15055b.hashCode() : 0);
            }

            public String toString() {
                return "SetIsUpdatedParkingSpot(isUpdatedParkingSpot=" + this.isUpdatedParkingSpot + ", placeHolder=" + this.placeHolder + ", initialVehicleColor=" + this.initialVehicleColor + ", initialVehicleType=" + this.initialVehicleType + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsn/h$c$e;", "Lsn/h$c;", "", "parkingSpot", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.h$c$e, reason: from toString */
        public static final /* data */ class UpdateParkingSpot extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String parkingSpot;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateParkingSpot) && Intrinsics.e(this.parkingSpot, ((UpdateParkingSpot) other).parkingSpot);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateParkingSpot(String parkingSpot) {
                super(null);
                Intrinsics.j(parkingSpot, "parkingSpot");
                this.parkingSpot = parkingSpot;
            }

            /* renamed from: a, reason: from getter */
            public final String getParkingSpot() {
                return this.parkingSpot;
            }

            public int hashCode() {
                return this.parkingSpot.hashCode();
            }

            public String toString() {
                return "UpdateParkingSpot(parkingSpot=" + this.parkingSpot + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsn/h$c$f;", "Lsn/h$c;", "", "pickupName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.h$c$f, reason: from toString */
        public static final /* data */ class UpdatePickupUsername extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String pickupName;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdatePickupUsername) && Intrinsics.e(this.pickupName, ((UpdatePickupUsername) other).pickupName);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdatePickupUsername(String pickupName) {
                super(null);
                Intrinsics.j(pickupName, "pickupName");
                this.pickupName = pickupName;
            }

            /* renamed from: a, reason: from getter */
            public final String getPickupName() {
                return this.pickupName;
            }

            public int hashCode() {
                return this.pickupName.hashCode();
            }

            public String toString() {
                return "UpdatePickupUsername(pickupName=" + this.pickupName + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsn/h$c$g;", "Lsn/h$c;", "Ljn/a;", "vehicleColor", "<init>", "(Ljn/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljn/a;", "()Ljn/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.h$c$g, reason: from toString */
        public static final /* data */ class UpdateVehicleColorPicker extends c {

            /* renamed from: b, reason: collision with root package name */
            public static final int f161285b = AbstractC6392a.f60445b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC15054a vehicleColor;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateVehicleColorPicker) && Intrinsics.e(this.vehicleColor, ((UpdateVehicleColorPicker) other).vehicleColor);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateVehicleColorPicker(AbstractC15054a vehicleColor) {
                super(null);
                Intrinsics.j(vehicleColor, "vehicleColor");
                this.vehicleColor = vehicleColor;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC15054a getVehicleColor() {
                return this.vehicleColor;
            }

            public int hashCode() {
                return this.vehicleColor.hashCode();
            }

            public String toString() {
                return "UpdateVehicleColorPicker(vehicleColor=" + this.vehicleColor + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsn/h$c$h;", "Lsn/h$c;", "Ljn/b;", "vehicleDescription", "<init>", "(Ljn/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljn/b;", "()Ljn/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.h$c$h, reason: collision with other inner class name and from toString */
        public static final /* data */ class UpdateVehicleDescriptionPicker extends c {

            /* renamed from: b, reason: collision with root package name */
            public static final int f161287b = AbstractC6392a.f60445b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC15055b vehicleDescription;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateVehicleDescriptionPicker) && Intrinsics.e(this.vehicleDescription, ((UpdateVehicleDescriptionPicker) other).vehicleDescription);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateVehicleDescriptionPicker(AbstractC15055b vehicleDescription) {
                super(null);
                Intrinsics.j(vehicleDescription, "vehicleDescription");
                this.vehicleDescription = vehicleDescription;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC15055b getVehicleDescription() {
                return this.vehicleDescription;
            }

            public int hashCode() {
                return this.vehicleDescription.hashCode();
            }

            public String toString() {
                return "UpdateVehicleDescriptionPicker(vehicleDescription=" + this.vehicleDescription + ')';
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lsn/h$d;", "", "<init>", "()V", "b", "a", "d", "c", "Lsn/h$d$a;", "Lsn/h$d$b;", "Lsn/h$d$c;", "Lsn/h$d$d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sn.h$d */
    public static abstract class d {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lsn/h$d$a;", "Lsn/h$d;", "", "title", "message", "positiveBtnTxt", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.h$d$a, reason: from toString */
        public static final /* data */ class FailEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int positiveBtnTxt;

            public FailEvent(int i10, int i11, int i12) {
                super(null);
                this.title = i10;
                this.message = i11;
                this.positiveBtnTxt = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FailEvent)) {
                    return false;
                }
                FailEvent failEvent = (FailEvent) other;
                return this.title == failEvent.title && this.message == failEvent.message && this.positiveBtnTxt == failEvent.positiveBtnTxt;
            }

            /* renamed from: a, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final int getPositiveBtnTxt() {
                return this.positiveBtnTxt;
            }

            /* renamed from: c, reason: from getter */
            public final int getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.positiveBtnTxt);
            }

            public String toString() {
                return "FailEvent(title=" + this.title + ", message=" + this.message + ", positiveBtnTxt=" + this.positiveBtnTxt + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/h$d$b;", "Lsn/h$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.h$d$b */
        public static final /* data */ class b extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final b f161292a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "LoadingEvent";
            }

            public int hashCode() {
                return -604901013;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/h$d$c;", "Lsn/h$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.h$d$c */
        public static final /* data */ class c extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final c f161293a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "NavigateToConfirmScreen";
            }

            public int hashCode() {
                return 193027603;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lsn/h$d$d;", "Lsn/h$d;", "", "dialogTitle", "dialogMessage", "dialogPositiveBtnTxt", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.h$d$d, reason: collision with other inner class name and from toString */
        public static final /* data */ class ShowNeedParkingSpotDialogEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int dialogTitle;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int dialogMessage;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int dialogPositiveBtnTxt;

            public ShowNeedParkingSpotDialogEvent(int i10, int i11, int i12) {
                super(null);
                this.dialogTitle = i10;
                this.dialogMessage = i11;
                this.dialogPositiveBtnTxt = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowNeedParkingSpotDialogEvent)) {
                    return false;
                }
                ShowNeedParkingSpotDialogEvent showNeedParkingSpotDialogEvent = (ShowNeedParkingSpotDialogEvent) other;
                return this.dialogTitle == showNeedParkingSpotDialogEvent.dialogTitle && this.dialogMessage == showNeedParkingSpotDialogEvent.dialogMessage && this.dialogPositiveBtnTxt == showNeedParkingSpotDialogEvent.dialogPositiveBtnTxt;
            }

            /* renamed from: a, reason: from getter */
            public final int getDialogMessage() {
                return this.dialogMessage;
            }

            /* renamed from: b, reason: from getter */
            public final int getDialogPositiveBtnTxt() {
                return this.dialogPositiveBtnTxt;
            }

            /* renamed from: c, reason: from getter */
            public final int getDialogTitle() {
                return this.dialogTitle;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.dialogTitle) * 31) + Integer.hashCode(this.dialogMessage)) * 31) + Integer.hashCode(this.dialogPositiveBtnTxt);
            }

            public String toString() {
                return "ShowNeedParkingSpotDialogEvent(dialogTitle=" + this.dialogTitle + ", dialogMessage=" + this.dialogMessage + ", dialogPositiveBtnTxt=" + this.dialogPositiveBtnTxt + ')';
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u009a\u0001\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b'\u00104\u001a\u0004\b2\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b5\u0010(R\u0017\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b6\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b,\u00108¨\u00069"}, d2 = {"Lsn/h$e;", "", "LHk/a;", "Lsn/h$d;", "checkInUIEvents", "", "progressIsVisible", "", "Ljn/b;", "vehicleDescriptionList", "Ljn/a;", "vehicleColorList", "Lbk/a;", "selectedVehicleDescription", "selectedVehicleColor", "", "pickupName", "parkingSpot", "isUpdatedName", "isUpdatedParkingSpot", "LRn/K;", "flyBuyState", "<init>", "(LHk/a;ZLjava/util/List;Ljava/util/List;Lbk/a;Lbk/a;Ljava/lang/String;Ljava/lang/String;ZZLRn/K;)V", "a", "(LHk/a;ZLjava/util/List;Ljava/util/List;Lbk/a;Lbk/a;Ljava/lang/String;Ljava/lang/String;ZZLRn/K;)Lsn/h$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LHk/a;", "c", "()LHk/a;", "b", "Z", "g", "()Z", "Ljava/util/List;", "k", "()Ljava/util/List;", "d", "j", "e", "Lbk/a;", "i", "()Lbk/a;", "f", "h", "Ljava/lang/String;", "l", "m", "LRn/K;", "()LRn/K;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sn.h$e, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final UIEvent<d> checkInUIEvents;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean progressIsVisible;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AbstractC15055b> vehicleDescriptionList;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AbstractC15054a> vehicleColorList;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a selectedVehicleDescription;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a selectedVehicleColor;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pickupName;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String parkingSpot;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isUpdatedName;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isUpdatedParkingSpot;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final FlyBuyState flyBuyState;

        public ViewState() {
            this(null, false, null, null, null, null, null, null, false, false, null, 2047, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.checkInUIEvents, viewState.checkInUIEvents) && this.progressIsVisible == viewState.progressIsVisible && Intrinsics.e(this.vehicleDescriptionList, viewState.vehicleDescriptionList) && Intrinsics.e(this.vehicleColorList, viewState.vehicleColorList) && Intrinsics.e(this.selectedVehicleDescription, viewState.selectedVehicleDescription) && Intrinsics.e(this.selectedVehicleColor, viewState.selectedVehicleColor) && Intrinsics.e(this.pickupName, viewState.pickupName) && Intrinsics.e(this.parkingSpot, viewState.parkingSpot) && this.isUpdatedName == viewState.isUpdatedName && this.isUpdatedParkingSpot == viewState.isUpdatedParkingSpot && Intrinsics.e(this.flyBuyState, viewState.flyBuyState);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState(UIEvent<d> checkInUIEvents, boolean z10, List<? extends AbstractC15055b> vehicleDescriptionList, List<? extends AbstractC15054a> vehicleColorList, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, String str, String str2, boolean z11, boolean z12, FlyBuyState flyBuyState) {
            Intrinsics.j(checkInUIEvents, "checkInUIEvents");
            Intrinsics.j(vehicleDescriptionList, "vehicleDescriptionList");
            Intrinsics.j(vehicleColorList, "vehicleColorList");
            this.checkInUIEvents = checkInUIEvents;
            this.progressIsVisible = z10;
            this.vehicleDescriptionList = vehicleDescriptionList;
            this.vehicleColorList = vehicleColorList;
            this.selectedVehicleDescription = abstractC6392a;
            this.selectedVehicleColor = abstractC6392a2;
            this.pickupName = str;
            this.parkingSpot = str2;
            this.isUpdatedName = z11;
            this.isUpdatedParkingSpot = z12;
            this.flyBuyState = flyBuyState;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, UIEvent uIEvent, boolean z10, List list, List list2, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, String str, String str2, boolean z11, boolean z12, FlyBuyState flyBuyState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                uIEvent = viewState.checkInUIEvents;
            }
            if ((i10 & 2) != 0) {
                z10 = viewState.progressIsVisible;
            }
            if ((i10 & 4) != 0) {
                list = viewState.vehicleDescriptionList;
            }
            if ((i10 & 8) != 0) {
                list2 = viewState.vehicleColorList;
            }
            if ((i10 & 16) != 0) {
                abstractC6392a = viewState.selectedVehicleDescription;
            }
            if ((i10 & 32) != 0) {
                abstractC6392a2 = viewState.selectedVehicleColor;
            }
            if ((i10 & 64) != 0) {
                str = viewState.pickupName;
            }
            if ((i10 & 128) != 0) {
                str2 = viewState.parkingSpot;
            }
            if ((i10 & 256) != 0) {
                z11 = viewState.isUpdatedName;
            }
            if ((i10 & 512) != 0) {
                z12 = viewState.isUpdatedParkingSpot;
            }
            if ((i10 & 1024) != 0) {
                flyBuyState = viewState.flyBuyState;
            }
            boolean z13 = z12;
            FlyBuyState flyBuyState2 = flyBuyState;
            String str3 = str2;
            boolean z14 = z11;
            AbstractC6392a abstractC6392a3 = abstractC6392a2;
            String str4 = str;
            AbstractC6392a abstractC6392a4 = abstractC6392a;
            List list3 = list;
            return viewState.a(uIEvent, z10, list3, list2, abstractC6392a4, abstractC6392a3, str4, str3, z14, z13, flyBuyState2);
        }

        public final ViewState a(UIEvent<d> checkInUIEvents, boolean progressIsVisible, List<? extends AbstractC15055b> vehicleDescriptionList, List<? extends AbstractC15054a> vehicleColorList, AbstractC6392a selectedVehicleDescription, AbstractC6392a selectedVehicleColor, String pickupName, String parkingSpot, boolean isUpdatedName, boolean isUpdatedParkingSpot, FlyBuyState flyBuyState) {
            Intrinsics.j(checkInUIEvents, "checkInUIEvents");
            Intrinsics.j(vehicleDescriptionList, "vehicleDescriptionList");
            Intrinsics.j(vehicleColorList, "vehicleColorList");
            return new ViewState(checkInUIEvents, progressIsVisible, vehicleDescriptionList, vehicleColorList, selectedVehicleDescription, selectedVehicleColor, pickupName, parkingSpot, isUpdatedName, isUpdatedParkingSpot, flyBuyState);
        }

        public final UIEvent<d> c() {
            return this.checkInUIEvents;
        }

        /* renamed from: d, reason: from getter */
        public final FlyBuyState getFlyBuyState() {
            return this.flyBuyState;
        }

        /* renamed from: e, reason: from getter */
        public final String getParkingSpot() {
            return this.parkingSpot;
        }

        /* renamed from: f, reason: from getter */
        public final String getPickupName() {
            return this.pickupName;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getProgressIsVisible() {
            return this.progressIsVisible;
        }

        /* renamed from: h, reason: from getter */
        public final AbstractC6392a getSelectedVehicleColor() {
            return this.selectedVehicleColor;
        }

        public int hashCode() {
            int iHashCode = ((((((this.checkInUIEvents.hashCode() * 31) + Boolean.hashCode(this.progressIsVisible)) * 31) + this.vehicleDescriptionList.hashCode()) * 31) + this.vehicleColorList.hashCode()) * 31;
            AbstractC6392a abstractC6392a = this.selectedVehicleDescription;
            int iHashCode2 = (iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
            AbstractC6392a abstractC6392a2 = this.selectedVehicleColor;
            int iHashCode3 = (iHashCode2 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
            String str = this.pickupName;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.parkingSpot;
            int iHashCode5 = (((((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isUpdatedName)) * 31) + Boolean.hashCode(this.isUpdatedParkingSpot)) * 31;
            FlyBuyState flyBuyState = this.flyBuyState;
            return iHashCode5 + (flyBuyState != null ? flyBuyState.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final AbstractC6392a getSelectedVehicleDescription() {
            return this.selectedVehicleDescription;
        }

        public final List<AbstractC15054a> j() {
            return this.vehicleColorList;
        }

        public final List<AbstractC15055b> k() {
            return this.vehicleDescriptionList;
        }

        /* renamed from: l, reason: from getter */
        public final boolean getIsUpdatedName() {
            return this.isUpdatedName;
        }

        /* renamed from: m, reason: from getter */
        public final boolean getIsUpdatedParkingSpot() {
            return this.isUpdatedParkingSpot;
        }

        public String toString() {
            return "ViewState(checkInUIEvents=" + this.checkInUIEvents + ", progressIsVisible=" + this.progressIsVisible + ", vehicleDescriptionList=" + this.vehicleDescriptionList + ", vehicleColorList=" + this.vehicleColorList + ", selectedVehicleDescription=" + this.selectedVehicleDescription + ", selectedVehicleColor=" + this.selectedVehicleColor + ", pickupName=" + this.pickupName + ", parkingSpot=" + this.parkingSpot + ", isUpdatedName=" + this.isUpdatedName + ", isUpdatedParkingSpot=" + this.isUpdatedParkingSpot + ", flyBuyState=" + this.flyBuyState + ')';
        }

        public /* synthetic */ ViewState(UIEvent uIEvent, boolean z10, List list, List list2, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, String str, String str2, boolean z11, boolean z12, FlyBuyState flyBuyState, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new UIEvent(null, 1, null) : uIEvent, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? AbstractC15055b.INSTANCE.a() : list, (i10 & 8) != 0 ? AbstractC15054a.INSTANCE.a() : list2, (i10 & 16) != 0 ? null : abstractC6392a, (i10 & 32) != 0 ? null : abstractC6392a2, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? null : str2, (i10 & 256) != 0 ? false : z11, (i10 & 512) == 0 ? z12 : false, (i10 & 1024) != 0 ? null : flyBuyState);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.FlyBuyCheckInViewModel$updateCustomerParkInfo$1$2$1", f = "FlyBuyCheckInViewModel.kt", l = {226}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: sn.h$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f161308a;

        /* renamed from: b, reason: collision with root package name */
        Object f161309b;

        /* renamed from: c, reason: collision with root package name */
        Object f161310c;

        /* renamed from: d, reason: collision with root package name */
        Object f161311d;

        /* renamed from: e, reason: collision with root package name */
        int f161312e;

        /* renamed from: f, reason: collision with root package name */
        int f161313f;

        /* renamed from: g, reason: collision with root package name */
        int f161314g;

        /* renamed from: h, reason: collision with root package name */
        int f161315h;

        /* renamed from: i, reason: collision with root package name */
        int f161316i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f161317j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f161319l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f161320m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f161319l = i10;
            this.f161320m = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = C17092h.this.new f(this.f161319l, this.f161320m, continuation);
            fVar.f161317j = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f161316i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f161317j;
                    C17092h c17092h = C17092h.this;
                    int i11 = this.f161319l;
                    String str = this.f161320m;
                    Result.Companion companion = Result.INSTANCE;
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = c17092h.ordersRepository;
                    String strValueOf = String.valueOf(i11);
                    String pickupName = ((ViewState) c17092h._viewState.getValue()).getPickupName();
                    if (pickupName == null) {
                        pickupName = "";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Spot #");
                    String parkingSpot = ((ViewState) c17092h._viewState.getValue()).getParkingSpot();
                    if (parkingSpot == null) {
                        parkingSpot = "";
                    }
                    sb2.append(parkingSpot);
                    sb2.append(" - ");
                    sb2.append(str);
                    String string = sb2.toString();
                    if (str == null || str.length() <= 0) {
                        string = null;
                    }
                    if (string == null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Spot #");
                        String parkingSpot2 = ((ViewState) c17092h._viewState.getValue()).getParkingSpot();
                        if (parkingSpot2 == null) {
                            parkingSpot2 = "";
                        }
                        sb3.append(parkingSpot2);
                        string = sb3.toString();
                    }
                    PickUpOrderUpdate pickUpOrderUpdate = new PickUpOrderUpdate(pickupName, string);
                    this.f161317j = interfaceC15783O;
                    this.f161308a = interfaceC15783O;
                    this.f161309b = this;
                    this.f161310c = this;
                    this.f161311d = interfaceC15783O;
                    this.f161312e = 0;
                    this.f161313f = 0;
                    this.f161314g = 0;
                    this.f161315h = 0;
                    this.f161316i = 1;
                    obj = aVar.J(strValueOf, pickUpOrderUpdate, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            C17092h c17092h2 = C17092h.this;
            if (Result.h(objB)) {
                qw.a.INSTANCE.k("FlyBuy: order pickup details updated successfully: " + Rn.I.INSTANCE.c(((ViewState) c17092h2._viewState.getValue()).getFlyBuyState()), new Object[0]);
                String parkingSpot3 = ((ViewState) c17092h2._viewState.getValue()).getParkingSpot();
                if (parkingSpot3 == null) {
                    parkingSpot3 = "";
                }
                String pickupName2 = ((ViewState) c17092h2._viewState.getValue()).getPickupName();
                c17092h2.G(parkingSpot3, pickupName2 != null ? pickupName2 : "");
            }
            C17092h c17092h3 = C17092h.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "FlyBuy: order pickup details not updated: " + Rn.I.INSTANCE.c(((ViewState) c17092h3._viewState.getValue()).getFlyBuyState()), new Object[0]);
                c17092h3.F();
            }
            return Unit.f143329a;
        }
    }

    public C17092h(C15297b navigationCommandManager, com.meijer.mobile.digitalshopping.api.orders.a ordersRepository, Rn.I flyBuyManager, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(navigationCommandManager, "navigationCommandManager");
        Intrinsics.j(ordersRepository, "ordersRepository");
        Intrinsics.j(flyBuyManager, "flyBuyManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.navigationCommandManager = navigationCommandManager;
        this.ordersRepository = ordersRepository;
        this.flyBuyManager = flyBuyManager;
        this.analyticsEngine = analyticsEngine;
        this._viewState = pv.S.a(new ViewState(null, false, null, null, null, null, null, null, false, false, null, 2047, null));
        Ju.a aVar = new Ju.a();
        this.compositeDisposable = aVar;
        io.reactivex.l<FlyBuyState> lVarSubscribeOn = flyBuyManager.J().take(1L).subscribeOn(C13889a.b());
        final a aVar2 = new a(this);
        Lu.g<? super FlyBuyState> gVar = new Lu.g() { // from class: sn.e
            @Override // Lu.g
            public final void accept(Object obj) {
                C17092h.p(aVar2, obj);
            }
        };
        final b bVar = new b(qw.a.INSTANCE);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: sn.f
            @Override // Lu.g
            public final void accept(Object obj) {
                C17092h.q(bVar, obj);
            }
        }), aVar);
    }

    private final void A() {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, new UIEvent(d.b.f161292a), true, null, null, null, null, null, null, false, false, null, 2044, null)));
    }

    private final void B() throws Exception {
        String parkingSpot = this._viewState.getValue().getParkingSpot();
        if (parkingSpot == null || parkingSpot.length() == 0) {
            C();
        } else {
            D();
        }
    }

    private final void C() {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, new UIEvent(new d.ShowNeedParkingSpotDialogEvent(com.meijer.mobile.meijer.Y.f100509K2, com.meijer.mobile.meijer.Y.f100490J2, yr.Q.f171761b)), false, null, null, null, null, null, null, false, false, null, 2044, null)));
    }

    private final void D() throws Exception {
        ViewState value;
        List<FlyBuyOrderDetail.FlyBuyOrder> listA;
        FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder;
        Integer orderId;
        List<FlyBuyOrderDetail.FlyBuyOrder> listA2;
        FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder2;
        FlyBuyState flyBuyState = this._viewState.getValue().getFlyBuyState();
        if (flyBuyState != null) {
            String strL = this.flyBuyManager.L(w().getValue().getSelectedVehicleColor());
            String strL2 = this.flyBuyManager.L(w().getValue().getSelectedVehicleDescription());
            ViewState value2 = this._viewState.getValue();
            final String str = strL + ", " + strL2;
            if (C6393b.a(value2.getSelectedVehicleColor()) || C6393b.a(value2.getSelectedVehicleDescription())) {
                str = null;
            }
            FlyBuyOrderDetail flyBuyOrder3 = flyBuyState.getFlyBuyOrder();
            String redemptionCode = (flyBuyOrder3 == null || (listA2 = flyBuyOrder3.a()) == null || (flyBuyOrder2 = (FlyBuyOrderDetail.FlyBuyOrder) CollectionsKt.u0(listA2)) == null) ? null : flyBuyOrder2.getRedemptionCode();
            String str2 = redemptionCode == null ? "" : redemptionCode;
            FlyBuyOrderDetail flyBuyOrder4 = flyBuyState.getFlyBuyOrder();
            final int iIntValue = (flyBuyOrder4 == null || (listA = flyBuyOrder4.a()) == null || (flyBuyOrder = (FlyBuyOrderDetail.FlyBuyOrder) CollectionsKt.u0(listA)) == null || (orderId = flyBuyOrder.getOrderId()) == null) ? 0 : orderId.intValue();
            OrderDetail currentOrderDetails = flyBuyState.getCurrentOrderDetails();
            PickupPerson pickUpPerson = currentOrderDetails != null ? currentOrderDetails.getPickUpPerson() : null;
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ViewState.b(value, null, true, null, null, null, null, null, null, false, false, null, 2045, null)));
            Rn.I i10 = this.flyBuyManager;
            String parkingSpot = this._viewState.getValue().getParkingSpot();
            i10.h0(String.valueOf(iIntValue), str2, pickUpPerson, parkingSpot == null ? "" : parkingSpot, new Function1() { // from class: sn.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17092h.E(this.f161264a, iIntValue, str, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(C17092h c17092h, int i10, String str, boolean z10) {
        if (z10) {
            C15809k.d(androidx.view.d0.a(c17092h), null, null, c17092h.new f(i10, str, null), 3, null);
        } else {
            c17092h.F();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, new UIEvent(new d.FailEvent(com.meijer.mobile.meijer.Y.f100725V9, com.meijer.mobile.meijer.Y.f100706U9, yr.Q.f171761b)), false, null, null, null, null, null, null, false, false, null, 2044, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(String parkingSpot, String pickupName) {
        ViewState value;
        this.flyBuyManager.X(parkingSpot, pickupName);
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, new UIEvent(d.c.f161293a), false, null, null, null, null, null, null, false, false, null, 2044, null)));
    }

    private final void H(List<? extends AbstractC15054a> newVehicleColorList) {
        ViewState value;
        ViewState viewState;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
            for (AbstractC15054a abstractC15054a : newVehicleColorList) {
                if (abstractC15054a.getIsChecked()) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, false, null, newVehicleColorList, null, abstractC15054a.getDescription(), null, null, false, false, null, 2007, null)));
    }

    private final void I(List<? extends AbstractC15055b> newVehicleDescriptionList) {
        ViewState value;
        ViewState viewState;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
            for (AbstractC15055b abstractC15055b : newVehicleDescriptionList) {
                if (abstractC15055b.getIsChecked()) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, false, newVehicleDescriptionList, null, abstractC15055b.getDescription(), null, null, null, false, false, null, 2027, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(FlyBuyState flyBuyState) {
        ViewState value;
        ViewState value2;
        ViewState viewState;
        ArrayList arrayList;
        ArrayList arrayList2;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, false, null, null, null, null, null, null, false, false, flyBuyState, 1023, null)));
        if (flyBuyState.getRestoreVehicleInfoState()) {
            return;
        }
        InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewState;
        do {
            value2 = interfaceC16549B2.getValue();
            viewState = value2;
            List<AbstractC15054a> listJ = viewState.j();
            arrayList = new ArrayList(CollectionsKt.x(listJ, 10));
            Iterator<T> it = listJ.iterator();
            while (true) {
                boolean z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC15054a abstractC15054a = (AbstractC15054a) it.next();
                if (abstractC15054a.getPosition() == 0) {
                    z10 = true;
                }
                arrayList.add(abstractC15054a.a(z10));
            }
            List<AbstractC15055b> listK = viewState.k();
            arrayList2 = new ArrayList(CollectionsKt.x(listK, 10));
            for (AbstractC15055b abstractC15055b : listK) {
                arrayList2.add(abstractC15055b.a(abstractC15055b.getPosition() == 0));
            }
        } while (!interfaceC16549B2.e(value2, ViewState.b(viewState, null, false, arrayList2, arrayList, null, null, null, null, false, false, null, 2035, null)));
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.compositeDisposable.d();
        super.onCleared();
    }

    public final pv.P<ViewState> w() {
        return this._viewState;
    }

    public final void x(c action) throws Exception {
        ViewState value;
        ViewState viewState;
        boolean isUpdatedParkingSpot;
        String placeHolder;
        AbstractC6392a description;
        AbstractC15055b initialVehicleType;
        ViewState value2;
        c.SetIsUpdatedName setIsUpdatedName;
        ViewState value3;
        ViewState value4;
        Intrinsics.j(action, "action");
        if (action instanceof c.a) {
            FlyBuyState flyBuyState = this._viewState.getValue().getFlyBuyState();
            if (flyBuyState != null) {
                this.analyticsEngine.k(Kn.n.f17594a.w(flyBuyState));
            }
            this.flyBuyManager.p0(true);
            A();
            B();
            return;
        }
        if (action instanceof c.UpdateVehicleDescriptionPicker) {
            this.flyBuyManager.z0(true);
            List<AbstractC15055b> listK = w().getValue().k();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listK, 10));
            for (AbstractC15055b abstractC15055b : listK) {
                arrayList.add(abstractC15055b.a(abstractC15055b.getPosition() == ((c.UpdateVehicleDescriptionPicker) action).getVehicleDescription().getPosition()));
            }
            I(arrayList);
            return;
        }
        if (action instanceof c.UpdateVehicleColorPicker) {
            this.flyBuyManager.z0(true);
            List<AbstractC15054a> listJ = w().getValue().j();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listJ, 10));
            for (AbstractC15054a abstractC15054a : listJ) {
                arrayList2.add(abstractC15054a.a(abstractC15054a.getPosition() == ((c.UpdateVehicleColorPicker) action).getVehicleColor().getPosition()));
            }
            H(arrayList2);
            return;
        }
        if (action instanceof c.b) {
            this.navigationCommandManager.d(on.T.f154906a.b());
            return;
        }
        if (action instanceof c.UpdatePickupUsername) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value4 = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value4, ViewState.b(value4, null, false, null, null, null, null, ((c.UpdatePickupUsername) action).getPickupName(), null, false, false, null, 1983, null)));
            return;
        }
        if (action instanceof c.UpdateParkingSpot) {
            InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewState;
            do {
                value3 = interfaceC16549B2.getValue();
            } while (!interfaceC16549B2.e(value3, ViewState.b(value3, null, false, null, null, null, null, null, ((c.UpdateParkingSpot) action).getParkingSpot(), false, false, null, 1919, null)));
            return;
        }
        if (action instanceof c.SetIsUpdatedName) {
            InterfaceC16549B<ViewState> interfaceC16549B3 = this._viewState;
            do {
                value2 = interfaceC16549B3.getValue();
                setIsUpdatedName = (c.SetIsUpdatedName) action;
            } while (!interfaceC16549B3.e(value2, ViewState.b(value2, null, false, null, null, null, null, setIsUpdatedName.getPlaceHolder(), null, setIsUpdatedName.getIsUpdatedName(), false, null, 1727, null)));
            return;
        }
        if (!(action instanceof c.SetIsUpdatedParkingSpot)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC16549B<ViewState> interfaceC16549B4 = this._viewState;
        do {
            value = interfaceC16549B4.getValue();
            viewState = value;
            c.SetIsUpdatedParkingSpot setIsUpdatedParkingSpot = (c.SetIsUpdatedParkingSpot) action;
            isUpdatedParkingSpot = setIsUpdatedParkingSpot.getIsUpdatedParkingSpot();
            placeHolder = setIsUpdatedParkingSpot.getPlaceHolder();
            AbstractC15054a initialVehicleColor = setIsUpdatedParkingSpot.getInitialVehicleColor();
            description = initialVehicleColor != null ? initialVehicleColor.getDescription() : null;
            initialVehicleType = setIsUpdatedParkingSpot.getInitialVehicleType();
        } while (!interfaceC16549B4.e(value, ViewState.b(viewState, null, false, null, null, initialVehicleType != null ? initialVehicleType.getDescription() : null, description, null, placeHolder, false, isUpdatedParkingSpot, null, 1359, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
