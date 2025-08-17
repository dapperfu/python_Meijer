package kq;

import Jk.AppVersion;
import Xp.ShopAndScanStore;
import Xp.ShopAndScanTrip;
import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.c0;
import androidx.view.d0;
import bq.C6278b;
import bq.EnumC6277a;
import com.fullstory.FS;
import com.meijer.mobile.shopandscan.domain.model.exception.ShopAndScanUserBlockedException;
import com.meijer.mobile.shopandscan.domain.usecase.location.NullLocationException;
import com.meijer.mobile.shopandscan.domain.usecase.location.PermissionsException;
import cq.C13414b;
import cq.C13415c;
import dq.C13553a;
import dq.C13555c;
import dq.C13556d;
import hq.AbstractC14560a;
import hq.AbstractC14561b;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kq.s;
import qv.C0;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.P;
import tv.S;
import xq.C18085d;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0002:8BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u001d\u0010\"\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001dH\u0002¢\u0006\u0004\b\"\u0010 J\u001d\u0010#\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001dH\u0002¢\u0006\u0004\b#\u0010 J\u001d\u0010$\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001dH\u0002¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\u0018H\u0002¢\u0006\u0004\b%\u0010\u001cJ\u0017\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\b*\u0010\u001cJ\u001b\u0010-\u001a\u00020\u00182\n\b\u0003\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00182\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00182\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0018H\u0002¢\u0006\u0004\b7\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020K0S8F¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lkq/s;", "Landroidx/lifecycle/c0;", "LJk/a;", "appVersion", "Lxq/d;", "navigationManager", "LZp/a;", "userAuthorizationUseCase", "Lbq/b;", "permissionsUseCase", "Lcq/c;", "testStoreUseCase", "Lcq/b;", "nearbyStoreUseCase", "Ldq/a;", "activeTripUseCase", "Ldq/d;", "startTripUseCase", "Ldq/c;", "resumeTripUseCase", "<init>", "(LJk/a;Lxq/d;LZp/a;Lbq/b;Lcq/c;Lcq/b;Ldq/a;Ldq/d;Ldq/c;)V", "Lkq/s$a;", "action", "", "R", "(Lkq/s$a;)V", "N", "()V", "Lkotlin/Function0;", "callback", "L", "(Lkotlin/jvm/functions/Function0;)V", "K", "P", "O", "J", "Z", "LXp/f;", "activeTrip", "S", "(LXp/f;)V", "W", "", "messageRes", "U", "(Ljava/lang/Integer;)V", "", "exception", "T", "(Ljava/lang/Throwable;)V", "Lhq/h;", "modal", "V", "(Lhq/h;)V", "M", "a", "LJk/a;", "b", "Lxq/d;", "c", "LZp/a;", "d", "Lbq/b;", "e", "Lcq/c;", "f", "Lcq/b;", "g", "Ldq/a;", "h", "Ldq/d;", "i", "Ldq/c;", "Ltv/B;", "Lkq/s$b;", "j", "Ltv/B;", "_uiState", "Lqv/C0;", "k", "Lqv/C0;", "fetchingData", "Ltv/P;", "Q", "()Ltv/P;", "uiState", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AppVersion appVersion;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C18085d navigationManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Zp.a userAuthorizationUseCase;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C6278b permissionsUseCase;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C13415c testStoreUseCase;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C13414b nearbyStoreUseCase;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C13553a activeTripUseCase;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C13556d startTripUseCase;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C13555c resumeTripUseCase;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _uiState;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private C0 fetchingData;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lkq/s$a;", "", "<init>", "()V", "b", "e", "a", "c", "d", "Lkq/s$a$a;", "Lkq/s$a$b;", "Lkq/s$a$c;", "Lkq/s$a$d;", "Lkq/s$a$e;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkq/s$a$a;", "Lkq/s$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: kq.s$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2273a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2273a f147681a = new C2273a();

            private C2273a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2273a);
            }

            public String toString() {
                return "DismissModal";
            }

            public int hashCode() {
                return -1928321077;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkq/s$a$b;", "Lkq/s$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f147682a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "FetchData";
            }

            public int hashCode() {
                return -715628292;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkq/s$a$c;", "Lkq/s$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f147683a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "NavigateBack";
            }

            public int hashCode() {
                return 967157632;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkq/s$a$d;", "Lkq/s$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f147684a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "NavigateToOptionsMenu";
            }

            public int hashCode() {
                return -1369630423;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkq/s$a$e;", "Lkq/s$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final e f147685a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public String toString() {
                return "StartTrip";
            }

            public int hashCode() {
                return -1607037153;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u009c\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b4\u0010$R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010$R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b/\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b.\u00105\u001a\u0004\b6\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b'\u00107\u001a\u0004\b1\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\b-\u0010:R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b+\u0010;\u001a\u0004\b)\u0010<¨\u0006="}, d2 = {"Lkq/s$b;", "", "", "isLoading", "Lak/a;", "loadingSpinnerMessage", "Lhq/h;", "modal", "headerText", "isUserBlocked", "hasPermission", "hasShownPermissionRationaleModal", "currentStoreChecked", "activeTripChecked", "", "mPerksBarcode", "LXp/e;", "currentStore", "LXp/f;", "activeTrip", "Lkq/s$b$a;", "actionButton", "<init>", "(ZLak/a;Lhq/h;Lak/a;ZZZZZLjava/lang/String;LXp/e;LXp/f;Lkq/s$b$a;)V", "a", "(ZLak/a;Lhq/h;Lak/a;ZZZZZLjava/lang/String;LXp/e;LXp/f;Lkq/s$b$a;)Lkq/s$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "n", "()Z", "b", "Lak/a;", "k", "()Lak/a;", "c", "Lhq/h;", "m", "()Lhq/h;", "d", "j", "e", "o", "f", "h", "g", "i", "Ljava/lang/String;", "l", "LXp/e;", "()LXp/e;", "LXp/f;", "()LXp/f;", "Lkq/s$b$a;", "()Lkq/s$b$a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kq.s$b, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a loadingSpinnerMessage;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hq.h modal;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a headerText;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isUserBlocked;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasPermission;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasShownPermissionRationaleModal;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean currentStoreChecked;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean activeTripChecked;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mPerksBarcode;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShopAndScanStore currentStore;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShopAndScanTrip activeTrip;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final a actionButton;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u000e\bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkq/s$b$a;", "", "Lak/a;", "text", "Lkq/s$a;", "action", "<init>", "(Lak/a;Lkq/s$a;)V", "a", "Lak/a;", "b", "()Lak/a;", "Lkq/s$a;", "()Lkq/s$a;", "c", "Lkq/s$b$a$a;", "Lkq/s$b$a$b;", "Lkq/s$b$a$c;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: kq.s$b$a */
        public static abstract class a {

            /* renamed from: c, reason: collision with root package name */
            public static final int f147699c = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final AbstractC5607a text;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final a action;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkq/s$b$a$a;", "Lkq/s$b$a;", "<init>", "()V", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: kq.s$b$a$a, reason: collision with other inner class name */
            public static final class C2274a extends a {

                /* renamed from: d, reason: collision with root package name */
                public static final int f147702d = AbstractC5607a.f45514b;

                public C2274a() {
                    super(AbstractC5607a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f116929N0, new Object[0]), a.c.f147683a, null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkq/s$b$a$b;", "Lkq/s$b$a;", "<init>", "()V", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: kq.s$b$a$b, reason: collision with other inner class name */
            public static final class C2275b extends a {

                /* renamed from: d, reason: collision with root package name */
                public static final int f147703d = AbstractC5607a.f45514b;

                public C2275b() {
                    super(AbstractC5607a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f116952Z, new Object[0]), a.b.f147682a, null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkq/s$b$a$c;", "Lkq/s$b$a;", "<init>", "()V", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: kq.s$b$a$c */
            public static final class c extends a {

                /* renamed from: d, reason: collision with root package name */
                public static final int f147704d = AbstractC5607a.f45514b;

                public c() {
                    super(AbstractC5607a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f116939S0, new Object[0]), a.e.f147685a, null);
                }
            }

            public /* synthetic */ a(AbstractC5607a abstractC5607a, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
                this(abstractC5607a, aVar);
            }

            private a(AbstractC5607a abstractC5607a, a aVar) {
                this.text = abstractC5607a;
                this.action = aVar;
            }

            /* renamed from: a, reason: from getter */
            public final a getAction() {
                return this.action;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC5607a getText() {
                return this.text;
            }
        }

        public ViewState() {
            this(false, null, null, null, false, false, false, false, false, null, null, null, null, 8191, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.isLoading == viewState.isLoading && Intrinsics.e(this.loadingSpinnerMessage, viewState.loadingSpinnerMessage) && Intrinsics.e(this.modal, viewState.modal) && Intrinsics.e(this.headerText, viewState.headerText) && this.isUserBlocked == viewState.isUserBlocked && this.hasPermission == viewState.hasPermission && this.hasShownPermissionRationaleModal == viewState.hasShownPermissionRationaleModal && this.currentStoreChecked == viewState.currentStoreChecked && this.activeTripChecked == viewState.activeTripChecked && Intrinsics.e(this.mPerksBarcode, viewState.mPerksBarcode) && Intrinsics.e(this.currentStore, viewState.currentStore) && Intrinsics.e(this.activeTrip, viewState.activeTrip) && Intrinsics.e(this.actionButton, viewState.actionButton);
        }

        public ViewState(boolean z10, AbstractC5607a abstractC5607a, hq.h hVar, AbstractC5607a headerText, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, ShopAndScanStore shopAndScanStore, ShopAndScanTrip shopAndScanTrip, a actionButton) {
            Intrinsics.j(headerText, "headerText");
            Intrinsics.j(actionButton, "actionButton");
            this.isLoading = z10;
            this.loadingSpinnerMessage = abstractC5607a;
            this.modal = hVar;
            this.headerText = headerText;
            this.isUserBlocked = z11;
            this.hasPermission = z12;
            this.hasShownPermissionRationaleModal = z13;
            this.currentStoreChecked = z14;
            this.activeTripChecked = z15;
            this.mPerksBarcode = str;
            this.currentStore = shopAndScanStore;
            this.activeTrip = shopAndScanTrip;
            this.actionButton = actionButton;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, boolean z10, AbstractC5607a abstractC5607a, hq.h hVar, AbstractC5607a abstractC5607a2, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, ShopAndScanStore shopAndScanStore, ShopAndScanTrip shopAndScanTrip, a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = viewState.isLoading;
            }
            return viewState.a(z10, (i10 & 2) != 0 ? viewState.loadingSpinnerMessage : abstractC5607a, (i10 & 4) != 0 ? viewState.modal : hVar, (i10 & 8) != 0 ? viewState.headerText : abstractC5607a2, (i10 & 16) != 0 ? viewState.isUserBlocked : z11, (i10 & 32) != 0 ? viewState.hasPermission : z12, (i10 & 64) != 0 ? viewState.hasShownPermissionRationaleModal : z13, (i10 & 128) != 0 ? viewState.currentStoreChecked : z14, (i10 & 256) != 0 ? viewState.activeTripChecked : z15, (i10 & 512) != 0 ? viewState.mPerksBarcode : str, (i10 & 1024) != 0 ? viewState.currentStore : shopAndScanStore, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? viewState.activeTrip : shopAndScanTrip, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? viewState.actionButton : aVar);
        }

        public final ViewState a(boolean isLoading, AbstractC5607a loadingSpinnerMessage, hq.h modal, AbstractC5607a headerText, boolean isUserBlocked, boolean hasPermission, boolean hasShownPermissionRationaleModal, boolean currentStoreChecked, boolean activeTripChecked, String mPerksBarcode, ShopAndScanStore currentStore, ShopAndScanTrip activeTrip, a actionButton) {
            Intrinsics.j(headerText, "headerText");
            Intrinsics.j(actionButton, "actionButton");
            return new ViewState(isLoading, loadingSpinnerMessage, modal, headerText, isUserBlocked, hasPermission, hasShownPermissionRationaleModal, currentStoreChecked, activeTripChecked, mPerksBarcode, currentStore, activeTrip, actionButton);
        }

        /* renamed from: c, reason: from getter */
        public final a getActionButton() {
            return this.actionButton;
        }

        /* renamed from: d, reason: from getter */
        public final ShopAndScanTrip getActiveTrip() {
            return this.activeTrip;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getActiveTripChecked() {
            return this.activeTripChecked;
        }

        /* renamed from: f, reason: from getter */
        public final ShopAndScanStore getCurrentStore() {
            return this.currentStore;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getCurrentStoreChecked() {
            return this.currentStoreChecked;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getHasPermission() {
            return this.hasPermission;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isLoading) * 31;
            AbstractC5607a abstractC5607a = this.loadingSpinnerMessage;
            int iHashCode2 = (iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
            hq.h hVar = this.modal;
            int iHashCode3 = (((((((((((((iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.headerText.hashCode()) * 31) + Boolean.hashCode(this.isUserBlocked)) * 31) + Boolean.hashCode(this.hasPermission)) * 31) + Boolean.hashCode(this.hasShownPermissionRationaleModal)) * 31) + Boolean.hashCode(this.currentStoreChecked)) * 31) + Boolean.hashCode(this.activeTripChecked)) * 31;
            String str = this.mPerksBarcode;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            ShopAndScanStore shopAndScanStore = this.currentStore;
            int iHashCode5 = (iHashCode4 + (shopAndScanStore == null ? 0 : shopAndScanStore.hashCode())) * 31;
            ShopAndScanTrip shopAndScanTrip = this.activeTrip;
            return ((iHashCode5 + (shopAndScanTrip != null ? shopAndScanTrip.hashCode() : 0)) * 31) + this.actionButton.hashCode();
        }

        /* renamed from: i, reason: from getter */
        public final boolean getHasShownPermissionRationaleModal() {
            return this.hasShownPermissionRationaleModal;
        }

        /* renamed from: j, reason: from getter */
        public final AbstractC5607a getHeaderText() {
            return this.headerText;
        }

        /* renamed from: k, reason: from getter */
        public final AbstractC5607a getLoadingSpinnerMessage() {
            return this.loadingSpinnerMessage;
        }

        /* renamed from: l, reason: from getter */
        public final String getMPerksBarcode() {
            return this.mPerksBarcode;
        }

        /* renamed from: m, reason: from getter */
        public final hq.h getModal() {
            return this.modal;
        }

        /* renamed from: n, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: o, reason: from getter */
        public final boolean getIsUserBlocked() {
            return this.isUserBlocked;
        }

        public String toString() {
            return "ViewState(isLoading=" + this.isLoading + ", loadingSpinnerMessage=" + this.loadingSpinnerMessage + ", modal=" + this.modal + ", headerText=" + this.headerText + ", isUserBlocked=" + this.isUserBlocked + ", hasPermission=" + this.hasPermission + ", hasShownPermissionRationaleModal=" + this.hasShownPermissionRationaleModal + ", currentStoreChecked=" + this.currentStoreChecked + ", activeTripChecked=" + this.activeTripChecked + ", mPerksBarcode=" + this.mPerksBarcode + ", currentStore=" + this.currentStore + ", activeTrip=" + this.activeTrip + ", actionButton=" + this.actionButton + ')';
        }

        public /* synthetic */ ViewState(boolean z10, AbstractC5607a abstractC5607a, hq.h hVar, AbstractC5607a abstractC5607a2, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, ShopAndScanStore shopAndScanStore, ShopAndScanTrip shopAndScanTrip, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : abstractC5607a, (i10 & 4) != 0 ? null : hVar, (i10 & 8) != 0 ? AbstractC5607a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f116976h0, new Object[0]) : abstractC5607a2, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? false : z12, (i10 & 64) != 0 ? false : z13, (i10 & 128) != 0 ? false : z14, (i10 & 256) == 0 ? z15 : false, (i10 & 512) != 0 ? null : str, (i10 & 1024) != 0 ? null : shopAndScanStore, (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? shopAndScanTrip : null, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new a.C2275b() : aVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$checkForActiveTrip$1", f = "ShopAndScanLandingViewModel.kt", l = {286}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f147705a;

        /* renamed from: b, reason: collision with root package name */
        Object f147706b;

        /* renamed from: c, reason: collision with root package name */
        int f147707c;

        /* renamed from: d, reason: collision with root package name */
        int f147708d;

        /* renamed from: e, reason: collision with root package name */
        int f147709e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f147711g;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$checkForActiveTrip$1$1$1$1", f = "ShopAndScanLandingViewModel.kt", l = {279, 278}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f147712a;

            /* renamed from: b, reason: collision with root package name */
            int f147713b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f147714c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ s f147715d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f147716e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ShopAndScanStore f147717f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, String str, ShopAndScanStore shopAndScanStore, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f147715d = sVar;
                this.f147716e = str;
                this.f147717f = shopAndScanStore;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f147715d, this.f147716e, this.f147717f, continuation);
                aVar.f147714c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<ShopAndScanTrip>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
            
                if (r1.emit(r7, r6) == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r6.f147713b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r6.f147714c
                    tv.g r0 = (tv.InterfaceC17153g) r0
                    kotlin.ResultKt.b(r7)
                    goto L62
                L16:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1e:
                    java.lang.Object r1 = r6.f147712a
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    java.lang.Object r3 = r6.f147714c
                    tv.g r3 = (tv.InterfaceC17153g) r3
                    kotlin.ResultKt.b(r7)
                    kotlin.Result r7 = (kotlin.Result) r7
                    java.lang.Object r7 = r7.getValue()
                    goto L50
                L30:
                    kotlin.ResultKt.b(r7)
                    java.lang.Object r7 = r6.f147714c
                    r1 = r7
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    kq.s r7 = r6.f147715d
                    dq.a r7 = kq.s.r(r7)
                    java.lang.String r4 = r6.f147716e
                    Xp.e r5 = r6.f147717f
                    r6.f147714c = r1
                    r6.f147712a = r1
                    r6.f147713b = r3
                    java.lang.Object r7 = r7.b(r4, r5, r6)
                    if (r7 != r0) goto L4f
                    goto L61
                L4f:
                    r3 = r1
                L50:
                    kotlin.Result r7 = kotlin.Result.a(r7)
                    r6.f147714c = r3
                    r3 = 0
                    r6.f147712a = r3
                    r6.f147713b = r2
                    java.lang.Object r7 = r1.emit(r7, r6)
                    if (r7 != r0) goto L62
                L61:
                    return r0
                L62:
                    kotlin.Unit r7 = kotlin.Unit.f142422a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kq.s.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$checkForActiveTrip$1$1$1$2", f = "ShopAndScanLandingViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f147718a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f147719b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(s sVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f147719b = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f147719b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<ShopAndScanTrip>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f147718a == 0) {
                    ResultKt.b(obj);
                    this.f147719b.U(Boxing.d(com.meijer.mobile.shopandscan.e.f116899C0));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: kq.s$c$c, reason: collision with other inner class name */
        static final class C2276c<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ s f147720a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f147721b;

            C2276c(s sVar, Function0<Unit> function0) {
                this.f147720a = sVar;
                this.f147721b = function0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value;
                Object value2 = ((Result) obj).getValue();
                s sVar = this.f147720a;
                Function0<Unit> function0 = this.f147721b;
                if (Result.h(value2)) {
                    ShopAndScanTrip shopAndScanTrip = (ShopAndScanTrip) value2;
                    InterfaceC17140B interfaceC17140B = sVar._uiState;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, false, null, null, null, false, false, false, false, true, null, null, shopAndScanTrip, null, 5887, null)));
                    function0.invoke();
                }
                s sVar2 = this.f147720a;
                Throwable thE = Result.e(value2);
                if (thE != null) {
                    sVar2.T(thE);
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0<Unit> function0, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f147711g = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s.this.new c(this.f147711g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f147709e;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                String mPerksBarcode = ((ViewState) s.this._uiState.getValue()).getMPerksBarcode();
                if (mPerksBarcode != null) {
                    s sVar = s.this;
                    Function0<Unit> function0 = this.f147711g;
                    ShopAndScanStore currentStore = ((ViewState) sVar._uiState.getValue()).getCurrentStore();
                    if (currentStore != null) {
                        InterfaceC17152f interfaceC17152fP = C17154h.P(C17154h.E(new a(sVar, mPerksBarcode, currentStore, null)), new b(sVar, null));
                        C2276c c2276c = new C2276c(sVar, function0);
                        this.f147705a = mPerksBarcode;
                        this.f147706b = currentStore;
                        this.f147707c = 0;
                        this.f147708d = 0;
                        this.f147709e = 1;
                        if (interfaceC17152fP.collect(c2276c, this) == objF) {
                            return objF;
                        }
                    }
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$checkLocationPermissions$1", f = "ShopAndScanLandingViewModel.kt", l = {197}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f147722a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f147724c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "Lbq/a;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$checkLocationPermissions$1$1", f = "ShopAndScanLandingViewModel.kt", l = {190, 189}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends EnumC6277a>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f147725a;

            /* renamed from: b, reason: collision with root package name */
            int f147726b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f147727c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ s f147728d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f147728d = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f147728d, continuation);
                aVar.f147727c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<? extends EnumC6277a>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
            
                if (r1.emit(r6, r5) == r0) goto L16;
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
                    int r1 = r5.f147726b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r5.f147727c
                    tv.g r0 = (tv.InterfaceC17153g) r0
                    kotlin.ResultKt.b(r6)
                    goto L70
                L16:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1e:
                    java.lang.Object r1 = r5.f147725a
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    java.lang.Object r3 = r5.f147727c
                    tv.g r3 = (tv.InterfaceC17153g) r3
                    kotlin.ResultKt.b(r6)
                    kotlin.Result r6 = (kotlin.Result) r6
                    java.lang.Object r6 = r6.getValue()
                    goto L5e
                L30:
                    kotlin.ResultKt.b(r6)
                    java.lang.Object r6 = r5.f147727c
                    r1 = r6
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    kq.s r6 = r5.f147728d
                    bq.b r6 = kq.s.w(r6)
                    kq.s r4 = r5.f147728d
                    tv.B r4 = kq.s.D(r4)
                    java.lang.Object r4 = r4.getValue()
                    kq.s$b r4 = (kq.s.ViewState) r4
                    boolean r4 = r4.getHasShownPermissionRationaleModal()
                    r5.f147727c = r1
                    r5.f147725a = r1
                    r5.f147726b = r3
                    java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
                    java.lang.Object r6 = r6.b(r3, r4, r5)
                    if (r6 != r0) goto L5d
                    goto L6f
                L5d:
                    r3 = r1
                L5e:
                    kotlin.Result r6 = kotlin.Result.a(r6)
                    r5.f147727c = r3
                    r3 = 0
                    r5.f147725a = r3
                    r5.f147726b = r2
                    java.lang.Object r6 = r1.emit(r6, r5)
                    if (r6 != r0) goto L70
                L6f:
                    return r0
                L70:
                    kotlin.Unit r6 = kotlin.Unit.f142422a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kq.s.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "Lbq/a;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$checkLocationPermissions$1$2", f = "ShopAndScanLandingViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends EnumC6277a>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f147729a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f147730b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(s sVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f147730b = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f147730b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<? extends EnumC6277a>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f147729a == 0) {
                    ResultKt.b(obj);
                    this.f147730b.U(Boxing.d(com.meijer.mobile.shopandscan.e.f117026y));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ s f147731a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f147732b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC6277a.values().length];
                    try {
                        iArr[EnumC6277a.f60610a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC6277a.f60611b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC6277a.f60612c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            c(s sVar, Function0<Unit> function0) {
                this.f147731a = sVar;
                this.f147732b = function0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value;
                Object value2 = ((Result) obj).getValue();
                s sVar = this.f147731a;
                Function0<Unit> function0 = this.f147732b;
                if (Result.h(value2)) {
                    int i10 = a.$EnumSwitchMapping$0[((EnumC6277a) value2).ordinal()];
                    if (i10 == 1) {
                        sVar.V(AbstractC14561b.a.f136174f);
                    } else if (i10 == 2) {
                        sVar.V(AbstractC14561b.C2160b.f136175f);
                    } else {
                        if (i10 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC17140B interfaceC17140B = sVar._uiState;
                        do {
                            value = interfaceC17140B.getValue();
                        } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, false, null, null, null, false, true, false, false, false, null, null, null, null, 8159, null)));
                        function0.invoke();
                    }
                }
                s sVar2 = this.f147731a;
                Throwable thE = Result.e(value2);
                if (thE != null) {
                    sVar2.T(thE);
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0<Unit> function0, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f147724c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s.this.new d(this.f147724c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f147722a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fP = C17154h.P(C17154h.E(new a(s.this, null)), new b(s.this, null));
                c cVar = new c(s.this, this.f147724c);
                this.f147722a = 1;
                if (interfaceC17152fP.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$checkUserAuthorization$1", f = "ShopAndScanLandingViewModel.kt", l = {162}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f147733a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f147735c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "", "Lcom/meijer/mobile/shopandscan/domain/model/MPerksBarcode;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$checkUserAuthorization$1$1", f = "ShopAndScanLandingViewModel.kt", l = {160, 160}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends String>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f147736a;

            /* renamed from: b, reason: collision with root package name */
            int f147737b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f147738c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ s f147739d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f147739d = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f147739d, continuation);
                aVar.f147738c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<String>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
            
                if (r1.emit(r5, r4) == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) throws com.meijer.mobile.shopandscan.domain.model.exception.ShopAndScanUserBlockedException {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r4.f147737b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r4.f147738c
                    tv.g r0 = (tv.InterfaceC17153g) r0
                    kotlin.ResultKt.b(r5)
                    goto L5e
                L16:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1e:
                    java.lang.Object r1 = r4.f147736a
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    java.lang.Object r3 = r4.f147738c
                    tv.g r3 = (tv.InterfaceC17153g) r3
                    kotlin.ResultKt.b(r5)
                    kotlin.Result r5 = (kotlin.Result) r5
                    java.lang.Object r5 = r5.getValue()
                    goto L4c
                L30:
                    kotlin.ResultKt.b(r5)
                    java.lang.Object r5 = r4.f147738c
                    r1 = r5
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    kq.s r5 = r4.f147739d
                    Zp.a r5 = kq.s.C(r5)
                    r4.f147738c = r1
                    r4.f147736a = r1
                    r4.f147737b = r3
                    java.lang.Object r5 = r5.c(r4)
                    if (r5 != r0) goto L4b
                    goto L5d
                L4b:
                    r3 = r1
                L4c:
                    kotlin.Result r5 = kotlin.Result.a(r5)
                    r4.f147738c = r3
                    r3 = 0
                    r4.f147736a = r3
                    r4.f147737b = r2
                    java.lang.Object r5 = r1.emit(r5, r4)
                    if (r5 != r0) goto L5e
                L5d:
                    return r0
                L5e:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kq.s.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "", "Lcom/meijer/mobile/shopandscan/domain/model/MPerksBarcode;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$checkUserAuthorization$1$2", f = "ShopAndScanLandingViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends String>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f147740a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f147741b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(s sVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f147741b = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f147741b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<String>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f147740a == 0) {
                    ResultKt.b(obj);
                    this.f147741b.U(Boxing.d(com.meijer.mobile.shopandscan.e.f117026y));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ s f147742a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f147743b;

            c(s sVar, Function0<Unit> function0) {
                this.f147742a = sVar;
                this.f147743b = function0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value;
                Object value2;
                Result result = (Result) obj;
                Object value3 = result.getValue();
                s sVar = this.f147742a;
                Function0<Unit> function0 = this.f147743b;
                if (Result.h(value3)) {
                    String str = (String) value3;
                    InterfaceC17140B interfaceC17140B = sVar._uiState;
                    do {
                        value2 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value2, ViewState.b((ViewState) value2, false, null, null, null, false, false, false, false, false, str, null, null, null, 7663, null)));
                    function0.invoke();
                }
                Object value4 = result.getValue();
                s sVar2 = this.f147742a;
                Throwable thE = Result.e(value4);
                if (thE != null) {
                    if (thE instanceof ShopAndScanUserBlockedException) {
                        InterfaceC17140B interfaceC17140B2 = sVar2._uiState;
                        do {
                            value = interfaceC17140B2.getValue();
                        } while (!interfaceC17140B2.e(value, ViewState.b((ViewState) value, false, null, null, null, true, false, false, false, false, null, null, null, null, 8175, null)));
                    }
                    sVar2.T(thE);
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Function0<Unit> function0, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f147735c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s.this.new e(this.f147735c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f147733a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fP = C17154h.P(C17154h.E(new a(s.this, null)), new b(s.this, null));
                c cVar = new c(s.this, this.f147735c);
                this.f147733a = 1;
                if (interfaceC17152fP.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$dismissModal$1", f = "ShopAndScanLandingViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f147744a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f147744a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = s.this._uiState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, false, null, null, null, false, false, false, false, false, null, null, null, null, 8186, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$fetchData$1", f = "ShopAndScanLandingViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f147746a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(s sVar) {
            sVar.N();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(s sVar) {
            sVar.N();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(s sVar) {
            sVar.N();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(s sVar) {
            sVar.N();
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(s sVar) {
            sVar.N();
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f147746a == 0) {
                ResultKt.b(obj);
                s.this.M();
                if (s.this.Q().getValue().getIsUserBlocked()) {
                    final s sVar = s.this;
                    sVar.L(new Function0() { // from class: kq.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return s.g.p(sVar);
                        }
                    });
                } else if (!s.this.Q().getValue().getHasPermission()) {
                    final s sVar2 = s.this;
                    sVar2.K(new Function0() { // from class: kq.u
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return s.g.q(sVar2);
                        }
                    });
                } else if (s.this.Q().getValue().getCurrentStore() == null && !s.this.Q().getValue().getCurrentStoreChecked()) {
                    if (s.this.appVersion.getIsCertBuild()) {
                        final s sVar3 = s.this;
                        sVar3.P(new Function0() { // from class: kq.v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return s.g.r(sVar3);
                            }
                        });
                    } else {
                        final s sVar4 = s.this;
                        sVar4.O(new Function0() { // from class: kq.w
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return s.g.s(sVar4);
                            }
                        });
                    }
                } else if (s.this.Q().getValue().getCurrentStore() != null && !s.this.Q().getValue().getActiveTripChecked()) {
                    final s sVar5 = s.this;
                    sVar5.J(new Function0() { // from class: kq.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return s.g.t(sVar5);
                        }
                    });
                } else if (s.this.Q().getValue().getActiveTrip() == null || !s.this.Q().getValue().getActiveTripChecked()) {
                    s.this.W();
                } else {
                    ShopAndScanTrip activeTrip = s.this.Q().getValue().getActiveTrip();
                    if (activeTrip != null) {
                        s.this.S(activeTrip);
                    }
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$getClosestStore$1", f = "ShopAndScanLandingViewModel.kt", l = {248}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f147748a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f147750c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "LXp/e;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$getClosestStore$1$1", f = "ShopAndScanLandingViewModel.kt", l = {246, 246}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends ShopAndScanStore>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f147751a;

            /* renamed from: b, reason: collision with root package name */
            int f147752b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f147753c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ s f147754d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f147754d = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f147754d, continuation);
                aVar.f147753c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<ShopAndScanStore>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
            
                if (r1.emit(r5, r4) == r0) goto L16;
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
                    int r1 = r4.f147752b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r4.f147753c
                    tv.g r0 = (tv.InterfaceC17153g) r0
                    kotlin.ResultKt.b(r5)
                    goto L5e
                L16:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1e:
                    java.lang.Object r1 = r4.f147751a
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    java.lang.Object r3 = r4.f147753c
                    tv.g r3 = (tv.InterfaceC17153g) r3
                    kotlin.ResultKt.b(r5)
                    kotlin.Result r5 = (kotlin.Result) r5
                    java.lang.Object r5 = r5.getValue()
                    goto L4c
                L30:
                    kotlin.ResultKt.b(r5)
                    java.lang.Object r5 = r4.f147753c
                    r1 = r5
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    kq.s r5 = r4.f147754d
                    cq.b r5 = kq.s.v(r5)
                    r4.f147753c = r1
                    r4.f147751a = r1
                    r4.f147752b = r3
                    java.lang.Object r5 = r5.c(r4)
                    if (r5 != r0) goto L4b
                    goto L5d
                L4b:
                    r3 = r1
                L4c:
                    kotlin.Result r5 = kotlin.Result.a(r5)
                    r4.f147753c = r3
                    r3 = 0
                    r4.f147751a = r3
                    r4.f147752b = r2
                    java.lang.Object r5 = r1.emit(r5, r4)
                    if (r5 != r0) goto L5e
                L5d:
                    return r0
                L5e:
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kq.s.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "LXp/e;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$getClosestStore$1$2", f = "ShopAndScanLandingViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends ShopAndScanStore>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f147755a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f147756b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(s sVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f147756b = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f147756b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<ShopAndScanStore>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f147755a == 0) {
                    ResultKt.b(obj);
                    this.f147756b.U(Boxing.d(com.meijer.mobile.shopandscan.e.f116908F0));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ s f147757a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f147758b;

            c(s sVar, Function0<Unit> function0) {
                this.f147757a = sVar;
                this.f147758b = function0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object obj2;
                Object value;
                Object value2 = ((Result) obj).getValue();
                s sVar = this.f147757a;
                Function0<Unit> function0 = this.f147758b;
                if (Result.h(value2)) {
                    ShopAndScanStore shopAndScanStore = (ShopAndScanStore) value2;
                    if (shopAndScanStore != null) {
                        uw.a.INSTANCE.x("ShopAndScan").q("Setting 'shopAndScanStoreId' as user property for FullStory: " + shopAndScanStore.getId(), new Object[0]);
                        FS.setUserVars(MapsKt.g(TuplesKt.a("shopAndScanStoreId", String.valueOf(shopAndScanStore.getId()))));
                        InterfaceC17140B interfaceC17140B = sVar._uiState;
                        while (true) {
                            Object value3 = interfaceC17140B.getValue();
                            obj2 = value2;
                            if (interfaceC17140B.e(value3, ViewState.b((ViewState) value3, false, null, null, null, false, false, false, false, false, null, shopAndScanStore, null, null, 7167, null))) {
                                break;
                            }
                            value2 = obj2;
                        }
                    } else {
                        obj2 = value2;
                    }
                    InterfaceC17140B interfaceC17140B2 = sVar._uiState;
                    do {
                        value = interfaceC17140B2.getValue();
                    } while (!interfaceC17140B2.e(value, ViewState.b((ViewState) value, false, null, null, null, false, false, false, true, false, null, null, null, null, 8063, null)));
                    function0.invoke();
                } else {
                    obj2 = value2;
                }
                s sVar2 = this.f147757a;
                Throwable thE = Result.e(obj2);
                if (thE != null) {
                    sVar2.T(thE);
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Function0<Unit> function0, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f147750c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s.this.new h(this.f147750c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f147748a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fP = C17154h.P(C17154h.E(new a(s.this, null)), new b(s.this, null));
                c cVar = new c(s.this, this.f147750c);
                this.f147748a = 1;
                if (interfaceC17152fP.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$getTestStore$1", f = "ShopAndScanLandingViewModel.kt", l = {226}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f147759a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f147761c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv/g;", "LXp/e;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$getTestStore$1$1", f = "ShopAndScanLandingViewModel.kt", l = {224}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super ShopAndScanStore>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f147762a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f147763b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ s f147764c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f147764c = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f147764c, continuation);
                aVar.f147763b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super ShopAndScanStore> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f147762a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f147763b;
                    ShopAndScanStore shopAndScanStoreA = this.f147764c.testStoreUseCase.a();
                    this.f147763b = interfaceC17153g;
                    this.f147762a = 1;
                    if (interfaceC17153g.emit(shopAndScanStoreA, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv/g;", "LXp/e;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$getTestStore$1$2", f = "ShopAndScanLandingViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC17153g<? super ShopAndScanStore>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f147765a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f147766b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(s sVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f147766b = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f147766b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super ShopAndScanStore> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f147765a == 0) {
                    ResultKt.b(obj);
                    this.f147766b.U(Boxing.d(com.meijer.mobile.shopandscan.e.f116908F0));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ s f147767a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f147768b;

            c(s sVar, Function0<Unit> function0) {
                this.f147767a = sVar;
                this.f147768b = function0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(ShopAndScanStore shopAndScanStore, Continuation<? super Unit> continuation) {
                Object value;
                Object value2;
                s sVar = this.f147767a;
                uw.a.INSTANCE.x("ShopAndScan");
                InterfaceC17140B interfaceC17140B = sVar._uiState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, false, null, null, null, false, false, false, false, false, null, shopAndScanStore, null, null, 7167, null)));
                InterfaceC17140B interfaceC17140B2 = this.f147767a._uiState;
                do {
                    value2 = interfaceC17140B2.getValue();
                } while (!interfaceC17140B2.e(value2, ViewState.b((ViewState) value2, false, null, null, null, false, false, false, true, false, null, null, null, null, 8063, null)));
                this.f147768b.invoke();
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function0<Unit> function0, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f147761c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s.this.new i(this.f147761c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f147759a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fP = C17154h.P(C17154h.E(new a(s.this, null)), new b(s.this, null));
                c cVar = new c(s.this, this.f147761c);
                this.f147759a = 1;
                if (interfaceC17152fP.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$resumeTrip$1", f = "ShopAndScanLandingViewModel.kt", l = {329}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f147769a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShopAndScanTrip f147771c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$resumeTrip$1$1", f = "ShopAndScanLandingViewModel.kt", l = {327, 327}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f147772a;

            /* renamed from: b, reason: collision with root package name */
            int f147773b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f147774c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ s f147775d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ShopAndScanTrip f147776e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, ShopAndScanTrip shopAndScanTrip, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f147775d = sVar;
                this.f147776e = shopAndScanTrip;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f147775d, this.f147776e, continuation);
                aVar.f147774c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<ShopAndScanTrip>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
            
                if (r1.emit(r6, r5) == r0) goto L16;
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
                    int r1 = r5.f147773b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r5.f147774c
                    tv.g r0 = (tv.InterfaceC17153g) r0
                    kotlin.ResultKt.b(r6)
                    goto L60
                L16:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1e:
                    java.lang.Object r1 = r5.f147772a
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    java.lang.Object r3 = r5.f147774c
                    tv.g r3 = (tv.InterfaceC17153g) r3
                    kotlin.ResultKt.b(r6)
                    kotlin.Result r6 = (kotlin.Result) r6
                    java.lang.Object r6 = r6.getValue()
                    goto L4e
                L30:
                    kotlin.ResultKt.b(r6)
                    java.lang.Object r6 = r5.f147774c
                    r1 = r6
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    kq.s r6 = r5.f147775d
                    dq.c r6 = kq.s.x(r6)
                    Xp.f r4 = r5.f147776e
                    r5.f147774c = r1
                    r5.f147772a = r1
                    r5.f147773b = r3
                    java.lang.Object r6 = r6.b(r4, r5)
                    if (r6 != r0) goto L4d
                    goto L5f
                L4d:
                    r3 = r1
                L4e:
                    kotlin.Result r6 = kotlin.Result.a(r6)
                    r5.f147774c = r3
                    r3 = 0
                    r5.f147772a = r3
                    r5.f147773b = r2
                    java.lang.Object r6 = r1.emit(r6, r5)
                    if (r6 != r0) goto L60
                L5f:
                    return r0
                L60:
                    kotlin.Unit r6 = kotlin.Unit.f142422a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kq.s.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$resumeTrip$1$2", f = "ShopAndScanLandingViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f147777a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f147778b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(s sVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f147778b = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f147778b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<ShopAndScanTrip>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f147777a == 0) {
                    ResultKt.b(obj);
                    this.f147778b.U(Boxing.d(com.meijer.mobile.shopandscan.e.f117019v1));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ShopAndScanTrip f147779a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f147780b;

            c(ShopAndScanTrip shopAndScanTrip, s sVar) {
                this.f147779a = shopAndScanTrip;
                this.f147780b = sVar;
            }

            @Override // tv.InterfaceC17153g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value = ((Result) obj).getValue();
                ShopAndScanTrip shopAndScanTrip = this.f147779a;
                s sVar = this.f147780b;
                if (Result.h(value)) {
                    if (shopAndScanTrip.getIsCheckoutInProgress()) {
                        sVar.navigationManager.b(C18085d.a.b.f169851b);
                    } else {
                        sVar.navigationManager.b(C18085d.a.C2730a.f169850b);
                    }
                }
                s sVar2 = this.f147780b;
                Throwable thE = Result.e(value);
                if (thE != null) {
                    sVar2.T(thE);
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ShopAndScanTrip shopAndScanTrip, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f147771c = shopAndScanTrip;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s.this.new j(this.f147771c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f147769a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fP = C17154h.P(C17154h.E(new a(s.this, this.f147771c, null)), new b(s.this, null));
                c cVar = new c(this.f147771c, s.this);
                this.f147769a = 1;
                if (interfaceC17152fP.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$showLoadingSpinner$1", f = "ShopAndScanLandingViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f147781a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f147783c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Integer num, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f147783c = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s.this.new k(this.f147783c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f147781a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = s.this._uiState;
            Integer num = this.f147783c;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, true, num != null ? AbstractC5607a.INSTANCE.d(num.intValue(), new Object[0]) : null, null, null, false, false, false, false, false, null, null, null, null, 8188, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$showModal$1", f = "ShopAndScanLandingViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f147784a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ hq.h f147785b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s f147786c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(hq.h hVar, s sVar, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f147785b = hVar;
            this.f147786c = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new l(this.f147785b, this.f147786c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            IntrinsicsKt.f();
            if (this.f147784a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            if (this.f147785b instanceof AbstractC14561b) {
                InterfaceC17140B interfaceC17140B = this.f147786c._uiState;
                do {
                    value2 = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value2, ViewState.b((ViewState) value2, false, null, null, null, false, false, true, false, false, null, null, null, null, 8127, null)));
            }
            InterfaceC17140B interfaceC17140B2 = this.f147786c._uiState;
            hq.h hVar = this.f147785b;
            do {
                value = interfaceC17140B2.getValue();
            } while (!interfaceC17140B2.e(value, ViewState.b((ViewState) value, false, null, hVar, null, false, false, false, false, false, null, null, null, null, 8187, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$showUI$nearbyStoreUI$1$1", f = "ShopAndScanLandingViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class m extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f147787a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShopAndScanStore f147789c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(ShopAndScanStore shopAndScanStore, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f147789c = shopAndScanStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s.this.new m(this.f147789c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f147787a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = s.this._uiState;
            ShopAndScanStore shopAndScanStore = this.f147789c;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, false, null, null, AbstractC5607a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f116947W0, shopAndScanStore.getName()), false, false, false, false, false, null, null, null, new ViewState.a.c(), 4086, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$showUI$outOfRangeUI$1", f = "ShopAndScanLandingViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f147790a;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f147790a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17140B interfaceC17140B = s.this._uiState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, false, null, null, AbstractC5607a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f116931O0, new Object[0]), false, false, false, false, false, null, null, null, new ViewState.a.C2274a(), 4086, null)));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$startTrip$1$1$1", f = "ShopAndScanLandingViewModel.kt", l = {312}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f147792a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f147794c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShopAndScanStore f147795d;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$startTrip$1$1$1$1", f = "ShopAndScanLandingViewModel.kt", l = {308, 308}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f147796a;

            /* renamed from: b, reason: collision with root package name */
            int f147797b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f147798c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ s f147799d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f147800e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ShopAndScanStore f147801f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, String str, ShopAndScanStore shopAndScanStore, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f147799d = sVar;
                this.f147800e = str;
                this.f147801f = shopAndScanStore;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f147799d, this.f147800e, this.f147801f, continuation);
                aVar.f147798c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<ShopAndScanTrip>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
            
                if (r1.emit(r7, r6) == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r6.f147797b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L30
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r6.f147798c
                    tv.g r0 = (tv.InterfaceC17153g) r0
                    kotlin.ResultKt.b(r7)
                    goto L62
                L16:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1e:
                    java.lang.Object r1 = r6.f147796a
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    java.lang.Object r3 = r6.f147798c
                    tv.g r3 = (tv.InterfaceC17153g) r3
                    kotlin.ResultKt.b(r7)
                    kotlin.Result r7 = (kotlin.Result) r7
                    java.lang.Object r7 = r7.getValue()
                    goto L50
                L30:
                    kotlin.ResultKt.b(r7)
                    java.lang.Object r7 = r6.f147798c
                    r1 = r7
                    tv.g r1 = (tv.InterfaceC17153g) r1
                    kq.s r7 = r6.f147799d
                    dq.d r7 = kq.s.y(r7)
                    java.lang.String r4 = r6.f147800e
                    Xp.e r5 = r6.f147801f
                    r6.f147798c = r1
                    r6.f147796a = r1
                    r6.f147797b = r3
                    java.lang.Object r7 = r7.e(r4, r5, r6)
                    if (r7 != r0) goto L4f
                    goto L61
                L4f:
                    r3 = r1
                L50:
                    kotlin.Result r7 = kotlin.Result.a(r7)
                    r6.f147798c = r3
                    r3 = 0
                    r6.f147796a = r3
                    r6.f147797b = r2
                    java.lang.Object r7 = r1.emit(r7, r6)
                    if (r7 != r0) goto L62
                L61:
                    return r0
                L62:
                    kotlin.Unit r7 = kotlin.Unit.f142422a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kq.s.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "LXp/f;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.landing.ShopAndScanLandingViewModel$startTrip$1$1$1$2", f = "ShopAndScanLandingViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends ShopAndScanTrip>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f147802a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f147803b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(s sVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f147803b = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f147803b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super Result<ShopAndScanTrip>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f147802a == 0) {
                    ResultKt.b(obj);
                    this.f147803b.U(Boxing.d(com.meijer.mobile.shopandscan.e.f116905E0));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ s f147804a;

            c(s sVar) {
                this.f147804a = sVar;
            }

            @Override // tv.InterfaceC17153g
            public final Object emit(Object obj, Continuation<? super Unit> continuation) {
                Object value = ((Result) obj).getValue();
                s sVar = this.f147804a;
                if (Result.h(value)) {
                    FS.setUserVars(MapsKt.g(TuplesKt.a("shopAndScanTransactionId", ((ShopAndScanTrip) value).getTripId())));
                    sVar.navigationManager.b(C18085d.a.C2730a.f169850b);
                }
                s sVar2 = this.f147804a;
                if (Result.e(value) != null) {
                    sVar2.V(AbstractC14560a.g.f136166e);
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, ShopAndScanStore shopAndScanStore, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f147794c = str;
            this.f147795d = shopAndScanStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s.this.new o(this.f147794c, this.f147795d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f147792a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f interfaceC17152fP = C17154h.P(C17154h.E(new a(s.this, this.f147794c, this.f147795d, null)), new b(s.this, null));
                c cVar = new c(s.this);
                this.f147792a = 1;
                if (interfaceC17152fP.collect(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public s(AppVersion appVersion, C18085d navigationManager, Zp.a userAuthorizationUseCase, C6278b permissionsUseCase, C13415c testStoreUseCase, C13414b nearbyStoreUseCase, C13553a activeTripUseCase, C13556d startTripUseCase, C13555c resumeTripUseCase) {
        Intrinsics.j(appVersion, "appVersion");
        Intrinsics.j(navigationManager, "navigationManager");
        Intrinsics.j(userAuthorizationUseCase, "userAuthorizationUseCase");
        Intrinsics.j(permissionsUseCase, "permissionsUseCase");
        Intrinsics.j(testStoreUseCase, "testStoreUseCase");
        Intrinsics.j(nearbyStoreUseCase, "nearbyStoreUseCase");
        Intrinsics.j(activeTripUseCase, "activeTripUseCase");
        Intrinsics.j(startTripUseCase, "startTripUseCase");
        Intrinsics.j(resumeTripUseCase, "resumeTripUseCase");
        this.appVersion = appVersion;
        this.navigationManager = navigationManager;
        this.userAuthorizationUseCase = userAuthorizationUseCase;
        this.permissionsUseCase = permissionsUseCase;
        this.testStoreUseCase = testStoreUseCase;
        this.nearbyStoreUseCase = nearbyStoreUseCase;
        this.activeTripUseCase = activeTripUseCase;
        this.startTripUseCase = startTripUseCase;
        this.resumeTripUseCase = resumeTripUseCase;
        this._uiState = S.a(new ViewState(false, null, null, null, false, false, false, false, false, null, null, null, null, 8191, null));
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        C0 c02 = this.fetchingData;
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
        this.fetchingData = C16648k.d(d0.a(this), null, null, new g(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Throwable exception) {
        if (exception instanceof SocketTimeoutException) {
            V(AbstractC14560a.h.f136167e);
            return;
        }
        if (exception instanceof PermissionsException) {
            V(AbstractC14561b.C2160b.f136175f);
            return;
        }
        if (exception instanceof NullLocationException) {
            V(AbstractC14560a.b.f136161e);
        } else if (exception instanceof ShopAndScanUserBlockedException) {
            V(AbstractC14560a.i.f136168e);
        } else {
            V(AbstractC14560a.g.f136166e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W() {
        if (this._uiState.getValue().getCurrentStore() != null) {
            X(this);
        } else {
            Y(this);
        }
    }

    private static final void X(s sVar) {
        ShopAndScanStore currentStore = sVar._uiState.getValue().getCurrentStore();
        if (currentStore != null) {
            C16648k.d(d0.a(sVar), null, null, sVar.new m(currentStore, null), 3, null);
        }
    }

    private final void Z() {
        ShopAndScanStore currentStore;
        String mPerksBarcode = this._uiState.getValue().getMPerksBarcode();
        if (mPerksBarcode == null || (currentStore = this._uiState.getValue().getCurrentStore()) == null) {
            return;
        }
        C16648k.d(d0.a(this), null, null, new o(mPerksBarcode, currentStore, null), 3, null);
    }

    public final P<ViewState> Q() {
        return C17154h.c(this._uiState);
    }

    public final void R(a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.b) {
            N();
            return;
        }
        if (action instanceof a.e) {
            Z();
            return;
        }
        if (action instanceof a.C2273a) {
            M();
        } else if (action instanceof a.c) {
            this.navigationManager.b(C18085d.a.i.f169858b);
        } else {
            if (!(action instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigationManager.b(C18085d.a.h.f169857b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Function0<Unit> callback) {
        C16648k.d(d0.a(this), null, null, new c(callback, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(Function0<Unit> callback) {
        C16648k.d(d0.a(this), null, null, new d(callback, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(Function0<Unit> callback) {
        C16648k.d(d0.a(this), null, null, new e(callback, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        C16648k.d(d0.a(this), null, null, new f(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(Function0<Unit> callback) {
        C16648k.d(d0.a(this), null, null, new h(callback, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Function0<Unit> callback) {
        C16648k.d(d0.a(this), null, null, new i(callback, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(ShopAndScanTrip activeTrip) {
        C16648k.d(d0.a(this), null, null, new j(activeTrip, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(Integer messageRes) {
        C16648k.d(d0.a(this), null, null, new k(messageRes, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(hq.h modal) {
        C16648k.d(d0.a(this), null, null, new l(modal, this, null), 3, null);
    }

    private static final void Y(s sVar) {
        C16648k.d(d0.a(sVar), null, null, sVar.new n(null), 3, null);
    }
}
