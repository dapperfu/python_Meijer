package Op;

import Co.ProductFullDetails;
import Mp.ProductScanItem;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004$ +(B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020'0*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u000201058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020#0*8F¢\u0006\u0006\u001a\u0004\b;\u0010.¨\u0006="}, d2 = {"LOp/g;", "Landroidx/lifecycle/c0;", "LRo/c;", "productsRepository", "<init>", "(LRo/c;)V", "", "LMp/h;", "productScanItemList", "", "r", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "barcodes", "B", "(Ljava/util/List;)V", "A", "barcode", "s", "(Ljava/lang/String;)V", "", "allowCountIncrement", "isSingleScanMode", "x", "(ZZ)V", "cameraPermissionGranted", "w", "(Z)V", "LOp/g$a;", "action", "y", "(LOp/g$a;)V", "a", "LRo/c;", "Lpv/A;", "LOp/g$b;", "b", "Lpv/A;", "_dialogBoxFlow", "LOp/g$c;", "c", "_effectsFlow", "Lpv/F;", "d", "Lpv/F;", "u", "()Lpv/F;", "effectsFlow", "Lpv/B;", "LOp/g$d;", "e", "Lpv/B;", "_stateFlow", "Lpv/P;", "f", "Lpv/P;", "v", "()Lpv/P;", "stateFlow", "t", "dialogBoxFlow", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class g extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<b> _dialogBoxFlow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<c> _effectsFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<c> effectsFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _stateFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> stateFlow;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LOp/g$a;", "", "<init>", "()V", "e", "d", "b", "c", "a", "LOp/g$a$a;", "LOp/g$a$b;", "LOp/g$a$c;", "LOp/g$a$d;", "LOp/g$a$e;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOp/g$a$a;", "LOp/g$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Op.g$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0408a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0408a f24823a = new C0408a();

            private C0408a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0408a);
            }

            public String toString() {
                return "DismissDialog";
            }

            public int hashCode() {
                return 692582300;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOp/g$a$b;", "LOp/g$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f24824a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "DoneClicked";
            }

            public int hashCode() {
                return -1715790865;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOp/g$a$c;", "LOp/g$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f24825a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "FinishActivity";
            }

            public int hashCode() {
                return -1502209320;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LOp/g$a$d;", "LOp/g$a;", "", "", "barcodes", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Op.g$a$d, reason: from toString */
        public static final /* data */ class MultiScanModeProductScanned extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<String> barcodes;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MultiScanModeProductScanned) && Intrinsics.e(this.barcodes, ((MultiScanModeProductScanned) other).barcodes);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MultiScanModeProductScanned(List<String> barcodes) {
                super(null);
                Intrinsics.j(barcodes, "barcodes");
                this.barcodes = barcodes;
            }

            public final List<String> a() {
                return this.barcodes;
            }

            public int hashCode() {
                return this.barcodes.hashCode();
            }

            public String toString() {
                return "MultiScanModeProductScanned(barcodes=" + this.barcodes + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LOp/g$a$e;", "LOp/g$a;", "", "", "barcodes", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Op.g$a$e, reason: from toString */
        public static final /* data */ class SingleScanModeProductScanned extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<String> barcodes;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SingleScanModeProductScanned) && Intrinsics.e(this.barcodes, ((SingleScanModeProductScanned) other).barcodes);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleScanModeProductScanned(List<String> barcodes) {
                super(null);
                Intrinsics.j(barcodes, "barcodes");
                this.barcodes = barcodes;
            }

            public final List<String> a() {
                return this.barcodes;
            }

            public int hashCode() {
                return this.barcodes.hashCode();
            }

            public String toString() {
                return "SingleScanModeProductScanned(barcodes=" + this.barcodes + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LOp/g$b;", "", "<init>", "()V", "b", "a", "c", "LOp/g$b$a;", "LOp/g$b$b;", "LOp/g$b$c;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOp/g$b$a;", "LOp/g$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f24828a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "CameraPermissionDeclined";
            }

            public int hashCode() {
                return 850186479;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOp/g$b$b;", "LOp/g$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Op.g$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0409b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C0409b f24829a = new C0409b();

            private C0409b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0409b);
            }

            public String toString() {
                return "None";
            }

            public int hashCode() {
                return 1463411077;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LOp/g$b$c;", "LOp/g$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f24830a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "UnsavedItems";
            }

            public int hashCode() {
                return -1070957025;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LOp/g$c;", "", "<init>", "()V", "c", "b", "a", "LOp/g$c$a;", "LOp/g$c$b;", "LOp/g$c$c;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LOp/g$c$a;", "LOp/g$c;", "", "LCo/h;", "productsList", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Op.g$c$a, reason: from toString */
        public static final /* data */ class FinishActivity extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<ProductFullDetails> productsList;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FinishActivity) && Intrinsics.e(this.productsList, ((FinishActivity) other).productsList);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinishActivity(List<ProductFullDetails> productsList) {
                super(null);
                Intrinsics.j(productsList, "productsList");
                this.productsList = productsList;
            }

            public final List<ProductFullDetails> a() {
                return this.productsList;
            }

            public int hashCode() {
                return this.productsList.hashCode();
            }

            public String toString() {
                return "FinishActivity(productsList=" + this.productsList + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LOp/g$c$b;", "LOp/g$c;", "", "errorMessage", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Op.g$c$b, reason: from toString */
        public static final /* data */ class ProductLookupFailed extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int errorMessage;

            public ProductLookupFailed(int i10) {
                super(null);
                this.errorMessage = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProductLookupFailed) && this.errorMessage == ((ProductLookupFailed) other).errorMessage;
            }

            /* renamed from: a, reason: from getter */
            public final int getErrorMessage() {
                return this.errorMessage;
            }

            public int hashCode() {
                return Integer.hashCode(this.errorMessage);
            }

            public String toString() {
                return "ProductLookupFailed(errorMessage=" + this.errorMessage + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LOp/g$c$c;", "LOp/g$c;", "", "barcode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Op.g$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class ProductScanned extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String barcode;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProductScanned) && Intrinsics.e(this.barcode, ((ProductScanned) other).barcode);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProductScanned(String barcode) {
                super(null);
                Intrinsics.j(barcode, "barcode");
                this.barcode = barcode;
            }

            /* renamed from: a, reason: from getter */
            public final String getBarcode() {
                return this.barcode;
            }

            public int hashCode() {
                return this.barcode.hashCode();
            }

            public String toString() {
                return "ProductScanned(barcode=" + this.barcode + ')';
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"LOp/g$d;", "", "", "allowCountIncrement", "isSingleScanMode", "", "LMp/h;", "productsList", "Lbk/a;", "headerLabel", "<init>", "(ZZLjava/util/List;Lbk/a;)V", "a", "(ZZLjava/util/List;Lbk/a;)LOp/g$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "f", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "Lbk/a;", "()Lbk/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Op.g$d, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean allowCountIncrement;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSingleScanMode;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductScanItem> productsList;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a headerLabel;

        public ViewState() {
            this(false, false, null, null, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.allowCountIncrement == viewState.allowCountIncrement && this.isSingleScanMode == viewState.isSingleScanMode && Intrinsics.e(this.productsList, viewState.productsList) && Intrinsics.e(this.headerLabel, viewState.headerLabel);
        }

        public ViewState(boolean z10, boolean z11, List<ProductScanItem> productsList, AbstractC6392a headerLabel) {
            Intrinsics.j(productsList, "productsList");
            Intrinsics.j(headerLabel, "headerLabel");
            this.allowCountIncrement = z10;
            this.isSingleScanMode = z11;
            this.productsList = productsList;
            this.headerLabel = headerLabel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState b(ViewState viewState, boolean z10, boolean z11, List list, AbstractC6392a abstractC6392a, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = viewState.allowCountIncrement;
            }
            if ((i10 & 2) != 0) {
                z11 = viewState.isSingleScanMode;
            }
            if ((i10 & 4) != 0) {
                list = viewState.productsList;
            }
            if ((i10 & 8) != 0) {
                abstractC6392a = viewState.headerLabel;
            }
            return viewState.a(z10, z11, list, abstractC6392a);
        }

        public final ViewState a(boolean allowCountIncrement, boolean isSingleScanMode, List<ProductScanItem> productsList, AbstractC6392a headerLabel) {
            Intrinsics.j(productsList, "productsList");
            Intrinsics.j(headerLabel, "headerLabel");
            return new ViewState(allowCountIncrement, isSingleScanMode, productsList, headerLabel);
        }

        /* renamed from: c, reason: from getter */
        public final boolean getAllowCountIncrement() {
            return this.allowCountIncrement;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC6392a getHeaderLabel() {
            return this.headerLabel;
        }

        public final List<ProductScanItem> e() {
            return this.productsList;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsSingleScanMode() {
            return this.isSingleScanMode;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.allowCountIncrement) * 31) + Boolean.hashCode(this.isSingleScanMode)) * 31) + this.productsList.hashCode()) * 31) + this.headerLabel.hashCode();
        }

        public String toString() {
            return "ViewState(allowCountIncrement=" + this.allowCountIncrement + ", isSingleScanMode=" + this.isSingleScanMode + ", productsList=" + this.productsList + ", headerLabel=" + this.headerLabel + ')';
        }

        public /* synthetic */ ViewState(boolean z10, boolean z11, List list, AbstractC6392a abstractC6392a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? CollectionsKt.m() : list, (i10 & 8) != 0 ? AbstractC6392a.INSTANCE.a() : abstractC6392a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.scanner.ux.viewmodel.ProductScanViewModel$fetchUpcDetails$1", f = "ProductScanViewModel.kt", l = {141, 174}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f24838a;

        /* renamed from: b, reason: collision with root package name */
        Object f24839b;

        /* renamed from: c, reason: collision with root package name */
        Object f24840c;

        /* renamed from: d, reason: collision with root package name */
        Object f24841d;

        /* renamed from: e, reason: collision with root package name */
        int f24842e;

        /* renamed from: f, reason: collision with root package name */
        int f24843f;

        /* renamed from: g, reason: collision with root package name */
        int f24844g;

        /* renamed from: h, reason: collision with root package name */
        int f24845h;

        /* renamed from: i, reason: collision with root package name */
        int f24846i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f24847j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f24849l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f24849l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = g.this.new e(this.f24849l, continuation);
            eVar.f24847j = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x0165, code lost:
        
            if (r4.emit(r10, r21) == r2) goto L49;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 363
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Op.g.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.scanner.ux.viewmodel.ProductScanViewModel$handlePermissionResult$1", f = "ProductScanViewModel.kt", l = {55}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f24850a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f24850a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = g.this._dialogBoxFlow;
                b.C0409b c0409b = b.C0409b.f24829a;
                this.f24850a = 1;
                if (interfaceC16548A.emit(c0409b, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.scanner.ux.viewmodel.ProductScanViewModel$handlePermissionResult$2", f = "ProductScanViewModel.kt", l = {59}, m = "invokeSuspend")
    /* renamed from: Op.g$g, reason: collision with other inner class name */
    static final class C0411g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f24852a;

        C0411g(Continuation<? super C0411g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new C0411g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C0411g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f24852a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = g.this._dialogBoxFlow;
                b.a aVar = b.a.f24828a;
                this.f24852a = 1;
                if (interfaceC16548A.emit(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.scanner.ux.viewmodel.ProductScanViewModel$onAction$1", f = "ProductScanViewModel.kt", l = {69}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f24854a;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f24854a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                g gVar = g.this;
                List<ProductScanItem> listE = gVar.v().getValue().e();
                this.f24854a = 1;
                if (gVar.r(listE, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.scanner.ux.viewmodel.ProductScanViewModel$onAction$2", f = "ProductScanViewModel.kt", l = {74, 76}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f24856a;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            if (r5.r(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        
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
                int r1 = r4.f24856a
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
                goto L5e
            L1b:
                kotlin.ResultKt.b(r5)
                Op.g r5 = Op.g.this
                pv.P r5 = r5.v()
                java.lang.Object r5 = r5.getValue()
                Op.g$d r5 = (Op.g.ViewState) r5
                java.util.List r5 = r5.e()
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L4d
                Op.g r5 = Op.g.this
                pv.P r1 = r5.v()
                java.lang.Object r1 = r1.getValue()
                Op.g$d r1 = (Op.g.ViewState) r1
                java.util.List r1 = r1.e()
                r4.f24856a = r3
                java.lang.Object r5 = Op.g.m(r5, r1, r4)
                if (r5 != r0) goto L5e
                goto L5d
            L4d:
                Op.g r5 = Op.g.this
                pv.A r5 = Op.g.o(r5)
                Op.g$b$c r1 = Op.g.b.c.f24830a
                r4.f24856a = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L5e
            L5d:
                return r0
            L5e:
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Op.g.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.scanner.ux.viewmodel.ProductScanViewModel$onAction$3", f = "ProductScanViewModel.kt", l = {81}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f24858a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f24858a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = g.this._dialogBoxFlow;
                b.C0409b c0409b = b.C0409b.f24829a;
                this.f24858a = 1;
                if (interfaceC16548A.emit(c0409b, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.scanner.ux.viewmodel.ProductScanViewModel$onSingleScanProductScanned$1", f = "ProductScanViewModel.kt", l = {105}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f24860a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f24862c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(List<String> list, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f24862c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new k(this.f24862c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f24860a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = g.this._effectsFlow;
                c.ProductScanned productScanned = new c.ProductScanned((String) CollectionsKt.s0(this.f24862c));
                this.f24860a = 1;
                if (interfaceC16548A.emit(productScanned, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    private final synchronized void A(List<String> barcodes) {
        Object next;
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        try {
            String str = (String) CollectionsKt.s0(barcodes);
            Iterator<T> it = this.stateFlow.getValue().e().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (StringsKt.H(((ProductScanItem) next).getProductQuantity().g2(), str, true)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (((ProductScanItem) next) != null) {
                InterfaceC16549B<ViewState> interfaceC16549B = this._stateFlow;
                do {
                    value = interfaceC16549B.getValue();
                    viewState = value;
                    List<ProductScanItem> listE = viewState.e();
                    arrayList = new ArrayList(CollectionsKt.x(listE, 10));
                    for (ProductScanItem productScanItemB : listE) {
                        if (Intrinsics.e(productScanItemB.getProductQuantity().g2(), str) && viewState.getAllowCountIncrement()) {
                            productScanItemB = ProductScanItem.b(productScanItemB, productScanItemB.getProductQuantity().X1(1.0d), null, null, 6, null);
                        }
                        arrayList.add(productScanItemB);
                    }
                } while (!interfaceC16549B.e(value, ViewState.b(viewState, false, false, arrayList, null, 11, null)));
            } else {
                s(str);
            }
        } finally {
        }
    }

    private final synchronized void B(List<String> barcodes) {
        if (!barcodes.isEmpty()) {
            C15809k.d(d0.a(this), null, null, new k(barcodes, null), 3, null);
        }
    }

    public final void w(boolean cameraPermissionGranted) {
        if (cameraPermissionGranted) {
            C15809k.d(d0.a(this), null, null, new f(null), 3, null);
        } else {
            C15809k.d(d0.a(this), null, null, new C0411g(null), 3, null);
        }
    }

    public g(Ro.c productsRepository) {
        Intrinsics.j(productsRepository, "productsRepository");
        this.productsRepository = productsRepository;
        this._dialogBoxFlow = C16555H.b(0, 0, null, 7, null);
        InterfaceC16548A<c> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._effectsFlow = interfaceC16548AB;
        this.effectsFlow = C16563h.b(interfaceC16548AB);
        InterfaceC16549B<ViewState> interfaceC16549BA = S.a(new ViewState(false, false, null, null, 15, null));
        this._stateFlow = interfaceC16549BA;
        this.stateFlow = C16563h.c(interfaceC16549BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(List<ProductScanItem> list, Continuation<? super Unit> continuation) {
        InterfaceC16548A<c> interfaceC16548A = this._effectsFlow;
        List<ProductScanItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (ProductScanItem productScanItem : list2) {
            String productName = productScanItem.getProductName();
            if (productName == null) {
                productName = "";
            }
            arrayList.add(new ProductFullDetails(productScanItem.getProductQuantity().g2(), productName, 0, false, false, false, null, null, CollectionsKt.q(productScanItem.getThumbnailImage()), null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, (int) productScanItem.getProductQuantity().getQuantity(), -260, 134217727, null));
        }
        Object objEmit = interfaceC16548A.emit(new c.FinishActivity(arrayList), continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f143329a;
    }

    public final InterfaceC16553F<b> t() {
        return C16563h.b(this._dialogBoxFlow);
    }

    public final InterfaceC16553F<c> u() {
        return this.effectsFlow;
    }

    public final P<ViewState> v() {
        return this.stateFlow;
    }

    public final void x(boolean allowCountIncrement, boolean isSingleScanMode) {
        InterfaceC16549B<ViewState> interfaceC16549B = this._stateFlow;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            boolean z10 = allowCountIncrement;
            boolean z11 = isSingleScanMode;
            if (interfaceC16549B.e(value, ViewState.b(value, z10, z11, null, null, 12, null))) {
                return;
            }
            allowCountIncrement = z10;
            isSingleScanMode = z11;
        }
    }

    public final void y(a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.MultiScanModeProductScanned) {
            A(((a.MultiScanModeProductScanned) action).a());
            Unit unit = Unit.f143329a;
            return;
        }
        if (action instanceof a.SingleScanModeProductScanned) {
            B(((a.SingleScanModeProductScanned) action).a());
            Unit unit2 = Unit.f143329a;
        } else if (Intrinsics.e(action, a.b.f24824a)) {
            C15809k.d(d0.a(this), null, null, new h(null), 3, null);
        } else if (Intrinsics.e(action, a.c.f24825a)) {
            C15809k.d(d0.a(this), null, null, new i(null), 3, null);
        } else {
            if (!Intrinsics.e(action, a.C0408a.f24823a)) {
                throw new NoWhenBranchMatchedException();
            }
            C15809k.d(d0.a(this), null, null, new j(null), 3, null);
        }
    }

    private final void s(String barcode) {
        C15809k.d(d0.a(this), null, null, new e(barcode, null), 3, null);
    }
}
