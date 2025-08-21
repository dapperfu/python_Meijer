package Ih;

import Cs.MeijerAccount;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;
import wk.C17898a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0012B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"LIh/s;", "Landroidx/lifecycle/c0;", "LCh/e;", "profileRepository", "LCh/c;", "accountsAMSRepository", "Lzl/k;", "featureManager", "<init>", "(LCh/e;LCh/c;Lzl/k;)V", "", "q", "()V", "LCs/a;", "account", "LIh/s$a;", "s", "(LCs/a;)LIh/s$a;", "a", "LCh/e;", "b", "LCh/c;", "c", "Lzl/k;", "Lpv/B;", "LIh/s$b;", "d", "Lpv/B;", "_viewState", "Lpv/P;", "e", "Lpv/P;", "r", "()Lpv/P;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class s extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ch.e profileRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ch.c accountsAMSRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ProfileCardViewState> _viewState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final P<ProfileCardViewState> viewState;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\f¨\u0006\u001c"}, d2 = {"LIh/s$a;", "", "Lbk/a;", "firstName", "lastName", "email", "joinedMonthYear", "", "birthday", "<init>", "(Lbk/a;Lbk/a;Lbk/a;Lbk/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "c", "()Lbk/a;", "b", "e", "d", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ih.s$a, reason: from toString */
    public static final /* data */ class ProfileCardInfo {

        /* renamed from: f, reason: collision with root package name */
        public static final int f14716f = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a firstName;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a lastName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a email;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a joinedMonthYear;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String birthday;

        public ProfileCardInfo() {
            this(null, null, null, null, null, 31, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProfileCardInfo)) {
                return false;
            }
            ProfileCardInfo profileCardInfo = (ProfileCardInfo) other;
            return Intrinsics.e(this.firstName, profileCardInfo.firstName) && Intrinsics.e(this.lastName, profileCardInfo.lastName) && Intrinsics.e(this.email, profileCardInfo.email) && Intrinsics.e(this.joinedMonthYear, profileCardInfo.joinedMonthYear) && Intrinsics.e(this.birthday, profileCardInfo.birthday);
        }

        public ProfileCardInfo(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, String str) {
            this.firstName = abstractC6392a;
            this.lastName = abstractC6392a2;
            this.email = abstractC6392a3;
            this.joinedMonthYear = abstractC6392a4;
            this.birthday = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getBirthday() {
            return this.birthday;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC6392a getEmail() {
            return this.email;
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC6392a getFirstName() {
            return this.firstName;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC6392a getJoinedMonthYear() {
            return this.joinedMonthYear;
        }

        /* renamed from: e, reason: from getter */
        public final AbstractC6392a getLastName() {
            return this.lastName;
        }

        public int hashCode() {
            AbstractC6392a abstractC6392a = this.firstName;
            int iHashCode = (abstractC6392a == null ? 0 : abstractC6392a.hashCode()) * 31;
            AbstractC6392a abstractC6392a2 = this.lastName;
            int iHashCode2 = (iHashCode + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
            AbstractC6392a abstractC6392a3 = this.email;
            int iHashCode3 = (iHashCode2 + (abstractC6392a3 == null ? 0 : abstractC6392a3.hashCode())) * 31;
            AbstractC6392a abstractC6392a4 = this.joinedMonthYear;
            int iHashCode4 = (iHashCode3 + (abstractC6392a4 == null ? 0 : abstractC6392a4.hashCode())) * 31;
            String str = this.birthday;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ProfileCardInfo(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", joinedMonthYear=" + this.joinedMonthYear + ", birthday=" + this.birthday + ')';
        }

        public /* synthetic */ ProfileCardInfo(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : abstractC6392a, (i10 & 2) != 0 ? null : abstractC6392a2, (i10 & 4) != 0 ? null : abstractC6392a3, (i10 & 8) != 0 ? null : abstractC6392a4, (i10 & 16) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006#"}, d2 = {"LIh/s$b;", "", "", "isLoading", "Lbk/a;", "greeting", "LIh/s$a;", "profileCardInfo", "emptyStateTitle", "emptyStateDescription", "<init>", "(ZLbk/a;LIh/s$a;Lbk/a;Lbk/a;)V", "a", "(ZLbk/a;LIh/s$a;Lbk/a;Lbk/a;)LIh/s$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "g", "()Z", "b", "Lbk/a;", "e", "()Lbk/a;", "c", "LIh/s$a;", "f", "()LIh/s$a;", "d", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ih.s$b, reason: from toString */
    public static final /* data */ class ProfileCardViewState {

        /* renamed from: f, reason: collision with root package name */
        public static final int f14722f = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a greeting;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProfileCardInfo profileCardInfo;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a emptyStateTitle;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a emptyStateDescription;

        public ProfileCardViewState() {
            this(false, null, null, null, null, 31, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProfileCardViewState)) {
                return false;
            }
            ProfileCardViewState profileCardViewState = (ProfileCardViewState) other;
            return this.isLoading == profileCardViewState.isLoading && Intrinsics.e(this.greeting, profileCardViewState.greeting) && Intrinsics.e(this.profileCardInfo, profileCardViewState.profileCardInfo) && Intrinsics.e(this.emptyStateTitle, profileCardViewState.emptyStateTitle) && Intrinsics.e(this.emptyStateDescription, profileCardViewState.emptyStateDescription);
        }

        public ProfileCardViewState(boolean z10, AbstractC6392a abstractC6392a, ProfileCardInfo profileCardInfo, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3) {
            this.isLoading = z10;
            this.greeting = abstractC6392a;
            this.profileCardInfo = profileCardInfo;
            this.emptyStateTitle = abstractC6392a2;
            this.emptyStateDescription = abstractC6392a3;
        }

        public static /* synthetic */ ProfileCardViewState b(ProfileCardViewState profileCardViewState, boolean z10, AbstractC6392a abstractC6392a, ProfileCardInfo profileCardInfo, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = profileCardViewState.isLoading;
            }
            if ((i10 & 2) != 0) {
                abstractC6392a = profileCardViewState.greeting;
            }
            if ((i10 & 4) != 0) {
                profileCardInfo = profileCardViewState.profileCardInfo;
            }
            if ((i10 & 8) != 0) {
                abstractC6392a2 = profileCardViewState.emptyStateTitle;
            }
            if ((i10 & 16) != 0) {
                abstractC6392a3 = profileCardViewState.emptyStateDescription;
            }
            AbstractC6392a abstractC6392a4 = abstractC6392a3;
            ProfileCardInfo profileCardInfo2 = profileCardInfo;
            return profileCardViewState.a(z10, abstractC6392a, profileCardInfo2, abstractC6392a2, abstractC6392a4);
        }

        public final ProfileCardViewState a(boolean isLoading, AbstractC6392a greeting, ProfileCardInfo profileCardInfo, AbstractC6392a emptyStateTitle, AbstractC6392a emptyStateDescription) {
            return new ProfileCardViewState(isLoading, greeting, profileCardInfo, emptyStateTitle, emptyStateDescription);
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC6392a getEmptyStateDescription() {
            return this.emptyStateDescription;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC6392a getEmptyStateTitle() {
            return this.emptyStateTitle;
        }

        /* renamed from: e, reason: from getter */
        public final AbstractC6392a getGreeting() {
            return this.greeting;
        }

        /* renamed from: f, reason: from getter */
        public final ProfileCardInfo getProfileCardInfo() {
            return this.profileCardInfo;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isLoading) * 31;
            AbstractC6392a abstractC6392a = this.greeting;
            int iHashCode2 = (iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
            ProfileCardInfo profileCardInfo = this.profileCardInfo;
            int iHashCode3 = (iHashCode2 + (profileCardInfo == null ? 0 : profileCardInfo.hashCode())) * 31;
            AbstractC6392a abstractC6392a2 = this.emptyStateTitle;
            int iHashCode4 = (iHashCode3 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
            AbstractC6392a abstractC6392a3 = this.emptyStateDescription;
            return iHashCode4 + (abstractC6392a3 != null ? abstractC6392a3.hashCode() : 0);
        }

        public String toString() {
            return "ProfileCardViewState(isLoading=" + this.isLoading + ", greeting=" + this.greeting + ", profileCardInfo=" + this.profileCardInfo + ", emptyStateTitle=" + this.emptyStateTitle + ", emptyStateDescription=" + this.emptyStateDescription + ')';
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ProfileCardViewState(boolean r2, bk.AbstractC6392a r3, Ih.s.ProfileCardInfo r4, bk.AbstractC6392a r5, bk.AbstractC6392a r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L5
                r2 = 1
            L5:
                r8 = r7 & 2
                r0 = 0
                if (r8 == 0) goto Lb
                r3 = r0
            Lb:
                r8 = r7 & 4
                if (r8 == 0) goto L10
                r4 = r0
            L10:
                r8 = r7 & 8
                if (r8 == 0) goto L15
                r5 = r0
            L15:
                r7 = r7 & 16
                if (r7 == 0) goto L20
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L26
            L20:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L26:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ih.s.ProfileCardViewState.<init>(boolean, bk.a, Ih.s$a, bk.a, bk.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.ProfileCardViewModel$fetchProfileCardInfo$2", f = "ProfileCardViewModel.kt", l = {45, 47}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f14728a;

        /* renamed from: b, reason: collision with root package name */
        Object f14729b;

        /* renamed from: c, reason: collision with root package name */
        Object f14730c;

        /* renamed from: d, reason: collision with root package name */
        Object f14731d;

        /* renamed from: e, reason: collision with root package name */
        int f14732e;

        /* renamed from: f, reason: collision with root package name */
        int f14733f;

        /* renamed from: g, reason: collision with root package name */
        int f14734g;

        /* renamed from: h, reason: collision with root package name */
        int f14735h;

        /* renamed from: i, reason: collision with root package name */
        int f14736i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f14737j;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = s.this.new c(continuation);
            cVar.f14737j = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
        
            if (r12 == r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 349
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ih.s.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public s(Ch.e profileRepository, Ch.c accountsAMSRepository, zl.k featureManager) {
        Intrinsics.j(profileRepository, "profileRepository");
        Intrinsics.j(accountsAMSRepository, "accountsAMSRepository");
        Intrinsics.j(featureManager, "featureManager");
        this.profileRepository = profileRepository;
        this.accountsAMSRepository = accountsAMSRepository;
        this.featureManager = featureManager;
        InterfaceC16549B<ProfileCardViewState> interfaceC16549BA = S.a(new ProfileCardViewState(false, null, null, null, null, 31, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
    }

    public final void q() {
        ProfileCardViewState value;
        InterfaceC16549B<ProfileCardViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ProfileCardViewState.b(value, true, null, null, null, null, 30, null)));
        C15809k.d(d0.a(this), null, null, new c(null), 3, null);
    }

    public final P<ProfileCardViewState> r() {
        return this.viewState;
    }

    public final ProfileCardInfo s(MeijerAccount account) {
        Intrinsics.j(account, "account");
        String firstName = account.getFirstName();
        String lastName = account.getLastName();
        String email = account.getEmail();
        if (firstName == null || firstName.length() <= 0 || lastName == null || lastName.length() <= 0 || email == null || email.length() <= 0) {
            return null;
        }
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        AbstractC6392a abstractC6392aC = companion.c(firstName);
        AbstractC6392a abstractC6392aC2 = companion.c(lastName);
        AbstractC6392a abstractC6392aC3 = companion.c(email);
        int i10 = Gh.h.f12778Q1;
        LocalDateTime createdDate = account.getCreatedDate();
        AbstractC6392a abstractC6392aD = companion.d(i10, String.valueOf(createdDate != null ? createdDate.format(C17898a.f167225a.E()) : null));
        LocalDate birthDate = account.getBirthDate();
        return new ProfileCardInfo(abstractC6392aC, abstractC6392aC2, abstractC6392aC3, abstractC6392aD, birthDate != null ? birthDate.format(C17898a.f167225a.e()) : null);
    }
}
