package Sm;

import Sm.p;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.Y;
import ev.C13889a;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;
import zp.ReceiptIdentifier;
import zp.c;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u00030.,B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0018¢\u0006\u0004\b!\u0010\u001bJ\u0015\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\rH\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u0002030;8F¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006@"}, d2 = {"LSm/p;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "LEp/d;", "receiptsRepository", "Lhi/a;", "analyticsEngine", "LQm/b;", "pdfManager", "<init>", "(LEp/d;Lhi/a;LQm/b;)V", "", "pdfData", "", "x", "(Ljava/lang/String;)V", "Lzp/c;", "response", "D", "(Lzp/c;)V", "", "throwable", "F", "(Ljava/lang/Throwable;)V", "", "isLoading", "I", "(Z)V", "LSm/p$b;", "error", "H", "(LSm/p$b;)V", "isCustomerResubmit", "G", "Lzp/f;", "receiptIdentifier", "v", "(Lzp/f;)V", "onCleared", "()V", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "a", "LEp/d;", "b", "Lhi/a;", "c", "LQm/b;", "Lpv/B;", "LSm/p$c;", "d", "Lpv/B;", "_viewState", "LJu/a;", "e", "LJu/a;", "compositeDisposable", "Lpv/P;", "w", "()Lpv/P;", "viewState", "f", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class p extends c0 implements InterfaceC6157f {

    /* renamed from: g, reason: collision with root package name */
    public static final int f34884g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ep.d receiptsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Qm.b pdfManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ju.a compositeDisposable;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000b\f\bB\u001f\b\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LSm/p$b;", "", "Lkotlin/Function1;", "LSm/p$c;", "Lbk/a;", "messageProvider", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "b", "c", "LSm/p$b$a;", "LSm/p$b$b;", "LSm/p$b$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<ViewState, AbstractC6392a> messageProvider;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSm/p$b$a;", "LSm/p$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final a f34891b = new a();

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            private a() {
                super(new Function1() { // from class: Sm.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.b.a.c((p.ViewState) obj);
                    }
                }, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AbstractC6392a c(ViewState it) {
                Intrinsics.j(it, "it");
                return it.j();
            }

            public String toString() {
                return "CustomerResubmit";
            }

            public int hashCode() {
                return 1325153045;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSm/p$b$b;", "LSm/p$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Sm.p$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0778b extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final C0778b f34892b = new C0778b();

            public boolean equals(Object other) {
                return this == other || (other instanceof C0778b);
            }

            private C0778b() {
                super(new Function1() { // from class: Sm.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.b.C0778b.c((p.ViewState) obj);
                    }
                }, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AbstractC6392a c(ViewState it) {
                Intrinsics.j(it, "it");
                return it.j();
            }

            public String toString() {
                return "ImageNotSet";
            }

            public int hashCode() {
                return 73349438;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSm/p$b$c;", "LSm/p$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final c f34893b = new c();

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            private c() {
                super(new Function1() { // from class: Sm.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.b.c.c((p.ViewState) obj);
                    }
                }, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final AbstractC6392a c(ViewState it) {
                Intrinsics.j(it, "it");
                return it.j();
            }

            public String toString() {
                return "InvalidReceiptId";
            }

            public int hashCode() {
                return 1630255688;
            }
        }

        public /* synthetic */ b(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
            this(function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private b(Function1<? super ViewState, ? extends AbstractC6392a> function1) {
            this.messageProvider = function1;
        }

        public final Function1<ViewState, AbstractC6392a> a() {
            return this.messageProvider;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\\\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b'\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b\"\u0010\u0011¨\u0006,"}, d2 = {"LSm/p$c;", "", "Lzp/f;", "receiptIdentifier", "", "legacyReceiptUrl", "", "isLoading", "isReceiptFetched", "isCustomerResubmit", "Ljava/io/File;", "pdfFile", "Lbk/a;", "errorMessage", "<init>", "(Lzp/f;Ljava/lang/String;ZZZLjava/io/File;Lbk/a;)V", "j", "()Lbk/a;", "a", "(Lzp/f;Ljava/lang/String;ZZZLjava/io/File;Lbk/a;)LSm/p$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lzp/f;", "f", "()Lzp/f;", "b", "Ljava/lang/String;", "d", "c", "Z", "h", "()Z", "i", "e", "g", "Ljava/io/File;", "()Ljava/io/File;", "Lbk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Sm.p$c, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ReceiptIdentifier receiptIdentifier;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String legacyReceiptUrl;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isReceiptFetched;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCustomerResubmit;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final File pdfFile;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a errorMessage;

        public ViewState() {
            this(null, null, false, false, false, null, null, l3.f93324d, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.receiptIdentifier, viewState.receiptIdentifier) && Intrinsics.e(this.legacyReceiptUrl, viewState.legacyReceiptUrl) && this.isLoading == viewState.isLoading && this.isReceiptFetched == viewState.isReceiptFetched && this.isCustomerResubmit == viewState.isCustomerResubmit && Intrinsics.e(this.pdfFile, viewState.pdfFile) && Intrinsics.e(this.errorMessage, viewState.errorMessage);
        }

        public ViewState(ReceiptIdentifier receiptIdentifier, String str, boolean z10, boolean z11, boolean z12, File file, AbstractC6392a abstractC6392a) {
            Intrinsics.j(receiptIdentifier, "receiptIdentifier");
            this.receiptIdentifier = receiptIdentifier;
            this.legacyReceiptUrl = str;
            this.isLoading = z10;
            this.isReceiptFetched = z11;
            this.isCustomerResubmit = z12;
            this.pdfFile = file;
            this.errorMessage = abstractC6392a;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, ReceiptIdentifier receiptIdentifier, String str, boolean z10, boolean z11, boolean z12, File file, AbstractC6392a abstractC6392a, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                receiptIdentifier = viewState.receiptIdentifier;
            }
            if ((i10 & 2) != 0) {
                str = viewState.legacyReceiptUrl;
            }
            if ((i10 & 4) != 0) {
                z10 = viewState.isLoading;
            }
            if ((i10 & 8) != 0) {
                z11 = viewState.isReceiptFetched;
            }
            if ((i10 & 16) != 0) {
                z12 = viewState.isCustomerResubmit;
            }
            if ((i10 & 32) != 0) {
                file = viewState.pdfFile;
            }
            if ((i10 & 64) != 0) {
                abstractC6392a = viewState.errorMessage;
            }
            File file2 = file;
            AbstractC6392a abstractC6392a2 = abstractC6392a;
            boolean z13 = z12;
            boolean z14 = z10;
            return viewState.a(receiptIdentifier, str, z14, z11, z13, file2, abstractC6392a2);
        }

        public final ViewState a(ReceiptIdentifier receiptIdentifier, String legacyReceiptUrl, boolean isLoading, boolean isReceiptFetched, boolean isCustomerResubmit, File pdfFile, AbstractC6392a errorMessage) {
            Intrinsics.j(receiptIdentifier, "receiptIdentifier");
            return new ViewState(receiptIdentifier, legacyReceiptUrl, isLoading, isReceiptFetched, isCustomerResubmit, pdfFile, errorMessage);
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC6392a getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: d, reason: from getter */
        public final String getLegacyReceiptUrl() {
            return this.legacyReceiptUrl;
        }

        /* renamed from: e, reason: from getter */
        public final File getPdfFile() {
            return this.pdfFile;
        }

        /* renamed from: f, reason: from getter */
        public final ReceiptIdentifier getReceiptIdentifier() {
            return this.receiptIdentifier;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getIsCustomerResubmit() {
            return this.isCustomerResubmit;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public int hashCode() {
            int iHashCode = this.receiptIdentifier.hashCode() * 31;
            String str = this.legacyReceiptUrl;
            int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isReceiptFetched)) * 31) + Boolean.hashCode(this.isCustomerResubmit)) * 31;
            File file = this.pdfFile;
            int iHashCode3 = (iHashCode2 + (file == null ? 0 : file.hashCode())) * 31;
            AbstractC6392a abstractC6392a = this.errorMessage;
            return iHashCode3 + (abstractC6392a != null ? abstractC6392a.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final boolean getIsReceiptFetched() {
            return this.isReceiptFetched;
        }

        public final AbstractC6392a j() {
            return AbstractC6392a.INSTANCE.d(this.isCustomerResubmit ? Y.f100501Jd : Y.f100482Id, new Object[0]);
        }

        public String toString() {
            return "ViewState(receiptIdentifier=" + this.receiptIdentifier + ", legacyReceiptUrl=" + this.legacyReceiptUrl + ", isLoading=" + this.isLoading + ", isReceiptFetched=" + this.isReceiptFetched + ", isCustomerResubmit=" + this.isCustomerResubmit + ", pdfFile=" + this.pdfFile + ", errorMessage=" + this.errorMessage + ')';
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ViewState(zp.ReceiptIdentifier r3, java.lang.String r4, boolean r5, boolean r6, boolean r7, java.io.File r8, bk.AbstractC6392a r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r2 = this;
                r11 = r10 & 1
                r0 = 0
                if (r11 == 0) goto La
                zp.f r3 = new zp.f
                r3.<init>(r0, r0, r0)
            La:
                r11 = r10 & 2
                if (r11 == 0) goto Lf
                r4 = r0
            Lf:
                r11 = r10 & 4
                r1 = 0
                if (r11 == 0) goto L15
                r5 = r1
            L15:
                r11 = r10 & 8
                if (r11 == 0) goto L1a
                r6 = r1
            L1a:
                r11 = r10 & 16
                if (r11 == 0) goto L1f
                r7 = r1
            L1f:
                r11 = r10 & 32
                if (r11 == 0) goto L24
                r8 = r0
            L24:
                r10 = r10 & 64
                if (r10 == 0) goto L31
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L39
            L31:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L39:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Sm.p.ViewState.<init>(zp.f, java.lang.String, boolean, boolean, boolean, java.io.File, bk.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.digitalreceipts.viewmodel.ReceiptDetailViewModel$fetchReceipt$1", f = "ReceiptDetailViewModel.kt", l = {60}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f34901a;

        /* renamed from: b, reason: collision with root package name */
        int f34902b;

        /* renamed from: c, reason: collision with root package name */
        int f34903c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f34904d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ReceiptIdentifier f34906f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReceiptIdentifier receiptIdentifier, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f34906f = receiptIdentifier;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = p.this.new d(this.f34906f, continuation);
            dVar.f34904d = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f34903c
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 != r3) goto L1a
                java.lang.Object r0 = r7.f34901a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r7.f34904d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L18
                goto L47
            L18:
                r8 = move-exception
                goto L52
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.f34904d
                mv.O r8 = (mv.InterfaceC15783O) r8
                Sm.p r1 = Sm.p.this
                zp.f r4 = r7.f34906f
                kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L4e
                Sm.p.u(r1, r3)     // Catch: java.lang.Throwable -> L4e
                Ep.d r1 = Sm.p.r(r1)     // Catch: java.lang.Throwable -> L4e
                r7.f34904d = r8     // Catch: java.lang.Throwable -> L4e
                r7.f34901a = r8     // Catch: java.lang.Throwable -> L4e
                r7.f34902b = r2     // Catch: java.lang.Throwable -> L4e
                r7.f34903c = r3     // Catch: java.lang.Throwable -> L4e
                java.lang.Object r1 = r1.d(r4, r7)     // Catch: java.lang.Throwable -> L4e
                if (r1 != r0) goto L45
                return r0
            L45:
                r0 = r8
                r8 = r1
            L47:
                zp.c r8 = (zp.c) r8     // Catch: java.lang.Throwable -> L18
                java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Throwable -> L18
                goto L5c
            L4e:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
            L52:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r8 = kotlin.ResultKt.a(r8)
                java.lang.Object r8 = kotlin.Result.b(r8)
            L5c:
                Sm.p r1 = Sm.p.this
                boolean r3 = kotlin.Result.h(r8)
                if (r3 == 0) goto L6a
                r3 = r8
                zp.c r3 = (zp.c) r3
                Sm.p.s(r1, r3)
            L6a:
                Sm.p r1 = Sm.p.this
                java.lang.Throwable r8 = kotlin.Result.e(r8)
                if (r8 == 0) goto L82
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r8 instanceof java.lang.Error
                if (r0 != 0) goto L81
                Sm.p.t(r1, r8)
                goto L82
            L81:
                throw r8
            L82:
                Sm.p r8 = Sm.p.this
                Sm.p.u(r8, r2)
                kotlin.Unit r8 = kotlin.Unit.f143329a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Sm.p.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public p(Ep.d receiptsRepository, InterfaceC14523a analyticsEngine, Qm.b pdfManager) {
        Intrinsics.j(receiptsRepository, "receiptsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(pdfManager, "pdfManager");
        this.receiptsRepository = receiptsRepository;
        this.analyticsEngine = analyticsEngine;
        this.pdfManager = pdfManager;
        this._viewState = S.a(new ViewState(null, null, false, false, false, null, null, l3.f93324d, null));
        this.compositeDisposable = new Ju.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(p pVar, Throwable th2) {
        qw.a.INSTANCE.d(th2 + ": Failed to load pdfFile locally", new Object[0]);
        pVar.H(b.C0778b.f34892b);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(zp.c response) {
        ViewState value;
        if (response instanceof c.Url) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ViewState.b(value, null, ((c.Url) response).getUrl(), false, true, false, null, null, 53, null)));
        } else if (response instanceof c.Pdf) {
            x(((c.Pdf) response).getPdfData());
        } else {
            qw.a.INSTANCE.k("Digital receipt is empty", new Object[0]);
            H(b.C0778b.f34892b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("receipt and savings");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(Throwable throwable) {
        qw.a.INSTANCE.d(throwable + ": Failure requesting receipt URL", new Object[0]);
        H(b.C0778b.f34892b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(boolean isLoading) {
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            boolean z10 = isLoading;
            if (interfaceC16549B.e(value, ViewState.b(value, null, null, z10, false, false, null, null, 123, null))) {
                return;
            } else {
                isLoading = z10;
            }
        }
    }

    private final void x(String pdfData) {
        Qm.b bVar = this.pdfManager;
        if (pdfData == null) {
            pdfData = "";
        }
        io.reactivex.l<File> lVarObserveOn = bVar.b(pdfData).subscribeOn(C13889a.b()).observeOn(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: Sm.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.y(this.f34879a, (File) obj);
            }
        };
        Lu.g<? super File> gVar = new Lu.g() { // from class: Sm.m
            @Override // Lu.g
            public final void accept(Object obj) {
                p.A(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Sm.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.B(this.f34881a, (Throwable) obj);
            }
        };
        Dk.a.a(lVarObserveOn.subscribe(gVar, new Lu.g() { // from class: Sm.o
            @Override // Lu.g
            public final void accept(Object obj) {
                p.C(function12, obj);
            }
        }), this.compositeDisposable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(p pVar, File file) {
        InterfaceC16549B<ViewState> interfaceC16549B = pVar._viewState;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            File file2 = file;
            if (interfaceC16549B.e(value, ViewState.b(value, null, null, false, true, false, file2, null, 23, null))) {
                return Unit.f143329a;
            }
            file = file2;
        }
    }

    public final void G(boolean isCustomerResubmit) {
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            boolean z10 = isCustomerResubmit;
            if (interfaceC16549B.e(value, ViewState.b(value, null, null, false, false, z10, null, null, 111, null))) {
                return;
            } else {
                isCustomerResubmit = z10;
            }
        }
    }

    public final void H(b error) {
        ViewState value;
        ViewState viewState;
        Intrinsics.j(error, "error");
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, null, false, false, false, null, error.a().invoke(viewState), 63, null)));
    }

    @Override // androidx.view.InterfaceC6157f
    public void onResume(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        ViewState value = this._viewState.getValue();
        if (!value.getIsReceiptFetched() && !value.getIsCustomerResubmit()) {
            v(value.getReceiptIdentifier());
            I(true);
        } else if (value.getIsCustomerResubmit()) {
            H(b.a.f34891b);
        }
        this.analyticsEngine.b(C14756c.h("receipts and savings: receipt"), new Function1() { // from class: Sm.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.E((TrackingData) obj);
            }
        });
    }

    public final void v(ReceiptIdentifier receiptIdentifier) {
        Intrinsics.j(receiptIdentifier, "receiptIdentifier");
        C15809k.d(d0.a(this), null, null, new d(receiptIdentifier, null), 3, null);
    }

    public final P<ViewState> w() {
        return C16563h.c(this._viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
    }
}
