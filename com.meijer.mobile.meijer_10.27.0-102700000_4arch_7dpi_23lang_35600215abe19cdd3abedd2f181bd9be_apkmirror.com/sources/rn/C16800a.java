package rn;

import Gk.UIEvent;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import qh.C16527b;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0003%'+B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0011j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u0019\u0010\u001c\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020*0.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lrn/a;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "Lqh/b;", "accountLinkingRepository", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/orders/a;Lqh/b;)V", "Lrn/a$a$c;", "action", "", "D", "(Lrn/a$a$c;)V", "B", "()V", "C", "", "formattedPhoneNumber", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "t", "(Ljava/lang/String;Ljava/lang/String;)V", "A", "s", "y", "u", "phoneNumber", "v", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "Lrn/a$a;", "x", "(Lrn/a$a;)V", "a", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "b", "Lqh/b;", "Ltv/B;", "Lrn/a$c;", "c", "Ltv/B;", "_viewState", "Ltv/P;", "d", "Ltv/P;", "w", "()Ltv/P;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rn.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C16800a extends androidx.view.c0 implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C16527b accountLinkingRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final tv.P<ViewState> viewState;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lrn/a$a;", "", "<init>", "()V", "b", "a", "c", "Lrn/a$a$a;", "Lrn/a$a$b;", "Lrn/a$a$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rn.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2475a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/a$a$a;", "Lrn/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2476a extends AbstractC2475a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2476a f159451a = new C2476a();

            private C2476a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2476a);
            }

            public String toString() {
                return "DiscardChanges";
            }

            public int hashCode() {
                return 1461383964;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/a$a$b;", "Lrn/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.a$a$b */
        public static final /* data */ class b extends AbstractC2475a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f159452a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "RequestFocus";
            }

            public int hashCode() {
                return 1680133152;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001b\u0010\u0005\u001a\u00060\u0002j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0015"}, d2 = {"Lrn/a$a$c;", "Lrn/a$a;", "", "phoneNumber", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.a$a$c, reason: from toString */
        public static final /* data */ class UpdatePhoneNumber extends AbstractC2475a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String phoneNumber;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdatePhoneNumber)) {
                    return false;
                }
                UpdatePhoneNumber updatePhoneNumber = (UpdatePhoneNumber) other;
                return Intrinsics.e(this.phoneNumber, updatePhoneNumber.phoneNumber) && Intrinsics.e(this.orderId, updatePhoneNumber.orderId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdatePhoneNumber(String phoneNumber, String orderId) {
                super(null);
                Intrinsics.j(phoneNumber, "phoneNumber");
                Intrinsics.j(orderId, "orderId");
                this.phoneNumber = phoneNumber;
                this.orderId = orderId;
            }

            /* renamed from: a, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }

            /* renamed from: b, reason: from getter */
            public final String getPhoneNumber() {
                return this.phoneNumber;
            }

            public int hashCode() {
                return (this.phoneNumber.hashCode() * 31) + this.orderId.hashCode();
            }

            public String toString() {
                return "UpdatePhoneNumber(phoneNumber=" + this.phoneNumber + ", orderId=" + this.orderId + ')';
            }
        }

        public /* synthetic */ AbstractC2475a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC2475a() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lrn/a$b;", "", "<init>", "()V", "e", "c", "f", "b", "d", "a", "Lrn/a$b$a;", "Lrn/a$b$b;", "Lrn/a$b$c;", "Lrn/a$b$d;", "Lrn/a$b$e;", "Lrn/a$b$f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rn.a$b */
    public static abstract class b {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"Lrn/a$b$a;", "Lrn/a$b;", "", "title", "message", "positiveButton", "negativeButton", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.a$b$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class DiscardChangesDialogUIEvent extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int positiveButton;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int negativeButton;

            public DiscardChangesDialogUIEvent(int i10, int i11, int i12, int i13) {
                super(null);
                this.title = i10;
                this.message = i11;
                this.positiveButton = i12;
                this.negativeButton = i13;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DiscardChangesDialogUIEvent)) {
                    return false;
                }
                DiscardChangesDialogUIEvent discardChangesDialogUIEvent = (DiscardChangesDialogUIEvent) other;
                return this.title == discardChangesDialogUIEvent.title && this.message == discardChangesDialogUIEvent.message && this.positiveButton == discardChangesDialogUIEvent.positiveButton && this.negativeButton == discardChangesDialogUIEvent.negativeButton;
            }

            /* renamed from: a, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final int getNegativeButton() {
                return this.negativeButton;
            }

            /* renamed from: c, reason: from getter */
            public final int getPositiveButton() {
                return this.positiveButton;
            }

            /* renamed from: d, reason: from getter */
            public final int getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.positiveButton)) * 31) + Integer.hashCode(this.negativeButton);
            }

            public String toString() {
                return "DiscardChangesDialogUIEvent(title=" + this.title + ", message=" + this.message + ", positiveButton=" + this.positiveButton + ", negativeButton=" + this.negativeButton + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lrn/a$b$b;", "Lrn/a$b;", "", "title", "message", "positiveButton", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.a$b$b, reason: collision with other inner class name and from toString */
        public static final /* data */ class FailureDialogUIEvent extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int positiveButton;

            public FailureDialogUIEvent(int i10, int i11, int i12) {
                super(null);
                this.title = i10;
                this.message = i11;
                this.positiveButton = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FailureDialogUIEvent)) {
                    return false;
                }
                FailureDialogUIEvent failureDialogUIEvent = (FailureDialogUIEvent) other;
                return this.title == failureDialogUIEvent.title && this.message == failureDialogUIEvent.message && this.positiveButton == failureDialogUIEvent.positiveButton;
            }

            /* renamed from: a, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final int getPositiveButton() {
                return this.positiveButton;
            }

            /* renamed from: c, reason: from getter */
            public final int getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.positiveButton);
            }

            public String toString() {
                return "FailureDialogUIEvent(title=" + this.title + ", message=" + this.message + ", positiveButton=" + this.positiveButton + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/a$b$c;", "Lrn/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.a$b$c */
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f159462a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "LoadingUIEvent";
            }

            public int hashCode() {
                return 269305363;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lrn/a$b$d;", "Lrn/a$b;", "", "title", "message", "positiveButton", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.a$b$d, reason: from toString */
        public static final /* data */ class PhoneNumberNotTextableDialogUIEvent extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int positiveButton;

            public PhoneNumberNotTextableDialogUIEvent(int i10, int i11, int i12) {
                super(null);
                this.title = i10;
                this.message = i11;
                this.positiveButton = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PhoneNumberNotTextableDialogUIEvent)) {
                    return false;
                }
                PhoneNumberNotTextableDialogUIEvent phoneNumberNotTextableDialogUIEvent = (PhoneNumberNotTextableDialogUIEvent) other;
                return this.title == phoneNumberNotTextableDialogUIEvent.title && this.message == phoneNumberNotTextableDialogUIEvent.message && this.positiveButton == phoneNumberNotTextableDialogUIEvent.positiveButton;
            }

            /* renamed from: a, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final int getPositiveButton() {
                return this.positiveButton;
            }

            /* renamed from: c, reason: from getter */
            public final int getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.positiveButton);
            }

            public String toString() {
                return "PhoneNumberNotTextableDialogUIEvent(title=" + this.title + ", message=" + this.message + ", positiveButton=" + this.positiveButton + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/a$b$e;", "Lrn/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.a$b$e */
        public static final /* data */ class e extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final e f159466a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public String toString() {
                return "PhoneNumberSavedUIEvent";
            }

            public int hashCode() {
                return 493030317;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/a$b$f;", "Lrn/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.a$b$f */
        public static final /* data */ class f extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final f f159467a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public String toString() {
                return "RequestFocusEvent";
            }

            public int hashCode() {
                return 1701628296;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lrn/a$c;", "", "", "progressIsVisible", "", "Lcom/meijer/mobile/core/model/common/PhoneNumber;", "phoneNumber", "LGk/a;", "Lrn/a$b;", "editPhoneNumberUIEvent", "<init>", "(ZLjava/lang/String;LGk/a;)V", "a", "(ZLjava/lang/String;LGk/a;)Lrn/a$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "d", "()Z", "b", "Ljava/lang/String;", "getPhoneNumber", "c", "LGk/a;", "()LGk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rn.a$c, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean progressIsVisible;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phoneNumber;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final UIEvent<b> editPhoneNumberUIEvent;

        public ViewState() {
            this(false, null, null, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.progressIsVisible == viewState.progressIsVisible && Intrinsics.e(this.phoneNumber, viewState.phoneNumber) && Intrinsics.e(this.editPhoneNumberUIEvent, viewState.editPhoneNumberUIEvent);
        }

        public ViewState(boolean z10, String str, UIEvent<b> editPhoneNumberUIEvent) {
            Intrinsics.j(editPhoneNumberUIEvent, "editPhoneNumberUIEvent");
            this.progressIsVisible = z10;
            this.phoneNumber = str;
            this.editPhoneNumberUIEvent = editPhoneNumberUIEvent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState b(ViewState viewState, boolean z10, String str, UIEvent uIEvent, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = viewState.progressIsVisible;
            }
            if ((i10 & 2) != 0) {
                str = viewState.phoneNumber;
            }
            if ((i10 & 4) != 0) {
                uIEvent = viewState.editPhoneNumberUIEvent;
            }
            return viewState.a(z10, str, uIEvent);
        }

        public final ViewState a(boolean progressIsVisible, String phoneNumber, UIEvent<b> editPhoneNumberUIEvent) {
            Intrinsics.j(editPhoneNumberUIEvent, "editPhoneNumberUIEvent");
            return new ViewState(progressIsVisible, phoneNumber, editPhoneNumberUIEvent);
        }

        public final UIEvent<b> c() {
            return this.editPhoneNumberUIEvent;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getProgressIsVisible() {
            return this.progressIsVisible;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.progressIsVisible) * 31;
            String str = this.phoneNumber;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.editPhoneNumberUIEvent.hashCode();
        }

        public String toString() {
            return "ViewState(progressIsVisible=" + this.progressIsVisible + ", phoneNumber=" + this.phoneNumber + ", editPhoneNumberUIEvent=" + this.editPhoneNumberUIEvent + ')';
        }

        public /* synthetic */ ViewState(boolean z10, String str, UIEvent uIEvent, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? new UIEvent(null, 1, null) : uIEvent);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.EditPhoneNumberViewModel$editPhoneNumber$1", f = "EditPhoneNumberViewModel.kt", l = {BinsView.LABEL_WIDTH_DP, 82}, m = "invokeSuspend")
    /* renamed from: rn.a$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f159471a;

        /* renamed from: b, reason: collision with root package name */
        Object f159472b;

        /* renamed from: c, reason: collision with root package name */
        Object f159473c;

        /* renamed from: d, reason: collision with root package name */
        Object f159474d;

        /* renamed from: e, reason: collision with root package name */
        int f159475e;

        /* renamed from: f, reason: collision with root package name */
        boolean f159476f;

        /* renamed from: g, reason: collision with root package name */
        int f159477g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f159478h;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f159480j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f159481k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f159480j = str;
            this.f159481k = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = C16800a.this.new d(this.f159480j, this.f159481k, continuation);
            dVar.f159478h = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rn.C16800a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C16800a(com.meijer.mobile.digitalshopping.api.orders.a ordersRepository, C16527b accountLinkingRepository) {
        Intrinsics.j(ordersRepository, "ordersRepository");
        Intrinsics.j(accountLinkingRepository, "accountLinkingRepository");
        this.ordersRepository = ordersRepository;
        this.accountLinkingRepository = accountLinkingRepository;
        InterfaceC17140B<ViewState> interfaceC17140BA = tv.S.a(new ViewState(false, null, null, 7, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, false, null, new UIEvent(b.e.f159466a), 2, null)));
    }

    private final void B() {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, false, null, new UIEvent(b.f.f159467a), 3, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, true, null, new UIEvent(b.c.f159462a), 2, null)));
    }

    private final void s() {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, false, null, new UIEvent(new b.DiscardChangesDialogUIEvent(com.meijer.mobile.meijer.Y.f100411x3, com.meijer.mobile.meijer.Y.f100391w3, Bj.o.f3039r, com.meijer.mobile.meijer.Y.f100351u3)), 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, false, null, new UIEvent(new b.FailureDialogUIEvent(com.meijer.mobile.meijer.Y.f99806S9, com.meijer.mobile.meijer.Y.f99787R9, yr.Q.f170986b)), 2, null)));
    }

    private final String v(String phoneNumber) {
        ViewState value;
        String strK = phoneNumber != null ? new Regex("[( \\-)]").k(phoneNumber, "") : null;
        String str = strK == null ? "" : strK;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, false, str, null, 5, null)));
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, false, null, new UIEvent(new b.PhoneNumberNotTextableDialogUIEvent(com.meijer.mobile.meijer.Y.f99642Jg, com.meijer.mobile.meijer.Y.f99604Hg, com.meijer.mobile.meijer.Y.f99623Ig)), 2, null)));
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        x(AbstractC2475a.b.f159452a);
    }

    public final tv.P<ViewState> w() {
        return this.viewState;
    }

    public final void x(AbstractC2475a action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC2475a.UpdatePhoneNumber) {
            D((AbstractC2475a.UpdatePhoneNumber) action);
        } else if (action instanceof AbstractC2475a.C2476a) {
            s();
        } else {
            if (!(action instanceof AbstractC2475a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            B();
        }
    }

    private final void D(AbstractC2475a.UpdatePhoneNumber action) {
        t(v(action.getPhoneNumber()), action.getOrderId());
    }

    private final void t(String formattedPhoneNumber, String orderId) {
        C16648k.d(androidx.view.d0.a(this), null, null, new d(formattedPhoneNumber, orderId, null), 3, null);
    }
}
