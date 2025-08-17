package com.meijer.mobile.accounts.ux.profile;

import Cs.MeijerAccount;
import Dh.CustomerPreference;
import Dh.PasswordChangeInfo;
import Dh.Preference;
import Dh.ProfileInformation;
import Dh.UpdateAccountInformationResponse;
import Dh.UpdateBasicInfoResponse;
import Dh.UpdateConfirmationResponse;
import Dh.UpdateOrderPreferencesResponse;
import Dh.VehicleDescriptionChangeInfo;
import Dh.VehicleInformation;
import Eh.DiscretePreferenceChoice;
import Hk.Validation;
import Ih.x;
import Ih.z;
import Oj.a;
import Qh.w0;
import Xh.AccountInformationDecorator;
import Xh.BasicInformationDecorator;
import Xh.MperksInformationDecorator;
import Xh.OrderPreferencesDecorator;
import Xh.YourMeijerStoreCardDecorator;
import Zh.a;
import Zh.e;
import ak.AbstractC5607a;
import ak.C5608b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.c0;
import androidx.view.d0;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.accounts.ux.profile.p;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17153g;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u008e\u00012\u00020\u0001:\u0003\u007fy{B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010!\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b&\u0010$J\u001c\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\f0\u001eH\u0082@¢\u0006\u0004\b(\u0010$J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0082@¢\u0006\u0004\b)\u0010$J-\u0010.\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u00142\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b.\u0010/J#\u00101\u001a\u00020\u000f2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\f0\u001eH\u0002¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u00020\u000f2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u001eH\u0002¢\u0006\u0004\b5\u00102J&\u00108\u001a\b\u0012\u0004\u0012\u0002030\u001e2\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020+H\u0082@¢\u0006\u0004\b8\u00109J$\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\f0\u001e2\u0006\u0010:\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000fH\u0002¢\u0006\u0004\b=\u0010\u0013J\u001f\u0010@\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020+H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000fH\u0002¢\u0006\u0004\bB\u0010\u0013J!\u0010E\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020+2\b\b\u0002\u0010D\u001a\u00020\u0014H\u0002¢\u0006\u0004\bE\u0010FJ%\u0010I\u001a\u00020\u000f\"\f\b\u0000\u00101*\u0006\u0012\u0002\b\u00030G2\u0006\u0010H\u001a\u00028\u0000H\u0002¢\u0006\u0004\bI\u0010JJ%\u0010L\u001a\u00020\u000f\"\f\b\u0000\u00101*\u0006\u0012\u0002\b\u00030K2\u0006\u0010H\u001a\u00028\u0000H\u0002¢\u0006\u0004\bL\u0010MJ\u0013\u0010O\u001a\u00020\u0014*\u00020NH\u0002¢\u0006\u0004\bO\u0010PJ%\u0010R\u001a\u00020\u000f\"\f\b\u0000\u00101*\u0006\u0012\u0002\b\u00030Q2\u0006\u0010H\u001a\u00028\u0000H\u0002¢\u0006\u0004\bR\u0010SJ\u0013\u0010U\u001a\u00020\u0014*\u00020TH\u0002¢\u0006\u0004\bU\u0010VJ\u0013\u0010W\u001a\u00020\u0014*\u00020TH\u0002¢\u0006\u0004\bW\u0010VJ%\u0010Y\u001a\u00020\u000f\"\f\b\u0000\u00101*\u0006\u0012\u0002\b\u00030X2\u0006\u0010H\u001a\u00028\u0000H\u0002¢\u0006\u0004\bY\u0010ZJ\u0013\u0010\\\u001a\u00020\u0014*\u00020[H\u0002¢\u0006\u0004\b\\\u0010]J%\u0010_\u001a\u00020\u000f\"\f\b\u0000\u00101*\u0006\u0012\u0002\b\u00030^2\u0006\u0010H\u001a\u00028\u0000H\u0002¢\u0006\u0004\b_\u0010`J\u0013\u0010b\u001a\u00020\u0014*\u00020aH\u0002¢\u0006\u0004\bb\u0010cJ\u0017\u0010f\u001a\u00020\u000f2\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bf\u0010gJ\u001f\u0010j\u001a\u00020\u000f2\u0006\u0010h\u001a\u00020\u00142\u0006\u0010i\u001a\u00020\u0014H\u0002¢\u0006\u0004\bj\u0010kJ\u001f\u0010m\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020+2\u0006\u0010l\u001a\u00020+H\u0002¢\u0006\u0004\bm\u0010AJ\u001d\u0010p\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020\u00142\u0006\u0010o\u001a\u00020\u0014¢\u0006\u0004\bp\u0010kJ\u0015\u0010s\u001a\u00020\u000f2\u0006\u0010r\u001a\u00020q¢\u0006\u0004\bs\u0010tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020~0}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R#\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020~0\u0082\u00018\u0006¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001d\u0010\u008d\u0001\u001a\u00030\u0088\u00018\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l;", "Landroidx/lifecycle/c0;", "LBh/e;", "profileRepository", "LBh/d;", "preferencesRepository", "LBh/c;", "accountsAMSRepository", "Lyl/k;", "featureManager", "<init>", "(LBh/e;LBh/d;LBh/c;Lyl/k;)V", "", "LOj/a;", "loadingStates", "", "onLoadingStates", "(Ljava/util/List;)V", "G", "()V", "", "isFailure", "Lak/a;", "L", "(Z)Lak/a;", "LDh/v;", "profileInformation", "accountResultFailureMessage", "customerPreferencesFailureMessage", "vehicleInformationFailureMessage", "Lkotlin/Result;", "LDh/o;", "quickID", "a0", "(LDh/v;Lak/a;Lak/a;Lak/a;Ljava/lang/Object;)V", "J", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "K", "F", "LEh/b;", "I", "H", "isQuickIDEnabled", "", "newPin", "currentPin", "W", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "quickIDResponse", "T", "(Ljava/lang/Object;)V", "LDh/C;", "mperksResponse", "S", "updatedCurrentPin", "updatedNewPin", "d0", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEnabled", "e0", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c0", "currentPassword", "newPassword", "b0", "(Ljava/lang/String;Ljava/lang/String;)V", "f0", "email", "isResendEmail", "X", "(Ljava/lang/String;Z)V", "LZj/a;", "formField", "j0", "(LZj/a;)V", "LZh/b;", "h0", "(LZh/b;)V", "LXh/b;", "O", "(LXh/b;)Z", "LZh/d;", "k0", "(LZh/d;)V", "LXh/d;", "P", "(LXh/d;)Z", "U", "LZh/e;", "l0", "(LZh/e;)V", "LXh/e;", "Q", "(LXh/e;)Z", "LZh/a;", "g0", "(LZh/a;)V", "LXh/a;", "N", "(LXh/a;)Z", "Lcom/meijer/mobile/accounts/ux/profile/p;", "screen", "V", "(Lcom/meijer/mobile/accounts/ux/profile/p;)V", "isPhoneConflictError", "isMperksPinError", "E", "(ZZ)V", "confirmPassword", "i0", "isFromPaymentsScreen", "isEditBasicInfo", "Z", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "action", "R", "(Lcom/meijer/mobile/accounts/ux/profile/l$c;)V", "a", "LBh/e;", "b", "LBh/d;", "c", "LBh/c;", "d", "Lyl/k;", "Ltv/B;", "Lcom/meijer/mobile/accounts/ux/profile/l$e;", "e", "Ltv/B;", "_profileState", "Ltv/P;", "f", "Ltv/P;", "M", "()Ltv/P;", "profileState", "LOj/c;", "g", "LOj/c;", "getLoadingStatesManager", "()LOj/c;", "loadingStatesManager", "h", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class l extends c0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f94740i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bh.e profileRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bh.d preferencesRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Bh.c accountsAMSRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ProfileScreenViewState> _profileState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<ProfileScreenViewState> profileState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Oj.c loadingStatesManager;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends AdaptedFunctionReference implements Function2<List<? extends Oj.a>, Continuation<? super Unit>, Object>, SuspendFunction {
        a(Object obj) {
            super(2, obj, l.class, "onLoadingStates", "onLoadingStates(Ljava/util/List;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends Oj.a> list, Continuation<? super Unit> continuation) {
            return l.m((l) this.f142801a, list, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltv/g;", "", "LOj/a;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$2", f = "ProfileScreenViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function3<InterfaceC17153g<? super List<? extends Oj.a>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f94748a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f94749b;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super List<? extends Oj.a>> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(continuation);
            bVar.f94749b = th2;
            return bVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f94748a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.f((Throwable) this.f94749b, "Caught exception on loadingStateStream", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c;", "", "<init>", "()V", "a", "c", "b", "d", "m", "j", "i", "k", "o", "l", "n", "f", "e", "g", "h", "Lcom/meijer/mobile/accounts/ux/profile/l$c$a;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$b;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$c;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$d;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$e;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$f;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$g;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$h;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$i;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$j;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$k;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$l;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$m;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$n;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$o;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$a;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f94750a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1026359271;
            }

            public String toString() {
                return "CloseModal";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$b;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f94751a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1750693816;
            }

            public String toString() {
                return "CloseSuccessNotification";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$c;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "", "isPhoneConflictError", "isMperksPinUpdateError", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$c$c, reason: collision with other inner class name and from toString */
        public static final /* data */ class DismissErrorNotification extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isPhoneConflictError;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isMperksPinUpdateError;

            public DismissErrorNotification(boolean z10, boolean z11) {
                super(null);
                this.isPhoneConflictError = z10;
                this.isMperksPinUpdateError = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DismissErrorNotification)) {
                    return false;
                }
                DismissErrorNotification dismissErrorNotification = (DismissErrorNotification) other;
                return this.isPhoneConflictError == dismissErrorNotification.isPhoneConflictError && this.isMperksPinUpdateError == dismissErrorNotification.isMperksPinUpdateError;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isPhoneConflictError) * 31) + Boolean.hashCode(this.isMperksPinUpdateError);
            }

            public String toString() {
                return "DismissErrorNotification(isPhoneConflictError=" + this.isPhoneConflictError + ", isMperksPinUpdateError=" + this.isMperksPinUpdateError + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsMperksPinUpdateError() {
                return this.isMperksPinUpdateError;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsPhoneConflictError() {
                return this.isPhoneConflictError;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$d;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "Lcom/meijer/mobile/accounts/ux/profile/p;", "screen", "<init>", "(Lcom/meijer/mobile/accounts/ux/profile/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/accounts/ux/profile/p;", "()Lcom/meijer/mobile/accounts/ux/profile/p;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$c$d, reason: from toString */
        public static final /* data */ class OnEditClick extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final com.meijer.mobile.accounts.ux.profile.p screen;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnEditClick) && Intrinsics.e(this.screen, ((OnEditClick) other).screen);
            }

            public int hashCode() {
                return this.screen.hashCode();
            }

            public String toString() {
                return "OnEditClick(screen=" + this.screen + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnEditClick(com.meijer.mobile.accounts.ux.profile.p screen) {
                super(null);
                Intrinsics.j(screen, "screen");
                this.screen = screen;
            }

            /* renamed from: a, reason: from getter */
            public final com.meijer.mobile.accounts.ux.profile.p getScreen() {
                return this.screen;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$e;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final e f94755a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return 968107071;
            }

            public String toString() {
                return "OnExpandPasswordFields";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$f;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class f extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final f f94756a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return 527022425;
            }

            public String toString() {
                return "OnForgotPasswordClick";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$g;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "LZj/a;", "field", "<init>", "(LZj/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LZj/a;", "()LZj/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$c$g, reason: from toString */
        public static final /* data */ class OnFormFieldChange extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Zj.a<?> field;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnFormFieldChange) && Intrinsics.e(this.field, ((OnFormFieldChange) other).field);
            }

            public int hashCode() {
                return this.field.hashCode();
            }

            public String toString() {
                return "OnFormFieldChange(field=" + this.field + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnFormFieldChange(Zj.a<?> field) {
                super(null);
                Intrinsics.j(field, "field");
                this.field = field;
            }

            public final Zj.a<?> a() {
                return this.field;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$h;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "", "isEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$c$h, reason: from toString */
        public static final /* data */ class OnQuickIDChange extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isEnabled;

            public OnQuickIDChange(boolean z10) {
                super(null);
                this.isEnabled = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnQuickIDChange) && this.isEnabled == ((OnQuickIDChange) other).isEnabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isEnabled);
            }

            public String toString() {
                return "OnQuickIDChange(isEnabled=" + this.isEnabled + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$i;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "", "email", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$c$i, reason: from toString */
        public static final /* data */ class ResendEmail extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String email;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ResendEmail) && Intrinsics.e(this.email, ((ResendEmail) other).email);
            }

            public int hashCode() {
                return this.email.hashCode();
            }

            public String toString() {
                return "ResendEmail(email=" + this.email + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ResendEmail(String email) {
                super(null);
                Intrinsics.j(email, "email");
                this.email = email;
            }

            /* renamed from: a, reason: from getter */
            public final String getEmail() {
                return this.email;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$j;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "", "email", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$c$j, reason: from toString */
        public static final /* data */ class SendEmail extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String email;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendEmail) && Intrinsics.e(this.email, ((SendEmail) other).email);
            }

            public int hashCode() {
                return this.email.hashCode();
            }

            public String toString() {
                return "SendEmail(email=" + this.email + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendEmail(String email) {
                super(null);
                Intrinsics.j(email, "email");
                this.email = email;
            }

            /* renamed from: a, reason: from getter */
            public final String getEmail() {
                return this.email;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$k;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "", "currentPassword", "newPassword", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$c$k, reason: from toString */
        public static final /* data */ class UpdateAccountInfo extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String currentPassword;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String newPassword;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateAccountInfo)) {
                    return false;
                }
                UpdateAccountInfo updateAccountInfo = (UpdateAccountInfo) other;
                return Intrinsics.e(this.currentPassword, updateAccountInfo.currentPassword) && Intrinsics.e(this.newPassword, updateAccountInfo.newPassword);
            }

            public int hashCode() {
                return (this.currentPassword.hashCode() * 31) + this.newPassword.hashCode();
            }

            public String toString() {
                return "UpdateAccountInfo(currentPassword=" + this.currentPassword + ", newPassword=" + this.newPassword + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateAccountInfo(String currentPassword, String newPassword) {
                super(null);
                Intrinsics.j(currentPassword, "currentPassword");
                Intrinsics.j(newPassword, "newPassword");
                this.currentPassword = currentPassword;
                this.newPassword = newPassword;
            }

            /* renamed from: a, reason: from getter */
            public final String getCurrentPassword() {
                return this.currentPassword;
            }

            /* renamed from: b, reason: from getter */
            public final String getNewPassword() {
                return this.newPassword;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$l;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$c$l, reason: collision with other inner class name */
        public static final /* data */ class C1345l extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final C1345l f94763a = new C1345l();

            private C1345l() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1345l);
            }

            public int hashCode() {
                return -329962975;
            }

            public String toString() {
                return "UpdateBasicInfo";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$m;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "", "isQuickIDEnabled", "", "newPin", "currentPin", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "b", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$c$m, reason: from toString */
        public static final /* data */ class UpdateMperksInfo extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Boolean isQuickIDEnabled;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String newPin;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String currentPin;

            public UpdateMperksInfo(Boolean bool, String str, String str2) {
                super(null);
                this.isQuickIDEnabled = bool;
                this.newPin = str;
                this.currentPin = str2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateMperksInfo)) {
                    return false;
                }
                UpdateMperksInfo updateMperksInfo = (UpdateMperksInfo) other;
                return Intrinsics.e(this.isQuickIDEnabled, updateMperksInfo.isQuickIDEnabled) && Intrinsics.e(this.newPin, updateMperksInfo.newPin) && Intrinsics.e(this.currentPin, updateMperksInfo.currentPin);
            }

            public int hashCode() {
                Boolean bool = this.isQuickIDEnabled;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                String str = this.newPin;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.currentPin;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "UpdateMperksInfo(isQuickIDEnabled=" + this.isQuickIDEnabled + ", newPin=" + this.newPin + ", currentPin=" + this.currentPin + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getCurrentPin() {
                return this.currentPin;
            }

            /* renamed from: b, reason: from getter */
            public final String getNewPin() {
                return this.newPin;
            }

            /* renamed from: c, reason: from getter */
            public final Boolean getIsQuickIDEnabled() {
                return this.isQuickIDEnabled;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$n;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class n extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final n f94767a = new n();

            private n() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof n);
            }

            public int hashCode() {
                return 136231685;
            }

            public String toString() {
                return "UpdateOrderPreferences";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$o;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "", "newPassword", "confirmPassword", "", "isFocused", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$c$o, reason: from toString */
        public static final /* data */ class ValidateConfirmPassword extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String newPassword;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String confirmPassword;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isFocused;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ValidateConfirmPassword)) {
                    return false;
                }
                ValidateConfirmPassword validateConfirmPassword = (ValidateConfirmPassword) other;
                return Intrinsics.e(this.newPassword, validateConfirmPassword.newPassword) && Intrinsics.e(this.confirmPassword, validateConfirmPassword.confirmPassword) && this.isFocused == validateConfirmPassword.isFocused;
            }

            public int hashCode() {
                return (((this.newPassword.hashCode() * 31) + this.confirmPassword.hashCode()) * 31) + Boolean.hashCode(this.isFocused);
            }

            public String toString() {
                return "ValidateConfirmPassword(newPassword=" + this.newPassword + ", confirmPassword=" + this.confirmPassword + ", isFocused=" + this.isFocused + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ValidateConfirmPassword(String newPassword, String confirmPassword, boolean z10) {
                super(null);
                Intrinsics.j(newPassword, "newPassword");
                Intrinsics.j(confirmPassword, "confirmPassword");
                this.newPassword = newPassword;
                this.confirmPassword = confirmPassword;
                this.isFocused = z10;
            }

            /* renamed from: a, reason: from getter */
            public final String getConfirmPassword() {
                return this.confirmPassword;
            }

            /* renamed from: b, reason: from getter */
            public final String getNewPassword() {
                return this.newPassword;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getIsFocused() {
                return this.isFocused;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJØ\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b,\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010B\u001a\u0004\bE\u0010DR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bC\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010HR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bI\u0010MR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\bK\u0010HR\u0017\u0010\u0018\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b9\u0010F\u001a\u0004\b4\u0010HR\u0017\u0010\u0019\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b/\u0010F\u001a\u0004\b8\u0010HR\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b>\u0010F\u001a\u0004\b:\u0010HR\u0017\u0010\u001b\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b0\u0010HR\u0017\u0010\u001c\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b@\u0010F\u001a\u0004\bN\u0010HR\u0017\u0010\u001d\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bO\u0010F\u001a\u0004\bO\u0010H¨\u0006P"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$e;", "", "LXh/b;", "savedBasicInformation", "unsavedBasicInformation", "LCs/a;", "originalMeijerAccount", "LXh/a;", "savedAccountInformation", "unsavedAccountInformation", "LXh/d;", "savedMperksInformation", "unsavedMperksInformation", "LXh/f;", "yourMeijerStoreInformation", "LXh/e;", "savedOrderPreferencesInformation", "unsavedOrderPreferencesInformation", "", "isLoading", "showSuccessNotification", "Lcom/meijer/mobile/accounts/ux/profile/p;", "screen", "shouldOpenModal", "hasPendingChangesOnBasicInformation", "hasPendingChangesOnMperksInformation", "hasPendingChangesOnOrderPreferences", "hasPendingChangesOnAccountInformation", "isFromPaymentsScreen", "isEditBasicInfo", "<init>", "(LXh/b;LXh/b;LCs/a;LXh/a;LXh/a;LXh/d;LXh/d;LXh/f;LXh/e;LXh/e;ZZLcom/meijer/mobile/accounts/ux/profile/p;ZZZZZZZ)V", "a", "(LXh/b;LXh/b;LCs/a;LXh/a;LXh/a;LXh/d;LXh/d;LXh/f;LXh/e;LXh/e;ZZLcom/meijer/mobile/accounts/ux/profile/p;ZZZZZZZ)Lcom/meijer/mobile/accounts/ux/profile/l$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LXh/b;", "i", "()LXh/b;", "b", "p", "c", "LCs/a;", "g", "()LCs/a;", "d", "LXh/a;", "h", "()LXh/a;", "e", "o", "f", "LXh/d;", "j", "()LXh/d;", "q", "LXh/f;", "s", "()LXh/f;", "LXh/e;", "k", "()LXh/e;", "r", "Z", "v", "()Z", "l", "n", "m", "Lcom/meijer/mobile/accounts/ux/profile/p;", "()Lcom/meijer/mobile/accounts/ux/profile/p;", "u", "t", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.profile.l$e, reason: from toString */
    public static final /* data */ class ProfileScreenViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BasicInformationDecorator savedBasicInformation;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BasicInformationDecorator unsavedBasicInformation;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final MeijerAccount originalMeijerAccount;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AccountInformationDecorator savedAccountInformation;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AccountInformationDecorator unsavedAccountInformation;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final MperksInformationDecorator savedMperksInformation;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final MperksInformationDecorator unsavedMperksInformation;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final YourMeijerStoreCardDecorator yourMeijerStoreInformation;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final OrderPreferencesDecorator savedOrderPreferencesInformation;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final OrderPreferencesDecorator unsavedOrderPreferencesInformation;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showSuccessNotification;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.meijer.mobile.accounts.ux.profile.p screen;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldOpenModal;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasPendingChangesOnBasicInformation;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasPendingChangesOnMperksInformation;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasPendingChangesOnOrderPreferences;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasPendingChangesOnAccountInformation;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFromPaymentsScreen;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEditBasicInfo;

        public ProfileScreenViewState() {
            this(null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048575, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProfileScreenViewState)) {
                return false;
            }
            ProfileScreenViewState profileScreenViewState = (ProfileScreenViewState) other;
            return Intrinsics.e(this.savedBasicInformation, profileScreenViewState.savedBasicInformation) && Intrinsics.e(this.unsavedBasicInformation, profileScreenViewState.unsavedBasicInformation) && Intrinsics.e(this.originalMeijerAccount, profileScreenViewState.originalMeijerAccount) && Intrinsics.e(this.savedAccountInformation, profileScreenViewState.savedAccountInformation) && Intrinsics.e(this.unsavedAccountInformation, profileScreenViewState.unsavedAccountInformation) && Intrinsics.e(this.savedMperksInformation, profileScreenViewState.savedMperksInformation) && Intrinsics.e(this.unsavedMperksInformation, profileScreenViewState.unsavedMperksInformation) && Intrinsics.e(this.yourMeijerStoreInformation, profileScreenViewState.yourMeijerStoreInformation) && Intrinsics.e(this.savedOrderPreferencesInformation, profileScreenViewState.savedOrderPreferencesInformation) && Intrinsics.e(this.unsavedOrderPreferencesInformation, profileScreenViewState.unsavedOrderPreferencesInformation) && this.isLoading == profileScreenViewState.isLoading && this.showSuccessNotification == profileScreenViewState.showSuccessNotification && Intrinsics.e(this.screen, profileScreenViewState.screen) && this.shouldOpenModal == profileScreenViewState.shouldOpenModal && this.hasPendingChangesOnBasicInformation == profileScreenViewState.hasPendingChangesOnBasicInformation && this.hasPendingChangesOnMperksInformation == profileScreenViewState.hasPendingChangesOnMperksInformation && this.hasPendingChangesOnOrderPreferences == profileScreenViewState.hasPendingChangesOnOrderPreferences && this.hasPendingChangesOnAccountInformation == profileScreenViewState.hasPendingChangesOnAccountInformation && this.isFromPaymentsScreen == profileScreenViewState.isFromPaymentsScreen && this.isEditBasicInfo == profileScreenViewState.isEditBasicInfo;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((this.savedBasicInformation.hashCode() * 31) + this.unsavedBasicInformation.hashCode()) * 31) + this.originalMeijerAccount.hashCode()) * 31) + this.savedAccountInformation.hashCode()) * 31) + this.unsavedAccountInformation.hashCode()) * 31) + this.savedMperksInformation.hashCode()) * 31) + this.unsavedMperksInformation.hashCode()) * 31) + this.yourMeijerStoreInformation.hashCode()) * 31) + this.savedOrderPreferencesInformation.hashCode()) * 31) + this.unsavedOrderPreferencesInformation.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.showSuccessNotification)) * 31) + this.screen.hashCode()) * 31) + Boolean.hashCode(this.shouldOpenModal)) * 31) + Boolean.hashCode(this.hasPendingChangesOnBasicInformation)) * 31) + Boolean.hashCode(this.hasPendingChangesOnMperksInformation)) * 31) + Boolean.hashCode(this.hasPendingChangesOnOrderPreferences)) * 31) + Boolean.hashCode(this.hasPendingChangesOnAccountInformation)) * 31) + Boolean.hashCode(this.isFromPaymentsScreen)) * 31) + Boolean.hashCode(this.isEditBasicInfo);
        }

        public String toString() {
            return "ProfileScreenViewState(savedBasicInformation=" + this.savedBasicInformation + ", unsavedBasicInformation=" + this.unsavedBasicInformation + ", originalMeijerAccount=" + this.originalMeijerAccount + ", savedAccountInformation=" + this.savedAccountInformation + ", unsavedAccountInformation=" + this.unsavedAccountInformation + ", savedMperksInformation=" + this.savedMperksInformation + ", unsavedMperksInformation=" + this.unsavedMperksInformation + ", yourMeijerStoreInformation=" + this.yourMeijerStoreInformation + ", savedOrderPreferencesInformation=" + this.savedOrderPreferencesInformation + ", unsavedOrderPreferencesInformation=" + this.unsavedOrderPreferencesInformation + ", isLoading=" + this.isLoading + ", showSuccessNotification=" + this.showSuccessNotification + ", screen=" + this.screen + ", shouldOpenModal=" + this.shouldOpenModal + ", hasPendingChangesOnBasicInformation=" + this.hasPendingChangesOnBasicInformation + ", hasPendingChangesOnMperksInformation=" + this.hasPendingChangesOnMperksInformation + ", hasPendingChangesOnOrderPreferences=" + this.hasPendingChangesOnOrderPreferences + ", hasPendingChangesOnAccountInformation=" + this.hasPendingChangesOnAccountInformation + ", isFromPaymentsScreen=" + this.isFromPaymentsScreen + ", isEditBasicInfo=" + this.isEditBasicInfo + ')';
        }

        public ProfileScreenViewState(BasicInformationDecorator savedBasicInformation, BasicInformationDecorator unsavedBasicInformation, MeijerAccount originalMeijerAccount, AccountInformationDecorator savedAccountInformation, AccountInformationDecorator unsavedAccountInformation, MperksInformationDecorator savedMperksInformation, MperksInformationDecorator unsavedMperksInformation, YourMeijerStoreCardDecorator yourMeijerStoreInformation, OrderPreferencesDecorator savedOrderPreferencesInformation, OrderPreferencesDecorator unsavedOrderPreferencesInformation, boolean z10, boolean z11, com.meijer.mobile.accounts.ux.profile.p screen, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
            Intrinsics.j(savedBasicInformation, "savedBasicInformation");
            Intrinsics.j(unsavedBasicInformation, "unsavedBasicInformation");
            Intrinsics.j(originalMeijerAccount, "originalMeijerAccount");
            Intrinsics.j(savedAccountInformation, "savedAccountInformation");
            Intrinsics.j(unsavedAccountInformation, "unsavedAccountInformation");
            Intrinsics.j(savedMperksInformation, "savedMperksInformation");
            Intrinsics.j(unsavedMperksInformation, "unsavedMperksInformation");
            Intrinsics.j(yourMeijerStoreInformation, "yourMeijerStoreInformation");
            Intrinsics.j(savedOrderPreferencesInformation, "savedOrderPreferencesInformation");
            Intrinsics.j(unsavedOrderPreferencesInformation, "unsavedOrderPreferencesInformation");
            Intrinsics.j(screen, "screen");
            this.savedBasicInformation = savedBasicInformation;
            this.unsavedBasicInformation = unsavedBasicInformation;
            this.originalMeijerAccount = originalMeijerAccount;
            this.savedAccountInformation = savedAccountInformation;
            this.unsavedAccountInformation = unsavedAccountInformation;
            this.savedMperksInformation = savedMperksInformation;
            this.unsavedMperksInformation = unsavedMperksInformation;
            this.yourMeijerStoreInformation = yourMeijerStoreInformation;
            this.savedOrderPreferencesInformation = savedOrderPreferencesInformation;
            this.unsavedOrderPreferencesInformation = unsavedOrderPreferencesInformation;
            this.isLoading = z10;
            this.showSuccessNotification = z11;
            this.screen = screen;
            this.shouldOpenModal = z12;
            this.hasPendingChangesOnBasicInformation = z13;
            this.hasPendingChangesOnMperksInformation = z14;
            this.hasPendingChangesOnOrderPreferences = z15;
            this.hasPendingChangesOnAccountInformation = z16;
            this.isFromPaymentsScreen = z17;
            this.isEditBasicInfo = z18;
        }

        public static /* synthetic */ ProfileScreenViewState b(ProfileScreenViewState profileScreenViewState, BasicInformationDecorator basicInformationDecorator, BasicInformationDecorator basicInformationDecorator2, MeijerAccount meijerAccount, AccountInformationDecorator accountInformationDecorator, AccountInformationDecorator accountInformationDecorator2, MperksInformationDecorator mperksInformationDecorator, MperksInformationDecorator mperksInformationDecorator2, YourMeijerStoreCardDecorator yourMeijerStoreCardDecorator, OrderPreferencesDecorator orderPreferencesDecorator, OrderPreferencesDecorator orderPreferencesDecorator2, boolean z10, boolean z11, com.meijer.mobile.accounts.ux.profile.p pVar, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i10, Object obj) {
            boolean z19;
            boolean z20;
            BasicInformationDecorator basicInformationDecorator3 = (i10 & 1) != 0 ? profileScreenViewState.savedBasicInformation : basicInformationDecorator;
            BasicInformationDecorator basicInformationDecorator4 = (i10 & 2) != 0 ? profileScreenViewState.unsavedBasicInformation : basicInformationDecorator2;
            MeijerAccount meijerAccount2 = (i10 & 4) != 0 ? profileScreenViewState.originalMeijerAccount : meijerAccount;
            AccountInformationDecorator accountInformationDecorator3 = (i10 & 8) != 0 ? profileScreenViewState.savedAccountInformation : accountInformationDecorator;
            AccountInformationDecorator accountInformationDecorator4 = (i10 & 16) != 0 ? profileScreenViewState.unsavedAccountInformation : accountInformationDecorator2;
            MperksInformationDecorator mperksInformationDecorator3 = (i10 & 32) != 0 ? profileScreenViewState.savedMperksInformation : mperksInformationDecorator;
            MperksInformationDecorator mperksInformationDecorator4 = (i10 & 64) != 0 ? profileScreenViewState.unsavedMperksInformation : mperksInformationDecorator2;
            YourMeijerStoreCardDecorator yourMeijerStoreCardDecorator2 = (i10 & 128) != 0 ? profileScreenViewState.yourMeijerStoreInformation : yourMeijerStoreCardDecorator;
            OrderPreferencesDecorator orderPreferencesDecorator3 = (i10 & 256) != 0 ? profileScreenViewState.savedOrderPreferencesInformation : orderPreferencesDecorator;
            OrderPreferencesDecorator orderPreferencesDecorator4 = (i10 & 512) != 0 ? profileScreenViewState.unsavedOrderPreferencesInformation : orderPreferencesDecorator2;
            boolean z21 = (i10 & 1024) != 0 ? profileScreenViewState.isLoading : z10;
            boolean z22 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? profileScreenViewState.showSuccessNotification : z11;
            com.meijer.mobile.accounts.ux.profile.p pVar2 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? profileScreenViewState.screen : pVar;
            boolean z23 = (i10 & 8192) != 0 ? profileScreenViewState.shouldOpenModal : z12;
            BasicInformationDecorator basicInformationDecorator5 = basicInformationDecorator3;
            boolean z24 = (i10 & 16384) != 0 ? profileScreenViewState.hasPendingChangesOnBasicInformation : z13;
            boolean z25 = (i10 & 32768) != 0 ? profileScreenViewState.hasPendingChangesOnMperksInformation : z14;
            boolean z26 = (i10 & 65536) != 0 ? profileScreenViewState.hasPendingChangesOnOrderPreferences : z15;
            boolean z27 = (i10 & 131072) != 0 ? profileScreenViewState.hasPendingChangesOnAccountInformation : z16;
            boolean z28 = (i10 & 262144) != 0 ? profileScreenViewState.isFromPaymentsScreen : z17;
            if ((i10 & 524288) != 0) {
                z20 = z28;
                z19 = profileScreenViewState.isEditBasicInfo;
            } else {
                z19 = z18;
                z20 = z28;
            }
            return profileScreenViewState.a(basicInformationDecorator5, basicInformationDecorator4, meijerAccount2, accountInformationDecorator3, accountInformationDecorator4, mperksInformationDecorator3, mperksInformationDecorator4, yourMeijerStoreCardDecorator2, orderPreferencesDecorator3, orderPreferencesDecorator4, z21, z22, pVar2, z23, z24, z25, z26, z27, z20, z19);
        }

        public final ProfileScreenViewState a(BasicInformationDecorator savedBasicInformation, BasicInformationDecorator unsavedBasicInformation, MeijerAccount originalMeijerAccount, AccountInformationDecorator savedAccountInformation, AccountInformationDecorator unsavedAccountInformation, MperksInformationDecorator savedMperksInformation, MperksInformationDecorator unsavedMperksInformation, YourMeijerStoreCardDecorator yourMeijerStoreInformation, OrderPreferencesDecorator savedOrderPreferencesInformation, OrderPreferencesDecorator unsavedOrderPreferencesInformation, boolean isLoading, boolean showSuccessNotification, com.meijer.mobile.accounts.ux.profile.p screen, boolean shouldOpenModal, boolean hasPendingChangesOnBasicInformation, boolean hasPendingChangesOnMperksInformation, boolean hasPendingChangesOnOrderPreferences, boolean hasPendingChangesOnAccountInformation, boolean isFromPaymentsScreen, boolean isEditBasicInfo) {
            Intrinsics.j(savedBasicInformation, "savedBasicInformation");
            Intrinsics.j(unsavedBasicInformation, "unsavedBasicInformation");
            Intrinsics.j(originalMeijerAccount, "originalMeijerAccount");
            Intrinsics.j(savedAccountInformation, "savedAccountInformation");
            Intrinsics.j(unsavedAccountInformation, "unsavedAccountInformation");
            Intrinsics.j(savedMperksInformation, "savedMperksInformation");
            Intrinsics.j(unsavedMperksInformation, "unsavedMperksInformation");
            Intrinsics.j(yourMeijerStoreInformation, "yourMeijerStoreInformation");
            Intrinsics.j(savedOrderPreferencesInformation, "savedOrderPreferencesInformation");
            Intrinsics.j(unsavedOrderPreferencesInformation, "unsavedOrderPreferencesInformation");
            Intrinsics.j(screen, "screen");
            return new ProfileScreenViewState(savedBasicInformation, unsavedBasicInformation, originalMeijerAccount, savedAccountInformation, unsavedAccountInformation, savedMperksInformation, unsavedMperksInformation, yourMeijerStoreInformation, savedOrderPreferencesInformation, unsavedOrderPreferencesInformation, isLoading, showSuccessNotification, screen, shouldOpenModal, hasPendingChangesOnBasicInformation, hasPendingChangesOnMperksInformation, hasPendingChangesOnOrderPreferences, hasPendingChangesOnAccountInformation, isFromPaymentsScreen, isEditBasicInfo);
        }

        /* renamed from: c, reason: from getter */
        public final boolean getHasPendingChangesOnAccountInformation() {
            return this.hasPendingChangesOnAccountInformation;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getHasPendingChangesOnBasicInformation() {
            return this.hasPendingChangesOnBasicInformation;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getHasPendingChangesOnMperksInformation() {
            return this.hasPendingChangesOnMperksInformation;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getHasPendingChangesOnOrderPreferences() {
            return this.hasPendingChangesOnOrderPreferences;
        }

        /* renamed from: g, reason: from getter */
        public final MeijerAccount getOriginalMeijerAccount() {
            return this.originalMeijerAccount;
        }

        /* renamed from: h, reason: from getter */
        public final AccountInformationDecorator getSavedAccountInformation() {
            return this.savedAccountInformation;
        }

        /* renamed from: i, reason: from getter */
        public final BasicInformationDecorator getSavedBasicInformation() {
            return this.savedBasicInformation;
        }

        /* renamed from: j, reason: from getter */
        public final MperksInformationDecorator getSavedMperksInformation() {
            return this.savedMperksInformation;
        }

        /* renamed from: k, reason: from getter */
        public final OrderPreferencesDecorator getSavedOrderPreferencesInformation() {
            return this.savedOrderPreferencesInformation;
        }

        /* renamed from: l, reason: from getter */
        public final com.meijer.mobile.accounts.ux.profile.p getScreen() {
            return this.screen;
        }

        /* renamed from: m, reason: from getter */
        public final boolean getShouldOpenModal() {
            return this.shouldOpenModal;
        }

        /* renamed from: n, reason: from getter */
        public final boolean getShowSuccessNotification() {
            return this.showSuccessNotification;
        }

        /* renamed from: o, reason: from getter */
        public final AccountInformationDecorator getUnsavedAccountInformation() {
            return this.unsavedAccountInformation;
        }

        /* renamed from: p, reason: from getter */
        public final BasicInformationDecorator getUnsavedBasicInformation() {
            return this.unsavedBasicInformation;
        }

        /* renamed from: q, reason: from getter */
        public final MperksInformationDecorator getUnsavedMperksInformation() {
            return this.unsavedMperksInformation;
        }

        /* renamed from: r, reason: from getter */
        public final OrderPreferencesDecorator getUnsavedOrderPreferencesInformation() {
            return this.unsavedOrderPreferencesInformation;
        }

        /* renamed from: s, reason: from getter */
        public final YourMeijerStoreCardDecorator getYourMeijerStoreInformation() {
            return this.yourMeijerStoreInformation;
        }

        /* renamed from: t, reason: from getter */
        public final boolean getIsEditBasicInfo() {
            return this.isEditBasicInfo;
        }

        /* renamed from: u, reason: from getter */
        public final boolean getIsFromPaymentsScreen() {
            return this.isFromPaymentsScreen;
        }

        /* renamed from: v, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public /* synthetic */ ProfileScreenViewState(BasicInformationDecorator basicInformationDecorator, BasicInformationDecorator basicInformationDecorator2, MeijerAccount meijerAccount, AccountInformationDecorator accountInformationDecorator, AccountInformationDecorator accountInformationDecorator2, MperksInformationDecorator mperksInformationDecorator, MperksInformationDecorator mperksInformationDecorator2, YourMeijerStoreCardDecorator yourMeijerStoreCardDecorator, OrderPreferencesDecorator orderPreferencesDecorator, OrderPreferencesDecorator orderPreferencesDecorator2, boolean z10, boolean z11, com.meijer.mobile.accounts.ux.profile.p pVar, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new BasicInformationDecorator(null, null, null, null, null, null, null, null, false, null, null, 2047, null) : basicInformationDecorator, (i10 & 2) != 0 ? new BasicInformationDecorator(null, null, null, null, null, null, null, null, false, null, null, 2047, null) : basicInformationDecorator2, (i10 & 4) != 0 ? new MeijerAccount(0L, null, null, null, null, null, null, null, null, null, null, 0, null, 0L, 0L, null, 0, null, 0L, 0, null, null, null, null, null, null, 0L, 134217727, null) : meijerAccount, (i10 & 8) != 0 ? new AccountInformationDecorator(null, null, null, null, false, null, null, false, null, null, null, null, null, null, 16383, null) : accountInformationDecorator, (i10 & 16) != 0 ? new AccountInformationDecorator(null, null, null, null, false, null, null, false, null, null, null, null, null, null, 16383, null) : accountInformationDecorator2, (i10 & 32) != 0 ? new MperksInformationDecorator(null, null, null, false, false, null, null, l3.f92485d, null) : mperksInformationDecorator, (i10 & 64) != 0 ? new MperksInformationDecorator(null, null, null, false, false, null, null, l3.f92485d, null) : mperksInformationDecorator2, (i10 & 128) != 0 ? new YourMeijerStoreCardDecorator(0, null, null, 7, null) : yourMeijerStoreCardDecorator, (i10 & 256) != 0 ? new OrderPreferencesDecorator(0, null, null, null, null, null, false, l3.f92485d, null) : orderPreferencesDecorator, (i10 & 512) != 0 ? new OrderPreferencesDecorator(0, null, null, null, null, null, false, l3.f92485d, null) : orderPreferencesDecorator2, (i10 & 1024) != 0 ? true : z10, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z11, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? p.b.f94982a : pVar, (i10 & 8192) != 0 ? false : z12, (i10 & 16384) != 0 ? false : z13, (i10 & 32768) != 0 ? false : z14, (i10 & 65536) != 0 ? false : z15, (i10 & 131072) != 0 ? false : z16, (i10 & 262144) != 0 ? false : z17, (i10 & 524288) != 0 ? false : z18);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel", f = "ProfileScreenViewModel.kt", l = {253}, m = "fetchCustomerPreferences")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f94791a;

        /* renamed from: b, reason: collision with root package name */
        Object f94792b;

        /* renamed from: c, reason: collision with root package name */
        Object f94793c;

        /* renamed from: d, reason: collision with root package name */
        Object f94794d;

        /* renamed from: e, reason: collision with root package name */
        Object f94795e;

        /* renamed from: f, reason: collision with root package name */
        int f94796f;

        /* renamed from: g, reason: collision with root package name */
        int f94797g;

        /* renamed from: h, reason: collision with root package name */
        int f94798h;

        /* renamed from: i, reason: collision with root package name */
        int f94799i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f94800j;

        /* renamed from: l, reason: collision with root package name */
        int f94802l;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94800j = obj;
            this.f94802l |= Integer.MIN_VALUE;
            return l.this.F(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$fetchData$1", f = "ProfileScreenViewModel.kt", l = {114, 115, 116, 117, 118, 121, 131}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94803a;

        /* renamed from: b, reason: collision with root package name */
        Object f94804b;

        /* renamed from: c, reason: collision with root package name */
        Object f94805c;

        /* renamed from: d, reason: collision with root package name */
        Object f94806d;

        /* renamed from: e, reason: collision with root package name */
        int f94807e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDh/v;", "profileInformation", "", "<anonymous>", "(LDh/v;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$fetchData$1$2", f = "ProfileScreenViewModel.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<ProfileInformation, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f94809a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f94810b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ l f94811c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f94812d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f94813e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f94814f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f94815g;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f94811c, this.f94812d, this.f94813e, this.f94814f, this.f94815g, continuation);
                aVar.f94810b = obj;
                return aVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, Object obj, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f94811c = lVar;
                this.f94812d = abstractC5607a;
                this.f94813e = abstractC5607a2;
                this.f94814f = abstractC5607a3;
                this.f94815g = obj;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ProfileInformation profileInformation, Continuation<? super Unit> continuation) {
                return ((a) create(profileInformation, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f94809a == 0) {
                    ResultKt.b(obj);
                    this.f94811c.a0((ProfileInformation) this.f94810b, this.f94812d, this.f94813e, this.f94814f, this.f94815g);
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDh/v;", "profileInformation", "", "<anonymous>", "(LDh/v;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$fetchData$1$3", f = "ProfileScreenViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<ProfileInformation, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f94816a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f94817b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ l f94818c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f94819d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f94820e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f94821f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f94822g;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f94818c, this.f94819d, this.f94820e, this.f94821f, this.f94822g, continuation);
                bVar.f94817b = obj;
                return bVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(l lVar, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, Object obj, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f94818c = lVar;
                this.f94819d = abstractC5607a;
                this.f94820e = abstractC5607a2;
                this.f94821f = abstractC5607a3;
                this.f94822g = obj;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ProfileInformation profileInformation, Continuation<? super Unit> continuation) {
                return ((b) create(profileInformation, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f94816a == 0) {
                    ResultKt.b(obj);
                    this.f94818c.a0((ProfileInformation) this.f94817b, this.f94819d, this.f94820e, this.f94821f, this.f94822g);
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return l.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0145, code lost:
        
            if (tv.C17154h.k(r2, r6, r28) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0169, code lost:
        
            if (tv.C17154h.k(r2, r6, r28) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00d2 A[PHI: r2 r3
          0x00d2: PHI (r2v8 ak.a) = (r2v6 ak.a), (r2v11 ak.a) binds: [B:20:0x00ce, B:11:0x0068] A[DONT_GENERATE, DONT_INLINE]
          0x00d2: PHI (r3v5 java.lang.Object) = (r3v4 java.lang.Object), (r3v8 java.lang.Object) binds: [B:20:0x00ce, B:11:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x003b A[PHI: r2 r3 r4 r5
          0x003b: PHI (r2v19 ak.a) = (r2v16 ak.a), (r2v32 ak.a) binds: [B:31:0x0113, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x003b: PHI (r3v16 ak.a) = (r3v13 ak.a), (r3v21 ak.a) binds: [B:31:0x0113, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x003b: PHI (r4v13 ak.a) = (r4v10 ak.a), (r4v15 ak.a) binds: [B:31:0x0113, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x003b: PHI (r5v8 java.lang.Object) = (r5v5 java.lang.Object), (r5v11 java.lang.Object) binds: [B:31:0x0113, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 388
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel", f = "ProfileScreenViewModel.kt", l = {261}, m = "fetchMperksCardLinkingPreference-IoAF18A")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f94823a;

        /* renamed from: b, reason: collision with root package name */
        Object f94824b;

        /* renamed from: c, reason: collision with root package name */
        Object f94825c;

        /* renamed from: d, reason: collision with root package name */
        Object f94826d;

        /* renamed from: e, reason: collision with root package name */
        int f94827e;

        /* renamed from: f, reason: collision with root package name */
        int f94828f;

        /* renamed from: g, reason: collision with root package name */
        int f94829g;

        /* renamed from: h, reason: collision with root package name */
        int f94830h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f94831i;

        /* renamed from: k, reason: collision with root package name */
        int f94833k;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94831i = obj;
            this.f94833k |= Integer.MIN_VALUE;
            Object objH = l.this.H(this);
            return objH == IntrinsicsKt.f() ? objH : Result.a(objH);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel", f = "ProfileScreenViewModel.kt", l = {257}, m = "fetchPreferenceDiscreteChoices-IoAF18A")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f94834a;

        /* renamed from: b, reason: collision with root package name */
        Object f94835b;

        /* renamed from: c, reason: collision with root package name */
        Object f94836c;

        /* renamed from: d, reason: collision with root package name */
        Object f94837d;

        /* renamed from: e, reason: collision with root package name */
        int f94838e;

        /* renamed from: f, reason: collision with root package name */
        int f94839f;

        /* renamed from: g, reason: collision with root package name */
        int f94840g;

        /* renamed from: h, reason: collision with root package name */
        int f94841h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f94842i;

        /* renamed from: k, reason: collision with root package name */
        int f94844k;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94842i = obj;
            this.f94844k |= Integer.MIN_VALUE;
            Object objI = l.this.I(this);
            return objI == IntrinsicsKt.f() ? objI : Result.a(objI);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel", f = "ProfileScreenViewModel.kt", l = {241, 243}, m = "fetchProfileInformation")
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f94845a;

        /* renamed from: b, reason: collision with root package name */
        Object f94846b;

        /* renamed from: c, reason: collision with root package name */
        Object f94847c;

        /* renamed from: d, reason: collision with root package name */
        Object f94848d;

        /* renamed from: e, reason: collision with root package name */
        Object f94849e;

        /* renamed from: f, reason: collision with root package name */
        int f94850f;

        /* renamed from: g, reason: collision with root package name */
        int f94851g;

        /* renamed from: h, reason: collision with root package name */
        int f94852h;

        /* renamed from: i, reason: collision with root package name */
        int f94853i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f94854j;

        /* renamed from: l, reason: collision with root package name */
        int f94856l;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94854j = obj;
            this.f94856l |= Integer.MIN_VALUE;
            return l.this.J(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel", f = "ProfileScreenViewModel.kt", l = {249}, m = "fetchVehicleInformation")
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f94857a;

        /* renamed from: b, reason: collision with root package name */
        Object f94858b;

        /* renamed from: c, reason: collision with root package name */
        Object f94859c;

        /* renamed from: d, reason: collision with root package name */
        Object f94860d;

        /* renamed from: e, reason: collision with root package name */
        Object f94861e;

        /* renamed from: f, reason: collision with root package name */
        int f94862f;

        /* renamed from: g, reason: collision with root package name */
        int f94863g;

        /* renamed from: h, reason: collision with root package name */
        int f94864h;

        /* renamed from: i, reason: collision with root package name */
        int f94865i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f94866j;

        /* renamed from: l, reason: collision with root package name */
        int f94868l;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94866j = obj;
            this.f94868l |= Integer.MIN_VALUE;
            return l.this.K(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$saveMperksInfo$1", f = "ProfileScreenViewModel.kt", l = {279, 281, 284, 284, 287, 295, 299, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.accounts.ux.profile.l$l, reason: collision with other inner class name */
    static final class C1346l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94869a;

        /* renamed from: b, reason: collision with root package name */
        Object f94870b;

        /* renamed from: c, reason: collision with root package name */
        Object f94871c;

        /* renamed from: d, reason: collision with root package name */
        Object f94872d;

        /* renamed from: e, reason: collision with root package name */
        Object f94873e;

        /* renamed from: f, reason: collision with root package name */
        Object f94874f;

        /* renamed from: g, reason: collision with root package name */
        Object f94875g;

        /* renamed from: h, reason: collision with root package name */
        Object f94876h;

        /* renamed from: i, reason: collision with root package name */
        int f94877i;

        /* renamed from: j, reason: collision with root package name */
        int f94878j;

        /* renamed from: k, reason: collision with root package name */
        int f94879k;

        /* renamed from: l, reason: collision with root package name */
        int f94880l;

        /* renamed from: m, reason: collision with root package name */
        int f94881m;

        /* renamed from: n, reason: collision with root package name */
        int f94882n;

        /* renamed from: o, reason: collision with root package name */
        int f94883o;

        /* renamed from: p, reason: collision with root package name */
        int f94884p;

        /* renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f94885q;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f94887s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f94888t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Boolean f94889u;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "Lkotlin/Result;", "LDh/C;", "<anonymous>", "(Lqv/O;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$saveMperksInfo$1$mperksResponse$1", f = "ProfileScreenViewModel.kt", l = {269}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$l$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Result<? extends UpdateConfirmationResponse>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f94890a;

            /* renamed from: b, reason: collision with root package name */
            Object f94891b;

            /* renamed from: c, reason: collision with root package name */
            int f94892c;

            /* renamed from: d, reason: collision with root package name */
            int f94893d;

            /* renamed from: e, reason: collision with root package name */
            int f94894e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f94895f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f94896g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ l f94897h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, String str2, l lVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f94895f = str;
                this.f94896g = str2;
                this.f94897h = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f94895f, this.f94896g, this.f94897h, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Result<? extends UpdateConfirmationResponse>> continuation) {
                return invoke2(interfaceC16622O, (Continuation<? super Result<UpdateConfirmationResponse>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super Result<UpdateConfirmationResponse>> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objD0;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f94894e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        objD0 = ((Result) obj).getValue();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    String str = this.f94895f;
                    if (str != null) {
                        String str2 = this.f94896g;
                        l lVar = this.f94897h;
                        if (str2 != null) {
                            this.f94890a = str;
                            this.f94891b = str2;
                            this.f94892c = 0;
                            this.f94893d = 0;
                            this.f94894e = 1;
                            objD0 = lVar.d0(str, str2, this);
                            if (objD0 == objF) {
                                return objF;
                            }
                        }
                    }
                    return null;
                }
                return Result.a(objD0);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqv/O;", "Lkotlin/Result;", "", "LDh/o;", "<anonymous>", "(Lqv/O;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$saveMperksInfo$1$quickIDResponse$1", f = "ProfileScreenViewModel.kt", l = {275}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$l$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Result<? extends List<? extends Preference>>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            boolean f94898a;

            /* renamed from: b, reason: collision with root package name */
            int f94899b;

            /* renamed from: c, reason: collision with root package name */
            int f94900c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Boolean f94901d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ l f94902e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Boolean bool, l lVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f94901d = bool;
                this.f94902e = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f94901d, this.f94902e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Result<? extends List<? extends Preference>>> continuation) {
                return invoke2(interfaceC16622O, (Continuation<? super Result<? extends List<Preference>>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super Result<? extends List<Preference>>> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objE0;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f94900c;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        objE0 = ((Result) obj).getValue();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    Boolean bool = this.f94901d;
                    if (bool != null) {
                        l lVar = this.f94902e;
                        boolean zBooleanValue = bool.booleanValue();
                        this.f94898a = zBooleanValue;
                        this.f94899b = 0;
                        this.f94900c = 1;
                        objE0 = lVar.e0(zBooleanValue, this);
                        if (objE0 == objF) {
                            return objF;
                        }
                    } else {
                        return null;
                    }
                }
                return Result.a(objE0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1346l(String str, String str2, Boolean bool, Continuation<? super C1346l> continuation) {
            super(2, continuation);
            this.f94887s = str;
            this.f94888t = str2;
            this.f94889u = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1346l c1346l = l.this.new C1346l(this.f94887s, this.f94888t, this.f94889u, continuation);
            c1346l.f94885q = obj;
            return c1346l;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C1346l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x01cc, code lost:
        
            if (r5 != r1) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0202, code lost:
        
            if (r6 == r1) goto L16;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:103:0x03b1  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x03b4  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x03b8  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x03bb  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x03bf  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x03c2  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x03f5  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x03f8  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0193 A[PHI: r2 r3 r4 r5
          0x0193: PHI (r2v8 qv.W) = (r2v5 qv.W), (r2v10 qv.W) binds: [B:22:0x0190, B:12:0x010e] A[DONT_GENERATE, DONT_INLINE]
          0x0193: PHI (r3v6 qv.W) = (r3v3 qv.W), (r3v8 qv.W) binds: [B:22:0x0190, B:12:0x010e] A[DONT_GENERATE, DONT_INLINE]
          0x0193: PHI (r4v9 qv.O) = (r4v6 qv.O), (r4v11 qv.O) binds: [B:22:0x0190, B:12:0x010e] A[DONT_GENERATE, DONT_INLINE]
          0x0193: PHI (r5v12 java.lang.Object) = (r5v9 java.lang.Object), (r5v17 java.lang.Object) binds: [B:22:0x0190, B:12:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x01b0 A[PHI: r2 r3 r4 r5
          0x01b0: PHI (r2v11 qv.W) = (r2v8 qv.W), (r2v13 qv.W) binds: [B:28:0x01ad, B:11:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          0x01b0: PHI (r3v9 qv.W) = (r3v6 qv.W), (r3v11 qv.W) binds: [B:28:0x01ad, B:11:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          0x01b0: PHI (r4v12 qv.O) = (r4v9 qv.O), (r4v14 qv.O) binds: [B:28:0x01ad, B:11:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          0x01b0: PHI (r5v18 java.lang.Object) = (r5v15 java.lang.Object), (r5v24 java.lang.Object) binds: [B:28:0x01ad, B:11:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x025a  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0266  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0275  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x028e  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x02df  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0342  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x036b  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x037a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0323 -> B:90:0x0333). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r49) {
            /*
                Method dump skipped, instructions count: 1046
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.C1346l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$sendEmail$2", f = "ProfileScreenViewModel.kt", l = {539}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class m extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94903a;

        /* renamed from: b, reason: collision with root package name */
        Object f94904b;

        /* renamed from: c, reason: collision with root package name */
        Object f94905c;

        /* renamed from: d, reason: collision with root package name */
        Object f94906d;

        /* renamed from: e, reason: collision with root package name */
        int f94907e;

        /* renamed from: f, reason: collision with root package name */
        int f94908f;

        /* renamed from: g, reason: collision with root package name */
        int f94909g;

        /* renamed from: h, reason: collision with root package name */
        int f94910h;

        /* renamed from: i, reason: collision with root package name */
        int f94911i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f94912j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f94914l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f94915m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, boolean z10, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f94914l = str;
            this.f94915m = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m mVar = l.this.new m(this.f94914l, this.f94915m, continuation);
            mVar.f94912j = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            ProfileScreenViewState profileScreenViewState;
            Object value2;
            ProfileScreenViewState profileScreenViewState2;
            Object objO;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f94911i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f94912j;
                    l lVar = l.this;
                    String str = this.f94914l;
                    Result.Companion companion = Result.INSTANCE;
                    Bh.e eVar = lVar.profileRepository;
                    this.f94912j = interfaceC16622O;
                    this.f94903a = interfaceC16622O;
                    this.f94904b = this;
                    this.f94905c = this;
                    this.f94906d = interfaceC16622O;
                    this.f94907e = 0;
                    this.f94908f = 0;
                    this.f94909g = 0;
                    this.f94910h = 0;
                    this.f94911i = 1;
                    objO = eVar.o(str, this);
                    if (objO == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objO = obj;
                }
                objB = Result.b(objO);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            l lVar2 = l.this;
            boolean z10 = this.f94915m;
            if (Result.h(objB)) {
                UpdateConfirmationResponse updateConfirmationResponse = (UpdateConfirmationResponse) objB;
                InterfaceC17140B interfaceC17140B = lVar2._profileState;
                do {
                    value2 = interfaceC17140B.getValue();
                    profileScreenViewState2 = (ProfileScreenViewState) value2;
                } while (!interfaceC17140B.e(value2, ProfileScreenViewState.b(profileScreenViewState2, null, null, null, AccountInformationDecorator.f(profileScreenViewState2.getSavedAccountInformation(), null, null, null, null, false, (updateConfirmationResponse.getIsSuccess() || z10) ? null : AbstractC5607a.INSTANCE.d(Fh.h.f10769q1, new Object[0]), null, updateConfirmationResponse.getIsSuccess(), null, null, null, null, (updateConfirmationResponse.getIsSuccess() || !z10) ? null : AbstractC5607a.INSTANCE.d(Fh.h.f10710h5, new Object[0]), (updateConfirmationResponse.getIsSuccess() || !z10) ? null : AbstractC5607a.INSTANCE.d(Fh.h.f10821x4, new Object[0]), 3919, null), AccountInformationDecorator.f(profileScreenViewState2.getUnsavedAccountInformation(), null, null, null, null, false, null, null, false, (updateConfirmationResponse.getIsSuccess() || !z10) ? w0.f30593d : w0.f30594e, null, null, null, null, null, 16127, null), null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048551, null)));
            }
            l lVar3 = l.this;
            boolean z11 = this.f94915m;
            if (Result.e(objB) != null) {
                InterfaceC17140B interfaceC17140B2 = lVar3._profileState;
                do {
                    value = interfaceC17140B2.getValue();
                    profileScreenViewState = (ProfileScreenViewState) value;
                } while (!interfaceC17140B2.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, AccountInformationDecorator.f(profileScreenViewState.getSavedAccountInformation(), null, null, null, null, false, z11 ? null : AbstractC5607a.INSTANCE.d(Fh.h.f10769q1, new Object[0]), null, false, null, null, null, null, z11 ? AbstractC5607a.INSTANCE.d(Fh.h.f10710h5, new Object[0]) : null, z11 ? AbstractC5607a.INSTANCE.d(Fh.h.f10821x4, new Object[0]) : null, 3919, null), AccountInformationDecorator.f(profileScreenViewState.getUnsavedAccountInformation(), null, null, null, null, false, null, null, false, w0.f30594e, null, null, null, null, null, 16127, null), null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048551, null)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$updateAccountInfo$2", f = "ProfileScreenViewModel.kt", l = {445}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94916a;

        /* renamed from: b, reason: collision with root package name */
        Object f94917b;

        /* renamed from: c, reason: collision with root package name */
        Object f94918c;

        /* renamed from: d, reason: collision with root package name */
        Object f94919d;

        /* renamed from: e, reason: collision with root package name */
        int f94920e;

        /* renamed from: f, reason: collision with root package name */
        int f94921f;

        /* renamed from: g, reason: collision with root package name */
        int f94922g;

        /* renamed from: h, reason: collision with root package name */
        int f94923h;

        /* renamed from: i, reason: collision with root package name */
        int f94924i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f94925j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ a.Email f94927l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f94928m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f94929n;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n nVar = l.this.new n(this.f94927l, this.f94928m, this.f94929n, continuation);
            nVar.f94925j = obj;
            return nVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(a.Email cVar, String str, String str2, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f94927l = cVar;
            this.f94928m = str;
            this.f94929n = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            ProfileScreenViewState profileScreenViewState;
            Object value2;
            ProfileScreenViewState profileScreenViewState2;
            Object objQ;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f94924i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f94925j;
                    l lVar = l.this;
                    a.Email cVar = this.f94927l;
                    String str = this.f94928m;
                    String str2 = this.f94929n;
                    Result.Companion companion = Result.INSTANCE;
                    Bh.e eVar = lVar.profileRepository;
                    PasswordChangeInfo passwordChangeInfo = null;
                    MeijerAccount meijerAccountB = (cVar.c().e().length() <= 0 || Intrinsics.e(((ProfileScreenViewState) lVar._profileState.getValue()).getSavedAccountInformation().getEmail(), cVar)) ? null : MeijerAccount.b(((ProfileScreenViewState) lVar._profileState.getValue()).getOriginalMeijerAccount(), 0L, null, cVar.c().e(), null, null, null, null, null, null, null, null, 0, null, 0L, 0L, null, 0, null, 0L, 0, null, null, null, null, null, null, 0L, 134217723, null);
                    if (str.length() > 0 && str2.length() > 0) {
                        passwordChangeInfo = new PasswordChangeInfo(str, str2);
                    }
                    this.f94925j = interfaceC16622O;
                    this.f94916a = interfaceC16622O;
                    this.f94917b = this;
                    this.f94918c = this;
                    this.f94919d = interfaceC16622O;
                    this.f94920e = 0;
                    this.f94921f = 0;
                    this.f94922g = 0;
                    this.f94923h = 0;
                    this.f94924i = 1;
                    objQ = eVar.q(meijerAccountB, passwordChangeInfo, this);
                    if (objQ == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objQ = obj;
                }
                objB = Result.b(objQ);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            l lVar2 = l.this;
            if (Result.h(objB)) {
                UpdateAccountInformationResponse updateAccountInformationResponse = (UpdateAccountInformationResponse) objB;
                InterfaceC17140B interfaceC17140B = lVar2._profileState;
                do {
                    value2 = interfaceC17140B.getValue();
                    profileScreenViewState2 = (ProfileScreenViewState) value2;
                } while (!interfaceC17140B.e(value2, ProfileScreenViewState.b(profileScreenViewState2, null, null, null, AccountInformationDecorator.f(profileScreenViewState2.getSavedAccountInformation(), null, null, null, null, false, updateAccountInformationResponse.getErrorMessage(), null, false, null, null, null, null, null, null, 16335, null), null, null, null, null, null, null, false, updateAccountInformationResponse.getIsSuccess(), null, !updateAccountInformationResponse.getIsSuccess(), false, false, false, !updateAccountInformationResponse.getIsSuccess(), false, false, 907255, null)));
            }
            l lVar3 = l.this;
            if (Result.e(objB) != null) {
                InterfaceC17140B interfaceC17140B2 = lVar3._profileState;
                do {
                    value = interfaceC17140B2.getValue();
                    profileScreenViewState = (ProfileScreenViewState) value;
                } while (!interfaceC17140B2.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, AccountInformationDecorator.f(profileScreenViewState.getSavedAccountInformation(), null, null, null, null, false, AbstractC5607a.INSTANCE.d(Fh.h.f10485B4, new Object[0]), null, false, null, null, null, null, null, null, 16335, null), null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048567, null)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$updateBasicInfo$2", f = "ProfileScreenViewModel.kt", l = {HttpResponseStatus.ERROR_PROXY_AUTHENTICATION_REQUIRED}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94930a;

        /* renamed from: b, reason: collision with root package name */
        Object f94931b;

        /* renamed from: c, reason: collision with root package name */
        Object f94932c;

        /* renamed from: d, reason: collision with root package name */
        Object f94933d;

        /* renamed from: e, reason: collision with root package name */
        int f94934e;

        /* renamed from: f, reason: collision with root package name */
        int f94935f;

        /* renamed from: g, reason: collision with root package name */
        int f94936g;

        /* renamed from: h, reason: collision with root package name */
        int f94937h;

        /* renamed from: i, reason: collision with root package name */
        int f94938i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f94939j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ MeijerAccount f94941l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f94942m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            o oVar = l.this.new o(this.f94941l, this.f94942m, continuation);
            oVar.f94939j = obj;
            return oVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(MeijerAccount meijerAccount, String str, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f94941l = meijerAccount;
            this.f94942m = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            ProfileScreenViewState profileScreenViewState;
            Object value2;
            ProfileScreenViewState profileScreenViewState2;
            Object objR;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f94938i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f94939j;
                    l lVar = l.this;
                    MeijerAccount meijerAccount = this.f94941l;
                    String str = this.f94942m;
                    Result.Companion companion = Result.INSTANCE;
                    Bh.e eVar = lVar.profileRepository;
                    this.f94939j = interfaceC16622O;
                    this.f94930a = interfaceC16622O;
                    this.f94931b = this;
                    this.f94932c = this;
                    this.f94933d = interfaceC16622O;
                    this.f94934e = 0;
                    this.f94935f = 0;
                    this.f94936g = 0;
                    this.f94937h = 0;
                    this.f94938i = 1;
                    objR = eVar.r(meijerAccount, str, this);
                    if (objR == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objR = obj;
                }
                objB = Result.b(objR);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            l lVar2 = l.this;
            if (Result.h(objB)) {
                UpdateBasicInfoResponse updateBasicInfoResponse = (UpdateBasicInfoResponse) objB;
                InterfaceC17140B interfaceC17140B = lVar2._profileState;
                do {
                    value2 = interfaceC17140B.getValue();
                    profileScreenViewState2 = (ProfileScreenViewState) value2;
                } while (!interfaceC17140B.e(value2, ProfileScreenViewState.b(profileScreenViewState2, BasicInformationDecorator.g(profileScreenViewState2.getSavedBasicInformation(), null, null, null, null, null, null, updateBasicInfoResponse.getErrorMessage(), updateBasicInfoResponse.getPhoneConflictErrorMessage(), false, null, null, 1599, null), null, null, null, null, null, null, null, null, null, false, updateBasicInfoResponse.getIsSuccess(), null, !updateBasicInfoResponse.getIsSuccess(), !updateBasicInfoResponse.getIsSuccess(), false, false, false, false, false, 1021950, null)));
            }
            l lVar3 = l.this;
            if (Result.e(objB) != null) {
                InterfaceC17140B interfaceC17140B2 = lVar3._profileState;
                do {
                    value = interfaceC17140B2.getValue();
                    profileScreenViewState = (ProfileScreenViewState) value;
                } while (!interfaceC17140B2.e(value, ProfileScreenViewState.b(profileScreenViewState, BasicInformationDecorator.g(profileScreenViewState.getSavedBasicInformation(), null, null, null, null, null, null, AbstractC5607a.INSTANCE.d(Fh.h.f10485B4, new Object[0]), null, false, null, null, 1727, null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048574, null)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel", f = "ProfileScreenViewModel.kt", l = {352}, m = "updateMperksPin-0E7RQCE")
    static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f94943a;

        /* renamed from: b, reason: collision with root package name */
        Object f94944b;

        /* renamed from: c, reason: collision with root package name */
        Object f94945c;

        /* renamed from: d, reason: collision with root package name */
        Object f94946d;

        /* renamed from: e, reason: collision with root package name */
        Object f94947e;

        /* renamed from: f, reason: collision with root package name */
        Object f94948f;

        /* renamed from: g, reason: collision with root package name */
        int f94949g;

        /* renamed from: h, reason: collision with root package name */
        int f94950h;

        /* renamed from: i, reason: collision with root package name */
        int f94951i;

        /* renamed from: j, reason: collision with root package name */
        int f94952j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f94953k;

        /* renamed from: m, reason: collision with root package name */
        int f94955m;

        p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94953k = obj;
            this.f94955m |= Integer.MIN_VALUE;
            Object objD0 = l.this.d0(null, null, this);
            return objD0 == IntrinsicsKt.f() ? objD0 : Result.a(objD0);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel", f = "ProfileScreenViewModel.kt", l = {362}, m = "updateMperksQuickID-gIAlu-s")
    static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        boolean f94956a;

        /* renamed from: b, reason: collision with root package name */
        Object f94957b;

        /* renamed from: c, reason: collision with root package name */
        Object f94958c;

        /* renamed from: d, reason: collision with root package name */
        Object f94959d;

        /* renamed from: e, reason: collision with root package name */
        Object f94960e;

        /* renamed from: f, reason: collision with root package name */
        int f94961f;

        /* renamed from: g, reason: collision with root package name */
        int f94962g;

        /* renamed from: h, reason: collision with root package name */
        int f94963h;

        /* renamed from: i, reason: collision with root package name */
        int f94964i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f94965j;

        /* renamed from: l, reason: collision with root package name */
        int f94967l;

        q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94965j = obj;
            this.f94967l |= Integer.MIN_VALUE;
            Object objE0 = l.this.e0(false, this);
            return objE0 == IntrinsicsKt.f() ? objE0 : Result.a(objE0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$updateOrderPreferences$2", f = "ProfileScreenViewModel.kt", l = {495}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class r extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94968a;

        /* renamed from: b, reason: collision with root package name */
        Object f94969b;

        /* renamed from: c, reason: collision with root package name */
        Object f94970c;

        /* renamed from: d, reason: collision with root package name */
        Object f94971d;

        /* renamed from: e, reason: collision with root package name */
        int f94972e;

        /* renamed from: f, reason: collision with root package name */
        int f94973f;

        /* renamed from: g, reason: collision with root package name */
        int f94974g;

        /* renamed from: h, reason: collision with root package name */
        int f94975h;

        /* renamed from: i, reason: collision with root package name */
        int f94976i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f94977j;

        r(Continuation<? super r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            r rVar = l.this.new r(continuation);
            rVar.f94977j = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            ProfileScreenViewState profileScreenViewState;
            Object value2;
            ProfileScreenViewState profileScreenViewState2;
            Object objV;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f94976i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f94977j;
                    l lVar = l.this;
                    Result.Companion companion = Result.INSTANCE;
                    Bh.e eVar = lVar.profileRepository;
                    String selectedSubstitutionPreference = ((ProfileScreenViewState) lVar._profileState.getValue()).getUnsavedOrderPreferencesInformation().getGrocerySubstitution().getSelectedSubstitutionPreference();
                    String description = ((ProfileScreenViewState) lVar._profileState.getValue()).getUnsavedOrderPreferencesInformation().getVehicleDescription().getDescription();
                    VehicleDescriptionChangeInfo vehicleDescriptionChangeInfo = description != null ? new VehicleDescriptionChangeInfo(((ProfileScreenViewState) lVar._profileState.getValue()).getSavedOrderPreferencesInformation().getVehicleId(), ((ProfileScreenViewState) lVar._profileState.getValue()).getSavedOrderPreferencesInformation().getVehicleDescription().getDescription(), description) : null;
                    this.f94977j = interfaceC16622O;
                    this.f94968a = interfaceC16622O;
                    this.f94969b = this;
                    this.f94970c = this;
                    this.f94971d = interfaceC16622O;
                    this.f94972e = 0;
                    this.f94973f = 0;
                    this.f94974g = 0;
                    this.f94975h = 0;
                    this.f94976i = 1;
                    objV = eVar.v(selectedSubstitutionPreference, vehicleDescriptionChangeInfo, this);
                    if (objV == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objV = obj;
                }
                objB = Result.b(objV);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            l lVar2 = l.this;
            if (Result.h(objB)) {
                UpdateOrderPreferencesResponse updateOrderPreferencesResponse = (UpdateOrderPreferencesResponse) objB;
                InterfaceC17140B interfaceC17140B = lVar2._profileState;
                do {
                    value2 = interfaceC17140B.getValue();
                    profileScreenViewState2 = (ProfileScreenViewState) value2;
                } while (!interfaceC17140B.e(value2, ProfileScreenViewState.b(profileScreenViewState2, null, null, null, null, null, null, null, null, OrderPreferencesDecorator.f(profileScreenViewState2.getSavedOrderPreferencesInformation(), 0, null, null, null, updateOrderPreferencesResponse.getErrorMessage(), null, false, 47, null), null, false, updateOrderPreferencesResponse.getIsSuccess(), null, !updateOrderPreferencesResponse.getIsSuccess(), false, false, !updateOrderPreferencesResponse.getIsSuccess(), false, false, false, 972543, null)));
            }
            l lVar3 = l.this;
            if (Result.e(objB) != null) {
                InterfaceC17140B interfaceC17140B2 = lVar3._profileState;
                do {
                    value = interfaceC17140B2.getValue();
                    profileScreenViewState = (ProfileScreenViewState) value;
                } while (!interfaceC17140B2.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, null, null, null, null, null, OrderPreferencesDecorator.f(profileScreenViewState.getSavedOrderPreferencesInformation(), 0, null, null, null, AbstractC5607a.INSTANCE.d(Fh.h.f10485B4, new Object[0]), null, false, 47, null), null, false, false, null, false, false, false, false, false, false, false, 1048319, null)));
            }
            return Unit.f142422a;
        }
    }

    private final void c0() {
        ProfileScreenViewState value;
        ProfileScreenViewState profileScreenViewState;
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = this._profileState;
        do {
            value = interfaceC17140B.getValue();
            profileScreenViewState = value;
        } while (!interfaceC17140B.e(value, ProfileScreenViewState.b(profileScreenViewState, BasicInformationDecorator.g(profileScreenViewState.getSavedBasicInformation(), null, null, null, null, null, null, null, null, true, null, null, 1791, null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048574, null)));
        BasicInformationDecorator savedBasicInformation = this._profileState.getValue().getSavedBasicInformation();
        C16648k.d(d0.a(this), null, null, new o((Intrinsics.e(savedBasicInformation.getFirstName().c().e(), this._profileState.getValue().getUnsavedBasicInformation().getFirstName().c().e()) && Intrinsics.e(savedBasicInformation.getLastName().c().e(), this._profileState.getValue().getUnsavedBasicInformation().getLastName().c().e()) && Intrinsics.e(savedBasicInformation.getZipCode().c().e(), this._profileState.getValue().getUnsavedBasicInformation().getZipCode().c().e()) && Intrinsics.e(savedBasicInformation.getBirthDate().c().e(), this._profileState.getValue().getUnsavedBasicInformation().getBirthDate().c().e())) ? null : MeijerAccount.b(this._profileState.getValue().getOriginalMeijerAccount(), 0L, null, null, null, null, null, null, null, this._profileState.getValue().getUnsavedBasicInformation().getFirstName().c().e(), this._profileState.getValue().getUnsavedBasicInformation().getLastName().c().e(), this._profileState.getValue().getUnsavedBasicInformation().getZipCode().c().e(), 0, null, 0L, 0L, null, 0, null, 0L, 0, null, null, null, this._profileState.getValue().getUnsavedBasicInformation().getBirthDate().c().e(), null, null, 0L, 125827327, null), !Intrinsics.e(this._profileState.getValue().getSavedBasicInformation().getPhoneNumber(), this._profileState.getValue().getUnsavedBasicInformation().getPhoneNumber()) ? this._profileState.getValue().getUnsavedBasicInformation().getPhoneNumber().c().e() : null, null), 3, null);
    }

    public l(Bh.e profileRepository, Bh.d preferencesRepository, Bh.c accountsAMSRepository, yl.k featureManager) {
        Intrinsics.j(profileRepository, "profileRepository");
        Intrinsics.j(preferencesRepository, "preferencesRepository");
        Intrinsics.j(accountsAMSRepository, "accountsAMSRepository");
        Intrinsics.j(featureManager, "featureManager");
        this.profileRepository = profileRepository;
        this.preferencesRepository = preferencesRepository;
        this.accountsAMSRepository = accountsAMSRepository;
        this.featureManager = featureManager;
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140BA = S.a(new ProfileScreenViewState(null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048575, null));
        this._profileState = interfaceC17140BA;
        this.profileState = C17154h.c(interfaceC17140BA);
        Oj.c cVar = new Oj.c();
        this.loadingStatesManager = cVar;
        G();
        C17154h.J(C17154h.g(C17154h.O(cVar.a(), new a(this)), new b(null)), d0.a(this));
    }

    private final void E(boolean isPhoneConflictError, boolean isMperksPinError) {
        ProfileScreenViewState value;
        ProfileScreenViewState profileScreenViewState;
        ProfileScreenViewState value2;
        ProfileScreenViewState profileScreenViewState2;
        ProfileScreenViewState value3;
        ProfileScreenViewState profileScreenViewState3;
        com.meijer.mobile.accounts.ux.profile.p screen = this._profileState.getValue().getScreen();
        if (Intrinsics.e(screen, p.b.f94982a)) {
            InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = this._profileState;
            do {
                value3 = interfaceC17140B.getValue();
                profileScreenViewState3 = value3;
            } while (!interfaceC17140B.e(value3, ProfileScreenViewState.b(profileScreenViewState3, isPhoneConflictError ? BasicInformationDecorator.g(profileScreenViewState3.getSavedBasicInformation(), null, null, null, null, null, null, null, null, false, null, null, 1919, null) : BasicInformationDecorator.g(profileScreenViewState3.getSavedBasicInformation(), null, null, null, null, null, null, null, null, false, null, null, 1983, null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048574, null)));
            return;
        }
        if (Intrinsics.e(screen, p.a.f94981a)) {
            InterfaceC17140B<ProfileScreenViewState> interfaceC17140B2 = this._profileState;
            do {
                value2 = interfaceC17140B2.getValue();
                profileScreenViewState2 = value2;
            } while (!interfaceC17140B2.e(value2, ProfileScreenViewState.b(profileScreenViewState2, null, null, null, AccountInformationDecorator.f(profileScreenViewState2.getSavedAccountInformation(), null, null, null, null, false, null, null, false, null, null, null, null, null, null, 16351, null), null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048567, null)));
            return;
        }
        if (Intrinsics.e(screen, p.c.f94983a)) {
            if (isMperksPinError) {
                this.loadingStatesManager.b(new a.NotLoading("mperks pin"));
                return;
            } else {
                this.loadingStatesManager.b(new a.NotLoading("quick id"));
                return;
            }
        }
        if (!Intrinsics.e(screen, p.d.f94984a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140B3 = this._profileState;
        do {
            value = interfaceC17140B3.getValue();
            profileScreenViewState = value;
        } while (!interfaceC17140B3.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, null, null, null, null, null, OrderPreferencesDecorator.f(profileScreenViewState.getSavedOrderPreferencesInformation(), 0, null, null, null, null, null, false, 111, null), null, false, false, null, false, false, false, false, false, false, false, 1048319, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(kotlin.coroutines.Continuation<? super ak.AbstractC5607a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.meijer.mobile.accounts.ux.profile.l.f
            if (r0 == 0) goto L13
            r0 = r5
            com.meijer.mobile.accounts.ux.profile.l$f r0 = (com.meijer.mobile.accounts.ux.profile.l.f) r0
            int r1 = r0.f94802l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94802l = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.profile.l$f r0 = new com.meijer.mobile.accounts.ux.profile.l$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f94800j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f94802l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r1 = r0.f94795e
            com.meijer.mobile.accounts.ux.profile.l r1 = (com.meijer.mobile.accounts.ux.profile.l) r1
            java.lang.Object r2 = r0.f94794d
            com.meijer.mobile.accounts.ux.profile.l r2 = (com.meijer.mobile.accounts.ux.profile.l) r2
            java.lang.Object r2 = r0.f94793c
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f94792b
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f94791a
            com.meijer.mobile.accounts.ux.profile.l r2 = (com.meijer.mobile.accounts.ux.profile.l) r2
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Exception -> L3d
            goto L6d
        L3d:
            r5 = move-exception
            goto L74
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L47:
            kotlin.ResultKt.b(r5)
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L72
            Bh.e r5 = w(r4)     // Catch: java.lang.Exception -> L72
            r0.f94791a = r4     // Catch: java.lang.Exception -> L72
            r0.f94792b = r0     // Catch: java.lang.Exception -> L72
            r0.f94793c = r0     // Catch: java.lang.Exception -> L72
            r0.f94794d = r4     // Catch: java.lang.Exception -> L72
            r0.f94795e = r4     // Catch: java.lang.Exception -> L72
            r2 = 0
            r0.f94796f = r2     // Catch: java.lang.Exception -> L72
            r0.f94797g = r2     // Catch: java.lang.Exception -> L72
            r0.f94798h = r2     // Catch: java.lang.Exception -> L72
            r0.f94799i = r2     // Catch: java.lang.Exception -> L72
            r0.f94802l = r3     // Catch: java.lang.Exception -> L72
            java.lang.Object r5 = r5.i(r0)     // Catch: java.lang.Exception -> L72
            if (r5 != r1) goto L6c
            return r1
        L6c:
            r1 = r4
        L6d:
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Exception -> L3d
            goto L85
        L72:
            r5 = move-exception
            r1 = r4
        L74:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L85:
            boolean r5 = kotlin.Result.g(r5)
            ak.a r5 = r1.L(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.F(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(kotlin.coroutines.Continuation<? super kotlin.Result<Dh.Preference>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.accounts.ux.profile.l.h
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.accounts.ux.profile.l$h r0 = (com.meijer.mobile.accounts.ux.profile.l.h) r0
            int r1 = r0.f94833k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94833k = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.profile.l$h r0 = new com.meijer.mobile.accounts.ux.profile.l$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f94831i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f94833k
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r1 = r0.f94826d
            com.meijer.mobile.accounts.ux.profile.l r1 = (com.meijer.mobile.accounts.ux.profile.l) r1
            java.lang.Object r1 = r0.f94825c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f94824b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f94823a
            com.meijer.mobile.accounts.ux.profile.l r1 = (com.meijer.mobile.accounts.ux.profile.l) r1
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L39
            goto L68
        L39:
            r6 = move-exception
            goto L6d
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L43:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L39
            Bh.d r6 = v(r5)     // Catch: java.lang.Exception -> L39
            Dh.p r2 = Dh.p.f6562f     // Catch: java.lang.Exception -> L39
            r0.f94823a = r5     // Catch: java.lang.Exception -> L39
            r0.f94824b = r0     // Catch: java.lang.Exception -> L39
            r0.f94825c = r0     // Catch: java.lang.Exception -> L39
            r0.f94826d = r5     // Catch: java.lang.Exception -> L39
            r4 = 0
            r0.f94827e = r4     // Catch: java.lang.Exception -> L39
            r0.f94828f = r4     // Catch: java.lang.Exception -> L39
            r0.f94829g = r4     // Catch: java.lang.Exception -> L39
            r0.f94830h = r4     // Catch: java.lang.Exception -> L39
            r0.f94833k = r3     // Catch: java.lang.Exception -> L39
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Exception -> L39
            if (r6 != r1) goto L68
            return r1
        L68:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L39
            return r6
        L6d:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.H(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<Eh.DiscretePreferenceChoice>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.meijer.mobile.accounts.ux.profile.l.i
            if (r0 == 0) goto L13
            r0 = r5
            com.meijer.mobile.accounts.ux.profile.l$i r0 = (com.meijer.mobile.accounts.ux.profile.l.i) r0
            int r1 = r0.f94844k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94844k = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.profile.l$i r0 = new com.meijer.mobile.accounts.ux.profile.l$i
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f94842i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f94844k
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r1 = r0.f94837d
            com.meijer.mobile.accounts.ux.profile.l r1 = (com.meijer.mobile.accounts.ux.profile.l) r1
            java.lang.Object r1 = r0.f94836c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f94835b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f94834a
            com.meijer.mobile.accounts.ux.profile.l r1 = (com.meijer.mobile.accounts.ux.profile.l) r1
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Exception -> L39
            goto L66
        L39:
            r5 = move-exception
            goto L6b
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L43:
            kotlin.ResultKt.b(r5)
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L39
            Bh.e r5 = w(r4)     // Catch: java.lang.Exception -> L39
            r0.f94834a = r4     // Catch: java.lang.Exception -> L39
            r0.f94835b = r0     // Catch: java.lang.Exception -> L39
            r0.f94836c = r0     // Catch: java.lang.Exception -> L39
            r0.f94837d = r4     // Catch: java.lang.Exception -> L39
            r2 = 0
            r0.f94838e = r2     // Catch: java.lang.Exception -> L39
            r0.f94839f = r2     // Catch: java.lang.Exception -> L39
            r0.f94840g = r2     // Catch: java.lang.Exception -> L39
            r0.f94841h = r2     // Catch: java.lang.Exception -> L39
            r0.f94844k = r3     // Catch: java.lang.Exception -> L39
            java.lang.Object r5 = r5.k(r0)     // Catch: java.lang.Exception -> L39
            if (r5 != r1) goto L66
            return r1
        L66:
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Exception -> L39
            return r5
        L6b:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.I(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        if (r6 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(kotlin.coroutines.Continuation<? super ak.AbstractC5607a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.accounts.ux.profile.l.j
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.accounts.ux.profile.l$j r0 = (com.meijer.mobile.accounts.ux.profile.l.j) r0
            int r1 = r0.f94856l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94856l = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.profile.l$j r0 = new com.meijer.mobile.accounts.ux.profile.l$j
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f94854j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f94856l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L61
            if (r2 == r4) goto L4c
            if (r2 != r3) goto L44
            java.lang.Object r1 = r0.f94849e
            com.meijer.mobile.accounts.ux.profile.l r1 = (com.meijer.mobile.accounts.ux.profile.l) r1
            java.lang.Object r2 = r0.f94848d
            com.meijer.mobile.accounts.ux.profile.l r2 = (com.meijer.mobile.accounts.ux.profile.l) r2
            java.lang.Object r2 = r0.f94847c
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f94846b
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f94845a
            com.meijer.mobile.accounts.ux.profile.l r2 = (com.meijer.mobile.accounts.ux.profile.l) r2
        L3c:
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L41
            goto Lb6
        L41:
            r6 = move-exception
            goto Lbb
        L44:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L4c:
            java.lang.Object r1 = r0.f94849e
            com.meijer.mobile.accounts.ux.profile.l r1 = (com.meijer.mobile.accounts.ux.profile.l) r1
            java.lang.Object r2 = r0.f94848d
            com.meijer.mobile.accounts.ux.profile.l r2 = (com.meijer.mobile.accounts.ux.profile.l) r2
            java.lang.Object r2 = r0.f94847c
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f94846b
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f94845a
            com.meijer.mobile.accounts.ux.profile.l r2 = (com.meijer.mobile.accounts.ux.profile.l) r2
            goto L3c
        L61:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L94
            yl.k r6 = u(r5)     // Catch: java.lang.Exception -> L94
            yl.f$c r2 = yl.AbstractC18227f.C18230c.f170570h     // Catch: java.lang.Exception -> L94
            boolean r6 = r6.e(r2)     // Catch: java.lang.Exception -> L94
            r2 = 0
            if (r6 == 0) goto L97
            Bh.c r6 = t(r5)     // Catch: java.lang.Exception -> L94
            r0.f94845a = r5     // Catch: java.lang.Exception -> L94
            r0.f94846b = r0     // Catch: java.lang.Exception -> L94
            r0.f94847c = r0     // Catch: java.lang.Exception -> L94
            r0.f94848d = r5     // Catch: java.lang.Exception -> L94
            r0.f94849e = r5     // Catch: java.lang.Exception -> L94
            r0.f94850f = r2     // Catch: java.lang.Exception -> L94
            r0.f94851g = r2     // Catch: java.lang.Exception -> L94
            r0.f94852h = r2     // Catch: java.lang.Exception -> L94
            r0.f94853i = r2     // Catch: java.lang.Exception -> L94
            r0.f94856l = r4     // Catch: java.lang.Exception -> L94
            java.lang.Object r6 = r6.g(r0)     // Catch: java.lang.Exception -> L94
            if (r6 != r1) goto L92
            goto Lb5
        L92:
            r1 = r5
            goto Lb6
        L94:
            r6 = move-exception
            r1 = r5
            goto Lbb
        L97:
            Bh.e r6 = w(r5)     // Catch: java.lang.Exception -> L94
            r0.f94845a = r5     // Catch: java.lang.Exception -> L94
            r0.f94846b = r0     // Catch: java.lang.Exception -> L94
            r0.f94847c = r0     // Catch: java.lang.Exception -> L94
            r0.f94848d = r5     // Catch: java.lang.Exception -> L94
            r0.f94849e = r5     // Catch: java.lang.Exception -> L94
            r0.f94850f = r2     // Catch: java.lang.Exception -> L94
            r0.f94851g = r2     // Catch: java.lang.Exception -> L94
            r0.f94852h = r2     // Catch: java.lang.Exception -> L94
            r0.f94853i = r2     // Catch: java.lang.Exception -> L94
            r0.f94856l = r3     // Catch: java.lang.Exception -> L94
            java.lang.Object r6 = r6.l(r0)     // Catch: java.lang.Exception -> L94
            if (r6 != r1) goto L92
        Lb5:
            return r1
        Lb6:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L41
            goto Lcc
        Lbb:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        Lcc:
            boolean r6 = kotlin.Result.g(r6)
            ak.a r6 = r1.L(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.J(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(kotlin.coroutines.Continuation<? super ak.AbstractC5607a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.meijer.mobile.accounts.ux.profile.l.k
            if (r0 == 0) goto L13
            r0 = r5
            com.meijer.mobile.accounts.ux.profile.l$k r0 = (com.meijer.mobile.accounts.ux.profile.l.k) r0
            int r1 = r0.f94868l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94868l = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.profile.l$k r0 = new com.meijer.mobile.accounts.ux.profile.l$k
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f94866j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f94868l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r1 = r0.f94861e
            com.meijer.mobile.accounts.ux.profile.l r1 = (com.meijer.mobile.accounts.ux.profile.l) r1
            java.lang.Object r2 = r0.f94860d
            com.meijer.mobile.accounts.ux.profile.l r2 = (com.meijer.mobile.accounts.ux.profile.l) r2
            java.lang.Object r2 = r0.f94859c
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f94858b
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f94857a
            com.meijer.mobile.accounts.ux.profile.l r2 = (com.meijer.mobile.accounts.ux.profile.l) r2
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Exception -> L3d
            goto L6d
        L3d:
            r5 = move-exception
            goto L74
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L47:
            kotlin.ResultKt.b(r5)
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L72
            Bh.e r5 = w(r4)     // Catch: java.lang.Exception -> L72
            r0.f94857a = r4     // Catch: java.lang.Exception -> L72
            r0.f94858b = r0     // Catch: java.lang.Exception -> L72
            r0.f94859c = r0     // Catch: java.lang.Exception -> L72
            r0.f94860d = r4     // Catch: java.lang.Exception -> L72
            r0.f94861e = r4     // Catch: java.lang.Exception -> L72
            r2 = 0
            r0.f94862f = r2     // Catch: java.lang.Exception -> L72
            r0.f94863g = r2     // Catch: java.lang.Exception -> L72
            r0.f94864h = r2     // Catch: java.lang.Exception -> L72
            r0.f94865i = r2     // Catch: java.lang.Exception -> L72
            r0.f94868l = r3     // Catch: java.lang.Exception -> L72
            java.lang.Object r5 = r5.n(r0)     // Catch: java.lang.Exception -> L72
            if (r5 != r1) goto L6c
            return r1
        L6c:
            r1 = r4
        L6d:
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Exception -> L3d
            goto L85
        L72:
            r5 = move-exception
            r1 = r4
        L74:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            qv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L85:
            boolean r5 = kotlin.Result.g(r5)
            ak.a r5 = r1.L(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.K(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final AbstractC5607a L(boolean isFailure) {
        if (isFailure) {
            return AbstractC5607a.INSTANCE.d(Fh.h.f10615U1, new Object[0]);
        }
        return null;
    }

    private final boolean N(AccountInformationDecorator accountInformationDecorator) {
        String strE = this._profileState.getValue().getSavedAccountInformation().getEmail().c().e();
        return accountInformationDecorator.g(this._profileState.getValue().getSavedAccountInformation().getEmail().c().e()) ? accountInformationDecorator.t(strE) && accountInformationDecorator.v() : accountInformationDecorator.t(strE) || accountInformationDecorator.v();
    }

    private final boolean Q(OrderPreferencesDecorator orderPreferencesDecorator) {
        return (Intrinsics.e(orderPreferencesDecorator, new OrderPreferencesDecorator(0, null, null, null, null, null, false, l3.f92485d, null)) || Intrinsics.e(orderPreferencesDecorator, this._profileState.getValue().getSavedOrderPreferencesInformation())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Object quickIDResponse) {
        ProfileScreenViewState value;
        ProfileScreenViewState profileScreenViewState;
        MperksInformationDecorator savedMperksInformation;
        List list;
        Preference preferenceA;
        if (!Result.h(quickIDResponse)) {
            this.loadingStatesManager.b(new a.Failed("quick id", AbstractC5607a.INSTANCE.d(Fh.h.f10485B4, new Object[0])));
            return;
        }
        this.loadingStatesManager.b(new a.NotLoading("quick id"));
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = this._profileState;
        do {
            value = interfaceC17140B.getValue();
            profileScreenViewState = value;
            savedMperksInformation = profileScreenViewState.getSavedMperksInformation();
            list = (List) (Result.g(quickIDResponse) ? null : quickIDResponse);
        } while (!interfaceC17140B.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, null, null, MperksInformationDecorator.f(savedMperksInformation, null, null, null, false, (list == null || (preferenceA = Dh.q.a(list, Dh.p.f6562f)) == null) ? false : preferenceA.getIsEnabled(), null, null, 111, null), null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048543, null)));
    }

    private final void V(com.meijer.mobile.accounts.ux.profile.p screen) {
        l lVar = this;
        com.meijer.mobile.accounts.ux.profile.p pVar = screen;
        if (Intrinsics.e(pVar, p.b.f94982a)) {
            InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = lVar._profileState;
            while (true) {
                ProfileScreenViewState value = interfaceC17140B.getValue();
                InterfaceC17140B<ProfileScreenViewState> interfaceC17140B2 = interfaceC17140B;
                if (interfaceC17140B2.e(value, ProfileScreenViewState.b(value, null, lVar._profileState.getValue().getSavedBasicInformation(), null, null, null, null, null, null, null, null, false, false, pVar, true, false, false, false, false, false, false, 1034237, null))) {
                    return;
                }
                interfaceC17140B = interfaceC17140B2;
                lVar = this;
            }
        } else if (Intrinsics.e(pVar, p.a.f94981a)) {
            InterfaceC17140B<ProfileScreenViewState> interfaceC17140B3 = this._profileState;
            while (true) {
                ProfileScreenViewState value2 = interfaceC17140B3.getValue();
                InterfaceC17140B<ProfileScreenViewState> interfaceC17140B4 = interfaceC17140B3;
                ProfileScreenViewState profileScreenViewState = value2;
                if (interfaceC17140B4.e(value2, ProfileScreenViewState.b(profileScreenViewState, null, null, null, null, AccountInformationDecorator.f(profileScreenViewState.getSavedAccountInformation(), null, null, null, null, false, null, null, false, w0.f30590a, null, null, null, null, null, 16127, null), null, null, null, null, null, false, false, pVar, true, false, false, false, false, false, false, 1034223, null))) {
                    return;
                } else {
                    interfaceC17140B3 = interfaceC17140B4;
                }
            }
        } else if (Intrinsics.e(pVar, p.c.f94983a)) {
            l lVar2 = this;
            InterfaceC17140B<ProfileScreenViewState> interfaceC17140B5 = lVar2._profileState;
            while (true) {
                ProfileScreenViewState value3 = interfaceC17140B5.getValue();
                InterfaceC17140B<ProfileScreenViewState> interfaceC17140B6 = interfaceC17140B5;
                if (interfaceC17140B6.e(value3, ProfileScreenViewState.b(value3, null, null, null, null, null, null, lVar2._profileState.getValue().getSavedMperksInformation(), null, null, null, false, false, pVar, true, false, false, false, false, false, false, 1034175, null))) {
                    return;
                }
                interfaceC17140B5 = interfaceC17140B6;
                lVar2 = this;
            }
        } else {
            if (!Intrinsics.e(pVar, p.d.f94984a)) {
                throw new NoWhenBranchMatchedException();
            }
            l lVar3 = this;
            InterfaceC17140B<ProfileScreenViewState> interfaceC17140B7 = lVar3._profileState;
            while (true) {
                ProfileScreenViewState value4 = interfaceC17140B7.getValue();
                InterfaceC17140B<ProfileScreenViewState> interfaceC17140B8 = interfaceC17140B7;
                if (interfaceC17140B8.e(value4, ProfileScreenViewState.b(value4, null, null, null, null, null, null, null, null, null, lVar3._profileState.getValue().getSavedOrderPreferencesInformation(), false, false, pVar, true, false, false, false, false, false, false, 1033727, null))) {
                    return;
                }
                pVar = screen;
                interfaceC17140B7 = interfaceC17140B8;
                lVar3 = this;
            }
        }
    }

    private final void X(String email, boolean isResendEmail) {
        ProfileScreenViewState value;
        ProfileScreenViewState profileScreenViewState;
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = this._profileState;
        do {
            value = interfaceC17140B.getValue();
            profileScreenViewState = value;
        } while (!interfaceC17140B.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, AccountInformationDecorator.f(profileScreenViewState.getSavedAccountInformation(), null, null, null, null, true, null, null, false, null, null, null, null, null, null, 16367, null), null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048567, null)));
        C16648k.d(d0.a(this), null, null, new m(email, isResendEmail, null), 3, null);
    }

    static /* synthetic */ void Y(l lVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lVar.X(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(ProfileInformation profileInformation, AbstractC5607a accountResultFailureMessage, AbstractC5607a customerPreferencesFailureMessage, AbstractC5607a vehicleInformationFailureMessage, Object quickID) {
        Object next;
        ProfileScreenViewState value;
        ProfileScreenViewState profileScreenViewState;
        BasicInformationDecorator basicInformationDecoratorB;
        MeijerAccount meijerAccount;
        AccountInformationDecorator accountInformationDecoratorF;
        MperksInformationDecorator mperksInformationDecoratorF;
        YourMeijerStoreCardDecorator yourMeijerStoreCardDecoratorA;
        OrderPreferencesDecorator savedOrderPreferencesInformation;
        int vehicleId;
        e.VehicleDescription vehicleDescription;
        e.GrocerySubstitution grocerySubstitution;
        ArrayList arrayList;
        Iterator<T> it = profileInformation.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (StringsKt.H(((CustomerPreference) next).getPreferenceTypeName(), Dh.r.f6569e.getPreferenceTypeName(), true)) {
                    break;
                }
            }
        }
        CustomerPreference customerPreference = (CustomerPreference) next;
        String preferenceValue = customerPreference != null ? customerPreference.getPreferenceValue() : null;
        Iterator<DiscretePreferenceChoice> it2 = profileInformation.d().iterator();
        int i10 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i10 = -1;
                break;
            } else if (StringsKt.H(preferenceValue, it2.next().getChoiceValue(), true)) {
                break;
            } else {
                i10++;
            }
        }
        int iF = RangesKt.f(i10, 0);
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = this._profileState;
        do {
            value = interfaceC17140B.getValue();
            profileScreenViewState = value;
            basicInformationDecoratorB = Xh.c.b(profileScreenViewState.getSavedBasicInformation(), profileInformation.getMeijerAccount(), accountResultFailureMessage);
            MeijerAccount meijerAccount2 = profileInformation.getMeijerAccount();
            meijerAccount = meijerAccount2 == null ? new MeijerAccount(0L, null, null, null, null, null, null, null, null, null, null, 0, null, 0L, 0L, null, 0, null, 0L, 0, null, null, null, null, null, null, 0L, 134217727, null) : meijerAccount2;
            AccountInformationDecorator savedAccountInformation = profileScreenViewState.getSavedAccountInformation();
            MeijerAccount meijerAccount3 = profileInformation.getMeijerAccount();
            String email = meijerAccount3 != null ? meijerAccount3.getEmail() : null;
            if (email == null) {
                email = "";
            }
            accountInformationDecoratorF = AccountInformationDecorator.f(savedAccountInformation, new a.Email(new Validation(email, null, 2, null)), null, null, null, false, null, accountResultFailureMessage, false, null, null, null, null, null, null, 16318, null);
            MperksInformationDecorator savedMperksInformation = profileScreenViewState.getSavedMperksInformation();
            Preference preference = (Preference) (Result.g(quickID) ? null : quickID);
            mperksInformationDecoratorF = MperksInformationDecorator.f(savedMperksInformation, null, null, accountResultFailureMessage, false, preference != null ? preference.getIsEnabled() : false, null, null, 107, null);
            YourMeijerStoreCardDecorator yourMeijerStoreInformation = profileScreenViewState.getYourMeijerStoreInformation();
            int storeId = profileInformation.getStoreId();
            String storeName = profileInformation.getStoreName();
            String str = storeName != null ? storeName : "";
            String storeName2 = profileInformation.getStoreName();
            yourMeijerStoreCardDecoratorA = yourMeijerStoreInformation.a(storeId, str, L(storeName2 == null || storeName2.length() == 0));
            savedOrderPreferencesInformation = profileScreenViewState.getSavedOrderPreferencesInformation();
            VehicleInformation vehicleInformation = profileInformation.getVehicleInformation();
            vehicleId = vehicleInformation != null ? vehicleInformation.getVehicleId() : 0;
            VehicleInformation vehicleInformation2 = profileInformation.getVehicleInformation();
            vehicleDescription = new e.VehicleDescription(null, vehicleInformation2 != null ? vehicleInformation2.getVehicleDescription() : null, 1, null);
            grocerySubstitution = new e.GrocerySubstitution(null, preferenceValue, iF, 1, null);
            List<DiscretePreferenceChoice> listD = profileInformation.d();
            arrayList = new ArrayList();
            Iterator<T> it3 = listD.iterator();
            while (it3.hasNext()) {
                String choiceValue = ((DiscretePreferenceChoice) it3.next()).getChoiceValue();
                if (choiceValue != null) {
                    arrayList.add(choiceValue);
                }
            }
        } while (!interfaceC17140B.e(value, ProfileScreenViewState.b(profileScreenViewState, basicInformationDecoratorB, null, meijerAccount, accountInformationDecoratorF, null, mperksInformationDecoratorF, null, yourMeijerStoreCardDecoratorA, OrderPreferencesDecorator.f(savedOrderPreferencesInformation, vehicleId, grocerySubstitution, vehicleDescription, arrayList, null, !C5608b.a(vehicleInformationFailureMessage) ? vehicleInformationFailureMessage : customerPreferencesFailureMessage, false, 80, null), null, false, false, null, false, false, false, false, false, false, false, 1047122, null)));
        if (this._profileState.getValue().getIsFromPaymentsScreen()) {
            V(p.c.f94983a);
        } else if (this._profileState.getValue().getIsEditBasicInfo()) {
            V(p.b.f94982a);
        }
    }

    private final void b0(String currentPassword, String newPassword) {
        l lVar = this;
        a.Email email = lVar._profileState.getValue().getUnsavedAccountInformation().getEmail();
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = lVar._profileState;
        while (true) {
            ProfileScreenViewState value = interfaceC17140B.getValue();
            ProfileScreenViewState profileScreenViewState = value;
            if (interfaceC17140B.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, AccountInformationDecorator.f(profileScreenViewState.getSavedAccountInformation(), null, null, null, null, true, null, null, false, null, null, null, null, null, null, 16367, null), null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048567, null))) {
                C16648k.d(d0.a(lVar), null, null, lVar.new n(email, currentPassword, newPassword, null), 3, null);
                return;
            }
            lVar = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(java.lang.String r8, java.lang.String r9, kotlin.coroutines.Continuation<? super kotlin.Result<Dh.UpdateConfirmationResponse>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.meijer.mobile.accounts.ux.profile.l.p
            if (r0 == 0) goto L13
            r0 = r10
            com.meijer.mobile.accounts.ux.profile.l$p r0 = (com.meijer.mobile.accounts.ux.profile.l.p) r0
            int r1 = r0.f94955m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94955m = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.profile.l$p r0 = new com.meijer.mobile.accounts.ux.profile.l$p
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f94953k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f94955m
            r3 = 1
            if (r2 == 0) goto L4b
            if (r2 != r3) goto L43
            java.lang.Object r8 = r0.f94948f
            com.meijer.mobile.accounts.ux.profile.l r8 = (com.meijer.mobile.accounts.ux.profile.l) r8
            java.lang.Object r8 = r0.f94947e
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            java.lang.Object r8 = r0.f94946d
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            java.lang.Object r8 = r0.f94945c
            com.meijer.mobile.accounts.ux.profile.l r8 = (com.meijer.mobile.accounts.ux.profile.l) r8
            java.lang.Object r8 = r0.f94944b
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.f94943a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L41
            goto L80
        L41:
            r8 = move-exception
            goto L85
        L43:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4b:
            kotlin.ResultKt.b(r10)
            Oj.c r10 = r7.loadingStatesManager
            Oj.a$b r2 = new Oj.a$b
            java.lang.String r4 = "mperks pin"
            r5 = 2
            r6 = 0
            r2.<init>(r4, r6, r5, r6)
            r10.b(r2)
            kotlin.Result$Companion r10 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L41
            Bh.e r10 = w(r7)     // Catch: java.lang.Exception -> L41
            r0.f94943a = r8     // Catch: java.lang.Exception -> L41
            r0.f94944b = r9     // Catch: java.lang.Exception -> L41
            r0.f94945c = r7     // Catch: java.lang.Exception -> L41
            r0.f94946d = r0     // Catch: java.lang.Exception -> L41
            r0.f94947e = r0     // Catch: java.lang.Exception -> L41
            r0.f94948f = r7     // Catch: java.lang.Exception -> L41
            r2 = 0
            r0.f94949g = r2     // Catch: java.lang.Exception -> L41
            r0.f94950h = r2     // Catch: java.lang.Exception -> L41
            r0.f94951i = r2     // Catch: java.lang.Exception -> L41
            r0.f94952j = r2     // Catch: java.lang.Exception -> L41
            r0.f94955m = r3     // Catch: java.lang.Exception -> L41
            java.lang.Object r10 = r10.u(r8, r9, r0)     // Catch: java.lang.Exception -> L41
            if (r10 != r1) goto L80
            return r1
        L80:
            java.lang.Object r8 = kotlin.Result.b(r10)     // Catch: java.lang.Exception -> L41
            return r8
        L85:
            kotlin.coroutines.CoroutineContext r9 = r0.getContext()
            qv.E0.i(r9)
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.a(r8)
            java.lang.Object r8 = kotlin.Result.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.d0(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e0(boolean r12, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<Dh.Preference>>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.meijer.mobile.accounts.ux.profile.l.q
            if (r0 == 0) goto L14
            r0 = r13
            com.meijer.mobile.accounts.ux.profile.l$q r0 = (com.meijer.mobile.accounts.ux.profile.l.q) r0
            int r1 = r0.f94967l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f94967l = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            com.meijer.mobile.accounts.ux.profile.l$q r0 = new com.meijer.mobile.accounts.ux.profile.l$q
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.f94965j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r13.f94967l
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r12 = r13.f94960e
            com.meijer.mobile.accounts.ux.profile.l r12 = (com.meijer.mobile.accounts.ux.profile.l) r12
            java.lang.Object r12 = r13.f94959d
            kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
            java.lang.Object r12 = r13.f94958c
            kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
            java.lang.Object r12 = r13.f94957b
            com.meijer.mobile.accounts.ux.profile.l r12 = (com.meijer.mobile.accounts.ux.profile.l) r12
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Exception -> L3b
            goto L8a
        L3b:
            r0 = move-exception
            r12 = r0
            goto L8f
        L3e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L46:
            kotlin.ResultKt.b(r0)
            Oj.c r0 = r11.loadingStatesManager
            Oj.a$b r2 = new Oj.a$b
            java.lang.String r4 = "quick id"
            r5 = 2
            r6 = 0
            r2.<init>(r4, r6, r5, r6)
            r0.b(r2)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3b
            Bh.d r0 = v(r11)     // Catch: java.lang.Exception -> L3b
            Dh.o r4 = new Dh.o     // Catch: java.lang.Exception -> L3b
            Dh.p r5 = Dh.p.f6562f     // Catch: java.lang.Exception -> L3b
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L3b
            java.util.List r12 = kotlin.collections.CollectionsKt.e(r4)     // Catch: java.lang.Exception -> L3b
            r13.f94957b = r11     // Catch: java.lang.Exception -> L3b
            r13.f94958c = r13     // Catch: java.lang.Exception -> L3b
            r13.f94959d = r13     // Catch: java.lang.Exception -> L3b
            r13.f94960e = r11     // Catch: java.lang.Exception -> L3b
            r13.f94956a = r6     // Catch: java.lang.Exception -> L3b
            r2 = 0
            r13.f94961f = r2     // Catch: java.lang.Exception -> L3b
            r13.f94962g = r2     // Catch: java.lang.Exception -> L3b
            r13.f94963h = r2     // Catch: java.lang.Exception -> L3b
            r13.f94964i = r2     // Catch: java.lang.Exception -> L3b
            r13.f94967l = r3     // Catch: java.lang.Exception -> L3b
            java.lang.Object r0 = r0.e(r12, r13)     // Catch: java.lang.Exception -> L3b
            if (r0 != r1) goto L8a
            return r1
        L8a:
            java.lang.Object r12 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L3b
            return r12
        L8f:
            kotlin.coroutines.CoroutineContext r13 = r13.getContext()
            qv.E0.i(r13)
            kotlin.Result$Companion r13 = kotlin.Result.INSTANCE
            java.lang.Object r12 = kotlin.ResultKt.a(r12)
            java.lang.Object r12 = kotlin.Result.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.e0(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void f0() {
        ProfileScreenViewState value;
        ProfileScreenViewState profileScreenViewState;
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = this._profileState;
        do {
            value = interfaceC17140B.getValue();
            profileScreenViewState = value;
        } while (!interfaceC17140B.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, null, null, null, null, null, OrderPreferencesDecorator.f(profileScreenViewState.getSavedOrderPreferencesInformation(), 0, null, null, null, null, null, true, 63, null), null, false, false, null, false, false, false, false, false, false, false, 1048319, null)));
        C16648k.d(d0.a(this), null, null, new r(null), 3, null);
    }

    private final <T extends Zh.a<?>> void g0(T formField) {
        l lVar = this;
        AccountInformationDecorator accountInformationDecoratorW = lVar._profileState.getValue().getUnsavedAccountInformation().w(formField);
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = lVar._profileState;
        while (true) {
            ProfileScreenViewState value = interfaceC17140B.getValue();
            if (interfaceC17140B.e(value, ProfileScreenViewState.b(value, null, null, null, null, accountInformationDecoratorW, null, null, null, null, null, false, false, null, false, false, false, false, lVar.N(accountInformationDecoratorW), false, false, 917487, null))) {
                return;
            } else {
                lVar = this;
            }
        }
    }

    private final <T extends Zh.b<?>> void h0(T formField) {
        l lVar = this;
        BasicInformationDecorator basicInformationDecoratorR = lVar._profileState.getValue().getUnsavedBasicInformation().r(formField);
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = lVar._profileState;
        while (true) {
            ProfileScreenViewState value = interfaceC17140B.getValue();
            if (interfaceC17140B.e(value, ProfileScreenViewState.b(value, null, basicInformationDecoratorR, null, null, null, null, null, null, null, null, false, false, null, false, lVar.O(basicInformationDecoratorR), false, false, false, false, false, 1032189, null))) {
                return;
            } else {
                lVar = this;
            }
        }
    }

    private final void i0(String newPassword, String confirmPassword) {
        AccountInformationDecorator accountInformationDecoratorF = AccountInformationDecorator.f(this._profileState.getValue().getUnsavedAccountInformation(), null, null, null, null, false, null, null, false, null, Intrinsics.e(newPassword, confirmPassword) ? null : AbstractC5607a.INSTANCE.d(Fh.h.f10510F1, new Object[0]), null, null, null, null, 15871, null);
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = this._profileState;
        while (true) {
            ProfileScreenViewState value = interfaceC17140B.getValue();
            AccountInformationDecorator accountInformationDecorator = accountInformationDecoratorF;
            if (interfaceC17140B.e(value, ProfileScreenViewState.b(value, null, null, null, null, accountInformationDecorator, null, null, null, null, null, false, false, null, false, false, false, false, N(accountInformationDecoratorF), false, false, 917487, null))) {
                return;
            } else {
                accountInformationDecoratorF = accountInformationDecorator;
            }
        }
    }

    private final <T extends Zj.a<?>> void j0(T formField) {
        com.meijer.mobile.accounts.ux.profile.p screen = this._profileState.getValue().getScreen();
        if (Intrinsics.e(screen, p.a.f94981a)) {
            Intrinsics.h(formField, "null cannot be cast to non-null type com.meijer.mobile.accounts.ux.profile.formfields.AccountInfoFormField<*>");
            g0((Zh.a) formField);
            return;
        }
        if (Intrinsics.e(screen, p.b.f94982a)) {
            Intrinsics.h(formField, "null cannot be cast to non-null type com.meijer.mobile.accounts.ux.profile.formfields.BasicInfoFormField<*>");
            h0((Zh.b) formField);
        } else if (Intrinsics.e(screen, p.c.f94983a)) {
            Intrinsics.h(formField, "null cannot be cast to non-null type com.meijer.mobile.accounts.ux.profile.formfields.MperksInfoFormField<*>");
            k0((Zh.d) formField);
        } else {
            if (!Intrinsics.e(screen, p.d.f94984a)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.h(formField, "null cannot be cast to non-null type com.meijer.mobile.accounts.ux.profile.formfields.OrderPreferencesFormField<*>");
            l0((Zh.e) formField);
        }
    }

    private final <T extends Zh.d<?>> void k0(T formField) {
        l lVar = this;
        MperksInformationDecorator mperksInformationDecoratorM = lVar._profileState.getValue().getUnsavedMperksInformation().m(formField);
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = lVar._profileState;
        while (true) {
            ProfileScreenViewState value = interfaceC17140B.getValue();
            if (interfaceC17140B.e(value, ProfileScreenViewState.b(value, null, null, null, null, null, null, mperksInformationDecoratorM, null, null, null, false, false, null, false, false, lVar.P(mperksInformationDecoratorM), false, false, false, false, 1015743, null))) {
                return;
            } else {
                lVar = this;
            }
        }
    }

    private final <T extends Zh.e<?>> void l0(T formField) {
        l lVar = this;
        OrderPreferencesDecorator orderPreferencesDecoratorN = lVar._profileState.getValue().getUnsavedOrderPreferencesInformation().n(formField);
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = lVar._profileState;
        while (true) {
            ProfileScreenViewState value = interfaceC17140B.getValue();
            if (interfaceC17140B.e(value, ProfileScreenViewState.b(value, null, null, null, null, null, null, null, null, null, orderPreferencesDecoratorN, false, false, null, false, false, false, lVar.Q(orderPreferencesDecoratorN), false, false, false, 982527, null))) {
                return;
            } else {
                lVar = this;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onLoadingStates(java.util.List<? extends Oj.a> r37) {
        /*
            r36 = this;
            r0 = r37
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L33
            r0 = r37
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L1c
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1c
            goto L33
        L1c:
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            Oj.a r1 = (Oj.a) r1
            boolean r1 = r1 instanceof Oj.a.Loading
            if (r1 == 0) goto L20
            r0 = 1
        L31:
            r5 = r0
            goto L35
        L33:
            r0 = 0
            goto L31
        L35:
            r0 = r37
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L42:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof Oj.a.Failed
            if (r2 == 0) goto L42
            r8.add(r1)
            goto L42
        L54:
            r11 = r36
            tv.B<com.meijer.mobile.accounts.ux.profile.l$e> r0 = r11._profileState
        L58:
            java.lang.Object r12 = r0.getValue()
            r13 = r12
            com.meijer.mobile.accounts.ux.profile.l$e r13 = (com.meijer.mobile.accounts.ux.profile.l.ProfileScreenViewState) r13
            Xh.d r1 = r13.getSavedMperksInformation()
            r9 = 23
            r10 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = r37
            Xh.d r19 = Xh.MperksInformationDecorator.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r34 = 1048543(0xfffdf, float:1.469322E-39)
            r35 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            com.meijer.mobile.accounts.ux.profile.l$e r1 = com.meijer.mobile.accounts.ux.profile.l.ProfileScreenViewState.b(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r1 = r0.e(r12, r1)
            if (r1 == 0) goto L58
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.onLoadingStates(java.util.List):void");
    }

    public final P<ProfileScreenViewState> M() {
        return this.profileState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(c action) {
        ProfileScreenViewState value;
        ProfileScreenViewState profileScreenViewState;
        MperksInformationDecorator mperksInformationDecoratorF;
        ProfileScreenViewState value2;
        ProfileScreenViewState profileScreenViewState2;
        ProfileScreenViewState value3;
        ProfileScreenViewState profileScreenViewState3;
        ProfileScreenViewState value4;
        ProfileScreenViewState profileScreenViewState4;
        ProfileScreenViewState value5;
        ProfileScreenViewState value6;
        ProfileScreenViewState profileScreenViewState5;
        BasicInformationDecorator basicInformationDecoratorG;
        List list;
        BasicInformationDecorator basicInformationDecoratorG2;
        AccountInformationDecorator accountInformationDecoratorF;
        AccountInformationDecorator accountInformationDecoratorF2;
        MperksInformationDecorator mperksInformationDecorator;
        int i10;
        AbstractC5607a abstractC5607a;
        boolean z10;
        boolean z11;
        List list2;
        Object[] objArr;
        Intrinsics.j(action, "action");
        int i11 = 3;
        Validation validation = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        if (Intrinsics.e(action, c.a.f94750a)) {
            InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = this._profileState;
            do {
                value6 = interfaceC17140B.getValue();
                profileScreenViewState5 = value6;
                basicInformationDecoratorG = BasicInformationDecorator.g(profileScreenViewState5.getSavedBasicInformation(), null, null, null, null, null, null, null, null, false, null, null, 1855, null);
                list = null;
                basicInformationDecoratorG2 = BasicInformationDecorator.g(profileScreenViewState5.getUnsavedBasicInformation(), null, null, null, null, null, null, null, null, false, null, null, 1855, null);
                accountInformationDecoratorF = AccountInformationDecorator.f(profileScreenViewState5.getUnsavedAccountInformation(), null, new a.CurrentPassword(validation, objArr18 == true ? 1 : 0, i11, objArr17 == true ? 1 : 0), new a.NewPassword(objArr16 == true ? 1 : 0, objArr15 == true ? 1 : 0, i11, objArr14 == true ? 1 : 0), new a.ConfirmPassword(objArr13 == true ? 1 : 0, objArr12 == true ? 1 : 0, i11, objArr11 == true ? 1 : 0), false, null, null, false, null, null, x.f14036a, z.b(), null, null, 12785, null);
                accountInformationDecoratorF2 = AccountInformationDecorator.f(profileScreenViewState5.getSavedAccountInformation(), null, null, null, null, false, null, null, false, null, null, null, null, null, null, 16223, null);
                boolean z12 = false;
                mperksInformationDecorator = new MperksInformationDecorator(null, null, null, z12, profileScreenViewState5.getSavedMperksInformation().getIsQuickIDEnabled(), null, list, 111, null);
                i10 = l3.f92485d;
                abstractC5607a = null;
                z10 = false;
                z11 = false;
                list2 = null;
                objArr = 0 == true ? 1 : 0;
            } while (!interfaceC17140B.e(value6, ProfileScreenViewState.b(profileScreenViewState5, basicInformationDecoratorG, basicInformationDecoratorG2, null, accountInformationDecoratorF2, accountInformationDecoratorF, mperksInformationDecorator, new MperksInformationDecorator(0 == true ? 1 : 0, objArr, abstractC5607a, z10, z11, list, list2, i10, null), null, OrderPreferencesDecorator.f(profileScreenViewState5.getSavedOrderPreferencesInformation(), 0, null, null, null, null, null, false, 111, null), OrderPreferencesDecorator.f(profileScreenViewState5.getUnsavedOrderPreferencesInformation(), 0, null, null, null, null, null, false, 111, null), false, false, null, false, false, false, false, false, false, false, 793732, null)));
            return;
        }
        if (Intrinsics.e(action, c.b.f94751a)) {
            InterfaceC17140B<ProfileScreenViewState> interfaceC17140B2 = this._profileState;
            do {
                value5 = interfaceC17140B2.getValue();
            } while (!interfaceC17140B2.e(value5, ProfileScreenViewState.b(value5, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1046527, null)));
            return;
        }
        if (action instanceof c.DismissErrorNotification) {
            c.DismissErrorNotification dismissErrorNotification = (c.DismissErrorNotification) action;
            E(dismissErrorNotification.getIsPhoneConflictError(), dismissErrorNotification.getIsMperksPinUpdateError());
            return;
        }
        if (Intrinsics.e(action, c.C1345l.f94763a)) {
            c0();
            return;
        }
        if (action instanceof c.SendEmail) {
            Y(this, ((c.SendEmail) action).getEmail(), false, 2, null);
            return;
        }
        if (action instanceof c.ResendEmail) {
            X(((c.ResendEmail) action).getEmail(), true);
            return;
        }
        if (action instanceof c.UpdateAccountInfo) {
            c.UpdateAccountInfo updateAccountInfo = (c.UpdateAccountInfo) action;
            b0(updateAccountInfo.getCurrentPassword(), updateAccountInfo.getNewPassword());
            return;
        }
        if (action instanceof c.UpdateMperksInfo) {
            c.UpdateMperksInfo updateMperksInfo = (c.UpdateMperksInfo) action;
            W(updateMperksInfo.getIsQuickIDEnabled(), updateMperksInfo.getNewPin(), updateMperksInfo.getCurrentPin());
            return;
        }
        if (Intrinsics.e(action, c.n.f94767a)) {
            f0();
            return;
        }
        if (action instanceof c.OnEditClick) {
            V(((c.OnEditClick) action).getScreen());
            return;
        }
        if (action instanceof c.OnFormFieldChange) {
            j0(((c.OnFormFieldChange) action).a());
            return;
        }
        if (Intrinsics.e(action, c.e.f94755a)) {
            InterfaceC17140B<ProfileScreenViewState> interfaceC17140B3 = this._profileState;
            do {
                value4 = interfaceC17140B3.getValue();
                profileScreenViewState4 = value4;
            } while (!interfaceC17140B3.e(value4, ProfileScreenViewState.b(profileScreenViewState4, null, null, null, null, AccountInformationDecorator.f(profileScreenViewState4.getUnsavedAccountInformation(), null, new a.CurrentPassword(objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, i11, objArr8 == true ? 1 : 0), new a.NewPassword(objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, i11, objArr5 == true ? 1 : 0), new a.ConfirmPassword(objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, i11, objArr2 == true ? 1 : 0), false, null, null, false, w0.f30591b, null, x.f14036a, z.b(), null, null, 12529, null), null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048559, null)));
            return;
        }
        if (Intrinsics.e(action, c.f.f94756a)) {
            InterfaceC17140B<ProfileScreenViewState> interfaceC17140B4 = this._profileState;
            do {
                value3 = interfaceC17140B4.getValue();
                profileScreenViewState3 = value3;
            } while (!interfaceC17140B4.e(value3, ProfileScreenViewState.b(profileScreenViewState3, null, null, null, AccountInformationDecorator.f(profileScreenViewState3.getSavedAccountInformation(), null, null, null, null, false, null, null, false, null, null, null, null, null, null, 16351, null), AccountInformationDecorator.f(profileScreenViewState3.getUnsavedAccountInformation(), null, null, null, null, false, null, null, false, w0.f30592c, null, null, null, null, null, 16127, null), null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048551, null)));
            return;
        }
        if (!(action instanceof c.ValidateConfirmPassword)) {
            if (!(action instanceof c.OnQuickIDChange)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC17140B<ProfileScreenViewState> interfaceC17140B5 = this._profileState;
            do {
                value = interfaceC17140B5.getValue();
                profileScreenViewState = value;
                mperksInformationDecoratorF = MperksInformationDecorator.f(profileScreenViewState.getUnsavedMperksInformation(), null, null, null, false, ((c.OnQuickIDChange) action).getIsEnabled(), null, null, 111, null);
            } while (!interfaceC17140B5.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, null, null, null, mperksInformationDecoratorF, null, null, null, false, false, null, false, false, P(mperksInformationDecoratorF), false, false, false, false, 1015743, null)));
            return;
        }
        c.ValidateConfirmPassword validateConfirmPassword = (c.ValidateConfirmPassword) action;
        if (!validateConfirmPassword.getIsFocused()) {
            i0(validateConfirmPassword.getNewPassword(), validateConfirmPassword.getConfirmPassword());
            return;
        }
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140B6 = this._profileState;
        do {
            value2 = interfaceC17140B6.getValue();
            profileScreenViewState2 = value2;
        } while (!interfaceC17140B6.e(value2, ProfileScreenViewState.b(profileScreenViewState2, null, null, null, null, AccountInformationDecorator.f(profileScreenViewState2.getUnsavedAccountInformation(), null, null, null, null, false, null, null, false, null, null, null, null, null, null, 15871, null), null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048559, null)));
    }

    public final void Z(boolean isFromPaymentsScreen, boolean isEditBasicInfo) {
        ProfileScreenViewState value;
        InterfaceC17140B<ProfileScreenViewState> interfaceC17140B = this._profileState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ProfileScreenViewState.b(value, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, isFromPaymentsScreen, isEditBasicInfo, 262143, null)));
    }

    private final void G() {
        C16648k.d(d0.a(this), null, null, new g(null), 3, null);
    }

    private final boolean O(BasicInformationDecorator basicInformationDecorator) {
        if (basicInformationDecorator.getFirstName().f().isValid() && basicInformationDecorator.getLastName().f().isValid() && basicInformationDecorator.getPhoneNumber().f().isValid() && basicInformationDecorator.getZipCode().f().isValid()) {
            if (!Intrinsics.e(basicInformationDecorator, new BasicInformationDecorator(null, null, null, null, null, null, null, null, false, null, null, 2047, null)) && !Intrinsics.e(basicInformationDecorator.s(), this._profileState.getValue().getSavedBasicInformation().s())) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final boolean P(MperksInformationDecorator mperksInformationDecorator) {
        if (U(mperksInformationDecorator)) {
            if (this._profileState.getValue().getSavedMperksInformation().getIsQuickIDEnabled() == mperksInformationDecorator.getIsQuickIDEnabled()) {
                return false;
            }
            return true;
        }
        if (mperksInformationDecorator.getCurrentPin().f().isValid() && mperksInformationDecorator.getNewPin().f().isValid()) {
            if (!Intrinsics.e(mperksInformationDecorator, new MperksInformationDecorator(null, null, null, false, false, null, null, l3.f92485d, null)) && !Intrinsics.e(mperksInformationDecorator.n(), this._profileState.getValue().getSavedMperksInformation().n())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(Object mperksResponse) {
        if (Result.g(mperksResponse)) {
            mperksResponse = null;
        }
        UpdateConfirmationResponse updateConfirmationResponse = (UpdateConfirmationResponse) mperksResponse;
        if (updateConfirmationResponse != null && updateConfirmationResponse.getIsSuccess()) {
            this.loadingStatesManager.b(new a.NotLoading("mperks pin"));
        } else {
            this.loadingStatesManager.b(new a.Failed("mperks pin", AbstractC5607a.INSTANCE.d(Fh.h.f10780r5, new Object[0])));
        }
    }

    private final boolean U(MperksInformationDecorator mperksInformationDecorator) {
        if (mperksInformationDecorator.getCurrentPin().c().e().length() == 0 && mperksInformationDecorator.getNewPin().c().e().length() == 0) {
            return true;
        }
        return false;
    }

    private final void W(Boolean isQuickIDEnabled, String newPin, String currentPin) {
        C16648k.d(d0.a(this), null, null, new C1346l(currentPin, newPin, isQuickIDEnabled, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object m(l lVar, List list, Continuation continuation) {
        lVar.onLoadingStates(list);
        return Unit.f142422a;
    }
}
