package Rh;

import Ik.Validation;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import ai.AbstractC5692b;
import android.content.res.Resources;
import android.telephony.PhoneNumberUtils;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import bk.C6393b;
import com.meijer.mobile.accounts.ux.profile.a;
import com.meijer.mobile.accounts.ux.profile.l;
import j$.time.LocalDate;
import ki.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import r1.C16819m;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\r\u0010\n¨\u0006\u0014²\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/accounts/ux/profile/l$e;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/profile/a;", "", "onResourceAction", "t", "(LKi/M;Lcom/meijer/mobile/accounts/ux/profile/l$e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "z", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/accounts/ux/profile/l$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "m", "", "lastAction", "", "enableSaveButton", "Lbk/a;", "errorMessage", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class M {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f32659f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f32659f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f32659f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f32660f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f32661g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f32662h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f32663i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f32664j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f32665k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, l.ProfileScreenViewState profileScreenViewState, LocalThemeScope localThemeScope, Function1 function1) {
            super(2);
            this.f32661g = nVar;
            this.f32662h = function0;
            this.f32663i = profileScreenViewState;
            this.f32664j = localThemeScope;
            this.f32665k = function1;
            this.f32660f = i10;
        }

        public final void a(Composer composer, int i10) throws Resources.NotFoundException {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f32661g.getHelpersHashCode();
            this.f32661g.i();
            L1.n nVar = this.f32661g;
            composer.startReplaceGroup(1355077306);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            composer.startReplaceGroup(2121923444);
            if (!C6393b.a(this.f32663i.getSavedBasicInformation().getErrorMessage())) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f32664j);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new c(this.f32664j);
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(companion, hVarD, (Function1) objB);
                AbstractC6392a errorMessage = this.f32663i.getSavedBasicInformation().getErrorMessage();
                LocalThemeScope localThemeScope = this.f32664j;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f32665k);
                Object objB2 = composer.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new d(this.f32665k);
                    composer.t(objB2);
                }
                composer.P();
                Qh.o.b(localThemeScope, errorMessage, modifierK, (Function0) objB2, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3), 0);
            }
            composer.P();
            LocalThemeScope localThemeScope2 = this.f32664j;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1746271574);
            boolean zD2 = composer.D(this.f32663i) | composer.V(hVarD) | composer.D(this.f32664j);
            Object objB3 = composer.B();
            if (zD2 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new e(this.f32663i, hVarD, this.f32664j);
                composer.t(objB3);
            }
            composer.P();
            q1.Label label = new q1.Label(nVar.k(companion2, hVarA, (Function1) objB3), null, null, null, 0, false, 0, this.f32664j.getAdsTypography().getDetail().getOne().d(this.f32664j.getAdsColors().getAdsColorText02()), null, 382, null);
            String strC = C16338g.c(Gh.h.f12735K0, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            si.j.h(localThemeScope2, label, strC, null, composer, i11 | (q1.Label.f142335j << 3), 4);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(hVarA);
            Object objB4 = composer.B();
            if (zV2 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new f(hVarA);
                composer.t(objB4);
            }
            composer.P();
            M.m(this.f32664j, this.f32663i, nVar.k(companion2, hVarC, (Function1) objB4), this.f32665k, composer, i11, 0);
            composer.P();
            if (this.f32661g.getHelpersHashCode() != helpersHashCode) {
                this.f32662h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f32666a;

        c(LocalThemeScope localThemeScope) {
            this.f32666a = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f32666a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f32666a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), this.f32666a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f32667a;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1) {
            this.f32667a = function1;
        }

        public final void a() {
            this.f32667a.invoke(new a.DismissErrorNotification(false, false, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f32668a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f32669b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f32670c;

        e(l.ProfileScreenViewState profileScreenViewState, L1.h hVar, LocalThemeScope localThemeScope) {
            this.f32668a = profileScreenViewState;
            this.f32669b = hVar;
            this.f32670c = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            if (C6393b.a(this.f32668a.getSavedBasicInformation().getErrorMessage())) {
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), this.f32670c.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
            } else {
                x.a.a(constrainAs.getTop(), this.f32669b.getBottom(), this.f32670c.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
            }
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f32670c.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.h f32671a;

        f(L1.h hVar) {
            this.f32671a = hVar;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), this.f32671a.getBottom(), 0.0f, 0.0f, 6, null);
            constrainAs.p(L1.v.INSTANCE.c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(InterfaceC5914o interfaceC5914o) {
        InterfaceC5914o.l(interfaceC5914o, false, 1, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, Modifier modifier, l.ProfileScreenViewState profileScreenViewState, Function1 function1, int i10, Composer composer, int i11) {
        z(localThemeScope, modifier, profileScreenViewState, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
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
    public static final void m(final Ki.LocalThemeScope r52, final com.meijer.mobile.accounts.ux.profile.l.ProfileScreenViewState r53, androidx.compose.ui.Modifier r54, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r55, androidx.compose.runtime.Composer r56, final int r57, final int r58) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rh.M.m(Ki.M, com.meijer.mobile.accounts.ux.profile.l$e, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function1 function1, String updatedFirstName) {
        Intrinsics.j(updatedFirstName, "updatedFirstName");
        function1.invoke(new a.OnFormFieldChange(new AbstractC5692b.FirstName(new Validation(updatedFirstName, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function1 function1, String updatedLastName) {
        Intrinsics.j(updatedLastName, "updatedLastName");
        function1.invoke(new a.OnFormFieldChange(new AbstractC5692b.LastName(new Validation(updatedLastName, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function1 function1, l.ProfileScreenViewState profileScreenViewState, String updatePhoneNumber) {
        Intrinsics.j(updatePhoneNumber, "updatePhoneNumber");
        function1.invoke(new a.OnFormFieldChange(new AbstractC5692b.PhoneNumber(new Validation(PhoneNumberUtils.stripSeparators(updatePhoneNumber), null, 2, null))));
        function1.invoke(new a.DismissErrorNotification(!C6393b.a(profileScreenViewState.getSavedBasicInformation().getPhoneConflictError()), false, 2, null));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function1 function1, LocalDate localDate) {
        function1.invoke(new a.OnFormFieldChange(new AbstractC5692b.BirthDate(new Validation(localDate, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function1 function1, String updatedZipCode) {
        Intrinsics.j(updatedZipCode, "updatedZipCode");
        function1.invoke(new a.OnFormFieldChange(new AbstractC5692b.ZipCode(new Validation(updatedZipCode, null, 2, null))));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, l.ProfileScreenViewState profileScreenViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) throws Resources.NotFoundException {
        m(localThemeScope, profileScreenViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void t(final Ki.LocalThemeScope r42, final com.meijer.mobile.accounts.ux.profile.l.ProfileScreenViewState r43, androidx.compose.ui.Modifier r44, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r45, androidx.compose.runtime.Composer r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rh.M.t(Ki.M, com.meijer.mobile.accounts.ux.profile.l$e, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, l.ProfileScreenViewState profileScreenViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, profileScreenViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function1 function1) {
        function1.invoke(a.C1352a.f95559a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Function1 function1) {
        function1.invoke(a.o.f95577a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(Function1 function1) {
        function1.invoke(a.C1352a.f95559a);
        return Unit.f143329a;
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
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composerStartRestartGroup, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifierF, false, new a(a10), 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new b(nVar, 0, pairH.b(), profileScreenViewState2, localThemeScope, function1)), pairH.a(), composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Rh.H
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.A(localThemeScope, modifier, profileScreenViewState, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
