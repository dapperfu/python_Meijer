package com.meijer.mobile.meijer.activity.enrollment;

import Ik.Validation;
import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ^2\u00020\u0001:\u00041/36B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0019\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\"\u0010\u001c\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010\fJ\u000f\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010\fJ\u0010\u0010(\u001a\u00020\nH\u0082@¢\u0006\u0004\b(\u0010\u0012J\u0018\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\nH\u0082@¢\u0006\u0004\b-\u0010\u0012J\u0010\u0010.\u001a\u00020\nH\u0082@¢\u0006\u0004\b.\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010C\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010>R\u0016\u0010E\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010>R\u0016\u0010G\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010>R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020)0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020I0Z8F¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n;", "Landroidx/lifecycle/c0;", "Lcom/meijer/mobile/meijer/activity/enrollment/a;", "createAccountRepository", "Lyo/k;", "userManager", "Lhi/a;", "analyticsEngine", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/a;Lyo/k;Lhi/a;)V", "", "onCleared", "()V", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "action", "x", "(Lcom/meijer/mobile/meijer/activity/enrollment/n$a;)V", "F", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "phoneNumber", "pinNumber", "", "weeklyAdCheckbox", "textAdCheckbox", "C", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "y", "L", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/serverapi/rxjava/observables/accounts/ValidatePhoneNumberCallChain$ValidatePhoneResponse;", "response", "B", "(Lcom/meijer/mobile/serverapi/rxjava/observables/accounts/ValidatePhoneNumberCallChain$ValidatePhoneResponse;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "exception", "A", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "G", "K", "Lcom/meijer/mobile/meijer/activity/enrollment/v;", "viewState", "u", "(Lcom/meijer/mobile/meijer/activity/enrollment/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "D", "E", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/a;", "b", "Lyo/k;", "c", "Lhi/a;", "Lcom/meijer/mobile/serverapi/rxjava/observables/accounts/ValidatePhoneNumberCallChain;", "d", "Lcom/meijer/mobile/serverapi/rxjava/observables/accounts/ValidatePhoneNumberCallChain;", "v", "()Lcom/meijer/mobile/serverapi/rxjava/observables/accounts/ValidatePhoneNumberCallChain;", "setValidatePhoneNumberCallChain", "(Lcom/meijer/mobile/serverapi/rxjava/observables/accounts/ValidatePhoneNumberCallChain;)V", "validatePhoneNumberCallChain", "e", "Z", "isMperksDetailsSet", "f", "isValidPhoneNumber", "g", "isTextablePhoneNumber", "h", "isPhoneAvailable", "i", "isCheckingNumberAvailability", "Lpv/A;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c;", "j", "Lpv/A;", "_viewEvent", "Lpv/B;", "k", "Lpv/B;", "_viewState", "Lpv/P;", "l", "Lpv/P;", "getViewState", "()Lpv/P;", "LJu/a;", "m", "LJu/a;", "disposables", "Lpv/F;", "w", "()Lpv/F;", "viewEvent", "n", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class n extends c0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int f106804o = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C12188a createAccountRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ValidatePhoneNumberCallChain validatePhoneNumberCallChain;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isMperksDetailsSet;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isValidPhoneNumber;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isTextablePhoneNumber;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isPhoneAvailable;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isCheckingNumberAvailability;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<c> _viewEvent;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<PhoneEnrollmentViewState> _viewState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final P<PhoneEnrollmentViewState> viewState;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "", "<init>", "()V", "i", "h", "a", "l", "m", "b", "j", "c", "k", "d", "e", "f", "g", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a$d;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a$e;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a$f;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a$g;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a$h;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a$i;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a$j;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a$k;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a$l;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a$m;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$a$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1586a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1586a f106818a = new C1586a();

            private C1586a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1586a);
            }

            public int hashCode() {
                return 252959450;
            }

            public String toString() {
                return "SendTrackStateAnalytics";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$a$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "", "phoneNumber", "pinNumber", "", "textAdCheckbox", "weeklyAdCheckbox", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$a$b, reason: from toString */
        public static final /* data */ class SetMperksAccountDetails extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String phoneNumber;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String pinNumber;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean textAdCheckbox;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean weeklyAdCheckbox;

            public SetMperksAccountDetails(String str, String str2, boolean z10, boolean z11) {
                super(null);
                this.phoneNumber = str;
                this.pinNumber = str2;
                this.textAdCheckbox = z10;
                this.weeklyAdCheckbox = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetMperksAccountDetails)) {
                    return false;
                }
                SetMperksAccountDetails setMperksAccountDetails = (SetMperksAccountDetails) other;
                return Intrinsics.e(this.phoneNumber, setMperksAccountDetails.phoneNumber) && Intrinsics.e(this.pinNumber, setMperksAccountDetails.pinNumber) && this.textAdCheckbox == setMperksAccountDetails.textAdCheckbox && this.weeklyAdCheckbox == setMperksAccountDetails.weeklyAdCheckbox;
            }

            public int hashCode() {
                String str = this.phoneNumber;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.pinNumber;
                return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.textAdCheckbox)) * 31) + Boolean.hashCode(this.weeklyAdCheckbox);
            }

            public String toString() {
                return "SetMperksAccountDetails(phoneNumber=" + this.phoneNumber + ", pinNumber=" + this.pinNumber + ", textAdCheckbox=" + this.textAdCheckbox + ", weeklyAdCheckbox=" + this.weeklyAdCheckbox + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getPhoneNumber() {
                return this.phoneNumber;
            }

            /* renamed from: b, reason: from getter */
            public final String getPinNumber() {
                return this.pinNumber;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getTextAdCheckbox() {
                return this.textAdCheckbox;
            }

            /* renamed from: d, reason: from getter */
            public final boolean getWeeklyAdCheckbox() {
                return this.weeklyAdCheckbox;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0004R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u0004R\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$a$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "phoneNumber", "b", "pinNumber", "c", "Z", "()Z", "textAdCheckbox", "d", "weeklyAdCheckbox", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$a$c, reason: from toString */
        public static final /* data */ class SetMperksDetails extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String phoneNumber;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String pinNumber;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean textAdCheckbox;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean weeklyAdCheckbox;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetMperksDetails)) {
                    return false;
                }
                SetMperksDetails setMperksDetails = (SetMperksDetails) other;
                return Intrinsics.e(this.phoneNumber, setMperksDetails.phoneNumber) && Intrinsics.e(this.pinNumber, setMperksDetails.pinNumber) && this.textAdCheckbox == setMperksDetails.textAdCheckbox && this.weeklyAdCheckbox == setMperksDetails.weeklyAdCheckbox;
            }

            public int hashCode() {
                String str = this.phoneNumber;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.pinNumber;
                return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.textAdCheckbox)) * 31) + Boolean.hashCode(this.weeklyAdCheckbox);
            }

            public String toString() {
                return "SetMperksDetails(phoneNumber=" + this.phoneNumber + ", pinNumber=" + this.pinNumber + ", textAdCheckbox=" + this.textAdCheckbox + ", weeklyAdCheckbox=" + this.weeklyAdCheckbox + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getPhoneNumber() {
                return this.phoneNumber;
            }

            /* renamed from: b, reason: from getter */
            public final String getPinNumber() {
                return this.pinNumber;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getTextAdCheckbox() {
                return this.textAdCheckbox;
            }

            /* renamed from: d, reason: from getter */
            public final boolean getWeeklyAdCheckbox() {
                return this.weeklyAdCheckbox;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$a$d;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$a$d, reason: from toString */
        public static final /* data */ class SetPhoneNumber extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String phoneNumber;

            public SetPhoneNumber(String str) {
                super(null);
                this.phoneNumber = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetPhoneNumber) && Intrinsics.e(this.phoneNumber, ((SetPhoneNumber) other).phoneNumber);
            }

            public int hashCode() {
                String str = this.phoneNumber;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SetPhoneNumber(phoneNumber=" + this.phoneNumber + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getPhoneNumber() {
                return this.phoneNumber;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$a$e;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "", "pinNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$a$e, reason: from toString */
        public static final /* data */ class SetPinNumber extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String pinNumber;

            public SetPinNumber(String str) {
                super(null);
                this.pinNumber = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetPinNumber) && Intrinsics.e(this.pinNumber, ((SetPinNumber) other).pinNumber);
            }

            public int hashCode() {
                String str = this.pinNumber;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SetPinNumber(pinNumber=" + this.pinNumber + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getPinNumber() {
                return this.pinNumber;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$a$f;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "", "textAdCheckbox", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$a$f, reason: from toString */
        public static final /* data */ class SetTextAdStatus extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean textAdCheckbox;

            public SetTextAdStatus(boolean z10) {
                super(null);
                this.textAdCheckbox = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetTextAdStatus) && this.textAdCheckbox == ((SetTextAdStatus) other).textAdCheckbox;
            }

            public int hashCode() {
                return Boolean.hashCode(this.textAdCheckbox);
            }

            public String toString() {
                return "SetTextAdStatus(textAdCheckbox=" + this.textAdCheckbox + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getTextAdCheckbox() {
                return this.textAdCheckbox;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$a$g;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "", "weeklyAdCheckbox", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$a$g, reason: from toString */
        public static final /* data */ class SetWeeklyAdStatus extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean weeklyAdCheckbox;

            public SetWeeklyAdStatus(boolean z10) {
                super(null);
                this.weeklyAdCheckbox = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetWeeklyAdStatus) && this.weeklyAdCheckbox == ((SetWeeklyAdStatus) other).weeklyAdCheckbox;
            }

            public int hashCode() {
                return Boolean.hashCode(this.weeklyAdCheckbox);
            }

            public String toString() {
                return "SetWeeklyAdStatus(weeklyAdCheckbox=" + this.weeklyAdCheckbox + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getWeeklyAdCheckbox() {
                return this.weeklyAdCheckbox;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$a$h;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final h f106831a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return 534626755;
            }

            public String toString() {
                return "SetupProgressIndicator";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$a$i;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final i f106832a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return 1774555101;
            }

            public String toString() {
                return "StartValidation";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$a$j;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "", "phoneNumber", "pinNumber", "", "textAdCheckbox", "weeklyAdCheckbox", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getPinNumber", "c", "Z", "getTextAdCheckbox", "()Z", "d", "getWeeklyAdCheckbox", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$a$j, reason: from toString */
        public static final /* data */ class StoreExistingMperksDetails extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String phoneNumber;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String pinNumber;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean textAdCheckbox;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean weeklyAdCheckbox;

            public StoreExistingMperksDetails(String str, String str2, boolean z10, boolean z11) {
                super(null);
                this.phoneNumber = str;
                this.pinNumber = str2;
                this.textAdCheckbox = z10;
                this.weeklyAdCheckbox = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StoreExistingMperksDetails)) {
                    return false;
                }
                StoreExistingMperksDetails storeExistingMperksDetails = (StoreExistingMperksDetails) other;
                return Intrinsics.e(this.phoneNumber, storeExistingMperksDetails.phoneNumber) && Intrinsics.e(this.pinNumber, storeExistingMperksDetails.pinNumber) && this.textAdCheckbox == storeExistingMperksDetails.textAdCheckbox && this.weeklyAdCheckbox == storeExistingMperksDetails.weeklyAdCheckbox;
            }

            public int hashCode() {
                String str = this.phoneNumber;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.pinNumber;
                return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.textAdCheckbox)) * 31) + Boolean.hashCode(this.weeklyAdCheckbox);
            }

            public String toString() {
                return "StoreExistingMperksDetails(phoneNumber=" + this.phoneNumber + ", pinNumber=" + this.pinNumber + ", textAdCheckbox=" + this.textAdCheckbox + ", weeklyAdCheckbox=" + this.weeklyAdCheckbox + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getPhoneNumber() {
                return this.phoneNumber;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$a$k;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "", "phoneNumber", "", "textAdCheckbox", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$a$k, reason: from toString */
        public static final /* data */ class ValidatePhoneNumber extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String phoneNumber;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean textAdCheckbox;

            public ValidatePhoneNumber(String str, boolean z10) {
                super(null);
                this.phoneNumber = str;
                this.textAdCheckbox = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValidatePhoneNumber)) {
                    return false;
                }
                ValidatePhoneNumber validatePhoneNumber = (ValidatePhoneNumber) other;
                return Intrinsics.e(this.phoneNumber, validatePhoneNumber.phoneNumber) && this.textAdCheckbox == validatePhoneNumber.textAdCheckbox;
            }

            public int hashCode() {
                String str = this.phoneNumber;
                return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.textAdCheckbox);
            }

            public String toString() {
                return "ValidatePhoneNumber(phoneNumber=" + this.phoneNumber + ", textAdCheckbox=" + this.textAdCheckbox + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getPhoneNumber() {
                return this.phoneNumber;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getTextAdCheckbox() {
                return this.textAdCheckbox;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$a$l;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class l extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final l f106839a = new l();

            private l() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            public int hashCode() {
                return 1078491895;
            }

            public String toString() {
                return "ValidatePhoneNumberField";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$a$m;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class m extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final m f106840a = new m();

            private m() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof m);
            }

            public int hashCode() {
                return 1039936880;
            }

            public String toString() {
                return "ValidatePinNumberField";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$c;", "", "<init>", "()V", "c", "e", "d", "a", "f", "j", "h", "i", "g", "b", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c$d;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c$e;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c$f;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c$g;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c$h;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c$i;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c$j;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$c$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f106841a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -577042280;
            }

            public String toString() {
                return "AllValidFieldsEvent";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$c$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$d;", "mperksPhoneField", "Lcom/meijer/mobile/meijer/activity/enrollment/v;", "phoneEnrollmentViewState", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/n$d;Lcom/meijer/mobile/meijer/activity/enrollment/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/n$d;", "()Lcom/meijer/mobile/meijer/activity/enrollment/n$d;", "b", "Lcom/meijer/mobile/meijer/activity/enrollment/v;", "()Lcom/meijer/mobile/meijer/activity/enrollment/v;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$c$b, reason: from toString */
        public static final /* data */ class ErrorFocusEvent extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final d mperksPhoneField;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final PhoneEnrollmentViewState phoneEnrollmentViewState;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ErrorFocusEvent)) {
                    return false;
                }
                ErrorFocusEvent errorFocusEvent = (ErrorFocusEvent) other;
                return this.mperksPhoneField == errorFocusEvent.mperksPhoneField && Intrinsics.e(this.phoneEnrollmentViewState, errorFocusEvent.phoneEnrollmentViewState);
            }

            public int hashCode() {
                d dVar = this.mperksPhoneField;
                return ((dVar == null ? 0 : dVar.hashCode()) * 31) + this.phoneEnrollmentViewState.hashCode();
            }

            public String toString() {
                return "ErrorFocusEvent(mperksPhoneField=" + this.mperksPhoneField + ", phoneEnrollmentViewState=" + this.phoneEnrollmentViewState + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorFocusEvent(d dVar, PhoneEnrollmentViewState phoneEnrollmentViewState) {
                super(null);
                Intrinsics.j(phoneEnrollmentViewState, "phoneEnrollmentViewState");
                this.mperksPhoneField = dVar;
                this.phoneEnrollmentViewState = phoneEnrollmentViewState;
            }

            /* renamed from: a, reason: from getter */
            public final d getMperksPhoneField() {
                return this.mperksPhoneField;
            }

            /* renamed from: b, reason: from getter */
            public final PhoneEnrollmentViewState getPhoneEnrollmentViewState() {
                return this.phoneEnrollmentViewState;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$c$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$c$c, reason: collision with other inner class name */
        public static final /* data */ class C1587c extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final C1587c f106844a = new C1587c();

            private C1587c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1587c);
            }

            public int hashCode() {
                return -958056453;
            }

            public String toString() {
                return "GoToEnrollmentStorePage";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$c$d;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f106845a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -583884576;
            }

            public String toString() {
                return "NonTextablePhoneError";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$c$e;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final e f106846a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return 1380045094;
            }

            public String toString() {
                return "PhoneInUseError";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$c$f;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c;", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "errorMessage", "<init>", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "()Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$c$f, reason: from toString */
        public static final /* data */ class PhoneRetrofitError extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final RetrofitException errorMessage;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PhoneRetrofitError) && Intrinsics.e(this.errorMessage, ((PhoneRetrofitError) other).errorMessage);
            }

            public int hashCode() {
                return this.errorMessage.hashCode();
            }

            public String toString() {
                return "PhoneRetrofitError(errorMessage=" + this.errorMessage + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PhoneRetrofitError(RetrofitException errorMessage) {
                super(null);
                Intrinsics.j(errorMessage, "errorMessage");
                this.errorMessage = errorMessage;
            }

            /* renamed from: a, reason: from getter */
            public final RetrofitException getErrorMessage() {
                return this.errorMessage;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$c$g;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/meijer/mobile/meijer/activity/enrollment/v;", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/v;", "()Lcom/meijer/mobile/meijer/activity/enrollment/v;", "phoneEnrollmentViewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$c$g, reason: from toString */
        public static final /* data */ class SetFieldErrors extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PhoneEnrollmentViewState phoneEnrollmentViewState;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetFieldErrors) && Intrinsics.e(this.phoneEnrollmentViewState, ((SetFieldErrors) other).phoneEnrollmentViewState);
            }

            public int hashCode() {
                return this.phoneEnrollmentViewState.hashCode();
            }

            public String toString() {
                return "SetFieldErrors(phoneEnrollmentViewState=" + this.phoneEnrollmentViewState + ')';
            }

            /* renamed from: a, reason: from getter */
            public final PhoneEnrollmentViewState getPhoneEnrollmentViewState() {
                return this.phoneEnrollmentViewState;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$c$h;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/v;", "phoneEnrollmentViewState", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/v;", "()Lcom/meijer/mobile/meijer/activity/enrollment/v;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$c$h, reason: from toString */
        public static final /* data */ class SetPhoneNumberFieldErrors extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PhoneEnrollmentViewState phoneEnrollmentViewState;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetPhoneNumberFieldErrors) && Intrinsics.e(this.phoneEnrollmentViewState, ((SetPhoneNumberFieldErrors) other).phoneEnrollmentViewState);
            }

            public int hashCode() {
                return this.phoneEnrollmentViewState.hashCode();
            }

            public String toString() {
                return "SetPhoneNumberFieldErrors(phoneEnrollmentViewState=" + this.phoneEnrollmentViewState + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetPhoneNumberFieldErrors(PhoneEnrollmentViewState phoneEnrollmentViewState) {
                super(null);
                Intrinsics.j(phoneEnrollmentViewState, "phoneEnrollmentViewState");
                this.phoneEnrollmentViewState = phoneEnrollmentViewState;
            }

            /* renamed from: a, reason: from getter */
            public final PhoneEnrollmentViewState getPhoneEnrollmentViewState() {
                return this.phoneEnrollmentViewState;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$c$i;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/v;", "phoneEnrollmentViewState", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/v;", "()Lcom/meijer/mobile/meijer/activity/enrollment/v;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$c$i, reason: from toString */
        public static final /* data */ class SetPinFieldErrors extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PhoneEnrollmentViewState phoneEnrollmentViewState;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetPinFieldErrors) && Intrinsics.e(this.phoneEnrollmentViewState, ((SetPinFieldErrors) other).phoneEnrollmentViewState);
            }

            public int hashCode() {
                return this.phoneEnrollmentViewState.hashCode();
            }

            public String toString() {
                return "SetPinFieldErrors(phoneEnrollmentViewState=" + this.phoneEnrollmentViewState + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetPinFieldErrors(PhoneEnrollmentViewState phoneEnrollmentViewState) {
                super(null);
                Intrinsics.j(phoneEnrollmentViewState, "phoneEnrollmentViewState");
                this.phoneEnrollmentViewState = phoneEnrollmentViewState;
            }

            /* renamed from: a, reason: from getter */
            public final PhoneEnrollmentViewState getPhoneEnrollmentViewState() {
                return this.phoneEnrollmentViewState;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$c$j;", "Lcom/meijer/mobile/meijer/activity/enrollment/n$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/v;", "phoneEnrollmentViewState", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/v;", "()Lcom/meijer/mobile/meijer/activity/enrollment/v;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$c$j, reason: from toString */
        public static final /* data */ class SetupProgressIndicatorEvent extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final PhoneEnrollmentViewState phoneEnrollmentViewState;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetupProgressIndicatorEvent) && Intrinsics.e(this.phoneEnrollmentViewState, ((SetupProgressIndicatorEvent) other).phoneEnrollmentViewState);
            }

            public int hashCode() {
                return this.phoneEnrollmentViewState.hashCode();
            }

            public String toString() {
                return "SetupProgressIndicatorEvent(phoneEnrollmentViewState=" + this.phoneEnrollmentViewState + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupProgressIndicatorEvent(PhoneEnrollmentViewState phoneEnrollmentViewState) {
                super(null);
                Intrinsics.j(phoneEnrollmentViewState, "phoneEnrollmentViewState");
                this.phoneEnrollmentViewState = phoneEnrollmentViewState;
            }

            /* renamed from: a, reason: from getter */
            public final PhoneEnrollmentViewState getPhoneEnrollmentViewState() {
                return this.phoneEnrollmentViewState;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/n$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f106852a = new d("PHONE_NUMBER", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f106853b = new d("PIN_NUMBER", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ d[] f106854c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f106855d;

        private static final /* synthetic */ d[] a() {
            return new d[]{f106852a, f106853b};
        }

        static {
            d[] dVarArrA = a();
            f106854c = dVarArrA;
            f106855d = EnumEntriesKt.a(dVarArrA);
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f106854c.clone();
        }

        private d(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewModel$onAction$3", f = "PhoneEnrollmentViewModel.kt", l = {258}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106856a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return n.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106856a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                n nVar = n.this;
                this.f106856a = 1;
                if (nVar.K(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewModel$onAction$4", f = "PhoneEnrollmentViewModel.kt", l = {262}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106858a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return n.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106858a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                n nVar = n.this;
                this.f106858a = 1;
                if (nVar.D(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewModel$onAction$5", f = "PhoneEnrollmentViewModel.kt", l = {266}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106860a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return n.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106860a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                n nVar = n.this;
                this.f106860a = 1;
                if (nVar.E(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewModel$onAction$7", f = "PhoneEnrollmentViewModel.kt", l = {274}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106862a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f106864c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(a aVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f106864c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return n.this.new h(this.f106864c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106862a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                n nVar = n.this;
                String strC = Ds.g.c(((a.ValidatePhoneNumber) this.f106864c).getPhoneNumber());
                boolean textAdCheckbox = ((a.ValidatePhoneNumber) this.f106864c).getTextAdCheckbox();
                this.f106862a = 1;
                if (nVar.L(strC, textAdCheckbox, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewModel$onAction$8", f = "PhoneEnrollmentViewModel.kt", l = {285}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106865a;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return n.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106865a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                n nVar = n.this;
                this.f106865a = 1;
                if (nVar.F(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewModel", f = "PhoneEnrollmentViewModel.kt", l = {143}, m = "onPhoneNumberAvailabilityFailure")
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f106867a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f106868b;

        /* renamed from: d, reason: collision with root package name */
        int f106870d;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106868b = obj;
            this.f106870d |= Integer.MIN_VALUE;
            return n.this.A(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewModel", f = "PhoneEnrollmentViewModel.kt", l = {181}, m = "setPhoneNumberFieldErrors")
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f106871a;

        /* renamed from: b, reason: collision with root package name */
        Object f106872b;

        /* renamed from: c, reason: collision with root package name */
        int f106873c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f106874d;

        /* renamed from: f, reason: collision with root package name */
        int f106876f;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106874d = obj;
            this.f106876f |= Integer.MIN_VALUE;
            return n.this.D(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewModel", f = "PhoneEnrollmentViewModel.kt", l = {185}, m = "setPinFieldErrors")
    static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f106877a;

        /* renamed from: b, reason: collision with root package name */
        Object f106878b;

        /* renamed from: c, reason: collision with root package name */
        int f106879c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f106880d;

        /* renamed from: f, reason: collision with root package name */
        int f106882f;

        l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106880d = obj;
            this.f106882f |= Integer.MIN_VALUE;
            return n.this.E(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewModel", f = "PhoneEnrollmentViewModel.kt", l = {68}, m = "setupProgressIndicators")
    static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f106883a;

        /* renamed from: b, reason: collision with root package name */
        Object f106884b;

        /* renamed from: c, reason: collision with root package name */
        int f106885c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f106886d;

        /* renamed from: f, reason: collision with root package name */
        int f106888f;

        m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106886d = obj;
            this.f106888f |= Integer.MIN_VALUE;
            return n.this.F(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewModel", f = "PhoneEnrollmentViewModel.kt", l = {162, 164}, m = "validateFields")
    /* renamed from: com.meijer.mobile.meijer.activity.enrollment.n$n, reason: collision with other inner class name */
    static final class C1588n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f106889a;

        /* renamed from: b, reason: collision with root package name */
        Object f106890b;

        /* renamed from: c, reason: collision with root package name */
        int f106891c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f106892d;

        /* renamed from: f, reason: collision with root package name */
        int f106894f;

        C1588n(Continuation<? super C1588n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106892d = obj;
            this.f106894f |= Integer.MIN_VALUE;
            return n.this.K(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewModel", f = "PhoneEnrollmentViewModel.kt", l = {107, 109, 111}, m = "validatePhoneNumberAvailability")
    static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f106895a;

        /* renamed from: b, reason: collision with root package name */
        Object f106896b;

        /* renamed from: c, reason: collision with root package name */
        Object f106897c;

        /* renamed from: d, reason: collision with root package name */
        Object f106898d;

        /* renamed from: e, reason: collision with root package name */
        Object f106899e;

        /* renamed from: f, reason: collision with root package name */
        boolean f106900f;

        /* renamed from: g, reason: collision with root package name */
        int f106901g;

        /* renamed from: h, reason: collision with root package name */
        int f106902h;

        /* renamed from: i, reason: collision with root package name */
        int f106903i;

        /* renamed from: j, reason: collision with root package name */
        int f106904j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f106905k;

        /* renamed from: m, reason: collision with root package name */
        int f106907m;

        o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106905k = obj;
            this.f106907m |= Integer.MIN_VALUE;
            return n.this.L(null, false, this);
        }
    }

    private final Object B(ValidatePhoneNumberCallChain.ValidatePhoneResponse validatePhoneResponse, boolean z10, Continuation<? super Unit> continuation) {
        boolean z11 = false;
        this.isCheckingNumberAvailability = false;
        boolean zIsPhoneTextable = validatePhoneResponse.isPhoneTextable();
        this.isTextablePhoneNumber = zIsPhoneTextable;
        if (zIsPhoneTextable && validatePhoneResponse.getPhoneConflictType().getValue() == 1) {
            z11 = true;
        }
        this.isPhoneAvailable = z11;
        int value = validatePhoneResponse.getPhoneConflictType().getValue();
        if (value != 1) {
            if (value != 2) {
                return Unit.f143329a;
            }
            G();
            Object objEmit = this._viewEvent.emit(c.e.f106846a, continuation);
            return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f143329a;
        }
        if (this.isTextablePhoneNumber || !z10) {
            Object objEmit2 = this._viewEvent.emit(c.C1587c.f106844a, continuation);
            return objEmit2 == IntrinsicsKt.f() ? objEmit2 : Unit.f143329a;
        }
        Object objEmit3 = this._viewEvent.emit(c.d.f106845a, continuation);
        return objEmit3 == IntrinsicsKt.f() ? objEmit3 : Unit.f143329a;
    }

    private final void C(String phoneNumber, String pinNumber, boolean weeklyAdCheckbox, boolean textAdCheckbox) {
        PhoneEnrollmentViewState value;
        this.isMperksDetailsSet = true;
        InterfaceC16549B<PhoneEnrollmentViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, PhoneEnrollmentViewState.h(value, null, null, false, false, true, 15, null)));
        y(phoneNumber, pinNumber, weeklyAdCheckbox, textAdCheckbox);
    }

    public n(C12188a createAccountRepository, yo.k userManager, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(createAccountRepository, "createAccountRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.createAccountRepository = createAccountRepository;
        this.userManager = userManager;
        this.analyticsEngine = analyticsEngine;
        this._viewEvent = C16555H.b(0, 0, null, 7, null);
        InterfaceC16549B<PhoneEnrollmentViewState> interfaceC16549BA = S.a(new PhoneEnrollmentViewState(null, null, false, false, true, 15, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        this.disposables = new Ju.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(java.lang.Throwable r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.meijer.mobile.meijer.activity.enrollment.n.j
            if (r0 == 0) goto L13
            r0 = r7
            com.meijer.mobile.meijer.activity.enrollment.n$j r0 = (com.meijer.mobile.meijer.activity.enrollment.n.j) r0
            int r1 = r0.f106870d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106870d = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.enrollment.n$j r0 = new com.meijer.mobile.meijer.activity.enrollment.n$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f106868b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f106870d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f106867a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.ResultKt.b(r7)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            r7 = 0
            r5.isCheckingNumberAvailability = r7
            pv.A<com.meijer.mobile.meijer.activity.enrollment.n$c> r7 = r5._viewEvent
            com.meijer.mobile.meijer.activity.enrollment.n$c$f r2 = new com.meijer.mobile.meijer.activity.enrollment.n$c$f
            com.meijer.mobile.core.networking.exceptions.RetrofitException r4 = com.meijer.mobile.core.networking.exceptions.a.a(r6)
            r2.<init>(r4)
            r0.f106867a = r6
            r0.f106870d = r3
            java.lang.Object r7 = r7.emit(r2, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            qw.a$a r7 = qw.a.INSTANCE
            r7.e(r6)
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.enrollment.n.A(java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.meijer.activity.enrollment.n.k
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.meijer.activity.enrollment.n$k r0 = (com.meijer.mobile.meijer.activity.enrollment.n.k) r0
            int r1 = r0.f106876f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106876f = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.enrollment.n$k r0 = new com.meijer.mobile.meijer.activity.enrollment.n$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f106874d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f106876f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f106872b
            com.meijer.mobile.meijer.activity.enrollment.v r1 = (com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewState) r1
            java.lang.Object r0 = r0.f106871a
            com.meijer.mobile.meijer.activity.enrollment.v r0 = (com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewState) r0
            kotlin.ResultKt.b(r6)
            goto L62
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            kotlin.ResultKt.b(r6)
            pv.B<com.meijer.mobile.meijer.activity.enrollment.v> r6 = r5._viewState
        L3e:
            java.lang.Object r2 = r6.getValue()
            r4 = r2
            com.meijer.mobile.meijer.activity.enrollment.v r4 = (com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewState) r4
            boolean r2 = r6.e(r2, r4)
            if (r2 == 0) goto L3e
            pv.A<com.meijer.mobile.meijer.activity.enrollment.n$c> r6 = r5._viewEvent
            com.meijer.mobile.meijer.activity.enrollment.n$c$h r2 = new com.meijer.mobile.meijer.activity.enrollment.n$c$h
            r2.<init>(r4)
            r0.f106871a = r4
            r0.f106872b = r4
            r4 = 0
            r0.f106873c = r4
            r0.f106876f = r3
            java.lang.Object r6 = r6.emit(r2, r0)
            if (r6 != r1) goto L62
            return r1
        L62:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.enrollment.n.D(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.meijer.activity.enrollment.n.l
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.meijer.activity.enrollment.n$l r0 = (com.meijer.mobile.meijer.activity.enrollment.n.l) r0
            int r1 = r0.f106882f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106882f = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.enrollment.n$l r0 = new com.meijer.mobile.meijer.activity.enrollment.n$l
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f106880d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f106882f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f106878b
            com.meijer.mobile.meijer.activity.enrollment.v r1 = (com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewState) r1
            java.lang.Object r0 = r0.f106877a
            com.meijer.mobile.meijer.activity.enrollment.v r0 = (com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewState) r0
            kotlin.ResultKt.b(r6)
            goto L62
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            kotlin.ResultKt.b(r6)
            pv.B<com.meijer.mobile.meijer.activity.enrollment.v> r6 = r5._viewState
        L3e:
            java.lang.Object r2 = r6.getValue()
            r4 = r2
            com.meijer.mobile.meijer.activity.enrollment.v r4 = (com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewState) r4
            boolean r2 = r6.e(r2, r4)
            if (r2 == 0) goto L3e
            pv.A<com.meijer.mobile.meijer.activity.enrollment.n$c> r6 = r5._viewEvent
            com.meijer.mobile.meijer.activity.enrollment.n$c$i r2 = new com.meijer.mobile.meijer.activity.enrollment.n$c$i
            r2.<init>(r4)
            r0.f106877a = r4
            r0.f106878b = r4
            r4 = 0
            r0.f106879c = r4
            r0.f106882f = r3
            java.lang.Object r6 = r6.emit(r2, r0)
            if (r6 != r1) goto L62
            return r1
        L62:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.enrollment.n.E(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.meijer.activity.enrollment.n.m
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.meijer.activity.enrollment.n$m r0 = (com.meijer.mobile.meijer.activity.enrollment.n.m) r0
            int r1 = r0.f106888f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106888f = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.enrollment.n$m r0 = new com.meijer.mobile.meijer.activity.enrollment.n$m
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f106886d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f106888f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f106884b
            com.meijer.mobile.meijer.activity.enrollment.v r1 = (com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewState) r1
            java.lang.Object r0 = r0.f106883a
            com.meijer.mobile.meijer.activity.enrollment.v r0 = (com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewState) r0
            kotlin.ResultKt.b(r6)
            goto L62
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            kotlin.ResultKt.b(r6)
            pv.B<com.meijer.mobile.meijer.activity.enrollment.v> r6 = r5._viewState
        L3e:
            java.lang.Object r2 = r6.getValue()
            r4 = r2
            com.meijer.mobile.meijer.activity.enrollment.v r4 = (com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewState) r4
            boolean r2 = r6.e(r2, r4)
            if (r2 == 0) goto L3e
            pv.A<com.meijer.mobile.meijer.activity.enrollment.n$c> r6 = r5._viewEvent
            com.meijer.mobile.meijer.activity.enrollment.n$c$j r2 = new com.meijer.mobile.meijer.activity.enrollment.n$c$j
            r2.<init>(r4)
            r0.f106883a = r4
            r0.f106884b = r4
            r4 = 0
            r0.f106885c = r4
            r0.f106888f = r3
            java.lang.Object r6 = r6.emit(r2, r0)
            if (r6 != r1) goto L62
            return r1
        L62:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.enrollment.n.F(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void G() {
        this.analyticsEngine.b(C14756c.a("event: create account: phonenumber already exists"), new Function1() { // from class: com.meijer.mobile.meijer.activity.enrollment.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.H((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("create account: new experience");
        track.n("meijer: create account: new mperks account");
        return Unit.f143329a;
    }

    private final void I() {
        this.analyticsEngine.b(C14756c.h("meijer: create account: new mperks account"), new Function1() { // from class: com.meijer.mobile.meijer.activity.enrollment.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.J((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("create account: new experience");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r6.emit(r2, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (u(r4, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.meijer.activity.enrollment.n.C1588n
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.meijer.activity.enrollment.n$n r0 = (com.meijer.mobile.meijer.activity.enrollment.n.C1588n) r0
            int r1 = r0.f106894f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106894f = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.enrollment.n$n r0 = new com.meijer.mobile.meijer.activity.enrollment.n$n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f106892d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f106894f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.f106890b
            com.meijer.mobile.meijer.activity.enrollment.v r1 = (com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewState) r1
            java.lang.Object r0 = r0.f106889a
            com.meijer.mobile.meijer.activity.enrollment.v r0 = (com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewState) r0
            kotlin.ResultKt.b(r6)
            goto L80
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            kotlin.ResultKt.b(r6)
            goto L5e
        L40:
            kotlin.ResultKt.b(r6)
            pv.B<com.meijer.mobile.meijer.activity.enrollment.v> r6 = r5._viewState
            java.lang.Object r6 = r6.getValue()
            com.meijer.mobile.meijer.activity.enrollment.v r6 = (com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewState) r6
            boolean r6 = r6.isValid()
            if (r6 == 0) goto L61
            pv.A<com.meijer.mobile.meijer.activity.enrollment.n$c> r6 = r5._viewEvent
            com.meijer.mobile.meijer.activity.enrollment.n$c$a r2 = com.meijer.mobile.meijer.activity.enrollment.n.c.a.f106841a
            r0.f106894f = r4
            java.lang.Object r6 = r6.emit(r2, r0)
            if (r6 != r1) goto L5e
            goto L7f
        L5e:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        L61:
            pv.B<com.meijer.mobile.meijer.activity.enrollment.v> r6 = r5._viewState
        L63:
            java.lang.Object r2 = r6.getValue()
            r4 = r2
            com.meijer.mobile.meijer.activity.enrollment.v r4 = (com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewState) r4
            boolean r2 = r6.e(r2, r4)
            if (r2 == 0) goto L63
            r0.f106889a = r4
            r0.f106890b = r4
            r6 = 0
            r0.f106891c = r6
            r0.f106894f = r3
            java.lang.Object r6 = r5.u(r4, r0)
            if (r6 != r1) goto L80
        L7f:
            return r1
        L80:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.enrollment.n.K(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0100, code lost:
    
        if (A(r12, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3 A[PHI: r2 r10 r11
      0x00e3: PHI (r2v4 java.lang.String) = (r2v3 java.lang.String), (r2v3 java.lang.String), (r2v7 java.lang.String) binds: [B:35:0x00c7, B:37:0x00e0, B:16:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r10v4 boolean) = (r10v3 boolean), (r10v3 boolean), (r10v19 boolean) binds: [B:35:0x00c7, B:37:0x00e0, B:16:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r11v4 java.lang.Object) = (r11v3 java.lang.Object), (r11v3 java.lang.Object), (r11v11 java.lang.Object) binds: [B:35:0x00c7, B:37:0x00e0, B:16:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(java.lang.String r10, boolean r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.enrollment.n.L(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void y(String phoneNumber, String pinNumber, boolean weeklyAdCheckbox, boolean textAdCheckbox) {
        PhoneEnrollmentViewState value;
        InterfaceC16549B<PhoneEnrollmentViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, new w(phoneNumber, pinNumber, weeklyAdCheckbox, textAdCheckbox).b(value)));
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    public final ValidatePhoneNumberCallChain v() {
        ValidatePhoneNumberCallChain validatePhoneNumberCallChain = this.validatePhoneNumberCallChain;
        if (validatePhoneNumberCallChain != null) {
            return validatePhoneNumberCallChain;
        }
        Intrinsics.x("validatePhoneNumberCallChain");
        return null;
    }

    public final InterfaceC16553F<c> w() {
        return C16563h.b(this._viewEvent);
    }

    public final void x(a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.SetMperksAccountDetails) {
            a.SetMperksAccountDetails setMperksAccountDetails = (a.SetMperksAccountDetails) action;
            String strC = Ds.g.c(setMperksAccountDetails.getPhoneNumber());
            if (strC != null) {
                C12188a c12188a = this.createAccountRepository;
                String pinNumber = setMperksAccountDetails.getPinNumber();
                Intrinsics.g(pinNumber);
                c12188a.d(strC, pinNumber, setMperksAccountDetails.getWeeklyAdCheckbox(), setMperksAccountDetails.getTextAdCheckbox());
                return;
            }
            return;
        }
        if (action instanceof a.SetMperksDetails) {
            a.SetMperksDetails setMperksDetails = (a.SetMperksDetails) action;
            C(setMperksDetails.getPhoneNumber(), setMperksDetails.getPinNumber(), setMperksDetails.getWeeklyAdCheckbox(), setMperksDetails.getTextAdCheckbox());
            return;
        }
        if (action instanceof a.SetPhoneNumber) {
            String phoneNumber = ((a.SetPhoneNumber) action).getPhoneNumber();
            if (phoneNumber == null) {
                phoneNumber = "";
            }
            String strC2 = Ds.g.c(phoneNumber);
            String strE = this._viewState.getValue().l().e();
            y(strC2, strE != null ? strE : "", this._viewState.getValue().getWeeklyAdCheckbox(), this._viewState.getValue().getTextAdCheckbox());
            return;
        }
        if (action instanceof a.SetPinNumber) {
            String strE2 = this._viewState.getValue().k().e();
            if (strE2 == null) {
                strE2 = "";
            }
            String strC3 = Ds.g.c(strE2);
            String pinNumber2 = ((a.SetPinNumber) action).getPinNumber();
            y(strC3, pinNumber2 != null ? pinNumber2 : "", this._viewState.getValue().getWeeklyAdCheckbox(), this._viewState.getValue().getTextAdCheckbox());
            return;
        }
        if (action instanceof a.SetWeeklyAdStatus) {
            String strE3 = this._viewState.getValue().k().e();
            if (strE3 == null) {
                strE3 = "";
            }
            String strC4 = Ds.g.c(strE3);
            String strE4 = this._viewState.getValue().l().e();
            y(strC4, strE4 != null ? strE4 : "", ((a.SetWeeklyAdStatus) action).getWeeklyAdCheckbox(), this._viewState.getValue().getTextAdCheckbox());
            return;
        }
        if (action instanceof a.SetTextAdStatus) {
            String strE5 = this._viewState.getValue().k().e();
            if (strE5 == null) {
                strE5 = "";
            }
            String strC5 = Ds.g.c(strE5);
            String strE6 = this._viewState.getValue().l().e();
            y(strC5, strE6 != null ? strE6 : "", this._viewState.getValue().getWeeklyAdCheckbox(), ((a.SetTextAdStatus) action).getTextAdCheckbox());
            return;
        }
        if (action instanceof a.StoreExistingMperksDetails) {
            yo.k kVar = this.userManager;
            String phoneNumber2 = ((a.StoreExistingMperksDetails) action).getPhoneNumber();
            kVar.Z(phoneNumber2 != null ? phoneNumber2 : "");
            return;
        }
        if (action instanceof a.i) {
            C15809k.d(d0.a(this), null, null, new e(null), 3, null);
            return;
        }
        if (action instanceof a.l) {
            C15809k.d(d0.a(this), null, null, new f(null), 3, null);
            return;
        }
        if (action instanceof a.m) {
            C15809k.d(d0.a(this), null, null, new g(null), 3, null);
            return;
        }
        if (action instanceof a.ValidatePhoneNumber) {
            C15809k.d(d0.a(this), null, null, new h(action, null), 3, null);
        } else if (action instanceof a.C1586a) {
            I();
        } else {
            if (!(action instanceof a.h)) {
                throw new NoWhenBranchMatchedException();
            }
            C15809k.d(d0.a(this), null, null, new i(null), 3, null);
        }
    }

    private final Object u(PhoneEnrollmentViewState phoneEnrollmentViewState, Continuation<? super Unit> continuation) {
        d dVar;
        Iterator<T> it = phoneEnrollmentViewState.a().iterator();
        while (it.hasNext()) {
            Validation validation = (Validation) it.next();
            if (!validation.getIsValid()) {
                if (Intrinsics.e(validation, phoneEnrollmentViewState.k())) {
                    dVar = d.f106852a;
                } else if (Intrinsics.e(validation, phoneEnrollmentViewState.l())) {
                    dVar = d.f106853b;
                } else {
                    dVar = null;
                }
                Object objEmit = this._viewEvent.emit(new c.ErrorFocusEvent(dVar, phoneEnrollmentViewState), continuation);
                if (objEmit == IntrinsicsKt.f()) {
                    return objEmit;
                }
                return Unit.f143329a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
