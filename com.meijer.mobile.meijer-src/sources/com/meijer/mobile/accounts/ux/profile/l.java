package com.meijer.mobile.accounts.ux.profile;

import Cs.MeijerAccount;
import Eh.B;
import Eh.CustomerPreference;
import Eh.PasswordChangeInfo;
import Eh.Preference;
import Eh.ProfileInformation;
import Eh.UpdateAccountInformationResponse;
import Eh.UpdateBasicInfoResponse;
import Eh.UpdateConfirmationResponse;
import Eh.UpdateOrderPreferencesResponse;
import Eh.VehicleDescriptionChangeInfo;
import Eh.VehicleInformation;
import Fh.DiscretePreferenceChoice;
import Ik.Validation;
import Jh.x;
import Jh.z;
import Pj.a;
import Rh.w0;
import Yh.AccountInformationDecorator;
import Yh.BasicInformationDecorator;
import Yh.MperksInformationDecorator;
import Yh.OrderPreferencesDecorator;
import Yh.YourMeijerStoreCardDecorator;
import ai.AbstractC5691a;
import ai.AbstractC5692b;
import ai.AbstractC5694d;
import ai.AbstractC5695e;
import ak.InterfaceC5697a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import bk.C6393b;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.accounts.ux.profile.p;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
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
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16562g;
import pv.P;
import pv.S;
import yh.C18316c;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0090\u00012\u00020\u0001:\u0004\u0081\u0001{}B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JC\u0010!\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b&\u0010$J\u001c\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\f0\u001eH\u0082@¢\u0006\u0004\b(\u0010$J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0082@¢\u0006\u0004\b)\u0010$J-\u0010.\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u00142\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b.\u0010/J#\u00101\u001a\u00020\u000f2\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\f0\u001eH\u0002¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u00020\u000f2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u001eH\u0002¢\u0006\u0004\b5\u00102J&\u00108\u001a\b\u0012\u0004\u0012\u0002030\u001e2\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020+H\u0082@¢\u0006\u0004\b8\u00109J$\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\f0\u001e2\u0006\u0010:\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u0014H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u000fH\u0002¢\u0006\u0004\b@\u0010\u0013J\u001f\u0010C\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020+2\u0006\u0010B\u001a\u00020+H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000fH\u0002¢\u0006\u0004\bE\u0010\u0013J!\u0010H\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020+2\b\b\u0002\u0010G\u001a\u00020\u0014H\u0002¢\u0006\u0004\bH\u0010IJ%\u0010L\u001a\u00020\u000f\"\f\b\u0000\u00101*\u0006\u0012\u0002\b\u00030J2\u0006\u0010K\u001a\u00028\u0000H\u0002¢\u0006\u0004\bL\u0010MJ%\u0010O\u001a\u00020\u000f\"\f\b\u0000\u00101*\u0006\u0012\u0002\b\u00030N2\u0006\u0010K\u001a\u00028\u0000H\u0002¢\u0006\u0004\bO\u0010PJ\u0013\u0010R\u001a\u00020\u0014*\u00020QH\u0002¢\u0006\u0004\bR\u0010SJ%\u0010U\u001a\u00020\u000f\"\f\b\u0000\u00101*\u0006\u0012\u0002\b\u00030T2\u0006\u0010K\u001a\u00028\u0000H\u0002¢\u0006\u0004\bU\u0010VJ\u0013\u0010X\u001a\u00020\u0014*\u00020WH\u0002¢\u0006\u0004\bX\u0010YJ\u0013\u0010Z\u001a\u00020\u0014*\u00020WH\u0002¢\u0006\u0004\bZ\u0010YJ%\u0010\\\u001a\u00020\u000f\"\f\b\u0000\u00101*\u0006\u0012\u0002\b\u00030[2\u0006\u0010K\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\\\u0010]J\u0013\u0010_\u001a\u00020\u0014*\u00020^H\u0002¢\u0006\u0004\b_\u0010`J%\u0010b\u001a\u00020\u000f\"\f\b\u0000\u00101*\u0006\u0012\u0002\b\u00030a2\u0006\u0010K\u001a\u00028\u0000H\u0002¢\u0006\u0004\bb\u0010cJ\u0013\u0010e\u001a\u00020\u0014*\u00020dH\u0002¢\u0006\u0004\be\u0010fJ\u0017\u0010i\u001a\u00020\u000f2\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\bi\u0010jJ\u001f\u0010m\u001a\u00020\u000f2\u0006\u0010k\u001a\u00020\u00142\u0006\u0010l\u001a\u00020\u0014H\u0002¢\u0006\u0004\bm\u0010nJ\u001f\u0010p\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020+2\u0006\u0010o\u001a\u00020+H\u0002¢\u0006\u0004\bp\u0010DJ\u001d\u0010r\u001a\u00020\u000f2\u0006\u0010q\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u0014¢\u0006\u0004\br\u0010nJ\u0015\u0010u\u001a\u00020\u000f2\u0006\u0010t\u001a\u00020s¢\u0006\u0004\bu\u0010vR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001e\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R$\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0080\u00010\u0084\u00018\u0006¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001d\u0010\u008f\u0001\u001a\u00030\u008a\u00018\u0006¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u0091\u0001"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l;", "Landroidx/lifecycle/c0;", "LCh/e;", "profileRepository", "LCh/d;", "preferencesRepository", "LCh/c;", "accountsAMSRepository", "Lzl/k;", "featureManager", "<init>", "(LCh/e;LCh/d;LCh/c;Lzl/k;)V", "", "LPj/a;", "loadingStates", "", "onLoadingStates", "(Ljava/util/List;)V", "G", "()V", "", "isFailure", "Lbk/a;", "L", "(Z)Lbk/a;", "LEh/v;", "profileInformation", "accountResultFailureMessage", "customerPreferencesFailureMessage", "vehicleInformationFailureMessage", "Lkotlin/Result;", "LEh/o;", "quickID", "a0", "(LEh/v;Lbk/a;Lbk/a;Lbk/a;Ljava/lang/Object;)V", "J", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "K", "F", "LFh/b;", "I", "H", "isQuickIDEnabled", "", "newPin", "currentPin", "W", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "quickIDResponse", "T", "(Ljava/lang/Object;)V", "LEh/D;", "mperksResponse", "S", "updatedCurrentPin", "updatedNewPin", "e0", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEnabled", "f0", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEditBasicInfo", "b0", "(Z)V", "d0", "currentPassword", "newPassword", "c0", "(Ljava/lang/String;Ljava/lang/String;)V", "g0", "email", "isResendEmail", "X", "(Ljava/lang/String;Z)V", "Lak/a;", "formField", "k0", "(Lak/a;)V", "Lai/b;", "i0", "(Lai/b;)V", "LYh/b;", "O", "(LYh/b;)Z", "Lai/d;", "l0", "(Lai/d;)V", "LYh/d;", "P", "(LYh/d;)Z", "U", "Lai/e;", "m0", "(Lai/e;)V", "LYh/e;", "Q", "(LYh/e;)Z", "Lai/a;", "h0", "(Lai/a;)V", "LYh/a;", "N", "(LYh/a;)Z", "Lcom/meijer/mobile/accounts/ux/profile/p;", "screen", "V", "(Lcom/meijer/mobile/accounts/ux/profile/p;)V", "isPhoneConflictError", "isMperksPinError", "E", "(ZZ)V", "confirmPassword", "j0", "isFromPaymentsScreen", "Z", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "action", "R", "(Lcom/meijer/mobile/accounts/ux/profile/l$c;)V", "a", "LCh/e;", "b", "LCh/d;", "c", "LCh/c;", "d", "Lzl/k;", "Lpv/B;", "Lcom/meijer/mobile/accounts/ux/profile/l$e;", "e", "Lpv/B;", "_profileState", "Lpv/P;", "f", "Lpv/P;", "M", "()Lpv/P;", "profileState", "LPj/c;", "g", "LPj/c;", "getLoadingStatesManager", "()LPj/c;", "loadingStatesManager", "h", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class l extends c0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f95585i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ch.e profileRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ch.d preferencesRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ch.c accountsAMSRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ProfileScreenViewState> _profileState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<ProfileScreenViewState> profileState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Pj.c loadingStatesManager;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends AdaptedFunctionReference implements Function2<List<? extends Pj.a>, Continuation<? super Unit>, Object>, SuspendFunction {
        a(Object obj) {
            super(2, obj, l.class, "onLoadingStates", "onLoadingStates(Ljava/util/List;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends Pj.a> list, Continuation<? super Unit> continuation) {
            return l.m((l) this.f143708a, list, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpv/g;", "", "LPj/a;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$2", f = "ProfileScreenViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function3<InterfaceC16562g<? super List<? extends Pj.a>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95593a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f95594b;

        b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super List<? extends Pj.a>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            b bVar = new b(continuation);
            bVar.f95594b = th2;
            return bVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f95593a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f95594b, "Caught exception on loadingStateStream", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c;", "", "<init>", "()V", "a", "c", "b", "d", "m", "j", "i", "k", "o", "l", "n", "f", "e", "g", "h", "Lcom/meijer/mobile/accounts/ux/profile/l$c$a;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$b;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$c;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$d;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$e;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$f;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$g;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$h;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$i;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$j;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$k;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$l;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$m;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$n;", "Lcom/meijer/mobile/accounts/ux/profile/l$c$o;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$a;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final a f95595a = new a();

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
            public static final b f95596a = new b();

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
            public static final e f95600a = new e();

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
            public static final f f95601a = new f();

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$c$g;", "Lcom/meijer/mobile/accounts/ux/profile/l$c;", "Lak/a;", "field", "<init>", "(Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "()Lak/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$c$g, reason: from toString */
        public static final /* data */ class OnFormFieldChange extends c {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC5697a<?> field;

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
            public OnFormFieldChange(InterfaceC5697a<?> field) {
                super(null);
                Intrinsics.j(field, "field");
                this.field = field;
            }

            public final InterfaceC5697a<?> a() {
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
        public static final /* data */ class C1354l extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final C1354l f95608a = new C1354l();

            private C1354l() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1354l);
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
            public static final n f95612a = new n();

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

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJØ\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b,\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010B\u001a\u0004\bE\u0010DR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bC\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010HR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bI\u0010MR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\bK\u0010HR\u0017\u0010\u0018\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b9\u0010F\u001a\u0004\b4\u0010HR\u0017\u0010\u0019\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b/\u0010F\u001a\u0004\b8\u0010HR\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b>\u0010F\u001a\u0004\b:\u0010HR\u0017\u0010\u001b\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b0\u0010HR\u0017\u0010\u001c\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b@\u0010F\u001a\u0004\bN\u0010HR\u0017\u0010\u001d\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bO\u0010F\u001a\u0004\bO\u0010H¨\u0006P"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/l$e;", "", "LYh/b;", "savedBasicInformation", "unsavedBasicInformation", "LCs/a;", "originalMeijerAccount", "LYh/a;", "savedAccountInformation", "unsavedAccountInformation", "LYh/d;", "savedMperksInformation", "unsavedMperksInformation", "LYh/f;", "yourMeijerStoreInformation", "LYh/e;", "savedOrderPreferencesInformation", "unsavedOrderPreferencesInformation", "", "isLoading", "showSuccessNotification", "Lcom/meijer/mobile/accounts/ux/profile/p;", "screen", "shouldOpenModal", "hasPendingChangesOnBasicInformation", "hasPendingChangesOnMperksInformation", "hasPendingChangesOnOrderPreferences", "hasPendingChangesOnAccountInformation", "isFromPaymentsScreen", "isEditBasicInfo", "<init>", "(LYh/b;LYh/b;LCs/a;LYh/a;LYh/a;LYh/d;LYh/d;LYh/f;LYh/e;LYh/e;ZZLcom/meijer/mobile/accounts/ux/profile/p;ZZZZZZZ)V", "a", "(LYh/b;LYh/b;LCs/a;LYh/a;LYh/a;LYh/d;LYh/d;LYh/f;LYh/e;LYh/e;ZZLcom/meijer/mobile/accounts/ux/profile/p;ZZZZZZZ)Lcom/meijer/mobile/accounts/ux/profile/l$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LYh/b;", "i", "()LYh/b;", "b", "p", "c", "LCs/a;", "g", "()LCs/a;", "d", "LYh/a;", "h", "()LYh/a;", "e", "o", "f", "LYh/d;", "j", "()LYh/d;", "q", "LYh/f;", "s", "()LYh/f;", "LYh/e;", "k", "()LYh/e;", "r", "Z", "v", "()Z", "l", "n", "m", "Lcom/meijer/mobile/accounts/ux/profile/p;", "()Lcom/meijer/mobile/accounts/ux/profile/p;", "u", "t", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            this((i10 & 1) != 0 ? new BasicInformationDecorator(null, null, null, null, null, null, null, null, false, null, null, 2047, null) : basicInformationDecorator, (i10 & 2) != 0 ? new BasicInformationDecorator(null, null, null, null, null, null, null, null, false, null, null, 2047, null) : basicInformationDecorator2, (i10 & 4) != 0 ? new MeijerAccount(0L, null, null, null, null, null, null, null, null, null, null, 0, null, 0L, 0L, null, 0, null, 0L, 0, null, null, null, null, null, null, 0L, 134217727, null) : meijerAccount, (i10 & 8) != 0 ? new AccountInformationDecorator(null, null, null, null, false, null, null, false, null, null, null, null, null, null, 16383, null) : accountInformationDecorator, (i10 & 16) != 0 ? new AccountInformationDecorator(null, null, null, null, false, null, null, false, null, null, null, null, null, null, 16383, null) : accountInformationDecorator2, (i10 & 32) != 0 ? new MperksInformationDecorator(null, null, null, false, false, null, null, l3.f93324d, null) : mperksInformationDecorator, (i10 & 64) != 0 ? new MperksInformationDecorator(null, null, null, false, false, null, null, l3.f93324d, null) : mperksInformationDecorator2, (i10 & 128) != 0 ? new YourMeijerStoreCardDecorator(0, null, null, 7, null) : yourMeijerStoreCardDecorator, (i10 & 256) != 0 ? new OrderPreferencesDecorator(0, null, null, null, null, null, false, l3.f93324d, null) : orderPreferencesDecorator, (i10 & 512) != 0 ? new OrderPreferencesDecorator(0, null, null, null, null, null, false, l3.f93324d, null) : orderPreferencesDecorator2, (i10 & 1024) != 0 ? true : z10, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z11, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? p.b.f95840a : pVar, (i10 & 8192) != 0 ? false : z12, (i10 & 16384) != 0 ? false : z13, (i10 & 32768) != 0 ? false : z14, (i10 & 65536) != 0 ? false : z15, (i10 & 131072) != 0 ? false : z16, (i10 & 262144) != 0 ? false : z17, (i10 & 524288) != 0 ? false : z18);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel", f = "ProfileScreenViewModel.kt", l = {l3.f93323c}, m = "fetchCustomerPreferences")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f95636a;

        /* renamed from: b, reason: collision with root package name */
        Object f95637b;

        /* renamed from: c, reason: collision with root package name */
        Object f95638c;

        /* renamed from: d, reason: collision with root package name */
        Object f95639d;

        /* renamed from: e, reason: collision with root package name */
        Object f95640e;

        /* renamed from: f, reason: collision with root package name */
        int f95641f;

        /* renamed from: g, reason: collision with root package name */
        int f95642g;

        /* renamed from: h, reason: collision with root package name */
        int f95643h;

        /* renamed from: i, reason: collision with root package name */
        int f95644i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f95645j;

        /* renamed from: l, reason: collision with root package name */
        int f95647l;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f95645j = obj;
            this.f95647l |= Integer.MIN_VALUE;
            return l.this.F(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$fetchData$1", f = "ProfileScreenViewModel.kt", l = {116, 117, 118, 119, BinsView.TOTE_HEIGHT_DP, 123, 133}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f95648a;

        /* renamed from: b, reason: collision with root package name */
        Object f95649b;

        /* renamed from: c, reason: collision with root package name */
        Object f95650c;

        /* renamed from: d, reason: collision with root package name */
        Object f95651d;

        /* renamed from: e, reason: collision with root package name */
        int f95652e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEh/v;", "profileInformation", "", "<anonymous>", "(LEh/v;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$fetchData$1$2", f = "ProfileScreenViewModel.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<ProfileInformation, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f95654a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f95655b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ l f95656c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f95657d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f95658e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f95659f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f95660g;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f95656c, this.f95657d, this.f95658e, this.f95659f, this.f95660g, continuation);
                aVar.f95655b = obj;
                return aVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, Object obj, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f95656c = lVar;
                this.f95657d = abstractC6392a;
                this.f95658e = abstractC6392a2;
                this.f95659f = abstractC6392a3;
                this.f95660g = obj;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ProfileInformation profileInformation, Continuation<? super Unit> continuation) {
                return ((a) create(profileInformation, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f95654a == 0) {
                    ResultKt.b(obj);
                    this.f95656c.a0((ProfileInformation) this.f95655b, this.f95657d, this.f95658e, this.f95659f, this.f95660g);
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEh/v;", "profileInformation", "", "<anonymous>", "(LEh/v;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$fetchData$1$3", f = "ProfileScreenViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<ProfileInformation, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f95661a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f95662b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ l f95663c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f95664d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f95665e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f95666f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f95667g;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(this.f95663c, this.f95664d, this.f95665e, this.f95666f, this.f95667g, continuation);
                bVar.f95662b = obj;
                return bVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(l lVar, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, Object obj, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f95663c = lVar;
                this.f95664d = abstractC6392a;
                this.f95665e = abstractC6392a2;
                this.f95666f = abstractC6392a3;
                this.f95667g = obj;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ProfileInformation profileInformation, Continuation<? super Unit> continuation) {
                return ((b) create(profileInformation, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f95661a == 0) {
                    ResultKt.b(obj);
                    this.f95663c.a0((ProfileInformation) this.f95662b, this.f95664d, this.f95665e, this.f95666f, this.f95667g);
                    return Unit.f143329a;
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0145, code lost:
        
            if (pv.C16563h.k(r2, r6, r28) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0169, code lost:
        
            if (pv.C16563h.k(r2, r6, r28) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00d2 A[PHI: r2 r3
          0x00d2: PHI (r2v8 bk.a) = (r2v6 bk.a), (r2v11 bk.a) binds: [B:20:0x00ce, B:11:0x0068] A[DONT_GENERATE, DONT_INLINE]
          0x00d2: PHI (r3v5 java.lang.Object) = (r3v4 java.lang.Object), (r3v8 java.lang.Object) binds: [B:20:0x00ce, B:11:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x003b A[PHI: r2 r3 r4 r5
          0x003b: PHI (r2v19 bk.a) = (r2v16 bk.a), (r2v32 bk.a) binds: [B:31:0x0113, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x003b: PHI (r3v16 bk.a) = (r3v13 bk.a), (r3v21 bk.a) binds: [B:31:0x0113, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x003b: PHI (r4v13 bk.a) = (r4v10 bk.a), (r4v15 bk.a) binds: [B:31:0x0113, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
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
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel", f = "ProfileScreenViewModel.kt", l = {263}, m = "fetchMperksCardLinkingPreference-IoAF18A")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f95668a;

        /* renamed from: b, reason: collision with root package name */
        Object f95669b;

        /* renamed from: c, reason: collision with root package name */
        Object f95670c;

        /* renamed from: d, reason: collision with root package name */
        Object f95671d;

        /* renamed from: e, reason: collision with root package name */
        int f95672e;

        /* renamed from: f, reason: collision with root package name */
        int f95673f;

        /* renamed from: g, reason: collision with root package name */
        int f95674g;

        /* renamed from: h, reason: collision with root package name */
        int f95675h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f95676i;

        /* renamed from: k, reason: collision with root package name */
        int f95678k;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f95676i = obj;
            this.f95678k |= Integer.MIN_VALUE;
            Object objH = l.this.H(this);
            return objH == IntrinsicsKt.f() ? objH : Result.a(objH);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel", f = "ProfileScreenViewModel.kt", l = {259}, m = "fetchPreferenceDiscreteChoices-IoAF18A")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f95679a;

        /* renamed from: b, reason: collision with root package name */
        Object f95680b;

        /* renamed from: c, reason: collision with root package name */
        Object f95681c;

        /* renamed from: d, reason: collision with root package name */
        Object f95682d;

        /* renamed from: e, reason: collision with root package name */
        int f95683e;

        /* renamed from: f, reason: collision with root package name */
        int f95684f;

        /* renamed from: g, reason: collision with root package name */
        int f95685g;

        /* renamed from: h, reason: collision with root package name */
        int f95686h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f95687i;

        /* renamed from: k, reason: collision with root package name */
        int f95689k;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f95687i = obj;
            this.f95689k |= Integer.MIN_VALUE;
            Object objI = l.this.I(this);
            return objI == IntrinsicsKt.f() ? objI : Result.a(objI);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel", f = "ProfileScreenViewModel.kt", l = {243, 245}, m = "fetchProfileInformation")
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f95690a;

        /* renamed from: b, reason: collision with root package name */
        Object f95691b;

        /* renamed from: c, reason: collision with root package name */
        Object f95692c;

        /* renamed from: d, reason: collision with root package name */
        Object f95693d;

        /* renamed from: e, reason: collision with root package name */
        Object f95694e;

        /* renamed from: f, reason: collision with root package name */
        int f95695f;

        /* renamed from: g, reason: collision with root package name */
        int f95696g;

        /* renamed from: h, reason: collision with root package name */
        int f95697h;

        /* renamed from: i, reason: collision with root package name */
        int f95698i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f95699j;

        /* renamed from: l, reason: collision with root package name */
        int f95701l;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f95699j = obj;
            this.f95701l |= Integer.MIN_VALUE;
            return l.this.J(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel", f = "ProfileScreenViewModel.kt", l = {251}, m = "fetchVehicleInformation")
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f95702a;

        /* renamed from: b, reason: collision with root package name */
        Object f95703b;

        /* renamed from: c, reason: collision with root package name */
        Object f95704c;

        /* renamed from: d, reason: collision with root package name */
        Object f95705d;

        /* renamed from: e, reason: collision with root package name */
        Object f95706e;

        /* renamed from: f, reason: collision with root package name */
        int f95707f;

        /* renamed from: g, reason: collision with root package name */
        int f95708g;

        /* renamed from: h, reason: collision with root package name */
        int f95709h;

        /* renamed from: i, reason: collision with root package name */
        int f95710i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f95711j;

        /* renamed from: l, reason: collision with root package name */
        int f95713l;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f95711j = obj;
            this.f95713l |= Integer.MIN_VALUE;
            return l.this.K(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$saveMperksInfo$1", f = "ProfileScreenViewModel.kt", l = {281, 283, 286, 286, HttpResponseStatus.SUCCESS_UNKNOWN, 297, HttpResponseStatus.REDIRECTION_MOVED_PERMANENTLY, HttpResponseStatus.REDIRECTION_FOUND}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.accounts.ux.profile.l$l, reason: collision with other inner class name */
    static final class C1355l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f95714a;

        /* renamed from: b, reason: collision with root package name */
        Object f95715b;

        /* renamed from: c, reason: collision with root package name */
        Object f95716c;

        /* renamed from: d, reason: collision with root package name */
        Object f95717d;

        /* renamed from: e, reason: collision with root package name */
        Object f95718e;

        /* renamed from: f, reason: collision with root package name */
        Object f95719f;

        /* renamed from: g, reason: collision with root package name */
        Object f95720g;

        /* renamed from: h, reason: collision with root package name */
        Object f95721h;

        /* renamed from: i, reason: collision with root package name */
        int f95722i;

        /* renamed from: j, reason: collision with root package name */
        int f95723j;

        /* renamed from: k, reason: collision with root package name */
        int f95724k;

        /* renamed from: l, reason: collision with root package name */
        int f95725l;

        /* renamed from: m, reason: collision with root package name */
        int f95726m;

        /* renamed from: n, reason: collision with root package name */
        int f95727n;

        /* renamed from: o, reason: collision with root package name */
        int f95728o;

        /* renamed from: p, reason: collision with root package name */
        int f95729p;

        /* renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f95730q;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f95732s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f95733t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Boolean f95734u;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lkotlin/Result;", "LEh/D;", "<anonymous>", "(Lmv/O;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$saveMperksInfo$1$mperksResponse$1", f = "ProfileScreenViewModel.kt", l = {271}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$l$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Result<? extends UpdateConfirmationResponse>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f95735a;

            /* renamed from: b, reason: collision with root package name */
            Object f95736b;

            /* renamed from: c, reason: collision with root package name */
            int f95737c;

            /* renamed from: d, reason: collision with root package name */
            int f95738d;

            /* renamed from: e, reason: collision with root package name */
            int f95739e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f95740f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f95741g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ l f95742h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, String str2, l lVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f95740f = str;
                this.f95741g = str2;
                this.f95742h = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f95740f, this.f95741g, this.f95742h, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Result<? extends UpdateConfirmationResponse>> continuation) {
                return invoke2(interfaceC15783O, (Continuation<? super Result<UpdateConfirmationResponse>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super Result<UpdateConfirmationResponse>> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objE0;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f95739e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        objE0 = ((Result) obj).getValue();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    String str = this.f95740f;
                    if (str != null) {
                        String str2 = this.f95741g;
                        l lVar = this.f95742h;
                        if (str2 != null) {
                            this.f95735a = str;
                            this.f95736b = str2;
                            this.f95737c = 0;
                            this.f95738d = 0;
                            this.f95739e = 1;
                            objE0 = lVar.e0(str, str2, this);
                            if (objE0 == objF) {
                                return objF;
                            }
                        }
                    }
                    return null;
                }
                return Result.a(objE0);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmv/O;", "Lkotlin/Result;", "", "LEh/o;", "<anonymous>", "(Lmv/O;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$saveMperksInfo$1$quickIDResponse$1", f = "ProfileScreenViewModel.kt", l = {277}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.accounts.ux.profile.l$l$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Result<? extends List<? extends Preference>>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            boolean f95743a;

            /* renamed from: b, reason: collision with root package name */
            int f95744b;

            /* renamed from: c, reason: collision with root package name */
            int f95745c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Boolean f95746d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ l f95747e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Boolean bool, l lVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f95746d = bool;
                this.f95747e = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f95746d, this.f95747e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Result<? extends List<? extends Preference>>> continuation) {
                return invoke2(interfaceC15783O, (Continuation<? super Result<? extends List<Preference>>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super Result<? extends List<Preference>>> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF0;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f95745c;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        objF0 = ((Result) obj).getValue();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    Boolean bool = this.f95746d;
                    if (bool != null) {
                        l lVar = this.f95747e;
                        boolean zBooleanValue = bool.booleanValue();
                        this.f95743a = zBooleanValue;
                        this.f95744b = 0;
                        this.f95745c = 1;
                        objF0 = lVar.f0(zBooleanValue, this);
                        if (objF0 == objF) {
                            return objF;
                        }
                    } else {
                        return null;
                    }
                }
                return Result.a(objF0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1355l(String str, String str2, Boolean bool, Continuation<? super C1355l> continuation) {
            super(2, continuation);
            this.f95732s = str;
            this.f95733t = str2;
            this.f95734u = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1355l c1355l = l.this.new C1355l(this.f95732s, this.f95733t, this.f95734u, continuation);
            c1355l.f95730q = obj;
            return c1355l;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C1355l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
          0x0193: PHI (r2v8 mv.W) = (r2v5 mv.W), (r2v10 mv.W) binds: [B:22:0x0190, B:12:0x010e] A[DONT_GENERATE, DONT_INLINE]
          0x0193: PHI (r3v6 mv.W) = (r3v3 mv.W), (r3v8 mv.W) binds: [B:22:0x0190, B:12:0x010e] A[DONT_GENERATE, DONT_INLINE]
          0x0193: PHI (r4v9 mv.O) = (r4v6 mv.O), (r4v11 mv.O) binds: [B:22:0x0190, B:12:0x010e] A[DONT_GENERATE, DONT_INLINE]
          0x0193: PHI (r5v12 java.lang.Object) = (r5v9 java.lang.Object), (r5v17 java.lang.Object) binds: [B:22:0x0190, B:12:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x01b0 A[PHI: r2 r3 r4 r5
          0x01b0: PHI (r2v11 mv.W) = (r2v8 mv.W), (r2v13 mv.W) binds: [B:28:0x01ad, B:11:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          0x01b0: PHI (r3v9 mv.W) = (r3v6 mv.W), (r3v11 mv.W) binds: [B:28:0x01ad, B:11:0x00fb] A[DONT_GENERATE, DONT_INLINE]
          0x01b0: PHI (r4v12 mv.O) = (r4v9 mv.O), (r4v14 mv.O) binds: [B:28:0x01ad, B:11:0x00fb] A[DONT_GENERATE, DONT_INLINE]
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
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.C1355l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$sendEmail$2", f = "ProfileScreenViewModel.kt", l = {654}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f95748a;

        /* renamed from: b, reason: collision with root package name */
        Object f95749b;

        /* renamed from: c, reason: collision with root package name */
        Object f95750c;

        /* renamed from: d, reason: collision with root package name */
        Object f95751d;

        /* renamed from: e, reason: collision with root package name */
        int f95752e;

        /* renamed from: f, reason: collision with root package name */
        int f95753f;

        /* renamed from: g, reason: collision with root package name */
        int f95754g;

        /* renamed from: h, reason: collision with root package name */
        int f95755h;

        /* renamed from: i, reason: collision with root package name */
        int f95756i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f95757j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f95759l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f95760m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, boolean z10, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f95759l = str;
            this.f95760m = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m mVar = l.this.new m(this.f95759l, this.f95760m, continuation);
            mVar.f95757j = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            int i10 = this.f95756i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f95757j;
                    l lVar = l.this;
                    String str = this.f95759l;
                    Result.Companion companion = Result.INSTANCE;
                    Ch.e eVar = lVar.profileRepository;
                    this.f95757j = interfaceC15783O;
                    this.f95748a = interfaceC15783O;
                    this.f95749b = this;
                    this.f95750c = this;
                    this.f95751d = interfaceC15783O;
                    this.f95752e = 0;
                    this.f95753f = 0;
                    this.f95754g = 0;
                    this.f95755h = 0;
                    this.f95756i = 1;
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
            boolean z10 = this.f95760m;
            if (Result.h(objB)) {
                UpdateConfirmationResponse updateConfirmationResponse = (UpdateConfirmationResponse) objB;
                InterfaceC16549B interfaceC16549B = lVar2._profileState;
                do {
                    value2 = interfaceC16549B.getValue();
                    profileScreenViewState2 = (ProfileScreenViewState) value2;
                } while (!interfaceC16549B.e(value2, ProfileScreenViewState.b(profileScreenViewState2, null, null, null, AccountInformationDecorator.f(profileScreenViewState2.getSavedAccountInformation(), null, null, null, null, false, (updateConfirmationResponse.getIsSuccess() || z10) ? null : AbstractC6392a.INSTANCE.d(Gh.h.f12960q1, new Object[0]), null, updateConfirmationResponse.getIsSuccess(), null, null, null, null, (updateConfirmationResponse.getIsSuccess() || !z10) ? null : AbstractC6392a.INSTANCE.d(Gh.h.f12901h5, new Object[0]), (updateConfirmationResponse.getIsSuccess() || !z10) ? null : AbstractC6392a.INSTANCE.d(Gh.h.f13012x4, new Object[0]), 3919, null), AccountInformationDecorator.f(profileScreenViewState2.getUnsavedAccountInformation(), null, null, null, null, false, null, null, false, (updateConfirmationResponse.getIsSuccess() || !z10) ? w0.f33180d : w0.f33181e, null, null, null, null, null, 16127, null), null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048551, null)));
            }
            l lVar3 = l.this;
            boolean z11 = this.f95760m;
            if (Result.e(objB) != null) {
                InterfaceC16549B interfaceC16549B2 = lVar3._profileState;
                do {
                    value = interfaceC16549B2.getValue();
                    profileScreenViewState = (ProfileScreenViewState) value;
                } while (!interfaceC16549B2.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, AccountInformationDecorator.f(profileScreenViewState.getSavedAccountInformation(), null, null, null, null, false, z11 ? null : AbstractC6392a.INSTANCE.d(Gh.h.f12960q1, new Object[0]), null, false, null, null, null, null, z11 ? AbstractC6392a.INSTANCE.d(Gh.h.f12901h5, new Object[0]) : null, z11 ? AbstractC6392a.INSTANCE.d(Gh.h.f13012x4, new Object[0]) : null, 3919, null), AccountInformationDecorator.f(profileScreenViewState.getUnsavedAccountInformation(), null, null, null, null, false, null, null, false, w0.f33181e, null, null, null, null, null, 16127, null), null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048551, null)));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$updateAccount$2", f = "ProfileScreenViewModel.kt", l = {HttpResponseStatus.ERROR_UNSUPPORTED_MEDIA_TYPE}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f95761a;

        /* renamed from: b, reason: collision with root package name */
        Object f95762b;

        /* renamed from: c, reason: collision with root package name */
        Object f95763c;

        /* renamed from: d, reason: collision with root package name */
        Object f95764d;

        /* renamed from: e, reason: collision with root package name */
        int f95765e;

        /* renamed from: f, reason: collision with root package name */
        int f95766f;

        /* renamed from: g, reason: collision with root package name */
        int f95767g;

        /* renamed from: h, reason: collision with root package name */
        int f95768h;

        /* renamed from: i, reason: collision with root package name */
        int f95769i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f95770j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ MeijerAccount f95772l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f95773m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n nVar = l.this.new n(this.f95772l, this.f95773m, continuation);
            nVar.f95770j = obj;
            return nVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(MeijerAccount meijerAccount, boolean z10, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f95772l = meijerAccount;
            this.f95773m = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            ProfileScreenViewState profileScreenViewState;
            Object value2;
            ProfileScreenViewState profileScreenViewStateB;
            Object objL;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f95769i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f95770j;
                    l lVar = l.this;
                    MeijerAccount meijerAccount = this.f95772l;
                    Result.Companion companion = Result.INSTANCE;
                    Ch.c cVar = lVar.accountsAMSRepository;
                    Intrinsics.g(meijerAccount);
                    this.f95770j = interfaceC15783O;
                    this.f95761a = interfaceC15783O;
                    this.f95762b = this;
                    this.f95763c = this;
                    this.f95764d = interfaceC15783O;
                    this.f95765e = 0;
                    this.f95766f = 0;
                    this.f95767g = 0;
                    this.f95768h = 0;
                    this.f95769i = 1;
                    objL = cVar.l(meijerAccount, this);
                    if (objL == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objL = obj;
                }
                objB = Result.b(objL);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            l lVar2 = l.this;
            boolean z10 = this.f95773m;
            if (Result.h(objB)) {
                B b10 = (B) objB;
                InterfaceC16549B interfaceC16549B = lVar2._profileState;
                do {
                    value2 = interfaceC16549B.getValue();
                    ProfileScreenViewState profileScreenViewState2 = (ProfileScreenViewState) value2;
                    if (b10 instanceof B.Success) {
                        profileScreenViewStateB = z10 ? ProfileScreenViewState.b(profileScreenViewState2, BasicInformationDecorator.g(profileScreenViewState2.getSavedBasicInformation(), null, null, null, null, null, null, null, null, false, null, null, 1791, null), null, null, null, null, null, null, null, null, null, false, true, null, false, false, false, false, false, false, false, 1021950, null) : ProfileScreenViewState.b(profileScreenViewState2, null, null, null, AccountInformationDecorator.f(profileScreenViewState2.getSavedAccountInformation(), null, null, null, null, false, null, null, false, null, null, null, null, null, null, 16367, null), null, null, null, null, null, null, false, true, null, false, false, false, false, false, false, false, 907255, null);
                    } else {
                        if (!(b10 instanceof B.Conflict)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        profileScreenViewStateB = z10 ? ProfileScreenViewState.b(profileScreenViewState2, BasicInformationDecorator.g(profileScreenViewState2.getSavedBasicInformation(), null, null, null, null, null, null, null, AbstractC6392a.INSTANCE.d(C18316c.f171434j, new Object[0]), false, null, null, 1663, null), null, null, null, null, null, null, null, null, null, false, false, null, true, true, false, false, false, false, false, 1021950, null) : ProfileScreenViewState.b(profileScreenViewState2, null, null, null, AccountInformationDecorator.f(profileScreenViewState2.getSavedAccountInformation(), null, null, null, null, false, AbstractC6392a.INSTANCE.d(C18316c.f171438n, new Object[0]), null, false, null, null, null, null, null, null, 16335, null), null, null, null, null, null, null, false, false, null, true, false, false, false, true, false, false, 907255, null);
                    }
                } while (!interfaceC16549B.e(value2, profileScreenViewStateB));
            }
            l lVar3 = l.this;
            boolean z11 = this.f95773m;
            if (Result.e(objB) != null) {
                InterfaceC16549B interfaceC16549B2 = lVar3._profileState;
                do {
                    value = interfaceC16549B2.getValue();
                    profileScreenViewState = (ProfileScreenViewState) value;
                } while (!interfaceC16549B2.e(value, z11 ? ProfileScreenViewState.b(profileScreenViewState, BasicInformationDecorator.g(profileScreenViewState.getSavedBasicInformation(), null, null, null, null, null, null, AbstractC6392a.INSTANCE.d(Gh.h.f12676B4, new Object[0]), null, false, null, null, 1727, null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048574, null) : ProfileScreenViewState.b(profileScreenViewState, null, null, null, AccountInformationDecorator.f(profileScreenViewState.getSavedAccountInformation(), null, null, null, null, false, AbstractC6392a.INSTANCE.d(Gh.h.f12676B4, new Object[0]), null, false, null, null, null, null, null, null, 16335, null), null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048567, null)));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$updateAccountInfo$2", f = "ProfileScreenViewModel.kt", l = {560}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f95774a;

        /* renamed from: b, reason: collision with root package name */
        Object f95775b;

        /* renamed from: c, reason: collision with root package name */
        Object f95776c;

        /* renamed from: d, reason: collision with root package name */
        Object f95777d;

        /* renamed from: e, reason: collision with root package name */
        int f95778e;

        /* renamed from: f, reason: collision with root package name */
        int f95779f;

        /* renamed from: g, reason: collision with root package name */
        int f95780g;

        /* renamed from: h, reason: collision with root package name */
        int f95781h;

        /* renamed from: i, reason: collision with root package name */
        int f95782i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f95783j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ AbstractC5691a.Email f95785l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f95786m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f95787n;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            o oVar = l.this.new o(this.f95785l, this.f95786m, this.f95787n, continuation);
            oVar.f95783j = obj;
            return oVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(AbstractC5691a.Email cVar, String str, String str2, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f95785l = cVar;
            this.f95786m = str;
            this.f95787n = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            int i10 = this.f95782i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f95783j;
                    l lVar = l.this;
                    AbstractC5691a.Email cVar = this.f95785l;
                    String str = this.f95786m;
                    String str2 = this.f95787n;
                    Result.Companion companion = Result.INSTANCE;
                    Ch.e eVar = lVar.profileRepository;
                    PasswordChangeInfo passwordChangeInfo = null;
                    MeijerAccount meijerAccountB = (cVar.c().e().length() <= 0 || Intrinsics.e(((ProfileScreenViewState) lVar._profileState.getValue()).getSavedAccountInformation().getEmail(), cVar)) ? null : MeijerAccount.b(((ProfileScreenViewState) lVar._profileState.getValue()).getOriginalMeijerAccount(), 0L, null, cVar.c().e(), null, null, null, null, null, null, null, null, 0, null, 0L, 0L, null, 0, null, 0L, 0, null, null, null, null, null, null, 0L, 134217723, null);
                    if (str.length() > 0 && str2.length() > 0) {
                        passwordChangeInfo = new PasswordChangeInfo(str, str2);
                    }
                    this.f95783j = interfaceC15783O;
                    this.f95774a = interfaceC15783O;
                    this.f95775b = this;
                    this.f95776c = this;
                    this.f95777d = interfaceC15783O;
                    this.f95778e = 0;
                    this.f95779f = 0;
                    this.f95780g = 0;
                    this.f95781h = 0;
                    this.f95782i = 1;
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
                InterfaceC16549B interfaceC16549B = lVar2._profileState;
                do {
                    value2 = interfaceC16549B.getValue();
                    profileScreenViewState2 = (ProfileScreenViewState) value2;
                } while (!interfaceC16549B.e(value2, ProfileScreenViewState.b(profileScreenViewState2, null, null, null, AccountInformationDecorator.f(profileScreenViewState2.getSavedAccountInformation(), null, null, null, null, false, updateAccountInformationResponse.getErrorMessage(), null, false, null, null, null, null, null, null, 16335, null), null, null, null, null, null, null, false, updateAccountInformationResponse.getIsSuccess(), null, !updateAccountInformationResponse.getIsSuccess(), false, false, false, !updateAccountInformationResponse.getIsSuccess(), false, false, 907255, null)));
            }
            l lVar3 = l.this;
            if (Result.e(objB) != null) {
                InterfaceC16549B interfaceC16549B2 = lVar3._profileState;
                do {
                    value = interfaceC16549B2.getValue();
                    profileScreenViewState = (ProfileScreenViewState) value;
                } while (!interfaceC16549B2.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, AccountInformationDecorator.f(profileScreenViewState.getSavedAccountInformation(), null, null, null, null, false, AbstractC6392a.INSTANCE.d(Gh.h.f12676B4, new Object[0]), null, false, null, null, null, null, null, null, 16335, null), null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048567, null)));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$updateBasicInfo$2", f = "ProfileScreenViewModel.kt", l = {522}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f95788a;

        /* renamed from: b, reason: collision with root package name */
        Object f95789b;

        /* renamed from: c, reason: collision with root package name */
        Object f95790c;

        /* renamed from: d, reason: collision with root package name */
        Object f95791d;

        /* renamed from: e, reason: collision with root package name */
        int f95792e;

        /* renamed from: f, reason: collision with root package name */
        int f95793f;

        /* renamed from: g, reason: collision with root package name */
        int f95794g;

        /* renamed from: h, reason: collision with root package name */
        int f95795h;

        /* renamed from: i, reason: collision with root package name */
        int f95796i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f95797j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ MeijerAccount f95799l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f95800m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            p pVar = l.this.new p(this.f95799l, this.f95800m, continuation);
            pVar.f95797j = obj;
            return pVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(MeijerAccount meijerAccount, String str, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f95799l = meijerAccount;
            this.f95800m = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            int i10 = this.f95796i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f95797j;
                    l lVar = l.this;
                    MeijerAccount meijerAccount = this.f95799l;
                    String str = this.f95800m;
                    Result.Companion companion = Result.INSTANCE;
                    Ch.e eVar = lVar.profileRepository;
                    this.f95797j = interfaceC15783O;
                    this.f95788a = interfaceC15783O;
                    this.f95789b = this;
                    this.f95790c = this;
                    this.f95791d = interfaceC15783O;
                    this.f95792e = 0;
                    this.f95793f = 0;
                    this.f95794g = 0;
                    this.f95795h = 0;
                    this.f95796i = 1;
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
                InterfaceC16549B interfaceC16549B = lVar2._profileState;
                do {
                    value2 = interfaceC16549B.getValue();
                    profileScreenViewState2 = (ProfileScreenViewState) value2;
                } while (!interfaceC16549B.e(value2, ProfileScreenViewState.b(profileScreenViewState2, BasicInformationDecorator.g(profileScreenViewState2.getSavedBasicInformation(), null, null, null, null, null, null, updateBasicInfoResponse.getErrorMessage(), updateBasicInfoResponse.getPhoneConflictErrorMessage(), false, null, null, 1599, null), null, null, null, null, null, null, null, null, null, false, updateBasicInfoResponse.getIsSuccess(), null, !updateBasicInfoResponse.getIsSuccess(), !updateBasicInfoResponse.getIsSuccess(), false, false, false, false, false, 1021950, null)));
            }
            l lVar3 = l.this;
            if (Result.e(objB) != null) {
                InterfaceC16549B interfaceC16549B2 = lVar3._profileState;
                do {
                    value = interfaceC16549B2.getValue();
                    profileScreenViewState = (ProfileScreenViewState) value;
                } while (!interfaceC16549B2.e(value, ProfileScreenViewState.b(profileScreenViewState, BasicInformationDecorator.g(profileScreenViewState.getSavedBasicInformation(), null, null, null, null, null, null, AbstractC6392a.INSTANCE.d(Gh.h.f12676B4, new Object[0]), null, false, null, null, 1727, null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048574, null)));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel", f = "ProfileScreenViewModel.kt", l = {354}, m = "updateMperksPin-0E7RQCE")
    static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f95801a;

        /* renamed from: b, reason: collision with root package name */
        Object f95802b;

        /* renamed from: c, reason: collision with root package name */
        Object f95803c;

        /* renamed from: d, reason: collision with root package name */
        Object f95804d;

        /* renamed from: e, reason: collision with root package name */
        Object f95805e;

        /* renamed from: f, reason: collision with root package name */
        Object f95806f;

        /* renamed from: g, reason: collision with root package name */
        int f95807g;

        /* renamed from: h, reason: collision with root package name */
        int f95808h;

        /* renamed from: i, reason: collision with root package name */
        int f95809i;

        /* renamed from: j, reason: collision with root package name */
        int f95810j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f95811k;

        /* renamed from: m, reason: collision with root package name */
        int f95813m;

        q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f95811k = obj;
            this.f95813m |= Integer.MIN_VALUE;
            Object objE0 = l.this.e0(null, null, this);
            return objE0 == IntrinsicsKt.f() ? objE0 : Result.a(objE0);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel", f = "ProfileScreenViewModel.kt", l = {364}, m = "updateMperksQuickID-gIAlu-s")
    static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        boolean f95814a;

        /* renamed from: b, reason: collision with root package name */
        Object f95815b;

        /* renamed from: c, reason: collision with root package name */
        Object f95816c;

        /* renamed from: d, reason: collision with root package name */
        Object f95817d;

        /* renamed from: e, reason: collision with root package name */
        Object f95818e;

        /* renamed from: f, reason: collision with root package name */
        int f95819f;

        /* renamed from: g, reason: collision with root package name */
        int f95820g;

        /* renamed from: h, reason: collision with root package name */
        int f95821h;

        /* renamed from: i, reason: collision with root package name */
        int f95822i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f95823j;

        /* renamed from: l, reason: collision with root package name */
        int f95825l;

        r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f95823j = obj;
            this.f95825l |= Integer.MIN_VALUE;
            Object objF0 = l.this.f0(false, this);
            return objF0 == IntrinsicsKt.f() ? objF0 : Result.a(objF0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.profile.ProfileScreenViewModel$updateOrderPreferences$2", f = "ProfileScreenViewModel.kt", l = {610}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f95826a;

        /* renamed from: b, reason: collision with root package name */
        Object f95827b;

        /* renamed from: c, reason: collision with root package name */
        Object f95828c;

        /* renamed from: d, reason: collision with root package name */
        Object f95829d;

        /* renamed from: e, reason: collision with root package name */
        int f95830e;

        /* renamed from: f, reason: collision with root package name */
        int f95831f;

        /* renamed from: g, reason: collision with root package name */
        int f95832g;

        /* renamed from: h, reason: collision with root package name */
        int f95833h;

        /* renamed from: i, reason: collision with root package name */
        int f95834i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f95835j;

        s(Continuation<? super s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            s sVar = l.this.new s(continuation);
            sVar.f95835j = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            int i10 = this.f95834i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f95835j;
                    l lVar = l.this;
                    Result.Companion companion = Result.INSTANCE;
                    Ch.e eVar = lVar.profileRepository;
                    String selectedSubstitutionPreference = ((ProfileScreenViewState) lVar._profileState.getValue()).getUnsavedOrderPreferencesInformation().getGrocerySubstitution().getSelectedSubstitutionPreference();
                    String description = ((ProfileScreenViewState) lVar._profileState.getValue()).getUnsavedOrderPreferencesInformation().getVehicleDescription().getDescription();
                    VehicleDescriptionChangeInfo vehicleDescriptionChangeInfo = description != null ? new VehicleDescriptionChangeInfo(((ProfileScreenViewState) lVar._profileState.getValue()).getSavedOrderPreferencesInformation().getVehicleId(), ((ProfileScreenViewState) lVar._profileState.getValue()).getSavedOrderPreferencesInformation().getVehicleDescription().getDescription(), description) : null;
                    this.f95835j = interfaceC15783O;
                    this.f95826a = interfaceC15783O;
                    this.f95827b = this;
                    this.f95828c = this;
                    this.f95829d = interfaceC15783O;
                    this.f95830e = 0;
                    this.f95831f = 0;
                    this.f95832g = 0;
                    this.f95833h = 0;
                    this.f95834i = 1;
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
                InterfaceC16549B interfaceC16549B = lVar2._profileState;
                do {
                    value2 = interfaceC16549B.getValue();
                    profileScreenViewState2 = (ProfileScreenViewState) value2;
                } while (!interfaceC16549B.e(value2, ProfileScreenViewState.b(profileScreenViewState2, null, null, null, null, null, null, null, null, OrderPreferencesDecorator.f(profileScreenViewState2.getSavedOrderPreferencesInformation(), 0, null, null, null, updateOrderPreferencesResponse.getErrorMessage(), null, false, 47, null), null, false, updateOrderPreferencesResponse.getIsSuccess(), null, !updateOrderPreferencesResponse.getIsSuccess(), false, false, !updateOrderPreferencesResponse.getIsSuccess(), false, false, false, 972543, null)));
            }
            l lVar3 = l.this;
            if (Result.e(objB) != null) {
                InterfaceC16549B interfaceC16549B2 = lVar3._profileState;
                do {
                    value = interfaceC16549B2.getValue();
                    profileScreenViewState = (ProfileScreenViewState) value;
                } while (!interfaceC16549B2.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, null, null, null, null, null, OrderPreferencesDecorator.f(profileScreenViewState.getSavedOrderPreferencesInformation(), 0, null, null, null, AbstractC6392a.INSTANCE.d(Gh.h.f12676B4, new Object[0]), null, false, 47, null), null, false, false, null, false, false, false, false, false, false, false, 1048319, null)));
            }
            return Unit.f143329a;
        }
    }

    private final void d0() {
        ProfileScreenViewState value;
        ProfileScreenViewState profileScreenViewState;
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = this._profileState;
        do {
            value = interfaceC16549B.getValue();
            profileScreenViewState = value;
        } while (!interfaceC16549B.e(value, ProfileScreenViewState.b(profileScreenViewState, BasicInformationDecorator.g(profileScreenViewState.getSavedBasicInformation(), null, null, null, null, null, null, null, null, true, null, null, 1791, null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048574, null)));
        BasicInformationDecorator savedBasicInformation = this._profileState.getValue().getSavedBasicInformation();
        C15809k.d(d0.a(this), null, null, new p((Intrinsics.e(savedBasicInformation.getFirstName().c().e(), this._profileState.getValue().getUnsavedBasicInformation().getFirstName().c().e()) && Intrinsics.e(savedBasicInformation.getLastName().c().e(), this._profileState.getValue().getUnsavedBasicInformation().getLastName().c().e()) && Intrinsics.e(savedBasicInformation.getZipCode().c().e(), this._profileState.getValue().getUnsavedBasicInformation().getZipCode().c().e()) && Intrinsics.e(savedBasicInformation.getBirthDate().c().e(), this._profileState.getValue().getUnsavedBasicInformation().getBirthDate().c().e())) ? null : MeijerAccount.b(this._profileState.getValue().getOriginalMeijerAccount(), 0L, null, null, null, null, null, null, null, this._profileState.getValue().getUnsavedBasicInformation().getFirstName().c().e(), this._profileState.getValue().getUnsavedBasicInformation().getLastName().c().e(), this._profileState.getValue().getUnsavedBasicInformation().getZipCode().c().e(), 0, null, 0L, 0L, null, 0, null, 0L, 0, null, null, null, this._profileState.getValue().getUnsavedBasicInformation().getBirthDate().c().e(), null, null, 0L, 125827327, null), !Intrinsics.e(this._profileState.getValue().getSavedBasicInformation().getPhoneNumber(), this._profileState.getValue().getUnsavedBasicInformation().getPhoneNumber()) ? this._profileState.getValue().getUnsavedBasicInformation().getPhoneNumber().c().e() : null, null), 3, null);
    }

    public l(Ch.e profileRepository, Ch.d preferencesRepository, Ch.c accountsAMSRepository, zl.k featureManager) {
        Intrinsics.j(profileRepository, "profileRepository");
        Intrinsics.j(preferencesRepository, "preferencesRepository");
        Intrinsics.j(accountsAMSRepository, "accountsAMSRepository");
        Intrinsics.j(featureManager, "featureManager");
        this.profileRepository = profileRepository;
        this.preferencesRepository = preferencesRepository;
        this.accountsAMSRepository = accountsAMSRepository;
        this.featureManager = featureManager;
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549BA = S.a(new ProfileScreenViewState(null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048575, null));
        this._profileState = interfaceC16549BA;
        this.profileState = C16563h.c(interfaceC16549BA);
        Pj.c cVar = new Pj.c();
        this.loadingStatesManager = cVar;
        G();
        C16563h.J(C16563h.g(C16563h.O(cVar.a(), new a(this)), new b(null)), d0.a(this));
    }

    private final void E(boolean isPhoneConflictError, boolean isMperksPinError) {
        ProfileScreenViewState value;
        ProfileScreenViewState profileScreenViewState;
        ProfileScreenViewState value2;
        ProfileScreenViewState profileScreenViewState2;
        ProfileScreenViewState value3;
        ProfileScreenViewState profileScreenViewState3;
        com.meijer.mobile.accounts.ux.profile.p screen = this._profileState.getValue().getScreen();
        if (Intrinsics.e(screen, p.b.f95840a)) {
            InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = this._profileState;
            do {
                value3 = interfaceC16549B.getValue();
                profileScreenViewState3 = value3;
            } while (!interfaceC16549B.e(value3, ProfileScreenViewState.b(profileScreenViewState3, isPhoneConflictError ? BasicInformationDecorator.g(profileScreenViewState3.getSavedBasicInformation(), null, null, null, null, null, null, null, null, false, null, null, 1919, null) : BasicInformationDecorator.g(profileScreenViewState3.getSavedBasicInformation(), null, null, null, null, null, null, null, null, false, null, null, 1983, null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048574, null)));
            return;
        }
        if (Intrinsics.e(screen, p.a.f95839a)) {
            InterfaceC16549B<ProfileScreenViewState> interfaceC16549B2 = this._profileState;
            do {
                value2 = interfaceC16549B2.getValue();
                profileScreenViewState2 = value2;
            } while (!interfaceC16549B2.e(value2, ProfileScreenViewState.b(profileScreenViewState2, null, null, null, AccountInformationDecorator.f(profileScreenViewState2.getSavedAccountInformation(), null, null, null, null, false, null, null, false, null, null, null, null, null, null, 16351, null), null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048567, null)));
            return;
        }
        if (Intrinsics.e(screen, p.c.f95841a)) {
            if (isMperksPinError) {
                this.loadingStatesManager.b(new a.NotLoading("mperks pin"));
                return;
            } else {
                this.loadingStatesManager.b(new a.NotLoading("quick id"));
                return;
            }
        }
        if (!Intrinsics.e(screen, p.d.f95842a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549B3 = this._profileState;
        do {
            value = interfaceC16549B3.getValue();
            profileScreenViewState = value;
        } while (!interfaceC16549B3.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, null, null, null, null, null, OrderPreferencesDecorator.f(profileScreenViewState.getSavedOrderPreferencesInformation(), 0, null, null, null, null, null, false, 111, null), null, false, false, null, false, false, false, false, false, false, false, 1048319, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(kotlin.coroutines.Continuation<? super bk.AbstractC6392a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.meijer.mobile.accounts.ux.profile.l.f
            if (r0 == 0) goto L13
            r0 = r5
            com.meijer.mobile.accounts.ux.profile.l$f r0 = (com.meijer.mobile.accounts.ux.profile.l.f) r0
            int r1 = r0.f95647l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95647l = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.profile.l$f r0 = new com.meijer.mobile.accounts.ux.profile.l$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f95645j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f95647l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r1 = r0.f95640e
            com.meijer.mobile.accounts.ux.profile.l r1 = (com.meijer.mobile.accounts.ux.profile.l) r1
            java.lang.Object r2 = r0.f95639d
            com.meijer.mobile.accounts.ux.profile.l r2 = (com.meijer.mobile.accounts.ux.profile.l) r2
            java.lang.Object r2 = r0.f95638c
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f95637b
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f95636a
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
            Ch.e r5 = w(r4)     // Catch: java.lang.Exception -> L72
            r0.f95636a = r4     // Catch: java.lang.Exception -> L72
            r0.f95637b = r0     // Catch: java.lang.Exception -> L72
            r0.f95638c = r0     // Catch: java.lang.Exception -> L72
            r0.f95639d = r4     // Catch: java.lang.Exception -> L72
            r0.f95640e = r4     // Catch: java.lang.Exception -> L72
            r2 = 0
            r0.f95641f = r2     // Catch: java.lang.Exception -> L72
            r0.f95642g = r2     // Catch: java.lang.Exception -> L72
            r0.f95643h = r2     // Catch: java.lang.Exception -> L72
            r0.f95644i = r2     // Catch: java.lang.Exception -> L72
            r0.f95647l = r3     // Catch: java.lang.Exception -> L72
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
            mv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L85:
            boolean r5 = kotlin.Result.g(r5)
            bk.a r5 = r1.L(r5)
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
    public final java.lang.Object H(kotlin.coroutines.Continuation<? super kotlin.Result<Eh.Preference>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.accounts.ux.profile.l.h
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.accounts.ux.profile.l$h r0 = (com.meijer.mobile.accounts.ux.profile.l.h) r0
            int r1 = r0.f95678k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95678k = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.profile.l$h r0 = new com.meijer.mobile.accounts.ux.profile.l$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f95676i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f95678k
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r1 = r0.f95671d
            com.meijer.mobile.accounts.ux.profile.l r1 = (com.meijer.mobile.accounts.ux.profile.l) r1
            java.lang.Object r1 = r0.f95670c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f95669b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f95668a
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
            Ch.d r6 = v(r5)     // Catch: java.lang.Exception -> L39
            Eh.p r2 = Eh.p.f7588f     // Catch: java.lang.Exception -> L39
            r0.f95668a = r5     // Catch: java.lang.Exception -> L39
            r0.f95669b = r0     // Catch: java.lang.Exception -> L39
            r0.f95670c = r0     // Catch: java.lang.Exception -> L39
            r0.f95671d = r5     // Catch: java.lang.Exception -> L39
            r4 = 0
            r0.f95672e = r4     // Catch: java.lang.Exception -> L39
            r0.f95673f = r4     // Catch: java.lang.Exception -> L39
            r0.f95674g = r4     // Catch: java.lang.Exception -> L39
            r0.f95675h = r4     // Catch: java.lang.Exception -> L39
            r0.f95678k = r3     // Catch: java.lang.Exception -> L39
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Exception -> L39
            if (r6 != r1) goto L68
            return r1
        L68:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L39
            return r6
        L6d:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            mv.E0.i(r0)
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
    public final java.lang.Object I(kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<Fh.DiscretePreferenceChoice>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.meijer.mobile.accounts.ux.profile.l.i
            if (r0 == 0) goto L13
            r0 = r5
            com.meijer.mobile.accounts.ux.profile.l$i r0 = (com.meijer.mobile.accounts.ux.profile.l.i) r0
            int r1 = r0.f95689k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95689k = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.profile.l$i r0 = new com.meijer.mobile.accounts.ux.profile.l$i
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f95687i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f95689k
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r1 = r0.f95682d
            com.meijer.mobile.accounts.ux.profile.l r1 = (com.meijer.mobile.accounts.ux.profile.l) r1
            java.lang.Object r1 = r0.f95681c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f95680b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f95679a
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
            Ch.e r5 = w(r4)     // Catch: java.lang.Exception -> L39
            r0.f95679a = r4     // Catch: java.lang.Exception -> L39
            r0.f95680b = r0     // Catch: java.lang.Exception -> L39
            r0.f95681c = r0     // Catch: java.lang.Exception -> L39
            r0.f95682d = r4     // Catch: java.lang.Exception -> L39
            r2 = 0
            r0.f95683e = r2     // Catch: java.lang.Exception -> L39
            r0.f95684f = r2     // Catch: java.lang.Exception -> L39
            r0.f95685g = r2     // Catch: java.lang.Exception -> L39
            r0.f95686h = r2     // Catch: java.lang.Exception -> L39
            r0.f95689k = r3     // Catch: java.lang.Exception -> L39
            java.lang.Object r5 = r5.k(r0)     // Catch: java.lang.Exception -> L39
            if (r5 != r1) goto L66
            return r1
        L66:
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Exception -> L39
            return r5
        L6b:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            mv.E0.i(r0)
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
    public final java.lang.Object J(kotlin.coroutines.Continuation<? super bk.AbstractC6392a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.accounts.ux.profile.l.j
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.accounts.ux.profile.l$j r0 = (com.meijer.mobile.accounts.ux.profile.l.j) r0
            int r1 = r0.f95701l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95701l = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.profile.l$j r0 = new com.meijer.mobile.accounts.ux.profile.l$j
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f95699j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f95701l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L61
            if (r2 == r4) goto L4c
            if (r2 != r3) goto L44
            java.lang.Object r1 = r0.f95694e
            com.meijer.mobile.accounts.ux.profile.l r1 = (com.meijer.mobile.accounts.ux.profile.l) r1
            java.lang.Object r2 = r0.f95693d
            com.meijer.mobile.accounts.ux.profile.l r2 = (com.meijer.mobile.accounts.ux.profile.l) r2
            java.lang.Object r2 = r0.f95692c
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f95691b
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f95690a
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
            java.lang.Object r1 = r0.f95694e
            com.meijer.mobile.accounts.ux.profile.l r1 = (com.meijer.mobile.accounts.ux.profile.l) r1
            java.lang.Object r2 = r0.f95693d
            com.meijer.mobile.accounts.ux.profile.l r2 = (com.meijer.mobile.accounts.ux.profile.l) r2
            java.lang.Object r2 = r0.f95692c
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f95691b
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f95690a
            com.meijer.mobile.accounts.ux.profile.l r2 = (com.meijer.mobile.accounts.ux.profile.l) r2
            goto L3c
        L61:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L94
            zl.k r6 = u(r5)     // Catch: java.lang.Exception -> L94
            zl.f$c r2 = zl.AbstractC18503f.C18506c.f172870h     // Catch: java.lang.Exception -> L94
            boolean r6 = r6.e(r2)     // Catch: java.lang.Exception -> L94
            r2 = 0
            if (r6 == 0) goto L97
            Ch.c r6 = t(r5)     // Catch: java.lang.Exception -> L94
            r0.f95690a = r5     // Catch: java.lang.Exception -> L94
            r0.f95691b = r0     // Catch: java.lang.Exception -> L94
            r0.f95692c = r0     // Catch: java.lang.Exception -> L94
            r0.f95693d = r5     // Catch: java.lang.Exception -> L94
            r0.f95694e = r5     // Catch: java.lang.Exception -> L94
            r0.f95695f = r2     // Catch: java.lang.Exception -> L94
            r0.f95696g = r2     // Catch: java.lang.Exception -> L94
            r0.f95697h = r2     // Catch: java.lang.Exception -> L94
            r0.f95698i = r2     // Catch: java.lang.Exception -> L94
            r0.f95701l = r4     // Catch: java.lang.Exception -> L94
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
            Ch.e r6 = w(r5)     // Catch: java.lang.Exception -> L94
            r0.f95690a = r5     // Catch: java.lang.Exception -> L94
            r0.f95691b = r0     // Catch: java.lang.Exception -> L94
            r0.f95692c = r0     // Catch: java.lang.Exception -> L94
            r0.f95693d = r5     // Catch: java.lang.Exception -> L94
            r0.f95694e = r5     // Catch: java.lang.Exception -> L94
            r0.f95695f = r2     // Catch: java.lang.Exception -> L94
            r0.f95696g = r2     // Catch: java.lang.Exception -> L94
            r0.f95697h = r2     // Catch: java.lang.Exception -> L94
            r0.f95698i = r2     // Catch: java.lang.Exception -> L94
            r0.f95701l = r3     // Catch: java.lang.Exception -> L94
            java.lang.Object r6 = r6.l(r0)     // Catch: java.lang.Exception -> L94
            if (r6 != r1) goto L92
        Lb5:
            return r1
        Lb6:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L41
            goto Lcc
        Lbb:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            mv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        Lcc:
            boolean r6 = kotlin.Result.g(r6)
            bk.a r6 = r1.L(r6)
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
    public final java.lang.Object K(kotlin.coroutines.Continuation<? super bk.AbstractC6392a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.meijer.mobile.accounts.ux.profile.l.k
            if (r0 == 0) goto L13
            r0 = r5
            com.meijer.mobile.accounts.ux.profile.l$k r0 = (com.meijer.mobile.accounts.ux.profile.l.k) r0
            int r1 = r0.f95713l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95713l = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.profile.l$k r0 = new com.meijer.mobile.accounts.ux.profile.l$k
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f95711j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f95713l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r1 = r0.f95706e
            com.meijer.mobile.accounts.ux.profile.l r1 = (com.meijer.mobile.accounts.ux.profile.l) r1
            java.lang.Object r2 = r0.f95705d
            com.meijer.mobile.accounts.ux.profile.l r2 = (com.meijer.mobile.accounts.ux.profile.l) r2
            java.lang.Object r2 = r0.f95704c
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f95703b
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f95702a
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
            Ch.e r5 = w(r4)     // Catch: java.lang.Exception -> L72
            r0.f95702a = r4     // Catch: java.lang.Exception -> L72
            r0.f95703b = r0     // Catch: java.lang.Exception -> L72
            r0.f95704c = r0     // Catch: java.lang.Exception -> L72
            r0.f95705d = r4     // Catch: java.lang.Exception -> L72
            r0.f95706e = r4     // Catch: java.lang.Exception -> L72
            r2 = 0
            r0.f95707f = r2     // Catch: java.lang.Exception -> L72
            r0.f95708g = r2     // Catch: java.lang.Exception -> L72
            r0.f95709h = r2     // Catch: java.lang.Exception -> L72
            r0.f95710i = r2     // Catch: java.lang.Exception -> L72
            r0.f95713l = r3     // Catch: java.lang.Exception -> L72
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
            mv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L85:
            boolean r5 = kotlin.Result.g(r5)
            bk.a r5 = r1.L(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.K(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final AbstractC6392a L(boolean isFailure) {
        if (isFailure) {
            return AbstractC6392a.INSTANCE.d(Gh.h.f12806U1, new Object[0]);
        }
        return null;
    }

    private final boolean N(AccountInformationDecorator accountInformationDecorator) {
        String strE = this._profileState.getValue().getSavedAccountInformation().getEmail().c().e();
        return accountInformationDecorator.g(this._profileState.getValue().getSavedAccountInformation().getEmail().c().e()) ? accountInformationDecorator.t(strE) && accountInformationDecorator.v() : accountInformationDecorator.t(strE) || accountInformationDecorator.v();
    }

    private final boolean Q(OrderPreferencesDecorator orderPreferencesDecorator) {
        return (Intrinsics.e(orderPreferencesDecorator, new OrderPreferencesDecorator(0, null, null, null, null, null, false, l3.f93324d, null)) || Intrinsics.e(orderPreferencesDecorator, this._profileState.getValue().getSavedOrderPreferencesInformation())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Object quickIDResponse) {
        ProfileScreenViewState value;
        ProfileScreenViewState profileScreenViewState;
        MperksInformationDecorator savedMperksInformation;
        List list;
        Preference preferenceA;
        if (!Result.h(quickIDResponse)) {
            this.loadingStatesManager.b(new a.Failed("quick id", AbstractC6392a.INSTANCE.d(Gh.h.f12676B4, new Object[0])));
            return;
        }
        this.loadingStatesManager.b(new a.NotLoading("quick id"));
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = this._profileState;
        do {
            value = interfaceC16549B.getValue();
            profileScreenViewState = value;
            savedMperksInformation = profileScreenViewState.getSavedMperksInformation();
            list = (List) (Result.g(quickIDResponse) ? null : quickIDResponse);
        } while (!interfaceC16549B.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, null, null, MperksInformationDecorator.f(savedMperksInformation, null, null, null, false, (list == null || (preferenceA = Eh.q.a(list, Eh.p.f7588f)) == null) ? false : preferenceA.getIsEnabled(), null, null, 111, null), null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048543, null)));
    }

    private final void V(com.meijer.mobile.accounts.ux.profile.p screen) {
        l lVar = this;
        com.meijer.mobile.accounts.ux.profile.p pVar = screen;
        if (Intrinsics.e(pVar, p.b.f95840a)) {
            InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = lVar._profileState;
            while (true) {
                ProfileScreenViewState value = interfaceC16549B.getValue();
                InterfaceC16549B<ProfileScreenViewState> interfaceC16549B2 = interfaceC16549B;
                if (interfaceC16549B2.e(value, ProfileScreenViewState.b(value, null, lVar._profileState.getValue().getSavedBasicInformation(), null, null, null, null, null, null, null, null, false, false, pVar, true, false, false, false, false, false, false, 1034237, null))) {
                    return;
                }
                interfaceC16549B = interfaceC16549B2;
                lVar = this;
            }
        } else if (Intrinsics.e(pVar, p.a.f95839a)) {
            InterfaceC16549B<ProfileScreenViewState> interfaceC16549B3 = this._profileState;
            while (true) {
                ProfileScreenViewState value2 = interfaceC16549B3.getValue();
                InterfaceC16549B<ProfileScreenViewState> interfaceC16549B4 = interfaceC16549B3;
                ProfileScreenViewState profileScreenViewState = value2;
                if (interfaceC16549B4.e(value2, ProfileScreenViewState.b(profileScreenViewState, null, null, null, null, AccountInformationDecorator.f(profileScreenViewState.getSavedAccountInformation(), null, null, null, null, false, null, null, false, w0.f33177a, null, null, null, null, null, 16127, null), null, null, null, null, null, false, false, pVar, true, false, false, false, false, false, false, 1034223, null))) {
                    return;
                } else {
                    interfaceC16549B3 = interfaceC16549B4;
                }
            }
        } else if (Intrinsics.e(pVar, p.c.f95841a)) {
            l lVar2 = this;
            InterfaceC16549B<ProfileScreenViewState> interfaceC16549B5 = lVar2._profileState;
            while (true) {
                ProfileScreenViewState value3 = interfaceC16549B5.getValue();
                InterfaceC16549B<ProfileScreenViewState> interfaceC16549B6 = interfaceC16549B5;
                if (interfaceC16549B6.e(value3, ProfileScreenViewState.b(value3, null, null, null, null, null, null, lVar2._profileState.getValue().getSavedMperksInformation(), null, null, null, false, false, pVar, true, false, false, false, false, false, false, 1034175, null))) {
                    return;
                }
                interfaceC16549B5 = interfaceC16549B6;
                lVar2 = this;
            }
        } else {
            if (!Intrinsics.e(pVar, p.d.f95842a)) {
                throw new NoWhenBranchMatchedException();
            }
            l lVar3 = this;
            InterfaceC16549B<ProfileScreenViewState> interfaceC16549B7 = lVar3._profileState;
            while (true) {
                ProfileScreenViewState value4 = interfaceC16549B7.getValue();
                InterfaceC16549B<ProfileScreenViewState> interfaceC16549B8 = interfaceC16549B7;
                if (interfaceC16549B8.e(value4, ProfileScreenViewState.b(value4, null, null, null, null, null, null, null, null, null, lVar3._profileState.getValue().getSavedOrderPreferencesInformation(), false, false, pVar, true, false, false, false, false, false, false, 1033727, null))) {
                    return;
                }
                pVar = screen;
                interfaceC16549B7 = interfaceC16549B8;
                lVar3 = this;
            }
        }
    }

    private final void X(String email, boolean isResendEmail) {
        ProfileScreenViewState value;
        ProfileScreenViewState profileScreenViewState;
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = this._profileState;
        do {
            value = interfaceC16549B.getValue();
            profileScreenViewState = value;
        } while (!interfaceC16549B.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, AccountInformationDecorator.f(profileScreenViewState.getSavedAccountInformation(), null, null, null, null, true, null, null, false, null, null, null, null, null, null, 16367, null), null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048567, null)));
        C15809k.d(d0.a(this), null, null, new m(email, isResendEmail, null), 3, null);
    }

    static /* synthetic */ void Y(l lVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lVar.X(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(ProfileInformation profileInformation, AbstractC6392a accountResultFailureMessage, AbstractC6392a customerPreferencesFailureMessage, AbstractC6392a vehicleInformationFailureMessage, Object quickID) {
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
        AbstractC5695e.VehicleDescription vehicleDescription;
        AbstractC5695e.GrocerySubstitution grocerySubstitution;
        ArrayList arrayList;
        Iterator<T> it = profileInformation.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (StringsKt.H(((CustomerPreference) next).getPreferenceTypeName(), Eh.r.f7595e.getPreferenceTypeName(), true)) {
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
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = this._profileState;
        do {
            value = interfaceC16549B.getValue();
            profileScreenViewState = value;
            basicInformationDecoratorB = Yh.c.b(profileScreenViewState.getSavedBasicInformation(), profileInformation.getMeijerAccount(), accountResultFailureMessage);
            MeijerAccount meijerAccount2 = profileInformation.getMeijerAccount();
            meijerAccount = meijerAccount2 == null ? new MeijerAccount(0L, null, null, null, null, null, null, null, null, null, null, 0, null, 0L, 0L, null, 0, null, 0L, 0, null, null, null, null, null, null, 0L, 134217727, null) : meijerAccount2;
            AccountInformationDecorator savedAccountInformation = profileScreenViewState.getSavedAccountInformation();
            MeijerAccount meijerAccount3 = profileInformation.getMeijerAccount();
            String email = meijerAccount3 != null ? meijerAccount3.getEmail() : null;
            if (email == null) {
                email = "";
            }
            accountInformationDecoratorF = AccountInformationDecorator.f(savedAccountInformation, new AbstractC5691a.Email(new Validation(email, null, 2, null)), null, null, null, false, null, accountResultFailureMessage, false, null, null, null, null, null, null, 16318, null);
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
            vehicleDescription = new AbstractC5695e.VehicleDescription(null, vehicleInformation2 != null ? vehicleInformation2.getVehicleDescription() : null, 1, null);
            grocerySubstitution = new AbstractC5695e.GrocerySubstitution(null, preferenceValue, iF, 1, null);
            List<DiscretePreferenceChoice> listD = profileInformation.d();
            arrayList = new ArrayList();
            Iterator<T> it3 = listD.iterator();
            while (it3.hasNext()) {
                String choiceValue = ((DiscretePreferenceChoice) it3.next()).getChoiceValue();
                if (choiceValue != null) {
                    arrayList.add(choiceValue);
                }
            }
        } while (!interfaceC16549B.e(value, ProfileScreenViewState.b(profileScreenViewState, basicInformationDecoratorB, null, meijerAccount, accountInformationDecoratorF, null, mperksInformationDecoratorF, null, yourMeijerStoreCardDecoratorA, OrderPreferencesDecorator.f(savedOrderPreferencesInformation, vehicleId, grocerySubstitution, vehicleDescription, arrayList, null, !C6393b.a(vehicleInformationFailureMessage) ? vehicleInformationFailureMessage : customerPreferencesFailureMessage, false, 80, null), null, false, false, null, false, false, false, false, false, false, false, 1047122, null)));
        if (this._profileState.getValue().getIsFromPaymentsScreen()) {
            V(p.c.f95841a);
        } else if (this._profileState.getValue().getIsEditBasicInfo()) {
            V(p.b.f95840a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b0(boolean r41) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.b0(boolean):void");
    }

    private final void c0(String currentPassword, String newPassword) {
        l lVar = this;
        AbstractC5691a.Email email = lVar._profileState.getValue().getUnsavedAccountInformation().getEmail();
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = lVar._profileState;
        while (true) {
            ProfileScreenViewState value = interfaceC16549B.getValue();
            ProfileScreenViewState profileScreenViewState = value;
            if (interfaceC16549B.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, AccountInformationDecorator.f(profileScreenViewState.getSavedAccountInformation(), null, null, null, null, true, null, null, false, null, null, null, null, null, null, 16367, null), null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048567, null))) {
                C15809k.d(d0.a(lVar), null, null, lVar.new o(email, currentPassword, newPassword, null), 3, null);
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
    public final java.lang.Object e0(java.lang.String r8, java.lang.String r9, kotlin.coroutines.Continuation<? super kotlin.Result<Eh.UpdateConfirmationResponse>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.meijer.mobile.accounts.ux.profile.l.q
            if (r0 == 0) goto L13
            r0 = r10
            com.meijer.mobile.accounts.ux.profile.l$q r0 = (com.meijer.mobile.accounts.ux.profile.l.q) r0
            int r1 = r0.f95813m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95813m = r1
            goto L18
        L13:
            com.meijer.mobile.accounts.ux.profile.l$q r0 = new com.meijer.mobile.accounts.ux.profile.l$q
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f95811k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f95813m
            r3 = 1
            if (r2 == 0) goto L4b
            if (r2 != r3) goto L43
            java.lang.Object r8 = r0.f95806f
            com.meijer.mobile.accounts.ux.profile.l r8 = (com.meijer.mobile.accounts.ux.profile.l) r8
            java.lang.Object r8 = r0.f95805e
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            java.lang.Object r8 = r0.f95804d
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            java.lang.Object r8 = r0.f95803c
            com.meijer.mobile.accounts.ux.profile.l r8 = (com.meijer.mobile.accounts.ux.profile.l) r8
            java.lang.Object r8 = r0.f95802b
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.f95801a
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
            Pj.c r10 = r7.loadingStatesManager
            Pj.a$b r2 = new Pj.a$b
            java.lang.String r4 = "mperks pin"
            r5 = 2
            r6 = 0
            r2.<init>(r4, r6, r5, r6)
            r10.b(r2)
            kotlin.Result$Companion r10 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L41
            Ch.e r10 = w(r7)     // Catch: java.lang.Exception -> L41
            r0.f95801a = r8     // Catch: java.lang.Exception -> L41
            r0.f95802b = r9     // Catch: java.lang.Exception -> L41
            r0.f95803c = r7     // Catch: java.lang.Exception -> L41
            r0.f95804d = r0     // Catch: java.lang.Exception -> L41
            r0.f95805e = r0     // Catch: java.lang.Exception -> L41
            r0.f95806f = r7     // Catch: java.lang.Exception -> L41
            r2 = 0
            r0.f95807g = r2     // Catch: java.lang.Exception -> L41
            r0.f95808h = r2     // Catch: java.lang.Exception -> L41
            r0.f95809i = r2     // Catch: java.lang.Exception -> L41
            r0.f95810j = r2     // Catch: java.lang.Exception -> L41
            r0.f95813m = r3     // Catch: java.lang.Exception -> L41
            java.lang.Object r10 = r10.u(r8, r9, r0)     // Catch: java.lang.Exception -> L41
            if (r10 != r1) goto L80
            return r1
        L80:
            java.lang.Object r8 = kotlin.Result.b(r10)     // Catch: java.lang.Exception -> L41
            return r8
        L85:
            kotlin.coroutines.CoroutineContext r9 = r0.getContext()
            mv.E0.i(r9)
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.a(r8)
            java.lang.Object r8 = kotlin.Result.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.e0(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f0(boolean r12, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<Eh.Preference>>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.meijer.mobile.accounts.ux.profile.l.r
            if (r0 == 0) goto L14
            r0 = r13
            com.meijer.mobile.accounts.ux.profile.l$r r0 = (com.meijer.mobile.accounts.ux.profile.l.r) r0
            int r1 = r0.f95825l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f95825l = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            com.meijer.mobile.accounts.ux.profile.l$r r0 = new com.meijer.mobile.accounts.ux.profile.l$r
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.f95823j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r13.f95825l
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r12 = r13.f95818e
            com.meijer.mobile.accounts.ux.profile.l r12 = (com.meijer.mobile.accounts.ux.profile.l) r12
            java.lang.Object r12 = r13.f95817d
            kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
            java.lang.Object r12 = r13.f95816c
            kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
            java.lang.Object r12 = r13.f95815b
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
            Pj.c r0 = r11.loadingStatesManager
            Pj.a$b r2 = new Pj.a$b
            java.lang.String r4 = "quick id"
            r5 = 2
            r6 = 0
            r2.<init>(r4, r6, r5, r6)
            r0.b(r2)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3b
            Ch.d r0 = v(r11)     // Catch: java.lang.Exception -> L3b
            Eh.o r4 = new Eh.o     // Catch: java.lang.Exception -> L3b
            Eh.p r5 = Eh.p.f7588f     // Catch: java.lang.Exception -> L3b
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L3b
            java.util.List r12 = kotlin.collections.CollectionsKt.e(r4)     // Catch: java.lang.Exception -> L3b
            r13.f95815b = r11     // Catch: java.lang.Exception -> L3b
            r13.f95816c = r13     // Catch: java.lang.Exception -> L3b
            r13.f95817d = r13     // Catch: java.lang.Exception -> L3b
            r13.f95818e = r11     // Catch: java.lang.Exception -> L3b
            r13.f95814a = r6     // Catch: java.lang.Exception -> L3b
            r2 = 0
            r13.f95819f = r2     // Catch: java.lang.Exception -> L3b
            r13.f95820g = r2     // Catch: java.lang.Exception -> L3b
            r13.f95821h = r2     // Catch: java.lang.Exception -> L3b
            r13.f95822i = r2     // Catch: java.lang.Exception -> L3b
            r13.f95825l = r3     // Catch: java.lang.Exception -> L3b
            java.lang.Object r0 = r0.e(r12, r13)     // Catch: java.lang.Exception -> L3b
            if (r0 != r1) goto L8a
            return r1
        L8a:
            java.lang.Object r12 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L3b
            return r12
        L8f:
            kotlin.coroutines.CoroutineContext r13 = r13.getContext()
            mv.E0.i(r13)
            kotlin.Result$Companion r13 = kotlin.Result.INSTANCE
            java.lang.Object r12 = kotlin.ResultKt.a(r12)
            java.lang.Object r12 = kotlin.Result.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.profile.l.f0(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void g0() {
        ProfileScreenViewState value;
        ProfileScreenViewState profileScreenViewState;
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = this._profileState;
        do {
            value = interfaceC16549B.getValue();
            profileScreenViewState = value;
        } while (!interfaceC16549B.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, null, null, null, null, null, OrderPreferencesDecorator.f(profileScreenViewState.getSavedOrderPreferencesInformation(), 0, null, null, null, null, null, true, 63, null), null, false, false, null, false, false, false, false, false, false, false, 1048319, null)));
        C15809k.d(d0.a(this), null, null, new s(null), 3, null);
    }

    private final <T extends AbstractC5691a<?>> void h0(T formField) {
        l lVar = this;
        AccountInformationDecorator accountInformationDecoratorW = lVar._profileState.getValue().getUnsavedAccountInformation().w(formField);
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = lVar._profileState;
        while (true) {
            ProfileScreenViewState value = interfaceC16549B.getValue();
            if (interfaceC16549B.e(value, ProfileScreenViewState.b(value, null, null, null, null, accountInformationDecoratorW, null, null, null, null, null, false, false, null, false, false, false, false, lVar.N(accountInformationDecoratorW), false, false, 917487, null))) {
                return;
            } else {
                lVar = this;
            }
        }
    }

    private final <T extends AbstractC5692b<?>> void i0(T formField) {
        l lVar = this;
        BasicInformationDecorator basicInformationDecoratorR = lVar._profileState.getValue().getUnsavedBasicInformation().r(formField);
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = lVar._profileState;
        while (true) {
            ProfileScreenViewState value = interfaceC16549B.getValue();
            if (interfaceC16549B.e(value, ProfileScreenViewState.b(value, null, basicInformationDecoratorR, null, null, null, null, null, null, null, null, false, false, null, false, lVar.O(basicInformationDecoratorR), false, false, false, false, false, 1032189, null))) {
                return;
            } else {
                lVar = this;
            }
        }
    }

    private final void j0(String newPassword, String confirmPassword) {
        AccountInformationDecorator accountInformationDecoratorF = AccountInformationDecorator.f(this._profileState.getValue().getUnsavedAccountInformation(), null, null, null, null, false, null, null, false, null, Intrinsics.e(newPassword, confirmPassword) ? null : AbstractC6392a.INSTANCE.d(Gh.h.f12701F1, new Object[0]), null, null, null, null, 15871, null);
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = this._profileState;
        while (true) {
            ProfileScreenViewState value = interfaceC16549B.getValue();
            AccountInformationDecorator accountInformationDecorator = accountInformationDecoratorF;
            if (interfaceC16549B.e(value, ProfileScreenViewState.b(value, null, null, null, null, accountInformationDecorator, null, null, null, null, null, false, false, null, false, false, false, false, N(accountInformationDecoratorF), false, false, 917487, null))) {
                return;
            } else {
                accountInformationDecoratorF = accountInformationDecorator;
            }
        }
    }

    private final <T extends InterfaceC5697a<?>> void k0(T formField) {
        com.meijer.mobile.accounts.ux.profile.p screen = this._profileState.getValue().getScreen();
        if (Intrinsics.e(screen, p.a.f95839a)) {
            Intrinsics.h(formField, "null cannot be cast to non-null type com.meijer.mobile.accounts.ux.profile.formfields.AccountInfoFormField<*>");
            h0((AbstractC5691a) formField);
            return;
        }
        if (Intrinsics.e(screen, p.b.f95840a)) {
            Intrinsics.h(formField, "null cannot be cast to non-null type com.meijer.mobile.accounts.ux.profile.formfields.BasicInfoFormField<*>");
            i0((AbstractC5692b) formField);
        } else if (Intrinsics.e(screen, p.c.f95841a)) {
            Intrinsics.h(formField, "null cannot be cast to non-null type com.meijer.mobile.accounts.ux.profile.formfields.MperksInfoFormField<*>");
            l0((AbstractC5694d) formField);
        } else {
            if (!Intrinsics.e(screen, p.d.f95842a)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.h(formField, "null cannot be cast to non-null type com.meijer.mobile.accounts.ux.profile.formfields.OrderPreferencesFormField<*>");
            m0((AbstractC5695e) formField);
        }
    }

    private final <T extends AbstractC5694d<?>> void l0(T formField) {
        l lVar = this;
        MperksInformationDecorator mperksInformationDecoratorM = lVar._profileState.getValue().getUnsavedMperksInformation().m(formField);
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = lVar._profileState;
        while (true) {
            ProfileScreenViewState value = interfaceC16549B.getValue();
            if (interfaceC16549B.e(value, ProfileScreenViewState.b(value, null, null, null, null, null, null, mperksInformationDecoratorM, null, null, null, false, false, null, false, false, lVar.P(mperksInformationDecoratorM), false, false, false, false, 1015743, null))) {
                return;
            } else {
                lVar = this;
            }
        }
    }

    private final <T extends AbstractC5695e<?>> void m0(T formField) {
        l lVar = this;
        OrderPreferencesDecorator orderPreferencesDecoratorN = lVar._profileState.getValue().getUnsavedOrderPreferencesInformation().n(formField);
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = lVar._profileState;
        while (true) {
            ProfileScreenViewState value = interfaceC16549B.getValue();
            if (interfaceC16549B.e(value, ProfileScreenViewState.b(value, null, null, null, null, null, null, null, null, null, orderPreferencesDecoratorN, false, false, null, false, false, false, lVar.Q(orderPreferencesDecoratorN), false, false, false, 982527, null))) {
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
    private final void onLoadingStates(java.util.List<? extends Pj.a> r37) {
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
            Pj.a r1 = (Pj.a) r1
            boolean r1 = r1 instanceof Pj.a.Loading
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
            boolean r2 = r1 instanceof Pj.a.Failed
            if (r2 == 0) goto L42
            r8.add(r1)
            goto L42
        L54:
            r11 = r36
            pv.B<com.meijer.mobile.accounts.ux.profile.l$e> r0 = r11._profileState
        L58:
            java.lang.Object r12 = r0.getValue()
            r13 = r12
            com.meijer.mobile.accounts.ux.profile.l$e r13 = (com.meijer.mobile.accounts.ux.profile.l.ProfileScreenViewState) r13
            Yh.d r1 = r13.getSavedMperksInformation()
            r9 = 23
            r10 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = r37
            Yh.d r19 = Yh.MperksInformationDecorator.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
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
        AbstractC6392a abstractC6392a;
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
        if (Intrinsics.e(action, c.a.f95595a)) {
            InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = this._profileState;
            do {
                value6 = interfaceC16549B.getValue();
                profileScreenViewState5 = value6;
                basicInformationDecoratorG = BasicInformationDecorator.g(profileScreenViewState5.getSavedBasicInformation(), null, null, null, null, null, null, null, null, false, null, null, 1855, null);
                list = null;
                basicInformationDecoratorG2 = BasicInformationDecorator.g(profileScreenViewState5.getUnsavedBasicInformation(), null, null, null, null, null, null, null, null, false, null, null, 1855, null);
                accountInformationDecoratorF = AccountInformationDecorator.f(profileScreenViewState5.getUnsavedAccountInformation(), null, new AbstractC5691a.CurrentPassword(validation, objArr18 == true ? 1 : 0, i11, objArr17 == true ? 1 : 0), new AbstractC5691a.NewPassword(objArr16 == true ? 1 : 0, objArr15 == true ? 1 : 0, i11, objArr14 == true ? 1 : 0), new AbstractC5691a.ConfirmPassword(objArr13 == true ? 1 : 0, objArr12 == true ? 1 : 0, i11, objArr11 == true ? 1 : 0), false, null, null, false, null, null, x.f15868a, z.b(), null, null, 12785, null);
                accountInformationDecoratorF2 = AccountInformationDecorator.f(profileScreenViewState5.getSavedAccountInformation(), null, null, null, null, false, null, null, false, null, null, null, null, null, null, 16223, null);
                boolean z12 = false;
                mperksInformationDecorator = new MperksInformationDecorator(null, null, null, z12, profileScreenViewState5.getSavedMperksInformation().getIsQuickIDEnabled(), null, list, 111, null);
                i10 = l3.f93324d;
                abstractC6392a = null;
                z10 = false;
                z11 = false;
                list2 = null;
                objArr = 0 == true ? 1 : 0;
            } while (!interfaceC16549B.e(value6, ProfileScreenViewState.b(profileScreenViewState5, basicInformationDecoratorG, basicInformationDecoratorG2, null, accountInformationDecoratorF2, accountInformationDecoratorF, mperksInformationDecorator, new MperksInformationDecorator(0 == true ? 1 : 0, objArr, abstractC6392a, z10, z11, list, list2, i10, null), null, OrderPreferencesDecorator.f(profileScreenViewState5.getSavedOrderPreferencesInformation(), 0, null, null, null, null, null, false, 111, null), OrderPreferencesDecorator.f(profileScreenViewState5.getUnsavedOrderPreferencesInformation(), 0, null, null, null, null, null, false, 111, null), false, false, null, false, false, false, false, false, false, false, 793732, null)));
            return;
        }
        if (Intrinsics.e(action, c.b.f95596a)) {
            InterfaceC16549B<ProfileScreenViewState> interfaceC16549B2 = this._profileState;
            do {
                value5 = interfaceC16549B2.getValue();
            } while (!interfaceC16549B2.e(value5, ProfileScreenViewState.b(value5, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1046527, null)));
            return;
        }
        if (action instanceof c.DismissErrorNotification) {
            c.DismissErrorNotification dismissErrorNotification = (c.DismissErrorNotification) action;
            E(dismissErrorNotification.getIsPhoneConflictError(), dismissErrorNotification.getIsMperksPinUpdateError());
            return;
        }
        if (Intrinsics.e(action, c.C1354l.f95608a)) {
            if (this.featureManager.e(AbstractC18503f.C18506c.f172870h)) {
                b0(true);
                return;
            } else {
                d0();
                return;
            }
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
            if (this.featureManager.e(AbstractC18503f.C18506c.f172870h)) {
                c.UpdateAccountInfo updateAccountInfo = (c.UpdateAccountInfo) action;
                if (updateAccountInfo.getCurrentPassword().length() == 0 && updateAccountInfo.getNewPassword().length() == 0) {
                    b0(false);
                    return;
                }
            }
            c.UpdateAccountInfo updateAccountInfo2 = (c.UpdateAccountInfo) action;
            c0(updateAccountInfo2.getCurrentPassword(), updateAccountInfo2.getNewPassword());
            return;
        }
        if (action instanceof c.UpdateMperksInfo) {
            c.UpdateMperksInfo updateMperksInfo = (c.UpdateMperksInfo) action;
            W(updateMperksInfo.getIsQuickIDEnabled(), updateMperksInfo.getNewPin(), updateMperksInfo.getCurrentPin());
            return;
        }
        if (Intrinsics.e(action, c.n.f95612a)) {
            g0();
            return;
        }
        if (action instanceof c.OnEditClick) {
            V(((c.OnEditClick) action).getScreen());
            return;
        }
        if (action instanceof c.OnFormFieldChange) {
            k0(((c.OnFormFieldChange) action).a());
            return;
        }
        if (Intrinsics.e(action, c.e.f95600a)) {
            InterfaceC16549B<ProfileScreenViewState> interfaceC16549B3 = this._profileState;
            do {
                value4 = interfaceC16549B3.getValue();
                profileScreenViewState4 = value4;
            } while (!interfaceC16549B3.e(value4, ProfileScreenViewState.b(profileScreenViewState4, null, null, null, null, AccountInformationDecorator.f(profileScreenViewState4.getUnsavedAccountInformation(), null, new AbstractC5691a.CurrentPassword(objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, i11, objArr8 == true ? 1 : 0), new AbstractC5691a.NewPassword(objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, i11, objArr5 == true ? 1 : 0), new AbstractC5691a.ConfirmPassword(objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, i11, objArr2 == true ? 1 : 0), false, null, null, false, w0.f33178b, null, x.f15868a, z.b(), null, null, 12529, null), null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048559, null)));
            return;
        }
        if (Intrinsics.e(action, c.f.f95601a)) {
            InterfaceC16549B<ProfileScreenViewState> interfaceC16549B4 = this._profileState;
            do {
                value3 = interfaceC16549B4.getValue();
                profileScreenViewState3 = value3;
            } while (!interfaceC16549B4.e(value3, ProfileScreenViewState.b(profileScreenViewState3, null, null, null, AccountInformationDecorator.f(profileScreenViewState3.getSavedAccountInformation(), null, null, null, null, false, null, null, false, null, null, null, null, null, null, 16351, null), AccountInformationDecorator.f(profileScreenViewState3.getUnsavedAccountInformation(), null, null, null, null, false, null, null, false, w0.f33179c, null, null, null, null, null, 16127, null), null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048551, null)));
            return;
        }
        if (!(action instanceof c.ValidateConfirmPassword)) {
            if (!(action instanceof c.OnQuickIDChange)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC16549B<ProfileScreenViewState> interfaceC16549B5 = this._profileState;
            do {
                value = interfaceC16549B5.getValue();
                profileScreenViewState = value;
                mperksInformationDecoratorF = MperksInformationDecorator.f(profileScreenViewState.getUnsavedMperksInformation(), null, null, null, false, ((c.OnQuickIDChange) action).getIsEnabled(), null, null, 111, null);
            } while (!interfaceC16549B5.e(value, ProfileScreenViewState.b(profileScreenViewState, null, null, null, null, null, null, mperksInformationDecoratorF, null, null, null, false, false, null, false, false, P(mperksInformationDecoratorF), false, false, false, false, 1015743, null)));
            return;
        }
        c.ValidateConfirmPassword validateConfirmPassword = (c.ValidateConfirmPassword) action;
        if (!validateConfirmPassword.getIsFocused()) {
            j0(validateConfirmPassword.getNewPassword(), validateConfirmPassword.getConfirmPassword());
            return;
        }
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549B6 = this._profileState;
        do {
            value2 = interfaceC16549B6.getValue();
            profileScreenViewState2 = value2;
        } while (!interfaceC16549B6.e(value2, ProfileScreenViewState.b(profileScreenViewState2, null, null, null, null, AccountInformationDecorator.f(profileScreenViewState2.getUnsavedAccountInformation(), null, null, null, null, false, null, null, false, null, null, null, null, null, null, 15871, null), null, null, null, null, null, false, false, null, false, false, false, false, false, false, false, 1048559, null)));
    }

    public final void Z(boolean isFromPaymentsScreen, boolean isEditBasicInfo) {
        ProfileScreenViewState value;
        InterfaceC16549B<ProfileScreenViewState> interfaceC16549B = this._profileState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ProfileScreenViewState.b(value, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, false, false, isFromPaymentsScreen, isEditBasicInfo, 262143, null)));
    }

    private final void G() {
        C15809k.d(d0.a(this), null, null, new g(null), 3, null);
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
            if (!Intrinsics.e(mperksInformationDecorator, new MperksInformationDecorator(null, null, null, false, false, null, null, l3.f93324d, null)) && !Intrinsics.e(mperksInformationDecorator.n(), this._profileState.getValue().getSavedMperksInformation().n())) {
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
            this.loadingStatesManager.b(new a.Failed("mperks pin", AbstractC6392a.INSTANCE.d(Gh.h.f12971r5, new Object[0])));
        }
    }

    private final boolean U(MperksInformationDecorator mperksInformationDecorator) {
        if (mperksInformationDecorator.getCurrentPin().c().e().length() == 0 && mperksInformationDecorator.getNewPin().c().e().length() == 0) {
            return true;
        }
        return false;
    }

    private final void W(Boolean isQuickIDEnabled, String newPin, String currentPin) {
        C15809k.d(d0.a(this), null, null, new C1355l(currentPin, newPin, isQuickIDEnabled, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object m(l lVar, List list, Continuation continuation) {
        lVar.onLoadingStates(list);
        return Unit.f143329a;
    }
}
