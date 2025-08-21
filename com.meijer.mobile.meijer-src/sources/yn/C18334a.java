package yn;

import Pj.a;
import androidx.view.c0;
import androidx.view.d0;
import ao.C6282a;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import hi.InterfaceC14523a;
import ii.C14756c;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.P;
import pv.S;
import xn.AbstractC18200a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0013\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020#0'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lyn/a;", "Landroidx/lifecycle/c0;", "Lao/a;", "rewardsRepository", "Lhi/a;", "analyticsEngine", "<init>", "(Lao/a;Lhi/a;)V", "", "t", "()V", "", "termsID", "u", "(J)V", "Lxn/a;", "action", "s", "(Lxn/a;)V", "a", "Lao/a;", "b", "Lhi/a;", "Lpv/B;", "Lyn/a$b;", "c", "Lpv/B;", "_viewStateFlow", "Lpv/P;", "d", "Lpv/P;", "r", "()Lpv/P;", "viewStateFlow", "Lpv/A;", "Lyn/a$a;", "e", "Lpv/A;", "_effectsFlow", "Lpv/F;", "f", "Lpv/F;", "q", "()Lpv/F;", "effectsFlow", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yn.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C18334a extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6282a rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewStateFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> viewStateFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<AbstractC2761a> _effectsFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<AbstractC2761a> effectsFlow;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lyn/a$a;", "", "<init>", "()V", "e", "a", "d", "b", "f", "c", "Lyn/a$a$a;", "Lyn/a$a$b;", "Lyn/a$a$c;", "Lyn/a$a$d;", "Lyn/a$a$e;", "Lyn/a$a$f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2761a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lyn/a$a$a;", "Lyn/a$a;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yn.a$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class CallMccHelpLine extends AbstractC2761a {

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

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lyn/a$a$b;", "Lyn/a$a;", "", "message", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yn.a$a$b, reason: from toString */
        public static final /* data */ class DisplayErrorDialog extends AbstractC2761a {

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyn/a$a$c;", "Lyn/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yn.a$a$c */
        public static final /* data */ class c extends AbstractC2761a {

            /* renamed from: a, reason: collision with root package name */
            public static final c f171482a = new c();

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyn/a$a$d;", "Lyn/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yn.a$a$d */
        public static final /* data */ class d extends AbstractC2761a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f171483a = new d();

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyn/a$a$e;", "Lyn/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yn.a$a$e */
        public static final /* data */ class e extends AbstractC2761a {

            /* renamed from: a, reason: collision with root package name */
            public static final e f171484a = new e();

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyn/a$a$f;", "Lyn/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yn.a$a$f */
        public static final /* data */ class f extends AbstractC2761a {

            /* renamed from: a, reason: collision with root package name */
            public static final f f171485a = new f();

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

        public /* synthetic */ AbstractC2761a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC2761a() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Jd\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\"\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b$\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010*\u001a\u0004\b+\u0010,R\u0011\u0010.\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010'¨\u0006/"}, d2 = {"Lyn/a$b;", "", "", "firstName", "lastName", "j$/time/LocalDate", "dateOfBirth", "lastFourDigitsOfCard", "", "termsAndConditionsAccepted", "displayError", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "exception", "LPj/a;", "loadingState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDate;Ljava/lang/String;ZZLcom/meijer/mobile/core/networking/exceptions/RetrofitException;LPj/a;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDate;Ljava/lang/String;ZZLcom/meijer/mobile/core/networking/exceptions/RetrofitException;LPj/a;)Lyn/a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "h", "c", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "d", "g", "e", "Z", "k", "()Z", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "()Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "LPj/a;", "i", "()LPj/a;", "j", "submitButtonEnabled", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.a$b, reason: from toString */
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
        private final Pj.a loadingState;

        public ViewState() {
            this(null, null, null, null, false, false, null, null, l3.f93323c, null);
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

        public ViewState(String firstName, String lastName, LocalDate localDate, String lastFourDigitsOfCard, boolean z10, boolean z11, RetrofitException retrofitException, Pj.a loadingState) {
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

        public static /* synthetic */ ViewState b(ViewState viewState, String str, String str2, LocalDate localDate, String str3, boolean z10, boolean z11, RetrofitException retrofitException, Pj.a aVar, int i10, Object obj) {
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
            Pj.a aVar2 = aVar;
            boolean z12 = z10;
            boolean z13 = z11;
            return viewState.a(str, str2, localDate, str3, z12, z13, retrofitException2, aVar2);
        }

        public final ViewState a(String firstName, String lastName, LocalDate dateOfBirth, String lastFourDigitsOfCard, boolean termsAndConditionsAccepted, boolean displayError, RetrofitException exception, Pj.a loadingState) {
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
        public final Pj.a getLoadingState() {
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

        public /* synthetic */ ViewState(String str, String str2, LocalDate localDate, String str3, boolean z10, boolean z11, RetrofitException retrofitException, Pj.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : localDate, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? false : z11, (i10 & 64) != 0 ? null : retrofitException, (i10 & 128) != 0 ? new a.NotLoading(null, 1, null) : aVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.viewmodel.meijercreditcard.AvailableMccDetailsViewModel$onAction$2", f = "AvailableMccDetailsViewModel.kt", l = {115}, m = "invokeSuspend")
    /* renamed from: yn.a$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f171494a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18334a.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f171494a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C18334a.this._effectsFlow;
                AbstractC2761a.d dVar = AbstractC2761a.d.f171483a;
                this.f171494a = 1;
                if (interfaceC16548A.emit(dVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.viewmodel.meijercreditcard.AvailableMccDetailsViewModel$onAction$3", f = "AvailableMccDetailsViewModel.kt", l = {119}, m = "invokeSuspend")
    /* renamed from: yn.a$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f171496a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC18200a f171498c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC18200a abstractC18200a, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f171498c = abstractC18200a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18334a.this.new d(this.f171498c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f171496a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C18334a.this._effectsFlow;
                AbstractC2761a.CallMccHelpLine callMccHelpLine = new AbstractC2761a.CallMccHelpLine(((AbstractC18200a.CallHelpLine) this.f171498c).getPhoneNumber());
                this.f171496a = 1;
                if (interfaceC16548A.emit(callMccHelpLine, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.viewmodel.meijercreditcard.AvailableMccDetailsViewModel$onAction$4", f = "AvailableMccDetailsViewModel.kt", l = {123}, m = "invokeSuspend")
    /* renamed from: yn.a$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f171499a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18334a.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f171499a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C18334a.this._effectsFlow;
                AbstractC2761a.e eVar = AbstractC2761a.e.f171484a;
                this.f171499a = 1;
                if (interfaceC16548A.emit(eVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.viewmodel.meijercreditcard.AvailableMccDetailsViewModel$onAction$9", f = "AvailableMccDetailsViewModel.kt", l = {147}, m = "invokeSuspend")
    /* renamed from: yn.a$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f171501a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18334a.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f171501a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = C18334a.this._effectsFlow;
                AbstractC2761a.c cVar = AbstractC2761a.c.f171482a;
                this.f171501a = 1;
                if (interfaceC16548A.emit(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.viewmodel.meijercreditcard.AvailableMccDetailsViewModel$onSubmitMccDetails$2", f = "AvailableMccDetailsViewModel.kt", l = {58, 67}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: yn.a$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f171503a;

        /* renamed from: b, reason: collision with root package name */
        Object f171504b;

        /* renamed from: c, reason: collision with root package name */
        Object f171505c;

        /* renamed from: d, reason: collision with root package name */
        Object f171506d;

        /* renamed from: e, reason: collision with root package name */
        int f171507e;

        /* renamed from: f, reason: collision with root package name */
        int f171508f;

        /* renamed from: g, reason: collision with root package name */
        int f171509g;

        /* renamed from: h, reason: collision with root package name */
        int f171510h;

        /* renamed from: i, reason: collision with root package name */
        int f171511i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f171512j;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = C18334a.this.new g(continuation);
            gVar.f171512j = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            throw new UnsupportedOperationException("Method not decompiled: yn.C18334a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.viewmodel.meijercreditcard.AvailableMccDetailsViewModel$optIntoMeijerCreditCardRewards$1$1", f = "AvailableMccDetailsViewModel.kt", l = {82, 90}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: yn.a$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f171514a;

        /* renamed from: b, reason: collision with root package name */
        Object f171515b;

        /* renamed from: c, reason: collision with root package name */
        Object f171516c;

        /* renamed from: d, reason: collision with root package name */
        Object f171517d;

        /* renamed from: e, reason: collision with root package name */
        int f171518e;

        /* renamed from: f, reason: collision with root package name */
        int f171519f;

        /* renamed from: g, reason: collision with root package name */
        int f171520g;

        /* renamed from: h, reason: collision with root package name */
        int f171521h;

        /* renamed from: i, reason: collision with root package name */
        boolean f171522i;

        /* renamed from: j, reason: collision with root package name */
        int f171523j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f171524k;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ViewState f171526m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f171527n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ViewState viewState, long j10, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f171526m = viewState;
            this.f171527n = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = C18334a.this.new h(this.f171526m, this.f171527n, continuation);
            hVar.f171524k = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            throw new UnsupportedOperationException("Method not decompiled: yn.C18334a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C18334a(C6282a rewardsRepository, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.rewardsRepository = rewardsRepository;
        this.analyticsEngine = analyticsEngine;
        InterfaceC16549B<ViewState> interfaceC16549BA = S.a(new ViewState(null, null, null, null, false, false, null, null, l3.f93323c, null));
        this._viewStateFlow = interfaceC16549BA;
        this.viewStateFlow = C16563h.c(interfaceC16549BA);
        InterfaceC16548A<AbstractC2761a> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._effectsFlow = interfaceC16548AB;
        this.effectsFlow = C16563h.b(interfaceC16548AB);
    }

    private final void t() {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewStateFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, null, null, false, false, null, new a.Loading(null, null, 3, null), 31, null)));
        C15809k.d(d0.a(this), null, null, new g(null), 3, null);
        this.analyticsEngine.h(C14756c.a("event: mperks: rewards: mcard: sign up for DR submit"), C14756c.c("mperks: rewards: mcard"), C14756c.g("mperks"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(long termsID) {
        C15809k.d(d0.a(this), null, null, new h(this.viewStateFlow.getValue(), termsID, null), 3, null);
    }

    public final InterfaceC16553F<AbstractC2761a> q() {
        return this.effectsFlow;
    }

    public final P<ViewState> r() {
        return this.viewStateFlow;
    }

    public final void s(AbstractC18200a action) {
        ViewState value;
        ViewState value2;
        ViewState value3;
        ViewState value4;
        ViewState value5;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC18200a.AcceptTermsAndConditions) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewStateFlow;
            do {
                value5 = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value5, ViewState.b(value5, null, null, null, null, ((AbstractC18200a.AcceptTermsAndConditions) action).getAccepted(), false, null, null, 239, null)));
            return;
        }
        if (Intrinsics.e(action, AbstractC18200a.b.f170877a)) {
            C15809k.d(d0.a(this), null, null, new c(null), 3, null);
            return;
        }
        if (action instanceof AbstractC18200a.CallHelpLine) {
            C15809k.d(d0.a(this), null, null, new d(action, null), 3, null);
            return;
        }
        if (Intrinsics.e(action, AbstractC18200a.d.f170879a)) {
            C15809k.d(d0.a(this), null, null, new e(null), 3, null);
            return;
        }
        if (Intrinsics.e(action, AbstractC18200a.f.f170881a)) {
            t();
            return;
        }
        if (action instanceof AbstractC18200a.UpdateDateOfBirth) {
            InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewStateFlow;
            do {
                value4 = interfaceC16549B2.getValue();
            } while (!interfaceC16549B2.e(value4, ViewState.b(value4, null, null, ((AbstractC18200a.UpdateDateOfBirth) action).getDate(), null, false, false, null, null, 251, null)));
            return;
        }
        if (action instanceof AbstractC18200a.UpdateFirstName) {
            InterfaceC16549B<ViewState> interfaceC16549B3 = this._viewStateFlow;
            do {
                value3 = interfaceC16549B3.getValue();
            } while (!interfaceC16549B3.e(value3, ViewState.b(value3, ((AbstractC18200a.UpdateFirstName) action).getValue(), null, null, null, false, false, null, null, 254, null)));
            return;
        }
        if (action instanceof AbstractC18200a.UpdateLastFourDigits) {
            InterfaceC16549B<ViewState> interfaceC16549B4 = this._viewStateFlow;
            do {
                value2 = interfaceC16549B4.getValue();
            } while (!interfaceC16549B4.e(value2, ViewState.b(value2, null, null, null, ((AbstractC18200a.UpdateLastFourDigits) action).getValue(), false, false, null, null, 247, null)));
        } else if (action instanceof AbstractC18200a.UpdateLastName) {
            InterfaceC16549B<ViewState> interfaceC16549B5 = this._viewStateFlow;
            do {
                value = interfaceC16549B5.getValue();
            } while (!interfaceC16549B5.e(value, ViewState.b(value, null, ((AbstractC18200a.UpdateLastName) action).getValue(), null, null, false, false, null, null, 253, null)));
        } else {
            if (!(action instanceof AbstractC18200a.ErrorMessageClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            if (StringsKt.b0(((AbstractC18200a.ErrorMessageClicked) action).getUrl(), "primaryAccount", true)) {
                C15809k.d(d0.a(this), null, null, new f(null), 3, null);
            }
        }
    }
}
