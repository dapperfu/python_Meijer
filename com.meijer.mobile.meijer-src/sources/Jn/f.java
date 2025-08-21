package Jn;

import In.StoreDetailState;
import Pj.a;
import Wq.a;
import Yq.StoreMapItem;
import Yq.StoreMarker;
import android.location.Location;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.storeinfo.api.model.Store;
import com.meijer.mobile.storeinfo.api.model.StoreInfo;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pk.StoreAuxUnitInfo;
import pk.StoreDetails;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 Y2\u00020\u0001:\u0003?=;B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010 \u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\u00142\u0006\u0010#\u001a\u00020+2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J7\u00102\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020,¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\u00020\u00142\u0006\u0010#\u001a\u0002042\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020D0Q8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0017\u0010X\u001a\b\u0012\u0004\u0012\u00020I0U8F¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Z"}, d2 = {"LJn/f;", "Landroidx/lifecycle/c0;", "Lhi/a;", "analyticsEngine", "LCs/b;", "userProvider", "Lyo/f;", "storeManager", "LZq/b;", "storeInfoRepository", "LCh/e;", "profileRepository", "Lil/m;", "cartRepository", "<init>", "(Lhi/a;LCs/b;Lyo/f;LZq/b;LCh/e;Lil/m;)V", "", "storeId", "Lpk/h;", "storeDetails", "", "A", "(ILpk/h;)V", "Lpk/i;", "storeSearchType", "H", "(Lpk/h;Lpk/i;)V", "", "streetAddress", "city", "state", "zipCode", "y", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LWq/a$d;", "action", "F", "(LWq/a$d;)V", PlaceTypes.STORE, "J", "(Lpk/h;)V", "x", "(I)V", "LWq/a$f;", "", "isNewAddressQualifierEnabled", "K", "(LWq/a$f;Z)V", "isFromGasStationDetails", "isNewAddressQualifierUIEnabled", "D", "(Lpk/i;Lpk/h;IZZ)V", "LWq/a;", "E", "(LWq/a;Z)V", "a", "Lhi/a;", "b", "LCs/b;", "c", "Lyo/f;", "d", "LZq/b;", "e", "LCh/e;", "f", "Lil/m;", "Lpv/B;", "LJn/f$e;", "g", "Lpv/B;", "_viewStateFlow", "Lpv/A;", "LJn/f$d;", "h", "Lpv/A;", "_effectsFlow", "LPj/c;", "i", "LPj/c;", "loadingStateManager", "Lpv/P;", "C", "()Lpv/P;", "viewStateFlow", "Lpv/F;", "B", "()Lpv/F;", "effectsFlow", "j", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class f extends c0 {

    /* renamed from: k, reason: collision with root package name */
    public static final int f16040k = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Zq.b storeInfoRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ch.e profileRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewStateFlow;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<d> _effectsFlow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Pj.c loadingStateManager;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LPj/a;", "loadingStates", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.store.viewmodel.StoreDetailViewModel$1", f = "StoreDetailViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<List<? extends Pj.a>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f16050a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f16051b;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f16051b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends Pj.a> list, Continuation<? super Unit> continuation) {
            return ((a) create(list, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f16050a == 0) {
                ResultKt.b(obj);
                List list = (List) this.f16051b;
                InterfaceC16549B interfaceC16549B = f.this._viewStateFlow;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, list, null, null, null, 29, null)));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpv/g;", "", "LPj/a;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.store.viewmodel.StoreDetailViewModel$2", f = "StoreDetailViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function3<InterfaceC16562g<? super List<? extends Pj.a>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f16053a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f16054b;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super List<? extends Pj.a>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(continuation);
            bVar.f16054b = th2;
            return bVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f16053a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.l((Throwable) this.f16054b, "Caught Exception in LoadingStatesStream", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LJn/f$d;", "", "<init>", "()V", "d", "a", "f", "g", "h", "i", "c", "b", "e", "LJn/f$d$a;", "LJn/f$d$b;", "LJn/f$d$c;", "LJn/f$d$d;", "LJn/f$d$e;", "LJn/f$d$f;", "LJn/f$d$g;", "LJn/f$d$h;", "LJn/f$d$i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LJn/f$d$a;", "LJn/f$d;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jn.f$d$a, reason: from toString */
        public static final /* data */ class CallPhoneNumber extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String phoneNumber;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CallPhoneNumber) && Intrinsics.e(this.phoneNumber, ((CallPhoneNumber) other).phoneNumber);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallPhoneNumber(String phoneNumber) {
                super(null);
                Intrinsics.j(phoneNumber, "phoneNumber");
                this.phoneNumber = phoneNumber;
            }

            /* renamed from: a, reason: from getter */
            public final String getPhoneNumber() {
                return this.phoneNumber;
            }

            public int hashCode() {
                return this.phoneNumber.hashCode();
            }

            public String toString() {
                return "CallPhoneNumber(phoneNumber=" + this.phoneNumber + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LJn/f$d$b;", "LJn/f$d;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jn.f$d$b, reason: from toString */
        public static final /* data */ class FailEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public FailEvent(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FailEvent) && this.messageResId == ((FailEvent) other).messageResId;
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "FailEvent(messageResId=" + this.messageResId + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"LJn/f$d$c;", "LJn/f$d;", "", "storeId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getStoreId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jn.f$d$c, reason: from toString */
        public static final /* data */ class FindGasStation extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int storeId;

            public FindGasStation(int i10) {
                super(null);
                this.storeId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FindGasStation) && this.storeId == ((FindGasStation) other).storeId;
            }

            public int hashCode() {
                return Integer.hashCode(this.storeId);
            }

            public String toString() {
                return "FindGasStation(storeId=" + this.storeId + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"LJn/f$d$d;", "LJn/f$d;", "", "streetAddress", "city", "state", "zip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jn.f$d$d, reason: collision with other inner class name and from toString */
        public static final /* data */ class GetDirections extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String streetAddress;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String city;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String state;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String zip;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GetDirections)) {
                    return false;
                }
                GetDirections getDirections = (GetDirections) other;
                return Intrinsics.e(this.streetAddress, getDirections.streetAddress) && Intrinsics.e(this.city, getDirections.city) && Intrinsics.e(this.state, getDirections.state) && Intrinsics.e(this.zip, getDirections.zip);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GetDirections(String streetAddress, String city, String state, String zip) {
                super(null);
                Intrinsics.j(streetAddress, "streetAddress");
                Intrinsics.j(city, "city");
                Intrinsics.j(state, "state");
                Intrinsics.j(zip, "zip");
                this.streetAddress = streetAddress;
                this.city = city;
                this.state = state;
                this.zip = zip;
            }

            /* renamed from: a, reason: from getter */
            public final String getCity() {
                return this.city;
            }

            /* renamed from: b, reason: from getter */
            public final String getState() {
                return this.state;
            }

            /* renamed from: c, reason: from getter */
            public final String getStreetAddress() {
                return this.streetAddress;
            }

            /* renamed from: d, reason: from getter */
            public final String getZip() {
                return this.zip;
            }

            public int hashCode() {
                return (((((this.streetAddress.hashCode() * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zip.hashCode();
            }

            public String toString() {
                return "GetDirections(streetAddress=" + this.streetAddress + ", city=" + this.city + ", state=" + this.state + ", zip=" + this.zip + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LJn/f$d$e;", "LJn/f$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final e f16062a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public String toString() {
                return "NavigateToHomeScreenEvent";
            }

            public int hashCode() {
                return -415711206;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LJn/f$d$f;", "LJn/f$d;", "", "resId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jn.f$d$f, reason: collision with other inner class name and from toString */
        public static final /* data */ class ShowError extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int resId;

            public ShowError(int i10) {
                super(null);
                this.resId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowError) && this.resId == ((ShowError) other).resId;
            }

            /* renamed from: a, reason: from getter */
            public final int getResId() {
                return this.resId;
            }

            public int hashCode() {
                return Integer.hashCode(this.resId);
            }

            public String toString() {
                return "ShowError(resId=" + this.resId + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LJn/f$d$g;", "LJn/f$d;", "Lpk/i;", "storeSearchType", "<init>", "(Lpk/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpk/i;", "()Lpk/i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jn.f$d$g, reason: from toString */
        public static final /* data */ class ShowFindStore extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final pk.i storeSearchType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowFindStore) && this.storeSearchType == ((ShowFindStore) other).storeSearchType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowFindStore(pk.i storeSearchType) {
                super(null);
                Intrinsics.j(storeSearchType, "storeSearchType");
                this.storeSearchType = storeSearchType;
            }

            /* renamed from: a, reason: from getter */
            public final pk.i getStoreSearchType() {
                return this.storeSearchType;
            }

            public int hashCode() {
                return this.storeSearchType.hashCode();
            }

            public String toString() {
                return "ShowFindStore(storeSearchType=" + this.storeSearchType + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LJn/f$d$h;", "LJn/f$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final h f16065a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public String toString() {
                return "ShowPickupNotSupportedDialogue";
            }

            public int hashCode() {
                return 1668651925;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LJn/f$d$i;", "LJn/f$d;", "Lpk/h;", "storeDetails", "Lpk/i;", "storeSearchType", "<init>", "(Lpk/h;Lpk/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpk/h;", "()Lpk/h;", "b", "Lpk/i;", "()Lpk/i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jn.f$d$i, reason: from toString */
        public static final /* data */ class StoreUpdated extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final StoreDetails storeDetails;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final pk.i storeSearchType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StoreUpdated)) {
                    return false;
                }
                StoreUpdated storeUpdated = (StoreUpdated) other;
                return Intrinsics.e(this.storeDetails, storeUpdated.storeDetails) && this.storeSearchType == storeUpdated.storeSearchType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StoreUpdated(StoreDetails storeDetails, pk.i storeSearchType) {
                super(null);
                Intrinsics.j(storeSearchType, "storeSearchType");
                this.storeDetails = storeDetails;
                this.storeSearchType = storeSearchType;
            }

            /* renamed from: a, reason: from getter */
            public final StoreDetails getStoreDetails() {
                return this.storeDetails;
            }

            /* renamed from: b, reason: from getter */
            public final pk.i getStoreSearchType() {
                return this.storeSearchType;
            }

            public int hashCode() {
                StoreDetails storeDetails = this.storeDetails;
                return ((storeDetails == null ? 0 : storeDetails.hashCode()) * 31) + this.storeSearchType.hashCode();
            }

            public String toString() {
                return "StoreUpdated(storeDetails=" + this.storeDetails + ", storeSearchType=" + this.storeSearchType + ')';
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJN\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b*\u0010!R\u001d\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b&\u0010!R\u0011\u00105\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00106\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b/\u00104R\u0013\u00109\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\b\"\u00108¨\u0006:"}, d2 = {"LJn/f$e;", "", "LIn/J;", "storeDetailState", "", "LPj/a;", "loadingStates", "LTq/k;", "preferredStore", "Landroid/location/Location;", "currentLocation", "LWq/a;", "storeAction", "<init>", "(LIn/J;Ljava/util/List;LTq/k;Landroid/location/Location;LWq/a;)V", "a", "(LIn/J;Ljava/util/List;LTq/k;Landroid/location/Location;LWq/a;)LJn/f$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LIn/J;", "g", "()LIn/J;", "b", "Ljava/util/List;", "getLoadingStates", "()Ljava/util/List;", "c", "LTq/k;", "getPreferredStore", "()LTq/k;", "d", "Landroid/location/Location;", "getCurrentLocation", "()Landroid/location/Location;", "e", "LWq/a;", "getStoreAction", "()LWq/a;", "LYq/e;", "f", "markers", "LYq/d;", "mapItem", "h", "()Z", "isLoading", "showError", "Lbk/a;", "()Lbk/a;", "loadingMessage", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Jn.f$e, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreDetailState storeDetailState;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Pj.a> loadingStates;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Tq.k preferredStore;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Location currentLocation;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Wq.a storeAction;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<StoreMarker> markers;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final List<StoreMapItem> mapItem;

        public ViewState() {
            this(null, null, null, null, null, 31, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.storeDetailState, viewState.storeDetailState) && Intrinsics.e(this.loadingStates, viewState.loadingStates) && Intrinsics.e(this.preferredStore, viewState.preferredStore) && Intrinsics.e(this.currentLocation, viewState.currentLocation) && Intrinsics.e(this.storeAction, viewState.storeAction);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState(StoreDetailState storeDetailState, List<? extends Pj.a> loadingStates, Tq.k kVar, Location location, Wq.a aVar) {
            Intrinsics.j(storeDetailState, "storeDetailState");
            Intrinsics.j(loadingStates, "loadingStates");
            this.storeDetailState = storeDetailState;
            this.loadingStates = loadingStates;
            this.preferredStore = kVar;
            this.currentLocation = location;
            this.storeAction = aVar;
            StoreDetails storeDetails = storeDetailState.getStoreDetails();
            this.markers = CollectionsKt.q(storeDetails != null ? Yq.f.d(storeDetails, kVar, null, 2, null) : null);
            StoreDetails storeDetails2 = storeDetailState.getStoreDetails();
            this.mapItem = CollectionsKt.q(storeDetails2 != null ? new StoreMapItem(0, storeDetails2, storeDetails2, storeDetails2, null, pk.i.f156745c, null, null, null, null, false, null, null, 8144, null) : null);
        }

        public static /* synthetic */ ViewState b(ViewState viewState, StoreDetailState storeDetailState, List list, Tq.k kVar, Location location, Wq.a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                storeDetailState = viewState.storeDetailState;
            }
            if ((i10 & 2) != 0) {
                list = viewState.loadingStates;
            }
            if ((i10 & 4) != 0) {
                kVar = viewState.preferredStore;
            }
            if ((i10 & 8) != 0) {
                location = viewState.currentLocation;
            }
            if ((i10 & 16) != 0) {
                aVar = viewState.storeAction;
            }
            Wq.a aVar2 = aVar;
            Tq.k kVar2 = kVar;
            return viewState.a(storeDetailState, list, kVar2, location, aVar2);
        }

        public final ViewState a(StoreDetailState storeDetailState, List<? extends Pj.a> loadingStates, Tq.k preferredStore, Location currentLocation, Wq.a storeAction) {
            Intrinsics.j(storeDetailState, "storeDetailState");
            Intrinsics.j(loadingStates, "loadingStates");
            return new ViewState(storeDetailState, loadingStates, preferredStore, currentLocation, storeAction);
        }

        public final AbstractC6392a c() {
            Object next;
            Iterator<T> it = this.loadingStates.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Pj.a) next) instanceof a.Loading) {
                    break;
                }
            }
            Pj.a aVar = (Pj.a) next;
            if (aVar != null) {
                if (Intrinsics.e(aVar.getKey(), "mapLoadingState")) {
                    aVar = null;
                }
                if (aVar != null) {
                    return aVar.getMessage();
                }
            }
            return null;
        }

        public final List<StoreMapItem> d() {
            return this.mapItem;
        }

        public final List<StoreMarker> e() {
            return this.markers;
        }

        public final boolean f() {
            Object next;
            Iterator<T> it = this.loadingStates.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.e(((Pj.a) next).getKey(), "storeInfoLoadingState")) {
                    break;
                }
            }
            return next instanceof a.Failed;
        }

        /* renamed from: g, reason: from getter */
        public final StoreDetailState getStoreDetailState() {
            return this.storeDetailState;
        }

        public final boolean h() {
            List<Pj.a> list = this.loadingStates;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Pj.a) it.next()) instanceof a.Loading) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = ((this.storeDetailState.hashCode() * 31) + this.loadingStates.hashCode()) * 31;
            Tq.k kVar = this.preferredStore;
            int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
            Location location = this.currentLocation;
            int iHashCode3 = (iHashCode2 + (location == null ? 0 : location.hashCode())) * 31;
            Wq.a aVar = this.storeAction;
            return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            return "ViewState(storeDetailState=" + this.storeDetailState + ", loadingStates=" + this.loadingStates + ", preferredStore=" + this.preferredStore + ", currentLocation=" + this.currentLocation + ", storeAction=" + this.storeAction + ')';
        }

        public /* synthetic */ ViewState(StoreDetailState storeDetailState, List list, Tq.k kVar, Location location, Wq.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new StoreDetailState(null, null, false, false, 15, null) : storeDetailState, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? null : kVar, (i10 & 8) != 0 ? null : location, (i10 & 16) != 0 ? null : aVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.store.viewmodel.StoreDetailViewModel$changeToPickup$1$1", f = "StoreDetailViewModel.kt", l = {323, 327, 338, 354}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f16075a;

        /* renamed from: b, reason: collision with root package name */
        Object f16076b;

        /* renamed from: c, reason: collision with root package name */
        Object f16077c;

        /* renamed from: d, reason: collision with root package name */
        Object f16078d;

        /* renamed from: e, reason: collision with root package name */
        int f16079e;

        /* renamed from: f, reason: collision with root package name */
        int f16080f;

        /* renamed from: g, reason: collision with root package name */
        int f16081g;

        /* renamed from: h, reason: collision with root package name */
        int f16082h;

        /* renamed from: i, reason: collision with root package name */
        int f16083i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f16084j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f16086l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f16086l = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = f.this.new g(this.f16086l, continuation);
            gVar.f16084j = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
        
            if (r3.emit(r5, r14) == r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ea, code lost:
        
            r3 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0136, code lost:
        
            if (r4.emit(r5, r14) == r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0179, code lost:
        
            if (r3.emit(r5, r14) == r0) goto L49;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:47:0x014c  */
        /* JADX WARN: Type inference failed for: r1v18, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v25 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 397
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Jn.f.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.store.viewmodel.StoreDetailViewModel$emitGetDirection$1", f = "StoreDetailViewModel.kt", l = {226, 228}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f16087a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f16088b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f16089c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f16090d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f16091e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f16092f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, String str2, String str3, String str4, f fVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f16088b = str;
            this.f16089c = str2;
            this.f16090d = str3;
            this.f16091e = str4;
            this.f16092f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h(this.f16088b, this.f16089c, this.f16090d, this.f16091e, this.f16092f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        
            if (r8.emit(r1, r7) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
        
            if (r8.emit(r1, r7) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        
            return r0;
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
                int r1 = r7.f16087a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto Le
                if (r1 != r2) goto L13
            Le:
                kotlin.ResultKt.b(r8)
                goto L7c
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                kotlin.ResultKt.b(r8)
                java.lang.String r8 = r7.f16088b
                if (r8 == 0) goto L66
                int r8 = r8.length()
                if (r8 != 0) goto L29
                goto L66
            L29:
                java.lang.String r8 = r7.f16089c
                if (r8 == 0) goto L66
                int r8 = r8.length()
                if (r8 != 0) goto L34
                goto L66
            L34:
                java.lang.String r8 = r7.f16090d
                if (r8 == 0) goto L66
                int r8 = r8.length()
                if (r8 != 0) goto L3f
                goto L66
            L3f:
                java.lang.String r8 = r7.f16091e
                if (r8 == 0) goto L66
                int r8 = r8.length()
                if (r8 != 0) goto L4a
                goto L66
            L4a:
                Jn.f r8 = r7.f16092f
                pv.A r8 = Jn.f.v(r8)
                Jn.f$d$d r1 = new Jn.f$d$d
                java.lang.String r3 = r7.f16088b
                java.lang.String r4 = r7.f16089c
                java.lang.String r5 = r7.f16090d
                java.lang.String r6 = r7.f16091e
                r1.<init>(r3, r4, r5, r6)
                r7.f16087a = r2
                java.lang.Object r8 = r8.emit(r1, r7)
                if (r8 != r0) goto L7c
                goto L7b
            L66:
                Jn.f r8 = r7.f16092f
                pv.A r8 = Jn.f.v(r8)
                Jn.f$d$f r1 = new Jn.f$d$f
                int r2 = Vq.c.f40137G
                r1.<init>(r2)
                r7.f16087a = r3
                java.lang.Object r8 = r8.emit(r1, r7)
                if (r8 != r0) goto L7c
            L7b:
                return r0
            L7c:
                kotlin.Unit r8 = kotlin.Unit.f143329a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Jn.f.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.store.viewmodel.StoreDetailViewModel$fetchStoreInfo$1", f = "StoreDetailViewModel.kt", l = {118}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f16093a;

        /* renamed from: b, reason: collision with root package name */
        Object f16094b;

        /* renamed from: c, reason: collision with root package name */
        Object f16095c;

        /* renamed from: d, reason: collision with root package name */
        Object f16096d;

        /* renamed from: e, reason: collision with root package name */
        int f16097e;

        /* renamed from: f, reason: collision with root package name */
        int f16098f;

        /* renamed from: g, reason: collision with root package name */
        int f16099g;

        /* renamed from: h, reason: collision with root package name */
        int f16100h;

        /* renamed from: i, reason: collision with root package name */
        int f16101i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f16102j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f16104l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ StoreDetails f16105m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, StoreDetails storeDetails, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f16104l = i10;
            this.f16105m = storeDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = f.this.new i(this.f16104l, this.f16105m, continuation);
            iVar.f16102j = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            ViewState viewState;
            StoreDetails storeDetailsA;
            Object objE;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f16101i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f16102j;
                    f fVar = f.this;
                    int i11 = this.f16104l;
                    Result.Companion companion = Result.INSTANCE;
                    Zq.b bVar = fVar.storeInfoRepository;
                    this.f16102j = interfaceC15783O;
                    this.f16093a = interfaceC15783O;
                    this.f16094b = this;
                    this.f16095c = this;
                    this.f16096d = interfaceC15783O;
                    this.f16097e = 0;
                    this.f16098f = 0;
                    this.f16099g = 0;
                    this.f16100h = 0;
                    this.f16101i = 1;
                    objE = bVar.e(i11, this);
                    if (objE == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objE = obj;
                }
                objB = Result.b(objE);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            StoreDetails storeDetails = this.f16105m;
            f fVar2 = f.this;
            if (Result.h(objB)) {
                Store store = (Store) CollectionsKt.u0(((StoreInfo) objB).a());
                StoreDetails storeDetails2 = (store == null || (storeDetailsA = Store.INSTANCE.a(store)) == null) ? storeDetails : storeDetailsA;
                InterfaceC16549B interfaceC16549B = fVar2._viewStateFlow;
                do {
                    value = interfaceC16549B.getValue();
                    viewState = (ViewState) value;
                } while (!interfaceC16549B.e(value, ViewState.b(viewState, StoreDetailState.b(viewState.getStoreDetailState(), storeDetails2, null, false, false, 14, null), null, null, null, null, 30, null)));
                fVar2.loadingStateManager.b(new a.NotLoading("storeInfoLoadingState"));
            }
            f fVar3 = f.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.l(thE, "getStoreInfo failed", new Object[0]);
                fVar3.loadingStateManager.b(new a.Failed("storeInfoLoadingState", null, 2, null));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.store.viewmodel.StoreDetailViewModel$onAction$1", f = "StoreDetailViewModel.kt", l = {147}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f16106a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Wq.a f16108c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Wq.a aVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f16108c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return f.this.new j(this.f16108c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f16106a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = f.this._effectsFlow;
                d.FindGasStation findGasStation = new d.FindGasStation(((a.FindGasStation) this.f16108c).getStoreDetails().getStoreId());
                this.f16106a = 1;
                if (interfaceC16548A.emit(findGasStation, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.store.viewmodel.StoreDetailViewModel$onAction$2", f = "StoreDetailViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION, 157}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f16109a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Wq.a f16110b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f16111c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Wq.a aVar, f fVar, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f16110b = aVar;
            this.f16111c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new k(this.f16110b, this.f16111c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f16109a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.b(r5)
                goto L58
            L1b:
                kotlin.ResultKt.b(r5)
                Wq.a r5 = r4.f16110b
                pk.i r5 = r5.getStoreSearchType()
                pk.i r1 = pk.i.f156746d
                if (r5 != r1) goto L3e
                Jn.f r5 = r4.f16111c
                pv.A r5 = Jn.f.v(r5)
                Jn.f$d$g r1 = new Jn.f$d$g
                pk.i r2 = pk.i.f156747e
                r1.<init>(r2)
                r4.f16109a = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L58
                goto L57
            L3e:
                Jn.f r5 = r4.f16111c
                pv.A r5 = Jn.f.v(r5)
                Jn.f$d$g r1 = new Jn.f$d$g
                Wq.a r3 = r4.f16110b
                pk.i r3 = r3.getStoreSearchType()
                r1.<init>(r3)
                r4.f16109a = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L58
            L57:
                return r0
            L58:
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Jn.f.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.store.viewmodel.StoreDetailViewModel$onCallStore$2", f = "StoreDetailViewModel.kt", l = {250, 252}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f16112a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.PhoneCall f16113b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f16114c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(a.PhoneCall phoneCall, f fVar, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f16113b = phoneCall;
            this.f16114c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new l(this.f16113b, this.f16114c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f16112a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.b(r5)
                goto L5a
            L1b:
                kotlin.ResultKt.b(r5)
                Wq.a$d r5 = r4.f16113b
                java.lang.String r5 = r5.getPhoneNumber()
                boolean r5 = Ds.g.d(r5)
                if (r5 == 0) goto L44
                Jn.f r5 = r4.f16114c
                pv.A r5 = Jn.f.v(r5)
                Jn.f$d$a r1 = new Jn.f$d$a
                Wq.a$d r2 = r4.f16113b
                java.lang.String r2 = r2.getPhoneNumber()
                r1.<init>(r2)
                r4.f16112a = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L5a
                goto L59
            L44:
                Jn.f r5 = r4.f16114c
                pv.A r5 = Jn.f.v(r5)
                Jn.f$d$f r1 = new Jn.f$d$f
                int r3 = Vq.c.f40150T
                r1.<init>(r3)
                r4.f16112a = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L5a
            L59:
                return r0
            L5a:
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Jn.f.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.store.viewmodel.StoreDetailViewModel$onCallStore$3", f = "StoreDetailViewModel.kt", l = {264, 266}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f16115a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.PhoneCall f16116b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f16117c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(a.PhoneCall phoneCall, f fVar, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f16116b = phoneCall;
            this.f16117c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new m(this.f16116b, this.f16117c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f16115a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.b(r5)
                goto L5a
            L1b:
                kotlin.ResultKt.b(r5)
                Wq.a$d r5 = r4.f16116b
                java.lang.String r5 = r5.getPhoneNumber()
                boolean r5 = Ds.g.d(r5)
                if (r5 == 0) goto L44
                Jn.f r5 = r4.f16117c
                pv.A r5 = Jn.f.v(r5)
                Jn.f$d$a r1 = new Jn.f$d$a
                Wq.a$d r2 = r4.f16116b
                java.lang.String r2 = r2.getPhoneNumber()
                r1.<init>(r2)
                r4.f16115a = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L5a
                goto L59
            L44:
                Jn.f r5 = r4.f16117c
                pv.A r5 = Jn.f.v(r5)
                Jn.f$d$f r1 = new Jn.f$d$f
                int r3 = Vq.c.f40150T
                r1.<init>(r3)
                r4.f16115a = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L5a
            L59:
                return r0
            L5a:
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Jn.f.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.store.viewmodel.StoreDetailViewModel$selectNewPickupStore$1$1", f = "StoreDetailViewModel.kt", l = {286, 298, HttpResponseStatus.REDIRECTION_FOUND}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f16118a;

        /* renamed from: b, reason: collision with root package name */
        Object f16119b;

        /* renamed from: c, reason: collision with root package name */
        Object f16120c;

        /* renamed from: d, reason: collision with root package name */
        Object f16121d;

        /* renamed from: e, reason: collision with root package name */
        int f16122e;

        /* renamed from: f, reason: collision with root package name */
        int f16123f;

        /* renamed from: g, reason: collision with root package name */
        int f16124g;

        /* renamed from: h, reason: collision with root package name */
        int f16125h;

        /* renamed from: i, reason: collision with root package name */
        int f16126i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f16127j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ StoreDetails f16129l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(StoreDetails storeDetails, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f16129l = storeDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n nVar = f.this.new n(this.f16129l, continuation);
            nVar.f16127j = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x0155, code lost:
        
            if (r4.emit(r8, r16) == r2) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Jn.f.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.store.viewmodel.StoreDetailViewModel$updateHomeStore$1", f = "StoreDetailViewModel.kt", l = {377, 380, 388}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f16130a;

        /* renamed from: b, reason: collision with root package name */
        Object f16131b;

        /* renamed from: c, reason: collision with root package name */
        Object f16132c;

        /* renamed from: d, reason: collision with root package name */
        Object f16133d;

        /* renamed from: e, reason: collision with root package name */
        int f16134e;

        /* renamed from: f, reason: collision with root package name */
        int f16135f;

        /* renamed from: g, reason: collision with root package name */
        int f16136g;

        /* renamed from: h, reason: collision with root package name */
        int f16137h;

        /* renamed from: i, reason: collision with root package name */
        int f16138i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f16139j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ a.SetHomeStore f16141l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(a.SetHomeStore setHomeStore, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f16141l = setHomeStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            o oVar = f.this.new o(this.f16141l, continuation);
            oVar.f16139j = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x010e, code lost:
        
            if (r3.emit(r7, r13) == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
        /* JADX WARN: Type inference failed for: r1v18, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v25 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Jn.f.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.store.viewmodel.StoreDetailViewModel$updateHomeStore$3", f = "StoreDetailViewModel.kt", l = {399}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f16142a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a.SetHomeStore f16144c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(a.SetHomeStore setHomeStore, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f16144c = setHomeStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return f.this.new p(this.f16144c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f16142a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = f.this._effectsFlow;
                d.StoreUpdated storeUpdated = new d.StoreUpdated(this.f16144c.getStoreDetails(), this.f16144c.getStoreSearchType());
                this.f16142a = 1;
                if (interfaceC16548A.emit(storeUpdated, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Jn.f$f, reason: collision with other inner class name */
    public /* synthetic */ class C0266f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[pk.i.values().length];
            try {
                iArr[pk.i.f156743a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pk.i.f156747e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pk.i.f156744b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pk.i.f156745c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[pk.i.f156746d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f(InterfaceC14523a analyticsEngine, Cs.b userProvider, yo.f storeManager, Zq.b storeInfoRepository, Ch.e profileRepository, il.m cartRepository) {
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(userProvider, "userProvider");
        Intrinsics.j(storeManager, "storeManager");
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        Intrinsics.j(profileRepository, "profileRepository");
        Intrinsics.j(cartRepository, "cartRepository");
        this.analyticsEngine = analyticsEngine;
        this.userProvider = userProvider;
        this.storeManager = storeManager;
        this.storeInfoRepository = storeInfoRepository;
        this.profileRepository = profileRepository;
        this.cartRepository = cartRepository;
        this._viewStateFlow = S.a(new ViewState(null, null, storeManager.a(), null, null, 27, null));
        this._effectsFlow = C16555H.b(0, 0, null, 7, null);
        Pj.c cVar = new Pj.c();
        this.loadingStateManager = cVar;
        cVar.b(new a.Loading("mapLoadingState", null, 2, null));
        C16563h.J(C16563h.g(C16563h.O(cVar.a(), new a(null)), new b(null)), d0.a(this));
    }

    private final void A(int storeId, StoreDetails storeDetails) {
        this.loadingStateManager.b(new a.Loading("storeInfoLoadingState", AbstractC6392a.INSTANCE.d(Vq.c.f40189v, new Object[0])));
        C15809k.d(d0.a(this), null, null, new i(storeId, storeDetails, null), 3, null);
        this.loadingStateManager.b(new a.NotLoading("mapLoadingState"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("menu");
        track.v("menu");
        return Unit.f143329a;
    }

    private final void H(StoreDetails storeDetails, pk.i storeSearchType) {
        if (storeDetails != null) {
            int i10 = C0266f.$EnumSwitchMapping$0[storeSearchType.ordinal()];
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                String streetAddress = storeDetails.getStreetAddress();
                if (streetAddress == null) {
                    streetAddress = "";
                }
                String city = storeDetails.getCity();
                if (city == null) {
                    city = "";
                }
                String state = storeDetails.getState();
                if (state == null) {
                    state = "";
                }
                String zipCode = storeDetails.getZipCode();
                y(streetAddress, city, state, zipCode != null ? zipCode : "");
                return;
            }
            if (storeDetails.T()) {
                String streetAddress2 = storeDetails.getStreetAddress();
                if (streetAddress2 == null) {
                    streetAddress2 = "";
                }
                String city2 = storeDetails.getCity();
                if (city2 == null) {
                    city2 = "";
                }
                String state2 = storeDetails.getState();
                if (state2 == null) {
                    state2 = "";
                }
                String zipCode2 = storeDetails.getZipCode();
                y(streetAddress2, city2, state2, zipCode2 != null ? zipCode2 : "");
                return;
            }
            StoreAuxUnitInfo auxUnitInfo = storeDetails.getAuxUnitInfo();
            if (auxUnitInfo != null) {
                this.analyticsEngine.b(C14756c.a("event: fuel pricing detail directions button"), new Function1() { // from class: Jn.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f.I((TrackingData) obj);
                    }
                });
                String address = auxUnitInfo.getAddress();
                if (address == null) {
                    address = "";
                }
                String city3 = auxUnitInfo.getCity();
                if (city3 == null) {
                    city3 = "";
                }
                String state3 = auxUnitInfo.getState();
                if (state3 == null) {
                    state3 = "";
                }
                String zipCode3 = auxUnitInfo.getZipCode();
                y(address, city3, state3, zipCode3 != null ? zipCode3 : "");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("menu");
        track.v("menu");
        return Unit.f143329a;
    }

    private final void J(StoreDetails store) {
        if (store != null) {
            this.loadingStateManager.b(new a.Loading("storeInfoLoadingState", AbstractC6392a.INSTANCE.d(Il.h.f14960t, new Object[0])));
            C15809k.d(d0.a(this), null, null, new n(store, null), 3, null);
            this.loadingStateManager.b(new a.NotLoading("storeInfoLoadingState"));
        }
    }

    private final void K(final a.SetHomeStore action, boolean isNewAddressQualifierEnabled) {
        if (!this.userProvider.b()) {
            C15809k.d(d0.a(this), null, null, new p(action, null), 3, null);
            this.analyticsEngine.b(C14756c.a("event: set store for today"), new Function1() { // from class: Jn.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.M(action, (TrackingData) obj);
                }
            });
            return;
        }
        this.loadingStateManager.b(new a.Loading("profileLoadingState", AbstractC6392a.INSTANCE.d(Vq.c.f40174i0, new Object[0])));
        if (isNewAddressQualifierEnabled) {
            J(action.getStoreDetails());
        } else {
            C15809k.d(d0.a(this), null, null, new o(action, null), 3, null);
            this.analyticsEngine.b(C14756c.a("event: set preferred store"), new Function1() { // from class: Jn.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.L(action, (TrackingData) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(a.SetHomeStore setHomeStore, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("account");
        track.v("find store");
        track.h("storeID", setHomeStore.getStoreDetails().getName());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(a.SetHomeStore setHomeStore, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("account");
        track.v("find store");
        track.h("storeID", setHomeStore.getStoreDetails().getName());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(int storeId) {
        this._viewStateFlow.getValue();
        C15809k.d(d0.a(this), null, null, new g(storeId, null), 3, null);
    }

    public final InterfaceC16553F<d> B() {
        return C16563h.b(this._effectsFlow);
    }

    public final P<ViewState> C() {
        return C16563h.c(this._viewStateFlow);
    }

    public final void D(pk.i storeSearchType, StoreDetails storeDetails, int storeId, boolean isFromGasStationDetails, boolean isNewAddressQualifierUIEnabled) {
        ViewState value;
        ViewState viewState;
        Intrinsics.j(storeSearchType, "storeSearchType");
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewStateFlow;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, StoreDetailState.b(viewState.getStoreDetailState(), null, storeSearchType, isFromGasStationDetails, isNewAddressQualifierUIEnabled, 1, null), null, null, null, null, 30, null)));
        A(storeId, storeDetails);
    }

    public final void E(Wq.a action, boolean isNewAddressQualifierEnabled) {
        Intrinsics.j(action, "action");
        if (action instanceof a.PhoneCall) {
            F((a.PhoneCall) action);
            return;
        }
        if (action instanceof a.ShowDirections) {
            a.ShowDirections showDirections = (a.ShowDirections) action;
            H(showDirections.getStoreDetails(), showDirections.getStoreSearchType());
            return;
        }
        if (action instanceof a.FindGasStation) {
            C15809k.d(d0.a(this), null, null, new j(action, null), 3, null);
            return;
        }
        if ((action instanceof a.FindStore) || (action instanceof a.ChangePickupStore)) {
            C15809k.d(d0.a(this), null, null, new k(action, this, null), 3, null);
        } else if (action instanceof a.SetCartStore) {
            J(((a.SetCartStore) action).getStoreDetails());
        } else {
            if (!(action instanceof a.SetHomeStore)) {
                throw new NoWhenBranchMatchedException();
            }
            K((a.SetHomeStore) action, isNewAddressQualifierEnabled);
        }
    }

    private final void F(a.PhoneCall action) {
        int i10 = C0266f.$EnumSwitchMapping$0[action.getStoreSearchType().ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                C15809k.d(d0.a(this), null, null, new m(action, this, null), 3, null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        this.analyticsEngine.b(C14756c.a("event: fuel pricing detail call button"), new Function1() { // from class: Jn.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.G((TrackingData) obj);
            }
        });
        C15809k.d(d0.a(this), null, null, new l(action, this, null), 3, null);
    }

    private final void y(String streetAddress, String city, String state, String zipCode) {
        C15809k.d(d0.a(this), null, null, new h(streetAddress, city, state, zipCode, this, null), 3, null);
    }
}
