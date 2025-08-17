package com.meijer.mobile.meijer.activity.enrollment.profile;

import Dh.EnumC3374g;
import Dh.ValidateEmailAvailability;
import Hk.Validation;
import ak.AbstractC5607a;
import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.meijer.activity.enrollment.C12063a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0003579B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000eH\u0082@¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b#\u0010\u001aJ7\u0010'\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u00152\b\u0010%\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010&\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b'\u0010(J/\u0010)\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0015H\u0002¢\u0006\u0004\b)\u0010(J7\u0010*\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u00152\b\u0010%\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010&\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b*\u0010(J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u0015H\u0002¢\u0006\u0004\b,\u0010\u0018J \u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b1\u0010\u001aJ\u000f\u00102\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u0010\u0010J\u000f\u00103\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u0010\u0010J\u000f\u00104\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001c0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010DR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020>0R8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0V8F¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006Y"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q;", "Landroidx/lifecycle/c0;", "Lyl/k;", "featureManager", "Lyo/k;", "userManager", "LBh/e;", "profileRepository", "Lcom/meijer/mobile/meijer/activity/enrollment/a;", "createAccountRepository", "Lgi/a;", "analyticsEngine", "<init>", "(Lyl/k;Lyo/k;LBh/e;Lcom/meijer/mobile/meijer/activity/enrollment/a;Lgi/a;)V", "", "onCleared", "()V", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "action", "D", "(Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;)V", "", "emailAddress", "T", "(Ljava/lang/String;)V", "N", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "U", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "viewState", "A", "(Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "J", "K", "H", "firstName", "lastName", "password", "L", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "M", "E", "email", "y", "LDh/F;", "response", "G", "(LDh/F;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "F", "Q", "O", "S", "a", "Lyo/k;", "b", "LBh/e;", "c", "Lcom/meijer/mobile/meijer/activity/enrollment/a;", "d", "Lgi/a;", "Ltv/A;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "e", "Ltv/A;", "_viewEvent", "", "f", "Z", "isValidatingEmailAvailability", "g", "isEmailValidated", "Ltv/B;", "h", "Ltv/B;", "_viewState", "i", "isProfileInfoSet", "LNu/a;", "j", "LNu/a;", "disposables", "Ltv/F;", "B", "()Ltv/F;", "viewEvent", "Ltv/P;", "C", "()Ltv/P;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class q extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bh.e profileRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C12063a createAccountRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<b> _viewEvent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isValidatingEmailAvailability;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isEmailValidated;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ProfileEnrollmentViewState> _viewState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isProfileInfoSet;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0012\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0012\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "", "<init>", "()V", "k", "i", "p", "q", "r", "o", "b", "a", "l", "g", "h", "n", "d", "e", "c", "f", "m", "j", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$d;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$e;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$f;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$g;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$h;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$i;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$j;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$k;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$l;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$m;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$n;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$o;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$p;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$q;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$r;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1581a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1581a f106095a = new C1581a();

            private C1581a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1581a);
            }

            public int hashCode() {
                return 1191266032;
            }

            public String toString() {
                return "SendEmailInUseAnalytics";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f106096a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -494647088;
            }

            public String toString() {
                return "SendTrackStateAnalytics";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "", "emailAddress", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$a$c, reason: from toString */
        public static final /* data */ class SetEmailAddress extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String emailAddress;

            public SetEmailAddress(String str) {
                super(null);
                this.emailAddress = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetEmailAddress) && Intrinsics.e(this.emailAddress, ((SetEmailAddress) other).emailAddress);
            }

            public int hashCode() {
                String str = this.emailAddress;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SetEmailAddress(emailAddress=" + this.emailAddress + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getEmailAddress() {
                return this.emailAddress;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$d;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "", "firstName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$a$d, reason: from toString */
        public static final /* data */ class SetFirstName extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String firstName;

            public SetFirstName(String str) {
                super(null);
                this.firstName = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetFirstName) && Intrinsics.e(this.firstName, ((SetFirstName) other).firstName);
            }

            public int hashCode() {
                String str = this.firstName;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SetFirstName(firstName=" + this.firstName + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getFirstName() {
                return this.firstName;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$e;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "", "lastName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$a$e, reason: from toString */
        public static final /* data */ class SetLastName extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String lastName;

            public SetLastName(String str) {
                super(null);
                this.lastName = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetLastName) && Intrinsics.e(this.lastName, ((SetLastName) other).lastName);
            }

            public int hashCode() {
                String str = this.lastName;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SetLastName(lastName=" + this.lastName + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getLastName() {
                return this.lastName;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$f;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "", "password", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$a$f, reason: from toString */
        public static final /* data */ class SetPassword extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String password;

            public SetPassword(String str) {
                super(null);
                this.password = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetPassword) && Intrinsics.e(this.password, ((SetPassword) other).password);
            }

            public int hashCode() {
                String str = this.password;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SetPassword(password=" + this.password + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getPassword() {
                return this.password;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0004R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u0004R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$g;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "firstName", "c", "lastName", "emailAddress", "d", "password", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$a$g, reason: from toString */
        public static final /* data */ class SetProfileInformation extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String firstName;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String lastName;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String emailAddress;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String password;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetProfileInformation)) {
                    return false;
                }
                SetProfileInformation setProfileInformation = (SetProfileInformation) other;
                return Intrinsics.e(this.firstName, setProfileInformation.firstName) && Intrinsics.e(this.lastName, setProfileInformation.lastName) && Intrinsics.e(this.emailAddress, setProfileInformation.emailAddress) && Intrinsics.e(this.password, setProfileInformation.password);
            }

            public int hashCode() {
                String str = this.firstName;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.lastName;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.emailAddress;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.password;
                return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            public String toString() {
                return "SetProfileInformation(firstName=" + this.firstName + ", lastName=" + this.lastName + ", emailAddress=" + this.emailAddress + ", password=" + this.password + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getEmailAddress() {
                return this.emailAddress;
            }

            /* renamed from: b, reason: from getter */
            public final String getFirstName() {
                return this.firstName;
            }

            /* renamed from: c, reason: from getter */
            public final String getLastName() {
                return this.lastName;
            }

            /* renamed from: d, reason: from getter */
            public final String getPassword() {
                return this.password;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$h;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "", "firstName", "lastName", "emailAddress", "password", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$a$h, reason: from toString */
        public static final /* data */ class SetProfileInformationToAccount extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String firstName;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String lastName;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String emailAddress;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String password;

            public SetProfileInformationToAccount(String str, String str2, String str3, String str4) {
                super(null);
                this.firstName = str;
                this.lastName = str2;
                this.emailAddress = str3;
                this.password = str4;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetProfileInformationToAccount)) {
                    return false;
                }
                SetProfileInformationToAccount setProfileInformationToAccount = (SetProfileInformationToAccount) other;
                return Intrinsics.e(this.firstName, setProfileInformationToAccount.firstName) && Intrinsics.e(this.lastName, setProfileInformationToAccount.lastName) && Intrinsics.e(this.emailAddress, setProfileInformationToAccount.emailAddress) && Intrinsics.e(this.password, setProfileInformationToAccount.password);
            }

            public int hashCode() {
                String str = this.firstName;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.lastName;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.emailAddress;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.password;
                return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            public String toString() {
                return "SetProfileInformationToAccount(firstName=" + this.firstName + ", lastName=" + this.lastName + ", emailAddress=" + this.emailAddress + ", password=" + this.password + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getEmailAddress() {
                return this.emailAddress;
            }

            /* renamed from: b, reason: from getter */
            public final String getFirstName() {
                return this.firstName;
            }

            /* renamed from: c, reason: from getter */
            public final String getLastName() {
                return this.lastName;
            }

            /* renamed from: d, reason: from getter */
            public final String getPassword() {
                return this.password;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$i;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final i f106109a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return -1706246899;
            }

            public String toString() {
                return "SetupProgressIndicator";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$j;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class j extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final j f106110a = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public int hashCode() {
                return -1945456526;
            }

            public String toString() {
                return "ShowTermsOfServiceAction";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$k;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class k extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final k f106111a = new k();

            private k() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof k);
            }

            public int hashCode() {
                return -1025092653;
            }

            public String toString() {
                return "StartValidation";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0016\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$l;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "", "firstName", "lastName", "emailAddress", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFirstName", "b", "getLastName", "c", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$a$l, reason: from toString */
        public static final /* data */ class StoreExistingFieldValues extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String firstName;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String lastName;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String emailAddress;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String phoneNumber;

            public StoreExistingFieldValues(String str, String str2, String str3, String str4) {
                super(null);
                this.firstName = str;
                this.lastName = str2;
                this.emailAddress = str3;
                this.phoneNumber = str4;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StoreExistingFieldValues)) {
                    return false;
                }
                StoreExistingFieldValues storeExistingFieldValues = (StoreExistingFieldValues) other;
                return Intrinsics.e(this.firstName, storeExistingFieldValues.firstName) && Intrinsics.e(this.lastName, storeExistingFieldValues.lastName) && Intrinsics.e(this.emailAddress, storeExistingFieldValues.emailAddress) && Intrinsics.e(this.phoneNumber, storeExistingFieldValues.phoneNumber);
            }

            public int hashCode() {
                String str = this.firstName;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.lastName;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.emailAddress;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.phoneNumber;
                return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            public String toString() {
                return "StoreExistingFieldValues(firstName=" + this.firstName + ", lastName=" + this.lastName + ", emailAddress=" + this.emailAddress + ", phoneNumber=" + this.phoneNumber + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getEmailAddress() {
                return this.emailAddress;
            }

            /* renamed from: b, reason: from getter */
            public final String getPhoneNumber() {
                return this.phoneNumber;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$m;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class m extends a {
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$n;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "", "emailAddress", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$a$n, reason: from toString */
        public static final /* data */ class ValidateEmailAddress extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String emailAddress;

            public ValidateEmailAddress(String str) {
                super(null);
                this.emailAddress = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ValidateEmailAddress) && Intrinsics.e(this.emailAddress, ((ValidateEmailAddress) other).emailAddress);
            }

            public int hashCode() {
                String str = this.emailAddress;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "ValidateEmailAddress(emailAddress=" + this.emailAddress + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getEmailAddress() {
                return this.emailAddress;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$o;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class o extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final o f106117a = new o();

            private o() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof o);
            }

            public int hashCode() {
                return -975487972;
            }

            public String toString() {
                return "ValidateEmailField";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$p;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class p extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final p f106118a = new p();

            private p() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof p);
            }

            public int hashCode() {
                return -903577923;
            }

            public String toString() {
                return "ValidateFirstNameField";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$q;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$a$q, reason: collision with other inner class name */
        public static final /* data */ class C1582q extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1582q f106119a = new C1582q();

            private C1582q() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1582q);
            }

            public int hashCode() {
                return 1247138075;
            }

            public String toString() {
                return "ValidateLastNameField";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a$r;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class r extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final r f106120a = new r();

            private r() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof r);
            }

            public int hashCode() {
                return -2077686527;
            }

            public String toString() {
                return "ValidatePasswordField";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "", "<init>", "()V", "l", "e", "b", "a", "c", "k", "h", "i", "f", "j", "g", "d", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$d;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$e;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$f;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$g;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$h;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$i;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$j;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$k;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$l;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$a;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f106121a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -913360670;
            }

            public String toString() {
                return "AllValidFieldsEvent";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "", "email", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$b$b, reason: collision with other inner class name and from toString */
        public static final /* data */ class EmailInUseError extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String email;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EmailInUseError) && Intrinsics.e(this.email, ((EmailInUseError) other).email);
            }

            public int hashCode() {
                return this.email.hashCode();
            }

            public String toString() {
                return "EmailInUseError(email=" + this.email + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmailInUseError(String email) {
                super(null);
                Intrinsics.j(email, "email");
                this.email = email;
            }

            /* renamed from: a, reason: from getter */
            public final String getEmail() {
                return this.email;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$c;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "Lak/a;", "errorMessage", "<init>", "(Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "()Lak/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$b$c, reason: from toString */
        public static final /* data */ class EmailRetrofitError extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final int f106123b = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a errorMessage;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EmailRetrofitError) && Intrinsics.e(this.errorMessage, ((EmailRetrofitError) other).errorMessage);
            }

            public int hashCode() {
                return this.errorMessage.hashCode();
            }

            public String toString() {
                return "EmailRetrofitError(errorMessage=" + this.errorMessage + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmailRetrofitError(AbstractC5607a errorMessage) {
                super(null);
                Intrinsics.j(errorMessage, "errorMessage");
                this.errorMessage = errorMessage;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getErrorMessage() {
                return this.errorMessage;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$d;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$c;", "profileEnrollmentField", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "profileEnrollmentViewState", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$c;Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$c;", "()Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$c;", "b", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "()Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$b$d, reason: from toString */
        public static final /* data */ class ErrorFocusEvent extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final c profileEnrollmentField;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProfileEnrollmentViewState profileEnrollmentViewState;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ErrorFocusEvent)) {
                    return false;
                }
                ErrorFocusEvent errorFocusEvent = (ErrorFocusEvent) other;
                return this.profileEnrollmentField == errorFocusEvent.profileEnrollmentField && Intrinsics.e(this.profileEnrollmentViewState, errorFocusEvent.profileEnrollmentViewState);
            }

            public int hashCode() {
                c cVar = this.profileEnrollmentField;
                return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.profileEnrollmentViewState.hashCode();
            }

            public String toString() {
                return "ErrorFocusEvent(profileEnrollmentField=" + this.profileEnrollmentField + ", profileEnrollmentViewState=" + this.profileEnrollmentViewState + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorFocusEvent(c cVar, ProfileEnrollmentViewState profileEnrollmentViewState) {
                super(null);
                Intrinsics.j(profileEnrollmentViewState, "profileEnrollmentViewState");
                this.profileEnrollmentField = cVar;
                this.profileEnrollmentViewState = profileEnrollmentViewState;
            }

            /* renamed from: a, reason: from getter */
            public final c getProfileEnrollmentField() {
                return this.profileEnrollmentField;
            }

            /* renamed from: b, reason: from getter */
            public final ProfileEnrollmentViewState getProfileEnrollmentViewState() {
                return this.profileEnrollmentViewState;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$e;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final e f106127a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -1624938158;
            }

            public String toString() {
                return "GoToEnrollmentPhonePage";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$f;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "profileEnrollmentViewState", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "()Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$b$f, reason: from toString */
        public static final /* data */ class SetEmailFieldErrors extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProfileEnrollmentViewState profileEnrollmentViewState;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetEmailFieldErrors) && Intrinsics.e(this.profileEnrollmentViewState, ((SetEmailFieldErrors) other).profileEnrollmentViewState);
            }

            public int hashCode() {
                return this.profileEnrollmentViewState.hashCode();
            }

            public String toString() {
                return "SetEmailFieldErrors(profileEnrollmentViewState=" + this.profileEnrollmentViewState + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetEmailFieldErrors(ProfileEnrollmentViewState profileEnrollmentViewState) {
                super(null);
                Intrinsics.j(profileEnrollmentViewState, "profileEnrollmentViewState");
                this.profileEnrollmentViewState = profileEnrollmentViewState;
            }

            /* renamed from: a, reason: from getter */
            public final ProfileEnrollmentViewState getProfileEnrollmentViewState() {
                return this.profileEnrollmentViewState;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$g;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "()Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "profileEnrollmentViewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$b$g, reason: from toString */
        public static final /* data */ class SetFieldErrors extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProfileEnrollmentViewState profileEnrollmentViewState;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetFieldErrors) && Intrinsics.e(this.profileEnrollmentViewState, ((SetFieldErrors) other).profileEnrollmentViewState);
            }

            public int hashCode() {
                return this.profileEnrollmentViewState.hashCode();
            }

            public String toString() {
                return "SetFieldErrors(profileEnrollmentViewState=" + this.profileEnrollmentViewState + ')';
            }

            /* renamed from: a, reason: from getter */
            public final ProfileEnrollmentViewState getProfileEnrollmentViewState() {
                return this.profileEnrollmentViewState;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$h;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "profileEnrollmentViewState", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "()Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$b$h, reason: from toString */
        public static final /* data */ class SetFirstNameFieldErrors extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProfileEnrollmentViewState profileEnrollmentViewState;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetFirstNameFieldErrors) && Intrinsics.e(this.profileEnrollmentViewState, ((SetFirstNameFieldErrors) other).profileEnrollmentViewState);
            }

            public int hashCode() {
                return this.profileEnrollmentViewState.hashCode();
            }

            public String toString() {
                return "SetFirstNameFieldErrors(profileEnrollmentViewState=" + this.profileEnrollmentViewState + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetFirstNameFieldErrors(ProfileEnrollmentViewState profileEnrollmentViewState) {
                super(null);
                Intrinsics.j(profileEnrollmentViewState, "profileEnrollmentViewState");
                this.profileEnrollmentViewState = profileEnrollmentViewState;
            }

            /* renamed from: a, reason: from getter */
            public final ProfileEnrollmentViewState getProfileEnrollmentViewState() {
                return this.profileEnrollmentViewState;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$i;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "profileEnrollmentViewState", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "()Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$b$i, reason: from toString */
        public static final /* data */ class SetLastNameFieldErrors extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProfileEnrollmentViewState profileEnrollmentViewState;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetLastNameFieldErrors) && Intrinsics.e(this.profileEnrollmentViewState, ((SetLastNameFieldErrors) other).profileEnrollmentViewState);
            }

            public int hashCode() {
                return this.profileEnrollmentViewState.hashCode();
            }

            public String toString() {
                return "SetLastNameFieldErrors(profileEnrollmentViewState=" + this.profileEnrollmentViewState + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetLastNameFieldErrors(ProfileEnrollmentViewState profileEnrollmentViewState) {
                super(null);
                Intrinsics.j(profileEnrollmentViewState, "profileEnrollmentViewState");
                this.profileEnrollmentViewState = profileEnrollmentViewState;
            }

            /* renamed from: a, reason: from getter */
            public final ProfileEnrollmentViewState getProfileEnrollmentViewState() {
                return this.profileEnrollmentViewState;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$j;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "profileEnrollmentViewState", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "()Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$b$j, reason: from toString */
        public static final /* data */ class SetPasswordFieldErrors extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProfileEnrollmentViewState profileEnrollmentViewState;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetPasswordFieldErrors) && Intrinsics.e(this.profileEnrollmentViewState, ((SetPasswordFieldErrors) other).profileEnrollmentViewState);
            }

            public int hashCode() {
                return this.profileEnrollmentViewState.hashCode();
            }

            public String toString() {
                return "SetPasswordFieldErrors(profileEnrollmentViewState=" + this.profileEnrollmentViewState + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetPasswordFieldErrors(ProfileEnrollmentViewState profileEnrollmentViewState) {
                super(null);
                Intrinsics.j(profileEnrollmentViewState, "profileEnrollmentViewState");
                this.profileEnrollmentViewState = profileEnrollmentViewState;
            }

            /* renamed from: a, reason: from getter */
            public final ProfileEnrollmentViewState getProfileEnrollmentViewState() {
                return this.profileEnrollmentViewState;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$k;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "profileEnrollmentViewState", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "()Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.q$b$k, reason: from toString */
        public static final /* data */ class SetupProgressIndicatorEvent extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProfileEnrollmentViewState profileEnrollmentViewState;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetupProgressIndicatorEvent) && Intrinsics.e(this.profileEnrollmentViewState, ((SetupProgressIndicatorEvent) other).profileEnrollmentViewState);
            }

            public int hashCode() {
                return this.profileEnrollmentViewState.hashCode();
            }

            public String toString() {
                return "SetupProgressIndicatorEvent(profileEnrollmentViewState=" + this.profileEnrollmentViewState + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupProgressIndicatorEvent(ProfileEnrollmentViewState profileEnrollmentViewState) {
                super(null);
                Intrinsics.j(profileEnrollmentViewState, "profileEnrollmentViewState");
                this.profileEnrollmentViewState = profileEnrollmentViewState;
            }

            /* renamed from: a, reason: from getter */
            public final ProfileEnrollmentViewState getProfileEnrollmentViewState() {
                return this.profileEnrollmentViewState;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b$l;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class l extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final l f106134a = new l();

            private l() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            public int hashCode() {
                return -851783622;
            }

            public String toString() {
                return "ViewTermsOfServiceEvent";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/q$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f106135a = new c("FIRST_NAME", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f106136b = new c("LAST_NAME", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f106137c = new c("EMAIL_ADDRESS", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final c f106138d = new c("PASSWORD", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ c[] f106139e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f106140f;

        private static final /* synthetic */ c[] a() {
            return new c[]{f106135a, f106136b, f106137c, f106138d};
        }

        static {
            c[] cVarArrA = a();
            f106139e = cVarArrA;
            f106140f = EnumEntriesKt.a(cVarArrA);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f106139e.clone();
        }

        private c(String str, int i10) {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3374g.values().length];
            try {
                iArr[EnumC3374g.f6528c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentViewModel$checkEmailConflict$1", f = "ProfileEnrollmentViewModel.kt", l = {156, 157, 158}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f106141a;

        /* renamed from: b, reason: collision with root package name */
        Object f106142b;

        /* renamed from: c, reason: collision with root package name */
        Object f106143c;

        /* renamed from: d, reason: collision with root package name */
        Object f106144d;

        /* renamed from: e, reason: collision with root package name */
        int f106145e;

        /* renamed from: f, reason: collision with root package name */
        int f106146f;

        /* renamed from: g, reason: collision with root package name */
        int f106147g;

        /* renamed from: h, reason: collision with root package name */
        int f106148h;

        /* renamed from: i, reason: collision with root package name */
        int f106149i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f106150j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f106152l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f106152l = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = q.this.new e(this.f106152l, continuation);
            eVar.f106150j = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d6, code lost:
        
            if (r3.F(r10) == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
        /* JADX WARN: Type inference failed for: r1v18, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v24 */
        /* JADX WARN: Type inference failed for: r1v25 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.enrollment.profile.q.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentViewModel$onAction$10", f = "ProfileEnrollmentViewModel.kt", l = {HttpResponseStatus.REDIRECTION_NOT_MODIFIED}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106153a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106153a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = q.this._viewEvent;
                b.l lVar = b.l.f106134a;
                this.f106153a = 1;
                if (interfaceC17139A.emit(lVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentViewModel$onAction$3", f = "ProfileEnrollmentViewModel.kt", l = {294}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106155a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106155a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                q qVar = q.this;
                this.f106155a = 1;
                if (qVar.U(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentViewModel$onAction$4", f = "ProfileEnrollmentViewModel.kt", l = {295}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106157a;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106157a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                q qVar = q.this;
                this.f106157a = 1;
                if (qVar.N(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentViewModel$onAction$5", f = "ProfileEnrollmentViewModel.kt", l = {296}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106159a;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106159a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                q qVar = q.this;
                this.f106159a = 1;
                if (qVar.I(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentViewModel$onAction$6", f = "ProfileEnrollmentViewModel.kt", l = {297}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106161a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106161a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                q qVar = q.this;
                this.f106161a = 1;
                if (qVar.J(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentViewModel$onAction$7", f = "ProfileEnrollmentViewModel.kt", l = {298}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106163a;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106163a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                q qVar = q.this;
                this.f106163a = 1;
                if (qVar.H(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentViewModel$onAction$8", f = "ProfileEnrollmentViewModel.kt", l = {299}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106165a;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return q.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f106165a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                q qVar = q.this;
                this.f106165a = 1;
                if (qVar.K(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(Continuation<? super Unit> continuation) {
        this.isValidatingEmailAvailability = false;
        this.isEmailValidated = false;
        Object objEmit = this._viewEvent.emit(new b.EmailRetrofitError(AbstractC5607a.INSTANCE.d(pk.f.f155808v, new Object[0])), continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G(ValidateEmailAvailability validateEmailAvailability, String str, Continuation<? super Unit> continuation) {
        this.isValidatingEmailAvailability = false;
        if (validateEmailAvailability.getConflictType() == EnumC3374g.f6527b) {
            this.isEmailValidated = true;
            Object objEmit = this._viewEvent.emit(b.e.f106127a, continuation);
            return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f142422a;
        }
        if (d.$EnumSwitchMapping$0[validateEmailAvailability.getConflictType().ordinal()] == 1) {
            Object objEmit2 = this._viewEvent.emit(new b.EmailInUseError(str), continuation);
            return objEmit2 == IntrinsicsKt.f() ? objEmit2 : Unit.f142422a;
        }
        Object objEmit3 = this._viewEvent.emit(new b.EmailRetrofitError(AbstractC5607a.INSTANCE.d(pk.f.f155788b, new Object[0])), continuation);
        return objEmit3 == IntrinsicsKt.f() ? objEmit3 : Unit.f142422a;
    }

    private final void L(String firstName, String lastName, String emailAddress, String password) {
        ProfileEnrollmentViewState value;
        this.isProfileInfoSet = true;
        InterfaceC17140B<ProfileEnrollmentViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ProfileEnrollmentViewState.g(value, null, null, null, null, true, 15, null)));
        E(firstName, lastName, emailAddress, password);
    }

    private final void S() {
    }

    private final void y(String email) {
        this.isEmailValidated = false;
        if (this.isValidatingEmailAvailability) {
            return;
        }
        this.isValidatingEmailAvailability = true;
        C16648k.d(d0.a(this), null, null, new e(email, null), 3, null);
    }

    public q(yl.k featureManager, yo.k userManager, Bh.e profileRepository, C12063a createAccountRepository, InterfaceC14261a analyticsEngine) {
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(profileRepository, "profileRepository");
        Intrinsics.j(createAccountRepository, "createAccountRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.userManager = userManager;
        this.profileRepository = profileRepository;
        this.createAccountRepository = createAccountRepository;
        this.analyticsEngine = analyticsEngine;
        this._viewEvent = C17146H.b(0, 0, null, 7, null);
        this._viewState = S.a(new ProfileEnrollmentViewState(null, null, null, null, true, 15, null));
        this.disposables = new Nu.a();
    }

    private final void E(String firstName, String lastName, String emailAddress, String password) {
        ProfileEnrollmentViewState value;
        InterfaceC17140B<ProfileEnrollmentViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, new w(firstName, lastName, emailAddress, password).b(value)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H(Continuation<? super Unit> continuation) {
        Object objEmit = this._viewEvent.emit(new b.SetEmailFieldErrors(C().getValue()), continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I(Continuation<? super Unit> continuation) {
        Object objEmit = this._viewEvent.emit(new b.SetFirstNameFieldErrors(C().getValue()), continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object J(Continuation<? super Unit> continuation) {
        Object objEmit = this._viewEvent.emit(new b.SetLastNameFieldErrors(C().getValue()), continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object K(Continuation<? super Unit> continuation) {
        Object objEmit = this._viewEvent.emit(new b.SetPasswordFieldErrors(C().getValue()), continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f142422a;
    }

    private final void M(String firstName, String lastName, String emailAddress, String password) {
        this.createAccountRepository.e(firstName, lastName, emailAddress, password);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N(Continuation<? super Unit> continuation) {
        Object objEmit = this._viewEvent.emit(new b.SetupProgressIndicatorEvent(C().getValue()), continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f142422a;
    }

    private final void O() {
        this.analyticsEngine.h(C14476c.a("event: create account: email address already exists"), new Function1() { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.P((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("create account: new experience");
        track.n("meijer: create account: profile");
        return Unit.f142422a;
    }

    private final void Q() {
        this.analyticsEngine.h(C14476c.h("meijer: create account: profile"), new Function1() { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.R((TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("create account: new experience");
        return Unit.f142422a;
    }

    private final void T(String emailAddress) {
        if (emailAddress != null) {
            y(emailAddress);
        }
    }

    public final InterfaceC17144F<b> B() {
        return C17154h.b(this._viewEvent);
    }

    public final P<ProfileEnrollmentViewState> C() {
        return C17154h.c(this._viewState);
    }

    public final void D(a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.SetProfileInformation) {
            a.SetProfileInformation setProfileInformation = (a.SetProfileInformation) action;
            L(setProfileInformation.getFirstName(), setProfileInformation.getLastName(), setProfileInformation.getEmailAddress(), setProfileInformation.getPassword());
            return;
        }
        if (action instanceof a.SetProfileInformationToAccount) {
            a.SetProfileInformationToAccount setProfileInformationToAccount = (a.SetProfileInformationToAccount) action;
            String firstName = setProfileInformationToAccount.getFirstName();
            Intrinsics.g(firstName);
            String lastName = setProfileInformationToAccount.getLastName();
            Intrinsics.g(lastName);
            String emailAddress = setProfileInformationToAccount.getEmailAddress();
            Intrinsics.g(emailAddress);
            String password = setProfileInformationToAccount.getPassword();
            Intrinsics.g(password);
            M(firstName, lastName, emailAddress, password);
            return;
        }
        if (action instanceof a.SetFirstName) {
            String firstName2 = ((a.SetFirstName) action).getFirstName();
            String strE = C().getValue().l().e();
            if (strE == null) {
                strE = "";
            }
            String strE2 = C().getValue().i().e();
            if (strE2 == null) {
                strE2 = "";
            }
            String strE3 = C().getValue().m().e();
            E(firstName2, strE, strE2, strE3 != null ? strE3 : "");
            return;
        }
        if (action instanceof a.SetLastName) {
            String strE4 = C().getValue().j().e();
            if (strE4 == null) {
                strE4 = "";
            }
            String lastName2 = ((a.SetLastName) action).getLastName();
            String strE5 = C().getValue().i().e();
            if (strE5 == null) {
                strE5 = "";
            }
            String strE6 = C().getValue().m().e();
            E(strE4, lastName2, strE5, strE6 != null ? strE6 : "");
            return;
        }
        if (action instanceof a.SetEmailAddress) {
            String strE7 = C().getValue().j().e();
            if (strE7 == null) {
                strE7 = "";
            }
            String strE8 = C().getValue().l().e();
            if (strE8 == null) {
                strE8 = "";
            }
            String emailAddress2 = ((a.SetEmailAddress) action).getEmailAddress();
            String strE9 = C().getValue().m().e();
            E(strE7, strE8, emailAddress2, strE9 != null ? strE9 : "");
            return;
        }
        if (action instanceof a.SetPassword) {
            String strE10 = C().getValue().j().e();
            if (strE10 == null) {
                strE10 = "";
            }
            String strE11 = C().getValue().l().e();
            if (strE11 == null) {
                strE11 = "";
            }
            String strE12 = C().getValue().i().e();
            E(strE10, strE11, strE12 != null ? strE12 : "", ((a.SetPassword) action).getPassword());
            return;
        }
        if (action instanceof a.StoreExistingFieldValues) {
            yo.k kVar = this.userManager;
            a.StoreExistingFieldValues storeExistingFieldValues = (a.StoreExistingFieldValues) action;
            String emailAddress3 = storeExistingFieldValues.getEmailAddress();
            if (emailAddress3 == null) {
                emailAddress3 = "";
            }
            kVar.Y(emailAddress3);
            String phoneNumber = storeExistingFieldValues.getPhoneNumber();
            kVar.Z(phoneNumber != null ? phoneNumber : "");
            return;
        }
        if (action instanceof a.k) {
            C16648k.d(d0.a(this), null, null, new g(null), 3, null);
            return;
        }
        if (action instanceof a.i) {
            C16648k.d(d0.a(this), null, null, new h(null), 3, null);
            return;
        }
        if (action instanceof a.p) {
            C16648k.d(d0.a(this), null, null, new i(null), 3, null);
            return;
        }
        if (action instanceof a.C1582q) {
            C16648k.d(d0.a(this), null, null, new j(null), 3, null);
            return;
        }
        if (action instanceof a.o) {
            C16648k.d(d0.a(this), null, null, new k(null), 3, null);
            return;
        }
        if (action instanceof a.r) {
            C16648k.d(d0.a(this), null, null, new l(null), 3, null);
            return;
        }
        if (action instanceof a.ValidateEmailAddress) {
            T(((a.ValidateEmailAddress) action).getEmailAddress());
            return;
        }
        if (action instanceof a.m) {
            S();
            return;
        }
        if (action instanceof a.j) {
            C16648k.d(d0.a(this), null, null, new f(null), 3, null);
        } else if (action instanceof a.b) {
            Q();
        } else {
            if (!(action instanceof a.C1581a)) {
                throw new NoWhenBranchMatchedException();
            }
            O();
        }
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    private final Object A(ProfileEnrollmentViewState profileEnrollmentViewState, Continuation<? super Unit> continuation) {
        c cVar;
        Iterator<T> it = profileEnrollmentViewState.a().iterator();
        while (it.hasNext()) {
            Validation validation = (Validation) it.next();
            if (!validation.getIsValid()) {
                if (Intrinsics.e(validation, profileEnrollmentViewState.j())) {
                    cVar = c.f106135a;
                } else if (Intrinsics.e(validation, profileEnrollmentViewState.l())) {
                    cVar = c.f106136b;
                } else if (Intrinsics.e(validation, profileEnrollmentViewState.i())) {
                    cVar = c.f106137c;
                } else if (Intrinsics.e(validation, profileEnrollmentViewState.m())) {
                    cVar = c.f106138d;
                } else {
                    cVar = null;
                }
                Object objEmit = this._viewEvent.emit(new b.ErrorFocusEvent(cVar, profileEnrollmentViewState), continuation);
                if (objEmit == IntrinsicsKt.f()) {
                    return objEmit;
                }
                return Unit.f142422a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U(Continuation<? super Unit> continuation) {
        if (C().getValue().isValid()) {
            Object objEmit = this._viewEvent.emit(b.a.f106121a, continuation);
            if (objEmit == IntrinsicsKt.f()) {
                return objEmit;
            }
            return Unit.f142422a;
        }
        Object objA = A(C().getValue(), continuation);
        if (objA == IntrinsicsKt.f()) {
            return objA;
        }
        return Unit.f142422a;
    }
}
