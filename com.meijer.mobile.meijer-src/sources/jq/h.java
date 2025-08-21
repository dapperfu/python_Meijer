package jq;

import Xp.ShopAndScanItem;
import Xp.ShopAndScanTrip;
import Xp.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import hq.ShopAndScanCheckoutSummaryDecorator;
import java.util.List;
import jq.h;
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
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.Z;
import pv.C16563h;
import pv.InterfaceC16561f;
import wj.C17896a;
import xq.C18213d;
import zq.AbstractC18543a;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\b.\u001a'38\u001e\u001c B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010+\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u00100\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0$8\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*R#\u00105\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002020$8\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u000207068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Ljq/h;", "Landroidx/lifecycle/c0;", "Lxq/d;", "navManager", "LWp/a;", "shopAndScanRepository", "LDl/e;", "meijerIntent", "Lzq/d;", "scannerController", "<init>", "(Lxq/d;LWp/a;LDl/e;Lzq/d;)V", "", "r", "()V", "o", "p", "", "permission", "Lmv/C0;", "q", "(Z)Lmv/C0;", "Ljq/h$b;", "event", "u", "(Ljq/h$b;)V", "a", "Lxq/d;", "b", "LWp/a;", "c", "LDl/e;", "d", "Lzq/d;", "getScannerController", "()Lzq/d;", "Lwj/a;", "Ljq/h$f;", "", "e", "Lwj/a;", "s", "()Lwj/a;", "checkoutModelStore", "Ljq/h$e;", "Ljq/h$c;", "f", "t", "checkoutScanModelStore", "Ljq/h$g;", "", "g", "getTransferModelStore", "transferModelStore", "", "LXp/a;", "h", "Ljava/util/List;", "getEnabledBarcodeSymbologies", "()Ljava/util/List;", "enabledBarcodeSymbologies", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18213d navManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Wp.a shopAndScanRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Dl.e meijerIntent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zq.d scannerController;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C17896a checkoutModelStore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C17896a<CheckoutScanState, c> checkoutScanModelStore;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C17896a<TransferState, Object> transferModelStore;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<Xp.a> enabledBarcodeSymbologies;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Ljq/h$a;", "", "<init>", "()V", "a", "Ljq/h$a$a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljq/h$a$a;", "Ljq/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jq.h$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2234a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2234a f141152a = new C2234a();

            private C2234a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2234a);
            }

            public String toString() {
                return "None";
            }

            public int hashCode() {
                return -1765987972;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Ljq/h$b;", "", "<init>", "()V", "b", "a", "Ljq/h$b$a;", "Ljq/h$b$b;", "Ljq/h$d;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljq/h$b$a;", "Ljq/h$b;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends b {
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljq/h$b$b;", "Ljq/h$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jq.h$b$b, reason: collision with other inner class name */
        public static final /* data */ class C2235b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C2235b f141153a = new C2235b();

            private C2235b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2235b);
            }

            public String toString() {
                return "CheckoutStart";
            }

            public int hashCode() {
                return 458410374;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Ljq/h$c;", "", "<init>", "()V", "a", "Ljq/h$c$a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljq/h$c$a;", "Ljq/h$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f141154a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "RequestCameraPermission";
            }

            public int hashCode() {
                return 2045142245;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Ljq/h$d;", "Ljq/h$b;", "<init>", "()V", "a", "Ljq/h$d$a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d extends b {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Ljq/h$d$a;", "Ljq/h$d;", "", "hasCameraPermission", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jq.h$d$a, reason: from toString */
        public static final /* data */ class CheckCameraPermission extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean hasCameraPermission;

            public CheckCameraPermission() {
                this(false, 1, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckCameraPermission) && this.hasCameraPermission == ((CheckCameraPermission) other).hasCameraPermission;
            }

            public /* synthetic */ CheckCameraPermission(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? false : z10);
            }

            /* renamed from: a, reason: from getter */
            public final boolean getHasCameraPermission() {
                return this.hasCameraPermission;
            }

            public int hashCode() {
                return Boolean.hashCode(this.hasCameraPermission);
            }

            public String toString() {
                return "CheckCameraPermission(hasCameraPermission=" + this.hasCameraPermission + ')';
            }

            public CheckCameraPermission(boolean z10) {
                super(null);
                this.hasCameraPermission = z10;
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJB\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\b\u0010\u0017¨\u0006 "}, d2 = {"Ljq/h$e;", "", "", "isScanEnabled", "showCameraPreview", "Lzq/a;", "currentCameraLens", "isFlashOn", "isScanSoundOn", "<init>", "(ZZLzq/a;ZZ)V", "a", "(ZZLzq/a;ZZ)Ljq/h$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "b", "getShowCameraPreview", "c", "Lzq/a;", "getCurrentCameraLens", "()Lzq/a;", "d", "e", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jq.h$e, reason: from toString */
    public static final /* data */ class CheckoutScanState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isScanEnabled;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showCameraPreview;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC18543a currentCameraLens;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFlashOn;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isScanSoundOn;

        public CheckoutScanState() {
            this(false, false, null, false, false, 31, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckoutScanState)) {
                return false;
            }
            CheckoutScanState checkoutScanState = (CheckoutScanState) other;
            return this.isScanEnabled == checkoutScanState.isScanEnabled && this.showCameraPreview == checkoutScanState.showCameraPreview && Intrinsics.e(this.currentCameraLens, checkoutScanState.currentCameraLens) && this.isFlashOn == checkoutScanState.isFlashOn && this.isScanSoundOn == checkoutScanState.isScanSoundOn;
        }

        public CheckoutScanState(boolean z10, boolean z11, AbstractC18543a currentCameraLens, boolean z12, boolean z13) {
            Intrinsics.j(currentCameraLens, "currentCameraLens");
            this.isScanEnabled = z10;
            this.showCameraPreview = z11;
            this.currentCameraLens = currentCameraLens;
            this.isFlashOn = z12;
            this.isScanSoundOn = z13;
        }

        public static /* synthetic */ CheckoutScanState b(CheckoutScanState checkoutScanState, boolean z10, boolean z11, AbstractC18543a abstractC18543a, boolean z12, boolean z13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = checkoutScanState.isScanEnabled;
            }
            if ((i10 & 2) != 0) {
                z11 = checkoutScanState.showCameraPreview;
            }
            if ((i10 & 4) != 0) {
                abstractC18543a = checkoutScanState.currentCameraLens;
            }
            if ((i10 & 8) != 0) {
                z12 = checkoutScanState.isFlashOn;
            }
            if ((i10 & 16) != 0) {
                z13 = checkoutScanState.isScanSoundOn;
            }
            boolean z14 = z13;
            AbstractC18543a abstractC18543a2 = abstractC18543a;
            return checkoutScanState.a(z10, z11, abstractC18543a2, z12, z14);
        }

        public final CheckoutScanState a(boolean isScanEnabled, boolean showCameraPreview, AbstractC18543a currentCameraLens, boolean isFlashOn, boolean isScanSoundOn) {
            Intrinsics.j(currentCameraLens, "currentCameraLens");
            return new CheckoutScanState(isScanEnabled, showCameraPreview, currentCameraLens, isFlashOn, isScanSoundOn);
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isScanEnabled) * 31) + Boolean.hashCode(this.showCameraPreview)) * 31) + this.currentCameraLens.hashCode()) * 31) + Boolean.hashCode(this.isFlashOn)) * 31) + Boolean.hashCode(this.isScanSoundOn);
        }

        public String toString() {
            return "CheckoutScanState(isScanEnabled=" + this.isScanEnabled + ", showCameraPreview=" + this.showCameraPreview + ", currentCameraLens=" + this.currentCameraLens + ", isFlashOn=" + this.isFlashOn + ", isScanSoundOn=" + this.isScanSoundOn + ')';
        }

        public /* synthetic */ CheckoutScanState(boolean z10, boolean z11, AbstractC18543a abstractC18543a, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? AbstractC18543a.b.f173167a : abstractC18543a, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? true : z13);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0096\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b.\u0010*R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010*R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u0010*R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b'\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b,\u0010\u0019¨\u0006>"}, d2 = {"Ljq/h$f;", "", "Ljq/h$a;", "dialogState", "", "loaderState", "", "itemTotal", "deposit", "estimatedTaxes", "subTotal", "savings", "teamMemberDiscount", "rewards", "totalSavings", "estimatedTotal", "Lhq/d;", "decorator", "", "greenvilleBarcode", "<init>", "(Ljq/h$a;ZDDDDDDDDDLhq/d;Ljava/lang/String;)V", "a", "(Ljq/h$a;ZDDDDDDDDDLhq/d;Ljava/lang/String;)Ljq/h$f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljq/h$a;", "d", "()Ljq/h$a;", "b", "Z", "f", "()Z", "c", "D", "getItemTotal", "()D", "getDeposit", "e", "getEstimatedTaxes", "getSubTotal", "g", "getSavings", "h", "getTeamMemberDiscount", "i", "getRewards", "j", "getTotalSavings", "k", "getEstimatedTotal", "l", "Lhq/d;", "()Lhq/d;", "m", "Ljava/lang/String;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jq.h$f, reason: from toString */
    public static final /* data */ class CheckoutState {

        /* renamed from: n, reason: collision with root package name */
        public static final int f141161n = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a dialogState;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean loaderState;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final double itemTotal;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final double deposit;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final double estimatedTaxes;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final double subTotal;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final double savings;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final double teamMemberDiscount;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final double rewards;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final double totalSavings;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final double estimatedTotal;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShopAndScanCheckoutSummaryDecorator decorator;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String greenvilleBarcode;

        public CheckoutState() {
            this(null, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 8191, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckoutState)) {
                return false;
            }
            CheckoutState checkoutState = (CheckoutState) other;
            return Intrinsics.e(this.dialogState, checkoutState.dialogState) && this.loaderState == checkoutState.loaderState && Double.compare(this.itemTotal, checkoutState.itemTotal) == 0 && Double.compare(this.deposit, checkoutState.deposit) == 0 && Double.compare(this.estimatedTaxes, checkoutState.estimatedTaxes) == 0 && Double.compare(this.subTotal, checkoutState.subTotal) == 0 && Double.compare(this.savings, checkoutState.savings) == 0 && Double.compare(this.teamMemberDiscount, checkoutState.teamMemberDiscount) == 0 && Double.compare(this.rewards, checkoutState.rewards) == 0 && Double.compare(this.totalSavings, checkoutState.totalSavings) == 0 && Double.compare(this.estimatedTotal, checkoutState.estimatedTotal) == 0 && Intrinsics.e(this.decorator, checkoutState.decorator) && Intrinsics.e(this.greenvilleBarcode, checkoutState.greenvilleBarcode);
        }

        public CheckoutState(a dialogState, boolean z10, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, ShopAndScanCheckoutSummaryDecorator shopAndScanCheckoutSummaryDecorator, String str) {
            Intrinsics.j(dialogState, "dialogState");
            this.dialogState = dialogState;
            this.loaderState = z10;
            this.itemTotal = d10;
            this.deposit = d11;
            this.estimatedTaxes = d12;
            this.subTotal = d13;
            this.savings = d14;
            this.teamMemberDiscount = d15;
            this.rewards = d16;
            this.totalSavings = d17;
            this.estimatedTotal = d18;
            this.decorator = shopAndScanCheckoutSummaryDecorator;
            this.greenvilleBarcode = str;
        }

        public static /* synthetic */ CheckoutState b(CheckoutState checkoutState, a aVar, boolean z10, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, ShopAndScanCheckoutSummaryDecorator shopAndScanCheckoutSummaryDecorator, String str, int i10, Object obj) {
            return checkoutState.a((i10 & 1) != 0 ? checkoutState.dialogState : aVar, (i10 & 2) != 0 ? checkoutState.loaderState : z10, (i10 & 4) != 0 ? checkoutState.itemTotal : d10, (i10 & 8) != 0 ? checkoutState.deposit : d11, (i10 & 16) != 0 ? checkoutState.estimatedTaxes : d12, (i10 & 32) != 0 ? checkoutState.subTotal : d13, (i10 & 64) != 0 ? checkoutState.savings : d14, (i10 & 128) != 0 ? checkoutState.teamMemberDiscount : d15, (i10 & 256) != 0 ? checkoutState.rewards : d16, (i10 & 512) != 0 ? checkoutState.totalSavings : d17, (i10 & 1024) != 0 ? checkoutState.estimatedTotal : d18, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? checkoutState.decorator : shopAndScanCheckoutSummaryDecorator, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? checkoutState.greenvilleBarcode : str);
        }

        public final CheckoutState a(a dialogState, boolean loaderState, double itemTotal, double deposit, double estimatedTaxes, double subTotal, double savings, double teamMemberDiscount, double rewards, double totalSavings, double estimatedTotal, ShopAndScanCheckoutSummaryDecorator decorator, String greenvilleBarcode) {
            Intrinsics.j(dialogState, "dialogState");
            return new CheckoutState(dialogState, loaderState, itemTotal, deposit, estimatedTaxes, subTotal, savings, teamMemberDiscount, rewards, totalSavings, estimatedTotal, decorator, greenvilleBarcode);
        }

        /* renamed from: c, reason: from getter */
        public final ShopAndScanCheckoutSummaryDecorator getDecorator() {
            return this.decorator;
        }

        /* renamed from: d, reason: from getter */
        public final a getDialogState() {
            return this.dialogState;
        }

        /* renamed from: e, reason: from getter */
        public final String getGreenvilleBarcode() {
            return this.greenvilleBarcode;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getLoaderState() {
            return this.loaderState;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((this.dialogState.hashCode() * 31) + Boolean.hashCode(this.loaderState)) * 31) + Double.hashCode(this.itemTotal)) * 31) + Double.hashCode(this.deposit)) * 31) + Double.hashCode(this.estimatedTaxes)) * 31) + Double.hashCode(this.subTotal)) * 31) + Double.hashCode(this.savings)) * 31) + Double.hashCode(this.teamMemberDiscount)) * 31) + Double.hashCode(this.rewards)) * 31) + Double.hashCode(this.totalSavings)) * 31) + Double.hashCode(this.estimatedTotal)) * 31;
            ShopAndScanCheckoutSummaryDecorator shopAndScanCheckoutSummaryDecorator = this.decorator;
            int iHashCode2 = (iHashCode + (shopAndScanCheckoutSummaryDecorator == null ? 0 : shopAndScanCheckoutSummaryDecorator.hashCode())) * 31;
            String str = this.greenvilleBarcode;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "CheckoutState(dialogState=" + this.dialogState + ", loaderState=" + this.loaderState + ", itemTotal=" + this.itemTotal + ", deposit=" + this.deposit + ", estimatedTaxes=" + this.estimatedTaxes + ", subTotal=" + this.subTotal + ", savings=" + this.savings + ", teamMemberDiscount=" + this.teamMemberDiscount + ", rewards=" + this.rewards + ", totalSavings=" + this.totalSavings + ", estimatedTotal=" + this.estimatedTotal + ", decorator=" + this.decorator + ", greenvilleBarcode=" + this.greenvilleBarcode + ')';
        }

        public /* synthetic */ CheckoutState(a aVar, boolean z10, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, ShopAndScanCheckoutSummaryDecorator shopAndScanCheckoutSummaryDecorator, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? a.C2234a.f141152a : aVar, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? 0.0d : d10, (i10 & 8) != 0 ? 0.0d : d11, (i10 & 16) != 0 ? 0.0d : d12, (i10 & 32) != 0 ? 0.0d : d13, (i10 & 64) != 0 ? 0.0d : d14, (i10 & 128) != 0 ? 0.0d : d15, (i10 & 256) != 0 ? 0.0d : d16, (i10 & 512) != 0 ? 0.0d : d17, (i10 & 1024) == 0 ? d18 : 0.0d, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : shopAndScanCheckoutSummaryDecorator, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ljq/h$g;", "", "", "loaderState", "Ljq/h$h;", "successState", "<init>", "(ZLjq/h$h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getLoaderState", "()Z", "b", "Ljq/h$h;", "getSuccessState", "()Ljq/h$h;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jq.h$g, reason: from toString */
    public static final /* data */ class TransferState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean loaderState;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC2236h successState;

        /* JADX WARN: Multi-variable type inference failed */
        public TransferState() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransferState)) {
                return false;
            }
            TransferState transferState = (TransferState) other;
            return this.loaderState == transferState.loaderState && Intrinsics.e(this.successState, transferState.successState);
        }

        public TransferState(boolean z10, AbstractC2236h successState) {
            Intrinsics.j(successState, "successState");
            this.loaderState = z10;
            this.successState = successState;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.loaderState) * 31) + this.successState.hashCode();
        }

        public String toString() {
            return "TransferState(loaderState=" + this.loaderState + ", successState=" + this.successState + ')';
        }

        public /* synthetic */ TransferState(boolean z10, AbstractC2236h abstractC2236h, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? AbstractC2236h.a.f141177a : abstractC2236h);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Ljq/h$h;", "", "<init>", "()V", "a", "Ljq/h$h$a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jq.h$h, reason: collision with other inner class name */
    public static abstract class AbstractC2236h {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljq/h$h$a;", "Ljq/h$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jq.h$h$a */
        public static final /* data */ class a extends AbstractC2236h {

            /* renamed from: a, reason: collision with root package name */
            public static final a f141177a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "None";
            }

            public int hashCode() {
                return -108975094;
            }
        }

        public /* synthetic */ AbstractC2236h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC2236h() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.checkout.ShopAndScanCheckoutViewModel$buildOrder$1", f = "ShopAndScanCheckoutViewModel.kt", l = {228}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f141178a;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXp/f;", "trip", "", "<anonymous>", "(LXp/f;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.checkout.ShopAndScanCheckoutViewModel$buildOrder$1$1", f = "ShopAndScanCheckoutViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class a extends SuspendLambda implements Function2<ShopAndScanTrip, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f141180a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f141181b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f141182c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f141182c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f141182c, continuation);
                aVar.f141181b = obj;
                return aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CheckoutState k(ShopAndScanTrip shopAndScanTrip, CheckoutState checkoutState) {
                String greenvilleBarcode = shopAndScanTrip.getGreenvilleBarcode();
                AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                return CheckoutState.b(checkoutState, null, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, new ShopAndScanCheckoutSummaryDecorator(companion.d(com.meijer.mobile.shopandscan.e.f117938n, Double.valueOf(shopAndScanTrip.getCartDetails().getWasTotal())), companion.d(com.meijer.mobile.shopandscan.e.f117938n, Double.valueOf(shopAndScanTrip.getCartDetails().getTotalTax())), companion.d(com.meijer.mobile.shopandscan.e.f117938n, Double.valueOf(shopAndScanTrip.getCartDetails().getNowTotal())), companion.d(com.meijer.mobile.shopandscan.e.f117938n, Double.valueOf(shopAndScanTrip.getCartDetails().getTotalPriceWithTax())), companion.d(com.meijer.mobile.shopandscan.e.f117938n, Double.valueOf(shopAndScanTrip.getCartDetails().getTotalSavings()))), greenvilleBarcode, 2047, null);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ShopAndScanTrip shopAndScanTrip, Continuation<? super Unit> continuation) {
                return ((a) create(shopAndScanTrip, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                List<ShopAndScanItem> listC;
                IntrinsicsKt.f();
                if (this.f141180a == 0) {
                    ResultKt.b(obj);
                    final ShopAndScanTrip shopAndScanTrip = (ShopAndScanTrip) this.f141181b;
                    if (shopAndScanTrip != null && (listC = shopAndScanTrip.c()) != null) {
                        h hVar = this.f141182c;
                        for (ShopAndScanItem shopAndScanItem : listC) {
                            hVar.getCheckoutModelStore().d(new Function1() { // from class: jq.i
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return h.i.a.k(shopAndScanTrip, (h.CheckoutState) obj2);
                                }
                            });
                        }
                    }
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f141178a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f interfaceC16561fO = C16563h.O(h.this.shopAndScanRepository.a(), new a(h.this, null));
                this.f141178a = 1;
                if (C16563h.j(interfaceC16561fO, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.checkout.ShopAndScanCheckoutViewModel$buildOrder$2", f = "ShopAndScanCheckoutViewModel.kt", l = {231}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f141183a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f141183a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                this.f141183a = 1;
                if (Z.b(3000L, this) == objF) {
                    return objF;
                }
            }
            h.this.p();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.checkout.ShopAndScanCheckoutViewModel$buildingOrderDismissed$1", f = "ShopAndScanCheckoutViewModel.kt", l = {}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f141185a;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CheckoutState g(CheckoutState checkoutState) {
            return CheckoutState.b(checkoutState, null, false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 8189, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f141185a == 0) {
                ResultKt.b(obj);
                h.this.getCheckoutModelStore().d(new Function1() { // from class: jq.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return h.k.g((h.CheckoutState) obj2);
                    }
                });
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.checkout.ShopAndScanCheckoutViewModel$checkCameraPermission$1", f = "ShopAndScanCheckoutViewModel.kt", l = {260}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f141187a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f141189c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z10, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f141189c = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CheckoutScanState g(boolean z10, CheckoutScanState checkoutScanState) {
            return CheckoutScanState.b(checkoutScanState, false, z10, null, false, false, 29, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new l(this.f141189c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f141187a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17896a<CheckoutScanState, c> c17896aT = h.this.t();
                final boolean z10 = this.f141189c;
                c17896aT.d(new Function1() { // from class: jq.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return h.l.g(z10, (h.CheckoutScanState) obj2);
                    }
                });
                if (!this.f141189c) {
                    this.f141187a = 1;
                    if (Z.b(1000L, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
            h.this.t().c(c.a.f141154a);
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(C18213d navManager, Wp.a shopAndScanRepository, Dl.e meijerIntent, zq.d scannerController) {
        Intrinsics.j(navManager, "navManager");
        Intrinsics.j(shopAndScanRepository, "shopAndScanRepository");
        Intrinsics.j(meijerIntent, "meijerIntent");
        Intrinsics.j(scannerController, "scannerController");
        this.navManager = navManager;
        this.shopAndScanRepository = shopAndScanRepository;
        this.meijerIntent = meijerIntent;
        this.scannerController = scannerController;
        boolean z10 = false;
        this.checkoutModelStore = new C17896a(new CheckoutState(null, z10, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 8191, null));
        this.checkoutScanModelStore = new C17896a<>(new CheckoutScanState(false, z10, null, false, false, 31, null));
        this.transferModelStore = new C17896a<>(new TransferState(false, null, 3, 0 == true ? 1 : 0));
        this.enabledBarcodeSymbologies = CollectionsKt.e(new a.QR(""));
    }

    /* renamed from: s, reason: from getter */
    public final C17896a getCheckoutModelStore() {
        return this.checkoutModelStore;
    }

    public final C17896a<CheckoutScanState, c> t() {
        return this.checkoutScanModelStore;
    }

    public final void u(b event) {
        Intrinsics.j(event, "event");
        if (event instanceof b.C2235b) {
            r();
        } else if (event instanceof b.a) {
            p();
        } else {
            if (!(event instanceof d.CheckCameraPermission)) {
                throw new NoWhenBranchMatchedException();
            }
            q(((d.CheckCameraPermission) event).getHasCameraPermission());
        }
    }

    private final void o() {
        C15809k.d(d0.a(this), null, null, new i(null), 3, null);
        C15809k.d(d0.a(this), null, null, new j(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        C15809k.d(d0.a(this), null, null, new k(null), 3, null);
    }

    private final C0 q(boolean permission) {
        return C15809k.d(d0.a(this), null, null, new l(permission, null), 3, null);
    }

    private final void r() {
        o();
    }
}
