package com.meijer.mobile.rateandtip.ux;

import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.rateandtip.ux.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kl.Tip;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import tp.Builder;
import tp.EnumC17127a;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17144F;
import tv.P;
import vj.C17588a;
import vp.RateShopperRequest;
import vp.RateShopperResponse;
import vp.TipShopperResponse;
import xp.g;
import xs.C18091a;
import xs.EnumC18092b;
import xs.TipSuggestionButtonDecorator;
import yp.AbstractC18267a;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 Q2\u00020\u0001:\u0004C6?;B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010)J\u000f\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010)J\u0019\u0010/\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010)J\u0017\u00103\u001a\u00020\b2\u0006\u00102\u001a\u00020-H\u0002¢\u0006\u0004\b3\u00100J\u0019\u00105\u001a\u00020\b2\b\b\u0002\u00104\u001a\u00020-H\u0002¢\u0006\u0004\b5\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010=\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00060B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0017\u0010N\u001a\b\u0012\u0004\u0012\u0002090K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020:0B8F¢\u0006\u0006\u001a\u0004\bO\u0010F¨\u0006R"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y;", "Landroidx/lifecycle/c0;", "Lup/d;", "rateAndTipRepository", "<init>", "(Lup/d;)V", "Lxp/g;", "screen", "", "Q", "(Lxp/g;)V", "", "screenRoute", "d0", "(Ljava/lang/String;)V", "Ltp/b;", "builder", "Ltp/a;", "flowType", "O", "(Ltp/b;Ltp/a;)V", "Lcom/meijer/mobile/rateandtip/ux/y$a;", "action", "R", "(Lcom/meijer/mobile/rateandtip/ux/y$a;)V", "", "shopperRating", "G", "(I)V", "Lxs/b;", "tipOption", "b0", "(Lxs/b;)V", "", "orderTotalPrice", "F", "(Lxs/b;D)D", "tipAmountInCents", "h0", "(D)V", "a0", "()V", "W", "U", "S", "", "rated", "M", "(Z)V", "Y", "value", "j0", "isTipped", "I", "a", "Lup/d;", "Lvj/a;", "Lcom/meijer/mobile/rateandtip/ux/y$d;", "Lcom/meijer/mobile/rateandtip/ux/y$c;", "b", "Lvj/a;", "modelStore", "Ltv/A;", "c", "Ltv/A;", "_screenFlow", "Ltv/F;", "d", "Ltv/F;", "K", "()Ltv/F;", "screenFlow", "e", "Z", "isEditRating", "Ltv/P;", "L", "()Ltv/P;", "uiState", "getEvents", "events", "f", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class y extends c0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f115155g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final up.d rateAndTipRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C17588a<ViewState, c> modelStore;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<xp.g> _screenFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<xp.g> screenFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isEditRating;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$a;", "", "<init>", "()V", "a", "c", "b", "e", "f", "k", "i", "j", "h", "g", "d", "Lcom/meijer/mobile/rateandtip/ux/y$a$a;", "Lcom/meijer/mobile/rateandtip/ux/y$a$b;", "Lcom/meijer/mobile/rateandtip/ux/y$a$c;", "Lcom/meijer/mobile/rateandtip/ux/y$a$d;", "Lcom/meijer/mobile/rateandtip/ux/y$a$e;", "Lcom/meijer/mobile/rateandtip/ux/y$a$f;", "Lcom/meijer/mobile/rateandtip/ux/y$a$g;", "Lcom/meijer/mobile/rateandtip/ux/y$a$h;", "Lcom/meijer/mobile/rateandtip/ux/y$a$i;", "Lcom/meijer/mobile/rateandtip/ux/y$a$j;", "Lcom/meijer/mobile/rateandtip/ux/y$a$k;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$a$a;", "Lcom/meijer/mobile/rateandtip/ux/y$a;", "", "shopperRating", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.rateandtip.ux.y$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class ChangeRating extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int shopperRating;

            public ChangeRating(int i10) {
                super(null);
                this.shopperRating = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ChangeRating) && this.shopperRating == ((ChangeRating) other).shopperRating;
            }

            public int hashCode() {
                return Integer.hashCode(this.shopperRating);
            }

            public String toString() {
                return "ChangeRating(shopperRating=" + this.shopperRating + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getShopperRating() {
                return this.shopperRating;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$a$b;", "Lcom/meijer/mobile/rateandtip/ux/y$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f115162a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 939231935;
            }

            public String toString() {
                return "EditRating";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$a$c;", "Lcom/meijer/mobile/rateandtip/ux/y$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f115163a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1408939335;
            }

            public String toString() {
                return "EditTip";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$a$d;", "Lcom/meijer/mobile/rateandtip/ux/y$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f115164a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1465996090;
            }

            public String toString() {
                return "FinishActivity";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$a$e;", "Lcom/meijer/mobile/rateandtip/ux/y$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final e f115165a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return 998978580;
            }

            public String toString() {
                return "RateLater";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$a$f;", "Lcom/meijer/mobile/rateandtip/ux/y$a;", "Lxs/b;", "tipOption", "<init>", "(Lxs/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxs/b;", "()Lxs/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.rateandtip.ux.y$a$f, reason: from toString */
        public static final /* data */ class SelectTipOption extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final EnumC18092b tipOption;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelectTipOption) && this.tipOption == ((SelectTipOption) other).tipOption;
            }

            public int hashCode() {
                return this.tipOption.hashCode();
            }

            public String toString() {
                return "SelectTipOption(tipOption=" + this.tipOption + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectTipOption(EnumC18092b tipOption) {
                super(null);
                Intrinsics.j(tipOption, "tipOption");
                this.tipOption = tipOption;
            }

            /* renamed from: a, reason: from getter */
            public final EnumC18092b getTipOption() {
                return this.tipOption;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$a$g;", "Lcom/meijer/mobile/rateandtip/ux/y$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class g extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final g f115167a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return 1919452383;
            }

            public String toString() {
                return "SubmitRateRequest";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$a$h;", "Lcom/meijer/mobile/rateandtip/ux/y$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final h f115168a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return -1631467484;
            }

            public String toString() {
                return "SubmitTipRequest";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$a$i;", "Lcom/meijer/mobile/rateandtip/ux/y$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final i f115169a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return -48683223;
            }

            public String toString() {
                return "TipLater";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$a$j;", "Lcom/meijer/mobile/rateandtip/ux/y$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class j extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final j f115170a = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public int hashCode() {
                return 571330531;
            }

            public String toString() {
                return "TipScreenPrimaryButtonClick";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$a$k;", "Lcom/meijer/mobile/rateandtip/ux/y$a;", "", "tipAmountInCents", "<init>", "(D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.rateandtip.ux.y$a$k, reason: from toString */
        public static final /* data */ class UpdateCustomTipAmount extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final double tipAmountInCents;

            public UpdateCustomTipAmount(double d10) {
                super(null);
                this.tipAmountInCents = d10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateCustomTipAmount) && Double.compare(this.tipAmountInCents, ((UpdateCustomTipAmount) other).tipAmountInCents) == 0;
            }

            public int hashCode() {
                return Double.hashCode(this.tipAmountInCents);
            }

            public String toString() {
                return "UpdateCustomTipAmount(tipAmountInCents=" + this.tipAmountInCents + ')';
            }

            /* renamed from: a, reason: from getter */
            public final double getTipAmountInCents() {
                return this.tipAmountInCents;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$c;", "", "<init>", "()V", "a", "b", "Lcom/meijer/mobile/rateandtip/ux/y$c$a;", "Lcom/meijer/mobile/rateandtip/ux/y$c$b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$c$a;", "Lcom/meijer/mobile/rateandtip/ux/y$c;", "Ltp/b;", "rateAndTipBuilder", "Ltp/a;", "flowType", "<init>", "(Ltp/b;Ltp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltp/b;", "b", "()Ltp/b;", "Ltp/a;", "()Ltp/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.rateandtip.ux.y$c$a, reason: from toString */
        public static final /* data */ class FinishActivity extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Builder rateAndTipBuilder;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final EnumC17127a flowType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FinishActivity)) {
                    return false;
                }
                FinishActivity finishActivity = (FinishActivity) other;
                return Intrinsics.e(this.rateAndTipBuilder, finishActivity.rateAndTipBuilder) && this.flowType == finishActivity.flowType;
            }

            public int hashCode() {
                return (this.rateAndTipBuilder.hashCode() * 31) + this.flowType.hashCode();
            }

            public String toString() {
                return "FinishActivity(rateAndTipBuilder=" + this.rateAndTipBuilder + ", flowType=" + this.flowType + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinishActivity(Builder rateAndTipBuilder, EnumC17127a flowType) {
                super(null);
                Intrinsics.j(rateAndTipBuilder, "rateAndTipBuilder");
                Intrinsics.j(flowType, "flowType");
                this.rateAndTipBuilder = rateAndTipBuilder;
                this.flowType = flowType;
            }

            /* renamed from: a, reason: from getter */
            public final EnumC17127a getFlowType() {
                return this.flowType;
            }

            /* renamed from: b, reason: from getter */
            public final Builder getRateAndTipBuilder() {
                return this.rateAndTipBuilder;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$c$b;", "Lcom/meijer/mobile/rateandtip/ux/y$c;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.rateandtip.ux.y$c$b, reason: from toString */
        public static final /* data */ class ShowErrorToast extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String errorMessage;

            public ShowErrorToast(String str) {
                super(null);
                this.errorMessage = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowErrorToast) && Intrinsics.e(this.errorMessage, ((ShowErrorToast) other).errorMessage);
            }

            public int hashCode() {
                String str = this.errorMessage;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "ShowErrorToast(errorMessage=" + this.errorMessage + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\f\b\u0002\u0010\n\u001a\u00060\bj\u0002`\t\u0012\f\b\u0002\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 JÂ\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\b\u0002\u0010\n\u001a\u00060\bj\u0002`\t2\f\b\u0002\u0010\r\u001a\u00060\u000bj\u0002`\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010\n\u001a\u00060\bj\u0002`\t8\u0006¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b6\u0010$R\u001b\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010&R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\b:\u0010&R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b6\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bB\u00105\u001a\u0004\bC\u0010$R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\bD\u0010$R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bE\u0010?\u001a\u0004\bF\u0010AR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b1\u0010IR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bD\u0010N\u001a\u0004\bJ\u0010OR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010*\u001a\u0004\bP\u0010,R\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\bQ\u00104R\u0017\u0010U\u001a\u00020R8\u0006¢\u0006\f\n\u0004\bP\u0010S\u001a\u0004\bE\u0010TR\u0017\u0010V\u001a\u00020R8\u0006¢\u0006\f\n\u0004\bQ\u0010S\u001a\u0004\bB\u0010TR\u0017\u0010W\u001a\u00020R8\u0006¢\u0006\f\n\u0004\b9\u0010S\u001a\u0004\bG\u0010TR\u0017\u0010X\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010*\u001a\u0004\b>\u0010,R\u0019\u0010Y\u001a\u0004\u0018\u00010R8\u0006¢\u0006\f\n\u0004\bL\u0010S\u001a\u0004\b7\u0010T¨\u0006Z"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$d;", "", "", "isLoading", "Ltp/a;", "flowType", "Lxp/g;", "currentScreen", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "shopperRating", "Lxs/a;", "rateDecorator", "", "tipAmount", "shopperName", "shopperImageUrl", "totalPrice", "Lyp/a;", "cardDetails", "", "Lxs/c;", "tipShopperButtonDecorators", "Lxs/b;", "selectedTipOption", "shouldShowErrorOnTipScreen", "startScreen", "<init>", "(ZLtp/a;Lxp/g;Ljava/lang/String;IILxs/a;DLjava/lang/String;Ljava/lang/String;DLyp/a;Ljava/util/List;Lxs/b;ZLxp/g;)V", "a", "(ZLtp/a;Lxp/g;Ljava/lang/String;IILxs/a;DLjava/lang/String;Ljava/lang/String;DLyp/a;Ljava/util/List;Lxs/b;ZLxp/g;)Lcom/meijer/mobile/rateandtip/ux/y$d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "w", "()Z", "b", "Ltp/a;", "f", "()Ltp/a;", "c", "Lxp/g;", "d", "()Lxp/g;", "Ljava/lang/String;", "g", "e", "I", "s", "p", "Lxs/a;", "j", "()Lxs/a;", "h", "D", "t", "()D", "i", "o", "n", "k", "v", "l", "Lyp/a;", "()Lyp/a;", "m", "Ljava/util/List;", "u", "()Ljava/util/List;", "Lxs/b;", "()Lxs/b;", "q", "r", "Lak/a;", "Lak/a;", "()Lak/a;", "screenTitle", "primaryButtonText", "secondaryButtonText", "primaryButtonEnabled", "customTipError", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.rateandtip.ux.y$d, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC17127a flowType;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final xp.g currentScreen;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String orderId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int storeId;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final int shopperRating;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final C18091a rateDecorator;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final double tipAmount;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shopperName;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shopperImageUrl;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final double totalPrice;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC18267a cardDetails;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<TipSuggestionButtonDecorator> tipShopperButtonDecorators;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC18092b selectedTipOption;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldShowErrorOnTipScreen;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final xp.g startScreen;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final AbstractC5607a screenTitle;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final AbstractC5607a primaryButtonText;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final AbstractC5607a secondaryButtonText;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final boolean primaryButtonEnabled;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final AbstractC5607a customTipError;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.rateandtip.ux.y$d$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC17127a.values().length];
                try {
                    iArr[EnumC17127a.f161939c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC17127a.f161940d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC17127a.f161941e.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public ViewState() {
            this(false, null, null, null, 0, 0, null, 0.0d, null, null, 0.0d, null, null, null, false, null, 65535, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.isLoading == viewState.isLoading && this.flowType == viewState.flowType && Intrinsics.e(this.currentScreen, viewState.currentScreen) && Intrinsics.e(this.orderId, viewState.orderId) && this.storeId == viewState.storeId && this.shopperRating == viewState.shopperRating && Intrinsics.e(this.rateDecorator, viewState.rateDecorator) && Double.compare(this.tipAmount, viewState.tipAmount) == 0 && Intrinsics.e(this.shopperName, viewState.shopperName) && Intrinsics.e(this.shopperImageUrl, viewState.shopperImageUrl) && Double.compare(this.totalPrice, viewState.totalPrice) == 0 && Intrinsics.e(this.cardDetails, viewState.cardDetails) && Intrinsics.e(this.tipShopperButtonDecorators, viewState.tipShopperButtonDecorators) && this.selectedTipOption == viewState.selectedTipOption && this.shouldShowErrorOnTipScreen == viewState.shouldShowErrorOnTipScreen && Intrinsics.e(this.startScreen, viewState.startScreen);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((Boolean.hashCode(this.isLoading) * 31) + this.flowType.hashCode()) * 31) + this.currentScreen.hashCode()) * 31) + this.orderId.hashCode()) * 31) + Integer.hashCode(this.storeId)) * 31) + Integer.hashCode(this.shopperRating)) * 31) + this.rateDecorator.hashCode()) * 31) + Double.hashCode(this.tipAmount)) * 31;
            String str = this.shopperName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.shopperImageUrl;
            return ((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Double.hashCode(this.totalPrice)) * 31) + this.cardDetails.hashCode()) * 31) + this.tipShopperButtonDecorators.hashCode()) * 31) + this.selectedTipOption.hashCode()) * 31) + Boolean.hashCode(this.shouldShowErrorOnTipScreen)) * 31) + this.startScreen.hashCode();
        }

        public String toString() {
            return "ViewState(isLoading=" + this.isLoading + ", flowType=" + this.flowType + ", currentScreen=" + this.currentScreen + ", orderId=" + this.orderId + ", storeId=" + this.storeId + ", shopperRating=" + this.shopperRating + ", rateDecorator=" + this.rateDecorator + ", tipAmount=" + this.tipAmount + ", shopperName=" + this.shopperName + ", shopperImageUrl=" + this.shopperImageUrl + ", totalPrice=" + this.totalPrice + ", cardDetails=" + this.cardDetails + ", tipShopperButtonDecorators=" + this.tipShopperButtonDecorators + ", selectedTipOption=" + this.selectedTipOption + ", shouldShowErrorOnTipScreen=" + this.shouldShowErrorOnTipScreen + ", startScreen=" + this.startScreen + ')';
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewState(boolean r15, tp.EnumC17127a r16, xp.g r17, java.lang.String r18, int r19, int r20, xs.C18091a r21, double r22, java.lang.String r24, java.lang.String r25, double r26, yp.AbstractC18267a r28, java.util.List<xs.TipSuggestionButtonDecorator> r29, xs.EnumC18092b r30, boolean r31, xp.g r32) {
            /*
                Method dump skipped, instructions count: 449
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.rateandtip.ux.y.ViewState.<init>(boolean, tp.a, xp.g, java.lang.String, int, int, xs.a, double, java.lang.String, java.lang.String, double, yp.a, java.util.List, xs.b, boolean, xp.g):void");
        }

        public static /* synthetic */ ViewState b(ViewState viewState, boolean z10, EnumC17127a enumC17127a, xp.g gVar, String str, int i10, int i11, C18091a c18091a, double d10, String str2, String str3, double d11, AbstractC18267a abstractC18267a, List list, EnumC18092b enumC18092b, boolean z11, xp.g gVar2, int i12, Object obj) {
            return viewState.a((i12 & 1) != 0 ? viewState.isLoading : z10, (i12 & 2) != 0 ? viewState.flowType : enumC17127a, (i12 & 4) != 0 ? viewState.currentScreen : gVar, (i12 & 8) != 0 ? viewState.orderId : str, (i12 & 16) != 0 ? viewState.storeId : i10, (i12 & 32) != 0 ? viewState.shopperRating : i11, (i12 & 64) != 0 ? viewState.rateDecorator : c18091a, (i12 & 128) != 0 ? viewState.tipAmount : d10, (i12 & 256) != 0 ? viewState.shopperName : str2, (i12 & 512) != 0 ? viewState.shopperImageUrl : str3, (i12 & 1024) != 0 ? viewState.totalPrice : d11, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? viewState.cardDetails : abstractC18267a, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? viewState.tipShopperButtonDecorators : list, (i12 & 8192) != 0 ? viewState.selectedTipOption : enumC18092b, (i12 & 16384) != 0 ? viewState.shouldShowErrorOnTipScreen : z11, (i12 & 32768) != 0 ? viewState.startScreen : gVar2);
        }

        public final ViewState a(boolean isLoading, EnumC17127a flowType, xp.g currentScreen, String orderId, int storeId, int shopperRating, C18091a rateDecorator, double tipAmount, String shopperName, String shopperImageUrl, double totalPrice, AbstractC18267a cardDetails, List<TipSuggestionButtonDecorator> tipShopperButtonDecorators, EnumC18092b selectedTipOption, boolean shouldShowErrorOnTipScreen, xp.g startScreen) {
            Intrinsics.j(flowType, "flowType");
            Intrinsics.j(currentScreen, "currentScreen");
            Intrinsics.j(orderId, "orderId");
            Intrinsics.j(rateDecorator, "rateDecorator");
            Intrinsics.j(cardDetails, "cardDetails");
            Intrinsics.j(tipShopperButtonDecorators, "tipShopperButtonDecorators");
            Intrinsics.j(selectedTipOption, "selectedTipOption");
            Intrinsics.j(startScreen, "startScreen");
            return new ViewState(isLoading, flowType, currentScreen, orderId, storeId, shopperRating, rateDecorator, tipAmount, shopperName, shopperImageUrl, totalPrice, cardDetails, tipShopperButtonDecorators, selectedTipOption, shouldShowErrorOnTipScreen, startScreen);
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC18267a getCardDetails() {
            return this.cardDetails;
        }

        /* renamed from: d, reason: from getter */
        public final xp.g getCurrentScreen() {
            return this.currentScreen;
        }

        /* renamed from: e, reason: from getter */
        public final AbstractC5607a getCustomTipError() {
            return this.customTipError;
        }

        /* renamed from: f, reason: from getter */
        public final EnumC17127a getFlowType() {
            return this.flowType;
        }

        /* renamed from: g, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getPrimaryButtonEnabled() {
            return this.primaryButtonEnabled;
        }

        /* renamed from: i, reason: from getter */
        public final AbstractC5607a getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* renamed from: j, reason: from getter */
        public final C18091a getRateDecorator() {
            return this.rateDecorator;
        }

        /* renamed from: k, reason: from getter */
        public final AbstractC5607a getScreenTitle() {
            return this.screenTitle;
        }

        /* renamed from: l, reason: from getter */
        public final AbstractC5607a getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        /* renamed from: m, reason: from getter */
        public final EnumC18092b getSelectedTipOption() {
            return this.selectedTipOption;
        }

        /* renamed from: n, reason: from getter */
        public final String getShopperImageUrl() {
            return this.shopperImageUrl;
        }

        /* renamed from: o, reason: from getter */
        public final String getShopperName() {
            return this.shopperName;
        }

        /* renamed from: p, reason: from getter */
        public final int getShopperRating() {
            return this.shopperRating;
        }

        /* renamed from: q, reason: from getter */
        public final boolean getShouldShowErrorOnTipScreen() {
            return this.shouldShowErrorOnTipScreen;
        }

        /* renamed from: r, reason: from getter */
        public final xp.g getStartScreen() {
            return this.startScreen;
        }

        /* renamed from: s, reason: from getter */
        public final int getStoreId() {
            return this.storeId;
        }

        /* renamed from: t, reason: from getter */
        public final double getTipAmount() {
            return this.tipAmount;
        }

        public final List<TipSuggestionButtonDecorator> u() {
            return this.tipShopperButtonDecorators;
        }

        /* renamed from: v, reason: from getter */
        public final double getTotalPrice() {
            return this.totalPrice;
        }

        /* renamed from: w, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public /* synthetic */ ViewState(boolean z10, EnumC17127a enumC17127a, xp.g gVar, String str, int i10, int i11, C18091a c18091a, double d10, String str2, String str3, double d11, AbstractC18267a abstractC18267a, List list, EnumC18092b enumC18092b, boolean z11, xp.g gVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? EnumC17127a.f161939c : enumC17127a, (i12 & 4) != 0 ? g.a.f169839b : gVar, (i12 & 8) != 0 ? "" : str, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? new C18091a(null, null, null, 7, null) : c18091a, (i12 & 128) != 0 ? 0.0d : d10, (i12 & 256) != 0 ? null : str2, (i12 & 512) == 0 ? str3 : null, (i12 & 1024) == 0 ? d11 : 0.0d, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? new AbstractC18267a.DefaultCard("") : abstractC18267a, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? CollectionsKt.m() : list, (i12 & 8192) != 0 ? EnumC18092b.f169911o : enumC18092b, (i12 & 16384) != 0 ? false : z11, (i12 & 32768) != 0 ? g.a.f169839b : gVar2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17127a.values().length];
            try {
                iArr[EnumC17127a.f161940d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17127a.f161939c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17127a.f161941e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.rateandtip.ux.RateAndTipViewModel$navigateTo$1", f = "RateAndTipViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f115196a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ xp.g f115198c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y.this.new f(this.f115198c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(xp.g gVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f115198c = gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f115196a == 0) {
                ResultKt.b(obj);
                y.this._screenFlow.b(this.f115198c);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.rateandtip.ux.RateAndTipViewModel$onSubmitRateRequest$2$1", f = "RateAndTipViewModel.kt", l = {224}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f115199a;

        /* renamed from: b, reason: collision with root package name */
        int f115200b;

        /* renamed from: c, reason: collision with root package name */
        int f115201c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f115202d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ViewState f115204f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ViewState viewState, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f115204f = viewState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = y.this.new g(this.f115204f, continuation);
            gVar.f115202d = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState k(ViewState viewState) {
            return ViewState.b(viewState, false, null, null, null, 0, 0, null, 0.0d, null, null, 0.0d, null, null, null, false, null, 65534, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState l(ViewState viewState) {
            return ViewState.b(viewState, false, null, null, null, 0, 0, null, 0.0d, null, null, 0.0d, null, null, null, false, null, 65534, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            IllegalStateException illegalStateException;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f115201c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f115202d;
                    y yVar = y.this;
                    ViewState viewState = this.f115204f;
                    Result.Companion companion = Result.INSTANCE;
                    up.d dVar = yVar.rateAndTipRepository;
                    String orderId = viewState.getOrderId();
                    String shopperName = viewState.getShopperName();
                    if (shopperName == null) {
                        shopperName = "";
                    }
                    RateShopperRequest rateShopperRequest = new RateShopperRequest(shopperName, String.valueOf(viewState.getShopperRating()));
                    this.f115202d = interfaceC16622O;
                    this.f115199a = interfaceC16622O;
                    this.f115200b = 0;
                    this.f115201c = 1;
                    obj = dVar.d(orderId, rateShopperRequest, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b((RateShopperResponse) obj);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            y yVar2 = y.this;
            if (Result.h(objB)) {
                yVar2.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return y.g.k((y.ViewState) obj2);
                    }
                });
                yVar2.M(true);
            }
            y yVar3 = y.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                yVar3.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.A
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return y.g.l((y.ViewState) obj2);
                    }
                });
                if (thE instanceof IllegalStateException) {
                    illegalStateException = (IllegalStateException) thE;
                } else {
                    illegalStateException = null;
                }
                if (illegalStateException != null) {
                    yVar3.modelStore.c(new c.ShowErrorToast(thE.getMessage()));
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.rateandtip.ux.RateAndTipViewModel$onSubmitTipRequest$2$1", f = "RateAndTipViewModel.kt", l = {196}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f115205a;

        /* renamed from: b, reason: collision with root package name */
        int f115206b;

        /* renamed from: c, reason: collision with root package name */
        int f115207c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f115208d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ViewState f115210f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f115211g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ double f115212h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ViewState viewState, boolean z10, double d10, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f115210f = viewState;
            this.f115211g = z10;
            this.f115212h = d10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = y.this.new h(this.f115210f, this.f115211g, this.f115212h, continuation);
            hVar.f115208d = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState k(ViewState viewState) {
            return ViewState.b(viewState, false, null, null, null, 0, 0, null, 0.0d, null, null, 0.0d, null, null, null, false, null, 65534, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ViewState l(ViewState viewState) {
            return ViewState.b(viewState, false, null, null, null, 0, 0, null, 0.0d, null, null, 0.0d, null, null, null, false, null, 65534, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            IllegalStateException illegalStateException;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f115207c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f115208d;
                    y yVar = y.this;
                    ViewState viewState = this.f115210f;
                    boolean z10 = this.f115211g;
                    double d10 = this.f115212h;
                    Result.Companion companion = Result.INSTANCE;
                    up.d dVar = yVar.rateAndTipRepository;
                    String orderId = viewState.getOrderId();
                    int storeId = viewState.getStoreId();
                    Tip tip = new Tip(z10, d10);
                    this.f115208d = interfaceC16622O;
                    this.f115205a = interfaceC16622O;
                    this.f115206b = 0;
                    this.f115207c = 1;
                    obj = dVar.e(orderId, storeId, tip, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b((TipShopperResponse) obj);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            y yVar2 = y.this;
            if (Result.h(objB)) {
                yVar2.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.B
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return y.h.k((y.ViewState) obj2);
                    }
                });
                yVar2.I(true);
            }
            y yVar3 = y.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                yVar3.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.C
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return y.h.l((y.ViewState) obj2);
                    }
                });
                if (thE instanceof IllegalStateException) {
                    illegalStateException = (IllegalStateException) thE;
                } else {
                    illegalStateException = null;
                }
                if (illegalStateException != null) {
                    yVar3.modelStore.c(new c.ShowErrorToast(thE.getMessage()));
                }
            }
            return Unit.f142422a;
        }
    }

    public y(up.d rateAndTipRepository) {
        Intrinsics.j(rateAndTipRepository, "rateAndTipRepository");
        this.rateAndTipRepository = rateAndTipRepository;
        this.modelStore = new C17588a<>(new ViewState(false, null, null, null, 0, 0, null, 0.0d, null, null, 0.0d, null, null, null, false, null, 65535, null));
        InterfaceC17139A<xp.g> interfaceC17139AB = C17146H.b(0, 1, null, 5, null);
        this._screenFlow = interfaceC17139AB;
        this.screenFlow = C17154h.b(interfaceC17139AB);
    }

    private final double F(EnumC18092b tipOption, double orderTotalPrice) {
        if (tipOption == EnumC18092b.f169908l) {
            return 0.0d;
        }
        return tipOption.getHasFormatArgs() ? tipOption.getValue() * orderTotalPrice : tipOption.getValue();
    }

    private final void G(final int shopperRating) {
        this.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.H(shopperRating, (y.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState H(int i10, ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, false, null, null, null, 0, i10, null, 0.0d, null, null, 0.0d, null, null, null, false, null, 65503, null);
    }

    static /* synthetic */ void J(y yVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        yVar.I(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState N(ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, false, EnumC17127a.f161941e, null, null, 0, 0, null, 0.0d, null, null, 0.0d, null, null, null, false, g.c.f169841b, 32765, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState P(EnumC17127a enumC17127a, Builder builder, ViewState oldState) {
        xp.g gVar;
        Iterator it;
        double d10;
        Intrinsics.j(oldState, "oldState");
        xp.g gVar2 = enumC17127a == EnumC17127a.f161941e ? g.c.f169841b : g.a.f169839b;
        String orderId = builder.getOrderId();
        if (orderId == null) {
            orderId = "";
        }
        String str = orderId;
        Integer storeId = builder.getStoreId();
        int iIntValue = storeId != null ? storeId.intValue() : 0;
        C18091a c18091aA = C18091a.INSTANCE.a(builder, false);
        String shopperImage = builder.getShopperImage();
        Double tipAmount = builder.getTipAmount();
        double dDoubleValue = tipAmount != null ? tipAmount.doubleValue() : 0.0d;
        Double totalPrice = builder.getTotalPrice();
        double dDoubleValue2 = totalPrice != null ? totalPrice.doubleValue() : 0.0d;
        AbstractC18267a abstractC18267aA = AbstractC18267a.INSTANCE.a(builder.getCardName(), builder.getCardNumber());
        String shopperName = builder.getShopperName();
        List<EnumC18092b> listC = TipSuggestionButtonDecorator.INSTANCE.c(builder.getTotalPrice(), false);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
        for (Iterator it2 = listC.iterator(); it2.hasNext(); it2 = it) {
            EnumC18092b enumC18092b = (EnumC18092b) it2.next();
            AbstractC18267a abstractC18267a = abstractC18267aA;
            TipSuggestionButtonDecorator.Companion companion = TipSuggestionButtonDecorator.INSTANCE;
            Double totalPrice2 = builder.getTotalPrice();
            if (totalPrice2 != null) {
                double dDoubleValue3 = totalPrice2.doubleValue();
                it = it2;
                d10 = dDoubleValue3;
            } else {
                it = it2;
                d10 = 0.0d;
            }
            arrayList.add(companion.b(false, enumC18092b, d10));
            abstractC18267aA = abstractC18267a;
        }
        AbstractC18267a abstractC18267a2 = abstractC18267aA;
        int i10 = e.$EnumSwitchMapping$0[enumC17127a.ordinal()];
        if (i10 == 1 || i10 == 2) {
            gVar = g.a.f169839b;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = g.c.f169841b;
        }
        xp.g gVar3 = gVar;
        Integer rating = builder.getRating();
        return ViewState.b(oldState, false, enumC17127a, gVar2, str, iIntValue, rating != null ? rating.intValue() : 0, c18091aA, dDoubleValue, shopperName, shopperImage, dDoubleValue2, abstractC18267a2, arrayList, null, false, gVar3, 24577, null);
    }

    private final void S() {
        this.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.T((y.ViewState) obj);
            }
        });
        M(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState T(ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, false, null, null, null, 0, 0, null, 0.0d, null, null, 0.0d, null, null, null, false, null, 65503, null);
    }

    private final void U() {
        this.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.V((y.ViewState) obj);
            }
        });
        C16648k.d(d0.a(this), null, null, new g(L().getValue(), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState V(ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, true, null, null, null, 0, 0, null, 0.0d, null, null, 0.0d, null, null, null, false, null, 65534, null);
    }

    private final void W() {
        this.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.X((y.ViewState) obj);
            }
        });
        ViewState value = L().getValue();
        if (value.getTipAmount() == 0.0d) {
            J(this, false, 1, null);
        } else {
            boolean hasFormatArgs = value.getSelectedTipOption().getHasFormatArgs();
            C16648k.d(d0.a(this), null, null, new h(value, hasFormatArgs, hasFormatArgs ? value.getSelectedTipOption().getValue() * 100 : value.getTipAmount(), null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState X(ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, true, null, null, null, 0, 0, null, 0.0d, null, null, 0.0d, null, null, null, false, null, 65534, null);
    }

    private final void Y() {
        this.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.Z((y.ViewState) obj);
            }
        });
        Q(g.b.f169840b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState Z(ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        EnumC18092b enumC18092b = EnumC18092b.f169901e;
        List<TipSuggestionButtonDecorator> listU = oldState.u();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listU, 10));
        Iterator<T> it = listU.iterator();
        while (it.hasNext()) {
            arrayList.add(TipSuggestionButtonDecorator.b((TipSuggestionButtonDecorator) it.next(), null, null, false, 3, null));
        }
        return ViewState.b(oldState, false, null, null, null, 0, 0, null, 0.0d, null, null, 0.0d, null, arrayList, enumC18092b, false, null, 36735, null);
    }

    private final void b0(final EnumC18092b tipOption) {
        this.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.c0(this.f115152a, tipOption, (y.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState c0(y yVar, EnumC18092b enumC18092b, ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        List<TipSuggestionButtonDecorator> listU = oldState.u();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listU, 10));
        for (TipSuggestionButtonDecorator tipSuggestionButtonDecorator : listU) {
            arrayList.add(TipSuggestionButtonDecorator.b(tipSuggestionButtonDecorator, null, null, enumC18092b.getPosition() == tipSuggestionButtonDecorator.getTipOption().getPosition(), 3, null));
        }
        return ViewState.b(oldState, false, null, null, null, 0, 0, null, yVar.F(enumC18092b, oldState.getTotalPrice()), null, null, 0.0d, null, arrayList, enumC18092b, false, null, 36735, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState e0(ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, false, null, g.a.f169839b, null, 0, 0, null, 0.0d, null, null, 0.0d, null, null, null, false, null, 65531, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState f0(ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, false, null, g.c.f169841b, null, 0, 0, null, 0.0d, null, null, 0.0d, null, null, null, false, null, 65531, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState g0(ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, false, null, g.b.f169840b, null, 0, 0, null, 0.0d, null, null, 0.0d, null, null, null, false, null, 65531, null);
    }

    private final void h0(final double tipAmountInCents) {
        this.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.i0(tipAmountInCents, (y.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState i0(double d10, ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, false, null, null, null, 0, 0, null, d10 / 100, null, null, 0.0d, null, null, null, false, null, 65407, null);
    }

    private final void j0(final boolean value) {
        this.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.k0(value, (y.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState k0(boolean z10, ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return ViewState.b(oldState, false, null, null, null, 0, 0, null, 0.0d, null, null, 0.0d, null, null, null, z10, null, 49151, null);
    }

    public final InterfaceC17144F<xp.g> K() {
        return this.screenFlow;
    }

    public final P<ViewState> L() {
        return this.modelStore.b();
    }

    public final void O(final Builder builder, final EnumC17127a flowType) {
        Intrinsics.j(builder, "builder");
        Intrinsics.j(flowType, "flowType");
        this.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.P(flowType, builder, (y.ViewState) obj);
            }
        });
    }

    public final void Q(xp.g screen) {
        Intrinsics.j(screen, "screen");
        C16648k.d(d0.a(this), null, null, new f(screen, null), 3, null);
    }

    public final void R(a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.ChangeRating) {
            G(((a.ChangeRating) action).getShopperRating());
            return;
        }
        if (action instanceof a.c) {
            Q(g.c.f169841b);
            return;
        }
        if (action instanceof a.b) {
            this.isEditRating = true;
            Q(g.a.f169839b);
            return;
        }
        if (action instanceof a.e) {
            S();
            return;
        }
        if (action instanceof a.SelectTipOption) {
            b0(((a.SelectTipOption) action).getTipOption());
            return;
        }
        if (action instanceof a.UpdateCustomTipAmount) {
            h0(((a.UpdateCustomTipAmount) action).getTipAmountInCents());
            return;
        }
        if (action instanceof a.i) {
            Y();
            return;
        }
        if (action instanceof a.j) {
            a0();
            return;
        }
        if (action instanceof a.h) {
            W();
        } else if (action instanceof a.g) {
            U();
        } else {
            if (!(action instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            J(this, false, 1, null);
        }
    }

    public final void d0(String screenRoute) {
        if (Intrinsics.e(screenRoute, g.a.f169839b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String())) {
            this.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y.e0((y.ViewState) obj);
                }
            });
        } else if (Intrinsics.e(screenRoute, g.c.f169841b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String())) {
            this.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y.f0((y.ViewState) obj);
                }
            });
        } else if (Intrinsics.e(screenRoute, g.b.f169840b.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String())) {
            this.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y.g0((y.ViewState) obj);
                }
            });
        }
    }

    public final InterfaceC17144F<c> getEvents() {
        return this.modelStore.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(boolean isTipped) {
        double tipAmount;
        ViewState value = L().getValue();
        C17588a<ViewState, c> c17588a = this.modelStore;
        String orderId = value.getOrderId();
        Integer numValueOf = Integer.valueOf(value.getShopperRating());
        if (value.getFlowType() != EnumC17127a.f161940d && !isTipped) {
            tipAmount = 0.0d;
        } else {
            tipAmount = value.getTipAmount();
        }
        c17588a.c(new c.FinishActivity(new Builder(null, orderId, numValueOf, Double.valueOf(tipAmount), null, null, null, null, null, Double.valueOf(value.getTotalPrice()), null, 1521, null), value.getFlowType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(boolean rated) {
        if (L().getValue().getFlowType() == EnumC17127a.f161939c) {
            if (this.isEditRating) {
                Q(g.b.f169840b);
                this.isEditRating = false;
                return;
            } else if (rated) {
                this.modelStore.d(new Function1() { // from class: com.meijer.mobile.rateandtip.ux.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return y.N((y.ViewState) obj);
                    }
                });
                return;
            } else {
                Q(g.c.f169841b);
                return;
            }
        }
        J(this, false, 1, null);
    }

    private final void a0() {
        if (L().getValue().getTipAmount() == 0.0d) {
            j0(true);
        } else {
            Q(g.b.f169840b);
            j0(false);
        }
    }
}
