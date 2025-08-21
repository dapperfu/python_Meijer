package com.meijer.mobile.mperks.ux;

import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import co.AutoClaimReward;
import co.ClippedReward;
import co.RewardDetail;
import com.meijer.mobile.mperks.networking.domain.models.ExpiringPoints;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import gi.C14375c;
import gi.GoogleAdAnalytics;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
import no.MccEnrollmentState;
import no.PointsExpState;
import ok.MccProgram;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import yo.C18335a;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003/*,B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u0002070;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020A068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00109R\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020A0;8\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010?R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020G068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u00109R\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020G0;8\u0006¢\u0006\f\n\u0004\bJ\u0010=\u001a\u0004\bK\u0010?R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020N0R8F¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006V"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Lfo/e;", "rewardsRepository", "Lhi/a;", "analyticsEngine", "<init>", "(Lfo/e;Lhi/a;)V", "", "shouldShow", "", "K", "(Z)V", "w", "()V", "x", "v", "Lok/b$c;", "status", "", "dollarProgress", "E", "(Lok/b$c;D)V", "", "Lcom/meijer/mobile/mperks/networking/domain/models/ExpiringPoints;", "expiringPoints", "F", "(Ljava/util/List;)V", "I", "", "mperksPoints", "G", "(Ljava/lang/String;)V", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "Lcom/meijer/mobile/mperks/ux/V$a;", "action", "D", "(Lcom/meijer/mobile/mperks/ux/V$a;)V", "a", "Lfo/e;", "b", "Lhi/a;", "Lyo/a;", "c", "Lyo/a;", "y", "()Lyo/a;", "setAppPrefManager", "(Lyo/a;)V", "appPrefManager", "Lpv/B;", "Lcom/meijer/mobile/mperks/ux/V$c;", "d", "Lpv/B;", "_pointsBalanceStateFlow", "Lpv/P;", "e", "Lpv/P;", "B", "()Lpv/P;", "pointsBalanceStateFlow", "Lno/c;", "f", "_enrollmentStateFlow", "g", "A", "enrollmentStateFlow", "Lno/d;", "h", "_pointsExpiryStateFlow", "i", "C", "pointsExpiryStateFlow", "Lpv/A;", "Lcom/meijer/mobile/mperks/ux/V$b;", "j", "Lpv/A;", "_event", "Lpv/F;", "getEvents", "()Lpv/F;", "events", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class V extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fo.e rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public C18335a appPrefManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<PointsBalanceViewState> _pointsBalanceStateFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final pv.P<PointsBalanceViewState> pointsBalanceStateFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<MccEnrollmentState> _enrollmentStateFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final pv.P<MccEnrollmentState> enrollmentStateFlow;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<PointsExpState> _pointsExpiryStateFlow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final pv.P<PointsExpState> pointsExpiryStateFlow;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<b> _event;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$a;", "", "<init>", "()V", "j", "g", "h", "f", "e", "l", "b", "c", "m", "a", "k", "i", "d", "Lcom/meijer/mobile/mperks/ux/V$a$a;", "Lcom/meijer/mobile/mperks/ux/V$a$b;", "Lcom/meijer/mobile/mperks/ux/V$a$c;", "Lcom/meijer/mobile/mperks/ux/V$a$d;", "Lcom/meijer/mobile/mperks/ux/V$a$e;", "Lcom/meijer/mobile/mperks/ux/V$a$f;", "Lcom/meijer/mobile/mperks/ux/V$a$g;", "Lcom/meijer/mobile/mperks/ux/V$a$h;", "Lcom/meijer/mobile/mperks/ux/V$a$i;", "Lcom/meijer/mobile/mperks/ux/V$a$j;", "Lcom/meijer/mobile/mperks/ux/V$a$k;", "Lcom/meijer/mobile/mperks/ux/V$a$l;", "Lcom/meijer/mobile/mperks/ux/V$a$m;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$a$a;", "Lcom/meijer/mobile/mperks/ux/V$a;", "Lco/a;", "autoClaimReward", "<init>", "(Lco/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco/a;", "()Lco/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.V$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class AutoEnrollDescriptionClicked extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AutoClaimReward autoClaimReward;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AutoEnrollDescriptionClicked) && Intrinsics.e(this.autoClaimReward, ((AutoEnrollDescriptionClicked) other).autoClaimReward);
            }

            public int hashCode() {
                return this.autoClaimReward.hashCode();
            }

            public String toString() {
                return "AutoEnrollDescriptionClicked(autoClaimReward=" + this.autoClaimReward + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AutoEnrollDescriptionClicked(AutoClaimReward autoClaimReward) {
                super(null);
                Intrinsics.j(autoClaimReward, "autoClaimReward");
                this.autoClaimReward = autoClaimReward;
            }

            /* renamed from: a, reason: from getter */
            public final AutoClaimReward getAutoClaimReward() {
                return this.autoClaimReward;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$a$b;", "Lcom/meijer/mobile/mperks/ux/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f114767a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 906708386;
            }

            public String toString() {
                return "CreditCardViewClickedOnAvailablePill";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$a$c;", "Lcom/meijer/mobile/mperks/ux/V$a;", "Lok/b;", "mccProgram", "<init>", "(Lok/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lok/b;", "()Lok/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.V$a$c, reason: from toString */
        public static final /* data */ class CreditCardViewClickedOnInProgressPill extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final MccProgram mccProgram;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CreditCardViewClickedOnInProgressPill) && Intrinsics.e(this.mccProgram, ((CreditCardViewClickedOnInProgressPill) other).mccProgram);
            }

            public int hashCode() {
                return this.mccProgram.hashCode();
            }

            public String toString() {
                return "CreditCardViewClickedOnInProgressPill(mccProgram=" + this.mccProgram + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CreditCardViewClickedOnInProgressPill(MccProgram mccProgram) {
                super(null);
                Intrinsics.j(mccProgram, "mccProgram");
                this.mccProgram = mccProgram;
            }

            /* renamed from: a, reason: from getter */
            public final MccProgram getMccProgram() {
                return this.mccProgram;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$a$d;", "Lcom/meijer/mobile/mperks/ux/V$a;", "Lgi/a;", "analytics", "<init>", "(Lgi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgi/a;", "()Lgi/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.V$a$d, reason: from toString */
        public static final /* data */ class GoogleAdClicked extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final int f114769b = GoogleAdAnalytics.f134240f;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final GoogleAdAnalytics analytics;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoogleAdClicked) && Intrinsics.e(this.analytics, ((GoogleAdClicked) other).analytics);
            }

            public int hashCode() {
                return this.analytics.hashCode();
            }

            public String toString() {
                return "GoogleAdClicked(analytics=" + this.analytics + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoogleAdClicked(GoogleAdAnalytics analytics) {
                super(null);
                Intrinsics.j(analytics, "analytics");
                this.analytics = analytics;
            }

            /* renamed from: a, reason: from getter */
            public final GoogleAdAnalytics getAnalytics() {
                return this.analytics;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$a$e;", "Lcom/meijer/mobile/mperks/ux/V$a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends a {
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$a$f;", "Lcom/meijer/mobile/mperks/ux/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class f extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final f f114771a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return -119740995;
            }

            public String toString() {
                return "OnGetCardInfo";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$a$g;", "Lcom/meijer/mobile/mperks/ux/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class g extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final g f114772a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return 2095099386;
            }

            public String toString() {
                return "OnGetPointsBalance";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$a$h;", "Lcom/meijer/mobile/mperks/ux/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final h f114773a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return -90416376;
            }

            public String toString() {
                return "OnGetPointsExpiringSummary";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$a$i;", "Lcom/meijer/mobile/mperks/ux/V$a;", "", "shouldShow", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.V$a$i, reason: from toString */
        public static final /* data */ class SeeWhatsNewAction extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldShow;

            public SeeWhatsNewAction(boolean z10) {
                super(null);
                this.shouldShow = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SeeWhatsNewAction) && this.shouldShow == ((SeeWhatsNewAction) other).shouldShow;
            }

            public int hashCode() {
                return Boolean.hashCode(this.shouldShow);
            }

            public String toString() {
                return "SeeWhatsNewAction(shouldShow=" + this.shouldShow + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getShouldShow() {
                return this.shouldShow;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$a$j;", "Lcom/meijer/mobile/mperks/ux/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class j extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final j f114775a = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public int hashCode() {
                return 1114907711;
            }

            public String toString() {
                return "SubmitReceiptClicked";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$a$k;", "Lcom/meijer/mobile/mperks/ux/V$a;", "", "Lco/e;", "coupons", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.V$a$k, reason: from toString */
        public static final /* data */ class ViewAllRewardsClicked extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<ClippedReward> coupons;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewAllRewardsClicked) && Intrinsics.e(this.coupons, ((ViewAllRewardsClicked) other).coupons);
            }

            public int hashCode() {
                return this.coupons.hashCode();
            }

            public String toString() {
                return "ViewAllRewardsClicked(coupons=" + this.coupons + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewAllRewardsClicked(List<ClippedReward> coupons) {
                super(null);
                Intrinsics.j(coupons, "coupons");
                this.coupons = coupons;
            }

            public final List<ClippedReward> a() {
                return this.coupons;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$a$l;", "Lcom/meijer/mobile/mperks/ux/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class l extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final l f114777a = new l();

            private l() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            public int hashCode() {
                return 1959004008;
            }

            public String toString() {
                return "ViewMPerksHistoryClicked";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$a$m;", "Lcom/meijer/mobile/mperks/ux/V$a;", "Lco/k;", "coupon", "", "navigatedFrom", "", "isShoppableReward", "<init>", "(Lco/k;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lco/k;", "()Lco/k;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.V$a$m, reason: from toString */
        public static final /* data */ class ViewRewardDescriptionClicked extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final RewardDetail coupon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String navigatedFrom;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isShoppableReward;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ViewRewardDescriptionClicked)) {
                    return false;
                }
                ViewRewardDescriptionClicked viewRewardDescriptionClicked = (ViewRewardDescriptionClicked) other;
                return Intrinsics.e(this.coupon, viewRewardDescriptionClicked.coupon) && Intrinsics.e(this.navigatedFrom, viewRewardDescriptionClicked.navigatedFrom) && this.isShoppableReward == viewRewardDescriptionClicked.isShoppableReward;
            }

            public int hashCode() {
                return (((this.coupon.hashCode() * 31) + this.navigatedFrom.hashCode()) * 31) + Boolean.hashCode(this.isShoppableReward);
            }

            public String toString() {
                return "ViewRewardDescriptionClicked(coupon=" + this.coupon + ", navigatedFrom=" + this.navigatedFrom + ", isShoppableReward=" + this.isShoppableReward + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewRewardDescriptionClicked(RewardDetail coupon, String navigatedFrom, boolean z10) {
                super(null);
                Intrinsics.j(coupon, "coupon");
                Intrinsics.j(navigatedFrom, "navigatedFrom");
                this.coupon = coupon;
                this.navigatedFrom = navigatedFrom;
                this.isShoppableReward = z10;
            }

            /* renamed from: a, reason: from getter */
            public final RewardDetail getCoupon() {
                return this.coupon;
            }

            /* renamed from: b, reason: from getter */
            public final String getNavigatedFrom() {
                return this.navigatedFrom;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getIsShoppableReward() {
                return this.isShoppableReward;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$b;", "", "<init>", "()V", "h", "c", "i", "a", "e", "b", "f", "d", "g", "Lcom/meijer/mobile/mperks/ux/V$b$a;", "Lcom/meijer/mobile/mperks/ux/V$b$b;", "Lcom/meijer/mobile/mperks/ux/V$b$c;", "Lcom/meijer/mobile/mperks/ux/V$b$d;", "Lcom/meijer/mobile/mperks/ux/V$b$e;", "Lcom/meijer/mobile/mperks/ux/V$b$f;", "Lcom/meijer/mobile/mperks/ux/V$b$g;", "Lcom/meijer/mobile/mperks/ux/V$b$h;", "Lcom/meijer/mobile/mperks/ux/V$b$i;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$b$a;", "Lcom/meijer/mobile/mperks/ux/V$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f114781a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -568415897;
            }

            public String toString() {
                return "CreditCardViewAvailable";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$b$b;", "Lcom/meijer/mobile/mperks/ux/V$b;", "Lok/b;", "mccProgram", "<init>", "(Lok/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lok/b;", "()Lok/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.V$b$b, reason: collision with other inner class name and from toString */
        public static final /* data */ class CreditCardViewInProgress extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final MccProgram mccProgram;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CreditCardViewInProgress) && Intrinsics.e(this.mccProgram, ((CreditCardViewInProgress) other).mccProgram);
            }

            public int hashCode() {
                return this.mccProgram.hashCode();
            }

            public String toString() {
                return "CreditCardViewInProgress(mccProgram=" + this.mccProgram + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CreditCardViewInProgress(MccProgram mccProgram) {
                super(null);
                Intrinsics.j(mccProgram, "mccProgram");
                this.mccProgram = mccProgram;
            }

            /* renamed from: a, reason: from getter */
            public final MccProgram getMccProgram() {
                return this.mccProgram;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$b$c;", "Lcom/meijer/mobile/mperks/ux/V$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f114783a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1615289435;
            }

            public String toString() {
                return "LearnMore";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$b$d;", "Lcom/meijer/mobile/mperks/ux/V$b;", "Lco/a;", "autoClaimReward", "<init>", "(Lco/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco/a;", "()Lco/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.V$b$d, reason: from toString */
        public static final /* data */ class NavigateToAutoEnrollInfoPage extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AutoClaimReward autoClaimReward;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateToAutoEnrollInfoPage) && Intrinsics.e(this.autoClaimReward, ((NavigateToAutoEnrollInfoPage) other).autoClaimReward);
            }

            public int hashCode() {
                return this.autoClaimReward.hashCode();
            }

            public String toString() {
                return "NavigateToAutoEnrollInfoPage(autoClaimReward=" + this.autoClaimReward + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToAutoEnrollInfoPage(AutoClaimReward autoClaimReward) {
                super(null);
                Intrinsics.j(autoClaimReward, "autoClaimReward");
                this.autoClaimReward = autoClaimReward;
            }

            /* renamed from: a, reason: from getter */
            public final AutoClaimReward getAutoClaimReward() {
                return this.autoClaimReward;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$b$e;", "Lcom/meijer/mobile/mperks/ux/V$b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends b {
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$b$f;", "Lcom/meijer/mobile/mperks/ux/V$b;", "Lco/k;", "coupon", "", "navigatedFrom", "", "isShoppableReward", "<init>", "(Lco/k;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lco/k;", "()Lco/k;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.V$b$f, reason: from toString */
        public static final /* data */ class NavigateToDescriptionPage extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final RewardDetail coupon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String navigatedFrom;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isShoppableReward;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToDescriptionPage)) {
                    return false;
                }
                NavigateToDescriptionPage navigateToDescriptionPage = (NavigateToDescriptionPage) other;
                return Intrinsics.e(this.coupon, navigateToDescriptionPage.coupon) && Intrinsics.e(this.navigatedFrom, navigateToDescriptionPage.navigatedFrom) && this.isShoppableReward == navigateToDescriptionPage.isShoppableReward;
            }

            public int hashCode() {
                return (((this.coupon.hashCode() * 31) + this.navigatedFrom.hashCode()) * 31) + Boolean.hashCode(this.isShoppableReward);
            }

            public String toString() {
                return "NavigateToDescriptionPage(coupon=" + this.coupon + ", navigatedFrom=" + this.navigatedFrom + ", isShoppableReward=" + this.isShoppableReward + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToDescriptionPage(RewardDetail coupon, String navigatedFrom, boolean z10) {
                super(null);
                Intrinsics.j(coupon, "coupon");
                Intrinsics.j(navigatedFrom, "navigatedFrom");
                this.coupon = coupon;
                this.navigatedFrom = navigatedFrom;
                this.isShoppableReward = z10;
            }

            /* renamed from: a, reason: from getter */
            public final RewardDetail getCoupon() {
                return this.coupon;
            }

            /* renamed from: b, reason: from getter */
            public final String getNavigatedFrom() {
                return this.navigatedFrom;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getIsShoppableReward() {
                return this.isShoppableReward;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$b$g;", "Lcom/meijer/mobile/mperks/ux/V$b;", "", "Lco/e;", "coupons", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.V$b$g, reason: from toString */
        public static final /* data */ class NavigateToViewAllRewards extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<ClippedReward> coupons;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateToViewAllRewards) && Intrinsics.e(this.coupons, ((NavigateToViewAllRewards) other).coupons);
            }

            public int hashCode() {
                return this.coupons.hashCode();
            }

            public String toString() {
                return "NavigateToViewAllRewards(coupons=" + this.coupons + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToViewAllRewards(List<ClippedReward> coupons) {
                super(null);
                Intrinsics.j(coupons, "coupons");
                this.coupons = coupons;
            }

            public final List<ClippedReward> a() {
                return this.coupons;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$b$h;", "Lcom/meijer/mobile/mperks/ux/V$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final h f114789a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return -1347383060;
            }

            public String toString() {
                return "SubmitReceipt";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$b$i;", "Lcom/meijer/mobile/mperks/ux/V$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final i f114790a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return 1303005155;
            }

            public String toString() {
                return "ViewMPerksHistory";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJL\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\b\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/mperks/ux/V$c;", "", "", "isLoading", "shouldShowWalkThru", "isPointsBalanceUpdated", "", "pointsBalance", "isAvailableRewardsListUpdated", "availableRewardsList", "<init>", "(ZZZLjava/lang/String;ZLjava/lang/String;)V", "a", "(ZZZLjava/lang/String;ZLjava/lang/String;)Lcom/meijer/mobile/mperks/ux/V$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "b", "d", "c", "e", "Ljava/lang/String;", "f", "getAvailableRewardsList", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.mperks.ux.V$c, reason: from toString */
    public static final /* data */ class PointsBalanceViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldShowWalkThru;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPointsBalanceUpdated;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pointsBalance;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAvailableRewardsListUpdated;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String availableRewardsList;

        public PointsBalanceViewState() {
            this(false, false, false, null, false, null, 63, null);
        }

        public static /* synthetic */ PointsBalanceViewState b(PointsBalanceViewState pointsBalanceViewState, boolean z10, boolean z11, boolean z12, String str, boolean z13, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = pointsBalanceViewState.isLoading;
            }
            if ((i10 & 2) != 0) {
                z11 = pointsBalanceViewState.shouldShowWalkThru;
            }
            if ((i10 & 4) != 0) {
                z12 = pointsBalanceViewState.isPointsBalanceUpdated;
            }
            if ((i10 & 8) != 0) {
                str = pointsBalanceViewState.pointsBalance;
            }
            if ((i10 & 16) != 0) {
                z13 = pointsBalanceViewState.isAvailableRewardsListUpdated;
            }
            if ((i10 & 32) != 0) {
                str2 = pointsBalanceViewState.availableRewardsList;
            }
            boolean z14 = z13;
            String str3 = str2;
            return pointsBalanceViewState.a(z10, z11, z12, str, z14, str3);
        }

        public final PointsBalanceViewState a(boolean isLoading, boolean shouldShowWalkThru, boolean isPointsBalanceUpdated, String pointsBalance, boolean isAvailableRewardsListUpdated, String availableRewardsList) {
            Intrinsics.j(pointsBalance, "pointsBalance");
            Intrinsics.j(availableRewardsList, "availableRewardsList");
            return new PointsBalanceViewState(isLoading, shouldShowWalkThru, isPointsBalanceUpdated, pointsBalance, isAvailableRewardsListUpdated, availableRewardsList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointsBalanceViewState)) {
                return false;
            }
            PointsBalanceViewState pointsBalanceViewState = (PointsBalanceViewState) other;
            return this.isLoading == pointsBalanceViewState.isLoading && this.shouldShowWalkThru == pointsBalanceViewState.shouldShowWalkThru && this.isPointsBalanceUpdated == pointsBalanceViewState.isPointsBalanceUpdated && Intrinsics.e(this.pointsBalance, pointsBalanceViewState.pointsBalance) && this.isAvailableRewardsListUpdated == pointsBalanceViewState.isAvailableRewardsListUpdated && Intrinsics.e(this.availableRewardsList, pointsBalanceViewState.availableRewardsList);
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.shouldShowWalkThru)) * 31) + Boolean.hashCode(this.isPointsBalanceUpdated)) * 31) + this.pointsBalance.hashCode()) * 31) + Boolean.hashCode(this.isAvailableRewardsListUpdated)) * 31) + this.availableRewardsList.hashCode();
        }

        public String toString() {
            return "PointsBalanceViewState(isLoading=" + this.isLoading + ", shouldShowWalkThru=" + this.shouldShowWalkThru + ", isPointsBalanceUpdated=" + this.isPointsBalanceUpdated + ", pointsBalance=" + this.pointsBalance + ", isAvailableRewardsListUpdated=" + this.isAvailableRewardsListUpdated + ", availableRewardsList=" + this.availableRewardsList + ')';
        }

        public PointsBalanceViewState(boolean z10, boolean z11, boolean z12, String pointsBalance, boolean z13, String availableRewardsList) {
            Intrinsics.j(pointsBalance, "pointsBalance");
            Intrinsics.j(availableRewardsList, "availableRewardsList");
            this.isLoading = z10;
            this.shouldShowWalkThru = z11;
            this.isPointsBalanceUpdated = z12;
            this.pointsBalance = pointsBalance;
            this.isAvailableRewardsListUpdated = z13;
            this.availableRewardsList = availableRewardsList;
        }

        /* renamed from: c, reason: from getter */
        public final String getPointsBalance() {
            return this.pointsBalance;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getShouldShowWalkThru() {
            return this.shouldShowWalkThru;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getIsPointsBalanceUpdated() {
            return this.isPointsBalanceUpdated;
        }

        public /* synthetic */ PointsBalanceViewState(boolean z10, boolean z11, boolean z12, String str, boolean z13, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? "0" : str, (i10 & 16) != 0 ? false : z13, (i10 & 32) != 0 ? "" : str2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardViewModel$fetchExpiringPoints$1", f = "MperksDashBoardViewModel.kt", l = {124}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f114797a;

        /* renamed from: b, reason: collision with root package name */
        int f114798b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return V.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            V v10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114798b;
            if (i10 != 0) {
                if (i10 == 1) {
                    v10 = (V) this.f114797a;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                V v11 = V.this;
                fo.e eVar = v11.rewardsRepository;
                this.f114797a = v11;
                this.f114798b = 1;
                Object objP = fo.e.p(eVar, 0, this, 1, null);
                if (objP == objF) {
                    return objF;
                }
                v10 = v11;
                obj = objP;
            }
            v10.F((List) obj);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardViewModel$fetchMeijerCreditCardInfo$1", f = "MperksDashBoardViewModel.kt", l = {81}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f114800a;

        /* renamed from: b, reason: collision with root package name */
        int f114801b;

        /* renamed from: c, reason: collision with root package name */
        int f114802c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f114803d;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = V.this.new e(continuation);
            eVar.f114803d = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f114802c
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r8.f114800a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r8.f114803d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L18
                goto L42
            L18:
                r9 = move-exception
                goto L4d
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.f114803d
                mv.O r9 = (mv.InterfaceC15783O) r9
                com.meijer.mobile.mperks.ux.V r1 = com.meijer.mobile.mperks.ux.V.this
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L49
                fo.e r1 = com.meijer.mobile.mperks.ux.V.o(r1)     // Catch: java.lang.Throwable -> L49
                r8.f114803d = r9     // Catch: java.lang.Throwable -> L49
                r8.f114800a = r9     // Catch: java.lang.Throwable -> L49
                r8.f114801b = r3     // Catch: java.lang.Throwable -> L49
                r8.f114802c = r2     // Catch: java.lang.Throwable -> L49
                java.lang.Object r1 = r1.j(r8)     // Catch: java.lang.Throwable -> L49
                if (r1 != r0) goto L40
                return r0
            L40:
                r0 = r9
                r9 = r1
            L42:
                com.meijer.mobile.mperks.networking.domain.models.MperksCreditCardInfo r9 = (com.meijer.mobile.mperks.networking.domain.models.MperksCreditCardInfo) r9     // Catch: java.lang.Throwable -> L18
                java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L18
                goto L57
            L49:
                r0 = move-exception
                r7 = r0
                r0 = r9
                r9 = r7
            L4d:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r9 = kotlin.ResultKt.a(r9)
                java.lang.Object r9 = kotlin.Result.b(r9)
            L57:
                com.meijer.mobile.mperks.ux.V r1 = com.meijer.mobile.mperks.ux.V.this
                boolean r2 = kotlin.Result.h(r9)
                if (r2 == 0) goto L8b
                r2 = r9
                com.meijer.mobile.mperks.networking.domain.models.MperksCreditCardInfo r2 = (com.meijer.mobile.mperks.networking.domain.models.MperksCreditCardInfo) r2
                qw.a$a r4 = qw.a.INSTANCE
                java.lang.String r5 = "mPerks_credit_card_info"
                qw.a$b r4 = r4.z(r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Meijer Credit Card Response: "
                r5.append(r6)
                r5.append(r2)
                java.lang.String r5 = r5.toString()
                java.lang.Object[] r6 = new java.lang.Object[r3]
                r4.q(r5, r6)
                ok.b$c r4 = r2.getEnrollmentStatus()
                double r5 = r2.getDollarProgress()
                com.meijer.mobile.mperks.ux.V.r(r1, r4, r5)
            L8b:
                java.lang.Throwable r9 = kotlin.Result.e(r9)
                if (r9 == 0) goto La7
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r9 instanceof java.lang.Error
                if (r0 != 0) goto La6
                qw.a$a r0 = qw.a.INSTANCE
                java.lang.String r1 = "Failed to load MCard info."
                java.lang.Object[] r2 = new java.lang.Object[r3]
                r0.f(r9, r1, r2)
                goto La7
            La6:
                throw r9
            La7:
                kotlin.Unit r9 = kotlin.Unit.f143329a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.mperks.ux.V.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardViewModel$fetchPointsBalance$1", f = "MperksDashBoardViewModel.kt", l = {102}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f114805a;

        /* renamed from: b, reason: collision with root package name */
        int f114806b;

        /* renamed from: c, reason: collision with root package name */
        int f114807c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f114808d;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = V.this.new f(continuation);
            fVar.f114808d = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            Object value;
            Object value2;
            Object value3;
            Object objL;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114807c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC15783O) this.f114808d;
                    V v10 = V.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC16549B interfaceC16549B = v10._pointsBalanceStateFlow;
                    do {
                        value3 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value3, PointsBalanceViewState.b((PointsBalanceViewState) value3, true, false, false, null, false, null, 62, null)));
                    fo.e eVar = v10.rewardsRepository;
                    this.f114808d = r23;
                    this.f114805a = r23;
                    this.f114806b = 0;
                    this.f114807c = 1;
                    objL = eVar.l(this);
                    i10 = r23;
                    if (objL == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC15783O) this.f114808d;
                    ResultKt.b(obj);
                    objL = obj;
                    i10 = r24;
                }
                objB = Result.b(Boxing.d(((Number) objL).intValue()));
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            V v11 = V.this;
            if (Result.h(objB)) {
                int iIntValue = ((Number) objB).intValue();
                InterfaceC16549B interfaceC16549B2 = v11._pointsBalanceStateFlow;
                do {
                    value2 = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value2, PointsBalanceViewState.b((PointsBalanceViewState) value2, false, false, true, String.valueOf(iIntValue), false, null, 51, null)));
                qw.a.INSTANCE.z("mperks_get_balance").q("Point balance: " + iIntValue, new Object[0]);
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                qw.a.INSTANCE.f(thE, "Failed to load Mperks Points balance.", new Object[0]);
            }
            InterfaceC16549B interfaceC16549B3 = V.this._pointsBalanceStateFlow;
            do {
                value = interfaceC16549B3.getValue();
            } while (!interfaceC16549B3.e(value, PointsBalanceViewState.b((PointsBalanceViewState) value, false, false, false, null, false, null, 62, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardViewModel$onAction$1", f = "MperksDashBoardViewModel.kt", l = {183}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114810a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return V.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114810a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = V.this._event;
                b.h hVar = b.h.f114789a;
                this.f114810a = 1;
                if (interfaceC16548A.emit(hVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardViewModel$onAction$2", f = "MperksDashBoardViewModel.kt", l = {192}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114812a;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return V.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114812a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                V v10 = V.this;
                v10.G(((PointsBalanceViewState) v10._pointsBalanceStateFlow.getValue()).getPointsBalance());
                InterfaceC16548A interfaceC16548A = V.this._event;
                b.c cVar = b.c.f114783a;
                this.f114812a = 1;
                if (interfaceC16548A.emit(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardViewModel$onAction$3", f = "MperksDashBoardViewModel.kt", l = {196}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114814a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f114816c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(a aVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f114816c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return V.this.new i(this.f114816c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114814a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = V.this._event;
                b.NavigateToAutoEnrollInfoPage navigateToAutoEnrollInfoPage = new b.NavigateToAutoEnrollInfoPage(((a.AutoEnrollDescriptionClicked) this.f114816c).getAutoClaimReward());
                this.f114814a = 1;
                if (interfaceC16548A.emit(navigateToAutoEnrollInfoPage, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardViewModel$onAction$4", f = "MperksDashBoardViewModel.kt", l = {HttpResponseStatus.SUCCESS_NO_CONTENT}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114817a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return V.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114817a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = V.this._event;
                b.i iVar = b.i.f114790a;
                this.f114817a = 1;
                if (interfaceC16548A.emit(iVar, this) == objF) {
                    return objF;
                }
            }
            V.this.I();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardViewModel$onAction$5", f = "MperksDashBoardViewModel.kt", l = {209}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114819a;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return V.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114819a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = V.this._event;
                b.a aVar = b.a.f114781a;
                this.f114819a = 1;
                if (interfaceC16548A.emit(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardViewModel$onAction$6", f = "MperksDashBoardViewModel.kt", l = {213}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114821a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f114823c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(a aVar, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f114823c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return V.this.new l(this.f114823c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114821a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = V.this._event;
                b.CreditCardViewInProgress creditCardViewInProgress = new b.CreditCardViewInProgress(((a.CreditCardViewClickedOnInProgressPill) this.f114823c).getMccProgram());
                this.f114821a = 1;
                if (interfaceC16548A.emit(creditCardViewInProgress, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardViewModel$onAction$7", f = "MperksDashBoardViewModel.kt", l = {217}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114824a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f114826c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(a aVar, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f114826c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return V.this.new m(this.f114826c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114824a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = V.this._event;
                b.NavigateToDescriptionPage navigateToDescriptionPage = new b.NavigateToDescriptionPage(((a.ViewRewardDescriptionClicked) this.f114826c).getCoupon(), ((a.ViewRewardDescriptionClicked) this.f114826c).getNavigatedFrom(), ((a.ViewRewardDescriptionClicked) this.f114826c).getIsShoppableReward());
                this.f114824a = 1;
                if (interfaceC16548A.emit(navigateToDescriptionPage, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.ux.MperksDashBoardViewModel$onAction$8", f = "MperksDashBoardViewModel.kt", l = {227}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114827a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f114829c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(a aVar, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f114829c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return V.this.new n(this.f114829c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114827a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = V.this._event;
                b.NavigateToViewAllRewards navigateToViewAllRewards = new b.NavigateToViewAllRewards(((a.ViewAllRewardsClicked) this.f114829c).a());
                this.f114827a = 1;
                if (interfaceC16548A.emit(navigateToViewAllRewards, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(List<ExpiringPoints> expiringPoints) {
        PointsExpState value;
        PointsExpState pointsExpState;
        boolean z10;
        int points;
        if (expiringPoints.isEmpty()) {
            return;
        }
        InterfaceC16549B<PointsExpState> interfaceC16549B = this._pointsExpiryStateFlow;
        do {
            value = interfaceC16549B.getValue();
            pointsExpState = value;
            List<ExpiringPoints> list = expiringPoints;
            Iterator<T> it = list.iterator();
            int points2 = 0;
            while (it.hasNext()) {
                points2 += ((ExpiringPoints) it.next()).getPoints();
            }
            z10 = points2 != 0;
            Iterator<T> it2 = list.iterator();
            points = 0;
            while (it2.hasNext()) {
                points += ((ExpiringPoints) it2.next()).getPoints();
            }
        } while (!interfaceC16549B.e(value, pointsExpState.a(z10, points, expiringPoints.get(0).getExpiresOn())));
    }

    public V(fo.e rewardsRepository, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.rewardsRepository = rewardsRepository;
        this.analyticsEngine = analyticsEngine;
        InterfaceC16549B<PointsBalanceViewState> interfaceC16549BA = pv.S.a(new PointsBalanceViewState(false, false, false, null, false, null, 63, null));
        this._pointsBalanceStateFlow = interfaceC16549BA;
        this.pointsBalanceStateFlow = C16563h.c(interfaceC16549BA);
        InterfaceC16549B<MccEnrollmentState> interfaceC16549BA2 = pv.S.a(new MccEnrollmentState(null, 0.0d, 3, null));
        this._enrollmentStateFlow = interfaceC16549BA2;
        this.enrollmentStateFlow = C16563h.c(interfaceC16549BA2);
        InterfaceC16549B<PointsExpState> interfaceC16549BA3 = pv.S.a(new PointsExpState(false, 0, null, 7, null));
        this._pointsExpiryStateFlow = interfaceC16549BA3;
        this.pointsExpiryStateFlow = C16563h.c(interfaceC16549BA3);
        this._event = C16555H.b(0, 0, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(final String mperksPoints) {
        this.analyticsEngine.b(C14756c.h("mPerks:Learn More"), new Function1() { // from class: com.meijer.mobile.mperks.ux.T
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return V.H(mperksPoints, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: Learn More");
        track.h("mperksPoints", str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        this.analyticsEngine.b(C14756c.h("mPerks:view mPerks History"), new Function1() { // from class: com.meijer.mobile.mperks.ux.U
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return V.J(this.f114755a, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(V v10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mPerks 4.0");
        track.o("mPerks: History");
        track.h("mperksPoints", v10._pointsBalanceStateFlow.getValue().getPointsBalance());
        track.h("previousTrackAction", "mPerks: view mPerks History");
        return Unit.f143329a;
    }

    private final void K(boolean shouldShow) {
        InterfaceC16549B<PointsBalanceViewState> interfaceC16549B = this._pointsBalanceStateFlow;
        while (true) {
            PointsBalanceViewState value = interfaceC16549B.getValue();
            boolean z10 = shouldShow;
            if (interfaceC16549B.e(value, PointsBalanceViewState.b(value, false, z10, false, null, false, null, 61, null))) {
                return;
            } else {
                shouldShow = z10;
            }
        }
    }

    public final pv.P<MccEnrollmentState> A() {
        return this.enrollmentStateFlow;
    }

    public final pv.P<PointsBalanceViewState> B() {
        return this.pointsBalanceStateFlow;
    }

    public final pv.P<PointsExpState> C() {
        return this.pointsExpiryStateFlow;
    }

    public final void D(a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.g) {
            x();
            Unit unit = Unit.f143329a;
            return;
        }
        if (action instanceof a.h) {
            v();
            Unit unit2 = Unit.f143329a;
            return;
        }
        if (action instanceof a.j) {
            C15809k.d(androidx.view.d0.a(this), null, null, new g(null), 3, null);
            return;
        }
        if (action instanceof a.f) {
            w();
            Unit unit3 = Unit.f143329a;
            return;
        }
        if (action instanceof a.e) {
            C15809k.d(androidx.view.d0.a(this), null, null, new h(null), 3, null);
            return;
        }
        if (action instanceof a.AutoEnrollDescriptionClicked) {
            C15809k.d(androidx.view.d0.a(this), null, null, new i(action, null), 3, null);
            return;
        }
        if (action instanceof a.l) {
            C15809k.d(androidx.view.d0.a(this), null, null, new j(null), 3, null);
            return;
        }
        if (action instanceof a.b) {
            C15809k.d(androidx.view.d0.a(this), null, null, new k(null), 3, null);
            return;
        }
        if (action instanceof a.CreditCardViewClickedOnInProgressPill) {
            C15809k.d(androidx.view.d0.a(this), null, null, new l(action, null), 3, null);
            return;
        }
        if (action instanceof a.ViewRewardDescriptionClicked) {
            C15809k.d(androidx.view.d0.a(this), null, null, new m(action, null), 3, null);
            return;
        }
        if (action instanceof a.ViewAllRewardsClicked) {
            C15809k.d(androidx.view.d0.a(this), null, null, new n(action, null), 3, null);
            return;
        }
        if (action instanceof a.SeeWhatsNewAction) {
            K(((a.SeeWhatsNewAction) action).getShouldShow());
            Unit unit4 = Unit.f143329a;
        } else {
            if (!(action instanceof a.GoogleAdClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            this.analyticsEngine.k(C14375c.b(((a.GoogleAdClicked) action).getAnalytics(), "mPerks Claim page"));
            Unit unit5 = Unit.f143329a;
        }
    }

    public final InterfaceC16553F<b> getEvents() {
        return C16563h.b(this._event);
    }

    @Override // androidx.view.InterfaceC6157f
    public void onCreate(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onCreate(owner);
        K(!y().q());
    }

    public final C18335a y() {
        C18335a c18335a = this.appPrefManager;
        if (c18335a != null) {
            return c18335a;
        }
        Intrinsics.x("appPrefManager");
        return null;
    }

    private final void v() {
        C15809k.d(androidx.view.d0.a(this), null, null, new d(null), 3, null);
    }

    private final void w() {
        C15809k.d(androidx.view.d0.a(this), null, null, new e(null), 3, null);
    }

    private final void x() {
        C15809k.d(androidx.view.d0.a(this), null, null, new f(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(MccProgram.c status, double dollarProgress) {
        MccEnrollmentState value;
        MccEnrollmentState value2;
        if (dollarProgress > 750.0d) {
            InterfaceC16549B<MccEnrollmentState> interfaceC16549B = this._enrollmentStateFlow;
            do {
                value2 = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value2, value2.a(status, dollarProgress % 750.0d)));
        } else {
            InterfaceC16549B<MccEnrollmentState> interfaceC16549B2 = this._enrollmentStateFlow;
            do {
                value = interfaceC16549B2.getValue();
            } while (!interfaceC16549B2.e(value, value.a(status, dollarProgress)));
        }
    }
}
