package com.meijer.mobile.meijer.activity.enrollment;

import androidx.view.c0;
import androidx.view.d0;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0003\u0017\u0011\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020!0+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/G;", "Landroidx/lifecycle/c0;", "Lcom/meijer/mobile/meijer/activity/enrollment/a;", "createAccountRepository", "Lhi/a;", "analyticsEngine", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/a;Lhi/a;)V", "", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "()V", "Lcom/meijer/mobile/meijer/activity/enrollment/G$a;", "action", "p", "(Lcom/meijer/mobile/meijer/activity/enrollment/G$a;)V", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/a;", "b", "Lhi/a;", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$c;", "c", "Lpv/B;", "_viewState", "Lpv/P;", "d", "Lpv/P;", "getViewState", "()Lpv/P;", "viewState", "Lpv/A;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$b;", "e", "Lpv/A;", "_event", "", "f", "I", "willSendWeeklyAd", "g", "willSendTextAds", "Lpv/F;", "getEvents", "()Lpv/F;", "events", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class G extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C12188a createAccountRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> viewState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<b> _event;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int willSendWeeklyAd;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int willSendTextAds;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/G$a;", "", "<init>", "()V", "c", "a", "b", "d", "Lcom/meijer/mobile/meijer/activity/enrollment/G$a$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$a$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$a$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$a$d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/G$a$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.G$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1584a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1584a f106733a = new C1584a();

            private C1584a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1584a);
            }

            public int hashCode() {
                return -1852957596;
            }

            public String toString() {
                return "SearchStoreLink";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/G$a$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f106734a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1404187540;
            }

            public String toString() {
                return "SetupProgressIndicator";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/G$a$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f106735a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -430809370;
            }

            public String toString() {
                return "ShowShareLocationDialogAction";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/G$a$d;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f106736a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1598959947;
            }

            public String toString() {
                return "TrackState";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/G$b;", "", "<init>", "()V", "c", "a", "b", "Lcom/meijer/mobile/meijer/activity/enrollment/G$b$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$b$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$b$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/G$b$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f106737a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1019618380;
            }

            public String toString() {
                return "ProceedToSearchStoresEvent";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/G$b$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$c;", "storeState", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/G$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/G$c;", "getStoreState", "()Lcom/meijer/mobile/meijer/activity/enrollment/G$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.G$b$b, reason: collision with other inner class name and from toString */
        public static final /* data */ class SetupProgressIndicatorEvent extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ViewState storeState;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetupProgressIndicatorEvent) && Intrinsics.e(this.storeState, ((SetupProgressIndicatorEvent) other).storeState);
            }

            public int hashCode() {
                return this.storeState.hashCode();
            }

            public String toString() {
                return "SetupProgressIndicatorEvent(storeState=" + this.storeState + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupProgressIndicatorEvent(ViewState storeState) {
                super(null);
                Intrinsics.j(storeState, "storeState");
                this.storeState = storeState;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/G$b$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/G$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f106739a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 222271224;
            }

            public String toString() {
                return "ShowShareLocationDialogEvent";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/G$c;", "", "", "isLoading", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.enrollment.G$c, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        public ViewState() {
            this(false, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewState) && this.isLoading == ((ViewState) other).isLoading;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "ViewState(isLoading=" + this.isLoading + ')';
        }

        public ViewState(boolean z10) {
            this.isLoading = z10;
        }

        public /* synthetic */ ViewState(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.StoreViewModel$onAction$1", f = "StoreViewModel.kt", l = {73}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106741a;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106741a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = G.this._event;
                b.c cVar = b.c.f106739a;
                this.f106741a = 1;
                if (interfaceC16548A.emit(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.StoreViewModel$onAction$2", f = "StoreViewModel.kt", l = {77}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106743a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106743a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = G.this._event;
                b.a aVar = b.a.f106737a;
                this.f106743a = 1;
                if (interfaceC16548A.emit(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.StoreViewModel$onAction$3", f = "StoreViewModel.kt", l = {81}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106745a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106745a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                G g10 = G.this;
                this.f106745a = 1;
                if (g10.q(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.StoreViewModel", f = "StoreViewModel.kt", l = {46}, m = "setupProgressIndicators")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f106747a;

        /* renamed from: b, reason: collision with root package name */
        Object f106748b;

        /* renamed from: c, reason: collision with root package name */
        int f106749c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f106750d;

        /* renamed from: f, reason: collision with root package name */
        int f106752f;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106750d = obj;
            this.f106752f |= Integer.MIN_VALUE;
            return G.this.q(this);
        }
    }

    public G(C12188a createAccountRepository, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(createAccountRepository, "createAccountRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.createAccountRepository = createAccountRepository;
        this.analyticsEngine = analyticsEngine;
        InterfaceC16549B<ViewState> interfaceC16549BA = S.a(new ViewState(true));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        this._event = C16555H.b(0, 0, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.meijer.activity.enrollment.G.g
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.meijer.activity.enrollment.G$g r0 = (com.meijer.mobile.meijer.activity.enrollment.G.g) r0
            int r1 = r0.f106752f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106752f = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.enrollment.G$g r0 = new com.meijer.mobile.meijer.activity.enrollment.G$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f106750d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f106752f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f106748b
            com.meijer.mobile.meijer.activity.enrollment.G$c r1 = (com.meijer.mobile.meijer.activity.enrollment.G.ViewState) r1
            java.lang.Object r0 = r0.f106747a
            com.meijer.mobile.meijer.activity.enrollment.G$c r0 = (com.meijer.mobile.meijer.activity.enrollment.G.ViewState) r0
            kotlin.ResultKt.b(r6)
            goto L62
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            kotlin.ResultKt.b(r6)
            pv.B<com.meijer.mobile.meijer.activity.enrollment.G$c> r6 = r5._viewState
        L3e:
            java.lang.Object r2 = r6.getValue()
            r4 = r2
            com.meijer.mobile.meijer.activity.enrollment.G$c r4 = (com.meijer.mobile.meijer.activity.enrollment.G.ViewState) r4
            boolean r2 = r6.e(r2, r4)
            if (r2 == 0) goto L3e
            pv.A<com.meijer.mobile.meijer.activity.enrollment.G$b> r6 = r5._event
            com.meijer.mobile.meijer.activity.enrollment.G$b$b r2 = new com.meijer.mobile.meijer.activity.enrollment.G$b$b
            r2.<init>(r4)
            r0.f106747a = r4
            r0.f106748b = r4
            r4 = 0
            r0.f106749c = r4
            r0.f106752f = r3
            java.lang.Object r6 = r6.emit(r2, r0)
            if (r6 != r1) goto L62
            return r1
        L62:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.enrollment.G.q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void r() {
        this.willSendWeeklyAd = this.createAccountRepository.getWeeklyAdCheckbox() ? 1 : 0;
        this.willSendTextAds = this.createAccountRepository.getTextAdsCheckbox() ? 1 : 0;
        this.analyticsEngine.b(C14756c.h("meijer: create account: primary store selection"), new Function1() { // from class: com.meijer.mobile.meijer.activity.enrollment.F
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.s(this.f106725a, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(G g10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("create account: new experience");
        track.h("homeStoreId", "158");
        track.h("currentStoreId", "158");
        track.h("emailWeeklyAd", String.valueOf(g10.willSendWeeklyAd));
        track.h("textMarketing", String.valueOf(g10.willSendTextAds));
        return Unit.f143329a;
    }

    public final InterfaceC16553F<b> getEvents() {
        return C16563h.b(this._event);
    }

    public final void p(a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.c) {
            C15809k.d(d0.a(this), null, null, new d(null), 3, null);
            return;
        }
        if (action instanceof a.C1584a) {
            C15809k.d(d0.a(this), null, null, new e(null), 3, null);
            return;
        }
        if (action instanceof a.b) {
            C15809k.d(d0.a(this), null, null, new f(null), 3, null);
        } else {
            if (!(action instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            r();
            Unit unit = Unit.f143329a;
        }
    }
}
