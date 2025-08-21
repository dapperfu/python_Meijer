package com.meijer.mobile.accounts.ux.payments;

import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.accounts.payments.api.models.network.AddCardAurusResponse;
import com.meijer.mobile.accounts.ux.payments.d;
import com.meijer.mobile.authentication.core.model.BearerToken;
import com.squareup.moshi.t;
import hk.EbtPaymentOption;
import hk.EnumC14533a;
import hk.MultiTenderPaymentOption;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
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
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import okhttp3.HttpUrl;
import pv.InterfaceC16553F;
import pv.P;
import wh.C17878c;
import wj.C17896a;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 A2\u00020\u0001:\u00041/'+B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u000eJ\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00108\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u000204098F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u0002050=8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/d;", "Landroidx/lifecycle/c0;", "Lil/m;", "cartRepository", "LCs/b;", "userProvider", "Lokhttp3/HttpUrl;", "baseUrl", "LYi/a;", "authTokenProvider", "<init>", "(Lil/m;LCs/b;Lokhttp3/HttpUrl;LYi/a;)V", "", "y", "()V", "", "data", "Lhk/d;", "ebtPaymentOption", "B", "(Ljava/lang/String;Lhk/d;)V", "Lhk/e;", "multiTenderPaymentOption", "G", "(Lhk/e;)V", "", "isLoading", "E", "(Z)V", "Lhk/a;", "useCase", "isEnrolledInMperksCardLinking", "s", "(Lhk/a;Z)V", "C", "Lcom/meijer/mobile/accounts/ux/payments/d$a;", "action", "A", "(Lcom/meijer/mobile/accounts/ux/payments/d$a;)V", "a", "Lil/m;", "v", "()Lil/m;", "b", "LCs/b;", "getUserProvider", "()LCs/b;", "c", "Lokhttp3/HttpUrl;", "d", "LYi/a;", "Lwj/a;", "Lcom/meijer/mobile/accounts/ux/payments/d$d;", "Lcom/meijer/mobile/accounts/ux/payments/d$c;", "e", "Lwj/a;", "stateModelStore", "Lpv/P;", "x", "()Lpv/P;", "uiState", "Lpv/F;", "w", "()Lpv/F;", "effectsFlow", "f", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d extends c0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f95249g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl baseUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Yi.a authTokenProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C17896a<ViewState, c> stateModelStore;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/d$a;", "", "<init>", "()V", "a", "Lcom/meijer/mobile/accounts/ux/payments/d$a$a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/d$a$a;", "Lcom/meijer/mobile/accounts/ux/payments/d$a;", "", "data", "Lhk/d;", "ebtPaymentOptionData", "<init>", "(Ljava/lang/String;Lhk/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lhk/d;", "()Lhk/d;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.payments.d$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class ProcessAurusIFrameReturn extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String data;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final EbtPaymentOption ebtPaymentOptionData;

            public ProcessAurusIFrameReturn(String str, EbtPaymentOption ebtPaymentOption) {
                super(null);
                this.data = str;
                this.ebtPaymentOptionData = ebtPaymentOption;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProcessAurusIFrameReturn)) {
                    return false;
                }
                ProcessAurusIFrameReturn processAurusIFrameReturn = (ProcessAurusIFrameReturn) other;
                return Intrinsics.e(this.data, processAurusIFrameReturn.data) && Intrinsics.e(this.ebtPaymentOptionData, processAurusIFrameReturn.ebtPaymentOptionData);
            }

            public int hashCode() {
                String str = this.data;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                EbtPaymentOption ebtPaymentOption = this.ebtPaymentOptionData;
                return iHashCode + (ebtPaymentOption != null ? ebtPaymentOption.hashCode() : 0);
            }

            public String toString() {
                return "ProcessAurusIFrameReturn(data=" + this.data + ", ebtPaymentOptionData=" + this.ebtPaymentOptionData + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getData() {
                return this.data;
            }

            /* renamed from: b, reason: from getter */
            public final EbtPaymentOption getEbtPaymentOptionData() {
                return this.ebtPaymentOptionData;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/d$c;", "", "<init>", "()V", "b", "a", "Lcom/meijer/mobile/accounts/ux/payments/d$c$a;", "Lcom/meijer/mobile/accounts/ux/payments/d$c$b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/d$c$a;", "Lcom/meijer/mobile/accounts/ux/payments/d$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f95257a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -964973196;
            }

            public String toString() {
                return "CardAddFailure";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/d$c$b;", "Lcom/meijer/mobile/accounts/ux/payments/d$c;", "Lhk/e;", "multiTenderPaymentOption", "<init>", "(Lhk/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhk/e;", "()Lhk/e;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.payments.d$c$b, reason: from toString */
        public static final /* data */ class CardAddSuccessful extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final MultiTenderPaymentOption multiTenderPaymentOption;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CardAddSuccessful) && Intrinsics.e(this.multiTenderPaymentOption, ((CardAddSuccessful) other).multiTenderPaymentOption);
            }

            public int hashCode() {
                return this.multiTenderPaymentOption.hashCode();
            }

            public String toString() {
                return "CardAddSuccessful(multiTenderPaymentOption=" + this.multiTenderPaymentOption + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CardAddSuccessful(MultiTenderPaymentOption multiTenderPaymentOption) {
                super(null);
                Intrinsics.j(multiTenderPaymentOption, "multiTenderPaymentOption");
                this.multiTenderPaymentOption = multiTenderPaymentOption;
            }

            /* renamed from: a, reason: from getter */
            public final MultiTenderPaymentOption getMultiTenderPaymentOption() {
                return this.multiTenderPaymentOption;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/accounts/ux/payments/d$d;", "", "Lokhttp3/HttpUrl;", "aurusUrl", "", "isLoading", "", "Lcom/meijer/mobile/authentication/core/AccessToken;", "accessToken", "<init>", "(Lokhttp3/HttpUrl;ZLjava/lang/String;)V", "a", "(Lokhttp3/HttpUrl;ZLjava/lang/String;)Lcom/meijer/mobile/accounts/ux/payments/d$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lokhttp3/HttpUrl;", "d", "()Lokhttp3/HttpUrl;", "b", "Z", "e", "()Z", "c", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.payments.d$d, reason: collision with other inner class name and from toString */
    public static final /* data */ class ViewState {

        /* renamed from: d, reason: collision with root package name */
        public static final int f95259d = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final HttpUrl aurusUrl;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String accessToken;

        public ViewState() {
            this(null, false, null, 7, null);
        }

        public static /* synthetic */ ViewState b(ViewState viewState, HttpUrl httpUrl, boolean z10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                httpUrl = viewState.aurusUrl;
            }
            if ((i10 & 2) != 0) {
                z10 = viewState.isLoading;
            }
            if ((i10 & 4) != 0) {
                str = viewState.accessToken;
            }
            return viewState.a(httpUrl, z10, str);
        }

        public final ViewState a(HttpUrl aurusUrl, boolean isLoading, String accessToken) {
            return new ViewState(aurusUrl, isLoading, accessToken);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.aurusUrl, viewState.aurusUrl) && this.isLoading == viewState.isLoading && Intrinsics.e(this.accessToken, viewState.accessToken);
        }

        public int hashCode() {
            HttpUrl httpUrl = this.aurusUrl;
            int iHashCode = (((httpUrl == null ? 0 : httpUrl.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
            String str = this.accessToken;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ViewState(aurusUrl=" + this.aurusUrl + ", isLoading=" + this.isLoading + ", accessToken=" + this.accessToken + ')';
        }

        public ViewState(HttpUrl httpUrl, boolean z10, String str) {
            this.aurusUrl = httpUrl;
            this.isLoading = z10;
            this.accessToken = str;
        }

        /* renamed from: c, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        /* renamed from: d, reason: from getter */
        public final HttpUrl getAurusUrl() {
            return this.aurusUrl;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public /* synthetic */ ViewState(HttpUrl httpUrl, boolean z10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : httpUrl, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC14533a.values().length];
            try {
                iArr[EnumC14533a.f135773a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14533a.f135774b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14533a.f135775c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC14533a.f135776d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.payments.AddCardAurusViewModel$getUserToken$1", f = "AddCardAurusViewModel.kt", l = {105}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f95263a;

        /* renamed from: b, reason: collision with root package name */
        Object f95264b;

        /* renamed from: c, reason: collision with root package name */
        Object f95265c;

        /* renamed from: d, reason: collision with root package name */
        Object f95266d;

        /* renamed from: e, reason: collision with root package name */
        int f95267e;

        /* renamed from: f, reason: collision with root package name */
        int f95268f;

        /* renamed from: g, reason: collision with root package name */
        int f95269g;

        /* renamed from: h, reason: collision with root package name */
        int f95270h;

        /* renamed from: i, reason: collision with root package name */
        int f95271i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f95272j;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = d.this.new f(continuation);
            fVar.f95272j = obj;
            return fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState g(BearerToken bearerToken, ViewState viewState) {
            return ViewState.b(viewState, null, false, bearerToken != null ? bearerToken.getAccessToken() : null, 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f95271i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f95272j;
                    d dVar = d.this;
                    Result.Companion companion = Result.INSTANCE;
                    Yi.a aVar = dVar.authTokenProvider;
                    this.f95272j = interfaceC15783O;
                    this.f95263a = interfaceC15783O;
                    this.f95264b = this;
                    this.f95265c = this;
                    this.f95266d = interfaceC15783O;
                    this.f95267e = 0;
                    this.f95268f = 0;
                    this.f95269g = 0;
                    this.f95270h = 0;
                    this.f95271i = 1;
                    obj = aVar.c(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            if (Result.g(objB)) {
                objB = null;
            }
            final BearerToken bearerToken = (BearerToken) objB;
            d.this.stateModelStore.d(new Function1() { // from class: com.meijer.mobile.accounts.ux.payments.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return d.f.g(bearerToken, (d.ViewState) obj2);
                }
            });
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.payments.AddCardAurusViewModel$processAurusIFrameReturn$2$1", f = "AddCardAurusViewModel.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95274a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return d.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f95274a == 0) {
                ResultKt.b(obj);
                d.this.stateModelStore.c(c.a.f95257a);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.payments.AddCardAurusViewModel$setPaymentMethod$1", f = "AddCardAurusViewModel.kt", l = {143}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f95276a;

        /* renamed from: b, reason: collision with root package name */
        Object f95277b;

        /* renamed from: c, reason: collision with root package name */
        Object f95278c;

        /* renamed from: d, reason: collision with root package name */
        Object f95279d;

        /* renamed from: e, reason: collision with root package name */
        int f95280e;

        /* renamed from: f, reason: collision with root package name */
        int f95281f;

        /* renamed from: g, reason: collision with root package name */
        int f95282g;

        /* renamed from: h, reason: collision with root package name */
        int f95283h;

        /* renamed from: i, reason: collision with root package name */
        int f95284i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f95285j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ MultiTenderPaymentOption f95287l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = d.this.new h(this.f95287l, continuation);
            hVar.f95285j = obj;
            return hVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(MultiTenderPaymentOption multiTenderPaymentOption, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f95287l = multiTenderPaymentOption;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f95284i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f95285j;
                    d.this.E(true);
                    d dVar = d.this;
                    MultiTenderPaymentOption multiTenderPaymentOption = this.f95287l;
                    Result.Companion companion = Result.INSTANCE;
                    il.m cartRepository = dVar.getCartRepository();
                    this.f95285j = interfaceC15783O;
                    this.f95276a = interfaceC15783O;
                    this.f95277b = this;
                    this.f95278c = this;
                    this.f95279d = interfaceC15783O;
                    this.f95280e = 0;
                    this.f95281f = 0;
                    this.f95282g = 0;
                    this.f95283h = 0;
                    this.f95284i = 1;
                    obj = cartRepository.a0(multiTenderPaymentOption, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            d dVar2 = d.this;
            if (Result.h(objB)) {
                dVar2.stateModelStore.c(new c.CardAddSuccessful((MultiTenderPaymentOption) objB));
            }
            d dVar3 = d.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Unable to set", new Object[0]);
                dVar3.stateModelStore.c(c.a.f95257a);
            }
            d.this.E(false);
            return Unit.f143329a;
        }
    }

    public d(il.m cartRepository, Cs.b userProvider, HttpUrl baseUrl, Yi.a authTokenProvider) {
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(userProvider, "userProvider");
        Intrinsics.j(baseUrl, "baseUrl");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        this.cartRepository = cartRepository;
        this.userProvider = userProvider;
        this.baseUrl = baseUrl;
        this.authTokenProvider = authTokenProvider;
        this.stateModelStore = new C17896a<>(new ViewState(null, false, null, 7, null));
        y();
    }

    private final void B(String data, EbtPaymentOption ebtPaymentOption) {
        Object objB;
        AddCardAurusResponse addCardAurusResponse;
        com.squareup.moshi.h hVarC = new t.a().d().c(AddCardAurusResponse.class);
        try {
            Result.Companion companion = Result.INSTANCE;
            addCardAurusResponse = (AddCardAurusResponse) hVarC.fromJson(data == null ? "" : data);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        if (addCardAurusResponse == null) {
            throw new IllegalStateException(("Aurus Bad formatting " + data).toString());
        }
        objB = Result.b(addCardAurusResponse);
        Throwable thE = Result.e(objB);
        if (thE != null) {
            C15809k.d(d0.a(this), null, null, new g(null), 3, null);
            qw.a.INSTANCE.d(String.valueOf(thE), new Object[0]);
        }
        if (Result.h(objB)) {
            AddCardAurusResponse addCardAurusResponse2 = (AddCardAurusResponse) objB;
            G(new MultiTenderPaymentOption(C17878c.b(addCardAurusResponse2, null, this.userProvider.h(), "0", uh.g.b(addCardAurusResponse2.n()), 1, null), ebtPaymentOption));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState D(ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, null, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(final boolean isLoading) {
        this.stateModelStore.d(new Function1() { // from class: com.meijer.mobile.accounts.ux.payments.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.F(isLoading, (d.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState F(boolean z10, ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, null, z10, null, 5, null);
    }

    public static /* synthetic */ void t(d dVar, EnumC14533a enumC14533a, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        dVar.s(enumC14533a, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState u(HttpUrl httpUrl, ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, httpUrl, false, null, 6, null);
    }

    public final void A(a action) {
        Intrinsics.j(action, "action");
        if (!(action instanceof a.ProcessAurusIFrameReturn)) {
            throw new NoWhenBranchMatchedException();
        }
        a.ProcessAurusIFrameReturn processAurusIFrameReturn = (a.ProcessAurusIFrameReturn) action;
        B(processAurusIFrameReturn.getData(), processAurusIFrameReturn.getEbtPaymentOptionData());
    }

    public final void C() {
        this.stateModelStore.d(new Function1() { // from class: com.meijer.mobile.accounts.ux.payments.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.D((d.ViewState) obj);
            }
        });
    }

    public final void s(EnumC14533a useCase, boolean isEnrolledInMperksCardLinking) {
        final HttpUrl httpUrlG;
        Intrinsics.j(useCase, "useCase");
        HttpUrl.a aVarL = this.baseUrl.l("mma/mma-payment.html");
        if (aVarL != null) {
            int i10 = e.$EnumSwitchMapping$0[useCase.ordinal()];
            if (i10 == 1) {
                aVarL.b("promptForMakePrimary", "true");
                aVarL.b("promptForLinkToMperks", String.valueOf(isEnrolledInMperksCardLinking));
            } else if (i10 == 2) {
                aVarL.b("promptForMaxCardsReached", "false");
                aVarL.b("promptForSaveToAccount", "true");
            } else if (i10 == 3) {
                aVarL.b("promptForMaxCardsReached", "false");
                aVarL.b("promptForSaveToAccount", "false");
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                aVarL.b("promptForMaxCardsReached", "true");
                aVarL.b("promptForSaveToAccount", "true");
            }
            httpUrlG = aVarL.g();
        } else {
            httpUrlG = null;
        }
        this.stateModelStore.d(new Function1() { // from class: com.meijer.mobile.accounts.ux.payments.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.u(httpUrlG, (d.ViewState) obj);
            }
        });
    }

    /* renamed from: v, reason: from getter */
    public final il.m getCartRepository() {
        return this.cartRepository;
    }

    public final InterfaceC16553F<c> w() {
        return this.stateModelStore.a();
    }

    public final P<ViewState> x() {
        return this.stateModelStore.b();
    }

    private final void G(MultiTenderPaymentOption multiTenderPaymentOption) {
        C15809k.d(d0.a(this), null, null, new h(multiTenderPaymentOption, null), 3, null);
    }

    private final void y() {
        C15809k.d(d0.a(this), null, null, new f(null), 3, null);
    }
}
