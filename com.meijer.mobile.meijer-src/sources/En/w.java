package En;

import Cn.SplitAddress;
import Eh.AccountAddress;
import En.q;
import Ik.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.settings.addresses.AccountAddressState;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.List;
import java.util.Set;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.P;
import pv.S;
import qw.a;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0005&\u001a'$aB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\rH\u0014¢\u0006\u0004\b#\u0010\u001dJ\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\rH\u0082@¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u00142\u0006\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010-J'\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00102\u0006\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\r2\u0006\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u0010H\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\r2\u0006\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u0010H\u0002¢\u0006\u0004\b;\u0010:J\u0017\u0010=\u001a\u00020\r2\u0006\u0010<\u001a\u000203H\u0002¢\u0006\u0004\b=\u00106J+\u0010B\u001a\u00020\r2\b\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010@\u001a\u00020\u00102\b\u0010A\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\bB\u0010CJ'\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010D\u001a\u00020>2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0EH\u0002¢\u0006\u0004\bI\u0010JJ-\u0010N\u001a\u00020\u00102\f\u0010L\u001a\b\u0012\u0004\u0012\u00020>0K2\u0006\u0010D\u001a\u00020>2\u0006\u0010M\u001a\u00020\u0010H\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020\r2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010VR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010WR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010YR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010]R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020`0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020\\0d8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020`0h8F¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006l"}, d2 = {"LEn/w;", "Landroidx/lifecycle/c0;", "LEn/q$b;", "LEn/q;", "accountAddressDelegate", "Lil/m;", "cartRepository", "Lhi/a;", "analyticsEngine", "<init>", "(LEn/q;Lil/m;Lhi/a;)V", "LEn/w$c;", "action", "", "G", "(LEn/w$c;)V", "", "isInProgress", "b", "(Z)V", "LEh/a;", "C", "()LEh/a;", "LCn/e;", "suggestedAddress", "originalAddress", "g", "(LCn/e;LCn/e;)V", "k", "()V", "i", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "retrofitException", "j", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;)V", "onCleared", "d", "()Z", "e", "c", "J", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PlaceTypes.ADDRESS, "isNewAddressQualifierUIEnabled", "F", "(LEh/a;Z)V", "cameFromOrderOptions", "", "savedAddressCount", "A", "(ZIZ)V", "", "serviceTier", "K", "(Ljava/lang/String;)V", "splitAddress", "isSuggested", "H", "(LCn/e;Z)V", "B", "zipCode", "M", "LEn/q$a;", "viewToValidate", "hasFocus", "currentFieldValue", "O", "(LEn/q$a;ZLjava/lang/String;)V", "field", "", "LIk/c;", "errors", "Lbk/a;", "D", "(LEn/q$a;Ljava/util/List;)Lbk/a;", "", "hideErrorsFor", "isValid", "L", "(Ljava/util/Set;LEn/q$a;Z)Z", "Lcom/meijer/mobile/meijer/activity/settings/addresses/a;", "accountAddressState", "I", "(Lcom/meijer/mobile/meijer/activity/settings/addresses/a;)V", "a", "LEn/q;", "Lil/m;", "Lhi/a;", "LJu/a;", "LJu/a;", "disposables", "Lpv/B;", "LEn/w$g;", "Lpv/B;", "_viewState", "Lpv/A;", "LEn/w$d;", "f", "Lpv/A;", "_events", "Lpv/P;", "E", "()Lpv/P;", "viewState", "Lpv/F;", "getEvents", "()Lpv/F;", "events", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class w extends c0 implements q.b {

    /* renamed from: h, reason: collision with root package name */
    public static final int f7970h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final En.q accountAddressDelegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<d> _events;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<AccountAddressState, Unit> {
        a(Object obj) {
            super(1, obj, w.class, "onAddressStateChange", "onAddressStateChange(Lcom/meijer/mobile/meijer/activity/settings/addresses/AccountAddressState;)V", 0);
        }

        public final void a(AccountAddressState p02) {
            Intrinsics.j(p02, "p0");
            ((w) this.receiver).I(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AccountAddressState c12629a) {
            a(c12629a);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LEn/w$c;", "", "<init>", "()V", "c", "e", "b", "f", "i", "a", "g", "d", "h", "LEn/w$c$a;", "LEn/w$c$b;", "LEn/w$c$c;", "LEn/w$c$d;", "LEn/w$c$e;", "LEn/w$c$f;", "LEn/w$c$g;", "LEn/w$c$h;", "LEn/w$c$i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LEn/w$c$a;", "LEn/w$c;", "LCn/e;", "splitAddress", "", "isSuggested", "<init>", "(LCn/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LCn/e;", "()LCn/e;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.w$c$a, reason: from toString */
        public static final /* data */ class AddressChosenAction extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SplitAddress splitAddress;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isSuggested;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddressChosenAction)) {
                    return false;
                }
                AddressChosenAction addressChosenAction = (AddressChosenAction) other;
                return Intrinsics.e(this.splitAddress, addressChosenAction.splitAddress) && this.isSuggested == addressChosenAction.isSuggested;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddressChosenAction(SplitAddress splitAddress, boolean z10) {
                super(null);
                Intrinsics.j(splitAddress, "splitAddress");
                this.splitAddress = splitAddress;
                this.isSuggested = z10;
            }

            /* renamed from: a, reason: from getter */
            public final SplitAddress getSplitAddress() {
                return this.splitAddress;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsSuggested() {
                return this.isSuggested;
            }

            public int hashCode() {
                return (this.splitAddress.hashCode() * 31) + Boolean.hashCode(this.isSuggested);
            }

            public String toString() {
                return "AddressChosenAction(splitAddress=" + this.splitAddress + ", isSuggested=" + this.isSuggested + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEn/w$c$b;", "LEn/w$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f7979a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "DeleteAddressAction";
            }

            public int hashCode() {
                return 2033913196;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LEn/w$c$c;", "LEn/w$c;", "LEh/a;", PlaceTypes.ADDRESS, "", "isNewAddressQualifierUIEnabled", "<init>", "(LEh/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LEh/a;", "()LEh/a;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.w$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class InitializeAccountAddress extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccountAddress address;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isNewAddressQualifierUIEnabled;

            public InitializeAccountAddress(AccountAddress accountAddress, boolean z10) {
                super(null);
                this.address = accountAddress;
                this.isNewAddressQualifierUIEnabled = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InitializeAccountAddress)) {
                    return false;
                }
                InitializeAccountAddress initializeAccountAddress = (InitializeAccountAddress) other;
                return Intrinsics.e(this.address, initializeAccountAddress.address) && this.isNewAddressQualifierUIEnabled == initializeAccountAddress.isNewAddressQualifierUIEnabled;
            }

            /* renamed from: a, reason: from getter */
            public final AccountAddress getAddress() {
                return this.address;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsNewAddressQualifierUIEnabled() {
                return this.isNewAddressQualifierUIEnabled;
            }

            public int hashCode() {
                AccountAddress accountAddress = this.address;
                return ((accountAddress == null ? 0 : accountAddress.hashCode()) * 31) + Boolean.hashCode(this.isNewAddressQualifierUIEnabled);
            }

            public String toString() {
                return "InitializeAccountAddress(address=" + this.address + ", isNewAddressQualifierUIEnabled=" + this.isNewAddressQualifierUIEnabled + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEn/w$c$d;", "LEn/w$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f7982a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "OnBackPressedAction";
            }

            public int hashCode() {
                return 212578623;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEn/w$c$e;", "LEn/w$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final e f7983a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public String toString() {
                return "SaveAddressToAccountsAction";
            }

            public int hashCode() {
                return -367545349;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LEn/w$c$f;", "LEn/w$c;", "", "isChecked", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.w$c$f, reason: from toString */
        public static final /* data */ class SetAsDefaultAddressAction extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isChecked;

            public SetAsDefaultAddressAction(boolean z10) {
                super(null);
                this.isChecked = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetAsDefaultAddressAction) && this.isChecked == ((SetAsDefaultAddressAction) other).isChecked;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsChecked() {
                return this.isChecked;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isChecked);
            }

            public String toString() {
                return "SetAsDefaultAddressAction(isChecked=" + this.isChecked + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"LEn/w$c$g;", "LEn/w$c;", "", "cameFromOrderOptions", "", "accountAddressSize", "isNewAddressQualifierUIEnabled", "<init>", "(ZIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "I", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.w$c$g, reason: from toString */
        public static final /* data */ class SetCameFromOrderOptions extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean cameFromOrderOptions;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int accountAddressSize;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isNewAddressQualifierUIEnabled;

            public SetCameFromOrderOptions(boolean z10, int i10, boolean z11) {
                super(null);
                this.cameFromOrderOptions = z10;
                this.accountAddressSize = i10;
                this.isNewAddressQualifierUIEnabled = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetCameFromOrderOptions)) {
                    return false;
                }
                SetCameFromOrderOptions setCameFromOrderOptions = (SetCameFromOrderOptions) other;
                return this.cameFromOrderOptions == setCameFromOrderOptions.cameFromOrderOptions && this.accountAddressSize == setCameFromOrderOptions.accountAddressSize && this.isNewAddressQualifierUIEnabled == setCameFromOrderOptions.isNewAddressQualifierUIEnabled;
            }

            /* renamed from: a, reason: from getter */
            public final int getAccountAddressSize() {
                return this.accountAddressSize;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getCameFromOrderOptions() {
                return this.cameFromOrderOptions;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getIsNewAddressQualifierUIEnabled() {
                return this.isNewAddressQualifierUIEnabled;
            }

            public int hashCode() {
                return (((Boolean.hashCode(this.cameFromOrderOptions) * 31) + Integer.hashCode(this.accountAddressSize)) * 31) + Boolean.hashCode(this.isNewAddressQualifierUIEnabled);
            }

            public String toString() {
                return "SetCameFromOrderOptions(cameFromOrderOptions=" + this.cameFromOrderOptions + ", accountAddressSize=" + this.accountAddressSize + ", isNewAddressQualifierUIEnabled=" + this.isNewAddressQualifierUIEnabled + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LEn/w$c$h;", "LEn/w$c;", "LEn/w$e;", "addressMode", "<init>", "(LEn/w$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LEn/w$e;", "()LEn/w$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.w$c$h, reason: from toString */
        public static final /* data */ class UpdateAddressMode extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final e addressMode;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateAddressMode) && this.addressMode == ((UpdateAddressMode) other).addressMode;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateAddressMode(e addressMode) {
                super(null);
                Intrinsics.j(addressMode, "addressMode");
                this.addressMode = addressMode;
            }

            /* renamed from: a, reason: from getter */
            public final e getAddressMode() {
                return this.addressMode;
            }

            public int hashCode() {
                return this.addressMode.hashCode();
            }

            public String toString() {
                return "UpdateAddressMode(addressMode=" + this.addressMode + ')';
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u001b"}, d2 = {"LEn/w$c$i;", "LEn/w$c;", "LEn/q$a;", "viewWithFocusChange", "", "hasFocus", "", "currentValue", "<init>", "(LEn/q$a;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LEn/q$a;", "c", "()LEn/q$a;", "b", "Z", "()Z", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.w$c$i, reason: from toString */
        public static final /* data */ class ValidateSingleField extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final q.a viewWithFocusChange;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean hasFocus;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String currentValue;

            public ValidateSingleField(q.a aVar, boolean z10, String str) {
                super(null);
                this.viewWithFocusChange = aVar;
                this.hasFocus = z10;
                this.currentValue = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValidateSingleField)) {
                    return false;
                }
                ValidateSingleField validateSingleField = (ValidateSingleField) other;
                return this.viewWithFocusChange == validateSingleField.viewWithFocusChange && this.hasFocus == validateSingleField.hasFocus && Intrinsics.e(this.currentValue, validateSingleField.currentValue);
            }

            /* renamed from: a, reason: from getter */
            public final String getCurrentValue() {
                return this.currentValue;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getHasFocus() {
                return this.hasFocus;
            }

            /* renamed from: c, reason: from getter */
            public final q.a getViewWithFocusChange() {
                return this.viewWithFocusChange;
            }

            public int hashCode() {
                q.a aVar = this.viewWithFocusChange;
                int iHashCode = (((aVar == null ? 0 : aVar.hashCode()) * 31) + Boolean.hashCode(this.hasFocus)) * 31;
                String str = this.currentValue;
                return iHashCode + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "ValidateSingleField(viewWithFocusChange=" + this.viewWithFocusChange + ", hasFocus=" + this.hasFocus + ", currentValue=" + this.currentValue + ')';
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LEn/w$d;", "", "<init>", "()V", "b", "f", "e", "c", "d", "a", "LEn/w$d$a;", "LEn/w$d$b;", "LEn/w$d$c;", "LEn/w$d$d;", "LEn/w$d$e;", "LEn/w$d$f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LEn/w$d$a;", "LEn/w$d;", "", "shouldDisplayDialog", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.w$d$a, reason: from toString */
        public static final /* data */ class CheckFormModifiedEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldDisplayDialog;

            public CheckFormModifiedEvent(boolean z10) {
                super(null);
                this.shouldDisplayDialog = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckFormModifiedEvent) && this.shouldDisplayDialog == ((CheckFormModifiedEvent) other).shouldDisplayDialog;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getShouldDisplayDialog() {
                return this.shouldDisplayDialog;
            }

            public int hashCode() {
                return Boolean.hashCode(this.shouldDisplayDialog);
            }

            public String toString() {
                return "CheckFormModifiedEvent(shouldDisplayDialog=" + this.shouldDisplayDialog + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEn/w$d$b;", "LEn/w$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final b f7993a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "DeleteAddressSucceededEvent";
            }

            public int hashCode() {
                return -165355365;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LEn/w$d$c;", "LEn/w$d;", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "retrofitException", "<init>", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "()Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.w$d$c, reason: from toString */
        public static final /* data */ class NetworkErrorEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final RetrofitException retrofitException;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NetworkErrorEvent) && Intrinsics.e(this.retrofitException, ((NetworkErrorEvent) other).retrofitException);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkErrorEvent(RetrofitException retrofitException) {
                super(null);
                Intrinsics.j(retrofitException, "retrofitException");
                this.retrofitException = retrofitException;
            }

            /* renamed from: a, reason: from getter */
            public final RetrofitException getRetrofitException() {
                return this.retrofitException;
            }

            public int hashCode() {
                return this.retrofitException.hashCode();
            }

            public String toString() {
                return "NetworkErrorEvent(retrofitException=" + this.retrofitException + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"LEn/w$d$d;", "LEn/w$d;", "", "wasSavedToAccountAddresses", "", "serviceTier", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.w$d$d, reason: collision with other inner class name and from toString */
        public static final /* data */ class SaveAddressSucceededEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean wasSavedToAccountAddresses;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String serviceTier;

            public SaveAddressSucceededEvent(boolean z10, String str) {
                super(null);
                this.wasSavedToAccountAddresses = z10;
                this.serviceTier = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SaveAddressSucceededEvent)) {
                    return false;
                }
                SaveAddressSucceededEvent saveAddressSucceededEvent = (SaveAddressSucceededEvent) other;
                return this.wasSavedToAccountAddresses == saveAddressSucceededEvent.wasSavedToAccountAddresses && Intrinsics.e(this.serviceTier, saveAddressSucceededEvent.serviceTier);
            }

            /* renamed from: a, reason: from getter */
            public final String getServiceTier() {
                return this.serviceTier;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getWasSavedToAccountAddresses() {
                return this.wasSavedToAccountAddresses;
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.wasSavedToAccountAddresses) * 31;
                String str = this.serviceTier;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "SaveAddressSucceededEvent(wasSavedToAccountAddresses=" + this.wasSavedToAccountAddresses + ", serviceTier=" + this.serviceTier + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEn/w$d$e;", "LEn/w$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final e f7997a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public String toString() {
                return "ShowNoDeliveryPartnerDialogEvent";
            }

            public int hashCode() {
                return 373866371;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"LEn/w$d$f;", "LEn/w$d;", "LCn/e;", "suggestedAddress", "originalAddress", "<init>", "(LCn/e;LCn/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCn/e;", "b", "()LCn/e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.w$d$f, reason: from toString */
        public static final /* data */ class VertexResponseEvent extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SplitAddress suggestedAddress;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final SplitAddress originalAddress;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VertexResponseEvent)) {
                    return false;
                }
                VertexResponseEvent vertexResponseEvent = (VertexResponseEvent) other;
                return Intrinsics.e(this.suggestedAddress, vertexResponseEvent.suggestedAddress) && Intrinsics.e(this.originalAddress, vertexResponseEvent.originalAddress);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VertexResponseEvent(SplitAddress suggestedAddress, SplitAddress originalAddress) {
                super(null);
                Intrinsics.j(suggestedAddress, "suggestedAddress");
                Intrinsics.j(originalAddress, "originalAddress");
                this.suggestedAddress = suggestedAddress;
                this.originalAddress = originalAddress;
            }

            /* renamed from: a, reason: from getter */
            public final SplitAddress getOriginalAddress() {
                return this.originalAddress;
            }

            /* renamed from: b, reason: from getter */
            public final SplitAddress getSuggestedAddress() {
                return this.suggestedAddress;
            }

            public int hashCode() {
                return (this.suggestedAddress.hashCode() * 31) + this.originalAddress.hashCode();
            }

            public String toString() {
                return "VertexResponseEvent(suggestedAddress=" + this.suggestedAddress + ", originalAddress=" + this.originalAddress + ')';
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LEn/w$e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f8000a = new e("NEW_ADDRESS", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final e f8001b = new e("EDIT_ADDRESS", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final e f8002c = new e("REMOVE_ADDRESS", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ e[] f8003d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f8004e;

        static {
            e[] eVarArrA = a();
            f8003d = eVarArrA;
            f8004e = EnumEntriesKt.a(eVarArrA);
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f8000a, f8001b, f8002c};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f8003d.clone();
        }

        private e(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJð\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b\u0007\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u00105R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u00105R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\b;\u00105R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b0\u00105R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b2\u00105R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b8\u00105R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u00105R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u00105R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b@\u0010/R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bB\u0010/R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b6\u0010/R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\bC\u0010/R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b>\u0010D\u001a\u0004\b=\u0010ER\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010-\u001a\u0004\b:\u0010/R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\bG\u0010/R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bB\u0010H\u001a\u0004\bA\u0010\"R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\bF\u0010/R\u0017\u0010K\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b?\u0010%¨\u0006L"}, d2 = {"LEn/w$g;", "", "LEn/w$e;", "viewMode", "", "alreadyPopulatedFields", "networkCallInProgress", "isNewAddressQualifierUIEnabled", "LEn/H;", "addressNickname", "firstName", "lastName", "phoneNumber", "addressLineOne", "addressLineTwo", "city", "state", "zipCode", "isPrimaryAddress", "isSaveButtonEnabled", "cameFromOrderOptions", "isSaveCheckBoxSelected", "Lbk/a;", "primaryButtonText", "defaultAddressToggleVisibility", "saveAddressCheckboxVisibility", "", "serviceTier", "isEdited", "<init>", "(LEn/w$e;ZZZLEn/H;LEn/H;LEn/H;LEn/H;LEn/H;LEn/H;LEn/H;LEn/H;LEn/H;ZZZZLbk/a;ZZLjava/lang/String;Z)V", "a", "(LEn/w$e;ZZZLEn/H;LEn/H;LEn/H;LEn/H;LEn/H;LEn/H;LEn/H;LEn/H;LEn/H;ZZZZLbk/a;ZZLjava/lang/String;Z)LEn/w$g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LEn/w$e;", "q", "()LEn/w$e;", "b", "Z", "getAlreadyPopulatedFields", "()Z", "c", "k", "d", "e", "LEn/H;", "()LEn/H;", "f", "i", "g", "j", "h", "l", "p", "m", "r", "n", "t", "o", "u", "v", "Lbk/a;", "()Lbk/a;", "s", "getSaveAddressCheckboxVisibility", "Ljava/lang/String;", "w", "I", "screenTitle", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: En.w$g, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: x, reason: collision with root package name */
        public static final int f8005x = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e viewMode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean alreadyPopulatedFields;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean networkCallInProgress;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isNewAddressQualifierUIEnabled;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final InputFieldDecorator addressNickname;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final InputFieldDecorator firstName;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final InputFieldDecorator lastName;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final InputFieldDecorator phoneNumber;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final InputFieldDecorator addressLineOne;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final InputFieldDecorator addressLineTwo;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final InputFieldDecorator city;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final InputFieldDecorator state;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final InputFieldDecorator zipCode;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPrimaryAddress;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSaveButtonEnabled;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean cameFromOrderOptions;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSaveCheckBoxSelected;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a primaryButtonText;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean defaultAddressToggleVisibility;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean saveAddressCheckboxVisibility;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final String serviceTier;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEdited;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private final int screenTitle;

        public ViewState(e viewMode, boolean z10, boolean z11, boolean z12, InputFieldDecorator addressNickname, InputFieldDecorator firstName, InputFieldDecorator lastName, InputFieldDecorator phoneNumber, InputFieldDecorator addressLineOne, InputFieldDecorator addressLineTwo, InputFieldDecorator city, InputFieldDecorator state, InputFieldDecorator zipCode, boolean z13, boolean z14, boolean z15, boolean z16, AbstractC6392a abstractC6392a, boolean z17, boolean z18, String str, boolean z19) {
            int i10;
            Intrinsics.j(viewMode, "viewMode");
            Intrinsics.j(addressNickname, "addressNickname");
            Intrinsics.j(firstName, "firstName");
            Intrinsics.j(lastName, "lastName");
            Intrinsics.j(phoneNumber, "phoneNumber");
            Intrinsics.j(addressLineOne, "addressLineOne");
            Intrinsics.j(addressLineTwo, "addressLineTwo");
            Intrinsics.j(city, "city");
            Intrinsics.j(state, "state");
            Intrinsics.j(zipCode, "zipCode");
            this.viewMode = viewMode;
            this.alreadyPopulatedFields = z10;
            this.networkCallInProgress = z11;
            this.isNewAddressQualifierUIEnabled = z12;
            this.addressNickname = addressNickname;
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
            this.addressLineOne = addressLineOne;
            this.addressLineTwo = addressLineTwo;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
            this.isPrimaryAddress = z13;
            this.isSaveButtonEnabled = z14;
            this.cameFromOrderOptions = z15;
            this.isSaveCheckBoxSelected = z16;
            this.primaryButtonText = abstractC6392a;
            this.defaultAddressToggleVisibility = z17;
            this.saveAddressCheckboxVisibility = z18;
            this.serviceTier = str;
            this.isEdited = z19;
            int i11 = a.$EnumSwitchMapping$0[viewMode.ordinal()];
            if (i11 == 1) {
                i10 = !z15 ? Y.f101189t : z12 ? Il.h.f14940f : Il.h.f14963w;
            } else if (i11 == 2) {
                i10 = Y.f101209u;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = Y.f101223ud;
            }
            this.screenTitle = i10;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, e eVar, boolean z10, boolean z11, boolean z12, InputFieldDecorator inputFieldDecorator, InputFieldDecorator inputFieldDecorator2, InputFieldDecorator inputFieldDecorator3, InputFieldDecorator inputFieldDecorator4, InputFieldDecorator inputFieldDecorator5, InputFieldDecorator inputFieldDecorator6, InputFieldDecorator inputFieldDecorator7, InputFieldDecorator inputFieldDecorator8, InputFieldDecorator inputFieldDecorator9, boolean z13, boolean z14, boolean z15, boolean z16, AbstractC6392a abstractC6392a, boolean z17, boolean z18, String str, boolean z19, int i10, Object obj) {
            boolean z20;
            String str2;
            e eVar2 = (i10 & 1) != 0 ? viewState.viewMode : eVar;
            boolean z21 = (i10 & 2) != 0 ? viewState.alreadyPopulatedFields : z10;
            boolean z22 = (i10 & 4) != 0 ? viewState.networkCallInProgress : z11;
            boolean z23 = (i10 & 8) != 0 ? viewState.isNewAddressQualifierUIEnabled : z12;
            InputFieldDecorator inputFieldDecorator10 = (i10 & 16) != 0 ? viewState.addressNickname : inputFieldDecorator;
            InputFieldDecorator inputFieldDecorator11 = (i10 & 32) != 0 ? viewState.firstName : inputFieldDecorator2;
            InputFieldDecorator inputFieldDecorator12 = (i10 & 64) != 0 ? viewState.lastName : inputFieldDecorator3;
            InputFieldDecorator inputFieldDecorator13 = (i10 & 128) != 0 ? viewState.phoneNumber : inputFieldDecorator4;
            InputFieldDecorator inputFieldDecorator14 = (i10 & 256) != 0 ? viewState.addressLineOne : inputFieldDecorator5;
            InputFieldDecorator inputFieldDecorator15 = (i10 & 512) != 0 ? viewState.addressLineTwo : inputFieldDecorator6;
            InputFieldDecorator inputFieldDecorator16 = (i10 & 1024) != 0 ? viewState.city : inputFieldDecorator7;
            InputFieldDecorator inputFieldDecorator17 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? viewState.state : inputFieldDecorator8;
            InputFieldDecorator inputFieldDecorator18 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? viewState.zipCode : inputFieldDecorator9;
            boolean z24 = (i10 & 8192) != 0 ? viewState.isPrimaryAddress : z13;
            e eVar3 = eVar2;
            boolean z25 = (i10 & 16384) != 0 ? viewState.isSaveButtonEnabled : z14;
            boolean z26 = (i10 & 32768) != 0 ? viewState.cameFromOrderOptions : z15;
            boolean z27 = (i10 & 65536) != 0 ? viewState.isSaveCheckBoxSelected : z16;
            AbstractC6392a abstractC6392a2 = (i10 & 131072) != 0 ? viewState.primaryButtonText : abstractC6392a;
            boolean z28 = (i10 & 262144) != 0 ? viewState.defaultAddressToggleVisibility : z17;
            boolean z29 = (i10 & 524288) != 0 ? viewState.saveAddressCheckboxVisibility : z18;
            String str3 = (i10 & 1048576) != 0 ? viewState.serviceTier : str;
            if ((i10 & 2097152) != 0) {
                str2 = str3;
                z20 = viewState.isEdited;
            } else {
                z20 = z19;
                str2 = str3;
            }
            return viewState.a(eVar3, z21, z22, z23, inputFieldDecorator10, inputFieldDecorator11, inputFieldDecorator12, inputFieldDecorator13, inputFieldDecorator14, inputFieldDecorator15, inputFieldDecorator16, inputFieldDecorator17, inputFieldDecorator18, z24, z25, z26, z27, abstractC6392a2, z28, z29, str2, z20);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.viewMode == viewState.viewMode && this.alreadyPopulatedFields == viewState.alreadyPopulatedFields && this.networkCallInProgress == viewState.networkCallInProgress && this.isNewAddressQualifierUIEnabled == viewState.isNewAddressQualifierUIEnabled && Intrinsics.e(this.addressNickname, viewState.addressNickname) && Intrinsics.e(this.firstName, viewState.firstName) && Intrinsics.e(this.lastName, viewState.lastName) && Intrinsics.e(this.phoneNumber, viewState.phoneNumber) && Intrinsics.e(this.addressLineOne, viewState.addressLineOne) && Intrinsics.e(this.addressLineTwo, viewState.addressLineTwo) && Intrinsics.e(this.city, viewState.city) && Intrinsics.e(this.state, viewState.state) && Intrinsics.e(this.zipCode, viewState.zipCode) && this.isPrimaryAddress == viewState.isPrimaryAddress && this.isSaveButtonEnabled == viewState.isSaveButtonEnabled && this.cameFromOrderOptions == viewState.cameFromOrderOptions && this.isSaveCheckBoxSelected == viewState.isSaveCheckBoxSelected && Intrinsics.e(this.primaryButtonText, viewState.primaryButtonText) && this.defaultAddressToggleVisibility == viewState.defaultAddressToggleVisibility && this.saveAddressCheckboxVisibility == viewState.saveAddressCheckboxVisibility && Intrinsics.e(this.serviceTier, viewState.serviceTier) && this.isEdited == viewState.isEdited;
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: En.w$g$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.f8000a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.f8001b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.f8002c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final ViewState a(e viewMode, boolean alreadyPopulatedFields, boolean networkCallInProgress, boolean isNewAddressQualifierUIEnabled, InputFieldDecorator addressNickname, InputFieldDecorator firstName, InputFieldDecorator lastName, InputFieldDecorator phoneNumber, InputFieldDecorator addressLineOne, InputFieldDecorator addressLineTwo, InputFieldDecorator city, InputFieldDecorator state, InputFieldDecorator zipCode, boolean isPrimaryAddress, boolean isSaveButtonEnabled, boolean cameFromOrderOptions, boolean isSaveCheckBoxSelected, AbstractC6392a primaryButtonText, boolean defaultAddressToggleVisibility, boolean saveAddressCheckboxVisibility, String serviceTier, boolean isEdited) {
            Intrinsics.j(viewMode, "viewMode");
            Intrinsics.j(addressNickname, "addressNickname");
            Intrinsics.j(firstName, "firstName");
            Intrinsics.j(lastName, "lastName");
            Intrinsics.j(phoneNumber, "phoneNumber");
            Intrinsics.j(addressLineOne, "addressLineOne");
            Intrinsics.j(addressLineTwo, "addressLineTwo");
            Intrinsics.j(city, "city");
            Intrinsics.j(state, "state");
            Intrinsics.j(zipCode, "zipCode");
            return new ViewState(viewMode, alreadyPopulatedFields, networkCallInProgress, isNewAddressQualifierUIEnabled, addressNickname, firstName, lastName, phoneNumber, addressLineOne, addressLineTwo, city, state, zipCode, isPrimaryAddress, isSaveButtonEnabled, cameFromOrderOptions, isSaveCheckBoxSelected, primaryButtonText, defaultAddressToggleVisibility, saveAddressCheckboxVisibility, serviceTier, isEdited);
        }

        /* renamed from: c, reason: from getter */
        public final InputFieldDecorator getAddressLineOne() {
            return this.addressLineOne;
        }

        /* renamed from: d, reason: from getter */
        public final InputFieldDecorator getAddressLineTwo() {
            return this.addressLineTwo;
        }

        /* renamed from: e, reason: from getter */
        public final InputFieldDecorator getAddressNickname() {
            return this.addressNickname;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getCameFromOrderOptions() {
            return this.cameFromOrderOptions;
        }

        /* renamed from: g, reason: from getter */
        public final InputFieldDecorator getCity() {
            return this.city;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getDefaultAddressToggleVisibility() {
            return this.defaultAddressToggleVisibility;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((((((((((((this.viewMode.hashCode() * 31) + Boolean.hashCode(this.alreadyPopulatedFields)) * 31) + Boolean.hashCode(this.networkCallInProgress)) * 31) + Boolean.hashCode(this.isNewAddressQualifierUIEnabled)) * 31) + this.addressNickname.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.addressLineOne.hashCode()) * 31) + this.addressLineTwo.hashCode()) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zipCode.hashCode()) * 31) + Boolean.hashCode(this.isPrimaryAddress)) * 31) + Boolean.hashCode(this.isSaveButtonEnabled)) * 31) + Boolean.hashCode(this.cameFromOrderOptions)) * 31) + Boolean.hashCode(this.isSaveCheckBoxSelected)) * 31;
            AbstractC6392a abstractC6392a = this.primaryButtonText;
            int iHashCode2 = (((((iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31) + Boolean.hashCode(this.defaultAddressToggleVisibility)) * 31) + Boolean.hashCode(this.saveAddressCheckboxVisibility)) * 31;
            String str = this.serviceTier;
            return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isEdited);
        }

        /* renamed from: i, reason: from getter */
        public final InputFieldDecorator getFirstName() {
            return this.firstName;
        }

        /* renamed from: j, reason: from getter */
        public final InputFieldDecorator getLastName() {
            return this.lastName;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getNetworkCallInProgress() {
            return this.networkCallInProgress;
        }

        /* renamed from: l, reason: from getter */
        public final InputFieldDecorator getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: m, reason: from getter */
        public final AbstractC6392a getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* renamed from: n, reason: from getter */
        public final int getScreenTitle() {
            return this.screenTitle;
        }

        /* renamed from: o, reason: from getter */
        public final String getServiceTier() {
            return this.serviceTier;
        }

        /* renamed from: p, reason: from getter */
        public final InputFieldDecorator getState() {
            return this.state;
        }

        /* renamed from: q, reason: from getter */
        public final e getViewMode() {
            return this.viewMode;
        }

        /* renamed from: r, reason: from getter */
        public final InputFieldDecorator getZipCode() {
            return this.zipCode;
        }

        /* renamed from: s, reason: from getter */
        public final boolean getIsEdited() {
            return this.isEdited;
        }

        /* renamed from: t, reason: from getter */
        public final boolean getIsPrimaryAddress() {
            return this.isPrimaryAddress;
        }

        public String toString() {
            return "ViewState(viewMode=" + this.viewMode + ", alreadyPopulatedFields=" + this.alreadyPopulatedFields + ", networkCallInProgress=" + this.networkCallInProgress + ", isNewAddressQualifierUIEnabled=" + this.isNewAddressQualifierUIEnabled + ", addressNickname=" + this.addressNickname + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", phoneNumber=" + this.phoneNumber + ", addressLineOne=" + this.addressLineOne + ", addressLineTwo=" + this.addressLineTwo + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", isPrimaryAddress=" + this.isPrimaryAddress + ", isSaveButtonEnabled=" + this.isSaveButtonEnabled + ", cameFromOrderOptions=" + this.cameFromOrderOptions + ", isSaveCheckBoxSelected=" + this.isSaveCheckBoxSelected + ", primaryButtonText=" + this.primaryButtonText + ", defaultAddressToggleVisibility=" + this.defaultAddressToggleVisibility + ", saveAddressCheckboxVisibility=" + this.saveAddressCheckboxVisibility + ", serviceTier=" + this.serviceTier + ", isEdited=" + this.isEdited + ')';
        }

        /* renamed from: u, reason: from getter */
        public final boolean getIsSaveButtonEnabled() {
            return this.isSaveButtonEnabled;
        }

        /* renamed from: v, reason: from getter */
        public final boolean getIsSaveCheckBoxSelected() {
            return this.isSaveCheckBoxSelected;
        }

        public /* synthetic */ ViewState(e eVar, boolean z10, boolean z11, boolean z12, InputFieldDecorator inputFieldDecorator, InputFieldDecorator inputFieldDecorator2, InputFieldDecorator inputFieldDecorator3, InputFieldDecorator inputFieldDecorator4, InputFieldDecorator inputFieldDecorator5, InputFieldDecorator inputFieldDecorator6, InputFieldDecorator inputFieldDecorator7, InputFieldDecorator inputFieldDecorator8, InputFieldDecorator inputFieldDecorator9, boolean z13, boolean z14, boolean z15, boolean z16, AbstractC6392a abstractC6392a, boolean z17, boolean z18, String str, boolean z19, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            boolean z20;
            InputFieldDecorator inputFieldDecorator10;
            boolean z21 = (i10 & 2) != 0 ? false : z10;
            boolean z22 = (i10 & 4) != 0 ? false : z11;
            boolean z23 = (i10 & 8) != 0 ? false : z12;
            InputFieldDecorator inputFieldDecorator11 = (i10 & 16) != 0 ? new InputFieldDecorator(AbstractC6392a.INSTANCE.d(Y.f100411F, new Object[0]), null, null, false, 14, null) : inputFieldDecorator;
            InputFieldDecorator inputFieldDecorator12 = (i10 & 32) != 0 ? new InputFieldDecorator(AbstractC6392a.INSTANCE.d(Y.f100331B, new Object[0]), null, null, false, 14, null) : inputFieldDecorator2;
            InputFieldDecorator inputFieldDecorator13 = (i10 & 64) != 0 ? new InputFieldDecorator(AbstractC6392a.INSTANCE.d(Y.f100371D, new Object[0]), null, null, false, 14, null) : inputFieldDecorator3;
            InputFieldDecorator inputFieldDecorator14 = (i10 & 128) != 0 ? new InputFieldDecorator(AbstractC6392a.INSTANCE.d(Y.f100430G, new Object[0]), null, null, false, 14, null) : inputFieldDecorator4;
            InputFieldDecorator inputFieldDecorator15 = (i10 & 256) != 0 ? new InputFieldDecorator(AbstractC6392a.INSTANCE.d(Y.f101229v, new Object[0]), null, null, false, 14, null) : inputFieldDecorator5;
            InputFieldDecorator inputFieldDecorator16 = (i10 & 512) != 0 ? new InputFieldDecorator(AbstractC6392a.INSTANCE.d(Y.f101269x, new Object[0]), null, null, false, 14, null) : inputFieldDecorator6;
            InputFieldDecorator inputFieldDecorator17 = (i10 & 1024) != 0 ? new InputFieldDecorator(AbstractC6392a.INSTANCE.d(Y.f101309z, new Object[0]), null, null, false, 14, null) : inputFieldDecorator7;
            InputFieldDecorator inputFieldDecorator18 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? new InputFieldDecorator(AbstractC6392a.INSTANCE.d(Y.f100449H, new Object[0]), null, null, false, 14, null) : inputFieldDecorator8;
            if ((i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                z20 = z21;
                inputFieldDecorator10 = new InputFieldDecorator(AbstractC6392a.INSTANCE.d(Y.f100487J, new Object[0]), null, null, false, 14, null);
            } else {
                z20 = z21;
                inputFieldDecorator10 = inputFieldDecorator9;
            }
            this(eVar, z20, z22, z23, inputFieldDecorator11, inputFieldDecorator12, inputFieldDecorator13, inputFieldDecorator14, inputFieldDecorator15, inputFieldDecorator16, inputFieldDecorator17, inputFieldDecorator18, inputFieldDecorator10, (i10 & 8192) != 0 ? true : z13, (i10 & 16384) != 0 ? false : z14, (i10 & 32768) != 0 ? false : z15, (i10 & 65536) == 0 ? z16 : true, (i10 & 131072) != 0 ? null : abstractC6392a, (i10 & 262144) != 0 ? false : z17, (i10 & 524288) != 0 ? false : z18, (i10 & 1048576) == 0 ? str : null, (i10 & 2097152) != 0 ? false : z19);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressDetailsViewModel$checkForDeliveryPartner$1", f = "AddressDetailsViewModel.kt", l = {HttpResponseStatus.ERROR_NOT_FOUND, HttpResponseStatus.ERROR_REQUEST_TIMEOUT, HttpResponseStatus.ERROR_LENGTH_REQUIRED, 419}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f8029a;

        /* renamed from: b, reason: collision with root package name */
        Object f8030b;

        /* renamed from: c, reason: collision with root package name */
        Object f8031c;

        /* renamed from: d, reason: collision with root package name */
        int f8032d;

        /* renamed from: e, reason: collision with root package name */
        int f8033e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f8034f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ SplitAddress f8036h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f8037i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(SplitAddress splitAddress, boolean z10, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f8036h = splitAddress;
            this.f8037i = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = w.this.new i(this.f8036h, this.f8037i, continuation);
            iVar.f8034f = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
        
            if (r3.emit(r5, r12) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
        
            r3 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00de, code lost:
        
            if (r4.M(r7, r8, r12) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x011a, code lost:
        
            if (r3.emit(r7, r12) == r0) goto L45;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
        /* JADX WARN: Type inference failed for: r1v12, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: En.w.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressDetailsViewModel$noVertexMatchFoundForDelivery$1", f = "AddressDetailsViewModel.kt", l = {479, 483, 485, 493}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f8038a;

        /* renamed from: b, reason: collision with root package name */
        Object f8039b;

        /* renamed from: c, reason: collision with root package name */
        Object f8040c;

        /* renamed from: d, reason: collision with root package name */
        int f8041d;

        /* renamed from: e, reason: collision with root package name */
        int f8042e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f8043f;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = w.this.new j(continuation);
            jVar.f8043f = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
        
            if (r3.emit(r5, r11) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
        
            r3 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
        
            if (r4.V(r11) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0117, code lost:
        
            if (r3.emit(r7, r11) == r0) goto L45;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
        /* JADX WARN: Type inference failed for: r1v12, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: En.w.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressDetailsViewModel$onAction$1", f = "AddressDetailsViewModel.kt", l = {196}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f8045a;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return w.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f8045a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                En.q qVar = w.this.accountAddressDelegate;
                this.f8045a = 1;
                if (qVar.D(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressDetailsViewModel$onAction$2", f = "AddressDetailsViewModel.kt", l = {222}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f8047a;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return w.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f8047a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                w wVar = w.this;
                this.f8047a = 1;
                if (wVar.J(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressDetailsViewModel$onAddressChosen$1", f = "AddressDetailsViewModel.kt", l = {387}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f8049a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SplitAddress f8051c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8052d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(SplitAddress splitAddress, boolean z10, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f8051c = splitAddress;
            this.f8052d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return w.this.new m(this.f8051c, this.f8052d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f8049a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                En.q qVar = w.this.accountAddressDelegate;
                SplitAddress splitAddress = this.f8051c;
                boolean z10 = this.f8052d;
                this.f8049a = 1;
                if (qVar.M(splitAddress, z10, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressDetailsViewModel$onDeleteAddressSucceeded$1", f = "AddressDetailsViewModel.kt", l = {452}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f8053a;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return w.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f8053a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = w.this._events;
                d.b bVar = d.b.f7993a;
                this.f8053a = 1;
                if (interfaceC16548A.emit(bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressDetailsViewModel$onSaveAddressSucceeded$1", f = "AddressDetailsViewModel.kt", l = {441}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f8055a;

        o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return w.this.new o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f8055a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = w.this._events;
                d.SaveAddressSucceededEvent saveAddressSucceededEvent = new d.SaveAddressSucceededEvent(w.this.E().getValue().getIsSaveCheckBoxSelected(), w.this.E().getValue().getServiceTier());
                this.f8055a = 1;
                if (interfaceC16548A.emit(saveAddressSucceededEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressDetailsViewModel$onVertexMatchFound$1", f = "AddressDetailsViewModel.kt", l = {435}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f8057a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SplitAddress f8059c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ SplitAddress f8060d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(SplitAddress splitAddress, SplitAddress splitAddress2, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f8059c = splitAddress;
            this.f8060d = splitAddress2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return w.this.new p(this.f8059c, this.f8060d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f8057a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = w.this._events;
                d.VertexResponseEvent vertexResponseEvent = new d.VertexResponseEvent(this.f8059c, this.f8060d);
                this.f8057a = 1;
                if (interfaceC16548A.emit(vertexResponseEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.viewmodel.AddressDetailsViewModel$showNetworkErrorMessage$1", f = "AddressDetailsViewModel.kt", l = {458}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f8061a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RetrofitException f8063c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(RetrofitException retrofitException, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f8063c = retrofitException;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return w.this.new q(this.f8063c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f8061a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = w.this._events;
                d.NetworkErrorEvent networkErrorEvent = new d.NetworkErrorEvent(this.f8063c);
                this.f8061a = 1;
                if (interfaceC16548A.emit(networkErrorEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[q.a.values().length];
            try {
                iArr[q.a.f7933a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.a.f7934b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.a.f7935c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q.a.f7936d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[q.a.f7937e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[q.a.f7938f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[q.a.f7939g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[q.a.f7940h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[q.a.f7941i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public w(En.q accountAddressDelegate, il.m cartRepository, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(accountAddressDelegate, "accountAddressDelegate");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.accountAddressDelegate = accountAddressDelegate;
        this.cartRepository = cartRepository;
        this.analyticsEngine = analyticsEngine;
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        this._viewState = S.a(new ViewState(e.f8000a, false, false, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, false, null, false, 4194302, null));
        this._events = C16555H.b(0, 0, null, 7, null);
        accountAddressDelegate.Y(this);
        io.reactivex.l<AccountAddressState> lVarK = accountAddressDelegate.K();
        final a aVar2 = new a(this);
        Lu.g<? super AccountAddressState> gVar = new Lu.g() { // from class: En.u
            @Override // Lu.g
            public final void accept(Object obj) {
                w.q(aVar2, obj);
            }
        };
        final b bVar = new b(qw.a.INSTANCE);
        Dk.a.a(lVarK.subscribe(gVar, new Lu.g() { // from class: En.v
            @Override // Lu.g
            public final void accept(Object obj) {
                w.r(bVar, obj);
            }
        }), aVar);
    }

    private final void A(boolean cameFromOrderOptions, int savedAddressCount, boolean isNewAddressQualifierUIEnabled) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, false, false, false, null, null, null, null, null, null, null, null, null, false, false, cameFromOrderOptions, false, (isNewAddressQualifierUIEnabled || !cameFromOrderOptions) ? AbstractC6392a.INSTANCE.d(Y.f100558Md, new Object[0]) : AbstractC6392a.INSTANCE.d(Y.f100619Ph, new Object[0]), savedAddressCount != 0 && savedAddressCount <= 5, cameFromOrderOptions && savedAddressCount < 5, null, false, 3244031, null)));
    }

    private final AbstractC6392a D(q.a field, List<? extends Ik.c> errors) {
        Ik.c cVar;
        switch (h.$EnumSwitchMapping$0[field.ordinal()]) {
            case 2:
                Ik.c cVar2 = (Ik.c) CollectionsKt.u0(errors);
                if (cVar2 != null) {
                    if (!(cVar2 instanceof c.Blank)) {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        return AbstractC6392a.INSTANCE.d(Y.f100607P5, new Object[0]);
                    }
                }
            case 1:
                return null;
            case 3:
                Ik.c cVar3 = (Ik.c) CollectionsKt.u0(errors);
                if (cVar3 != null) {
                    if (!(cVar3 instanceof c.Blank)) {
                        cVar3 = null;
                    }
                    if (cVar3 != null) {
                        return AbstractC6392a.INSTANCE.d(Y.f100379D7, new Object[0]);
                    }
                }
                return null;
            case 4:
                String value = E().getValue().getPhoneNumber().getValue();
                if (value != null && value.length() > 0 && (cVar = (Ik.c) CollectionsKt.u0(errors)) != null) {
                    if (!(cVar instanceof c.Invalid)) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        return AbstractC6392a.INSTANCE.d(Y.f100461Hb, new Object[0]);
                    }
                }
                return null;
            case 5:
                Ik.c cVar4 = (Ik.c) CollectionsKt.u0(errors);
                if (cVar4 != null) {
                    if (!(cVar4 instanceof c.Blank)) {
                        cVar4 = null;
                    }
                    if (cVar4 != null) {
                        return AbstractC6392a.INSTANCE.d(Y.f100525L, new Object[0]);
                    }
                }
                return null;
            case 7:
                Ik.c cVar5 = (Ik.c) CollectionsKt.u0(errors);
                if (cVar5 != null) {
                    if (!(cVar5 instanceof c.Blank)) {
                        cVar5 = null;
                    }
                    if (cVar5 != null) {
                        return AbstractC6392a.INSTANCE.d(Y.f100892e1, new Object[0]);
                    }
                }
            case 6:
                return null;
            case 8:
                Ik.c cVar6 = (Ik.c) CollectionsKt.u0(errors);
                if (cVar6 != null) {
                    if (!(cVar6 instanceof c.Blank)) {
                        cVar6 = null;
                    }
                    if (cVar6 != null) {
                        return AbstractC6392a.INSTANCE.d(Y.f101285xf, new Object[0]);
                    }
                }
                return null;
            case 9:
                Ik.c cVar7 = (Ik.c) CollectionsKt.u0(errors);
                if (cVar7 != null) {
                    if (cVar7 instanceof c.Blank) {
                        return AbstractC6392a.INSTANCE.d(Y.f100390Di, new Object[0]);
                    }
                    if (cVar7 instanceof c.Invalid) {
                        return AbstractC6392a.INSTANCE.d(Y.f100410Ei, new Object[0]);
                    }
                }
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void F(AccountAddress address, boolean isNewAddressQualifierUIEnabled) {
        ViewState value;
        ViewState viewState;
        e eVar;
        AbstractC6392a.Companion companion;
        AccountAddress accountAddressL = this.accountAddressDelegate.L(address);
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
            eVar = accountAddressL.getId() == 0 ? e.f8000a : e.f8001b;
            companion = AbstractC6392a.INSTANCE;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, eVar, false, false, isNewAddressQualifierUIEnabled, new InputFieldDecorator(companion.d(Y.f100411F, new Object[0]), accountAddressL.getName(), null, false, 12, null), new InputFieldDecorator(isNewAddressQualifierUIEnabled ? companion.d(Y.f100351C, new Object[0]) : companion.d(Y.f100331B, new Object[0]), accountAddressL.getFirstName(), null, false, 12, null), new InputFieldDecorator(isNewAddressQualifierUIEnabled ? companion.d(Y.f100391E, new Object[0]) : companion.d(Y.f100371D, new Object[0]), accountAddressL.getLastName(), null, false, 12, null), new InputFieldDecorator(companion.d(Y.f100430G, new Object[0]), accountAddressL.getPhoneNumber(), null, false, 12, null), new InputFieldDecorator(isNewAddressQualifierUIEnabled ? companion.d(Y.f101249w, new Object[0]) : companion.d(Y.f101229v, new Object[0]), accountAddressL.getAddressLine1(), null, false, 12, null), new InputFieldDecorator(isNewAddressQualifierUIEnabled ? companion.d(Y.f101289y, new Object[0]) : companion.d(Y.f101269x, new Object[0]), accountAddressL.getAddressLine2(), null, false, 12, null), new InputFieldDecorator(isNewAddressQualifierUIEnabled ? companion.d(Y.f100311A, new Object[0]) : companion.d(Y.f101309z, new Object[0]), accountAddressL.getCity(), null, false, 12, null), new InputFieldDecorator(isNewAddressQualifierUIEnabled ? companion.d(Y.f100468I, new Object[0]) : companion.d(Y.f100449H, new Object[0]), accountAddressL.getState(), null, false, 12, null), new InputFieldDecorator(isNewAddressQualifierUIEnabled ? companion.d(Y.f100506K, new Object[0]) : companion.d(Y.f100487J, new Object[0]), accountAddressL.getZipCode(), null, false, 12, null), accountAddressL.getIsPrimary(), false, false, false, null, false, false, null, false, 4177926, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(AccountAddressState accountAddressState) {
        ViewState value;
        ViewState viewState;
        InputFieldDecorator inputFieldDecoratorB;
        InputFieldDecorator inputFieldDecoratorB2;
        InputFieldDecorator inputFieldDecoratorB3;
        InputFieldDecorator inputFieldDecoratorB4;
        InputFieldDecorator inputFieldDecoratorB5;
        InputFieldDecorator inputFieldDecoratorB6;
        InputFieldDecorator inputFieldDecoratorB7;
        InputFieldDecorator inputFieldDecoratorB8;
        InputFieldDecorator inputFieldDecoratorB9;
        e viewMode;
        e eVar;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
            InputFieldDecorator addressNickname = viewState.getAddressNickname();
            String strE = accountAddressState.n().e();
            q.a aVar = q.a.f7933a;
            inputFieldDecoratorB = InputFieldDecorator.b(addressNickname, null, strE, D(aVar, accountAddressState.n().c()), L(accountAddressState.l(), aVar, accountAddressState.n().getIsValid()), 1, null);
            InputFieldDecorator firstName = viewState.getFirstName();
            String strE2 = accountAddressState.k().e();
            q.a aVar2 = q.a.f7934b;
            inputFieldDecoratorB2 = InputFieldDecorator.b(firstName, null, strE2, D(aVar2, accountAddressState.k().c()), L(accountAddressState.l(), aVar2, accountAddressState.k().getIsValid()), 1, null);
            InputFieldDecorator lastName = viewState.getLastName();
            String strE3 = accountAddressState.m().e();
            q.a aVar3 = q.a.f7935c;
            inputFieldDecoratorB3 = InputFieldDecorator.b(lastName, null, strE3, D(aVar3, accountAddressState.m().c()), L(accountAddressState.l(), aVar3, accountAddressState.m().getIsValid()), 1, null);
            InputFieldDecorator phoneNumber = viewState.getPhoneNumber();
            String strE4 = accountAddressState.o().e();
            q.a aVar4 = q.a.f7936d;
            inputFieldDecoratorB4 = InputFieldDecorator.b(phoneNumber, null, strE4, D(aVar4, accountAddressState.o().c()), L(accountAddressState.l(), aVar4, accountAddressState.o().getIsValid()), 1, null);
            InputFieldDecorator addressLineOne = viewState.getAddressLineOne();
            String strE5 = accountAddressState.g().e();
            q.a aVar5 = q.a.f7937e;
            inputFieldDecoratorB5 = InputFieldDecorator.b(addressLineOne, null, strE5, D(aVar5, accountAddressState.g().c()), L(accountAddressState.l(), aVar5, accountAddressState.g().getIsValid()), 1, null);
            InputFieldDecorator addressLineTwo = viewState.getAddressLineTwo();
            String strE6 = accountAddressState.h().e();
            q.a aVar6 = q.a.f7938f;
            inputFieldDecoratorB6 = InputFieldDecorator.b(addressLineTwo, null, strE6, D(aVar6, accountAddressState.h().c()), L(accountAddressState.l(), aVar6, accountAddressState.h().getIsValid()), 1, null);
            InputFieldDecorator city = viewState.getCity();
            String strE7 = accountAddressState.j().e();
            q.a aVar7 = q.a.f7939g;
            inputFieldDecoratorB7 = InputFieldDecorator.b(city, null, strE7, D(aVar7, accountAddressState.j().c()), L(accountAddressState.l(), aVar7, accountAddressState.j().getIsValid()), 1, null);
            InputFieldDecorator state = viewState.getState();
            String strE8 = accountAddressState.p().e();
            q.a aVar8 = q.a.f7940h;
            inputFieldDecoratorB8 = InputFieldDecorator.b(state, null, strE8, D(aVar8, accountAddressState.p().c()), L(accountAddressState.l(), aVar8, accountAddressState.p().getIsValid()), 1, null);
            InputFieldDecorator zipCode = viewState.getZipCode();
            String strE9 = accountAddressState.q().e();
            q.a aVar9 = q.a.f7941i;
            inputFieldDecoratorB9 = InputFieldDecorator.b(zipCode, null, strE9, D(aVar9, accountAddressState.q().c()), L(accountAddressState.l(), aVar9, accountAddressState.q().getIsValid()), 1, null);
            viewMode = viewState.getViewMode();
            eVar = e.f8001b;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, false, false, false, inputFieldDecoratorB, inputFieldDecoratorB2, inputFieldDecoratorB3, inputFieldDecoratorB4, inputFieldDecoratorB5, inputFieldDecoratorB6, inputFieldDecoratorB7, inputFieldDecoratorB8, inputFieldDecoratorB9, false, (viewMode == eVar && viewState.getIsEdited()) || (accountAddressState.getAllRequiredFieldsContainData() && viewState.getViewMode() != eVar), false, false, null, false, false, null, false, 4169743, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object J(Continuation<? super Unit> continuation) {
        Object objEmit = this._events.emit(new d.CheckFormModifiedEvent(this._viewState.getValue().getIsEdited()), continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(String serviceTier) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, false, false, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, false, serviceTier, false, 3145727, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(final String zipCode) {
        this.analyticsEngine.b(C14756c.a("Not serviceable alert"), new Function1() { // from class: En.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w.N(zipCode, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("zipcode", str);
        return Unit.f143329a;
    }

    private final void O(q.a viewToValidate, boolean hasFocus, String currentFieldValue) {
        this.accountAddressDelegate.Z(viewToValidate, currentFieldValue, hasFocus, new Function0() { // from class: En.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w.P(this.f7965a);
            }
        });
    }

    public final AccountAddress C() {
        return this.accountAddressDelegate.J();
    }

    public final P<ViewState> E() {
        return C16563h.c(this._viewState);
    }

    public final void G(c action) {
        ViewState value;
        Intrinsics.j(action, "action");
        if (action instanceof c.InitializeAccountAddress) {
            c.InitializeAccountAddress initializeAccountAddress = (c.InitializeAccountAddress) action;
            F(initializeAccountAddress.getAddress(), initializeAccountAddress.getIsNewAddressQualifierUIEnabled());
            return;
        }
        if (action instanceof c.b) {
            C15809k.d(d0.a(this), null, null, new k(null), 3, null);
            return;
        }
        if (action instanceof c.e) {
            this.accountAddressDelegate.E();
            return;
        }
        if (action instanceof c.ValidateSingleField) {
            c.ValidateSingleField validateSingleField = (c.ValidateSingleField) action;
            O(validateSingleField.getViewWithFocusChange(), validateSingleField.getHasFocus(), validateSingleField.getCurrentValue());
            return;
        }
        if (action instanceof c.SetAsDefaultAddressAction) {
            this.accountAddressDelegate.X(((c.SetAsDefaultAddressAction) action).getIsChecked());
            return;
        }
        if (action instanceof c.AddressChosenAction) {
            c.AddressChosenAction addressChosenAction = (c.AddressChosenAction) action;
            H(addressChosenAction.getSplitAddress(), addressChosenAction.getIsSuggested());
            return;
        }
        if (action instanceof c.SetCameFromOrderOptions) {
            c.SetCameFromOrderOptions setCameFromOrderOptions = (c.SetCameFromOrderOptions) action;
            A(setCameFromOrderOptions.getCameFromOrderOptions(), setCameFromOrderOptions.getAccountAddressSize(), setCameFromOrderOptions.getIsNewAddressQualifierUIEnabled());
        } else if (action instanceof c.d) {
            C15809k.d(d0.a(this), null, null, new l(null), 3, null);
        } else {
            if (!(action instanceof c.UpdateAddressMode)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ViewState.b(value, ((c.UpdateAddressMode) action).getAddressMode(), false, false, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, false, null, false, 4194302, null)));
        }
    }

    @Override // En.q.b
    public void b(boolean isInProgress) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, false, isInProgress, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, false, null, false, 4194299, null)));
    }

    @Override // En.q.b
    public void g(SplitAddress suggestedAddress, SplitAddress originalAddress) {
        Intrinsics.j(suggestedAddress, "suggestedAddress");
        Intrinsics.j(originalAddress, "originalAddress");
        C15809k.d(d0.a(this), null, null, new p(suggestedAddress, originalAddress, null), 3, null);
    }

    public final InterfaceC16553F<d> getEvents() {
        return C16563h.b(this._events);
    }

    @Override // En.q.b
    public void j(RetrofitException retrofitException) {
        Intrinsics.j(retrofitException, "retrofitException");
        C15809k.d(d0.a(this), null, null, new q(retrofitException, null), 3, null);
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    private final void B(SplitAddress splitAddress, boolean isSuggested) {
        C15809k.d(d0.a(this), null, null, new i(splitAddress, isSuggested, null), 3, null);
    }

    private final void H(SplitAddress splitAddress, boolean isSuggested) {
        if (!E().getValue().getCameFromOrderOptions()) {
            C15809k.d(d0.a(this), null, null, new m(splitAddress, isSuggested, null), 3, null);
        } else {
            B(splitAddress, isSuggested);
        }
    }

    private final boolean L(Set<? extends q.a> hideErrorsFor, q.a field, boolean isValid) {
        if (!hideErrorsFor.contains(field) && !isValid) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(w wVar) {
        ViewState value;
        if (!wVar.E().getValue().getIsEdited()) {
            InterfaceC16549B<ViewState> interfaceC16549B = wVar._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ViewState.b(value, null, false, false, false, null, null, null, null, null, null, null, null, null, false, true, false, false, null, false, false, null, true, 2080767, null)));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // En.q.b
    public void c() {
        C15809k.d(d0.a(this), null, null, new j(null), 3, null);
    }

    @Override // En.q.b
    public boolean d() {
        return E().getValue().getCameFromOrderOptions();
    }

    @Override // En.q.b
    public boolean e() {
        return E().getValue().getIsSaveCheckBoxSelected();
    }

    @Override // En.q.b
    public void i() {
        C15809k.d(d0.a(this), null, null, new n(null), 3, null);
    }

    @Override // En.q.b
    public void k() {
        C15809k.d(d0.a(this), null, null, new o(null), 3, null);
    }
}
