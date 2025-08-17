package Qh;

import Hk.Validation;
import Ji.LocalThemeScope;
import L1.C4039g;
import L1.D;
import L1.n;
import L1.x;
import Zh.b;
import ak.AbstractC5607a;
import ak.C5608b;
import android.content.res.Resources;
import android.telephony.PhoneNumberUtils;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.accounts.ux.profile.a;
import com.meijer.mobile.accounts.ux.profile.l;
import j$.time.LocalDate;
import ji.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import r1.C16705m;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\r\u0010\n¨\u0006\u0014²\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Lcom/meijer/mobile/accounts/ux/profile/l$e;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/profile/a;", "", "onResourceAction", "t", "(LJi/M;Lcom/meijer/mobile/accounts/ux/profile/l$e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "z", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/accounts/ux/profile/l$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "m", "", "lastAction", "", "enableSaveButton", "Lak/a;", "errorMessage", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class M {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f30072f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f30072f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f30072f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f30073f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f30074g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f30075h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f30076i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30077j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f30078k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, l.ProfileScreenViewState profileScreenViewState, LocalThemeScope localThemeScope, Function1 function1) {
            super(2);
            this.f30074g = nVar;
            this.f30075h = function0;
            this.f30076i = profileScreenViewState;
            this.f30077j = localThemeScope;
            this.f30078k = function1;
            this.f30073f = i10;
        }

        public final void a(Composer composer, int i10) throws Resources.NotFoundException {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f30074g.getHelpersHashCode();
            this.f30074g.i();
            L1.n nVar = this.f30074g;
            composer.startReplaceGroup(1355077306);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            composer.startReplaceGroup(2121923444);
            if (!C5608b.a(this.f30076i.getSavedBasicInformation().getErrorMessage())) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f30077j);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new c(this.f30077j);
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(companion, hVarD, (Function1) objB);
                AbstractC5607a errorMessage = this.f30076i.getSavedBasicInformation().getErrorMessage();
                LocalThemeScope localThemeScope = this.f30077j;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f30078k);
                Object objB2 = composer.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new d(this.f30078k);
                    composer.t(objB2);
                }
                composer.P();
                Ph.o.b(localThemeScope, errorMessage, modifierK, (Function0) objB2, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 3), 0);
            }
            composer.P();
            LocalThemeScope localThemeScope2 = this.f30077j;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1746271574);
            boolean zD2 = composer.D(this.f30076i) | composer.V(hVarD) | composer.D(this.f30077j);
            Object objB3 = composer.B();
            if (zD2 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new e(this.f30076i, hVarD, this.f30077j);
                composer.t(objB3);
            }
            composer.P();
            q1.Label label = new q1.Label(nVar.k(companion2, hVarA, (Function1) objB3), null, null, null, 0, false, 0, this.f30077j.getAdsTypography().getDetail().getOne().d(this.f30077j.getAdsColors().getAdsColorText02()), null, 382, null);
            String strC = C16193g.c(Fh.h.f10544K0, composer, 0);
            int i11 = LocalThemeScope.f15770g;
            ri.j.h(localThemeScope2, label, strC, null, composer, i11 | (q1.Label.f140080j << 3), 4);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(hVarA);
            Object objB4 = composer.B();
            if (zV2 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new f(hVarA);
                composer.t(objB4);
            }
            composer.P();
            M.m(this.f30077j, this.f30076i, nVar.k(companion2, hVarC, (Function1) objB4), this.f30078k, composer, i11, 0);
            composer.P();
            if (this.f30074g.getHelpersHashCode() != helpersHashCode) {
                this.f30075h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30079a;

        c(LocalThemeScope localThemeScope) {
            this.f30079a = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f30079a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f30079a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), this.f30079a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f30080a;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1) {
            this.f30080a = function1;
        }

        public final void a() {
            this.f30080a.invoke(new a.DismissErrorNotification(false, false, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f30081a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f30082b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30083c;

        e(l.ProfileScreenViewState profileScreenViewState, L1.h hVar, LocalThemeScope localThemeScope) {
            this.f30081a = profileScreenViewState;
            this.f30082b = hVar;
            this.f30083c = localThemeScope;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            if (C5608b.a(this.f30081a.getSavedBasicInformation().getErrorMessage())) {
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), this.f30083c.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
            } else {
                x.a.a(constrainAs.getTop(), this.f30082b.getBottom(), this.f30083c.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
            }
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f30083c.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4039g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f30084a;

        f(L1.h hVar) {
            this.f30084a = hVar;
        }

        public final void a(C4039g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), this.f30084a.getBottom(), 0.0f, 0.0f, 6, null);
            constrainAs.p(L1.v.INSTANCE.c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4039g c4039g) {
            a(c4039g);
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(InterfaceC5772o interfaceC5772o) {
        InterfaceC5772o.l(interfaceC5772o, false, 1, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, Modifier modifier, l.ProfileScreenViewState profileScreenViewState, Function1 function1, int i10, Composer composer, int i11) {
        z(localThemeScope, modifier, profileScreenViewState, function1, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ee  */
    @android.annotation.SuppressLint({"ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ji.LocalThemeScope r52, final com.meijer.mobile.accounts.ux.profile.l.ProfileScreenViewState r53, androidx.compose.ui.Modifier r54, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r55, androidx.compose.runtime.Composer r56, final int r57, final int r58) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.M.m(Ji.M, com.meijer.mobile.accounts.ux.profile.l$e, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function1 function1, String updatedFirstName) {
        Intrinsics.j(updatedFirstName, "updatedFirstName");
        function1.invoke(new a.OnFormFieldChange(new b.FirstName(new Validation(updatedFirstName, null, 2, null))));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function1 function1, String updatedLastName) {
        Intrinsics.j(updatedLastName, "updatedLastName");
        function1.invoke(new a.OnFormFieldChange(new b.LastName(new Validation(updatedLastName, null, 2, null))));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function1 function1, l.ProfileScreenViewState profileScreenViewState, String updatePhoneNumber) {
        Intrinsics.j(updatePhoneNumber, "updatePhoneNumber");
        function1.invoke(new a.OnFormFieldChange(new b.PhoneNumber(new Validation(PhoneNumberUtils.stripSeparators(updatePhoneNumber), null, 2, null))));
        function1.invoke(new a.DismissErrorNotification(!C5608b.a(profileScreenViewState.getSavedBasicInformation().getPhoneConflictError()), false, 2, null));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function1 function1, LocalDate localDate) {
        function1.invoke(new a.OnFormFieldChange(new b.BirthDate(new Validation(localDate, null, 2, null))));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function1 function1, String updatedZipCode) {
        Intrinsics.j(updatedZipCode, "updatedZipCode");
        function1.invoke(new a.OnFormFieldChange(new b.ZipCode(new Validation(updatedZipCode, null, 2, null))));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, l.ProfileScreenViewState profileScreenViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) throws Resources.NotFoundException {
        m(localThemeScope, profileScreenViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ac  */
    @android.annotation.SuppressLint({"ComposableStringLiteral"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final Ji.LocalThemeScope r42, final com.meijer.mobile.accounts.ux.profile.l.ProfileScreenViewState r43, androidx.compose.ui.Modifier r44, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r45, androidx.compose.runtime.Composer r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.M.t(Ji.M, com.meijer.mobile.accounts.ux.profile.l$e, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, l.ProfileScreenViewState profileScreenViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, profileScreenViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function1 function1) {
        function1.invoke(a.C1343a.f94714a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Function1 function1) {
        function1.invoke(a.o.f94732a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(Function1 function1) {
        function1.invoke(a.C1343a.f94714a);
        return Unit.f142422a;
    }

    private static final void z(final LocalThemeScope localThemeScope, final Modifier modifier, final l.ProfileScreenViewState profileScreenViewState, final Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1, Composer composer, final int i10) {
        int i11;
        l.ProfileScreenViewState profileScreenViewState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-909656895);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            profileScreenViewState2 = profileScreenViewState;
            i11 |= composerStartRestartGroup.D(profileScreenViewState2) ? 256 : 128;
        } else {
            profileScreenViewState2 = profileScreenViewState;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-909656895, i11, -1, "com.meijer.mobile.accounts.ux.composables.profile.edit.MainContent (EditBasicInformationContent.kt:113)");
            }
            Modifier modifierF = androidx.compose.foundation.layout.J.f(modifier, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            L1.A a10 = (L1.A) objB;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            L1.n nVar = (L1.n) objB2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5730l0) objB3, a10, composerStartRestartGroup, 4544);
            androidx.compose.ui.layout.A.a(C16705m.d(modifierF, false, new a(a10), 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new b(nVar, 0, pairH.b(), profileScreenViewState2, localThemeScope, function1)), pairH.a(), composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qh.H
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.A(localThemeScope, modifier, profileScreenViewState, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
