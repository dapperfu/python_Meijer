package com.meijer.mobile.accounts.ux.basescreen;

import Eh.AccountChip;
import Eh.ProfileInfo;
import Kk.AppVersion;
import Sh.ContactUsDecorator;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;
import yo.MeijerUser;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0018B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020!0%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/meijer/mobile/accounts/ux/basescreen/H;", "Landroidx/lifecycle/c0;", "LAh/b;", "dataSource", "Lyo/k;", "userManager", "LTq/j;", "storeProvider", "LKk/a;", "appVersion", "<init>", "(LAh/b;Lyo/k;LTq/j;LKk/a;)V", "", "r", "()V", "Lyo/c;", "user", "LEh/u;", "t", "(Lyo/c;)LEh/u;", "", "isNotificationEnabled", "u", "(Z)V", "a", "LAh/b;", "b", "Lyo/k;", "c", "LTq/j;", "d", "LKk/a;", "Lpv/B;", "Lcom/meijer/mobile/accounts/ux/basescreen/H$a;", "e", "Lpv/B;", "_viewState", "Lpv/P;", "f", "Lpv/P;", "s", "()Lpv/P;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class H extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ah.b dataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AppVersion appVersion;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<YourAccountsViewState> _viewState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<YourAccountsViewState> viewState;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJL\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b&\u0010%¨\u0006'"}, d2 = {"Lcom/meijer/mobile/accounts/ux/basescreen/H$a;", "", "", "LEh/c;", "chips", "LEh/u;", "profileInfo", "LSh/a;", "contactUsDecorator", "", "isLoggedIn", "isNotificationEnabled", "<init>", "(Ljava/util/List;LEh/u;LSh/a;ZZ)V", "a", "(Ljava/util/List;LEh/u;LSh/a;ZZ)Lcom/meijer/mobile/accounts/ux/basescreen/H$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "LEh/u;", "e", "()LEh/u;", "LSh/a;", "d", "()LSh/a;", "Z", "f", "()Z", "g", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.basescreen.H$a, reason: from toString */
    public static final /* data */ class YourAccountsViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AccountChip> chips;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProfileInfo profileInfo;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ContactUsDecorator contactUsDecorator;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoggedIn;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isNotificationEnabled;

        public YourAccountsViewState() {
            this(null, null, null, false, false, 31, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof YourAccountsViewState)) {
                return false;
            }
            YourAccountsViewState yourAccountsViewState = (YourAccountsViewState) other;
            return Intrinsics.e(this.chips, yourAccountsViewState.chips) && Intrinsics.e(this.profileInfo, yourAccountsViewState.profileInfo) && Intrinsics.e(this.contactUsDecorator, yourAccountsViewState.contactUsDecorator) && this.isLoggedIn == yourAccountsViewState.isLoggedIn && this.isNotificationEnabled == yourAccountsViewState.isNotificationEnabled;
        }

        public int hashCode() {
            int iHashCode = this.chips.hashCode() * 31;
            ProfileInfo profileInfo = this.profileInfo;
            int iHashCode2 = (iHashCode + (profileInfo == null ? 0 : profileInfo.hashCode())) * 31;
            ContactUsDecorator contactUsDecorator = this.contactUsDecorator;
            return ((((iHashCode2 + (contactUsDecorator != null ? contactUsDecorator.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoggedIn)) * 31) + Boolean.hashCode(this.isNotificationEnabled);
        }

        public String toString() {
            return "YourAccountsViewState(chips=" + this.chips + ", profileInfo=" + this.profileInfo + ", contactUsDecorator=" + this.contactUsDecorator + ", isLoggedIn=" + this.isLoggedIn + ", isNotificationEnabled=" + this.isNotificationEnabled + ')';
        }

        public YourAccountsViewState(List<AccountChip> chips, ProfileInfo profileInfo, ContactUsDecorator contactUsDecorator, boolean z10, boolean z11) {
            Intrinsics.j(chips, "chips");
            this.chips = chips;
            this.profileInfo = profileInfo;
            this.contactUsDecorator = contactUsDecorator;
            this.isLoggedIn = z10;
            this.isNotificationEnabled = z11;
        }

        public static /* synthetic */ YourAccountsViewState b(YourAccountsViewState yourAccountsViewState, List list, ProfileInfo profileInfo, ContactUsDecorator contactUsDecorator, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = yourAccountsViewState.chips;
            }
            if ((i10 & 2) != 0) {
                profileInfo = yourAccountsViewState.profileInfo;
            }
            if ((i10 & 4) != 0) {
                contactUsDecorator = yourAccountsViewState.contactUsDecorator;
            }
            if ((i10 & 8) != 0) {
                z10 = yourAccountsViewState.isLoggedIn;
            }
            if ((i10 & 16) != 0) {
                z11 = yourAccountsViewState.isNotificationEnabled;
            }
            boolean z12 = z11;
            ContactUsDecorator contactUsDecorator2 = contactUsDecorator;
            return yourAccountsViewState.a(list, profileInfo, contactUsDecorator2, z10, z12);
        }

        public final YourAccountsViewState a(List<AccountChip> chips, ProfileInfo profileInfo, ContactUsDecorator contactUsDecorator, boolean isLoggedIn, boolean isNotificationEnabled) {
            Intrinsics.j(chips, "chips");
            return new YourAccountsViewState(chips, profileInfo, contactUsDecorator, isLoggedIn, isNotificationEnabled);
        }

        public final List<AccountChip> c() {
            return this.chips;
        }

        /* renamed from: d, reason: from getter */
        public final ContactUsDecorator getContactUsDecorator() {
            return this.contactUsDecorator;
        }

        /* renamed from: e, reason: from getter */
        public final ProfileInfo getProfileInfo() {
            return this.profileInfo;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsLoggedIn() {
            return this.isLoggedIn;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getIsNotificationEnabled() {
            return this.isNotificationEnabled;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ YourAccountsViewState(java.util.List r2, Eh.ProfileInfo r3, Sh.ContactUsDecorator r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.m()
            L8:
                r8 = r7 & 2
                r0 = 0
                if (r8 == 0) goto Le
                r3 = r0
            Le:
                r8 = r7 & 4
                if (r8 == 0) goto L13
                r4 = r0
            L13:
                r8 = r7 & 8
                r0 = 0
                if (r8 == 0) goto L19
                r5 = r0
            L19:
                r7 = r7 & 16
                if (r7 == 0) goto L24
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L2a
            L24:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L2a:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.basescreen.H.YourAccountsViewState.<init>(java.util.List, Eh.u, Sh.a, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.YourAccountViewModel$fetchData$1", f = "YourAccountViewModel.kt", l = {54}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95101a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return H.this.new b(continuation);
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyo/c;", "user", "", "<anonymous>", "(Lyo/c;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.YourAccountViewModel$fetchData$1$1", f = "YourAccountViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class a extends SuspendLambda implements Function2<MeijerUser, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f95103a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f95104b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ H f95105c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(H h10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f95105c = h10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f95105c, continuation);
                aVar.f95104b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(MeijerUser meijerUser, Continuation<? super Unit> continuation) {
                return ((a) create(meijerUser, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                YourAccountsViewState yourAccountsViewState;
                List<AccountChip> listB;
                ProfileInfo profileInfoT;
                ContactUsDecorator contactUsDecorator;
                IntrinsicsKt.f();
                if (this.f95103a == 0) {
                    ResultKt.b(obj);
                    MeijerUser meijerUser = (MeijerUser) this.f95104b;
                    InterfaceC16549B interfaceC16549B = this.f95105c._viewState;
                    H h10 = this.f95105c;
                    do {
                        value = interfaceC16549B.getValue();
                        yourAccountsViewState = (YourAccountsViewState) value;
                        listB = h10.dataSource.b();
                        profileInfoT = h10.t(meijerUser);
                        if (meijerUser.getExternalShopperId().length() > 0 && h10.appVersion.getVersionName().length() > 0) {
                            contactUsDecorator = new ContactUsDecorator(meijerUser.getExternalShopperId(), h10.appVersion.getVersionName());
                        } else {
                            contactUsDecorator = null;
                        }
                    } while (!interfaceC16549B.e(value, YourAccountsViewState.b(yourAccountsViewState, listB, profileInfoT, contactUsDecorator, meijerUser.getIsLoggedIn(), false, 16, null)));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f95101a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                P<MeijerUser> pE = H.this.userManager.E();
                a aVar = new a(H.this, null);
                this.f95101a = 1;
                if (C16563h.k(pE, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.YourAccountViewModel$setNotificationStatus$1", f = "YourAccountViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f95106a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f95108c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f95108c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return H.this.new c(this.f95108c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f95106a == 0) {
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = H.this._viewState;
                boolean z10 = this.f95108c;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, YourAccountsViewState.b((YourAccountsViewState) value, null, null, null, false, z10, 15, null)));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public H(Ah.b dataSource, yo.k userManager, Tq.j storeProvider, AppVersion appVersion) {
        Intrinsics.j(dataSource, "dataSource");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(appVersion, "appVersion");
        this.dataSource = dataSource;
        this.userManager = userManager;
        this.storeProvider = storeProvider;
        this.appVersion = appVersion;
        InterfaceC16549B<YourAccountsViewState> interfaceC16549BA = S.a(new YourAccountsViewState(null, null, null, false, false, 31, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        r();
    }

    public final P<YourAccountsViewState> s() {
        return this.viewState;
    }

    private final void r() {
        C15809k.d(d0.a(this), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProfileInfo t(MeijerUser user) {
        String strE;
        if (user.getFirstName().length() > 0 && user.getLastName().length() > 0 && user.getUserPhone().length() > 0 && user.getEmail().length() > 0 && (strE = this.storeProvider.e()) != null && strE.length() != 0) {
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            AbstractC6392a abstractC6392aC = companion.c(user.getFirstName());
            AbstractC6392a abstractC6392aC2 = companion.c(user.getLastName());
            AbstractC6392a abstractC6392aC3 = companion.c(user.getUserPhone());
            AbstractC6392a abstractC6392aC4 = companion.c(user.getEmail());
            String strE2 = this.storeProvider.e();
            if (strE2 == null) {
                strE2 = "";
            }
            return new ProfileInfo(abstractC6392aC, abstractC6392aC2, abstractC6392aC3, abstractC6392aC4, companion.c(strE2));
        }
        return null;
    }

    public final void u(boolean isNotificationEnabled) {
        C15809k.d(d0.a(this), null, null, new c(isNotificationEnabled, null), 3, null);
    }
}
