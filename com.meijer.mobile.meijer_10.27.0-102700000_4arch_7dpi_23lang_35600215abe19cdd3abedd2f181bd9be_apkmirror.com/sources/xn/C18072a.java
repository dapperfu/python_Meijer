package xn;

import Oj.a;
import androidx.view.c0;
import androidx.view.d0;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import gi.InterfaceC14261a;
import hi.C14476c;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.P;
import tv.S;
import wn.AbstractC17841a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0013\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020#0'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lxn/a;", "Landroidx/lifecycle/c0;", "LZn/a;", "rewardsRepository", "Lgi/a;", "analyticsEngine", "<init>", "(LZn/a;Lgi/a;)V", "", "t", "()V", "", "termsID", "u", "(J)V", "Lwn/a;", "action", "s", "(Lwn/a;)V", "a", "LZn/a;", "b", "Lgi/a;", "Ltv/B;", "Lxn/a$b;", "c", "Ltv/B;", "_viewStateFlow", "Ltv/P;", "d", "Ltv/P;", "r", "()Ltv/P;", "viewStateFlow", "Ltv/A;", "Lxn/a$a;", "e", "Ltv/A;", "_effectsFlow", "Ltv/F;", "f", "Ltv/F;", "q", "()Ltv/F;", "effectsFlow", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: xn.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C18072a extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Zn.a rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewStateFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> viewStateFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<AbstractC2721a> _effectsFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<AbstractC2721a> effectsFlow;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lxn/a$a;", "", "<init>", "()V", "e", "a", "d", "b", "f", "c", "Lxn/a$a$a;", "Lxn/a$a$b;", "Lxn/a$a$c;", "Lxn/a$a$d;", "Lxn/a$a$e;", "Lxn/a$a$f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xn.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2721a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lxn/a$a$a;", "Lxn/a$a;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xn.a$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class CallMccHelpLine extends AbstractC2721a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String phoneNumber;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CallMccHelpLine) && Intrinsics.e(this.phoneNumber, ((CallMccHelpLine) other).phoneNumber);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallMccHelpLine(String phoneNumber) {
                super(null);
                Intrinsics.j(phoneNumber, "phoneNumber");
                this.phoneNumber = phoneNumber;
            }

            /* renamed from: a, reason: from getter */
            public final String getPhoneNumber() {
                return this.phoneNumber;
            }

            public int hashCode() {
                return this.phoneNumber.hashCode();
            }

            public String toString() {
                return "CallMccHelpLine(phoneNumber=" + this.phoneNumber + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lxn/a$a$b;", "Lxn/a$a;", "", "message", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xn.a$a$b, reason: from toString */
        public static final /* data */ class DisplayErrorDialog extends AbstractC2721a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            public DisplayErrorDialog(int i10) {
                super(null);
                this.message = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisplayErrorDialog) && this.message == ((DisplayErrorDialog) other).message;
            }

            /* renamed from: a, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            public int hashCode() {
                return Integer.hashCode(this.message);
            }

            public String toString() {
                return "DisplayErrorDialog(message=" + this.message + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxn/a$a$c;", "Lxn/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xn.a$a$c */
        public static final /* data */ class c extends AbstractC2721a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f169705a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "DisplayPrimaryAccountDialogBox";
            }

            public int hashCode() {
                return -2064260921;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxn/a$a$d;", "Lxn/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xn.a$a$d */
        public static final /* data */ class d extends AbstractC2721a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f169706a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "NavigateToMccApplyToday";
            }

            public int hashCode() {
                return 1647077507;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxn/a$a$e;", "Lxn/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xn.a$a$e */
        public static final /* data */ class e extends AbstractC2721a {

            /* renamed from: a, reason: collision with root package name */
            public static final e f169707a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public String toString() {
                return "NavigateToMccTermsAndConditions";
            }

            public int hashCode() {
                return -212107848;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxn/a$a$f;", "Lxn/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xn.a$a$f */
        public static final /* data */ class f extends AbstractC2721a {

            /* renamed from: a, reason: collision with root package name */
            public static final f f169708a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public String toString() {
                return "OptInSuccess";
            }

            public int hashCode() {
                return 2144564732;
            }
        }

        public /* synthetic */ AbstractC2721a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC2721a() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Jd\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\"\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b$\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010*\u001a\u0004\b+\u0010,R\u0011\u0010.\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010'¨\u0006/"}, d2 = {"Lxn/a$b;", "", "", "firstName", "lastName", "j$/time/LocalDate", "dateOfBirth", "lastFourDigitsOfCard", "", "termsAndConditionsAccepted", "displayError", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "exception", "LOj/a;", "loadingState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDate;Ljava/lang/String;ZZLcom/meijer/mobile/core/networking/exceptions/RetrofitException;LOj/a;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDate;Ljava/lang/String;ZZLcom/meijer/mobile/core/networking/exceptions/RetrofitException;LOj/a;)Lxn/a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "h", "c", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "d", "g", "e", "Z", "k", "()Z", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "()Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "LOj/a;", "i", "()LOj/a;", "j", "submitButtonEnabled", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xn.a$b, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String firstName;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String lastName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate dateOfBirth;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String lastFourDigitsOfCard;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean termsAndConditionsAccepted;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean displayError;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final RetrofitException exception;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Oj.a loadingState;

        public ViewState() {
            this(null, null, null, null, false, false, null, null, l3.f92484c, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.firstName, viewState.firstName) && Intrinsics.e(this.lastName, viewState.lastName) && Intrinsics.e(this.dateOfBirth, viewState.dateOfBirth) && Intrinsics.e(this.lastFourDigitsOfCard, viewState.lastFourDigitsOfCard) && this.termsAndConditionsAccepted == viewState.termsAndConditionsAccepted && this.displayError == viewState.displayError && Intrinsics.e(this.exception, viewState.exception) && Intrinsics.e(this.loadingState, viewState.loadingState);
        }

        public ViewState(String firstName, String lastName, LocalDate localDate, String lastFourDigitsOfCard, boolean z10, boolean z11, RetrofitException retrofitException, Oj.a loadingState) {
            Intrinsics.j(firstName, "firstName");
            Intrinsics.j(lastName, "lastName");
            Intrinsics.j(lastFourDigitsOfCard, "lastFourDigitsOfCard");
            Intrinsics.j(loadingState, "loadingState");
            this.firstName = firstName;
            this.lastName = lastName;
            this.dateOfBirth = localDate;
            this.lastFourDigitsOfCard = lastFourDigitsOfCard;
            this.termsAndConditionsAccepted = z10;
            this.displayError = z11;
            this.exception = retrofitException;
            this.loadingState = loadingState;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, String str, String str2, LocalDate localDate, String str3, boolean z10, boolean z11, RetrofitException retrofitException, Oj.a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = viewState.firstName;
            }
            if ((i10 & 2) != 0) {
                str2 = viewState.lastName;
            }
            if ((i10 & 4) != 0) {
                localDate = viewState.dateOfBirth;
            }
            if ((i10 & 8) != 0) {
                str3 = viewState.lastFourDigitsOfCard;
            }
            if ((i10 & 16) != 0) {
                z10 = viewState.termsAndConditionsAccepted;
            }
            if ((i10 & 32) != 0) {
                z11 = viewState.displayError;
            }
            if ((i10 & 64) != 0) {
                retrofitException = viewState.exception;
            }
            if ((i10 & 128) != 0) {
                aVar = viewState.loadingState;
            }
            RetrofitException retrofitException2 = retrofitException;
            Oj.a aVar2 = aVar;
            boolean z12 = z10;
            boolean z13 = z11;
            return viewState.a(str, str2, localDate, str3, z12, z13, retrofitException2, aVar2);
        }

        public final ViewState a(String firstName, String lastName, LocalDate dateOfBirth, String lastFourDigitsOfCard, boolean termsAndConditionsAccepted, boolean displayError, RetrofitException exception, Oj.a loadingState) {
            Intrinsics.j(firstName, "firstName");
            Intrinsics.j(lastName, "lastName");
            Intrinsics.j(lastFourDigitsOfCard, "lastFourDigitsOfCard");
            Intrinsics.j(loadingState, "loadingState");
            return new ViewState(firstName, lastName, dateOfBirth, lastFourDigitsOfCard, termsAndConditionsAccepted, displayError, exception, loadingState);
        }

        /* renamed from: c, reason: from getter */
        public final LocalDate getDateOfBirth() {
            return this.dateOfBirth;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getDisplayError() {
            return this.displayError;
        }

        /* renamed from: e, reason: from getter */
        public final RetrofitException getException() {
            return this.exception;
        }

        /* renamed from: f, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* renamed from: g, reason: from getter */
        public final String getLastFourDigitsOfCard() {
            return this.lastFourDigitsOfCard;
        }

        /* renamed from: h, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        public int hashCode() {
            int iHashCode = ((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31;
            LocalDate localDate = this.dateOfBirth;
            int iHashCode2 = (((((((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.lastFourDigitsOfCard.hashCode()) * 31) + Boolean.hashCode(this.termsAndConditionsAccepted)) * 31) + Boolean.hashCode(this.displayError)) * 31;
            RetrofitException retrofitException = this.exception;
            return ((iHashCode2 + (retrofitException != null ? retrofitException.hashCode() : 0)) * 31) + this.loadingState.hashCode();
        }

        /* renamed from: i, reason: from getter */
        public final Oj.a getLoadingState() {
            return this.loadingState;
        }

        public final boolean j() {
            return this.firstName.length() > 0 && this.lastName.length() > 0 && this.lastFourDigitsOfCard.length() > 0 && this.dateOfBirth != null && this.termsAndConditionsAccepted;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getTermsAndConditionsAccepted() {
            return this.termsAndConditionsAccepted;
        }

        public String toString() {
            return "ViewState(firstName=" + this.firstName + ", lastName=" + this.lastName + ", dateOfBirth=" + this.dateOfBirth + ", lastFourDigitsOfCard=" + this.lastFourDigitsOfCard + ", termsAndConditionsAccepted=" + this.termsAndConditionsAccepted + ", displayError=" + this.displayError + ", exception=" + this.exception + ", loadingState=" + this.loadingState + ')';
        }

        public /* synthetic */ ViewState(String str, String str2, LocalDate localDate, String str3, boolean z10, boolean z11, RetrofitException retrofitException, Oj.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : localDate, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11, (i10 & 64) != 0 ? null : retrofitException, (i10 & 128) != 0 ? new a.NotLoading(null, 1, null) : aVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.viewmodel.meijercreditcard.AvailableMccDetailsViewModel$onAction$2", f = "AvailableMccDetailsViewModel.kt", l = {115}, m = "invokeSuspend")
    /* renamed from: xn.a$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169717a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18072a.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f169717a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C18072a.this._effectsFlow;
                AbstractC2721a.d dVar = AbstractC2721a.d.f169706a;
                this.f169717a = 1;
                if (interfaceC17139A.emit(dVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.viewmodel.meijercreditcard.AvailableMccDetailsViewModel$onAction$3", f = "AvailableMccDetailsViewModel.kt", l = {119}, m = "invokeSuspend")
    /* renamed from: xn.a$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169719a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC17841a f169721c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC17841a abstractC17841a, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f169721c = abstractC17841a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18072a.this.new d(this.f169721c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f169719a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C18072a.this._effectsFlow;
                AbstractC2721a.CallMccHelpLine callMccHelpLine = new AbstractC2721a.CallMccHelpLine(((AbstractC17841a.CallHelpLine) this.f169721c).getPhoneNumber());
                this.f169719a = 1;
                if (interfaceC17139A.emit(callMccHelpLine, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.viewmodel.meijercreditcard.AvailableMccDetailsViewModel$onAction$4", f = "AvailableMccDetailsViewModel.kt", l = {123}, m = "invokeSuspend")
    /* renamed from: xn.a$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169722a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18072a.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f169722a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C18072a.this._effectsFlow;
                AbstractC2721a.e eVar = AbstractC2721a.e.f169707a;
                this.f169722a = 1;
                if (interfaceC17139A.emit(eVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.viewmodel.meijercreditcard.AvailableMccDetailsViewModel$onAction$9", f = "AvailableMccDetailsViewModel.kt", l = {147}, m = "invokeSuspend")
    /* renamed from: xn.a$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169724a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18072a.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f169724a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = C18072a.this._effectsFlow;
                AbstractC2721a.c cVar = AbstractC2721a.c.f169705a;
                this.f169724a = 1;
                if (interfaceC17139A.emit(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.viewmodel.meijercreditcard.AvailableMccDetailsViewModel$onSubmitMccDetails$2", f = "AvailableMccDetailsViewModel.kt", l = {58, 67}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: xn.a$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f169726a;

        /* renamed from: b, reason: collision with root package name */
        Object f169727b;

        /* renamed from: c, reason: collision with root package name */
        Object f169728c;

        /* renamed from: d, reason: collision with root package name */
        Object f169729d;

        /* renamed from: e, reason: collision with root package name */
        int f169730e;

        /* renamed from: f, reason: collision with root package name */
        int f169731f;

        /* renamed from: g, reason: collision with root package name */
        int f169732g;

        /* renamed from: h, reason: collision with root package name */
        int f169733h;

        /* renamed from: i, reason: collision with root package name */
        int f169734i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f169735j;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = C18072a.this.new g(continuation);
            gVar.f169735j = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ff, code lost:
        
            if (r7.emit(r9, r23) == r2) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xn.C18072a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.viewmodel.meijercreditcard.AvailableMccDetailsViewModel$optIntoMeijerCreditCardRewards$1$1", f = "AvailableMccDetailsViewModel.kt", l = {82, 90}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: xn.a$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f169737a;

        /* renamed from: b, reason: collision with root package name */
        Object f169738b;

        /* renamed from: c, reason: collision with root package name */
        Object f169739c;

        /* renamed from: d, reason: collision with root package name */
        Object f169740d;

        /* renamed from: e, reason: collision with root package name */
        int f169741e;

        /* renamed from: f, reason: collision with root package name */
        int f169742f;

        /* renamed from: g, reason: collision with root package name */
        int f169743g;

        /* renamed from: h, reason: collision with root package name */
        int f169744h;

        /* renamed from: i, reason: collision with root package name */
        boolean f169745i;

        /* renamed from: j, reason: collision with root package name */
        int f169746j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f169747k;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ViewState f169749m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f169750n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ViewState viewState, long j10, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f169749m = viewState;
            this.f169750n = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = C18072a.this.new h(this.f169749m, this.f169750n, continuation);
            hVar.f169747k = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 331
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xn.C18072a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C18072a(Zn.a rewardsRepository, InterfaceC14261a analyticsEngine) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.rewardsRepository = rewardsRepository;
        this.analyticsEngine = analyticsEngine;
        InterfaceC17140B<ViewState> interfaceC17140BA = S.a(new ViewState(null, null, null, null, false, false, null, null, l3.f92484c, null));
        this._viewStateFlow = interfaceC17140BA;
        this.viewStateFlow = C17154h.c(interfaceC17140BA);
        InterfaceC17139A<AbstractC2721a> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this._effectsFlow = interfaceC17139AB;
        this.effectsFlow = C17154h.b(interfaceC17139AB);
    }

    private final void t() {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewStateFlow;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, null, null, null, null, false, false, null, new a.Loading(null, null, 3, null), 31, null)));
        C16648k.d(d0.a(this), null, null, new g(null), 3, null);
        this.analyticsEngine.b(C14476c.a("event: mperks: rewards: mcard: sign up for DR submit"), C14476c.c("mperks: rewards: mcard"), C14476c.g("mperks"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(long termsID) {
        C16648k.d(d0.a(this), null, null, new h(this.viewStateFlow.getValue(), termsID, null), 3, null);
    }

    public final InterfaceC17144F<AbstractC2721a> q() {
        return this.effectsFlow;
    }

    public final P<ViewState> r() {
        return this.viewStateFlow;
    }

    public final void s(AbstractC17841a action) {
        ViewState value;
        ViewState value2;
        ViewState value3;
        ViewState value4;
        ViewState value5;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC17841a.AcceptTermsAndConditions) {
            InterfaceC17140B<ViewState> interfaceC17140B = this._viewStateFlow;
            do {
                value5 = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value5, ViewState.b(value5, null, null, null, null, ((AbstractC17841a.AcceptTermsAndConditions) action).getAccepted(), false, null, null, 239, null)));
            return;
        }
        if (Intrinsics.e(action, AbstractC17841a.b.f166228a)) {
            C16648k.d(d0.a(this), null, null, new c(null), 3, null);
            return;
        }
        if (action instanceof AbstractC17841a.CallHelpLine) {
            C16648k.d(d0.a(this), null, null, new d(action, null), 3, null);
            return;
        }
        if (Intrinsics.e(action, AbstractC17841a.d.f166230a)) {
            C16648k.d(d0.a(this), null, null, new e(null), 3, null);
            return;
        }
        if (Intrinsics.e(action, AbstractC17841a.f.f166232a)) {
            t();
            return;
        }
        if (action instanceof AbstractC17841a.UpdateDateOfBirth) {
            InterfaceC17140B<ViewState> interfaceC17140B2 = this._viewStateFlow;
            do {
                value4 = interfaceC17140B2.getValue();
            } while (!interfaceC17140B2.e(value4, ViewState.b(value4, null, null, ((AbstractC17841a.UpdateDateOfBirth) action).getDate(), null, false, false, null, null, 251, null)));
            return;
        }
        if (action instanceof AbstractC17841a.UpdateFirstName) {
            InterfaceC17140B<ViewState> interfaceC17140B3 = this._viewStateFlow;
            do {
                value3 = interfaceC17140B3.getValue();
            } while (!interfaceC17140B3.e(value3, ViewState.b(value3, ((AbstractC17841a.UpdateFirstName) action).getValue(), null, null, null, false, false, null, null, 254, null)));
            return;
        }
        if (action instanceof AbstractC17841a.UpdateLastFourDigits) {
            InterfaceC17140B<ViewState> interfaceC17140B4 = this._viewStateFlow;
            do {
                value2 = interfaceC17140B4.getValue();
            } while (!interfaceC17140B4.e(value2, ViewState.b(value2, null, null, null, ((AbstractC17841a.UpdateLastFourDigits) action).getValue(), false, false, null, null, 247, null)));
        } else if (action instanceof AbstractC17841a.UpdateLastName) {
            InterfaceC17140B<ViewState> interfaceC17140B5 = this._viewStateFlow;
            do {
                value = interfaceC17140B5.getValue();
            } while (!interfaceC17140B5.e(value, ViewState.b(value, null, ((AbstractC17841a.UpdateLastName) action).getValue(), null, null, false, false, null, null, 253, null)));
        } else {
            if (!(action instanceof AbstractC17841a.ErrorMessageClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            if (StringsKt.a0(((AbstractC17841a.ErrorMessageClicked) action).getUrl(), "primaryAccount", true)) {
                C16648k.d(d0.a(this), null, null, new f(null), 3, null);
            }
        }
    }
}
