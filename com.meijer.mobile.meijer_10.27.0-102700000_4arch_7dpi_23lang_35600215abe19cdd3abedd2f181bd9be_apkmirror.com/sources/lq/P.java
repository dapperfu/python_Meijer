package lq;

import Vp.AddItemRequest;
import Vp.LookupItemRequest;
import Xp.ShopAndScanLookupItem;
import ak.AbstractC5607a;
import androidx.view.c0;
import androidx.view.d0;
import hq.ShopAndScanLookupItemDecorator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lq.P;
import qv.C16648k;
import qv.InterfaceC16622O;
import vj.C17588a;
import xq.C18085d;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\u001f\u001dB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Llq/P;", "Landroidx/lifecycle/c0;", "LWp/a;", "repository", "Lxq/d;", "navManager", "<init>", "(LWp/a;Lxq/d;)V", "", "t", "()V", "w", "y", "x", "q", "", "plu", "v", "(Ljava/lang/String;)V", "LXp/a;", "barcode", "", "quantity", "A", "(LXp/a;I)V", "Llq/P$a;", "event", "u", "(Llq/P$a;)V", "a", "LWp/a;", "b", "Lxq/d;", "Lvj/a;", "Llq/P$b;", "", "c", "Lvj/a;", "s", "()Lvj/a;", "modelStore", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class P extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Wp.a repository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C18085d navManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C17588a modelStore;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Llq/P$a;", "", "<init>", "()V", "d", "f", "e", "a", "b", "c", "g", "Llq/P$a$a;", "Llq/P$a$b;", "Llq/P$a$c;", "Llq/P$a$d;", "Llq/P$a$e;", "Llq/P$a$f;", "Llq/P$a$g;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llq/P$a$a;", "Llq/P$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lq.P$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2290a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2290a f149170a = new C2290a();

            private C2290a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2290a);
            }

            public String toString() {
                return "DismissErrorDialog";
            }

            public int hashCode() {
                return -1100516860;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llq/P$a$b;", "Llq/P$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f149171a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "GetPicklist";
            }

            public int hashCode() {
                return -1203993097;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Llq/P$a$c;", "Llq/P$a;", "", "pluNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lq.P$a$c, reason: from toString */
        public static final /* data */ class LookupItem extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String pluNumber;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LookupItem) && Intrinsics.e(this.pluNumber, ((LookupItem) other).pluNumber);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LookupItem(String pluNumber) {
                super(null);
                Intrinsics.j(pluNumber, "pluNumber");
                this.pluNumber = pluNumber;
            }

            /* renamed from: a, reason: from getter */
            public final String getPluNumber() {
                return this.pluNumber;
            }

            public int hashCode() {
                return this.pluNumber.hashCode();
            }

            public String toString() {
                return "LookupItem(pluNumber=" + this.pluNumber + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llq/P$a$d;", "Llq/P$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f149173a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "NavigateToCart";
            }

            public int hashCode() {
                return -683208310;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llq/P$a$e;", "Llq/P$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final e f149174a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public String toString() {
                return "NavigateToLookup";
            }

            public int hashCode() {
                return 837307748;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llq/P$a$f;", "Llq/P$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class f extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final f f149175a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public String toString() {
                return "NavigateToScanner";
            }

            public int hashCode() {
                return 1747898196;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, d2 = {"Llq/P$a$g;", "Llq/P$a;", "LXp/a;", "barcode", "", "quantity", "<init>", "(LXp/a;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LXp/a;", "()LXp/a;", "b", "I", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lq.P$a$g, reason: from toString */
        public static final /* data */ class SubmitItem extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Xp.a barcode;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int quantity;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SubmitItem)) {
                    return false;
                }
                SubmitItem submitItem = (SubmitItem) other;
                return Intrinsics.e(this.barcode, submitItem.barcode) && this.quantity == submitItem.quantity;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubmitItem(Xp.a barcode, int i10) {
                super(null);
                Intrinsics.j(barcode, "barcode");
                this.barcode = barcode;
                this.quantity = i10;
            }

            /* renamed from: a, reason: from getter */
            public final Xp.a getBarcode() {
                return this.barcode;
            }

            /* renamed from: b, reason: from getter */
            public final int getQuantity() {
                return this.quantity;
            }

            public int hashCode() {
                return (this.barcode.hashCode() * 31) + Integer.hashCode(this.quantity);
            }

            public String toString() {
                return "SubmitItem(barcode=" + this.barcode + ", quantity=" + this.quantity + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Llq/P$b;", "", "Lhq/g;", "lookupItemDecorator", "Llq/P$b$a;", "networkMessageState", "<init>", "(Lhq/g;Llq/P$b$a;)V", "a", "(Lhq/g;Llq/P$b$a;)Llq/P$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhq/g;", "c", "()Lhq/g;", "b", "Llq/P$b$a;", "d", "()Llq/P$b$a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lq.P$b, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: c, reason: collision with root package name */
        public static final int f149178c = AbstractC5607a.f45514b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShopAndScanLookupItemDecorator lookupItemDecorator;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final a networkMessageState;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Llq/P$b$a;", "", "<init>", "()V", "c", "b", "a", "Llq/P$b$a$a;", "Llq/P$b$a$b;", "Llq/P$b$a$c;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lq.P$b$a */
        public static abstract class a {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llq/P$b$a$a;", "Llq/P$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: lq.P$b$a$a, reason: collision with other inner class name */
            public static final /* data */ class C2291a extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final C2291a f149181a = new C2291a();

                private C2291a() {
                    super(null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof C2291a);
                }

                public String toString() {
                    return "Error";
                }

                public int hashCode() {
                    return 250200991;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llq/P$b$a$b;", "Llq/P$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: lq.P$b$a$b, reason: collision with other inner class name */
            public static final /* data */ class C2292b extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final C2292b f149182a = new C2292b();

                private C2292b() {
                    super(null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof C2292b);
                }

                public String toString() {
                    return "Loading";
                }

                public int hashCode() {
                    return 1740622099;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llq/P$b$a$c;", "Llq/P$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: lq.P$b$a$c */
            public static final /* data */ class c extends a {

                /* renamed from: a, reason: collision with root package name */
                public static final c f149183a = new c();

                private c() {
                    super(null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof c);
                }

                public String toString() {
                    return "None";
                }

                public int hashCode() {
                    return -1100042559;
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.lookupItemDecorator, viewState.lookupItemDecorator) && Intrinsics.e(this.networkMessageState, viewState.networkMessageState);
        }

        public ViewState(ShopAndScanLookupItemDecorator shopAndScanLookupItemDecorator, a networkMessageState) {
            Intrinsics.j(networkMessageState, "networkMessageState");
            this.lookupItemDecorator = shopAndScanLookupItemDecorator;
            this.networkMessageState = networkMessageState;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, ShopAndScanLookupItemDecorator shopAndScanLookupItemDecorator, a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                shopAndScanLookupItemDecorator = viewState.lookupItemDecorator;
            }
            if ((i10 & 2) != 0) {
                aVar = viewState.networkMessageState;
            }
            return viewState.a(shopAndScanLookupItemDecorator, aVar);
        }

        public final ViewState a(ShopAndScanLookupItemDecorator lookupItemDecorator, a networkMessageState) {
            Intrinsics.j(networkMessageState, "networkMessageState");
            return new ViewState(lookupItemDecorator, networkMessageState);
        }

        /* renamed from: c, reason: from getter */
        public final ShopAndScanLookupItemDecorator getLookupItemDecorator() {
            return this.lookupItemDecorator;
        }

        /* renamed from: d, reason: from getter */
        public final a getNetworkMessageState() {
            return this.networkMessageState;
        }

        public int hashCode() {
            ShopAndScanLookupItemDecorator shopAndScanLookupItemDecorator = this.lookupItemDecorator;
            return ((shopAndScanLookupItemDecorator == null ? 0 : shopAndScanLookupItemDecorator.hashCode()) * 31) + this.networkMessageState.hashCode();
        }

        public String toString() {
            return "ViewState(lookupItemDecorator=" + this.lookupItemDecorator + ", networkMessageState=" + this.networkMessageState + ')';
        }

        public /* synthetic */ ViewState(ShopAndScanLookupItemDecorator shopAndScanLookupItemDecorator, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : shopAndScanLookupItemDecorator, (i10 & 2) != 0 ? a.c.f149183a : aVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ShopAndScanLookupItemViewModel$getPicklist$1", f = "ShopAndScanLookupItemViewModel.kt", l = {69}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f149184a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return P.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f149184a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Wp.a aVar = P.this.repository;
                this.f149184a = 1;
                if (aVar.f(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ShopAndScanLookupItemViewModel$lookupItem$1", f = "ShopAndScanLookupItemViewModel.kt", l = {89}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f149186a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f149187b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f149189d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f149189d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState l(ViewState viewState) {
            return ViewState.b(viewState, null, ViewState.a.C2292b.f149182a, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState o(ShopAndScanLookupItem shopAndScanLookupItem, ViewState viewState) {
            return viewState.a(ShopAndScanLookupItemDecorator.INSTANCE.a(shopAndScanLookupItem), ViewState.a.c.f149183a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState p(ViewState viewState) {
            return ViewState.b(viewState, null, ViewState.a.C2291a.f149181a, 1, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = P.this.new d(this.f149189d, continuation);
            dVar.f149187b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f149186a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f149187b;
                P.this.getModelStore().d(new Function1() { // from class: lq.Q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return P.d.l((P.ViewState) obj2);
                    }
                });
                Wp.a aVar = P.this.repository;
                LookupItemRequest lookupItemRequest = new LookupItemRequest(this.f149189d);
                this.f149187b = interfaceC16622O;
                this.f149186a = 1;
                obj = aVar.i(lookupItemRequest, this);
                if (obj == objF) {
                    return objF;
                }
            }
            final ShopAndScanLookupItem shopAndScanLookupItem = (ShopAndScanLookupItem) obj;
            if (shopAndScanLookupItem != null) {
                P p10 = P.this;
                p10.getModelStore().d(new Function1() { // from class: lq.S
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return P.d.o(shopAndScanLookupItem, (P.ViewState) obj2);
                    }
                });
                p10.navManager.b(C18085d.a.e.f169854b);
            } else {
                P.this.getModelStore().d(new Function1() { // from class: lq.T
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return P.d.p((P.ViewState) obj2);
                    }
                });
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.lookupitem.ShopAndScanLookupItemViewModel$submitItem$1", f = "ShopAndScanLookupItemViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f149190a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Xp.a f149192c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f149193d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Xp.a aVar, int i10, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f149192c = aVar;
            this.f149193d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return P.this.new e(this.f149192c, this.f149193d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f149190a == 0) {
                ResultKt.b(obj);
                P.this.repository.c(new AddItemRequest(this.f149192c, this.f149193d, true));
                P.this.w();
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public P(Wp.a repository, C18085d navManager) {
        Intrinsics.j(repository, "repository");
        Intrinsics.j(navManager, "navManager");
        this.repository = repository;
        this.navManager = navManager;
        this.modelStore = new C17588a(new ViewState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    private final void q() {
        this.modelStore.d(new Function1() { // from class: lq.O
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P.r((P.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState r(ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, null, ViewState.a.c.f149183a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        this.navManager.b(C18085d.a.C2730a.f169850b);
    }

    private final void x() {
        this.navManager.b(C18085d.a.g.f169856b);
    }

    private final void y() {
        this.navManager.b(C18085d.a.j.f169859b);
    }

    /* renamed from: s, reason: from getter */
    public final C17588a getModelStore() {
        return this.modelStore;
    }

    public final void u(a event) {
        Intrinsics.j(event, "event");
        if (event instanceof a.d) {
            w();
            return;
        }
        if (event instanceof a.f) {
            y();
            return;
        }
        if (event instanceof a.e) {
            x();
            return;
        }
        if (event instanceof a.C2290a) {
            q();
            return;
        }
        if (event instanceof a.LookupItem) {
            v(((a.LookupItem) event).getPluNumber());
            return;
        }
        if (event instanceof a.SubmitItem) {
            a.SubmitItem submitItem = (a.SubmitItem) event;
            A(submitItem.getBarcode(), submitItem.getQuantity());
        } else {
            if (!(event instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            t();
        }
    }

    private final void A(Xp.a barcode, int quantity) {
        C16648k.d(d0.a(this), null, null, new e(barcode, quantity, null), 3, null);
    }

    private final void t() {
        C16648k.d(d0.a(this), null, null, new c(null), 3, null);
    }

    private final void v(String plu) {
        C16648k.d(d0.a(this), null, null, new d(plu, null), 3, null);
    }
}
