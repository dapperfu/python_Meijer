package Xh;

import Hk.Validation;
import Ih.x;
import Ih.z;
import Qh.w0;
import Zh.a;
import ak.AbstractC5607a;
import ak.C5608b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B©\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\u00002\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u000b¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b%\u0010\"J²\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010@\u001a\u0004\bA\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b%\u0010C\u001a\u0004\bF\u0010ER\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b>\u0010@\u001a\u0004\b\u0010\u0010$R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u0010C\u001a\u0004\bG\u0010ER\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b2\u0010K\u001a\u0004\bL\u0010MR#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u00168\u0006¢\u0006\f\n\u0004\bF\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b:\u0010C\u001a\u0004\bQ\u0010ER\u0019\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bR\u0010ER\u001f\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0S8\u0006¢\u0006\f\n\u0004\bL\u0010T\u001a\u0004\bU\u0010VR$\u0010Y\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010X0S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010V¨\u0006Z"}, d2 = {"LXh/a;", "", "LZh/a;", "LZh/a$c;", "email", "LZh/a$b;", "currentPassword", "LZh/a$d;", "newPassword", "LZh/a$a;", "confirmPassword", "", "isLoading", "Lak/a;", "updateErrorMessage", "loadingErrorMessage", "isEmailSent", "LQh/w0;", "sheetState", "confirmPasswordError", "LIh/x;", "passwordStrengthState", "", "", "passwordRequirementsMap", "resendEmailErrorTitle", "resendEmailErrorDescription", "<init>", "(LZh/a$c;LZh/a$b;LZh/a$d;LZh/a$a;ZLak/a;Lak/a;ZLQh/w0;Lak/a;LIh/x;Ljava/util/Map;Lak/a;Lak/a;)V", "field", "w", "(LZh/a;)LXh/a;", "originalEmail", "t", "(Ljava/lang/String;)Z", "v", "()Z", "g", "e", "(LZh/a$c;LZh/a$b;LZh/a$d;LZh/a$a;ZLak/a;Lak/a;ZLQh/w0;Lak/a;LIh/x;Ljava/util/Map;Lak/a;Lak/a;)LXh/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LZh/a$c;", "k", "()LZh/a$c;", "b", "LZh/a$b;", "j", "()LZh/a$b;", "c", "LZh/a$d;", "m", "()LZh/a$d;", "d", "LZh/a$a;", "h", "()LZh/a$a;", "Z", "u", "f", "Lak/a;", "s", "()Lak/a;", "l", "i", "LQh/w0;", "r", "()LQh/w0;", "LIh/x;", "o", "()LIh/x;", "Ljava/util/Map;", "n", "()Ljava/util/Map;", "q", "p", "", "Ljava/util/List;", "getFieldErrors", "()Ljava/util/List;", "fieldErrors", "LHk/b;", "validations", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xh.a, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class AccountInformationDecorator implements Hk.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.Email email;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.CurrentPassword currentPassword;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.NewPassword newPassword;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.ConfirmPassword confirmPassword;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a updateErrorMessage;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a loadingErrorMessage;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEmailSent;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final w0 sheetState;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a confirmPasswordError;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final x passwordStrengthState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Boolean> passwordRequirementsMap;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a resendEmailErrorTitle;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a resendEmailErrorDescription;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final List<AbstractC5607a> fieldErrors;

    public AccountInformationDecorator() {
        this(null, null, null, null, false, null, null, false, null, null, null, null, null, null, 16383, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountInformationDecorator)) {
            return false;
        }
        AccountInformationDecorator accountInformationDecorator = (AccountInformationDecorator) other;
        return Intrinsics.e(this.email, accountInformationDecorator.email) && Intrinsics.e(this.currentPassword, accountInformationDecorator.currentPassword) && Intrinsics.e(this.newPassword, accountInformationDecorator.newPassword) && Intrinsics.e(this.confirmPassword, accountInformationDecorator.confirmPassword) && this.isLoading == accountInformationDecorator.isLoading && Intrinsics.e(this.updateErrorMessage, accountInformationDecorator.updateErrorMessage) && Intrinsics.e(this.loadingErrorMessage, accountInformationDecorator.loadingErrorMessage) && this.isEmailSent == accountInformationDecorator.isEmailSent && this.sheetState == accountInformationDecorator.sheetState && Intrinsics.e(this.confirmPasswordError, accountInformationDecorator.confirmPasswordError) && this.passwordStrengthState == accountInformationDecorator.passwordStrengthState && Intrinsics.e(this.passwordRequirementsMap, accountInformationDecorator.passwordRequirementsMap) && Intrinsics.e(this.resendEmailErrorTitle, accountInformationDecorator.resendEmailErrorTitle) && Intrinsics.e(this.resendEmailErrorDescription, accountInformationDecorator.resendEmailErrorDescription);
    }

    public AccountInformationDecorator(a.Email email, a.CurrentPassword currentPassword, a.NewPassword newPassword, a.ConfirmPassword confirmPassword, boolean z10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, boolean z11, w0 sheetState, AbstractC5607a abstractC5607a3, x passwordStrengthState, Map<String, Boolean> passwordRequirementsMap, AbstractC5607a abstractC5607a4, AbstractC5607a abstractC5607a5) {
        Intrinsics.j(email, "email");
        Intrinsics.j(currentPassword, "currentPassword");
        Intrinsics.j(newPassword, "newPassword");
        Intrinsics.j(confirmPassword, "confirmPassword");
        Intrinsics.j(sheetState, "sheetState");
        Intrinsics.j(passwordStrengthState, "passwordStrengthState");
        Intrinsics.j(passwordRequirementsMap, "passwordRequirementsMap");
        this.email = email;
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
        this.confirmPassword = confirmPassword;
        this.isLoading = z10;
        this.updateErrorMessage = abstractC5607a;
        this.loadingErrorMessage = abstractC5607a2;
        this.isEmailSent = z11;
        this.sheetState = sheetState;
        this.confirmPasswordError = abstractC5607a3;
        this.passwordStrengthState = passwordStrengthState;
        this.passwordRequirementsMap = passwordRequirementsMap;
        this.resendEmailErrorTitle = abstractC5607a4;
        this.resendEmailErrorDescription = abstractC5607a5;
        this.fieldErrors = CollectionsKt.e(email.b());
    }

    public static /* synthetic */ AccountInformationDecorator f(AccountInformationDecorator accountInformationDecorator, a.Email cVar, a.CurrentPassword bVar, a.NewPassword dVar, a.ConfirmPassword c0914a, boolean z10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, boolean z11, w0 w0Var, AbstractC5607a abstractC5607a3, x xVar, Map map, AbstractC5607a abstractC5607a4, AbstractC5607a abstractC5607a5, int i10, Object obj) {
        return accountInformationDecorator.e((i10 & 1) != 0 ? accountInformationDecorator.email : cVar, (i10 & 2) != 0 ? accountInformationDecorator.currentPassword : bVar, (i10 & 4) != 0 ? accountInformationDecorator.newPassword : dVar, (i10 & 8) != 0 ? accountInformationDecorator.confirmPassword : c0914a, (i10 & 16) != 0 ? accountInformationDecorator.isLoading : z10, (i10 & 32) != 0 ? accountInformationDecorator.updateErrorMessage : abstractC5607a, (i10 & 64) != 0 ? accountInformationDecorator.loadingErrorMessage : abstractC5607a2, (i10 & 128) != 0 ? accountInformationDecorator.isEmailSent : z11, (i10 & 256) != 0 ? accountInformationDecorator.sheetState : w0Var, (i10 & 512) != 0 ? accountInformationDecorator.confirmPasswordError : abstractC5607a3, (i10 & 1024) != 0 ? accountInformationDecorator.passwordStrengthState : xVar, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? accountInformationDecorator.passwordRequirementsMap : map, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? accountInformationDecorator.resendEmailErrorTitle : abstractC5607a4, (i10 & 8192) != 0 ? accountInformationDecorator.resendEmailErrorDescription : abstractC5607a5);
    }

    @Override // Hk.a
    public List<Validation<? extends Object>> a() {
        return CollectionsKt.p(this.email.c(), this.currentPassword.c(), this.newPassword.c(), this.confirmPassword.c());
    }

    public final AccountInformationDecorator e(a.Email email, a.CurrentPassword currentPassword, a.NewPassword newPassword, a.ConfirmPassword confirmPassword, boolean isLoading, AbstractC5607a updateErrorMessage, AbstractC5607a loadingErrorMessage, boolean isEmailSent, w0 sheetState, AbstractC5607a confirmPasswordError, x passwordStrengthState, Map<String, Boolean> passwordRequirementsMap, AbstractC5607a resendEmailErrorTitle, AbstractC5607a resendEmailErrorDescription) {
        Intrinsics.j(email, "email");
        Intrinsics.j(currentPassword, "currentPassword");
        Intrinsics.j(newPassword, "newPassword");
        Intrinsics.j(confirmPassword, "confirmPassword");
        Intrinsics.j(sheetState, "sheetState");
        Intrinsics.j(passwordStrengthState, "passwordStrengthState");
        Intrinsics.j(passwordRequirementsMap, "passwordRequirementsMap");
        return new AccountInformationDecorator(email, currentPassword, newPassword, confirmPassword, isLoading, updateErrorMessage, loadingErrorMessage, isEmailSent, sheetState, confirmPasswordError, passwordStrengthState, passwordRequirementsMap, resendEmailErrorTitle, resendEmailErrorDescription);
    }

    public final boolean g(String originalEmail) {
        String strE;
        String strE2;
        String strE3 = this.currentPassword.getPassword();
        return (((strE3 == null || strE3.length() == 0) && (((strE = this.newPassword.getPassword()) == null || strE.length() == 0) && ((strE2 = this.confirmPassword.getPassword()) == null || strE2.length() == 0))) || Intrinsics.e(this.email.c().e(), originalEmail)) ? false : true;
    }

    /* renamed from: h, reason: from getter */
    public final a.ConfirmPassword getConfirmPassword() {
        return this.confirmPassword;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.email.hashCode() * 31) + this.currentPassword.hashCode()) * 31) + this.newPassword.hashCode()) * 31) + this.confirmPassword.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        AbstractC5607a abstractC5607a = this.updateErrorMessage;
        int iHashCode2 = (iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
        AbstractC5607a abstractC5607a2 = this.loadingErrorMessage;
        int iHashCode3 = (((((iHashCode2 + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31) + Boolean.hashCode(this.isEmailSent)) * 31) + this.sheetState.hashCode()) * 31;
        AbstractC5607a abstractC5607a3 = this.confirmPasswordError;
        int iHashCode4 = (((((iHashCode3 + (abstractC5607a3 == null ? 0 : abstractC5607a3.hashCode())) * 31) + this.passwordStrengthState.hashCode()) * 31) + this.passwordRequirementsMap.hashCode()) * 31;
        AbstractC5607a abstractC5607a4 = this.resendEmailErrorTitle;
        int iHashCode5 = (iHashCode4 + (abstractC5607a4 == null ? 0 : abstractC5607a4.hashCode())) * 31;
        AbstractC5607a abstractC5607a5 = this.resendEmailErrorDescription;
        return iHashCode5 + (abstractC5607a5 != null ? abstractC5607a5.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final AbstractC5607a getConfirmPasswordError() {
        return this.confirmPasswordError;
    }

    /* renamed from: j, reason: from getter */
    public final a.CurrentPassword getCurrentPassword() {
        return this.currentPassword;
    }

    /* renamed from: k, reason: from getter */
    public final a.Email getEmail() {
        return this.email;
    }

    /* renamed from: l, reason: from getter */
    public final AbstractC5607a getLoadingErrorMessage() {
        return this.loadingErrorMessage;
    }

    /* renamed from: m, reason: from getter */
    public final a.NewPassword getNewPassword() {
        return this.newPassword;
    }

    public final Map<String, Boolean> n() {
        return this.passwordRequirementsMap;
    }

    /* renamed from: o, reason: from getter */
    public final x getPasswordStrengthState() {
        return this.passwordStrengthState;
    }

    /* renamed from: p, reason: from getter */
    public final AbstractC5607a getResendEmailErrorDescription() {
        return this.resendEmailErrorDescription;
    }

    /* renamed from: q, reason: from getter */
    public final AbstractC5607a getResendEmailErrorTitle() {
        return this.resendEmailErrorTitle;
    }

    /* renamed from: r, reason: from getter */
    public final w0 getSheetState() {
        return this.sheetState;
    }

    /* renamed from: s, reason: from getter */
    public final AbstractC5607a getUpdateErrorMessage() {
        return this.updateErrorMessage;
    }

    public final boolean t(String originalEmail) {
        return this.email.isValid() && !Intrinsics.e(this.email.c().e(), originalEmail);
    }

    public String toString() {
        return "AccountInformationDecorator(email=" + this.email + ", currentPassword=" + this.currentPassword + ", newPassword=" + this.newPassword + ", confirmPassword=" + this.confirmPassword + ", isLoading=" + this.isLoading + ", updateErrorMessage=" + this.updateErrorMessage + ", loadingErrorMessage=" + this.loadingErrorMessage + ", isEmailSent=" + this.isEmailSent + ", sheetState=" + this.sheetState + ", confirmPasswordError=" + this.confirmPasswordError + ", passwordStrengthState=" + this.passwordStrengthState + ", passwordRequirementsMap=" + this.passwordRequirementsMap + ", resendEmailErrorTitle=" + this.resendEmailErrorTitle + ", resendEmailErrorDescription=" + this.resendEmailErrorDescription + ')';
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final boolean v() {
        String strE;
        String strE2;
        String strE3 = this.currentPassword.getPassword();
        return (strE3 == null || strE3.length() == 0 || (strE = this.newPassword.getPassword()) == null || strE.length() == 0 || (strE2 = this.confirmPassword.getPassword()) == null || strE2.length() == 0 || !C5608b.a(this.confirmPasswordError) || !Intrinsics.e(this.newPassword.getPassword(), this.confirmPassword.getPassword()) || this.passwordStrengthState != x.f14039d) ? false : true;
    }

    public AccountInformationDecorator w(Zh.a<?> field) {
        Intrinsics.j(field, "field");
        if (field instanceof a.Email) {
            return f(this, ((a.Email) field).f(), null, null, null, false, null, null, false, null, null, null, null, null, null, 16382, null);
        }
        if (field instanceof a.CurrentPassword) {
            return f(this, null, ((a.CurrentPassword) field).f(), null, null, false, null, null, false, null, null, null, null, null, null, 16381, null);
        }
        if (!(field instanceof a.NewPassword)) {
            if (field instanceof a.ConfirmPassword) {
                return f(this, null, null, null, ((a.ConfirmPassword) field).f(), false, null, null, false, null, null, null, null, null, null, 16375, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        a.NewPassword dVar = (a.NewPassword) field;
        String strE = dVar.getPassword();
        if (strE == null) {
            strE = "";
        }
        Pair<x, Map<String, Boolean>> pairA = z.a(strE, z.b());
        return f(this, null, null, dVar.f(), null, false, null, null, false, null, null, pairA.c(), pairA.d(), null, null, 13307, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AccountInformationDecorator(a.Email cVar, a.CurrentPassword bVar, a.NewPassword dVar, a.ConfirmPassword c0914a, boolean z10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, boolean z11, w0 w0Var, AbstractC5607a abstractC5607a3, x xVar, Map map, AbstractC5607a abstractC5607a4, AbstractC5607a abstractC5607a5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        a.Email cVar2;
        a.CurrentPassword bVar2;
        a.NewPassword dVar2;
        a.ConfirmPassword c0914a2;
        Validation validation = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        if ((i10 & 1) != 0) {
            cVar2 = new a.Email(validation, 1, objArr10 == true ? 1 : 0);
        } else {
            cVar2 = cVar;
        }
        int i11 = 3;
        if ((i10 & 2) != 0) {
            bVar2 = new a.CurrentPassword(objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, i11, objArr7 == true ? 1 : 0);
        } else {
            bVar2 = bVar;
        }
        if ((i10 & 4) != 0) {
            dVar2 = new a.NewPassword(objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, i11, objArr4 == true ? 1 : 0);
        } else {
            dVar2 = dVar;
        }
        if ((i10 & 8) != 0) {
            c0914a2 = new a.ConfirmPassword(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
        } else {
            c0914a2 = c0914a;
        }
        this(cVar2, bVar2, dVar2, c0914a2, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? null : abstractC5607a, (i10 & 64) != 0 ? null : abstractC5607a2, (i10 & 128) == 0 ? z11 : false, (i10 & 256) != 0 ? w0.f30590a : w0Var, (i10 & 512) != 0 ? null : abstractC5607a3, (i10 & 1024) != 0 ? x.f14036a : xVar, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? z.b() : map, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : abstractC5607a4, (i10 & 8192) != 0 ? null : abstractC5607a5);
    }
}
